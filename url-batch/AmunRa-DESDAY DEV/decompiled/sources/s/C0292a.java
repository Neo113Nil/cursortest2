package s;

import X.V;
import q.C0282b;
import q.C0283c;
import q.C0286f;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f3639s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f3640t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3641u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3642v0;

    @Override // s.C0295d
    public final boolean A() {
        return this.f3642v0;
    }

    @Override // s.C0295d
    public final boolean B() {
        return this.f3642v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z2 = true;
        int i4 = 0;
        while (true) {
            i = this.f3799r0;
            if (i4 >= i) {
                break;
            }
            C0295d c0295d = this.f3798q0[i4];
            if ((this.f3640t0 || c0295d.c()) && ((((i2 = this.f3639s0) == 0 || i2 == 1) && !c0295d.A()) || (((i3 = this.f3639s0) == 2 || i3 == 3) && !c0295d.B()))) {
                z2 = false;
            }
            i4++;
        }
        if (!z2 || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z3 = false;
        for (int i6 = 0; i6 < this.f3799r0; i6++) {
            C0295d c0295d2 = this.f3798q0[i6];
            if (this.f3640t0 || c0295d2.c()) {
                if (!z3) {
                    int i7 = this.f3639s0;
                    if (i7 == 0) {
                        i5 = c0295d2.i(2).d();
                    } else if (i7 == 1) {
                        i5 = c0295d2.i(4).d();
                    } else if (i7 == 2) {
                        i5 = c0295d2.i(3).d();
                    } else if (i7 == 3) {
                        i5 = c0295d2.i(5).d();
                    }
                    z3 = true;
                }
                int i8 = this.f3639s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, c0295d2.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, c0295d2.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, c0295d2.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, c0295d2.i(5).d());
                }
            }
        }
        int i9 = i5 + this.f3641u0;
        int i10 = this.f3639s0;
        if (i10 == 0 || i10 == 1) {
            J(i9, i9);
        } else {
            K(i9, i9);
        }
        this.f3642v0 = true;
        return true;
    }

    public final int U() {
        int i = this.f3639s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // s.C0295d
    public final void b(C0283c c0283c, boolean z2) {
        boolean z3;
        int i;
        int i2;
        C0294c[] c0294cArr = this.f3678Q;
        C0294c c0294c = this.f3670I;
        c0294cArr[0] = c0294c;
        C0294c c0294c2 = this.f3671J;
        int i3 = 2;
        c0294cArr[2] = c0294c2;
        C0294c c0294c3 = this.f3672K;
        c0294cArr[1] = c0294c3;
        C0294c c0294c4 = this.f3673L;
        c0294cArr[3] = c0294c4;
        for (C0294c c0294c5 : c0294cArr) {
            c0294c5.i = c0283c.k(c0294c5);
        }
        int i4 = this.f3639s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0294c c0294c6 = c0294cArr[i4];
        if (!this.f3642v0) {
            T();
        }
        if (this.f3642v0) {
            this.f3642v0 = false;
            int i5 = this.f3639s0;
            if (i5 == 0 || i5 == 1) {
                c0283c.d(c0294c.i, this.f3686Y);
                c0283c.d(c0294c3.i, this.f3686Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c0283c.d(c0294c2.i, this.f3687Z);
                    c0283c.d(c0294c4.i, this.f3687Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.f3799r0; i6++) {
            C0295d c0295d = this.f3798q0[i6];
            if ((this.f3640t0 || c0295d.c()) && ((((i2 = this.f3639s0) == 0 || i2 == 1) && c0295d.f3714p0[0] == 3 && c0295d.f3670I.f3661f != null && c0295d.f3672K.f3661f != null) || ((i2 == 2 || i2 == 3) && c0295d.f3714p0[1] == 3 && c0295d.f3671J.f3661f != null && c0295d.f3673L.f3661f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = c0294c.g() || c0294c3.g();
        boolean z5 = c0294c2.g() || c0294c4.g();
        int i7 = (z3 || !(((i = this.f3639s0) == 0 && z4) || ((i == 2 && z5) || ((i == 1 && z4) || (i == 3 && z5))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f3799r0) {
            C0295d c0295d2 = this.f3798q0[i8];
            if (this.f3640t0 || c0295d2.c()) {
                C0286f k2 = c0283c.k(c0295d2.f3678Q[this.f3639s0]);
                int i9 = this.f3639s0;
                C0294c c0294c7 = c0295d2.f3678Q[i9];
                c0294c7.i = k2;
                C0294c c0294c8 = c0294c7.f3661f;
                int i10 = (c0294c8 == null || c0294c8.d != this) ? 0 : c0294c7.f3662g;
                if (i9 == 0 || i9 == i3) {
                    C0286f c0286f = c0294c6.i;
                    int i11 = this.f3641u0 - i10;
                    C0282b l2 = c0283c.l();
                    C0286f m2 = c0283c.m();
                    m2.d = 0;
                    l2.c(c0286f, k2, m2, i11);
                    c0283c.c(l2);
                } else {
                    C0286f c0286f2 = c0294c6.i;
                    int i12 = this.f3641u0 + i10;
                    C0282b l3 = c0283c.l();
                    C0286f m3 = c0283c.m();
                    m3.d = 0;
                    l3.b(c0286f2, k2, m3, i12);
                    c0283c.c(l3);
                }
                c0283c.e(c0294c6.i, k2, this.f3641u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f3639s0;
        if (i13 == 0) {
            c0283c.e(c0294c3.i, c0294c.i, 0, 8);
            c0283c.e(c0294c.i, this.f3681T.f3672K.i, 0, 4);
            c0283c.e(c0294c.i, this.f3681T.f3670I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            c0283c.e(c0294c.i, c0294c3.i, 0, 8);
            c0283c.e(c0294c.i, this.f3681T.f3670I.i, 0, 4);
            c0283c.e(c0294c.i, this.f3681T.f3672K.i, 0, 0);
        } else if (i13 == 2) {
            c0283c.e(c0294c4.i, c0294c2.i, 0, 8);
            c0283c.e(c0294c2.i, this.f3681T.f3673L.i, 0, 4);
            c0283c.e(c0294c2.i, this.f3681T.f3671J.i, 0, 0);
        } else if (i13 == 3) {
            c0283c.e(c0294c2.i, c0294c4.i, 0, 8);
            c0283c.e(c0294c2.i, this.f3681T.f3671J.i, 0, 4);
            c0283c.e(c0294c2.i, this.f3681T.f3673L.i, 0, 0);
        }
    }

    @Override // s.C0295d
    public final boolean c() {
        return true;
    }

    @Override // s.C0295d
    public final String toString() {
        String str = "[Barrier] " + this.f3701h0 + " {";
        for (int i = 0; i < this.f3799r0; i++) {
            C0295d c0295d = this.f3798q0[i];
            if (i > 0) {
                str = V.e(str, ", ");
            }
            str = str + c0295d.f3701h0;
        }
        return V.e(str, "}");
    }
}
