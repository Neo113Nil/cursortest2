package s;

import java.util.ArrayList;
import q.C0315c;
import t.C0329b;
import v.C0350f;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public int f4104A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0329b f4105B0;
    public C0350f C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f4106D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f4107E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f4108F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f4109G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f4110H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f4111I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f4112J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f4113K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f4114L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f4115M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f4116N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f4117O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f4118P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f4119Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f4120R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f4121S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f4122T0;
    public int U0;
    public int V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f4123W0;

    /* renamed from: X0, reason: collision with root package name */
    public C0325d[] f4124X0;

    /* renamed from: Y0, reason: collision with root package name */
    public C0325d[] f4125Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f4126Z0;

    /* renamed from: a1, reason: collision with root package name */
    public C0325d[] f4127a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f4128b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f4129s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f4130t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f4131u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f4132v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f4133w0;
    public int x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f4134y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f4135z0;

    @Override // s.i
    public final void S() {
        for (int i = 0; i < this.f4143r0; i++) {
            C0325d c0325d = this.f4142q0[i];
            if (c0325d != null) {
                c0325d.F = true;
            }
        }
    }

    public final int T(C0325d c0325d, int i) {
        if (c0325d == null) {
            return 0;
        }
        int[] iArr = c0325d.f4057p0;
        if (iArr[1] == 3) {
            int i2 = c0325d.f4060s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0325d.f4067z * i);
                if (i3 != c0325d.k()) {
                    c0325d.f4042g = true;
                    V(iArr[0], c0325d.q(), 1, i3, c0325d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0325d.k();
            }
            if (i2 == 3) {
                return (int) ((c0325d.q() * c0325d.f4026W) + 0.5f);
            }
        }
        return c0325d.k();
    }

    public final int U(C0325d c0325d, int i) {
        if (c0325d == null) {
            return 0;
        }
        int[] iArr = c0325d.f4057p0;
        if (iArr[0] == 3) {
            int i2 = c0325d.f4059r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0325d.f4064w * i);
                if (i3 != c0325d.q()) {
                    c0325d.f4042g = true;
                    V(1, i3, iArr[1], c0325d.k(), c0325d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0325d.q();
            }
            if (i2 == 3) {
                return (int) ((c0325d.k() * c0325d.f4026W) + 0.5f);
            }
        }
        return c0325d.q();
    }

    public final void V(int i, int i2, int i3, int i4, C0325d c0325d) {
        C0350f c0350f;
        C0325d c0325d2;
        while (true) {
            c0350f = this.C0;
            if (c0350f != null || (c0325d2 = this.f4023T) == null) {
                break;
            } else {
                this.C0 = ((C0326e) c0325d2).f4083u0;
            }
        }
        C0329b c0329b = this.f4105B0;
        c0329b.f4151a = i;
        c0329b.f4152b = i3;
        c0329b.f4153c = i2;
        c0329b.f4154d = i4;
        c0350f.b(c0325d, c0329b);
        c0325d.O(c0329b.f4155e);
        c0325d.L(c0329b.f4156f);
        c0325d.f4009E = c0329b.h;
        c0325d.I(c0329b.f4157g);
    }

    @Override // s.C0325d
    public final void b(C0315c c0315c, boolean z2) {
        C0325d c0325d;
        float f2;
        int i;
        super.b(c0315c, z2);
        C0325d c0325d2 = this.f4023T;
        boolean z3 = c0325d2 != null && ((C0326e) c0325d2).f4084v0;
        int i2 = this.f4122T0;
        ArrayList arrayList = this.f4123W0;
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
            } else if (this.f4126Z0 != null && this.f4125Y0 != null && this.f4124X0 != null) {
                for (int i5 = 0; i5 < this.f4128b1; i5++) {
                    this.f4127a1[i5].D();
                }
                int[] iArr = this.f4126Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f3 = this.f4112J0;
                C0325d c0325d3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z3) {
                        i = (i6 - i8) - 1;
                        f2 = 1.0f - this.f4112J0;
                    } else {
                        f2 = f3;
                        i = i8;
                    }
                    C0325d c0325d4 = this.f4125Y0[i];
                    if (c0325d4 != null && c0325d4.f4043g0 != 8) {
                        C0324c c0324c = c0325d4.f4012I;
                        if (i8 == 0) {
                            c0325d4.f(c0324c, this.f4012I, this.f4133w0);
                            c0325d4.i0 = this.f4106D0;
                            c0325d4.f4037d0 = f2;
                        }
                        if (i8 == i6 - 1) {
                            c0325d4.f(c0325d4.f4014K, this.f4014K, this.x0);
                        }
                        if (i8 > 0 && c0325d3 != null) {
                            int i9 = this.f4118P0;
                            C0324c c0324c2 = c0325d3.f4014K;
                            c0325d4.f(c0324c, c0324c2, i9);
                            c0325d3.f(c0324c2, c0324c, 0);
                        }
                        c0325d3 = c0325d4;
                    }
                    i8++;
                    f3 = f2;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    C0325d c0325d5 = this.f4124X0[i10];
                    if (c0325d5 != null && c0325d5.f4043g0 != 8) {
                        C0324c c0324c3 = c0325d5.f4013J;
                        if (i10 == 0) {
                            c0325d5.f(c0324c3, this.f4013J, this.f4129s0);
                            c0325d5.f4046j0 = this.f4107E0;
                            c0325d5.f4039e0 = this.f4113K0;
                        }
                        if (i10 == i7 - 1) {
                            c0325d5.f(c0325d5.f4015L, this.f4015L, this.f4130t0);
                        }
                        if (i10 > 0 && c0325d3 != null) {
                            int i11 = this.f4119Q0;
                            C0324c c0324c4 = c0325d3.f4015L;
                            c0325d5.f(c0324c3, c0324c4, i11);
                            c0325d3.f(c0324c4, c0324c3, 0);
                        }
                        c0325d3 = c0325d5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        C0325d[] c0325dArr = this.f4127a1;
                        if (i14 < c0325dArr.length && (c0325d = c0325dArr[i14]) != null && c0325d.f4043g0 != 8) {
                            C0325d c0325d6 = this.f4125Y0[i12];
                            C0325d c0325d7 = this.f4124X0[i13];
                            if (c0325d != c0325d6) {
                                c0325d.f(c0325d.f4012I, c0325d6.f4012I, 0);
                                c0325d.f(c0325d.f4014K, c0325d6.f4014K, 0);
                            }
                            if (c0325d != c0325d7) {
                                c0325d.f(c0325d.f4013J, c0325d7.f4013J, 0);
                                c0325d.f(c0325d.f4015L, c0325d7.f4015L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z3, true);
        }
        this.f4134y0 = false;
    }
}
