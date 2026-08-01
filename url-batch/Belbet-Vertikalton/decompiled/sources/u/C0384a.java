package u;

import G1.AbstractC0001b;
import s.C0377b;
import s.C0378c;
import s.C0381f;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0384a extends i {
    public int s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f4205t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f4206u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f4207v0;

    @Override // u.C0387d
    public final boolean A() {
        return this.f4207v0;
    }

    @Override // u.C0387d
    public final boolean B() {
        return this.f4207v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z2 = true;
        int i4 = 0;
        while (true) {
            i = this.f4367r0;
            if (i4 >= i) {
                break;
            }
            C0387d c0387d = this.f4366q0[i4];
            if ((this.f4205t0 || c0387d.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && !c0387d.A()) || (((i3 = this.s0) == 2 || i3 == 3) && !c0387d.B()))) {
                z2 = false;
            }
            i4++;
        }
        if (!z2 || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z3 = false;
        for (int i6 = 0; i6 < this.f4367r0; i6++) {
            C0387d c0387d2 = this.f4366q0[i6];
            if (this.f4205t0 || c0387d2.c()) {
                if (!z3) {
                    int i7 = this.s0;
                    if (i7 == 0) {
                        i5 = c0387d2.i(2).d();
                    } else if (i7 == 1) {
                        i5 = c0387d2.i(4).d();
                    } else if (i7 == 2) {
                        i5 = c0387d2.i(3).d();
                    } else if (i7 == 3) {
                        i5 = c0387d2.i(5).d();
                    }
                    z3 = true;
                }
                int i8 = this.s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, c0387d2.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, c0387d2.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, c0387d2.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, c0387d2.i(5).d());
                }
            }
        }
        int i9 = i5 + this.f4206u0;
        int i10 = this.s0;
        if (i10 == 0 || i10 == 1) {
            J(i9, i9);
        } else {
            K(i9, i9);
        }
        this.f4207v0 = true;
        return true;
    }

    public final int U() {
        int i = this.s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // u.C0387d
    public final void b(C0378c c0378c, boolean z2) {
        boolean z3;
        int i;
        int i2;
        C0386c[] c0386cArr = this.f4244Q;
        C0386c c0386c = this.f4236I;
        c0386cArr[0] = c0386c;
        C0386c c0386c2 = this.f4237J;
        int i3 = 2;
        c0386cArr[2] = c0386c2;
        C0386c c0386c3 = this.f4238K;
        c0386cArr[1] = c0386c3;
        C0386c c0386c4 = this.f4239L;
        c0386cArr[3] = c0386c4;
        for (C0386c c0386c5 : c0386cArr) {
            c0386c5.i = c0378c.k(c0386c5);
        }
        int i4 = this.s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0386c c0386c6 = c0386cArr[i4];
        if (!this.f4207v0) {
            T();
        }
        if (this.f4207v0) {
            this.f4207v0 = false;
            int i5 = this.s0;
            if (i5 == 0 || i5 == 1) {
                c0378c.d(c0386c.i, this.f4252Y);
                c0378c.d(c0386c3.i, this.f4252Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c0378c.d(c0386c2.i, this.f4253Z);
                    c0378c.d(c0386c4.i, this.f4253Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.f4367r0; i6++) {
            C0387d c0387d = this.f4366q0[i6];
            if ((this.f4205t0 || c0387d.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && c0387d.f4281p0[0] == 3 && c0387d.f4236I.f4226f != null && c0387d.f4238K.f4226f != null) || ((i2 == 2 || i2 == 3) && c0387d.f4281p0[1] == 3 && c0387d.f4237J.f4226f != null && c0387d.f4239L.f4226f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = c0386c.g() || c0386c3.g();
        boolean z5 = c0386c2.g() || c0386c4.g();
        int i7 = (z3 || !(((i = this.s0) == 0 && z4) || ((i == 2 && z5) || ((i == 1 && z4) || (i == 3 && z5))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f4367r0) {
            C0387d c0387d2 = this.f4366q0[i8];
            if (this.f4205t0 || c0387d2.c()) {
                C0381f k2 = c0378c.k(c0387d2.f4244Q[this.s0]);
                int i9 = this.s0;
                C0386c c0386c7 = c0387d2.f4244Q[i9];
                c0386c7.i = k2;
                C0386c c0386c8 = c0386c7.f4226f;
                int i10 = (c0386c8 == null || c0386c8.f4225d != this) ? 0 : c0386c7.f4227g;
                if (i9 == 0 || i9 == i3) {
                    C0381f c0381f = c0386c6.i;
                    int i11 = this.f4206u0 - i10;
                    C0377b l2 = c0378c.l();
                    C0381f m2 = c0378c.m();
                    m2.f4134d = 0;
                    l2.c(c0381f, k2, m2, i11);
                    c0378c.c(l2);
                } else {
                    C0381f c0381f2 = c0386c6.i;
                    int i12 = this.f4206u0 + i10;
                    C0377b l3 = c0378c.l();
                    C0381f m3 = c0378c.m();
                    m3.f4134d = 0;
                    l3.b(c0381f2, k2, m3, i12);
                    c0378c.c(l3);
                }
                c0378c.e(c0386c6.i, k2, this.f4206u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.s0;
        if (i13 == 0) {
            c0378c.e(c0386c3.i, c0386c.i, 0, 8);
            c0378c.e(c0386c.i, this.f4247T.f4238K.i, 0, 4);
            c0378c.e(c0386c.i, this.f4247T.f4236I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            c0378c.e(c0386c.i, c0386c3.i, 0, 8);
            c0378c.e(c0386c.i, this.f4247T.f4236I.i, 0, 4);
            c0378c.e(c0386c.i, this.f4247T.f4238K.i, 0, 0);
        } else if (i13 == 2) {
            c0378c.e(c0386c4.i, c0386c2.i, 0, 8);
            c0378c.e(c0386c2.i, this.f4247T.f4239L.i, 0, 4);
            c0378c.e(c0386c2.i, this.f4247T.f4237J.i, 0, 0);
        } else if (i13 == 3) {
            c0378c.e(c0386c2.i, c0386c4.i, 0, 8);
            c0378c.e(c0386c2.i, this.f4247T.f4237J.i, 0, 4);
            c0378c.e(c0386c2.i, this.f4247T.f4239L.i, 0, 0);
        }
    }

    @Override // u.C0387d
    public final boolean c() {
        return true;
    }

    @Override // u.C0387d
    public final String toString() {
        String g2 = AbstractC0001b.g(new StringBuilder("[Barrier] "), this.f4268h0, " {");
        for (int i = 0; i < this.f4367r0; i++) {
            C0387d c0387d = this.f4366q0[i];
            if (i > 0) {
                g2 = AbstractC0001b.f(g2, ", ");
            }
            g2 = g2 + c0387d.f4268h0;
        }
        return AbstractC0001b.f(g2, "}");
    }
}
