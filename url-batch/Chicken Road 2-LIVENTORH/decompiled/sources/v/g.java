package v;

import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g extends i {
    public int A0;
    public w.b B0;
    public y.f C0;
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
    public d[] f3455a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f3456b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3457s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f3458t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3459u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f3460v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f3461w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f3462x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f3463y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f3464z0;

    @Override // v.i
    public final void S() {
        for (int i = 0; i < this.f3472r0; i++) {
            d dVar = this.f3471q0[i];
            if (dVar != null) {
                dVar.F = true;
            }
        }
    }

    public final int T(d dVar, int i) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f3418p0;
            if (iArr[1] == 3) {
                int i4 = dVar.f3421s;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int i5 = (int) (dVar.f3428z * i);
                        if (i5 != dVar.k()) {
                            dVar.f3401g = true;
                            V(iArr[0], dVar.q(), 1, i5, dVar);
                        }
                        return i5;
                    }
                    dVar2 = dVar;
                    if (i4 == 1) {
                        return dVar2.k();
                    }
                    if (i4 == 3) {
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
            int[] iArr = dVar.f3418p0;
            if (iArr[0] == 3) {
                int i4 = dVar.f3420r;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int i5 = (int) (dVar.f3425w * i);
                        if (i5 != dVar.q()) {
                            dVar.f3401g = true;
                            V(1, i5, iArr[1], dVar.k(), dVar);
                        }
                        return i5;
                    }
                    dVar2 = dVar;
                    if (i4 == 1) {
                        return dVar2.q();
                    }
                    if (i4 == 3) {
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

    public final void V(int i, int i4, int i5, int i6, d dVar) {
        y.f fVar;
        d dVar2;
        w.b bVar = this.B0;
        while (true) {
            fVar = this.C0;
            if (fVar != null || (dVar2 = this.T) == null) {
                break;
            } else {
                this.C0 = ((e) dVar2).f3433u0;
            }
        }
        bVar.f3510a = i;
        bVar.f3511b = i5;
        bVar.f3512c = i4;
        bVar.d = i6;
        fVar.b(dVar, bVar);
        dVar.O(bVar.f3513e);
        dVar.L(bVar.f3514f);
        dVar.E = bVar.f3516h;
        dVar.I(bVar.f3515g);
    }

    @Override // v.d
    public final void b(t.c cVar, boolean z3) {
        d dVar;
        float f2;
        int i;
        ArrayList arrayList = this.W0;
        super.b(cVar, z3);
        d dVar2 = this.T;
        boolean z4 = dVar2 != null && ((e) dVar2).f3434v0;
        int i4 = this.T0;
        if (i4 != 0) {
            if (i4 == 1) {
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    ((f) arrayList.get(i5)).b(i5, z4, i5 == size + (-1));
                    i5++;
                }
            } else if (i4 != 2) {
                if (i4 == 3) {
                    int size2 = arrayList.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        ((f) arrayList.get(i6)).b(i6, z4, i6 == size2 + (-1));
                        i6++;
                    }
                }
            } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                for (int i7 = 0; i7 < this.f3456b1; i7++) {
                    this.f3455a1[i7].D();
                }
                int[] iArr = this.Z0;
                int i8 = iArr[0];
                int i9 = iArr[1];
                float f4 = this.J0;
                d dVar3 = null;
                int i10 = 0;
                while (i10 < i8) {
                    if (z4) {
                        i = (i8 - i10) - 1;
                        f2 = 1.0f - this.J0;
                    } else {
                        f2 = f4;
                        i = i10;
                    }
                    d dVar4 = this.Y0[i];
                    if (dVar4 != null) {
                        c cVar2 = dVar4.I;
                        if (dVar4.f3402g0 != 8) {
                            if (i10 == 0) {
                                dVar4.f(cVar2, this.I, this.f3461w0);
                                dVar4.i0 = this.D0;
                                dVar4.d0 = f2;
                            }
                            if (i10 == i8 - 1) {
                                dVar4.f(dVar4.K, this.K, this.f3462x0);
                            }
                            if (i10 > 0 && dVar3 != null) {
                                c cVar3 = dVar3.K;
                                dVar4.f(cVar2, cVar3, this.P0);
                                dVar3.f(cVar3, cVar2, 0);
                            }
                            dVar3 = dVar4;
                        }
                    }
                    i10++;
                    f4 = f2;
                }
                for (int i11 = 0; i11 < i9; i11++) {
                    d dVar5 = this.X0[i11];
                    if (dVar5 != null) {
                        c cVar4 = dVar5.J;
                        if (dVar5.f3402g0 != 8) {
                            if (i11 == 0) {
                                dVar5.f(cVar4, this.J, this.f3457s0);
                                dVar5.f3406j0 = this.E0;
                                dVar5.f3398e0 = this.K0;
                            }
                            if (i11 == i9 - 1) {
                                dVar5.f(dVar5.L, this.L, this.f3458t0);
                            }
                            if (i11 > 0 && dVar3 != null) {
                                c cVar5 = dVar3.L;
                                dVar5.f(cVar4, cVar5, this.Q0);
                                dVar3.f(cVar5, cVar4, 0);
                            }
                            dVar3 = dVar5;
                        }
                    }
                }
                for (int i12 = 0; i12 < i8; i12++) {
                    for (int i13 = 0; i13 < i9; i13++) {
                        int i14 = (i13 * i8) + i12;
                        if (this.V0 == 1) {
                            i14 = (i12 * i9) + i13;
                        }
                        d[] dVarArr = this.f3455a1;
                        if (i14 < dVarArr.length && (dVar = dVarArr[i14]) != null && dVar.f3402g0 != 8) {
                            d dVar6 = this.Y0[i12];
                            d dVar7 = this.X0[i13];
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
            ((f) arrayList.get(0)).b(0, z4, true);
        }
        this.f3463y0 = false;
    }
}
