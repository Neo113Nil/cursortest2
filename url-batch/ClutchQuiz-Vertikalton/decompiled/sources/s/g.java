package s;

import java.util.ArrayList;
import q.C0315c;
import t.C0344b;
import v.C0367f;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public int f3594A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0344b f3595B0;

    /* renamed from: C0, reason: collision with root package name */
    public C0367f f3596C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f3597D0;
    public int E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f3598F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f3599G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f3600H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f3601I0;
    public float J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f3602K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f3603L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f3604M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f3605N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f3606O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f3607P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f3608Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f3609R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f3610S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f3611T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f3612U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f3613V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f3614W0;

    /* renamed from: X0, reason: collision with root package name */
    public C0340d[] f3615X0;

    /* renamed from: Y0, reason: collision with root package name */
    public C0340d[] f3616Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f3617Z0;

    /* renamed from: a1, reason: collision with root package name */
    public C0340d[] f3618a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f3619b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3620s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f3621t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3622u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f3623v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f3624w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f3625x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f3626y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f3627z0;

    @Override // s.i
    public final void S() {
        for (int i = 0; i < this.f3633r0; i++) {
            C0340d c0340d = this.q0[i];
            if (c0340d != null) {
                c0340d.F = true;
            }
        }
    }

    public final int T(C0340d c0340d, int i) {
        if (c0340d == null) {
            return 0;
        }
        int[] iArr = c0340d.f3549p0;
        if (iArr[1] == 3) {
            int i2 = c0340d.f3552s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0340d.f3559z * i);
                if (i3 != c0340d.k()) {
                    c0340d.f3533g = true;
                    V(iArr[0], c0340d.q(), 1, i3, c0340d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0340d.k();
            }
            if (i2 == 3) {
                return (int) ((c0340d.q() * c0340d.f3518W) + 0.5f);
            }
        }
        return c0340d.k();
    }

    public final int U(C0340d c0340d, int i) {
        if (c0340d == null) {
            return 0;
        }
        int[] iArr = c0340d.f3549p0;
        if (iArr[0] == 3) {
            int i2 = c0340d.f3551r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0340d.f3556w * i);
                if (i3 != c0340d.q()) {
                    c0340d.f3533g = true;
                    V(1, i3, iArr[1], c0340d.k(), c0340d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0340d.q();
            }
            if (i2 == 3) {
                return (int) ((c0340d.k() * c0340d.f3518W) + 0.5f);
            }
        }
        return c0340d.q();
    }

    public final void V(int i, int i2, int i3, int i4, C0340d c0340d) {
        C0367f c0367f;
        C0340d c0340d2;
        while (true) {
            c0367f = this.f3596C0;
            if (c0367f != null || (c0340d2 = this.f3515T) == null) {
                break;
            } else {
                this.f3596C0 = ((C0341e) c0340d2).f3573u0;
            }
        }
        C0344b c0344b = this.f3595B0;
        c0344b.f3675a = i;
        c0344b.f3676b = i3;
        c0344b.f3677c = i2;
        c0344b.d = i4;
        c0367f.b(c0340d, c0344b);
        c0340d.O(c0344b.f3678e);
        c0340d.L(c0344b.f3679f);
        c0340d.f3501E = c0344b.h;
        c0340d.I(c0344b.f3680g);
    }

    @Override // s.C0340d
    public final void b(C0315c c0315c, boolean z2) {
        C0340d c0340d;
        float f2;
        int i;
        super.b(c0315c, z2);
        C0340d c0340d2 = this.f3515T;
        boolean z3 = c0340d2 != null && ((C0341e) c0340d2).f3574v0;
        int i2 = this.f3611T0;
        ArrayList arrayList = this.f3614W0;
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
            } else if (this.f3617Z0 != null && this.f3616Y0 != null && this.f3615X0 != null) {
                for (int i5 = 0; i5 < this.f3619b1; i5++) {
                    this.f3618a1[i5].D();
                }
                int[] iArr = this.f3617Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f3 = this.J0;
                C0340d c0340d3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z3) {
                        i = (i6 - i8) - 1;
                        f2 = 1.0f - this.J0;
                    } else {
                        f2 = f3;
                        i = i8;
                    }
                    C0340d c0340d4 = this.f3616Y0[i];
                    if (c0340d4 != null && c0340d4.f3534g0 != 8) {
                        C0339c c0339c = c0340d4.f3504I;
                        if (i8 == 0) {
                            c0340d4.f(c0339c, this.f3504I, this.f3624w0);
                            c0340d4.f3536i0 = this.f3597D0;
                            c0340d4.f3528d0 = f2;
                        }
                        if (i8 == i6 - 1) {
                            c0340d4.f(c0340d4.f3506K, this.f3506K, this.f3625x0);
                        }
                        if (i8 > 0 && c0340d3 != null) {
                            int i9 = this.f3607P0;
                            C0339c c0339c2 = c0340d3.f3506K;
                            c0340d4.f(c0339c, c0339c2, i9);
                            c0340d3.f(c0339c2, c0339c, 0);
                        }
                        c0340d3 = c0340d4;
                    }
                    i8++;
                    f3 = f2;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    C0340d c0340d5 = this.f3615X0[i10];
                    if (c0340d5 != null && c0340d5.f3534g0 != 8) {
                        C0339c c0339c3 = c0340d5.f3505J;
                        if (i10 == 0) {
                            c0340d5.f(c0339c3, this.f3505J, this.f3620s0);
                            c0340d5.f3538j0 = this.E0;
                            c0340d5.f3530e0 = this.f3602K0;
                        }
                        if (i10 == i7 - 1) {
                            c0340d5.f(c0340d5.f3507L, this.f3507L, this.f3621t0);
                        }
                        if (i10 > 0 && c0340d3 != null) {
                            int i11 = this.f3608Q0;
                            C0339c c0339c4 = c0340d3.f3507L;
                            c0340d5.f(c0339c3, c0339c4, i11);
                            c0340d3.f(c0339c4, c0339c3, 0);
                        }
                        c0340d3 = c0340d5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.f3613V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        C0340d[] c0340dArr = this.f3618a1;
                        if (i14 < c0340dArr.length && (c0340d = c0340dArr[i14]) != null && c0340d.f3534g0 != 8) {
                            C0340d c0340d6 = this.f3616Y0[i12];
                            C0340d c0340d7 = this.f3615X0[i13];
                            if (c0340d != c0340d6) {
                                c0340d.f(c0340d.f3504I, c0340d6.f3504I, 0);
                                c0340d.f(c0340d.f3506K, c0340d6.f3506K, 0);
                            }
                            if (c0340d != c0340d7) {
                                c0340d.f(c0340d.f3505J, c0340d7.f3505J, 0);
                                c0340d.f(c0340d.f3507L, c0340d7.f3507L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z3, true);
        }
        this.f3626y0 = false;
    }
}
