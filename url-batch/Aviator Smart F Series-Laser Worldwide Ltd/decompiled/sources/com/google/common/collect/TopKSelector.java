package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class TopKSelector<T> {
    private final T[] buffer;
    private int bufferSize;
    private final Comparator<? super T> comparator;

    /* renamed from: k, reason: collision with root package name */
    private final int f14996k;

    @CheckForNull
    private T threshold;

    private TopKSelector(Comparator<? super T> comparator, int i8) {
        this.comparator = (Comparator) Preconditions.checkNotNull(comparator, "comparator");
        this.f14996k = i8;
        Preconditions.checkArgument(i8 >= 0, "k (%s) must be >= 0", i8);
        Preconditions.checkArgument(i8 <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i8);
        this.buffer = (T[]) new Object[IntMath.checkedMultiply(i8, 2)];
        this.bufferSize = 0;
        this.threshold = null;
    }

    public static <T extends Comparable<? super T>> TopKSelector<T> greatest(int i8) {
        return greatest(i8, Ordering.natural());
    }

    public static <T extends Comparable<? super T>> TopKSelector<T> least(int i8) {
        return least(i8, Ordering.natural());
    }

    private int partition(int i8, int i9, int i10) {
        Object uncheckedCastNullableTToT = NullnessCasts.uncheckedCastNullableTToT(this.buffer[i10]);
        T[] tArr = this.buffer;
        tArr[i10] = tArr[i9];
        int i11 = i8;
        while (i8 < i9) {
            if (this.comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(this.buffer[i8]), uncheckedCastNullableTToT) < 0) {
                swap(i11, i8);
                i11++;
            }
            i8++;
        }
        T[] tArr2 = this.buffer;
        tArr2[i9] = tArr2[i11];
        tArr2[i11] = uncheckedCastNullableTToT;
        return i11;
    }

    private void swap(int i8, int i9) {
        T[] tArr = this.buffer;
        T t7 = tArr[i8];
        tArr[i8] = tArr[i9];
        tArr[i9] = t7;
    }

    private void trim() {
        int i8 = (this.f14996k * 2) - 1;
        int log2 = IntMath.log2(i8, RoundingMode.CEILING) * 3;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i9 >= i8) {
                break;
            }
            int partition = partition(i9, i8, ((i9 + i8) + 1) >>> 1);
            int i12 = this.f14996k;
            if (partition <= i12) {
                if (partition >= i12) {
                    break;
                }
                i9 = Math.max(partition, i9 + 1);
                i11 = partition;
            } else {
                i8 = partition - 1;
            }
            i10++;
            if (i10 >= log2) {
                Arrays.sort(this.buffer, i9, i8 + 1, this.comparator);
                break;
            }
        }
        this.bufferSize = this.f14996k;
        this.threshold = (T) NullnessCasts.uncheckedCastNullableTToT(this.buffer[i11]);
        while (true) {
            i11++;
            if (i11 >= this.f14996k) {
                return;
            }
            if (this.comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(this.buffer[i11]), (Object) NullnessCasts.uncheckedCastNullableTToT(this.threshold)) > 0) {
                this.threshold = this.buffer[i11];
            }
        }
    }

    public void offer(@ParametricNullness T t7) {
        int i8 = this.f14996k;
        if (i8 == 0) {
            return;
        }
        int i9 = this.bufferSize;
        if (i9 == 0) {
            this.buffer[0] = t7;
            this.threshold = t7;
            this.bufferSize = 1;
            return;
        }
        if (i9 < i8) {
            T[] tArr = this.buffer;
            this.bufferSize = i9 + 1;
            tArr[i9] = t7;
            if (this.comparator.compare(t7, (Object) NullnessCasts.uncheckedCastNullableTToT(this.threshold)) > 0) {
                this.threshold = t7;
                return;
            }
            return;
        }
        if (this.comparator.compare(t7, (Object) NullnessCasts.uncheckedCastNullableTToT(this.threshold)) < 0) {
            T[] tArr2 = this.buffer;
            int i10 = this.bufferSize;
            int i11 = i10 + 1;
            this.bufferSize = i11;
            tArr2[i10] = t7;
            if (i11 == this.f14996k * 2) {
                trim();
            }
        }
    }

    public void offerAll(Iterable<? extends T> iterable) {
        offerAll(iterable.iterator());
    }

    public List<T> topK() {
        Arrays.sort(this.buffer, 0, this.bufferSize, this.comparator);
        int i8 = this.bufferSize;
        int i9 = this.f14996k;
        if (i8 > i9) {
            T[] tArr = this.buffer;
            Arrays.fill(tArr, i9, tArr.length, (Object) null);
            int i10 = this.f14996k;
            this.bufferSize = i10;
            this.threshold = this.buffer[i10 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(this.buffer, this.bufferSize)));
    }

    public static <T> TopKSelector<T> greatest(int i8, Comparator<? super T> comparator) {
        return new TopKSelector<>(Ordering.from(comparator).reverse(), i8);
    }

    public static <T> TopKSelector<T> least(int i8, Comparator<? super T> comparator) {
        return new TopKSelector<>(comparator, i8);
    }

    public void offerAll(Iterator<? extends T> it) {
        while (it.hasNext()) {
            offer(it.next());
        }
    }
}
