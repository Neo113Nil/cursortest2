package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2155a = 280;

    /* renamed from: b, reason: collision with root package name */
    public static final float f2156b = 560;

    /* renamed from: c, reason: collision with root package name */
    public static final float f2157c = 8;

    /* renamed from: d, reason: collision with root package name */
    public static final float f2158d = 12;

    /* renamed from: e, reason: collision with root package name */
    public static final q.h0 f2159e;

    /* renamed from: f, reason: collision with root package name */
    public static final q.h0 f2160f;

    /* renamed from: g, reason: collision with root package name */
    public static final q.h0 f2161g;

    static {
        float f9 = 24;
        f2159e = new q.h0(f9, f9, f9, f9);
        float f10 = 16;
        androidx.compose.foundation.layout.b.b(f10);
        f2160f = androidx.compose.foundation.layout.b.b(f10);
        f2161g = androidx.compose.foundation.layout.b.b(f9);
    }

    public static final void a(o0.a aVar, s0.o oVar, q6.e eVar, q6.e eVar2, z0.p0 p0Var, long j8, float f9, long j9, long j10, long j11, long j12, g0.p pVar, int i7) {
        s0.o oVar2;
        pVar.S(1522575799);
        int i8 = i7 | 48 | (pVar.h(null) ? 256 : 128) | (pVar.h(eVar) ? 2048 : 1024) | (pVar.h(eVar2) ? 16384 : 8192) | (pVar.f(p0Var) ? 131072 : 65536) | (pVar.e(j8) ? 1048576 : 524288) | (pVar.c(f9) ? 8388608 : 4194304) | (pVar.e(j9) ? 67108864 : 33554432) | (pVar.e(j10) ? 536870912 : 268435456);
        int i9 = (pVar.e(j11) ? (char) 4 : (char) 2) | (pVar.e(j12) ? ' ' : (char) 16);
        if ((i8 & 306783379) == 306783378 && (i9 & 19) == 18 && pVar.x()) {
            pVar.L();
            oVar2 = oVar;
        } else {
            o0.a b9 = o0.f.b(-2126308228, new c(eVar, eVar2, j10, j11, j12, j9, aVar), pVar);
            int i10 = i8 >> 12;
            int i11 = (i10 & 896) | (i10 & 112) | 12582918 | ((i8 >> 9) & 57344);
            s0.l lVar = s0.l.f8103a;
            s3.a(lVar, p0Var, j8, 0L, f9, 0.0f, b9, pVar, i11, 104);
            oVar2 = lVar;
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new d(aVar, oVar2, eVar, eVar2, p0Var, j8, f9, j9, j10, j11, j12, i7);
        }
    }

    public static final void b(o0.a aVar, g0.p pVar, int i7) {
        pVar.S(586821353);
        if ((i7 & 147) == 146 && pVar.x()) {
            pVar.L();
        } else {
            Object G = pVar.G();
            if (G == g0.l.f3784a) {
                G = new f();
                pVar.a0(G);
            }
            p1.f0 f0Var = (p1.f0) G;
            int i8 = pVar.P;
            g0.k1 m8 = pVar.m();
            s0.o c4 = s0.a.c(pVar, s0.l.f8103a);
            r1.j.f7810d.getClass();
            r1.n nVar = r1.i.f7781b;
            pVar.U();
            if (pVar.O) {
                pVar.l(nVar);
            } else {
                pVar.d0();
            }
            g0.d.Q(pVar, f0Var, r1.i.f7784e);
            g0.d.Q(pVar, m8, r1.i.f7783d);
            r1.h hVar = r1.i.f7785f;
            if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i8))) {
                a0.m.q(i8, pVar, i8, hVar);
            }
            g0.d.Q(pVar, c4, r1.i.f7782c);
            aVar.d(pVar, 6);
            pVar.p(true);
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new g(aVar, i7, 0);
        }
    }

    public static final void c(q6.a aVar, o0.a aVar2, s0.o oVar, q6.e eVar, q6.e eVar2, q6.e eVar3, z0.p0 p0Var, long j8, long j9, long j10, long j11, float f9, p2.r rVar, g0.p pVar, int i7, int i8) {
        int i9;
        o0.a aVar3;
        q6.e eVar4;
        int i10;
        pVar.S(-919826268);
        if ((i7 & 6) == 0) {
            i9 = (pVar.h(aVar) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            aVar3 = aVar2;
            i9 |= pVar.h(aVar3) ? 32 : 16;
        } else {
            aVar3 = aVar2;
        }
        if ((i7 & 384) == 0) {
            i9 |= pVar.f(oVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            eVar4 = eVar;
            i9 |= pVar.h(eVar4) ? 2048 : 1024;
        } else {
            eVar4 = eVar;
        }
        if ((i7 & 24576) == 0) {
            i9 |= pVar.h(null) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i9 |= pVar.h(eVar2) ? 131072 : 65536;
        }
        if ((i7 & 1572864) == 0) {
            i9 |= pVar.h(eVar3) ? 1048576 : 524288;
        }
        if ((i7 & 12582912) == 0) {
            i9 |= pVar.f(p0Var) ? 8388608 : 4194304;
        }
        if ((i7 & 100663296) == 0) {
            i9 |= pVar.e(j8) ? 67108864 : 33554432;
        }
        if ((i7 & 805306368) == 0) {
            i9 |= pVar.e(j9) ? 536870912 : 268435456;
        }
        if ((i8 & 6) == 0) {
            i10 = i8 | (pVar.e(j10) ? 4 : 2);
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            i10 |= pVar.e(j11) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i10 |= pVar.c(f9) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i10 |= pVar.f(rVar) ? 2048 : 1024;
        }
        int i11 = i10;
        if ((i9 & 306783379) == 306783378 && (i11 & 1171) == 1170 && pVar.x()) {
            pVar.L();
        } else {
            d(aVar, oVar, rVar, o0.f.b(-1852840226, new i(eVar2, eVar3, p0Var, j8, f9, j9, j10, j11, eVar4, aVar3), pVar), pVar, (i9 & 14) | 3072 | ((i9 >> 3) & 112) | ((i11 >> 3) & 896));
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new j(aVar, aVar2, oVar, eVar, eVar2, eVar3, p0Var, j8, j9, j10, j11, f9, rVar, i7, i8);
        }
    }

    public static final void d(q6.a aVar, s0.o oVar, p2.r rVar, o0.a aVar2, g0.p pVar, int i7) {
        int i8;
        pVar.S(-1922902937);
        if ((i7 & 6) == 0) {
            i8 = (pVar.h(aVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.f(oVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= pVar.f(rVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= pVar.h(aVar2) ? 2048 : 1024;
        }
        if ((i8 & 1171) == 1170 && pVar.x()) {
            pVar.L();
        } else {
            a8.m.a(aVar, rVar, o0.f.b(905289008, new a0.r0(oVar, aVar2), pVar), pVar, ((i8 >> 3) & 112) | (i8 & 14) | 384);
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new l(aVar, oVar, rVar, aVar2, i7, 0);
        }
    }
}
