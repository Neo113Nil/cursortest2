package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yy1 extends ul1 implements a91, xd0 {
    public xy1 A;
    public boolean B;
    public f6 C;
    public q20 D;
    public float E;
    public mo F;

    public static boolean H0(long j) {
        return !ql2.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean I0(long j) {
        return !ql2.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final boolean G0() {
        return this.B && this.A.h() != 9205357640488583168L;
    }

    public final long J0(long j) {
        boolean z = false;
        boolean z2 = u10.d(j) && u10.c(j);
        if (u10.f(j) && u10.e(j)) {
            z = true;
        }
        if ((!G0() && z2) || z) {
            return u10.a(j, u10.h(j), 0, u10.g(j), 0, 10);
        }
        long h = this.A.h();
        int round = I0(h) ? Math.round(Float.intBitsToFloat((int) (h >> 32))) : u10.j(j);
        int round2 = H0(h) ? Math.round(Float.intBitsToFloat((int) (h & 4294967295L))) : u10.i(j);
        int g = v10.g(j, round);
        long floatToRawIntBits = (Float.floatToRawIntBits(v10.f(j, round2)) & 4294967295L) | (Float.floatToRawIntBits(g) << 32);
        if (G0()) {
            long floatToRawIntBits2 = (Float.floatToRawIntBits(!I0(this.A.h()) ? Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.A.h() >> 32))) << 32) | (Float.floatToRawIntBits(!H0(this.A.h()) ? Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.A.h() & 4294967295L))) & 4294967295L);
            floatToRawIntBits = (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : o70.L(floatToRawIntBits2, this.D.a(floatToRawIntBits2, floatToRawIntBits));
        }
        return u10.a(j, v10.g(j, Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)))), 0, v10.f(j, Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)))), 0, 10);
    }

    @Override // defpackage.a91
    public final int a(qg1 qg1Var, jj1 jj1Var, int i) {
        if (!G0()) {
            return jj1Var.Y(i);
        }
        long J0 = J0(v10.b(0, i, 7));
        return Math.max(u10.j(J0), jj1Var.Y(i));
    }

    @Override // defpackage.a91
    public final int c(qg1 qg1Var, jj1 jj1Var, int i) {
        if (!G0()) {
            return jj1Var.e(i);
        }
        long J0 = J0(v10.b(i, 0, 13));
        return Math.max(u10.i(J0), jj1Var.e(i));
    }

    @Override // defpackage.a91
    public final int e(qg1 qg1Var, jj1 jj1Var, int i) {
        if (!G0()) {
            return jj1Var.a0(i);
        }
        long J0 = J0(v10.b(i, 0, 13));
        return Math.max(u10.i(J0), jj1Var.a0(i));
    }

    @Override // defpackage.xd0
    public final void g(k91 k91Var) {
        ns nsVar = k91Var.m;
        long h = this.A.h();
        long floatToRawIntBits = (Float.floatToRawIntBits(I0(h) ? Float.intBitsToFloat((int) (h >> 32)) : Float.intBitsToFloat((int) (nsVar.f() >> 32))) << 32) | (Float.floatToRawIntBits(H0(h) ? Float.intBitsToFloat((int) (h & 4294967295L)) : Float.intBitsToFloat((int) (nsVar.f() & 4294967295L))) & 4294967295L);
        long L = (Float.intBitsToFloat((int) (nsVar.f() >> 32)) == 0.0f || Float.intBitsToFloat((int) (nsVar.f() & 4294967295L)) == 0.0f) ? 0L : o70.L(floatToRawIntBits, this.D.a(floatToRawIntBits, nsVar.f()));
        long a = this.C.a((Math.round(Float.intBitsToFloat((int) (L >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (L & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (nsVar.f() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (nsVar.f() & 4294967295L))) & 4294967295L), k91Var.getLayoutDirection());
        float f = (int) (a >> 32);
        float f2 = (int) (a & 4294967295L);
        ((ar0) nsVar.n.n).z(f, f2);
        try {
            this.A.g(k91Var, L, this.E, this.F);
            ((ar0) nsVar.n.n).z(-f, -f2);
            k91Var.a();
        } catch (Throwable th) {
            ((ar0) nsVar.n.n).z(-f, -f2);
            throw th;
        }
    }

    @Override // defpackage.a91
    public final int h(qg1 qg1Var, jj1 jj1Var, int i) {
        if (!G0()) {
            return jj1Var.V(i);
        }
        long J0 = J0(v10.b(0, i, 7));
        return Math.max(u10.j(J0), jj1Var.V(i));
    }

    @Override // defpackage.a91
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        pj1 G;
        n12 c = jj1Var.c(J0(j));
        G = qj1Var.G(c.m, c.n, mi1.c(), new bb(c, 6));
        return G;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.A + ", sizeToIntrinsics=" + this.B + ", alignment=" + this.C + ", alpha=" + this.E + ", colorFilter=" + this.F + ')';
    }

    @Override // defpackage.ul1
    public final boolean v0() {
        return false;
    }
}
