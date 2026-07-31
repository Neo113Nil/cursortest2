package F;

import I.C0105l;
import I.C0113p;
import I.C0119s0;
import l.C0558c;

/* loaded from: classes.dex */
public abstract class H0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f969a = 16;

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(U.l lVar, Y1.e eVar, Y1.e eVar2, Y1.e eVar3, Y1.e eVar4, int i3, long j3, long j4, r.U u3, Q.a aVar, C0113p c0113p, int i4, int i5) {
        Y1.e eVar5;
        int i6;
        Y1.e eVar6;
        int i7;
        r.U b2;
        int i8;
        U.l lVar2;
        Y1.e eVar7;
        Y1.e eVar8;
        Y1.e eVar9;
        Y1.e eVar10;
        long j5;
        long j6;
        boolean f3;
        Object G3;
        boolean f4;
        Object G4;
        Y1.e eVar11;
        Y1.e eVar12;
        Y1.e eVar13;
        Y1.e eVar14;
        int i9;
        long j7;
        long j8;
        U.l lVar3;
        r.U u4;
        C0119s0 r3;
        int i10 = 1;
        c0113p.S(-1219521777);
        int i11 = i4 | 6;
        int i12 = i5 & 2;
        if (i12 != 0) {
            i11 = i4 | 54;
        } else if ((i4 & 48) == 0) {
            eVar5 = eVar;
            i11 |= c0113p.h(eVar5) ? 32 : 16;
            i6 = i5 & 4;
            if (i6 == 0) {
                i11 |= 384;
            } else if ((i4 & 384) == 0) {
                eVar6 = eVar2;
                i11 |= c0113p.h(eVar6) ? 256 : 128;
                i7 = 224256 | i11;
                if ((1572864 & i4) == 0) {
                    i7 = 748544 | i11;
                }
                if ((12582912 & i4) == 0) {
                    i7 |= 4194304;
                }
                if ((100663296 & i4) == 0) {
                    i7 |= 33554432;
                }
                if ((805306368 & i4) == 0) {
                    i7 |= c0113p.h(aVar) ? 536870912 : 268435456;
                }
                if ((306783379 & i7) == 306783378 || !c0113p.x()) {
                    c0113p.N();
                    if ((i4 & 1) != 0 || c0113p.w()) {
                        U.i iVar = U.i.f3302a;
                        Y1.e eVar15 = i12 != 0 ? O.f1070a : eVar5;
                        Y1.e eVar16 = i6 != 0 ? O.f1071b : eVar6;
                        Q.a aVar2 = O.f1072c;
                        Q.a aVar3 = O.f1073d;
                        long j9 = ((J) c0113p.k(L.f1045a)).f1005n;
                        long b3 = L.b(j9, c0113p);
                        b2 = G.a.b(c0113p);
                        i8 = 2;
                        lVar2 = iVar;
                        eVar7 = eVar15;
                        eVar8 = eVar16;
                        eVar9 = aVar2;
                        eVar10 = aVar3;
                        j5 = j9;
                        j6 = b3;
                    } else {
                        c0113p.L();
                        lVar2 = lVar;
                        eVar9 = eVar3;
                        eVar10 = eVar4;
                        i8 = i3;
                        j5 = j3;
                        j6 = j4;
                        b2 = u3;
                        eVar7 = eVar5;
                        eVar8 = eVar6;
                    }
                    c0113p.q();
                    f3 = c0113p.f(b2);
                    G3 = c0113p.G();
                    Object obj = C0105l.f2272a;
                    if (!f3 || G3 == obj) {
                        G3 = new G.f(b2);
                        c0113p.a0(G3);
                    }
                    G.f fVar = (G.f) G3;
                    f4 = c0113p.f(fVar) | c0113p.f(b2);
                    G4 = c0113p.G();
                    if (!f4 || G4 == obj) {
                        G4 = new D0(fVar, 0, b2);
                        c0113p.a0(G4);
                    }
                    s0.h hVar = r.X.f7049a;
                    U0.a(lVar2.e(new U.g(new C0558c(i10, (Y1.c) G4))), null, j5, j6, 0.0f, 0.0f, null, Q.f.b(-1979205334, new C0077z(i8, eVar7, aVar, eVar9, eVar10, fVar, eVar8), c0113p), c0113p, 12582912, 114);
                    eVar11 = eVar7;
                    eVar12 = eVar8;
                    eVar13 = eVar9;
                    eVar14 = eVar10;
                    i9 = i8;
                    j7 = j5;
                    j8 = j6;
                    lVar3 = lVar2;
                    u4 = b2;
                } else {
                    c0113p.L();
                    lVar3 = lVar;
                    eVar14 = eVar4;
                    j7 = j3;
                    j8 = j4;
                    u4 = u3;
                    eVar11 = eVar5;
                    eVar12 = eVar6;
                    eVar13 = eVar3;
                    i9 = i3;
                }
                r3 = c0113p.r();
                if (r3 != null) {
                    r3.f2347d = new E0(lVar3, eVar11, eVar12, eVar13, eVar14, i9, j7, j8, u4, aVar, i4, i5);
                    return;
                }
                return;
            }
            eVar6 = eVar2;
            i7 = 224256 | i11;
            if ((1572864 & i4) == 0) {
            }
            if ((12582912 & i4) == 0) {
            }
            if ((100663296 & i4) == 0) {
            }
            if ((805306368 & i4) == 0) {
            }
            if ((306783379 & i7) == 306783378) {
            }
            c0113p.N();
            if ((i4 & 1) != 0) {
            }
            U.i iVar2 = U.i.f3302a;
            if (i12 != 0) {
            }
            if (i6 != 0) {
            }
            Q.a aVar22 = O.f1072c;
            Q.a aVar32 = O.f1073d;
            long j92 = ((J) c0113p.k(L.f1045a)).f1005n;
            long b32 = L.b(j92, c0113p);
            b2 = G.a.b(c0113p);
            i8 = 2;
            lVar2 = iVar2;
            eVar7 = eVar15;
            eVar8 = eVar16;
            eVar9 = aVar22;
            eVar10 = aVar32;
            j5 = j92;
            j6 = b32;
            c0113p.q();
            f3 = c0113p.f(b2);
            G3 = c0113p.G();
            Object obj2 = C0105l.f2272a;
            if (!f3) {
            }
            G3 = new G.f(b2);
            c0113p.a0(G3);
            G.f fVar2 = (G.f) G3;
            f4 = c0113p.f(fVar2) | c0113p.f(b2);
            G4 = c0113p.G();
            if (!f4) {
            }
            G4 = new D0(fVar2, 0, b2);
            c0113p.a0(G4);
            s0.h hVar2 = r.X.f7049a;
            U0.a(lVar2.e(new U.g(new C0558c(i10, (Y1.c) G4))), null, j5, j6, 0.0f, 0.0f, null, Q.f.b(-1979205334, new C0077z(i8, eVar7, aVar, eVar9, eVar10, fVar2, eVar8), c0113p), c0113p, 12582912, 114);
            eVar11 = eVar7;
            eVar12 = eVar8;
            eVar13 = eVar9;
            eVar14 = eVar10;
            i9 = i8;
            j7 = j5;
            j8 = j6;
            lVar3 = lVar2;
            u4 = b2;
            r3 = c0113p.r();
            if (r3 != null) {
            }
        }
        eVar5 = eVar;
        i6 = i5 & 4;
        if (i6 == 0) {
        }
        eVar6 = eVar2;
        i7 = 224256 | i11;
        if ((1572864 & i4) == 0) {
        }
        if ((12582912 & i4) == 0) {
        }
        if ((100663296 & i4) == 0) {
        }
        if ((805306368 & i4) == 0) {
        }
        if ((306783379 & i7) == 306783378) {
        }
        c0113p.N();
        if ((i4 & 1) != 0) {
        }
        U.i iVar22 = U.i.f3302a;
        if (i12 != 0) {
        }
        if (i6 != 0) {
        }
        Q.a aVar222 = O.f1072c;
        Q.a aVar322 = O.f1073d;
        long j922 = ((J) c0113p.k(L.f1045a)).f1005n;
        long b322 = L.b(j922, c0113p);
        b2 = G.a.b(c0113p);
        i8 = 2;
        lVar2 = iVar22;
        eVar7 = eVar15;
        eVar8 = eVar16;
        eVar9 = aVar222;
        eVar10 = aVar322;
        j5 = j922;
        j6 = b322;
        c0113p.q();
        f3 = c0113p.f(b2);
        G3 = c0113p.G();
        Object obj22 = C0105l.f2272a;
        if (!f3) {
        }
        G3 = new G.f(b2);
        c0113p.a0(G3);
        G.f fVar22 = (G.f) G3;
        f4 = c0113p.f(fVar22) | c0113p.f(b2);
        G4 = c0113p.G();
        if (!f4) {
        }
        G4 = new D0(fVar22, 0, b2);
        c0113p.a0(G4);
        s0.h hVar22 = r.X.f7049a;
        U0.a(lVar2.e(new U.g(new C0558c(i10, (Y1.c) G4))), null, j5, j6, 0.0f, 0.0f, null, Q.f.b(-1979205334, new C0077z(i8, eVar7, aVar, eVar9, eVar10, fVar22, eVar8), c0113p), c0113p, 12582912, 114);
        eVar11 = eVar7;
        eVar12 = eVar8;
        eVar13 = eVar9;
        eVar14 = eVar10;
        i9 = i8;
        j7 = j5;
        j8 = j6;
        lVar3 = lVar2;
        u4 = b2;
        r3 = c0113p.r();
        if (r3 != null) {
        }
    }

    public static final void b(int i3, Y1.e eVar, Q.a aVar, Y1.e eVar2, Y1.e eVar3, r.U u3, Y1.e eVar4, C0113p c0113p, int i4) {
        int i5;
        c0113p.S(-975511942);
        if ((i4 & 6) == 0) {
            i5 = (c0113p.d(i3) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0113p.h(eVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0113p.h(aVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0113p.h(eVar2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= c0113p.h(eVar3) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= c0113p.f(u3) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= c0113p.h(eVar4) ? 1048576 : 524288;
        }
        if ((i5 & 599187) == 599186 && c0113p.x()) {
            c0113p.L();
        } else {
            boolean z3 = ((i5 & 112) == 32) | ((i5 & 7168) == 2048) | ((458752 & i5) == 131072) | ((57344 & i5) == 16384) | ((i5 & 14) == 4) | ((3670016 & i5) == 1048576) | ((i5 & 896) == 256);
            Object G3 = c0113p.G();
            if (z3 || G3 == C0105l.f2272a) {
                G3 = new C0077z(eVar, eVar2, eVar3, i3, u3, eVar4, aVar, 3);
                c0113p.a0(G3);
            }
            r0.M.b(null, (Y1.e) G3, c0113p, 0);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new G0(i3, eVar, aVar, eVar2, eVar3, u3, eVar4, i4);
        }
    }
}
