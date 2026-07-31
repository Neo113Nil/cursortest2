package w1;

import android.graphics.Paint;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r extends d1 {
    public static final f1.h S;
    public final u1 Q;
    public q R;

    static {
        f1.h f6 = f1.p.f();
        f6.e(f1.s.f2701e);
        ((Paint) f6.f2660b).setStrokeWidth(1.0f);
        f6.j(1);
        S = f6;
    }

    public r(f0 f0Var) {
        super(f0Var);
        u1 u1Var = new u1();
        u1Var.f8709g = 0;
        this.Q = u1Var;
        u1Var.f8712k = this;
        this.R = f0Var.f7644j != null ? new q(this) : null;
    }

    @Override // w1.d1
    public final o0 C0() {
        return this.R;
    }

    @Override // w1.d1
    public final y0.l E0() {
        return this.Q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // w1.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K0(d dVar, long j7, p pVar, int i, boolean z3) {
        boolean z7;
        int i8;
        boolean z8;
        boolean z9;
        f0 f0Var;
        long j8 = j7;
        p pVar2 = pVar;
        int i9 = dVar.f7609d;
        f0 f0Var2 = this.f7614r;
        switch (i9) {
            case 1:
                z7 = true;
                break;
            default:
                d2.j u7 = f0Var2.u();
                z7 = !(u7 != null && u7.f2153g);
                break;
        }
        if (z7) {
            if (d1(j8)) {
                i8 = i;
                z8 = z3;
                z9 = true;
            } else {
                i8 = i;
                if (i8 == 1 && (Float.floatToRawIntBits(w0(j8, D0())) & Integer.MAX_VALUE) < 2139095040) {
                    z9 = true;
                    z8 = false;
                }
            }
            if (z9) {
                return;
            }
            int i10 = pVar2.f7747f;
            o0.e w7 = f0Var2.w();
            Object[] objArr = w7.f5578d;
            int i11 = w7.f5580f - 1;
            while (i11 >= 0) {
                f0 f0Var3 = (f0) objArr[i11];
                if (f0Var3.H()) {
                    switch (dVar.f7609d) {
                        case 1:
                            f0Var3.y(j8, pVar2, i8, z8);
                            f0Var = f0Var3;
                            break;
                        default:
                            b1 b1Var = f0Var3.F;
                            b1Var.f7598d.J0(d1.P, b1Var.f7598d.B0(j8), pVar2, 1, z8);
                            pVar2 = pVar;
                            f0Var = f0Var3;
                            break;
                    }
                    long a8 = pVar2.a();
                    if (f.k(a8) < 0.0f && f.p(a8) && !f.o(a8)) {
                        d1 d1Var = f0Var.F.f7598d;
                        d1Var.getClass();
                        y0.l G0 = d1Var.G0(e1.g(16));
                        if (G0 != null && G0.f8718q) {
                            if (!G0.f8706d.f8718q) {
                                t1.a.b("visitLocalDescendants called on an unattached node");
                            }
                            y0.l lVar = G0.f8706d;
                            if ((lVar.f8709g & 16) != 0) {
                                while (lVar != null) {
                                    if ((lVar.f8708f & 16) != 0) {
                                        l lVar2 = lVar;
                                        ?? r62 = 0;
                                        while (lVar2 != 0) {
                                            if (lVar2 instanceof p1) {
                                                if (((p1) lVar2).N()) {
                                                    pVar2.f7747f = pVar2.f7745d.f5443b - 1;
                                                }
                                            } else if ((lVar2.f8708f & 16) != 0 && (lVar2 instanceof l)) {
                                                y0.l lVar3 = lVar2.f7707s;
                                                int i12 = 0;
                                                lVar2 = lVar2;
                                                r62 = r62;
                                                while (lVar3 != null) {
                                                    if ((lVar3.f8708f & 16) != 0) {
                                                        i12++;
                                                        r62 = r62;
                                                        if (i12 == 1) {
                                                            lVar2 = lVar3;
                                                        } else {
                                                            if (r62 == 0) {
                                                                r62 = new o0.e(new y0.l[16]);
                                                            }
                                                            if (lVar2 != 0) {
                                                                r62.b(lVar2);
                                                                lVar2 = 0;
                                                            }
                                                            r62.b(lVar3);
                                                        }
                                                    }
                                                    lVar3 = lVar3.i;
                                                    lVar2 = lVar2;
                                                    r62 = r62;
                                                }
                                                if (i12 == 1) {
                                                }
                                            }
                                            lVar2 = f.f(r62);
                                        }
                                    }
                                    lVar = lVar.i;
                                }
                            }
                        }
                        pVar2.f7747f = i10;
                        return;
                    }
                }
                i11--;
                j8 = j7;
                i8 = i;
            }
            pVar2.f7747f = i10;
            return;
        }
        i8 = i;
        z8 = z3;
        z9 = false;
        if (z9) {
        }
    }

    @Override // u1.l0
    public final void U(long j7, float f6, p6.c cVar) {
        V0(j7, f6, cVar);
        if (this.f7729m) {
            return;
        }
        this.f7614r.G.f7700p.h0();
    }

    @Override // w1.d1
    public final void U0(f1.q qVar, i1.b bVar) {
        f0 f0Var = this.f7614r;
        k1 a8 = i0.a(f0Var);
        o0.e w7 = f0Var.w();
        Object[] objArr = w7.f5578d;
        int i = w7.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            f0 f0Var2 = (f0) objArr[i8];
            if (f0Var2.H()) {
                f0Var2.i(qVar, bVar);
            }
        }
        if (((x1.t) a8).getShowLayoutBounds()) {
            long j7 = this.f7232f;
            qVar.o(0.5f, 0.5f, ((int) (j7 >> 32)) - 0.5f, ((int) (j7 & 4294967295L)) - 0.5f, S);
        }
    }

    @Override // w1.n0
    public final int b0(u1.a aVar) {
        q qVar = this.R;
        if (qVar != null) {
            return qVar.b0(aVar);
        }
        w0 w0Var = this.f7614r.G.f7700p;
        g0 g0Var = w0Var.f7816z;
        if (w0Var.i.f7689d == b0.f7590d) {
            g0Var.f7668d = true;
            if (g0Var.f7666b) {
                w0Var.f7814x = true;
                w0Var.f7815y = true;
            }
        } else {
            g0Var.f7669e = true;
        }
        w0Var.m().f7730n = true;
        w0Var.q();
        w0Var.m().f7730n = false;
        Integer num = (Integer) g0Var.f7671g.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // u1.d0
    public final u1.l0 e(long j7) {
        X(j7);
        f0 f0Var = this.f7614r;
        o0.e x7 = f0Var.x();
        Object[] objArr = x7.f5578d;
        int i = x7.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            ((f0) objArr[i8]).G.f7700p.f7805o = d0.f7612f;
        }
        Y0(f0Var.f7658x.e(this, f0Var.G.f7700p.Z(), j7));
        Q0();
        return this;
    }

    @Override // w1.d1
    public final void z0() {
        if (this.R == null) {
            this.R = new q(this);
        }
    }
}
