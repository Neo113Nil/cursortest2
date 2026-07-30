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
public final class ImmutableLongArray implements Serializable {
    private static final ImmutableLongArray EMPTY = new ImmutableLongArray(new long[0]);
    private final long[] array;
    private final int end;
    private final transient int start;

    static class AsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private final ImmutableLongArray parent;

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
                if (obj2 instanceof Long) {
                    int i9 = i8 + 1;
                    if (this.parent.array[i8] == ((Long) obj2).longValue()) {
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
            if (obj instanceof Long) {
                return this.parent.indexOf(((Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            if (obj instanceof Long) {
                return this.parent.lastIndexOf(((Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i8, int i9) {
            return this.parent.subArray(i8, i9).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.parent.toString();
        }

        private AsList(ImmutableLongArray immutableLongArray) {
            this.parent = immutableLongArray;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int i8) {
            return Long.valueOf(this.parent.get(i8));
        }
    }

    public static Builder builder(int i8) {
        Preconditions.checkArgument(i8 >= 0, "Invalid initialCapacity: %s", i8);
        return new Builder(i8);
    }

    public static ImmutableLongArray copyOf(long[] jArr) {
        return jArr.length == 0 ? EMPTY : new ImmutableLongArray(Arrays.copyOf(jArr, jArr.length));
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    public static ImmutableLongArray of() {
        return EMPTY;
    }

    public List<Long> asList() {
        return new AsList();
    }

    public boolean contains(long j8) {
        return indexOf(j8) >= 0;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableLongArray)) {
            return false;
        }
        ImmutableLongArray immutableLongArray = (ImmutableLongArray) obj;
        if (length() != immutableLongArray.length()) {
            return false;
        }
        for (int i8 = 0; i8 < length(); i8++) {
            if (get(i8) != immutableLongArray.get(i8)) {
                return false;
            }
        }
        return true;
    }

    public long get(int i8) {
        Preconditions.checkElementIndex(i8, length());
        return this.array[this.start + i8];
    }

    public int hashCode() {
        int i8 = 1;
        for (int i9 = this.start; i9 < this.end; i9++) {
            i8 = (i8 * 31) + Longs.hashCode(this.array[i9]);
        }
        return i8;
    }

    public int indexOf(long j8) {
        for (int i8 = this.start; i8 < this.end; i8++) {
            if (this.array[i8] == j8) {
                return i8 - this.start;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.start;
    }

    public int lastIndexOf(long j8) {
        int i8;
        int i9 = this.end;
        do {
            i9--;
            i8 = this.start;
            if (i9 < i8) {
                return -1;
            }
        } while (this.array[i9] != j8);
        return i9 - i8;
    }

    public int length() {
        return this.end - this.start;
    }

    Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }

    public ImmutableLongArray subArray(int i8, int i9) {
        Preconditions.checkPositionIndexes(i8, i9, length());
        if (i8 == i9) {
            return EMPTY;
        }
        long[] jArr = this.array;
        int i10 = this.start;
        return new ImmutableLongArray(jArr, i8 + i10, i10 + i9);
    }

    public long[] toArray() {
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

    public ImmutableLongArray trimmed() {
        return isPartialView() ? new ImmutableLongArray(toArray()) : this;
    }

    Object writeReplace() {
        return trimmed();
    }

    private ImmutableLongArray(long[] jArr) {
        this(jArr, 0, jArr.length);
    }

    public static ImmutableLongArray of(long j8) {
        return new ImmutableLongArray(new long[]{j8});
    }

    @CanIgnoreReturnValue
    public static final class Builder {
        private long[] array;
        private int count = 0;

        Builder(int i8) {
            this.array = new long[i8];
        }

        private void ensureRoomFor(int i8) {
            int i9 = this.count + i8;
            long[] jArr = this.array;
            if (i9 > jArr.length) {
                this.array = Arrays.copyOf(jArr, expandedCapacity(jArr.length, i9));
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

        public Builder add(long j8) {
            ensureRoomFor(1);
            long[] jArr = this.array;
            int i8 = this.count;
            jArr[i8] = j8;
            this.count = i8 + 1;
            return this;
        }

        public Builder addAll(long[] jArr) {
            ensureRoomFor(jArr.length);
            System.arraycopy(jArr, 0, this.array, this.count, jArr.length);
            this.count += jArr.length;
            return this;
        }

        @CheckReturnValue
        public ImmutableLongArray build() {
            if (this.count == 0) {
                return ImmutableLongArray.EMPTY;
            }
            return new ImmutableLongArray(this.array, 0, this.count);
        }

        public Builder addAll(Iterable<Long> iterable) {
            if (iterable instanceof Collection) {
                return addAll((Collection<Long>) iterable);
            }
            Iterator<Long> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next().longValue());
            }
            return this;
        }

        public Builder addAll(Collection<Long> collection) {
            ensureRoomFor(collection.size());
            for (Long l8 : collection) {
                long[] jArr = this.array;
                int i8 = this.count;
                this.count = i8 + 1;
                jArr[i8] = l8.longValue();
            }
            return this;
        }

        public Builder addAll(ImmutableLongArray immutableLongArray) {
            ensureRoomFor(immutableLongArray.length());
            System.arraycopy(immutableLongArray.array, immutableLongArray.start, this.array, this.count, immutableLongArray.length());
            this.count += immutableLongArray.length();
            return this;
        }
    }

    private ImmutableLongArray(long[] jArr, int i8, int i9) {
        this.array = jArr;
        this.start = i8;
        this.end = i9;
    }

    public static Builder builder() {
        return new Builder(10);
    }

    public static ImmutableLongArray copyOf(Collection<Long> collection) {
        return collection.isEmpty() ? EMPTY : new ImmutableLongArray(Longs.toArray(collection));
    }

    public static ImmutableLongArray of(long j8, long j9) {
        return new ImmutableLongArray(new long[]{j8, j9});
    }

    public static ImmutableLongArray copyOf(Iterable<Long> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection<Long>) iterable);
        }
        return builder().addAll(iterable).build();
    }

    public static ImmutableLongArray of(long j8, long j9, long j10) {
        return new ImmutableLongArray(new long[]{j8, j9, j10});
    }

    public static ImmutableLongArray of(long j8, long j9, long j10, long j11) {
        return new ImmutableLongArray(new long[]{j8, j9, j10, j11});
    }

    public static ImmutableLongArray of(long j8, long j9, long j10, long j11, long j12) {
        return new ImmutableLongArray(new long[]{j8, j9, j10, j11, j12});
    }

    public static ImmutableLongArray of(long j8, long j9, long j10, long j11, long j12, long j13) {
        return new ImmutableLongArray(new long[]{j8, j9, j10, j11, j12, j13});
    }

    public static ImmutableLongArray of(long j8, long... jArr) {
        Preconditions.checkArgument(jArr.length <= 2147483646, "the total number of elements must fit in an int");
        long[] jArr2 = new long[jArr.length + 1];
        jArr2[0] = j8;
        System.arraycopy(jArr, 0, jArr2, 1, jArr.length);
        return new ImmutableLongArray(jArr2);
    }
}
