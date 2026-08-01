package s;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f3608a;
    public C0292c d;

    /* renamed from: e, reason: collision with root package name */
    public C0292c f3611e;

    /* renamed from: f, reason: collision with root package name */
    public C0292c f3612f;

    /* renamed from: g, reason: collision with root package name */
    public C0292c f3613g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3614j;

    /* renamed from: k, reason: collision with root package name */
    public int f3615k;

    /* renamed from: q, reason: collision with root package name */
    public int f3621q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f3622r;

    /* renamed from: b, reason: collision with root package name */
    public C0293d f3609b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f3610c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f3616l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3617m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f3618n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f3619o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f3620p = 0;

    public f(g gVar, int i, C0292c c0292c, C0292c c0292c2, C0292c c0292c3, C0292c c0292c4, int i2) {
        this.f3622r = gVar;
        this.h = 0;
        this.i = 0;
        this.f3614j = 0;
        this.f3615k = 0;
        this.f3621q = 0;
        this.f3608a = i;
        this.d = c0292c;
        this.f3611e = c0292c2;
        this.f3612f = c0292c3;
        this.f3613g = c0292c4;
        this.h = gVar.f3653w0;
        this.i = gVar.f3649s0;
        this.f3614j = gVar.f3654x0;
        this.f3615k = gVar.f3650t0;
        this.f3621q = i2;
    }

    public final void a(C0293d c0293d) {
        int i = this.f3608a;
        g gVar = this.f3622r;
        if (i == 0) {
            int U2 = gVar.U(c0293d, this.f3621q);
            if (c0293d.f3577p0[0] == 3) {
                this.f3620p++;
                U2 = 0;
            }
            this.f3616l = U2 + (c0293d.f3562g0 != 8 ? gVar.f3637P0 : 0) + this.f3616l;
            int T2 = gVar.T(c0293d, this.f3621q);
            if (this.f3609b == null || this.f3610c < T2) {
                this.f3609b = c0293d;
                this.f3610c = T2;
                this.f3617m = T2;
            }
        } else {
            int U3 = gVar.U(c0293d, this.f3621q);
            int T3 = gVar.T(c0293d, this.f3621q);
            if (c0293d.f3577p0[1] == 3) {
                this.f3620p++;
                T3 = 0;
            }
            this.f3617m = T3 + (c0293d.f3562g0 != 8 ? gVar.f3638Q0 : 0) + this.f3617m;
            if (this.f3609b == null || this.f3610c < U3) {
                this.f3609b = c0293d;
                this.f3610c = U3;
                this.f3616l = U3;
            }
        }
        this.f3619o++;
    }

    public final void b(int i, boolean z2, boolean z3) {
        g gVar;
        int i2;
        int i3;
        int i4;
        C0293d c0293d;
        int i5;
        char c2;
        int i6;
        float f2;
        float f3;
        int i7;
        float f4;
        int i8;
        int i9 = this.f3619o;
        int i10 = 0;
        while (true) {
            gVar = this.f3622r;
            if (i10 >= i9 || (i8 = this.f3618n + i10) >= gVar.b1) {
                break;
            }
            C0293d c0293d2 = gVar.f3648a1[i8];
            if (c0293d2 != null) {
                c0293d2.D();
            }
            i10++;
        }
        if (i9 == 0 || this.f3609b == null) {
            return;
        }
        boolean z4 = z3 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.f3618n + (z2 ? (i9 - 1) - i13 : i13);
            if (i14 >= gVar.b1) {
                break;
            }
            C0293d c0293d3 = gVar.f3648a1[i14];
            if (c0293d3 != null && c0293d3.f3562g0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        if (this.f3608a != 0) {
            C0293d c0293d4 = this.f3609b;
            c0293d4.f3564i0 = gVar.D0;
            int i15 = this.h;
            if (i > 0) {
                i15 += gVar.f3637P0;
            }
            C0292c c0292c = c0293d4.f3532I;
            C0292c c0292c2 = c0293d4.f3534K;
            if (z2) {
                c0292c2.a(this.f3612f, i15);
                if (z3) {
                    c0292c.a(this.d, this.f3614j);
                }
                if (i > 0) {
                    this.f3612f.d.f3532I.a(c0292c2, 0);
                }
            } else {
                c0292c.a(this.d, i15);
                if (z3) {
                    c0292c2.a(this.f3612f, this.f3614j);
                }
                if (i > 0) {
                    this.d.d.f3534K.a(c0292c, 0);
                }
            }
            C0293d c0293d5 = null;
            for (int i16 = 0; i16 < i9; i16++) {
                int i17 = this.f3618n + i16;
                if (i17 >= gVar.b1) {
                    return;
                }
                C0293d c0293d6 = gVar.f3648a1[i17];
                if (c0293d6 != null) {
                    C0292c c0292c3 = c0293d6.f3533J;
                    if (i16 == 0) {
                        c0293d6.f(c0292c3, this.f3611e, this.i);
                        int i18 = gVar.f3626E0;
                        float f5 = gVar.f3632K0;
                        if (this.f3618n == 0) {
                            i4 = gVar.f3628G0;
                            i2 = i18;
                            i3 = -1;
                            if (i4 != -1) {
                                f5 = gVar.f3634M0;
                                c0293d6.f3566j0 = i4;
                                c0293d6.f3558e0 = f5;
                            }
                        } else {
                            i2 = i18;
                            i3 = -1;
                        }
                        if (!z3 || (i4 = gVar.f3630I0) == i3) {
                            i4 = i2;
                        } else {
                            f5 = gVar.f3636O0;
                        }
                        c0293d6.f3566j0 = i4;
                        c0293d6.f3558e0 = f5;
                    }
                    if (i16 == i9 - 1) {
                        c0293d6.f(c0293d6.f3535L, this.f3613g, this.f3615k);
                    }
                    if (c0293d5 != null) {
                        int i19 = gVar.f3638Q0;
                        C0292c c0292c4 = c0293d5.f3535L;
                        c0292c3.a(c0292c4, i19);
                        if (i16 == i11) {
                            int i20 = this.i;
                            if (c0292c3.h()) {
                                c0292c3.h = i20;
                            }
                        }
                        c0292c4.a(c0292c3, 0);
                        if (i16 == i12 + 1) {
                            int i21 = this.f3615k;
                            if (c0292c4.h()) {
                                c0292c4.h = i21;
                            }
                        }
                    }
                    if (c0293d6 != c0293d4) {
                        C0292c c0292c5 = c0293d6.f3534K;
                        C0292c c0292c6 = c0293d6.f3532I;
                        if (z2) {
                            int i22 = gVar.f3639R0;
                            if (i22 == 0) {
                                c0292c5.a(c0292c2, 0);
                            } else if (i22 == 1) {
                                c0292c6.a(c0292c, 0);
                            } else if (i22 == 2) {
                                c0292c6.a(c0292c, 0);
                                c0292c5.a(c0292c2, 0);
                            }
                        } else {
                            int i23 = gVar.f3639R0;
                            if (i23 == 0) {
                                c0292c6.a(c0292c, 0);
                            } else if (i23 == 1) {
                                c0292c5.a(c0292c2, 0);
                            } else if (i23 == 2) {
                                if (z4) {
                                    c0292c6.a(this.d, this.h);
                                    c0292c5.a(this.f3612f, this.f3614j);
                                } else {
                                    c0292c6.a(c0292c, 0);
                                    c0292c5.a(c0292c2, 0);
                                }
                            }
                            c0293d5 = c0293d6;
                        }
                    }
                    c0293d5 = c0293d6;
                }
            }
            return;
        }
        C0293d c0293d7 = this.f3609b;
        c0293d7.f3566j0 = gVar.f3626E0;
        int i24 = this.i;
        if (i > 0) {
            i24 += gVar.f3638Q0;
        }
        C0292c c0292c7 = this.f3611e;
        C0292c c0292c8 = c0293d7.f3533J;
        c0292c8.a(c0292c7, i24);
        C0292c c0292c9 = c0293d7.f3535L;
        if (z3) {
            c0292c9.a(this.f3613g, this.f3615k);
        }
        if (i > 0) {
            this.f3611e.d.f3535L.a(c0292c8, 0);
        }
        if (gVar.f3640S0 == 3 && !c0293d7.f3529E) {
            for (int i25 = 0; i25 < i9; i25++) {
                int i26 = this.f3618n + (z2 ? (i9 - 1) - i25 : i25);
                if (i26 >= gVar.b1) {
                    break;
                }
                c0293d = gVar.f3648a1[i26];
                if (c0293d.f3529E) {
                    break;
                }
            }
        }
        c0293d = c0293d7;
        int i27 = 0;
        C0293d c0293d8 = null;
        while (i27 < i9) {
            int i28 = z2 ? (i9 - 1) - i27 : i27;
            int i29 = this.f3618n + i28;
            if (i29 >= gVar.b1) {
                return;
            }
            C0293d c0293d9 = gVar.f3648a1[i29];
            if (c0293d9 == null) {
                i5 = i9;
                c2 = 3;
            } else {
                C0292c c0292c10 = c0293d9.f3532I;
                if (i27 == 0) {
                    c0293d9.f(c0292c10, this.d, this.h);
                }
                if (i28 == 0) {
                    int i30 = gVar.D0;
                    if (z2) {
                        i6 = i30;
                        f2 = 1.0f - gVar.f3631J0;
                    } else {
                        i6 = i30;
                        f2 = gVar.f3631J0;
                    }
                    if (this.f3618n == 0) {
                        int i31 = gVar.f3627F0;
                        f3 = f2;
                        if (i31 != -1) {
                            f4 = z2 ? 1.0f - gVar.f3633L0 : gVar.f3633L0;
                            i7 = i31;
                            c0293d9.f3564i0 = i7;
                            c0293d9.f3556d0 = f4;
                        }
                    } else {
                        f3 = f2;
                    }
                    if (!z3 || (i7 = gVar.f3629H0) == -1) {
                        i7 = i6;
                        f4 = f3;
                    } else {
                        f4 = z2 ? 1.0f - gVar.f3635N0 : gVar.f3635N0;
                    }
                    c0293d9.f3564i0 = i7;
                    c0293d9.f3556d0 = f4;
                }
                if (i27 == i9 - 1) {
                    i5 = i9;
                    c0293d9.f(c0293d9.f3534K, this.f3612f, this.f3614j);
                } else {
                    i5 = i9;
                }
                if (c0293d8 != null) {
                    int i32 = gVar.f3637P0;
                    C0292c c0292c11 = c0293d8.f3534K;
                    c0292c10.a(c0292c11, i32);
                    if (i27 == i11) {
                        int i33 = this.h;
                        if (c0292c10.h()) {
                            c0292c10.h = i33;
                        }
                    }
                    c0292c11.a(c0292c10, 0);
                    if (i27 == i12 + 1) {
                        int i34 = this.f3614j;
                        if (c0292c11.h()) {
                            c0292c11.h = i34;
                        }
                    }
                }
                if (c0293d9 != c0293d7) {
                    int i35 = gVar.f3640S0;
                    c2 = 3;
                    if (i35 == 3 && c0293d.f3529E && c0293d9 != c0293d && c0293d9.f3529E) {
                        c0293d9.f3536M.a(c0293d.f3536M, 0);
                    } else {
                        C0292c c0292c12 = c0293d9.f3533J;
                        if (i35 != 0) {
                            C0292c c0292c13 = c0293d9.f3535L;
                            if (i35 == 1) {
                                c0292c13.a(c0292c9, 0);
                            } else if (z4) {
                                c0292c12.a(this.f3611e, this.i);
                                c0292c13.a(this.f3613g, this.f3615k);
                            } else {
                                c0292c12.a(c0292c8, 0);
                                c0292c13.a(c0292c9, 0);
                            }
                        } else {
                            c0292c12.a(c0292c8, 0);
                        }
                    }
                } else {
                    c2 = 3;
                }
                c0293d8 = c0293d9;
            }
            i27++;
            i9 = i5;
        }
    }

    public final int c() {
        return this.f3608a == 1 ? this.f3617m - this.f3622r.f3638Q0 : this.f3617m;
    }

    public final int d() {
        return this.f3608a == 0 ? this.f3616l - this.f3622r.f3637P0 : this.f3616l;
    }

    public final void e(int i) {
        g gVar;
        int i2;
        int i3 = this.f3620p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f3619o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            gVar = this.f3622r;
            if (i6 >= i4 || (i2 = this.f3618n + i6) >= gVar.b1) {
                break;
            }
            C0293d c0293d = gVar.f3648a1[i2];
            if (this.f3608a == 0) {
                if (c0293d != null) {
                    int[] iArr = c0293d.f3577p0;
                    if (iArr[0] == 3 && c0293d.f3579r == 0) {
                        gVar.V(1, i5, iArr[1], c0293d.k(), c0293d);
                    }
                }
            } else if (c0293d != null) {
                int[] iArr2 = c0293d.f3577p0;
                if (iArr2[1] == 3 && c0293d.f3580s == 0) {
                    gVar.V(iArr2[0], c0293d.q(), 1, i5, c0293d);
                }
            }
            i6++;
        }
        this.f3616l = 0;
        this.f3617m = 0;
        this.f3609b = null;
        this.f3610c = 0;
        int i7 = this.f3619o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f3618n + i8;
            if (i9 >= gVar.b1) {
                return;
            }
            C0293d c0293d2 = gVar.f3648a1[i9];
            if (this.f3608a == 0) {
                int q2 = c0293d2.q();
                int i10 = gVar.f3637P0;
                if (c0293d2.f3562g0 == 8) {
                    i10 = 0;
                }
                this.f3616l = q2 + i10 + this.f3616l;
                int T2 = gVar.T(c0293d2, this.f3621q);
                if (this.f3609b == null || this.f3610c < T2) {
                    this.f3609b = c0293d2;
                    this.f3610c = T2;
                    this.f3617m = T2;
                }
            } else {
                int U2 = gVar.U(c0293d2, this.f3621q);
                int T3 = gVar.T(c0293d2, this.f3621q);
                int i11 = gVar.f3638Q0;
                if (c0293d2.f3562g0 == 8) {
                    i11 = 0;
                }
                this.f3617m = T3 + i11 + this.f3617m;
                if (this.f3609b == null || this.f3610c < U2) {
                    this.f3609b = c0293d2;
                    this.f3610c = U2;
                    this.f3616l = U2;
                }
            }
        }
    }

    public final void f(int i, C0292c c0292c, C0292c c0292c2, C0292c c0292c3, C0292c c0292c4, int i2, int i3, int i4, int i5, int i6) {
        this.f3608a = i;
        this.d = c0292c;
        this.f3611e = c0292c2;
        this.f3612f = c0292c3;
        this.f3613g = c0292c4;
        this.h = i2;
        this.i = i3;
        this.f3614j = i4;
        this.f3615k = i5;
        this.f3621q = i6;
    }
}
