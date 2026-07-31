package s2;

import a2.AbstractC1241b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.M;
import r2.InterfaceC3397g;
import t2.K;

/* renamed from: s2.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3415f {
    public static final Object b(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, kotlin.coroutines.d dVar) {
        Object c4 = K.c(coroutineContext, obj2);
        try {
            x xVar = new x(dVar, coroutineContext);
            Object e4 = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? AbstractC1241b.e(function2, obj, xVar) : ((Function2) M.e(function2, 2)).invoke(obj, xVar);
            K.a(coroutineContext, c4);
            if (e4 == AbstractC1241b.f()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return e4;
        } catch (Throwable th) {
            K.a(coroutineContext, c4);
            throw th;
        }
    }

    public static /* synthetic */ Object c(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, kotlin.coroutines.d dVar, int i4, Object obj3) {
        if ((i4 & 4) != 0) {
            obj2 = K.b(coroutineContext);
        }
        return b(coroutineContext, obj, obj2, function2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3397g d(InterfaceC3397g interfaceC3397g, CoroutineContext coroutineContext) {
        return interfaceC3397g instanceof w ? true : interfaceC3397g instanceof r ? interfaceC3397g : new z(interfaceC3397g, coroutineContext);
    }
}
