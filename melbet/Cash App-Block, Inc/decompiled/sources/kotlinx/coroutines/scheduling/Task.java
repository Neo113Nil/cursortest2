package kotlinx.coroutines.scheduling;

/* loaded from: classes3.dex */
public abstract class Task implements Runnable {
    public long submissionTime;
    public boolean taskContext;

    public Task(long j, boolean z) {
        this.submissionTime = j;
        this.taskContext = z;
    }
}
