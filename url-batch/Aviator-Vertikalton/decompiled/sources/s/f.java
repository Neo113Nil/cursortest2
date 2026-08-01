package s;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f4088a;

    /* renamed from: d, reason: collision with root package name */
    public C0324c f4091d;

    /* renamed from: e, reason: collision with root package name */
    public C0324c f4092e;

    /* renamed from: f, reason: collision with root package name */
    public C0324c f4093f;

    /* renamed from: g, reason: collision with root package name */
    public C0324c f4094g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4095j;

    /* renamed from: k, reason: collision with root package name */
    public int f4096k;

    /* renamed from: q, reason: collision with root package name */
    public int f4102q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f4103r;

    /* renamed from: b, reason: collision with root package name */
    public C0325d f4089b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f4090c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f4097l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f4098m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f4099n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f4100o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f4101p = 0;

    public f(g gVar, int i, C0324c c0324c, C0324c c0324c2, C0324c c0324c3, C0324c c0324c4, int i2) {
        this.f4103r = gVar;
        this.h = 0;
        this.i = 0;
        this.f4095j = 0;
        this.f4096k = 0;
        this.f4102q = 0;
        this.f4088a = i;
        this.f4091d = c0324c;
        this.f4092e = c0324c2;
        this.f4093f = c0324c3;
        this.f4094g = c0324c4;
        this.h = gVar.f4133w0;
        this.i = gVar.f4129s0;
        this.f4095j = gVar.x0;
        this.f4096k = gVar.f4130t0;
        this.f4102q = i2;
    }

    public final void a(C0325d c0325d) {
        int i = this.f4088a;
        g gVar = this.f4103r;
        if (i == 0) {
            int U2 = gVar.U(c0325d, this.f4102q);
            if (c0325d.f4057p0[0] == 3) {
                this.f4101p++;
                U2 = 0;
            }
            this.f4097l = U2 + (c0325d.f4043g0 != 8 ? gVar.f4118P0 : 0) + this.f4097l;
            int T2 = gVar.T(c0325d, this.f4102q);
            if (this.f4089b == null || this.f4090c < T2) {
                this.f4089b = c0325d;
                this.f4090c = T2;
                this.f4098m = T2;
            }
        } else {
            int U3 = gVar.U(c0325d, this.f4102q);
            int T3 = gVar.T(c0325d, this.f4102q);
            if (c0325d.f4057p0[1] == 3) {
                this.f4101p++;
                T3 = 0;
            }
            this.f4098m = T3 + (c0325d.f4043g0 != 8 ? gVar.f4119Q0 : 0) + this.f4098m;
            if (this.f4089b == null || this.f4090c < U3) {
                this.f4089b = c0325d;
                this.f4090c = U3;
                this.f4097l = U3;
            }
        }
        this.f4100o++;
    }

    public final void b(int i, boolean z2, boolean z3) {
        g gVar;
        int i2;
        int i3;
        int i4;
        C0325d c0325d;
        int i5;
        char c2;
        int i6;
        float f2;
        float f3;
        int i7;
        float f4;
        int i8;
        int i9 = this.f4100o;
        int i10 = 0;
        while (true) {
            gVar = this.f4103r;
            if (i10 >= i9 || (i8 = this.f4099n + i10) >= gVar.f4128b1) {
                break;
            }
            C0325d c0325d2 = gVar.f4127a1[i8];
            if (c0325d2 != null) {
                c0325d2.D();
            }
            i10++;
        }
        if (i9 == 0 || this.f4089b == null) {
            return;
        }
        boolean z4 = z3 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.f4099n + (z2 ? (i9 - 1) - i13 : i13);
            if (i14 >= gVar.f4128b1) {
                break;
            }
            C0325d c0325d3 = gVar.f4127a1[i14];
            if (c0325d3 != null && c0325d3.f4043g0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        if (this.f4088a != 0) {
            C0325d c0325d4 = this.f4089b;
            c0325d4.i0 = gVar.f4106D0;
            int i15 = this.h;
            if (i > 0) {
                i15 += gVar.f4118P0;
            }
            C0324c c0324c = c0325d4.f4012I;
            C0324c c0324c2 = c0325d4.f4014K;
            if (z2) {
                c0324c2.a(this.f4093f, i15);
                if (z3) {
                    c0324c.a(this.f4091d, this.f4095j);
                }
                if (i > 0) {
                    this.f4093f.f4001d.f4012I.a(c0324c2, 0);
                }
            } else {
                c0324c.a(this.f4091d, i15);
                if (z3) {
                    c0324c2.a(this.f4093f, this.f4095j);
                }
                if (i > 0) {
                    this.f4091d.f4001d.f4014K.a(c0324c, 0);
                }
            }
            C0325d c0325d5 = null;
            for (int i16 = 0; i16 < i9; i16++) {
                int i17 = this.f4099n + i16;
                if (i17 >= gVar.f4128b1) {
                    return;
                }
                C0325d c0325d6 = gVar.f4127a1[i17];
                if (c0325d6 != null) {
                    C0324c c0324c3 = c0325d6.f4013J;
                    if (i16 == 0) {
                        c0325d6.f(c0324c3, this.f4092e, this.i);
                        int i18 = gVar.f4107E0;
                        float f5 = gVar.f4113K0;
                        if (this.f4099n == 0) {
                            i4 = gVar.f4109G0;
                            i2 = i18;
                            i3 = -1;
                            if (i4 != -1) {
                                f5 = gVar.f4115M0;
                                c0325d6.f4046j0 = i4;
                                c0325d6.f4039e0 = f5;
                            }
                        } else {
                            i2 = i18;
                            i3 = -1;
                        }
                        if (!z3 || (i4 = gVar.f4111I0) == i3) {
                            i4 = i2;
                        } else {
                            f5 = gVar.f4117O0;
                        }
                        c0325d6.f4046j0 = i4;
                        c0325d6.f4039e0 = f5;
                    }
                    if (i16 == i9 - 1) {
                        c0325d6.f(c0325d6.f4015L, this.f4094g, this.f4096k);
                    }
                    if (c0325d5 != null) {
                        int i19 = gVar.f4119Q0;
                        C0324c c0324c4 = c0325d5.f4015L;
                        c0324c3.a(c0324c4, i19);
                        if (i16 == i11) {
                            int i20 = this.i;
                            if (c0324c3.h()) {
                                c0324c3.h = i20;
                            }
                        }
                        c0324c4.a(c0324c3, 0);
                        if (i16 == i12 + 1) {
                            int i21 = this.f4096k;
                            if (c0324c4.h()) {
                                c0324c4.h = i21;
                            }
                        }
                    }
                    if (c0325d6 != c0325d4) {
                        C0324c c0324c5 = c0325d6.f4014K;
                        C0324c c0324c6 = c0325d6.f4012I;
                        if (z2) {
                            int i22 = gVar.f4120R0;
                            if (i22 == 0) {
                                c0324c5.a(c0324c2, 0);
                            } else if (i22 == 1) {
                                c0324c6.a(c0324c, 0);
                            } else if (i22 == 2) {
                                c0324c6.a(c0324c, 0);
                                c0324c5.a(c0324c2, 0);
                            }
                        } else {
                            int i23 = gVar.f4120R0;
                            if (i23 == 0) {
                                c0324c6.a(c0324c, 0);
                            } else if (i23 == 1) {
                                c0324c5.a(c0324c2, 0);
                            } else if (i23 == 2) {
                                if (z4) {
                                    c0324c6.a(this.f4091d, this.h);
                                    c0324c5.a(this.f4093f, this.f4095j);
                                } else {
                                    c0324c6.a(c0324c, 0);
                                    c0324c5.a(c0324c2, 0);
                                }
                            }
                            c0325d5 = c0325d6;
                        }
                    }
                    c0325d5 = c0325d6;
                }
            }
            return;
        }
        C0325d c0325d7 = this.f4089b;
        c0325d7.f4046j0 = gVar.f4107E0;
        int i24 = this.i;
        if (i > 0) {
            i24 += gVar.f4119Q0;
        }
        C0324c c0324c7 = this.f4092e;
        C0324c c0324c8 = c0325d7.f4013J;
        c0324c8.a(c0324c7, i24);
        C0324c c0324c9 = c0325d7.f4015L;
        if (z3) {
            c0324c9.a(this.f4094g, this.f4096k);
        }
        if (i > 0) {
            this.f4092e.f4001d.f4015L.a(c0324c8, 0);
        }
        if (gVar.f4121S0 == 3 && !c0325d7.f4009E) {
            for (int i25 = 0; i25 < i9; i25++) {
                int i26 = this.f4099n + (z2 ? (i9 - 1) - i25 : i25);
                if (i26 >= gVar.f4128b1) {
                    break;
                }
                c0325d = gVar.f4127a1[i26];
                if (c0325d.f4009E) {
                    break;
                }
            }
        }
        c0325d = c0325d7;
        int i27 = 0;
        C0325d c0325d8 = null;
        while (i27 < i9) {
            int i28 = z2 ? (i9 - 1) - i27 : i27;
            int i29 = this.f4099n + i28;
            if (i29 >= gVar.f4128b1) {
                return;
            }
            C0325d c0325d9 = gVar.f4127a1[i29];
            if (c0325d9 == null) {
                i5 = i9;
                c2 = 3;
            } else {
                C0324c c0324c10 = c0325d9.f4012I;
                if (i27 == 0) {
                    c0325d9.f(c0324c10, this.f4091d, this.h);
                }
                if (i28 == 0) {
                    int i30 = gVar.f4106D0;
                    if (z2) {
                        i6 = i30;
                        f2 = 1.0f - gVar.f4112J0;
                    } else {
                        i6 = i30;
                        f2 = gVar.f4112J0;
                    }
                    if (this.f4099n == 0) {
                        int i31 = gVar.f4108F0;
                        f3 = f2;
                        if (i31 != -1) {
                            f4 = z2 ? 1.0f - gVar.f4114L0 : gVar.f4114L0;
                            i7 = i31;
                            c0325d9.i0 = i7;
                            c0325d9.f4037d0 = f4;
                        }
                    } else {
                        f3 = f2;
                    }
                    if (!z3 || (i7 = gVar.f4110H0) == -1) {
                        i7 = i6;
                        f4 = f3;
                    } else {
                        f4 = z2 ? 1.0f - gVar.f4116N0 : gVar.f4116N0;
                    }
                    c0325d9.i0 = i7;
                    c0325d9.f4037d0 = f4;
                }
                if (i27 == i9 - 1) {
                    i5 = i9;
                    c0325d9.f(c0325d9.f4014K, this.f4093f, this.f4095j);
                } else {
                    i5 = i9;
                }
                if (c0325d8 != null) {
                    int i32 = gVar.f4118P0;
                    C0324c c0324c11 = c0325d8.f4014K;
                    c0324c10.a(c0324c11, i32);
                    if (i27 == i11) {
                        int i33 = this.h;
                        if (c0324c10.h()) {
                            c0324c10.h = i33;
                        }
                    }
                    c0324c11.a(c0324c10, 0);
                    if (i27 == i12 + 1) {
                        int i34 = this.f4095j;
                        if (c0324c11.h()) {
                            c0324c11.h = i34;
                        }
                    }
                }
                if (c0325d9 != c0325d7) {
                    int i35 = gVar.f4121S0;
                    c2 = 3;
                    if (i35 == 3 && c0325d.f4009E && c0325d9 != c0325d && c0325d9.f4009E) {
                        c0325d9.f4016M.a(c0325d.f4016M, 0);
                    } else {
                        C0324c c0324c12 = c0325d9.f4013J;
                        if (i35 != 0) {
                            C0324c c0324c13 = c0325d9.f4015L;
                            if (i35 == 1) {
                                c0324c13.a(c0324c9, 0);
                            } else if (z4) {
                                c0324c12.a(this.f4092e, this.i);
                                c0324c13.a(this.f4094g, this.f4096k);
                            } else {
                                c0324c12.a(c0324c8, 0);
                                c0324c13.a(c0324c9, 0);
                            }
                        } else {
                            c0324c12.a(c0324c8, 0);
                        }
                    }
                } else {
                    c2 = 3;
                }
                c0325d8 = c0325d9;
            }
            i27++;
            i9 = i5;
        }
    }

    public final int c() {
        return this.f4088a == 1 ? this.f4098m - this.f4103r.f4119Q0 : this.f4098m;
    }

    public final int d() {
        return this.f4088a == 0 ? this.f4097l - this.f4103r.f4118P0 : this.f4097l;
    }

    public final void e(int i) {
        g gVar;
        int i2;
        int i3 = this.f4101p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f4100o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            gVar = this.f4103r;
            if (i6 >= i4 || (i2 = this.f4099n + i6) >= gVar.f4128b1) {
                break;
            }
            C0325d c0325d = gVar.f4127a1[i2];
            if (this.f4088a == 0) {
                if (c0325d != null) {
                    int[] iArr = c0325d.f4057p0;
                    if (iArr[0] == 3 && c0325d.f4059r == 0) {
                        gVar.V(1, i5, iArr[1], c0325d.k(), c0325d);
                    }
                }
            } else if (c0325d != null) {
                int[] iArr2 = c0325d.f4057p0;
                if (iArr2[1] == 3 && c0325d.f4060s == 0) {
                    gVar.V(iArr2[0], c0325d.q(), 1, i5, c0325d);
                }
            }
            i6++;
        }
        this.f4097l = 0;
        this.f4098m = 0;
        this.f4089b = null;
        this.f4090c = 0;
        int i7 = this.f4100o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f4099n + i8;
            if (i9 >= gVar.f4128b1) {
                return;
            }
            C0325d c0325d2 = gVar.f4127a1[i9];
            if (this.f4088a == 0) {
                int q2 = c0325d2.q();
                int i10 = gVar.f4118P0;
                if (c0325d2.f4043g0 == 8) {
                    i10 = 0;
                }
                this.f4097l = q2 + i10 + this.f4097l;
                int T2 = gVar.T(c0325d2, this.f4102q);
                if (this.f4089b == null || this.f4090c < T2) {
                    this.f4089b = c0325d2;
                    this.f4090c = T2;
                    this.f4098m = T2;
                }
            } else {
                int U2 = gVar.U(c0325d2, this.f4102q);
                int T3 = gVar.T(c0325d2, this.f4102q);
                int i11 = gVar.f4119Q0;
                if (c0325d2.f4043g0 == 8) {
                    i11 = 0;
                }
                this.f4098m = T3 + i11 + this.f4098m;
                if (this.f4089b == null || this.f4090c < U2) {
                    this.f4089b = c0325d2;
                    this.f4090c = U2;
                    this.f4097l = U2;
                }
            }
        }
    }

    public final void f(int i, C0324c c0324c, C0324c c0324c2, C0324c c0324c3, C0324c c0324c4, int i2, int i3, int i4, int i5, int i6) {
        this.f4088a = i;
        this.f4091d = c0324c;
        this.f4092e = c0324c2;
        this.f4093f = c0324c3;
        this.f4094g = c0324c4;
        this.h = i2;
        this.i = i3;
        this.f4095j = i4;
        this.f4096k = i5;
        this.f4102q = i6;
    }
}
