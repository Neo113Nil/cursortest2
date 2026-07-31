package com.onesignal.debug.internal.crash;

import java.util.concurrent.atomic.AtomicLong;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class b {
    public static final a Companion = new a(null);
    private static final long NEVER_REPORTED = 0;
    private final long anrThresholdMs;
    private final long backgroundThresholdMs;
    private final long checkIntervalMs;
    private final long dedupWindowMs;
    private final long frozenSlackMs;
    private final AtomicLong lastBackgroundReportTime;
    private final AtomicLong lastForegroundReportTime;
    private final AtomicLong lastResponseTime;
    private final InterfaceC0732a now;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public b(long j4, long j7, long j8, long j9, long j10, InterfaceC0732a now) {
        kotlin.jvm.internal.i.e(now, "now");
        this.anrThresholdMs = j4;
        this.checkIntervalMs = j7;
        this.backgroundThresholdMs = j8;
        this.frozenSlackMs = j9;
        this.dedupWindowMs = j10;
        this.now = now;
        this.lastResponseTime = new AtomicLong(((Number) now.invoke()).longValue());
        this.lastForegroundReportTime = new AtomicLong(0L);
        this.lastBackgroundReportTime = new AtomicLong(0L);
    }

    private final void clearReportTimestamps() {
        this.lastForegroundReportTime.set(0L);
        this.lastBackgroundReportTime.set(0L);
    }

    private final j reportOrDedup(long j4, AtomicLong atomicLong, boolean z5) {
        long longValue = ((Number) this.now.invoke()).longValue();
        long j7 = atomicLong.get();
        if (j7 != 0) {
            long j8 = longValue - j7;
            if (j8 <= this.dedupWindowMs) {
                return new f(j4, j8, z5);
            }
        }
        atomicLong.set(longValue);
        return z5 ? new g(j4) : new e(j4);
    }

    public final j evaluate(long j4, boolean z5) {
        long longValue = ((Number) this.now.invoke()).longValue() - this.lastResponseTime.get();
        int i7 = c.$EnumSwitchMapping$0[d.classifyBlock(longValue, j4, this.checkIntervalMs, this.frozenSlackMs, this.anrThresholdMs, this.backgroundThresholdMs, z5).ordinal()];
        if (i7 == 1) {
            this.lastResponseTime.set(((Number) this.now.invoke()).longValue());
            return new h(j4, this.checkIntervalMs);
        }
        if (i7 == 2) {
            clearReportTimestamps();
            return i.INSTANCE;
        }
        if (i7 == 3) {
            return reportOrDedup(longValue, this.lastForegroundReportTime, true);
        }
        if (i7 == 4) {
            return reportOrDedup(longValue, this.lastBackgroundReportTime, false);
        }
        throw new H5.r();
    }

    public final void recordHeartbeat() {
        this.lastResponseTime.set(((Number) this.now.invoke()).longValue());
    }

    public final void resetBaseline() {
        this.lastResponseTime.set(((Number) this.now.invoke()).longValue());
    }
}
