package com.google.android.exoplayer2.util;

import androidx.annotation.GuardedBy;
import com.google.android.exoplayer2.C;
import java.util.concurrent.TimeoutException;

@Deprecated
/* loaded from: classes3.dex */
public final class TimestampAdjuster {
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    public static final long MODE_NO_OFFSET = Long.MAX_VALUE;
    public static final long MODE_SHARED = 9223372036854775806L;

    @GuardedBy("this")
    private long firstSampleTimestampUs;

    @GuardedBy("this")
    private long lastUnadjustedTimestampUs;
    private final ThreadLocal<Long> nextSampleTimestampUs = new ThreadLocal<>();

    @GuardedBy("this")
    private long timestampOffsetUs;

    public TimestampAdjuster(long j8) {
        reset(j8);
    }

    public static long ptsToUs(long j8) {
        return (j8 * 1000000) / 90000;
    }

    public static long usToNonWrappedPts(long j8) {
        return (j8 * 90000) / 1000000;
    }

    public static long usToWrappedPts(long j8) {
        return usToNonWrappedPts(j8) % MAX_PTS_PLUS_ONE;
    }

    public synchronized long adjustSampleTimestamp(long j8) {
        if (j8 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            if (!isInitialized()) {
                long j9 = this.firstSampleTimestampUs;
                if (j9 == MODE_SHARED) {
                    j9 = ((Long) Assertions.checkNotNull(this.nextSampleTimestampUs.get())).longValue();
                }
                this.timestampOffsetUs = j9 - j8;
                notifyAll();
            }
            this.lastUnadjustedTimestampUs = j8;
            return j8 + this.timestampOffsetUs;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long adjustTsTimestamp(long j8) {
        if (j8 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j9 = this.lastUnadjustedTimestampUs;
            if (j9 != C.TIME_UNSET) {
                long usToNonWrappedPts = usToNonWrappedPts(j9);
                long j10 = (4294967296L + usToNonWrappedPts) / MAX_PTS_PLUS_ONE;
                long j11 = ((j10 - 1) * MAX_PTS_PLUS_ONE) + j8;
                j8 += j10 * MAX_PTS_PLUS_ONE;
                if (Math.abs(j11 - usToNonWrappedPts) < Math.abs(j8 - usToNonWrappedPts)) {
                    j8 = j11;
                }
            }
            return adjustSampleTimestamp(ptsToUs(j8));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long getFirstSampleTimestampUs() {
        long j8;
        j8 = this.firstSampleTimestampUs;
        if (j8 == Long.MAX_VALUE || j8 == MODE_SHARED) {
            j8 = C.TIME_UNSET;
        }
        return j8;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long j8;
        try {
            j8 = this.lastUnadjustedTimestampUs;
        } catch (Throwable th) {
            throw th;
        }
        return j8 != C.TIME_UNSET ? j8 + this.timestampOffsetUs : getFirstSampleTimestampUs();
    }

    public synchronized long getTimestampOffsetUs() {
        return this.timestampOffsetUs;
    }

    public synchronized boolean isInitialized() {
        return this.timestampOffsetUs != C.TIME_UNSET;
    }

    public synchronized void reset(long j8) {
        this.firstSampleTimestampUs = j8;
        this.timestampOffsetUs = j8 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.lastUnadjustedTimestampUs = C.TIME_UNSET;
    }

    public synchronized void sharedInitializeOrWait(boolean z7, long j8, long j9) {
        try {
            Assertions.checkState(this.firstSampleTimestampUs == MODE_SHARED);
            if (isInitialized()) {
                return;
            }
            if (z7) {
                this.nextSampleTimestampUs.set(Long.valueOf(j8));
            } else {
                long j10 = 0;
                long j11 = j9;
                while (!isInitialized()) {
                    if (j9 == 0) {
                        wait();
                    } else {
                        Assertions.checkState(j11 > 0);
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        wait(j11);
                        j10 += android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (j10 >= j9 && !isInitialized()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j9 + " milliseconds");
                        }
                        j11 = j9 - j10;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
