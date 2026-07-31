package y2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f8719s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f8720t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f8721u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f8722v0;

    @Override // y2.d
    public final boolean A() {
        return this.f8722v0;
    }

    @Override // y2.d
    public final boolean B() {
        return this.f8722v0;
    }

    public final boolean T() {
        int i;
        int i8;
        int i9;
        boolean z3 = true;
        int i10 = 0;
        while (true) {
            i = this.f8832r0;
            if (i10 >= i) {
                break;
            }
            d dVar = this.f8831q0[i10];
            if ((this.f8720t0 || dVar.c()) && ((((i8 = this.f8719s0) == 0 || i8 == 1) && !dVar.A()) || (((i9 = this.f8719s0) == 2 || i9 == 3) && !dVar.B()))) {
                z3 = false;
            }
            i10++;
        }
        if (!z3 || i <= 0) {
            return false;
        }
        int i11 = 0;
        boolean z7 = false;
        for (int i12 = 0; i12 < this.f8832r0; i12++) {
            d dVar2 = this.f8831q0[i12];
            if (this.f8720t0 || dVar2.c()) {
                if (!z7) {
                    int i13 = this.f8719s0;
                    if (i13 == 0) {
                        i11 = dVar2.i(2).d();
                    } else if (i13 == 1) {
                        i11 = dVar2.i(4).d();
                    } else if (i13 == 2) {
                        i11 = dVar2.i(3).d();
                    } else if (i13 == 3) {
                        i11 = dVar2.i(5).d();
                    }
                    z7 = true;
                }
                int i14 = this.f8719s0;
                if (i14 == 0) {
                    i11 = Math.min(i11, dVar2.i(2).d());
                } else if (i14 == 1) {
                    i11 = Math.max(i11, dVar2.i(4).d());
                } else if (i14 == 2) {
                    i11 = Math.min(i11, dVar2.i(3).d());
                } else if (i14 == 3) {
                    i11 = Math.max(i11, dVar2.i(5).d());
                }
            }
        }
        int i15 = i11 + this.f8721u0;
        int i16 = this.f8719s0;
        if (i16 == 0 || i16 == 1) {
            J(i15, i15);
        } else {
            K(i15, i15);
        }
        this.f8722v0 = true;
        return true;
    }

    public final int U() {
        int i = this.f8719s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // y2.d
    public final void b(w2.c cVar, boolean z3) {
        boolean z7;
        int i;
        int i8;
        c[] cVarArr = this.Q;
        c cVar2 = this.I;
        cVarArr[0] = cVar2;
        int i9 = 2;
        c cVar3 = this.J;
        cVarArr[2] = cVar3;
        c cVar4 = this.K;
        cVarArr[1] = cVar4;
        c cVar5 = this.L;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.i = cVar.k(cVar6);
        }
        int i10 = this.f8719s0;
        if (i10 < 0 || i10 >= 4) {
            return;
        }
        c cVar7 = cVarArr[i10];
        if (!this.f8722v0) {
            T();
        }
        if (this.f8722v0) {
            this.f8722v0 = false;
            int i11 = this.f8719s0;
            if (i11 == 0 || i11 == 1) {
                cVar.d(cVar2.i, this.Y);
                cVar.d(cVar4.i, this.Y);
                return;
            } else {
                if (i11 == 2 || i11 == 3) {
                    cVar.d(cVar3.i, this.Z);
                    cVar.d(cVar5.i, this.Z);
                    return;
                }
                return;
            }
        }
        for (int i12 = 0; i12 < this.f8832r0; i12++) {
            d dVar = this.f8831q0[i12];
            if ((this.f8720t0 || dVar.c()) && ((((i8 = this.f8719s0) == 0 || i8 == 1) && dVar.f8777p0[0] == 3 && dVar.I.f8744f != null && dVar.K.f8744f != null) || ((i8 == 2 || i8 == 3) && dVar.f8777p0[1] == 3 && dVar.J.f8744f != null && dVar.L.f8744f != null))) {
                z7 = true;
                break;
            }
        }
        z7 = false;
        boolean z8 = cVar2.g() || cVar4.g();
        boolean z9 = cVar3.g() || cVar5.g();
        int i13 = !(!z7 && (((i = this.f8719s0) == 0 && z8) || ((i == 2 && z9) || ((i == 1 && z8) || (i == 3 && z9))))) ? 4 : 5;
        int i14 = 0;
        while (i14 < this.f8832r0) {
            d dVar2 = this.f8831q0[i14];
            if (this.f8720t0 || dVar2.c()) {
                w2.f k3 = cVar.k(dVar2.Q[this.f8719s0]);
                c[] cVarArr2 = dVar2.Q;
                int i15 = this.f8719s0;
                c cVar8 = cVarArr2[i15];
                cVar8.i = k3;
                c cVar9 = cVar8.f8744f;
                int i16 = (cVar9 == null || cVar9.f8742d != this) ? 0 : cVar8.f8745g;
                if (i15 == 0 || i15 == i9) {
                    w2.f fVar = cVar7.i;
                    int i17 = this.f8721u0 - i16;
                    w2.b l3 = cVar.l();
                    w2.f m7 = cVar.m();
                    m7.f7868g = 0;
                    l3.c(fVar, k3, m7, i17);
                    cVar.c(l3);
                } else {
                    w2.f fVar2 = cVar7.i;
                    int i18 = this.f8721u0 + i16;
                    w2.b l7 = cVar.l();
                    w2.f m8 = cVar.m();
                    m8.f7868g = 0;
                    l7.b(fVar2, k3, m8, i18);
                    cVar.c(l7);
                }
                cVar.e(cVar7.i, k3, this.f8721u0 + i16, i13);
            }
            i14++;
            i9 = 2;
        }
        int i19 = this.f8719s0;
        if (i19 == 0) {
            cVar.e(cVar4.i, cVar2.i, 0, 8);
            cVar.e(cVar2.i, this.T.K.i, 0, 4);
            cVar.e(cVar2.i, this.T.I.i, 0, 0);
            return;
        }
        if (i19 == 1) {
            cVar.e(cVar2.i, cVar4.i, 0, 8);
            cVar.e(cVar2.i, this.T.I.i, 0, 4);
            cVar.e(cVar2.i, this.T.K.i, 0, 0);
        } else if (i19 == 2) {
            cVar.e(cVar5.i, cVar3.i, 0, 8);
            cVar.e(cVar3.i, this.T.L.i, 0, 4);
            cVar.e(cVar3.i, this.T.J.i, 0, 0);
        } else if (i19 == 3) {
            cVar.e(cVar3.i, cVar5.i, 0, 8);
            cVar.e(cVar3.i, this.T.J.i, 0, 4);
            cVar.e(cVar3.i, this.T.L.i, 0, 0);
        }
    }

    @Override // y2.d
    public final boolean c() {
        return true;
    }

    @Override // y2.d
    public final String toString() {
        String str = "[Barrier] " + this.f8762h0 + " {";
        for (int i = 0; i < this.f8832r0; i++) {
            d dVar = this.f8831q0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + dVar.f8762h0;
        }
        return str + "}";
    }
}
