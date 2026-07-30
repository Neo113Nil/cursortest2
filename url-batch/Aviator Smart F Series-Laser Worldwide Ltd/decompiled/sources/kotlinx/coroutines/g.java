package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public abstract class g {
    public static final <T> n0 async(i0 i0Var, CoroutineContext coroutineContext, CoroutineStart coroutineStart, f6.p pVar) {
        return i.async(i0Var, coroutineContext, coroutineStart, pVar);
    }

    public static final <T> Object invoke(CoroutineDispatcher coroutineDispatcher, f6.p pVar, kotlin.coroutines.c cVar) {
        return i.invoke(coroutineDispatcher, pVar, cVar);
    }

    public static final l1 launch(i0 i0Var, CoroutineContext coroutineContext, CoroutineStart coroutineStart, f6.p pVar) {
        return i.launch(i0Var, coroutineContext, coroutineStart, pVar);
    }

    public static final <T> T runBlocking(CoroutineContext coroutineContext, f6.p pVar) {
        return (T) h.runBlocking(coroutineContext, pVar);
    }

    public static final <T> Object withContext(CoroutineContext coroutineContext, f6.p pVar, kotlin.coroutines.c cVar) {
        return i.withContext(coroutineContext, pVar, cVar);
    }
}
