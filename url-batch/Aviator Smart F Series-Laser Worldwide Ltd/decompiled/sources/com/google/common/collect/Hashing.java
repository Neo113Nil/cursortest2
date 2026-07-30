package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class Hashing {
    private static final long C1 = -862048943;
    private static final long C2 = 461845907;
    private static final int MAX_TABLE_SIZE = 1073741824;

    private Hashing() {
    }

    static int closedTableSize(int i8, double d8) {
        int max = Math.max(i8, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d8 * highestOneBit))) {
            return highestOneBit;
        }
        int i9 = highestOneBit << 1;
        if (i9 > 0) {
            return i9;
        }
        return 1073741824;
    }

    static boolean needsResizing(int i8, int i9, double d8) {
        return ((double) i8) > d8 * ((double) i9) && i9 < 1073741824;
    }

    static int smear(int i8) {
        return (int) (Integer.rotateLeft((int) (i8 * C1), 15) * C2);
    }

    static int smearedHash(@CheckForNull Object obj) {
        return smear(obj == null ? 0 : obj.hashCode());
    }
}
