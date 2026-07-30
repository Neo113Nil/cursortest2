package defpackage;

import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class o20 extends ul1 implements xd0, a91 {
    public kj A;
    public f6 B;
    public q20 C;
    public float D;

    public final long G0(long j) {
        if (ql2.e(j)) {
            return 0L;
        }
        long h = this.A.h();
        if (h != 9205357640488583168L) {
            float d = ql2.d(h);
            if (Float.isInfinite(d) || Float.isNaN(d)) {
                d = ql2.d(j);
            }
            float b = ql2.b(h);
            if (Float.isInfinite(b) || Float.isNaN(b)) {
                b = ql2.b(j);
            }
            long a = ph2.a(d, b);
            long a2 = this.C.a(a, j);
            int i = ne2.a;
            float intBitsToFloat = Float.intBitsToFloat((int) (a2 >> 32));
            if (!Float.isInfinite(intBitsToFloat) && !Float.isNaN(intBitsToFloat)) {
                float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & a2));
                if (!Float.isInfinite(intBitsToFloat2) && !Float.isNaN(intBitsToFloat2)) {
                    return o70.L(a, a2);
                }
            }
        }
        return j;
    }

    public final long H0(long j) {
        float j2;
        int i;
        float b;
        boolean f = u10.f(j);
        boolean e = u10.e(j);
        if (!f || !e) {
            boolean z = u10.d(j) && u10.c(j);
            long h = this.A.h();
            if (h != 9205357640488583168L) {
                if (z && (f || e)) {
                    j2 = u10.h(j);
                    i = u10.g(j);
                } else {
                    float d = ql2.d(h);
                    float b2 = ql2.b(h);
                    if (Float.isInfinite(d) || Float.isNaN(d)) {
                        j2 = u10.j(j);
                    } else {
                        h72 h72Var = p33.b;
                        j2 = d.b(d, u10.j(j), u10.h(j));
                    }
                    if (!Float.isInfinite(b2) && !Float.isNaN(b2)) {
                        h72 h72Var2 = p33.b;
                        b = d.b(b2, u10.i(j), u10.g(j));
                        long G0 = G0(ph2.a(j2, b));
                        return u10.a(j, v10.g(j, si1.b(ql2.d(G0))), 0, v10.f(j, si1.b(ql2.b(G0))), 0, 10);
                    }
                    i = u10.i(j);
                }
                b = i;
                long G02 = G0(ph2.a(j2, b));
                return u10.a(j, v10.g(j, si1.b(ql2.d(G02))), 0, v10.f(j, si1.b(ql2.b(G02))), 0, 10);
            }
            if (z) {
                return u10.a(j, u10.h(j), 0, u10.g(j), 0, 10);
            }
        }
        return j;
    }

    @Override // defpackage.a91
    public final int a(qg1 qg1Var, jj1 jj1Var, int i) {
        if (this.A.h() == 9205357640488583168L) {
            return jj1Var.Y(i);
        }
        int Y = jj1Var.Y(u10.g(H0(v10.b(0, i, 7))));
        return Math.max(si1.b(ql2.d(G0(ph2.a(Y, i)))), Y);
    }

    @Override // defpackage.a91
    public final int c(qg1 qg1Var, jj1 jj1Var, int i) {
        if (this.A.h() == 9205357640488583168L) {
            return jj1Var.e(i);
        }
        int e = jj1Var.e(u10.h(H0(v10.b(i, 0, 13))));
        return Math.max(si1.b(ql2.b(G0(ph2.a(i, e)))), e);
    }

    @Override // defpackage.a91
    public final int e(qg1 qg1Var, jj1 jj1Var, int i) {
        if (this.A.h() == 9205357640488583168L) {
            return jj1Var.a0(i);
        }
        int a0 = jj1Var.a0(u10.h(H0(v10.b(i, 0, 13))));
        return Math.max(si1.b(ql2.b(G0(ph2.a(i, a0)))), a0);
    }

    @Override // defpackage.xd0
    public final void g(k91 k91Var) {
        ns nsVar = k91Var.m;
        long G0 = G0(nsVar.f());
        f6 f6Var = this.B;
        h72 h72Var = p33.b;
        long d = zm3.d(si1.b(ql2.d(G0)), si1.b(ql2.b(G0)));
        long f = nsVar.f();
        long a = f6Var.a(d, zm3.d(si1.b(ql2.d(f)), si1.b(ql2.b(f))), k91Var.getLayoutDirection());
        float f2 = (int) (a >> 32);
        float f3 = (int) (a & 4294967295L);
        ((ar0) nsVar.n.n).z(f2, f3);
        this.A.g(k91Var, G0, this.D, null);
        ((ar0) nsVar.n.n).z(-f2, -f3);
        k91Var.a();
    }

    @Override // defpackage.a91
    public final int h(qg1 qg1Var, jj1 jj1Var, int i) {
        if (this.A.h() == 9205357640488583168L) {
            return jj1Var.V(i);
        }
        int V = jj1Var.V(u10.g(H0(v10.b(0, i, 7))));
        return Math.max(si1.b(ql2.d(G0(ph2.a(V, i)))), V);
    }

    @Override // defpackage.a91
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        pj1 G;
        n12 c = jj1Var.c(H0(j));
        G = qj1Var.G(c.m, c.n, mi1.c(), new w10(c, 1));
        return G;
    }

    @Override // defpackage.ul1
    public final boolean v0() {
        return false;
    }
}
