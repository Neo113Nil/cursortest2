package ee;

import a2.r;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class f extends e {
    public static final long a(long j, d dVar) {
        long j3;
        int ordinal = dVar.ordinal();
        if (ordinal == 2) {
            j3 = 1;
        } else if (ordinal == 3) {
            j3 = 1000;
        } else if (ordinal == 4) {
            j3 = 60000;
        } else if (ordinal == 5) {
            j3 = 3600000;
        } else {
            if (ordinal != 6) {
                r.n(dVar, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j3 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j3 <= 4611686018427387903L) {
                return j3;
            }
        } else if (j3 != 1) {
            int numberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j3);
            if (numberOfLeadingZeros < 63) {
                return j * j3;
            }
            if (numberOfLeadingZeros <= 63) {
                long j10 = j * j3;
                if (j10 <= 4611686018427387903L) {
                    return j10;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }
}
