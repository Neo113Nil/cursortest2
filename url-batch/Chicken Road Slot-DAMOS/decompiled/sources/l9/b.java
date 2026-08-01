package l9;

import b0.u;
import kotlin.jvm.functions.Function1;
import n0.i0;
import n0.s1;
import n4.x;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final x0.d f5937a = new x0.d(1450465356, false, new a());

    public static final void a(x xVar, d1.l lVar, i0 i0Var, int i3) {
        d1.l lVar2;
        xVar.getClass();
        i0Var.X(767691369);
        int i10 = (i0Var.h(xVar) ? 4 : 2) | i3 | 48;
        if (i0Var.O(i10 & 1, (i10 & 19) != 18)) {
            boolean f3 = i0Var.f(xVar);
            Object L = i0Var.L();
            Object obj = n0.k.f6729a;
            if (f3 || L == obj) {
                L = new e(xVar);
                i0Var.g0(L);
            }
            e eVar = (e) L;
            n nVar = n.INSTANCE;
            boolean h10 = i0Var.h(eVar);
            Object L2 = i0Var.L();
            if (h10 || L2 == obj) {
                L2 = new o(eVar, 0);
                i0Var.g0(L2);
            }
            g8.b.f(xVar, nVar, null, null, null, null, null, null, (Function1) L2, i0Var, (i10 & 14) | 432);
            lVar2 = d1.i.f3304a;
        } else {
            i0Var.R();
            lVar2 = lVar;
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new u(i3, 3, xVar, lVar2);
        }
    }
}
