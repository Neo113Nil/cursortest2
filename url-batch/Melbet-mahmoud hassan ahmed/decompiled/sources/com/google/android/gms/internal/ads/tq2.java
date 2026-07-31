package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class tq2 extends o03 implements lc1, ya1, va1, mb1, jd1, ap2, pi1 {

    /* renamed from: f, reason: collision with root package name */
    private final pt2 f12353f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<o03> f12354g = new AtomicReference<>();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<nk0> f12355h = new AtomicReference<>();

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference<jk0> f12356i = new AtomicReference<>();

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReference<sj0> f12357j = new AtomicReference<>();

    /* renamed from: k, reason: collision with root package name */
    private final AtomicReference<ok0> f12358k = new AtomicReference<>();

    /* renamed from: l, reason: collision with root package name */
    private final AtomicReference<nj0> f12359l = new AtomicReference<>();

    /* renamed from: m, reason: collision with root package name */
    private final AtomicReference<wy> f12360m = new AtomicReference<>();

    public tq2(pt2 pt2Var) {
        this.f12353f = pt2Var;
    }

    public final void C(wy wyVar) {
        this.f12360m.set(wyVar);
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final void M0(final cv cvVar) {
        ro2.a(this.f12356i, new qo2() { // from class: com.google.android.gms.internal.ads.lq2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((jk0) obj).G2(cv.this);
            }
        });
        ro2.a(this.f12356i, new qo2() { // from class: com.google.android.gms.internal.ads.mq2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((jk0) obj).O(cv.this.f3954f);
            }
        });
    }

    public final void Q(jk0 jk0Var) {
        this.f12356i.set(jk0Var);
    }

    public final void T(nk0 nk0Var) {
        this.f12355h.set(nk0Var);
    }

    @Deprecated
    public final void X(sj0 sj0Var) {
        this.f12357j.set(sj0Var);
    }

    @Deprecated
    public final void Z(nj0 nj0Var) {
        this.f12359l.set(nj0Var);
    }

    public final void a0(ok0 ok0Var) {
        this.f12358k.set(ok0Var);
    }

    @Override // com.google.android.gms.internal.ads.ya1
    public final void d(final cv cvVar) {
        final int i7 = cvVar.f3954f;
        ro2.a(this.f12355h, new qo2() { // from class: com.google.android.gms.internal.ads.nq2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((nk0) obj).w(cv.this);
            }
        });
        ro2.a(this.f12355h, new qo2() { // from class: com.google.android.gms.internal.ads.iq2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((nk0) obj).D(i7);
            }
        });
        ro2.a(this.f12357j, new qo2() { // from class: com.google.android.gms.internal.ads.wp2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((sj0) obj).A(i7);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void e() {
        ro2.a(this.f12357j, new qo2() { // from class: com.google.android.gms.internal.ads.bq2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((sj0) obj).j();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void h(final mj0 mj0Var, final String str, final String str2) {
        ro2.a(this.f12356i, new qo2() { // from class: com.google.android.gms.internal.ads.qq2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                mj0 mj0Var2 = mj0.this;
                ((jk0) obj).I2(new wk0(mj0Var2.c(), mj0Var2.a()));
            }
        });
        ro2.a(this.f12358k, new qo2() { // from class: com.google.android.gms.internal.ads.sq2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                mj0 mj0Var2 = mj0.this;
                ((ok0) obj).C3(new wk0(mj0Var2.c(), mj0Var2.a()), str, str2);
            }
        });
        ro2.a(this.f12357j, new qo2() { // from class: com.google.android.gms.internal.ads.pq2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((sj0) obj).Q3(mj0.this);
            }
        });
        ro2.a(this.f12359l, new qo2() { // from class: com.google.android.gms.internal.ads.rq2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((nj0) obj).C3(mj0.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void i() {
        this.f12353f.a();
        ro2.a(this.f12356i, new qo2() { // from class: com.google.android.gms.internal.ads.gq2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((jk0) obj).e();
            }
        });
        ro2.a(this.f12357j, new qo2() { // from class: com.google.android.gms.internal.ads.xp2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((sj0) obj).d();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.lc1
    public final void m() {
        ro2.a(this.f12355h, new qo2() { // from class: com.google.android.gms.internal.ads.jq2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((nk0) obj).e();
            }
        });
        ro2.a(this.f12357j, new qo2() { // from class: com.google.android.gms.internal.ads.zp2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((sj0) obj).h();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void n() {
        ro2.a(this.f12356i, new qo2() { // from class: com.google.android.gms.internal.ads.hq2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((jk0) obj).i();
            }
        });
        ro2.a(this.f12357j, new qo2() { // from class: com.google.android.gms.internal.ads.aq2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((sj0) obj).i();
            }
        });
        ro2.a(this.f12356i, new qo2() { // from class: com.google.android.gms.internal.ads.fq2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((jk0) obj).d();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void o() {
        ro2.a(this.f12357j, new qo2() { // from class: com.google.android.gms.internal.ads.yp2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((sj0) obj).f();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ap2
    public final void q(ap2 ap2Var) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final void r() {
        ro2.a(this.f12356i, new qo2() { // from class: com.google.android.gms.internal.ads.eq2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((jk0) obj).b();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void s(final rv rvVar) {
        ro2.a(this.f12360m, new qo2() { // from class: com.google.android.gms.internal.ads.oq2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((wy) obj).s5(rv.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void t() {
        ro2.a(this.f12357j, new qo2() { // from class: com.google.android.gms.internal.ads.dq2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((sj0) obj).k();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.o03
    public final void y() {
        ro2.a(this.f12354g, new qo2() { // from class: com.google.android.gms.internal.ads.kq2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((o03) obj).y();
            }
        });
    }

    public final void z(o03 o03Var) {
        this.f12354g.set(o03Var);
    }
}
