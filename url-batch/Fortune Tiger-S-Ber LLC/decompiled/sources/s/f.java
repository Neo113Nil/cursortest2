package s;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f3280a;

    /* renamed from: d, reason: collision with root package name */
    public c f3282d;

    /* renamed from: e, reason: collision with root package name */
    public c f3283e;

    /* renamed from: f, reason: collision with root package name */
    public c f3284f;
    public c g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f3285i;

    /* renamed from: j, reason: collision with root package name */
    public int f3286j;

    /* renamed from: k, reason: collision with root package name */
    public int f3287k;

    /* renamed from: q, reason: collision with root package name */
    public int f3293q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f3294r;

    /* renamed from: b, reason: collision with root package name */
    public d f3281b = null;
    public int c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f3288l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3289m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f3290n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f3291o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f3292p = 0;

    public f(g gVar, int i4, c cVar, c cVar2, c cVar3, c cVar4, int i5) {
        this.f3294r = gVar;
        this.f3280a = i4;
        this.f3282d = cVar;
        this.f3283e = cVar2;
        this.f3284f = cVar3;
        this.g = cVar4;
        this.h = gVar.f3301w0;
        this.f3285i = gVar.f3297s0;
        this.f3286j = gVar.f3302x0;
        this.f3287k = gVar.f3298t0;
        this.f3293q = i5;
    }

    public final void a(d dVar) {
        int i4 = this.f3280a;
        g gVar = this.f3294r;
        if (i4 == 0) {
            int U = gVar.U(dVar, this.f3293q);
            if (dVar.f3259p0[0] == 3) {
                this.f3292p++;
                U = 0;
            }
            this.f3288l = U + (dVar.f3242g0 != 8 ? gVar.P0 : 0) + this.f3288l;
            int T = gVar.T(dVar, this.f3293q);
            if (this.f3281b == null || this.c < T) {
                this.f3281b = dVar;
                this.c = T;
                this.f3289m = T;
            }
        } else {
            int U2 = gVar.U(dVar, this.f3293q);
            int T2 = gVar.T(dVar, this.f3293q);
            if (dVar.f3259p0[1] == 3) {
                this.f3292p++;
                T2 = 0;
            }
            this.f3289m = T2 + (dVar.f3242g0 != 8 ? gVar.Q0 : 0) + this.f3289m;
            if (this.f3281b == null || this.c < U2) {
                this.f3281b = dVar;
                this.c = U2;
                this.f3288l = U2;
            }
        }
        this.f3291o++;
    }

    public final void b(int i4, boolean z3, boolean z4) {
        g gVar;
        int i5;
        int i6;
        int i7;
        d dVar;
        boolean z5;
        int i8;
        int i9;
        char c;
        float f4;
        float f5;
        float f6;
        int i10;
        float f7;
        float f8;
        int i11;
        int i12 = this.f3291o;
        int i13 = 0;
        while (true) {
            gVar = this.f3294r;
            if (i13 >= i12 || (i11 = this.f3290n + i13) >= gVar.f3296b1) {
                break;
            }
            d dVar2 = gVar.f3295a1[i11];
            if (dVar2 != null) {
                dVar2.D();
            }
            i13++;
        }
        if (i12 == 0 || this.f3281b == null) {
            return;
        }
        boolean z6 = z4 && i4 == 0;
        int i14 = -1;
        int i15 = -1;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = this.f3290n + (z3 ? (i12 - 1) - i16 : i16);
            if (i17 >= gVar.f3296b1) {
                break;
            }
            d dVar3 = gVar.f3295a1[i17];
            if (dVar3 != null && dVar3.f3242g0 == 0) {
                if (i14 == -1) {
                    i14 = i16;
                }
                i15 = i16;
            }
        }
        if (this.f3280a == 0) {
            d dVar4 = this.f3281b;
            dVar4.f3247j0 = gVar.E0;
            c cVar = dVar4.L;
            c cVar2 = dVar4.J;
            int i18 = this.f3285i;
            if (i4 > 0) {
                i18 += gVar.Q0;
            }
            cVar2.a(this.f3283e, i18);
            if (z4) {
                cVar.a(this.g, this.f3287k);
            }
            if (i4 > 0) {
                this.f3283e.f3229d.L.a(cVar2, 0);
            }
            if (gVar.S0 == 3 && !dVar4.E) {
                for (int i19 = 0; i19 < i12; i19++) {
                    int i20 = this.f3290n + (z3 ? (i12 - 1) - i19 : i19);
                    if (i20 >= gVar.f3296b1) {
                        break;
                    }
                    dVar = gVar.f3295a1[i20];
                    if (dVar.E) {
                        break;
                    }
                }
            }
            dVar = dVar4;
            int i21 = 0;
            d dVar5 = null;
            while (i21 < i12) {
                int i22 = z3 ? (i12 - 1) - i21 : i21;
                int i23 = this.f3290n + i22;
                if (i23 >= gVar.f3296b1) {
                    return;
                }
                d dVar6 = gVar.f3295a1[i23];
                if (dVar6 == null) {
                    i9 = i12;
                    z5 = z6;
                    i8 = i15;
                    c = 3;
                } else {
                    c cVar3 = dVar6.L;
                    c cVar4 = dVar6.J;
                    c cVar5 = dVar6.I;
                    z5 = z6;
                    if (i21 == 0) {
                        i8 = i15;
                        dVar6.f(cVar5, this.f3282d, this.h);
                    } else {
                        i8 = i15;
                    }
                    if (i22 == 0) {
                        int i24 = gVar.D0;
                        if (z3) {
                            f4 = 1.0f;
                            f5 = 1.0f - gVar.J0;
                        } else {
                            f4 = 1.0f;
                            f5 = gVar.J0;
                        }
                        if (this.f3290n == 0) {
                            i10 = gVar.F0;
                            f6 = f5;
                            if (i10 != -1) {
                                if (z3) {
                                    f8 = gVar.L0;
                                    f7 = f4 - f8;
                                    dVar6.f3245i0 = i10;
                                    dVar6.f3238d0 = f7;
                                } else {
                                    f7 = gVar.L0;
                                    dVar6.f3245i0 = i10;
                                    dVar6.f3238d0 = f7;
                                }
                            }
                        } else {
                            f6 = f5;
                        }
                        if (!z4 || (i10 = gVar.H0) == -1) {
                            i10 = i24;
                            f7 = f6;
                        } else if (z3) {
                            f8 = gVar.N0;
                            f7 = f4 - f8;
                        } else {
                            f7 = gVar.N0;
                        }
                        dVar6.f3245i0 = i10;
                        dVar6.f3238d0 = f7;
                    }
                    if (i21 == i12 - 1) {
                        i9 = i12;
                        dVar6.f(dVar6.K, this.f3284f, this.f3286j);
                    } else {
                        i9 = i12;
                    }
                    if (dVar5 != null) {
                        c cVar6 = dVar5.K;
                        cVar5.a(cVar6, gVar.P0);
                        if (i21 == i14) {
                            int i25 = this.h;
                            if (cVar5.h()) {
                                cVar5.h = i25;
                            }
                        }
                        cVar6.a(cVar5, 0);
                        if (i21 == i8 + 1) {
                            int i26 = this.f3286j;
                            if (cVar6.h()) {
                                cVar6.h = i26;
                            }
                        }
                    }
                    if (dVar6 != dVar4) {
                        int i27 = gVar.S0;
                        c = 3;
                        if (i27 == 3 && dVar.E && dVar6 != dVar && dVar6.E) {
                            dVar6.M.a(dVar.M, 0);
                        } else if (i27 == 0) {
                            cVar4.a(cVar2, 0);
                        } else if (i27 == 1) {
                            cVar3.a(cVar, 0);
                        } else if (z5) {
                            cVar4.a(this.f3283e, this.f3285i);
                            cVar3.a(this.g, this.f3287k);
                        } else {
                            cVar4.a(cVar2, 0);
                            cVar3.a(cVar, 0);
                        }
                    } else {
                        c = 3;
                    }
                    dVar5 = dVar6;
                }
                i21++;
                z6 = z5;
                i15 = i8;
                i12 = i9;
            }
            return;
        }
        int i28 = i12;
        boolean z7 = z6;
        int i29 = i15;
        d dVar7 = this.f3281b;
        dVar7.f3245i0 = gVar.D0;
        c cVar7 = dVar7.I;
        c cVar8 = dVar7.K;
        int i30 = this.h;
        if (i4 > 0) {
            i30 += gVar.P0;
        }
        if (z3) {
            cVar8.a(this.f3284f, i30);
            if (z4) {
                cVar7.a(this.f3282d, this.f3286j);
            }
            if (i4 > 0) {
                this.f3284f.f3229d.I.a(cVar8, 0);
            }
        } else {
            cVar7.a(this.f3282d, i30);
            if (z4) {
                cVar8.a(this.f3284f, this.f3286j);
            }
            if (i4 > 0) {
                this.f3282d.f3229d.K.a(cVar7, 0);
            }
        }
        int i31 = 0;
        d dVar8 = null;
        while (true) {
            int i32 = i28;
            if (i31 >= i32 || (i5 = this.f3290n + i31) >= gVar.f3296b1) {
                return;
            }
            d dVar9 = gVar.f3295a1[i5];
            if (dVar9 == null) {
                i28 = i32;
            } else {
                c cVar9 = dVar9.J;
                c cVar10 = dVar9.K;
                c cVar11 = dVar9.I;
                if (i31 == 0) {
                    dVar9.f(cVar9, this.f3283e, this.f3285i);
                    int i33 = gVar.E0;
                    float f9 = gVar.K0;
                    if (this.f3290n == 0) {
                        i7 = gVar.G0;
                        i28 = i32;
                        i6 = -1;
                        if (i7 != -1) {
                            f9 = gVar.M0;
                            i33 = i7;
                            dVar9.f3247j0 = i33;
                            dVar9.f3240e0 = f9;
                        }
                    } else {
                        i28 = i32;
                        i6 = -1;
                    }
                    if (z4 && (i7 = gVar.I0) != i6) {
                        f9 = gVar.O0;
                        i33 = i7;
                    }
                    dVar9.f3247j0 = i33;
                    dVar9.f3240e0 = f9;
                } else {
                    i28 = i32;
                }
                if (i31 == i28 - 1) {
                    dVar9.f(dVar9.L, this.g, this.f3287k);
                }
                if (dVar8 != null) {
                    c cVar12 = dVar8.L;
                    cVar9.a(cVar12, gVar.Q0);
                    if (i31 == i14) {
                        int i34 = this.f3285i;
                        if (cVar9.h()) {
                            cVar9.h = i34;
                        }
                    }
                    cVar12.a(cVar9, 0);
                    if (i31 == i29 + 1) {
                        int i35 = this.f3287k;
                        if (cVar12.h()) {
                            cVar12.h = i35;
                        }
                    }
                }
                if (dVar9 != dVar7) {
                    if (z3) {
                        int i36 = gVar.R0;
                        if (i36 == 0) {
                            cVar10.a(cVar8, 0);
                        } else if (i36 == 1) {
                            cVar11.a(cVar7, 0);
                        } else if (i36 == 2) {
                            cVar11.a(cVar7, 0);
                            cVar10.a(cVar8, 0);
                        }
                    } else {
                        int i37 = gVar.R0;
                        if (i37 == 0) {
                            cVar11.a(cVar7, 0);
                        } else if (i37 == 1) {
                            cVar10.a(cVar8, 0);
                        } else if (i37 == 2) {
                            if (z7) {
                                cVar11.a(this.f3282d, this.h);
                                cVar10.a(this.f3284f, this.f3286j);
                            } else {
                                cVar11.a(cVar7, 0);
                                cVar10.a(cVar8, 0);
                            }
                        }
                        dVar8 = dVar9;
                    }
                }
                dVar8 = dVar9;
            }
            i31++;
        }
    }

    public final int c() {
        return this.f3280a == 1 ? this.f3289m - this.f3294r.Q0 : this.f3289m;
    }

    public final int d() {
        return this.f3280a == 0 ? this.f3288l - this.f3294r.P0 : this.f3288l;
    }

    public final void e(int i4) {
        g gVar;
        int i5;
        int i6 = this.f3292p;
        if (i6 == 0) {
            return;
        }
        int i7 = this.f3291o;
        int i8 = i4 / i6;
        int i9 = 0;
        while (true) {
            gVar = this.f3294r;
            if (i9 >= i7 || (i5 = this.f3290n + i9) >= gVar.f3296b1) {
                break;
            }
            d dVar = gVar.f3295a1[i5];
            if (this.f3280a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f3259p0;
                    if (iArr[0] == 3 && dVar.f3261r == 0) {
                        gVar.V(1, i8, iArr[1], dVar.k(), dVar);
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f3259p0;
                if (iArr2[1] == 3 && dVar.f3262s == 0) {
                    int i10 = i8;
                    gVar.V(iArr2[0], dVar.q(), 1, i10, dVar);
                    i8 = i10;
                }
            }
            i9++;
        }
        this.f3288l = 0;
        this.f3289m = 0;
        this.f3281b = null;
        this.c = 0;
        int i11 = this.f3291o;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.f3290n + i12;
            if (i13 >= gVar.f3296b1) {
                return;
            }
            d dVar2 = gVar.f3295a1[i13];
            if (this.f3280a == 0) {
                int q4 = dVar2.q();
                int i14 = gVar.P0;
                if (dVar2.f3242g0 == 8) {
                    i14 = 0;
                }
                this.f3288l = q4 + i14 + this.f3288l;
                int T = gVar.T(dVar2, this.f3293q);
                if (this.f3281b == null || this.c < T) {
                    this.f3281b = dVar2;
                    this.c = T;
                    this.f3289m = T;
                }
            } else {
                int U = gVar.U(dVar2, this.f3293q);
                int T2 = gVar.T(dVar2, this.f3293q);
                int i15 = gVar.Q0;
                if (dVar2.f3242g0 == 8) {
                    i15 = 0;
                }
                this.f3289m = T2 + i15 + this.f3289m;
                if (this.f3281b == null || this.c < U) {
                    this.f3281b = dVar2;
                    this.c = U;
                    this.f3288l = U;
                }
            }
        }
    }

    public final void f(int i4, c cVar, c cVar2, c cVar3, c cVar4, int i5, int i6, int i7, int i8, int i9) {
        this.f3280a = i4;
        this.f3282d = cVar;
        this.f3283e = cVar2;
        this.f3284f = cVar3;
        this.g = cVar4;
        this.h = i5;
        this.f3285i = i6;
        this.f3286j = i7;
        this.f3287k = i8;
        this.f3293q = i9;
    }
}
