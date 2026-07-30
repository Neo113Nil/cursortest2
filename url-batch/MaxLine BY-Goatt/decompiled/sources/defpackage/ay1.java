package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ay1 extends ul1 implements a91 {
    public yx1 A;

    @Override // defpackage.a91
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        pj1 G;
        if (Float.compare(this.A.a(qj1Var.getLayoutDirection()), 0.0f) < 0 || Float.compare(this.A.d(), 0.0f) < 0 || Float.compare(this.A.b(qj1Var.getLayoutDirection()), 0.0f) < 0 || Float.compare(this.A.c(), 0.0f) < 0) {
            lh.e("Padding must be non-negative");
            return null;
        }
        int R = qj1Var.R(this.A.b(qj1Var.getLayoutDirection())) + qj1Var.R(this.A.a(qj1Var.getLayoutDirection()));
        int R2 = qj1Var.R(this.A.c()) + qj1Var.R(this.A.d());
        n12 c = jj1Var.c(v10.j(-R, -R2, j));
        G = qj1Var.G(v10.g(j, c.m + R), v10.f(j, c.n + R2), mi1.c(), new oc(c, qj1Var, this, 11));
        return G;
    }
}
