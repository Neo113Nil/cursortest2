package s;

import java.util.ArrayList;
import q.C0285c;
import t.C0298b;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public int f3646A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0298b f3647B0;

    /* renamed from: C0, reason: collision with root package name */
    public v.f f3648C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f3649D0;
    public int E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f3650F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f3651G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f3652H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f3653I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f3654J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f3655K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f3656L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f3657M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f3658N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f3659O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f3660P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f3661Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f3662R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f3663S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f3664T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f3665U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f3666V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f3667W0;

    /* renamed from: X0, reason: collision with root package name */
    public d[] f3668X0;

    /* renamed from: Y0, reason: collision with root package name */
    public d[] f3669Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f3670Z0;
    public d[] a1;
    public int b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3671s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f3672t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3673u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f3674v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f3675w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f3676x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f3677y0;
    public int z0;

    @Override // s.i
    public final void S() {
        for (int i = 0; i < this.f3685r0; i++) {
            d dVar = this.f3684q0[i];
            if (dVar != null) {
                dVar.F = true;
            }
        }
    }

    public final int T(d dVar, int i) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f3600p0;
        if (iArr[1] == 3) {
            int i2 = dVar.f3603s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (dVar.f3610z * i);
                if (i3 != dVar.k()) {
                    dVar.f3585g = true;
                    V(iArr[0], dVar.q(), 1, i3, dVar);
                }
                return i3;
            }
            if (i2 == 1) {
                return dVar.k();
            }
            if (i2 == 3) {
                return (int) ((dVar.q() * dVar.f3570W) + 0.5f);
            }
        }
        return dVar.k();
    }

    public final int U(d dVar, int i) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f3600p0;
        if (iArr[0] == 3) {
            int i2 = dVar.f3602r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (dVar.f3607w * i);
                if (i3 != dVar.q()) {
                    dVar.f3585g = true;
                    V(1, i3, iArr[1], dVar.k(), dVar);
                }
                return i3;
            }
            if (i2 == 1) {
                return dVar.q();
            }
            if (i2 == 3) {
                return (int) ((dVar.k() * dVar.f3570W) + 0.5f);
            }
        }
        return dVar.q();
    }

    public final void V(int i, int i2, int i3, int i4, d dVar) {
        v.f fVar;
        d dVar2;
        while (true) {
            fVar = this.f3648C0;
            if (fVar != null || (dVar2 = this.f3567T) == null) {
                break;
            } else {
                this.f3648C0 = ((e) dVar2).f3626u0;
            }
        }
        C0298b c0298b = this.f3647B0;
        c0298b.f3759a = i;
        c0298b.f3760b = i3;
        c0298b.f3761c = i2;
        c0298b.d = i4;
        fVar.b(dVar, c0298b);
        dVar.O(c0298b.f3762e);
        dVar.L(c0298b.f3763f);
        dVar.f3553E = c0298b.h;
        dVar.I(c0298b.f3764g);
    }

    @Override // s.d
    public final void b(C0285c c0285c, boolean z2) {
        d dVar;
        float f2;
        int i;
        super.b(c0285c, z2);
        d dVar2 = this.f3567T;
        boolean z3 = dVar2 != null && ((e) dVar2).f3627v0;
        int i2 = this.f3664T0;
        ArrayList arrayList = this.f3667W0;
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
            } else if (this.f3670Z0 != null && this.f3669Y0 != null && this.f3668X0 != null) {
                for (int i5 = 0; i5 < this.b1; i5++) {
                    this.a1[i5].D();
                }
                int[] iArr = this.f3670Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f3 = this.f3654J0;
                d dVar3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z3) {
                        i = (i6 - i8) - 1;
                        f2 = 1.0f - this.f3654J0;
                    } else {
                        f2 = f3;
                        i = i8;
                    }
                    d dVar4 = this.f3669Y0[i];
                    if (dVar4 != null && dVar4.f3586g0 != 8) {
                        c cVar = dVar4.f3556I;
                        if (i8 == 0) {
                            dVar4.f(cVar, this.f3556I, this.f3675w0);
                            dVar4.f3588i0 = this.f3649D0;
                            dVar4.f3580d0 = f2;
                        }
                        if (i8 == i6 - 1) {
                            dVar4.f(dVar4.f3558K, this.f3558K, this.f3676x0);
                        }
                        if (i8 > 0 && dVar3 != null) {
                            int i9 = this.f3660P0;
                            c cVar2 = dVar3.f3558K;
                            dVar4.f(cVar, cVar2, i9);
                            dVar3.f(cVar2, cVar, 0);
                        }
                        dVar3 = dVar4;
                    }
                    i8++;
                    f3 = f2;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    d dVar5 = this.f3668X0[i10];
                    if (dVar5 != null && dVar5.f3586g0 != 8) {
                        c cVar3 = dVar5.f3557J;
                        if (i10 == 0) {
                            dVar5.f(cVar3, this.f3557J, this.f3671s0);
                            dVar5.f3590j0 = this.E0;
                            dVar5.f3582e0 = this.f3655K0;
                        }
                        if (i10 == i7 - 1) {
                            dVar5.f(dVar5.f3559L, this.f3559L, this.f3672t0);
                        }
                        if (i10 > 0 && dVar3 != null) {
                            int i11 = this.f3661Q0;
                            c cVar4 = dVar3.f3559L;
                            dVar5.f(cVar3, cVar4, i11);
                            dVar3.f(cVar4, cVar3, 0);
                        }
                        dVar3 = dVar5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.f3666V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        d[] dVarArr = this.a1;
                        if (i14 < dVarArr.length && (dVar = dVarArr[i14]) != null && dVar.f3586g0 != 8) {
                            d dVar6 = this.f3669Y0[i12];
                            d dVar7 = this.f3668X0[i13];
                            if (dVar != dVar6) {
                                dVar.f(dVar.f3556I, dVar6.f3556I, 0);
                                dVar.f(dVar.f3558K, dVar6.f3558K, 0);
                            }
                            if (dVar != dVar7) {
                                dVar.f(dVar.f3557J, dVar7.f3557J, 0);
                                dVar.f(dVar.f3559L, dVar7.f3559L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z3, true);
        }
        this.f3677y0 = false;
    }
}
