package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ol extends mp {
    public int A0;
    public i8 B0;
    public qd C0;
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
    public ae[] X0;
    public ae[] Y0;
    public int[] Z0;
    public ae[] a1;
    public int b1;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public int z0;

    @Override // defpackage.mp
    public final void S() {
        for (int i = 0; i < this.r0; i++) {
            ae aeVar = this.q0[i];
            if (aeVar != null) {
                aeVar.F = true;
            }
        }
    }

    public final int T(ae aeVar, int i) {
        ae aeVar2;
        if (aeVar != null) {
            int[] iArr = aeVar.p0;
            if (iArr[1] == 3) {
                int i2 = aeVar.s;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (aeVar.z * i);
                        if (i3 != aeVar.k()) {
                            aeVar.g = true;
                            V(iArr[0], aeVar.q(), 1, i3, aeVar);
                        }
                        return i3;
                    }
                    aeVar2 = aeVar;
                    if (i2 == 1) {
                        return aeVar2.k();
                    }
                    if (i2 == 3) {
                        return (int) ((aeVar2.q() * aeVar2.W) + 0.5f);
                    }
                }
            } else {
                aeVar2 = aeVar;
            }
            return aeVar2.k();
        }
        return 0;
    }

    public final int U(ae aeVar, int i) {
        ae aeVar2;
        if (aeVar != null) {
            int[] iArr = aeVar.p0;
            if (iArr[0] == 3) {
                int i2 = aeVar.r;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (aeVar.w * i);
                        if (i3 != aeVar.q()) {
                            aeVar.g = true;
                            V(1, i3, iArr[1], aeVar.k(), aeVar);
                        }
                        return i3;
                    }
                    aeVar2 = aeVar;
                    if (i2 == 1) {
                        return aeVar2.q();
                    }
                    if (i2 == 3) {
                        return (int) ((aeVar2.k() * aeVar2.W) + 0.5f);
                    }
                }
            } else {
                aeVar2 = aeVar;
            }
            return aeVar2.q();
        }
        return 0;
    }

    public final void V(int i, int i2, int i3, int i4, ae aeVar) {
        qd qdVar;
        ae aeVar2;
        i8 i8Var = this.B0;
        while (true) {
            qdVar = this.C0;
            if (qdVar != null || (aeVar2 = this.T) == null) {
                break;
            } else {
                this.C0 = ((be) aeVar2).u0;
            }
        }
        i8Var.a = i;
        i8Var.b = i3;
        i8Var.c = i2;
        i8Var.d = i4;
        qdVar.b(aeVar, i8Var);
        aeVar.O(i8Var.e);
        aeVar.L(i8Var.f);
        aeVar.E = i8Var.h;
        aeVar.I(i8Var.g);
    }

    @Override // defpackage.ae
    public final void b(ys ysVar, boolean z) {
        ae aeVar;
        float f;
        int i;
        ArrayList arrayList = this.W0;
        super.b(ysVar, z);
        ae aeVar2 = this.T;
        boolean z2 = aeVar2 != null && ((be) aeVar2).v0;
        int i2 = this.T0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((nl) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((nl) arrayList.get(i4)).b(i4, z2, i4 == size2 + (-1));
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
                ae aeVar3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.J0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    ae aeVar4 = this.Y0[i];
                    if (aeVar4 != null) {
                        ld ldVar = aeVar4.I;
                        if (aeVar4.g0 != 8) {
                            if (i8 == 0) {
                                aeVar4.f(ldVar, this.I, this.w0);
                                aeVar4.i0 = this.D0;
                                aeVar4.d0 = f;
                            }
                            if (i8 == i6 - 1) {
                                aeVar4.f(aeVar4.K, this.K, this.x0);
                            }
                            if (i8 > 0 && aeVar3 != null) {
                                ld ldVar2 = aeVar3.K;
                                aeVar4.f(ldVar, ldVar2, this.P0);
                                aeVar3.f(ldVar2, ldVar, 0);
                            }
                            aeVar3 = aeVar4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    ae aeVar5 = this.X0[i9];
                    if (aeVar5 != null) {
                        ld ldVar3 = aeVar5.J;
                        if (aeVar5.g0 != 8) {
                            if (i9 == 0) {
                                aeVar5.f(ldVar3, this.J, this.s0);
                                aeVar5.j0 = this.E0;
                                aeVar5.e0 = this.K0;
                            }
                            if (i9 == i7 - 1) {
                                aeVar5.f(aeVar5.L, this.L, this.t0);
                            }
                            if (i9 > 0 && aeVar3 != null) {
                                ld ldVar4 = aeVar3.L;
                                aeVar5.f(ldVar3, ldVar4, this.Q0);
                                aeVar3.f(ldVar4, ldVar3, 0);
                            }
                            aeVar3 = aeVar5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.V0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        ae[] aeVarArr = this.a1;
                        if (i12 < aeVarArr.length && (aeVar = aeVarArr[i12]) != null && aeVar.g0 != 8) {
                            ae aeVar6 = this.Y0[i10];
                            ae aeVar7 = this.X0[i11];
                            if (aeVar != aeVar6) {
                                aeVar.f(aeVar.I, aeVar6.I, 0);
                                aeVar.f(aeVar.K, aeVar6.K, 0);
                            }
                            if (aeVar != aeVar7) {
                                aeVar.f(aeVar.J, aeVar7.J, 0);
                                aeVar.f(aeVar.L, aeVar7.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((nl) arrayList.get(0)).b(0, z2, true);
        }
        this.y0 = false;
    }
}
