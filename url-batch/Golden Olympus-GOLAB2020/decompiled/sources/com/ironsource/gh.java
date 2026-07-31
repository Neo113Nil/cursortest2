package com.ironsource;

/* loaded from: classes2.dex */
public class gh {

    /* renamed from: c, reason: collision with root package name */
    public static final int f16523c = 1001;

    /* renamed from: a, reason: collision with root package name */
    private String f16524a;

    /* renamed from: b, reason: collision with root package name */
    private int f16525b;

    public gh(int i4, String str) {
        this.f16525b = i4;
        this.f16524a = str == null ? "" : str;
    }

    public int a() {
        return this.f16525b;
    }

    public String b() {
        return this.f16524a;
    }

    public String toString() {
        return "error - code:" + this.f16525b + ", message:" + this.f16524a;
    }
}
