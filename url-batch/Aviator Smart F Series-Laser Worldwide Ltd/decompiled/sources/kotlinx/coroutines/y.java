package kotlinx.coroutines;

import kotlin.Result;

/* loaded from: classes3.dex */
public abstract class y {
    public static final <T> w CompletableDeferred(l1 l1Var) {
        return new x(l1Var);
    }

    public static /* synthetic */ w CompletableDeferred$default(l1 l1Var, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            l1Var = null;
        }
        return CompletableDeferred(l1Var);
    }

    public static final <T> boolean completeWith(w wVar, Object obj) {
        Throwable m351exceptionOrNullimpl = Result.m351exceptionOrNullimpl(obj);
        return m351exceptionOrNullimpl == null ? wVar.complete(obj) : wVar.completeExceptionally(m351exceptionOrNullimpl);
    }

    public static final <T> w CompletableDeferred(T t7) {
        x xVar = new x(null);
        xVar.complete(t7);
        return xVar;
    }
}
