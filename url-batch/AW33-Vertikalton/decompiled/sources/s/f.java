package s;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f3692a;
    public C0297c d;

    /* renamed from: e, reason: collision with root package name */
    public C0297c f3695e;

    /* renamed from: f, reason: collision with root package name */
    public C0297c f3696f;

    /* renamed from: g, reason: collision with root package name */
    public C0297c f3697g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3698j;

    /* renamed from: k, reason: collision with root package name */
    public int f3699k;

    /* renamed from: q, reason: collision with root package name */
    public int f3705q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f3706r;

    /* renamed from: b, reason: collision with root package name */
    public C0298d f3693b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f3694c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f3700l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3701m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f3702n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f3703o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f3704p = 0;

    public f(g gVar, int i, C0297c c0297c, C0297c c0297c2, C0297c c0297c3, C0297c c0297c4, int i2) {
        this.f3706r = gVar;
        this.h = 0;
        this.i = 0;
        this.f3698j = 0;
        this.f3699k = 0;
        this.f3705q = 0;
        this.f3692a = i;
        this.d = c0297c;
        this.f3695e = c0297c2;
        this.f3696f = c0297c3;
        this.f3697g = c0297c4;
        this.h = gVar.f3737w0;
        this.i = gVar.f3733s0;
        this.f3698j = gVar.x0;
        this.f3699k = gVar.f3734t0;
        this.f3705q = i2;
    }

    public final void a(C0298d c0298d) {
        int i = this.f3692a;
        g gVar = this.f3706r;
        if (i == 0) {
            int U2 = gVar.U(c0298d, this.f3705q);
            if (c0298d.f3661p0[0] == 3) {
                this.f3704p++;
                U2 = 0;
            }
            this.f3700l = U2 + (c0298d.f3646g0 != 8 ? gVar.f3721P0 : 0) + this.f3700l;
            int T2 = gVar.T(c0298d, this.f3705q);
            if (this.f3693b == null || this.f3694c < T2) {
                this.f3693b = c0298d;
                this.f3694c = T2;
                this.f3701m = T2;
            }
        } else {
            int U3 = gVar.U(c0298d, this.f3705q);
            int T3 = gVar.T(c0298d, this.f3705q);
            if (c0298d.f3661p0[1] == 3) {
                this.f3704p++;
                T3 = 0;
            }
            this.f3701m = T3 + (c0298d.f3646g0 != 8 ? gVar.f3722Q0 : 0) + this.f3701m;
            if (this.f3693b == null || this.f3694c < U3) {
                this.f3693b = c0298d;
                this.f3694c = U3;
                this.f3700l = U3;
            }
        }
        this.f3703o++;
    }

    public final void b(int i, boolean z2, boolean z3) {
        g gVar;
        int i2;
        int i3;
        int i4;
        C0298d c0298d;
        int i5;
        char c2;
        int i6;
        float f2;
        float f3;
        int i7;
        float f4;
        int i8;
        int i9 = this.f3703o;
        int i10 = 0;
        while (true) {
            gVar = this.f3706r;
            if (i10 >= i9 || (i8 = this.f3702n + i10) >= gVar.f3732b1) {
                break;
            }
            C0298d c0298d2 = gVar.f3731a1[i8];
            if (c0298d2 != null) {
                c0298d2.D();
            }
            i10++;
        }
        if (i9 == 0 || this.f3693b == null) {
            return;
        }
        boolean z4 = z3 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.f3702n + (z2 ? (i9 - 1) - i13 : i13);
            if (i14 >= gVar.f3732b1) {
                break;
            }
            C0298d c0298d3 = gVar.f3731a1[i14];
            if (c0298d3 != null && c0298d3.f3646g0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        if (this.f3692a != 0) {
            C0298d c0298d4 = this.f3693b;
            c0298d4.f3648i0 = gVar.f3709D0;
            int i15 = this.h;
            if (i > 0) {
                i15 += gVar.f3721P0;
            }
            C0297c c0297c = c0298d4.f3616I;
            C0297c c0297c2 = c0298d4.f3618K;
            if (z2) {
                c0297c2.a(this.f3696f, i15);
                if (z3) {
                    c0297c.a(this.d, this.f3698j);
                }
                if (i > 0) {
                    this.f3696f.d.f3616I.a(c0297c2, 0);
                }
            } else {
                c0297c.a(this.d, i15);
                if (z3) {
                    c0297c2.a(this.f3696f, this.f3698j);
                }
                if (i > 0) {
                    this.d.d.f3618K.a(c0297c, 0);
                }
            }
            C0298d c0298d5 = null;
            for (int i16 = 0; i16 < i9; i16++) {
                int i17 = this.f3702n + i16;
                if (i17 >= gVar.f3732b1) {
                    return;
                }
                C0298d c0298d6 = gVar.f3731a1[i17];
                if (c0298d6 != null) {
                    C0297c c0297c3 = c0298d6.f3617J;
                    if (i16 == 0) {
                        c0298d6.f(c0297c3, this.f3695e, this.i);
                        int i18 = gVar.f3710E0;
                        float f5 = gVar.f3716K0;
                        if (this.f3702n == 0) {
                            i4 = gVar.f3712G0;
                            i2 = i18;
                            i3 = -1;
                            if (i4 != -1) {
                                f5 = gVar.f3718M0;
                                c0298d6.j0 = i4;
                                c0298d6.f3642e0 = f5;
                            }
                        } else {
                            i2 = i18;
                            i3 = -1;
                        }
                        if (!z3 || (i4 = gVar.f3714I0) == i3) {
                            i4 = i2;
                        } else {
                            f5 = gVar.f3720O0;
                        }
                        c0298d6.j0 = i4;
                        c0298d6.f3642e0 = f5;
                    }
                    if (i16 == i9 - 1) {
                        c0298d6.f(c0298d6.f3619L, this.f3697g, this.f3699k);
                    }
                    if (c0298d5 != null) {
                        int i19 = gVar.f3722Q0;
                        C0297c c0297c4 = c0298d5.f3619L;
                        c0297c3.a(c0297c4, i19);
                        if (i16 == i11) {
                            int i20 = this.i;
                            if (c0297c3.h()) {
                                c0297c3.h = i20;
                            }
                        }
                        c0297c4.a(c0297c3, 0);
                        if (i16 == i12 + 1) {
                            int i21 = this.f3699k;
                            if (c0297c4.h()) {
                                c0297c4.h = i21;
                            }
                        }
                    }
                    if (c0298d6 != c0298d4) {
                        C0297c c0297c5 = c0298d6.f3618K;
                        C0297c c0297c6 = c0298d6.f3616I;
                        if (z2) {
                            int i22 = gVar.f3723R0;
                            if (i22 == 0) {
                                c0297c5.a(c0297c2, 0);
                            } else if (i22 == 1) {
                                c0297c6.a(c0297c, 0);
                            } else if (i22 == 2) {
                                c0297c6.a(c0297c, 0);
                                c0297c5.a(c0297c2, 0);
                            }
                        } else {
                            int i23 = gVar.f3723R0;
                            if (i23 == 0) {
                                c0297c6.a(c0297c, 0);
                            } else if (i23 == 1) {
                                c0297c5.a(c0297c2, 0);
                            } else if (i23 == 2) {
                                if (z4) {
                                    c0297c6.a(this.d, this.h);
                                    c0297c5.a(this.f3696f, this.f3698j);
                                } else {
                                    c0297c6.a(c0297c, 0);
                                    c0297c5.a(c0297c2, 0);
                                }
                            }
                            c0298d5 = c0298d6;
                        }
                    }
                    c0298d5 = c0298d6;
                }
            }
            return;
        }
        C0298d c0298d7 = this.f3693b;
        c0298d7.j0 = gVar.f3710E0;
        int i24 = this.i;
        if (i > 0) {
            i24 += gVar.f3722Q0;
        }
        C0297c c0297c7 = this.f3695e;
        C0297c c0297c8 = c0298d7.f3617J;
        c0297c8.a(c0297c7, i24);
        C0297c c0297c9 = c0298d7.f3619L;
        if (z3) {
            c0297c9.a(this.f3697g, this.f3699k);
        }
        if (i > 0) {
            this.f3695e.d.f3619L.a(c0297c8, 0);
        }
        if (gVar.f3724S0 == 3 && !c0298d7.f3613E) {
            for (int i25 = 0; i25 < i9; i25++) {
                int i26 = this.f3702n + (z2 ? (i9 - 1) - i25 : i25);
                if (i26 >= gVar.f3732b1) {
                    break;
                }
                c0298d = gVar.f3731a1[i26];
                if (c0298d.f3613E) {
                    break;
                }
            }
        }
        c0298d = c0298d7;
        int i27 = 0;
        C0298d c0298d8 = null;
        while (i27 < i9) {
            int i28 = z2 ? (i9 - 1) - i27 : i27;
            int i29 = this.f3702n + i28;
            if (i29 >= gVar.f3732b1) {
                return;
            }
            C0298d c0298d9 = gVar.f3731a1[i29];
            if (c0298d9 == null) {
                i5 = i9;
                c2 = 3;
            } else {
                C0297c c0297c10 = c0298d9.f3616I;
                if (i27 == 0) {
                    c0298d9.f(c0297c10, this.d, this.h);
                }
                if (i28 == 0) {
                    int i30 = gVar.f3709D0;
                    if (z2) {
                        i6 = i30;
                        f2 = 1.0f - gVar.f3715J0;
                    } else {
                        i6 = i30;
                        f2 = gVar.f3715J0;
                    }
                    if (this.f3702n == 0) {
                        int i31 = gVar.f3711F0;
                        f3 = f2;
                        if (i31 != -1) {
                            f4 = z2 ? 1.0f - gVar.f3717L0 : gVar.f3717L0;
                            i7 = i31;
                            c0298d9.f3648i0 = i7;
                            c0298d9.f3640d0 = f4;
                        }
                    } else {
                        f3 = f2;
                    }
                    if (!z3 || (i7 = gVar.f3713H0) == -1) {
                        i7 = i6;
                        f4 = f3;
                    } else {
                        f4 = z2 ? 1.0f - gVar.f3719N0 : gVar.f3719N0;
                    }
                    c0298d9.f3648i0 = i7;
                    c0298d9.f3640d0 = f4;
                }
                if (i27 == i9 - 1) {
                    i5 = i9;
                    c0298d9.f(c0298d9.f3618K, this.f3696f, this.f3698j);
                } else {
                    i5 = i9;
                }
                if (c0298d8 != null) {
                    int i32 = gVar.f3721P0;
                    C0297c c0297c11 = c0298d8.f3618K;
                    c0297c10.a(c0297c11, i32);
                    if (i27 == i11) {
                        int i33 = this.h;
                        if (c0297c10.h()) {
                            c0297c10.h = i33;
                        }
                    }
                    c0297c11.a(c0297c10, 0);
                    if (i27 == i12 + 1) {
                        int i34 = this.f3698j;
                        if (c0297c11.h()) {
                            c0297c11.h = i34;
                        }
                    }
                }
                if (c0298d9 != c0298d7) {
                    int i35 = gVar.f3724S0;
                    c2 = 3;
                    if (i35 == 3 && c0298d.f3613E && c0298d9 != c0298d && c0298d9.f3613E) {
                        c0298d9.f3620M.a(c0298d.f3620M, 0);
                    } else {
                        C0297c c0297c12 = c0298d9.f3617J;
                        if (i35 != 0) {
                            C0297c c0297c13 = c0298d9.f3619L;
                            if (i35 == 1) {
                                c0297c13.a(c0297c9, 0);
                            } else if (z4) {
                                c0297c12.a(this.f3695e, this.i);
                                c0297c13.a(this.f3697g, this.f3699k);
                            } else {
                                c0297c12.a(c0297c8, 0);
                                c0297c13.a(c0297c9, 0);
                            }
                        } else {
                            c0297c12.a(c0297c8, 0);
                        }
                    }
                } else {
                    c2 = 3;
                }
                c0298d8 = c0298d9;
            }
            i27++;
            i9 = i5;
        }
    }

    public final int c() {
        return this.f3692a == 1 ? this.f3701m - this.f3706r.f3722Q0 : this.f3701m;
    }

    public final int d() {
        return this.f3692a == 0 ? this.f3700l - this.f3706r.f3721P0 : this.f3700l;
    }

    public final void e(int i) {
        g gVar;
        int i2;
        int i3 = this.f3704p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f3703o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            gVar = this.f3706r;
            if (i6 >= i4 || (i2 = this.f3702n + i6) >= gVar.f3732b1) {
                break;
            }
            C0298d c0298d = gVar.f3731a1[i2];
            if (this.f3692a == 0) {
                if (c0298d != null) {
                    int[] iArr = c0298d.f3661p0;
                    if (iArr[0] == 3 && c0298d.f3663r == 0) {
                        gVar.V(1, i5, iArr[1], c0298d.k(), c0298d);
                    }
                }
            } else if (c0298d != null) {
                int[] iArr2 = c0298d.f3661p0;
                if (iArr2[1] == 3 && c0298d.f3664s == 0) {
                    gVar.V(iArr2[0], c0298d.q(), 1, i5, c0298d);
                }
            }
            i6++;
        }
        this.f3700l = 0;
        this.f3701m = 0;
        this.f3693b = null;
        this.f3694c = 0;
        int i7 = this.f3703o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f3702n + i8;
            if (i9 >= gVar.f3732b1) {
                return;
            }
            C0298d c0298d2 = gVar.f3731a1[i9];
            if (this.f3692a == 0) {
                int q2 = c0298d2.q();
                int i10 = gVar.f3721P0;
                if (c0298d2.f3646g0 == 8) {
                    i10 = 0;
                }
                this.f3700l = q2 + i10 + this.f3700l;
                int T2 = gVar.T(c0298d2, this.f3705q);
                if (this.f3693b == null || this.f3694c < T2) {
                    this.f3693b = c0298d2;
                    this.f3694c = T2;
                    this.f3701m = T2;
                }
            } else {
                int U2 = gVar.U(c0298d2, this.f3705q);
                int T3 = gVar.T(c0298d2, this.f3705q);
                int i11 = gVar.f3722Q0;
                if (c0298d2.f3646g0 == 8) {
                    i11 = 0;
                }
                this.f3701m = T3 + i11 + this.f3701m;
                if (this.f3693b == null || this.f3694c < U2) {
                    this.f3693b = c0298d2;
                    this.f3694c = U2;
                    this.f3700l = U2;
                }
            }
        }
    }

    public final void f(int i, C0297c c0297c, C0297c c0297c2, C0297c c0297c3, C0297c c0297c4, int i2, int i3, int i4, int i5, int i6) {
        this.f3692a = i;
        this.d = c0297c;
        this.f3695e = c0297c2;
        this.f3696f = c0297c3;
        this.f3697g = c0297c4;
        this.h = i2;
        this.i = i3;
        this.f3698j = i4;
        this.f3699k = i5;
        this.f3705q = i6;
    }
}
