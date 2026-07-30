package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fv2 implements bu2 {
    public final /* synthetic */ gv2 a;
    public final /* synthetic */ boolean b;

    public fv2(gv2 gv2Var, boolean z) {
        this.a = gv2Var;
        this.b = z;
    }

    @Override // defpackage.bu2
    public final void a() {
        gv2 gv2Var = this.a;
        gv2Var.o.setValue(null);
        gv2Var.p.setValue(null);
        gv2Var.p(true);
    }

    @Override // defpackage.bu2
    public final void b() {
        gv2 gv2Var = this.a;
        gv2Var.o.setValue(null);
        gv2Var.p.setValue(null);
        gv2Var.p(true);
    }

    @Override // defpackage.bu2
    public final void d() {
        cw2 d;
        boolean z = this.b;
        xw0 xw0Var = z ? xw0.n : xw0.o;
        gv2 gv2Var = this.a;
        gv2Var.o.setValue(xw0Var);
        long i = gv2Var.i(z);
        ji2 ji2Var = lh2.a;
        long i2 = ap.i(au1.d(i), au1.e(i) - 1.0f);
        sc1 sc1Var = gv2Var.d;
        if (sc1Var == null || (d = sc1Var.d()) == null) {
            return;
        }
        long e = d.e(i2);
        gv2Var.l = e;
        gv2Var.p.setValue(new au1(e));
        gv2Var.n = 0L;
        gv2Var.q = -1;
        sc1 sc1Var2 = gv2Var.d;
        if (sc1Var2 != null) {
            sc1Var2.q.setValue(Boolean.TRUE);
        }
        gv2Var.p(false);
    }

    @Override // defpackage.bu2
    public final void e(long j) {
        gv2 gv2Var = this.a;
        long g = au1.g(gv2Var.n, j);
        gv2Var.n = g;
        gv2Var.p.setValue(new au1(au1.g(gv2Var.l, g)));
        nv2 j2 = gv2Var.j();
        au1 g2 = gv2Var.g();
        g2.getClass();
        gv2.a(gv2Var, j2, g2.a, false, this.b, by1.x, true);
        gv2Var.p(false);
    }

    @Override // defpackage.bu2
    public final void onCancel() {
    }

    @Override // defpackage.bu2
    public final void c(long j) {
    }
}
