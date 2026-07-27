package W2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public abstract class I {
    public static final boolean a(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static final void b(C0286h c0286h, C2.a aVar, boolean z4) {
        Object g4;
        Object obj = C0286h.f4263m.get(c0286h);
        Throwable f4 = c0286h.f(obj);
        if (f4 != null) {
            AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
            g4 = AbstractC1343r.a(f4);
        } else {
            AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
            g4 = c0286h.g(obj);
        }
        if (!z4) {
            aVar.u(g4);
            return;
        }
        Intrinsics.d(aVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        b3.f fVar = (b3.f) aVar;
        E2.c cVar = fVar.f5656k;
        CoroutineContext p4 = cVar.p();
        Object c4 = b3.v.c(p4, fVar.f5658m);
        A0 b4 = c4 != b3.v.f5691a ? AbstractC0296s.b(cVar, p4, c4) : null;
        try {
            cVar.u(g4);
            Unit unit = Unit.f7487a;
        } finally {
            if (b4 == null || b4.k0()) {
                b3.v.a(p4, c4);
            }
        }
    }
}
