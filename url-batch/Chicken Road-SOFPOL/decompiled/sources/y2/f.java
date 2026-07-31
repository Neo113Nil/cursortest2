package y2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f8798a;

    /* renamed from: d, reason: collision with root package name */
    public c f8801d;

    /* renamed from: e, reason: collision with root package name */
    public c f8802e;

    /* renamed from: f, reason: collision with root package name */
    public c f8803f;

    /* renamed from: g, reason: collision with root package name */
    public c f8804g;

    /* renamed from: h, reason: collision with root package name */
    public int f8805h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f8806j;

    /* renamed from: k, reason: collision with root package name */
    public int f8807k;

    /* renamed from: q, reason: collision with root package name */
    public int f8813q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f8814r;

    /* renamed from: b, reason: collision with root package name */
    public d f8799b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f8800c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f8808l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f8809m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f8810n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f8811o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f8812p = 0;

    public f(g gVar, int i, c cVar, c cVar2, c cVar3, c cVar4, int i8) {
        this.f8814r = gVar;
        this.f8798a = i;
        this.f8801d = cVar;
        this.f8802e = cVar2;
        this.f8803f = cVar3;
        this.f8804g = cVar4;
        this.f8805h = gVar.f8821w0;
        this.i = gVar.f8817s0;
        this.f8806j = gVar.f8822x0;
        this.f8807k = gVar.f8818t0;
        this.f8813q = i8;
    }

    public final void a(d dVar) {
        int i = this.f8798a;
        g gVar = this.f8814r;
        if (i == 0) {
            int U = gVar.U(dVar, this.f8813q);
            if (dVar.f8777p0[0] == 3) {
                this.f8812p++;
                U = 0;
            }
            this.f8808l = U + (dVar.f8760g0 != 8 ? gVar.P0 : 0) + this.f8808l;
            int T = gVar.T(dVar, this.f8813q);
            if (this.f8799b == null || this.f8800c < T) {
                this.f8799b = dVar;
                this.f8800c = T;
                this.f8809m = T;
            }
        } else {
            int U2 = gVar.U(dVar, this.f8813q);
            int T2 = gVar.T(dVar, this.f8813q);
            if (dVar.f8777p0[1] == 3) {
                this.f8812p++;
                T2 = 0;
            }
            this.f8809m = T2 + (dVar.f8760g0 != 8 ? gVar.Q0 : 0) + this.f8809m;
            if (this.f8799b == null || this.f8800c < U2) {
                this.f8799b = dVar;
                this.f8800c = U2;
                this.f8808l = U2;
            }
        }
        this.f8811o++;
    }

    public final void b(int i, boolean z3, boolean z7) {
        g gVar;
        int i8;
        int i9;
        int i10;
        d dVar;
        boolean z8;
        int i11;
        int i12;
        char c8;
        float f6;
        float f8;
        float f9;
        int i13;
        float f10;
        float f11;
        int i14;
        int i15 = this.f8811o;
        int i16 = 0;
        while (true) {
            gVar = this.f8814r;
            if (i16 >= i15 || (i14 = this.f8810n + i16) >= gVar.f8816b1) {
                break;
            }
            d dVar2 = gVar.f8815a1[i14];
            if (dVar2 != null) {
                dVar2.D();
            }
            i16++;
        }
        if (i15 == 0 || this.f8799b == null) {
            return;
        }
        boolean z9 = z7 && i == 0;
        int i17 = -1;
        int i18 = -1;
        for (int i19 = 0; i19 < i15; i19++) {
            int i20 = this.f8810n + (z3 ? (i15 - 1) - i19 : i19);
            if (i20 >= gVar.f8816b1) {
                break;
            }
            d dVar3 = gVar.f8815a1[i20];
            if (dVar3 != null && dVar3.f8760g0 == 0) {
                if (i17 == -1) {
                    i17 = i19;
                }
                i18 = i19;
            }
        }
        if (this.f8798a == 0) {
            d dVar4 = this.f8799b;
            dVar4.f8765j0 = gVar.E0;
            c cVar = dVar4.L;
            c cVar2 = dVar4.J;
            int i21 = this.i;
            if (i > 0) {
                i21 += gVar.Q0;
            }
            cVar2.a(this.f8802e, i21);
            if (z7) {
                cVar.a(this.f8804g, this.f8807k);
            }
            if (i > 0) {
                this.f8802e.f8742d.L.a(cVar2, 0);
            }
            if (gVar.S0 == 3 && !dVar4.E) {
                for (int i22 = 0; i22 < i15; i22++) {
                    int i23 = this.f8810n + (z3 ? (i15 - 1) - i22 : i22);
                    if (i23 >= gVar.f8816b1) {
                        break;
                    }
                    dVar = gVar.f8815a1[i23];
                    if (dVar.E) {
                        break;
                    }
                }
            }
            dVar = dVar4;
            int i24 = 0;
            d dVar5 = null;
            while (i24 < i15) {
                int i25 = z3 ? (i15 - 1) - i24 : i24;
                int i26 = this.f8810n + i25;
                if (i26 >= gVar.f8816b1) {
                    return;
                }
                d dVar6 = gVar.f8815a1[i26];
                if (dVar6 == null) {
                    i12 = i15;
                    z8 = z9;
                    i11 = i18;
                    c8 = 3;
                } else {
                    c cVar3 = dVar6.L;
                    c cVar4 = dVar6.J;
                    c cVar5 = dVar6.I;
                    z8 = z9;
                    if (i24 == 0) {
                        i11 = i18;
                        dVar6.f(cVar5, this.f8801d, this.f8805h);
                    } else {
                        i11 = i18;
                    }
                    if (i25 == 0) {
                        int i27 = gVar.D0;
                        if (z3) {
                            f6 = 1.0f;
                            f8 = 1.0f - gVar.J0;
                        } else {
                            f6 = 1.0f;
                            f8 = gVar.J0;
                        }
                        if (this.f8810n == 0) {
                            i13 = gVar.F0;
                            f9 = f8;
                            if (i13 != -1) {
                                if (z3) {
                                    f11 = gVar.L0;
                                    f10 = f6 - f11;
                                    dVar6.f8763i0 = i13;
                                    dVar6.f8754d0 = f10;
                                } else {
                                    f10 = gVar.L0;
                                    dVar6.f8763i0 = i13;
                                    dVar6.f8754d0 = f10;
                                }
                            }
                        } else {
                            f9 = f8;
                        }
                        if (!z7 || (i13 = gVar.H0) == -1) {
                            i13 = i27;
                            f10 = f9;
                        } else if (z3) {
                            f11 = gVar.N0;
                            f10 = f6 - f11;
                        } else {
                            f10 = gVar.N0;
                        }
                        dVar6.f8763i0 = i13;
                        dVar6.f8754d0 = f10;
                    }
                    if (i24 == i15 - 1) {
                        i12 = i15;
                        dVar6.f(dVar6.K, this.f8803f, this.f8806j);
                    } else {
                        i12 = i15;
                    }
                    if (dVar5 != null) {
                        c cVar6 = dVar5.K;
                        cVar5.a(cVar6, gVar.P0);
                        if (i24 == i17) {
                            int i28 = this.f8805h;
                            if (cVar5.h()) {
                                cVar5.f8746h = i28;
                            }
                        }
                        cVar6.a(cVar5, 0);
                        if (i24 == i11 + 1) {
                            int i29 = this.f8806j;
                            if (cVar6.h()) {
                                cVar6.f8746h = i29;
                            }
                        }
                    }
                    if (dVar6 != dVar4) {
                        int i30 = gVar.S0;
                        c8 = 3;
                        if (i30 == 3 && dVar.E && dVar6 != dVar && dVar6.E) {
                            dVar6.M.a(dVar.M, 0);
                        } else if (i30 == 0) {
                            cVar4.a(cVar2, 0);
                        } else if (i30 == 1) {
                            cVar3.a(cVar, 0);
                        } else if (z8) {
                            cVar4.a(this.f8802e, this.i);
                            cVar3.a(this.f8804g, this.f8807k);
                        } else {
                            cVar4.a(cVar2, 0);
                            cVar3.a(cVar, 0);
                        }
                    } else {
                        c8 = 3;
                    }
                    dVar5 = dVar6;
                }
                i24++;
                z9 = z8;
                i18 = i11;
                i15 = i12;
            }
            return;
        }
        int i31 = i15;
        boolean z10 = z9;
        int i32 = i18;
        d dVar7 = this.f8799b;
        dVar7.f8763i0 = gVar.D0;
        c cVar7 = dVar7.I;
        c cVar8 = dVar7.K;
        int i33 = this.f8805h;
        if (i > 0) {
            i33 += gVar.P0;
        }
        if (z3) {
            cVar8.a(this.f8803f, i33);
            if (z7) {
                cVar7.a(this.f8801d, this.f8806j);
            }
            if (i > 0) {
                this.f8803f.f8742d.I.a(cVar8, 0);
            }
        } else {
            cVar7.a(this.f8801d, i33);
            if (z7) {
                cVar8.a(this.f8803f, this.f8806j);
            }
            if (i > 0) {
                this.f8801d.f8742d.K.a(cVar7, 0);
            }
        }
        int i34 = 0;
        d dVar8 = null;
        while (true) {
            int i35 = i31;
            if (i34 >= i35 || (i8 = this.f8810n + i34) >= gVar.f8816b1) {
                return;
            }
            d dVar9 = gVar.f8815a1[i8];
            if (dVar9 == null) {
                i31 = i35;
            } else {
                c cVar9 = dVar9.J;
                c cVar10 = dVar9.K;
                c cVar11 = dVar9.I;
                if (i34 == 0) {
                    dVar9.f(cVar9, this.f8802e, this.i);
                    int i36 = gVar.E0;
                    float f12 = gVar.K0;
                    if (this.f8810n == 0) {
                        i10 = gVar.G0;
                        i31 = i35;
                        i9 = -1;
                        if (i10 != -1) {
                            f12 = gVar.M0;
                            i36 = i10;
                            dVar9.f8765j0 = i36;
                            dVar9.f8756e0 = f12;
                        }
                    } else {
                        i31 = i35;
                        i9 = -1;
                    }
                    if (z7 && (i10 = gVar.I0) != i9) {
                        f12 = gVar.O0;
                        i36 = i10;
                    }
                    dVar9.f8765j0 = i36;
                    dVar9.f8756e0 = f12;
                } else {
                    i31 = i35;
                }
                if (i34 == i31 - 1) {
                    dVar9.f(dVar9.L, this.f8804g, this.f8807k);
                }
                if (dVar8 != null) {
                    c cVar12 = dVar8.L;
                    cVar9.a(cVar12, gVar.Q0);
                    if (i34 == i17) {
                        int i37 = this.i;
                        if (cVar9.h()) {
                            cVar9.f8746h = i37;
                        }
                    }
                    cVar12.a(cVar9, 0);
                    if (i34 == i32 + 1) {
                        int i38 = this.f8807k;
                        if (cVar12.h()) {
                            cVar12.f8746h = i38;
                        }
                    }
                }
                if (dVar9 != dVar7) {
                    if (z3) {
                        int i39 = gVar.R0;
                        if (i39 == 0) {
                            cVar10.a(cVar8, 0);
                        } else if (i39 == 1) {
                            cVar11.a(cVar7, 0);
                        } else if (i39 == 2) {
                            cVar11.a(cVar7, 0);
                            cVar10.a(cVar8, 0);
                        }
                    } else {
                        int i40 = gVar.R0;
                        if (i40 == 0) {
                            cVar11.a(cVar7, 0);
                        } else if (i40 == 1) {
                            cVar10.a(cVar8, 0);
                        } else if (i40 == 2) {
                            if (z10) {
                                cVar11.a(this.f8801d, this.f8805h);
                                cVar10.a(this.f8803f, this.f8806j);
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
            i34++;
        }
    }

    public final int c() {
        return this.f8798a == 1 ? this.f8809m - this.f8814r.Q0 : this.f8809m;
    }

    public final int d() {
        return this.f8798a == 0 ? this.f8808l - this.f8814r.P0 : this.f8808l;
    }

    public final void e(int i) {
        g gVar;
        int i8;
        int i9 = this.f8812p;
        if (i9 == 0) {
            return;
        }
        int i10 = this.f8811o;
        int i11 = i / i9;
        int i12 = 0;
        while (true) {
            gVar = this.f8814r;
            if (i12 >= i10 || (i8 = this.f8810n + i12) >= gVar.f8816b1) {
                break;
            }
            d dVar = gVar.f8815a1[i8];
            if (this.f8798a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f8777p0;
                    if (iArr[0] == 3 && dVar.f8779r == 0) {
                        gVar.V(1, i11, iArr[1], dVar.k(), dVar);
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f8777p0;
                if (iArr2[1] == 3 && dVar.f8780s == 0) {
                    int i13 = i11;
                    gVar.V(iArr2[0], dVar.q(), 1, i13, dVar);
                    i11 = i13;
                }
            }
            i12++;
        }
        this.f8808l = 0;
        this.f8809m = 0;
        this.f8799b = null;
        this.f8800c = 0;
        int i14 = this.f8811o;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = this.f8810n + i15;
            if (i16 >= gVar.f8816b1) {
                return;
            }
            d dVar2 = gVar.f8815a1[i16];
            if (this.f8798a == 0) {
                int q4 = dVar2.q();
                int i17 = gVar.P0;
                if (dVar2.f8760g0 == 8) {
                    i17 = 0;
                }
                this.f8808l = q4 + i17 + this.f8808l;
                int T = gVar.T(dVar2, this.f8813q);
                if (this.f8799b == null || this.f8800c < T) {
                    this.f8799b = dVar2;
                    this.f8800c = T;
                    this.f8809m = T;
                }
            } else {
                int U = gVar.U(dVar2, this.f8813q);
                int T2 = gVar.T(dVar2, this.f8813q);
                int i18 = gVar.Q0;
                if (dVar2.f8760g0 == 8) {
                    i18 = 0;
                }
                this.f8809m = T2 + i18 + this.f8809m;
                if (this.f8799b == null || this.f8800c < U) {
                    this.f8799b = dVar2;
                    this.f8800c = U;
                    this.f8808l = U;
                }
            }
        }
    }

    public final void f(int i, c cVar, c cVar2, c cVar3, c cVar4, int i8, int i9, int i10, int i11, int i12) {
        this.f8798a = i;
        this.f8801d = cVar;
        this.f8802e = cVar2;
        this.f8803f = cVar3;
        this.f8804g = cVar4;
        this.f8805h = i8;
        this.i = i9;
        this.f8806j = i10;
        this.f8807k = i11;
        this.f8813q = i12;
    }
}
