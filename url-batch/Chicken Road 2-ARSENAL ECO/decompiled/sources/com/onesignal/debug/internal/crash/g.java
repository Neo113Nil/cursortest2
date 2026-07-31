package com.onesignal.debug.internal.crash;

/* loaded from: classes.dex */
public final class g implements j {
    private final long durationMs;

    public g(long j4) {
        this.durationMs = j4;
    }

    public static /* synthetic */ g copy$default(g gVar, long j4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j4 = gVar.durationMs;
        }
        return gVar.copy(j4);
    }

    public final long component1() {
        return this.durationMs;
    }

    public final g copy(long j4) {
        return new g(j4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.durationMs == ((g) obj).durationMs;
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public int hashCode() {
        return Long.hashCode(this.durationMs);
    }

    public String toString() {
        return "ForegroundAnr(durationMs=" + this.durationMs + ')';
    }
}
