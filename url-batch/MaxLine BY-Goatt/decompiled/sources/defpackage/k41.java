package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class k41 extends ul1 implements a91 {
    public int A;
    public boolean B;

    @Override // defpackage.a91
    public final int a(qg1 qg1Var, jj1 jj1Var, int i) {
        return this.A == 1 ? jj1Var.V(i) : jj1Var.Y(i);
    }

    @Override // defpackage.a91
    public final int c(qg1 qg1Var, jj1 jj1Var, int i) {
        return jj1Var.e(i);
    }

    @Override // defpackage.a91
    public final int e(qg1 qg1Var, jj1 jj1Var, int i) {
        return jj1Var.a0(i);
    }

    @Override // defpackage.a91
    public final int h(qg1 qg1Var, jj1 jj1Var, int i) {
        return this.A == 1 ? jj1Var.V(i) : jj1Var.Y(i);
    }

    @Override // defpackage.a91
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        pj1 G;
        int V = this.A == 1 ? jj1Var.V(u10.g(j)) : jj1Var.Y(u10.g(j));
        if (V < 0) {
            V = 0;
        }
        if (V < 0) {
            j21.a("width must be >= 0");
        }
        long h = v10.h(V, V, 0, Integer.MAX_VALUE);
        if (this.B) {
            h = v10.e(j, h);
        }
        n12 c = jj1Var.c(h);
        G = qj1Var.G(c.m, c.n, mi1.c(), new bb(c, 5));
        return G;
    }
}
