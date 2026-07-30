package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class q41 {
    /* JADX WARN: Multi-variable type inference failed */
    public static o30 a(o30 o30Var, o30 o30Var2, Function2 function2) {
        function2.getClass();
        if (function2 instanceof hn) {
            return ((hn) function2).create(o30Var, o30Var2);
        }
        CoroutineContext context = o30Var2.getContext();
        return context == h.m ? new m41(o30Var2, o30Var, function2) : new n41(o30Var2, context, function2, o30Var);
    }

    public static o30 b(o30 o30Var) {
        o30 intercepted;
        o30Var.getClass();
        r30 r30Var = o30Var instanceof r30 ? (r30) o30Var : null;
        return (r30Var == null || (intercepted = r30Var.intercepted()) == null) ? o30Var : intercepted;
    }

    public static Object c(Function2 function2, Object obj, o30 o30Var) {
        function2.getClass();
        CoroutineContext context = o30Var.getContext();
        Object o41Var = context == h.m ? new o41(o30Var) : new p41(o30Var, context);
        s03.f(2, function2);
        return function2.invoke(obj, o41Var);
    }
}
