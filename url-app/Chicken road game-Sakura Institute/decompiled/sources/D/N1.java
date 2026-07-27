package D;

import G.C0192d;
import G.C0216p;
import G.C0222s0;
import G.C0235z;
import Z.C0323u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class N1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0235z f1524a = new C0235z(G.W.f2779l, L.f1472r);

    public static final void a(A0.L l4, Function2 function2, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-460300127);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(l4) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(function2) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            C0235z c0235z = f1524a;
            C0192d.a(c0235z.a(((A0.L) c0216p.k(c0235z)).d(l4)), function2, c0216p, (i4 & 112) | 8);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new x1(i2, 1, l4, function2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, S.o oVar, long j4, long j5, F0.i iVar, F0.k kVar, F0.r rVar, long j6, L0.j jVar, L0.i iVar2, long j7, int i2, boolean z4, int i4, int i5, Function1 function1, A0.L l4, C0216p c0216p, int i6, int i7, int i8) {
        int i9;
        int i10;
        int i11;
        long j8;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j9;
        int i19;
        int i20;
        S.o oVar2;
        long j10;
        long j11;
        L0.j jVar2;
        F0.i iVar3;
        F0.k kVar2;
        F0.r rVar2;
        long j12;
        L0.i iVar4;
        int i21;
        int i22;
        A0.L l5;
        int i23;
        Function1 function12;
        boolean z5;
        int i24;
        long b4;
        boolean z6;
        S.o oVar3;
        S.o oVar4;
        long j13;
        F0.k kVar3;
        F0.r rVar3;
        A0.L l6;
        L0.i iVar5;
        L0.j jVar3;
        Function1 function13;
        int i25;
        long j14;
        boolean z7;
        int i26;
        long j15;
        long j16;
        C0222s0 s4;
        c0216p.U(-2055108902);
        if ((i6 & 6) == 0) {
            i9 = (c0216p.f(str) ? 4 : 2) | i6;
        } else {
            i9 = i6;
        }
        int i27 = i8 & 2;
        if (i27 != 0) {
            i9 |= 48;
        } else if ((i6 & 48) == 0) {
            i9 |= c0216p.f(oVar) ? 32 : 16;
            i10 = i8 & 4;
            if (i10 == 0) {
                i9 |= 384;
            } else if ((i6 & 384) == 0) {
                i9 |= c0216p.e(j4) ? 256 : 128;
                i11 = i8 & 8;
                if (i11 != 0) {
                    i9 |= 3072;
                } else if ((i6 & 3072) == 0) {
                    j8 = j5;
                    i9 |= c0216p.e(j8) ? 2048 : 1024;
                    i12 = i8 & 16;
                    if (i12 == 0) {
                        i9 |= 24576;
                    } else if ((i6 & 24576) == 0) {
                        i9 |= c0216p.f(iVar) ? 16384 : 8192;
                        i13 = i8 & 32;
                        if (i13 != 0) {
                            i9 |= 196608;
                        } else if ((i6 & 196608) == 0) {
                            i9 |= c0216p.f(kVar) ? 131072 : 65536;
                        }
                        i14 = i8 & 64;
                        if (i14 != 0) {
                            i9 |= 1572864;
                        } else if ((i6 & 1572864) == 0) {
                            i9 |= c0216p.f(rVar) ? 1048576 : 524288;
                        }
                        i15 = i8 & 128;
                        if (i15 != 0) {
                            i9 |= 12582912;
                        } else if ((i6 & 12582912) == 0) {
                            i9 |= c0216p.e(j6) ? 8388608 : 4194304;
                        }
                        i16 = i9 | 100663296;
                        i17 = i8 & 512;
                        if (i17 != 0) {
                            i16 = i9 | 905969664;
                        } else if ((805306368 & i6) == 0) {
                            i16 |= c0216p.f(iVar2) ? 536870912 : 268435456;
                            i18 = i8 & 1024;
                            if (i18 == 0) {
                                i19 = i7 | 6;
                                j9 = j7;
                            } else {
                                j9 = j7;
                                if ((i7 & 6) == 0) {
                                    i19 = i7 | (c0216p.e(j9) ? 4 : 2);
                                } else {
                                    i19 = i7;
                                }
                            }
                            i20 = i19 | 224688;
                            if ((i7 & 1572864) == 0) {
                                i20 = i19 | 748976;
                            }
                            if ((i16 & 306783379) != 306783378 && (i20 & 599187) == 599186 && c0216p.z()) {
                                c0216p.N();
                                oVar4 = oVar;
                                j14 = j4;
                                iVar3 = iVar;
                                iVar5 = iVar2;
                                i26 = i2;
                                z7 = z4;
                                i22 = i4;
                                i25 = i5;
                                function13 = function1;
                                l6 = l4;
                                j13 = j9;
                                j15 = j8;
                                kVar3 = kVar;
                                rVar3 = rVar;
                                j16 = j6;
                                jVar3 = jVar;
                            } else {
                                c0216p.P();
                                if ((i6 & 1) != 0 || c0216p.y()) {
                                    oVar2 = i27 == 0 ? S.l.f3977a : oVar;
                                    j10 = i10 == 0 ? C0323u.f4547g : j4;
                                    j11 = i11 == 0 ? M0.m.f3560c : j8;
                                    jVar2 = null;
                                    iVar3 = i12 == 0 ? null : iVar;
                                    kVar2 = i13 == 0 ? null : kVar;
                                    rVar2 = i14 == 0 ? null : rVar;
                                    j12 = i15 == 0 ? M0.m.f3560c : j6;
                                    iVar4 = i17 == 0 ? null : iVar2;
                                    if (i18 != 0) {
                                        j9 = M0.m.f3560c;
                                    }
                                    int i28 = i20 & (-3670017);
                                    i21 = 1;
                                    i22 = Integer.MAX_VALUE;
                                    l5 = (A0.L) c0216p.k(f1524a);
                                    i23 = i28;
                                    function12 = null;
                                    z5 = true;
                                    i24 = 1;
                                } else {
                                    c0216p.N();
                                    int i29 = i20 & (-3670017);
                                    oVar2 = oVar;
                                    j10 = j4;
                                    iVar3 = iVar;
                                    rVar2 = rVar;
                                    j12 = j6;
                                    jVar2 = jVar;
                                    i21 = i2;
                                    z5 = z4;
                                    i22 = i4;
                                    i24 = i5;
                                    function12 = function1;
                                    l5 = l4;
                                    i23 = i29;
                                    j11 = j8;
                                    kVar2 = kVar;
                                    iVar4 = iVar2;
                                }
                                c0216p.r();
                                c0216p.S(-1827892941);
                                if (j10 == 16) {
                                    z6 = z5;
                                    oVar3 = oVar2;
                                    b4 = j10;
                                } else {
                                    c0216p.S(-1827892168);
                                    b4 = l5.b();
                                    if (b4 != 16) {
                                        z6 = z5;
                                        oVar3 = oVar2;
                                    } else {
                                        z6 = z5;
                                        oVar3 = oVar2;
                                        b4 = ((C0323u) c0216p.k(S.f1616a)).f4549a;
                                    }
                                    c0216p.q(false);
                                }
                                c0216p.q(false);
                                int i30 = i23 << 9;
                                w.M.a(str, oVar3, A0.L.e(l5, b4, j11, kVar2, iVar3, rVar2, j12, jVar2, iVar4 == null ? iVar4.f3509a : Integer.MIN_VALUE, j9, 16609104), function12, i21, z6, i22, i24, null, c0216p, (i16 & 126) | ((i23 >> 6) & 7168) | (57344 & i30) | (458752 & i30) | (3670016 & i30) | (i30 & 29360128), 256);
                                oVar4 = oVar3;
                                j13 = j9;
                                kVar3 = kVar2;
                                rVar3 = rVar2;
                                l6 = l5;
                                iVar5 = iVar4;
                                jVar3 = jVar2;
                                function13 = function12;
                                i25 = i24;
                                j14 = j10;
                                long j17 = j12;
                                z7 = z6;
                                i26 = i21;
                                j15 = j11;
                                j16 = j17;
                            }
                            s4 = c0216p.s();
                            if (s4 == null) {
                                s4.f2903d = new M1(str, oVar4, j14, j15, iVar3, kVar3, rVar3, j16, jVar3, iVar5, j13, i26, z7, i22, i25, function13, l6, i6, i7, i8);
                                return;
                            }
                            return;
                        }
                        i18 = i8 & 1024;
                        if (i18 == 0) {
                        }
                        i20 = i19 | 224688;
                        if ((i7 & 1572864) == 0) {
                        }
                        if ((i16 & 306783379) != 306783378) {
                        }
                        c0216p.P();
                        if ((i6 & 1) != 0) {
                        }
                        if (i27 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        jVar2 = null;
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 != 0) {
                        }
                        int i282 = i20 & (-3670017);
                        i21 = 1;
                        i22 = Integer.MAX_VALUE;
                        l5 = (A0.L) c0216p.k(f1524a);
                        i23 = i282;
                        function12 = null;
                        z5 = true;
                        i24 = 1;
                        c0216p.r();
                        c0216p.S(-1827892941);
                        if (j10 == 16) {
                        }
                        c0216p.q(false);
                        int i302 = i23 << 9;
                        w.M.a(str, oVar3, A0.L.e(l5, b4, j11, kVar2, iVar3, rVar2, j12, jVar2, iVar4 == null ? iVar4.f3509a : Integer.MIN_VALUE, j9, 16609104), function12, i21, z6, i22, i24, null, c0216p, (i16 & 126) | ((i23 >> 6) & 7168) | (57344 & i302) | (458752 & i302) | (3670016 & i302) | (i302 & 29360128), 256);
                        oVar4 = oVar3;
                        j13 = j9;
                        kVar3 = kVar2;
                        rVar3 = rVar2;
                        l6 = l5;
                        iVar5 = iVar4;
                        jVar3 = jVar2;
                        function13 = function12;
                        i25 = i24;
                        j14 = j10;
                        long j172 = j12;
                        z7 = z6;
                        i26 = i21;
                        j15 = j11;
                        j16 = j172;
                        s4 = c0216p.s();
                        if (s4 == null) {
                        }
                    }
                    i13 = i8 & 32;
                    if (i13 != 0) {
                    }
                    i14 = i8 & 64;
                    if (i14 != 0) {
                    }
                    i15 = i8 & 128;
                    if (i15 != 0) {
                    }
                    i16 = i9 | 100663296;
                    i17 = i8 & 512;
                    if (i17 != 0) {
                    }
                    i18 = i8 & 1024;
                    if (i18 == 0) {
                    }
                    i20 = i19 | 224688;
                    if ((i7 & 1572864) == 0) {
                    }
                    if ((i16 & 306783379) != 306783378) {
                    }
                    c0216p.P();
                    if ((i6 & 1) != 0) {
                    }
                    if (i27 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    jVar2 = null;
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 != 0) {
                    }
                    int i2822 = i20 & (-3670017);
                    i21 = 1;
                    i22 = Integer.MAX_VALUE;
                    l5 = (A0.L) c0216p.k(f1524a);
                    i23 = i2822;
                    function12 = null;
                    z5 = true;
                    i24 = 1;
                    c0216p.r();
                    c0216p.S(-1827892941);
                    if (j10 == 16) {
                    }
                    c0216p.q(false);
                    int i3022 = i23 << 9;
                    w.M.a(str, oVar3, A0.L.e(l5, b4, j11, kVar2, iVar3, rVar2, j12, jVar2, iVar4 == null ? iVar4.f3509a : Integer.MIN_VALUE, j9, 16609104), function12, i21, z6, i22, i24, null, c0216p, (i16 & 126) | ((i23 >> 6) & 7168) | (57344 & i3022) | (458752 & i3022) | (3670016 & i3022) | (i3022 & 29360128), 256);
                    oVar4 = oVar3;
                    j13 = j9;
                    kVar3 = kVar2;
                    rVar3 = rVar2;
                    l6 = l5;
                    iVar5 = iVar4;
                    jVar3 = jVar2;
                    function13 = function12;
                    i25 = i24;
                    j14 = j10;
                    long j1722 = j12;
                    z7 = z6;
                    i26 = i21;
                    j15 = j11;
                    j16 = j1722;
                    s4 = c0216p.s();
                    if (s4 == null) {
                    }
                }
                j8 = j5;
                i12 = i8 & 16;
                if (i12 == 0) {
                }
                i13 = i8 & 32;
                if (i13 != 0) {
                }
                i14 = i8 & 64;
                if (i14 != 0) {
                }
                i15 = i8 & 128;
                if (i15 != 0) {
                }
                i16 = i9 | 100663296;
                i17 = i8 & 512;
                if (i17 != 0) {
                }
                i18 = i8 & 1024;
                if (i18 == 0) {
                }
                i20 = i19 | 224688;
                if ((i7 & 1572864) == 0) {
                }
                if ((i16 & 306783379) != 306783378) {
                }
                c0216p.P();
                if ((i6 & 1) != 0) {
                }
                if (i27 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                jVar2 = null;
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 != 0) {
                }
                int i28222 = i20 & (-3670017);
                i21 = 1;
                i22 = Integer.MAX_VALUE;
                l5 = (A0.L) c0216p.k(f1524a);
                i23 = i28222;
                function12 = null;
                z5 = true;
                i24 = 1;
                c0216p.r();
                c0216p.S(-1827892941);
                if (j10 == 16) {
                }
                c0216p.q(false);
                int i30222 = i23 << 9;
                w.M.a(str, oVar3, A0.L.e(l5, b4, j11, kVar2, iVar3, rVar2, j12, jVar2, iVar4 == null ? iVar4.f3509a : Integer.MIN_VALUE, j9, 16609104), function12, i21, z6, i22, i24, null, c0216p, (i16 & 126) | ((i23 >> 6) & 7168) | (57344 & i30222) | (458752 & i30222) | (3670016 & i30222) | (i30222 & 29360128), 256);
                oVar4 = oVar3;
                j13 = j9;
                kVar3 = kVar2;
                rVar3 = rVar2;
                l6 = l5;
                iVar5 = iVar4;
                jVar3 = jVar2;
                function13 = function12;
                i25 = i24;
                j14 = j10;
                long j17222 = j12;
                z7 = z6;
                i26 = i21;
                j15 = j11;
                j16 = j17222;
                s4 = c0216p.s();
                if (s4 == null) {
                }
            }
            i11 = i8 & 8;
            if (i11 != 0) {
            }
            j8 = j5;
            i12 = i8 & 16;
            if (i12 == 0) {
            }
            i13 = i8 & 32;
            if (i13 != 0) {
            }
            i14 = i8 & 64;
            if (i14 != 0) {
            }
            i15 = i8 & 128;
            if (i15 != 0) {
            }
            i16 = i9 | 100663296;
            i17 = i8 & 512;
            if (i17 != 0) {
            }
            i18 = i8 & 1024;
            if (i18 == 0) {
            }
            i20 = i19 | 224688;
            if ((i7 & 1572864) == 0) {
            }
            if ((i16 & 306783379) != 306783378) {
            }
            c0216p.P();
            if ((i6 & 1) != 0) {
            }
            if (i27 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            jVar2 = null;
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 != 0) {
            }
            int i282222 = i20 & (-3670017);
            i21 = 1;
            i22 = Integer.MAX_VALUE;
            l5 = (A0.L) c0216p.k(f1524a);
            i23 = i282222;
            function12 = null;
            z5 = true;
            i24 = 1;
            c0216p.r();
            c0216p.S(-1827892941);
            if (j10 == 16) {
            }
            c0216p.q(false);
            int i302222 = i23 << 9;
            w.M.a(str, oVar3, A0.L.e(l5, b4, j11, kVar2, iVar3, rVar2, j12, jVar2, iVar4 == null ? iVar4.f3509a : Integer.MIN_VALUE, j9, 16609104), function12, i21, z6, i22, i24, null, c0216p, (i16 & 126) | ((i23 >> 6) & 7168) | (57344 & i302222) | (458752 & i302222) | (3670016 & i302222) | (i302222 & 29360128), 256);
            oVar4 = oVar3;
            j13 = j9;
            kVar3 = kVar2;
            rVar3 = rVar2;
            l6 = l5;
            iVar5 = iVar4;
            jVar3 = jVar2;
            function13 = function12;
            i25 = i24;
            j14 = j10;
            long j172222 = j12;
            z7 = z6;
            i26 = i21;
            j15 = j11;
            j16 = j172222;
            s4 = c0216p.s();
            if (s4 == null) {
            }
        }
        i10 = i8 & 4;
        if (i10 == 0) {
        }
        i11 = i8 & 8;
        if (i11 != 0) {
        }
        j8 = j5;
        i12 = i8 & 16;
        if (i12 == 0) {
        }
        i13 = i8 & 32;
        if (i13 != 0) {
        }
        i14 = i8 & 64;
        if (i14 != 0) {
        }
        i15 = i8 & 128;
        if (i15 != 0) {
        }
        i16 = i9 | 100663296;
        i17 = i8 & 512;
        if (i17 != 0) {
        }
        i18 = i8 & 1024;
        if (i18 == 0) {
        }
        i20 = i19 | 224688;
        if ((i7 & 1572864) == 0) {
        }
        if ((i16 & 306783379) != 306783378) {
        }
        c0216p.P();
        if ((i6 & 1) != 0) {
        }
        if (i27 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        jVar2 = null;
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 != 0) {
        }
        int i2822222 = i20 & (-3670017);
        i21 = 1;
        i22 = Integer.MAX_VALUE;
        l5 = (A0.L) c0216p.k(f1524a);
        i23 = i2822222;
        function12 = null;
        z5 = true;
        i24 = 1;
        c0216p.r();
        c0216p.S(-1827892941);
        if (j10 == 16) {
        }
        c0216p.q(false);
        int i3022222 = i23 << 9;
        w.M.a(str, oVar3, A0.L.e(l5, b4, j11, kVar2, iVar3, rVar2, j12, jVar2, iVar4 == null ? iVar4.f3509a : Integer.MIN_VALUE, j9, 16609104), function12, i21, z6, i22, i24, null, c0216p, (i16 & 126) | ((i23 >> 6) & 7168) | (57344 & i3022222) | (458752 & i3022222) | (3670016 & i3022222) | (i3022222 & 29360128), 256);
        oVar4 = oVar3;
        j13 = j9;
        kVar3 = kVar2;
        rVar3 = rVar2;
        l6 = l5;
        iVar5 = iVar4;
        jVar3 = jVar2;
        function13 = function12;
        i25 = i24;
        j14 = j10;
        long j1722222 = j12;
        z7 = z6;
        i26 = i21;
        j15 = j11;
        j16 = j1722222;
        s4 = c0216p.s();
        if (s4 == null) {
        }
    }
}
