package i9;

import a2.g0;
import a3.o;
import b0.l0;
import b0.p;
import b0.w0;
import b0.x;
import c2.f;
import c2.g;
import c2.z;
import d1.i;
import d1.l;
import j0.d0;
import k1.v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import n0.g1;
import n0.h;
import n0.i0;
import n0.k;
import n0.s1;
import n0.z0;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final x0.d f4672a = new x0.d(773893516, false, new a1.e(10, (byte) 0));

    public static final void a(int i3, i0 i0Var) {
        boolean z10;
        i0 i0Var2 = i0Var;
        i0Var2.X(-561725993);
        if (i0Var2.O(i3 & 1, (i3 & 3) != 2)) {
            Object L = i0Var2.L();
            n0.e eVar = k.f6729a;
            if (L == eVar) {
                L = new g1(0);
                i0Var2.g0(L);
            }
            g1 g1Var = (g1) L;
            Object L2 = i0Var2.L();
            if (L2 == eVar) {
                L2 = new e(new a1.d(4, g1Var));
                i0Var2.g0(L2);
            }
            e eVar2 = (e) L2;
            Object L3 = i0Var2.L();
            if (L3 == eVar) {
                L3 = h.r(null);
                i0Var2.g0(L3);
            }
            z0 z0Var = (z0) L3;
            g0 d10 = p.d(d1.a.f3282d);
            int hashCode = Long.hashCode(i0Var2.T);
            x0.h l10 = i0Var2.l();
            i iVar = i.f3304a;
            l C = w.C(iVar, i0Var2);
            g.f1541a.getClass();
            z zVar = f.f1533b;
            i0Var2.Z();
            if (i0Var2.S) {
                i0Var2.k(zVar);
            } else {
                i0Var2.j0();
            }
            c2.e eVar3 = f.f1536e;
            h.y(d10, eVar3, i0Var2);
            c2.e eVar4 = f.f1535d;
            h.y(l10, eVar4, i0Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            c2.e eVar5 = f.f1537f;
            h.y(valueOf, eVar5, i0Var2);
            c2.d dVar = f.g;
            h.t(i0Var2, dVar);
            c2.e eVar6 = f.f1534c;
            h.y(C, eVar6, i0Var2);
            boolean h10 = i0Var2.h(eVar2);
            Object L4 = i0Var2.L();
            if (h10 || L4 == eVar) {
                L4 = new l0(7, eVar2, z0Var);
                i0Var2.g0(L4);
            }
            o.b((Function1) L4, b0.i.d(w0.a(1.0f)), null, i0Var2, 0);
            if (g1Var.h() == 2) {
                i0Var2.W(-1577523088);
                l c10 = x.g.c(w0.a(1.0f), k1.p.f5337c, v.f5351b);
                b0.z a9 = x.a(b0.g.f844c, d1.a.A, i0Var2, 54);
                int hashCode2 = Long.hashCode(i0Var2.T);
                x0.h l11 = i0Var2.l();
                l C2 = w.C(c10, i0Var2);
                i0Var2.Z();
                if (i0Var2.S) {
                    i0Var2.k(zVar);
                } else {
                    i0Var2.j0();
                }
                h.y(a9, eVar3, i0Var2);
                h.y(l11, eVar4, i0Var2);
                h.y(Integer.valueOf(hashCode2), eVar5, i0Var2);
                h.t(i0Var2, dVar);
                h.y(C2, eVar6, i0Var2);
                d0.b("Oops! We couldn't load the Privacy Policy. Make sure you're connected to the internet and give it another go.", b0.i.i(iVar, 16, 20), k1.p.f5336b, 0L, null, 0L, new w2.k(3), 0L, 0, false, 0, 0, null, i0Var, 438, 261112);
                i0Var2 = i0Var;
                Object L5 = i0Var2.L();
                if (L5 == eVar) {
                    L5 = new a4.a(4, g1Var, z0Var);
                    i0Var2.g0(L5);
                }
                j0.w.a(1572870, null, null, null, (Function0) L5, i0Var2, false);
                z10 = true;
                i0Var2.p(true);
                i0Var2.p(false);
            } else {
                z10 = true;
                i0Var2.W(-1576488091);
                i0Var2.p(false);
            }
            i0Var2.p(z10);
        } else {
            i0Var2.R();
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            r9.f6812d = new a1.e(i3);
        }
    }
}
