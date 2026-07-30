package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xx1 extends ul1 implements a91 {
    public float A;
    public float B;
    public float C;
    public float D;
    public boolean E;

    @Override // defpackage.a91
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        pj1 G;
        int R = qj1Var.R(this.C) + qj1Var.R(this.A);
        int R2 = qj1Var.R(this.D) + qj1Var.R(this.B);
        n12 c = jj1Var.c(v10.j(-R, -R2, j));
        G = qj1Var.G(v10.g(j, c.m + R), v10.f(j, c.n + R2), mi1.c(), new oc(this, c, qj1Var, 10));
        return G;
    }
}
