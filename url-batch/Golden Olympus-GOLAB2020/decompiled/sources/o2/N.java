package o2;

import kotlin.Result;
import kotlin.ResultKt;
import t2.C3440k;

/* loaded from: classes3.dex */
public abstract class N {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(kotlin.coroutines.d dVar) {
        Object m243constructorimpl;
        if (dVar instanceof C3440k) {
            return dVar.toString();
        }
        try {
            Result.Companion companion = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.d(m243constructorimpl) != null) {
            m243constructorimpl = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) m243constructorimpl;
    }
}
