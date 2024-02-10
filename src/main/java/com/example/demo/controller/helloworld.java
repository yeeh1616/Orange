package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("api")
public class helloworld {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello world!";
    }
}
