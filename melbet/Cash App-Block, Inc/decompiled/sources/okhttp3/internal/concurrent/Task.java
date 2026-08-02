package okhttp3.internal.concurrent;

/* loaded from: classes3.dex */
public abstract class Task {
    public final boolean cancelable;
    public final String name;
    public long nextExecuteNanoTime;
    public TaskQueue queue;

    public Task(String str, boolean z) {
        str.getClass();
        this.name = str;
        this.cancelable = z;
        this.nextExecuteNanoTime = -1L;
    }

    public abstract long runOnce();

    public final String toString() {
        return this.name;
    }
}
