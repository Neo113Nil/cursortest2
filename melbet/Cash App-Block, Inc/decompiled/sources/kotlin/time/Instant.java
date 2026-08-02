package kotlin.time;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Instant implements Comparable, Serializable {
    public final long epochSeconds;
    public final int nanosecondsOfSecond;
    public static final Companion Companion = new Companion();
    public static final Instant MIN = new Instant(-31557014167219200L, 0);
    public static final Instant MAX = new Instant(31556889864403199L, 999999999);

    public final class Companion {
        public static Instant fromEpochSeconds(int i, long j) {
            long j2 = i;
            long j3 = j2 / 1000000000;
            if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
                j3--;
            }
            long j4 = j + j3;
            if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
                return j > 0 ? Instant.MAX : Instant.MIN;
            }
            if (j4 < -31557014167219200L) {
                return Instant.MIN;
            }
            if (j4 > 31556889864403199L) {
                return Instant.MAX;
            }
            long j5 = j2 % 1000000000;
            return new Instant(j4, (int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)));
        }
    }

    public Instant(long j, int i) {
        this.epochSeconds = j;
        this.nanosecondsOfSecond = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            a$$ExternalSyntheticBUOutline0.m$3("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        instant.getClass();
        int compare = Intrinsics.compare(this.epochSeconds, instant.epochSeconds);
        return compare != 0 ? compare : Intrinsics.compare(this.nanosecondsOfSecond, instant.nanosecondsOfSecond);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.epochSeconds == instant.epochSeconds && this.nanosecondsOfSecond == instant.nanosecondsOfSecond;
    }

    public final int hashCode() {
        return (this.nanosecondsOfSecond * 51) + Long.hashCode(this.epochSeconds);
    }

    public final String toString() {
        return InstantKt.access$formatIso(this);
    }
}
