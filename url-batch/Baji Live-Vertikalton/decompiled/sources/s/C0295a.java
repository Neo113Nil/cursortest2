package s;

import X.V;
import q.C0287b;
import q.C0288c;
import q.C0291f;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f3567s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f3568t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3569u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3570v0;

    @Override // s.C0298d
    public final boolean A() {
        return this.f3570v0;
    }

    @Override // s.C0298d
    public final boolean B() {
        return this.f3570v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z2 = true;
        int i4 = 0;
        while (true) {
            i = this.f3729r0;
            if (i4 >= i) {
                break;
            }
            C0298d c0298d = this.f3728q0[i4];
            if ((this.f3568t0 || c0298d.c()) && ((((i2 = this.f3567s0) == 0 || i2 == 1) && !c0298d.A()) || (((i3 = this.f3567s0) == 2 || i3 == 3) && !c0298d.B()))) {
                z2 = false;
            }
            i4++;
        }
        if (!z2 || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z3 = false;
        for (int i6 = 0; i6 < this.f3729r0; i6++) {
            C0298d c0298d2 = this.f3728q0[i6];
            if (this.f3568t0 || c0298d2.c()) {
                if (!z3) {
                    int i7 = this.f3567s0;
                    if (i7 == 0) {
                        i5 = c0298d2.i(2).d();
                    } else if (i7 == 1) {
                        i5 = c0298d2.i(4).d();
                    } else if (i7 == 2) {
                        i5 = c0298d2.i(3).d();
                    } else if (i7 == 3) {
                        i5 = c0298d2.i(5).d();
                    }
                    z3 = true;
                }
                int i8 = this.f3567s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, c0298d2.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, c0298d2.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, c0298d2.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, c0298d2.i(5).d());
                }
            }
        }
        int i9 = i5 + this.f3569u0;
        int i10 = this.f3567s0;
        if (i10 == 0 || i10 == 1) {
            J(i9, i9);
        } else {
            K(i9, i9);
        }
        this.f3570v0 = true;
        return true;
    }

    public final int U() {
        int i = this.f3567s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // s.C0298d
    public final void b(C0288c c0288c, boolean z2) {
        boolean z3;
        int i;
        int i2;
        C0297c[] c0297cArr = this.f3606Q;
        C0297c c0297c = this.f3598I;
        c0297cArr[0] = c0297c;
        C0297c c0297c2 = this.f3599J;
        int i3 = 2;
        c0297cArr[2] = c0297c2;
        C0297c c0297c3 = this.f3600K;
        c0297cArr[1] = c0297c3;
        C0297c c0297c4 = this.f3601L;
        c0297cArr[3] = c0297c4;
        for (C0297c c0297c5 : c0297cArr) {
            c0297c5.i = c0288c.k(c0297c5);
        }
        int i4 = this.f3567s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0297c c0297c6 = c0297cArr[i4];
        if (!this.f3570v0) {
            T();
        }
        if (this.f3570v0) {
            this.f3570v0 = false;
            int i5 = this.f3567s0;
            if (i5 == 0 || i5 == 1) {
                c0288c.d(c0297c.i, this.f3614Y);
                c0288c.d(c0297c3.i, this.f3614Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c0288c.d(c0297c2.i, this.f3615Z);
                    c0288c.d(c0297c4.i, this.f3615Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.f3729r0; i6++) {
            C0298d c0298d = this.f3728q0[i6];
            if ((this.f3568t0 || c0298d.c()) && ((((i2 = this.f3567s0) == 0 || i2 == 1) && c0298d.f3643p0[0] == 3 && c0298d.f3598I.f3589f != null && c0298d.f3600K.f3589f != null) || ((i2 == 2 || i2 == 3) && c0298d.f3643p0[1] == 3 && c0298d.f3599J.f3589f != null && c0298d.f3601L.f3589f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = c0297c.g() || c0297c3.g();
        boolean z5 = c0297c2.g() || c0297c4.g();
        int i7 = (z3 || !(((i = this.f3567s0) == 0 && z4) || ((i == 2 && z5) || ((i == 1 && z4) || (i == 3 && z5))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f3729r0) {
            C0298d c0298d2 = this.f3728q0[i8];
            if (this.f3568t0 || c0298d2.c()) {
                C0291f k2 = c0288c.k(c0298d2.f3606Q[this.f3567s0]);
                int i9 = this.f3567s0;
                C0297c c0297c7 = c0298d2.f3606Q[i9];
                c0297c7.i = k2;
                C0297c c0297c8 = c0297c7.f3589f;
                int i10 = (c0297c8 == null || c0297c8.d != this) ? 0 : c0297c7.f3590g;
                if (i9 == 0 || i9 == i3) {
                    C0291f c0291f = c0297c6.i;
                    int i11 = this.f3569u0 - i10;
                    C0287b l2 = c0288c.l();
                    C0291f m2 = c0288c.m();
                    m2.d = 0;
                    l2.c(c0291f, k2, m2, i11);
                    c0288c.c(l2);
                } else {
                    C0291f c0291f2 = c0297c6.i;
                    int i12 = this.f3569u0 + i10;
                    C0287b l3 = c0288c.l();
                    C0291f m3 = c0288c.m();
                    m3.d = 0;
                    l3.b(c0291f2, k2, m3, i12);
                    c0288c.c(l3);
                }
                c0288c.e(c0297c6.i, k2, this.f3569u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f3567s0;
        if (i13 == 0) {
            c0288c.e(c0297c3.i, c0297c.i, 0, 8);
            c0288c.e(c0297c.i, this.f3609T.f3600K.i, 0, 4);
            c0288c.e(c0297c.i, this.f3609T.f3598I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            c0288c.e(c0297c.i, c0297c3.i, 0, 8);
            c0288c.e(c0297c.i, this.f3609T.f3598I.i, 0, 4);
            c0288c.e(c0297c.i, this.f3609T.f3600K.i, 0, 0);
        } else if (i13 == 2) {
            c0288c.e(c0297c4.i, c0297c2.i, 0, 8);
            c0288c.e(c0297c2.i, this.f3609T.f3601L.i, 0, 4);
            c0288c.e(c0297c2.i, this.f3609T.f3599J.i, 0, 0);
        } else if (i13 == 3) {
            c0288c.e(c0297c2.i, c0297c4.i, 0, 8);
            c0288c.e(c0297c2.i, this.f3609T.f3599J.i, 0, 4);
            c0288c.e(c0297c2.i, this.f3609T.f3601L.i, 0, 0);
        }
    }

    @Override // s.C0298d
    public final boolean c() {
        return true;
    }

    @Override // s.C0298d
    public final String toString() {
        String str = "[Barrier] " + this.f3629h0 + " {";
        for (int i = 0; i < this.f3729r0; i++) {
            C0298d c0298d = this.f3728q0[i];
            if (i > 0) {
                str = V.e(str, ", ");
            }
            str = str + c0298d.f3629h0;
        }
        return V.e(str, "}");
    }
}
