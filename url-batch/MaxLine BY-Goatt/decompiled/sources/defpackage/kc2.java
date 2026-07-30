package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kc2 extends ul1 implements a91, rz2 {
    public a31 A;
    public final p8 B;

    public kc2(a31 a31Var) {
        this.A = a31Var;
        this.B = new p8(27, this, a31Var);
    }

    @Override // defpackage.a91
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        n12 c = jj1Var.c(j);
        return qj1Var.O(c.m, c.n, mi1.c(), this.B, new bb(c, 8));
    }

    @Override // defpackage.rz2
    public final Object r() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }
}
