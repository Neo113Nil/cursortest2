package s;

import androidx.fragment.app.w0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f3209s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f3210t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3211u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3212v0;

    @Override // s.d
    public final boolean A() {
        return this.f3212v0;
    }

    @Override // s.d
    public final boolean B() {
        return this.f3212v0;
    }

    public final boolean T() {
        int i4;
        int i5;
        int i6;
        boolean z3 = true;
        int i7 = 0;
        while (true) {
            i4 = this.f3312r0;
            if (i7 >= i4) {
                break;
            }
            d dVar = this.f3311q0[i7];
            if ((this.f3210t0 || dVar.c()) && ((((i5 = this.f3209s0) == 0 || i5 == 1) && !dVar.A()) || (((i6 = this.f3209s0) == 2 || i6 == 3) && !dVar.B()))) {
                z3 = false;
            }
            i7++;
        }
        if (!z3 || i4 <= 0) {
            return false;
        }
        int i8 = 0;
        boolean z4 = false;
        for (int i9 = 0; i9 < this.f3312r0; i9++) {
            d dVar2 = this.f3311q0[i9];
            if (this.f3210t0 || dVar2.c()) {
                if (!z4) {
                    int i10 = this.f3209s0;
                    if (i10 == 0) {
                        i8 = dVar2.i(2).d();
                    } else if (i10 == 1) {
                        i8 = dVar2.i(4).d();
                    } else if (i10 == 2) {
                        i8 = dVar2.i(3).d();
                    } else if (i10 == 3) {
                        i8 = dVar2.i(5).d();
                    }
                    z4 = true;
                }
                int i11 = this.f3209s0;
                if (i11 == 0) {
                    i8 = Math.min(i8, dVar2.i(2).d());
                } else if (i11 == 1) {
                    i8 = Math.max(i8, dVar2.i(4).d());
                } else if (i11 == 2) {
                    i8 = Math.min(i8, dVar2.i(3).d());
                } else if (i11 == 3) {
                    i8 = Math.max(i8, dVar2.i(5).d());
                }
            }
        }
        int i12 = i8 + this.f3211u0;
        int i13 = this.f3209s0;
        if (i13 == 0 || i13 == 1) {
            J(i12, i12);
        } else {
            K(i12, i12);
        }
        this.f3212v0 = true;
        return true;
    }

    public final int U() {
        int i4 = this.f3209s0;
        if (i4 == 0 || i4 == 1) {
            return 0;
        }
        return (i4 == 2 || i4 == 3) ? 1 : -1;
    }

    @Override // s.d
    public final void b(q.c cVar, boolean z3) {
        boolean z4;
        int i4;
        int i5;
        c[] cVarArr = this.Q;
        c cVar2 = this.I;
        cVarArr[0] = cVar2;
        int i6 = 2;
        c cVar3 = this.J;
        cVarArr[2] = cVar3;
        c cVar4 = this.K;
        cVarArr[1] = cVar4;
        c cVar5 = this.L;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.f3232i = cVar.k(cVar6);
        }
        int i7 = this.f3209s0;
        if (i7 < 0 || i7 >= 4) {
            return;
        }
        c cVar7 = cVarArr[i7];
        if (!this.f3212v0) {
            T();
        }
        if (this.f3212v0) {
            this.f3212v0 = false;
            int i8 = this.f3209s0;
            if (i8 == 0 || i8 == 1) {
                cVar.d(cVar2.f3232i, this.Y);
                cVar.d(cVar4.f3232i, this.Y);
                return;
            } else {
                if (i8 == 2 || i8 == 3) {
                    cVar.d(cVar3.f3232i, this.Z);
                    cVar.d(cVar5.f3232i, this.Z);
                    return;
                }
                return;
            }
        }
        for (int i9 = 0; i9 < this.f3312r0; i9++) {
            d dVar = this.f3311q0[i9];
            if ((this.f3210t0 || dVar.c()) && ((((i5 = this.f3209s0) == 0 || i5 == 1) && dVar.f3259p0[0] == 3 && dVar.I.f3231f != null && dVar.K.f3231f != null) || ((i5 == 2 || i5 == 3) && dVar.f3259p0[1] == 3 && dVar.J.f3231f != null && dVar.L.f3231f != null))) {
                z4 = true;
                break;
            }
        }
        z4 = false;
        boolean z5 = cVar2.g() || cVar4.g();
        boolean z6 = cVar3.g() || cVar5.g();
        int i10 = !(!z4 && (((i4 = this.f3209s0) == 0 && z5) || ((i4 == 2 && z6) || ((i4 == 1 && z5) || (i4 == 3 && z6))))) ? 4 : 5;
        int i11 = 0;
        while (i11 < this.f3312r0) {
            d dVar2 = this.f3311q0[i11];
            if (this.f3210t0 || dVar2.c()) {
                q.f k4 = cVar.k(dVar2.Q[this.f3209s0]);
                c[] cVarArr2 = dVar2.Q;
                int i12 = this.f3209s0;
                c cVar8 = cVarArr2[i12];
                cVar8.f3232i = k4;
                c cVar9 = cVar8.f3231f;
                int i13 = (cVar9 == null || cVar9.f3229d != this) ? 0 : cVar8.g;
                if (i12 == 0 || i12 == i6) {
                    q.f fVar = cVar7.f3232i;
                    int i14 = this.f3211u0 - i13;
                    q.b l4 = cVar.l();
                    q.f m4 = cVar.m();
                    m4.f3083i = 0;
                    l4.c(fVar, k4, m4, i14);
                    cVar.c(l4);
                } else {
                    q.f fVar2 = cVar7.f3232i;
                    int i15 = this.f3211u0 + i13;
                    q.b l5 = cVar.l();
                    q.f m5 = cVar.m();
                    m5.f3083i = 0;
                    l5.b(fVar2, k4, m5, i15);
                    cVar.c(l5);
                }
                cVar.e(cVar7.f3232i, k4, this.f3211u0 + i13, i10);
            }
            i11++;
            i6 = 2;
        }
        int i16 = this.f3209s0;
        if (i16 == 0) {
            cVar.e(cVar4.f3232i, cVar2.f3232i, 0, 8);
            cVar.e(cVar2.f3232i, this.T.K.f3232i, 0, 4);
            cVar.e(cVar2.f3232i, this.T.I.f3232i, 0, 0);
            return;
        }
        if (i16 == 1) {
            cVar.e(cVar2.f3232i, cVar4.f3232i, 0, 8);
            cVar.e(cVar2.f3232i, this.T.I.f3232i, 0, 4);
            cVar.e(cVar2.f3232i, this.T.K.f3232i, 0, 0);
        } else if (i16 == 2) {
            cVar.e(cVar5.f3232i, cVar3.f3232i, 0, 8);
            cVar.e(cVar3.f3232i, this.T.L.f3232i, 0, 4);
            cVar.e(cVar3.f3232i, this.T.J.f3232i, 0, 0);
        } else if (i16 == 3) {
            cVar.e(cVar3.f3232i, cVar5.f3232i, 0, 8);
            cVar.e(cVar3.f3232i, this.T.J.f3232i, 0, 4);
            cVar.e(cVar3.f3232i, this.T.L.f3232i, 0, 0);
        }
    }

    @Override // s.d
    public final boolean c() {
        return true;
    }

    @Override // s.d
    public final String toString() {
        String str = "[Barrier] " + this.f3243h0 + " {";
        for (int i4 = 0; i4 < this.f3312r0; i4++) {
            d dVar = this.f3311q0[i4];
            if (i4 > 0) {
                str = w0.f(str, ", ");
            }
            str = str + dVar.f3243h0;
        }
        return w0.f(str, "}");
    }
}
