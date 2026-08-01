package s;

import X.V;
import q.C0285b;
import q.C0286c;
import q.C0289f;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f3525s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f3526t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3527u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3528v0;

    @Override // s.C0296d
    public final boolean A() {
        return this.f3528v0;
    }

    @Override // s.C0296d
    public final boolean B() {
        return this.f3528v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z2 = true;
        int i4 = 0;
        while (true) {
            i = this.f3686r0;
            if (i4 >= i) {
                break;
            }
            C0296d c0296d = this.f3685q0[i4];
            if ((this.f3526t0 || c0296d.c()) && ((((i2 = this.f3525s0) == 0 || i2 == 1) && !c0296d.A()) || (((i3 = this.f3525s0) == 2 || i3 == 3) && !c0296d.B()))) {
                z2 = false;
            }
            i4++;
        }
        if (!z2 || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z3 = false;
        for (int i6 = 0; i6 < this.f3686r0; i6++) {
            C0296d c0296d2 = this.f3685q0[i6];
            if (this.f3526t0 || c0296d2.c()) {
                if (!z3) {
                    int i7 = this.f3525s0;
                    if (i7 == 0) {
                        i5 = c0296d2.i(2).d();
                    } else if (i7 == 1) {
                        i5 = c0296d2.i(4).d();
                    } else if (i7 == 2) {
                        i5 = c0296d2.i(3).d();
                    } else if (i7 == 3) {
                        i5 = c0296d2.i(5).d();
                    }
                    z3 = true;
                }
                int i8 = this.f3525s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, c0296d2.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, c0296d2.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, c0296d2.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, c0296d2.i(5).d());
                }
            }
        }
        int i9 = i5 + this.f3527u0;
        int i10 = this.f3525s0;
        if (i10 == 0 || i10 == 1) {
            J(i9, i9);
        } else {
            K(i9, i9);
        }
        this.f3528v0 = true;
        return true;
    }

    public final int U() {
        int i = this.f3525s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // s.C0296d
    public final void b(C0286c c0286c, boolean z2) {
        boolean z3;
        int i;
        int i2;
        C0295c[] c0295cArr = this.f3564Q;
        C0295c c0295c = this.f3556I;
        c0295cArr[0] = c0295c;
        C0295c c0295c2 = this.f3557J;
        int i3 = 2;
        c0295cArr[2] = c0295c2;
        C0295c c0295c3 = this.f3558K;
        c0295cArr[1] = c0295c3;
        C0295c c0295c4 = this.f3559L;
        c0295cArr[3] = c0295c4;
        for (C0295c c0295c5 : c0295cArr) {
            c0295c5.i = c0286c.k(c0295c5);
        }
        int i4 = this.f3525s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0295c c0295c6 = c0295cArr[i4];
        if (!this.f3528v0) {
            T();
        }
        if (this.f3528v0) {
            this.f3528v0 = false;
            int i5 = this.f3525s0;
            if (i5 == 0 || i5 == 1) {
                c0286c.d(c0295c.i, this.f3572Y);
                c0286c.d(c0295c3.i, this.f3572Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c0286c.d(c0295c2.i, this.f3573Z);
                    c0286c.d(c0295c4.i, this.f3573Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.f3686r0; i6++) {
            C0296d c0296d = this.f3685q0[i6];
            if ((this.f3526t0 || c0296d.c()) && ((((i2 = this.f3525s0) == 0 || i2 == 1) && c0296d.f3601p0[0] == 3 && c0296d.f3556I.f3547f != null && c0296d.f3558K.f3547f != null) || ((i2 == 2 || i2 == 3) && c0296d.f3601p0[1] == 3 && c0296d.f3557J.f3547f != null && c0296d.f3559L.f3547f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = c0295c.g() || c0295c3.g();
        boolean z5 = c0295c2.g() || c0295c4.g();
        int i7 = (z3 || !(((i = this.f3525s0) == 0 && z4) || ((i == 2 && z5) || ((i == 1 && z4) || (i == 3 && z5))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f3686r0) {
            C0296d c0296d2 = this.f3685q0[i8];
            if (this.f3526t0 || c0296d2.c()) {
                C0289f k2 = c0286c.k(c0296d2.f3564Q[this.f3525s0]);
                int i9 = this.f3525s0;
                C0295c c0295c7 = c0296d2.f3564Q[i9];
                c0295c7.i = k2;
                C0295c c0295c8 = c0295c7.f3547f;
                int i10 = (c0295c8 == null || c0295c8.d != this) ? 0 : c0295c7.f3548g;
                if (i9 == 0 || i9 == i3) {
                    C0289f c0289f = c0295c6.i;
                    int i11 = this.f3527u0 - i10;
                    C0285b l2 = c0286c.l();
                    C0289f m2 = c0286c.m();
                    m2.d = 0;
                    l2.c(c0289f, k2, m2, i11);
                    c0286c.c(l2);
                } else {
                    C0289f c0289f2 = c0295c6.i;
                    int i12 = this.f3527u0 + i10;
                    C0285b l3 = c0286c.l();
                    C0289f m3 = c0286c.m();
                    m3.d = 0;
                    l3.b(c0289f2, k2, m3, i12);
                    c0286c.c(l3);
                }
                c0286c.e(c0295c6.i, k2, this.f3527u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f3525s0;
        if (i13 == 0) {
            c0286c.e(c0295c3.i, c0295c.i, 0, 8);
            c0286c.e(c0295c.i, this.f3567T.f3558K.i, 0, 4);
            c0286c.e(c0295c.i, this.f3567T.f3556I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            c0286c.e(c0295c.i, c0295c3.i, 0, 8);
            c0286c.e(c0295c.i, this.f3567T.f3556I.i, 0, 4);
            c0286c.e(c0295c.i, this.f3567T.f3558K.i, 0, 0);
        } else if (i13 == 2) {
            c0286c.e(c0295c4.i, c0295c2.i, 0, 8);
            c0286c.e(c0295c2.i, this.f3567T.f3559L.i, 0, 4);
            c0286c.e(c0295c2.i, this.f3567T.f3557J.i, 0, 0);
        } else if (i13 == 3) {
            c0286c.e(c0295c2.i, c0295c4.i, 0, 8);
            c0286c.e(c0295c2.i, this.f3567T.f3557J.i, 0, 4);
            c0286c.e(c0295c2.i, this.f3567T.f3559L.i, 0, 0);
        }
    }

    @Override // s.C0296d
    public final boolean c() {
        return true;
    }

    @Override // s.C0296d
    public final String toString() {
        String str = "[Barrier] " + this.f3587h0 + " {";
        for (int i = 0; i < this.f3686r0; i++) {
            C0296d c0296d = this.f3685q0[i];
            if (i > 0) {
                str = V.e(str, ", ");
            }
            str = str + c0296d.f3587h0;
        }
        return V.e(str, "}");
    }
}
