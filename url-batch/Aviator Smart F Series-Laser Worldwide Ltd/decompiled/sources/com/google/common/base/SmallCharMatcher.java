package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.CharMatcher;
import java.util.BitSet;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class SmallCharMatcher extends CharMatcher.NamedFastMatcher {
    private static final int C1 = -862048943;
    private static final int C2 = 461845907;
    private static final double DESIRED_LOAD_FACTOR = 0.5d;
    static final int MAX_SIZE = 1023;
    private final boolean containsZero;
    private final long filter;
    private final char[] table;

    private SmallCharMatcher(char[] cArr, long j8, boolean z7, String str) {
        super(str);
        this.table = cArr;
        this.filter = j8;
        this.containsZero = z7;
    }

    private boolean checkFilter(int i8) {
        return 1 == ((this.filter >> i8) & 1);
    }

    @VisibleForTesting
    static int chooseTableSize(int i8) {
        if (i8 == 1) {
            return 2;
        }
        int highestOneBit = Integer.highestOneBit(i8 - 1) << 1;
        while (highestOneBit * 0.5d < i8) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    static CharMatcher from(BitSet bitSet, String str) {
        int i8;
        int cardinality = bitSet.cardinality();
        boolean z7 = bitSet.get(0);
        int chooseTableSize = chooseTableSize(cardinality);
        char[] cArr = new char[chooseTableSize];
        int i9 = chooseTableSize - 1;
        int nextSetBit = bitSet.nextSetBit(0);
        long j8 = 0;
        while (nextSetBit != -1) {
            long j9 = (1 << nextSetBit) | j8;
            int smear = smear(nextSetBit);
            while (true) {
                i8 = smear & i9;
                if (cArr[i8] == 0) {
                    break;
                }
                smear = i8 + 1;
            }
            cArr[i8] = (char) nextSetBit;
            nextSetBit = bitSet.nextSetBit(nextSetBit + 1);
            j8 = j9;
        }
        return new SmallCharMatcher(cArr, j8, z7, str);
    }

    static int smear(int i8) {
        return Integer.rotateLeft(i8 * (-862048943), 15) * C2;
    }

    @Override // com.google.common.base.CharMatcher
    public boolean matches(char c8) {
        if (c8 == 0) {
            return this.containsZero;
        }
        if (!checkFilter(c8)) {
            return false;
        }
        int length = this.table.length - 1;
        int smear = smear(c8) & length;
        int i8 = smear;
        do {
            char c9 = this.table[i8];
            if (c9 == 0) {
                return false;
            }
            if (c9 == c8) {
                return true;
            }
            i8 = (i8 + 1) & length;
        } while (i8 != smear);
        return false;
    }

    @Override // com.google.common.base.CharMatcher
    void setBits(BitSet bitSet) {
        if (this.containsZero) {
            bitSet.set(0);
        }
        for (char c8 : this.table) {
            if (c8 != 0) {
                bitSet.set(c8);
            }
        }
    }
}
