package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class s7 extends mp {
    public int s0;
    public boolean t0;
    public int u0;
    public boolean v0;

    @Override // defpackage.ae
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.ae
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
            ae aeVar = this.q0[i4];
            if ((this.t0 || aeVar.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && !aeVar.A()) || (((i3 = this.s0) == 2 || i3 == 3) && !aeVar.B()))) {
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
            ae aeVar2 = this.q0[i6];
            if (this.t0 || aeVar2.c()) {
                if (!z2) {
                    int i7 = this.s0;
                    if (i7 == 0) {
                        i5 = aeVar2.i(2).d();
                    } else if (i7 == 1) {
                        i5 = aeVar2.i(4).d();
                    } else if (i7 == 2) {
                        i5 = aeVar2.i(3).d();
                    } else if (i7 == 3) {
                        i5 = aeVar2.i(5).d();
                    }
                    z2 = true;
                }
                int i8 = this.s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, aeVar2.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, aeVar2.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, aeVar2.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, aeVar2.i(5).d());
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

    @Override // defpackage.ae
    public final void b(ys ysVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        ld[] ldVarArr = this.Q;
        ld ldVar = this.I;
        ldVarArr[0] = ldVar;
        int i3 = 2;
        ld ldVar2 = this.J;
        ldVarArr[2] = ldVar2;
        ld ldVar3 = this.K;
        ldVarArr[1] = ldVar3;
        ld ldVar4 = this.L;
        ldVarArr[3] = ldVar4;
        for (ld ldVar5 : ldVarArr) {
            ldVar5.i = ysVar.k(ldVar5);
        }
        int i4 = this.s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        ld ldVar6 = ldVarArr[i4];
        if (!this.v0) {
            T();
        }
        if (this.v0) {
            this.v0 = false;
            int i5 = this.s0;
            if (i5 == 0 || i5 == 1) {
                ysVar.d(ldVar.i, this.Y);
                ysVar.d(ldVar3.i, this.Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    ysVar.d(ldVar2.i, this.Z);
                    ysVar.d(ldVar4.i, this.Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.r0; i6++) {
            ae aeVar = this.q0[i6];
            if ((this.t0 || aeVar.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && aeVar.p0[0] == 3 && aeVar.I.f != null && aeVar.K.f != null) || ((i2 == 2 || i2 == 3) && aeVar.p0[1] == 3 && aeVar.J.f != null && aeVar.L.f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = ldVar.g() || ldVar3.g();
        boolean z4 = ldVar2.g() || ldVar4.g();
        int i7 = !(!z2 && (((i = this.s0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.r0) {
            ae aeVar2 = this.q0[i8];
            if (this.t0 || aeVar2.c()) {
                g60 k = ysVar.k(aeVar2.Q[this.s0]);
                ld[] ldVarArr2 = aeVar2.Q;
                int i9 = this.s0;
                ld ldVar7 = ldVarArr2[i9];
                ldVar7.i = k;
                ld ldVar8 = ldVar7.f;
                int i10 = (ldVar8 == null || ldVar8.d != this) ? 0 : ldVar7.g;
                if (i9 == 0 || i9 == i3) {
                    g60 g60Var = ldVar6.i;
                    int i11 = this.u0 - i10;
                    y6 l = ysVar.l();
                    g60 m = ysVar.m();
                    m.i = 0;
                    l.c(g60Var, k, m, i11);
                    ysVar.c(l);
                } else {
                    g60 g60Var2 = ldVar6.i;
                    int i12 = this.u0 + i10;
                    y6 l2 = ysVar.l();
                    g60 m2 = ysVar.m();
                    m2.i = 0;
                    l2.b(g60Var2, k, m2, i12);
                    ysVar.c(l2);
                }
                ysVar.e(ldVar6.i, k, this.u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.s0;
        if (i13 == 0) {
            ysVar.e(ldVar3.i, ldVar.i, 0, 8);
            ysVar.e(ldVar.i, this.T.K.i, 0, 4);
            ysVar.e(ldVar.i, this.T.I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            ysVar.e(ldVar.i, ldVar3.i, 0, 8);
            ysVar.e(ldVar.i, this.T.I.i, 0, 4);
            ysVar.e(ldVar.i, this.T.K.i, 0, 0);
        } else if (i13 == 2) {
            ysVar.e(ldVar4.i, ldVar2.i, 0, 8);
            ysVar.e(ldVar2.i, this.T.L.i, 0, 4);
            ysVar.e(ldVar2.i, this.T.J.i, 0, 0);
        } else if (i13 == 3) {
            ysVar.e(ldVar2.i, ldVar4.i, 0, 8);
            ysVar.e(ldVar2.i, this.T.J.i, 0, 4);
            ysVar.e(ldVar2.i, this.T.L.i, 0, 0);
        }
    }

    @Override // defpackage.ae
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ae
    public final String toString() {
        String str = "[Barrier] " + this.h0 + " {";
        for (int i = 0; i < this.r0; i++) {
            ae aeVar = this.q0[i];
            if (i > 0) {
                str = str.concat(", ");
            }
            str = str + aeVar.h0;
        }
        return str.concat("}");
    }
}
