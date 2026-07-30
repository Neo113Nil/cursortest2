package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yc implements y81 {
    public final bz2 a;
    public final zn1 b;
    public final /* synthetic */ zc c;

    public yc(zc zcVar, bz2 bz2Var, zn1 zn1Var) {
        this.c = zcVar;
        this.a = bz2Var;
        this.b = zn1Var;
    }

    @Override // defpackage.y81
    public final int a(qg1 qg1Var, jj1 jj1Var, int i) {
        return jj1Var.Y(i);
    }

    @Override // defpackage.y81
    public final int c(qg1 qg1Var, jj1 jj1Var, int i) {
        return jj1Var.e(i);
    }

    @Override // defpackage.y81
    public final int e(qg1 qg1Var, jj1 jj1Var, int i) {
        return jj1Var.a0(i);
    }

    @Override // defpackage.y81
    public final int h(qg1 qg1Var, jj1 jj1Var, int i) {
        return jj1Var.V(i);
    }

    @Override // defpackage.y81
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        pj1 G;
        n12 c = jj1Var.c(j);
        zc zcVar = this.c;
        long d = qj1Var.w() ? zm3.d(c.m, c.n) : ((x31) this.a.a(new p8(8, zcVar, this), new j6(6, zcVar)).getValue()).a;
        G = qj1Var.G((int) (d >> 32), (int) (4294967295L & d), mi1.c(), new xc(zcVar, c, d));
        return G;
    }
}
