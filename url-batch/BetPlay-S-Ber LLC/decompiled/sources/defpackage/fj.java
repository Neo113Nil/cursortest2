package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class fj extends pn {
    public int A0;
    public b8 B0;
    public uc C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public ArrayList W0;
    public ed[] X0;
    public ed[] Y0;
    public int[] Z0;
    public ed[] a1;
    public int b1;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public int z0;

    @Override // defpackage.pn
    public final void S() {
        for (int i = 0; i < this.r0; i++) {
            ed edVar = this.q0[i];
            if (edVar != null) {
                edVar.F = true;
            }
        }
    }

    public final int T(ed edVar, int i) {
        ed edVar2;
        if (edVar != null) {
            int[] iArr = edVar.p0;
            if (iArr[1] == 3) {
                int i2 = edVar.s;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (edVar.z * i);
                        if (i3 != edVar.k()) {
                            edVar.g = true;
                            V(iArr[0], edVar.q(), 1, i3, edVar);
                        }
                        return i3;
                    }
                    edVar2 = edVar;
                    if (i2 == 1) {
                        return edVar2.k();
                    }
                    if (i2 == 3) {
                        return (int) ((edVar2.q() * edVar2.W) + 0.5f);
                    }
                }
            } else {
                edVar2 = edVar;
            }
            return edVar2.k();
        }
        return 0;
    }

    public final int U(ed edVar, int i) {
        ed edVar2;
        if (edVar != null) {
            int[] iArr = edVar.p0;
            if (iArr[0] == 3) {
                int i2 = edVar.r;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (edVar.w * i);
                        if (i3 != edVar.q()) {
                            edVar.g = true;
                            V(1, i3, iArr[1], edVar.k(), edVar);
                        }
                        return i3;
                    }
                    edVar2 = edVar;
                    if (i2 == 1) {
                        return edVar2.q();
                    }
                    if (i2 == 3) {
                        return (int) ((edVar2.k() * edVar2.W) + 0.5f);
                    }
                }
            } else {
                edVar2 = edVar;
            }
            return edVar2.q();
        }
        return 0;
    }

    public final void V(int i, int i2, int i3, int i4, ed edVar) {
        uc ucVar;
        ed edVar2;
        b8 b8Var = this.B0;
        while (true) {
            ucVar = this.C0;
            if (ucVar != null || (edVar2 = this.T) == null) {
                break;
            } else {
                this.C0 = ((fd) edVar2).u0;
            }
        }
        b8Var.a = i;
        b8Var.b = i3;
        b8Var.c = i2;
        b8Var.d = i4;
        ucVar.b(edVar, b8Var);
        edVar.O(b8Var.e);
        edVar.L(b8Var.f);
        edVar.E = b8Var.h;
        edVar.I(b8Var.g);
    }

    @Override // defpackage.ed
    public final void b(xq xqVar, boolean z) {
        ed edVar;
        float f;
        int i;
        ArrayList arrayList = this.W0;
        super.b(xqVar, z);
        ed edVar2 = this.T;
        boolean z2 = edVar2 != null && ((fd) edVar2).v0;
        int i2 = this.T0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((ej) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((ej) arrayList.get(i4)).b(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                for (int i5 = 0; i5 < this.b1; i5++) {
                    this.a1[i5].D();
                }
                int[] iArr = this.Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.J0;
                ed edVar3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.J0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    ed edVar4 = this.Y0[i];
                    if (edVar4 != null) {
                        pc pcVar = edVar4.I;
                        if (edVar4.g0 != 8) {
                            if (i8 == 0) {
                                edVar4.f(pcVar, this.I, this.w0);
                                edVar4.i0 = this.D0;
                                edVar4.d0 = f;
                            }
                            if (i8 == i6 - 1) {
                                edVar4.f(edVar4.K, this.K, this.x0);
                            }
                            if (i8 > 0 && edVar3 != null) {
                                pc pcVar2 = edVar3.K;
                                edVar4.f(pcVar, pcVar2, this.P0);
                                edVar3.f(pcVar2, pcVar, 0);
                            }
                            edVar3 = edVar4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    ed edVar5 = this.X0[i9];
                    if (edVar5 != null) {
                        pc pcVar3 = edVar5.J;
                        if (edVar5.g0 != 8) {
                            if (i9 == 0) {
                                edVar5.f(pcVar3, this.J, this.s0);
                                edVar5.j0 = this.E0;
                                edVar5.e0 = this.K0;
                            }
                            if (i9 == i7 - 1) {
                                edVar5.f(edVar5.L, this.L, this.t0);
                            }
                            if (i9 > 0 && edVar3 != null) {
                                pc pcVar4 = edVar3.L;
                                edVar5.f(pcVar3, pcVar4, this.Q0);
                                edVar3.f(pcVar4, pcVar3, 0);
                            }
                            edVar3 = edVar5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.V0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        ed[] edVarArr = this.a1;
                        if (i12 < edVarArr.length && (edVar = edVarArr[i12]) != null && edVar.g0 != 8) {
                            ed edVar6 = this.Y0[i10];
                            ed edVar7 = this.X0[i11];
                            if (edVar != edVar6) {
                                edVar.f(edVar.I, edVar6.I, 0);
                                edVar.f(edVar.K, edVar6.K, 0);
                            }
                            if (edVar != edVar7) {
                                edVar.f(edVar.J, edVar7.J, 0);
                                edVar.f(edVar.L, edVar7.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((ej) arrayList.get(0)).b(0, z2, true);
        }
        this.y0 = false;
    }
}
