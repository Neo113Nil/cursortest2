package kotlinx.coroutines;

import kotlin.Result;

/* loaded from: classes3.dex */
public abstract class k0 {
    public static final String getClassSimpleName(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String getHexAddress(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String toDebugString(kotlin.coroutines.c cVar) {
        Object m348constructorimpl;
        if (cVar instanceof kotlinx.coroutines.internal.k) {
            return cVar.toString();
        }
        try {
            Result.a aVar = Result.Companion;
            m348constructorimpl = Result.m348constructorimpl(cVar + '@' + getHexAddress(cVar));
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m348constructorimpl = Result.m348constructorimpl(y5.g.createFailure(th));
        }
        if (Result.m351exceptionOrNullimpl(m348constructorimpl) != null) {
            m348constructorimpl = cVar.getClass().getName() + '@' + getHexAddress(cVar);
        }
        return (String) m348constructorimpl;
    }
}
