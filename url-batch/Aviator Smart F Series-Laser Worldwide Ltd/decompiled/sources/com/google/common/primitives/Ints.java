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
public final class Ints extends IntsMethodsForWeb {
    public static final int BYTES = 4;
    public static final int MAX_POWER_OF_TWO = 1073741824;

    @GwtCompatible
    private static class IntArrayAsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final int[] array;
        final int end;
        final int start;

        IntArrayAsList(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Integer) && Ints.indexOf(this.array, ((Integer) obj).intValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IntArrayAsList)) {
                return super.equals(obj);
            }
            IntArrayAsList intArrayAsList = (IntArrayAsList) obj;
            int size = size();
            if (intArrayAsList.size() != size) {
                return false;
            }
            for (int i8 = 0; i8 < size; i8++) {
                if (this.array[this.start + i8] != intArrayAsList.array[intArrayAsList.start + i8]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i8 = 1;
            for (int i9 = this.start; i9 < this.end; i9++) {
                i8 = (i8 * 31) + Ints.hashCode(this.array[i9]);
            }
            return i8;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int indexOf;
            if (!(obj instanceof Integer) || (indexOf = Ints.indexOf(this.array, ((Integer) obj).intValue(), this.start, this.end)) < 0) {
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
            if (!(obj instanceof Integer) || (lastIndexOf = Ints.lastIndexOf(this.array, ((Integer) obj).intValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return lastIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i8, int i9) {
            Preconditions.checkPositionIndexes(i8, i9, size());
            if (i8 == i9) {
                return Collections.emptyList();
            }
            int[] iArr = this.array;
            int i10 = this.start;
            return new IntArrayAsList(iArr, i8 + i10, i10 + i9);
        }

        int[] toIntArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
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

        IntArrayAsList(int[] iArr, int i8, int i9) {
            this.array = iArr;
            this.start = i8;
            this.end = i9;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i8) {
            Preconditions.checkElementIndex(i8, size());
            return Integer.valueOf(this.array[this.start + i8]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer set(int i8, Integer num) {
            Preconditions.checkElementIndex(i8, size());
            int[] iArr = this.array;
            int i9 = this.start;
            int i10 = iArr[i9 + i8];
            iArr[i9 + i8] = ((Integer) Preconditions.checkNotNull(num)).intValue();
            return Integer.valueOf(i10);
        }
    }

    private static final class IntConverter extends Converter<String, Integer> implements Serializable {
        static final IntConverter INSTANCE = new IntConverter();
        private static final long serialVersionUID = 1;

        private IntConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Ints.stringConverter()";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public String doBackward(Integer num) {
            return num.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public Integer doForward(String str) {
            return Integer.decode(str);
        }
    }

    private enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Ints.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int min = Math.min(iArr.length, iArr2.length);
            for (int i8 = 0; i8 < min; i8++) {
                int compare = Ints.compare(iArr[i8], iArr2[i8]);
                if (compare != 0) {
                    return compare;
                }
            }
            return iArr.length - iArr2.length;
        }
    }

    private Ints() {
    }

    public static List<Integer> asList(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new IntArrayAsList(iArr);
    }

    public static int checkedCast(long j8) {
        int i8 = (int) j8;
        Preconditions.checkArgument(((long) i8) == j8, "Out of range: %s", j8);
        return i8;
    }

    public static int compare(int i8, int i9) {
        if (i8 < i9) {
            return -1;
        }
        return i8 > i9 ? 1 : 0;
    }

    public static int[] concat(int[]... iArr) {
        int i8 = 0;
        for (int[] iArr2 : iArr) {
            i8 += iArr2.length;
        }
        int[] iArr3 = new int[i8];
        int i9 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i9, iArr4.length);
            i9 += iArr4.length;
        }
        return iArr3;
    }

    @Beta
    public static int constrainToRange(int i8, int i9, int i10) {
        Preconditions.checkArgument(i9 <= i10, "min (%s) must be less than or equal to max (%s)", i9, i10);
        return Math.min(Math.max(i8, i9), i10);
    }

    public static boolean contains(int[] iArr, int i8) {
        for (int i9 : iArr) {
            if (i9 == i8) {
                return true;
            }
        }
        return false;
    }

    public static int[] ensureCapacity(int[] iArr, int i8, int i9) {
        Preconditions.checkArgument(i8 >= 0, "Invalid minLength: %s", i8);
        Preconditions.checkArgument(i9 >= 0, "Invalid padding: %s", i9);
        return iArr.length < i8 ? Arrays.copyOf(iArr, i8 + i9) : iArr;
    }

    public static int fromByteArray(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return fromBytes(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int fromBytes(byte b8, byte b9, byte b10, byte b11) {
        return (b8 << 24) | ((b9 & 255) << 16) | ((b10 & 255) << 8) | (b11 & 255);
    }

    public static int hashCode(int i8) {
        return i8;
    }

    public static int indexOf(int[] iArr, int i8) {
        return indexOf(iArr, i8, 0, iArr.length);
    }

    public static String join(String str, int... iArr) {
        Preconditions.checkNotNull(str);
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(iArr.length * 5);
        sb.append(iArr[0]);
        for (int i8 = 1; i8 < iArr.length; i8++) {
            sb.append(str);
            sb.append(iArr[i8]);
        }
        return sb.toString();
    }

    public static int lastIndexOf(int[] iArr, int i8) {
        return lastIndexOf(iArr, i8, 0, iArr.length);
    }

    public static Comparator<int[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static int max(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0);
        int i8 = iArr[0];
        for (int i9 = 1; i9 < iArr.length; i9++) {
            int i10 = iArr[i9];
            if (i10 > i8) {
                i8 = i10;
            }
        }
        return i8;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static int min(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0);
        int i8 = iArr[0];
        for (int i9 = 1; i9 < iArr.length; i9++) {
            int i10 = iArr[i9];
            if (i10 < i8) {
                i8 = i10;
            }
        }
        return i8;
    }

    public static void reverse(int[] iArr) {
        Preconditions.checkNotNull(iArr);
        reverse(iArr, 0, iArr.length);
    }

    public static int saturatedCast(long j8) {
        if (j8 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j8 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j8;
    }

    public static void sortDescending(int[] iArr) {
        Preconditions.checkNotNull(iArr);
        sortDescending(iArr, 0, iArr.length);
    }

    @Beta
    public static Converter<String, Integer> stringConverter() {
        return IntConverter.INSTANCE;
    }

    public static int[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof IntArrayAsList) {
            return ((IntArrayAsList) collection).toIntArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            iArr[i8] = ((Number) Preconditions.checkNotNull(array[i8])).intValue();
        }
        return iArr;
    }

    public static byte[] toByteArray(int i8) {
        return new byte[]{(byte) (i8 >> 24), (byte) (i8 >> 16), (byte) (i8 >> 8), (byte) i8};
    }

    @Beta
    @CheckForNull
    public static Integer tryParse(String str) {
        return tryParse(str, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(int[] iArr, int i8, int i9, int i10) {
        while (i9 < i10) {
            if (iArr[i9] == i8) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(int[] iArr, int i8, int i9, int i10) {
        for (int i11 = i10 - 1; i11 >= i9; i11--) {
            if (iArr[i11] == i8) {
                return i11;
            }
        }
        return -1;
    }

    @Beta
    @CheckForNull
    public static Integer tryParse(String str, int i8) {
        Long tryParse = Longs.tryParse(str, i8);
        if (tryParse == null || tryParse.longValue() != tryParse.intValue()) {
            return null;
        }
        return Integer.valueOf(tryParse.intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int indexOf(int[] iArr, int[] iArr2) {
        Preconditions.checkNotNull(iArr, "array");
        Preconditions.checkNotNull(iArr2, "target");
        if (iArr2.length == 0) {
            return 0;
        }
        int i8 = 0;
        while (i8 < (iArr.length - iArr2.length) + 1) {
            for (int i9 = 0; i9 < iArr2.length; i9++) {
                if (iArr[i8 + i9] != iArr2[i9]) {
                    break;
                }
            }
            return i8;
        }
        return -1;
    }

    public static void reverse(int[] iArr, int i8, int i9) {
        Preconditions.checkNotNull(iArr);
        Preconditions.checkPositionIndexes(i8, i9, iArr.length);
        for (int i10 = i9 - 1; i8 < i10; i10--) {
            int i11 = iArr[i8];
            iArr[i8] = iArr[i10];
            iArr[i10] = i11;
            i8++;
        }
    }

    public static void sortDescending(int[] iArr, int i8, int i9) {
        Preconditions.checkNotNull(iArr);
        Preconditions.checkPositionIndexes(i8, i9, iArr.length);
        Arrays.sort(iArr, i8, i9);
        reverse(iArr, i8, i9);
    }
}
