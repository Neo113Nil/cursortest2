package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes4.dex */
public final class Longs {
    public static final int BYTES = 8;
    public static final long MAX_POWER_OF_TWO = 4611686018427387904L;

    static final class AsciiDigits {
        private static final byte[] asciiDigits;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i8 = 0; i8 < 10; i8++) {
                bArr[i8 + 48] = (byte) i8;
            }
            for (int i9 = 0; i9 < 26; i9++) {
                byte b8 = (byte) (i9 + 10);
                bArr[i9 + 65] = b8;
                bArr[i9 + 97] = b8;
            }
            asciiDigits = bArr;
        }

        private AsciiDigits() {
        }

        static int digit(char c8) {
            if (c8 < 128) {
                return asciiDigits[c8];
            }
            return -1;
        }
    }

    private enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Longs.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int min = Math.min(jArr.length, jArr2.length);
            for (int i8 = 0; i8 < min; i8++) {
                int compare = Longs.compare(jArr[i8], jArr2[i8]);
                if (compare != 0) {
                    return compare;
                }
            }
            return jArr.length - jArr2.length;
        }
    }

    @GwtCompatible
    private static class LongArrayAsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final long[] array;
        final int end;
        final int start;

        LongArrayAsList(long[] jArr) {
            this(jArr, 0, jArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Long) && Longs.indexOf(this.array, ((Long) obj).longValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LongArrayAsList)) {
                return super.equals(obj);
            }
            LongArrayAsList longArrayAsList = (LongArrayAsList) obj;
            int size = size();
            if (longArrayAsList.size() != size) {
                return false;
            }
            for (int i8 = 0; i8 < size; i8++) {
                if (this.array[this.start + i8] != longArrayAsList.array[longArrayAsList.start + i8]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i8 = 1;
            for (int i9 = this.start; i9 < this.end; i9++) {
                i8 = (i8 * 31) + Longs.hashCode(this.array[i9]);
            }
            return i8;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int indexOf;
            if (!(obj instanceof Long) || (indexOf = Longs.indexOf(this.array, ((Long) obj).longValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return indexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            int lastIndexOf;
            if (!(obj instanceof Long) || (lastIndexOf = Longs.lastIndexOf(this.array, ((Long) obj).longValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return lastIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i8, int i9) {
            Preconditions.checkPositionIndexes(i8, i9, size());
            if (i8 == i9) {
                return Collections.emptyList();
            }
            long[] jArr = this.array;
            int i10 = this.start;
            return new LongArrayAsList(jArr, i8 + i10, i10 + i9);
        }

        long[] toLongArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 10);
            sb.append('[');
            sb.append(this.array[this.start]);
            int i8 = this.start;
            while (true) {
                i8++;
                if (i8 >= this.end) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.array[i8]);
            }
        }

        LongArrayAsList(long[] jArr, int i8, int i9) {
            this.array = jArr;
            this.start = i8;
            this.end = i9;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int i8) {
            Preconditions.checkElementIndex(i8, size());
            return Long.valueOf(this.array[this.start + i8]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Long set(int i8, Long l8) {
            Preconditions.checkElementIndex(i8, size());
            long[] jArr = this.array;
            int i9 = this.start;
            long j8 = jArr[i9 + i8];
            jArr[i9 + i8] = ((Long) Preconditions.checkNotNull(l8)).longValue();
            return Long.valueOf(j8);
        }
    }

    private static final class LongConverter extends Converter<String, Long> implements Serializable {
        static final LongConverter INSTANCE = new LongConverter();
        private static final long serialVersionUID = 1;

        private LongConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Longs.stringConverter()";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public String doBackward(Long l8) {
            return l8.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public Long doForward(String str) {
            return Long.decode(str);
        }
    }

    private Longs() {
    }

    public static List<Long> asList(long... jArr) {
        return jArr.length == 0 ? Collections.emptyList() : new LongArrayAsList(jArr);
    }

    public static int compare(long j8, long j9) {
        if (j8 < j9) {
            return -1;
        }
        return j8 > j9 ? 1 : 0;
    }

    public static long[] concat(long[]... jArr) {
        int i8 = 0;
        for (long[] jArr2 : jArr) {
            i8 += jArr2.length;
        }
        long[] jArr3 = new long[i8];
        int i9 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i9, jArr4.length);
            i9 += jArr4.length;
        }
        return jArr3;
    }

    @Beta
    public static long constrainToRange(long j8, long j9, long j10) {
        Preconditions.checkArgument(j9 <= j10, "min (%s) must be less than or equal to max (%s)", j9, j10);
        return Math.min(Math.max(j8, j9), j10);
    }

    public static boolean contains(long[] jArr, long j8) {
        for (long j9 : jArr) {
            if (j9 == j8) {
                return true;
            }
        }
        return false;
    }

    public static long[] ensureCapacity(long[] jArr, int i8, int i9) {
        Preconditions.checkArgument(i8 >= 0, "Invalid minLength: %s", i8);
        Preconditions.checkArgument(i9 >= 0, "Invalid padding: %s", i9);
        return jArr.length < i8 ? Arrays.copyOf(jArr, i8 + i9) : jArr;
    }

    public static long fromByteArray(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 8, "array too small: %s < %s", bArr.length, 8);
        return fromBytes(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]);
    }

    public static long fromBytes(byte b8, byte b9, byte b10, byte b11, byte b12, byte b13, byte b14, byte b15) {
        return ((b9 & 255) << 48) | ((b8 & 255) << 56) | ((b10 & 255) << 40) | ((b11 & 255) << 32) | ((b12 & 255) << 24) | ((b13 & 255) << 16) | ((b14 & 255) << 8) | (b15 & 255);
    }

    public static int hashCode(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }

    public static int indexOf(long[] jArr, long j8) {
        return indexOf(jArr, j8, 0, jArr.length);
    }

    public static String join(String str, long... jArr) {
        Preconditions.checkNotNull(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(jArr.length * 10);
        sb.append(jArr[0]);
        for (int i8 = 1; i8 < jArr.length; i8++) {
            sb.append(str);
            sb.append(jArr[i8]);
        }
        return sb.toString();
    }

    public static int lastIndexOf(long[] jArr, long j8) {
        return lastIndexOf(jArr, j8, 0, jArr.length);
    }

    public static Comparator<long[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static long max(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long j8 = jArr[0];
        for (int i8 = 1; i8 < jArr.length; i8++) {
            long j9 = jArr[i8];
            if (j9 > j8) {
                j8 = j9;
            }
        }
        return j8;
    }

    public static long min(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long j8 = jArr[0];
        for (int i8 = 1; i8 < jArr.length; i8++) {
            long j9 = jArr[i8];
            if (j9 < j8) {
                j8 = j9;
            }
        }
        return j8;
    }

    public static void reverse(long[] jArr) {
        Preconditions.checkNotNull(jArr);
        reverse(jArr, 0, jArr.length);
    }

    public static void sortDescending(long[] jArr) {
        Preconditions.checkNotNull(jArr);
        sortDescending(jArr, 0, jArr.length);
    }

    @Beta
    public static Converter<String, Long> stringConverter() {
        return LongConverter.INSTANCE;
    }

    public static long[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof LongArrayAsList) {
            return ((LongArrayAsList) collection).toLongArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i8 = 0; i8 < length; i8++) {
            jArr[i8] = ((Number) Preconditions.checkNotNull(array[i8])).longValue();
        }
        return jArr;
    }

    public static byte[] toByteArray(long j8) {
        byte[] bArr = new byte[8];
        for (int i8 = 7; i8 >= 0; i8--) {
            bArr[i8] = (byte) (255 & j8);
            j8 >>= 8;
        }
        return bArr;
    }

    @Beta
    @CheckForNull
    public static Long tryParse(String str) {
        return tryParse(str, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(long[] jArr, long j8, int i8, int i9) {
        while (i8 < i9) {
            if (jArr[i8] == j8) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(long[] jArr, long j8, int i8, int i9) {
        for (int i10 = i9 - 1; i10 >= i8; i10--) {
            if (jArr[i10] == j8) {
                return i10;
            }
        }
        return -1;
    }

    @Beta
    @CheckForNull
    public static Long tryParse(String str, int i8) {
        if (((String) Preconditions.checkNotNull(str)).isEmpty()) {
            return null;
        }
        if (i8 < 2 || i8 > 36) {
            StringBuilder sb = new StringBuilder(65);
            sb.append("radix must be between MIN_RADIX and MAX_RADIX but was ");
            sb.append(i8);
            throw new IllegalArgumentException(sb.toString());
        }
        int i9 = str.charAt(0) == '-' ? 1 : 0;
        if (i9 == str.length()) {
            return null;
        }
        int i10 = i9 + 1;
        int digit = AsciiDigits.digit(str.charAt(i9));
        if (digit < 0 || digit >= i8) {
            return null;
        }
        long j8 = -digit;
        long j9 = i8;
        long j10 = Long.MIN_VALUE / j9;
        while (i10 < str.length()) {
            int i11 = i10 + 1;
            int digit2 = AsciiDigits.digit(str.charAt(i10));
            if (digit2 < 0 || digit2 >= i8 || j8 < j10) {
                return null;
            }
            long j11 = j8 * j9;
            long j12 = digit2;
            if (j11 < j12 - Long.MIN_VALUE) {
                return null;
            }
            j8 = j11 - j12;
            i10 = i11;
        }
        if (i9 != 0) {
            return Long.valueOf(j8);
        }
        if (j8 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int indexOf(long[] jArr, long[] jArr2) {
        Preconditions.checkNotNull(jArr, "array");
        Preconditions.checkNotNull(jArr2, "target");
        if (jArr2.length == 0) {
            return 0;
        }
        int i8 = 0;
        while (i8 < (jArr.length - jArr2.length) + 1) {
            for (int i9 = 0; i9 < jArr2.length; i9++) {
                if (jArr[i8 + i9] != jArr2[i9]) {
                    break;
                }
            }
            return i8;
        }
        return -1;
    }

    public static void reverse(long[] jArr, int i8, int i9) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i8, i9, jArr.length);
        for (int i10 = i9 - 1; i8 < i10; i10--) {
            long j8 = jArr[i8];
            jArr[i8] = jArr[i10];
            jArr[i10] = j8;
            i8++;
        }
    }

    public static void sortDescending(long[] jArr, int i8, int i9) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i8, i9, jArr.length);
        Arrays.sort(jArr, i8, i9);
        reverse(jArr, i8, i9);
    }
}
