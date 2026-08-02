package kotlin.time;

import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public class DurationUnitKt__DurationUnitKt extends DurationUnitKt__DurationUnitJvmKt {
    public static final long convertDurationUnitToMilliseconds(long j, DurationUnit durationUnit) {
        long j2;
        int ordinal = durationUnit.ordinal();
        if (ordinal == 2) {
            j2 = 1;
        } else if (ordinal == 3) {
            j2 = 1000;
        } else if (ordinal == 4) {
            j2 = 60000;
        } else if (ordinal == 5) {
            j2 = 3600000;
        } else {
            if (ordinal != 6) {
                Path$$ExternalSyntheticBUOutline0.m$1(durationUnit, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 != 1) {
            int numberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (numberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (numberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }

    public static final String shortName(DurationUnit durationUnit) {
        durationUnit.getClass();
        switch (durationUnit) {
            case NANOSECONDS:
                return "ns";
            case MICROSECONDS:
                return "us";
            case MILLISECONDS:
                return "ms";
            case SECONDS:
                return "s";
            case MINUTES:
                return "m";
            case HOURS:
                return "h";
            case DAYS:
                return "d";
            default:
                Path$$ExternalSyntheticBUOutline0.m$1(durationUnit, "Unknown unit: ");
                return null;
        }
    }
}
