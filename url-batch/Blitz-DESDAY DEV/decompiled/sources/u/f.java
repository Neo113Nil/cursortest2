package u;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f3724a;
    public C0274c d;

    /* renamed from: e, reason: collision with root package name */
    public C0274c f3727e;

    /* renamed from: f, reason: collision with root package name */
    public C0274c f3728f;

    /* renamed from: g, reason: collision with root package name */
    public C0274c f3729g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3730j;

    /* renamed from: k, reason: collision with root package name */
    public int f3731k;

    /* renamed from: q, reason: collision with root package name */
    public int f3737q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f3738r;

    /* renamed from: b, reason: collision with root package name */
    public C0275d f3725b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f3726c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f3732l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3733m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f3734n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f3735o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f3736p = 0;

    public f(g gVar, int i, C0274c c0274c, C0274c c0274c2, C0274c c0274c3, C0274c c0274c4, int i2) {
        this.f3738r = gVar;
        this.h = 0;
        this.i = 0;
        this.f3730j = 0;
        this.f3731k = 0;
        this.f3737q = 0;
        this.f3724a = i;
        this.d = c0274c;
        this.f3727e = c0274c2;
        this.f3728f = c0274c3;
        this.f3729g = c0274c4;
        this.h = gVar.f3769w0;
        this.i = gVar.f3765s0;
        this.f3730j = gVar.f3770x0;
        this.f3731k = gVar.f3766t0;
        this.f3737q = i2;
    }

    public final void a(C0275d c0275d) {
        int i = this.f3724a;
        g gVar = this.f3738r;
        if (i == 0) {
            int U2 = gVar.U(c0275d, this.f3737q);
            if (c0275d.p0[0] == 3) {
                this.f3736p++;
                U2 = 0;
            }
            this.f3732l = U2 + (c0275d.f3678g0 != 8 ? gVar.f3752P0 : 0) + this.f3732l;
            int T2 = gVar.T(c0275d, this.f3737q);
            if (this.f3725b == null || this.f3726c < T2) {
                this.f3725b = c0275d;
                this.f3726c = T2;
                this.f3733m = T2;
            }
        } else {
            int U3 = gVar.U(c0275d, this.f3737q);
            int T3 = gVar.T(c0275d, this.f3737q);
            if (c0275d.p0[1] == 3) {
                this.f3736p++;
                T3 = 0;
            }
            this.f3733m = T3 + (c0275d.f3678g0 != 8 ? gVar.f3753Q0 : 0) + this.f3733m;
            if (this.f3725b == null || this.f3726c < U3) {
                this.f3725b = c0275d;
                this.f3726c = U3;
                this.f3732l = U3;
            }
        }
        this.f3735o++;
    }

    public final void b(int i, boolean z2, boolean z3) {
        g gVar;
        int i2;
        int i3;
        int i4;
        C0275d c0275d;
        int i5;
        char c2;
        int i6;
        float f2;
        float f3;
        int i7;
        float f4;
        int i8;
        int i9 = this.f3735o;
        int i10 = 0;
        while (true) {
            gVar = this.f3738r;
            if (i10 >= i9 || (i8 = this.f3734n + i10) >= gVar.f3764b1) {
                break;
            }
            C0275d c0275d2 = gVar.f3763a1[i8];
            if (c0275d2 != null) {
                c0275d2.D();
            }
            i10++;
        }
        if (i9 == 0 || this.f3725b == null) {
            return;
        }
        boolean z4 = z3 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.f3734n + (z2 ? (i9 - 1) - i13 : i13);
            if (i14 >= gVar.f3764b1) {
                break;
            }
            C0275d c0275d3 = gVar.f3763a1[i14];
            if (c0275d3 != null && c0275d3.f3678g0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        if (this.f3724a != 0) {
            C0275d c0275d4 = this.f3725b;
            c0275d4.f3680i0 = gVar.f3741D0;
            int i15 = this.h;
            if (i > 0) {
                i15 += gVar.f3752P0;
            }
            C0274c c0274c = c0275d4.f3648I;
            C0274c c0274c2 = c0275d4.f3650K;
            if (z2) {
                c0274c2.a(this.f3728f, i15);
                if (z3) {
                    c0274c.a(this.d, this.f3730j);
                }
                if (i > 0) {
                    this.f3728f.d.f3648I.a(c0274c2, 0);
                }
            } else {
                c0274c.a(this.d, i15);
                if (z3) {
                    c0274c2.a(this.f3728f, this.f3730j);
                }
                if (i > 0) {
                    this.d.d.f3650K.a(c0274c, 0);
                }
            }
            C0275d c0275d5 = null;
            for (int i16 = 0; i16 < i9; i16++) {
                int i17 = this.f3734n + i16;
                if (i17 >= gVar.f3764b1) {
                    return;
                }
                C0275d c0275d6 = gVar.f3763a1[i17];
                if (c0275d6 != null) {
                    C0274c c0274c3 = c0275d6.f3649J;
                    if (i16 == 0) {
                        c0275d6.f(c0274c3, this.f3727e, this.i);
                        int i18 = gVar.f3742E0;
                        float f5 = gVar.f3747K0;
                        if (this.f3734n == 0) {
                            i4 = gVar.G0;
                            i2 = i18;
                            i3 = -1;
                            if (i4 != -1) {
                                f5 = gVar.f3749M0;
                                c0275d6.f3682j0 = i4;
                                c0275d6.f3674e0 = f5;
                            }
                        } else {
                            i2 = i18;
                            i3 = -1;
                        }
                        if (!z3 || (i4 = gVar.f3745I0) == i3) {
                            i4 = i2;
                        } else {
                            f5 = gVar.f3751O0;
                        }
                        c0275d6.f3682j0 = i4;
                        c0275d6.f3674e0 = f5;
                    }
                    if (i16 == i9 - 1) {
                        c0275d6.f(c0275d6.f3651L, this.f3729g, this.f3731k);
                    }
                    if (c0275d5 != null) {
                        int i19 = gVar.f3753Q0;
                        C0274c c0274c4 = c0275d5.f3651L;
                        c0274c3.a(c0274c4, i19);
                        if (i16 == i11) {
                            int i20 = this.i;
                            if (c0274c3.h()) {
                                c0274c3.h = i20;
                            }
                        }
                        c0274c4.a(c0274c3, 0);
                        if (i16 == i12 + 1) {
                            int i21 = this.f3731k;
                            if (c0274c4.h()) {
                                c0274c4.h = i21;
                            }
                        }
                    }
                    if (c0275d6 != c0275d4) {
                        C0274c c0274c5 = c0275d6.f3650K;
                        C0274c c0274c6 = c0275d6.f3648I;
                        if (z2) {
                            int i22 = gVar.f3754R0;
                            if (i22 == 0) {
                                c0274c5.a(c0274c2, 0);
                            } else if (i22 == 1) {
                                c0274c6.a(c0274c, 0);
                            } else if (i22 == 2) {
                                c0274c6.a(c0274c, 0);
                                c0274c5.a(c0274c2, 0);
                            }
                        } else {
                            int i23 = gVar.f3754R0;
                            if (i23 == 0) {
                                c0274c6.a(c0274c, 0);
                            } else if (i23 == 1) {
                                c0274c5.a(c0274c2, 0);
                            } else if (i23 == 2) {
                                if (z4) {
                                    c0274c6.a(this.d, this.h);
                                    c0274c5.a(this.f3728f, this.f3730j);
                                } else {
                                    c0274c6.a(c0274c, 0);
                                    c0274c5.a(c0274c2, 0);
                                }
                            }
                            c0275d5 = c0275d6;
                        }
                    }
                    c0275d5 = c0275d6;
                }
            }
            return;
        }
        C0275d c0275d7 = this.f3725b;
        c0275d7.f3682j0 = gVar.f3742E0;
        int i24 = this.i;
        if (i > 0) {
            i24 += gVar.f3753Q0;
        }
        C0274c c0274c7 = this.f3727e;
        C0274c c0274c8 = c0275d7.f3649J;
        c0274c8.a(c0274c7, i24);
        C0274c c0274c9 = c0275d7.f3651L;
        if (z3) {
            c0274c9.a(this.f3729g, this.f3731k);
        }
        if (i > 0) {
            this.f3727e.d.f3651L.a(c0274c8, 0);
        }
        if (gVar.f3755S0 == 3 && !c0275d7.f3645E) {
            for (int i25 = 0; i25 < i9; i25++) {
                int i26 = this.f3734n + (z2 ? (i9 - 1) - i25 : i25);
                if (i26 >= gVar.f3764b1) {
                    break;
                }
                c0275d = gVar.f3763a1[i26];
                if (c0275d.f3645E) {
                    break;
                }
            }
        }
        c0275d = c0275d7;
        int i27 = 0;
        C0275d c0275d8 = null;
        while (i27 < i9) {
            int i28 = z2 ? (i9 - 1) - i27 : i27;
            int i29 = this.f3734n + i28;
            if (i29 >= gVar.f3764b1) {
                return;
            }
            C0275d c0275d9 = gVar.f3763a1[i29];
            if (c0275d9 == null) {
                i5 = i9;
                c2 = 3;
            } else {
                C0274c c0274c10 = c0275d9.f3648I;
                if (i27 == 0) {
                    c0275d9.f(c0274c10, this.d, this.h);
                }
                if (i28 == 0) {
                    int i30 = gVar.f3741D0;
                    if (z2) {
                        i6 = i30;
                        f2 = 1.0f - gVar.f3746J0;
                    } else {
                        i6 = i30;
                        f2 = gVar.f3746J0;
                    }
                    if (this.f3734n == 0) {
                        int i31 = gVar.f3743F0;
                        f3 = f2;
                        if (i31 != -1) {
                            f4 = z2 ? 1.0f - gVar.f3748L0 : gVar.f3748L0;
                            i7 = i31;
                            c0275d9.f3680i0 = i7;
                            c0275d9.f3672d0 = f4;
                        }
                    } else {
                        f3 = f2;
                    }
                    if (!z3 || (i7 = gVar.f3744H0) == -1) {
                        i7 = i6;
                        f4 = f3;
                    } else {
                        f4 = z2 ? 1.0f - gVar.f3750N0 : gVar.f3750N0;
                    }
                    c0275d9.f3680i0 = i7;
                    c0275d9.f3672d0 = f4;
                }
                if (i27 == i9 - 1) {
                    i5 = i9;
                    c0275d9.f(c0275d9.f3650K, this.f3728f, this.f3730j);
                } else {
                    i5 = i9;
                }
                if (c0275d8 != null) {
                    int i32 = gVar.f3752P0;
                    C0274c c0274c11 = c0275d8.f3650K;
                    c0274c10.a(c0274c11, i32);
                    if (i27 == i11) {
                        int i33 = this.h;
                        if (c0274c10.h()) {
                            c0274c10.h = i33;
                        }
                    }
                    c0274c11.a(c0274c10, 0);
                    if (i27 == i12 + 1) {
                        int i34 = this.f3730j;
                        if (c0274c11.h()) {
                            c0274c11.h = i34;
                        }
                    }
                }
                if (c0275d9 != c0275d7) {
                    int i35 = gVar.f3755S0;
                    c2 = 3;
                    if (i35 == 3 && c0275d.f3645E && c0275d9 != c0275d && c0275d9.f3645E) {
                        c0275d9.f3652M.a(c0275d.f3652M, 0);
                    } else {
                        C0274c c0274c12 = c0275d9.f3649J;
                        if (i35 != 0) {
                            C0274c c0274c13 = c0275d9.f3651L;
                            if (i35 == 1) {
                                c0274c13.a(c0274c9, 0);
                            } else if (z4) {
                                c0274c12.a(this.f3727e, this.i);
                                c0274c13.a(this.f3729g, this.f3731k);
                            } else {
                                c0274c12.a(c0274c8, 0);
                                c0274c13.a(c0274c9, 0);
                            }
                        } else {
                            c0274c12.a(c0274c8, 0);
                        }
                    }
                } else {
                    c2 = 3;
                }
                c0275d8 = c0275d9;
            }
            i27++;
            i9 = i5;
        }
    }

    public final int c() {
        return this.f3724a == 1 ? this.f3733m - this.f3738r.f3753Q0 : this.f3733m;
    }

    public final int d() {
        return this.f3724a == 0 ? this.f3732l - this.f3738r.f3752P0 : this.f3732l;
    }

    public final void e(int i) {
        g gVar;
        int i2;
        int i3 = this.f3736p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f3735o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            gVar = this.f3738r;
            if (i6 >= i4 || (i2 = this.f3734n + i6) >= gVar.f3764b1) {
                break;
            }
            C0275d c0275d = gVar.f3763a1[i2];
            if (this.f3724a == 0) {
                if (c0275d != null) {
                    int[] iArr = c0275d.p0;
                    if (iArr[0] == 3 && c0275d.f3695r == 0) {
                        gVar.V(1, i5, iArr[1], c0275d.k(), c0275d);
                    }
                }
            } else if (c0275d != null) {
                int[] iArr2 = c0275d.p0;
                if (iArr2[1] == 3 && c0275d.f3696s == 0) {
                    gVar.V(iArr2[0], c0275d.q(), 1, i5, c0275d);
                }
            }
            i6++;
        }
        this.f3732l = 0;
        this.f3733m = 0;
        this.f3725b = null;
        this.f3726c = 0;
        int i7 = this.f3735o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f3734n + i8;
            if (i9 >= gVar.f3764b1) {
                return;
            }
            C0275d c0275d2 = gVar.f3763a1[i9];
            if (this.f3724a == 0) {
                int q2 = c0275d2.q();
                int i10 = gVar.f3752P0;
                if (c0275d2.f3678g0 == 8) {
                    i10 = 0;
                }
                this.f3732l = q2 + i10 + this.f3732l;
                int T2 = gVar.T(c0275d2, this.f3737q);
                if (this.f3725b == null || this.f3726c < T2) {
                    this.f3725b = c0275d2;
                    this.f3726c = T2;
                    this.f3733m = T2;
                }
            } else {
                int U2 = gVar.U(c0275d2, this.f3737q);
                int T3 = gVar.T(c0275d2, this.f3737q);
                int i11 = gVar.f3753Q0;
                if (c0275d2.f3678g0 == 8) {
                    i11 = 0;
                }
                this.f3733m = T3 + i11 + this.f3733m;
                if (this.f3725b == null || this.f3726c < U2) {
                    this.f3725b = c0275d2;
                    this.f3726c = U2;
                    this.f3732l = U2;
                }
            }
        }
    }

    public final void f(int i, C0274c c0274c, C0274c c0274c2, C0274c c0274c3, C0274c c0274c4, int i2, int i3, int i4, int i5, int i6) {
        this.f3724a = i;
        this.d = c0274c;
        this.f3727e = c0274c2;
        this.f3728f = c0274c3;
        this.f3729g = c0274c4;
        this.h = i2;
        this.i = i3;
        this.f3730j = i4;
        this.f3731k = i5;
        this.f3737q = i6;
    }
}
