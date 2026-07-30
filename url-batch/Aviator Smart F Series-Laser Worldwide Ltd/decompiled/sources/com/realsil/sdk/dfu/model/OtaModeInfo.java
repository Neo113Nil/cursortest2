package com.realsil.sdk.dfu.model;

/* loaded from: classes4.dex */
public class OtaModeInfo {

    /* renamed from: a, reason: collision with root package name */
    public int f16229a;

    /* renamed from: b, reason: collision with root package name */
    public String f16230b;

    public OtaModeInfo(int i8) {
        this.f16229a = i8;
    }

    public String getName() {
        return this.f16230b;
    }

    public int getWorkmode() {
        return this.f16229a;
    }

    public void setName(String str) {
        this.f16230b = str;
    }

    public void setWorkmode(int i8) {
        this.f16229a = i8;
    }

    public OtaModeInfo(int i8, String str) {
        this.f16229a = i8;
        this.f16230b = str;
    }
}
