package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sf {
    public sd a = null;
    int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    final /* synthetic */ sg h;
    private int i;
    private sc j;
    private sc k;
    private sc l;
    private sc m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;

    public sf(sg sgVar, int i, sc scVar, sc scVar2, sc scVar3, sc scVar4, int i2) {
        this.h = sgVar;
        this.o = 0;
        this.q = 0;
        this.i = i;
        this.j = scVar;
        this.k = scVar2;
        this.l = scVar3;
        this.m = scVar4;
        this.n = sgVar.aP;
        this.o = sgVar.aL;
        this.p = sgVar.aQ;
        this.q = sgVar.aM;
        this.r = i2;
    }

    public final int a() {
        int i = this.i;
        int i2 = this.d;
        return i == 1 ? i2 - this.h.aB : i2;
    }

    public final int b() {
        int i = this.i;
        int i2 = this.c;
        return i == 0 ? i2 - this.h.aA : i2;
    }

    public final void c(sd sdVar) {
        int i = this.i;
        sg sgVar = this.h;
        if (i == 0) {
            int c = sgVar.c(sdVar, this.r);
            if (sdVar.O() == 3) {
                this.g++;
                c = 0;
            }
            this.c += c + (sdVar.ai != 8 ? sgVar.aA : 0);
            int a = sgVar.a(sdVar, this.r);
            if (this.a == null || this.b < a) {
                this.a = sdVar;
                this.b = a;
                this.d = a;
            }
        } else {
            int c2 = sgVar.c(sdVar, this.r);
            int a2 = sgVar.a(sdVar, this.r);
            if (sdVar.P() == 3) {
                this.g++;
                a2 = 0;
            }
            this.d += a2 + (sdVar.ai != 8 ? sgVar.aB : 0);
            if (this.a == null || this.b < c2) {
                this.a = sdVar;
                this.b = c2;
                this.c = c2;
            }
        }
        this.f++;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z, int i, boolean z2) {
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        sd sdVar;
        boolean z4;
        int i7;
        boolean z5;
        char c;
        float f;
        float f2;
        int i8;
        int i9;
        int i10 = this.f;
        boolean z6 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.e + i11;
            sg sgVar = this.h;
            if (i12 >= sgVar.aI) {
                break;
            }
            sd sdVar2 = sgVar.aH[i12];
            if (sdVar2 != null) {
                sdVar2.u();
            }
        }
        if (i10 == 0 || this.a == null) {
            return;
        }
        if (z2 && i == 0) {
            i2 = 0;
            z3 = true;
        } else {
            i2 = i;
            z3 = false;
        }
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < i10; i15++) {
            int i16 = this.e + (z ? (i10 - 1) - i15 : i15);
            sg sgVar2 = this.h;
            if (i16 >= sgVar2.aI) {
                break;
            }
            sd sdVar3 = sgVar2.aH[i16];
            if (sdVar3 != null && sdVar3.ai == 0) {
                if (i13 == -1) {
                    i13 = i15;
                }
                i14 = i15;
            }
        }
        int i17 = this.i;
        sd sdVar4 = this.a;
        if (i17 != 0) {
            boolean z7 = z3;
            sg sgVar3 = this.h;
            sdVar4.ak = sgVar3.a;
            int i18 = this.n;
            if (i2 > 0) {
                i18 += sgVar3.aA;
            }
            if (z) {
                sc scVar = sdVar4.M;
                scVar.l(this.l, i18, Integer.MIN_VALUE, false);
                if (z2) {
                    sdVar4.K.l(this.j, this.p, Integer.MIN_VALUE, false);
                }
                if (i2 > 0) {
                    this.l.d.K.l(scVar, 0, Integer.MIN_VALUE, false);
                }
                i3 = 0;
            } else {
                sc scVar2 = sdVar4.K;
                scVar2.l(this.j, i18, Integer.MIN_VALUE, false);
                if (z2) {
                    sdVar4.M.l(this.l, this.p, Integer.MIN_VALUE, false);
                }
                if (i2 > 0) {
                    this.j.d.M.l(scVar2, 0, Integer.MIN_VALUE, false);
                }
                i3 = 0;
            }
            sd sdVar5 = null;
            while (i3 < i10) {
                int i19 = this.e + i3;
                if (i19 >= sgVar3.aI) {
                    return;
                }
                sd sdVar6 = sgVar3.aH[i19];
                if (sdVar6 == null) {
                    sdVar6 = sdVar5;
                } else {
                    if (i3 == 0) {
                        sdVar6.q(sdVar6.L, this.k, this.o);
                        int i20 = sgVar3.b;
                        float f3 = sgVar3.av;
                        if (this.e == 0) {
                            i6 = sgVar3.d;
                            i5 = -1;
                            if (i6 != -1) {
                                f3 = sgVar3.ax;
                                i20 = i6;
                                sdVar6.al = i20;
                                sdVar6.ag = f3;
                                i4 = 0;
                            }
                        } else {
                            i5 = -1;
                        }
                        if (z2 && (i6 = sgVar3.at) != i5) {
                            f3 = sgVar3.az;
                            i20 = i6;
                        }
                        sdVar6.al = i20;
                        sdVar6.ag = f3;
                        i4 = 0;
                    } else {
                        i4 = i3;
                    }
                    if (i4 == i10 - 1) {
                        sdVar6.q(sdVar6.N, this.m, this.q);
                    }
                    if (sdVar5 != null) {
                        int i21 = i14 + 1;
                        sc scVar3 = sdVar6.L;
                        int i22 = sgVar3.aB;
                        sc scVar4 = sdVar5.N;
                        scVar3.l(scVar4, i22, Integer.MIN_VALUE, false);
                        if (i4 == i13) {
                            scVar3.g(this.o);
                        }
                        scVar4.l(scVar3, 0, Integer.MIN_VALUE, false);
                        if (i4 == i21) {
                            scVar4.g(this.q);
                        }
                    }
                    if (sdVar6 != sdVar4) {
                        if (z) {
                            int i23 = sgVar3.aC;
                            if (i23 == 0) {
                                sdVar6.M.l(sdVar4.M, 0, Integer.MIN_VALUE, false);
                            } else if (i23 == 1) {
                                sdVar6.K.l(sdVar4.K, 0, Integer.MIN_VALUE, false);
                            } else if (i23 == 2) {
                                sdVar6.K.l(sdVar4.K, 0, Integer.MIN_VALUE, false);
                                sdVar6.M.l(sdVar4.M, 0, Integer.MIN_VALUE, false);
                            }
                        } else {
                            int i24 = sgVar3.aC;
                            if (i24 == 0) {
                                sdVar6.K.l(sdVar4.K, 0, Integer.MIN_VALUE, false);
                            } else if (i24 == 1) {
                                sdVar6.M.l(sdVar4.M, 0, Integer.MIN_VALUE, false);
                            } else if (i24 == 2) {
                                if (z7) {
                                    sdVar6.K.l(this.j, this.n, Integer.MIN_VALUE, false);
                                    sdVar6.M.l(this.l, this.p, Integer.MIN_VALUE, false);
                                } else {
                                    sdVar6.K.l(sdVar4.K, 0, Integer.MIN_VALUE, false);
                                    sdVar6.M.l(sdVar4.M, 0, Integer.MIN_VALUE, false);
                                }
                            }
                        }
                        i3 = i4;
                    }
                    i3 = i4;
                }
                i3++;
                sdVar5 = sdVar6;
            }
            return;
        }
        sg sgVar4 = this.h;
        sdVar4.al = sgVar4.b;
        int i25 = this.o;
        if (i2 > 0) {
            i25 += sgVar4.aB;
        }
        sc scVar5 = sdVar4.L;
        scVar5.l(this.k, i25, Integer.MIN_VALUE, false);
        if (z2) {
            sdVar4.N.l(this.m, this.q, Integer.MIN_VALUE, false);
        }
        if (i2 > 0) {
            this.k.d.N.l(scVar5, 0, Integer.MIN_VALUE, false);
        }
        if (sgVar4.aD == 3 && !sdVar4.G) {
            for (int i26 = 0; i26 < i10; i26++) {
                int i27 = this.e + (z ? (i10 - 1) - i26 : i26);
                if (i27 >= sgVar4.aI) {
                    break;
                }
                sdVar = sgVar4.aH[i27];
                if (sdVar.G) {
                    break;
                }
            }
        }
        sdVar = sdVar4;
        int i28 = 0;
        sd sdVar7 = null;
        while (i28 < i10) {
            if (z) {
                i7 = (i10 - 1) - i28;
                z4 = true;
            } else {
                z4 = z6;
                i7 = i28;
            }
            int i29 = this.e + i7;
            if (i29 >= sgVar4.aI) {
                return;
            }
            sd sdVar8 = sgVar4.aH[i29];
            if (sdVar8 != null) {
                int i30 = i10 - 1;
                if (i28 == 0) {
                    sdVar8.q(sdVar8.K, this.j, this.n);
                    i28 = 0;
                }
                if (i7 == 0) {
                    int i31 = sgVar4.a;
                    if (z4) {
                        f = 1.0f;
                        f2 = 1.0f - sgVar4.au;
                    } else {
                        f = 1.0f;
                        f2 = sgVar4.au;
                    }
                    if (this.e == 0) {
                        int i32 = sgVar4.c;
                        i8 = i31;
                        if (i32 != -1) {
                            f2 = z4 ? f - sgVar4.aw : sgVar4.aw;
                            i9 = i32;
                            sdVar8.ak = i9;
                            sdVar8.af = f2;
                        }
                    } else {
                        i8 = i31;
                    }
                    if (!z2 || (i9 = sgVar4.as) == -1) {
                        i9 = i8;
                    } else {
                        float f4 = sgVar4.ay;
                        f2 = z4 ? f - f4 : f4;
                    }
                    sdVar8.ak = i9;
                    sdVar8.af = f2;
                }
                if (i28 == i30) {
                    sdVar8.q(sdVar8.M, this.l, this.p);
                }
                if (sdVar7 != null) {
                    int i33 = i14 + 1;
                    sc scVar6 = sdVar8.K;
                    int i34 = sgVar4.aA;
                    sc scVar7 = sdVar7.M;
                    z5 = z3;
                    scVar6.l(scVar7, i34, Integer.MIN_VALUE, false);
                    if (i28 == i13) {
                        scVar6.g(this.n);
                    }
                    scVar7.l(scVar6, 0, Integer.MIN_VALUE, false);
                    if (i28 == i33) {
                        scVar7.g(this.p);
                    }
                } else {
                    z5 = z3;
                }
                if (sdVar8 != sdVar4) {
                    int i35 = sgVar4.aD;
                    c = 3;
                    if (i35 == 3) {
                        if (sdVar.G && sdVar8 != sdVar && sdVar8.G) {
                            sdVar8.O.l(sdVar.O, 0, Integer.MIN_VALUE, false);
                        }
                        if (z5) {
                            sdVar8.L.l(scVar5, 0, Integer.MIN_VALUE, false);
                            sdVar8.N.l(sdVar4.N, 0, Integer.MIN_VALUE, false);
                        } else {
                            sdVar8.L.l(this.k, this.o, Integer.MIN_VALUE, false);
                            sdVar8.N.l(this.m, this.q, Integer.MIN_VALUE, false);
                        }
                    } else if (i35 != 0) {
                        if (i35 == 1) {
                            sdVar8.N.l(sdVar4.N, 0, Integer.MIN_VALUE, false);
                        }
                        if (z5) {
                        }
                    } else {
                        sdVar8.L.l(scVar5, 0, Integer.MIN_VALUE, false);
                    }
                } else {
                    c = 3;
                }
                sdVar7 = sdVar8;
            } else {
                z5 = z3;
                c = 3;
            }
            i28++;
            z3 = z5;
            z6 = false;
        }
    }

    public final void e(int i) {
        int i2 = this.g;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f;
        int i4 = i / i2;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = this.e + i5;
            sg sgVar = this.h;
            if (i6 >= sgVar.aI) {
                break;
            }
            sd sdVar = sgVar.aH[i6];
            if (this.i == 0) {
                if (sdVar != null && sdVar.O() == 3 && sdVar.t == 0) {
                    sgVar.aa(sdVar, 1, i4, sdVar.P(), sdVar.h());
                }
            } else if (sdVar != null && sdVar.P() == 3 && sdVar.u == 0) {
                int i7 = i4;
                sgVar.aa(sdVar, sdVar.O(), sdVar.j(), 1, i7);
                i4 = i7;
            }
        }
        this.c = 0;
        this.d = 0;
        this.a = null;
        this.b = 0;
        int i8 = this.f;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.e + i9;
            sg sgVar2 = this.h;
            if (i10 >= sgVar2.aI) {
                return;
            }
            sd sdVar2 = sgVar2.aH[i10];
            if (this.i == 0) {
                int j = sdVar2.j();
                int i11 = sgVar2.aA;
                if (sdVar2.ai == 8) {
                    i11 = 0;
                }
                this.c += j + i11;
                int a = sgVar2.a(sdVar2, this.r);
                if (this.a == null || this.b < a) {
                    this.a = sdVar2;
                    this.b = a;
                    this.d = a;
                }
            } else {
                int c = sgVar2.c(sdVar2, this.r);
                int a2 = sgVar2.a(sdVar2, this.r);
                int i12 = sgVar2.aB;
                if (sdVar2.ai == 8) {
                    i12 = 0;
                }
                this.d += a2 + i12;
                if (this.a == null || this.b < c) {
                    this.a = sdVar2;
                    this.b = c;
                    this.c = c;
                }
            }
        }
    }

    public final void f(int i, sc scVar, sc scVar2, sc scVar3, sc scVar4, int i2, int i3, int i4, int i5, int i6) {
        this.i = i;
        this.j = scVar;
        this.k = scVar2;
        this.l = scVar3;
        this.m = scVar4;
        this.n = i2;
        this.o = i3;
        this.p = i4;
        this.q = i5;
        this.r = i6;
    }
}
