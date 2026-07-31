package com.onesignal.debug.internal.crash;

/* loaded from: classes.dex */
public final class e implements j {
    private final long durationMs;

    public e(long j4) {
        this.durationMs = j4;
    }

    public static /* synthetic */ e copy$default(e eVar, long j4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j4 = eVar.durationMs;
        }
        return eVar.copy(j4);
    }

    public final long component1() {
        return this.durationMs;
    }

    public final e copy(long j4) {
        return new e(j4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.durationMs == ((e) obj).durationMs;
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public int hashCode() {
        return Long.hashCode(this.durationMs);
    }

    public String toString() {
        return "BackgroundWarning(durationMs=" + this.durationMs + ')';
    }
}
