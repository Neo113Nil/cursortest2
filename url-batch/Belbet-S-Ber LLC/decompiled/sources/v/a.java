package v;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f3587s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f3588t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3589u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3590v0;

    @Override // v.d
    public final boolean A() {
        return this.f3590v0;
    }

    @Override // v.d
    public final boolean B() {
        return this.f3590v0;
    }

    public final boolean T() {
        int i;
        int i4;
        int i5;
        boolean z4 = true;
        int i6 = 0;
        while (true) {
            i = this.f3690r0;
            if (i6 >= i) {
                break;
            }
            d dVar = this.f3689q0[i6];
            if ((this.f3588t0 || dVar.c()) && ((((i4 = this.f3587s0) == 0 || i4 == 1) && !dVar.A()) || (((i5 = this.f3587s0) == 2 || i5 == 3) && !dVar.B()))) {
                z4 = false;
            }
            i6++;
        }
        if (!z4 || i <= 0) {
            return false;
        }
        int i7 = 0;
        boolean z5 = false;
        for (int i8 = 0; i8 < this.f3690r0; i8++) {
            d dVar2 = this.f3689q0[i8];
            if (this.f3588t0 || dVar2.c()) {
                if (!z5) {
                    int i9 = this.f3587s0;
                    if (i9 == 0) {
                        i7 = dVar2.i(2).d();
                    } else if (i9 == 1) {
                        i7 = dVar2.i(4).d();
                    } else if (i9 == 2) {
                        i7 = dVar2.i(3).d();
                    } else if (i9 == 3) {
                        i7 = dVar2.i(5).d();
                    }
                    z5 = true;
                }
                int i10 = this.f3587s0;
                if (i10 == 0) {
                    i7 = Math.min(i7, dVar2.i(2).d());
                } else if (i10 == 1) {
                    i7 = Math.max(i7, dVar2.i(4).d());
                } else if (i10 == 2) {
                    i7 = Math.min(i7, dVar2.i(3).d());
                } else if (i10 == 3) {
                    i7 = Math.max(i7, dVar2.i(5).d());
                }
            }
        }
        int i11 = i7 + this.f3589u0;
        int i12 = this.f3587s0;
        if (i12 == 0 || i12 == 1) {
            J(i11, i11);
        } else {
            K(i11, i11);
        }
        this.f3590v0 = true;
        return true;
    }

    public final int U() {
        int i = this.f3587s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // v.d
    public final void b(t.c cVar, boolean z4) {
        boolean z5;
        int i;
        int i4;
        c[] cVarArr = this.Q;
        c cVar2 = this.I;
        cVarArr[0] = cVar2;
        int i5 = 2;
        c cVar3 = this.J;
        cVarArr[2] = cVar3;
        c cVar4 = this.K;
        cVarArr[1] = cVar4;
        c cVar5 = this.L;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.i = cVar.k(cVar6);
        }
        int i6 = this.f3587s0;
        if (i6 < 0 || i6 >= 4) {
            return;
        }
        c cVar7 = cVarArr[i6];
        if (!this.f3590v0) {
            T();
        }
        if (this.f3590v0) {
            this.f3590v0 = false;
            int i7 = this.f3587s0;
            if (i7 == 0 || i7 == 1) {
                cVar.d(cVar2.i, this.Y);
                cVar.d(cVar4.i, this.Y);
                return;
            } else {
                if (i7 == 2 || i7 == 3) {
                    cVar.d(cVar3.i, this.Z);
                    cVar.d(cVar5.i, this.Z);
                    return;
                }
                return;
            }
        }
        for (int i8 = 0; i8 < this.f3690r0; i8++) {
            d dVar = this.f3689q0[i8];
            if ((this.f3588t0 || dVar.c()) && ((((i4 = this.f3587s0) == 0 || i4 == 1) && dVar.f3637p0[0] == 3 && dVar.I.f3609f != null && dVar.K.f3609f != null) || ((i4 == 2 || i4 == 3) && dVar.f3637p0[1] == 3 && dVar.J.f3609f != null && dVar.L.f3609f != null))) {
                z5 = true;
                break;
            }
        }
        z5 = false;
        boolean z6 = cVar2.g() || cVar4.g();
        boolean z7 = cVar3.g() || cVar5.g();
        int i9 = !(!z5 && (((i = this.f3587s0) == 0 && z6) || ((i == 2 && z7) || ((i == 1 && z6) || (i == 3 && z7))))) ? 4 : 5;
        int i10 = 0;
        while (i10 < this.f3690r0) {
            d dVar2 = this.f3689q0[i10];
            if (this.f3588t0 || dVar2.c()) {
                t.f k4 = cVar.k(dVar2.Q[this.f3587s0]);
                c[] cVarArr2 = dVar2.Q;
                int i11 = this.f3587s0;
                c cVar8 = cVarArr2[i11];
                cVar8.i = k4;
                c cVar9 = cVar8.f3609f;
                int i12 = (cVar9 == null || cVar9.d != this) ? 0 : cVar8.f3610g;
                if (i11 == 0 || i11 == i5) {
                    t.f fVar = cVar7.i;
                    int i13 = this.f3589u0 - i12;
                    t.b l4 = cVar.l();
                    t.f m4 = cVar.m();
                    m4.i = 0;
                    l4.c(fVar, k4, m4, i13);
                    cVar.c(l4);
                } else {
                    t.f fVar2 = cVar7.i;
                    int i14 = this.f3589u0 + i12;
                    t.b l5 = cVar.l();
                    t.f m5 = cVar.m();
                    m5.i = 0;
                    l5.b(fVar2, k4, m5, i14);
                    cVar.c(l5);
                }
                cVar.e(cVar7.i, k4, this.f3589u0 + i12, i9);
            }
            i10++;
            i5 = 2;
        }
        int i15 = this.f3587s0;
        if (i15 == 0) {
            cVar.e(cVar4.i, cVar2.i, 0, 8);
            cVar.e(cVar2.i, this.T.K.i, 0, 4);
            cVar.e(cVar2.i, this.T.I.i, 0, 0);
            return;
        }
        if (i15 == 1) {
            cVar.e(cVar2.i, cVar4.i, 0, 8);
            cVar.e(cVar2.i, this.T.I.i, 0, 4);
            cVar.e(cVar2.i, this.T.K.i, 0, 0);
        } else if (i15 == 2) {
            cVar.e(cVar5.i, cVar3.i, 0, 8);
            cVar.e(cVar3.i, this.T.L.i, 0, 4);
            cVar.e(cVar3.i, this.T.J.i, 0, 0);
        } else if (i15 == 3) {
            cVar.e(cVar3.i, cVar5.i, 0, 8);
            cVar.e(cVar3.i, this.T.J.i, 0, 4);
            cVar.e(cVar3.i, this.T.L.i, 0, 0);
        }
    }

    @Override // v.d
    public final boolean c() {
        return true;
    }

    @Override // v.d
    public final String toString() {
        String str = "[Barrier] " + this.f3623h0 + " {";
        for (int i = 0; i < this.f3690r0; i++) {
            d dVar = this.f3689q0[i];
            if (i > 0) {
                str = a4.b.g(str, ", ");
            }
            str = str + dVar.f3623h0;
        }
        return a4.b.g(str, "}");
    }
}
