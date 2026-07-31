package F;

import I.C0143d;
import I.C0167p;
import I.C0173s0;
import I.C0186z;
import b0.C0352v;
import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public abstract class x1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0186z f1884a = new C0186z(I.W.f2783i, N.f1283p);

    public static final void a(C0.K k3, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(-460300127);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(k3) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(aVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0167p.x()) {
            c0167p.L();
        } else {
            C0186z c0186z = f1884a;
            C0143d.a(c0186z.a(((C0.K) c0167p.k(c0186z)).d(k3)), aVar, c0167p, (i4 & 112) | 8);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new v1(i3, 0, k3, aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, U.q qVar, long j3, long j4, H0.i iVar, H0.k kVar, H0.q qVar2, long j5, N0.j jVar, N0.i iVar2, long j6, int i3, boolean z3, int i4, int i5, InterfaceC0424c interfaceC0424c, C0.K k3, C0167p c0167p, int i6, int i7, int i8) {
        int i9;
        U.q qVar3;
        int i10;
        long j7;
        int i11;
        H0.k kVar2;
        int i12;
        C0.K k4;
        U.q qVar4;
        long j8;
        long j9;
        H0.i iVar3;
        int i13;
        boolean z4;
        int i14;
        int i15;
        C0.K k5;
        H0.q qVar5;
        N0.j jVar2;
        N0.i iVar4;
        InterfaceC0424c interfaceC0424c2;
        int i16;
        long j10;
        long j11;
        long b3;
        boolean z5;
        H0.k kVar3;
        U.q qVar6;
        long j12;
        H0.i iVar5;
        N0.i iVar6;
        long j13;
        C0173s0 r3;
        int i17;
        c0167p.S(-2055108902);
        if ((i6 & 6) == 0) {
            i9 = (c0167p.f(str) ? 4 : 2) | i6;
        } else {
            i9 = i6;
        }
        int i18 = i8 & 2;
        if (i18 != 0) {
            i9 |= 48;
        } else if ((i6 & 48) == 0) {
            qVar3 = qVar;
            i9 |= c0167p.f(qVar3) ? 32 : 16;
            i10 = i8 & 4;
            if (i10 == 0) {
                i9 |= 384;
            } else if ((i6 & 384) == 0) {
                j7 = j3;
                i9 |= c0167p.e(j7) ? 256 : 128;
                int i19 = i9 | 27648;
                i11 = i8 & 32;
                if (i11 != 0) {
                    i19 = 224256 | i9;
                } else if ((196608 & i6) == 0) {
                    kVar2 = kVar;
                    i19 |= c0167p.f(kVar2) ? 131072 : 65536;
                    i12 = i19 | 920125440;
                    int i20 = i7 | 224694;
                    if ((i7 & 1572864) != 0) {
                        if ((i8 & 65536) == 0) {
                            k4 = k3;
                            if (c0167p.f(k4)) {
                                i17 = 1048576;
                                i20 |= i17;
                            }
                        } else {
                            k4 = k3;
                        }
                        i17 = 524288;
                        i20 |= i17;
                    } else {
                        k4 = k3;
                    }
                    if ((306783379 & i12) != 306783378 && (599187 & i20) == 599186 && c0167p.x()) {
                        c0167p.L();
                        qVar5 = qVar2;
                        j10 = j5;
                        iVar6 = iVar2;
                        j11 = j6;
                        i13 = i3;
                        z4 = z3;
                        i16 = i4;
                        i14 = i5;
                        interfaceC0424c2 = interfaceC0424c;
                        kVar3 = kVar2;
                        qVar6 = qVar3;
                        j13 = j7;
                        k5 = k4;
                        j12 = j4;
                        iVar5 = iVar;
                        jVar2 = jVar;
                    } else {
                        c0167p.N();
                        if ((i6 & 1) != 0 || c0167p.w()) {
                            qVar4 = i18 == 0 ? U.n.f4488a : qVar3;
                            j8 = i10 == 0 ? C0352v.f5439g : j7;
                            j9 = O0.m.f3746c;
                            iVar3 = null;
                            if (i11 != 0) {
                                kVar2 = null;
                            }
                            if ((i8 & 65536) == 0) {
                                k5 = (C0.K) c0167p.k(f1884a);
                                i13 = 1;
                                z4 = true;
                                i14 = 1;
                                i15 = i20 & (-3670017);
                            } else {
                                i13 = 1;
                                z4 = true;
                                i14 = 1;
                                i15 = i20;
                                k5 = k4;
                            }
                            qVar5 = null;
                            jVar2 = null;
                            iVar4 = null;
                            interfaceC0424c2 = null;
                            i16 = Integer.MAX_VALUE;
                            j10 = j9;
                            j11 = j10;
                        } else {
                            c0167p.L();
                            if ((i8 & 65536) != 0) {
                                i20 &= -3670017;
                            }
                            iVar3 = iVar;
                            qVar5 = qVar2;
                            iVar4 = iVar2;
                            j11 = j6;
                            i13 = i3;
                            z4 = z3;
                            i16 = i4;
                            i14 = i5;
                            interfaceC0424c2 = interfaceC0424c;
                            qVar4 = qVar3;
                            j8 = j7;
                            i15 = i20;
                            k5 = k4;
                            j9 = j4;
                            j10 = j5;
                            jVar2 = jVar;
                        }
                        c0167p.q();
                        c0167p.Q(-1827892941);
                        long j14 = j8;
                        if (j8 == 16) {
                            b3 = j14;
                            z5 = false;
                        } else {
                            c0167p.Q(-1827892168);
                            b3 = k5.b();
                            if (b3 == 16) {
                                b3 = ((C0352v) c0167p.k(V.f1382a)).f5441a;
                            }
                            z5 = false;
                            c0167p.p(false);
                        }
                        c0167p.p(z5);
                        int i21 = i15 << 9;
                        x.N.a(str, qVar4, C0.K.e(k5, b3, j9, kVar2, iVar3, qVar5, j10, jVar2, iVar4 == null ? iVar4.f3547a : Integer.MIN_VALUE, j11, 16609104), interfaceC0424c2, i13, z4, i16, i14, null, c0167p, (i12 & 126) | ((i15 >> 6) & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | (i21 & 29360128), 256);
                        kVar3 = kVar2;
                        qVar6 = qVar4;
                        j12 = j9;
                        iVar5 = iVar3;
                        iVar6 = iVar4;
                        j13 = j14;
                    }
                    r3 = c0167p.r();
                    if (r3 == null) {
                        r3.f2906d = new w1(str, qVar6, j13, j12, iVar5, kVar3, qVar5, j10, jVar2, iVar6, j11, i13, z4, i16, i14, interfaceC0424c2, k5, i6, i7, i8);
                        return;
                    }
                    return;
                }
                kVar2 = kVar;
                i12 = i19 | 920125440;
                int i202 = i7 | 224694;
                if ((i7 & 1572864) != 0) {
                }
                if ((306783379 & i12) != 306783378) {
                }
                c0167p.N();
                if ((i6 & 1) != 0) {
                }
                if (i18 == 0) {
                }
                if (i10 == 0) {
                }
                j9 = O0.m.f3746c;
                iVar3 = null;
                if (i11 != 0) {
                }
                if ((i8 & 65536) == 0) {
                }
                qVar5 = null;
                jVar2 = null;
                iVar4 = null;
                interfaceC0424c2 = null;
                i16 = Integer.MAX_VALUE;
                j10 = j9;
                j11 = j10;
                c0167p.q();
                c0167p.Q(-1827892941);
                long j142 = j8;
                if (j8 == 16) {
                }
                c0167p.p(z5);
                int i212 = i15 << 9;
                x.N.a(str, qVar4, C0.K.e(k5, b3, j9, kVar2, iVar3, qVar5, j10, jVar2, iVar4 == null ? iVar4.f3547a : Integer.MIN_VALUE, j11, 16609104), interfaceC0424c2, i13, z4, i16, i14, null, c0167p, (i12 & 126) | ((i15 >> 6) & 7168) | (57344 & i212) | (458752 & i212) | (3670016 & i212) | (i212 & 29360128), 256);
                kVar3 = kVar2;
                qVar6 = qVar4;
                j12 = j9;
                iVar5 = iVar3;
                iVar6 = iVar4;
                j13 = j142;
                r3 = c0167p.r();
                if (r3 == null) {
                }
            }
            j7 = j3;
            int i192 = i9 | 27648;
            i11 = i8 & 32;
            if (i11 != 0) {
            }
            kVar2 = kVar;
            i12 = i192 | 920125440;
            int i2022 = i7 | 224694;
            if ((i7 & 1572864) != 0) {
            }
            if ((306783379 & i12) != 306783378) {
            }
            c0167p.N();
            if ((i6 & 1) != 0) {
            }
            if (i18 == 0) {
            }
            if (i10 == 0) {
            }
            j9 = O0.m.f3746c;
            iVar3 = null;
            if (i11 != 0) {
            }
            if ((i8 & 65536) == 0) {
            }
            qVar5 = null;
            jVar2 = null;
            iVar4 = null;
            interfaceC0424c2 = null;
            i16 = Integer.MAX_VALUE;
            j10 = j9;
            j11 = j10;
            c0167p.q();
            c0167p.Q(-1827892941);
            long j1422 = j8;
            if (j8 == 16) {
            }
            c0167p.p(z5);
            int i2122 = i15 << 9;
            x.N.a(str, qVar4, C0.K.e(k5, b3, j9, kVar2, iVar3, qVar5, j10, jVar2, iVar4 == null ? iVar4.f3547a : Integer.MIN_VALUE, j11, 16609104), interfaceC0424c2, i13, z4, i16, i14, null, c0167p, (i12 & 126) | ((i15 >> 6) & 7168) | (57344 & i2122) | (458752 & i2122) | (3670016 & i2122) | (i2122 & 29360128), 256);
            kVar3 = kVar2;
            qVar6 = qVar4;
            j12 = j9;
            iVar5 = iVar3;
            iVar6 = iVar4;
            j13 = j1422;
            r3 = c0167p.r();
            if (r3 == null) {
            }
        }
        qVar3 = qVar;
        i10 = i8 & 4;
        if (i10 == 0) {
        }
        j7 = j3;
        int i1922 = i9 | 27648;
        i11 = i8 & 32;
        if (i11 != 0) {
        }
        kVar2 = kVar;
        i12 = i1922 | 920125440;
        int i20222 = i7 | 224694;
        if ((i7 & 1572864) != 0) {
        }
        if ((306783379 & i12) != 306783378) {
        }
        c0167p.N();
        if ((i6 & 1) != 0) {
        }
        if (i18 == 0) {
        }
        if (i10 == 0) {
        }
        j9 = O0.m.f3746c;
        iVar3 = null;
        if (i11 != 0) {
        }
        if ((i8 & 65536) == 0) {
        }
        qVar5 = null;
        jVar2 = null;
        iVar4 = null;
        interfaceC0424c2 = null;
        i16 = Integer.MAX_VALUE;
        j10 = j9;
        j11 = j10;
        c0167p.q();
        c0167p.Q(-1827892941);
        long j14222 = j8;
        if (j8 == 16) {
        }
        c0167p.p(z5);
        int i21222 = i15 << 9;
        x.N.a(str, qVar4, C0.K.e(k5, b3, j9, kVar2, iVar3, qVar5, j10, jVar2, iVar4 == null ? iVar4.f3547a : Integer.MIN_VALUE, j11, 16609104), interfaceC0424c2, i13, z4, i16, i14, null, c0167p, (i12 & 126) | ((i15 >> 6) & 7168) | (57344 & i21222) | (458752 & i21222) | (3670016 & i21222) | (i21222 & 29360128), 256);
        kVar3 = kVar2;
        qVar6 = qVar4;
        j12 = j9;
        iVar5 = iVar3;
        iVar6 = iVar4;
        j13 = j14222;
        r3 = c0167p.r();
        if (r3 == null) {
        }
    }
}
