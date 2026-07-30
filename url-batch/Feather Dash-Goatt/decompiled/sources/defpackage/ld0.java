package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ld0 implements hu {
    public final zf d = new zf();
    public gu e;

    @Override // defpackage.nr
    public final float A(long j) {
        return this.d.A(j);
    }

    @Override // defpackage.nr
    public final int H(float f) {
        return this.d.H(f);
    }

    @Override // defpackage.hu
    public final void I(long j, long j2, long j3, p4 p4Var, int i) {
        this.d.I(j, j2, j3, p4Var, i);
    }

    @Override // defpackage.hu
    public final void L(long j, long j2, long j3, float f, int i) {
        this.d.L(j, j2, j3, f, i);
    }

    @Override // defpackage.hu
    public final long N() {
        return this.d.N();
    }

    @Override // defpackage.nr
    public final long Q(long j) {
        return this.d.Q(j);
    }

    @Override // defpackage.nr
    public final float U(long j) {
        return this.d.U(j);
    }

    public final void a() {
        zf zfVar = this.d;
        xf g = zfVar.e.g();
        yq yqVar = this.e;
        if (yqVar == null) {
            throw qy0.g("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        zl0 zl0Var = (zl0) yqVar;
        zl0 zl0Var2 = zl0Var.d.j;
        if (zl0Var2 != null && (zl0Var2.h & 4) != 0) {
            while (zl0Var2 != null) {
                int i = zl0Var2.g;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    zl0Var2 = zl0Var2.j;
                }
            }
        }
        zl0Var2 = null;
        if (zl0Var2 == null) {
            qp0 G = op.G(yqVar, 4);
            if (G.J0() == zl0Var.d) {
                G = G.t;
                G.getClass();
            }
            G.Y0(g, (l50) zfVar.e.g);
            return;
        }
        eo0 eo0Var = null;
        while (zl0Var2 != null) {
            if (zl0Var2 instanceof gu) {
                gu guVar = (gu) zl0Var2;
                l50 l50Var = (l50) zfVar.e.g;
                qp0 G2 = op.G(guVar, 4);
                long x = ca0.x(G2.g);
                jd0 jd0Var = G2.s;
                jd0Var.getClass();
                ((d4) md0.a(jd0Var)).getSharedDrawScope().b(g, x, G2, guVar, l50Var);
            } else if ((zl0Var2.g & 4) != 0 && (zl0Var2 instanceof zq)) {
                int i2 = 0;
                for (zl0 zl0Var3 = ((zq) zl0Var2).t; zl0Var3 != null; zl0Var3 = zl0Var3.j) {
                    if ((zl0Var3.g & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            zl0Var2 = zl0Var3;
                        } else {
                            if (eo0Var == null) {
                                eo0Var = new eo0(new zl0[16]);
                            }
                            if (zl0Var2 != null) {
                                eo0Var.b(zl0Var2);
                                zl0Var2 = null;
                            }
                            eo0Var.b(zl0Var3);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            zl0Var2 = op.o(eo0Var);
        }
    }

    @Override // defpackage.nr
    public final long a0(float f) {
        return this.d.a0(f);
    }

    public final void b(xf xfVar, long j, qp0 qp0Var, gu guVar, l50 l50Var) {
        gu guVar2 = this.e;
        this.e = guVar;
        vc0 vc0Var = qp0Var.s.D;
        zf zfVar = this.d;
        i8 i8Var = zfVar.e;
        yf yfVar = ((zf) i8Var.h).d;
        nr nrVar = yfVar.a;
        vc0 vc0Var2 = yfVar.b;
        xf g = i8Var.g();
        i8 i8Var2 = zfVar.e;
        long i = i8Var2.i();
        l50 l50Var2 = (l50) i8Var2.g;
        i8Var2.t(qp0Var);
        i8Var2.u(vc0Var);
        i8Var2.s(xfVar);
        i8Var2.v(j);
        i8Var2.g = l50Var;
        xfVar.k();
        try {
            guVar.F(this);
            xfVar.i();
            i8Var2.t(nrVar);
            i8Var2.u(vc0Var2);
            i8Var2.s(g);
            i8Var2.v(i);
            i8Var2.g = l50Var2;
            this.e = guVar2;
        } catch (Throwable th) {
            xfVar.i();
            i8Var2.t(nrVar);
            i8Var2.u(vc0Var2);
            i8Var2.s(g);
            i8Var2.v(i);
            i8Var2.g = l50Var2;
            throw th;
        }
    }

    @Override // defpackage.hu
    public final void b0(c6 c6Var, op opVar, float f, p4 p4Var, int i) {
        this.d.b0(c6Var, opVar, f, p4Var, i);
    }

    public final void c(c6 c6Var, long j, p4 p4Var) {
        zf zfVar = this.d;
        zfVar.d.c.e(c6Var, zf.a(zfVar, j, p4Var, 3));
    }

    @Override // defpackage.hu
    public final void d(long j, float f, float f2, long j2, long j3, ze1 ze1Var) {
        this.d.d(j, f, f2, j2, j3, ze1Var);
    }

    @Override // defpackage.hu
    public final void e(t5 t5Var, long j, long j2, long j3, long j4, float f, md mdVar, int i) {
        this.d.e(t5Var, j, j2, j3, j4, f, mdVar, i);
    }

    @Override // defpackage.nr
    public final float f() {
        return this.d.f();
    }

    public final void g(op opVar, long j, long j2, float f, p4 p4Var) {
        zf zfVar = this.d;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        zfVar.d.c.a(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), zfVar.b(opVar, p4Var, f, null, 3, 1));
    }

    @Override // defpackage.hu
    public final vc0 getLayoutDirection() {
        return this.d.d.b;
    }

    @Override // defpackage.nr
    public final float i0(int i) {
        return this.d.i0(i);
    }

    @Override // defpackage.hu
    public final void j(float f, long j, long j2) {
        this.d.j(f, j, j2);
    }

    @Override // defpackage.nr
    public final float k() {
        return this.d.k();
    }

    @Override // defpackage.nr
    public final float k0(float f) {
        return f / this.d.k();
    }

    @Override // defpackage.hu
    public final void o(long j, long j2, long j3, long j4, p4 p4Var) {
        this.d.o(j, j2, j3, j4, p4Var);
    }

    @Override // defpackage.nr
    public final long p(float f) {
        return this.d.p(f);
    }

    @Override // defpackage.nr
    public final float s(float f) {
        return this.d.k() * f;
    }

    @Override // defpackage.hu
    public final void u(xf1 xf1Var, long j, p4 p4Var) {
        this.d.u(xf1Var, j, p4Var);
    }

    @Override // defpackage.hu
    public final i8 v() {
        return this.d.e;
    }

    @Override // defpackage.hu
    public final long x() {
        return this.d.x();
    }
}
