package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class eh1 {
    public static final zl a = new zl(new dd(22));

    public static final void a(th1 th1Var, hk hkVar, hl hlVar, int i) {
        hlVar.Y(15327438);
        int i2 = (hlVar.f(th1Var) ? 4 : 2) | i | (hlVar.h(hkVar) ? 32 : 16);
        if (hlVar.O(i2 & 1, (i2 & 19) != 18)) {
            m01 m01Var = a;
            th1 th1Var2 = (th1) hlVar.j(m01Var);
            th1Var2.getClass();
            if (th1Var != null && !th1Var.equals(th1.d)) {
                th1Var2 = new th1(th1Var2.a.c(th1Var.a), th1Var2.b.a(th1Var.b));
            }
            op.a(m01Var.a(th1Var2), hkVar, hlVar, (i2 & 112) | 8);
        } else {
            hlVar.R();
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new il(i, 7, th1Var, hkVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v19, types: [int] */
    /* JADX WARN: Type inference failed for: r47v1, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, am0 am0Var, final long j, long j2, x20 x20Var, w10 w10Var, long j3, tg1 tg1Var, long j4, int i, boolean z, int i2, int i3, th1 th1Var, hl hlVar, final int i4, final int i5, final int i6) {
        String str2;
        int i7;
        am0 am0Var2;
        int i8;
        long j5;
        int i9;
        x20 x20Var2;
        int i10;
        w10 w10Var2;
        int i11;
        int i12;
        tg1 tg1Var2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        final long j6;
        final int i20;
        final int i21;
        final th1 th1Var2;
        final long j7;
        final w10 w10Var3;
        final am0 am0Var3;
        final tg1 tg1Var3;
        final long j8;
        final boolean z2;
        i11 r;
        long j9;
        int i22;
        th1 th1Var3;
        int i23;
        long b;
        int i24;
        int i25;
        boolean z3;
        hlVar.Y(1809465675);
        if ((i4 & 6) == 0) {
            str2 = str;
            i7 = (hlVar.f(str2) ? 4 : 2) | i4;
        } else {
            str2 = str;
            i7 = i4;
        }
        int i26 = i6 & 2;
        if (i26 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            am0Var2 = am0Var;
            i7 |= hlVar.f(am0Var2) ? 32 : 16;
            if ((i4 & 384) == 0) {
                i7 |= hlVar.e(j) ? 256 : 128;
            }
            int i27 = i7 | 3072;
            i8 = i6 & 16;
            if (i8 == 0) {
                i27 = i7 | 27648;
                j5 = j2;
            } else {
                j5 = j2;
                if ((i4 & 24576) == 0) {
                    i27 |= hlVar.e(j5) ? 16384 : 8192;
                }
            }
            int i28 = i27 | 196608;
            i9 = i6 & 64;
            if (i9 == 0) {
                i28 = i27 | 1769472;
            } else if ((1572864 & i4) == 0) {
                x20Var2 = x20Var;
                i28 |= hlVar.f(x20Var2) ? 1048576 : 524288;
                i10 = i6 & 128;
                int i29 = 4194304;
                if (i10 != 0) {
                    i28 |= 12582912;
                    w10Var2 = w10Var;
                } else {
                    w10Var2 = w10Var;
                    if ((i4 & 12582912) == 0) {
                        i28 |= hlVar.f(w10Var2) ? 8388608 : 4194304;
                    }
                }
                i11 = i28 | 905969664;
                i12 = i6 & 1024;
                if (i12 != 0) {
                    i13 = i5 | 6;
                    tg1Var2 = tg1Var;
                } else {
                    tg1Var2 = tg1Var;
                    i13 = i5 | (hlVar.f(tg1Var2) ? 4 : 2);
                }
                i14 = i6 & 2048;
                if (i14 != 0) {
                    i13 |= 48;
                } else if ((i5 & 48) == 0) {
                    i13 |= hlVar.e(j4) ? 32 : 16;
                }
                int i30 = i13;
                i15 = i6 & 4096;
                if (i15 != 0) {
                    i30 |= 384;
                } else if ((i5 & 384) == 0) {
                    i16 = i;
                    i30 |= hlVar.d(i16) ? 256 : 128;
                    int i31 = i30 | 3072;
                    i17 = i6 & 16384;
                    if (i17 == 0) {
                        i18 = i30 | 27648;
                    } else if ((i5 & 24576) == 0) {
                        i18 = i31 | (hlVar.d(i2) ? 16384 : 8192);
                    } else {
                        i18 = i31;
                    }
                    int i32 = i18 | 1769472;
                    if ((i6 & 131072) == 0 && hlVar.f(th1Var)) {
                        i29 = 8388608;
                    }
                    i19 = i32 | i29;
                    boolean z4 = true;
                    if (hlVar.O(i11 & 1, (i11 & 306783379) == 306783378 || (i19 & 4793491) != 4793490)) {
                        hlVar.R();
                        j6 = j3;
                        i20 = i2;
                        i21 = i3;
                        th1Var2 = th1Var;
                        j7 = j5;
                        w10Var3 = w10Var2;
                        am0Var3 = am0Var2;
                        tg1Var3 = tg1Var2;
                        j8 = j4;
                        z2 = z;
                    } else {
                        hlVar.T();
                        if ((i4 & 1) == 0 || hlVar.y()) {
                            if (i26 != 0) {
                                am0Var2 = xl0.a;
                            }
                            if (i8 != 0) {
                                j5 = wh1.c;
                            }
                            if (i9 != 0) {
                                x20Var2 = null;
                            }
                            if (i10 != 0) {
                                w10Var2 = null;
                            }
                            j6 = wh1.c;
                            if (i12 != 0) {
                                tg1Var2 = null;
                            }
                            j9 = i14 != 0 ? j6 : j4;
                            if (i15 != 0) {
                                i16 = 1;
                            }
                            i22 = i17 != 0 ? Integer.MAX_VALUE : i2;
                            if ((i6 & 131072) != 0) {
                                th1Var3 = (th1) hlVar.j(a);
                                i19 &= -29360129;
                            } else {
                                th1Var3 = th1Var;
                            }
                            i23 = 1;
                        } else {
                            hlVar.R();
                            if ((i6 & 131072) != 0) {
                                i19 &= -29360129;
                            }
                            j6 = j3;
                            j9 = j4;
                            z4 = z;
                            i22 = i2;
                            i23 = i3;
                            th1Var3 = th1Var;
                        }
                        hlVar.q();
                        hlVar.W(-565217106);
                        if (j != 16) {
                            b = j;
                            i24 = i22;
                            i25 = i23;
                            z3 = false;
                        } else {
                            hlVar.W(-565216333);
                            b = th1Var3.b();
                            if (b != 16) {
                                i24 = i22;
                                i25 = i23;
                            } else {
                                i24 = i22;
                                i25 = i23;
                                b = ((hi) hlVar.j(rm.a)).a;
                            }
                            z3 = false;
                            hlVar.p(false);
                        }
                        hlVar.p(z3);
                        int i33 = i19 << 6;
                        int i34 = i24;
                        int i35 = i25;
                        yr1.f(str2, am0Var2, th1.c(th1Var3, b, j5, x20Var2, w10Var2, j6, tg1Var2 != null ? tg1Var2.a : z3, j9, 16609104), i16, z4, i34, i35, hlVar, (i11 & 126) | 3072 | (i33 & 57344) | 196608 | (i33 & 3670016) | 12582912 | ((i11 << 18) & 1879048192));
                        i21 = i35;
                        i20 = i34;
                        j7 = j5;
                        w10Var3 = w10Var2;
                        th1Var2 = th1Var3;
                        am0Var3 = am0Var2;
                        tg1Var3 = tg1Var2;
                        z2 = z4;
                        j8 = j9;
                    }
                    final x20 x20Var3 = x20Var2;
                    final int i36 = i16;
                    r = hlVar.r();
                    if (r == null) {
                        r.d = new Function2() { // from class: dh1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object b(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int P = gb0.P(i4 | 1);
                                int P2 = gb0.P(i5);
                                eh1.b(str, am0Var3, j, j7, x20Var3, w10Var3, j6, tg1Var3, j8, i36, z2, i20, i21, th1Var2, (hl) obj, P, P2, i6);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i16 = i;
                int i312 = i30 | 3072;
                i17 = i6 & 16384;
                if (i17 == 0) {
                }
                int i322 = i18 | 1769472;
                if ((i6 & 131072) == 0) {
                    i29 = 8388608;
                }
                i19 = i322 | i29;
                boolean z42 = true;
                if (hlVar.O(i11 & 1, (i11 & 306783379) == 306783378 || (i19 & 4793491) != 4793490)) {
                }
                final x20 x20Var32 = x20Var2;
                final int i362 = i16;
                r = hlVar.r();
                if (r == null) {
                }
            }
            x20Var2 = x20Var;
            i10 = i6 & 128;
            int i292 = 4194304;
            if (i10 != 0) {
            }
            i11 = i28 | 905969664;
            i12 = i6 & 1024;
            if (i12 != 0) {
            }
            i14 = i6 & 2048;
            if (i14 != 0) {
            }
            int i302 = i13;
            i15 = i6 & 4096;
            if (i15 != 0) {
            }
            i16 = i;
            int i3122 = i302 | 3072;
            i17 = i6 & 16384;
            if (i17 == 0) {
            }
            int i3222 = i18 | 1769472;
            if ((i6 & 131072) == 0) {
            }
            i19 = i3222 | i292;
            boolean z422 = true;
            if (hlVar.O(i11 & 1, (i11 & 306783379) == 306783378 || (i19 & 4793491) != 4793490)) {
            }
            final x20 x20Var322 = x20Var2;
            final int i3622 = i16;
            r = hlVar.r();
            if (r == null) {
            }
        }
        am0Var2 = am0Var;
        if ((i4 & 384) == 0) {
        }
        int i272 = i7 | 3072;
        i8 = i6 & 16;
        if (i8 == 0) {
        }
        int i282 = i272 | 196608;
        i9 = i6 & 64;
        if (i9 == 0) {
        }
        x20Var2 = x20Var;
        i10 = i6 & 128;
        int i2922 = 4194304;
        if (i10 != 0) {
        }
        i11 = i282 | 905969664;
        i12 = i6 & 1024;
        if (i12 != 0) {
        }
        i14 = i6 & 2048;
        if (i14 != 0) {
        }
        int i3022 = i13;
        i15 = i6 & 4096;
        if (i15 != 0) {
        }
        i16 = i;
        int i31222 = i3022 | 3072;
        i17 = i6 & 16384;
        if (i17 == 0) {
        }
        int i32222 = i18 | 1769472;
        if ((i6 & 131072) == 0) {
        }
        i19 = i32222 | i2922;
        boolean z4222 = true;
        if (hlVar.O(i11 & 1, (i11 & 306783379) == 306783378 || (i19 & 4793491) != 4793490)) {
        }
        final x20 x20Var3222 = x20Var2;
        final int i36222 = i16;
        r = hlVar.r();
        if (r == null) {
        }
    }
}
