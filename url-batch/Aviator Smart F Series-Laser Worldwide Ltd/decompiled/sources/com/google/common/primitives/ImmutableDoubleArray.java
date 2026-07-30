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
public final class ImmutableDoubleArray implements Serializable {
    private static final ImmutableDoubleArray EMPTY = new ImmutableDoubleArray(new double[0]);
    private final double[] array;
    private final int end;
    private final transient int start;

    static class AsList extends AbstractList<Double> implements RandomAccess, Serializable {
        private final ImmutableDoubleArray parent;

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
                if (obj2 instanceof Double) {
                    int i9 = i8 + 1;
                    if (ImmutableDoubleArray.areEqual(this.parent.array[i8], ((Double) obj2).doubleValue())) {
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
            if (obj instanceof Double) {
                return this.parent.indexOf(((Double) obj).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            if (obj instanceof Double) {
                return this.parent.lastIndexOf(((Double) obj).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i8, int i9) {
            return this.parent.subArray(i8, i9).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.parent.toString();
        }

        private AsList(ImmutableDoubleArray immutableDoubleArray) {
            this.parent = immutableDoubleArray;
        }

        @Override // java.util.AbstractList, java.util.List
        public Double get(int i8) {
            return Double.valueOf(this.parent.get(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean areEqual(double d8, double d9) {
        return Double.doubleToLongBits(d8) == Double.doubleToLongBits(d9);
    }

    public static Builder builder(int i8) {
        Preconditions.checkArgument(i8 >= 0, "Invalid initialCapacity: %s", i8);
        return new Builder(i8);
    }

    public static ImmutableDoubleArray copyOf(double[] dArr) {
        return dArr.length == 0 ? EMPTY : new ImmutableDoubleArray(Arrays.copyOf(dArr, dArr.length));
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    public static ImmutableDoubleArray of() {
        return EMPTY;
    }

    public List<Double> asList() {
        return new AsList();
    }

    public boolean contains(double d8) {
        return indexOf(d8) >= 0;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableDoubleArray)) {
            return false;
        }
        ImmutableDoubleArray immutableDoubleArray = (ImmutableDoubleArray) obj;
        if (length() != immutableDoubleArray.length()) {
            return false;
        }
        for (int i8 = 0; i8 < length(); i8++) {
            if (!areEqual(get(i8), immutableDoubleArray.get(i8))) {
                return false;
            }
        }
        return true;
    }

    public double get(int i8) {
        Preconditions.checkElementIndex(i8, length());
        return this.array[this.start + i8];
    }

    public int hashCode() {
        int i8 = 1;
        for (int i9 = this.start; i9 < this.end; i9++) {
            i8 = (i8 * 31) + Doubles.hashCode(this.array[i9]);
        }
        return i8;
    }

    public int indexOf(double d8) {
        for (int i8 = this.start; i8 < this.end; i8++) {
            if (areEqual(this.array[i8], d8)) {
                return i8 - this.start;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.start;
    }

    public int lastIndexOf(double d8) {
        int i8 = this.end;
        do {
            i8--;
            if (i8 < this.start) {
                return -1;
            }
        } while (!areEqual(this.array[i8], d8));
        return i8 - this.start;
    }

    public int length() {
        return this.end - this.start;
    }

    Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }

    public ImmutableDoubleArray subArray(int i8, int i9) {
        Preconditions.checkPositionIndexes(i8, i9, length());
        if (i8 == i9) {
            return EMPTY;
        }
        double[] dArr = this.array;
        int i10 = this.start;
        return new ImmutableDoubleArray(dArr, i8 + i10, i10 + i9);
    }

    public double[] toArray() {
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

    public ImmutableDoubleArray trimmed() {
        return isPartialView() ? new ImmutableDoubleArray(toArray()) : this;
    }

    Object writeReplace() {
        return trimmed();
    }

    private ImmutableDoubleArray(double[] dArr) {
        this(dArr, 0, dArr.length);
    }

    public static ImmutableDoubleArray of(double d8) {
        return new ImmutableDoubleArray(new double[]{d8});
    }

    @CanIgnoreReturnValue
    public static final class Builder {
        private double[] array;
        private int count = 0;

        Builder(int i8) {
            this.array = new double[i8];
        }

        private void ensureRoomFor(int i8) {
            int i9 = this.count + i8;
            double[] dArr = this.array;
            if (i9 > dArr.length) {
                this.array = Arrays.copyOf(dArr, expandedCapacity(dArr.length, i9));
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

        public Builder add(double d8) {
            ensureRoomFor(1);
            double[] dArr = this.array;
            int i8 = this.count;
            dArr[i8] = d8;
            this.count = i8 + 1;
            return this;
        }

        public Builder addAll(double[] dArr) {
            ensureRoomFor(dArr.length);
            System.arraycopy(dArr, 0, this.array, this.count, dArr.length);
            this.count += dArr.length;
            return this;
        }

        @CheckReturnValue
        public ImmutableDoubleArray build() {
            if (this.count == 0) {
                return ImmutableDoubleArray.EMPTY;
            }
            return new ImmutableDoubleArray(this.array, 0, this.count);
        }

        public Builder addAll(Iterable<Double> iterable) {
            if (iterable instanceof Collection) {
                return addAll((Collection<Double>) iterable);
            }
            Iterator<Double> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next().doubleValue());
            }
            return this;
        }

        public Builder addAll(Collection<Double> collection) {
            ensureRoomFor(collection.size());
            for (Double d8 : collection) {
                double[] dArr = this.array;
                int i8 = this.count;
                this.count = i8 + 1;
                dArr[i8] = d8.doubleValue();
            }
            return this;
        }

        public Builder addAll(ImmutableDoubleArray immutableDoubleArray) {
            ensureRoomFor(immutableDoubleArray.length());
            System.arraycopy(immutableDoubleArray.array, immutableDoubleArray.start, this.array, this.count, immutableDoubleArray.length());
            this.count += immutableDoubleArray.length();
            return this;
        }
    }

    private ImmutableDoubleArray(double[] dArr, int i8, int i9) {
        this.array = dArr;
        this.start = i8;
        this.end = i9;
    }

    public static Builder builder() {
        return new Builder(10);
    }

    public static ImmutableDoubleArray copyOf(Collection<Double> collection) {
        return collection.isEmpty() ? EMPTY : new ImmutableDoubleArray(Doubles.toArray(collection));
    }

    public static ImmutableDoubleArray of(double d8, double d9) {
        return new ImmutableDoubleArray(new double[]{d8, d9});
    }

    public static ImmutableDoubleArray copyOf(Iterable<Double> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection<Double>) iterable);
        }
        return builder().addAll(iterable).build();
    }

    public static ImmutableDoubleArray of(double d8, double d9, double d10) {
        return new ImmutableDoubleArray(new double[]{d8, d9, d10});
    }

    public static ImmutableDoubleArray of(double d8, double d9, double d10, double d11) {
        return new ImmutableDoubleArray(new double[]{d8, d9, d10, d11});
    }

    public static ImmutableDoubleArray of(double d8, double d9, double d10, double d11, double d12) {
        return new ImmutableDoubleArray(new double[]{d8, d9, d10, d11, d12});
    }

    public static ImmutableDoubleArray of(double d8, double d9, double d10, double d11, double d12, double d13) {
        return new ImmutableDoubleArray(new double[]{d8, d9, d10, d11, d12, d13});
    }

    public static ImmutableDoubleArray of(double d8, double... dArr) {
        Preconditions.checkArgument(dArr.length <= 2147483646, "the total number of elements must fit in an int");
        double[] dArr2 = new double[dArr.length + 1];
        dArr2[0] = d8;
        System.arraycopy(dArr, 0, dArr2, 1, dArr.length);
        return new ImmutableDoubleArray(dArr2);
    }
}
