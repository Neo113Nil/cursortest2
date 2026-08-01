package u;

import java.util.ArrayList;
import s.C0378c;
import v.C0393b;
import x.C0415f;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public int f4327A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0393b f4328B0;

    /* renamed from: C0, reason: collision with root package name */
    public C0415f f4329C0;
    public int D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f4330E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f4331F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f4332G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f4333H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f4334I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f4335J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f4336K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f4337L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f4338M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f4339N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f4340O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f4341P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f4342Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f4343R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f4344S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f4345T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f4346U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f4347V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f4348W0;

    /* renamed from: X0, reason: collision with root package name */
    public C0387d[] f4349X0;

    /* renamed from: Y0, reason: collision with root package name */
    public C0387d[] f4350Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f4351Z0;

    /* renamed from: a1, reason: collision with root package name */
    public C0387d[] f4352a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f4353b1;
    public int s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f4354t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f4355u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f4356v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f4357w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f4358x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f4359y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f4360z0;

    @Override // u.i
    public final void S() {
        for (int i = 0; i < this.f4367r0; i++) {
            C0387d c0387d = this.f4366q0[i];
            if (c0387d != null) {
                c0387d.f4234F = true;
            }
        }
    }

    public final int T(C0387d c0387d, int i) {
        if (c0387d == null) {
            return 0;
        }
        int[] iArr = c0387d.f4281p0;
        if (iArr[1] == 3) {
            int i2 = c0387d.f4284s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0387d.f4291z * i);
                if (i3 != c0387d.k()) {
                    c0387d.f4265g = true;
                    V(iArr[0], c0387d.q(), 1, i3, c0387d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0387d.k();
            }
            if (i2 == 3) {
                return (int) ((c0387d.q() * c0387d.f4250W) + 0.5f);
            }
        }
        return c0387d.k();
    }

    public final int U(C0387d c0387d, int i) {
        if (c0387d == null) {
            return 0;
        }
        int[] iArr = c0387d.f4281p0;
        if (iArr[0] == 3) {
            int i2 = c0387d.f4283r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0387d.f4288w * i);
                if (i3 != c0387d.q()) {
                    c0387d.f4265g = true;
                    V(1, i3, iArr[1], c0387d.k(), c0387d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0387d.q();
            }
            if (i2 == 3) {
                return (int) ((c0387d.k() * c0387d.f4250W) + 0.5f);
            }
        }
        return c0387d.q();
    }

    public final void V(int i, int i2, int i3, int i4, C0387d c0387d) {
        C0415f c0415f;
        C0387d c0387d2;
        while (true) {
            c0415f = this.f4329C0;
            if (c0415f != null || (c0387d2 = this.f4247T) == null) {
                break;
            } else {
                this.f4329C0 = ((C0388e) c0387d2).f4306u0;
            }
        }
        C0393b c0393b = this.f4328B0;
        c0393b.f4399a = i;
        c0393b.f4400b = i3;
        c0393b.f4401c = i2;
        c0393b.f4402d = i4;
        c0415f.b(c0387d, c0393b);
        c0387d.O(c0393b.e);
        c0387d.L(c0393b.f4403f);
        c0387d.f4233E = c0393b.f4405h;
        c0387d.I(c0393b.f4404g);
    }

    @Override // u.C0387d
    public final void b(C0378c c0378c, boolean z2) {
        C0387d c0387d;
        float f2;
        int i;
        super.b(c0378c, z2);
        C0387d c0387d2 = this.f4247T;
        boolean z3 = c0387d2 != null && ((C0388e) c0387d2).f4307v0;
        int i2 = this.f4345T0;
        ArrayList arrayList = this.f4348W0;
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
            } else if (this.f4351Z0 != null && this.f4350Y0 != null && this.f4349X0 != null) {
                for (int i5 = 0; i5 < this.f4353b1; i5++) {
                    this.f4352a1[i5].D();
                }
                int[] iArr = this.f4351Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f3 = this.f4335J0;
                C0387d c0387d3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z3) {
                        i = (i6 - i8) - 1;
                        f2 = 1.0f - this.f4335J0;
                    } else {
                        f2 = f3;
                        i = i8;
                    }
                    C0387d c0387d4 = this.f4350Y0[i];
                    if (c0387d4 != null && c0387d4.f4266g0 != 8) {
                        C0386c c0386c = c0387d4.f4236I;
                        if (i8 == 0) {
                            c0387d4.f(c0386c, this.f4236I, this.f4357w0);
                            c0387d4.f4269i0 = this.D0;
                            c0387d4.f4261d0 = f2;
                        }
                        if (i8 == i6 - 1) {
                            c0387d4.f(c0387d4.f4238K, this.f4238K, this.f4358x0);
                        }
                        if (i8 > 0 && c0387d3 != null) {
                            int i9 = this.f4341P0;
                            C0386c c0386c2 = c0387d3.f4238K;
                            c0387d4.f(c0386c, c0386c2, i9);
                            c0387d3.f(c0386c2, c0386c, 0);
                        }
                        c0387d3 = c0387d4;
                    }
                    i8++;
                    f3 = f2;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    C0387d c0387d5 = this.f4349X0[i10];
                    if (c0387d5 != null && c0387d5.f4266g0 != 8) {
                        C0386c c0386c3 = c0387d5.f4237J;
                        if (i10 == 0) {
                            c0387d5.f(c0386c3, this.f4237J, this.s0);
                            c0387d5.f4270j0 = this.f4330E0;
                            c0387d5.f4262e0 = this.f4336K0;
                        }
                        if (i10 == i7 - 1) {
                            c0387d5.f(c0387d5.f4239L, this.f4239L, this.f4354t0);
                        }
                        if (i10 > 0 && c0387d3 != null) {
                            int i11 = this.f4342Q0;
                            C0386c c0386c4 = c0387d3.f4239L;
                            c0387d5.f(c0386c3, c0386c4, i11);
                            c0387d3.f(c0386c4, c0386c3, 0);
                        }
                        c0387d3 = c0387d5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.f4347V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        C0387d[] c0387dArr = this.f4352a1;
                        if (i14 < c0387dArr.length && (c0387d = c0387dArr[i14]) != null && c0387d.f4266g0 != 8) {
                            C0387d c0387d6 = this.f4350Y0[i12];
                            C0387d c0387d7 = this.f4349X0[i13];
                            if (c0387d != c0387d6) {
                                c0387d.f(c0387d.f4236I, c0387d6.f4236I, 0);
                                c0387d.f(c0387d.f4238K, c0387d6.f4238K, 0);
                            }
                            if (c0387d != c0387d7) {
                                c0387d.f(c0387d.f4237J, c0387d7.f4237J, 0);
                                c0387d.f(c0387d.f4239L, c0387d7.f4239L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z3, true);
        }
        this.f4359y0 = false;
    }
}
