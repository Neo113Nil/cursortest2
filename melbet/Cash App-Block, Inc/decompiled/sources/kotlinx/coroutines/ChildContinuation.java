package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;

/* loaded from: classes3.dex */
public final class ChildContinuation extends JobNode {
    public final CancellableContinuationImpl child;

    public ChildContinuation(CancellableContinuationImpl cancellableContinuationImpl) {
        this.child = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.JobNode
    public final boolean getOnCancelling() {
        return true;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void invoke(Throwable th) {
        boolean postponeCancellation$kotlinx_coroutines_core;
        JobSupport job = getJob();
        CancellableContinuationImpl cancellableContinuationImpl = this.child;
        Throwable continuationCancellationCause = cancellableContinuationImpl.getContinuationCancellationCause(job);
        if (cancellableContinuationImpl.isReusable()) {
            Continuation continuation = cancellableContinuationImpl.delegate;
            continuation.getClass();
            postponeCancellation$kotlinx_coroutines_core = ((DispatchedContinuation) continuation).postponeCancellation$kotlinx_coroutines_core(continuationCancellationCause);
        } else {
            postponeCancellation$kotlinx_coroutines_core = false;
        }
        if (postponeCancellation$kotlinx_coroutines_core) {
            return;
        }
        cancellableContinuationImpl.cancel(continuationCancellationCause);
        if (cancellableContinuationImpl.isReusable()) {
            return;
        }
        cancellableContinuationImpl.detachChild$kotlinx_coroutines_core();
    }
}
