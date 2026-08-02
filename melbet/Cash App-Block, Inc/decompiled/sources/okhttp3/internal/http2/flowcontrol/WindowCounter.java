package okhttp3.internal.http2.flowcontrol;

/* loaded from: classes3.dex */
public final class WindowCounter {
    public long acknowledged;
    public final int streamId;
    public long total;

    public WindowCounter(int i) {
        this.streamId = i;
    }

    public static void update$default(WindowCounter windowCounter, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        synchronized (windowCounter) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j2 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j3 = windowCounter.total + j;
                windowCounter.total = j3;
                long j4 = windowCounter.acknowledged + j2;
                windowCounter.acknowledged = j4;
                if (j4 > j3) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized long getUnacknowledged() {
        return this.total - this.acknowledged;
    }

    public final String toString() {
        return "WindowCounter(streamId=" + this.streamId + ", total=" + this.total + ", acknowledged=" + this.acknowledged + ", unacknowledged=" + getUnacknowledged() + ')';
    }
}
