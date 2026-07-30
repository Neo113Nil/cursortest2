package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ev2 implements bu2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv2 b;

    public /* synthetic */ ev2(gv2 gv2Var, int i) {
        this.a = i;
        this.b = gv2Var;
    }

    @Override // defpackage.bu2
    public final void a() {
        switch (this.a) {
            case 0:
                gv2 gv2Var = this.b;
                gv2Var.o.setValue(null);
                gv2Var.p.setValue(null);
                break;
            default:
                i();
                break;
        }
    }

    @Override // defpackage.bu2
    public final void b() {
        switch (this.a) {
            case 0:
                gv2 gv2Var = this.b;
                gv2Var.o.setValue(null);
                gv2Var.p.setValue(null);
                break;
        }
    }

    @Override // defpackage.bu2
    public final void c(long j) {
        cw2 d;
        long j2;
        cw2 d2;
        cw2 d3;
        switch (this.a) {
            case 0:
                gv2 gv2Var = this.b;
                long i = gv2Var.i(true);
                ji2 ji2Var = lh2.a;
                long i2 = ap.i(au1.d(i), au1.e(i) - 1.0f);
                sc1 sc1Var = gv2Var.d;
                if (sc1Var != null && (d = sc1Var.d()) != null) {
                    long e = d.e(i2);
                    gv2Var.l = e;
                    gv2Var.p.setValue(new au1(e));
                    gv2Var.n = 0L;
                    gv2Var.o.setValue(xw0.m);
                    gv2Var.p(false);
                    break;
                }
                break;
            default:
                gv2 gv2Var2 = this.b;
                lz1 lz1Var = gv2Var2.o;
                if (gv2Var2.h() && ((xw0) lz1Var.getValue()) == null) {
                    lz1Var.setValue(xw0.o);
                    gv2Var2.q = -1;
                    gv2Var2.k();
                    sc1 sc1Var2 = gv2Var2.d;
                    if (sc1Var2 == null || (d3 = sc1Var2.d()) == null || !d3.c(j)) {
                        j2 = j;
                        sc1 sc1Var3 = gv2Var2.d;
                        if (sc1Var3 != null && (d2 = sc1Var3.d()) != null) {
                            int b = gv2Var2.b.b(d2.b(true, j2));
                            nv2 c = gv2.c(gv2Var2.j().a, th2.a(b, b));
                            gv2Var2.f(false);
                            hx0 hx0Var = gv2Var2.h;
                            if (hx0Var != null) {
                                hx0Var.a();
                            }
                            gv2Var2.c.invoke(c);
                        }
                    } else if (gv2Var2.j().a.n.length() != 0) {
                        gv2Var2.f(false);
                        j2 = j;
                        gv2Var2.m = Integer.valueOf((int) (gv2.a(gv2Var2, nv2.a(gv2Var2.j(), null, jw2.b, 5), j2, true, false, by1.v, true) >> 32));
                    }
                    gv2Var2.n(zw0.m);
                    gv2Var2.l = j2;
                    gv2Var2.p.setValue(new au1(j2));
                    gv2Var2.n = 0L;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.bu2
    public final void d() {
        int i = this.a;
    }

    @Override // defpackage.bu2
    public final void e(long j) {
        cw2 d;
        hx0 hx0Var;
        cw2 d2;
        switch (this.a) {
            case 0:
                gv2 gv2Var = this.b;
                gv2Var.n = au1.g(gv2Var.n, j);
                sc1 sc1Var = gv2Var.d;
                if (sc1Var != null && (d = sc1Var.d()) != null) {
                    gv2Var.p.setValue(new au1(au1.g(gv2Var.l, gv2Var.n)));
                    cu1 cu1Var = gv2Var.b;
                    au1 g = gv2Var.g();
                    g.getClass();
                    int b = cu1Var.b(d.b(true, g.a));
                    long a = th2.a(b, b);
                    if (!jw2.a(a, gv2Var.j().b)) {
                        sc1 sc1Var2 = gv2Var.d;
                        if ((sc1Var2 == null || ((Boolean) sc1Var2.q.getValue()).booleanValue()) && (hx0Var = gv2Var.h) != null) {
                            hx0Var.a();
                        }
                        gv2Var.c.invoke(gv2.c(gv2Var.j().a, a));
                        break;
                    }
                }
                break;
            default:
                dh2 dh2Var = by1.v;
                gv2 gv2Var2 = this.b;
                if (gv2Var2.h() && gv2Var2.j().a.n.length() != 0) {
                    gv2Var2.n = au1.g(gv2Var2.n, j);
                    sc1 sc1Var3 = gv2Var2.d;
                    if (sc1Var3 != null && (d2 = sc1Var3.d()) != null) {
                        gv2Var2.p.setValue(new au1(au1.g(gv2Var2.l, gv2Var2.n)));
                        if (gv2Var2.m == null) {
                            au1 g2 = gv2Var2.g();
                            g2.getClass();
                            if (!d2.c(g2.a)) {
                                int b2 = gv2Var2.b.b(d2.b(true, gv2Var2.l));
                                cu1 cu1Var2 = gv2Var2.b;
                                au1 g3 = gv2Var2.g();
                                g3.getClass();
                                if (b2 == cu1Var2.b(d2.b(true, g3.a))) {
                                    dh2Var = by1.u;
                                }
                                nv2 j2 = gv2Var2.j();
                                au1 g4 = gv2Var2.g();
                                g4.getClass();
                                gv2.a(gv2Var2, j2, g4.a, false, false, dh2Var, true);
                                int i = jw2.c;
                            }
                        }
                        Integer num = gv2Var2.m;
                        int intValue = num != null ? num.intValue() : d2.b(false, gv2Var2.l);
                        au1 g5 = gv2Var2.g();
                        g5.getClass();
                        int b3 = d2.b(false, g5.a);
                        if (gv2Var2.m != null || intValue != b3) {
                            nv2 j3 = gv2Var2.j();
                            au1 g6 = gv2Var2.g();
                            g6.getClass();
                            gv2.a(gv2Var2, j3, g6.a, false, false, dh2Var, true);
                            int i2 = jw2.c;
                        }
                    }
                    gv2Var2.p(false);
                    break;
                }
                break;
        }
    }

    public void i() {
        gv2 gv2Var = this.b;
        gv2Var.o.setValue(null);
        gv2Var.p.setValue(null);
        gv2Var.p(true);
        gv2Var.m = null;
        boolean b = jw2.b(gv2Var.j().b);
        gv2Var.n(b ? zw0.o : zw0.n);
        sc1 sc1Var = gv2Var.d;
        if (sc1Var != null) {
            sc1Var.m.setValue(Boolean.valueOf(!b && nk2.l(gv2Var, true)));
        }
        sc1 sc1Var2 = gv2Var.d;
        if (sc1Var2 != null) {
            sc1Var2.n.setValue(Boolean.valueOf(!b && nk2.l(gv2Var, false)));
        }
        sc1 sc1Var3 = gv2Var.d;
        if (sc1Var3 == null) {
            return;
        }
        sc1Var3.o.setValue(Boolean.valueOf(b && nk2.l(gv2Var, true)));
    }

    @Override // defpackage.bu2
    public final void onCancel() {
        switch (this.a) {
            case 0:
                break;
            default:
                i();
                break;
        }
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void j() {
    }
}
