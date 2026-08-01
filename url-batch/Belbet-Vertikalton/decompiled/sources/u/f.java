package u;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f4312a;

    /* renamed from: d, reason: collision with root package name */
    public C0386c f4315d;
    public C0386c e;

    /* renamed from: f, reason: collision with root package name */
    public C0386c f4316f;

    /* renamed from: g, reason: collision with root package name */
    public C0386c f4317g;

    /* renamed from: h, reason: collision with root package name */
    public int f4318h;
    public int i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f4319k;

    /* renamed from: q, reason: collision with root package name */
    public int f4325q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f4326r;

    /* renamed from: b, reason: collision with root package name */
    public C0387d f4313b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f4314c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f4320l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f4321m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f4322n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f4323o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f4324p = 0;

    public f(g gVar, int i, C0386c c0386c, C0386c c0386c2, C0386c c0386c3, C0386c c0386c4, int i2) {
        this.f4326r = gVar;
        this.f4318h = 0;
        this.i = 0;
        this.j = 0;
        this.f4319k = 0;
        this.f4325q = 0;
        this.f4312a = i;
        this.f4315d = c0386c;
        this.e = c0386c2;
        this.f4316f = c0386c3;
        this.f4317g = c0386c4;
        this.f4318h = gVar.f4357w0;
        this.i = gVar.s0;
        this.j = gVar.f4358x0;
        this.f4319k = gVar.f4354t0;
        this.f4325q = i2;
    }

    public final void a(C0387d c0387d) {
        int i = this.f4312a;
        g gVar = this.f4326r;
        if (i == 0) {
            int U2 = gVar.U(c0387d, this.f4325q);
            if (c0387d.f4281p0[0] == 3) {
                this.f4324p++;
                U2 = 0;
            }
            this.f4320l = U2 + (c0387d.f4266g0 != 8 ? gVar.f4341P0 : 0) + this.f4320l;
            int T2 = gVar.T(c0387d, this.f4325q);
            if (this.f4313b == null || this.f4314c < T2) {
                this.f4313b = c0387d;
                this.f4314c = T2;
                this.f4321m = T2;
            }
        } else {
            int U3 = gVar.U(c0387d, this.f4325q);
            int T3 = gVar.T(c0387d, this.f4325q);
            if (c0387d.f4281p0[1] == 3) {
                this.f4324p++;
                T3 = 0;
            }
            this.f4321m = T3 + (c0387d.f4266g0 != 8 ? gVar.f4342Q0 : 0) + this.f4321m;
            if (this.f4313b == null || this.f4314c < U3) {
                this.f4313b = c0387d;
                this.f4314c = U3;
                this.f4320l = U3;
            }
        }
        this.f4323o++;
    }

    public final void b(int i, boolean z2, boolean z3) {
        g gVar;
        int i2;
        int i3;
        int i4;
        C0387d c0387d;
        int i5;
        char c2;
        int i6;
        float f2;
        float f3;
        int i7;
        float f4;
        int i8;
        int i9 = this.f4323o;
        int i10 = 0;
        while (true) {
            gVar = this.f4326r;
            if (i10 >= i9 || (i8 = this.f4322n + i10) >= gVar.f4353b1) {
                break;
            }
            C0387d c0387d2 = gVar.f4352a1[i8];
            if (c0387d2 != null) {
                c0387d2.D();
            }
            i10++;
        }
        if (i9 == 0 || this.f4313b == null) {
            return;
        }
        boolean z4 = z3 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.f4322n + (z2 ? (i9 - 1) - i13 : i13);
            if (i14 >= gVar.f4353b1) {
                break;
            }
            C0387d c0387d3 = gVar.f4352a1[i14];
            if (c0387d3 != null && c0387d3.f4266g0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        if (this.f4312a != 0) {
            C0387d c0387d4 = this.f4313b;
            c0387d4.f4269i0 = gVar.D0;
            int i15 = this.f4318h;
            if (i > 0) {
                i15 += gVar.f4341P0;
            }
            C0386c c0386c = c0387d4.f4236I;
            C0386c c0386c2 = c0387d4.f4238K;
            if (z2) {
                c0386c2.a(this.f4316f, i15);
                if (z3) {
                    c0386c.a(this.f4315d, this.j);
                }
                if (i > 0) {
                    this.f4316f.f4225d.f4236I.a(c0386c2, 0);
                }
            } else {
                c0386c.a(this.f4315d, i15);
                if (z3) {
                    c0386c2.a(this.f4316f, this.j);
                }
                if (i > 0) {
                    this.f4315d.f4225d.f4238K.a(c0386c, 0);
                }
            }
            C0387d c0387d5 = null;
            for (int i16 = 0; i16 < i9; i16++) {
                int i17 = this.f4322n + i16;
                if (i17 >= gVar.f4353b1) {
                    return;
                }
                C0387d c0387d6 = gVar.f4352a1[i17];
                if (c0387d6 != null) {
                    C0386c c0386c3 = c0387d6.f4237J;
                    if (i16 == 0) {
                        c0387d6.f(c0386c3, this.e, this.i);
                        int i18 = gVar.f4330E0;
                        float f5 = gVar.f4336K0;
                        if (this.f4322n == 0) {
                            i4 = gVar.f4332G0;
                            i2 = i18;
                            i3 = -1;
                            if (i4 != -1) {
                                f5 = gVar.f4338M0;
                                c0387d6.f4270j0 = i4;
                                c0387d6.f4262e0 = f5;
                            }
                        } else {
                            i2 = i18;
                            i3 = -1;
                        }
                        if (!z3 || (i4 = gVar.f4334I0) == i3) {
                            i4 = i2;
                        } else {
                            f5 = gVar.f4340O0;
                        }
                        c0387d6.f4270j0 = i4;
                        c0387d6.f4262e0 = f5;
                    }
                    if (i16 == i9 - 1) {
                        c0387d6.f(c0387d6.f4239L, this.f4317g, this.f4319k);
                    }
                    if (c0387d5 != null) {
                        int i19 = gVar.f4342Q0;
                        C0386c c0386c4 = c0387d5.f4239L;
                        c0386c3.a(c0386c4, i19);
                        if (i16 == i11) {
                            int i20 = this.i;
                            if (c0386c3.h()) {
                                c0386c3.f4228h = i20;
                            }
                        }
                        c0386c4.a(c0386c3, 0);
                        if (i16 == i12 + 1) {
                            int i21 = this.f4319k;
                            if (c0386c4.h()) {
                                c0386c4.f4228h = i21;
                            }
                        }
                    }
                    if (c0387d6 != c0387d4) {
                        C0386c c0386c5 = c0387d6.f4238K;
                        C0386c c0386c6 = c0387d6.f4236I;
                        if (z2) {
                            int i22 = gVar.f4343R0;
                            if (i22 == 0) {
                                c0386c5.a(c0386c2, 0);
                            } else if (i22 == 1) {
                                c0386c6.a(c0386c, 0);
                            } else if (i22 == 2) {
                                c0386c6.a(c0386c, 0);
                                c0386c5.a(c0386c2, 0);
                            }
                        } else {
                            int i23 = gVar.f4343R0;
                            if (i23 == 0) {
                                c0386c6.a(c0386c, 0);
                            } else if (i23 == 1) {
                                c0386c5.a(c0386c2, 0);
                            } else if (i23 == 2) {
                                if (z4) {
                                    c0386c6.a(this.f4315d, this.f4318h);
                                    c0386c5.a(this.f4316f, this.j);
                                } else {
                                    c0386c6.a(c0386c, 0);
                                    c0386c5.a(c0386c2, 0);
                                }
                            }
                            c0387d5 = c0387d6;
                        }
                    }
                    c0387d5 = c0387d6;
                }
            }
            return;
        }
        C0387d c0387d7 = this.f4313b;
        c0387d7.f4270j0 = gVar.f4330E0;
        int i24 = this.i;
        if (i > 0) {
            i24 += gVar.f4342Q0;
        }
        C0386c c0386c7 = this.e;
        C0386c c0386c8 = c0387d7.f4237J;
        c0386c8.a(c0386c7, i24);
        C0386c c0386c9 = c0387d7.f4239L;
        if (z3) {
            c0386c9.a(this.f4317g, this.f4319k);
        }
        if (i > 0) {
            this.e.f4225d.f4239L.a(c0386c8, 0);
        }
        if (gVar.f4344S0 == 3 && !c0387d7.f4233E) {
            for (int i25 = 0; i25 < i9; i25++) {
                int i26 = this.f4322n + (z2 ? (i9 - 1) - i25 : i25);
                if (i26 >= gVar.f4353b1) {
                    break;
                }
                c0387d = gVar.f4352a1[i26];
                if (c0387d.f4233E) {
                    break;
                }
            }
        }
        c0387d = c0387d7;
        int i27 = 0;
        C0387d c0387d8 = null;
        while (i27 < i9) {
            int i28 = z2 ? (i9 - 1) - i27 : i27;
            int i29 = this.f4322n + i28;
            if (i29 >= gVar.f4353b1) {
                return;
            }
            C0387d c0387d9 = gVar.f4352a1[i29];
            if (c0387d9 == null) {
                i5 = i9;
                c2 = 3;
            } else {
                C0386c c0386c10 = c0387d9.f4236I;
                if (i27 == 0) {
                    c0387d9.f(c0386c10, this.f4315d, this.f4318h);
                }
                if (i28 == 0) {
                    int i30 = gVar.D0;
                    if (z2) {
                        i6 = i30;
                        f2 = 1.0f - gVar.f4335J0;
                    } else {
                        i6 = i30;
                        f2 = gVar.f4335J0;
                    }
                    if (this.f4322n == 0) {
                        int i31 = gVar.f4331F0;
                        f3 = f2;
                        if (i31 != -1) {
                            f4 = z2 ? 1.0f - gVar.f4337L0 : gVar.f4337L0;
                            i7 = i31;
                            c0387d9.f4269i0 = i7;
                            c0387d9.f4261d0 = f4;
                        }
                    } else {
                        f3 = f2;
                    }
                    if (!z3 || (i7 = gVar.f4333H0) == -1) {
                        i7 = i6;
                        f4 = f3;
                    } else {
                        f4 = z2 ? 1.0f - gVar.f4339N0 : gVar.f4339N0;
                    }
                    c0387d9.f4269i0 = i7;
                    c0387d9.f4261d0 = f4;
                }
                if (i27 == i9 - 1) {
                    i5 = i9;
                    c0387d9.f(c0387d9.f4238K, this.f4316f, this.j);
                } else {
                    i5 = i9;
                }
                if (c0387d8 != null) {
                    int i32 = gVar.f4341P0;
                    C0386c c0386c11 = c0387d8.f4238K;
                    c0386c10.a(c0386c11, i32);
                    if (i27 == i11) {
                        int i33 = this.f4318h;
                        if (c0386c10.h()) {
                            c0386c10.f4228h = i33;
                        }
                    }
                    c0386c11.a(c0386c10, 0);
                    if (i27 == i12 + 1) {
                        int i34 = this.j;
                        if (c0386c11.h()) {
                            c0386c11.f4228h = i34;
                        }
                    }
                }
                if (c0387d9 != c0387d7) {
                    int i35 = gVar.f4344S0;
                    c2 = 3;
                    if (i35 == 3 && c0387d.f4233E && c0387d9 != c0387d && c0387d9.f4233E) {
                        c0387d9.f4240M.a(c0387d.f4240M, 0);
                    } else {
                        C0386c c0386c12 = c0387d9.f4237J;
                        if (i35 != 0) {
                            C0386c c0386c13 = c0387d9.f4239L;
                            if (i35 == 1) {
                                c0386c13.a(c0386c9, 0);
                            } else if (z4) {
                                c0386c12.a(this.e, this.i);
                                c0386c13.a(this.f4317g, this.f4319k);
                            } else {
                                c0386c12.a(c0386c8, 0);
                                c0386c13.a(c0386c9, 0);
                            }
                        } else {
                            c0386c12.a(c0386c8, 0);
                        }
                    }
                } else {
                    c2 = 3;
                }
                c0387d8 = c0387d9;
            }
            i27++;
            i9 = i5;
        }
    }

    public final int c() {
        return this.f4312a == 1 ? this.f4321m - this.f4326r.f4342Q0 : this.f4321m;
    }

    public final int d() {
        return this.f4312a == 0 ? this.f4320l - this.f4326r.f4341P0 : this.f4320l;
    }

    public final void e(int i) {
        g gVar;
        int i2;
        int i3 = this.f4324p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f4323o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            gVar = this.f4326r;
            if (i6 >= i4 || (i2 = this.f4322n + i6) >= gVar.f4353b1) {
                break;
            }
            C0387d c0387d = gVar.f4352a1[i2];
            if (this.f4312a == 0) {
                if (c0387d != null) {
                    int[] iArr = c0387d.f4281p0;
                    if (iArr[0] == 3 && c0387d.f4283r == 0) {
                        gVar.V(1, i5, iArr[1], c0387d.k(), c0387d);
                    }
                }
            } else if (c0387d != null) {
                int[] iArr2 = c0387d.f4281p0;
                if (iArr2[1] == 3 && c0387d.f4284s == 0) {
                    gVar.V(iArr2[0], c0387d.q(), 1, i5, c0387d);
                }
            }
            i6++;
        }
        this.f4320l = 0;
        this.f4321m = 0;
        this.f4313b = null;
        this.f4314c = 0;
        int i7 = this.f4323o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f4322n + i8;
            if (i9 >= gVar.f4353b1) {
                return;
            }
            C0387d c0387d2 = gVar.f4352a1[i9];
            if (this.f4312a == 0) {
                int q2 = c0387d2.q();
                int i10 = gVar.f4341P0;
                if (c0387d2.f4266g0 == 8) {
                    i10 = 0;
                }
                this.f4320l = q2 + i10 + this.f4320l;
                int T2 = gVar.T(c0387d2, this.f4325q);
                if (this.f4313b == null || this.f4314c < T2) {
                    this.f4313b = c0387d2;
                    this.f4314c = T2;
                    this.f4321m = T2;
                }
            } else {
                int U2 = gVar.U(c0387d2, this.f4325q);
                int T3 = gVar.T(c0387d2, this.f4325q);
                int i11 = gVar.f4342Q0;
                if (c0387d2.f4266g0 == 8) {
                    i11 = 0;
                }
                this.f4321m = T3 + i11 + this.f4321m;
                if (this.f4313b == null || this.f4314c < U2) {
                    this.f4313b = c0387d2;
                    this.f4314c = U2;
                    this.f4320l = U2;
                }
            }
        }
    }

    public final void f(int i, C0386c c0386c, C0386c c0386c2, C0386c c0386c3, C0386c c0386c4, int i2, int i3, int i4, int i5, int i6) {
        this.f4312a = i;
        this.f4315d = c0386c;
        this.e = c0386c2;
        this.f4316f = c0386c3;
        this.f4317g = c0386c4;
        this.f4318h = i2;
        this.i = i3;
        this.j = i4;
        this.f4319k = i5;
        this.f4325q = i6;
    }
}
