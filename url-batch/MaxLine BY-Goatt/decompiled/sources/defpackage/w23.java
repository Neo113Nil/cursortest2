package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class w23 extends ul1 implements a91 {
    public float A;
    public float B;

    @Override // defpackage.a91
    public final int a(qg1 qg1Var, jj1 jj1Var, int i) {
        int Y = jj1Var.Y(i);
        int R = !pc0.a(this.A, Float.NaN) ? qg1Var.R(this.A) : 0;
        return Y < R ? R : Y;
    }

    @Override // defpackage.a91
    public final int c(qg1 qg1Var, jj1 jj1Var, int i) {
        int e = jj1Var.e(i);
        int R = !pc0.a(this.B, Float.NaN) ? qg1Var.R(this.B) : 0;
        return e < R ? R : e;
    }

    @Override // defpackage.a91
    public final int e(qg1 qg1Var, jj1 jj1Var, int i) {
        int a0 = jj1Var.a0(i);
        int R = !pc0.a(this.B, Float.NaN) ? qg1Var.R(this.B) : 0;
        return a0 < R ? R : a0;
    }

    @Override // defpackage.a91
    public final int h(qg1 qg1Var, jj1 jj1Var, int i) {
        int V = jj1Var.V(i);
        int R = !pc0.a(this.A, Float.NaN) ? qg1Var.R(this.A) : 0;
        return V < R ? R : V;
    }

    @Override // defpackage.a91
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        int j2;
        pj1 G;
        int i = 0;
        if (pc0.a(this.A, Float.NaN) || u10.j(j) != 0) {
            j2 = u10.j(j);
        } else {
            j2 = qj1Var.R(this.A);
            int h = u10.h(j);
            if (j2 > h) {
                j2 = h;
            }
            if (j2 < 0) {
                j2 = 0;
            }
        }
        int h2 = u10.h(j);
        if (pc0.a(this.B, Float.NaN) || u10.i(j) != 0) {
            i = u10.i(j);
        } else {
            int R = qj1Var.R(this.B);
            int g = u10.g(j);
            if (R > g) {
                R = g;
            }
            if (R >= 0) {
                i = R;
            }
        }
        n12 c = jj1Var.c(v10.a(j2, h2, i, u10.g(j)));
        G = qj1Var.G(c.m, c.n, mi1.c(), new bb(c, 12));
        return G;
    }
}
