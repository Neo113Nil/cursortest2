package s;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f4092a;

    /* renamed from: d, reason: collision with root package name */
    public C0326c f4095d;

    /* renamed from: e, reason: collision with root package name */
    public C0326c f4096e;

    /* renamed from: f, reason: collision with root package name */
    public C0326c f4097f;

    /* renamed from: g, reason: collision with root package name */
    public C0326c f4098g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4099j;

    /* renamed from: k, reason: collision with root package name */
    public int f4100k;

    /* renamed from: q, reason: collision with root package name */
    public int f4106q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f4107r;

    /* renamed from: b, reason: collision with root package name */
    public C0327d f4093b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f4094c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f4101l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f4102m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f4103n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f4104o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f4105p = 0;

    public f(g gVar, int i, C0326c c0326c, C0326c c0326c2, C0326c c0326c3, C0326c c0326c4, int i2) {
        this.f4107r = gVar;
        this.h = 0;
        this.i = 0;
        this.f4099j = 0;
        this.f4100k = 0;
        this.f4106q = 0;
        this.f4092a = i;
        this.f4095d = c0326c;
        this.f4096e = c0326c2;
        this.f4097f = c0326c3;
        this.f4098g = c0326c4;
        this.h = gVar.f4137w0;
        this.i = gVar.f4133s0;
        this.f4099j = gVar.x0;
        this.f4100k = gVar.f4134t0;
        this.f4106q = i2;
    }

    public final void a(C0327d c0327d) {
        int i = this.f4092a;
        g gVar = this.f4107r;
        if (i == 0) {
            int U2 = gVar.U(c0327d, this.f4106q);
            if (c0327d.f4061p0[0] == 3) {
                this.f4105p++;
                U2 = 0;
            }
            this.f4101l = U2 + (c0327d.f4047g0 != 8 ? gVar.f4122P0 : 0) + this.f4101l;
            int T2 = gVar.T(c0327d, this.f4106q);
            if (this.f4093b == null || this.f4094c < T2) {
                this.f4093b = c0327d;
                this.f4094c = T2;
                this.f4102m = T2;
            }
        } else {
            int U3 = gVar.U(c0327d, this.f4106q);
            int T3 = gVar.T(c0327d, this.f4106q);
            if (c0327d.f4061p0[1] == 3) {
                this.f4105p++;
                T3 = 0;
            }
            this.f4102m = T3 + (c0327d.f4047g0 != 8 ? gVar.f4123Q0 : 0) + this.f4102m;
            if (this.f4093b == null || this.f4094c < U3) {
                this.f4093b = c0327d;
                this.f4094c = U3;
                this.f4101l = U3;
            }
        }
        this.f4104o++;
    }

    public final void b(int i, boolean z2, boolean z3) {
        g gVar;
        int i2;
        int i3;
        int i4;
        C0327d c0327d;
        int i5;
        char c2;
        int i6;
        float f2;
        float f3;
        int i7;
        float f4;
        int i8;
        int i9 = this.f4104o;
        int i10 = 0;
        while (true) {
            gVar = this.f4107r;
            if (i10 >= i9 || (i8 = this.f4103n + i10) >= gVar.f4132b1) {
                break;
            }
            C0327d c0327d2 = gVar.f4131a1[i8];
            if (c0327d2 != null) {
                c0327d2.D();
            }
            i10++;
        }
        if (i9 == 0 || this.f4093b == null) {
            return;
        }
        boolean z4 = z3 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.f4103n + (z2 ? (i9 - 1) - i13 : i13);
            if (i14 >= gVar.f4132b1) {
                break;
            }
            C0327d c0327d3 = gVar.f4131a1[i14];
            if (c0327d3 != null && c0327d3.f4047g0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        if (this.f4092a != 0) {
            C0327d c0327d4 = this.f4093b;
            c0327d4.i0 = gVar.f4110D0;
            int i15 = this.h;
            if (i > 0) {
                i15 += gVar.f4122P0;
            }
            C0326c c0326c = c0327d4.f4016I;
            C0326c c0326c2 = c0327d4.f4018K;
            if (z2) {
                c0326c2.a(this.f4097f, i15);
                if (z3) {
                    c0326c.a(this.f4095d, this.f4099j);
                }
                if (i > 0) {
                    this.f4097f.f4005d.f4016I.a(c0326c2, 0);
                }
            } else {
                c0326c.a(this.f4095d, i15);
                if (z3) {
                    c0326c2.a(this.f4097f, this.f4099j);
                }
                if (i > 0) {
                    this.f4095d.f4005d.f4018K.a(c0326c, 0);
                }
            }
            C0327d c0327d5 = null;
            for (int i16 = 0; i16 < i9; i16++) {
                int i17 = this.f4103n + i16;
                if (i17 >= gVar.f4132b1) {
                    return;
                }
                C0327d c0327d6 = gVar.f4131a1[i17];
                if (c0327d6 != null) {
                    C0326c c0326c3 = c0327d6.f4017J;
                    if (i16 == 0) {
                        c0327d6.f(c0326c3, this.f4096e, this.i);
                        int i18 = gVar.f4111E0;
                        float f5 = gVar.f4117K0;
                        if (this.f4103n == 0) {
                            i4 = gVar.f4113G0;
                            i2 = i18;
                            i3 = -1;
                            if (i4 != -1) {
                                f5 = gVar.f4119M0;
                                c0327d6.f4050j0 = i4;
                                c0327d6.f4043e0 = f5;
                            }
                        } else {
                            i2 = i18;
                            i3 = -1;
                        }
                        if (!z3 || (i4 = gVar.f4115I0) == i3) {
                            i4 = i2;
                        } else {
                            f5 = gVar.f4121O0;
                        }
                        c0327d6.f4050j0 = i4;
                        c0327d6.f4043e0 = f5;
                    }
                    if (i16 == i9 - 1) {
                        c0327d6.f(c0327d6.f4019L, this.f4098g, this.f4100k);
                    }
                    if (c0327d5 != null) {
                        int i19 = gVar.f4123Q0;
                        C0326c c0326c4 = c0327d5.f4019L;
                        c0326c3.a(c0326c4, i19);
                        if (i16 == i11) {
                            int i20 = this.i;
                            if (c0326c3.h()) {
                                c0326c3.h = i20;
                            }
                        }
                        c0326c4.a(c0326c3, 0);
                        if (i16 == i12 + 1) {
                            int i21 = this.f4100k;
                            if (c0326c4.h()) {
                                c0326c4.h = i21;
                            }
                        }
                    }
                    if (c0327d6 != c0327d4) {
                        C0326c c0326c5 = c0327d6.f4018K;
                        C0326c c0326c6 = c0327d6.f4016I;
                        if (z2) {
                            int i22 = gVar.f4124R0;
                            if (i22 == 0) {
                                c0326c5.a(c0326c2, 0);
                            } else if (i22 == 1) {
                                c0326c6.a(c0326c, 0);
                            } else if (i22 == 2) {
                                c0326c6.a(c0326c, 0);
                                c0326c5.a(c0326c2, 0);
                            }
                        } else {
                            int i23 = gVar.f4124R0;
                            if (i23 == 0) {
                                c0326c6.a(c0326c, 0);
                            } else if (i23 == 1) {
                                c0326c5.a(c0326c2, 0);
                            } else if (i23 == 2) {
                                if (z4) {
                                    c0326c6.a(this.f4095d, this.h);
                                    c0326c5.a(this.f4097f, this.f4099j);
                                } else {
                                    c0326c6.a(c0326c, 0);
                                    c0326c5.a(c0326c2, 0);
                                }
                            }
                            c0327d5 = c0327d6;
                        }
                    }
                    c0327d5 = c0327d6;
                }
            }
            return;
        }
        C0327d c0327d7 = this.f4093b;
        c0327d7.f4050j0 = gVar.f4111E0;
        int i24 = this.i;
        if (i > 0) {
            i24 += gVar.f4123Q0;
        }
        C0326c c0326c7 = this.f4096e;
        C0326c c0326c8 = c0327d7.f4017J;
        c0326c8.a(c0326c7, i24);
        C0326c c0326c9 = c0327d7.f4019L;
        if (z3) {
            c0326c9.a(this.f4098g, this.f4100k);
        }
        if (i > 0) {
            this.f4096e.f4005d.f4019L.a(c0326c8, 0);
        }
        if (gVar.f4125S0 == 3 && !c0327d7.f4013E) {
            for (int i25 = 0; i25 < i9; i25++) {
                int i26 = this.f4103n + (z2 ? (i9 - 1) - i25 : i25);
                if (i26 >= gVar.f4132b1) {
                    break;
                }
                c0327d = gVar.f4131a1[i26];
                if (c0327d.f4013E) {
                    break;
                }
            }
        }
        c0327d = c0327d7;
        int i27 = 0;
        C0327d c0327d8 = null;
        while (i27 < i9) {
            int i28 = z2 ? (i9 - 1) - i27 : i27;
            int i29 = this.f4103n + i28;
            if (i29 >= gVar.f4132b1) {
                return;
            }
            C0327d c0327d9 = gVar.f4131a1[i29];
            if (c0327d9 == null) {
                i5 = i9;
                c2 = 3;
            } else {
                C0326c c0326c10 = c0327d9.f4016I;
                if (i27 == 0) {
                    c0327d9.f(c0326c10, this.f4095d, this.h);
                }
                if (i28 == 0) {
                    int i30 = gVar.f4110D0;
                    if (z2) {
                        i6 = i30;
                        f2 = 1.0f - gVar.f4116J0;
                    } else {
                        i6 = i30;
                        f2 = gVar.f4116J0;
                    }
                    if (this.f4103n == 0) {
                        int i31 = gVar.f4112F0;
                        f3 = f2;
                        if (i31 != -1) {
                            f4 = z2 ? 1.0f - gVar.f4118L0 : gVar.f4118L0;
                            i7 = i31;
                            c0327d9.i0 = i7;
                            c0327d9.f4041d0 = f4;
                        }
                    } else {
                        f3 = f2;
                    }
                    if (!z3 || (i7 = gVar.f4114H0) == -1) {
                        i7 = i6;
                        f4 = f3;
                    } else {
                        f4 = z2 ? 1.0f - gVar.f4120N0 : gVar.f4120N0;
                    }
                    c0327d9.i0 = i7;
                    c0327d9.f4041d0 = f4;
                }
                if (i27 == i9 - 1) {
                    i5 = i9;
                    c0327d9.f(c0327d9.f4018K, this.f4097f, this.f4099j);
                } else {
                    i5 = i9;
                }
                if (c0327d8 != null) {
                    int i32 = gVar.f4122P0;
                    C0326c c0326c11 = c0327d8.f4018K;
                    c0326c10.a(c0326c11, i32);
                    if (i27 == i11) {
                        int i33 = this.h;
                        if (c0326c10.h()) {
                            c0326c10.h = i33;
                        }
                    }
                    c0326c11.a(c0326c10, 0);
                    if (i27 == i12 + 1) {
                        int i34 = this.f4099j;
                        if (c0326c11.h()) {
                            c0326c11.h = i34;
                        }
                    }
                }
                if (c0327d9 != c0327d7) {
                    int i35 = gVar.f4125S0;
                    c2 = 3;
                    if (i35 == 3 && c0327d.f4013E && c0327d9 != c0327d && c0327d9.f4013E) {
                        c0327d9.f4020M.a(c0327d.f4020M, 0);
                    } else {
                        C0326c c0326c12 = c0327d9.f4017J;
                        if (i35 != 0) {
                            C0326c c0326c13 = c0327d9.f4019L;
                            if (i35 == 1) {
                                c0326c13.a(c0326c9, 0);
                            } else if (z4) {
                                c0326c12.a(this.f4096e, this.i);
                                c0326c13.a(this.f4098g, this.f4100k);
                            } else {
                                c0326c12.a(c0326c8, 0);
                                c0326c13.a(c0326c9, 0);
                            }
                        } else {
                            c0326c12.a(c0326c8, 0);
                        }
                    }
                } else {
                    c2 = 3;
                }
                c0327d8 = c0327d9;
            }
            i27++;
            i9 = i5;
        }
    }

    public final int c() {
        return this.f4092a == 1 ? this.f4102m - this.f4107r.f4123Q0 : this.f4102m;
    }

    public final int d() {
        return this.f4092a == 0 ? this.f4101l - this.f4107r.f4122P0 : this.f4101l;
    }

    public final void e(int i) {
        g gVar;
        int i2;
        int i3 = this.f4105p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f4104o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            gVar = this.f4107r;
            if (i6 >= i4 || (i2 = this.f4103n + i6) >= gVar.f4132b1) {
                break;
            }
            C0327d c0327d = gVar.f4131a1[i2];
            if (this.f4092a == 0) {
                if (c0327d != null) {
                    int[] iArr = c0327d.f4061p0;
                    if (iArr[0] == 3 && c0327d.f4063r == 0) {
                        gVar.V(1, i5, iArr[1], c0327d.k(), c0327d);
                    }
                }
            } else if (c0327d != null) {
                int[] iArr2 = c0327d.f4061p0;
                if (iArr2[1] == 3 && c0327d.f4064s == 0) {
                    gVar.V(iArr2[0], c0327d.q(), 1, i5, c0327d);
                }
            }
            i6++;
        }
        this.f4101l = 0;
        this.f4102m = 0;
        this.f4093b = null;
        this.f4094c = 0;
        int i7 = this.f4104o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f4103n + i8;
            if (i9 >= gVar.f4132b1) {
                return;
            }
            C0327d c0327d2 = gVar.f4131a1[i9];
            if (this.f4092a == 0) {
                int q2 = c0327d2.q();
                int i10 = gVar.f4122P0;
                if (c0327d2.f4047g0 == 8) {
                    i10 = 0;
                }
                this.f4101l = q2 + i10 + this.f4101l;
                int T2 = gVar.T(c0327d2, this.f4106q);
                if (this.f4093b == null || this.f4094c < T2) {
                    this.f4093b = c0327d2;
                    this.f4094c = T2;
                    this.f4102m = T2;
                }
            } else {
                int U2 = gVar.U(c0327d2, this.f4106q);
                int T3 = gVar.T(c0327d2, this.f4106q);
                int i11 = gVar.f4123Q0;
                if (c0327d2.f4047g0 == 8) {
                    i11 = 0;
                }
                this.f4102m = T3 + i11 + this.f4102m;
                if (this.f4093b == null || this.f4094c < U2) {
                    this.f4093b = c0327d2;
                    this.f4094c = U2;
                    this.f4101l = U2;
                }
            }
        }
    }

    public final void f(int i, C0326c c0326c, C0326c c0326c2, C0326c c0326c3, C0326c c0326c4, int i2, int i3, int i4, int i5, int i6) {
        this.f4092a = i;
        this.f4095d = c0326c;
        this.f4096e = c0326c2;
        this.f4097f = c0326c3;
        this.f4098g = c0326c4;
        this.h = i2;
        this.i = i3;
        this.f4099j = i4;
        this.f4100k = i5;
        this.f4106q = i6;
    }
}
