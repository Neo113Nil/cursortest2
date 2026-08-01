package s;

import q.C0282b;
import q.C0283c;
import q.C0286f;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0290a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f3501s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f3502t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3503u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3504v0;

    @Override // s.C0293d
    public final boolean A() {
        return this.f3504v0;
    }

    @Override // s.C0293d
    public final boolean B() {
        return this.f3504v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z2 = true;
        int i4 = 0;
        while (true) {
            i = this.f3663r0;
            if (i4 >= i) {
                break;
            }
            C0293d c0293d = this.f3662q0[i4];
            if ((this.f3502t0 || c0293d.c()) && ((((i2 = this.f3501s0) == 0 || i2 == 1) && !c0293d.A()) || (((i3 = this.f3501s0) == 2 || i3 == 3) && !c0293d.B()))) {
                z2 = false;
            }
            i4++;
        }
        if (!z2 || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z3 = false;
        for (int i6 = 0; i6 < this.f3663r0; i6++) {
            C0293d c0293d2 = this.f3662q0[i6];
            if (this.f3502t0 || c0293d2.c()) {
                if (!z3) {
                    int i7 = this.f3501s0;
                    if (i7 == 0) {
                        i5 = c0293d2.i(2).d();
                    } else if (i7 == 1) {
                        i5 = c0293d2.i(4).d();
                    } else if (i7 == 2) {
                        i5 = c0293d2.i(3).d();
                    } else if (i7 == 3) {
                        i5 = c0293d2.i(5).d();
                    }
                    z3 = true;
                }
                int i8 = this.f3501s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, c0293d2.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, c0293d2.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, c0293d2.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, c0293d2.i(5).d());
                }
            }
        }
        int i9 = i5 + this.f3503u0;
        int i10 = this.f3501s0;
        if (i10 == 0 || i10 == 1) {
            J(i9, i9);
        } else {
            K(i9, i9);
        }
        this.f3504v0 = true;
        return true;
    }

    public final int U() {
        int i = this.f3501s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // s.C0293d
    public final void b(C0283c c0283c, boolean z2) {
        boolean z3;
        int i;
        int i2;
        C0292c[] c0292cArr = this.f3540Q;
        C0292c c0292c = this.f3532I;
        c0292cArr[0] = c0292c;
        C0292c c0292c2 = this.f3533J;
        int i3 = 2;
        c0292cArr[2] = c0292c2;
        C0292c c0292c3 = this.f3534K;
        c0292cArr[1] = c0292c3;
        C0292c c0292c4 = this.f3535L;
        c0292cArr[3] = c0292c4;
        for (C0292c c0292c5 : c0292cArr) {
            c0292c5.i = c0283c.k(c0292c5);
        }
        int i4 = this.f3501s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0292c c0292c6 = c0292cArr[i4];
        if (!this.f3504v0) {
            T();
        }
        if (this.f3504v0) {
            this.f3504v0 = false;
            int i5 = this.f3501s0;
            if (i5 == 0 || i5 == 1) {
                c0283c.d(c0292c.i, this.f3548Y);
                c0283c.d(c0292c3.i, this.f3548Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c0283c.d(c0292c2.i, this.f3549Z);
                    c0283c.d(c0292c4.i, this.f3549Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.f3663r0; i6++) {
            C0293d c0293d = this.f3662q0[i6];
            if ((this.f3502t0 || c0293d.c()) && ((((i2 = this.f3501s0) == 0 || i2 == 1) && c0293d.f3577p0[0] == 3 && c0293d.f3532I.f3523f != null && c0293d.f3534K.f3523f != null) || ((i2 == 2 || i2 == 3) && c0293d.f3577p0[1] == 3 && c0293d.f3533J.f3523f != null && c0293d.f3535L.f3523f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = c0292c.g() || c0292c3.g();
        boolean z5 = c0292c2.g() || c0292c4.g();
        int i7 = (z3 || !(((i = this.f3501s0) == 0 && z4) || ((i == 2 && z5) || ((i == 1 && z4) || (i == 3 && z5))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f3663r0) {
            C0293d c0293d2 = this.f3662q0[i8];
            if (this.f3502t0 || c0293d2.c()) {
                C0286f k2 = c0283c.k(c0293d2.f3540Q[this.f3501s0]);
                int i9 = this.f3501s0;
                C0292c c0292c7 = c0293d2.f3540Q[i9];
                c0292c7.i = k2;
                C0292c c0292c8 = c0292c7.f3523f;
                int i10 = (c0292c8 == null || c0292c8.d != this) ? 0 : c0292c7.f3524g;
                if (i9 == 0 || i9 == i3) {
                    C0286f c0286f = c0292c6.i;
                    int i11 = this.f3503u0 - i10;
                    C0282b l2 = c0283c.l();
                    C0286f m2 = c0283c.m();
                    m2.d = 0;
                    l2.c(c0286f, k2, m2, i11);
                    c0283c.c(l2);
                } else {
                    C0286f c0286f2 = c0292c6.i;
                    int i12 = this.f3503u0 + i10;
                    C0282b l3 = c0283c.l();
                    C0286f m3 = c0283c.m();
                    m3.d = 0;
                    l3.b(c0286f2, k2, m3, i12);
                    c0283c.c(l3);
                }
                c0283c.e(c0292c6.i, k2, this.f3503u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f3501s0;
        if (i13 == 0) {
            c0283c.e(c0292c3.i, c0292c.i, 0, 8);
            c0283c.e(c0292c.i, this.f3543T.f3534K.i, 0, 4);
            c0283c.e(c0292c.i, this.f3543T.f3532I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            c0283c.e(c0292c.i, c0292c3.i, 0, 8);
            c0283c.e(c0292c.i, this.f3543T.f3532I.i, 0, 4);
            c0283c.e(c0292c.i, this.f3543T.f3534K.i, 0, 0);
        } else if (i13 == 2) {
            c0283c.e(c0292c4.i, c0292c2.i, 0, 8);
            c0283c.e(c0292c2.i, this.f3543T.f3535L.i, 0, 4);
            c0283c.e(c0292c2.i, this.f3543T.f3533J.i, 0, 0);
        } else if (i13 == 3) {
            c0283c.e(c0292c2.i, c0292c4.i, 0, 8);
            c0283c.e(c0292c2.i, this.f3543T.f3533J.i, 0, 4);
            c0283c.e(c0292c2.i, this.f3543T.f3535L.i, 0, 0);
        }
    }

    @Override // s.C0293d
    public final boolean c() {
        return true;
    }

    @Override // s.C0293d
    public final String toString() {
        String str = "[Barrier] " + this.f3563h0 + " {";
        for (int i = 0; i < this.f3663r0; i++) {
            C0293d c0293d = this.f3662q0[i];
            if (i > 0) {
                str = T0.c.e(str, ", ");
            }
            str = str + c0293d.f3563h0;
        }
        return T0.c.e(str, "}");
    }
}
