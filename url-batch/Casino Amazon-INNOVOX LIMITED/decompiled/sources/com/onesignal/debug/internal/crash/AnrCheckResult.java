package com.onesignal.debug.internal.crash;

import com.onesignal.core.BuildConfig;
import kotlin.Metadata;

/* compiled from: AnrCheckEvaluator.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/onesignal/debug/internal/crash/AnrCheckResult;", "", "BackgroundWarning", "Deduped", "ForegroundAnr", "FrozenProcess", "Responsive", "Lcom/onesignal/debug/internal/crash/AnrCheckResult$BackgroundWarning;", "Lcom/onesignal/debug/internal/crash/AnrCheckResult$Deduped;", "Lcom/onesignal/debug/internal/crash/AnrCheckResult$ForegroundAnr;", "Lcom/onesignal/debug/internal/crash/AnrCheckResult$FrozenProcess;", "Lcom/onesignal/debug/internal/crash/AnrCheckResult$Responsive;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AnrCheckResult {

    /* compiled from: AnrCheckEvaluator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onesignal/debug/internal/crash/AnrCheckResult$Responsive;", "Lcom/onesignal/debug/internal/crash/AnrCheckResult;", "()V", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Responsive implements AnrCheckResult {
        public static final Responsive INSTANCE = new Responsive();

        private Responsive() {
        }
    }

    /* compiled from: AnrCheckEvaluator.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/onesignal/debug/internal/crash/AnrCheckResult$FrozenProcess;", "Lcom/onesignal/debug/internal/crash/AnrCheckResult;", "actualSleepMs", "", "expectedSleepMs", "(JJ)V", "getActualSleepMs", "()J", "getExpectedSleepMs", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FrozenProcess implements AnrCheckResult {
        private final long actualSleepMs;
        private final long expectedSleepMs;

        public static /* synthetic */ FrozenProcess copy$default(FrozenProcess frozenProcess, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = frozenProcess.actualSleepMs;
            }
            if ((i & 2) != 0) {
                j2 = frozenProcess.expectedSleepMs;
            }
            return frozenProcess.copy(j, j2);
        }

        /* renamed from: component1, reason: from getter */
        public final long getActualSleepMs() {
            return this.actualSleepMs;
        }

        /* renamed from: component2, reason: from getter */
        public final long getExpectedSleepMs() {
            return this.expectedSleepMs;
        }

        public final FrozenProcess copy(long actualSleepMs, long expectedSleepMs) {
            return new FrozenProcess(actualSleepMs, expectedSleepMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FrozenProcess)) {
                return false;
            }
            FrozenProcess frozenProcess = (FrozenProcess) other;
            return this.actualSleepMs == frozenProcess.actualSleepMs && this.expectedSleepMs == frozenProcess.expectedSleepMs;
        }

        public int hashCode() {
            return (Long.hashCode(this.actualSleepMs) * 31) + Long.hashCode(this.expectedSleepMs);
        }

        public String toString() {
            return "FrozenProcess(actualSleepMs=" + this.actualSleepMs + ", expectedSleepMs=" + this.expectedSleepMs + ')';
        }

        public FrozenProcess(long j, long j2) {
            this.actualSleepMs = j;
            this.expectedSleepMs = j2;
        }

        public final long getActualSleepMs() {
            return this.actualSleepMs;
        }

        public final long getExpectedSleepMs() {
            return this.expectedSleepMs;
        }
    }

    /* compiled from: AnrCheckEvaluator.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/onesignal/debug/internal/crash/AnrCheckResult$Deduped;", "Lcom/onesignal/debug/internal/crash/AnrCheckResult;", "durationMs", "", "sinceLastReportMs", "inForeground", "", "(JJZ)V", "getDurationMs", "()J", "getInForeground", "()Z", "getSinceLastReportMs", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Deduped implements AnrCheckResult {
        private final long durationMs;
        private final boolean inForeground;
        private final long sinceLastReportMs;

        public static /* synthetic */ Deduped copy$default(Deduped deduped, long j, long j2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                j = deduped.durationMs;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = deduped.sinceLastReportMs;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                z = deduped.inForeground;
            }
            return deduped.copy(j3, j4, z);
        }

        /* renamed from: component1, reason: from getter */
        public final long getDurationMs() {
            return this.durationMs;
        }

        /* renamed from: component2, reason: from getter */
        public final long getSinceLastReportMs() {
            return this.sinceLastReportMs;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getInForeground() {
            return this.inForeground;
        }

        public final Deduped copy(long durationMs, long sinceLastReportMs, boolean inForeground) {
            return new Deduped(durationMs, sinceLastReportMs, inForeground);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Deduped)) {
                return false;
            }
            Deduped deduped = (Deduped) other;
            return this.durationMs == deduped.durationMs && this.sinceLastReportMs == deduped.sinceLastReportMs && this.inForeground == deduped.inForeground;
        }

        public int hashCode() {
            return (((Long.hashCode(this.durationMs) * 31) + Long.hashCode(this.sinceLastReportMs)) * 31) + Boolean.hashCode(this.inForeground);
        }

        public String toString() {
            return "Deduped(durationMs=" + this.durationMs + ", sinceLastReportMs=" + this.sinceLastReportMs + ", inForeground=" + this.inForeground + ')';
        }

        public Deduped(long j, long j2, boolean z) {
            this.durationMs = j;
            this.sinceLastReportMs = j2;
            this.inForeground = z;
        }

        public final long getDurationMs() {
            return this.durationMs;
        }

        public final boolean getInForeground() {
            return this.inForeground;
        }

        public final long getSinceLastReportMs() {
            return this.sinceLastReportMs;
        }
    }

    /* compiled from: AnrCheckEvaluator.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onesignal/debug/internal/crash/AnrCheckResult$ForegroundAnr;", "Lcom/onesignal/debug/internal/crash/AnrCheckResult;", "durationMs", "", "(J)V", "getDurationMs", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ForegroundAnr implements AnrCheckResult {
        private final long durationMs;

        public static /* synthetic */ ForegroundAnr copy$default(ForegroundAnr foregroundAnr, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = foregroundAnr.durationMs;
            }
            return foregroundAnr.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getDurationMs() {
            return this.durationMs;
        }

        public final ForegroundAnr copy(long durationMs) {
            return new ForegroundAnr(durationMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ForegroundAnr) && this.durationMs == ((ForegroundAnr) other).durationMs;
        }

        public int hashCode() {
            return Long.hashCode(this.durationMs);
        }

        public String toString() {
            return "ForegroundAnr(durationMs=" + this.durationMs + ')';
        }

        public ForegroundAnr(long j) {
            this.durationMs = j;
        }

        public final long getDurationMs() {
            return this.durationMs;
        }
    }

    /* compiled from: AnrCheckEvaluator.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onesignal/debug/internal/crash/AnrCheckResult$BackgroundWarning;", "Lcom/onesignal/debug/internal/crash/AnrCheckResult;", "durationMs", "", "(J)V", "getDurationMs", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BackgroundWarning implements AnrCheckResult {
        private final long durationMs;

        public static /* synthetic */ BackgroundWarning copy$default(BackgroundWarning backgroundWarning, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = backgroundWarning.durationMs;
            }
            return backgroundWarning.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getDurationMs() {
            return this.durationMs;
        }

        public final BackgroundWarning copy(long durationMs) {
            return new BackgroundWarning(durationMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BackgroundWarning) && this.durationMs == ((BackgroundWarning) other).durationMs;
        }

        public int hashCode() {
            return Long.hashCode(this.durationMs);
        }

        public String toString() {
            return "BackgroundWarning(durationMs=" + this.durationMs + ')';
        }

        public BackgroundWarning(long j) {
            this.durationMs = j;
        }

        public final long getDurationMs() {
            return this.durationMs;
        }
    }
}
