package com.crrepa.band.my.device.ai.debugmodel;

import com.google.gson.Gson;

/* loaded from: classes2.dex */
public class g {
    String msg;

    public g(Object obj) {
        this.msg = new Gson().toJson(obj);
    }

    public g(String str) {
        this.msg = str;
    }
}
