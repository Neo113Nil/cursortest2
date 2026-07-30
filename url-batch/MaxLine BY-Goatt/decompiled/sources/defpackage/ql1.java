package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ql1 extends ul1 implements l00, a91 {
    @Override // defpackage.a91
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        pj1 G;
        float f = ((pc0) tk3.J(this, c41.a)).m;
        if (f < 0.0f) {
            f = 0.0f;
        }
        n12 c = jj1Var.c(j);
        boolean z = this.z && !Float.isNaN(f) && Float.compare(f, 0.0f) > 0;
        int R = Float.isNaN(f) ? 0 : qj1Var.R(f);
        int i = c.m;
        if (z) {
            i = Math.max(i, R);
        }
        int i2 = c.n;
        if (z) {
            i2 = Math.max(i2, R);
        }
        G = qj1Var.G(i, i2, mi1.c(), new c31(i, c, i2));
        return G;
    }
}
