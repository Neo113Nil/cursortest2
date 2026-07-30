package kotlinx.coroutines;

/* loaded from: classes3.dex */
public abstract class y0 extends CoroutineDispatcher {
    private boolean shared;
    private kotlin.collections.g unconfinedQueue;
    private long useCount;

    public static /* synthetic */ void decrementUseCount$default(y0 y0Var, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        y0Var.decrementUseCount(z7);
    }

    private final long delta(boolean z7) {
        return z7 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void incrementUseCount$default(y0 y0Var, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        y0Var.incrementUseCount(z7);
    }

    public final void decrementUseCount(boolean z7) {
        long delta = this.useCount - delta(z7);
        this.useCount = delta;
        if (delta <= 0 && this.shared) {
            shutdown();
        }
    }

    public final void dispatchUnconfined(r0 r0Var) {
        kotlin.collections.g gVar = this.unconfinedQueue;
        if (gVar == null) {
            gVar = new kotlin.collections.g();
            this.unconfinedQueue = gVar;
        }
        gVar.addLast(r0Var);
    }

    protected long getNextTime() {
        kotlin.collections.g gVar = this.unconfinedQueue;
        return (gVar == null || gVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void incrementUseCount(boolean z7) {
        this.useCount += delta(z7);
        if (z7) {
            return;
        }
        this.shared = true;
    }

    public final boolean isActive() {
        return this.useCount > 0;
    }

    protected boolean isEmpty() {
        return isUnconfinedQueueEmpty();
    }

    public final boolean isUnconfinedLoopActive() {
        return this.useCount >= delta(true);
    }

    public final boolean isUnconfinedQueueEmpty() {
        kotlin.collections.g gVar = this.unconfinedQueue;
        if (gVar != null) {
            return gVar.isEmpty();
        }
        return true;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i8) {
        kotlinx.coroutines.internal.q.checkParallelism(i8);
        return this;
    }

    public long processNextEvent() {
        return !processUnconfinedEvent() ? Long.MAX_VALUE : 0L;
    }

    public final boolean processUnconfinedEvent() {
        r0 r0Var;
        kotlin.collections.g gVar = this.unconfinedQueue;
        if (gVar == null || (r0Var = (r0) gVar.removeFirstOrNull()) == null) {
            return false;
        }
        r0Var.run();
        return true;
    }

    public boolean shouldBeProcessedFromContext() {
        return false;
    }

    public void shutdown() {
    }
}
