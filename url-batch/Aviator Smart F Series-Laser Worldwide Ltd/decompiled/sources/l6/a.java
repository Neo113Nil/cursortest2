package l6;

import f6.l;
import f6.p;
import kotlin.Result;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import y5.g;
import y5.w;

/* loaded from: classes5.dex */
public abstract class a {
    private static final void dispatcherFailure(c cVar, Throwable th) {
        Result.a aVar = Result.Companion;
        cVar.resumeWith(Result.m348constructorimpl(g.createFailure(th)));
        throw th;
    }

    private static final void runSafely(c cVar, f6.a aVar) {
        try {
            aVar.invoke();
        } catch (Throwable th) {
            dispatcherFailure(cVar, th);
        }
    }

    public static final <T> void startCoroutineCancellable(l lVar, c cVar) {
        c createCoroutineUnintercepted;
        c intercepted;
        try {
            createCoroutineUnintercepted = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(lVar, cVar);
            intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(createCoroutineUnintercepted);
            Result.a aVar = Result.Companion;
            kotlinx.coroutines.internal.l.resumeCancellableWith$default(intercepted, Result.m348constructorimpl(w.INSTANCE), null, 2, null);
        } catch (Throwable th) {
            dispatcherFailure(cVar, th);
        }
    }

    public static /* synthetic */ void startCoroutineCancellable$default(p pVar, Object obj, c cVar, l lVar, int i8, Object obj2) {
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        startCoroutineCancellable(pVar, obj, cVar, lVar);
    }

    public static final <R, T> void startCoroutineCancellable(p pVar, R r8, c cVar, l lVar) {
        c createCoroutineUnintercepted;
        c intercepted;
        try {
            createCoroutineUnintercepted = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(pVar, r8, cVar);
            intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(createCoroutineUnintercepted);
            Result.a aVar = Result.Companion;
            kotlinx.coroutines.internal.l.resumeCancellableWith(intercepted, Result.m348constructorimpl(w.INSTANCE), lVar);
        } catch (Throwable th) {
            dispatcherFailure(cVar, th);
        }
    }

    public static final void startCoroutineCancellable(c cVar, c cVar2) {
        c intercepted;
        try {
            intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
            Result.a aVar = Result.Companion;
            kotlinx.coroutines.internal.l.resumeCancellableWith$default(intercepted, Result.m348constructorimpl(w.INSTANCE), null, 2, null);
        } catch (Throwable th) {
            dispatcherFailure(cVar2, th);
        }
    }
}
