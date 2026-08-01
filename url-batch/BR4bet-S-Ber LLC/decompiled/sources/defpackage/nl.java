package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class nl {
    public int a;
    public ld d;
    public ld e;
    public ld f;
    public ld g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ ol r;
    public ae b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public nl(ol olVar, int i, ld ldVar, ld ldVar2, ld ldVar3, ld ldVar4, int i2) {
        this.r = olVar;
        this.a = i;
        this.d = ldVar;
        this.e = ldVar2;
        this.f = ldVar3;
        this.g = ldVar4;
        this.h = olVar.w0;
        this.i = olVar.s0;
        this.j = olVar.x0;
        this.k = olVar.t0;
        this.q = i2;
    }

    public final void a(ae aeVar) {
        int i = this.a;
        int i2 = this.q;
        ol olVar = this.r;
        if (i == 0) {
            int U = olVar.U(aeVar, i2);
            if (aeVar.p0[0] == 3) {
                this.p++;
                U = 0;
            }
            this.l = U + (aeVar.g0 != 8 ? olVar.P0 : 0) + this.l;
            int T = olVar.T(aeVar, this.q);
            if (this.b == null || this.c < T) {
                this.b = aeVar;
                this.c = T;
                this.m = T;
            }
        } else {
            int U2 = olVar.U(aeVar, i2);
            int T2 = olVar.T(aeVar, this.q);
            if (aeVar.p0[1] == 3) {
                this.p++;
                T2 = 0;
            }
            this.m = T2 + (aeVar.g0 != 8 ? olVar.Q0 : 0) + this.m;
            if (this.b == null || this.c < U2) {
                this.b = aeVar;
                this.c = U2;
                this.l = U2;
            }
        }
        this.o++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0103, code lost:
    
        if (r24 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0105, code lost:
    
        r9 = 1.0f - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0115, code lost:
    
        if (r24 != false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, boolean z, boolean z2) {
        ol olVar;
        int i2;
        int i3;
        int i4;
        ae aeVar;
        boolean z3;
        int i5;
        int i6;
        char c;
        float f;
        int i7;
        float f2;
        int i8;
        int i9 = this.o;
        int i10 = 0;
        while (true) {
            olVar = this.r;
            if (i10 >= i9 || (i8 = this.n + i10) >= olVar.b1) {
                break;
            }
            ae aeVar2 = olVar.a1[i8];
            if (aeVar2 != null) {
                aeVar2.D();
            }
            i10++;
        }
        if (i9 == 0 || this.b == null) {
            return;
        }
        boolean z4 = z2 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.n + (z ? (i9 - 1) - i13 : i13);
            if (i14 >= olVar.b1) {
                break;
            }
            ae aeVar3 = olVar.a1[i14];
            if (aeVar3 != null && aeVar3.g0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        int i15 = this.a;
        ae aeVar4 = this.b;
        if (i15 == 0) {
            aeVar4.j0 = olVar.E0;
            ld ldVar = aeVar4.L;
            ld ldVar2 = aeVar4.J;
            int i16 = this.i;
            if (i > 0) {
                i16 += olVar.Q0;
            }
            ldVar2.a(this.e, i16);
            if (z2) {
                ldVar.a(this.g, this.k);
            }
            if (i > 0) {
                this.e.d.L.a(ldVar2, 0);
            }
            if (olVar.S0 == 3 && !aeVar4.E) {
                for (int i17 = 0; i17 < i9; i17++) {
                    int i18 = this.n + (z ? (i9 - 1) - i17 : i17);
                    if (i18 >= olVar.b1) {
                        break;
                    }
                    aeVar = olVar.a1[i18];
                    if (aeVar.E) {
                        break;
                    }
                }
            }
            aeVar = aeVar4;
            int i19 = 0;
            ae aeVar5 = null;
            while (i19 < i9) {
                int i20 = z ? (i9 - 1) - i19 : i19;
                int i21 = this.n + i20;
                if (i21 >= olVar.b1) {
                    return;
                }
                ae aeVar6 = olVar.a1[i21];
                if (aeVar6 == null) {
                    i6 = i9;
                    z3 = z4;
                    i5 = i12;
                    c = 3;
                } else {
                    ld ldVar3 = aeVar6.J;
                    ld ldVar4 = aeVar6.L;
                    ld ldVar5 = aeVar6.I;
                    z3 = z4;
                    if (i19 == 0) {
                        i5 = i12;
                        aeVar6.f(ldVar5, this.d, this.h);
                    } else {
                        i5 = i12;
                    }
                    if (i20 == 0) {
                        int i22 = olVar.D0;
                        float f3 = olVar.J0;
                        if (z) {
                            f3 = 1.0f - f3;
                        }
                        if (this.n == 0) {
                            i7 = olVar.F0;
                            f = f3;
                            if (i7 != -1) {
                                f2 = olVar.L0;
                            }
                        } else {
                            f = f3;
                        }
                        if (!z2 || (i7 = olVar.H0) == -1) {
                            i7 = i22;
                            f2 = f;
                        } else {
                            f2 = olVar.N0;
                        }
                        aeVar6.i0 = i7;
                        aeVar6.d0 = f2;
                    }
                    if (i19 == i9 - 1) {
                        i6 = i9;
                        aeVar6.f(aeVar6.K, this.f, this.j);
                    } else {
                        i6 = i9;
                    }
                    if (aeVar5 != null) {
                        ld ldVar6 = aeVar5.K;
                        ldVar5.a(ldVar6, olVar.P0);
                        if (i19 == i11) {
                            int i23 = this.h;
                            if (ldVar5.h()) {
                                ldVar5.h = i23;
                            }
                        }
                        ldVar6.a(ldVar5, 0);
                        if (i19 == i5 + 1) {
                            int i24 = this.j;
                            if (ldVar6.h()) {
                                ldVar6.h = i24;
                            }
                        }
                    }
                    if (aeVar6 != aeVar4) {
                        int i25 = olVar.S0;
                        c = 3;
                        if (i25 == 3 && aeVar.E && aeVar6 != aeVar && aeVar6.E) {
                            aeVar6.M.a(aeVar.M, 0);
                        } else if (i25 == 0) {
                            ldVar3.a(ldVar2, 0);
                        } else if (i25 == 1) {
                            ldVar4.a(ldVar, 0);
                        } else if (z3) {
                            ldVar3.a(this.e, this.i);
                            ldVar4.a(this.g, this.k);
                        } else {
                            ldVar3.a(ldVar2, 0);
                            ldVar4.a(ldVar, 0);
                        }
                    } else {
                        c = 3;
                    }
                    aeVar5 = aeVar6;
                }
                i19++;
                z4 = z3;
                i12 = i5;
                i9 = i6;
            }
            return;
        }
        int i26 = i9;
        boolean z5 = z4;
        int i27 = i12;
        aeVar4.i0 = olVar.D0;
        ld ldVar7 = aeVar4.I;
        ld ldVar8 = aeVar4.K;
        int i28 = this.h;
        if (i > 0) {
            i28 += olVar.P0;
        }
        if (z) {
            ldVar8.a(this.f, i28);
            if (z2) {
                ldVar7.a(this.d, this.j);
            }
            if (i > 0) {
                this.f.d.I.a(ldVar8, 0);
            }
        } else {
            ldVar7.a(this.d, i28);
            if (z2) {
                ldVar8.a(this.f, this.j);
            }
            if (i > 0) {
                this.d.d.K.a(ldVar7, 0);
            }
        }
        int i29 = 0;
        ae aeVar7 = null;
        while (true) {
            int i30 = i26;
            if (i29 >= i30 || (i2 = this.n + i29) >= olVar.b1) {
                return;
            }
            ae aeVar8 = olVar.a1[i2];
            if (aeVar8 == null) {
                i26 = i30;
            } else {
                ld ldVar9 = aeVar8.I;
                ld ldVar10 = aeVar8.J;
                ld ldVar11 = aeVar8.K;
                if (i29 == 0) {
                    aeVar8.f(ldVar10, this.e, this.i);
                    int i31 = olVar.E0;
                    float f4 = olVar.K0;
                    if (this.n == 0) {
                        i4 = olVar.G0;
                        i26 = i30;
                        i3 = -1;
                        if (i4 != -1) {
                            f4 = olVar.M0;
                            i31 = i4;
                            aeVar8.j0 = i31;
                            aeVar8.e0 = f4;
                        }
                    } else {
                        i26 = i30;
                        i3 = -1;
                    }
                    if (z2 && (i4 = olVar.I0) != i3) {
                        f4 = olVar.O0;
                        i31 = i4;
                    }
                    aeVar8.j0 = i31;
                    aeVar8.e0 = f4;
                } else {
                    i26 = i30;
                }
                if (i29 == i26 - 1) {
                    aeVar8.f(aeVar8.L, this.g, this.k);
                }
                if (aeVar7 != null) {
                    ld ldVar12 = aeVar7.L;
                    ldVar10.a(ldVar12, olVar.Q0);
                    if (i29 == i11) {
                        int i32 = this.i;
                        if (ldVar10.h()) {
                            ldVar10.h = i32;
                        }
                    }
                    ldVar12.a(ldVar10, 0);
                    if (i29 == i27 + 1) {
                        int i33 = this.k;
                        if (ldVar12.h()) {
                            ldVar12.h = i33;
                        }
                    }
                }
                if (aeVar8 != aeVar4) {
                    int i34 = olVar.R0;
                    if (!z) {
                        if (i34 == 0) {
                            ldVar9.a(ldVar7, 0);
                        } else if (i34 == 1) {
                            ldVar11.a(ldVar8, 0);
                        } else if (i34 == 2) {
                            if (z5) {
                                ldVar9.a(this.d, this.h);
                                ldVar11.a(this.f, this.j);
                            } else {
                                ldVar9.a(ldVar7, 0);
                                ldVar11.a(ldVar8, 0);
                            }
                        }
                        aeVar7 = aeVar8;
                    } else if (i34 == 0) {
                        ldVar11.a(ldVar8, 0);
                    } else if (i34 == 1) {
                        ldVar9.a(ldVar7, 0);
                    } else if (i34 == 2) {
                        ldVar9.a(ldVar7, 0);
                        ldVar11.a(ldVar8, 0);
                    }
                }
                aeVar7 = aeVar8;
            }
            i29++;
        }
    }

    public final int c() {
        int i = this.a;
        int i2 = this.m;
        return i == 1 ? i2 - this.r.Q0 : i2;
    }

    public final int d() {
        int i = this.a;
        int i2 = this.l;
        return i == 0 ? i2 - this.r.P0 : i2;
    }

    public final void e(int i) {
        ol olVar;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            olVar = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= olVar.b1) {
                break;
            }
            ae aeVar = olVar.a1[i2];
            if (this.a == 0) {
                if (aeVar != null) {
                    int[] iArr = aeVar.p0;
                    if (iArr[0] == 3 && aeVar.r == 0) {
                        olVar.V(1, i5, iArr[1], aeVar.k(), aeVar);
                    }
                }
            } else if (aeVar != null) {
                int[] iArr2 = aeVar.p0;
                if (iArr2[1] == 3 && aeVar.s == 0) {
                    int i7 = i5;
                    olVar.V(iArr2[0], aeVar.q(), 1, i7, aeVar);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int i8 = this.o;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.n + i9;
            if (i10 >= olVar.b1) {
                return;
            }
            ae aeVar2 = olVar.a1[i10];
            if (this.a == 0) {
                int q = aeVar2.q();
                int i11 = olVar.P0;
                if (aeVar2.g0 == 8) {
                    i11 = 0;
                }
                this.l = q + i11 + this.l;
                int T = olVar.T(aeVar2, this.q);
                if (this.b == null || this.c < T) {
                    this.b = aeVar2;
                    this.c = T;
                    this.m = T;
                }
            } else {
                int U = olVar.U(aeVar2, this.q);
                int T2 = olVar.T(aeVar2, this.q);
                int i12 = olVar.Q0;
                if (aeVar2.g0 == 8) {
                    i12 = 0;
                }
                this.m = T2 + i12 + this.m;
                if (this.b == null || this.c < U) {
                    this.b = aeVar2;
                    this.c = U;
                    this.l = U;
                }
            }
        }
    }

    public final void f(int i, ld ldVar, ld ldVar2, ld ldVar3, ld ldVar4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = ldVar;
        this.e = ldVar2;
        this.f = ldVar3;
        this.g = ldVar4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
