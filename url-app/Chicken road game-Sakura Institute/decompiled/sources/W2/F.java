package W2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class F {
    public static final Object a(long j4, E2.c frame) {
        if (j4 <= 0) {
            return Unit.f7487a;
        }
        C0286h c0286h = new C0286h(1, D2.f.b(frame));
        c0286h.s();
        if (j4 < Long.MAX_VALUE) {
            b(c0286h.f4266k).n(j4, c0286h);
        }
        Object r2 = c0286h.r();
        D2.a aVar = D2.a.f2163d;
        if (r2 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r2 == aVar ? r2 : Unit.f7487a;
    }

    public static final E b(CoroutineContext coroutineContext) {
        CoroutineContext.Element k4 = coroutineContext.k(kotlin.coroutines.e.f7496f);
        E e4 = k4 instanceof E ? (E) k4 : null;
        return e4 == null ? D.f4221a : e4;
    }
}
