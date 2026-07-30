package n6;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public abstract class r {
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z7) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) coroutineContext.t(bool, new V5.a(2))).booleanValue();
        boolean booleanValue2 = ((Boolean) coroutineContext2.t(bool, new V5.a(2))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return coroutineContext.j(coroutineContext2);
        }
        kotlin.jvm.internal.D d7 = new kotlin.jvm.internal.D();
        d7.f6152d = coroutineContext2;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f6146d;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.t(gVar, new V5.a(3));
        if (booleanValue2) {
            d7.f6152d = ((CoroutineContext) d7.f6152d).t(gVar, new V5.a(4));
        }
        return coroutineContext3.j((CoroutineContext) d7.f6152d);
    }

    public static final u0 b(V5.b bVar, CoroutineContext coroutineContext, Object obj) {
        u0 u0Var = null;
        if ((bVar instanceof X5.d) && coroutineContext.g(v0.f7087d) != null) {
            X5.d dVar = (X5.d) bVar;
            while (true) {
                if ((dVar instanceof C0766D) || (dVar = dVar.getCallerFrame()) == null) {
                    break;
                }
                if (dVar instanceof u0) {
                    u0Var = (u0) dVar;
                    break;
                }
            }
            if (u0Var != null) {
                u0Var.a0(coroutineContext, obj);
            }
        }
        return u0Var;
    }
}
