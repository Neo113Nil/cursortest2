package s;

import java.util.ArrayList;
import q.C0317c;
import t.C0331b;
import v.C0352f;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public int f4108A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0331b f4109B0;
    public C0352f C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f4110D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f4111E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f4112F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f4113G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f4114H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f4115I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f4116J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f4117K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f4118L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f4119M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f4120N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f4121O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f4122P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f4123Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f4124R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f4125S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f4126T0;
    public int U0;
    public int V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f4127W0;

    /* renamed from: X0, reason: collision with root package name */
    public C0327d[] f4128X0;

    /* renamed from: Y0, reason: collision with root package name */
    public C0327d[] f4129Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f4130Z0;

    /* renamed from: a1, reason: collision with root package name */
    public C0327d[] f4131a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f4132b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f4133s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f4134t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f4135u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f4136v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f4137w0;
    public int x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f4138y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f4139z0;

    @Override // s.i
    public final void S() {
        for (int i = 0; i < this.f4147r0; i++) {
            C0327d c0327d = this.f4146q0[i];
            if (c0327d != null) {
                c0327d.F = true;
            }
        }
    }

    public final int T(C0327d c0327d, int i) {
        if (c0327d == null) {
            return 0;
        }
        int[] iArr = c0327d.f4061p0;
        if (iArr[1] == 3) {
            int i2 = c0327d.f4064s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0327d.f4071z * i);
                if (i3 != c0327d.k()) {
                    c0327d.f4046g = true;
                    V(iArr[0], c0327d.q(), 1, i3, c0327d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0327d.k();
            }
            if (i2 == 3) {
                return (int) ((c0327d.q() * c0327d.f4030W) + 0.5f);
            }
        }
        return c0327d.k();
    }

    public final int U(C0327d c0327d, int i) {
        if (c0327d == null) {
            return 0;
        }
        int[] iArr = c0327d.f4061p0;
        if (iArr[0] == 3) {
            int i2 = c0327d.f4063r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0327d.f4068w * i);
                if (i3 != c0327d.q()) {
                    c0327d.f4046g = true;
                    V(1, i3, iArr[1], c0327d.k(), c0327d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0327d.q();
            }
            if (i2 == 3) {
                return (int) ((c0327d.k() * c0327d.f4030W) + 0.5f);
            }
        }
        return c0327d.q();
    }

    public final void V(int i, int i2, int i3, int i4, C0327d c0327d) {
        C0352f c0352f;
        C0327d c0327d2;
        while (true) {
            c0352f = this.C0;
            if (c0352f != null || (c0327d2 = this.f4027T) == null) {
                break;
            } else {
                this.C0 = ((C0328e) c0327d2).f4087u0;
            }
        }
        C0331b c0331b = this.f4109B0;
        c0331b.f4155a = i;
        c0331b.f4156b = i3;
        c0331b.f4157c = i2;
        c0331b.f4158d = i4;
        c0352f.b(c0327d, c0331b);
        c0327d.O(c0331b.f4159e);
        c0327d.L(c0331b.f4160f);
        c0327d.f4013E = c0331b.h;
        c0327d.I(c0331b.f4161g);
    }

    @Override // s.C0327d
    public final void b(C0317c c0317c, boolean z2) {
        C0327d c0327d;
        float f2;
        int i;
        super.b(c0317c, z2);
        C0327d c0327d2 = this.f4027T;
        boolean z3 = c0327d2 != null && ((C0328e) c0327d2).f4088v0;
        int i2 = this.f4126T0;
        ArrayList arrayList = this.f4127W0;
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
            } else if (this.f4130Z0 != null && this.f4129Y0 != null && this.f4128X0 != null) {
                for (int i5 = 0; i5 < this.f4132b1; i5++) {
                    this.f4131a1[i5].D();
                }
                int[] iArr = this.f4130Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f3 = this.f4116J0;
                C0327d c0327d3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z3) {
                        i = (i6 - i8) - 1;
                        f2 = 1.0f - this.f4116J0;
                    } else {
                        f2 = f3;
                        i = i8;
                    }
                    C0327d c0327d4 = this.f4129Y0[i];
                    if (c0327d4 != null && c0327d4.f4047g0 != 8) {
                        C0326c c0326c = c0327d4.f4016I;
                        if (i8 == 0) {
                            c0327d4.f(c0326c, this.f4016I, this.f4137w0);
                            c0327d4.i0 = this.f4110D0;
                            c0327d4.f4041d0 = f2;
                        }
                        if (i8 == i6 - 1) {
                            c0327d4.f(c0327d4.f4018K, this.f4018K, this.x0);
                        }
                        if (i8 > 0 && c0327d3 != null) {
                            int i9 = this.f4122P0;
                            C0326c c0326c2 = c0327d3.f4018K;
                            c0327d4.f(c0326c, c0326c2, i9);
                            c0327d3.f(c0326c2, c0326c, 0);
                        }
                        c0327d3 = c0327d4;
                    }
                    i8++;
                    f3 = f2;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    C0327d c0327d5 = this.f4128X0[i10];
                    if (c0327d5 != null && c0327d5.f4047g0 != 8) {
                        C0326c c0326c3 = c0327d5.f4017J;
                        if (i10 == 0) {
                            c0327d5.f(c0326c3, this.f4017J, this.f4133s0);
                            c0327d5.f4050j0 = this.f4111E0;
                            c0327d5.f4043e0 = this.f4117K0;
                        }
                        if (i10 == i7 - 1) {
                            c0327d5.f(c0327d5.f4019L, this.f4019L, this.f4134t0);
                        }
                        if (i10 > 0 && c0327d3 != null) {
                            int i11 = this.f4123Q0;
                            C0326c c0326c4 = c0327d3.f4019L;
                            c0327d5.f(c0326c3, c0326c4, i11);
                            c0327d3.f(c0326c4, c0326c3, 0);
                        }
                        c0327d3 = c0327d5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        C0327d[] c0327dArr = this.f4131a1;
                        if (i14 < c0327dArr.length && (c0327d = c0327dArr[i14]) != null && c0327d.f4047g0 != 8) {
                            C0327d c0327d6 = this.f4129Y0[i12];
                            C0327d c0327d7 = this.f4128X0[i13];
                            if (c0327d != c0327d6) {
                                c0327d.f(c0327d.f4016I, c0327d6.f4016I, 0);
                                c0327d.f(c0327d.f4018K, c0327d6.f4018K, 0);
                            }
                            if (c0327d != c0327d7) {
                                c0327d.f(c0327d.f4017J, c0327d7.f4017J, 0);
                                c0327d.f(c0327d.f4019L, c0327d7.f4019L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z3, true);
        }
        this.f4138y0 = false;
    }
}
