package md;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import wd.g0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static ld.a a(Function2 function2, ld.a aVar, ld.a aVar2) {
        function2.getClass();
        if (function2 instanceof nd.a) {
            return ((nd.a) function2).create(aVar, aVar2);
        }
        CoroutineContext context = aVar2.getContext();
        return context == g.f5592d ? new b(function2, aVar2, aVar) : new c(aVar2, context, function2, aVar);
    }

    public static ld.a b(ld.a aVar) {
        ld.a intercepted;
        aVar.getClass();
        nd.c cVar = aVar instanceof nd.c ? (nd.c) aVar : null;
        return (cVar == null || (intercepted = cVar.intercepted()) == null) ? aVar : intercepted;
    }

    public static Object c(Function2 function2, Object obj, ld.a aVar) {
        function2.getClass();
        CoroutineContext context = aVar.getContext();
        Object dVar = context == g.f5592d ? new d(aVar) : new e(context, aVar);
        g0.c(2, function2);
        return function2.invoke(obj, dVar);
    }
}
