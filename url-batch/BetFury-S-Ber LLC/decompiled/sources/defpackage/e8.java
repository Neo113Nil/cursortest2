package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class e8 extends dt {
    public int s0;
    public boolean t0;
    public int u0;
    public boolean v0;

    @Override // defpackage.rf
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.rf
    public final boolean B() {
        return this.v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.r0;
            if (i4 >= i) {
                break;
            }
            rf rfVar = this.q0[i4];
            if ((this.t0 || rfVar.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && !rfVar.A()) || (((i3 = this.s0) == 2 || i3 == 3) && !rfVar.B()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.r0; i6++) {
            rf rfVar2 = this.q0[i6];
            if (this.t0 || rfVar2.c()) {
                if (!z2) {
                    int i7 = this.s0;
                    if (i7 == 0) {
                        i5 = rfVar2.i(we.LEFT).d();
                    } else if (i7 == 1) {
                        i5 = rfVar2.i(we.RIGHT).d();
                    } else if (i7 == 2) {
                        i5 = rfVar2.i(we.TOP).d();
                    } else if (i7 == 3) {
                        i5 = rfVar2.i(we.BOTTOM).d();
                    }
                    z2 = true;
                }
                int i8 = this.s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, rfVar2.i(we.LEFT).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, rfVar2.i(we.RIGHT).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, rfVar2.i(we.TOP).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, rfVar2.i(we.BOTTOM).d());
                }
            }
        }
        int i9 = i5 + this.u0;
        int i10 = this.s0;
        if (i10 == 0 || i10 == 1) {
            J(i9, i9);
        } else {
            K(i9, i9);
        }
        this.v0 = true;
        return true;
    }

    public final int U() {
        int i = this.s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.rf
    public final void b(xx xxVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        xe[] xeVarArr = this.Q;
        xe xeVar = this.I;
        xeVarArr[0] = xeVar;
        int i3 = 2;
        xe xeVar2 = this.J;
        xeVarArr[2] = xeVar2;
        xe xeVar3 = this.K;
        xeVarArr[1] = xeVar3;
        xe xeVar4 = this.L;
        xeVarArr[3] = xeVar4;
        for (xe xeVar5 : xeVarArr) {
            xeVar5.i = xxVar.k(xeVar5);
        }
        int i4 = this.s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        xe xeVar6 = xeVarArr[i4];
        if (!this.v0) {
            T();
        }
        if (this.v0) {
            this.v0 = false;
            int i5 = this.s0;
            if (i5 == 0 || i5 == 1) {
                xxVar.d(xeVar.i, this.Z);
                xxVar.d(xeVar3.i, this.Z);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    xxVar.d(xeVar2.i, this.a0);
                    xxVar.d(xeVar4.i, this.a0);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.r0; i6++) {
            rf rfVar = this.q0[i6];
            if ((this.t0 || rfVar.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && rfVar.T[0] == qf.MATCH_CONSTRAINT && rfVar.I.f != null && rfVar.K.f != null) || ((i2 == 2 || i2 == 3) && rfVar.T[1] == qf.MATCH_CONSTRAINT && rfVar.J.f != null && rfVar.L.f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = xeVar.g() || xeVar3.g();
        boolean z4 = xeVar2.g() || xeVar4.g();
        int i7 = !(!z2 && (((i = this.s0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.r0) {
            rf rfVar2 = this.q0[i8];
            if (this.t0 || rfVar2.c()) {
                je0 k = xxVar.k(rfVar2.Q[this.s0]);
                xe[] xeVarArr2 = rfVar2.Q;
                int i9 = this.s0;
                xe xeVar7 = xeVarArr2[i9];
                xeVar7.i = k;
                xe xeVar8 = xeVar7.f;
                int i10 = (xeVar8 == null || xeVar8.d != this) ? 0 : xeVar7.g;
                if (i9 == 0 || i9 == i3) {
                    je0 je0Var = xeVar6.i;
                    int i11 = this.u0 - i10;
                    h7 l = xxVar.l();
                    je0 m = xxVar.m();
                    m.i = 0;
                    l.c(je0Var, k, m, i11);
                    xxVar.c(l);
                } else {
                    je0 je0Var2 = xeVar6.i;
                    int i12 = this.u0 + i10;
                    h7 l2 = xxVar.l();
                    je0 m2 = xxVar.m();
                    m2.i = 0;
                    l2.b(je0Var2, k, m2, i12);
                    xxVar.c(l2);
                }
                xxVar.e(xeVar6.i, k, this.u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.s0;
        if (i13 == 0) {
            xxVar.e(xeVar3.i, xeVar.i, 0, 8);
            xxVar.e(xeVar.i, this.U.K.i, 0, 4);
            xxVar.e(xeVar.i, this.U.I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            xxVar.e(xeVar.i, xeVar3.i, 0, 8);
            xxVar.e(xeVar.i, this.U.I.i, 0, 4);
            xxVar.e(xeVar.i, this.U.K.i, 0, 0);
        } else if (i13 == 2) {
            xxVar.e(xeVar4.i, xeVar2.i, 0, 8);
            xxVar.e(xeVar2.i, this.U.L.i, 0, 4);
            xxVar.e(xeVar2.i, this.U.J.i, 0, 0);
        } else if (i13 == 3) {
            xxVar.e(xeVar2.i, xeVar4.i, 0, 8);
            xxVar.e(xeVar2.i, this.U.J.i, 0, 4);
            xxVar.e(xeVar2.i, this.U.L.i, 0, 0);
        }
    }

    @Override // defpackage.rf
    public final boolean c() {
        return true;
    }

    @Override // defpackage.rf
    public final String toString() {
        String d = r7.d(new StringBuilder("[Barrier] "), this.i0, " {");
        for (int i = 0; i < this.r0; i++) {
            rf rfVar = this.q0[i];
            if (i > 0) {
                d = d.concat(", ");
            }
            d = d + rfVar.i0;
        }
        return d.concat("}");
    }
}
