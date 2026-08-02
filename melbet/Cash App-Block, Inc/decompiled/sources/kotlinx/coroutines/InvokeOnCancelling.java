package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import radiography.Radiography$renderScannableViewTree$1$2;

/* loaded from: classes9.dex */
public final class InvokeOnCancelling extends JobNode {
    public static final /* synthetic */ AtomicIntegerFieldUpdater _invoked$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(InvokeOnCancelling.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final Radiography$renderScannableViewTree$1$2 handler;

    public InvokeOnCancelling(Radiography$renderScannableViewTree$1$2 radiography$renderScannableViewTree$1$2) {
        this.handler = radiography$renderScannableViewTree$1$2;
    }

    @Override // kotlinx.coroutines.JobNode
    public final boolean getOnCancelling() {
        return true;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void invoke(Throwable th) {
        if (_invoked$volatile$FU.compareAndSet(this, 0, 1)) {
            this.handler.invoke(th);
        }
    }
}
