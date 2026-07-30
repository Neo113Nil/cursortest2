package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public interface n extends kotlin.coroutines.c {
    boolean cancel(Throwable th);

    void completeResume(Object obj);

    @Override // kotlin.coroutines.c
    /* synthetic */ CoroutineContext getContext();

    void initCancellability();

    void invokeOnCancellation(f6.l lVar);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    void resume(Object obj, f6.l lVar);

    void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, Object obj);

    void resumeUndispatchedWithException(CoroutineDispatcher coroutineDispatcher, Throwable th);

    @Override // kotlin.coroutines.c
    /* synthetic */ void resumeWith(Object obj);

    Object tryResume(Object obj, Object obj2);

    Object tryResume(Object obj, Object obj2, f6.l lVar);

    Object tryResumeWithException(Throwable th);
}
