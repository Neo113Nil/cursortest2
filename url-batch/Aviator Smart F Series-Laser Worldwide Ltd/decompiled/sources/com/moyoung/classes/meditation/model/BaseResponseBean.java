package com.moyoung.classes.meditation.model;

/* loaded from: classes4.dex */
public class BaseResponseBean<T> {
    private int code;
    private T data;
    private String message;

    public int getCode() {
        return this.code;
    }

    public T getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }
}
