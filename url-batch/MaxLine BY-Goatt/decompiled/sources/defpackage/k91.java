package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class k91 implements yd0 {
    public final ns m = new ns();
    public xd0 n;

    @Override // defpackage.ca0
    public final long A(float f) {
        return this.m.A(f);
    }

    @Override // defpackage.ca0
    public final long C(long j) {
        return this.m.C(j);
    }

    @Override // defpackage.ca0
    public final float D(float f) {
        return this.m.d() * f;
    }

    @Override // defpackage.yd0
    public final mh F() {
        return this.m.n;
    }

    @Override // defpackage.ca0
    public final float K(long j) {
        return this.m.K(j);
    }

    @Override // defpackage.yd0
    public final void P(long j, long j2, long j3, int i) {
        this.m.P(j, j2, j3, i);
    }

    @Override // defpackage.yd0
    public final void Q(y9 y9Var, long j, long j2, long j3, float f, mo moVar, int i) {
        this.m.Q(y9Var, j, j2, j3, f, moVar, i);
    }

    @Override // defpackage.ca0
    public final int R(float f) {
        return this.m.R(f);
    }

    @Override // defpackage.yd0
    public final long Z() {
        return this.m.Z();
    }

    public final void a() {
        ns nsVar = this.m;
        ls o = nsVar.n.o();
        o90 o90Var = this.n;
        if (o90Var == null) {
            throw q40.f("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        ul1 ul1Var = (ul1) o90Var;
        ul1 ul1Var2 = ul1Var.m.r;
        if (ul1Var2 != null && (ul1Var2.p & 4) != 0) {
            while (ul1Var2 != null) {
                int i = ul1Var2.o;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    ul1Var2 = ul1Var2.r;
                }
            }
        }
        ul1Var2 = null;
        if (ul1Var2 == null) {
            ks1 H = s03.H(o90Var, 4);
            if (H.Q0() == ul1Var.m) {
                H = H.B;
                H.getClass();
            }
            H.f1(o, (dw0) nsVar.n.o);
            return;
        }
        eo1 eo1Var = null;
        while (ul1Var2 != null) {
            if (ul1Var2 instanceof xd0) {
                xd0 xd0Var = (xd0) ul1Var2;
                dw0 dw0Var = (dw0) nsVar.n.o;
                ks1 H2 = s03.H(xd0Var, 4);
                long Q = zm3.Q(H2.o);
                i91 i91Var = H2.A;
                i91Var.getClass();
                ((t7) l91.a(i91Var)).getSharedDrawScope().b(o, Q, H2, xd0Var, dw0Var);
            } else if ((ul1Var2.o & 4) != 0 && (ul1Var2 instanceof p90)) {
                int i2 = 0;
                for (ul1 ul1Var3 = ((p90) ul1Var2).B; ul1Var3 != null; ul1Var3 = ul1Var3.r) {
                    if ((ul1Var3.o & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            ul1Var2 = ul1Var3;
                        } else {
                            if (eo1Var == null) {
                                eo1Var = new eo1(new ul1[16]);
                            }
                            if (ul1Var2 != null) {
                                eo1Var.b(ul1Var2);
                                ul1Var2 = null;
                            }
                            eo1Var.b(ul1Var3);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            ul1Var2 = s03.c(eo1Var);
        }
    }

    public final void b(ls lsVar, long j, ks1 ks1Var, xd0 xd0Var, dw0 dw0Var) {
        xd0 xd0Var2 = this.n;
        this.n = xd0Var;
        u81 u81Var = ks1Var.A.J;
        ns nsVar = this.m;
        mh mhVar = nsVar.n;
        ms msVar = ((ns) mhVar.p).m;
        ca0 ca0Var = msVar.a;
        u81 u81Var2 = msVar.b;
        ls o = mhVar.o();
        mh mhVar2 = nsVar.n;
        long v = mhVar2.v();
        dw0 dw0Var2 = (dw0) mhVar2.o;
        mhVar2.H(ks1Var);
        mhVar2.I(u81Var);
        mhVar2.G(lsVar);
        mhVar2.J(j);
        mhVar2.o = dw0Var;
        lsVar.m();
        try {
            xd0Var.g(this);
            lsVar.j();
            mhVar2.H(ca0Var);
            mhVar2.I(u81Var2);
            mhVar2.G(o);
            mhVar2.J(v);
            mhVar2.o = dw0Var2;
            this.n = xd0Var2;
        } catch (Throwable th) {
            lsVar.j();
            mhVar2.H(ca0Var);
            mhVar2.I(u81Var2);
            mhVar2.G(o);
            mhVar2.J(v);
            mhVar2.o = dw0Var2;
            throw th;
        }
    }

    @Override // defpackage.yd0
    public final void b0(oa oaVar, long j) {
        this.m.b0(oaVar, j);
    }

    public final void c(cq cqVar, long j, long j2, float f, ae0 ae0Var) {
        ns nsVar = this.m;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        nsVar.m.c.a(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), nsVar.b(cqVar, ae0Var, f, null, 3, 1));
    }

    @Override // defpackage.ca0
    public final long c0(long j) {
        return this.m.c0(j);
    }

    @Override // defpackage.ca0
    public final float d() {
        return this.m.d();
    }

    public final void e(cq cqVar, long j, long j2, long j3, float f, ae0 ae0Var) {
        ns nsVar = this.m;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        nsVar.m.c.p(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), nsVar.b(cqVar, ae0Var, f, null, 3, 1));
    }

    @Override // defpackage.yd0
    public final long f() {
        return this.m.f();
    }

    @Override // defpackage.ca0
    public final float g0(long j) {
        return this.m.g0(j);
    }

    @Override // defpackage.yd0
    public final u81 getLayoutDirection() {
        return this.m.m.b;
    }

    @Override // defpackage.yd0
    public final void k(oa oaVar, cq cqVar, float f, ae0 ae0Var, int i) {
        this.m.k(oaVar, cqVar, f, ae0Var, i);
    }

    @Override // defpackage.ca0
    public final long l0(float f) {
        return this.m.l0(f);
    }

    @Override // defpackage.ca0
    public final float p() {
        return this.m.p();
    }

    @Override // defpackage.ca0
    public final float p0(int i) {
        return this.m.p0(i);
    }

    @Override // defpackage.ca0
    public final float r0(float f) {
        return f / this.m.d();
    }

    @Override // defpackage.yd0
    public final void t(float f, long j, long j2) {
        this.m.t(f, j, j2);
    }

    @Override // defpackage.yd0
    public final void z(long j, long j2, long j3, long j4) {
        this.m.z(j, j2, j3, j4);
    }
}
