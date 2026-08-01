package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class i7 extends an {
    public int s0;
    public boolean t0;
    public int u0;
    public boolean v0;

    @Override // defpackage.ad
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.ad
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
            ad adVar = this.q0[i4];
            if ((this.t0 || adVar.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && !adVar.A()) || (((i3 = this.s0) == 2 || i3 == 3) && !adVar.B()))) {
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
            ad adVar2 = this.q0[i6];
            if (this.t0 || adVar2.c()) {
                if (!z2) {
                    int i7 = this.s0;
                    if (i7 == 0) {
                        i5 = adVar2.i(2).d();
                    } else if (i7 == 1) {
                        i5 = adVar2.i(4).d();
                    } else if (i7 == 2) {
                        i5 = adVar2.i(3).d();
                    } else if (i7 == 3) {
                        i5 = adVar2.i(5).d();
                    }
                    z2 = true;
                }
                int i8 = this.s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, adVar2.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, adVar2.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, adVar2.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, adVar2.i(5).d());
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

    @Override // defpackage.ad
    public final void b(kq kqVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        lc[] lcVarArr = this.Q;
        lc lcVar = this.I;
        lcVarArr[0] = lcVar;
        int i3 = 2;
        lc lcVar2 = this.J;
        lcVarArr[2] = lcVar2;
        lc lcVar3 = this.K;
        lcVarArr[1] = lcVar3;
        lc lcVar4 = this.L;
        lcVarArr[3] = lcVar4;
        for (lc lcVar5 : lcVarArr) {
            lcVar5.i = kqVar.k(lcVar5);
        }
        int i4 = this.s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        lc lcVar6 = lcVarArr[i4];
        if (!this.v0) {
            T();
        }
        if (this.v0) {
            this.v0 = false;
            int i5 = this.s0;
            if (i5 == 0 || i5 == 1) {
                kqVar.d(lcVar.i, this.Y);
                kqVar.d(lcVar3.i, this.Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    kqVar.d(lcVar2.i, this.Z);
                    kqVar.d(lcVar4.i, this.Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.r0; i6++) {
            ad adVar = this.q0[i6];
            if ((this.t0 || adVar.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && adVar.p0[0] == 3 && adVar.I.f != null && adVar.K.f != null) || ((i2 == 2 || i2 == 3) && adVar.p0[1] == 3 && adVar.J.f != null && adVar.L.f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = lcVar.g() || lcVar3.g();
        boolean z4 = lcVar2.g() || lcVar4.g();
        int i7 = !(!z2 && (((i = this.s0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.r0) {
            ad adVar2 = this.q0[i8];
            if (this.t0 || adVar2.c()) {
                e30 k = kqVar.k(adVar2.Q[this.s0]);
                lc[] lcVarArr2 = adVar2.Q;
                int i9 = this.s0;
                lc lcVar7 = lcVarArr2[i9];
                lcVar7.i = k;
                lc lcVar8 = lcVar7.f;
                int i10 = (lcVar8 == null || lcVar8.d != this) ? 0 : lcVar7.g;
                if (i9 == 0 || i9 == i3) {
                    e30 e30Var = lcVar6.i;
                    int i11 = this.u0 - i10;
                    o6 l = kqVar.l();
                    e30 m = kqVar.m();
                    m.i = 0;
                    l.c(e30Var, k, m, i11);
                    kqVar.c(l);
                } else {
                    e30 e30Var2 = lcVar6.i;
                    int i12 = this.u0 + i10;
                    o6 l2 = kqVar.l();
                    e30 m2 = kqVar.m();
                    m2.i = 0;
                    l2.b(e30Var2, k, m2, i12);
                    kqVar.c(l2);
                }
                kqVar.e(lcVar6.i, k, this.u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.s0;
        if (i13 == 0) {
            kqVar.e(lcVar3.i, lcVar.i, 0, 8);
            kqVar.e(lcVar.i, this.T.K.i, 0, 4);
            kqVar.e(lcVar.i, this.T.I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            kqVar.e(lcVar.i, lcVar3.i, 0, 8);
            kqVar.e(lcVar.i, this.T.I.i, 0, 4);
            kqVar.e(lcVar.i, this.T.K.i, 0, 0);
        } else if (i13 == 2) {
            kqVar.e(lcVar4.i, lcVar2.i, 0, 8);
            kqVar.e(lcVar2.i, this.T.L.i, 0, 4);
            kqVar.e(lcVar2.i, this.T.J.i, 0, 0);
        } else if (i13 == 3) {
            kqVar.e(lcVar2.i, lcVar4.i, 0, 8);
            kqVar.e(lcVar2.i, this.T.J.i, 0, 4);
            kqVar.e(lcVar2.i, this.T.L.i, 0, 0);
        }
    }

    @Override // defpackage.ad
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ad
    public final String toString() {
        String str = "[Barrier] " + this.h0 + " {";
        for (int i = 0; i < this.r0; i++) {
            ad adVar = this.q0[i];
            if (i > 0) {
                str = str.concat(", ");
            }
            str = str + adVar.h0;
        }
        return str.concat("}");
    }
}
