package t;

import java.util.ArrayList;
import r.C0288c;
import u.C0301b;

/* loaded from: classes.dex */
public final class g extends i {
    public int A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0301b f3850B0;

    /* renamed from: C0, reason: collision with root package name */
    public w.f f3851C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f3852D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f3853E0;
    public int F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f3854G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f3855H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f3856I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f3857J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f3858K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f3859L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f3860M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f3861N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f3862O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f3863P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f3864Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f3865R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f3866S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f3867T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f3868U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f3869V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f3870W0;

    /* renamed from: X0, reason: collision with root package name */
    public d[] f3871X0;

    /* renamed from: Y0, reason: collision with root package name */
    public d[] f3872Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f3873Z0;

    /* renamed from: a1, reason: collision with root package name */
    public d[] f3874a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f3875b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3876s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f3877t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3878u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f3879v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f3880w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f3881x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f3882y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f3883z0;

    @Override // t.i
    public final void S() {
        for (int i = 0; i < this.f3891r0; i++) {
            d dVar = this.f3890q0[i];
            if (dVar != null) {
                dVar.f3756F = true;
            }
        }
    }

    public final int T(d dVar, int i) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.p0;
        if (iArr[1] == 3) {
            int i2 = dVar.f3806s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (dVar.f3813z * i);
                if (i3 != dVar.k()) {
                    dVar.f3787g = true;
                    V(iArr[0], dVar.q(), 1, i3, dVar);
                }
                return i3;
            }
            if (i2 == 1) {
                return dVar.k();
            }
            if (i2 == 3) {
                return (int) ((dVar.q() * dVar.f3772W) + 0.5f);
            }
        }
        return dVar.k();
    }

    public final int U(d dVar, int i) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.p0;
        if (iArr[0] == 3) {
            int i2 = dVar.f3805r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (dVar.f3810w * i);
                if (i3 != dVar.q()) {
                    dVar.f3787g = true;
                    V(1, i3, iArr[1], dVar.k(), dVar);
                }
                return i3;
            }
            if (i2 == 1) {
                return dVar.q();
            }
            if (i2 == 3) {
                return (int) ((dVar.k() * dVar.f3772W) + 0.5f);
            }
        }
        return dVar.q();
    }

    public final void V(int i, int i2, int i3, int i4, d dVar) {
        w.f fVar;
        d dVar2;
        while (true) {
            fVar = this.f3851C0;
            if (fVar != null || (dVar2 = this.f3769T) == null) {
                break;
            } else {
                this.f3851C0 = ((e) dVar2).f3828u0;
            }
        }
        C0301b c0301b = this.f3850B0;
        c0301b.f3904a = i;
        c0301b.f3905b = i3;
        c0301b.f3906c = i2;
        c0301b.d = i4;
        fVar.b(dVar, c0301b);
        dVar.O(c0301b.f3907e);
        dVar.L(c0301b.f3908f);
        dVar.f3755E = c0301b.f3910h;
        dVar.I(c0301b.f3909g);
    }

    @Override // t.d
    public final void b(C0288c c0288c, boolean z2) {
        d dVar;
        float f2;
        int i;
        super.b(c0288c, z2);
        d dVar2 = this.f3769T;
        boolean z3 = dVar2 != null && ((e) dVar2).f3829v0;
        int i2 = this.f3867T0;
        ArrayList arrayList = this.f3870W0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((f) arrayList.get(i3)).b(i3, z3, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((f) arrayList.get(i4)).b(i4, z3, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.f3873Z0 != null && this.f3872Y0 != null && this.f3871X0 != null) {
                for (int i5 = 0; i5 < this.f3875b1; i5++) {
                    this.f3874a1[i5].D();
                }
                int[] iArr = this.f3873Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f3 = this.f3857J0;
                d dVar3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z3) {
                        i = (i6 - i8) - 1;
                        f2 = 1.0f - this.f3857J0;
                    } else {
                        f2 = f3;
                        i = i8;
                    }
                    d dVar4 = this.f3872Y0[i];
                    if (dVar4 != null && dVar4.f3788g0 != 8) {
                        c cVar = dVar4.f3758I;
                        if (i8 == 0) {
                            dVar4.f(cVar, this.f3758I, this.f3880w0);
                            dVar4.f3791i0 = this.f3852D0;
                            dVar4.f3782d0 = f2;
                        }
                        if (i8 == i6 - 1) {
                            dVar4.f(dVar4.f3760K, this.f3760K, this.f3881x0);
                        }
                        if (i8 > 0 && dVar3 != null) {
                            int i9 = this.f3863P0;
                            c cVar2 = dVar3.f3760K;
                            dVar4.f(cVar, cVar2, i9);
                            dVar3.f(cVar2, cVar, 0);
                        }
                        dVar3 = dVar4;
                    }
                    i8++;
                    f3 = f2;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    d dVar5 = this.f3871X0[i10];
                    if (dVar5 != null && dVar5.f3788g0 != 8) {
                        c cVar3 = dVar5.f3759J;
                        if (i10 == 0) {
                            dVar5.f(cVar3, this.f3759J, this.f3876s0);
                            dVar5.f3793j0 = this.f3853E0;
                            dVar5.f3784e0 = this.f3858K0;
                        }
                        if (i10 == i7 - 1) {
                            dVar5.f(dVar5.f3761L, this.f3761L, this.f3877t0);
                        }
                        if (i10 > 0 && dVar3 != null) {
                            int i11 = this.f3864Q0;
                            c cVar4 = dVar3.f3761L;
                            dVar5.f(cVar3, cVar4, i11);
                            dVar3.f(cVar4, cVar3, 0);
                        }
                        dVar3 = dVar5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.f3869V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        d[] dVarArr = this.f3874a1;
                        if (i14 < dVarArr.length && (dVar = dVarArr[i14]) != null && dVar.f3788g0 != 8) {
                            d dVar6 = this.f3872Y0[i12];
                            d dVar7 = this.f3871X0[i13];
                            if (dVar != dVar6) {
                                dVar.f(dVar.f3758I, dVar6.f3758I, 0);
                                dVar.f(dVar.f3760K, dVar6.f3760K, 0);
                            }
                            if (dVar != dVar7) {
                                dVar.f(dVar.f3759J, dVar7.f3759J, 0);
                                dVar.f(dVar.f3761L, dVar7.f3761L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z3, true);
        }
        this.f3882y0 = false;
    }
}
