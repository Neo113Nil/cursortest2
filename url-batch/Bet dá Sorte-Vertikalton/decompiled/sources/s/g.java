package s;

import java.util.ArrayList;
import q.C0271c;
import t.C0285b;
import v.C0311f;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public int f3700A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0285b f3701B0;
    public C0311f C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f3702D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f3703E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f3704F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f3705G0;
    public int H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f3706I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f3707J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f3708K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f3709L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f3710M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f3711N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f3712O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f3713P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f3714Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f3715R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f3716S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f3717T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f3718U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f3719V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f3720W0;

    /* renamed from: X0, reason: collision with root package name */
    public C0281d[] f3721X0;
    public C0281d[] Y0;
    public int[] Z0;

    /* renamed from: a1, reason: collision with root package name */
    public C0281d[] f3722a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f3723b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3724s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f3725t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3726u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f3727v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f3728w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f3729x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f3730y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f3731z0;

    @Override // s.i
    public final void S() {
        for (int i = 0; i < this.f3739r0; i++) {
            C0281d c0281d = this.f3738q0[i];
            if (c0281d != null) {
                c0281d.F = true;
            }
        }
    }

    public final int T(C0281d c0281d, int i) {
        if (c0281d == null) {
            return 0;
        }
        int[] iArr = c0281d.f3654p0;
        if (iArr[1] == 3) {
            int i2 = c0281d.f3657s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0281d.f3664z * i);
                if (i3 != c0281d.k()) {
                    c0281d.f3639g = true;
                    V(iArr[0], c0281d.q(), 1, i3, c0281d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0281d.k();
            }
            if (i2 == 3) {
                return (int) ((c0281d.q() * c0281d.f3624W) + 0.5f);
            }
        }
        return c0281d.k();
    }

    public final int U(C0281d c0281d, int i) {
        if (c0281d == null) {
            return 0;
        }
        int[] iArr = c0281d.f3654p0;
        if (iArr[0] == 3) {
            int i2 = c0281d.f3656r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0281d.f3661w * i);
                if (i3 != c0281d.q()) {
                    c0281d.f3639g = true;
                    V(1, i3, iArr[1], c0281d.k(), c0281d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0281d.q();
            }
            if (i2 == 3) {
                return (int) ((c0281d.k() * c0281d.f3624W) + 0.5f);
            }
        }
        return c0281d.q();
    }

    public final void V(int i, int i2, int i3, int i4, C0281d c0281d) {
        C0311f c0311f;
        C0281d c0281d2;
        while (true) {
            c0311f = this.C0;
            if (c0311f != null || (c0281d2 = this.f3621T) == null) {
                break;
            } else {
                this.C0 = ((C0282e) c0281d2).f3679u0;
            }
        }
        C0285b c0285b = this.f3701B0;
        c0285b.f3779a = i;
        c0285b.f3780b = i3;
        c0285b.f3781c = i2;
        c0285b.d = i4;
        c0311f.b(c0281d, c0285b);
        c0281d.O(c0285b.f3782e);
        c0281d.L(c0285b.f3783f);
        c0281d.f3607E = c0285b.h;
        c0281d.I(c0285b.f3784g);
    }

    @Override // s.C0281d
    public final void b(C0271c c0271c, boolean z2) {
        C0281d c0281d;
        float f2;
        int i;
        super.b(c0271c, z2);
        C0281d c0281d2 = this.f3621T;
        boolean z3 = c0281d2 != null && ((C0282e) c0281d2).f3680v0;
        int i2 = this.f3717T0;
        ArrayList arrayList = this.f3720W0;
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
            } else if (this.Z0 != null && this.Y0 != null && this.f3721X0 != null) {
                for (int i5 = 0; i5 < this.f3723b1; i5++) {
                    this.f3722a1[i5].D();
                }
                int[] iArr = this.Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f3 = this.f3707J0;
                C0281d c0281d3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z3) {
                        i = (i6 - i8) - 1;
                        f2 = 1.0f - this.f3707J0;
                    } else {
                        f2 = f3;
                        i = i8;
                    }
                    C0281d c0281d4 = this.Y0[i];
                    if (c0281d4 != null && c0281d4.f3640g0 != 8) {
                        C0280c c0280c = c0281d4.f3610I;
                        if (i8 == 0) {
                            c0281d4.f(c0280c, this.f3610I, this.f3728w0);
                            c0281d4.f3642i0 = this.f3702D0;
                            c0281d4.f3634d0 = f2;
                        }
                        if (i8 == i6 - 1) {
                            c0281d4.f(c0281d4.f3612K, this.f3612K, this.f3729x0);
                        }
                        if (i8 > 0 && c0281d3 != null) {
                            int i9 = this.f3713P0;
                            C0280c c0280c2 = c0281d3.f3612K;
                            c0281d4.f(c0280c, c0280c2, i9);
                            c0281d3.f(c0280c2, c0280c, 0);
                        }
                        c0281d3 = c0281d4;
                    }
                    i8++;
                    f3 = f2;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    C0281d c0281d5 = this.f3721X0[i10];
                    if (c0281d5 != null && c0281d5.f3640g0 != 8) {
                        C0280c c0280c3 = c0281d5.f3611J;
                        if (i10 == 0) {
                            c0281d5.f(c0280c3, this.f3611J, this.f3724s0);
                            c0281d5.j0 = this.f3703E0;
                            c0281d5.f3636e0 = this.f3708K0;
                        }
                        if (i10 == i7 - 1) {
                            c0281d5.f(c0281d5.f3613L, this.f3613L, this.f3725t0);
                        }
                        if (i10 > 0 && c0281d3 != null) {
                            int i11 = this.f3714Q0;
                            C0280c c0280c4 = c0281d3.f3613L;
                            c0281d5.f(c0280c3, c0280c4, i11);
                            c0281d3.f(c0280c4, c0280c3, 0);
                        }
                        c0281d3 = c0281d5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.f3719V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        C0281d[] c0281dArr = this.f3722a1;
                        if (i14 < c0281dArr.length && (c0281d = c0281dArr[i14]) != null && c0281d.f3640g0 != 8) {
                            C0281d c0281d6 = this.Y0[i12];
                            C0281d c0281d7 = this.f3721X0[i13];
                            if (c0281d != c0281d6) {
                                c0281d.f(c0281d.f3610I, c0281d6.f3610I, 0);
                                c0281d.f(c0281d.f3612K, c0281d6.f3612K, 0);
                            }
                            if (c0281d != c0281d7) {
                                c0281d.f(c0281d.f3611J, c0281d7.f3611J, 0);
                                c0281d.f(c0281d.f3613L, c0281d7.f3613L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z3, true);
        }
        this.f3730y0 = false;
    }
}
