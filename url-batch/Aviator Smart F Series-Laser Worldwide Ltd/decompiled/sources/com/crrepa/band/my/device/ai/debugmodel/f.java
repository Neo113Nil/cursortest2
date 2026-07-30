package com.crrepa.band.my.device.ai.debugmodel;

import com.google.gson.Gson;

/* loaded from: classes2.dex */
public class f {
    String msg;
    int statusCode;

    public f(Object obj) {
        this.statusCode = 200;
        this.msg = new Gson().toJson(obj);
    }

    public f(int i8, String str) {
        this.statusCode = i8;
        this.msg = str;
    }
}
