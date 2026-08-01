package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class kj {
    public int a;
    public lc d;
    public lc e;
    public lc f;
    public lc g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ lj r;
    public ad b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public kj(lj ljVar, int i, lc lcVar, lc lcVar2, lc lcVar3, lc lcVar4, int i2) {
        this.r = ljVar;
        this.a = i;
        this.d = lcVar;
        this.e = lcVar2;
        this.f = lcVar3;
        this.g = lcVar4;
        this.h = ljVar.w0;
        this.i = ljVar.s0;
        this.j = ljVar.x0;
        this.k = ljVar.t0;
        this.q = i2;
    }

    public final void a(ad adVar) {
        int i = this.a;
        int i2 = this.q;
        lj ljVar = this.r;
        if (i == 0) {
            int U = ljVar.U(adVar, i2);
            if (adVar.p0[0] == 3) {
                this.p++;
                U = 0;
            }
            this.l = U + (adVar.g0 != 8 ? ljVar.P0 : 0) + this.l;
            int T = ljVar.T(adVar, this.q);
            if (this.b == null || this.c < T) {
                this.b = adVar;
                this.c = T;
                this.m = T;
            }
        } else {
            int U2 = ljVar.U(adVar, i2);
            int T2 = ljVar.T(adVar, this.q);
            if (adVar.p0[1] == 3) {
                this.p++;
                T2 = 0;
            }
            this.m = T2 + (adVar.g0 != 8 ? ljVar.Q0 : 0) + this.m;
            if (this.b == null || this.c < U2) {
                this.b = adVar;
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
        lj ljVar;
        int i2;
        int i3;
        int i4;
        ad adVar;
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
            ljVar = this.r;
            if (i10 >= i9 || (i8 = this.n + i10) >= ljVar.b1) {
                break;
            }
            ad adVar2 = ljVar.a1[i8];
            if (adVar2 != null) {
                adVar2.D();
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
            if (i14 >= ljVar.b1) {
                break;
            }
            ad adVar3 = ljVar.a1[i14];
            if (adVar3 != null && adVar3.g0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        int i15 = this.a;
        ad adVar4 = this.b;
        if (i15 == 0) {
            adVar4.j0 = ljVar.E0;
            lc lcVar = adVar4.L;
            lc lcVar2 = adVar4.J;
            int i16 = this.i;
            if (i > 0) {
                i16 += ljVar.Q0;
            }
            lcVar2.a(this.e, i16);
            if (z2) {
                lcVar.a(this.g, this.k);
            }
            if (i > 0) {
                this.e.d.L.a(lcVar2, 0);
            }
            if (ljVar.S0 == 3 && !adVar4.E) {
                for (int i17 = 0; i17 < i9; i17++) {
                    int i18 = this.n + (z ? (i9 - 1) - i17 : i17);
                    if (i18 >= ljVar.b1) {
                        break;
                    }
                    adVar = ljVar.a1[i18];
                    if (adVar.E) {
                        break;
                    }
                }
            }
            adVar = adVar4;
            int i19 = 0;
            ad adVar5 = null;
            while (i19 < i9) {
                int i20 = z ? (i9 - 1) - i19 : i19;
                int i21 = this.n + i20;
                if (i21 >= ljVar.b1) {
                    return;
                }
                ad adVar6 = ljVar.a1[i21];
                if (adVar6 == null) {
                    i6 = i9;
                    z3 = z4;
                    i5 = i12;
                    c = 3;
                } else {
                    lc lcVar3 = adVar6.J;
                    lc lcVar4 = adVar6.L;
                    lc lcVar5 = adVar6.I;
                    z3 = z4;
                    if (i19 == 0) {
                        i5 = i12;
                        adVar6.f(lcVar5, this.d, this.h);
                    } else {
                        i5 = i12;
                    }
                    if (i20 == 0) {
                        int i22 = ljVar.D0;
                        float f3 = ljVar.J0;
                        if (z) {
                            f3 = 1.0f - f3;
                        }
                        if (this.n == 0) {
                            i7 = ljVar.F0;
                            f = f3;
                            if (i7 != -1) {
                                f2 = ljVar.L0;
                            }
                        } else {
                            f = f3;
                        }
                        if (!z2 || (i7 = ljVar.H0) == -1) {
                            i7 = i22;
                            f2 = f;
                        } else {
                            f2 = ljVar.N0;
                        }
                        adVar6.i0 = i7;
                        adVar6.d0 = f2;
                    }
                    if (i19 == i9 - 1) {
                        i6 = i9;
                        adVar6.f(adVar6.K, this.f, this.j);
                    } else {
                        i6 = i9;
                    }
                    if (adVar5 != null) {
                        lc lcVar6 = adVar5.K;
                        lcVar5.a(lcVar6, ljVar.P0);
                        if (i19 == i11) {
                            int i23 = this.h;
                            if (lcVar5.h()) {
                                lcVar5.h = i23;
                            }
                        }
                        lcVar6.a(lcVar5, 0);
                        if (i19 == i5 + 1) {
                            int i24 = this.j;
                            if (lcVar6.h()) {
                                lcVar6.h = i24;
                            }
                        }
                    }
                    if (adVar6 != adVar4) {
                        int i25 = ljVar.S0;
                        c = 3;
                        if (i25 == 3 && adVar.E && adVar6 != adVar && adVar6.E) {
                            adVar6.M.a(adVar.M, 0);
                        } else if (i25 == 0) {
                            lcVar3.a(lcVar2, 0);
                        } else if (i25 == 1) {
                            lcVar4.a(lcVar, 0);
                        } else if (z3) {
                            lcVar3.a(this.e, this.i);
                            lcVar4.a(this.g, this.k);
                        } else {
                            lcVar3.a(lcVar2, 0);
                            lcVar4.a(lcVar, 0);
                        }
                    } else {
                        c = 3;
                    }
                    adVar5 = adVar6;
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
        adVar4.i0 = ljVar.D0;
        lc lcVar7 = adVar4.I;
        lc lcVar8 = adVar4.K;
        int i28 = this.h;
        if (i > 0) {
            i28 += ljVar.P0;
        }
        if (z) {
            lcVar8.a(this.f, i28);
            if (z2) {
                lcVar7.a(this.d, this.j);
            }
            if (i > 0) {
                this.f.d.I.a(lcVar8, 0);
            }
        } else {
            lcVar7.a(this.d, i28);
            if (z2) {
                lcVar8.a(this.f, this.j);
            }
            if (i > 0) {
                this.d.d.K.a(lcVar7, 0);
            }
        }
        int i29 = 0;
        ad adVar7 = null;
        while (true) {
            int i30 = i26;
            if (i29 >= i30 || (i2 = this.n + i29) >= ljVar.b1) {
                return;
            }
            ad adVar8 = ljVar.a1[i2];
            if (adVar8 == null) {
                i26 = i30;
            } else {
                lc lcVar9 = adVar8.I;
                lc lcVar10 = adVar8.J;
                lc lcVar11 = adVar8.K;
                if (i29 == 0) {
                    adVar8.f(lcVar10, this.e, this.i);
                    int i31 = ljVar.E0;
                    float f4 = ljVar.K0;
                    if (this.n == 0) {
                        i4 = ljVar.G0;
                        i26 = i30;
                        i3 = -1;
                        if (i4 != -1) {
                            f4 = ljVar.M0;
                            i31 = i4;
                            adVar8.j0 = i31;
                            adVar8.e0 = f4;
                        }
                    } else {
                        i26 = i30;
                        i3 = -1;
                    }
                    if (z2 && (i4 = ljVar.I0) != i3) {
                        f4 = ljVar.O0;
                        i31 = i4;
                    }
                    adVar8.j0 = i31;
                    adVar8.e0 = f4;
                } else {
                    i26 = i30;
                }
                if (i29 == i26 - 1) {
                    adVar8.f(adVar8.L, this.g, this.k);
                }
                if (adVar7 != null) {
                    lc lcVar12 = adVar7.L;
                    lcVar10.a(lcVar12, ljVar.Q0);
                    if (i29 == i11) {
                        int i32 = this.i;
                        if (lcVar10.h()) {
                            lcVar10.h = i32;
                        }
                    }
                    lcVar12.a(lcVar10, 0);
                    if (i29 == i27 + 1) {
                        int i33 = this.k;
                        if (lcVar12.h()) {
                            lcVar12.h = i33;
                        }
                    }
                }
                if (adVar8 != adVar4) {
                    int i34 = ljVar.R0;
                    if (!z) {
                        if (i34 == 0) {
                            lcVar9.a(lcVar7, 0);
                        } else if (i34 == 1) {
                            lcVar11.a(lcVar8, 0);
                        } else if (i34 == 2) {
                            if (z5) {
                                lcVar9.a(this.d, this.h);
                                lcVar11.a(this.f, this.j);
                            } else {
                                lcVar9.a(lcVar7, 0);
                                lcVar11.a(lcVar8, 0);
                            }
                        }
                        adVar7 = adVar8;
                    } else if (i34 == 0) {
                        lcVar11.a(lcVar8, 0);
                    } else if (i34 == 1) {
                        lcVar9.a(lcVar7, 0);
                    } else if (i34 == 2) {
                        lcVar9.a(lcVar7, 0);
                        lcVar11.a(lcVar8, 0);
                    }
                }
                adVar7 = adVar8;
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
        lj ljVar;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            ljVar = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= ljVar.b1) {
                break;
            }
            ad adVar = ljVar.a1[i2];
            if (this.a == 0) {
                if (adVar != null) {
                    int[] iArr = adVar.p0;
                    if (iArr[0] == 3 && adVar.r == 0) {
                        ljVar.V(1, i5, iArr[1], adVar.k(), adVar);
                    }
                }
            } else if (adVar != null) {
                int[] iArr2 = adVar.p0;
                if (iArr2[1] == 3 && adVar.s == 0) {
                    int i7 = i5;
                    ljVar.V(iArr2[0], adVar.q(), 1, i7, adVar);
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
            if (i10 >= ljVar.b1) {
                return;
            }
            ad adVar2 = ljVar.a1[i10];
            if (this.a == 0) {
                int q = adVar2.q();
                int i11 = ljVar.P0;
                if (adVar2.g0 == 8) {
                    i11 = 0;
                }
                this.l = q + i11 + this.l;
                int T = ljVar.T(adVar2, this.q);
                if (this.b == null || this.c < T) {
                    this.b = adVar2;
                    this.c = T;
                    this.m = T;
                }
            } else {
                int U = ljVar.U(adVar2, this.q);
                int T2 = ljVar.T(adVar2, this.q);
                int i12 = ljVar.Q0;
                if (adVar2.g0 == 8) {
                    i12 = 0;
                }
                this.m = T2 + i12 + this.m;
                if (this.b == null || this.c < U) {
                    this.b = adVar2;
                    this.c = U;
                    this.l = U;
                }
            }
        }
    }

    public final void f(int i, lc lcVar, lc lcVar2, lc lcVar3, lc lcVar4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = lcVar;
        this.e = lcVar2;
        this.f = lcVar3;
        this.g = lcVar4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
