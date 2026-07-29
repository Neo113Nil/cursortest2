package com.cmplay.gppay.a;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    int f4089a;

    /* renamed from: b, reason: collision with root package name */
    String f4090b;

    /* renamed from: c, reason: collision with root package name */
    private int f4091c;

    public c(int i, int i2, String str) {
        this(i2, str);
        this.f4091c = i;
    }

    public c(int i, String str) {
        String a2;
        this.f4091c = -1;
        this.f4089a = i;
        if (str == null || str.trim().length() == 0) {
            a2 = b.a(i);
        } else {
            a2 = str + " (response: " + b.a(i) + ")";
        }
        this.f4090b = a2;
    }

    public int a() {
        return this.f4089a;
    }

    public String b() {
        return this.f4090b;
    }

    public boolean c() {
        return this.f4089a == 0;
    }

    public boolean d() {
        return !c();
    }

    public String toString() {
        return "IabResult: " + b();
    }
}
