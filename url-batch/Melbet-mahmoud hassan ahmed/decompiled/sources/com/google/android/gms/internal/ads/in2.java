package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class in2 implements ya1, wc1, ap2, z2.q, jd1, mb1, pi1 {

    /* renamed from: f, reason: collision with root package name */
    private final pt2 f6710f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<wp> f6711g = new AtomicReference<>();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<xp> f6712h = new AtomicReference<>();

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference<cq> f6713i = new AtomicReference<>();

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReference<wc1> f6714j = new AtomicReference<>();

    /* renamed from: k, reason: collision with root package name */
    private final AtomicReference<z2.q> f6715k = new AtomicReference<>();

    /* renamed from: l, reason: collision with root package name */
    private final AtomicReference<wy> f6716l = new AtomicReference<>();

    /* renamed from: m, reason: collision with root package name */
    private in2 f6717m = null;

    public in2(pt2 pt2Var) {
        this.f6710f = pt2Var;
    }

    public static in2 c(in2 in2Var) {
        in2 in2Var2 = new in2(in2Var.f6710f);
        in2Var2.f6717m = in2Var;
        return in2Var2;
    }

    @Override // z2.q
    public final void B3() {
        in2 in2Var = this.f6717m;
        if (in2Var != null) {
            in2Var.B3();
        } else {
            ro2.a(this.f6715k, new qo2() { // from class: com.google.android.gms.internal.ads.um2
                @Override // com.google.android.gms.internal.ads.qo2
                public final void c(Object obj) {
                    ((z2.q) obj).B3();
                }
            });
        }
    }

    public final void C(xp xpVar) {
        this.f6712h.set(xpVar);
    }

    @Override // z2.q
    public final void E(final int i7) {
        in2 in2Var = this.f6717m;
        if (in2Var != null) {
            in2Var.E(i7);
        } else {
            ro2.a(this.f6715k, new qo2() { // from class: com.google.android.gms.internal.ads.dn2
                @Override // com.google.android.gms.internal.ads.qo2
                public final void c(Object obj) {
                    ((z2.q) obj).E(i7);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final void M0(final cv cvVar) {
        in2 in2Var = this.f6717m;
        if (in2Var != null) {
            in2Var.M0(cvVar);
        } else {
            ro2.a(this.f6713i, new qo2() { // from class: com.google.android.gms.internal.ads.bn2
                @Override // com.google.android.gms.internal.ads.qo2
                public final void c(Object obj) {
                    ((cq) obj).C0(cv.this);
                }
            });
        }
    }

    @Override // z2.q
    public final void a() {
        in2 in2Var = this.f6717m;
        if (in2Var != null) {
            in2Var.a();
            return;
        }
        ro2.a(this.f6715k, new qo2() { // from class: com.google.android.gms.internal.ads.vm2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((z2.q) obj).a();
            }
        });
        ro2.a(this.f6713i, new qo2() { // from class: com.google.android.gms.internal.ads.tm2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((cq) obj).d();
            }
        });
        ro2.a(this.f6713i, new qo2() { // from class: com.google.android.gms.internal.ads.hn2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((cq) obj).b();
            }
        });
    }

    @Override // z2.q
    public final void b() {
        in2 in2Var = this.f6717m;
        if (in2Var != null) {
            in2Var.b();
        } else {
            ro2.a(this.f6715k, new qo2() { // from class: com.google.android.gms.internal.ads.wm2
                @Override // com.google.android.gms.internal.ads.qo2
                public final void c(Object obj) {
                    ((z2.q) obj).b();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ya1
    public final void d(final cv cvVar) {
        in2 in2Var = this.f6717m;
        if (in2Var != null) {
            in2Var.d(cvVar);
        } else {
            ro2.a(this.f6711g, new qo2() { // from class: com.google.android.gms.internal.ads.zm2
                @Override // com.google.android.gms.internal.ads.qo2
                public final void c(Object obj) {
                    ((wp) obj).q6(cv.this);
                }
            });
            ro2.a(this.f6711g, new qo2() { // from class: com.google.android.gms.internal.ads.an2
                @Override // com.google.android.gms.internal.ads.qo2
                public final void c(Object obj) {
                    ((wp) obj).F(cv.this.f3954f);
                }
            });
        }
    }

    public final void e(final tp tpVar) {
        in2 in2Var = this.f6717m;
        if (in2Var != null) {
            in2Var.e(tpVar);
        } else {
            ro2.a(this.f6711g, new qo2() { // from class: com.google.android.gms.internal.ads.sm2
                @Override // com.google.android.gms.internal.ads.qo2
                public final void c(Object obj) {
                    ((wp) obj).Q1(tp.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.wc1
    public final void f() {
        in2 in2Var = this.f6717m;
        if (in2Var != null) {
            in2Var.f();
        } else {
            ro2.a(this.f6714j, new qo2() { // from class: com.google.android.gms.internal.ads.xm2
                @Override // com.google.android.gms.internal.ads.qo2
                public final void c(Object obj) {
                    ((wc1) obj).f();
                }
            });
        }
    }

    public final void h(wc1 wc1Var) {
        this.f6714j.set(wc1Var);
    }

    public final void i() {
        in2 in2Var = this.f6717m;
        if (in2Var != null) {
            in2Var.i();
            return;
        }
        this.f6710f.a();
        ro2.a(this.f6712h, new qo2() { // from class: com.google.android.gms.internal.ads.en2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((xp) obj).b();
            }
        });
        ro2.a(this.f6713i, new qo2() { // from class: com.google.android.gms.internal.ads.gn2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((cq) obj).c();
            }
        });
    }

    @Override // z2.q
    public final void k6() {
    }

    public final void m(z2.q qVar) {
        this.f6715k.set(qVar);
    }

    @Override // z2.q
    public final void o4() {
    }

    @Override // com.google.android.gms.internal.ads.ap2
    public final void q(ap2 ap2Var) {
        this.f6717m = (in2) ap2Var;
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final void r() {
        in2 in2Var = this.f6717m;
        if (in2Var != null) {
            in2Var.r();
        } else {
            ro2.a(this.f6713i, new qo2() { // from class: com.google.android.gms.internal.ads.fn2
                @Override // com.google.android.gms.internal.ads.qo2
                public final void c(Object obj) {
                    ((cq) obj).a();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void s(final rv rvVar) {
        in2 in2Var = this.f6717m;
        if (in2Var != null) {
            in2Var.s(rvVar);
        } else {
            ro2.a(this.f6716l, new qo2() { // from class: com.google.android.gms.internal.ads.cn2
                @Override // com.google.android.gms.internal.ads.qo2
                public final void c(Object obj) {
                    ((wy) obj).s5(rv.this);
                }
            });
        }
    }

    public final void t(wy wyVar) {
        this.f6716l.set(wyVar);
    }

    public final void y(wp wpVar) {
        this.f6711g.set(wpVar);
    }

    public final void z(cq cqVar) {
        this.f6713i.set(cqVar);
    }
}
