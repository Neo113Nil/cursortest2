package com.crrepa.band.my.device.stock.model;

/* loaded from: classes2.dex */
public class BaseResponseBean<T> {
    private int cod;
    private T data;
    private String msg;

    public int getCod() {
        return this.cod;
    }

    public T getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }
}
