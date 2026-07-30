package p2;

import a0.e0;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d0.b0;
import g0.k1;
import g0.p1;
import g0.t0;
import g0.z0;
import java.util.UUID;
import p1.f0;
import s1.f1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final g0.z f7153a = new g0.z(d.f7126i);

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0181 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0204 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(y yVar, q6.a aVar, z zVar, o0.a aVar2, g0.p pVar, int i7, int i8) {
        int i9;
        q6.a aVar3;
        int i10;
        Object G;
        t0 t0Var;
        g0.p pVar2;
        t0 t0Var2;
        boolean z8;
        String str;
        q6.a aVar4;
        boolean h3;
        t0 t0Var3;
        Object fVar;
        h6.d dVar;
        q6.a aVar5;
        int i11;
        v vVar;
        g0.p pVar3;
        String str2;
        m2.k kVar;
        boolean h8;
        Object G2;
        boolean h9;
        Object G3;
        boolean h10;
        Object G4;
        boolean h11;
        Object G5;
        boolean h12;
        Object G6;
        int i12;
        p1 r8;
        y yVar2 = yVar;
        pVar.S(-830247068);
        if ((i7 & 6) == 0) {
            i9 = (pVar.f(yVar2) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        int i13 = i8 & 2;
        if (i13 != 0) {
            i9 |= 48;
        } else if ((i7 & 48) == 0) {
            aVar3 = aVar;
            i9 |= pVar.h(aVar3) ? 32 : 16;
            if ((i7 & 384) == 0) {
                i9 |= pVar.f(zVar) ? 256 : 128;
            }
            if ((i7 & 3072) == 0) {
                i9 |= pVar.h(aVar2) ? 2048 : 1024;
            }
            i10 = i9;
            if ((i10 & 1171) == 1170 || !pVar.x()) {
                q6.a aVar6 = i13 == 0 ? null : aVar3;
                View view = (View) pVar.k(AndroidCompositionLocals_androidKt.f743f);
                m2.b bVar = (m2.b) pVar.k(f1.f8217f);
                String str3 = (String) pVar.k(f7153a);
                m2.k kVar2 = (m2.k) pVar.k(f1.f8223l);
                g0.n L = g0.d.L(pVar);
                z0 M = g0.d.M(aVar2, pVar);
                UUID uuid = (UUID) a.a.E(new Object[0], null, d.f7127j, pVar, 3072, 6);
                G = pVar.G();
                t0Var = g0.l.f3784a;
                if (G != t0Var) {
                    q6.a aVar7 = aVar6;
                    t0Var2 = t0Var;
                    z8 = true;
                    pVar2 = pVar;
                    v vVar2 = new v(aVar7, zVar, str3, view, bVar, yVar, uuid);
                    str = str3;
                    aVar4 = aVar7;
                    yVar2 = yVar;
                    vVar2.h(L, new o0.a(1302892335, new b0(vVar2, 12, M), true));
                    pVar2.a0(vVar2);
                    G = vVar2;
                } else {
                    pVar2 = pVar;
                    t0Var2 = t0Var;
                    z8 = true;
                    str = str3;
                    aVar4 = aVar6;
                }
                v vVar3 = (v) G;
                int i14 = i10 & 112;
                int i15 = i10 & 896;
                h3 = pVar2.h(vVar3) | (i14 != 32 ? z8 : false) | (i15 != 256 ? z8 : false) | pVar2.f(str) | pVar2.f(kVar2);
                Object G7 = pVar2.G();
                if (h3) {
                    t0Var3 = t0Var2;
                    if (G7 != t0Var3) {
                        fVar = G7;
                        kVar = kVar2;
                        aVar5 = aVar4;
                        str2 = str;
                        i11 = i10;
                        dVar = null;
                        vVar = vVar3;
                        pVar3 = pVar2;
                        g0.d.d(vVar, (q6.c) fVar, pVar3);
                        h8 = (i14 == 32 ? z8 : false) | pVar3.h(vVar) | (i15 == 256 ? z8 : false) | pVar3.f(str2) | pVar3.f(kVar);
                        G2 = pVar3.G();
                        if (!h8 || G2 == t0Var3) {
                            g gVar = new g(vVar, aVar5, zVar, str2, kVar);
                            pVar3.a0(gVar);
                            G2 = gVar;
                        }
                        g0.d.g((q6.a) G2, pVar3);
                        h9 = pVar3.h(vVar) | ((i11 & 14) == 4 ? z8 : false);
                        G3 = pVar3.G();
                        if (!h9 || G3 == t0Var3) {
                            G3 = new a0.y(vVar, 29, yVar2);
                            pVar3.a0(G3);
                        }
                        g0.d.d(yVar2, (q6.c) G3, pVar3);
                        h10 = pVar3.h(vVar);
                        G4 = pVar3.G();
                        if (!h10 || G4 == t0Var3) {
                            G4 = new e0(vVar, dVar, 22);
                            pVar3.a0(G4);
                        }
                        g0.d.e(pVar3, vVar, (q6.e) G4);
                        h11 = pVar3.h(vVar);
                        G5 = pVar3.G();
                        if (!h11 || G5 == t0Var3) {
                            G5 = new i(vVar, 0);
                            pVar3.a0(G5);
                        }
                        s0.o d8 = androidx.compose.ui.layout.a.d(s0.l.f8103a, (q6.c) G5);
                        h12 = pVar3.h(vVar) | pVar3.f(kVar);
                        G6 = pVar3.G();
                        if (!h12 || G6 == t0Var3) {
                            G6 = new j(vVar, kVar);
                            pVar3.a0(G6);
                        }
                        f0 f0Var = (f0) G6;
                        i12 = pVar3.P;
                        k1 m8 = pVar3.m();
                        s0.o c4 = s0.a.c(pVar3, d8);
                        r1.j.f7810d.getClass();
                        r1.n nVar = r1.i.f7781b;
                        pVar3.U();
                        if (pVar3.O) {
                            pVar3.l(nVar);
                        } else {
                            pVar3.d0();
                        }
                        g0.d.Q(pVar3, f0Var, r1.i.f7784e);
                        g0.d.Q(pVar3, m8, r1.i.f7783d);
                        r1.h hVar = r1.i.f7785f;
                        if (!pVar3.O || !r6.k.a(pVar3.G(), Integer.valueOf(i12))) {
                            a0.m.q(i12, pVar3, i12, hVar);
                        }
                        g0.d.Q(pVar3, c4, r1.i.f7782c);
                        pVar3.p(z8);
                    }
                } else {
                    t0Var3 = t0Var2;
                }
                String str4 = str;
                dVar = null;
                aVar5 = aVar4;
                i11 = i10;
                vVar = vVar3;
                pVar3 = pVar2;
                fVar = new f(vVar, aVar5, zVar, str4, kVar2, 0);
                str2 = str4;
                kVar = kVar2;
                pVar3.a0(fVar);
                g0.d.d(vVar, (q6.c) fVar, pVar3);
                h8 = (i14 == 32 ? z8 : false) | pVar3.h(vVar) | (i15 == 256 ? z8 : false) | pVar3.f(str2) | pVar3.f(kVar);
                G2 = pVar3.G();
                if (!h8) {
                }
                g gVar2 = new g(vVar, aVar5, zVar, str2, kVar);
                pVar3.a0(gVar2);
                G2 = gVar2;
                g0.d.g((q6.a) G2, pVar3);
                h9 = pVar3.h(vVar) | ((i11 & 14) == 4 ? z8 : false);
                G3 = pVar3.G();
                if (!h9) {
                }
                G3 = new a0.y(vVar, 29, yVar2);
                pVar3.a0(G3);
                g0.d.d(yVar2, (q6.c) G3, pVar3);
                h10 = pVar3.h(vVar);
                G4 = pVar3.G();
                if (!h10) {
                }
                G4 = new e0(vVar, dVar, 22);
                pVar3.a0(G4);
                g0.d.e(pVar3, vVar, (q6.e) G4);
                h11 = pVar3.h(vVar);
                G5 = pVar3.G();
                if (!h11) {
                }
                G5 = new i(vVar, 0);
                pVar3.a0(G5);
                s0.o d82 = androidx.compose.ui.layout.a.d(s0.l.f8103a, (q6.c) G5);
                h12 = pVar3.h(vVar) | pVar3.f(kVar);
                G6 = pVar3.G();
                if (!h12) {
                }
                G6 = new j(vVar, kVar);
                pVar3.a0(G6);
                f0 f0Var2 = (f0) G6;
                i12 = pVar3.P;
                k1 m82 = pVar3.m();
                s0.o c42 = s0.a.c(pVar3, d82);
                r1.j.f7810d.getClass();
                r1.n nVar2 = r1.i.f7781b;
                pVar3.U();
                if (pVar3.O) {
                }
                g0.d.Q(pVar3, f0Var2, r1.i.f7784e);
                g0.d.Q(pVar3, m82, r1.i.f7783d);
                r1.h hVar2 = r1.i.f7785f;
                if (!pVar3.O) {
                }
                a0.m.q(i12, pVar3, i12, hVar2);
                g0.d.Q(pVar3, c42, r1.i.f7782c);
                pVar3.p(z8);
            } else {
                pVar.L();
                aVar5 = aVar3;
                pVar3 = pVar;
            }
            r8 = pVar3.r();
            if (r8 == null) {
                r8.f3853d = new k(yVar2, aVar5, zVar, aVar2, i7, i8);
                return;
            }
            return;
        }
        aVar3 = aVar;
        if ((i7 & 384) == 0) {
        }
        if ((i7 & 3072) == 0) {
        }
        i10 = i9;
        if ((i10 & 1171) == 1170) {
        }
        if (i13 == 0) {
        }
        View view2 = (View) pVar.k(AndroidCompositionLocals_androidKt.f743f);
        m2.b bVar2 = (m2.b) pVar.k(f1.f8217f);
        String str32 = (String) pVar.k(f7153a);
        m2.k kVar22 = (m2.k) pVar.k(f1.f8223l);
        g0.n L2 = g0.d.L(pVar);
        z0 M2 = g0.d.M(aVar2, pVar);
        UUID uuid2 = (UUID) a.a.E(new Object[0], null, d.f7127j, pVar, 3072, 6);
        G = pVar.G();
        t0Var = g0.l.f3784a;
        if (G != t0Var) {
        }
        v vVar32 = (v) G;
        int i142 = i10 & 112;
        int i152 = i10 & 896;
        h3 = pVar2.h(vVar32) | (i142 != 32 ? z8 : false) | (i152 != 256 ? z8 : false) | pVar2.f(str) | pVar2.f(kVar22);
        Object G72 = pVar2.G();
        if (h3) {
        }
        String str42 = str;
        dVar = null;
        aVar5 = aVar4;
        i11 = i10;
        vVar = vVar32;
        pVar3 = pVar2;
        fVar = new f(vVar, aVar5, zVar, str42, kVar22, 0);
        str2 = str42;
        kVar = kVar22;
        pVar3.a0(fVar);
        g0.d.d(vVar, (q6.c) fVar, pVar3);
        h8 = (i142 == 32 ? z8 : false) | pVar3.h(vVar) | (i152 == 256 ? z8 : false) | pVar3.f(str2) | pVar3.f(kVar);
        G2 = pVar3.G();
        if (!h8) {
        }
        g gVar22 = new g(vVar, aVar5, zVar, str2, kVar);
        pVar3.a0(gVar22);
        G2 = gVar22;
        g0.d.g((q6.a) G2, pVar3);
        h9 = pVar3.h(vVar) | ((i11 & 14) == 4 ? z8 : false);
        G3 = pVar3.G();
        if (!h9) {
        }
        G3 = new a0.y(vVar, 29, yVar2);
        pVar3.a0(G3);
        g0.d.d(yVar2, (q6.c) G3, pVar3);
        h10 = pVar3.h(vVar);
        G4 = pVar3.G();
        if (!h10) {
        }
        G4 = new e0(vVar, dVar, 22);
        pVar3.a0(G4);
        g0.d.e(pVar3, vVar, (q6.e) G4);
        h11 = pVar3.h(vVar);
        G5 = pVar3.G();
        if (!h11) {
        }
        G5 = new i(vVar, 0);
        pVar3.a0(G5);
        s0.o d822 = androidx.compose.ui.layout.a.d(s0.l.f8103a, (q6.c) G5);
        h12 = pVar3.h(vVar) | pVar3.f(kVar);
        G6 = pVar3.G();
        if (!h12) {
        }
        G6 = new j(vVar, kVar);
        pVar3.a0(G6);
        f0 f0Var22 = (f0) G6;
        i12 = pVar3.P;
        k1 m822 = pVar3.m();
        s0.o c422 = s0.a.c(pVar3, d822);
        r1.j.f7810d.getClass();
        r1.n nVar22 = r1.i.f7781b;
        pVar3.U();
        if (pVar3.O) {
        }
        g0.d.Q(pVar3, f0Var22, r1.i.f7784e);
        g0.d.Q(pVar3, m822, r1.i.f7783d);
        r1.h hVar22 = r1.i.f7785f;
        if (!pVar3.O) {
        }
        a0.m.q(i12, pVar3, i12, hVar22);
        g0.d.Q(pVar3, c422, r1.i.f7782c);
        pVar3.p(z8);
        r8 = pVar3.r();
        if (r8 == null) {
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
