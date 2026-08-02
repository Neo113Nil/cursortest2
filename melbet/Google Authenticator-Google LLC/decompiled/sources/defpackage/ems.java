package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ems {
    public final long a;
    public final long b;

    public ems(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static ems a() {
        return new ems(SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ems) {
            ems emsVar = (ems) obj;
            if (this.a == emsVar.a && this.b == emsVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "PrimesInstant{elapsedRealtimeMs=" + this.a + ", uptimeMillis=" + this.b + "}";
    }

    public ems() {
        throw null;
    }
}
