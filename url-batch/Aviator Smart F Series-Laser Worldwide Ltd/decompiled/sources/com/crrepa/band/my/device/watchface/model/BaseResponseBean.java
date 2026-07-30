package com.crrepa.band.my.device.watchface.model;

/* loaded from: classes2.dex */
public class BaseResponseBean<T> {
    public int code;
    public T data;
    public T faces;
    public String message;

    public int getCode() {
        return this.code;
    }

    public T getData() {
        return this.data;
    }

    public T getFaces() {
        return this.faces;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(int i8) {
        this.code = i8;
    }

    public void setData(T t7) {
        this.data = t7;
    }

    public void setFaces(T t7) {
        this.faces = t7;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
