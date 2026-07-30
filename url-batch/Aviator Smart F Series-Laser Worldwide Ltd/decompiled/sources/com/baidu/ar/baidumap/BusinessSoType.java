package com.baidu.ar.baidumap;

/* loaded from: classes.dex */
public enum BusinessSoType {
    engine("main"),
    eglCore("egl_core"),
    localRecognize("local_recognize"),
    cloudRecognize("cloud_recognize");


    /* renamed from: a, reason: collision with root package name */
    public final String f1794a;

    BusinessSoType(String str) {
        this.f1794a = str;
    }

    public String getBusiness() {
        String str = this.f1794a;
        return str == null ? "" : str;
    }
}
