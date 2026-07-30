package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
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
public final class Booleans {

    @GwtCompatible
    private static class BooleanArrayAsList extends AbstractList<Boolean> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final boolean[] array;
        final int end;
        final int start;

        BooleanArrayAsList(boolean[] zArr) {
            this(zArr, 0, zArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Boolean) && Booleans.indexOf(this.array, ((Boolean) obj).booleanValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BooleanArrayAsList)) {
                return super.equals(obj);
            }
            BooleanArrayAsList booleanArrayAsList = (BooleanArrayAsList) obj;
            int size = size();
            if (booleanArrayAsList.size() != size) {
                return false;
            }
            for (int i8 = 0; i8 < size; i8++) {
                if (this.array[this.start + i8] != booleanArrayAsList.array[booleanArrayAsList.start + i8]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i8 = 1;
            for (int i9 = this.start; i9 < this.end; i9++) {
                i8 = (i8 * 31) + Booleans.hashCode(this.array[i9]);
            }
            return i8;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int indexOf;
            if (!(obj instanceof Boolean) || (indexOf = Booleans.indexOf(this.array, ((Boolean) obj).booleanValue(), this.start, this.end)) < 0) {
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
            if (!(obj instanceof Boolean) || (lastIndexOf = Booleans.lastIndexOf(this.array, ((Boolean) obj).booleanValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return lastIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Boolean> subList(int i8, int i9) {
            Preconditions.checkPositionIndexes(i8, i9, size());
            if (i8 == i9) {
                return Collections.emptyList();
            }
            boolean[] zArr = this.array;
            int i10 = this.start;
            return new BooleanArrayAsList(zArr, i8 + i10, i10 + i9);
        }

        boolean[] toBooleanArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 7);
            sb.append(this.array[this.start] ? "[true" : "[false");
            int i8 = this.start;
            while (true) {
                i8++;
                if (i8 >= this.end) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(this.array[i8] ? ", true" : ", false");
            }
        }

        BooleanArrayAsList(boolean[] zArr, int i8, int i9) {
            this.array = zArr;
            this.start = i8;
            this.end = i9;
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean get(int i8) {
            Preconditions.checkElementIndex(i8, size());
            return Boolean.valueOf(this.array[this.start + i8]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean set(int i8, Boolean bool) {
            Preconditions.checkElementIndex(i8, size());
            boolean[] zArr = this.array;
            int i9 = this.start;
            boolean z7 = zArr[i9 + i8];
            zArr[i9 + i8] = ((Boolean) Preconditions.checkNotNull(bool)).booleanValue();
            return Boolean.valueOf(z7);
        }
    }

    private enum BooleanComparator implements Comparator<Boolean> {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");

        private final String toString;
        private final int trueValue;

        BooleanComparator(int i8, String str) {
            this.trueValue = i8;
            this.toString = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.toString;
        }

        @Override // java.util.Comparator
        public int compare(Boolean bool, Boolean bool2) {
            return (bool2.booleanValue() ? this.trueValue : 0) - (bool.booleanValue() ? this.trueValue : 0);
        }
    }

    private enum LexicographicalComparator implements Comparator<boolean[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(boolean[] zArr, boolean[] zArr2) {
            int min = Math.min(zArr.length, zArr2.length);
            for (int i8 = 0; i8 < min; i8++) {
                int compare = Booleans.compare(zArr[i8], zArr2[i8]);
                if (compare != 0) {
                    return compare;
                }
            }
            return zArr.length - zArr2.length;
        }
    }

    private Booleans() {
    }

    public static List<Boolean> asList(boolean... zArr) {
        return zArr.length == 0 ? Collections.emptyList() : new BooleanArrayAsList(zArr);
    }

    public static int compare(boolean z7, boolean z8) {
        if (z7 == z8) {
            return 0;
        }
        return z7 ? 1 : -1;
    }

    public static boolean[] concat(boolean[]... zArr) {
        int i8 = 0;
        for (boolean[] zArr2 : zArr) {
            i8 += zArr2.length;
        }
        boolean[] zArr3 = new boolean[i8];
        int i9 = 0;
        for (boolean[] zArr4 : zArr) {
            System.arraycopy(zArr4, 0, zArr3, i9, zArr4.length);
            i9 += zArr4.length;
        }
        return zArr3;
    }

    public static boolean contains(boolean[] zArr, boolean z7) {
        for (boolean z8 : zArr) {
            if (z8 == z7) {
                return true;
            }
        }
        return false;
    }

    @Beta
    public static int countTrue(boolean... zArr) {
        int i8 = 0;
        for (boolean z7 : zArr) {
            if (z7) {
                i8++;
            }
        }
        return i8;
    }

    public static boolean[] ensureCapacity(boolean[] zArr, int i8, int i9) {
        Preconditions.checkArgument(i8 >= 0, "Invalid minLength: %s", i8);
        Preconditions.checkArgument(i9 >= 0, "Invalid padding: %s", i9);
        return zArr.length < i8 ? Arrays.copyOf(zArr, i8 + i9) : zArr;
    }

    @Beta
    public static Comparator<Boolean> falseFirst() {
        return BooleanComparator.FALSE_FIRST;
    }

    public static int hashCode(boolean z7) {
        return z7 ? 1231 : 1237;
    }

    public static int indexOf(boolean[] zArr, boolean z7) {
        return indexOf(zArr, z7, 0, zArr.length);
    }

    public static String join(String str, boolean... zArr) {
        Preconditions.checkNotNull(str);
        if (zArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(zArr.length * 7);
        sb.append(zArr[0]);
        for (int i8 = 1; i8 < zArr.length; i8++) {
            sb.append(str);
            sb.append(zArr[i8]);
        }
        return sb.toString();
    }

    public static int lastIndexOf(boolean[] zArr, boolean z7) {
        return lastIndexOf(zArr, z7, 0, zArr.length);
    }

    public static Comparator<boolean[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static void reverse(boolean[] zArr) {
        Preconditions.checkNotNull(zArr);
        reverse(zArr, 0, zArr.length);
    }

    public static boolean[] toArray(Collection<Boolean> collection) {
        if (collection instanceof BooleanArrayAsList) {
            return ((BooleanArrayAsList) collection).toBooleanArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i8 = 0; i8 < length; i8++) {
            zArr[i8] = ((Boolean) Preconditions.checkNotNull(array[i8])).booleanValue();
        }
        return zArr;
    }

    @Beta
    public static Comparator<Boolean> trueFirst() {
        return BooleanComparator.TRUE_FIRST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(boolean[] zArr, boolean z7, int i8, int i9) {
        while (i8 < i9) {
            if (zArr[i8] == z7) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(boolean[] zArr, boolean z7, int i8, int i9) {
        for (int i10 = i9 - 1; i10 >= i8; i10--) {
            if (zArr[i10] == z7) {
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
    public static int indexOf(boolean[] zArr, boolean[] zArr2) {
        Preconditions.checkNotNull(zArr, "array");
        Preconditions.checkNotNull(zArr2, "target");
        if (zArr2.length == 0) {
            return 0;
        }
        int i8 = 0;
        while (i8 < (zArr.length - zArr2.length) + 1) {
            for (int i9 = 0; i9 < zArr2.length; i9++) {
                if (zArr[i8 + i9] != zArr2[i9]) {
                    break;
                }
            }
            return i8;
        }
        return -1;
    }

    public static void reverse(boolean[] zArr, int i8, int i9) {
        Preconditions.checkNotNull(zArr);
        Preconditions.checkPositionIndexes(i8, i9, zArr.length);
        for (int i10 = i9 - 1; i8 < i10; i10--) {
            boolean z7 = zArr[i8];
            zArr[i8] = zArr[i10];
            zArr[i10] = z7;
            i8++;
        }
    }
}
