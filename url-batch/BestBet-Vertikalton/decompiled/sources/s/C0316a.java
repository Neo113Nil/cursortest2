package s;

import G1.AbstractC0001b;
import q.C0306b;
import q.C0307c;
import q.C0310f;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316a extends i {
    public int s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f3846t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3847u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3848v0;

    @Override // s.d
    public final boolean A() {
        return this.f3848v0;
    }

    @Override // s.d
    public final boolean B() {
        return this.f3848v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z2 = true;
        int i4 = 0;
        while (true) {
            i = this.f4006r0;
            if (i4 >= i) {
                break;
            }
            d dVar = this.f4005q0[i4];
            if ((this.f3846t0 || dVar.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && !dVar.A()) || (((i3 = this.s0) == 2 || i3 == 3) && !dVar.B()))) {
                z2 = false;
            }
            i4++;
        }
        if (!z2 || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z3 = false;
        for (int i6 = 0; i6 < this.f4006r0; i6++) {
            d dVar2 = this.f4005q0[i6];
            if (this.f3846t0 || dVar2.c()) {
                if (!z3) {
                    int i7 = this.s0;
                    if (i7 == 0) {
                        i5 = dVar2.i(2).d();
                    } else if (i7 == 1) {
                        i5 = dVar2.i(4).d();
                    } else if (i7 == 2) {
                        i5 = dVar2.i(3).d();
                    } else if (i7 == 3) {
                        i5 = dVar2.i(5).d();
                    }
                    z3 = true;
                }
                int i8 = this.s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, dVar2.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, dVar2.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, dVar2.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, dVar2.i(5).d());
                }
            }
        }
        int i9 = i5 + this.f3847u0;
        int i10 = this.s0;
        if (i10 == 0 || i10 == 1) {
            J(i9, i9);
        } else {
            K(i9, i9);
        }
        this.f3848v0 = true;
        return true;
    }

    public final int U() {
        int i = this.s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // s.d
    public final void b(C0307c c0307c, boolean z2) {
        boolean z3;
        int i;
        int i2;
        c[] cVarArr = this.f3884Q;
        c cVar = this.f3876I;
        cVarArr[0] = cVar;
        c cVar2 = this.f3877J;
        int i3 = 2;
        cVarArr[2] = cVar2;
        c cVar3 = this.f3878K;
        cVarArr[1] = cVar3;
        c cVar4 = this.f3879L;
        cVarArr[3] = cVar4;
        for (c cVar5 : cVarArr) {
            cVar5.i = c0307c.k(cVar5);
        }
        int i4 = this.s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        c cVar6 = cVarArr[i4];
        if (!this.f3848v0) {
            T();
        }
        if (this.f3848v0) {
            this.f3848v0 = false;
            int i5 = this.s0;
            if (i5 == 0 || i5 == 1) {
                c0307c.d(cVar.i, this.f3892Y);
                c0307c.d(cVar3.i, this.f3892Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c0307c.d(cVar2.i, this.f3893Z);
                    c0307c.d(cVar4.i, this.f3893Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.f4006r0; i6++) {
            d dVar = this.f4005q0[i6];
            if ((this.f3846t0 || dVar.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && dVar.f3921p0[0] == 3 && dVar.f3876I.f3867f != null && dVar.f3878K.f3867f != null) || ((i2 == 2 || i2 == 3) && dVar.f3921p0[1] == 3 && dVar.f3877J.f3867f != null && dVar.f3879L.f3867f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = cVar.g() || cVar3.g();
        boolean z5 = cVar2.g() || cVar4.g();
        int i7 = (z3 || !(((i = this.s0) == 0 && z4) || ((i == 2 && z5) || ((i == 1 && z4) || (i == 3 && z5))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f4006r0) {
            d dVar2 = this.f4005q0[i8];
            if (this.f3846t0 || dVar2.c()) {
                C0310f k2 = c0307c.k(dVar2.f3884Q[this.s0]);
                int i9 = this.s0;
                c cVar7 = dVar2.f3884Q[i9];
                cVar7.i = k2;
                c cVar8 = cVar7.f3867f;
                int i10 = (cVar8 == null || cVar8.d != this) ? 0 : cVar7.f3868g;
                if (i9 == 0 || i9 == i3) {
                    C0310f c0310f = cVar6.i;
                    int i11 = this.f3847u0 - i10;
                    C0306b l2 = c0307c.l();
                    C0310f m2 = c0307c.m();
                    m2.d = 0;
                    l2.c(c0310f, k2, m2, i11);
                    c0307c.c(l2);
                } else {
                    C0310f c0310f2 = cVar6.i;
                    int i12 = this.f3847u0 + i10;
                    C0306b l3 = c0307c.l();
                    C0310f m3 = c0307c.m();
                    m3.d = 0;
                    l3.b(c0310f2, k2, m3, i12);
                    c0307c.c(l3);
                }
                c0307c.e(cVar6.i, k2, this.f3847u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.s0;
        if (i13 == 0) {
            c0307c.e(cVar3.i, cVar.i, 0, 8);
            c0307c.e(cVar.i, this.f3887T.f3878K.i, 0, 4);
            c0307c.e(cVar.i, this.f3887T.f3876I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            c0307c.e(cVar.i, cVar3.i, 0, 8);
            c0307c.e(cVar.i, this.f3887T.f3876I.i, 0, 4);
            c0307c.e(cVar.i, this.f3887T.f3878K.i, 0, 0);
        } else if (i13 == 2) {
            c0307c.e(cVar4.i, cVar2.i, 0, 8);
            c0307c.e(cVar2.i, this.f3887T.f3879L.i, 0, 4);
            c0307c.e(cVar2.i, this.f3887T.f3877J.i, 0, 0);
        } else if (i13 == 3) {
            c0307c.e(cVar2.i, cVar4.i, 0, 8);
            c0307c.e(cVar2.i, this.f3887T.f3877J.i, 0, 4);
            c0307c.e(cVar2.i, this.f3887T.f3879L.i, 0, 0);
        }
    }

    @Override // s.d
    public final boolean c() {
        return true;
    }

    @Override // s.d
    public final String toString() {
        String str = "[Barrier] " + this.f3907h0 + " {";
        for (int i = 0; i < this.f4006r0; i++) {
            d dVar = this.f4005q0[i];
            if (i > 0) {
                str = AbstractC0001b.g(str, ", ");
            }
            str = str + dVar.f3907h0;
        }
        return AbstractC0001b.g(str, "}");
    }
}
