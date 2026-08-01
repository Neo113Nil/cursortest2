package s;

import X.V;
import q.C0288b;
import q.C0289c;
import q.C0292f;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f3573s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f3574t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3575u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3576v0;

    @Override // s.C0299d
    public final boolean A() {
        return this.f3576v0;
    }

    @Override // s.C0299d
    public final boolean B() {
        return this.f3576v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z2 = true;
        int i4 = 0;
        while (true) {
            i = this.f3735r0;
            if (i4 >= i) {
                break;
            }
            C0299d c0299d = this.f3734q0[i4];
            if ((this.f3574t0 || c0299d.c()) && ((((i2 = this.f3573s0) == 0 || i2 == 1) && !c0299d.A()) || (((i3 = this.f3573s0) == 2 || i3 == 3) && !c0299d.B()))) {
                z2 = false;
            }
            i4++;
        }
        if (!z2 || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z3 = false;
        for (int i6 = 0; i6 < this.f3735r0; i6++) {
            C0299d c0299d2 = this.f3734q0[i6];
            if (this.f3574t0 || c0299d2.c()) {
                if (!z3) {
                    int i7 = this.f3573s0;
                    if (i7 == 0) {
                        i5 = c0299d2.i(2).d();
                    } else if (i7 == 1) {
                        i5 = c0299d2.i(4).d();
                    } else if (i7 == 2) {
                        i5 = c0299d2.i(3).d();
                    } else if (i7 == 3) {
                        i5 = c0299d2.i(5).d();
                    }
                    z3 = true;
                }
                int i8 = this.f3573s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, c0299d2.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, c0299d2.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, c0299d2.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, c0299d2.i(5).d());
                }
            }
        }
        int i9 = i5 + this.f3575u0;
        int i10 = this.f3573s0;
        if (i10 == 0 || i10 == 1) {
            J(i9, i9);
        } else {
            K(i9, i9);
        }
        this.f3576v0 = true;
        return true;
    }

    public final int U() {
        int i = this.f3573s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // s.C0299d
    public final void b(C0289c c0289c, boolean z2) {
        boolean z3;
        int i;
        int i2;
        C0298c[] c0298cArr = this.f3612Q;
        C0298c c0298c = this.f3604I;
        c0298cArr[0] = c0298c;
        C0298c c0298c2 = this.f3605J;
        int i3 = 2;
        c0298cArr[2] = c0298c2;
        C0298c c0298c3 = this.f3606K;
        c0298cArr[1] = c0298c3;
        C0298c c0298c4 = this.f3607L;
        c0298cArr[3] = c0298c4;
        for (C0298c c0298c5 : c0298cArr) {
            c0298c5.i = c0289c.k(c0298c5);
        }
        int i4 = this.f3573s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0298c c0298c6 = c0298cArr[i4];
        if (!this.f3576v0) {
            T();
        }
        if (this.f3576v0) {
            this.f3576v0 = false;
            int i5 = this.f3573s0;
            if (i5 == 0 || i5 == 1) {
                c0289c.d(c0298c.i, this.f3620Y);
                c0289c.d(c0298c3.i, this.f3620Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c0289c.d(c0298c2.i, this.f3621Z);
                    c0289c.d(c0298c4.i, this.f3621Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.f3735r0; i6++) {
            C0299d c0299d = this.f3734q0[i6];
            if ((this.f3574t0 || c0299d.c()) && ((((i2 = this.f3573s0) == 0 || i2 == 1) && c0299d.f3649p0[0] == 3 && c0299d.f3604I.f3595f != null && c0299d.f3606K.f3595f != null) || ((i2 == 2 || i2 == 3) && c0299d.f3649p0[1] == 3 && c0299d.f3605J.f3595f != null && c0299d.f3607L.f3595f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = c0298c.g() || c0298c3.g();
        boolean z5 = c0298c2.g() || c0298c4.g();
        int i7 = (z3 || !(((i = this.f3573s0) == 0 && z4) || ((i == 2 && z5) || ((i == 1 && z4) || (i == 3 && z5))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f3735r0) {
            C0299d c0299d2 = this.f3734q0[i8];
            if (this.f3574t0 || c0299d2.c()) {
                C0292f k2 = c0289c.k(c0299d2.f3612Q[this.f3573s0]);
                int i9 = this.f3573s0;
                C0298c c0298c7 = c0299d2.f3612Q[i9];
                c0298c7.i = k2;
                C0298c c0298c8 = c0298c7.f3595f;
                int i10 = (c0298c8 == null || c0298c8.d != this) ? 0 : c0298c7.f3596g;
                if (i9 == 0 || i9 == i3) {
                    C0292f c0292f = c0298c6.i;
                    int i11 = this.f3575u0 - i10;
                    C0288b l2 = c0289c.l();
                    C0292f m2 = c0289c.m();
                    m2.d = 0;
                    l2.c(c0292f, k2, m2, i11);
                    c0289c.c(l2);
                } else {
                    C0292f c0292f2 = c0298c6.i;
                    int i12 = this.f3575u0 + i10;
                    C0288b l3 = c0289c.l();
                    C0292f m3 = c0289c.m();
                    m3.d = 0;
                    l3.b(c0292f2, k2, m3, i12);
                    c0289c.c(l3);
                }
                c0289c.e(c0298c6.i, k2, this.f3575u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f3573s0;
        if (i13 == 0) {
            c0289c.e(c0298c3.i, c0298c.i, 0, 8);
            c0289c.e(c0298c.i, this.f3615T.f3606K.i, 0, 4);
            c0289c.e(c0298c.i, this.f3615T.f3604I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            c0289c.e(c0298c.i, c0298c3.i, 0, 8);
            c0289c.e(c0298c.i, this.f3615T.f3604I.i, 0, 4);
            c0289c.e(c0298c.i, this.f3615T.f3606K.i, 0, 0);
        } else if (i13 == 2) {
            c0289c.e(c0298c4.i, c0298c2.i, 0, 8);
            c0289c.e(c0298c2.i, this.f3615T.f3607L.i, 0, 4);
            c0289c.e(c0298c2.i, this.f3615T.f3605J.i, 0, 0);
        } else if (i13 == 3) {
            c0289c.e(c0298c2.i, c0298c4.i, 0, 8);
            c0289c.e(c0298c2.i, this.f3615T.f3605J.i, 0, 4);
            c0289c.e(c0298c2.i, this.f3615T.f3607L.i, 0, 0);
        }
    }

    @Override // s.C0299d
    public final boolean c() {
        return true;
    }

    @Override // s.C0299d
    public final String toString() {
        String str = "[Barrier] " + this.f3635h0 + " {";
        for (int i = 0; i < this.f3735r0; i++) {
            C0299d c0299d = this.f3734q0[i];
            if (i > 0) {
                str = V.e(str, ", ");
            }
            str = str + c0299d.f3635h0;
        }
        return V.e(str, "}");
    }
}
