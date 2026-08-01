package s;

import X.V;
import q.C0270b;
import q.C0271c;
import q.C0274f;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0278a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f3579s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f3580t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3581u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3582v0;

    @Override // s.C0281d
    public final boolean A() {
        return this.f3582v0;
    }

    @Override // s.C0281d
    public final boolean B() {
        return this.f3582v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z2 = true;
        int i4 = 0;
        while (true) {
            i = this.f3739r0;
            if (i4 >= i) {
                break;
            }
            C0281d c0281d = this.f3738q0[i4];
            if ((this.f3580t0 || c0281d.c()) && ((((i2 = this.f3579s0) == 0 || i2 == 1) && !c0281d.A()) || (((i3 = this.f3579s0) == 2 || i3 == 3) && !c0281d.B()))) {
                z2 = false;
            }
            i4++;
        }
        if (!z2 || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z3 = false;
        for (int i6 = 0; i6 < this.f3739r0; i6++) {
            C0281d c0281d2 = this.f3738q0[i6];
            if (this.f3580t0 || c0281d2.c()) {
                if (!z3) {
                    int i7 = this.f3579s0;
                    if (i7 == 0) {
                        i5 = c0281d2.i(2).d();
                    } else if (i7 == 1) {
                        i5 = c0281d2.i(4).d();
                    } else if (i7 == 2) {
                        i5 = c0281d2.i(3).d();
                    } else if (i7 == 3) {
                        i5 = c0281d2.i(5).d();
                    }
                    z3 = true;
                }
                int i8 = this.f3579s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, c0281d2.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, c0281d2.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, c0281d2.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, c0281d2.i(5).d());
                }
            }
        }
        int i9 = i5 + this.f3581u0;
        int i10 = this.f3579s0;
        if (i10 == 0 || i10 == 1) {
            J(i9, i9);
        } else {
            K(i9, i9);
        }
        this.f3582v0 = true;
        return true;
    }

    public final int U() {
        int i = this.f3579s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // s.C0281d
    public final void b(C0271c c0271c, boolean z2) {
        boolean z3;
        int i;
        int i2;
        C0280c[] c0280cArr = this.f3618Q;
        C0280c c0280c = this.f3610I;
        c0280cArr[0] = c0280c;
        C0280c c0280c2 = this.f3611J;
        int i3 = 2;
        c0280cArr[2] = c0280c2;
        C0280c c0280c3 = this.f3612K;
        c0280cArr[1] = c0280c3;
        C0280c c0280c4 = this.f3613L;
        c0280cArr[3] = c0280c4;
        for (C0280c c0280c5 : c0280cArr) {
            c0280c5.i = c0271c.k(c0280c5);
        }
        int i4 = this.f3579s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0280c c0280c6 = c0280cArr[i4];
        if (!this.f3582v0) {
            T();
        }
        if (this.f3582v0) {
            this.f3582v0 = false;
            int i5 = this.f3579s0;
            if (i5 == 0 || i5 == 1) {
                c0271c.d(c0280c.i, this.f3626Y);
                c0271c.d(c0280c3.i, this.f3626Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c0271c.d(c0280c2.i, this.f3627Z);
                    c0271c.d(c0280c4.i, this.f3627Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.f3739r0; i6++) {
            C0281d c0281d = this.f3738q0[i6];
            if ((this.f3580t0 || c0281d.c()) && ((((i2 = this.f3579s0) == 0 || i2 == 1) && c0281d.f3654p0[0] == 3 && c0281d.f3610I.f3601f != null && c0281d.f3612K.f3601f != null) || ((i2 == 2 || i2 == 3) && c0281d.f3654p0[1] == 3 && c0281d.f3611J.f3601f != null && c0281d.f3613L.f3601f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = c0280c.g() || c0280c3.g();
        boolean z5 = c0280c2.g() || c0280c4.g();
        int i7 = (z3 || !(((i = this.f3579s0) == 0 && z4) || ((i == 2 && z5) || ((i == 1 && z4) || (i == 3 && z5))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f3739r0) {
            C0281d c0281d2 = this.f3738q0[i8];
            if (this.f3580t0 || c0281d2.c()) {
                C0274f k2 = c0271c.k(c0281d2.f3618Q[this.f3579s0]);
                int i9 = this.f3579s0;
                C0280c c0280c7 = c0281d2.f3618Q[i9];
                c0280c7.i = k2;
                C0280c c0280c8 = c0280c7.f3601f;
                int i10 = (c0280c8 == null || c0280c8.d != this) ? 0 : c0280c7.f3602g;
                if (i9 == 0 || i9 == i3) {
                    C0274f c0274f = c0280c6.i;
                    int i11 = this.f3581u0 - i10;
                    C0270b l2 = c0271c.l();
                    C0274f m2 = c0271c.m();
                    m2.d = 0;
                    l2.c(c0274f, k2, m2, i11);
                    c0271c.c(l2);
                } else {
                    C0274f c0274f2 = c0280c6.i;
                    int i12 = this.f3581u0 + i10;
                    C0270b l3 = c0271c.l();
                    C0274f m3 = c0271c.m();
                    m3.d = 0;
                    l3.b(c0274f2, k2, m3, i12);
                    c0271c.c(l3);
                }
                c0271c.e(c0280c6.i, k2, this.f3581u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f3579s0;
        if (i13 == 0) {
            c0271c.e(c0280c3.i, c0280c.i, 0, 8);
            c0271c.e(c0280c.i, this.f3621T.f3612K.i, 0, 4);
            c0271c.e(c0280c.i, this.f3621T.f3610I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            c0271c.e(c0280c.i, c0280c3.i, 0, 8);
            c0271c.e(c0280c.i, this.f3621T.f3610I.i, 0, 4);
            c0271c.e(c0280c.i, this.f3621T.f3612K.i, 0, 0);
        } else if (i13 == 2) {
            c0271c.e(c0280c4.i, c0280c2.i, 0, 8);
            c0271c.e(c0280c2.i, this.f3621T.f3613L.i, 0, 4);
            c0271c.e(c0280c2.i, this.f3621T.f3611J.i, 0, 0);
        } else if (i13 == 3) {
            c0271c.e(c0280c2.i, c0280c4.i, 0, 8);
            c0271c.e(c0280c2.i, this.f3621T.f3611J.i, 0, 4);
            c0271c.e(c0280c2.i, this.f3621T.f3613L.i, 0, 0);
        }
    }

    @Override // s.C0281d
    public final boolean c() {
        return true;
    }

    @Override // s.C0281d
    public final String toString() {
        String str = "[Barrier] " + this.f3641h0 + " {";
        for (int i = 0; i < this.f3739r0; i++) {
            C0281d c0281d = this.f3738q0[i];
            if (i > 0) {
                str = V.e(str, ", ");
            }
            str = str + c0281d.f3641h0;
        }
        return V.e(str, "}");
    }
}
