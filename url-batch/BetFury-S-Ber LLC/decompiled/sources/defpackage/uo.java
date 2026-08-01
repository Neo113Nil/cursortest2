package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class uo extends dt {
    public int A0;
    public t8 B0;
    public ef C0;
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
    public rf[] X0;
    public rf[] Y0;
    public int[] Z0;
    public rf[] a1;
    public int b1;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public int z0;

    @Override // defpackage.dt
    public final void S() {
        for (int i = 0; i < this.r0; i++) {
            rf rfVar = this.q0[i];
            if (rfVar != null) {
                rfVar.F = true;
            }
        }
    }

    public final int T(rf rfVar, int i) {
        rf rfVar2;
        if (rfVar == null) {
            return 0;
        }
        qf[] qfVarArr = rfVar.T;
        if (qfVarArr[1] == qf.MATCH_CONSTRAINT) {
            int i2 = rfVar.s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (rfVar.z * i);
                if (i3 != rfVar.k()) {
                    rfVar.g = true;
                    V(rfVar, qfVarArr[0], rfVar.q(), qf.FIXED, i3);
                }
                return i3;
            }
            rfVar2 = rfVar;
            if (i2 == 1) {
                return rfVar2.k();
            }
            if (i2 == 3) {
                return (int) ((rfVar2.q() * rfVar2.X) + 0.5f);
            }
        } else {
            rfVar2 = rfVar;
        }
        return rfVar2.k();
    }

    public final int U(rf rfVar, int i) {
        rf rfVar2;
        if (rfVar == null) {
            return 0;
        }
        qf[] qfVarArr = rfVar.T;
        if (qfVarArr[0] == qf.MATCH_CONSTRAINT) {
            int i2 = rfVar.r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (rfVar.w * i);
                if (i3 != rfVar.q()) {
                    rfVar.g = true;
                    V(rfVar, qf.FIXED, i3, qfVarArr[1], rfVar.k());
                }
                return i3;
            }
            rfVar2 = rfVar;
            if (i2 == 1) {
                return rfVar2.q();
            }
            if (i2 == 3) {
                return (int) ((rfVar2.k() * rfVar2.X) + 0.5f);
            }
        } else {
            rfVar2 = rfVar;
        }
        return rfVar2.q();
    }

    public final void V(rf rfVar, qf qfVar, int i, qf qfVar2, int i2) {
        ef efVar;
        rf rfVar2;
        t8 t8Var = this.B0;
        while (true) {
            efVar = this.C0;
            if (efVar != null || (rfVar2 = this.U) == null) {
                break;
            } else {
                this.C0 = ((sf) rfVar2).u0;
            }
        }
        t8Var.a = qfVar;
        t8Var.b = qfVar2;
        t8Var.c = i;
        t8Var.d = i2;
        efVar.b(rfVar, t8Var);
        rfVar.O(t8Var.e);
        rfVar.L(t8Var.f);
        rfVar.E = t8Var.h;
        rfVar.I(t8Var.g);
    }

    @Override // defpackage.rf
    public final void b(xx xxVar, boolean z) {
        rf rfVar;
        float f;
        int i;
        ArrayList arrayList = this.W0;
        super.b(xxVar, z);
        rf rfVar2 = this.U;
        boolean z2 = rfVar2 != null && ((sf) rfVar2).v0;
        int i2 = this.T0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((to) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((to) arrayList.get(i4)).b(i4, z2, i4 == size2 + (-1));
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
                rf rfVar3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.J0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    rf rfVar4 = this.Y0[i];
                    if (rfVar4 != null) {
                        xe xeVar = rfVar4.I;
                        if (rfVar4.h0 != 8) {
                            if (i8 == 0) {
                                rfVar4.f(xeVar, this.I, this.w0);
                                rfVar4.j0 = this.D0;
                                rfVar4.e0 = f;
                            }
                            if (i8 == i6 - 1) {
                                rfVar4.f(rfVar4.K, this.K, this.x0);
                            }
                            if (i8 > 0 && rfVar3 != null) {
                                xe xeVar2 = rfVar3.K;
                                rfVar4.f(xeVar, xeVar2, this.P0);
                                rfVar3.f(xeVar2, xeVar, 0);
                            }
                            rfVar3 = rfVar4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    rf rfVar5 = this.X0[i9];
                    if (rfVar5 != null) {
                        xe xeVar3 = rfVar5.J;
                        if (rfVar5.h0 != 8) {
                            if (i9 == 0) {
                                rfVar5.f(xeVar3, this.J, this.s0);
                                rfVar5.k0 = this.E0;
                                rfVar5.f0 = this.K0;
                            }
                            if (i9 == i7 - 1) {
                                rfVar5.f(rfVar5.L, this.L, this.t0);
                            }
                            if (i9 > 0 && rfVar3 != null) {
                                xe xeVar4 = rfVar3.L;
                                rfVar5.f(xeVar3, xeVar4, this.Q0);
                                rfVar3.f(xeVar4, xeVar3, 0);
                            }
                            rfVar3 = rfVar5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.V0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        rf[] rfVarArr = this.a1;
                        if (i12 < rfVarArr.length && (rfVar = rfVarArr[i12]) != null && rfVar.h0 != 8) {
                            rf rfVar6 = this.Y0[i10];
                            rf rfVar7 = this.X0[i11];
                            if (rfVar != rfVar6) {
                                rfVar.f(rfVar.I, rfVar6.I, 0);
                                rfVar.f(rfVar.K, rfVar6.K, 0);
                            }
                            if (rfVar != rfVar7) {
                                rfVar.f(rfVar.J, rfVar7.J, 0);
                                rfVar.f(rfVar.L, rfVar7.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((to) arrayList.get(0)).b(0, z2, true);
        }
        this.y0 = false;
    }
}
