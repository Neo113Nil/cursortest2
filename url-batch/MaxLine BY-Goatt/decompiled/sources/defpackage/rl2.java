package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rl2 extends ul1 implements a91 {
    public float A;
    public float B;
    public float C;
    public float D;
    public boolean E;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r5 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long G0(qj1 qj1Var) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (pc0.a(this.C, Float.NaN)) {
            i = Integer.MAX_VALUE;
        } else {
            i = qj1Var.R(this.C);
            if (i < 0) {
                i = 0;
            }
        }
        if (pc0.a(this.D, Float.NaN)) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = qj1Var.R(this.D);
            if (i2 < 0) {
                i2 = 0;
            }
        }
        if (!pc0.a(this.A, Float.NaN)) {
            i3 = qj1Var.R(this.A);
            if (i3 > i) {
                i3 = i;
            }
            if (i3 < 0) {
                i3 = 0;
            }
        }
        i3 = 0;
        if (!pc0.a(this.B, Float.NaN)) {
            int R = qj1Var.R(this.B);
            if (R > i2) {
                R = i2;
            }
            if (R < 0) {
                R = 0;
            }
            if (R != Integer.MAX_VALUE) {
                i4 = R;
            }
        }
        return v10.a(i3, i, i4, i2);
    }

    @Override // defpackage.a91
    public final int a(qg1 qg1Var, jj1 jj1Var, int i) {
        long G0 = G0(qg1Var);
        return u10.f(G0) ? u10.h(G0) : v10.g(G0, jj1Var.Y(i));
    }

    @Override // defpackage.a91
    public final int c(qg1 qg1Var, jj1 jj1Var, int i) {
        long G0 = G0(qg1Var);
        return u10.e(G0) ? u10.g(G0) : v10.f(G0, jj1Var.e(i));
    }

    @Override // defpackage.a91
    public final int e(qg1 qg1Var, jj1 jj1Var, int i) {
        long G0 = G0(qg1Var);
        return u10.e(G0) ? u10.g(G0) : v10.f(G0, jj1Var.a0(i));
    }

    @Override // defpackage.a91
    public final int h(qg1 qg1Var, jj1 jj1Var, int i) {
        long G0 = G0(qg1Var);
        return u10.f(G0) ? u10.h(G0) : v10.g(G0, jj1Var.V(i));
    }

    @Override // defpackage.a91
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        int j2;
        int h;
        int i;
        int g;
        long a;
        pj1 G;
        long G0 = G0(qj1Var);
        if (this.E) {
            a = v10.e(j, G0);
        } else {
            if (pc0.a(this.A, Float.NaN)) {
                j2 = u10.j(j);
                int h2 = u10.h(G0);
                if (j2 > h2) {
                    j2 = h2;
                }
            } else {
                j2 = u10.j(G0);
            }
            if (pc0.a(this.C, Float.NaN)) {
                h = u10.h(j);
                int j3 = u10.j(G0);
                if (h < j3) {
                    h = j3;
                }
            } else {
                h = u10.h(G0);
            }
            if (pc0.a(this.B, Float.NaN)) {
                i = u10.i(j);
                int g2 = u10.g(G0);
                if (i > g2) {
                    i = g2;
                }
            } else {
                i = u10.i(G0);
            }
            if (pc0.a(this.D, Float.NaN)) {
                g = u10.g(j);
                int i2 = u10.i(G0);
                if (g < i2) {
                    g = i2;
                }
            } else {
                g = u10.g(G0);
            }
            a = v10.a(j2, h, i, g);
        }
        n12 c = jj1Var.c(a);
        G = qj1Var.G(c.m, c.n, mi1.c(), new bb(c, 9));
        return G;
    }
}
