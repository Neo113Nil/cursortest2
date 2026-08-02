package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public interface Delay {
    default DisposableHandle invokeOnTimeout(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return DefaultExecutorKt.DefaultDelay.invokeOnTimeout(j, runnable, coroutineContext);
    }

    void scheduleResumeAfterDelay(long j, CancellableContinuationImpl cancellableContinuationImpl);
}
