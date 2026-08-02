package kotlinx.coroutines;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes9.dex */
public final class CancelFutureOnCancel implements CancelHandler {
    public final ScheduledFuture future;

    public CancelFutureOnCancel(ScheduledFuture scheduledFuture) {
        this.future = scheduledFuture;
    }

    @Override // kotlinx.coroutines.CancelHandler
    public final void invoke(Throwable th) {
        this.future.cancel(false);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.future + ']';
    }
}
