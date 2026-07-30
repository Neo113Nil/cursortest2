package kotlinx.coroutines.scheduling;

/* loaded from: classes5.dex */
public abstract class g implements Runnable {
    public long submissionTime;
    public h taskContext;

    public g(long j8, h hVar) {
        this.submissionTime = j8;
        this.taskContext = hVar;
    }

    public final int getMode$kotlinx_coroutines_core() {
        return this.taskContext.getTaskMode();
    }

    public g() {
        this(0L, k.NonBlockingContext);
    }
}
