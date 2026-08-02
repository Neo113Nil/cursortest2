package kotlin.time;

import kotlin.time.TimeSource;

/* loaded from: classes3.dex */
public final class MonotonicTimeSource implements TimeSource {
    public static final MonotonicTimeSource INSTANCE = new MonotonicTimeSource();
    public static final long zero = System.nanoTime();

    public static long read$1() {
        return System.nanoTime() - zero;
    }

    @Override // kotlin.time.TimeSource
    public final TimeMark markNow() {
        return new TimeSource.Monotonic.ValueTimeMark(read$1());
    }

    public final String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
