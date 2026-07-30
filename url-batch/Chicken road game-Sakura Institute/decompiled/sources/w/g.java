package w;

import g0.p1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class g {
    static {
        float f9 = 40;
        a.a.b(f9, f9);
    }

    public static final void a(String str, q6.c cVar, s0.o oVar, boolean z8, a2.k0 k0Var, i0 i0Var, h0 h0Var, boolean z9, int i7, int i8, a0.s sVar, q6.c cVar2, p.j jVar, z0.r0 r0Var, o0.a aVar, g0.p pVar, int i9) {
        q6.c cVar3;
        q6.c cVar4;
        g0.t0 t0Var = g0.t0.f3903k;
        pVar.S(945255183);
        int i10 = i9 | (pVar.f(str) ? 4 : 2) | (pVar.h(cVar) ? 32 : 16) | (pVar.f(oVar) ? 256 : 128) | (pVar.g(z8) ? 2048 : 1024) | (pVar.g(false) ? 16384 : 8192) | (pVar.f(k0Var) ? 131072 : 65536) | (pVar.f(i0Var) ? 1048576 : 524288) | (pVar.f(h0Var) ? 8388608 : 4194304) | (pVar.g(z9) ? 67108864 : 33554432) | (pVar.d(i7) ? 536870912 : 268435456);
        int i11 = 196608 | (pVar.d(i8) ? 4 : 2) | (pVar.f(sVar) ? 32 : 16) | 384 | (pVar.f(jVar) ? 2048 : 1024) | (pVar.f(r0Var) ? 16384 : 8192);
        if ((306783379 & i10) == 306783378 && (i11 & 74899) == 74898 && pVar.x()) {
            pVar.L();
            cVar4 = cVar2;
        } else {
            pVar.N();
            if ((i9 & 1) == 0 || pVar.w()) {
                cVar3 = e.f9209h;
            } else {
                pVar.L();
                cVar3 = cVar2;
            }
            pVar.q();
            Object G = pVar.G();
            Object obj = g0.l.f3784a;
            if (G == obj) {
                G = g0.d.J(new g2.w(6, 0L, str), t0Var);
                pVar.a0(G);
            }
            g0.z0 z0Var = (g0.z0) G;
            g2.w wVar = (g2.w) z0Var.getValue();
            g2.w wVar2 = new g2.w(new a2.g(str, null, 6), wVar.f4066b, wVar.f4067c);
            boolean f9 = pVar.f(wVar2);
            Object G2 = pVar.G();
            if (f9 || G2 == obj) {
                G2 = new a0.b1(wVar2, 12, z0Var);
                pVar.a0(G2);
            }
            g0.d.g((q6.a) G2, pVar);
            boolean z10 = (i10 & 14) == 4;
            Object G3 = pVar.G();
            if (z10 || G3 == obj) {
                G3 = g0.d.J(str, t0Var);
                pVar.a0(G3);
            }
            Object obj2 = (g0.z0) G3;
            i0Var.getClass();
            g2.m mVar = new g2.m(z9, 0, true, 1, 1, h2.b.f4643h);
            boolean z11 = !z9;
            int i12 = z9 ? 1 : i8;
            int i13 = z9 ? 1 : i7;
            boolean f10 = pVar.f(obj2) | ((i10 & 112) == 32);
            Object G4 = pVar.G();
            if (f10 || G4 == obj) {
                G4 = new c.h(cVar, z0Var, obj2, 11);
                pVar.a0(G4);
            }
            int i14 = i11 << 9;
            q6.c cVar5 = cVar3;
            g0.c(wVar2, (q6.c) G4, oVar, k0Var, sVar, cVar5, jVar, r0Var, z11, i13, i12, mVar, h0Var, z8, aVar, pVar, (i10 & 896) | ((i10 >> 6) & 7168) | (i14 & 57344) | 196608 | (3670016 & i14) | (i14 & 29360128), ((i10 >> 15) & 896) | (i10 & 7168) | (57344 & i10) | 196608);
            cVar4 = cVar5;
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new f(str, cVar, oVar, z8, k0Var, i0Var, h0Var, z9, i7, i8, sVar, cVar4, jVar, r0Var, aVar, i9);
        }
    }
}
