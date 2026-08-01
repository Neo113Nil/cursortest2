package s;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f3745a;
    public C0294c d;

    /* renamed from: e, reason: collision with root package name */
    public C0294c f3748e;

    /* renamed from: f, reason: collision with root package name */
    public C0294c f3749f;

    /* renamed from: g, reason: collision with root package name */
    public C0294c f3750g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3751j;

    /* renamed from: k, reason: collision with root package name */
    public int f3752k;

    /* renamed from: q, reason: collision with root package name */
    public int f3758q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f3759r;

    /* renamed from: b, reason: collision with root package name */
    public C0295d f3746b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f3747c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f3753l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3754m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f3755n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f3756o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f3757p = 0;

    public f(g gVar, int i, C0294c c0294c, C0294c c0294c2, C0294c c0294c3, C0294c c0294c4, int i2) {
        this.f3759r = gVar;
        this.h = 0;
        this.i = 0;
        this.f3751j = 0;
        this.f3752k = 0;
        this.f3758q = 0;
        this.f3745a = i;
        this.d = c0294c;
        this.f3748e = c0294c2;
        this.f3749f = c0294c3;
        this.f3750g = c0294c4;
        this.h = gVar.f3789w0;
        this.i = gVar.f3785s0;
        this.f3751j = gVar.f3790x0;
        this.f3752k = gVar.f3786t0;
        this.f3758q = i2;
    }

    public final void a(C0295d c0295d) {
        int i = this.f3745a;
        g gVar = this.f3759r;
        if (i == 0) {
            int U2 = gVar.U(c0295d, this.f3758q);
            if (c0295d.f3714p0[0] == 3) {
                this.f3757p++;
                U2 = 0;
            }
            this.f3753l = U2 + (c0295d.f3700g0 != 8 ? gVar.f3774P0 : 0) + this.f3753l;
            int T2 = gVar.T(c0295d, this.f3758q);
            if (this.f3746b == null || this.f3747c < T2) {
                this.f3746b = c0295d;
                this.f3747c = T2;
                this.f3754m = T2;
            }
        } else {
            int U3 = gVar.U(c0295d, this.f3758q);
            int T3 = gVar.T(c0295d, this.f3758q);
            if (c0295d.f3714p0[1] == 3) {
                this.f3757p++;
                T3 = 0;
            }
            this.f3754m = T3 + (c0295d.f3700g0 != 8 ? gVar.f3775Q0 : 0) + this.f3754m;
            if (this.f3746b == null || this.f3747c < U3) {
                this.f3746b = c0295d;
                this.f3747c = U3;
                this.f3753l = U3;
            }
        }
        this.f3756o++;
    }

    public final void b(int i, boolean z2, boolean z3) {
        g gVar;
        int i2;
        int i3;
        int i4;
        C0295d c0295d;
        int i5;
        char c2;
        int i6;
        float f2;
        float f3;
        int i7;
        float f4;
        int i8;
        int i9 = this.f3756o;
        int i10 = 0;
        while (true) {
            gVar = this.f3759r;
            if (i10 >= i9 || (i8 = this.f3755n + i10) >= gVar.f3784b1) {
                break;
            }
            C0295d c0295d2 = gVar.f3783a1[i8];
            if (c0295d2 != null) {
                c0295d2.D();
            }
            i10++;
        }
        if (i9 == 0 || this.f3746b == null) {
            return;
        }
        boolean z4 = z3 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.f3755n + (z2 ? (i9 - 1) - i13 : i13);
            if (i14 >= gVar.f3784b1) {
                break;
            }
            C0295d c0295d3 = gVar.f3783a1[i14];
            if (c0295d3 != null && c0295d3.f3700g0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        if (this.f3745a != 0) {
            C0295d c0295d4 = this.f3746b;
            c0295d4.f3702i0 = gVar.D0;
            int i15 = this.h;
            if (i > 0) {
                i15 += gVar.f3774P0;
            }
            C0294c c0294c = c0295d4.f3670I;
            C0294c c0294c2 = c0295d4.f3672K;
            if (z2) {
                c0294c2.a(this.f3749f, i15);
                if (z3) {
                    c0294c.a(this.d, this.f3751j);
                }
                if (i > 0) {
                    this.f3749f.d.f3670I.a(c0294c2, 0);
                }
            } else {
                c0294c.a(this.d, i15);
                if (z3) {
                    c0294c2.a(this.f3749f, this.f3751j);
                }
                if (i > 0) {
                    this.d.d.f3672K.a(c0294c, 0);
                }
            }
            C0295d c0295d5 = null;
            for (int i16 = 0; i16 < i9; i16++) {
                int i17 = this.f3755n + i16;
                if (i17 >= gVar.f3784b1) {
                    return;
                }
                C0295d c0295d6 = gVar.f3783a1[i17];
                if (c0295d6 != null) {
                    C0294c c0294c3 = c0295d6.f3671J;
                    if (i16 == 0) {
                        c0295d6.f(c0294c3, this.f3748e, this.i);
                        int i18 = gVar.f3763E0;
                        float f5 = gVar.f3769K0;
                        if (this.f3755n == 0) {
                            i4 = gVar.f3765G0;
                            i2 = i18;
                            i3 = -1;
                            if (i4 != -1) {
                                f5 = gVar.f3771M0;
                                c0295d6.j0 = i4;
                                c0295d6.f3696e0 = f5;
                            }
                        } else {
                            i2 = i18;
                            i3 = -1;
                        }
                        if (!z3 || (i4 = gVar.f3767I0) == i3) {
                            i4 = i2;
                        } else {
                            f5 = gVar.f3773O0;
                        }
                        c0295d6.j0 = i4;
                        c0295d6.f3696e0 = f5;
                    }
                    if (i16 == i9 - 1) {
                        c0295d6.f(c0295d6.f3673L, this.f3750g, this.f3752k);
                    }
                    if (c0295d5 != null) {
                        int i19 = gVar.f3775Q0;
                        C0294c c0294c4 = c0295d5.f3673L;
                        c0294c3.a(c0294c4, i19);
                        if (i16 == i11) {
                            int i20 = this.i;
                            if (c0294c3.h()) {
                                c0294c3.h = i20;
                            }
                        }
                        c0294c4.a(c0294c3, 0);
                        if (i16 == i12 + 1) {
                            int i21 = this.f3752k;
                            if (c0294c4.h()) {
                                c0294c4.h = i21;
                            }
                        }
                    }
                    if (c0295d6 != c0295d4) {
                        C0294c c0294c5 = c0295d6.f3672K;
                        C0294c c0294c6 = c0295d6.f3670I;
                        if (z2) {
                            int i22 = gVar.f3776R0;
                            if (i22 == 0) {
                                c0294c5.a(c0294c2, 0);
                            } else if (i22 == 1) {
                                c0294c6.a(c0294c, 0);
                            } else if (i22 == 2) {
                                c0294c6.a(c0294c, 0);
                                c0294c5.a(c0294c2, 0);
                            }
                        } else {
                            int i23 = gVar.f3776R0;
                            if (i23 == 0) {
                                c0294c6.a(c0294c, 0);
                            } else if (i23 == 1) {
                                c0294c5.a(c0294c2, 0);
                            } else if (i23 == 2) {
                                if (z4) {
                                    c0294c6.a(this.d, this.h);
                                    c0294c5.a(this.f3749f, this.f3751j);
                                } else {
                                    c0294c6.a(c0294c, 0);
                                    c0294c5.a(c0294c2, 0);
                                }
                            }
                            c0295d5 = c0295d6;
                        }
                    }
                    c0295d5 = c0295d6;
                }
            }
            return;
        }
        C0295d c0295d7 = this.f3746b;
        c0295d7.j0 = gVar.f3763E0;
        int i24 = this.i;
        if (i > 0) {
            i24 += gVar.f3775Q0;
        }
        C0294c c0294c7 = this.f3748e;
        C0294c c0294c8 = c0295d7.f3671J;
        c0294c8.a(c0294c7, i24);
        C0294c c0294c9 = c0295d7.f3673L;
        if (z3) {
            c0294c9.a(this.f3750g, this.f3752k);
        }
        if (i > 0) {
            this.f3748e.d.f3673L.a(c0294c8, 0);
        }
        if (gVar.f3777S0 == 3 && !c0295d7.f3667E) {
            for (int i25 = 0; i25 < i9; i25++) {
                int i26 = this.f3755n + (z2 ? (i9 - 1) - i25 : i25);
                if (i26 >= gVar.f3784b1) {
                    break;
                }
                c0295d = gVar.f3783a1[i26];
                if (c0295d.f3667E) {
                    break;
                }
            }
        }
        c0295d = c0295d7;
        int i27 = 0;
        C0295d c0295d8 = null;
        while (i27 < i9) {
            int i28 = z2 ? (i9 - 1) - i27 : i27;
            int i29 = this.f3755n + i28;
            if (i29 >= gVar.f3784b1) {
                return;
            }
            C0295d c0295d9 = gVar.f3783a1[i29];
            if (c0295d9 == null) {
                i5 = i9;
                c2 = 3;
            } else {
                C0294c c0294c10 = c0295d9.f3670I;
                if (i27 == 0) {
                    c0295d9.f(c0294c10, this.d, this.h);
                }
                if (i28 == 0) {
                    int i30 = gVar.D0;
                    if (z2) {
                        i6 = i30;
                        f2 = 1.0f - gVar.f3768J0;
                    } else {
                        i6 = i30;
                        f2 = gVar.f3768J0;
                    }
                    if (this.f3755n == 0) {
                        int i31 = gVar.f3764F0;
                        f3 = f2;
                        if (i31 != -1) {
                            f4 = z2 ? 1.0f - gVar.f3770L0 : gVar.f3770L0;
                            i7 = i31;
                            c0295d9.f3702i0 = i7;
                            c0295d9.f3694d0 = f4;
                        }
                    } else {
                        f3 = f2;
                    }
                    if (!z3 || (i7 = gVar.f3766H0) == -1) {
                        i7 = i6;
                        f4 = f3;
                    } else {
                        f4 = z2 ? 1.0f - gVar.f3772N0 : gVar.f3772N0;
                    }
                    c0295d9.f3702i0 = i7;
                    c0295d9.f3694d0 = f4;
                }
                if (i27 == i9 - 1) {
                    i5 = i9;
                    c0295d9.f(c0295d9.f3672K, this.f3749f, this.f3751j);
                } else {
                    i5 = i9;
                }
                if (c0295d8 != null) {
                    int i32 = gVar.f3774P0;
                    C0294c c0294c11 = c0295d8.f3672K;
                    c0294c10.a(c0294c11, i32);
                    if (i27 == i11) {
                        int i33 = this.h;
                        if (c0294c10.h()) {
                            c0294c10.h = i33;
                        }
                    }
                    c0294c11.a(c0294c10, 0);
                    if (i27 == i12 + 1) {
                        int i34 = this.f3751j;
                        if (c0294c11.h()) {
                            c0294c11.h = i34;
                        }
                    }
                }
                if (c0295d9 != c0295d7) {
                    int i35 = gVar.f3777S0;
                    c2 = 3;
                    if (i35 == 3 && c0295d.f3667E && c0295d9 != c0295d && c0295d9.f3667E) {
                        c0295d9.f3674M.a(c0295d.f3674M, 0);
                    } else {
                        C0294c c0294c12 = c0295d9.f3671J;
                        if (i35 != 0) {
                            C0294c c0294c13 = c0295d9.f3673L;
                            if (i35 == 1) {
                                c0294c13.a(c0294c9, 0);
                            } else if (z4) {
                                c0294c12.a(this.f3748e, this.i);
                                c0294c13.a(this.f3750g, this.f3752k);
                            } else {
                                c0294c12.a(c0294c8, 0);
                                c0294c13.a(c0294c9, 0);
                            }
                        } else {
                            c0294c12.a(c0294c8, 0);
                        }
                    }
                } else {
                    c2 = 3;
                }
                c0295d8 = c0295d9;
            }
            i27++;
            i9 = i5;
        }
    }

    public final int c() {
        return this.f3745a == 1 ? this.f3754m - this.f3759r.f3775Q0 : this.f3754m;
    }

    public final int d() {
        return this.f3745a == 0 ? this.f3753l - this.f3759r.f3774P0 : this.f3753l;
    }

    public final void e(int i) {
        g gVar;
        int i2;
        int i3 = this.f3757p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f3756o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            gVar = this.f3759r;
            if (i6 >= i4 || (i2 = this.f3755n + i6) >= gVar.f3784b1) {
                break;
            }
            C0295d c0295d = gVar.f3783a1[i2];
            if (this.f3745a == 0) {
                if (c0295d != null) {
                    int[] iArr = c0295d.f3714p0;
                    if (iArr[0] == 3 && c0295d.f3716r == 0) {
                        gVar.V(1, i5, iArr[1], c0295d.k(), c0295d);
                    }
                }
            } else if (c0295d != null) {
                int[] iArr2 = c0295d.f3714p0;
                if (iArr2[1] == 3 && c0295d.f3717s == 0) {
                    gVar.V(iArr2[0], c0295d.q(), 1, i5, c0295d);
                }
            }
            i6++;
        }
        this.f3753l = 0;
        this.f3754m = 0;
        this.f3746b = null;
        this.f3747c = 0;
        int i7 = this.f3756o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f3755n + i8;
            if (i9 >= gVar.f3784b1) {
                return;
            }
            C0295d c0295d2 = gVar.f3783a1[i9];
            if (this.f3745a == 0) {
                int q2 = c0295d2.q();
                int i10 = gVar.f3774P0;
                if (c0295d2.f3700g0 == 8) {
                    i10 = 0;
                }
                this.f3753l = q2 + i10 + this.f3753l;
                int T2 = gVar.T(c0295d2, this.f3758q);
                if (this.f3746b == null || this.f3747c < T2) {
                    this.f3746b = c0295d2;
                    this.f3747c = T2;
                    this.f3754m = T2;
                }
            } else {
                int U2 = gVar.U(c0295d2, this.f3758q);
                int T3 = gVar.T(c0295d2, this.f3758q);
                int i11 = gVar.f3775Q0;
                if (c0295d2.f3700g0 == 8) {
                    i11 = 0;
                }
                this.f3754m = T3 + i11 + this.f3754m;
                if (this.f3746b == null || this.f3747c < U2) {
                    this.f3746b = c0295d2;
                    this.f3747c = U2;
                    this.f3753l = U2;
                }
            }
        }
    }

    public final void f(int i, C0294c c0294c, C0294c c0294c2, C0294c c0294c3, C0294c c0294c4, int i2, int i3, int i4, int i5, int i6) {
        this.f3745a = i;
        this.d = c0294c;
        this.f3748e = c0294c2;
        this.f3749f = c0294c3;
        this.f3750g = c0294c4;
        this.h = i2;
        this.i = i3;
        this.f3751j = i4;
        this.f3752k = i5;
        this.f3758q = i6;
    }
}
