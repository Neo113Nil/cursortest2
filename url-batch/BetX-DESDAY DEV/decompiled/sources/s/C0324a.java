package s;

import q.C0316b;
import q.C0317c;
import q.C0320f;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f3983s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f3984t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3985u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3986v0;

    @Override // s.C0327d
    public final boolean A() {
        return this.f3986v0;
    }

    @Override // s.C0327d
    public final boolean B() {
        return this.f3986v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z2 = true;
        int i4 = 0;
        while (true) {
            i = this.f4147r0;
            if (i4 >= i) {
                break;
            }
            C0327d c0327d = this.f4146q0[i4];
            if ((this.f3984t0 || c0327d.c()) && ((((i2 = this.f3983s0) == 0 || i2 == 1) && !c0327d.A()) || (((i3 = this.f3983s0) == 2 || i3 == 3) && !c0327d.B()))) {
                z2 = false;
            }
            i4++;
        }
        if (!z2 || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z3 = false;
        for (int i6 = 0; i6 < this.f4147r0; i6++) {
            C0327d c0327d2 = this.f4146q0[i6];
            if (this.f3984t0 || c0327d2.c()) {
                if (!z3) {
                    int i7 = this.f3983s0;
                    if (i7 == 0) {
                        i5 = c0327d2.i(2).d();
                    } else if (i7 == 1) {
                        i5 = c0327d2.i(4).d();
                    } else if (i7 == 2) {
                        i5 = c0327d2.i(3).d();
                    } else if (i7 == 3) {
                        i5 = c0327d2.i(5).d();
                    }
                    z3 = true;
                }
                int i8 = this.f3983s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, c0327d2.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, c0327d2.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, c0327d2.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, c0327d2.i(5).d());
                }
            }
        }
        int i9 = i5 + this.f3985u0;
        int i10 = this.f3983s0;
        if (i10 == 0 || i10 == 1) {
            J(i9, i9);
        } else {
            K(i9, i9);
        }
        this.f3986v0 = true;
        return true;
    }

    public final int U() {
        int i = this.f3983s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // s.C0327d
    public final void b(C0317c c0317c, boolean z2) {
        boolean z3;
        int i;
        int i2;
        C0326c[] c0326cArr = this.f4024Q;
        C0326c c0326c = this.f4016I;
        c0326cArr[0] = c0326c;
        C0326c c0326c2 = this.f4017J;
        int i3 = 2;
        c0326cArr[2] = c0326c2;
        C0326c c0326c3 = this.f4018K;
        c0326cArr[1] = c0326c3;
        C0326c c0326c4 = this.f4019L;
        c0326cArr[3] = c0326c4;
        for (C0326c c0326c5 : c0326cArr) {
            c0326c5.i = c0317c.k(c0326c5);
        }
        int i4 = this.f3983s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0326c c0326c6 = c0326cArr[i4];
        if (!this.f3986v0) {
            T();
        }
        if (this.f3986v0) {
            this.f3986v0 = false;
            int i5 = this.f3983s0;
            if (i5 == 0 || i5 == 1) {
                c0317c.d(c0326c.i, this.f4032Y);
                c0317c.d(c0326c3.i, this.f4032Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c0317c.d(c0326c2.i, this.f4033Z);
                    c0317c.d(c0326c4.i, this.f4033Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.f4147r0; i6++) {
            C0327d c0327d = this.f4146q0[i6];
            if ((this.f3984t0 || c0327d.c()) && ((((i2 = this.f3983s0) == 0 || i2 == 1) && c0327d.f4061p0[0] == 3 && c0327d.f4016I.f4007f != null && c0327d.f4018K.f4007f != null) || ((i2 == 2 || i2 == 3) && c0327d.f4061p0[1] == 3 && c0327d.f4017J.f4007f != null && c0327d.f4019L.f4007f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = c0326c.g() || c0326c3.g();
        boolean z5 = c0326c2.g() || c0326c4.g();
        int i7 = (z3 || !(((i = this.f3983s0) == 0 && z4) || ((i == 2 && z5) || ((i == 1 && z4) || (i == 3 && z5))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f4147r0) {
            C0327d c0327d2 = this.f4146q0[i8];
            if (this.f3984t0 || c0327d2.c()) {
                C0320f k2 = c0317c.k(c0327d2.f4024Q[this.f3983s0]);
                int i9 = this.f3983s0;
                C0326c c0326c7 = c0327d2.f4024Q[i9];
                c0326c7.i = k2;
                C0326c c0326c8 = c0326c7.f4007f;
                int i10 = (c0326c8 == null || c0326c8.f4005d != this) ? 0 : c0326c7.f4008g;
                if (i9 == 0 || i9 == i3) {
                    C0320f c0320f = c0326c6.i;
                    int i11 = this.f3985u0 - i10;
                    C0316b l2 = c0317c.l();
                    C0320f m2 = c0317c.m();
                    m2.f3927d = 0;
                    l2.c(c0320f, k2, m2, i11);
                    c0317c.c(l2);
                } else {
                    C0320f c0320f2 = c0326c6.i;
                    int i12 = this.f3985u0 + i10;
                    C0316b l3 = c0317c.l();
                    C0320f m3 = c0317c.m();
                    m3.f3927d = 0;
                    l3.b(c0320f2, k2, m3, i12);
                    c0317c.c(l3);
                }
                c0317c.e(c0326c6.i, k2, this.f3985u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f3983s0;
        if (i13 == 0) {
            c0317c.e(c0326c3.i, c0326c.i, 0, 8);
            c0317c.e(c0326c.i, this.f4027T.f4018K.i, 0, 4);
            c0317c.e(c0326c.i, this.f4027T.f4016I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            c0317c.e(c0326c.i, c0326c3.i, 0, 8);
            c0317c.e(c0326c.i, this.f4027T.f4016I.i, 0, 4);
            c0317c.e(c0326c.i, this.f4027T.f4018K.i, 0, 0);
        } else if (i13 == 2) {
            c0317c.e(c0326c4.i, c0326c2.i, 0, 8);
            c0317c.e(c0326c2.i, this.f4027T.f4019L.i, 0, 4);
            c0317c.e(c0326c2.i, this.f4027T.f4017J.i, 0, 0);
        } else if (i13 == 3) {
            c0317c.e(c0326c2.i, c0326c4.i, 0, 8);
            c0317c.e(c0326c2.i, this.f4027T.f4017J.i, 0, 4);
            c0317c.e(c0326c2.i, this.f4027T.f4019L.i, 0, 0);
        }
    }

    @Override // s.C0327d
    public final boolean c() {
        return true;
    }

    @Override // s.C0327d
    public final String toString() {
        String str = "[Barrier] " + this.f4048h0 + " {";
        for (int i = 0; i < this.f4147r0; i++) {
            C0327d c0327d = this.f4146q0[i];
            if (i > 0) {
                str = X0.e.e(str, ", ");
            }
            str = str + c0327d.f4048h0;
        }
        return X0.e.e(str, "}");
    }
}
