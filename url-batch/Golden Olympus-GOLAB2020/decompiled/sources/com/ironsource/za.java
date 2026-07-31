package com.ironsource;

import android.content.Context;

/* loaded from: classes2.dex */
public class za {

    /* renamed from: h, reason: collision with root package name */
    private static za f20514h;

    /* renamed from: a, reason: collision with root package name */
    private String f20515a;

    /* renamed from: b, reason: collision with root package name */
    private String f20516b;

    /* renamed from: c, reason: collision with root package name */
    private String f20517c;

    /* renamed from: d, reason: collision with root package name */
    private String f20518d;

    /* renamed from: e, reason: collision with root package name */
    private int f20519e;

    /* renamed from: f, reason: collision with root package name */
    private String f20520f;

    /* renamed from: g, reason: collision with root package name */
    private final of f20521g;

    private za(Context context) {
        of f4 = nm.S().f();
        this.f20521g = f4;
        this.f20515a = f4.g();
        this.f20516b = f4.e();
        this.f20517c = f4.m();
        this.f20518d = f4.p();
        this.f20519e = f4.l();
        this.f20520f = f4.j(context);
    }

    public static za b(Context context) {
        if (f20514h == null) {
            f20514h = new za(context);
        }
        return f20514h;
    }

    public static void g() {
        f20514h = null;
    }

    public float a(Context context) {
        return this.f20521g.m(context);
    }

    public String c() {
        return this.f20516b;
    }

    public String d() {
        return this.f20515a;
    }

    public String e() {
        return this.f20517c;
    }

    public String f() {
        return this.f20518d;
    }

    public int a() {
        return this.f20519e;
    }

    public String b() {
        return this.f20520f;
    }
}
