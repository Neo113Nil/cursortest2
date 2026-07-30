package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.h;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class r40 {
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 17;
        boolean booleanValue = ((Boolean) coroutineContext.y(bool, new ww(i))).booleanValue();
        boolean booleanValue2 = ((Boolean) coroutineContext2.y(bool, new ww(i))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return coroutineContext.p(coroutineContext2);
        }
        h hVar = h.m;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.y(hVar, new ww(15));
        Object obj = coroutineContext2;
        if (booleanValue2) {
            obj = coroutineContext2.y(hVar, new ww(16));
        }
        return coroutineContext3.p((CoroutineContext) obj);
    }

    public static final CoroutineContext b(a50 a50Var, CoroutineContext coroutineContext) {
        CoroutineContext a = a(a50Var.n(), coroutineContext, true);
        t80 t80Var = vb0.a;
        return (a == t80Var || a.m(e.d) != null) ? a : a.p(t80Var);
    }

    public static final x13 c(o30 o30Var, CoroutineContext coroutineContext, Object obj) {
        x13 x13Var = null;
        if ((o30Var instanceof c50) && coroutineContext.m(y13.m) != null) {
            c50 c50Var = (c50) o30Var;
            while (true) {
                if ((c50Var instanceof qb0) || (c50Var = c50Var.getCallerFrame()) == null) {
                    break;
                }
                if (c50Var instanceof x13) {
                    x13Var = (x13) c50Var;
                    break;
                }
            }
            if (x13Var != null) {
                x13Var.p0(coroutineContext, obj);
            }
        }
        return x13Var;
    }
}
