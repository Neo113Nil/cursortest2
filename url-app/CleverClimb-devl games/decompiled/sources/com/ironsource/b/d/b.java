package com.ironsource.b.d;

/* compiled from: IronSourceError.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private String f6759a;

    /* renamed from: b, reason: collision with root package name */
    private int f6760b;

    public b(int i, String str) {
        this.f6760b = i;
        this.f6759a = str == null ? "" : str;
    }

    public int a() {
        return this.f6760b;
    }

    public String b() {
        return this.f6759a;
    }

    public String toString() {
        return "errorCode:" + this.f6760b + ", errorMessage:" + this.f6759a;
    }
}
