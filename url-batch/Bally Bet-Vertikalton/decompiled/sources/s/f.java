package s;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f3680a;
    public C0298c d;

    /* renamed from: e, reason: collision with root package name */
    public C0298c f3683e;

    /* renamed from: f, reason: collision with root package name */
    public C0298c f3684f;

    /* renamed from: g, reason: collision with root package name */
    public C0298c f3685g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3686j;

    /* renamed from: k, reason: collision with root package name */
    public int f3687k;

    /* renamed from: q, reason: collision with root package name */
    public int f3693q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f3694r;

    /* renamed from: b, reason: collision with root package name */
    public C0299d f3681b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f3682c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f3688l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3689m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f3690n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f3691o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f3692p = 0;

    public f(g gVar, int i, C0298c c0298c, C0298c c0298c2, C0298c c0298c3, C0298c c0298c4, int i2) {
        this.f3694r = gVar;
        this.h = 0;
        this.i = 0;
        this.f3686j = 0;
        this.f3687k = 0;
        this.f3693q = 0;
        this.f3680a = i;
        this.d = c0298c;
        this.f3683e = c0298c2;
        this.f3684f = c0298c3;
        this.f3685g = c0298c4;
        this.h = gVar.f3725w0;
        this.i = gVar.f3721s0;
        this.f3686j = gVar.x0;
        this.f3687k = gVar.f3722t0;
        this.f3693q = i2;
    }

    public final void a(C0299d c0299d) {
        int i = this.f3680a;
        g gVar = this.f3694r;
        if (i == 0) {
            int U2 = gVar.U(c0299d, this.f3693q);
            if (c0299d.f3649p0[0] == 3) {
                this.f3692p++;
                U2 = 0;
            }
            this.f3688l = U2 + (c0299d.f3634g0 != 8 ? gVar.f3709P0 : 0) + this.f3688l;
            int T2 = gVar.T(c0299d, this.f3693q);
            if (this.f3681b == null || this.f3682c < T2) {
                this.f3681b = c0299d;
                this.f3682c = T2;
                this.f3689m = T2;
            }
        } else {
            int U3 = gVar.U(c0299d, this.f3693q);
            int T3 = gVar.T(c0299d, this.f3693q);
            if (c0299d.f3649p0[1] == 3) {
                this.f3692p++;
                T3 = 0;
            }
            this.f3689m = T3 + (c0299d.f3634g0 != 8 ? gVar.f3710Q0 : 0) + this.f3689m;
            if (this.f3681b == null || this.f3682c < U3) {
                this.f3681b = c0299d;
                this.f3682c = U3;
                this.f3688l = U3;
            }
        }
        this.f3691o++;
    }

    public final void b(int i, boolean z2, boolean z3) {
        g gVar;
        int i2;
        int i3;
        int i4;
        C0299d c0299d;
        int i5;
        char c2;
        int i6;
        float f2;
        float f3;
        int i7;
        float f4;
        int i8;
        int i9 = this.f3691o;
        int i10 = 0;
        while (true) {
            gVar = this.f3694r;
            if (i10 >= i9 || (i8 = this.f3690n + i10) >= gVar.f3720b1) {
                break;
            }
            C0299d c0299d2 = gVar.f3719a1[i8];
            if (c0299d2 != null) {
                c0299d2.D();
            }
            i10++;
        }
        if (i9 == 0 || this.f3681b == null) {
            return;
        }
        boolean z4 = z3 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.f3690n + (z2 ? (i9 - 1) - i13 : i13);
            if (i14 >= gVar.f3720b1) {
                break;
            }
            C0299d c0299d3 = gVar.f3719a1[i14];
            if (c0299d3 != null && c0299d3.f3634g0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        if (this.f3680a != 0) {
            C0299d c0299d4 = this.f3681b;
            c0299d4.f3636i0 = gVar.f3697D0;
            int i15 = this.h;
            if (i > 0) {
                i15 += gVar.f3709P0;
            }
            C0298c c0298c = c0299d4.f3604I;
            C0298c c0298c2 = c0299d4.f3606K;
            if (z2) {
                c0298c2.a(this.f3684f, i15);
                if (z3) {
                    c0298c.a(this.d, this.f3686j);
                }
                if (i > 0) {
                    this.f3684f.d.f3604I.a(c0298c2, 0);
                }
            } else {
                c0298c.a(this.d, i15);
                if (z3) {
                    c0298c2.a(this.f3684f, this.f3686j);
                }
                if (i > 0) {
                    this.d.d.f3606K.a(c0298c, 0);
                }
            }
            C0299d c0299d5 = null;
            for (int i16 = 0; i16 < i9; i16++) {
                int i17 = this.f3690n + i16;
                if (i17 >= gVar.f3720b1) {
                    return;
                }
                C0299d c0299d6 = gVar.f3719a1[i17];
                if (c0299d6 != null) {
                    C0298c c0298c3 = c0299d6.f3605J;
                    if (i16 == 0) {
                        c0299d6.f(c0298c3, this.f3683e, this.i);
                        int i18 = gVar.f3698E0;
                        float f5 = gVar.f3704K0;
                        if (this.f3690n == 0) {
                            i4 = gVar.f3700G0;
                            i2 = i18;
                            i3 = -1;
                            if (i4 != -1) {
                                f5 = gVar.f3706M0;
                                c0299d6.j0 = i4;
                                c0299d6.f3630e0 = f5;
                            }
                        } else {
                            i2 = i18;
                            i3 = -1;
                        }
                        if (!z3 || (i4 = gVar.f3702I0) == i3) {
                            i4 = i2;
                        } else {
                            f5 = gVar.f3708O0;
                        }
                        c0299d6.j0 = i4;
                        c0299d6.f3630e0 = f5;
                    }
                    if (i16 == i9 - 1) {
                        c0299d6.f(c0299d6.f3607L, this.f3685g, this.f3687k);
                    }
                    if (c0299d5 != null) {
                        int i19 = gVar.f3710Q0;
                        C0298c c0298c4 = c0299d5.f3607L;
                        c0298c3.a(c0298c4, i19);
                        if (i16 == i11) {
                            int i20 = this.i;
                            if (c0298c3.h()) {
                                c0298c3.h = i20;
                            }
                        }
                        c0298c4.a(c0298c3, 0);
                        if (i16 == i12 + 1) {
                            int i21 = this.f3687k;
                            if (c0298c4.h()) {
                                c0298c4.h = i21;
                            }
                        }
                    }
                    if (c0299d6 != c0299d4) {
                        C0298c c0298c5 = c0299d6.f3606K;
                        C0298c c0298c6 = c0299d6.f3604I;
                        if (z2) {
                            int i22 = gVar.f3711R0;
                            if (i22 == 0) {
                                c0298c5.a(c0298c2, 0);
                            } else if (i22 == 1) {
                                c0298c6.a(c0298c, 0);
                            } else if (i22 == 2) {
                                c0298c6.a(c0298c, 0);
                                c0298c5.a(c0298c2, 0);
                            }
                        } else {
                            int i23 = gVar.f3711R0;
                            if (i23 == 0) {
                                c0298c6.a(c0298c, 0);
                            } else if (i23 == 1) {
                                c0298c5.a(c0298c2, 0);
                            } else if (i23 == 2) {
                                if (z4) {
                                    c0298c6.a(this.d, this.h);
                                    c0298c5.a(this.f3684f, this.f3686j);
                                } else {
                                    c0298c6.a(c0298c, 0);
                                    c0298c5.a(c0298c2, 0);
                                }
                            }
                            c0299d5 = c0299d6;
                        }
                    }
                    c0299d5 = c0299d6;
                }
            }
            return;
        }
        C0299d c0299d7 = this.f3681b;
        c0299d7.j0 = gVar.f3698E0;
        int i24 = this.i;
        if (i > 0) {
            i24 += gVar.f3710Q0;
        }
        C0298c c0298c7 = this.f3683e;
        C0298c c0298c8 = c0299d7.f3605J;
        c0298c8.a(c0298c7, i24);
        C0298c c0298c9 = c0299d7.f3607L;
        if (z3) {
            c0298c9.a(this.f3685g, this.f3687k);
        }
        if (i > 0) {
            this.f3683e.d.f3607L.a(c0298c8, 0);
        }
        if (gVar.f3712S0 == 3 && !c0299d7.f3601E) {
            for (int i25 = 0; i25 < i9; i25++) {
                int i26 = this.f3690n + (z2 ? (i9 - 1) - i25 : i25);
                if (i26 >= gVar.f3720b1) {
                    break;
                }
                c0299d = gVar.f3719a1[i26];
                if (c0299d.f3601E) {
                    break;
                }
            }
        }
        c0299d = c0299d7;
        int i27 = 0;
        C0299d c0299d8 = null;
        while (i27 < i9) {
            int i28 = z2 ? (i9 - 1) - i27 : i27;
            int i29 = this.f3690n + i28;
            if (i29 >= gVar.f3720b1) {
                return;
            }
            C0299d c0299d9 = gVar.f3719a1[i29];
            if (c0299d9 == null) {
                i5 = i9;
                c2 = 3;
            } else {
                C0298c c0298c10 = c0299d9.f3604I;
                if (i27 == 0) {
                    c0299d9.f(c0298c10, this.d, this.h);
                }
                if (i28 == 0) {
                    int i30 = gVar.f3697D0;
                    if (z2) {
                        i6 = i30;
                        f2 = 1.0f - gVar.f3703J0;
                    } else {
                        i6 = i30;
                        f2 = gVar.f3703J0;
                    }
                    if (this.f3690n == 0) {
                        int i31 = gVar.f3699F0;
                        f3 = f2;
                        if (i31 != -1) {
                            f4 = z2 ? 1.0f - gVar.f3705L0 : gVar.f3705L0;
                            i7 = i31;
                            c0299d9.f3636i0 = i7;
                            c0299d9.f3628d0 = f4;
                        }
                    } else {
                        f3 = f2;
                    }
                    if (!z3 || (i7 = gVar.f3701H0) == -1) {
                        i7 = i6;
                        f4 = f3;
                    } else {
                        f4 = z2 ? 1.0f - gVar.f3707N0 : gVar.f3707N0;
                    }
                    c0299d9.f3636i0 = i7;
                    c0299d9.f3628d0 = f4;
                }
                if (i27 == i9 - 1) {
                    i5 = i9;
                    c0299d9.f(c0299d9.f3606K, this.f3684f, this.f3686j);
                } else {
                    i5 = i9;
                }
                if (c0299d8 != null) {
                    int i32 = gVar.f3709P0;
                    C0298c c0298c11 = c0299d8.f3606K;
                    c0298c10.a(c0298c11, i32);
                    if (i27 == i11) {
                        int i33 = this.h;
                        if (c0298c10.h()) {
                            c0298c10.h = i33;
                        }
                    }
                    c0298c11.a(c0298c10, 0);
                    if (i27 == i12 + 1) {
                        int i34 = this.f3686j;
                        if (c0298c11.h()) {
                            c0298c11.h = i34;
                        }
                    }
                }
                if (c0299d9 != c0299d7) {
                    int i35 = gVar.f3712S0;
                    c2 = 3;
                    if (i35 == 3 && c0299d.f3601E && c0299d9 != c0299d && c0299d9.f3601E) {
                        c0299d9.f3608M.a(c0299d.f3608M, 0);
                    } else {
                        C0298c c0298c12 = c0299d9.f3605J;
                        if (i35 != 0) {
                            C0298c c0298c13 = c0299d9.f3607L;
                            if (i35 == 1) {
                                c0298c13.a(c0298c9, 0);
                            } else if (z4) {
                                c0298c12.a(this.f3683e, this.i);
                                c0298c13.a(this.f3685g, this.f3687k);
                            } else {
                                c0298c12.a(c0298c8, 0);
                                c0298c13.a(c0298c9, 0);
                            }
                        } else {
                            c0298c12.a(c0298c8, 0);
                        }
                    }
                } else {
                    c2 = 3;
                }
                c0299d8 = c0299d9;
            }
            i27++;
            i9 = i5;
        }
    }

    public final int c() {
        return this.f3680a == 1 ? this.f3689m - this.f3694r.f3710Q0 : this.f3689m;
    }

    public final int d() {
        return this.f3680a == 0 ? this.f3688l - this.f3694r.f3709P0 : this.f3688l;
    }

    public final void e(int i) {
        g gVar;
        int i2;
        int i3 = this.f3692p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f3691o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            gVar = this.f3694r;
            if (i6 >= i4 || (i2 = this.f3690n + i6) >= gVar.f3720b1) {
                break;
            }
            C0299d c0299d = gVar.f3719a1[i2];
            if (this.f3680a == 0) {
                if (c0299d != null) {
                    int[] iArr = c0299d.f3649p0;
                    if (iArr[0] == 3 && c0299d.f3651r == 0) {
                        gVar.V(1, i5, iArr[1], c0299d.k(), c0299d);
                    }
                }
            } else if (c0299d != null) {
                int[] iArr2 = c0299d.f3649p0;
                if (iArr2[1] == 3 && c0299d.f3652s == 0) {
                    gVar.V(iArr2[0], c0299d.q(), 1, i5, c0299d);
                }
            }
            i6++;
        }
        this.f3688l = 0;
        this.f3689m = 0;
        this.f3681b = null;
        this.f3682c = 0;
        int i7 = this.f3691o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f3690n + i8;
            if (i9 >= gVar.f3720b1) {
                return;
            }
            C0299d c0299d2 = gVar.f3719a1[i9];
            if (this.f3680a == 0) {
                int q2 = c0299d2.q();
                int i10 = gVar.f3709P0;
                if (c0299d2.f3634g0 == 8) {
                    i10 = 0;
                }
                this.f3688l = q2 + i10 + this.f3688l;
                int T2 = gVar.T(c0299d2, this.f3693q);
                if (this.f3681b == null || this.f3682c < T2) {
                    this.f3681b = c0299d2;
                    this.f3682c = T2;
                    this.f3689m = T2;
                }
            } else {
                int U2 = gVar.U(c0299d2, this.f3693q);
                int T3 = gVar.T(c0299d2, this.f3693q);
                int i11 = gVar.f3710Q0;
                if (c0299d2.f3634g0 == 8) {
                    i11 = 0;
                }
                this.f3689m = T3 + i11 + this.f3689m;
                if (this.f3681b == null || this.f3682c < U2) {
                    this.f3681b = c0299d2;
                    this.f3682c = U2;
                    this.f3688l = U2;
                }
            }
        }
    }

    public final void f(int i, C0298c c0298c, C0298c c0298c2, C0298c c0298c3, C0298c c0298c4, int i2, int i3, int i4, int i5, int i6) {
        this.f3680a = i;
        this.d = c0298c;
        this.f3683e = c0298c2;
        this.f3684f = c0298c3;
        this.f3685g = c0298c4;
        this.h = i2;
        this.i = i3;
        this.f3686j = i4;
        this.f3687k = i5;
        this.f3693q = i6;
    }
}
