package D2;

import M2.J;
import W2.AbstractC0298u;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.i;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static C2.a a(C2.a aVar, C2.a completion, Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        if (function2 instanceof E2.a) {
            return ((E2.a) function2).j(completion, aVar);
        }
        CoroutineContext p4 = completion.p();
        return p4 == i.f7498d ? new b(completion, aVar, function2) : new c(completion, p4, function2, aVar);
    }

    public static C2.a b(C2.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        E2.c cVar = aVar instanceof E2.c ? (E2.c) aVar : null;
        if (cVar == null) {
            return aVar;
        }
        C2.a aVar2 = cVar.f2312i;
        if (aVar2 != null) {
            return aVar2;
        }
        kotlin.coroutines.e eVar = (kotlin.coroutines.e) cVar.p().k(kotlin.coroutines.e.f7496f);
        C2.a fVar = eVar != null ? new b3.f((AbstractC0298u) eVar, cVar) : cVar;
        cVar.f2312i = fVar;
        return fVar;
    }

    public static Object c(Function2 function2, Object obj, C2.a completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        CoroutineContext p4 = completion.p();
        Object dVar = p4 == i.f7498d ? new d(completion) : new e(completion, p4);
        J.d(2, function2);
        return function2.h(obj, dVar);
    }
}
