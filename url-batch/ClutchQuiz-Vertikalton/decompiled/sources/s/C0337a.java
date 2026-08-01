package s;

import X.V;
import q.C0314b;
import q.C0315c;
import q.C0318f;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0337a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f3473s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f3474t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3475u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3476v0;

    @Override // s.C0340d
    public final boolean A() {
        return this.f3476v0;
    }

    @Override // s.C0340d
    public final boolean B() {
        return this.f3476v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z2 = true;
        int i4 = 0;
        while (true) {
            i = this.f3633r0;
            if (i4 >= i) {
                break;
            }
            C0340d c0340d = this.q0[i4];
            if ((this.f3474t0 || c0340d.c()) && ((((i2 = this.f3473s0) == 0 || i2 == 1) && !c0340d.A()) || (((i3 = this.f3473s0) == 2 || i3 == 3) && !c0340d.B()))) {
                z2 = false;
            }
            i4++;
        }
        if (!z2 || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z3 = false;
        for (int i6 = 0; i6 < this.f3633r0; i6++) {
            C0340d c0340d2 = this.q0[i6];
            if (this.f3474t0 || c0340d2.c()) {
                if (!z3) {
                    int i7 = this.f3473s0;
                    if (i7 == 0) {
                        i5 = c0340d2.i(2).d();
                    } else if (i7 == 1) {
                        i5 = c0340d2.i(4).d();
                    } else if (i7 == 2) {
                        i5 = c0340d2.i(3).d();
                    } else if (i7 == 3) {
                        i5 = c0340d2.i(5).d();
                    }
                    z3 = true;
                }
                int i8 = this.f3473s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, c0340d2.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, c0340d2.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, c0340d2.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, c0340d2.i(5).d());
                }
            }
        }
        int i9 = i5 + this.f3475u0;
        int i10 = this.f3473s0;
        if (i10 == 0 || i10 == 1) {
            J(i9, i9);
        } else {
            K(i9, i9);
        }
        this.f3476v0 = true;
        return true;
    }

    public final int U() {
        int i = this.f3473s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // s.C0340d
    public final void b(C0315c c0315c, boolean z2) {
        boolean z3;
        int i;
        int i2;
        C0339c[] c0339cArr = this.f3512Q;
        C0339c c0339c = this.f3504I;
        c0339cArr[0] = c0339c;
        C0339c c0339c2 = this.f3505J;
        int i3 = 2;
        c0339cArr[2] = c0339c2;
        C0339c c0339c3 = this.f3506K;
        c0339cArr[1] = c0339c3;
        C0339c c0339c4 = this.f3507L;
        c0339cArr[3] = c0339c4;
        for (C0339c c0339c5 : c0339cArr) {
            c0339c5.i = c0315c.k(c0339c5);
        }
        int i4 = this.f3473s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0339c c0339c6 = c0339cArr[i4];
        if (!this.f3476v0) {
            T();
        }
        if (this.f3476v0) {
            this.f3476v0 = false;
            int i5 = this.f3473s0;
            if (i5 == 0 || i5 == 1) {
                c0315c.d(c0339c.i, this.f3520Y);
                c0315c.d(c0339c3.i, this.f3520Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c0315c.d(c0339c2.i, this.f3521Z);
                    c0315c.d(c0339c4.i, this.f3521Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.f3633r0; i6++) {
            C0340d c0340d = this.q0[i6];
            if ((this.f3474t0 || c0340d.c()) && ((((i2 = this.f3473s0) == 0 || i2 == 1) && c0340d.f3549p0[0] == 3 && c0340d.f3504I.f3495f != null && c0340d.f3506K.f3495f != null) || ((i2 == 2 || i2 == 3) && c0340d.f3549p0[1] == 3 && c0340d.f3505J.f3495f != null && c0340d.f3507L.f3495f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = c0339c.g() || c0339c3.g();
        boolean z5 = c0339c2.g() || c0339c4.g();
        int i7 = (z3 || !(((i = this.f3473s0) == 0 && z4) || ((i == 2 && z5) || ((i == 1 && z4) || (i == 3 && z5))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f3633r0) {
            C0340d c0340d2 = this.q0[i8];
            if (this.f3474t0 || c0340d2.c()) {
                C0318f k2 = c0315c.k(c0340d2.f3512Q[this.f3473s0]);
                int i9 = this.f3473s0;
                C0339c c0339c7 = c0340d2.f3512Q[i9];
                c0339c7.i = k2;
                C0339c c0339c8 = c0339c7.f3495f;
                int i10 = (c0339c8 == null || c0339c8.d != this) ? 0 : c0339c7.f3496g;
                if (i9 == 0 || i9 == i3) {
                    C0318f c0318f = c0339c6.i;
                    int i11 = this.f3475u0 - i10;
                    C0314b l2 = c0315c.l();
                    C0318f m2 = c0315c.m();
                    m2.d = 0;
                    l2.c(c0318f, k2, m2, i11);
                    c0315c.c(l2);
                } else {
                    C0318f c0318f2 = c0339c6.i;
                    int i12 = this.f3475u0 + i10;
                    C0314b l3 = c0315c.l();
                    C0318f m3 = c0315c.m();
                    m3.d = 0;
                    l3.b(c0318f2, k2, m3, i12);
                    c0315c.c(l3);
                }
                c0315c.e(c0339c6.i, k2, this.f3475u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f3473s0;
        if (i13 == 0) {
            c0315c.e(c0339c3.i, c0339c.i, 0, 8);
            c0315c.e(c0339c.i, this.f3515T.f3506K.i, 0, 4);
            c0315c.e(c0339c.i, this.f3515T.f3504I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            c0315c.e(c0339c.i, c0339c3.i, 0, 8);
            c0315c.e(c0339c.i, this.f3515T.f3504I.i, 0, 4);
            c0315c.e(c0339c.i, this.f3515T.f3506K.i, 0, 0);
        } else if (i13 == 2) {
            c0315c.e(c0339c4.i, c0339c2.i, 0, 8);
            c0315c.e(c0339c2.i, this.f3515T.f3507L.i, 0, 4);
            c0315c.e(c0339c2.i, this.f3515T.f3505J.i, 0, 0);
        } else if (i13 == 3) {
            c0315c.e(c0339c2.i, c0339c4.i, 0, 8);
            c0315c.e(c0339c2.i, this.f3515T.f3505J.i, 0, 4);
            c0315c.e(c0339c2.i, this.f3515T.f3507L.i, 0, 0);
        }
    }

    @Override // s.C0340d
    public final boolean c() {
        return true;
    }

    @Override // s.C0340d
    public final String toString() {
        String str = "[Barrier] " + this.f3535h0 + " {";
        for (int i = 0; i < this.f3633r0; i++) {
            C0340d c0340d = this.q0[i];
            if (i > 0) {
                str = V.e(str, ", ");
            }
            str = str + c0340d.f3535h0;
        }
        return V.e(str, "}");
    }
}
