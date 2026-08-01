package u;

import s.C0264b;
import s.C0265c;
import s.C0268f;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f3617s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f3618t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3619u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3620v0;

    @Override // u.C0275d
    public final boolean A() {
        return this.f3620v0;
    }

    @Override // u.C0275d
    public final boolean B() {
        return this.f3620v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z2 = true;
        int i4 = 0;
        while (true) {
            i = this.f3780r0;
            if (i4 >= i) {
                break;
            }
            C0275d c0275d = this.f3779q0[i4];
            if ((this.f3618t0 || c0275d.c()) && ((((i2 = this.f3617s0) == 0 || i2 == 1) && !c0275d.A()) || (((i3 = this.f3617s0) == 2 || i3 == 3) && !c0275d.B()))) {
                z2 = false;
            }
            i4++;
        }
        if (!z2 || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z3 = false;
        for (int i6 = 0; i6 < this.f3780r0; i6++) {
            C0275d c0275d2 = this.f3779q0[i6];
            if (this.f3618t0 || c0275d2.c()) {
                if (!z3) {
                    int i7 = this.f3617s0;
                    if (i7 == 0) {
                        i5 = c0275d2.i(2).d();
                    } else if (i7 == 1) {
                        i5 = c0275d2.i(4).d();
                    } else if (i7 == 2) {
                        i5 = c0275d2.i(3).d();
                    } else if (i7 == 3) {
                        i5 = c0275d2.i(5).d();
                    }
                    z3 = true;
                }
                int i8 = this.f3617s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, c0275d2.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, c0275d2.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, c0275d2.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, c0275d2.i(5).d());
                }
            }
        }
        int i9 = i5 + this.f3619u0;
        int i10 = this.f3617s0;
        if (i10 == 0 || i10 == 1) {
            J(i9, i9);
        } else {
            K(i9, i9);
        }
        this.f3620v0 = true;
        return true;
    }

    public final int U() {
        int i = this.f3617s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // u.C0275d
    public final void b(C0265c c0265c, boolean z2) {
        boolean z3;
        int i;
        int i2;
        C0274c[] c0274cArr = this.f3656Q;
        C0274c c0274c = this.f3648I;
        c0274cArr[0] = c0274c;
        C0274c c0274c2 = this.f3649J;
        int i3 = 2;
        c0274cArr[2] = c0274c2;
        C0274c c0274c3 = this.f3650K;
        c0274cArr[1] = c0274c3;
        C0274c c0274c4 = this.f3651L;
        c0274cArr[3] = c0274c4;
        for (C0274c c0274c5 : c0274cArr) {
            c0274c5.i = c0265c.k(c0274c5);
        }
        int i4 = this.f3617s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0274c c0274c6 = c0274cArr[i4];
        if (!this.f3620v0) {
            T();
        }
        if (this.f3620v0) {
            this.f3620v0 = false;
            int i5 = this.f3617s0;
            if (i5 == 0 || i5 == 1) {
                c0265c.d(c0274c.i, this.f3664Y);
                c0265c.d(c0274c3.i, this.f3664Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c0265c.d(c0274c2.i, this.f3665Z);
                    c0265c.d(c0274c4.i, this.f3665Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.f3780r0; i6++) {
            C0275d c0275d = this.f3779q0[i6];
            if ((this.f3618t0 || c0275d.c()) && ((((i2 = this.f3617s0) == 0 || i2 == 1) && c0275d.p0[0] == 3 && c0275d.f3648I.f3639f != null && c0275d.f3650K.f3639f != null) || ((i2 == 2 || i2 == 3) && c0275d.p0[1] == 3 && c0275d.f3649J.f3639f != null && c0275d.f3651L.f3639f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = c0274c.g() || c0274c3.g();
        boolean z5 = c0274c2.g() || c0274c4.g();
        int i7 = (z3 || !(((i = this.f3617s0) == 0 && z4) || ((i == 2 && z5) || ((i == 1 && z4) || (i == 3 && z5))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f3780r0) {
            C0275d c0275d2 = this.f3779q0[i8];
            if (this.f3618t0 || c0275d2.c()) {
                C0268f k2 = c0265c.k(c0275d2.f3656Q[this.f3617s0]);
                int i9 = this.f3617s0;
                C0274c c0274c7 = c0275d2.f3656Q[i9];
                c0274c7.i = k2;
                C0274c c0274c8 = c0274c7.f3639f;
                int i10 = (c0274c8 == null || c0274c8.d != this) ? 0 : c0274c7.f3640g;
                if (i9 == 0 || i9 == i3) {
                    C0268f c0268f = c0274c6.i;
                    int i11 = this.f3619u0 - i10;
                    C0264b l2 = c0265c.l();
                    C0268f m2 = c0265c.m();
                    m2.d = 0;
                    l2.c(c0268f, k2, m2, i11);
                    c0265c.c(l2);
                } else {
                    C0268f c0268f2 = c0274c6.i;
                    int i12 = this.f3619u0 + i10;
                    C0264b l3 = c0265c.l();
                    C0268f m3 = c0265c.m();
                    m3.d = 0;
                    l3.b(c0268f2, k2, m3, i12);
                    c0265c.c(l3);
                }
                c0265c.e(c0274c6.i, k2, this.f3619u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f3617s0;
        if (i13 == 0) {
            c0265c.e(c0274c3.i, c0274c.i, 0, 8);
            c0265c.e(c0274c.i, this.f3659T.f3650K.i, 0, 4);
            c0265c.e(c0274c.i, this.f3659T.f3648I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            c0265c.e(c0274c.i, c0274c3.i, 0, 8);
            c0265c.e(c0274c.i, this.f3659T.f3648I.i, 0, 4);
            c0265c.e(c0274c.i, this.f3659T.f3650K.i, 0, 0);
        } else if (i13 == 2) {
            c0265c.e(c0274c4.i, c0274c2.i, 0, 8);
            c0265c.e(c0274c2.i, this.f3659T.f3651L.i, 0, 4);
            c0265c.e(c0274c2.i, this.f3659T.f3649J.i, 0, 0);
        } else if (i13 == 3) {
            c0265c.e(c0274c2.i, c0274c4.i, 0, 8);
            c0265c.e(c0274c2.i, this.f3659T.f3649J.i, 0, 4);
            c0265c.e(c0274c2.i, this.f3659T.f3651L.i, 0, 0);
        }
    }

    @Override // u.C0275d
    public final boolean c() {
        return true;
    }

    @Override // u.C0275d
    public final String toString() {
        String str = "[Barrier] " + this.f3679h0 + " {";
        for (int i = 0; i < this.f3780r0; i++) {
            C0275d c0275d = this.f3779q0[i];
            if (i > 0) {
                str = X0.a.f(str, ", ");
            }
            str = str + c0275d.f3679h0;
        }
        return X0.a.f(str, "}");
    }
}
