package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class k3 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2133a = 16;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(s0.o oVar, o0.a aVar, q6.e eVar, q6.e eVar2, q6.e eVar3, int i7, long j8, long j9, q.s0 s0Var, o0.a aVar2, g0.p pVar, int i8, int i9) {
        q6.e eVar4;
        q6.e eVar5;
        q6.e eVar6;
        q6.e eVar7;
        long j10;
        long b9;
        int i10;
        q.s0 b10;
        s0.o oVar2;
        boolean f9;
        Object G;
        boolean f10;
        Object G2;
        long j11;
        long j12;
        s0.o oVar3;
        q.s0 s0Var2;
        q6.e eVar8;
        q6.e eVar9;
        q6.e eVar10;
        int i11;
        g0.p1 r8;
        pVar.S(-1219521777);
        int i12 = i8 | 3462;
        int i13 = i9 & 16;
        if (i13 != 0) {
            i12 = i8 | 28038;
        } else if ((i8 & 24576) == 0) {
            eVar4 = eVar3;
            i12 |= pVar.h(eVar4) ? 16384 : 8192;
            if (((i12 | 38469632) & 306783379) == 306783378 || !pVar.x()) {
                pVar.N();
                if ((i8 & 1) != 0 || pVar.w()) {
                    eVar5 = x0.f2516a;
                    eVar6 = x0.f2517b;
                    eVar7 = i13 == 0 ? x0.f2518c : eVar4;
                    j10 = ((q0) pVar.k(s0.f2378a)).f2313n;
                    b9 = s0.b(j10, pVar);
                    i10 = 2;
                    b10 = e0.a.b(pVar);
                    oVar2 = s0.l.f8103a;
                } else {
                    pVar.L();
                    oVar2 = oVar;
                    eVar5 = eVar;
                    eVar6 = eVar2;
                    i10 = i7;
                    j10 = j8;
                    b9 = j9;
                    b10 = s0Var;
                    eVar7 = eVar4;
                }
                pVar.q();
                f9 = pVar.f(b10);
                G = pVar.G();
                Object obj = g0.l.f3784a;
                if (!f9 || G == obj) {
                    G = new e0.g(b10);
                    pVar.a0(G);
                }
                e0.g gVar = (e0.g) G;
                f10 = pVar.f(gVar) | pVar.f(b10);
                G2 = pVar.G();
                if (!f10 || G2 == obj) {
                    G2 = new a0.y(gVar, 4, b10);
                    pVar.a0(G2);
                }
                q1.h hVar = q.w0.f7372a;
                q6.e eVar11 = eVar5;
                q6.e eVar12 = eVar7;
                q6.e eVar13 = eVar6;
                int i14 = i10;
                long j13 = j10;
                long j14 = b9;
                s3.a(s0.a.a(oVar2, new a0.e1(3, (q6.c) G2)), null, j13, j14, 0.0f, 0.0f, o0.f.b(-1979205334, new g3(i14, aVar, aVar2, eVar13, eVar12, gVar, eVar11), pVar), pVar, 12582912, 114);
                j11 = j13;
                j12 = j14;
                oVar3 = oVar2;
                s0Var2 = b10;
                eVar8 = eVar11;
                eVar9 = eVar13;
                eVar10 = eVar12;
                i11 = i14;
            } else {
                pVar.L();
                oVar3 = oVar;
                eVar8 = eVar;
                eVar9 = eVar2;
                i11 = i7;
                j11 = j8;
                j12 = j9;
                s0Var2 = s0Var;
                eVar10 = eVar4;
            }
            r8 = pVar.r();
            if (r8 == null) {
                r8.f3853d = new h3(oVar3, aVar, eVar8, eVar9, eVar10, i11, j11, j12, s0Var2, aVar2, i8, i9);
                return;
            }
            return;
        }
        eVar4 = eVar3;
        if (((i12 | 38469632) & 306783379) == 306783378) {
        }
        pVar.N();
        if ((i8 & 1) != 0) {
        }
        eVar5 = x0.f2516a;
        eVar6 = x0.f2517b;
        if (i13 == 0) {
        }
        j10 = ((q0) pVar.k(s0.f2378a)).f2313n;
        b9 = s0.b(j10, pVar);
        i10 = 2;
        b10 = e0.a.b(pVar);
        oVar2 = s0.l.f8103a;
        pVar.q();
        f9 = pVar.f(b10);
        G = pVar.G();
        Object obj2 = g0.l.f3784a;
        if (!f9) {
        }
        G = new e0.g(b10);
        pVar.a0(G);
        e0.g gVar2 = (e0.g) G;
        f10 = pVar.f(gVar2) | pVar.f(b10);
        G2 = pVar.G();
        if (!f10) {
        }
        G2 = new a0.y(gVar2, 4, b10);
        pVar.a0(G2);
        q1.h hVar2 = q.w0.f7372a;
        q6.e eVar112 = eVar5;
        q6.e eVar122 = eVar7;
        q6.e eVar132 = eVar6;
        int i142 = i10;
        long j132 = j10;
        long j142 = b9;
        s3.a(s0.a.a(oVar2, new a0.e1(3, (q6.c) G2)), null, j132, j142, 0.0f, 0.0f, o0.f.b(-1979205334, new g3(i142, aVar, aVar2, eVar132, eVar122, gVar2, eVar112), pVar), pVar, 12582912, 114);
        j11 = j132;
        j12 = j142;
        oVar3 = oVar2;
        s0Var2 = b10;
        eVar8 = eVar112;
        eVar9 = eVar132;
        eVar10 = eVar122;
        i11 = i142;
        r8 = pVar.r();
        if (r8 == null) {
        }
    }

    public static final void b(int i7, o0.a aVar, o0.a aVar2, q6.e eVar, q6.e eVar2, q.s0 s0Var, q6.e eVar3, g0.p pVar, int i8) {
        int i9;
        o0.a aVar3;
        q.s0 s0Var2;
        q6.e eVar4;
        pVar.S(-975511942);
        if ((i8 & 6) == 0) {
            i9 = (pVar.d(i7) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= pVar.h(aVar) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            aVar3 = aVar2;
            i9 |= pVar.h(aVar3) ? 256 : 128;
        } else {
            aVar3 = aVar2;
        }
        if ((i8 & 3072) == 0) {
            i9 |= pVar.h(eVar) ? 2048 : 1024;
        }
        if ((i8 & 24576) == 0) {
            i9 |= pVar.h(eVar2) ? 16384 : 8192;
        }
        if ((196608 & i8) == 0) {
            s0Var2 = s0Var;
            i9 |= pVar.f(s0Var2) ? 131072 : 65536;
        } else {
            s0Var2 = s0Var;
        }
        if ((1572864 & i8) == 0) {
            eVar4 = eVar3;
            i9 |= pVar.h(eVar4) ? 1048576 : 524288;
        } else {
            eVar4 = eVar3;
        }
        if ((i9 & 599187) == 599186 && pVar.x()) {
            pVar.L();
        } else {
            boolean z8 = ((i9 & 112) == 32) | ((i9 & 7168) == 2048) | ((458752 & i9) == 131072) | ((57344 & i9) == 16384) | ((i9 & 14) == 4) | ((3670016 & i9) == 1048576) | ((i9 & 896) == 256);
            Object G = pVar.G();
            if (z8 || G == g0.l.f3784a) {
                g3 g3Var = new g3(aVar, eVar, eVar2, i7, s0Var2, eVar4, aVar3);
                pVar.a0(g3Var);
                G = g3Var;
            }
            p1.s0.c(null, (q6.e) G, pVar, 0);
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new j3(i7, aVar, aVar2, eVar, eVar2, s0Var, eVar3, i8);
        }
    }
}
