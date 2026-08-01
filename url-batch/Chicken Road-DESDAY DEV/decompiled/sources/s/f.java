package s;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f3632a;
    public C0295c d;

    /* renamed from: e, reason: collision with root package name */
    public C0295c f3635e;

    /* renamed from: f, reason: collision with root package name */
    public C0295c f3636f;

    /* renamed from: g, reason: collision with root package name */
    public C0295c f3637g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3638j;

    /* renamed from: k, reason: collision with root package name */
    public int f3639k;

    /* renamed from: q, reason: collision with root package name */
    public int f3645q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f3646r;

    /* renamed from: b, reason: collision with root package name */
    public C0296d f3633b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f3634c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f3640l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3641m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f3642n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f3643o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f3644p = 0;

    public f(g gVar, int i, C0295c c0295c, C0295c c0295c2, C0295c c0295c3, C0295c c0295c4, int i2) {
        this.f3646r = gVar;
        this.h = 0;
        this.i = 0;
        this.f3638j = 0;
        this.f3639k = 0;
        this.f3645q = 0;
        this.f3632a = i;
        this.d = c0295c;
        this.f3635e = c0295c2;
        this.f3636f = c0295c3;
        this.f3637g = c0295c4;
        this.h = gVar.f3676w0;
        this.i = gVar.f3672s0;
        this.f3638j = gVar.f3677x0;
        this.f3639k = gVar.f3673t0;
        this.f3645q = i2;
    }

    public final void a(C0296d c0296d) {
        int i = this.f3632a;
        g gVar = this.f3646r;
        if (i == 0) {
            int U2 = gVar.U(c0296d, this.f3645q);
            if (c0296d.f3601p0[0] == 3) {
                this.f3644p++;
                U2 = 0;
            }
            this.f3640l = U2 + (c0296d.f3586g0 != 8 ? gVar.f3661P0 : 0) + this.f3640l;
            int T2 = gVar.T(c0296d, this.f3645q);
            if (this.f3633b == null || this.f3634c < T2) {
                this.f3633b = c0296d;
                this.f3634c = T2;
                this.f3641m = T2;
            }
        } else {
            int U3 = gVar.U(c0296d, this.f3645q);
            int T3 = gVar.T(c0296d, this.f3645q);
            if (c0296d.f3601p0[1] == 3) {
                this.f3644p++;
                T3 = 0;
            }
            this.f3641m = T3 + (c0296d.f3586g0 != 8 ? gVar.f3662Q0 : 0) + this.f3641m;
            if (this.f3633b == null || this.f3634c < U3) {
                this.f3633b = c0296d;
                this.f3634c = U3;
                this.f3640l = U3;
            }
        }
        this.f3643o++;
    }

    public final void b(int i, boolean z2, boolean z3) {
        g gVar;
        int i2;
        int i3;
        int i4;
        C0296d c0296d;
        int i5;
        char c2;
        int i6;
        float f2;
        float f3;
        int i7;
        float f4;
        int i8;
        int i9 = this.f3643o;
        int i10 = 0;
        while (true) {
            gVar = this.f3646r;
            if (i10 >= i9 || (i8 = this.f3642n + i10) >= gVar.f3671b1) {
                break;
            }
            C0296d c0296d2 = gVar.f3670a1[i8];
            if (c0296d2 != null) {
                c0296d2.D();
            }
            i10++;
        }
        if (i9 == 0 || this.f3633b == null) {
            return;
        }
        boolean z4 = z3 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.f3642n + (z2 ? (i9 - 1) - i13 : i13);
            if (i14 >= gVar.f3671b1) {
                break;
            }
            C0296d c0296d3 = gVar.f3670a1[i14];
            if (c0296d3 != null && c0296d3.f3586g0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        if (this.f3632a != 0) {
            C0296d c0296d4 = this.f3633b;
            c0296d4.f3588i0 = gVar.D0;
            int i15 = this.h;
            if (i > 0) {
                i15 += gVar.f3661P0;
            }
            C0295c c0295c = c0296d4.f3556I;
            C0295c c0295c2 = c0296d4.f3558K;
            if (z2) {
                c0295c2.a(this.f3636f, i15);
                if (z3) {
                    c0295c.a(this.d, this.f3638j);
                }
                if (i > 0) {
                    this.f3636f.d.f3556I.a(c0295c2, 0);
                }
            } else {
                c0295c.a(this.d, i15);
                if (z3) {
                    c0295c2.a(this.f3636f, this.f3638j);
                }
                if (i > 0) {
                    this.d.d.f3558K.a(c0295c, 0);
                }
            }
            C0296d c0296d5 = null;
            for (int i16 = 0; i16 < i9; i16++) {
                int i17 = this.f3642n + i16;
                if (i17 >= gVar.f3671b1) {
                    return;
                }
                C0296d c0296d6 = gVar.f3670a1[i17];
                if (c0296d6 != null) {
                    C0295c c0295c3 = c0296d6.f3557J;
                    if (i16 == 0) {
                        c0296d6.f(c0295c3, this.f3635e, this.i);
                        int i18 = gVar.f3650E0;
                        float f5 = gVar.f3656K0;
                        if (this.f3642n == 0) {
                            i4 = gVar.f3652G0;
                            i2 = i18;
                            i3 = -1;
                            if (i4 != -1) {
                                f5 = gVar.f3658M0;
                                c0296d6.f3590j0 = i4;
                                c0296d6.f3582e0 = f5;
                            }
                        } else {
                            i2 = i18;
                            i3 = -1;
                        }
                        if (!z3 || (i4 = gVar.f3654I0) == i3) {
                            i4 = i2;
                        } else {
                            f5 = gVar.f3660O0;
                        }
                        c0296d6.f3590j0 = i4;
                        c0296d6.f3582e0 = f5;
                    }
                    if (i16 == i9 - 1) {
                        c0296d6.f(c0296d6.f3559L, this.f3637g, this.f3639k);
                    }
                    if (c0296d5 != null) {
                        int i19 = gVar.f3662Q0;
                        C0295c c0295c4 = c0296d5.f3559L;
                        c0295c3.a(c0295c4, i19);
                        if (i16 == i11) {
                            int i20 = this.i;
                            if (c0295c3.h()) {
                                c0295c3.h = i20;
                            }
                        }
                        c0295c4.a(c0295c3, 0);
                        if (i16 == i12 + 1) {
                            int i21 = this.f3639k;
                            if (c0295c4.h()) {
                                c0295c4.h = i21;
                            }
                        }
                    }
                    if (c0296d6 != c0296d4) {
                        C0295c c0295c5 = c0296d6.f3558K;
                        C0295c c0295c6 = c0296d6.f3556I;
                        if (z2) {
                            int i22 = gVar.f3663R0;
                            if (i22 == 0) {
                                c0295c5.a(c0295c2, 0);
                            } else if (i22 == 1) {
                                c0295c6.a(c0295c, 0);
                            } else if (i22 == 2) {
                                c0295c6.a(c0295c, 0);
                                c0295c5.a(c0295c2, 0);
                            }
                        } else {
                            int i23 = gVar.f3663R0;
                            if (i23 == 0) {
                                c0295c6.a(c0295c, 0);
                            } else if (i23 == 1) {
                                c0295c5.a(c0295c2, 0);
                            } else if (i23 == 2) {
                                if (z4) {
                                    c0295c6.a(this.d, this.h);
                                    c0295c5.a(this.f3636f, this.f3638j);
                                } else {
                                    c0295c6.a(c0295c, 0);
                                    c0295c5.a(c0295c2, 0);
                                }
                            }
                            c0296d5 = c0296d6;
                        }
                    }
                    c0296d5 = c0296d6;
                }
            }
            return;
        }
        C0296d c0296d7 = this.f3633b;
        c0296d7.f3590j0 = gVar.f3650E0;
        int i24 = this.i;
        if (i > 0) {
            i24 += gVar.f3662Q0;
        }
        C0295c c0295c7 = this.f3635e;
        C0295c c0295c8 = c0296d7.f3557J;
        c0295c8.a(c0295c7, i24);
        C0295c c0295c9 = c0296d7.f3559L;
        if (z3) {
            c0295c9.a(this.f3637g, this.f3639k);
        }
        if (i > 0) {
            this.f3635e.d.f3559L.a(c0295c8, 0);
        }
        if (gVar.f3664S0 == 3 && !c0296d7.f3553E) {
            for (int i25 = 0; i25 < i9; i25++) {
                int i26 = this.f3642n + (z2 ? (i9 - 1) - i25 : i25);
                if (i26 >= gVar.f3671b1) {
                    break;
                }
                c0296d = gVar.f3670a1[i26];
                if (c0296d.f3553E) {
                    break;
                }
            }
        }
        c0296d = c0296d7;
        int i27 = 0;
        C0296d c0296d8 = null;
        while (i27 < i9) {
            int i28 = z2 ? (i9 - 1) - i27 : i27;
            int i29 = this.f3642n + i28;
            if (i29 >= gVar.f3671b1) {
                return;
            }
            C0296d c0296d9 = gVar.f3670a1[i29];
            if (c0296d9 == null) {
                i5 = i9;
                c2 = 3;
            } else {
                C0295c c0295c10 = c0296d9.f3556I;
                if (i27 == 0) {
                    c0296d9.f(c0295c10, this.d, this.h);
                }
                if (i28 == 0) {
                    int i30 = gVar.D0;
                    if (z2) {
                        i6 = i30;
                        f2 = 1.0f - gVar.f3655J0;
                    } else {
                        i6 = i30;
                        f2 = gVar.f3655J0;
                    }
                    if (this.f3642n == 0) {
                        int i31 = gVar.f3651F0;
                        f3 = f2;
                        if (i31 != -1) {
                            f4 = z2 ? 1.0f - gVar.f3657L0 : gVar.f3657L0;
                            i7 = i31;
                            c0296d9.f3588i0 = i7;
                            c0296d9.f3580d0 = f4;
                        }
                    } else {
                        f3 = f2;
                    }
                    if (!z3 || (i7 = gVar.f3653H0) == -1) {
                        i7 = i6;
                        f4 = f3;
                    } else {
                        f4 = z2 ? 1.0f - gVar.f3659N0 : gVar.f3659N0;
                    }
                    c0296d9.f3588i0 = i7;
                    c0296d9.f3580d0 = f4;
                }
                if (i27 == i9 - 1) {
                    i5 = i9;
                    c0296d9.f(c0296d9.f3558K, this.f3636f, this.f3638j);
                } else {
                    i5 = i9;
                }
                if (c0296d8 != null) {
                    int i32 = gVar.f3661P0;
                    C0295c c0295c11 = c0296d8.f3558K;
                    c0295c10.a(c0295c11, i32);
                    if (i27 == i11) {
                        int i33 = this.h;
                        if (c0295c10.h()) {
                            c0295c10.h = i33;
                        }
                    }
                    c0295c11.a(c0295c10, 0);
                    if (i27 == i12 + 1) {
                        int i34 = this.f3638j;
                        if (c0295c11.h()) {
                            c0295c11.h = i34;
                        }
                    }
                }
                if (c0296d9 != c0296d7) {
                    int i35 = gVar.f3664S0;
                    c2 = 3;
                    if (i35 == 3 && c0296d.f3553E && c0296d9 != c0296d && c0296d9.f3553E) {
                        c0296d9.f3560M.a(c0296d.f3560M, 0);
                    } else {
                        C0295c c0295c12 = c0296d9.f3557J;
                        if (i35 != 0) {
                            C0295c c0295c13 = c0296d9.f3559L;
                            if (i35 == 1) {
                                c0295c13.a(c0295c9, 0);
                            } else if (z4) {
                                c0295c12.a(this.f3635e, this.i);
                                c0295c13.a(this.f3637g, this.f3639k);
                            } else {
                                c0295c12.a(c0295c8, 0);
                                c0295c13.a(c0295c9, 0);
                            }
                        } else {
                            c0295c12.a(c0295c8, 0);
                        }
                    }
                } else {
                    c2 = 3;
                }
                c0296d8 = c0296d9;
            }
            i27++;
            i9 = i5;
        }
    }

    public final int c() {
        return this.f3632a == 1 ? this.f3641m - this.f3646r.f3662Q0 : this.f3641m;
    }

    public final int d() {
        return this.f3632a == 0 ? this.f3640l - this.f3646r.f3661P0 : this.f3640l;
    }

    public final void e(int i) {
        g gVar;
        int i2;
        int i3 = this.f3644p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f3643o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            gVar = this.f3646r;
            if (i6 >= i4 || (i2 = this.f3642n + i6) >= gVar.f3671b1) {
                break;
            }
            C0296d c0296d = gVar.f3670a1[i2];
            if (this.f3632a == 0) {
                if (c0296d != null) {
                    int[] iArr = c0296d.f3601p0;
                    if (iArr[0] == 3 && c0296d.f3603r == 0) {
                        gVar.V(1, i5, iArr[1], c0296d.k(), c0296d);
                    }
                }
            } else if (c0296d != null) {
                int[] iArr2 = c0296d.f3601p0;
                if (iArr2[1] == 3 && c0296d.f3604s == 0) {
                    gVar.V(iArr2[0], c0296d.q(), 1, i5, c0296d);
                }
            }
            i6++;
        }
        this.f3640l = 0;
        this.f3641m = 0;
        this.f3633b = null;
        this.f3634c = 0;
        int i7 = this.f3643o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f3642n + i8;
            if (i9 >= gVar.f3671b1) {
                return;
            }
            C0296d c0296d2 = gVar.f3670a1[i9];
            if (this.f3632a == 0) {
                int q2 = c0296d2.q();
                int i10 = gVar.f3661P0;
                if (c0296d2.f3586g0 == 8) {
                    i10 = 0;
                }
                this.f3640l = q2 + i10 + this.f3640l;
                int T2 = gVar.T(c0296d2, this.f3645q);
                if (this.f3633b == null || this.f3634c < T2) {
                    this.f3633b = c0296d2;
                    this.f3634c = T2;
                    this.f3641m = T2;
                }
            } else {
                int U2 = gVar.U(c0296d2, this.f3645q);
                int T3 = gVar.T(c0296d2, this.f3645q);
                int i11 = gVar.f3662Q0;
                if (c0296d2.f3586g0 == 8) {
                    i11 = 0;
                }
                this.f3641m = T3 + i11 + this.f3641m;
                if (this.f3633b == null || this.f3634c < U2) {
                    this.f3633b = c0296d2;
                    this.f3634c = U2;
                    this.f3640l = U2;
                }
            }
        }
    }

    public final void f(int i, C0295c c0295c, C0295c c0295c2, C0295c c0295c3, C0295c c0295c4, int i2, int i3, int i4, int i5, int i6) {
        this.f3632a = i;
        this.d = c0295c;
        this.f3635e = c0295c2;
        this.f3636f = c0295c3;
        this.f3637g = c0295c4;
        this.h = i2;
        this.i = i3;
        this.f3638j = i4;
        this.f3639k = i5;
        this.f3645q = i6;
    }
}
