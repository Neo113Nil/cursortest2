package com.onesignal.debug.internal.crash;

/* loaded from: classes.dex */
public final class f implements j {
    private final long durationMs;
    private final boolean inForeground;
    private final long sinceLastReportMs;

    public f(long j4, long j7, boolean z5) {
        this.durationMs = j4;
        this.sinceLastReportMs = j7;
        this.inForeground = z5;
    }

    public static /* synthetic */ f copy$default(f fVar, long j4, long j7, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j4 = fVar.durationMs;
        }
        long j8 = j4;
        if ((i7 & 2) != 0) {
            j7 = fVar.sinceLastReportMs;
        }
        long j9 = j7;
        if ((i7 & 4) != 0) {
            z5 = fVar.inForeground;
        }
        return fVar.copy(j8, j9, z5);
    }

    public final long component1() {
        return this.durationMs;
    }

    public final long component2() {
        return this.sinceLastReportMs;
    }

    public final boolean component3() {
        return this.inForeground;
    }

    public final f copy(long j4, long j7, boolean z5) {
        return new f(j4, j7, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.durationMs == fVar.durationMs && this.sinceLastReportMs == fVar.sinceLastReportMs && this.inForeground == fVar.inForeground;
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

    public int hashCode() {
        return Boolean.hashCode(this.inForeground) + ((Long.hashCode(this.sinceLastReportMs) + (Long.hashCode(this.durationMs) * 31)) * 31);
    }

    public String toString() {
        return "Deduped(durationMs=" + this.durationMs + ", sinceLastReportMs=" + this.sinceLastReportMs + ", inForeground=" + this.inForeground + ')';
    }
}
