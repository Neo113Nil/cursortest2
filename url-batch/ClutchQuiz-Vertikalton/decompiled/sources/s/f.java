package s;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f3579a;
    public C0339c d;

    /* renamed from: e, reason: collision with root package name */
    public C0339c f3582e;

    /* renamed from: f, reason: collision with root package name */
    public C0339c f3583f;

    /* renamed from: g, reason: collision with root package name */
    public C0339c f3584g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3585j;

    /* renamed from: k, reason: collision with root package name */
    public int f3586k;

    /* renamed from: q, reason: collision with root package name */
    public int f3592q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f3593r;

    /* renamed from: b, reason: collision with root package name */
    public C0340d f3580b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f3581c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f3587l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3588m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f3589n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f3590o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f3591p = 0;

    public f(g gVar, int i, C0339c c0339c, C0339c c0339c2, C0339c c0339c3, C0339c c0339c4, int i2) {
        this.f3593r = gVar;
        this.h = 0;
        this.i = 0;
        this.f3585j = 0;
        this.f3586k = 0;
        this.f3592q = 0;
        this.f3579a = i;
        this.d = c0339c;
        this.f3582e = c0339c2;
        this.f3583f = c0339c3;
        this.f3584g = c0339c4;
        this.h = gVar.f3624w0;
        this.i = gVar.f3620s0;
        this.f3585j = gVar.f3625x0;
        this.f3586k = gVar.f3621t0;
        this.f3592q = i2;
    }

    public final void a(C0340d c0340d) {
        int i = this.f3579a;
        g gVar = this.f3593r;
        if (i == 0) {
            int U2 = gVar.U(c0340d, this.f3592q);
            if (c0340d.f3549p0[0] == 3) {
                this.f3591p++;
                U2 = 0;
            }
            this.f3587l = U2 + (c0340d.f3534g0 != 8 ? gVar.f3607P0 : 0) + this.f3587l;
            int T2 = gVar.T(c0340d, this.f3592q);
            if (this.f3580b == null || this.f3581c < T2) {
                this.f3580b = c0340d;
                this.f3581c = T2;
                this.f3588m = T2;
            }
        } else {
            int U3 = gVar.U(c0340d, this.f3592q);
            int T3 = gVar.T(c0340d, this.f3592q);
            if (c0340d.f3549p0[1] == 3) {
                this.f3591p++;
                T3 = 0;
            }
            this.f3588m = T3 + (c0340d.f3534g0 != 8 ? gVar.f3608Q0 : 0) + this.f3588m;
            if (this.f3580b == null || this.f3581c < U3) {
                this.f3580b = c0340d;
                this.f3581c = U3;
                this.f3587l = U3;
            }
        }
        this.f3590o++;
    }

    public final void b(int i, boolean z2, boolean z3) {
        g gVar;
        int i2;
        int i3;
        int i4;
        C0340d c0340d;
        int i5;
        char c2;
        int i6;
        float f2;
        float f3;
        int i7;
        float f4;
        int i8;
        int i9 = this.f3590o;
        int i10 = 0;
        while (true) {
            gVar = this.f3593r;
            if (i10 >= i9 || (i8 = this.f3589n + i10) >= gVar.f3619b1) {
                break;
            }
            C0340d c0340d2 = gVar.f3618a1[i8];
            if (c0340d2 != null) {
                c0340d2.D();
            }
            i10++;
        }
        if (i9 == 0 || this.f3580b == null) {
            return;
        }
        boolean z4 = z3 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.f3589n + (z2 ? (i9 - 1) - i13 : i13);
            if (i14 >= gVar.f3619b1) {
                break;
            }
            C0340d c0340d3 = gVar.f3618a1[i14];
            if (c0340d3 != null && c0340d3.f3534g0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        if (this.f3579a != 0) {
            C0340d c0340d4 = this.f3580b;
            c0340d4.f3536i0 = gVar.f3597D0;
            int i15 = this.h;
            if (i > 0) {
                i15 += gVar.f3607P0;
            }
            C0339c c0339c = c0340d4.f3504I;
            C0339c c0339c2 = c0340d4.f3506K;
            if (z2) {
                c0339c2.a(this.f3583f, i15);
                if (z3) {
                    c0339c.a(this.d, this.f3585j);
                }
                if (i > 0) {
                    this.f3583f.d.f3504I.a(c0339c2, 0);
                }
            } else {
                c0339c.a(this.d, i15);
                if (z3) {
                    c0339c2.a(this.f3583f, this.f3585j);
                }
                if (i > 0) {
                    this.d.d.f3506K.a(c0339c, 0);
                }
            }
            C0340d c0340d5 = null;
            for (int i16 = 0; i16 < i9; i16++) {
                int i17 = this.f3589n + i16;
                if (i17 >= gVar.f3619b1) {
                    return;
                }
                C0340d c0340d6 = gVar.f3618a1[i17];
                if (c0340d6 != null) {
                    C0339c c0339c3 = c0340d6.f3505J;
                    if (i16 == 0) {
                        c0340d6.f(c0339c3, this.f3582e, this.i);
                        int i18 = gVar.E0;
                        float f5 = gVar.f3602K0;
                        if (this.f3589n == 0) {
                            i4 = gVar.f3599G0;
                            i2 = i18;
                            i3 = -1;
                            if (i4 != -1) {
                                f5 = gVar.f3604M0;
                                c0340d6.f3538j0 = i4;
                                c0340d6.f3530e0 = f5;
                            }
                        } else {
                            i2 = i18;
                            i3 = -1;
                        }
                        if (!z3 || (i4 = gVar.f3601I0) == i3) {
                            i4 = i2;
                        } else {
                            f5 = gVar.f3606O0;
                        }
                        c0340d6.f3538j0 = i4;
                        c0340d6.f3530e0 = f5;
                    }
                    if (i16 == i9 - 1) {
                        c0340d6.f(c0340d6.f3507L, this.f3584g, this.f3586k);
                    }
                    if (c0340d5 != null) {
                        int i19 = gVar.f3608Q0;
                        C0339c c0339c4 = c0340d5.f3507L;
                        c0339c3.a(c0339c4, i19);
                        if (i16 == i11) {
                            int i20 = this.i;
                            if (c0339c3.h()) {
                                c0339c3.h = i20;
                            }
                        }
                        c0339c4.a(c0339c3, 0);
                        if (i16 == i12 + 1) {
                            int i21 = this.f3586k;
                            if (c0339c4.h()) {
                                c0339c4.h = i21;
                            }
                        }
                    }
                    if (c0340d6 != c0340d4) {
                        C0339c c0339c5 = c0340d6.f3506K;
                        C0339c c0339c6 = c0340d6.f3504I;
                        if (z2) {
                            int i22 = gVar.f3609R0;
                            if (i22 == 0) {
                                c0339c5.a(c0339c2, 0);
                            } else if (i22 == 1) {
                                c0339c6.a(c0339c, 0);
                            } else if (i22 == 2) {
                                c0339c6.a(c0339c, 0);
                                c0339c5.a(c0339c2, 0);
                            }
                        } else {
                            int i23 = gVar.f3609R0;
                            if (i23 == 0) {
                                c0339c6.a(c0339c, 0);
                            } else if (i23 == 1) {
                                c0339c5.a(c0339c2, 0);
                            } else if (i23 == 2) {
                                if (z4) {
                                    c0339c6.a(this.d, this.h);
                                    c0339c5.a(this.f3583f, this.f3585j);
                                } else {
                                    c0339c6.a(c0339c, 0);
                                    c0339c5.a(c0339c2, 0);
                                }
                            }
                            c0340d5 = c0340d6;
                        }
                    }
                    c0340d5 = c0340d6;
                }
            }
            return;
        }
        C0340d c0340d7 = this.f3580b;
        c0340d7.f3538j0 = gVar.E0;
        int i24 = this.i;
        if (i > 0) {
            i24 += gVar.f3608Q0;
        }
        C0339c c0339c7 = this.f3582e;
        C0339c c0339c8 = c0340d7.f3505J;
        c0339c8.a(c0339c7, i24);
        C0339c c0339c9 = c0340d7.f3507L;
        if (z3) {
            c0339c9.a(this.f3584g, this.f3586k);
        }
        if (i > 0) {
            this.f3582e.d.f3507L.a(c0339c8, 0);
        }
        if (gVar.f3610S0 == 3 && !c0340d7.f3501E) {
            for (int i25 = 0; i25 < i9; i25++) {
                int i26 = this.f3589n + (z2 ? (i9 - 1) - i25 : i25);
                if (i26 >= gVar.f3619b1) {
                    break;
                }
                c0340d = gVar.f3618a1[i26];
                if (c0340d.f3501E) {
                    break;
                }
            }
        }
        c0340d = c0340d7;
        int i27 = 0;
        C0340d c0340d8 = null;
        while (i27 < i9) {
            int i28 = z2 ? (i9 - 1) - i27 : i27;
            int i29 = this.f3589n + i28;
            if (i29 >= gVar.f3619b1) {
                return;
            }
            C0340d c0340d9 = gVar.f3618a1[i29];
            if (c0340d9 == null) {
                i5 = i9;
                c2 = 3;
            } else {
                C0339c c0339c10 = c0340d9.f3504I;
                if (i27 == 0) {
                    c0340d9.f(c0339c10, this.d, this.h);
                }
                if (i28 == 0) {
                    int i30 = gVar.f3597D0;
                    if (z2) {
                        i6 = i30;
                        f2 = 1.0f - gVar.J0;
                    } else {
                        i6 = i30;
                        f2 = gVar.J0;
                    }
                    if (this.f3589n == 0) {
                        int i31 = gVar.f3598F0;
                        f3 = f2;
                        if (i31 != -1) {
                            f4 = z2 ? 1.0f - gVar.f3603L0 : gVar.f3603L0;
                            i7 = i31;
                            c0340d9.f3536i0 = i7;
                            c0340d9.f3528d0 = f4;
                        }
                    } else {
                        f3 = f2;
                    }
                    if (!z3 || (i7 = gVar.f3600H0) == -1) {
                        i7 = i6;
                        f4 = f3;
                    } else {
                        f4 = z2 ? 1.0f - gVar.f3605N0 : gVar.f3605N0;
                    }
                    c0340d9.f3536i0 = i7;
                    c0340d9.f3528d0 = f4;
                }
                if (i27 == i9 - 1) {
                    i5 = i9;
                    c0340d9.f(c0340d9.f3506K, this.f3583f, this.f3585j);
                } else {
                    i5 = i9;
                }
                if (c0340d8 != null) {
                    int i32 = gVar.f3607P0;
                    C0339c c0339c11 = c0340d8.f3506K;
                    c0339c10.a(c0339c11, i32);
                    if (i27 == i11) {
                        int i33 = this.h;
                        if (c0339c10.h()) {
                            c0339c10.h = i33;
                        }
                    }
                    c0339c11.a(c0339c10, 0);
                    if (i27 == i12 + 1) {
                        int i34 = this.f3585j;
                        if (c0339c11.h()) {
                            c0339c11.h = i34;
                        }
                    }
                }
                if (c0340d9 != c0340d7) {
                    int i35 = gVar.f3610S0;
                    c2 = 3;
                    if (i35 == 3 && c0340d.f3501E && c0340d9 != c0340d && c0340d9.f3501E) {
                        c0340d9.f3508M.a(c0340d.f3508M, 0);
                    } else {
                        C0339c c0339c12 = c0340d9.f3505J;
                        if (i35 != 0) {
                            C0339c c0339c13 = c0340d9.f3507L;
                            if (i35 == 1) {
                                c0339c13.a(c0339c9, 0);
                            } else if (z4) {
                                c0339c12.a(this.f3582e, this.i);
                                c0339c13.a(this.f3584g, this.f3586k);
                            } else {
                                c0339c12.a(c0339c8, 0);
                                c0339c13.a(c0339c9, 0);
                            }
                        } else {
                            c0339c12.a(c0339c8, 0);
                        }
                    }
                } else {
                    c2 = 3;
                }
                c0340d8 = c0340d9;
            }
            i27++;
            i9 = i5;
        }
    }

    public final int c() {
        return this.f3579a == 1 ? this.f3588m - this.f3593r.f3608Q0 : this.f3588m;
    }

    public final int d() {
        return this.f3579a == 0 ? this.f3587l - this.f3593r.f3607P0 : this.f3587l;
    }

    public final void e(int i) {
        g gVar;
        int i2;
        int i3 = this.f3591p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f3590o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            gVar = this.f3593r;
            if (i6 >= i4 || (i2 = this.f3589n + i6) >= gVar.f3619b1) {
                break;
            }
            C0340d c0340d = gVar.f3618a1[i2];
            if (this.f3579a == 0) {
                if (c0340d != null) {
                    int[] iArr = c0340d.f3549p0;
                    if (iArr[0] == 3 && c0340d.f3551r == 0) {
                        gVar.V(1, i5, iArr[1], c0340d.k(), c0340d);
                    }
                }
            } else if (c0340d != null) {
                int[] iArr2 = c0340d.f3549p0;
                if (iArr2[1] == 3 && c0340d.f3552s == 0) {
                    gVar.V(iArr2[0], c0340d.q(), 1, i5, c0340d);
                }
            }
            i6++;
        }
        this.f3587l = 0;
        this.f3588m = 0;
        this.f3580b = null;
        this.f3581c = 0;
        int i7 = this.f3590o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f3589n + i8;
            if (i9 >= gVar.f3619b1) {
                return;
            }
            C0340d c0340d2 = gVar.f3618a1[i9];
            if (this.f3579a == 0) {
                int q2 = c0340d2.q();
                int i10 = gVar.f3607P0;
                if (c0340d2.f3534g0 == 8) {
                    i10 = 0;
                }
                this.f3587l = q2 + i10 + this.f3587l;
                int T2 = gVar.T(c0340d2, this.f3592q);
                if (this.f3580b == null || this.f3581c < T2) {
                    this.f3580b = c0340d2;
                    this.f3581c = T2;
                    this.f3588m = T2;
                }
            } else {
                int U2 = gVar.U(c0340d2, this.f3592q);
                int T3 = gVar.T(c0340d2, this.f3592q);
                int i11 = gVar.f3608Q0;
                if (c0340d2.f3534g0 == 8) {
                    i11 = 0;
                }
                this.f3588m = T3 + i11 + this.f3588m;
                if (this.f3580b == null || this.f3581c < U2) {
                    this.f3580b = c0340d2;
                    this.f3581c = U2;
                    this.f3587l = U2;
                }
            }
        }
    }

    public final void f(int i, C0339c c0339c, C0339c c0339c2, C0339c c0339c3, C0339c c0339c4, int i2, int i3, int i4, int i5, int i6) {
        this.f3579a = i;
        this.d = c0339c;
        this.f3582e = c0339c2;
        this.f3583f = c0339c3;
        this.f3584g = c0339c4;
        this.h = i2;
        this.i = i3;
        this.f3585j = i4;
        this.f3586k = i5;
        this.f3592q = i6;
    }
}
