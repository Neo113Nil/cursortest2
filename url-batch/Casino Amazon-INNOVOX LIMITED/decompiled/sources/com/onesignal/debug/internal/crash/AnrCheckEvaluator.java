package com.onesignal.debug.internal.crash;

import com.onesignal.core.BuildConfig;
import com.onesignal.debug.internal.crash.AnrCheckResult;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnrCheckEvaluator.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0010J \u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u001a\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/onesignal/debug/internal/crash/AnrCheckEvaluator;", "", "anrThresholdMs", "", "checkIntervalMs", "backgroundThresholdMs", "frozenSlackMs", "dedupWindowMs", "now", "Lkotlin/Function0;", "(JJJJJLkotlin/jvm/functions/Function0;)V", "lastBackgroundReportTime", "Ljava/util/concurrent/atomic/AtomicLong;", "lastForegroundReportTime", "lastResponseTime", "clearReportTimestamps", "", "evaluate", "Lcom/onesignal/debug/internal/crash/AnrCheckResult;", "actualSleepMs", "inForeground", "", "recordHeartbeat", "reportOrDedup", "durationMs", "lastReportHolder", "resetBaseline", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnrCheckEvaluator {
    private static final long NEVER_REPORTED = 0;
    private final long anrThresholdMs;
    private final long backgroundThresholdMs;
    private final long checkIntervalMs;
    private final long dedupWindowMs;
    private final long frozenSlackMs;
    private final AtomicLong lastBackgroundReportTime;
    private final AtomicLong lastForegroundReportTime;
    private final AtomicLong lastResponseTime;
    private final Function0<Long> now;

    /* compiled from: AnrCheckEvaluator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockClassification.values().length];
            try {
                iArr[BlockClassification.FROZEN_PROCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockClassification.RESPONSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlockClassification.FOREGROUND_ANR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlockClassification.BACKGROUND_WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AnrCheckEvaluator(long j, long j2, long j3, long j4, long j5, Function0<Long> now) {
        Intrinsics.checkNotNullParameter(now, "now");
        this.anrThresholdMs = j;
        this.checkIntervalMs = j2;
        this.backgroundThresholdMs = j3;
        this.frozenSlackMs = j4;
        this.dedupWindowMs = j5;
        this.now = now;
        this.lastResponseTime = new AtomicLong(now.invoke().longValue());
        this.lastForegroundReportTime = new AtomicLong(0L);
        this.lastBackgroundReportTime = new AtomicLong(0L);
    }

    public final void resetBaseline() {
        this.lastResponseTime.set(this.now.invoke().longValue());
    }

    public final void recordHeartbeat() {
        this.lastResponseTime.set(this.now.invoke().longValue());
    }

    public final AnrCheckResult evaluate(long actualSleepMs, boolean inForeground) {
        long longValue = this.now.invoke().longValue() - this.lastResponseTime.get();
        int i = WhenMappings.$EnumSwitchMapping$0[AnrCheckEvaluatorKt.classifyBlock(longValue, actualSleepMs, this.checkIntervalMs, this.frozenSlackMs, this.anrThresholdMs, this.backgroundThresholdMs, inForeground).ordinal()];
        if (i == 1) {
            this.lastResponseTime.set(this.now.invoke().longValue());
            return new AnrCheckResult.FrozenProcess(actualSleepMs, this.checkIntervalMs);
        }
        if (i == 2) {
            clearReportTimestamps();
            return AnrCheckResult.Responsive.INSTANCE;
        }
        if (i == 3) {
            return reportOrDedup(longValue, this.lastForegroundReportTime, true);
        }
        if (i == 4) {
            return reportOrDedup(longValue, this.lastBackgroundReportTime, false);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final AnrCheckResult reportOrDedup(long durationMs, AtomicLong lastReportHolder, boolean inForeground) {
        long longValue = this.now.invoke().longValue();
        long j = lastReportHolder.get();
        if (j != 0) {
            long j2 = longValue - j;
            if (j2 <= this.dedupWindowMs) {
                return new AnrCheckResult.Deduped(durationMs, j2, inForeground);
            }
        }
        lastReportHolder.set(longValue);
        if (inForeground) {
            return new AnrCheckResult.ForegroundAnr(durationMs);
        }
        return new AnrCheckResult.BackgroundWarning(durationMs);
    }

    private final void clearReportTimestamps() {
        this.lastForegroundReportTime.set(0L);
        this.lastBackgroundReportTime.set(0L);
    }
}
