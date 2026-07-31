package o2;

import a2.AbstractC1241b;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public abstract class U {
    public static final Object a(long j4, kotlin.coroutines.d dVar) {
        if (j4 <= 0) {
            return Unit.f41027a;
        }
        C3345o c3345o = new C3345o(AbstractC1241b.c(dVar), 1);
        c3345o.E();
        if (j4 < Long.MAX_VALUE) {
            b(c3345o.getContext()).e(j4, c3345o);
        }
        Object y4 = c3345o.y();
        if (y4 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4 == AbstractC1241b.f() ? y4 : Unit.f41027a;
    }

    public static final T b(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(kotlin.coroutines.e.f41111K2);
        T t4 = element instanceof T ? (T) element : null;
        return t4 == null ? P.a() : t4;
    }
}
