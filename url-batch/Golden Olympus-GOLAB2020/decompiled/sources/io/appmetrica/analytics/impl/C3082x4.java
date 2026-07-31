package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.x4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3082x4 {

    /* renamed from: u, reason: collision with root package name */
    public static volatile C3082x4 f40115u;

    /* renamed from: a, reason: collision with root package name */
    public final M6 f40116a;

    /* renamed from: b, reason: collision with root package name */
    public final Z7 f40117b;

    /* renamed from: c, reason: collision with root package name */
    public final C2823n4 f40118c;

    /* renamed from: d, reason: collision with root package name */
    public final N1 f40119d;

    /* renamed from: e, reason: collision with root package name */
    public final C2818n f40120e;

    /* renamed from: f, reason: collision with root package name */
    public final Xk f40121f;

    /* renamed from: g, reason: collision with root package name */
    public final C2483a6 f40122g;

    /* renamed from: h, reason: collision with root package name */
    public final C2766l f40123h;

    /* renamed from: i, reason: collision with root package name */
    public final C2764kn f40124i;

    /* renamed from: j, reason: collision with root package name */
    public Kd f40125j;

    /* renamed from: k, reason: collision with root package name */
    public final C2845o0 f40126k;

    /* renamed from: l, reason: collision with root package name */
    public volatile C3004u4 f40127l;

    /* renamed from: m, reason: collision with root package name */
    public final C2832nd f40128m;

    /* renamed from: n, reason: collision with root package name */
    public volatile C2730jf f40129n;

    /* renamed from: o, reason: collision with root package name */
    public C2864oj f40130o;

    /* renamed from: p, reason: collision with root package name */
    public final C3000u0 f40131p;

    /* renamed from: q, reason: collision with root package name */
    public final R1 f40132q;

    /* renamed from: r, reason: collision with root package name */
    public final C3088xa f40133r;

    /* renamed from: s, reason: collision with root package name */
    public volatile Z f40134s;

    /* renamed from: t, reason: collision with root package name */
    public volatile C2674ha f40135t;

    public C3082x4(M6 m6, C2818n c2818n, C2823n4 c2823n4) {
        this(m6, c2818n, c2823n4, new C2766l(c2818n));
    }

    public static C3082x4 l() {
        if (f40115u == null) {
            synchronized (C3082x4.class) {
                try {
                    if (f40115u == null) {
                        f40115u = new C3082x4(new M6(), new C2818n(), new C2823n4());
                    }
                } finally {
                }
            }
        }
        return f40115u;
    }

    public final C2818n a() {
        return this.f40120e;
    }

    public final C2730jf b(Context context) {
        C2730jf c2730jf;
        C2730jf c2730jf2 = this.f40129n;
        if (c2730jf2 != null) {
            return c2730jf2;
        }
        synchronized (this) {
            try {
                c2730jf = this.f40129n;
                if (c2730jf == null) {
                    c2730jf = new C2730jf(C3007u7.a(context).a());
                    this.f40129n = c2730jf;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2730jf;
    }

    public final C2845o0 c() {
        return this.f40126k;
    }

    public final C3000u0 d() {
        return this.f40131p;
    }

    public final N1 e() {
        return this.f40119d;
    }

    public final R1 f() {
        return this.f40132q;
    }

    public final C2823n4 g() {
        return this.f40118c;
    }

    public final C2483a6 h() {
        return this.f40122g;
    }

    public final M6 i() {
        return this.f40116a;
    }

    public final Z7 j() {
        return this.f40117b;
    }

    public final C3088xa k() {
        return this.f40133r;
    }

    public final C3004u4 m() {
        C3004u4 c3004u4;
        C3004u4 c3004u42 = this.f40127l;
        if (c3004u42 != null) {
            return c3004u42;
        }
        synchronized (this) {
            try {
                c3004u4 = this.f40127l;
                if (c3004u4 == null) {
                    c3004u4 = new C3004u4();
                    this.f40127l = c3004u4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3004u4;
    }

    public final M6 n() {
        return this.f40116a;
    }

    public final Xk o() {
        return this.f40121f;
    }

    public C3082x4(M6 m6, C2818n c2818n, C2823n4 c2823n4, C2766l c2766l) {
        this(m6, new Z7(), c2823n4, c2766l, new N1(), c2818n, new Xk(c2818n, c2766l), new C2483a6(c2818n), new C2764kn(), new C2845o0());
    }

    public final synchronized Kd a(Context context) {
        try {
            if (this.f40125j == null) {
                this.f40125j = new Kd(context, new C2739jo());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f40125j;
    }

    public C3082x4(M6 m6, Z7 z7, C2823n4 c2823n4, C2766l c2766l, N1 n12, C2818n c2818n, Xk xk, C2483a6 c2483a6, C2764kn c2764kn, C2845o0 c2845o0) {
        this.f40128m = new C2832nd();
        this.f40131p = new C3000u0();
        this.f40132q = new R1();
        this.f40133r = new C3088xa();
        new Y7();
        this.f40116a = m6;
        this.f40117b = z7;
        this.f40118c = c2823n4;
        this.f40123h = c2766l;
        this.f40119d = n12;
        this.f40120e = c2818n;
        this.f40121f = xk;
        this.f40122g = c2483a6;
        this.f40124i = c2764kn;
        this.f40126k = c2845o0;
    }

    public final Z b() {
        Z z4;
        Z z5 = this.f40134s;
        if (z5 != null) {
            return z5;
        }
        synchronized (this) {
            try {
                z4 = this.f40134s;
                if (z4 == null) {
                    z4 = new Z(this.f40131p, this.f40121f, this.f40118c);
                    this.f40134s = z4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }
}
