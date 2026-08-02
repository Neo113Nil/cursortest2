package kotlinx.coroutines;

import kotlin.Result;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ResumeOnCompletion extends JobNode {
    public final CancellableContinuationImpl continuation;

    public ResumeOnCompletion(CancellableContinuationImpl cancellableContinuationImpl) {
        this.continuation = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.JobNode
    public final boolean getOnCancelling() {
        return false;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void invoke(Throwable th) {
        Result.Companion companion = Result.Companion;
        this.continuation.resumeWith(Unit.INSTANCE);
    }
}
