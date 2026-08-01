package s;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f3685a;
    public C0280c d;

    /* renamed from: e, reason: collision with root package name */
    public C0280c f3688e;

    /* renamed from: f, reason: collision with root package name */
    public C0280c f3689f;

    /* renamed from: g, reason: collision with root package name */
    public C0280c f3690g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3691j;

    /* renamed from: k, reason: collision with root package name */
    public int f3692k;

    /* renamed from: q, reason: collision with root package name */
    public int f3698q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f3699r;

    /* renamed from: b, reason: collision with root package name */
    public C0281d f3686b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f3687c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f3693l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3694m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f3695n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f3696o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f3697p = 0;

    public f(g gVar, int i, C0280c c0280c, C0280c c0280c2, C0280c c0280c3, C0280c c0280c4, int i2) {
        this.f3699r = gVar;
        this.h = 0;
        this.i = 0;
        this.f3691j = 0;
        this.f3692k = 0;
        this.f3698q = 0;
        this.f3685a = i;
        this.d = c0280c;
        this.f3688e = c0280c2;
        this.f3689f = c0280c3;
        this.f3690g = c0280c4;
        this.h = gVar.f3728w0;
        this.i = gVar.f3724s0;
        this.f3691j = gVar.f3729x0;
        this.f3692k = gVar.f3725t0;
        this.f3698q = i2;
    }

    public final void a(C0281d c0281d) {
        int i = this.f3685a;
        g gVar = this.f3699r;
        if (i == 0) {
            int U2 = gVar.U(c0281d, this.f3698q);
            if (c0281d.f3654p0[0] == 3) {
                this.f3697p++;
                U2 = 0;
            }
            this.f3693l = U2 + (c0281d.f3640g0 != 8 ? gVar.f3713P0 : 0) + this.f3693l;
            int T2 = gVar.T(c0281d, this.f3698q);
            if (this.f3686b == null || this.f3687c < T2) {
                this.f3686b = c0281d;
                this.f3687c = T2;
                this.f3694m = T2;
            }
        } else {
            int U3 = gVar.U(c0281d, this.f3698q);
            int T3 = gVar.T(c0281d, this.f3698q);
            if (c0281d.f3654p0[1] == 3) {
                this.f3697p++;
                T3 = 0;
            }
            this.f3694m = T3 + (c0281d.f3640g0 != 8 ? gVar.f3714Q0 : 0) + this.f3694m;
            if (this.f3686b == null || this.f3687c < U3) {
                this.f3686b = c0281d;
                this.f3687c = U3;
                this.f3693l = U3;
            }
        }
        this.f3696o++;
    }

    public final void b(int i, boolean z2, boolean z3) {
        g gVar;
        int i2;
        int i3;
        int i4;
        C0281d c0281d;
        int i5;
        char c2;
        int i6;
        float f2;
        float f3;
        int i7;
        float f4;
        int i8;
        int i9 = this.f3696o;
        int i10 = 0;
        while (true) {
            gVar = this.f3699r;
            if (i10 >= i9 || (i8 = this.f3695n + i10) >= gVar.f3723b1) {
                break;
            }
            C0281d c0281d2 = gVar.f3722a1[i8];
            if (c0281d2 != null) {
                c0281d2.D();
            }
            i10++;
        }
        if (i9 == 0 || this.f3686b == null) {
            return;
        }
        boolean z4 = z3 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.f3695n + (z2 ? (i9 - 1) - i13 : i13);
            if (i14 >= gVar.f3723b1) {
                break;
            }
            C0281d c0281d3 = gVar.f3722a1[i14];
            if (c0281d3 != null && c0281d3.f3640g0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        if (this.f3685a != 0) {
            C0281d c0281d4 = this.f3686b;
            c0281d4.f3642i0 = gVar.f3702D0;
            int i15 = this.h;
            if (i > 0) {
                i15 += gVar.f3713P0;
            }
            C0280c c0280c = c0281d4.f3610I;
            C0280c c0280c2 = c0281d4.f3612K;
            if (z2) {
                c0280c2.a(this.f3689f, i15);
                if (z3) {
                    c0280c.a(this.d, this.f3691j);
                }
                if (i > 0) {
                    this.f3689f.d.f3610I.a(c0280c2, 0);
                }
            } else {
                c0280c.a(this.d, i15);
                if (z3) {
                    c0280c2.a(this.f3689f, this.f3691j);
                }
                if (i > 0) {
                    this.d.d.f3612K.a(c0280c, 0);
                }
            }
            C0281d c0281d5 = null;
            for (int i16 = 0; i16 < i9; i16++) {
                int i17 = this.f3695n + i16;
                if (i17 >= gVar.f3723b1) {
                    return;
                }
                C0281d c0281d6 = gVar.f3722a1[i17];
                if (c0281d6 != null) {
                    C0280c c0280c3 = c0281d6.f3611J;
                    if (i16 == 0) {
                        c0281d6.f(c0280c3, this.f3688e, this.i);
                        int i18 = gVar.f3703E0;
                        float f5 = gVar.f3708K0;
                        if (this.f3695n == 0) {
                            i4 = gVar.f3705G0;
                            i2 = i18;
                            i3 = -1;
                            if (i4 != -1) {
                                f5 = gVar.f3710M0;
                                c0281d6.j0 = i4;
                                c0281d6.f3636e0 = f5;
                            }
                        } else {
                            i2 = i18;
                            i3 = -1;
                        }
                        if (!z3 || (i4 = gVar.f3706I0) == i3) {
                            i4 = i2;
                        } else {
                            f5 = gVar.f3712O0;
                        }
                        c0281d6.j0 = i4;
                        c0281d6.f3636e0 = f5;
                    }
                    if (i16 == i9 - 1) {
                        c0281d6.f(c0281d6.f3613L, this.f3690g, this.f3692k);
                    }
                    if (c0281d5 != null) {
                        int i19 = gVar.f3714Q0;
                        C0280c c0280c4 = c0281d5.f3613L;
                        c0280c3.a(c0280c4, i19);
                        if (i16 == i11) {
                            int i20 = this.i;
                            if (c0280c3.h()) {
                                c0280c3.h = i20;
                            }
                        }
                        c0280c4.a(c0280c3, 0);
                        if (i16 == i12 + 1) {
                            int i21 = this.f3692k;
                            if (c0280c4.h()) {
                                c0280c4.h = i21;
                            }
                        }
                    }
                    if (c0281d6 != c0281d4) {
                        C0280c c0280c5 = c0281d6.f3612K;
                        C0280c c0280c6 = c0281d6.f3610I;
                        if (z2) {
                            int i22 = gVar.f3715R0;
                            if (i22 == 0) {
                                c0280c5.a(c0280c2, 0);
                            } else if (i22 == 1) {
                                c0280c6.a(c0280c, 0);
                            } else if (i22 == 2) {
                                c0280c6.a(c0280c, 0);
                                c0280c5.a(c0280c2, 0);
                            }
                        } else {
                            int i23 = gVar.f3715R0;
                            if (i23 == 0) {
                                c0280c6.a(c0280c, 0);
                            } else if (i23 == 1) {
                                c0280c5.a(c0280c2, 0);
                            } else if (i23 == 2) {
                                if (z4) {
                                    c0280c6.a(this.d, this.h);
                                    c0280c5.a(this.f3689f, this.f3691j);
                                } else {
                                    c0280c6.a(c0280c, 0);
                                    c0280c5.a(c0280c2, 0);
                                }
                            }
                            c0281d5 = c0281d6;
                        }
                    }
                    c0281d5 = c0281d6;
                }
            }
            return;
        }
        C0281d c0281d7 = this.f3686b;
        c0281d7.j0 = gVar.f3703E0;
        int i24 = this.i;
        if (i > 0) {
            i24 += gVar.f3714Q0;
        }
        C0280c c0280c7 = this.f3688e;
        C0280c c0280c8 = c0281d7.f3611J;
        c0280c8.a(c0280c7, i24);
        C0280c c0280c9 = c0281d7.f3613L;
        if (z3) {
            c0280c9.a(this.f3690g, this.f3692k);
        }
        if (i > 0) {
            this.f3688e.d.f3613L.a(c0280c8, 0);
        }
        if (gVar.f3716S0 == 3 && !c0281d7.f3607E) {
            for (int i25 = 0; i25 < i9; i25++) {
                int i26 = this.f3695n + (z2 ? (i9 - 1) - i25 : i25);
                if (i26 >= gVar.f3723b1) {
                    break;
                }
                c0281d = gVar.f3722a1[i26];
                if (c0281d.f3607E) {
                    break;
                }
            }
        }
        c0281d = c0281d7;
        int i27 = 0;
        C0281d c0281d8 = null;
        while (i27 < i9) {
            int i28 = z2 ? (i9 - 1) - i27 : i27;
            int i29 = this.f3695n + i28;
            if (i29 >= gVar.f3723b1) {
                return;
            }
            C0281d c0281d9 = gVar.f3722a1[i29];
            if (c0281d9 == null) {
                i5 = i9;
                c2 = 3;
            } else {
                C0280c c0280c10 = c0281d9.f3610I;
                if (i27 == 0) {
                    c0281d9.f(c0280c10, this.d, this.h);
                }
                if (i28 == 0) {
                    int i30 = gVar.f3702D0;
                    if (z2) {
                        i6 = i30;
                        f2 = 1.0f - gVar.f3707J0;
                    } else {
                        i6 = i30;
                        f2 = gVar.f3707J0;
                    }
                    if (this.f3695n == 0) {
                        int i31 = gVar.f3704F0;
                        f3 = f2;
                        if (i31 != -1) {
                            f4 = z2 ? 1.0f - gVar.f3709L0 : gVar.f3709L0;
                            i7 = i31;
                            c0281d9.f3642i0 = i7;
                            c0281d9.f3634d0 = f4;
                        }
                    } else {
                        f3 = f2;
                    }
                    if (!z3 || (i7 = gVar.H0) == -1) {
                        i7 = i6;
                        f4 = f3;
                    } else {
                        f4 = z2 ? 1.0f - gVar.f3711N0 : gVar.f3711N0;
                    }
                    c0281d9.f3642i0 = i7;
                    c0281d9.f3634d0 = f4;
                }
                if (i27 == i9 - 1) {
                    i5 = i9;
                    c0281d9.f(c0281d9.f3612K, this.f3689f, this.f3691j);
                } else {
                    i5 = i9;
                }
                if (c0281d8 != null) {
                    int i32 = gVar.f3713P0;
                    C0280c c0280c11 = c0281d8.f3612K;
                    c0280c10.a(c0280c11, i32);
                    if (i27 == i11) {
                        int i33 = this.h;
                        if (c0280c10.h()) {
                            c0280c10.h = i33;
                        }
                    }
                    c0280c11.a(c0280c10, 0);
                    if (i27 == i12 + 1) {
                        int i34 = this.f3691j;
                        if (c0280c11.h()) {
                            c0280c11.h = i34;
                        }
                    }
                }
                if (c0281d9 != c0281d7) {
                    int i35 = gVar.f3716S0;
                    c2 = 3;
                    if (i35 == 3 && c0281d.f3607E && c0281d9 != c0281d && c0281d9.f3607E) {
                        c0281d9.f3614M.a(c0281d.f3614M, 0);
                    } else {
                        C0280c c0280c12 = c0281d9.f3611J;
                        if (i35 != 0) {
                            C0280c c0280c13 = c0281d9.f3613L;
                            if (i35 == 1) {
                                c0280c13.a(c0280c9, 0);
                            } else if (z4) {
                                c0280c12.a(this.f3688e, this.i);
                                c0280c13.a(this.f3690g, this.f3692k);
                            } else {
                                c0280c12.a(c0280c8, 0);
                                c0280c13.a(c0280c9, 0);
                            }
                        } else {
                            c0280c12.a(c0280c8, 0);
                        }
                    }
                } else {
                    c2 = 3;
                }
                c0281d8 = c0281d9;
            }
            i27++;
            i9 = i5;
        }
    }

    public final int c() {
        return this.f3685a == 1 ? this.f3694m - this.f3699r.f3714Q0 : this.f3694m;
    }

    public final int d() {
        return this.f3685a == 0 ? this.f3693l - this.f3699r.f3713P0 : this.f3693l;
    }

    public final void e(int i) {
        g gVar;
        int i2;
        int i3 = this.f3697p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f3696o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            gVar = this.f3699r;
            if (i6 >= i4 || (i2 = this.f3695n + i6) >= gVar.f3723b1) {
                break;
            }
            C0281d c0281d = gVar.f3722a1[i2];
            if (this.f3685a == 0) {
                if (c0281d != null) {
                    int[] iArr = c0281d.f3654p0;
                    if (iArr[0] == 3 && c0281d.f3656r == 0) {
                        gVar.V(1, i5, iArr[1], c0281d.k(), c0281d);
                    }
                }
            } else if (c0281d != null) {
                int[] iArr2 = c0281d.f3654p0;
                if (iArr2[1] == 3 && c0281d.f3657s == 0) {
                    gVar.V(iArr2[0], c0281d.q(), 1, i5, c0281d);
                }
            }
            i6++;
        }
        this.f3693l = 0;
        this.f3694m = 0;
        this.f3686b = null;
        this.f3687c = 0;
        int i7 = this.f3696o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f3695n + i8;
            if (i9 >= gVar.f3723b1) {
                return;
            }
            C0281d c0281d2 = gVar.f3722a1[i9];
            if (this.f3685a == 0) {
                int q2 = c0281d2.q();
                int i10 = gVar.f3713P0;
                if (c0281d2.f3640g0 == 8) {
                    i10 = 0;
                }
                this.f3693l = q2 + i10 + this.f3693l;
                int T2 = gVar.T(c0281d2, this.f3698q);
                if (this.f3686b == null || this.f3687c < T2) {
                    this.f3686b = c0281d2;
                    this.f3687c = T2;
                    this.f3694m = T2;
                }
            } else {
                int U2 = gVar.U(c0281d2, this.f3698q);
                int T3 = gVar.T(c0281d2, this.f3698q);
                int i11 = gVar.f3714Q0;
                if (c0281d2.f3640g0 == 8) {
                    i11 = 0;
                }
                this.f3694m = T3 + i11 + this.f3694m;
                if (this.f3686b == null || this.f3687c < U2) {
                    this.f3686b = c0281d2;
                    this.f3687c = U2;
                    this.f3693l = U2;
                }
            }
        }
    }

    public final void f(int i, C0280c c0280c, C0280c c0280c2, C0280c c0280c3, C0280c c0280c4, int i2, int i3, int i4, int i5, int i6) {
        this.f3685a = i;
        this.d = c0280c;
        this.f3688e = c0280c2;
        this.f3689f = c0280c3;
        this.f3690g = c0280c4;
        this.h = i2;
        this.i = i3;
        this.f3691j = i4;
        this.f3692k = i5;
        this.f3698q = i6;
    }
}
