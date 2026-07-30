package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class rp0 {
    public static final ln0 a;

    static {
        ln0 ln0Var = qq0.a;
        a = new ln0();
    }

    public static final void a(zl0 zl0Var, int i, int i2) {
        if (!(zl0Var instanceof zq)) {
            b(zl0Var, i & zl0Var.g, i2);
            return;
        }
        zq zqVar = (zq) zl0Var;
        int i3 = zqVar.s;
        b(zl0Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (zl0 zl0Var2 = zqVar.t; zl0Var2 != null; zl0Var2 = zl0Var2.j) {
            a(zl0Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(zl0 zl0Var, int i, int i2) {
        if (i2 != 0 || zl0Var.o0()) {
            if ((i & 2) != 0 && (zl0Var instanceof ad0)) {
                y90.t((ad0) zl0Var);
                if (i2 == 2) {
                    op.G(zl0Var, 2).V0();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                op.I(zl0Var).C();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                op.I(zl0Var).S(false);
            }
            if ((i & 256) != 0 && (zl0Var instanceof u40)) {
                if (i2 == 1) {
                    jd0 I = op.I(zl0Var);
                    I.Y(I.T + 1);
                } else if (i2 == 2) {
                    op.I(zl0Var).Y(r0.T - 1);
                }
                if (i2 != 2) {
                    jd0 I2 = op.I(zl0Var);
                    if (I2.T != 0 && !I2.o() && !I2.p() && !I2.S) {
                        d4 d4Var = (d4) md0.a(I2);
                        yw ywVar = d4Var.a0.e;
                        ywVar.getClass();
                        if (I2.T > 0) {
                            ((eo0) ywVar.e).b(I2);
                            I2.S = true;
                        }
                        d4Var.E(null);
                    }
                }
            }
            if ((i & 4) != 0 && (zl0Var instanceof gu)) {
                yr1.O((gu) zl0Var);
            }
            if ((i & 8) != 0 && (zl0Var instanceof j81)) {
                op.I(zl0Var).w = true;
            }
            if ((i & 64) != 0 && (zl0Var instanceof bv0)) {
                nd0 nd0Var = op.I((bv0) zl0Var).K;
                nd0Var.p.t = true;
                kj0 kj0Var = nd0Var.q;
                if (kj0Var != null) {
                    kj0Var.z = true;
                }
            }
            if ((i & 2048) != 0 && (zl0Var instanceof h10)) {
                h10 h10Var = (h10) zl0Var;
                of.b = null;
                h10Var.J(of.a);
                if (of.b != null) {
                    zl0 zl0Var2 = (zl0) h10Var;
                    if (!zl0Var2.d.r) {
                        o80.b("visitChildren called on an unattached node");
                    }
                    eo0 eo0Var = new eo0(new zl0[16]);
                    zl0 zl0Var3 = zl0Var2.d;
                    zl0 zl0Var4 = zl0Var3.j;
                    if (zl0Var4 == null) {
                        op.l(eo0Var, zl0Var3);
                    } else {
                        eo0Var.b(zl0Var4);
                    }
                    while (true) {
                        int i3 = eo0Var.g;
                        if (i3 == 0) {
                            break;
                        }
                        zl0 zl0Var5 = (zl0) eo0Var.k(i3 - 1);
                        if ((zl0Var5.h & 1024) == 0) {
                            op.l(eo0Var, zl0Var5);
                        } else {
                            while (true) {
                                if (zl0Var5 == null) {
                                    break;
                                }
                                if ((zl0Var5.g & 1024) != 0) {
                                    eo0 eo0Var2 = null;
                                    while (zl0Var5 != null) {
                                        if (zl0Var5 instanceof o10) {
                                            o10 o10Var = (o10) zl0Var5;
                                            z00 z00Var = ((e10) ((d4) op.J(o10Var)).getFocusOwner()).d;
                                            if (z00Var.c.a(o10Var)) {
                                                z00Var.a();
                                            }
                                        } else if ((zl0Var5.g & 1024) != 0 && (zl0Var5 instanceof zq)) {
                                            int i4 = 0;
                                            for (zl0 zl0Var6 = ((zq) zl0Var5).t; zl0Var6 != null; zl0Var6 = zl0Var6.j) {
                                                if ((zl0Var6.g & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        zl0Var5 = zl0Var6;
                                                    } else {
                                                        if (eo0Var2 == null) {
                                                            eo0Var2 = new eo0(new zl0[16]);
                                                        }
                                                        if (zl0Var5 != null) {
                                                            eo0Var2.b(zl0Var5);
                                                            zl0Var5 = null;
                                                        }
                                                        eo0Var2.b(zl0Var6);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        zl0Var5 = op.o(eo0Var2);
                                    }
                                } else {
                                    zl0Var5 = zl0Var5.j;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) == 0 || !(zl0Var instanceof xc)) {
                return;
            }
            xc xcVar = (xc) zl0Var;
            z00 z00Var2 = ((e10) ((d4) op.J(xcVar)).getFocusOwner()).d;
            if (z00Var2.d.a(xcVar)) {
                z00Var2.a();
            }
        }
    }

    public static final void c(zl0 zl0Var) {
        if (!zl0Var.r) {
            o80.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(zl0Var, -1, 0);
    }

    public static final int d(yl0 yl0Var) {
        int i = yl0Var instanceof fu ? 5 : 1;
        if (yl0Var instanceof a9) {
            i |= 8;
        }
        if (yl0Var instanceof xx0) {
            i |= 16;
        }
        return yl0Var instanceof be ? 524288 | i : i;
    }

    public static final int e(zl0 zl0Var) {
        int i = zl0Var.g;
        if (i != 0) {
            return i;
        }
        Class<?> cls = zl0Var.getClass();
        ln0 ln0Var = a;
        int d = ln0Var.d(cls);
        if (d >= 0) {
            return ln0Var.c[d];
        }
        int i2 = zl0Var instanceof ad0 ? 3 : 1;
        if (zl0Var instanceof gu) {
            i2 |= 4;
        }
        if (zl0Var instanceof j81) {
            i2 |= 8;
        }
        if (zl0Var instanceof tx0) {
            i2 |= 16;
        }
        if (zl0Var instanceof cm0) {
            i2 |= 32;
        }
        if (zl0Var instanceof bv0) {
            i2 |= 64;
        }
        if (zl0Var instanceof sc0) {
            i2 |= 4194432;
        }
        if (zl0Var instanceof u40) {
            i2 |= 256;
        }
        if (zl0Var instanceof o10) {
            i2 |= 1024;
        }
        if (zl0Var instanceof h10) {
            i2 |= 2048;
        }
        if (zl0Var instanceof xc) {
            i2 |= 4096;
        }
        if (zl0Var instanceof hc0) {
            i2 |= 8192;
        }
        if (zl0Var instanceof r3) {
            i2 |= 16384;
        }
        if (zl0Var instanceof ul) {
            i2 |= 32768;
        }
        if (zl0Var instanceof kj1) {
            i2 |= 262144;
        }
        if (zl0Var instanceof be) {
            i2 |= 524288;
        }
        if (zl0Var instanceof d80) {
            i2 |= 2097152;
        }
        if (zl0Var instanceof je0) {
            i2 |= 8388608;
        }
        ln0Var.g(i2, cls);
        return i2;
    }

    public static final int f(zl0 zl0Var) {
        if (!(zl0Var instanceof zq)) {
            return e(zl0Var);
        }
        zq zqVar = (zq) zl0Var;
        int i = zqVar.s;
        for (zl0 zl0Var2 = zqVar.t; zl0Var2 != null; zl0Var2 = zl0Var2.j) {
            i |= f(zl0Var2);
        }
        return i;
    }

    public static final boolean g(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
