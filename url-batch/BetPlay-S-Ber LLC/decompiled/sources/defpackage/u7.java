package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class u7 extends pn {
    public int s0;
    public boolean t0;
    public int u0;
    public boolean v0;

    @Override // defpackage.ed
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.ed
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
            ed edVar = this.q0[i4];
            if ((this.t0 || edVar.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && !edVar.A()) || (((i3 = this.s0) == 2 || i3 == 3) && !edVar.B()))) {
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
            ed edVar2 = this.q0[i6];
            if (this.t0 || edVar2.c()) {
                if (!z2) {
                    int i7 = this.s0;
                    if (i7 == 0) {
                        i5 = edVar2.i(2).d();
                    } else if (i7 == 1) {
                        i5 = edVar2.i(4).d();
                    } else if (i7 == 2) {
                        i5 = edVar2.i(3).d();
                    } else if (i7 == 3) {
                        i5 = edVar2.i(5).d();
                    }
                    z2 = true;
                }
                int i8 = this.s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, edVar2.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, edVar2.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, edVar2.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, edVar2.i(5).d());
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

    @Override // defpackage.ed
    public final void b(xq xqVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        pc[] pcVarArr = this.Q;
        pc pcVar = this.I;
        pcVarArr[0] = pcVar;
        int i3 = 2;
        pc pcVar2 = this.J;
        pcVarArr[2] = pcVar2;
        pc pcVar3 = this.K;
        pcVarArr[1] = pcVar3;
        pc pcVar4 = this.L;
        pcVarArr[3] = pcVar4;
        for (pc pcVar5 : pcVarArr) {
            pcVar5.i = xqVar.k(pcVar5);
        }
        int i4 = this.s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        pc pcVar6 = pcVarArr[i4];
        if (!this.v0) {
            T();
        }
        if (this.v0) {
            this.v0 = false;
            int i5 = this.s0;
            if (i5 == 0 || i5 == 1) {
                xqVar.d(pcVar.i, this.Y);
                xqVar.d(pcVar3.i, this.Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    xqVar.d(pcVar2.i, this.Z);
                    xqVar.d(pcVar4.i, this.Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.r0; i6++) {
            ed edVar = this.q0[i6];
            if ((this.t0 || edVar.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && edVar.p0[0] == 3 && edVar.I.f != null && edVar.K.f != null) || ((i2 == 2 || i2 == 3) && edVar.p0[1] == 3 && edVar.J.f != null && edVar.L.f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = pcVar.g() || pcVar3.g();
        boolean z4 = pcVar2.g() || pcVar4.g();
        int i7 = !(!z2 && (((i = this.s0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.r0) {
            ed edVar2 = this.q0[i8];
            if (this.t0 || edVar2.c()) {
                p30 k = xqVar.k(edVar2.Q[this.s0]);
                pc[] pcVarArr2 = edVar2.Q;
                int i9 = this.s0;
                pc pcVar7 = pcVarArr2[i9];
                pcVar7.i = k;
                pc pcVar8 = pcVar7.f;
                int i10 = (pcVar8 == null || pcVar8.d != this) ? 0 : pcVar7.g;
                if (i9 == 0 || i9 == i3) {
                    p30 p30Var = pcVar6.i;
                    int i11 = this.u0 - i10;
                    f7 l = xqVar.l();
                    p30 m = xqVar.m();
                    m.i = 0;
                    l.c(p30Var, k, m, i11);
                    xqVar.c(l);
                } else {
                    p30 p30Var2 = pcVar6.i;
                    int i12 = this.u0 + i10;
                    f7 l2 = xqVar.l();
                    p30 m2 = xqVar.m();
                    m2.i = 0;
                    l2.b(p30Var2, k, m2, i12);
                    xqVar.c(l2);
                }
                xqVar.e(pcVar6.i, k, this.u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.s0;
        if (i13 == 0) {
            xqVar.e(pcVar3.i, pcVar.i, 0, 8);
            xqVar.e(pcVar.i, this.T.K.i, 0, 4);
            xqVar.e(pcVar.i, this.T.I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            xqVar.e(pcVar.i, pcVar3.i, 0, 8);
            xqVar.e(pcVar.i, this.T.I.i, 0, 4);
            xqVar.e(pcVar.i, this.T.K.i, 0, 0);
        } else if (i13 == 2) {
            xqVar.e(pcVar4.i, pcVar2.i, 0, 8);
            xqVar.e(pcVar2.i, this.T.L.i, 0, 4);
            xqVar.e(pcVar2.i, this.T.J.i, 0, 0);
        } else if (i13 == 3) {
            xqVar.e(pcVar2.i, pcVar4.i, 0, 8);
            xqVar.e(pcVar2.i, this.T.J.i, 0, 4);
            xqVar.e(pcVar2.i, this.T.L.i, 0, 0);
        }
    }

    @Override // defpackage.ed
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ed
    public final String toString() {
        String str = "[Barrier] " + this.h0 + " {";
        for (int i = 0; i < this.r0; i++) {
            ed edVar = this.q0[i];
            if (i > 0) {
                str = str.concat(", ");
            }
            str = str + edVar.h0;
        }
        return str.concat("}");
    }
}
