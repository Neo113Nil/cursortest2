package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.j4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0585j4 {

    /* renamed from: u, reason: collision with root package name */
    public static volatile C0585j4 f7591u;

    /* renamed from: a, reason: collision with root package name */
    public final C0975y6 f7592a;

    /* renamed from: b, reason: collision with root package name */
    public final L7 f7593b;

    /* renamed from: c, reason: collision with root package name */
    public final Z3 f7594c;

    /* renamed from: d, reason: collision with root package name */
    public final Q1 f7595d;

    /* renamed from: e, reason: collision with root package name */
    public final C0710o f7596e;
    public final C0396bl f;

    /* renamed from: g, reason: collision with root package name */
    public final L5 f7597g;

    /* renamed from: h, reason: collision with root package name */
    public final C0658m f7598h;

    /* renamed from: i, reason: collision with root package name */
    public final C0760pn f7599i;

    /* renamed from: j, reason: collision with root package name */
    public Cd f7600j;

    /* renamed from: k, reason: collision with root package name */
    public final C0788r0 f7601k;

    /* renamed from: l, reason: collision with root package name */
    public volatile C0508g4 f7602l;

    /* renamed from: m, reason: collision with root package name */
    public final Zc f7603m;

    /* renamed from: n, reason: collision with root package name */
    public volatile C0364af f7604n;
    public C0523gj o;

    /* renamed from: p, reason: collision with root package name */
    public final C0944x0 f7605p;

    /* renamed from: q, reason: collision with root package name */
    public final U1 f7606q;

    /* renamed from: r, reason: collision with root package name */
    public final C0591ja f7607r;

    /* renamed from: s, reason: collision with root package name */
    public volatile C0375b0 f7608s;

    /* renamed from: t, reason: collision with root package name */
    public volatile T9 f7609t;

    public C0585j4(C0975y6 c0975y6, C0710o c0710o, Z3 z3) {
        this(c0975y6, c0710o, z3, new C0658m(c0710o));
    }

    public static C0585j4 l() {
        if (f7591u == null) {
            synchronized (C0585j4.class) {
                try {
                    if (f7591u == null) {
                        f7591u = new C0585j4(new C0975y6(), new C0710o(), new Z3());
                    }
                } finally {
                }
            }
        }
        return f7591u;
    }

    public final C0710o a() {
        return this.f7596e;
    }

    public final C0364af b(Context context) {
        C0364af c0364af;
        C0364af c0364af2 = this.f7604n;
        if (c0364af2 != null) {
            return c0364af2;
        }
        synchronized (this) {
            try {
                c0364af = this.f7604n;
                if (c0364af == null) {
                    c0364af = new C0364af(C0511g7.a(context).a());
                    this.f7604n = c0364af;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0364af;
    }

    public final C0788r0 c() {
        return this.f7601k;
    }

    public final C0944x0 d() {
        return this.f7605p;
    }

    public final Q1 e() {
        return this.f7595d;
    }

    public final U1 f() {
        return this.f7606q;
    }

    public final Z3 g() {
        return this.f7594c;
    }

    public final L5 h() {
        return this.f7597g;
    }

    public final C0975y6 i() {
        return this.f7592a;
    }

    public final L7 j() {
        return this.f7593b;
    }

    public final C0591ja k() {
        return this.f7607r;
    }

    public final C0508g4 m() {
        C0508g4 c0508g4;
        C0508g4 c0508g42 = this.f7602l;
        if (c0508g42 != null) {
            return c0508g42;
        }
        synchronized (this) {
            try {
                c0508g4 = this.f7602l;
                if (c0508g4 == null) {
                    c0508g4 = new C0508g4();
                    this.f7602l = c0508g4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0508g4;
    }

    public final C0975y6 n() {
        return this.f7592a;
    }

    public final C0396bl o() {
        return this.f;
    }

    public C0585j4(C0975y6 c0975y6, C0710o c0710o, Z3 z3, C0658m c0658m) {
        this(c0975y6, new L7(), z3, c0658m, new Q1(), c0710o, new C0396bl(c0710o, c0658m), new L5(c0710o), new C0760pn(), new C0788r0());
    }

    public final synchronized Cd a(Context context) {
        try {
            if (this.f7600j == null) {
                this.f7600j = new Cd(context, new C0735oo());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7600j;
    }

    public C0585j4(C0975y6 c0975y6, L7 l7, Z3 z3, C0658m c0658m, Q1 q12, C0710o c0710o, C0396bl c0396bl, L5 l5, C0760pn c0760pn, C0788r0 c0788r0) {
        this.f7603m = new Zc();
        this.f7605p = new C0944x0();
        this.f7606q = new U1();
        this.f7607r = new C0591ja();
        new K7();
        this.f7592a = c0975y6;
        this.f7593b = l7;
        this.f7594c = z3;
        this.f7598h = c0658m;
        this.f7595d = q12;
        this.f7596e = c0710o;
        this.f = c0396bl;
        this.f7597g = l5;
        this.f7599i = c0760pn;
        this.f7601k = c0788r0;
    }

    public final C0375b0 b() {
        C0375b0 c0375b0;
        C0375b0 c0375b02 = this.f7608s;
        if (c0375b02 != null) {
            return c0375b02;
        }
        synchronized (this) {
            try {
                c0375b0 = this.f7608s;
                if (c0375b0 == null) {
                    c0375b0 = new C0375b0(this.f7605p, this.f, this.f7594c);
                    this.f7608s = c0375b0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0375b0;
    }
}
