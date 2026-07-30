package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class x3 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0.z f2526a = new g0.z(r0.f2354r);

    public static final void a(a2.k0 k0Var, o0.a aVar, g0.p pVar, int i7) {
        pVar.S(-460300127);
        int i8 = (pVar.f(k0Var) ? 4 : 2) | i7 | (pVar.h(aVar) ? 32 : 16);
        if ((i8 & 19) == 18 && pVar.x()) {
            pVar.L();
        } else {
            g0.z zVar = f2526a;
            g0.d.a(zVar.a(((a2.k0) pVar.k(zVar)).d(k0Var)), aVar, pVar, (i8 & 112) | 8);
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new b0(i7, 4, k0Var, aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, s0.o oVar, long j8, long j9, long j10, l2.j jVar, l2.i iVar, long j11, int i7, boolean z8, int i8, int i9, a2.k0 k0Var, g0.p pVar, int i10, int i11, int i12) {
        String str2;
        int i13;
        s0.o oVar2;
        int i14;
        long j12;
        int i15;
        int i16;
        l2.j jVar2;
        int i17;
        l2.i iVar2;
        int i18;
        int i19;
        int i20;
        s0.o oVar3;
        long j13;
        long j14;
        a2.k0 k0Var2;
        int i21;
        int i22;
        boolean z9;
        int i23;
        int i24;
        long j15;
        long j16;
        long b9;
        int i25;
        boolean z10;
        int i26;
        long j17;
        a2.k0 k0Var3;
        long j18;
        boolean z11;
        s0.o oVar4;
        int i27;
        int i28;
        l2.i iVar3;
        l2.j jVar3;
        long j19;
        long j20;
        g0.p1 r8;
        pVar.S(-2055108902);
        if ((i10 & 6) == 0) {
            str2 = str;
            i13 = (pVar.f(str2) ? 4 : 2) | i10;
        } else {
            str2 = str;
            i13 = i10;
        }
        int i29 = i12 & 2;
        if (i29 != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            oVar2 = oVar;
            i13 |= pVar.f(oVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i10 & 384) == 0) {
                j12 = j8;
                i13 |= pVar.e(j12) ? 256 : 128;
                i15 = 14380032 | i13;
                i16 = i12 & 256;
                if (i16 != 0) {
                    i15 = 115043328 | i13;
                } else if ((100663296 & i10) == 0) {
                    jVar2 = jVar;
                    i15 |= pVar.f(jVar2) ? 67108864 : 33554432;
                    i17 = i12 & 512;
                    if (i17 == 0) {
                        i15 |= 805306368;
                    } else if ((805306368 & i10) == 0) {
                        iVar2 = iVar;
                        i15 |= pVar.f(iVar2) ? 536870912 : 268435456;
                        int i30 = i11 | 438;
                        i18 = i12 & 8192;
                        if (i18 != 0) {
                            i30 = 3510;
                            i19 = i18;
                        } else {
                            i19 = i18;
                            if ((i11 & 3072) == 0) {
                                i30 |= pVar.d(i8) ? 2048 : 1024;
                                i20 = i30 | 221184 | (((i12 & 65536) == 0 || !pVar.f(k0Var)) ? 524288 : 1048576);
                                if ((i15 & 306783379) != 306783378 && (599187 & i20) == 599186 && pVar.x()) {
                                    pVar.L();
                                    j18 = j11;
                                    i26 = i7;
                                    i28 = i8;
                                    i27 = i9;
                                    k0Var3 = k0Var;
                                    oVar4 = oVar2;
                                    j17 = j12;
                                    iVar3 = iVar2;
                                    j20 = j10;
                                    z11 = z8;
                                    jVar3 = jVar2;
                                    j19 = j9;
                                } else {
                                    pVar.N();
                                    if ((i10 & 1) != 0 || pVar.w()) {
                                        oVar3 = i29 == 0 ? s0.l.f8103a : oVar2;
                                        j13 = i14 == 0 ? z0.u.f10057g : j12;
                                        j14 = m2.m.f6327c;
                                        if (i16 != 0) {
                                            jVar2 = null;
                                        }
                                        if (i17 != 0) {
                                            iVar2 = null;
                                        }
                                        int i31 = i19 == 0 ? Integer.MAX_VALUE : i8;
                                        if ((i12 & 65536) == 0) {
                                            i20 &= -3670017;
                                            i21 = i31;
                                            k0Var2 = (a2.k0) pVar.k(f2526a);
                                        } else {
                                            k0Var2 = k0Var;
                                            i21 = i31;
                                        }
                                        i22 = 1;
                                        z9 = true;
                                        i23 = 1;
                                        i24 = i20;
                                        j15 = j14;
                                        j16 = j15;
                                    } else {
                                        pVar.L();
                                        if ((i12 & 65536) != 0) {
                                            i20 &= -3670017;
                                        }
                                        j15 = j10;
                                        i22 = i7;
                                        i21 = i8;
                                        i23 = i9;
                                        k0Var2 = k0Var;
                                        oVar3 = oVar2;
                                        j13 = j12;
                                        i24 = i20;
                                        j14 = j9;
                                        j16 = j11;
                                        z9 = z8;
                                    }
                                    pVar.q();
                                    s0.o oVar5 = oVar3;
                                    pVar.Q(-1827892941);
                                    if (j13 == 16) {
                                        i25 = i22;
                                        b9 = j13;
                                        z10 = false;
                                    } else {
                                        pVar.Q(-1827892168);
                                        b9 = k0Var2.b();
                                        if (b9 != 16) {
                                            i25 = i22;
                                        } else {
                                            i25 = i22;
                                            b9 = ((z0.u) pVar.k(y0.f2529a)).f10059a;
                                        }
                                        z10 = false;
                                        pVar.p(false);
                                    }
                                    pVar.p(z10);
                                    long j21 = j15;
                                    long j22 = j16;
                                    a2.k0 k0Var4 = k0Var2;
                                    int i32 = i25;
                                    String str3 = str2;
                                    boolean z12 = z9;
                                    int i33 = i21;
                                    int i34 = i23;
                                    w.g0.a(str3, oVar5, a2.k0.e(k0Var4, b9, j14, j21, jVar2, iVar2 == null ? iVar2.f5876a : Integer.MIN_VALUE, j22, 16609104), i32, z12, i33, i34, pVar, (i15 & 126) | 224256 | ((i24 << 9) & 3670016) | 12582912, 256);
                                    i26 = i32;
                                    j17 = j13;
                                    k0Var3 = k0Var4;
                                    j18 = j22;
                                    l2.i iVar4 = iVar2;
                                    z11 = z12;
                                    oVar4 = oVar5;
                                    i27 = i34;
                                    i28 = i33;
                                    iVar3 = iVar4;
                                    jVar3 = jVar2;
                                    j19 = j14;
                                    j20 = j21;
                                }
                                r8 = pVar.r();
                                if (r8 == null) {
                                    r8.f3853d = new w3(str, oVar4, j17, j19, j20, jVar3, iVar3, j18, i26, z11, i28, i27, k0Var3, i10, i11, i12);
                                    return;
                                }
                                return;
                            }
                        }
                        i20 = i30 | 221184 | (((i12 & 65536) == 0 || !pVar.f(k0Var)) ? 524288 : 1048576);
                        if ((i15 & 306783379) != 306783378) {
                        }
                        pVar.N();
                        if ((i10 & 1) != 0) {
                        }
                        if (i29 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        j14 = m2.m.f6327c;
                        if (i16 != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if (i19 == 0) {
                        }
                        if ((i12 & 65536) == 0) {
                        }
                        i22 = 1;
                        z9 = true;
                        i23 = 1;
                        i24 = i20;
                        j15 = j14;
                        j16 = j15;
                        pVar.q();
                        s0.o oVar52 = oVar3;
                        pVar.Q(-1827892941);
                        if (j13 == 16) {
                        }
                        pVar.p(z10);
                        long j212 = j15;
                        long j222 = j16;
                        a2.k0 k0Var42 = k0Var2;
                        int i322 = i25;
                        String str32 = str2;
                        boolean z122 = z9;
                        int i332 = i21;
                        int i342 = i23;
                        w.g0.a(str32, oVar52, a2.k0.e(k0Var42, b9, j14, j212, jVar2, iVar2 == null ? iVar2.f5876a : Integer.MIN_VALUE, j222, 16609104), i322, z122, i332, i342, pVar, (i15 & 126) | 224256 | ((i24 << 9) & 3670016) | 12582912, 256);
                        i26 = i322;
                        j17 = j13;
                        k0Var3 = k0Var42;
                        j18 = j222;
                        l2.i iVar42 = iVar2;
                        z11 = z122;
                        oVar4 = oVar52;
                        i27 = i342;
                        i28 = i332;
                        iVar3 = iVar42;
                        jVar3 = jVar2;
                        j19 = j14;
                        j20 = j212;
                        r8 = pVar.r();
                        if (r8 == null) {
                        }
                    }
                    iVar2 = iVar;
                    int i302 = i11 | 438;
                    i18 = i12 & 8192;
                    if (i18 != 0) {
                    }
                    i20 = i302 | 221184 | (((i12 & 65536) == 0 || !pVar.f(k0Var)) ? 524288 : 1048576);
                    if ((i15 & 306783379) != 306783378) {
                    }
                    pVar.N();
                    if ((i10 & 1) != 0) {
                    }
                    if (i29 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    j14 = m2.m.f6327c;
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i19 == 0) {
                    }
                    if ((i12 & 65536) == 0) {
                    }
                    i22 = 1;
                    z9 = true;
                    i23 = 1;
                    i24 = i20;
                    j15 = j14;
                    j16 = j15;
                    pVar.q();
                    s0.o oVar522 = oVar3;
                    pVar.Q(-1827892941);
                    if (j13 == 16) {
                    }
                    pVar.p(z10);
                    long j2122 = j15;
                    long j2222 = j16;
                    a2.k0 k0Var422 = k0Var2;
                    int i3222 = i25;
                    String str322 = str2;
                    boolean z1222 = z9;
                    int i3322 = i21;
                    int i3422 = i23;
                    w.g0.a(str322, oVar522, a2.k0.e(k0Var422, b9, j14, j2122, jVar2, iVar2 == null ? iVar2.f5876a : Integer.MIN_VALUE, j2222, 16609104), i3222, z1222, i3322, i3422, pVar, (i15 & 126) | 224256 | ((i24 << 9) & 3670016) | 12582912, 256);
                    i26 = i3222;
                    j17 = j13;
                    k0Var3 = k0Var422;
                    j18 = j2222;
                    l2.i iVar422 = iVar2;
                    z11 = z1222;
                    oVar4 = oVar522;
                    i27 = i3422;
                    i28 = i3322;
                    iVar3 = iVar422;
                    jVar3 = jVar2;
                    j19 = j14;
                    j20 = j2122;
                    r8 = pVar.r();
                    if (r8 == null) {
                    }
                }
                jVar2 = jVar;
                i17 = i12 & 512;
                if (i17 == 0) {
                }
                iVar2 = iVar;
                int i3022 = i11 | 438;
                i18 = i12 & 8192;
                if (i18 != 0) {
                }
                i20 = i3022 | 221184 | (((i12 & 65536) == 0 || !pVar.f(k0Var)) ? 524288 : 1048576);
                if ((i15 & 306783379) != 306783378) {
                }
                pVar.N();
                if ((i10 & 1) != 0) {
                }
                if (i29 == 0) {
                }
                if (i14 == 0) {
                }
                j14 = m2.m.f6327c;
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i19 == 0) {
                }
                if ((i12 & 65536) == 0) {
                }
                i22 = 1;
                z9 = true;
                i23 = 1;
                i24 = i20;
                j15 = j14;
                j16 = j15;
                pVar.q();
                s0.o oVar5222 = oVar3;
                pVar.Q(-1827892941);
                if (j13 == 16) {
                }
                pVar.p(z10);
                long j21222 = j15;
                long j22222 = j16;
                a2.k0 k0Var4222 = k0Var2;
                int i32222 = i25;
                String str3222 = str2;
                boolean z12222 = z9;
                int i33222 = i21;
                int i34222 = i23;
                w.g0.a(str3222, oVar5222, a2.k0.e(k0Var4222, b9, j14, j21222, jVar2, iVar2 == null ? iVar2.f5876a : Integer.MIN_VALUE, j22222, 16609104), i32222, z12222, i33222, i34222, pVar, (i15 & 126) | 224256 | ((i24 << 9) & 3670016) | 12582912, 256);
                i26 = i32222;
                j17 = j13;
                k0Var3 = k0Var4222;
                j18 = j22222;
                l2.i iVar4222 = iVar2;
                z11 = z12222;
                oVar4 = oVar5222;
                i27 = i34222;
                i28 = i33222;
                iVar3 = iVar4222;
                jVar3 = jVar2;
                j19 = j14;
                j20 = j21222;
                r8 = pVar.r();
                if (r8 == null) {
                }
            }
            j12 = j8;
            i15 = 14380032 | i13;
            i16 = i12 & 256;
            if (i16 != 0) {
            }
            jVar2 = jVar;
            i17 = i12 & 512;
            if (i17 == 0) {
            }
            iVar2 = iVar;
            int i30222 = i11 | 438;
            i18 = i12 & 8192;
            if (i18 != 0) {
            }
            i20 = i30222 | 221184 | (((i12 & 65536) == 0 || !pVar.f(k0Var)) ? 524288 : 1048576);
            if ((i15 & 306783379) != 306783378) {
            }
            pVar.N();
            if ((i10 & 1) != 0) {
            }
            if (i29 == 0) {
            }
            if (i14 == 0) {
            }
            j14 = m2.m.f6327c;
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i19 == 0) {
            }
            if ((i12 & 65536) == 0) {
            }
            i22 = 1;
            z9 = true;
            i23 = 1;
            i24 = i20;
            j15 = j14;
            j16 = j15;
            pVar.q();
            s0.o oVar52222 = oVar3;
            pVar.Q(-1827892941);
            if (j13 == 16) {
            }
            pVar.p(z10);
            long j212222 = j15;
            long j222222 = j16;
            a2.k0 k0Var42222 = k0Var2;
            int i322222 = i25;
            String str32222 = str2;
            boolean z122222 = z9;
            int i332222 = i21;
            int i342222 = i23;
            w.g0.a(str32222, oVar52222, a2.k0.e(k0Var42222, b9, j14, j212222, jVar2, iVar2 == null ? iVar2.f5876a : Integer.MIN_VALUE, j222222, 16609104), i322222, z122222, i332222, i342222, pVar, (i15 & 126) | 224256 | ((i24 << 9) & 3670016) | 12582912, 256);
            i26 = i322222;
            j17 = j13;
            k0Var3 = k0Var42222;
            j18 = j222222;
            l2.i iVar42222 = iVar2;
            z11 = z122222;
            oVar4 = oVar52222;
            i27 = i342222;
            i28 = i332222;
            iVar3 = iVar42222;
            jVar3 = jVar2;
            j19 = j14;
            j20 = j212222;
            r8 = pVar.r();
            if (r8 == null) {
            }
        }
        oVar2 = oVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        j12 = j8;
        i15 = 14380032 | i13;
        i16 = i12 & 256;
        if (i16 != 0) {
        }
        jVar2 = jVar;
        i17 = i12 & 512;
        if (i17 == 0) {
        }
        iVar2 = iVar;
        int i302222 = i11 | 438;
        i18 = i12 & 8192;
        if (i18 != 0) {
        }
        i20 = i302222 | 221184 | (((i12 & 65536) == 0 || !pVar.f(k0Var)) ? 524288 : 1048576);
        if ((i15 & 306783379) != 306783378) {
        }
        pVar.N();
        if ((i10 & 1) != 0) {
        }
        if (i29 == 0) {
        }
        if (i14 == 0) {
        }
        j14 = m2.m.f6327c;
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i19 == 0) {
        }
        if ((i12 & 65536) == 0) {
        }
        i22 = 1;
        z9 = true;
        i23 = 1;
        i24 = i20;
        j15 = j14;
        j16 = j15;
        pVar.q();
        s0.o oVar522222 = oVar3;
        pVar.Q(-1827892941);
        if (j13 == 16) {
        }
        pVar.p(z10);
        long j2122222 = j15;
        long j2222222 = j16;
        a2.k0 k0Var422222 = k0Var2;
        int i3222222 = i25;
        String str322222 = str2;
        boolean z1222222 = z9;
        int i3322222 = i21;
        int i3422222 = i23;
        w.g0.a(str322222, oVar522222, a2.k0.e(k0Var422222, b9, j14, j2122222, jVar2, iVar2 == null ? iVar2.f5876a : Integer.MIN_VALUE, j2222222, 16609104), i3222222, z1222222, i3322222, i3422222, pVar, (i15 & 126) | 224256 | ((i24 << 9) & 3670016) | 12582912, 256);
        i26 = i3222222;
        j17 = j13;
        k0Var3 = k0Var422222;
        j18 = j2222222;
        l2.i iVar422222 = iVar2;
        z11 = z1222222;
        oVar4 = oVar522222;
        i27 = i3422222;
        i28 = i3322222;
        iVar3 = iVar422222;
        jVar3 = jVar2;
        j19 = j14;
        j20 = j2122222;
        r8 = pVar.r();
        if (r8 == null) {
        }
    }
}
