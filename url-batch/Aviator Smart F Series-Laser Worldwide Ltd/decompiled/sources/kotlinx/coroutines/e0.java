package kotlinx.coroutines;

import kotlin.Result;

/* loaded from: classes3.dex */
public abstract class e0 {
    public static final <T> Object recoverResult(Object obj, kotlin.coroutines.c cVar) {
        if (!(obj instanceof b0)) {
            return Result.m348constructorimpl(obj);
        }
        Result.a aVar = Result.Companion;
        return Result.m348constructorimpl(y5.g.createFailure(((b0) obj).cause));
    }

    public static final <T> Object toState(Object obj, f6.l lVar) {
        Throwable m351exceptionOrNullimpl = Result.m351exceptionOrNullimpl(obj);
        return m351exceptionOrNullimpl == null ? lVar != null ? new c0(obj, lVar) : obj : new b0(m351exceptionOrNullimpl, false, 2, null);
    }

    public static /* synthetic */ Object toState$default(Object obj, f6.l lVar, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            lVar = null;
        }
        return toState(obj, lVar);
    }

    public static final <T> Object toState(Object obj, n nVar) {
        Throwable m351exceptionOrNullimpl = Result.m351exceptionOrNullimpl(obj);
        return m351exceptionOrNullimpl == null ? obj : new b0(m351exceptionOrNullimpl, false, 2, null);
    }
}
