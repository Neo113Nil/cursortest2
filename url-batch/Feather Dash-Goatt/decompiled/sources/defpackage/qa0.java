package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class qa0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static dn a(dn dnVar, dn dnVar2, Function2 function2) {
        function2.getClass();
        if (function2 instanceof yc) {
            return ((yc) function2).h(dnVar2, dnVar);
        }
        CoroutineContext g = dnVar2.g();
        return g == g.d ? new ma0(dnVar2, dnVar, function2) : new na0(dnVar2, g, function2, dnVar);
    }

    public static dn b(dn dnVar) {
        dnVar.getClass();
        fn fnVar = dnVar instanceof fn ? (fn) dnVar : null;
        if (fnVar == null || (dnVar = fnVar.g) != null) {
            return dnVar;
        }
        d dVar = (d) fnVar.g().d(d.f);
        dn hsVar = dVar != null ? new hs((ln) dVar, fnVar) : fnVar;
        fnVar.g = hsVar;
        return hsVar;
    }

    public static Object c(Function2 function2, Object obj, dn dnVar) {
        function2.getClass();
        CoroutineContext g = dnVar.g();
        Object oa0Var = g == g.d ? new oa0(dnVar) : new pa0(dnVar, g);
        tj1.b(2, function2);
        return function2.b(obj, oa0Var);
    }
}
