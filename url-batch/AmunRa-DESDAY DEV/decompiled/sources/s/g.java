package s;

import java.util.ArrayList;
import q.C0283c;
import t.C0299b;
import v.C0321f;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public int f3760A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0299b f3761B0;

    /* renamed from: C0, reason: collision with root package name */
    public C0321f f3762C0;
    public int D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f3763E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f3764F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f3765G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f3766H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f3767I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f3768J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f3769K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f3770L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f3771M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f3772N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f3773O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f3774P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f3775Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f3776R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f3777S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f3778T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f3779U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f3780V0;
    public ArrayList W0;
    public C0295d[] X0;

    /* renamed from: Y0, reason: collision with root package name */
    public C0295d[] f3781Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f3782Z0;

    /* renamed from: a1, reason: collision with root package name */
    public C0295d[] f3783a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f3784b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3785s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f3786t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3787u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f3788v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f3789w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f3790x0;
    public boolean y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f3791z0;

    @Override // s.i
    public final void S() {
        for (int i = 0; i < this.f3799r0; i++) {
            C0295d c0295d = this.f3798q0[i];
            if (c0295d != null) {
                c0295d.F = true;
            }
        }
    }

    public final int T(C0295d c0295d, int i) {
        if (c0295d == null) {
            return 0;
        }
        int[] iArr = c0295d.f3714p0;
        if (iArr[1] == 3) {
            int i2 = c0295d.f3717s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0295d.f3724z * i);
                if (i3 != c0295d.k()) {
                    c0295d.f3699g = true;
                    V(iArr[0], c0295d.q(), 1, i3, c0295d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0295d.k();
            }
            if (i2 == 3) {
                return (int) ((c0295d.q() * c0295d.f3684W) + 0.5f);
            }
        }
        return c0295d.k();
    }

    public final int U(C0295d c0295d, int i) {
        if (c0295d == null) {
            return 0;
        }
        int[] iArr = c0295d.f3714p0;
        if (iArr[0] == 3) {
            int i2 = c0295d.f3716r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0295d.f3721w * i);
                if (i3 != c0295d.q()) {
                    c0295d.f3699g = true;
                    V(1, i3, iArr[1], c0295d.k(), c0295d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0295d.q();
            }
            if (i2 == 3) {
                return (int) ((c0295d.k() * c0295d.f3684W) + 0.5f);
            }
        }
        return c0295d.q();
    }

    public final void V(int i, int i2, int i3, int i4, C0295d c0295d) {
        C0321f c0321f;
        C0295d c0295d2;
        while (true) {
            c0321f = this.f3762C0;
            if (c0321f != null || (c0295d2 = this.f3681T) == null) {
                break;
            } else {
                this.f3762C0 = ((C0296e) c0295d2).f3740u0;
            }
        }
        C0299b c0299b = this.f3761B0;
        c0299b.f3827a = i;
        c0299b.f3828b = i3;
        c0299b.f3829c = i2;
        c0299b.d = i4;
        c0321f.b(c0295d, c0299b);
        c0295d.O(c0299b.f3830e);
        c0295d.L(c0299b.f3831f);
        c0295d.f3667E = c0299b.h;
        c0295d.I(c0299b.f3832g);
    }

    @Override // s.C0295d
    public final void b(C0283c c0283c, boolean z2) {
        C0295d c0295d;
        float f2;
        int i;
        super.b(c0283c, z2);
        C0295d c0295d2 = this.f3681T;
        boolean z3 = c0295d2 != null && ((C0296e) c0295d2).f3741v0;
        int i2 = this.f3778T0;
        ArrayList arrayList = this.W0;
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
            } else if (this.f3782Z0 != null && this.f3781Y0 != null && this.X0 != null) {
                for (int i5 = 0; i5 < this.f3784b1; i5++) {
                    this.f3783a1[i5].D();
                }
                int[] iArr = this.f3782Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f3 = this.f3768J0;
                C0295d c0295d3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z3) {
                        i = (i6 - i8) - 1;
                        f2 = 1.0f - this.f3768J0;
                    } else {
                        f2 = f3;
                        i = i8;
                    }
                    C0295d c0295d4 = this.f3781Y0[i];
                    if (c0295d4 != null && c0295d4.f3700g0 != 8) {
                        C0294c c0294c = c0295d4.f3670I;
                        if (i8 == 0) {
                            c0295d4.f(c0294c, this.f3670I, this.f3789w0);
                            c0295d4.f3702i0 = this.D0;
                            c0295d4.f3694d0 = f2;
                        }
                        if (i8 == i6 - 1) {
                            c0295d4.f(c0295d4.f3672K, this.f3672K, this.f3790x0);
                        }
                        if (i8 > 0 && c0295d3 != null) {
                            int i9 = this.f3774P0;
                            C0294c c0294c2 = c0295d3.f3672K;
                            c0295d4.f(c0294c, c0294c2, i9);
                            c0295d3.f(c0294c2, c0294c, 0);
                        }
                        c0295d3 = c0295d4;
                    }
                    i8++;
                    f3 = f2;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    C0295d c0295d5 = this.X0[i10];
                    if (c0295d5 != null && c0295d5.f3700g0 != 8) {
                        C0294c c0294c3 = c0295d5.f3671J;
                        if (i10 == 0) {
                            c0295d5.f(c0294c3, this.f3671J, this.f3785s0);
                            c0295d5.j0 = this.f3763E0;
                            c0295d5.f3696e0 = this.f3769K0;
                        }
                        if (i10 == i7 - 1) {
                            c0295d5.f(c0295d5.f3673L, this.f3673L, this.f3786t0);
                        }
                        if (i10 > 0 && c0295d3 != null) {
                            int i11 = this.f3775Q0;
                            C0294c c0294c4 = c0295d3.f3673L;
                            c0295d5.f(c0294c3, c0294c4, i11);
                            c0295d3.f(c0294c4, c0294c3, 0);
                        }
                        c0295d3 = c0295d5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.f3780V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        C0295d[] c0295dArr = this.f3783a1;
                        if (i14 < c0295dArr.length && (c0295d = c0295dArr[i14]) != null && c0295d.f3700g0 != 8) {
                            C0295d c0295d6 = this.f3781Y0[i12];
                            C0295d c0295d7 = this.X0[i13];
                            if (c0295d != c0295d6) {
                                c0295d.f(c0295d.f3670I, c0295d6.f3670I, 0);
                                c0295d.f(c0295d.f3672K, c0295d6.f3672K, 0);
                            }
                            if (c0295d != c0295d7) {
                                c0295d.f(c0295d.f3671J, c0295d7.f3671J, 0);
                                c0295d.f(c0295d.f3673L, c0295d7.f3673L, 0);
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
