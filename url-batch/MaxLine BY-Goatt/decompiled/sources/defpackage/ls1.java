package defpackage;

import com.facebook.internal.Utility;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ls1 {
    public static final hn1 a;

    static {
        hn1 hn1Var = nt1.a;
        a = new hn1();
    }

    public static final void a(ul1 ul1Var, int i, int i2) {
        if (!(ul1Var instanceof p90)) {
            b(ul1Var, i & ul1Var.o, i2);
            return;
        }
        p90 p90Var = (p90) ul1Var;
        int i3 = p90Var.A;
        b(ul1Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (ul1 ul1Var2 = p90Var.B; ul1Var2 != null; ul1Var2 = ul1Var2.r) {
            a(ul1Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(ul1 ul1Var, int i, int i2) {
        if (i2 != 0 || ul1Var.v0()) {
            if ((i & 2) != 0 && (ul1Var instanceof a91)) {
                zm3.C((a91) ul1Var);
                if (i2 == 2) {
                    s03.H(ul1Var, 2).d1();
                }
            }
            if ((i & 128) != 0 && (ul1Var instanceof r81) && i2 != 2) {
                s03.J(ul1Var).D();
            }
            if ((i & 256) != 0 && (ul1Var instanceof iv0)) {
                if (i2 == 1) {
                    i91 J = s03.J(ul1Var);
                    J.b0(J.X + 1);
                } else if (i2 == 2) {
                    s03.J(ul1Var).b0(r0.X - 1);
                }
                if (i2 != 2) {
                    i91 J2 = s03.J(ul1Var);
                    if (J2.X != 0 && !J2.p() && !J2.q() && !J2.W) {
                        t7 t7Var = (t7) l91.a(J2);
                        tt1 tt1Var = t7Var.c0.e;
                        tt1Var.getClass();
                        if (J2.X > 0) {
                            ((eo1) tt1Var.n).b(J2);
                            J2.W = true;
                        }
                        t7Var.F(null);
                    }
                }
            }
            if ((i & 4) != 0 && (ul1Var instanceof xd0)) {
                z71.F((xd0) ul1Var);
            }
            if ((i & 8) != 0 && (ul1Var instanceof xh2)) {
                s03.J(ul1Var).B = true;
            }
            if ((i & 64) != 0 && (ul1Var instanceof mz1)) {
                m91 m91Var = s03.J((mz1) ul1Var).Q;
                m91Var.p.B = true;
                xg1 xg1Var = m91Var.q;
                if (xg1Var != null) {
                    xg1Var.G = true;
                }
            }
            if ((i & 2048) != 0 && (ul1Var instanceof so0)) {
                so0 so0Var = (so0) ul1Var;
                zr.b = null;
                so0Var.T(zr.a);
                if (zr.b != null) {
                    ul1 ul1Var2 = (ul1) so0Var;
                    if (!ul1Var2.m.z) {
                        h21.b("visitChildren called on an unattached node");
                    }
                    eo1 eo1Var = new eo1(new ul1[16]);
                    ul1 ul1Var3 = ul1Var2.m;
                    ul1 ul1Var4 = ul1Var3.r;
                    if (ul1Var4 == null) {
                        s03.b(eo1Var, ul1Var3);
                    } else {
                        eo1Var.b(ul1Var4);
                    }
                    while (true) {
                        int i3 = eo1Var.o;
                        if (i3 == 0) {
                            break;
                        }
                        ul1 ul1Var5 = (ul1) eo1Var.l(i3 - 1);
                        if ((ul1Var5.p & 1024) == 0) {
                            s03.b(eo1Var, ul1Var5);
                        } else {
                            while (true) {
                                if (ul1Var5 == null) {
                                    break;
                                }
                                if ((ul1Var5.o & 1024) != 0) {
                                    eo1 eo1Var2 = null;
                                    while (ul1Var5 != null) {
                                        if (ul1Var5 instanceof yo0) {
                                            yo0 yo0Var = (yo0) ul1Var5;
                                            lo0 lo0Var = ((po0) ((t7) s03.K(yo0Var)).getFocusOwner()).d;
                                            if (lo0Var.c.a(yo0Var)) {
                                                lo0Var.a();
                                            }
                                        } else if ((ul1Var5.o & 1024) != 0 && (ul1Var5 instanceof p90)) {
                                            int i4 = 0;
                                            for (ul1 ul1Var6 = ((p90) ul1Var5).B; ul1Var6 != null; ul1Var6 = ul1Var6.r) {
                                                if ((ul1Var6.o & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        ul1Var5 = ul1Var6;
                                                    } else {
                                                        if (eo1Var2 == null) {
                                                            eo1Var2 = new eo1(new ul1[16]);
                                                        }
                                                        if (ul1Var5 != null) {
                                                            eo1Var2.b(ul1Var5);
                                                            ul1Var5 = null;
                                                        }
                                                        eo1Var2.b(ul1Var6);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        ul1Var5 = s03.c(eo1Var2);
                                    }
                                } else {
                                    ul1Var5 = ul1Var5.r;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) == 0 || !(ul1Var instanceof go0)) {
                return;
            }
            go0 go0Var = (go0) ul1Var;
            lo0 lo0Var2 = ((po0) ((t7) s03.K(go0Var)).getFocusOwner()).d;
            if (lo0Var2.d.a(go0Var)) {
                lo0Var2.a();
            }
        }
    }

    public static final void c(ul1 ul1Var) {
        if (!ul1Var.z) {
            h21.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(ul1Var, -1, 0);
    }

    public static final int d(tl1 tl1Var) {
        int i = tl1Var instanceof y81 ? 3 : 1;
        if (tl1Var instanceof wd0) {
            i |= 4;
        }
        if (tl1Var instanceof vh2) {
            i |= 8;
        }
        if ((tl1Var instanceof wl1) || (tl1Var instanceof zl1)) {
            i |= 32;
        }
        if (tl1Var instanceof qm) {
            i |= 256;
        }
        if (tl1Var instanceof wc) {
            i |= 64;
        }
        return tl1Var instanceof kp ? 524288 | i : i;
    }

    public static final int e(ul1 ul1Var) {
        int i = ul1Var.o;
        if (i != 0) {
            return i;
        }
        Class<?> cls = ul1Var.getClass();
        hn1 hn1Var = a;
        int d = hn1Var.d(cls);
        if (d >= 0) {
            return hn1Var.c[d];
        }
        int i2 = ul1Var instanceof a91 ? 3 : 1;
        if (ul1Var instanceof xd0) {
            i2 |= 4;
        }
        if (ul1Var instanceof xh2) {
            i2 |= 8;
        }
        if (ul1Var instanceof w22) {
            i2 |= 16;
        }
        if (ul1Var instanceof yl1) {
            i2 |= 32;
        }
        if (ul1Var instanceof mz1) {
            i2 |= 64;
        }
        if (ul1Var instanceof r81) {
            i2 |= 128;
        }
        if (ul1Var instanceof iv0) {
            i2 |= 256;
        }
        if (ul1Var instanceof yo0) {
            i2 |= 1024;
        }
        if (ul1Var instanceof so0) {
            i2 |= 2048;
        }
        if (ul1Var instanceof go0) {
            i2 |= 4096;
        }
        if (ul1Var instanceof b81) {
            i2 |= Utility.DEFAULT_STREAM_BUFFER_SIZE;
        }
        if (ul1Var instanceof sb2) {
            i2 |= 16384;
        }
        if (ul1Var instanceof l00) {
            i2 |= 32768;
        }
        if (ul1Var instanceof rz2) {
            i2 |= 262144;
        }
        if (ul1Var instanceof kp) {
            i2 |= 524288;
        }
        hn1Var.h(i2, cls);
        return i2;
    }

    public static final int f(ul1 ul1Var) {
        if (!(ul1Var instanceof p90)) {
            return e(ul1Var);
        }
        p90 p90Var = (p90) ul1Var;
        int i = p90Var.A;
        for (ul1 ul1Var2 = p90Var.B; ul1Var2 != null; ul1Var2 = ul1Var2.r) {
            i |= f(ul1Var2);
        }
        return i;
    }

    public static final boolean g(int i) {
        return (i & 128) != 0;
    }
}
