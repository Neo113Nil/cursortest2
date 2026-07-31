package y2;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends i {
    public int A0;
    public z2.b B0;
    public b3.f C0;
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
    public d[] X0;
    public d[] Y0;
    public int[] Z0;

    /* renamed from: a1, reason: collision with root package name */
    public d[] f8815a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f8816b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f8817s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f8818t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f8819u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f8820v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f8821w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f8822x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f8823y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f8824z0;

    @Override // y2.i
    public final void S() {
        for (int i = 0; i < this.f8832r0; i++) {
            d dVar = this.f8831q0[i];
            if (dVar != null) {
                dVar.F = true;
            }
        }
    }

    public final int T(d dVar, int i) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f8777p0;
            if (iArr[1] == 3) {
                int i8 = dVar.f8780s;
                if (i8 != 0) {
                    if (i8 == 2) {
                        int i9 = (int) (dVar.f8787z * i);
                        if (i9 != dVar.k()) {
                            dVar.f8759g = true;
                            V(iArr[0], dVar.q(), 1, i9, dVar);
                        }
                        return i9;
                    }
                    dVar2 = dVar;
                    if (i8 == 1) {
                        return dVar2.k();
                    }
                    if (i8 == 3) {
                        return (int) ((dVar2.q() * dVar2.W) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.k();
        }
        return 0;
    }

    public final int U(d dVar, int i) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f8777p0;
            if (iArr[0] == 3) {
                int i8 = dVar.f8779r;
                if (i8 != 0) {
                    if (i8 == 2) {
                        int i9 = (int) (dVar.f8784w * i);
                        if (i9 != dVar.q()) {
                            dVar.f8759g = true;
                            V(1, i9, iArr[1], dVar.k(), dVar);
                        }
                        return i9;
                    }
                    dVar2 = dVar;
                    if (i8 == 1) {
                        return dVar2.q();
                    }
                    if (i8 == 3) {
                        return (int) ((dVar2.k() * dVar2.W) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.q();
        }
        return 0;
    }

    public final void V(int i, int i8, int i9, int i10, d dVar) {
        b3.f fVar;
        d dVar2;
        z2.b bVar = this.B0;
        while (true) {
            fVar = this.C0;
            if (fVar != null || (dVar2 = this.T) == null) {
                break;
            } else {
                this.C0 = ((e) dVar2).f8792u0;
            }
        }
        bVar.f9118a = i;
        bVar.f9119b = i9;
        bVar.f9120c = i8;
        bVar.f9121d = i10;
        fVar.b(dVar, bVar);
        dVar.O(bVar.f9122e);
        dVar.L(bVar.f9123f);
        dVar.E = bVar.f9125h;
        dVar.I(bVar.f9124g);
    }

    @Override // y2.d
    public final void b(w2.c cVar, boolean z3) {
        d dVar;
        float f6;
        int i;
        ArrayList arrayList = this.W0;
        super.b(cVar, z3);
        d dVar2 = this.T;
        boolean z7 = dVar2 != null && ((e) dVar2).f8793v0;
        int i8 = this.T0;
        if (i8 != 0) {
            if (i8 == 1) {
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    ((f) arrayList.get(i9)).b(i9, z7, i9 == size + (-1));
                    i9++;
                }
            } else if (i8 != 2) {
                if (i8 == 3) {
                    int size2 = arrayList.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        ((f) arrayList.get(i10)).b(i10, z7, i10 == size2 + (-1));
                        i10++;
                    }
                }
            } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                for (int i11 = 0; i11 < this.f8816b1; i11++) {
                    this.f8815a1[i11].D();
                }
                int[] iArr = this.Z0;
                int i12 = iArr[0];
                int i13 = iArr[1];
                float f8 = this.J0;
                d dVar3 = null;
                int i14 = 0;
                while (i14 < i12) {
                    if (z7) {
                        i = (i12 - i14) - 1;
                        f6 = 1.0f - this.J0;
                    } else {
                        f6 = f8;
                        i = i14;
                    }
                    d dVar4 = this.Y0[i];
                    if (dVar4 != null) {
                        c cVar2 = dVar4.I;
                        if (dVar4.f8760g0 != 8) {
                            if (i14 == 0) {
                                dVar4.f(cVar2, this.I, this.f8821w0);
                                dVar4.f8763i0 = this.D0;
                                dVar4.f8754d0 = f6;
                            }
                            if (i14 == i12 - 1) {
                                dVar4.f(dVar4.K, this.K, this.f8822x0);
                            }
                            if (i14 > 0 && dVar3 != null) {
                                c cVar3 = dVar3.K;
                                dVar4.f(cVar2, cVar3, this.P0);
                                dVar3.f(cVar3, cVar2, 0);
                            }
                            dVar3 = dVar4;
                        }
                    }
                    i14++;
                    f8 = f6;
                }
                for (int i15 = 0; i15 < i13; i15++) {
                    d dVar5 = this.X0[i15];
                    if (dVar5 != null) {
                        c cVar4 = dVar5.J;
                        if (dVar5.f8760g0 != 8) {
                            if (i15 == 0) {
                                dVar5.f(cVar4, this.J, this.f8817s0);
                                dVar5.f8765j0 = this.E0;
                                dVar5.f8756e0 = this.K0;
                            }
                            if (i15 == i13 - 1) {
                                dVar5.f(dVar5.L, this.L, this.f8818t0);
                            }
                            if (i15 > 0 && dVar3 != null) {
                                c cVar5 = dVar3.L;
                                dVar5.f(cVar4, cVar5, this.Q0);
                                dVar3.f(cVar5, cVar4, 0);
                            }
                            dVar3 = dVar5;
                        }
                    }
                }
                for (int i16 = 0; i16 < i12; i16++) {
                    for (int i17 = 0; i17 < i13; i17++) {
                        int i18 = (i17 * i12) + i16;
                        if (this.V0 == 1) {
                            i18 = (i16 * i13) + i17;
                        }
                        d[] dVarArr = this.f8815a1;
                        if (i18 < dVarArr.length && (dVar = dVarArr[i18]) != null && dVar.f8760g0 != 8) {
                            d dVar6 = this.Y0[i16];
                            d dVar7 = this.X0[i17];
                            if (dVar != dVar6) {
                                dVar.f(dVar.I, dVar6.I, 0);
                                dVar.f(dVar.K, dVar6.K, 0);
                            }
                            if (dVar != dVar7) {
                                dVar.f(dVar.J, dVar7.J, 0);
                                dVar.f(dVar.L, dVar7.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z7, true);
        }
        this.f8823y0 = false;
    }
}
