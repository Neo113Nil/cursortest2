package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
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
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class Shorts extends ShortsMethodsForWeb {
    public static final int BYTES = 2;
    public static final short MAX_POWER_OF_TWO = 16384;

    private enum LexicographicalComparator implements Comparator<short[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Shorts.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(short[] sArr, short[] sArr2) {
            int min = Math.min(sArr.length, sArr2.length);
            for (int i8 = 0; i8 < min; i8++) {
                int compare = Shorts.compare(sArr[i8], sArr2[i8]);
                if (compare != 0) {
                    return compare;
                }
            }
            return sArr.length - sArr2.length;
        }
    }

    @GwtCompatible
    private static class ShortArrayAsList extends AbstractList<Short> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final short[] array;
        final int end;
        final int start;

        ShortArrayAsList(short[] sArr) {
            this(sArr, 0, sArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Short) && Shorts.indexOf(this.array, ((Short) obj).shortValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShortArrayAsList)) {
                return super.equals(obj);
            }
            ShortArrayAsList shortArrayAsList = (ShortArrayAsList) obj;
            int size = size();
            if (shortArrayAsList.size() != size) {
                return false;
            }
            for (int i8 = 0; i8 < size; i8++) {
                if (this.array[this.start + i8] != shortArrayAsList.array[shortArrayAsList.start + i8]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i8 = 1;
            for (int i9 = this.start; i9 < this.end; i9++) {
                i8 = (i8 * 31) + Shorts.hashCode(this.array[i9]);
            }
            return i8;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int indexOf;
            if (!(obj instanceof Short) || (indexOf = Shorts.indexOf(this.array, ((Short) obj).shortValue(), this.start, this.end)) < 0) {
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
            if (!(obj instanceof Short) || (lastIndexOf = Shorts.lastIndexOf(this.array, ((Short) obj).shortValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return lastIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Short> subList(int i8, int i9) {
            Preconditions.checkPositionIndexes(i8, i9, size());
            if (i8 == i9) {
                return Collections.emptyList();
            }
            short[] sArr = this.array;
            int i10 = this.start;
            return new ShortArrayAsList(sArr, i8 + i10, i10 + i9);
        }

        short[] toShortArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 6);
            sb.append('[');
            sb.append((int) this.array[this.start]);
            int i8 = this.start;
            while (true) {
                i8++;
                if (i8 >= this.end) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append((int) this.array[i8]);
            }
        }

        ShortArrayAsList(short[] sArr, int i8, int i9) {
            this.array = sArr;
            this.start = i8;
            this.end = i9;
        }

        @Override // java.util.AbstractList, java.util.List
        public Short get(int i8) {
            Preconditions.checkElementIndex(i8, size());
            return Short.valueOf(this.array[this.start + i8]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Short set(int i8, Short sh) {
            Preconditions.checkElementIndex(i8, size());
            short[] sArr = this.array;
            int i9 = this.start;
            short s7 = sArr[i9 + i8];
            sArr[i9 + i8] = ((Short) Preconditions.checkNotNull(sh)).shortValue();
            return Short.valueOf(s7);
        }
    }

    private static final class ShortConverter extends Converter<String, Short> implements Serializable {
        static final ShortConverter INSTANCE = new ShortConverter();
        private static final long serialVersionUID = 1;

        private ShortConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Shorts.stringConverter()";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public String doBackward(Short sh) {
            return sh.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public Short doForward(String str) {
            return Short.decode(str);
        }
    }

    private Shorts() {
    }

    public static List<Short> asList(short... sArr) {
        return sArr.length == 0 ? Collections.emptyList() : new ShortArrayAsList(sArr);
    }

    public static short checkedCast(long j8) {
        short s7 = (short) j8;
        Preconditions.checkArgument(((long) s7) == j8, "Out of range: %s", j8);
        return s7;
    }

    public static int compare(short s7, short s8) {
        return s7 - s8;
    }

    public static short[] concat(short[]... sArr) {
        int i8 = 0;
        for (short[] sArr2 : sArr) {
            i8 += sArr2.length;
        }
        short[] sArr3 = new short[i8];
        int i9 = 0;
        for (short[] sArr4 : sArr) {
            System.arraycopy(sArr4, 0, sArr3, i9, sArr4.length);
            i9 += sArr4.length;
        }
        return sArr3;
    }

    @Beta
    public static short constrainToRange(short s7, short s8, short s9) {
        Preconditions.checkArgument(s8 <= s9, "min (%s) must be less than or equal to max (%s)", (int) s8, (int) s9);
        return s7 < s8 ? s8 : s7 < s9 ? s7 : s9;
    }

    public static boolean contains(short[] sArr, short s7) {
        for (short s8 : sArr) {
            if (s8 == s7) {
                return true;
            }
        }
        return false;
    }

    public static short[] ensureCapacity(short[] sArr, int i8, int i9) {
        Preconditions.checkArgument(i8 >= 0, "Invalid minLength: %s", i8);
        Preconditions.checkArgument(i9 >= 0, "Invalid padding: %s", i9);
        return sArr.length < i8 ? Arrays.copyOf(sArr, i8 + i9) : sArr;
    }

    @GwtIncompatible
    public static short fromByteArray(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 2, "array too small: %s < %s", bArr.length, 2);
        return fromBytes(bArr[0], bArr[1]);
    }

    @GwtIncompatible
    public static short fromBytes(byte b8, byte b9) {
        return (short) ((b8 << 8) | (b9 & 255));
    }

    public static int hashCode(short s7) {
        return s7;
    }

    public static int indexOf(short[] sArr, short s7) {
        return indexOf(sArr, s7, 0, sArr.length);
    }

    public static String join(String str, short... sArr) {
        Preconditions.checkNotNull(str);
        if (sArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(sArr.length * 6);
        sb.append((int) sArr[0]);
        for (int i8 = 1; i8 < sArr.length; i8++) {
            sb.append(str);
            sb.append((int) sArr[i8]);
        }
        return sb.toString();
    }

    public static int lastIndexOf(short[] sArr, short s7) {
        return lastIndexOf(sArr, s7, 0, sArr.length);
    }

    public static Comparator<short[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short max(short... sArr) {
        Preconditions.checkArgument(sArr.length > 0);
        short s7 = sArr[0];
        for (int i8 = 1; i8 < sArr.length; i8++) {
            short s8 = sArr[i8];
            if (s8 > s7) {
                s7 = s8;
            }
        }
        return s7;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short min(short... sArr) {
        Preconditions.checkArgument(sArr.length > 0);
        short s7 = sArr[0];
        for (int i8 = 1; i8 < sArr.length; i8++) {
            short s8 = sArr[i8];
            if (s8 < s7) {
                s7 = s8;
            }
        }
        return s7;
    }

    public static void reverse(short[] sArr) {
        Preconditions.checkNotNull(sArr);
        reverse(sArr, 0, sArr.length);
    }

    public static short saturatedCast(long j8) {
        if (j8 > 32767) {
            return Short.MAX_VALUE;
        }
        if (j8 < -32768) {
            return Short.MIN_VALUE;
        }
        return (short) j8;
    }

    public static void sortDescending(short[] sArr) {
        Preconditions.checkNotNull(sArr);
        sortDescending(sArr, 0, sArr.length);
    }

    @Beta
    public static Converter<String, Short> stringConverter() {
        return ShortConverter.INSTANCE;
    }

    public static short[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof ShortArrayAsList) {
            return ((ShortArrayAsList) collection).toShortArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        short[] sArr = new short[length];
        for (int i8 = 0; i8 < length; i8++) {
            sArr[i8] = ((Number) Preconditions.checkNotNull(array[i8])).shortValue();
        }
        return sArr;
    }

    @GwtIncompatible
    public static byte[] toByteArray(short s7) {
        return new byte[]{(byte) (s7 >> 8), (byte) s7};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(short[] sArr, short s7, int i8, int i9) {
        while (i8 < i9) {
            if (sArr[i8] == s7) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(short[] sArr, short s7, int i8, int i9) {
        for (int i10 = i9 - 1; i10 >= i8; i10--) {
            if (sArr[i10] == s7) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int indexOf(short[] sArr, short[] sArr2) {
        Preconditions.checkNotNull(sArr, "array");
        Preconditions.checkNotNull(sArr2, "target");
        if (sArr2.length == 0) {
            return 0;
        }
        int i8 = 0;
        while (i8 < (sArr.length - sArr2.length) + 1) {
            for (int i9 = 0; i9 < sArr2.length; i9++) {
                if (sArr[i8 + i9] != sArr2[i9]) {
                    break;
                }
            }
            return i8;
        }
        return -1;
    }

    public static void reverse(short[] sArr, int i8, int i9) {
        Preconditions.checkNotNull(sArr);
        Preconditions.checkPositionIndexes(i8, i9, sArr.length);
        for (int i10 = i9 - 1; i8 < i10; i10--) {
            short s7 = sArr[i8];
            sArr[i8] = sArr[i10];
            sArr[i10] = s7;
            i8++;
        }
    }

    public static void sortDescending(short[] sArr, int i8, int i9) {
        Preconditions.checkNotNull(sArr);
        Preconditions.checkPositionIndexes(i8, i9, sArr.length);
        Arrays.sort(sArr, i8, i9);
        reverse(sArr, i8, i9);
    }
}
