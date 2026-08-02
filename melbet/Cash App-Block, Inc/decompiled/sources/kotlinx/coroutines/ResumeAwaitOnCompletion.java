package kotlinx.coroutines;

import kotlin.Result;
import kotlinx.coroutines.JobSupport;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ResumeAwaitOnCompletion extends JobNode {
    public final JobSupport.AwaitContinuation continuation;

    public ResumeAwaitOnCompletion(JobSupport.AwaitContinuation awaitContinuation) {
        this.continuation = awaitContinuation;
    }

    @Override // kotlinx.coroutines.JobNode
    public final boolean getOnCancelling() {
        return false;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void invoke(Throwable th) {
        Object state$kotlinx_coroutines_core = getJob().getState$kotlinx_coroutines_core();
        boolean z = state$kotlinx_coroutines_core instanceof CompletedExceptionally;
        JobSupport.AwaitContinuation awaitContinuation = this.continuation;
        if (z) {
            Result.Companion companion = Result.Companion;
            awaitContinuation.resumeWith(SafeTrace.createFailure(((CompletedExceptionally) state$kotlinx_coroutines_core).cause));
        } else {
            Result.Companion companion2 = Result.Companion;
            awaitContinuation.resumeWith(JobKt.unboxState(state$kotlinx_coroutines_core));
        }
    }
}
