package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import okhttp3.HttpUrl;

@Immutable
@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class ImmutableIntArray implements Serializable {
    private static final ImmutableIntArray EMPTY = new ImmutableIntArray(new int[0]);
    private final int[] array;
    private final int end;
    private final transient int start;

    static class AsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        private final ImmutableIntArray parent;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof AsList) {
                return this.parent.equals(((AsList) obj).parent);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i8 = this.parent.start;
            for (Object obj2 : list) {
                if (obj2 instanceof Integer) {
                    int i9 = i8 + 1;
                    if (this.parent.array[i8] == ((Integer) obj2).intValue()) {
                        i8 = i9;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.parent.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            if (obj instanceof Integer) {
                return this.parent.indexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            if (obj instanceof Integer) {
                return this.parent.lastIndexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i8, int i9) {
            return this.parent.subArray(i8, i9).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.parent.toString();
        }

        private AsList(ImmutableIntArray immutableIntArray) {
            this.parent = immutableIntArray;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i8) {
            return Integer.valueOf(this.parent.get(i8));
        }
    }

    public static Builder builder(int i8) {
        Preconditions.checkArgument(i8 >= 0, "Invalid initialCapacity: %s", i8);
        return new Builder(i8);
    }

    public static ImmutableIntArray copyOf(int[] iArr) {
        return iArr.length == 0 ? EMPTY : new ImmutableIntArray(Arrays.copyOf(iArr, iArr.length));
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    public static ImmutableIntArray of() {
        return EMPTY;
    }

    public List<Integer> asList() {
        return new AsList();
    }

    public boolean contains(int i8) {
        return indexOf(i8) >= 0;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableIntArray)) {
            return false;
        }
        ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
        if (length() != immutableIntArray.length()) {
            return false;
        }
        for (int i8 = 0; i8 < length(); i8++) {
            if (get(i8) != immutableIntArray.get(i8)) {
                return false;
            }
        }
        return true;
    }

    public int get(int i8) {
        Preconditions.checkElementIndex(i8, length());
        return this.array[this.start + i8];
    }

    public int hashCode() {
        int i8 = 1;
        for (int i9 = this.start; i9 < this.end; i9++) {
            i8 = (i8 * 31) + Ints.hashCode(this.array[i9]);
        }
        return i8;
    }

    public int indexOf(int i8) {
        for (int i9 = this.start; i9 < this.end; i9++) {
            if (this.array[i9] == i8) {
                return i9 - this.start;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.start;
    }

    public int lastIndexOf(int i8) {
        int i9;
        int i10 = this.end;
        do {
            i10--;
            i9 = this.start;
            if (i10 < i9) {
                return -1;
            }
        } while (this.array[i10] != i8);
        return i10 - i9;
    }

    public int length() {
        return this.end - this.start;
    }

    Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }

    public ImmutableIntArray subArray(int i8, int i9) {
        Preconditions.checkPositionIndexes(i8, i9, length());
        if (i8 == i9) {
            return EMPTY;
        }
        int[] iArr = this.array;
        int i10 = this.start;
        return new ImmutableIntArray(iArr, i8 + i10, i10 + i9);
    }

    public int[] toArray() {
        return Arrays.copyOfRange(this.array, this.start, this.end);
    }

    public String toString() {
        if (isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(length() * 5);
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

    public ImmutableIntArray trimmed() {
        return isPartialView() ? new ImmutableIntArray(toArray()) : this;
    }

    Object writeReplace() {
        return trimmed();
    }

    private ImmutableIntArray(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static ImmutableIntArray copyOf(Collection<Integer> collection) {
        return collection.isEmpty() ? EMPTY : new ImmutableIntArray(Ints.toArray(collection));
    }

    public static ImmutableIntArray of(int i8) {
        return new ImmutableIntArray(new int[]{i8});
    }

    @CanIgnoreReturnValue
    public static final class Builder {
        private int[] array;
        private int count = 0;

        Builder(int i8) {
            this.array = new int[i8];
        }

        private void ensureRoomFor(int i8) {
            int i9 = this.count + i8;
            int[] iArr = this.array;
            if (i9 > iArr.length) {
                this.array = Arrays.copyOf(iArr, expandedCapacity(iArr.length, i9));
            }
        }

        private static int expandedCapacity(int i8, int i9) {
            if (i9 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i10 = i8 + (i8 >> 1) + 1;
            if (i10 < i9) {
                i10 = Integer.highestOneBit(i9 - 1) << 1;
            }
            if (i10 < 0) {
                return Integer.MAX_VALUE;
            }
            return i10;
        }

        public Builder add(int i8) {
            ensureRoomFor(1);
            int[] iArr = this.array;
            int i9 = this.count;
            iArr[i9] = i8;
            this.count = i9 + 1;
            return this;
        }

        public Builder addAll(int[] iArr) {
            ensureRoomFor(iArr.length);
            System.arraycopy(iArr, 0, this.array, this.count, iArr.length);
            this.count += iArr.length;
            return this;
        }

        @CheckReturnValue
        public ImmutableIntArray build() {
            if (this.count == 0) {
                return ImmutableIntArray.EMPTY;
            }
            return new ImmutableIntArray(this.array, 0, this.count);
        }

        public Builder addAll(Iterable<Integer> iterable) {
            if (iterable instanceof Collection) {
                return addAll((Collection<Integer>) iterable);
            }
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next().intValue());
            }
            return this;
        }

        public Builder addAll(Collection<Integer> collection) {
            ensureRoomFor(collection.size());
            for (Integer num : collection) {
                int[] iArr = this.array;
                int i8 = this.count;
                this.count = i8 + 1;
                iArr[i8] = num.intValue();
            }
            return this;
        }

        public Builder addAll(ImmutableIntArray immutableIntArray) {
            ensureRoomFor(immutableIntArray.length());
            System.arraycopy(immutableIntArray.array, immutableIntArray.start, this.array, this.count, immutableIntArray.length());
            this.count += immutableIntArray.length();
            return this;
        }
    }

    private ImmutableIntArray(int[] iArr, int i8, int i9) {
        this.array = iArr;
        this.start = i8;
        this.end = i9;
    }

    public static Builder builder() {
        return new Builder(10);
    }

    public static ImmutableIntArray copyOf(Iterable<Integer> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection<Integer>) iterable);
        }
        return builder().addAll(iterable).build();
    }

    public static ImmutableIntArray of(int i8, int i9) {
        return new ImmutableIntArray(new int[]{i8, i9});
    }

    public static ImmutableIntArray of(int i8, int i9, int i10) {
        return new ImmutableIntArray(new int[]{i8, i9, i10});
    }

    public static ImmutableIntArray of(int i8, int i9, int i10, int i11) {
        return new ImmutableIntArray(new int[]{i8, i9, i10, i11});
    }

    public static ImmutableIntArray of(int i8, int i9, int i10, int i11, int i12) {
        return new ImmutableIntArray(new int[]{i8, i9, i10, i11, i12});
    }

    public static ImmutableIntArray of(int i8, int i9, int i10, int i11, int i12, int i13) {
        return new ImmutableIntArray(new int[]{i8, i9, i10, i11, i12, i13});
    }

    public static ImmutableIntArray of(int i8, int... iArr) {
        Preconditions.checkArgument(iArr.length <= 2147483646, "the total number of elements must fit in an int");
        int[] iArr2 = new int[iArr.length + 1];
        iArr2[0] = i8;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new ImmutableIntArray(iArr2);
    }
}
