package u;

import java.util.ArrayList;
import s.C0265c;
import v.C0279b;
import x.C0305f;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public int f3739A0;
    public C0279b B0;

    /* renamed from: C0, reason: collision with root package name */
    public C0305f f3740C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f3741D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f3742E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f3743F0;
    public int G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f3744H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f3745I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f3746J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f3747K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f3748L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f3749M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f3750N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f3751O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f3752P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f3753Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f3754R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f3755S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f3756T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f3757U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f3758V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f3759W0;

    /* renamed from: X0, reason: collision with root package name */
    public C0275d[] f3760X0;

    /* renamed from: Y0, reason: collision with root package name */
    public C0275d[] f3761Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f3762Z0;

    /* renamed from: a1, reason: collision with root package name */
    public C0275d[] f3763a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f3764b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3765s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f3766t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3767u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f3768v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f3769w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f3770x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f3771y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f3772z0;

    @Override // u.i
    public final void S() {
        for (int i = 0; i < this.f3780r0; i++) {
            C0275d c0275d = this.f3779q0[i];
            if (c0275d != null) {
                c0275d.f3646F = true;
            }
        }
    }

    public final int T(C0275d c0275d, int i) {
        if (c0275d == null) {
            return 0;
        }
        int[] iArr = c0275d.p0;
        if (iArr[1] == 3) {
            int i2 = c0275d.f3696s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0275d.f3703z * i);
                if (i3 != c0275d.k()) {
                    c0275d.f3677g = true;
                    V(iArr[0], c0275d.q(), 1, i3, c0275d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0275d.k();
            }
            if (i2 == 3) {
                return (int) ((c0275d.q() * c0275d.f3662W) + 0.5f);
            }
        }
        return c0275d.k();
    }

    public final int U(C0275d c0275d, int i) {
        if (c0275d == null) {
            return 0;
        }
        int[] iArr = c0275d.p0;
        if (iArr[0] == 3) {
            int i2 = c0275d.f3695r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0275d.f3700w * i);
                if (i3 != c0275d.q()) {
                    c0275d.f3677g = true;
                    V(1, i3, iArr[1], c0275d.k(), c0275d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0275d.q();
            }
            if (i2 == 3) {
                return (int) ((c0275d.k() * c0275d.f3662W) + 0.5f);
            }
        }
        return c0275d.q();
    }

    public final void V(int i, int i2, int i3, int i4, C0275d c0275d) {
        C0305f c0305f;
        C0275d c0275d2;
        while (true) {
            c0305f = this.f3740C0;
            if (c0305f != null || (c0275d2 = this.f3659T) == null) {
                break;
            } else {
                this.f3740C0 = ((C0276e) c0275d2).f3718u0;
            }
        }
        C0279b c0279b = this.B0;
        c0279b.f3799a = i;
        c0279b.f3800b = i3;
        c0279b.f3801c = i2;
        c0279b.d = i4;
        c0305f.b(c0275d, c0279b);
        c0275d.O(c0279b.f3802e);
        c0275d.L(c0279b.f3803f);
        c0275d.f3645E = c0279b.h;
        c0275d.I(c0279b.f3804g);
    }

    @Override // u.C0275d
    public final void b(C0265c c0265c, boolean z2) {
        C0275d c0275d;
        float f2;
        int i;
        super.b(c0265c, z2);
        C0275d c0275d2 = this.f3659T;
        boolean z3 = c0275d2 != null && ((C0276e) c0275d2).f3719v0;
        int i2 = this.f3756T0;
        ArrayList arrayList = this.f3759W0;
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
            } else if (this.f3762Z0 != null && this.f3761Y0 != null && this.f3760X0 != null) {
                for (int i5 = 0; i5 < this.f3764b1; i5++) {
                    this.f3763a1[i5].D();
                }
                int[] iArr = this.f3762Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f3 = this.f3746J0;
                C0275d c0275d3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z3) {
                        i = (i6 - i8) - 1;
                        f2 = 1.0f - this.f3746J0;
                    } else {
                        f2 = f3;
                        i = i8;
                    }
                    C0275d c0275d4 = this.f3761Y0[i];
                    if (c0275d4 != null && c0275d4.f3678g0 != 8) {
                        C0274c c0274c = c0275d4.f3648I;
                        if (i8 == 0) {
                            c0275d4.f(c0274c, this.f3648I, this.f3769w0);
                            c0275d4.f3680i0 = this.f3741D0;
                            c0275d4.f3672d0 = f2;
                        }
                        if (i8 == i6 - 1) {
                            c0275d4.f(c0275d4.f3650K, this.f3650K, this.f3770x0);
                        }
                        if (i8 > 0 && c0275d3 != null) {
                            int i9 = this.f3752P0;
                            C0274c c0274c2 = c0275d3.f3650K;
                            c0275d4.f(c0274c, c0274c2, i9);
                            c0275d3.f(c0274c2, c0274c, 0);
                        }
                        c0275d3 = c0275d4;
                    }
                    i8++;
                    f3 = f2;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    C0275d c0275d5 = this.f3760X0[i10];
                    if (c0275d5 != null && c0275d5.f3678g0 != 8) {
                        C0274c c0274c3 = c0275d5.f3649J;
                        if (i10 == 0) {
                            c0275d5.f(c0274c3, this.f3649J, this.f3765s0);
                            c0275d5.f3682j0 = this.f3742E0;
                            c0275d5.f3674e0 = this.f3747K0;
                        }
                        if (i10 == i7 - 1) {
                            c0275d5.f(c0275d5.f3651L, this.f3651L, this.f3766t0);
                        }
                        if (i10 > 0 && c0275d3 != null) {
                            int i11 = this.f3753Q0;
                            C0274c c0274c4 = c0275d3.f3651L;
                            c0275d5.f(c0274c3, c0274c4, i11);
                            c0275d3.f(c0274c4, c0274c3, 0);
                        }
                        c0275d3 = c0275d5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.f3758V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        C0275d[] c0275dArr = this.f3763a1;
                        if (i14 < c0275dArr.length && (c0275d = c0275dArr[i14]) != null && c0275d.f3678g0 != 8) {
                            C0275d c0275d6 = this.f3761Y0[i12];
                            C0275d c0275d7 = this.f3760X0[i13];
                            if (c0275d != c0275d6) {
                                c0275d.f(c0275d.f3648I, c0275d6.f3648I, 0);
                                c0275d.f(c0275d.f3650K, c0275d6.f3650K, 0);
                            }
                            if (c0275d != c0275d7) {
                                c0275d.f(c0275d.f3649J, c0275d7.f3649J, 0);
                                c0275d.f(c0275d.f3651L, c0275d7.f3651L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z3, true);
        }
        this.f3771y0 = false;
    }
}
