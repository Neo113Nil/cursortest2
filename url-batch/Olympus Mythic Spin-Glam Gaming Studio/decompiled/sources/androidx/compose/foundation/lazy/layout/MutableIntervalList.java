package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntervalList.kt */
@StabilityInferred
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0018\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\u000b0\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\tR \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "T", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "<init>", "()V", "", "itemIndex", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "getIntervalForIndex", "(I)Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "index", "", "checkIndexBounds", "(I)V", "", "contains", "(Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;I)Z", "fromIndex", "toIndex", "Lkotlin/Function1;", "block", "forEach", "(IILkotlin/jvm/functions/Function1;)V", "get", "Landroidx/compose/runtime/collection/MutableVector;", "intervals", "Landroidx/compose/runtime/collection/MutableVector;", "<set-?>", "size", "I", "getSize", "()I", "lastInterval", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MutableIntervalList<T> implements IntervalList<T> {
    private final MutableVector intervals = new MutableVector(new IntervalList.Interval[16], 0);
    private IntervalList.Interval lastInterval;
    private int size;

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public int getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public void forEach(int fromIndex, int toIndex, Function1 block) {
        int binarySearch;
        Intrinsics.checkNotNullParameter(block, "block");
        checkIndexBounds(fromIndex);
        checkIndexBounds(toIndex);
        if (toIndex >= fromIndex) {
            binarySearch = IntervalListKt.binarySearch(this.intervals, fromIndex);
            int startIndex = ((IntervalList.Interval) this.intervals.getContent()[binarySearch]).getStartIndex();
            while (startIndex <= toIndex) {
                IntervalList.Interval interval = (IntervalList.Interval) this.intervals.getContent()[binarySearch];
                block.invoke(interval);
                startIndex += interval.getSize();
                binarySearch++;
            }
            return;
        }
        throw new IllegalArgumentException(("toIndex (" + toIndex + ") should be not smaller than fromIndex (" + fromIndex + ')').toString());
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public IntervalList.Interval get(int index) {
        checkIndexBounds(index);
        return getIntervalForIndex(index);
    }

    private final IntervalList.Interval getIntervalForIndex(int itemIndex) {
        int binarySearch;
        IntervalList.Interval interval = this.lastInterval;
        if (interval != null && contains(interval, itemIndex)) {
            return interval;
        }
        MutableVector mutableVector = this.intervals;
        binarySearch = IntervalListKt.binarySearch(mutableVector, itemIndex);
        IntervalList.Interval interval2 = (IntervalList.Interval) mutableVector.getContent()[binarySearch];
        this.lastInterval = interval2;
        return interval2;
    }

    private final void checkIndexBounds(int index) {
        if (index < 0 || index >= getSize()) {
            throw new IndexOutOfBoundsException("Index " + index + ", size " + getSize());
        }
    }

    private final boolean contains(IntervalList.Interval interval, int i) {
        return i < interval.getStartIndex() + interval.getSize() && interval.getStartIndex() <= i;
    }
}
