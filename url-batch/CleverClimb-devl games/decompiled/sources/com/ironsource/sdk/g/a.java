package com.ironsource.sdk.g;

import android.content.Context;

/* compiled from: DeviceProperties.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f7198a;

    /* renamed from: b, reason: collision with root package name */
    private String f7199b = com.ironsource.environment.c.d();

    /* renamed from: c, reason: collision with root package name */
    private String f7200c = com.ironsource.environment.c.c();

    /* renamed from: d, reason: collision with root package name */
    private String f7201d = com.ironsource.environment.c.e();
    private String e = com.ironsource.environment.c.a();
    private int f = com.ironsource.environment.c.b();
    private String g;

    public static String g() {
        return "5.51";
    }

    private a(Context context) {
        this.g = com.ironsource.environment.c.b(context);
    }

    public static a a(Context context) {
        if (f7198a == null) {
            f7198a = new a(context);
        }
        return f7198a;
    }

    public String a() {
        return this.f7199b;
    }

    public String b() {
        return this.f7200c;
    }

    public String c() {
        return this.f7201d;
    }

    public String d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public String f() {
        return this.g;
    }

    public float b(Context context) {
        return com.ironsource.environment.c.d(context);
    }
}
