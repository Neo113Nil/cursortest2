package net.idrnd.face.iad.capture.internal;

import androidx.tracing.Trace;
import app.cash.local.primitives.BrandToken;
import coil3.size.DimensionKt;
import com.google.common.collect.Cut;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators$PeekingImpl;
import com.google.common.collect.Maps;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.Range;
import com.google.common.collect.RegularImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class d4$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: Removed duplicated region for block: B:65:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010d A[SYNTHETIC] */
    @Override // java.util.function.Function
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object apply(Object obj) {
        int expandedCapacity;
        Range range;
        switch (this.$r8$classId) {
            case 0:
                return ((Boolean) obj).booleanValue() ? "1" : "0";
            case 1:
                return Integer.valueOf(Integer.bitCount(((Integer) obj).intValue()));
            case 2:
                ((BrandToken) obj).value.getClass();
                return MutexKt.Mutex$default();
            case 3:
                ArrayList arrayList = ((ImmutableRangeSet.Builder) obj).ranges;
                int size = arrayList.size();
                DimensionKt.checkNonnegative(size, "initialCapacity");
                Object[] objArr = new Object[size];
                Range range2 = Range.ALL;
                Collections.sort(arrayList, NaturalOrdering.INSTANCE$1);
                Iterator it = arrayList.iterator();
                Iterators$PeekingImpl iterators$PeekingImpl = it instanceof Iterators$PeekingImpl ? (Iterators$PeekingImpl) it : new Iterators$PeekingImpl(it);
                int i = 0;
                while (iterators$PeekingImpl.hasNext()) {
                    Range range3 = (Range) iterators$PeekingImpl.next();
                    while (iterators$PeekingImpl.hasNext()) {
                        if (!iterators$PeekingImpl.hasPeeked) {
                            iterators$PeekingImpl.peekedElement = iterators$PeekingImpl.iterator.next();
                            iterators$PeekingImpl.hasPeeked = true;
                        }
                        Range range4 = (Range) iterators$PeekingImpl.peekedElement;
                        Cut cut = range3.lowerBound;
                        Cut cut2 = range3.upperBound;
                        Cut cut3 = range4.upperBound;
                        Cut cut4 = range4.lowerBound;
                        if (cut.compareTo(cut3) <= 0 && cut4.compareTo(cut2) <= 0) {
                            int compareTo = cut.compareTo(cut4);
                            Cut cut5 = range4.upperBound;
                            int compareTo2 = cut2.compareTo(cut5);
                            if (compareTo >= 0 && compareTo2 <= 0) {
                                range = range3;
                            } else if (compareTo > 0 || compareTo2 < 0) {
                                if (compareTo >= 0) {
                                    cut4 = cut;
                                }
                                if (compareTo2 <= 0) {
                                    cut5 = cut2;
                                }
                                Trace.checkArgument(cut4.compareTo(cut5) <= 0, "intersection is undefined for disconnected ranges %s and %s", range3, range4);
                                range = new Range(cut4, cut5);
                            } else {
                                range = range4;
                            }
                            Trace.checkArgument(range.lowerBound.equals(range.upperBound), "Overlapping ranges not permitted but found %s overlapping %s", range3, range4);
                            Range range5 = (Range) iterators$PeekingImpl.next();
                            int compareTo3 = cut.compareTo(range5.lowerBound);
                            int compareTo4 = cut2.compareTo(range5.upperBound);
                            if (compareTo3 > 0 || compareTo4 < 0) {
                                if (compareTo3 < 0 || compareTo4 > 0) {
                                    if (compareTo3 > 0) {
                                        cut = range5.lowerBound;
                                    }
                                    if (compareTo4 < 0) {
                                        range3 = range5;
                                    }
                                    range5 = new Range(cut, range3.upperBound);
                                }
                                range3 = range5;
                            }
                        }
                        range3.getClass();
                        int i2 = i + 1;
                        expandedCapacity = ImmutableCollection.ArrayBasedBuilder.expandedCapacity(objArr.length, i2);
                        if (expandedCapacity <= objArr.length) {
                            objArr = Arrays.copyOf(objArr, expandedCapacity);
                        }
                        objArr[i] = range3;
                        i = i2;
                    }
                    range3.getClass();
                    int i22 = i + 1;
                    expandedCapacity = ImmutableCollection.ArrayBasedBuilder.expandedCapacity(objArr.length, i22);
                    if (expandedCapacity <= objArr.length) {
                    }
                    objArr[i] = range3;
                    i = i22;
                }
                RegularImmutableList asImmutableList = ImmutableList.asImmutableList(i, objArr);
                return asImmutableList.isEmpty() ? ImmutableRangeSet.EMPTY : (asImmutableList.size == 1 && ((Range) Maps.getOnlyElement(asImmutableList)).equals(Range.ALL)) ? ImmutableRangeSet.ALL : new ImmutableRangeSet(asImmutableList);
            case 4:
                return ((ImmutableList.Builder) obj).build();
            case 5:
                return ((ImmutableSet.Builder) obj).build();
            case 6:
                return ((Exception) obj).toString();
            case 7:
                return ((Map.Entry) obj).getValue().toString();
            default:
                return (String) ((Map.Entry) obj).getValue();
        }
    }

    public /* synthetic */ d4$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }
}
