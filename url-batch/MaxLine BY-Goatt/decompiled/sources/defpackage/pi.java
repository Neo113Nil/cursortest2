package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pi extends ul1 implements a91 {
    public float A;

    public final long G0(boolean z, long j) {
        int round;
        int g = u10.g(j);
        if (g == Integer.MAX_VALUE || (round = Math.round(g * this.A)) <= 0) {
            return 0L;
        }
        long d = zm3.d(round, g);
        if (!z || v10.i(j, d)) {
            return d;
        }
        return 0L;
    }

    public final long H0(boolean z, long j) {
        int round;
        int h = u10.h(j);
        if (h == Integer.MAX_VALUE || (round = Math.round(h / this.A)) <= 0) {
            return 0L;
        }
        long d = zm3.d(h, round);
        if (!z || v10.i(j, d)) {
            return d;
        }
        return 0L;
    }

    public final long I0(boolean z, long j) {
        int i = u10.i(j);
        int round = Math.round(i * this.A);
        if (round <= 0) {
            return 0L;
        }
        long d = zm3.d(round, i);
        if (!z || v10.i(j, d)) {
            return d;
        }
        return 0L;
    }

    public final long J0(boolean z, long j) {
        int j2 = u10.j(j);
        int round = Math.round(j2 / this.A);
        if (round <= 0) {
            return 0L;
        }
        long d = zm3.d(j2, round);
        if (!z || v10.i(j, d)) {
            return d;
        }
        return 0L;
    }

    @Override // defpackage.a91
    public final int a(qg1 qg1Var, jj1 jj1Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.A) : jj1Var.Y(i);
    }

    @Override // defpackage.a91
    public final int c(qg1 qg1Var, jj1 jj1Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.A) : jj1Var.e(i);
    }

    @Override // defpackage.a91
    public final int e(qg1 qg1Var, jj1 jj1Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.A) : jj1Var.a0(i);
    }

    @Override // defpackage.a91
    public final int h(qg1 qg1Var, jj1 jj1Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.A) : jj1Var.V(i);
    }

    @Override // defpackage.a91
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        pj1 G;
        long H0 = H0(true, j);
        if (x31.a(H0, 0L)) {
            H0 = G0(true, j);
            if (x31.a(H0, 0L)) {
                H0 = J0(true, j);
                if (x31.a(H0, 0L)) {
                    H0 = I0(true, j);
                    if (x31.a(H0, 0L)) {
                        H0 = H0(false, j);
                        if (x31.a(H0, 0L)) {
                            H0 = G0(false, j);
                            if (x31.a(H0, 0L)) {
                                H0 = J0(false, j);
                                if (x31.a(H0, 0L)) {
                                    H0 = I0(false, j);
                                    if (x31.a(H0, 0L)) {
                                        H0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!x31.a(H0, 0L)) {
            int i = (int) (H0 >> 32);
            int i2 = (int) (4294967295L & H0);
            if (!((i >= 0) & (i2 >= 0))) {
                j21.a("width and height must be >= 0");
            }
            j = v10.h(i, i, i2, i2);
        }
        n12 c = jj1Var.c(j);
        G = qj1Var.G(c.m, c.n, mi1.c(), new bb(c, 1));
        return G;
    }
}
