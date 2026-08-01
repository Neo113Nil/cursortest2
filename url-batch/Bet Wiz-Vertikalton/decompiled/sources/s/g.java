package s;

import java.util.ArrayList;
import q.C0283c;
import t.C0297b;
import v.C0319f;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public int f3623A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0297b f3624B0;

    /* renamed from: C0, reason: collision with root package name */
    public C0319f f3625C0;
    public int D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f3626E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f3627F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f3628G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f3629H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f3630I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f3631J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f3632K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f3633L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f3634M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f3635N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f3636O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f3637P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f3638Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f3639R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f3640S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f3641T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f3642U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f3643V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f3644W0;

    /* renamed from: X0, reason: collision with root package name */
    public C0293d[] f3645X0;

    /* renamed from: Y0, reason: collision with root package name */
    public C0293d[] f3646Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f3647Z0;

    /* renamed from: a1, reason: collision with root package name */
    public C0293d[] f3648a1;
    public int b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3649s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f3650t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3651u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f3652v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f3653w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f3654x0;
    public boolean y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f3655z0;

    @Override // s.i
    public final void S() {
        for (int i = 0; i < this.f3663r0; i++) {
            C0293d c0293d = this.f3662q0[i];
            if (c0293d != null) {
                c0293d.F = true;
            }
        }
    }

    public final int T(C0293d c0293d, int i) {
        if (c0293d == null) {
            return 0;
        }
        int[] iArr = c0293d.f3577p0;
        if (iArr[1] == 3) {
            int i2 = c0293d.f3580s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0293d.f3587z * i);
                if (i3 != c0293d.k()) {
                    c0293d.f3561g = true;
                    V(iArr[0], c0293d.q(), 1, i3, c0293d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0293d.k();
            }
            if (i2 == 3) {
                return (int) ((c0293d.q() * c0293d.f3546W) + 0.5f);
            }
        }
        return c0293d.k();
    }

    public final int U(C0293d c0293d, int i) {
        if (c0293d == null) {
            return 0;
        }
        int[] iArr = c0293d.f3577p0;
        if (iArr[0] == 3) {
            int i2 = c0293d.f3579r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0293d.f3584w * i);
                if (i3 != c0293d.q()) {
                    c0293d.f3561g = true;
                    V(1, i3, iArr[1], c0293d.k(), c0293d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0293d.q();
            }
            if (i2 == 3) {
                return (int) ((c0293d.k() * c0293d.f3546W) + 0.5f);
            }
        }
        return c0293d.q();
    }

    public final void V(int i, int i2, int i3, int i4, C0293d c0293d) {
        C0319f c0319f;
        C0293d c0293d2;
        while (true) {
            c0319f = this.f3625C0;
            if (c0319f != null || (c0293d2 = this.f3543T) == null) {
                break;
            } else {
                this.f3625C0 = ((C0294e) c0293d2).f3603u0;
            }
        }
        C0297b c0297b = this.f3624B0;
        c0297b.f3682a = i;
        c0297b.f3683b = i3;
        c0297b.f3684c = i2;
        c0297b.d = i4;
        c0319f.b(c0293d, c0297b);
        c0293d.O(c0297b.f3685e);
        c0293d.L(c0297b.f3686f);
        c0293d.f3529E = c0297b.h;
        c0293d.I(c0297b.f3687g);
    }

    @Override // s.C0293d
    public final void b(C0283c c0283c, boolean z2) {
        C0293d c0293d;
        float f2;
        int i;
        super.b(c0283c, z2);
        C0293d c0293d2 = this.f3543T;
        boolean z3 = c0293d2 != null && ((C0294e) c0293d2).f3604v0;
        int i2 = this.f3641T0;
        ArrayList arrayList = this.f3644W0;
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
            } else if (this.f3647Z0 != null && this.f3646Y0 != null && this.f3645X0 != null) {
                for (int i5 = 0; i5 < this.b1; i5++) {
                    this.f3648a1[i5].D();
                }
                int[] iArr = this.f3647Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f3 = this.f3631J0;
                C0293d c0293d3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z3) {
                        i = (i6 - i8) - 1;
                        f2 = 1.0f - this.f3631J0;
                    } else {
                        f2 = f3;
                        i = i8;
                    }
                    C0293d c0293d4 = this.f3646Y0[i];
                    if (c0293d4 != null && c0293d4.f3562g0 != 8) {
                        C0292c c0292c = c0293d4.f3532I;
                        if (i8 == 0) {
                            c0293d4.f(c0292c, this.f3532I, this.f3653w0);
                            c0293d4.f3564i0 = this.D0;
                            c0293d4.f3556d0 = f2;
                        }
                        if (i8 == i6 - 1) {
                            c0293d4.f(c0293d4.f3534K, this.f3534K, this.f3654x0);
                        }
                        if (i8 > 0 && c0293d3 != null) {
                            int i9 = this.f3637P0;
                            C0292c c0292c2 = c0293d3.f3534K;
                            c0293d4.f(c0292c, c0292c2, i9);
                            c0293d3.f(c0292c2, c0292c, 0);
                        }
                        c0293d3 = c0293d4;
                    }
                    i8++;
                    f3 = f2;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    C0293d c0293d5 = this.f3645X0[i10];
                    if (c0293d5 != null && c0293d5.f3562g0 != 8) {
                        C0292c c0292c3 = c0293d5.f3533J;
                        if (i10 == 0) {
                            c0293d5.f(c0292c3, this.f3533J, this.f3649s0);
                            c0293d5.f3566j0 = this.f3626E0;
                            c0293d5.f3558e0 = this.f3632K0;
                        }
                        if (i10 == i7 - 1) {
                            c0293d5.f(c0293d5.f3535L, this.f3535L, this.f3650t0);
                        }
                        if (i10 > 0 && c0293d3 != null) {
                            int i11 = this.f3638Q0;
                            C0292c c0292c4 = c0293d3.f3535L;
                            c0293d5.f(c0292c3, c0292c4, i11);
                            c0293d3.f(c0292c4, c0292c3, 0);
                        }
                        c0293d3 = c0293d5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.f3643V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        C0293d[] c0293dArr = this.f3648a1;
                        if (i14 < c0293dArr.length && (c0293d = c0293dArr[i14]) != null && c0293d.f3562g0 != 8) {
                            C0293d c0293d6 = this.f3646Y0[i12];
                            C0293d c0293d7 = this.f3645X0[i13];
                            if (c0293d != c0293d6) {
                                c0293d.f(c0293d.f3532I, c0293d6.f3532I, 0);
                                c0293d.f(c0293d.f3534K, c0293d6.f3534K, 0);
                            }
                            if (c0293d != c0293d7) {
                                c0293d.f(c0293d.f3533J, c0293d7.f3533J, 0);
                                c0293d.f(c0293d.f3535L, c0293d7.f3535L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z3, true);
        }
        this.y0 = false;
    }
}
