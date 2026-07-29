package com.applovin.impl.sdk.d;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final String f3072a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.j f3073b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f3074c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f3075d;
    private final boolean e;

    public a(String str, com.applovin.impl.sdk.j jVar) {
        this(str, jVar, false);
    }

    public a(String str, com.applovin.impl.sdk.j jVar, boolean z) {
        this.f3072a = str;
        this.f3073b = jVar;
        this.f3074c = jVar.u();
        this.f3075d = jVar.w();
        this.e = z;
    }

    public abstract com.applovin.impl.sdk.c.i a();

    protected void a(String str) {
        this.f3074c.a(this.f3072a, str);
    }

    protected void a(String str, Throwable th) {
        this.f3074c.b(this.f3072a, str, th);
    }

    protected com.applovin.impl.sdk.j b() {
        return this.f3073b;
    }

    protected void b(String str) {
        this.f3074c.b(this.f3072a, str);
    }

    public String c() {
        return this.f3072a;
    }

    protected void c(String str) {
        this.f3074c.c(this.f3072a, str);
    }

    protected Context d() {
        return this.f3075d;
    }

    protected void d(String str) {
        this.f3074c.d(this.f3072a, str);
    }

    public boolean e() {
        return this.e;
    }
}
