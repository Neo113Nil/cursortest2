package com.onesignal.debug.internal.crash;

/* loaded from: classes.dex */
public final class h implements j {
    private final long actualSleepMs;
    private final long expectedSleepMs;

    public h(long j4, long j7) {
        this.actualSleepMs = j4;
        this.expectedSleepMs = j7;
    }

    public static /* synthetic */ h copy$default(h hVar, long j4, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j4 = hVar.actualSleepMs;
        }
        if ((i7 & 2) != 0) {
            j7 = hVar.expectedSleepMs;
        }
        return hVar.copy(j4, j7);
    }

    public final long component1() {
        return this.actualSleepMs;
    }

    public final long component2() {
        return this.expectedSleepMs;
    }

    public final h copy(long j4, long j7) {
        return new h(j4, j7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.actualSleepMs == hVar.actualSleepMs && this.expectedSleepMs == hVar.expectedSleepMs;
    }

    public final long getActualSleepMs() {
        return this.actualSleepMs;
    }

    public final long getExpectedSleepMs() {
        return this.expectedSleepMs;
    }

    public int hashCode() {
        return Long.hashCode(this.expectedSleepMs) + (Long.hashCode(this.actualSleepMs) * 31);
    }

    public String toString() {
        return "FrozenProcess(actualSleepMs=" + this.actualSleepMs + ", expectedSleepMs=" + this.expectedSleepMs + ')';
    }
}
