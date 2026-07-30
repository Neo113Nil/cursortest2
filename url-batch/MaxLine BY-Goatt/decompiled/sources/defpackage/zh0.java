package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zh0 extends ul1 implements a91 {
    public fz2 A;
    public uj0 B;
    public Function0 C;
    public uh0 D;
    public long E;
    public ao F;

    @Override // defpackage.a91
    public final int a(qg1 qg1Var, jj1 jj1Var, int i) {
        return jj1Var.Y(i);
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
        return jj1Var.V(i);
    }

    @Override // defpackage.a91
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        pj1 G;
        long j2;
        az2 az2Var;
        pj1 G2;
        pj1 G3;
        Object j3 = this.A.a.j();
        Object value = this.A.d.getValue();
        th0 th0Var = th0.m;
        if (j3 == value) {
            this.F = null;
        } else if (this.F == null) {
            if (this.A.f().a(th0Var, th0.n)) {
                gz2 gz2Var = this.B.a;
            } else {
                gz2 gz2Var2 = this.B.a;
            }
            this.F = qb2.p;
        }
        if (qj1Var.w()) {
            n12 c = jj1Var.c(j);
            long d = zm3.d(c.m, c.n);
            this.E = d;
            G3 = qj1Var.G((int) (d >> 32), (int) (d & 4294967295L), mi1.c(), new bb(c, 2));
            return G3;
        }
        if (!((Boolean) this.C.invoke()).booleanValue()) {
            n12 c2 = jj1Var.c(j);
            G = qj1Var.G(c2.m, c2.n, mi1.c(), new bb(c2, 3));
            return G;
        }
        uh0 uh0Var = this.D;
        bz2 bz2Var = uh0Var.a;
        bz2 bz2Var2 = uh0Var.b;
        fz2 fz2Var = uh0Var.c;
        ai0 ai0Var = uh0Var.d;
        uj0 uj0Var = uh0Var.e;
        bz2 bz2Var3 = uh0Var.f;
        if (bz2Var != null) {
            j2 = 4294967295L;
            az2Var = bz2Var.a(new vh0(ai0Var, uj0Var, 0), new vh0(ai0Var, uj0Var, 1));
        } else {
            j2 = 4294967295L;
            az2Var = null;
        }
        az2 a = bz2Var2 != null ? bz2Var2.a(new vh0(ai0Var, uj0Var, 2), new vh0(ai0Var, uj0Var, 3)) : null;
        if (fz2Var.a.j() == th0Var) {
            gz2 gz2Var3 = uj0Var.a;
        } else {
            gz2 gz2Var4 = uj0Var.a;
        }
        oc ocVar = new oc(az2Var, a, bz2Var3 != null ? bz2Var3.a(o3.Q, new oc(r5, ai0Var, uj0Var, 8)) : null, 7);
        n12 c3 = jj1Var.c(j);
        long d2 = zm3.d(c3.m, c3.n);
        long j4 = !x31.a(this.E, id.a) ? this.E : d2;
        long d3 = v10.d(j, d2);
        ao aoVar = this.F;
        G2 = qj1Var.G((int) (d3 >> 32), (int) (d3 & j2), mi1.c(), new uo(c3, s31.c(aoVar != null ? aoVar.a(j4, d3, u81.m) : 0L, 0L), 0L, ocVar, 1));
        return G2;
    }

    @Override // defpackage.ul1
    public final void y0() {
        this.E = id.a;
    }
}
