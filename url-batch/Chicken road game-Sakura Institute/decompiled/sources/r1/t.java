package r1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t extends a1 {
    public static final f7.i0 Q;
    public final o1 O;
    public s P;

    static {
        f7.i0 g9 = z0.l0.g();
        int i7 = z0.u.f10058h;
        g9.e(z0.u.f10054d);
        g9.k(1.0f);
        g9.l(1);
        Q = g9;
    }

    public t(d0 d0Var) {
        super(d0Var);
        o1 o1Var = new o1();
        o1Var.f8107i = 0;
        this.O = o1Var;
        o1Var.f8111m = this;
        this.P = d0Var.f7721h != null ? new s(this) : null;
    }

    @Override // r1.a1
    public final void H0() {
        if (this.P == null) {
            this.P = new s(this);
        }
    }

    @Override // r1.a1
    public final p0 K0() {
        return this.P;
    }

    @Override // r1.a1
    public final s0.n M0() {
        return this.O;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // r1.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(d dVar, long j8, r rVar, boolean z8, boolean z9) {
        boolean z10;
        boolean z11;
        long j9 = j8;
        r rVar2 = rVar;
        int i7 = dVar.f7718f;
        boolean z12 = false;
        d0 d0Var = this.f7700q;
        switch (i7) {
            case 1:
                z10 = true;
                break;
            default:
                y1.i o2 = d0Var.o();
                z10 = !(o2 != null && o2.f9834h);
                break;
        }
        if (z10) {
            if (j1(j9)) {
                z11 = z9;
            } else if (z8) {
                float D0 = D0(j9, L0());
                if (!Float.isInfinite(D0) && !Float.isNaN(D0)) {
                    z11 = false;
                }
            }
            z12 = true;
            if (z12) {
                return;
            }
            int i8 = rVar2.f7888h;
            i0.d u8 = d0Var.u();
            int i9 = u8.f4842h;
            if (i9 > 0) {
                Object[] objArr = u8.f4840f;
                int i10 = i9 - 1;
                while (true) {
                    d0 d0Var2 = (d0) objArr[i10];
                    if (d0Var2.F()) {
                        switch (dVar.f7718f) {
                            case 1:
                                d0Var2.w(j9, rVar2, z8, z11);
                                break;
                            default:
                                g0.t tVar = d0Var2.A;
                                ((a1) tVar.f3893d).Q0(a1.N, ((a1) tVar.f3893d).J0(j9), rVar2, true, z11);
                                rVar2 = rVar;
                                break;
                        }
                        long a3 = rVar2.a();
                        if (Float.intBitsToFloat((int) (a3 >> 32)) < 0.0f && ((int) (a3 & 4294967295L)) != 0) {
                            if (rVar2.f7890j) {
                                rVar2.f7888h = rVar2.f7889i - 1;
                            }
                        }
                    }
                    i10--;
                    if (i10 >= 0) {
                        j9 = j8;
                    }
                }
            }
            rVar2.f7888h = i8;
            return;
        }
        z11 = z9;
        if (z12) {
        }
    }

    @Override // r1.a1
    public final void Y0(z0.r rVar, c1.c cVar) {
        d0 d0Var = this.f7700q;
        g1 a3 = g0.a(d0Var);
        i0.d u8 = d0Var.u();
        int i7 = u8.f4842h;
        if (i7 > 0) {
            Object[] objArr = u8.f4840f;
            int i8 = 0;
            do {
                d0 d0Var2 = (d0) objArr[i8];
                if (d0Var2.F()) {
                    d0Var2.j(rVar, cVar);
                }
                i8++;
            } while (i8 < i7);
        }
        if (((s1.r) a3).getShowLayoutBounds()) {
            F0(rVar, Q);
        }
    }

    @Override // p1.e0
    public final int a0(int i7) {
        q5.g r8 = this.f7700q.r();
        p1.f0 k8 = r8.k();
        d0 d0Var = (d0) r8.f7527g;
        return k8.c((a1) d0Var.A.f3893d, d0Var.m(), i7);
    }

    @Override // p1.e0
    public final p1.n0 b(long j8) {
        o0(j8);
        d0 d0Var = this.f7700q;
        i0.d v5 = d0Var.v();
        int i7 = v5.f4842h;
        if (i7 > 0) {
            Object[] objArr = v5.f4840f;
            int i8 = 0;
            do {
                ((d0) objArr[i8]).B.f7848r.f7816p = 3;
                i8++;
            } while (i8 < i7);
        }
        b1(d0Var.f7733t.a(this, d0Var.m(), j8));
        W0();
        return this;
    }

    @Override // p1.e0
    public final int c(int i7) {
        q5.g r8 = this.f7700q.r();
        p1.f0 k8 = r8.k();
        d0 d0Var = (d0) r8.f7527g;
        return k8.g((a1) d0Var.A.f3893d, d0Var.m(), i7);
    }

    @Override // p1.e0
    public final int d0(int i7) {
        q5.g r8 = this.f7700q.r();
        p1.f0 k8 = r8.k();
        d0 d0Var = (d0) r8.f7527g;
        return k8.e((a1) d0Var.A.f3893d, d0Var.m(), i7);
    }

    @Override // p1.e0
    public final int e0(int i7) {
        q5.g r8 = this.f7700q.r();
        p1.f0 k8 = r8.k();
        d0 d0Var = (d0) r8.f7527g;
        return k8.b((a1) d0Var.A.f3893d, d0Var.m(), i7);
    }

    @Override // p1.n0
    public final void j0(long j8, float f9, q6.c cVar) {
        Z0(j8, f9, cVar);
        if (this.f7864l) {
            return;
        }
        X0();
        this.f7700q.B.f7848r.u0();
    }

    @Override // r1.o0
    public final int p0(p1.l lVar) {
        s sVar = this.P;
        if (sVar != null) {
            return sVar.p0(lVar);
        }
        j0 j0Var = this.f7700q.B.f7848r;
        e0 e0Var = j0Var.f7825y;
        if (!j0Var.f7817q) {
            l0 l0Var = j0Var.K;
            if (l0Var.f7833c == 1) {
                e0Var.f7759f = true;
                if (e0Var.f7755b) {
                    l0Var.f7835e = true;
                    l0Var.f7836f = true;
                }
            } else {
                e0Var.f7760g = true;
            }
        }
        j0Var.l().f7865m = true;
        j0Var.E();
        j0Var.l().f7865m = false;
        Integer num = (Integer) e0Var.f7762i.get(lVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
