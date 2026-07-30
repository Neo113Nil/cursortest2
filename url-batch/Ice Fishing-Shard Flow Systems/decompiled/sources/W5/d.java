package W5;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0768a;

/* loaded from: classes.dex */
public class d {
    /* JADX WARN: Multi-variable type inference failed */
    public static V5.b a(Function2 function2, AbstractC0768a abstractC0768a, AbstractC0768a completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((X5.a) function2).create(abstractC0768a, completion);
    }

    public static V5.b b(V5.b bVar) {
        V5.b intercepted;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        X5.c cVar = bVar instanceof X5.c ? (X5.c) bVar : null;
        return (cVar == null || (intercepted = cVar.intercepted()) == null) ? bVar : intercepted;
    }

    public static Object c(Function2 function2, Object obj, V5.b completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        CoroutineContext context = completion.getContext();
        Object bVar = context == g.f6146d ? new b(completion) : new c(completion, context);
        I.b(2, function2);
        return function2.invoke(obj, bVar);
    }
}
