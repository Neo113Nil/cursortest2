package m6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class f extends e {
    public static final long b(long j, d unit) {
        long j7;
        Intrinsics.checkNotNullParameter(unit, "unit");
        int ordinal = unit.ordinal();
        if (ordinal == 2) {
            j7 = 1;
        } else if (ordinal == 3) {
            j7 = 1000;
        } else if (ordinal == 4) {
            j7 = 60000;
        } else if (ordinal == 5) {
            j7 = 3600000;
        } else {
            if (ordinal != 6) {
                throw new IllegalStateException(("Wrong unit for millisMultiplier: " + unit).toString());
            }
            j7 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j7 <= 4611686018427387903L) {
                return j7;
            }
        } else if (j7 != 1) {
            int numberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j7);
            if (numberOfLeadingZeros < 63) {
                return j * j7;
            }
            if (numberOfLeadingZeros <= 63) {
                long j8 = j * j7;
                if (j8 <= 4611686018427387903L) {
                    return j8;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }
}
