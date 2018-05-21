package com.demo.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * PACKAGE      :  com.demo.test
 * CREATE DATE  :  2018/5/17
 * AUTHOR       :  leige
 * 文件描述      :  测试工具类
 */
@Controller
@RequestMapping("test")
public class TestController {

    @GetMapping("hello")
    public String test(){
        return "test";
    }
}
