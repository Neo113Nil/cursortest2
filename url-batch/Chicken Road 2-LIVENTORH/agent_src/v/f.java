package v;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f3439a;
    public c d;

    /* renamed from: e, reason: collision with root package name */
    public c f3442e;

    /* renamed from: f, reason: collision with root package name */
    public c f3443f;

    /* renamed from: g, reason: collision with root package name */
    public c f3444g;

    /* renamed from: h, reason: collision with root package name */
    public int f3445h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3446j;

    /* renamed from: k, reason: collision with root package name */
    public int f3447k;

    /* renamed from: q, reason: collision with root package name */
    public int f3453q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f3454r;

    /* renamed from: b, reason: collision with root package name */
    public d f3440b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f3441c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f3448l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3449m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f3450n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f3451o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f3452p = 0;

    public f(g gVar, int i, c cVar, c cVar2, c cVar3, c cVar4, int i4) {
        this.f3454r = gVar;
        this.f3439a = i;
        this.d = cVar;
        this.f3442e = cVar2;
        this.f3443f = cVar3;
        this.f3444g = cVar4;
        this.f3445h = gVar.f3461w0;
        this.i = gVar.f3457s0;
        this.f3446j = gVar.f3462x0;
        this.f3447k = gVar.f3458t0;
        this.f3453q = i4;
    }

    public final void a(d dVar) {
        int i = this.f3439a;
        g gVar = this.f3454r;
        if (i == 0) {
            int U = gVar.U(dVar, this.f3453q);
            if (dVar.f3418p0[0] == 3) {
                this.f3452p++;
                U = 0;
            }
            this.f3448l = U + (dVar.f3402g0 != 8 ? gVar.P0 : 0) + this.f3448l;
            int T = gVar.T(dVar, this.f3453q);
            if (this.f3440b == null || this.f3441c < T) {
                this.f3440b = dVar;
                this.f3441c = T;
                this.f3449m = T;
            }
        } else {
            int U2 = gVar.U(dVar, this.f3453q);
            int T2 = gVar.T(dVar, this.f3453q);
            if (dVar.f3418p0[1] == 3) {
                this.f3452p++;
                T2 = 0;
            }
            this.f3449m = T2 + (dVar.f3402g0 != 8 ? gVar.Q0 : 0) + this.f3449m;
            if (this.f3440b == null || this.f3441c < U2) {
                this.f3440b = dVar;
                this.f3441c = U2;
                this.f3448l = U2;
            }
        }
        this.f3451o++;
    }

    public final void b(int i, boolean z3, boolean z4) {
        g gVar;
        int i4;
        int i5;
        int i6;
        d dVar;
        boolean z5;
        int i7;
        int i8;
        char c4;
        float f2;
        float f4;
        float f5;
        int i9;
        float f6;
        float f7;
        int i10;
        int i11 = this.f3451o;
        int i12 = 0;
        while (true) {
            gVar = this.f3454r;
            if (i12 >= i11 || (i10 = this.f3450n + i12) >= gVar.f3456b1) {
                break;
            }
            d dVar2 = gVar.f3455a1[i10];
            if (dVar2 != null) {
                dVar2.D();
            }
            i12++;
        }
        if (i11 == 0 || this.f3440b == null) {
            return;
        }
        boolean z6 = z4 && i == 0;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = this.f3450n + (z3 ? (i11 - 1) - i15 : i15);
            if (i16 >= gVar.f3456b1) {
                break;
            }
            d dVar3 = gVar.f3455a1[i16];
            if (dVar3 != null && dVar3.f3402g0 == 0) {
                if (i13 == -1) {
                    i13 = i15;
                }
                i14 = i15;
            }
        }
        if (this.f3439a == 0) {
            d dVar4 = this.f3440b;
            dVar4.f3406j0 = gVar.E0;
            c cVar = dVar4.L;
            c cVar2 = dVar4.J;
            int i17 = this.i;
            if (i > 0) {
                i17 += gVar.Q0;
            }
            cVar2.a(this.f3442e, i17);
            if (z4) {
                cVar.a(this.f3444g, this.f3447k);
            }
            if (i > 0) {
                this.f3442e.d.L.a(cVar2, 0);
            }
            if (gVar.S0 == 3 && !dVar4.E) {
                for (int i18 = 0; i18 < i11; i18++) {
                    int i19 = this.f3450n + (z3 ? (i11 - 1) - i18 : i18);
                    if (i19 >= gVar.f3456b1) {
                        break;
                    }
                    dVar = gVar.f3455a1[i19];
                    if (dVar.E) {
                        break;
                    }
                }
            }
            dVar = dVar4;
            int i20 = 0;
            d dVar5 = null;
            while (i20 < i11) {
                int i21 = z3 ? (i11 - 1) - i20 : i20;
                int i22 = this.f3450n + i21;
                if (i22 >= gVar.f3456b1) {
                    return;
                }
                d dVar6 = gVar.f3455a1[i22];
                if (dVar6 == null) {
                    i8 = i11;
                    z5 = z6;
                    i7 = i14;
                    c4 = 3;
                } else {
                    c cVar3 = dVar6.L;
                    c cVar4 = dVar6.J;
                    c cVar5 = dVar6.I;
                    z5 = z6;
                    if (i20 == 0) {
                        i7 = i14;
                        dVar6.f(cVar5, this.d, this.f3445h);
                    } else {
                        i7 = i14;
                    }
                    if (i21 == 0) {
                        int i23 = gVar.D0;
                        if (z3) {
                            f2 = 1.0f;
                            f4 = 1.0f - gVar.J0;
                        } else {
                            f2 = 1.0f;
                            f4 = gVar.J0;
                        }
                        if (this.f3450n == 0) {
                            i9 = gVar.F0;
                            f5 = f4;
                            if (i9 != -1) {
                                if (z3) {
                                    f7 = gVar.L0;
                                    f6 = f2 - f7;
                                    dVar6.i0 = i9;
                                    dVar6.d0 = f6;
                                } else {
                                    f6 = gVar.L0;
                                    dVar6.i0 = i9;
                                    dVar6.d0 = f6;
                                }
                            }
                        } else {
                            f5 = f4;
                        }
                        if (!z4 || (i9 = gVar.H0) == -1) {
                            i9 = i23;
                            f6 = f5;
                        } else if (z3) {
                            f7 = gVar.N0;
                            f6 = f2 - f7;
                        } else {
                            f6 = gVar.N0;
                        }
                        dVar6.i0 = i9;
                        dVar6.d0 = f6;
                    }
                    if (i20 == i11 - 1) {
                        i8 = i11;
                        dVar6.f(dVar6.K, this.f3443f, this.f3446j);
                    } else {
                        i8 = i11;
                    }
                    if (dVar5 != null) {
                        c cVar6 = dVar5.K;
                        cVar5.a(cVar6, gVar.P0);
                        if (i20 == i13) {
                            int i24 = this.f3445h;
                            if (cVar5.h()) {
                                cVar5.f3390h = i24;
                            }
                        }
                        cVar6.a(cVar5, 0);
                        if (i20 == i7 + 1) {
                            int i25 = this.f3446j;
                            if (cVar6.h()) {
                                cVar6.f3390h = i25;
                            }
                        }
                    }
                    if (dVar6 != dVar4) {
                        int i26 = gVar.S0;
                        c4 = 3;
                        if (i26 == 3 && dVar.E && dVar6 != dVar && dVar6.E) {
                            dVar6.M.a(dVar.M, 0);
                        } else if (i26 == 0) {
                            cVar4.a(cVar2, 0);
                        } else if (i26 == 1) {
                            cVar3.a(cVar, 0);
                        } else if (z5) {
                            cVar4.a(this.f3442e, this.i);
                            cVar3.a(this.f3444g, this.f3447k);
                        } else {
                            cVar4.a(cVar2, 0);
                            cVar3.a(cVar, 0);
                        }
                    } else {
                        c4 = 3;
                    }
                    dVar5 = dVar6;
                }
                i20++;
                z6 = z5;
                i14 = i7;
                i11 = i8;
            }
            return;
        }
        int i27 = i11;
        boolean z7 = z6;
        int i28 = i14;
        d dVar7 = this.f3440b;
        dVar7.i0 = gVar.D0;
        c cVar7 = dVar7.I;
        c cVar8 = dVar7.K;
        int i29 = this.f3445h;
        if (i > 0) {
            i29 += gVar.P0;
        }
        if (z3) {
            cVar8.a(this.f3443f, i29);
            if (z4) {
                cVar7.a(this.d, this.f3446j);
            }
            if (i > 0) {
                this.f3443f.d.I.a(cVar8, 0);
            }
        } else {
            cVar7.a(this.d, i29);
            if (z4) {
                cVar8.a(this.f3443f, this.f3446j);
            }
            if (i > 0) {
                this.d.d.K.a(cVar7, 0);
            }
        }
        int i30 = 0;
        d dVar8 = null;
        while (true) {
            int i31 = i27;
            if (i30 >= i31 || (i4 = this.f3450n + i30) >= gVar.f3456b1) {
                return;
            }
            d dVar9 = gVar.f3455a1[i4];
            if (dVar9 == null) {
                i27 = i31;
            } else {
                c cVar9 = dVar9.J;
                c cVar10 = dVar9.K;
                c cVar11 = dVar9.I;
                if (i30 == 0) {
                    dVar9.f(cVar9, this.f3442e, this.i);
                    int i32 = gVar.E0;
                    float f8 = gVar.K0;
                    if (this.f3450n == 0) {
                        i6 = gVar.G0;
                        i27 = i31;
                        i5 = -1;
                        if (i6 != -1) {
                            f8 = gVar.M0;
                            i32 = i6;
                            dVar9.f3406j0 = i32;
                            dVar9.f3398e0 = f8;
                        }
                    } else {
                        i27 = i31;
                        i5 = -1;
                    }
                    if (z4 && (i6 = gVar.I0) != i5) {
                        f8 = gVar.O0;
                        i32 = i6;
                    }
                    dVar9.f3406j0 = i32;
                    dVar9.f3398e0 = f8;
                } else {
                    i27 = i31;
                }
                if (i30 == i27 - 1) {
                    dVar9.f(dVar9.L, this.f3444g, this.f3447k);
                }
                if (dVar8 != null) {
                    c cVar12 = dVar8.L;
                    cVar9.a(cVar12, gVar.Q0);
                    if (i30 == i13) {
                        int i33 = this.i;
                        if (cVar9.h()) {
                            cVar9.f3390h = i33;
                        }
                    }
                    cVar12.a(cVar9, 0);
                    if (i30 == i28 + 1) {
                        int i34 = this.f3447k;
                        if (cVar12.h()) {
                            cVar12.f3390h = i34;
                        }
                    }
                }
                if (dVar9 != dVar7) {
                    if (z3) {
                        int i35 = gVar.R0;
                        if (i35 == 0) {
                            cVar10.a(cVar8, 0);
                        } else if (i35 == 1) {
                            cVar11.a(cVar7, 0);
                        } else if (i35 == 2) {
                            cVar11.a(cVar7, 0);
                            cVar10.a(cVar8, 0);
                        }
                    } else {
                        int i36 = gVar.R0;
                        if (i36 == 0) {
                            cVar11.a(cVar7, 0);
                        } else if (i36 == 1) {
                            cVar10.a(cVar8, 0);
                        } else if (i36 == 2) {
                            if (z7) {
                                cVar11.a(this.d, this.f3445h);
                                cVar10.a(this.f3443f, this.f3446j);
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
            i30++;
        }
    }

    public final int c() {
        return this.f3439a == 1 ? this.f3449m - this.f3454r.Q0 : this.f3449m;
    }

    public final int d() {
        return this.f3439a == 0 ? this.f3448l - this.f3454r.P0 : this.f3448l;
    }

    public final void e(int i) {
        g gVar;
        int i4;
        int i5 = this.f3452p;
        if (i5 == 0) {
            return;
        }
        int i6 = this.f3451o;
        int i7 = i / i5;
        int i8 = 0;
        while (true) {
            gVar = this.f3454r;
            if (i8 >= i6 || (i4 = this.f3450n + i8) >= gVar.f3456b1) {
                break;
            }
            d dVar = gVar.f3455a1[i4];
            if (this.f3439a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f3418p0;
                    if (iArr[0] == 3 && dVar.f3420r == 0) {
                        gVar.V(1, i7, iArr[1], dVar.k(), dVar);
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f3418p0;
                if (iArr2[1] == 3 && dVar.f3421s == 0) {
                    int i9 = i7;
                    gVar.V(iArr2[0], dVar.q(), 1, i9, dVar);
                    i7 = i9;
                }
            }
            i8++;
        }
        this.f3448l = 0;
        this.f3449m = 0;
        this.f3440b = null;
        this.f3441c = 0;
        int i10 = this.f3451o;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f3450n + i11;
            if (i12 >= gVar.f3456b1) {
                return;
            }
            d dVar2 = gVar.f3455a1[i12];
            if (this.f3439a == 0) {
                int q3 = dVar2.q();
                int i13 = gVar.P0;
                if (dVar2.f3402g0 == 8) {
                    i13 = 0;
                }
                this.f3448l = q3 + i13 + this.f3448l;
                int T = gVar.T(dVar2, this.f3453q);
                if (this.f3440b == null || this.f3441c < T) {
                    this.f3440b = dVar2;
                    this.f3441c = T;
                    this.f3449m = T;
                }
            } else {
                int U = gVar.U(dVar2, this.f3453q);
                int T2 = gVar.T(dVar2, this.f3453q);
                int i14 = gVar.Q0;
                if (dVar2.f3402g0 == 8) {
                    i14 = 0;
                }
                this.f3449m = T2 + i14 + this.f3449m;
                if (this.f3440b == null || this.f3441c < U) {
                    this.f3440b = dVar2;
                    this.f3441c = U;
                    this.f3448l = U;
                }
            }
        }
    }

    public final void f(int i, c cVar, c cVar2, c cVar3, c cVar4, int i4, int i5, int i6, int i7, int i8) {
        this.f3439a = i;
        this.d = cVar;
        this.f3442e = cVar2;
        this.f3443f = cVar3;
        this.f3444g = cVar4;
        this.f3445h = i4;
        this.i = i5;
        this.f3446j = i6;
        this.f3447k = i7;
        this.f3453q = i8;
    }
}
