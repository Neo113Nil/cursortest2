package s;

import java.util.ArrayList;
import q.C0288c;
import t.C0302b;
import v.C0324f;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public int f3690A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0302b f3691B0;
    public C0324f C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f3692D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f3693E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f3694F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f3695G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f3696H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f3697I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f3698J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f3699K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f3700L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f3701M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f3702N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f3703O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f3704P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f3705Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f3706R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f3707S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f3708T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f3709U0;
    public int V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f3710W0;

    /* renamed from: X0, reason: collision with root package name */
    public C0298d[] f3711X0;

    /* renamed from: Y0, reason: collision with root package name */
    public C0298d[] f3712Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f3713Z0;

    /* renamed from: a1, reason: collision with root package name */
    public C0298d[] f3714a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f3715b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3716s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f3717t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3718u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f3719v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f3720w0;
    public int x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f3721y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f3722z0;

    @Override // s.i
    public final void S() {
        for (int i = 0; i < this.f3730r0; i++) {
            C0298d c0298d = this.f3729q0[i];
            if (c0298d != null) {
                c0298d.F = true;
            }
        }
    }

    public final int T(C0298d c0298d, int i) {
        if (c0298d == null) {
            return 0;
        }
        int[] iArr = c0298d.f3644p0;
        if (iArr[1] == 3) {
            int i2 = c0298d.f3647s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0298d.f3654z * i);
                if (i3 != c0298d.k()) {
                    c0298d.f3628g = true;
                    V(iArr[0], c0298d.q(), 1, i3, c0298d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0298d.k();
            }
            if (i2 == 3) {
                return (int) ((c0298d.q() * c0298d.f3613W) + 0.5f);
            }
        }
        return c0298d.k();
    }

    public final int U(C0298d c0298d, int i) {
        if (c0298d == null) {
            return 0;
        }
        int[] iArr = c0298d.f3644p0;
        if (iArr[0] == 3) {
            int i2 = c0298d.f3646r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0298d.f3651w * i);
                if (i3 != c0298d.q()) {
                    c0298d.f3628g = true;
                    V(1, i3, iArr[1], c0298d.k(), c0298d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0298d.q();
            }
            if (i2 == 3) {
                return (int) ((c0298d.k() * c0298d.f3613W) + 0.5f);
            }
        }
        return c0298d.q();
    }

    public final void V(int i, int i2, int i3, int i4, C0298d c0298d) {
        C0324f c0324f;
        C0298d c0298d2;
        while (true) {
            c0324f = this.C0;
            if (c0324f != null || (c0298d2 = this.f3610T) == null) {
                break;
            } else {
                this.C0 = ((C0299e) c0298d2).f3670u0;
            }
        }
        C0302b c0302b = this.f3691B0;
        c0302b.f3737a = i;
        c0302b.f3738b = i3;
        c0302b.f3739c = i2;
        c0302b.d = i4;
        c0324f.b(c0298d, c0302b);
        c0298d.O(c0302b.f3740e);
        c0298d.L(c0302b.f3741f);
        c0298d.f3596E = c0302b.h;
        c0298d.I(c0302b.f3742g);
    }

    @Override // s.C0298d
    public final void b(C0288c c0288c, boolean z2) {
        C0298d c0298d;
        float f2;
        int i;
        super.b(c0288c, z2);
        C0298d c0298d2 = this.f3610T;
        boolean z3 = c0298d2 != null && ((C0299e) c0298d2).f3671v0;
        int i2 = this.f3708T0;
        ArrayList arrayList = this.f3710W0;
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
            } else if (this.f3713Z0 != null && this.f3712Y0 != null && this.f3711X0 != null) {
                for (int i5 = 0; i5 < this.f3715b1; i5++) {
                    this.f3714a1[i5].D();
                }
                int[] iArr = this.f3713Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f3 = this.f3698J0;
                C0298d c0298d3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z3) {
                        i = (i6 - i8) - 1;
                        f2 = 1.0f - this.f3698J0;
                    } else {
                        f2 = f3;
                        i = i8;
                    }
                    C0298d c0298d4 = this.f3712Y0[i];
                    if (c0298d4 != null && c0298d4.f3629g0 != 8) {
                        C0297c c0297c = c0298d4.f3599I;
                        if (i8 == 0) {
                            c0298d4.f(c0297c, this.f3599I, this.f3720w0);
                            c0298d4.f3631i0 = this.f3692D0;
                            c0298d4.f3623d0 = f2;
                        }
                        if (i8 == i6 - 1) {
                            c0298d4.f(c0298d4.f3601K, this.f3601K, this.x0);
                        }
                        if (i8 > 0 && c0298d3 != null) {
                            int i9 = this.f3704P0;
                            C0297c c0297c2 = c0298d3.f3601K;
                            c0298d4.f(c0297c, c0297c2, i9);
                            c0298d3.f(c0297c2, c0297c, 0);
                        }
                        c0298d3 = c0298d4;
                    }
                    i8++;
                    f3 = f2;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    C0298d c0298d5 = this.f3711X0[i10];
                    if (c0298d5 != null && c0298d5.f3629g0 != 8) {
                        C0297c c0297c3 = c0298d5.f3600J;
                        if (i10 == 0) {
                            c0298d5.f(c0297c3, this.f3600J, this.f3716s0);
                            c0298d5.j0 = this.f3693E0;
                            c0298d5.f3625e0 = this.f3699K0;
                        }
                        if (i10 == i7 - 1) {
                            c0298d5.f(c0298d5.f3602L, this.f3602L, this.f3717t0);
                        }
                        if (i10 > 0 && c0298d3 != null) {
                            int i11 = this.f3705Q0;
                            C0297c c0297c4 = c0298d3.f3602L;
                            c0298d5.f(c0297c3, c0297c4, i11);
                            c0298d3.f(c0297c4, c0297c3, 0);
                        }
                        c0298d3 = c0298d5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        C0298d[] c0298dArr = this.f3714a1;
                        if (i14 < c0298dArr.length && (c0298d = c0298dArr[i14]) != null && c0298d.f3629g0 != 8) {
                            C0298d c0298d6 = this.f3712Y0[i12];
                            C0298d c0298d7 = this.f3711X0[i13];
                            if (c0298d != c0298d6) {
                                c0298d.f(c0298d.f3599I, c0298d6.f3599I, 0);
                                c0298d.f(c0298d.f3601K, c0298d6.f3601K, 0);
                            }
                            if (c0298d != c0298d7) {
                                c0298d.f(c0298d.f3600J, c0298d7.f3600J, 0);
                                c0298d.f(c0298d.f3602L, c0298d7.f3602L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z3, true);
        }
        this.f3721y0 = false;
    }
}
