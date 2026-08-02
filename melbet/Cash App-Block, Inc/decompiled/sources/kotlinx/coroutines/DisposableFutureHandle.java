package kotlinx.coroutines;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes9.dex */
public final class DisposableFutureHandle implements DisposableHandle {
    public final ScheduledFuture future;

    public DisposableFutureHandle(ScheduledFuture scheduledFuture) {
        this.future = scheduledFuture;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        this.future.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.future + ']';
    }
}
