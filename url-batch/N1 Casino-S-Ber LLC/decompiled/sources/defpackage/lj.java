package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class lj extends an {
    public int A0;
    public v7 B0;
    public qc C0;
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
    public ad[] X0;
    public ad[] Y0;
    public int[] Z0;
    public ad[] a1;
    public int b1;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public int z0;

    @Override // defpackage.an
    public final void S() {
        for (int i = 0; i < this.r0; i++) {
            ad adVar = this.q0[i];
            if (adVar != null) {
                adVar.F = true;
            }
        }
    }

    public final int T(ad adVar, int i) {
        ad adVar2;
        if (adVar != null) {
            int[] iArr = adVar.p0;
            if (iArr[1] == 3) {
                int i2 = adVar.s;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (adVar.z * i);
                        if (i3 != adVar.k()) {
                            adVar.g = true;
                            V(iArr[0], adVar.q(), 1, i3, adVar);
                        }
                        return i3;
                    }
                    adVar2 = adVar;
                    if (i2 == 1) {
                        return adVar2.k();
                    }
                    if (i2 == 3) {
                        return (int) ((adVar2.q() * adVar2.W) + 0.5f);
                    }
                }
            } else {
                adVar2 = adVar;
            }
            return adVar2.k();
        }
        return 0;
    }

    public final int U(ad adVar, int i) {
        ad adVar2;
        if (adVar != null) {
            int[] iArr = adVar.p0;
            if (iArr[0] == 3) {
                int i2 = adVar.r;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (adVar.w * i);
                        if (i3 != adVar.q()) {
                            adVar.g = true;
                            V(1, i3, iArr[1], adVar.k(), adVar);
                        }
                        return i3;
                    }
                    adVar2 = adVar;
                    if (i2 == 1) {
                        return adVar2.q();
                    }
                    if (i2 == 3) {
                        return (int) ((adVar2.k() * adVar2.W) + 0.5f);
                    }
                }
            } else {
                adVar2 = adVar;
            }
            return adVar2.q();
        }
        return 0;
    }

    public final void V(int i, int i2, int i3, int i4, ad adVar) {
        qc qcVar;
        ad adVar2;
        v7 v7Var = this.B0;
        while (true) {
            qcVar = this.C0;
            if (qcVar != null || (adVar2 = this.T) == null) {
                break;
            } else {
                this.C0 = ((bd) adVar2).u0;
            }
        }
        v7Var.a = i;
        v7Var.b = i3;
        v7Var.c = i2;
        v7Var.d = i4;
        qcVar.b(adVar, v7Var);
        adVar.O(v7Var.e);
        adVar.L(v7Var.f);
        adVar.E = v7Var.h;
        adVar.I(v7Var.g);
    }

    @Override // defpackage.ad
    public final void b(kq kqVar, boolean z) {
        ad adVar;
        float f;
        int i;
        ArrayList arrayList = this.W0;
        super.b(kqVar, z);
        ad adVar2 = this.T;
        boolean z2 = adVar2 != null && ((bd) adVar2).v0;
        int i2 = this.T0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((kj) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((kj) arrayList.get(i4)).b(i4, z2, i4 == size2 + (-1));
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
                ad adVar3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.J0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    ad adVar4 = this.Y0[i];
                    if (adVar4 != null) {
                        lc lcVar = adVar4.I;
                        if (adVar4.g0 != 8) {
                            if (i8 == 0) {
                                adVar4.f(lcVar, this.I, this.w0);
                                adVar4.i0 = this.D0;
                                adVar4.d0 = f;
                            }
                            if (i8 == i6 - 1) {
                                adVar4.f(adVar4.K, this.K, this.x0);
                            }
                            if (i8 > 0 && adVar3 != null) {
                                lc lcVar2 = adVar3.K;
                                adVar4.f(lcVar, lcVar2, this.P0);
                                adVar3.f(lcVar2, lcVar, 0);
                            }
                            adVar3 = adVar4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    ad adVar5 = this.X0[i9];
                    if (adVar5 != null) {
                        lc lcVar3 = adVar5.J;
                        if (adVar5.g0 != 8) {
                            if (i9 == 0) {
                                adVar5.f(lcVar3, this.J, this.s0);
                                adVar5.j0 = this.E0;
                                adVar5.e0 = this.K0;
                            }
                            if (i9 == i7 - 1) {
                                adVar5.f(adVar5.L, this.L, this.t0);
                            }
                            if (i9 > 0 && adVar3 != null) {
                                lc lcVar4 = adVar3.L;
                                adVar5.f(lcVar3, lcVar4, this.Q0);
                                adVar3.f(lcVar4, lcVar3, 0);
                            }
                            adVar3 = adVar5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.V0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        ad[] adVarArr = this.a1;
                        if (i12 < adVarArr.length && (adVar = adVarArr[i12]) != null && adVar.g0 != 8) {
                            ad adVar6 = this.Y0[i10];
                            ad adVar7 = this.X0[i11];
                            if (adVar != adVar6) {
                                adVar.f(adVar.I, adVar6.I, 0);
                                adVar.f(adVar.K, adVar6.K, 0);
                            }
                            if (adVar != adVar7) {
                                adVar.f(adVar.J, adVar7.J, 0);
                                adVar.f(adVar.L, adVar7.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((kj) arrayList.get(0)).b(0, z2, true);
        }
        this.y0 = false;
    }
}
