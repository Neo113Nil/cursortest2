package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import java.util.Arrays;
import javax.annotation.CheckForNull;
import y5.u;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class CompactHashing {
    private static final int BYTE_MASK = 255;
    private static final int BYTE_MAX_SIZE = 256;
    static final int DEFAULT_SIZE = 3;
    static final int HASH_TABLE_BITS_MASK = 31;
    private static final int HASH_TABLE_BITS_MAX_BITS = 5;
    static final int MAX_SIZE = 1073741823;
    private static final int MIN_HASH_TABLE_SIZE = 4;
    static final int MODIFICATION_COUNT_INCREMENT = 32;
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_MAX_SIZE = 65536;
    static final byte UNSET = 0;

    private CompactHashing() {
    }

    static Object createTable(int i8) {
        if (i8 >= 2 && i8 <= 1073741824 && Integer.highestOneBit(i8) == i8) {
            return i8 <= 256 ? new byte[i8] : i8 <= 65536 ? new short[i8] : new int[i8];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i8);
        throw new IllegalArgumentException(sb.toString());
    }

    static int getHashPrefix(int i8, int i9) {
        return i8 & (~i9);
    }

    static int getNext(int i8, int i9) {
        return i8 & i9;
    }

    static int maskCombine(int i8, int i9, int i10) {
        return (i8 & (~i10)) | (i9 & i10);
    }

    static int newCapacity(int i8) {
        return (i8 < 32 ? 4 : 2) * (i8 + 1);
    }

    static int remove(@CheckForNull Object obj, @CheckForNull Object obj2, int i8, Object obj3, int[] iArr, Object[] objArr, @CheckForNull Object[] objArr2) {
        int i9;
        int i10;
        int smearedHash = Hashing.smearedHash(obj);
        int i11 = smearedHash & i8;
        int tableGet = tableGet(obj3, i11);
        if (tableGet == 0) {
            return -1;
        }
        int hashPrefix = getHashPrefix(smearedHash, i8);
        int i12 = -1;
        while (true) {
            i9 = tableGet - 1;
            i10 = iArr[i9];
            if (getHashPrefix(i10, i8) != hashPrefix || !Objects.equal(obj, objArr[i9]) || (objArr2 != null && !Objects.equal(obj2, objArr2[i9]))) {
                int next = getNext(i10, i8);
                if (next == 0) {
                    return -1;
                }
                i12 = i9;
                tableGet = next;
            }
        }
        int next2 = getNext(i10, i8);
        if (i12 == -1) {
            tableSet(obj3, i11, next2);
        } else {
            iArr[i12] = maskCombine(iArr[i12], next2, i8);
        }
        return i9;
    }

    static void tableClear(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    static int tableGet(Object obj, int i8) {
        return obj instanceof byte[] ? ((byte[]) obj)[i8] & 255 : obj instanceof short[] ? ((short[]) obj)[i8] & u.MAX_VALUE : ((int[]) obj)[i8];
    }

    static void tableSet(Object obj, int i8, int i9) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i8] = (byte) i9;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i8] = (short) i9;
        } else {
            ((int[]) obj)[i8] = i9;
        }
    }

    static int tableSize(int i8) {
        return Math.max(4, Hashing.closedTableSize(i8 + 1, 1.0d));
    }
}
