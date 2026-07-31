package F;

import I.C0089d;
import I.C0113p;
import I.C0119s0;
import I.C0132z;
import b0.C0288u;
import e2.AbstractC0381e;

/* loaded from: classes.dex */
public abstract class X0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0132z f1161a = new C0132z(I.X.f2228i, K.p);

    public static final void a(B0.C c3, Q.a aVar, C0113p c0113p, int i3) {
        int i4;
        c0113p.S(-460300127);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.f(c3) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.h(aVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0113p.x()) {
            c0113p.L();
        } else {
            C0132z c0132z = f1161a;
            C0089d.a(c0132z.a(((B0.C) c0113p.k(c0132z)).c(c3)), aVar, c0113p, (i4 & 112) | 8);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new V0(i3, 0, c3, aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, U.l lVar, long j3, long j4, F0.j jVar, F0.l lVar2, F0.r rVar, long j5, L0.g gVar, L0.f fVar, long j6, int i3, boolean z3, int i4, int i5, Y1.c cVar, B0.C c3, C0113p c0113p, int i6, int i7, int i8) {
        int i9;
        U.l lVar3;
        int i10;
        long j7;
        int i11;
        int i12;
        int i13;
        L0.f fVar2;
        int i14;
        B0.C c4;
        U.l lVar4;
        long j8;
        long j9;
        F0.j jVar2;
        F0.l lVar5;
        F0.r rVar2;
        Y1.c cVar2;
        B0.C c5;
        int i15;
        int i16;
        boolean z4;
        int i17;
        int i18;
        long j10;
        long j11;
        L0.f fVar3;
        L0.g gVar2;
        long b2;
        boolean z5;
        long j12;
        U.l lVar6;
        F0.r rVar3;
        L0.g gVar3;
        F0.l lVar7;
        L0.f fVar4;
        long j13;
        C0119s0 r3;
        c0113p.S(-2055108902);
        if ((i6 & 6) == 0) {
            i9 = (c0113p.f(str) ? 4 : 2) | i6;
        } else {
            i9 = i6;
        }
        int i19 = i8 & 2;
        if (i19 != 0) {
            i9 |= 48;
        } else if ((i6 & 48) == 0) {
            lVar3 = lVar;
            i9 |= c0113p.f(lVar3) ? 32 : 16;
            i10 = i8 & 4;
            if (i10 == 0) {
                i9 |= 384;
            } else if ((i6 & 384) == 0) {
                j7 = j3;
                i9 |= c0113p.e(j7) ? 256 : 128;
                int i20 = i9 | 27648;
                i11 = i8 & 32;
                if (i11 != 0) {
                    i20 = 224256 | i9;
                } else if ((196608 & i6) == 0) {
                    i20 |= c0113p.f(lVar2) ? 131072 : 65536;
                    i12 = 114819072 | i20;
                    i13 = i8 & 512;
                    if (i13 == 0) {
                        i12 = 920125440 | i20;
                    } else if ((805306368 & i6) == 0) {
                        fVar2 = fVar;
                        i12 |= c0113p.f(fVar2) ? 536870912 : 268435456;
                        i14 = i7 | 224694;
                        if ((i7 & 1572864) == 0) {
                            c4 = c3;
                            i14 |= ((i8 & 65536) == 0 && c0113p.f(c4)) ? 1048576 : 524288;
                        } else {
                            c4 = c3;
                        }
                        if ((i12 & 306783379) != 306783378 && (599187 & i14) == 599186 && c0113p.x()) {
                            c0113p.L();
                            rVar3 = rVar;
                            gVar3 = gVar;
                            j11 = j6;
                            i16 = i3;
                            z4 = z3;
                            i18 = i4;
                            i17 = i5;
                            cVar2 = cVar;
                            lVar6 = lVar3;
                            j12 = j7;
                            fVar4 = fVar2;
                            c5 = c4;
                            j9 = j4;
                            jVar2 = jVar;
                            lVar7 = lVar2;
                            j13 = j5;
                        } else {
                            c0113p.N();
                            if ((i6 & 1) != 0 || c0113p.w()) {
                                lVar4 = i19 != 0 ? U.i.f3302a : lVar3;
                                j8 = i10 != 0 ? C0288u.f4296f : j7;
                                j9 = M0.l.f2780c;
                                jVar2 = null;
                                lVar5 = i11 != 0 ? null : lVar2;
                                if (i13 != 0) {
                                    fVar2 = null;
                                }
                                if ((65536 & i8) != 0) {
                                    c4 = (B0.C) c0113p.k(f1161a);
                                    i14 &= -3670017;
                                }
                                rVar2 = null;
                                cVar2 = null;
                                c5 = c4;
                                i15 = i14;
                                i16 = 1;
                                z4 = true;
                                i17 = 1;
                                i18 = Integer.MAX_VALUE;
                                j10 = j9;
                                j11 = j10;
                                fVar3 = fVar2;
                                gVar2 = null;
                            } else {
                                c0113p.L();
                                if ((65536 & i8) != 0) {
                                    i14 &= -3670017;
                                }
                                lVar5 = lVar2;
                                rVar2 = rVar;
                                j11 = j6;
                                i16 = i3;
                                z4 = z3;
                                i18 = i4;
                                i17 = i5;
                                cVar2 = cVar;
                                lVar4 = lVar3;
                                j8 = j7;
                                c5 = c4;
                                i15 = i14;
                                j9 = j4;
                                jVar2 = jVar;
                                j10 = j5;
                                fVar3 = fVar2;
                                gVar2 = gVar;
                            }
                            c0113p.q();
                            c0113p.Q(-1827892941);
                            long j14 = j8;
                            if (j8 != 16) {
                                b2 = j14;
                                z5 = false;
                            } else {
                                c0113p.Q(-1827892168);
                                b2 = c5.b();
                                if (b2 == 16) {
                                    b2 = ((C0288u) c0113p.k(P.f1079a)).f4298a;
                                }
                                z5 = false;
                                c0113p.p(false);
                            }
                            c0113p.p(z5);
                            int i21 = (i12 & 126) | ((i15 >> 6) & 7168);
                            int i22 = i15 << 9;
                            AbstractC0381e.a(str, lVar4, B0.C.d(c5, b2, j9, lVar5, jVar2, rVar2, j10, gVar2, fVar3 != null ? fVar3.f2681a : Integer.MIN_VALUE, j11, 16609104), cVar2, i16, z4, i18, i17, null, c0113p, i21 | (57344 & i22) | (458752 & i22) | (3670016 & i22) | (i22 & 29360128));
                            j12 = j14;
                            F0.r rVar4 = rVar2;
                            lVar6 = lVar4;
                            F0.l lVar8 = lVar5;
                            rVar3 = rVar4;
                            long j15 = j10;
                            gVar3 = gVar2;
                            lVar7 = lVar8;
                            fVar4 = fVar3;
                            j13 = j15;
                        }
                        r3 = c0113p.r();
                        if (r3 != null) {
                            r3.f2347d = new W0(str, lVar6, j12, j9, jVar2, lVar7, rVar3, j13, gVar3, fVar4, j11, i16, z4, i18, i17, cVar2, c5, i6, i7, i8);
                            return;
                        }
                        return;
                    }
                    fVar2 = fVar;
                    i14 = i7 | 224694;
                    if ((i7 & 1572864) == 0) {
                    }
                    if ((i12 & 306783379) != 306783378) {
                    }
                    c0113p.N();
                    if ((i6 & 1) != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    j9 = M0.l.f2780c;
                    jVar2 = null;
                    if (i11 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if ((65536 & i8) != 0) {
                    }
                    rVar2 = null;
                    cVar2 = null;
                    c5 = c4;
                    i15 = i14;
                    i16 = 1;
                    z4 = true;
                    i17 = 1;
                    i18 = Integer.MAX_VALUE;
                    j10 = j9;
                    j11 = j10;
                    fVar3 = fVar2;
                    gVar2 = null;
                    c0113p.q();
                    c0113p.Q(-1827892941);
                    long j142 = j8;
                    if (j8 != 16) {
                    }
                    c0113p.p(z5);
                    int i212 = (i12 & 126) | ((i15 >> 6) & 7168);
                    int i222 = i15 << 9;
                    AbstractC0381e.a(str, lVar4, B0.C.d(c5, b2, j9, lVar5, jVar2, rVar2, j10, gVar2, fVar3 != null ? fVar3.f2681a : Integer.MIN_VALUE, j11, 16609104), cVar2, i16, z4, i18, i17, null, c0113p, i212 | (57344 & i222) | (458752 & i222) | (3670016 & i222) | (i222 & 29360128));
                    j12 = j142;
                    F0.r rVar42 = rVar2;
                    lVar6 = lVar4;
                    F0.l lVar82 = lVar5;
                    rVar3 = rVar42;
                    long j152 = j10;
                    gVar3 = gVar2;
                    lVar7 = lVar82;
                    fVar4 = fVar3;
                    j13 = j152;
                    r3 = c0113p.r();
                    if (r3 != null) {
                    }
                }
                i12 = 114819072 | i20;
                i13 = i8 & 512;
                if (i13 == 0) {
                }
                fVar2 = fVar;
                i14 = i7 | 224694;
                if ((i7 & 1572864) == 0) {
                }
                if ((i12 & 306783379) != 306783378) {
                }
                c0113p.N();
                if ((i6 & 1) != 0) {
                }
                if (i19 != 0) {
                }
                if (i10 != 0) {
                }
                j9 = M0.l.f2780c;
                jVar2 = null;
                if (i11 != 0) {
                }
                if (i13 != 0) {
                }
                if ((65536 & i8) != 0) {
                }
                rVar2 = null;
                cVar2 = null;
                c5 = c4;
                i15 = i14;
                i16 = 1;
                z4 = true;
                i17 = 1;
                i18 = Integer.MAX_VALUE;
                j10 = j9;
                j11 = j10;
                fVar3 = fVar2;
                gVar2 = null;
                c0113p.q();
                c0113p.Q(-1827892941);
                long j1422 = j8;
                if (j8 != 16) {
                }
                c0113p.p(z5);
                int i2122 = (i12 & 126) | ((i15 >> 6) & 7168);
                int i2222 = i15 << 9;
                AbstractC0381e.a(str, lVar4, B0.C.d(c5, b2, j9, lVar5, jVar2, rVar2, j10, gVar2, fVar3 != null ? fVar3.f2681a : Integer.MIN_VALUE, j11, 16609104), cVar2, i16, z4, i18, i17, null, c0113p, i2122 | (57344 & i2222) | (458752 & i2222) | (3670016 & i2222) | (i2222 & 29360128));
                j12 = j1422;
                F0.r rVar422 = rVar2;
                lVar6 = lVar4;
                F0.l lVar822 = lVar5;
                rVar3 = rVar422;
                long j1522 = j10;
                gVar3 = gVar2;
                lVar7 = lVar822;
                fVar4 = fVar3;
                j13 = j1522;
                r3 = c0113p.r();
                if (r3 != null) {
                }
            }
            j7 = j3;
            int i202 = i9 | 27648;
            i11 = i8 & 32;
            if (i11 != 0) {
            }
            i12 = 114819072 | i202;
            i13 = i8 & 512;
            if (i13 == 0) {
            }
            fVar2 = fVar;
            i14 = i7 | 224694;
            if ((i7 & 1572864) == 0) {
            }
            if ((i12 & 306783379) != 306783378) {
            }
            c0113p.N();
            if ((i6 & 1) != 0) {
            }
            if (i19 != 0) {
            }
            if (i10 != 0) {
            }
            j9 = M0.l.f2780c;
            jVar2 = null;
            if (i11 != 0) {
            }
            if (i13 != 0) {
            }
            if ((65536 & i8) != 0) {
            }
            rVar2 = null;
            cVar2 = null;
            c5 = c4;
            i15 = i14;
            i16 = 1;
            z4 = true;
            i17 = 1;
            i18 = Integer.MAX_VALUE;
            j10 = j9;
            j11 = j10;
            fVar3 = fVar2;
            gVar2 = null;
            c0113p.q();
            c0113p.Q(-1827892941);
            long j14222 = j8;
            if (j8 != 16) {
            }
            c0113p.p(z5);
            int i21222 = (i12 & 126) | ((i15 >> 6) & 7168);
            int i22222 = i15 << 9;
            AbstractC0381e.a(str, lVar4, B0.C.d(c5, b2, j9, lVar5, jVar2, rVar2, j10, gVar2, fVar3 != null ? fVar3.f2681a : Integer.MIN_VALUE, j11, 16609104), cVar2, i16, z4, i18, i17, null, c0113p, i21222 | (57344 & i22222) | (458752 & i22222) | (3670016 & i22222) | (i22222 & 29360128));
            j12 = j14222;
            F0.r rVar4222 = rVar2;
            lVar6 = lVar4;
            F0.l lVar8222 = lVar5;
            rVar3 = rVar4222;
            long j15222 = j10;
            gVar3 = gVar2;
            lVar7 = lVar8222;
            fVar4 = fVar3;
            j13 = j15222;
            r3 = c0113p.r();
            if (r3 != null) {
            }
        }
        lVar3 = lVar;
        i10 = i8 & 4;
        if (i10 == 0) {
        }
        j7 = j3;
        int i2022 = i9 | 27648;
        i11 = i8 & 32;
        if (i11 != 0) {
        }
        i12 = 114819072 | i2022;
        i13 = i8 & 512;
        if (i13 == 0) {
        }
        fVar2 = fVar;
        i14 = i7 | 224694;
        if ((i7 & 1572864) == 0) {
        }
        if ((i12 & 306783379) != 306783378) {
        }
        c0113p.N();
        if ((i6 & 1) != 0) {
        }
        if (i19 != 0) {
        }
        if (i10 != 0) {
        }
        j9 = M0.l.f2780c;
        jVar2 = null;
        if (i11 != 0) {
        }
        if (i13 != 0) {
        }
        if ((65536 & i8) != 0) {
        }
        rVar2 = null;
        cVar2 = null;
        c5 = c4;
        i15 = i14;
        i16 = 1;
        z4 = true;
        i17 = 1;
        i18 = Integer.MAX_VALUE;
        j10 = j9;
        j11 = j10;
        fVar3 = fVar2;
        gVar2 = null;
        c0113p.q();
        c0113p.Q(-1827892941);
        long j142222 = j8;
        if (j8 != 16) {
        }
        c0113p.p(z5);
        int i212222 = (i12 & 126) | ((i15 >> 6) & 7168);
        int i222222 = i15 << 9;
        AbstractC0381e.a(str, lVar4, B0.C.d(c5, b2, j9, lVar5, jVar2, rVar2, j10, gVar2, fVar3 != null ? fVar3.f2681a : Integer.MIN_VALUE, j11, 16609104), cVar2, i16, z4, i18, i17, null, c0113p, i212222 | (57344 & i222222) | (458752 & i222222) | (3670016 & i222222) | (i222222 & 29360128));
        j12 = j142222;
        F0.r rVar42222 = rVar2;
        lVar6 = lVar4;
        F0.l lVar82222 = lVar5;
        rVar3 = rVar42222;
        long j152222 = j10;
        gVar3 = gVar2;
        lVar7 = lVar82222;
        fVar4 = fVar3;
        j13 = j152222;
        r3 = c0113p.r();
        if (r3 != null) {
        }
    }
}
