package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class to {
    public int a;
    public xe d;
    public xe e;
    public xe f;
    public xe g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ uo r;
    public rf b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public to(uo uoVar, int i, xe xeVar, xe xeVar2, xe xeVar3, xe xeVar4, int i2) {
        this.r = uoVar;
        this.a = i;
        this.d = xeVar;
        this.e = xeVar2;
        this.f = xeVar3;
        this.g = xeVar4;
        this.h = uoVar.w0;
        this.i = uoVar.s0;
        this.j = uoVar.x0;
        this.k = uoVar.t0;
        this.q = i2;
    }

    public final void a(rf rfVar) {
        int i = this.a;
        int i2 = this.q;
        uo uoVar = this.r;
        if (i == 0) {
            int U = uoVar.U(rfVar, i2);
            if (rfVar.T[0] == qf.MATCH_CONSTRAINT) {
                this.p++;
                U = 0;
            }
            this.l = U + (rfVar.h0 != 8 ? uoVar.P0 : 0) + this.l;
            int T = uoVar.T(rfVar, this.q);
            if (this.b == null || this.c < T) {
                this.b = rfVar;
                this.c = T;
                this.m = T;
            }
        } else {
            int U2 = uoVar.U(rfVar, i2);
            int T2 = uoVar.T(rfVar, this.q);
            if (rfVar.T[1] == qf.MATCH_CONSTRAINT) {
                this.p++;
                T2 = 0;
            }
            this.m = T2 + (rfVar.h0 != 8 ? uoVar.Q0 : 0) + this.m;
            if (this.b == null || this.c < U2) {
                this.b = rfVar;
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
        uo uoVar;
        int i2;
        int i3;
        int i4;
        rf rfVar;
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
            uoVar = this.r;
            if (i10 >= i9 || (i8 = this.n + i10) >= uoVar.b1) {
                break;
            }
            rf rfVar2 = uoVar.a1[i8];
            if (rfVar2 != null) {
                rfVar2.D();
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
            if (i14 >= uoVar.b1) {
                break;
            }
            rf rfVar3 = uoVar.a1[i14];
            if (rfVar3 != null && rfVar3.h0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        int i15 = this.a;
        rf rfVar4 = this.b;
        if (i15 == 0) {
            rfVar4.k0 = uoVar.E0;
            xe xeVar = rfVar4.L;
            xe xeVar2 = rfVar4.J;
            int i16 = this.i;
            if (i > 0) {
                i16 += uoVar.Q0;
            }
            xeVar2.a(this.e, i16);
            if (z2) {
                xeVar.a(this.g, this.k);
            }
            if (i > 0) {
                this.e.d.L.a(xeVar2, 0);
            }
            if (uoVar.S0 == 3 && !rfVar4.E) {
                for (int i17 = 0; i17 < i9; i17++) {
                    int i18 = this.n + (z ? (i9 - 1) - i17 : i17);
                    if (i18 >= uoVar.b1) {
                        break;
                    }
                    rfVar = uoVar.a1[i18];
                    if (rfVar.E) {
                        break;
                    }
                }
            }
            rfVar = rfVar4;
            int i19 = 0;
            rf rfVar5 = null;
            while (i19 < i9) {
                int i20 = z ? (i9 - 1) - i19 : i19;
                int i21 = this.n + i20;
                if (i21 >= uoVar.b1) {
                    return;
                }
                rf rfVar6 = uoVar.a1[i21];
                if (rfVar6 == null) {
                    i6 = i9;
                    z3 = z4;
                    i5 = i12;
                    c = 3;
                } else {
                    xe xeVar3 = rfVar6.J;
                    xe xeVar4 = rfVar6.L;
                    xe xeVar5 = rfVar6.I;
                    z3 = z4;
                    if (i19 == 0) {
                        i5 = i12;
                        rfVar6.f(xeVar5, this.d, this.h);
                    } else {
                        i5 = i12;
                    }
                    if (i20 == 0) {
                        int i22 = uoVar.D0;
                        float f3 = uoVar.J0;
                        if (z) {
                            f3 = 1.0f - f3;
                        }
                        if (this.n == 0) {
                            i7 = uoVar.F0;
                            f = f3;
                            if (i7 != -1) {
                                f2 = uoVar.L0;
                            }
                        } else {
                            f = f3;
                        }
                        if (!z2 || (i7 = uoVar.H0) == -1) {
                            i7 = i22;
                            f2 = f;
                        } else {
                            f2 = uoVar.N0;
                        }
                        rfVar6.j0 = i7;
                        rfVar6.e0 = f2;
                    }
                    if (i19 == i9 - 1) {
                        i6 = i9;
                        rfVar6.f(rfVar6.K, this.f, this.j);
                    } else {
                        i6 = i9;
                    }
                    if (rfVar5 != null) {
                        xe xeVar6 = rfVar5.K;
                        xeVar5.a(xeVar6, uoVar.P0);
                        if (i19 == i11) {
                            int i23 = this.h;
                            if (xeVar5.h()) {
                                xeVar5.h = i23;
                            }
                        }
                        xeVar6.a(xeVar5, 0);
                        if (i19 == i5 + 1) {
                            int i24 = this.j;
                            if (xeVar6.h()) {
                                xeVar6.h = i24;
                            }
                        }
                    }
                    if (rfVar6 != rfVar4) {
                        int i25 = uoVar.S0;
                        c = 3;
                        if (i25 == 3 && rfVar.E && rfVar6 != rfVar && rfVar6.E) {
                            rfVar6.M.a(rfVar.M, 0);
                        } else if (i25 == 0) {
                            xeVar3.a(xeVar2, 0);
                        } else if (i25 == 1) {
                            xeVar4.a(xeVar, 0);
                        } else if (z3) {
                            xeVar3.a(this.e, this.i);
                            xeVar4.a(this.g, this.k);
                        } else {
                            xeVar3.a(xeVar2, 0);
                            xeVar4.a(xeVar, 0);
                        }
                    } else {
                        c = 3;
                    }
                    rfVar5 = rfVar6;
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
        rfVar4.j0 = uoVar.D0;
        xe xeVar7 = rfVar4.I;
        xe xeVar8 = rfVar4.K;
        int i28 = this.h;
        if (i > 0) {
            i28 += uoVar.P0;
        }
        if (z) {
            xeVar8.a(this.f, i28);
            if (z2) {
                xeVar7.a(this.d, this.j);
            }
            if (i > 0) {
                this.f.d.I.a(xeVar8, 0);
            }
        } else {
            xeVar7.a(this.d, i28);
            if (z2) {
                xeVar8.a(this.f, this.j);
            }
            if (i > 0) {
                this.d.d.K.a(xeVar7, 0);
            }
        }
        int i29 = 0;
        rf rfVar7 = null;
        while (true) {
            int i30 = i26;
            if (i29 >= i30 || (i2 = this.n + i29) >= uoVar.b1) {
                return;
            }
            rf rfVar8 = uoVar.a1[i2];
            if (rfVar8 == null) {
                i26 = i30;
            } else {
                xe xeVar9 = rfVar8.I;
                xe xeVar10 = rfVar8.J;
                xe xeVar11 = rfVar8.K;
                if (i29 == 0) {
                    rfVar8.f(xeVar10, this.e, this.i);
                    int i31 = uoVar.E0;
                    float f4 = uoVar.K0;
                    if (this.n == 0) {
                        i4 = uoVar.G0;
                        i26 = i30;
                        i3 = -1;
                        if (i4 != -1) {
                            f4 = uoVar.M0;
                            i31 = i4;
                            rfVar8.k0 = i31;
                            rfVar8.f0 = f4;
                        }
                    } else {
                        i26 = i30;
                        i3 = -1;
                    }
                    if (z2 && (i4 = uoVar.I0) != i3) {
                        f4 = uoVar.O0;
                        i31 = i4;
                    }
                    rfVar8.k0 = i31;
                    rfVar8.f0 = f4;
                } else {
                    i26 = i30;
                }
                if (i29 == i26 - 1) {
                    rfVar8.f(rfVar8.L, this.g, this.k);
                }
                if (rfVar7 != null) {
                    xe xeVar12 = rfVar7.L;
                    xeVar10.a(xeVar12, uoVar.Q0);
                    if (i29 == i11) {
                        int i32 = this.i;
                        if (xeVar10.h()) {
                            xeVar10.h = i32;
                        }
                    }
                    xeVar12.a(xeVar10, 0);
                    if (i29 == i27 + 1) {
                        int i33 = this.k;
                        if (xeVar12.h()) {
                            xeVar12.h = i33;
                        }
                    }
                }
                if (rfVar8 != rfVar4) {
                    int i34 = uoVar.R0;
                    if (!z) {
                        if (i34 == 0) {
                            xeVar9.a(xeVar7, 0);
                        } else if (i34 == 1) {
                            xeVar11.a(xeVar8, 0);
                        } else if (i34 == 2) {
                            if (z5) {
                                xeVar9.a(this.d, this.h);
                                xeVar11.a(this.f, this.j);
                            } else {
                                xeVar9.a(xeVar7, 0);
                                xeVar11.a(xeVar8, 0);
                            }
                        }
                        rfVar7 = rfVar8;
                    } else if (i34 == 0) {
                        xeVar11.a(xeVar8, 0);
                    } else if (i34 == 1) {
                        xeVar9.a(xeVar7, 0);
                    } else if (i34 == 2) {
                        xeVar9.a(xeVar7, 0);
                        xeVar11.a(xeVar8, 0);
                    }
                }
                rfVar7 = rfVar8;
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
        uo uoVar;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            uoVar = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= uoVar.b1) {
                break;
            }
            rf rfVar = uoVar.a1[i2];
            if (this.a == 0) {
                if (rfVar != null) {
                    qf[] qfVarArr = rfVar.T;
                    if (qfVarArr[0] == qf.MATCH_CONSTRAINT && rfVar.r == 0) {
                        uoVar.V(rfVar, qf.FIXED, i5, qfVarArr[1], rfVar.k());
                    }
                }
            } else if (rfVar != null) {
                qf[] qfVarArr2 = rfVar.T;
                if (qfVarArr2[1] == qf.MATCH_CONSTRAINT && rfVar.s == 0) {
                    int i7 = i5;
                    uoVar.V(rfVar, qfVarArr2[0], rfVar.q(), qf.FIXED, i7);
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
            if (i10 >= uoVar.b1) {
                return;
            }
            rf rfVar2 = uoVar.a1[i10];
            if (this.a == 0) {
                int q = rfVar2.q();
                int i11 = uoVar.P0;
                if (rfVar2.h0 == 8) {
                    i11 = 0;
                }
                this.l = q + i11 + this.l;
                int T = uoVar.T(rfVar2, this.q);
                if (this.b == null || this.c < T) {
                    this.b = rfVar2;
                    this.c = T;
                    this.m = T;
                }
            } else {
                int U = uoVar.U(rfVar2, this.q);
                int T2 = uoVar.T(rfVar2, this.q);
                int i12 = uoVar.Q0;
                if (rfVar2.h0 == 8) {
                    i12 = 0;
                }
                this.m = T2 + i12 + this.m;
                if (this.b == null || this.c < U) {
                    this.b = rfVar2;
                    this.c = U;
                    this.l = U;
                }
            }
        }
    }

    public final void f(int i, xe xeVar, xe xeVar2, xe xeVar3, xe xeVar4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = xeVar;
        this.e = xeVar2;
        this.f = xeVar3;
        this.g = xeVar4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
