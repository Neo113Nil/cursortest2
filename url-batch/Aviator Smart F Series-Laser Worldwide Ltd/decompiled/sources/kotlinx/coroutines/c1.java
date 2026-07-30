package kotlinx.coroutines;

/* loaded from: classes3.dex */
public abstract class c1 {
    private static final long MAX_DELAY_NS = 4611686018427387903L;
    private static final long MAX_MS = 9223372036854L;
    private static final long MS_TO_NS = 1000000;
    private static final int SCHEDULE_COMPLETED = 1;
    private static final int SCHEDULE_DISPOSED = 2;
    private static final int SCHEDULE_OK = 0;
    private static final kotlinx.coroutines.internal.g0 DISPOSED_TASK = new kotlinx.coroutines.internal.g0("REMOVED_TASK");
    private static final kotlinx.coroutines.internal.g0 CLOSED_EMPTY = new kotlinx.coroutines.internal.g0("CLOSED_EMPTY");

    public static final long delayNanosToMillis(long j8) {
        return j8 / 1000000;
    }

    public static final long delayToNanos(long j8) {
        if (j8 <= 0) {
            return 0L;
        }
        if (j8 >= MAX_MS) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j8;
    }
}
