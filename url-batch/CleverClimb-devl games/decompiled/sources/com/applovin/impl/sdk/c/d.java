package com.applovin.impl.sdk.c;

import android.app.Activity;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.sdk.AppLovinAd;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final AppLovinAdBase f3034a;

    /* renamed from: b, reason: collision with root package name */
    private final long f3035b;

    /* renamed from: c, reason: collision with root package name */
    private final c f3036c;

    /* renamed from: d, reason: collision with root package name */
    private final h f3037d;
    private final com.applovin.impl.sdk.j e;
    private final Object f = new Object();
    private long g;
    private long h;
    private long i;
    private long j;
    private boolean k;

    public d(AppLovinAd appLovinAd, com.applovin.impl.sdk.j jVar) {
        if (appLovinAd == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f3036c = jVar.P();
        this.f3037d = jVar.D();
        this.e = jVar;
        if (!(appLovinAd instanceof AppLovinAdBase)) {
            this.f3034a = null;
            this.f3035b = 0L;
        } else {
            this.f3034a = (AppLovinAdBase) appLovinAd;
            this.f3035b = this.f3034a.getCreatedAtMillis();
            this.f3036c.a(b.f3020a, this.f3034a.getSource().ordinal(), this.f3034a);
        }
    }

    public static void a(long j, AppLovinAdBase appLovinAdBase, com.applovin.impl.sdk.j jVar) {
        if (appLovinAdBase == null || jVar == null) {
            return;
        }
        jVar.P().a(b.f3021b, j, appLovinAdBase);
    }

    public static void a(AppLovinAdBase appLovinAdBase, com.applovin.impl.sdk.j jVar) {
        if (appLovinAdBase == null || jVar == null) {
            return;
        }
        jVar.P().a(b.f3022c, appLovinAdBase.getFetchLatencyMillis(), appLovinAdBase);
        jVar.P().a(b.f3023d, appLovinAdBase.getFetchResponseSize(), appLovinAdBase);
    }

    private void a(b bVar) {
        synchronized (this.f) {
            if (this.g > 0) {
                this.f3036c.a(bVar, System.currentTimeMillis() - this.g, this.f3034a);
            }
        }
    }

    public static void a(e eVar, AppLovinAdBase appLovinAdBase, com.applovin.impl.sdk.j jVar) {
        if (appLovinAdBase == null || jVar == null || eVar == null) {
            return;
        }
        jVar.P().a(b.e, eVar.c(), appLovinAdBase);
        jVar.P().a(b.f, eVar.d(), appLovinAdBase);
        jVar.P().a(b.v, eVar.g(), appLovinAdBase);
        jVar.P().a(b.w, eVar.h(), appLovinAdBase);
        jVar.P().a(b.z, eVar.b() ? 1L : 0L, appLovinAdBase);
    }

    public void a() {
        this.f3036c.a(b.j, this.f3037d.a(g.f3051b), this.f3034a);
        this.f3036c.a(b.i, this.f3037d.a(g.f3053d), this.f3034a);
        synchronized (this.f) {
            long j = 0;
            if (this.f3035b > 0) {
                this.g = System.currentTimeMillis();
                this.f3036c.a(b.h, this.g - this.e.z(), this.f3034a);
                this.f3036c.a(b.g, this.g - this.f3035b, this.f3034a);
                this.f3036c.a(b.p, com.applovin.impl.sdk.e.e.a(this.e.w(), this.e) ? 1L : 0L, this.f3034a);
                Activity a2 = this.e.S().a();
                if (com.applovin.impl.sdk.e.d.h() && a2 != null && a2.isInMultiWindowMode()) {
                    j = 1;
                }
                this.f3036c.a(b.A, j, this.f3034a);
            }
        }
    }

    public void a(long j) {
        this.f3036c.a(b.r, j, this.f3034a);
    }

    public void b() {
        synchronized (this.f) {
            if (this.h < 1) {
                this.h = System.currentTimeMillis();
                if (this.g > 0) {
                    this.f3036c.a(b.m, this.h - this.g, this.f3034a);
                }
            }
        }
    }

    public void b(long j) {
        this.f3036c.a(b.q, j, this.f3034a);
    }

    public void c() {
        a(b.k);
    }

    public void c(long j) {
        this.f3036c.a(b.s, j, this.f3034a);
    }

    public void d() {
        a(b.n);
    }

    public void d(long j) {
        synchronized (this.f) {
            if (this.i < 1) {
                this.i = j;
                this.f3036c.a(b.t, j, this.f3034a);
            }
        }
    }

    public void e() {
        a(b.o);
    }

    public void e(long j) {
        synchronized (this.f) {
            if (!this.k) {
                this.k = true;
                this.f3036c.a(b.x, j, this.f3034a);
            }
        }
    }

    public void f() {
        a(b.l);
    }

    public void g() {
        this.f3036c.a(b.u, 1L, this.f3034a);
    }

    public void h() {
        synchronized (this.f) {
            if (this.j < 1) {
                this.j = System.currentTimeMillis();
                if (this.g > 0) {
                    this.f3036c.a(b.y, this.j - this.g, this.f3034a);
                }
            }
        }
    }
}
