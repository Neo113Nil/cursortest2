package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyListMeasure.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÓ\u0001\u0010&\u001a\u00020#2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2*\u0010\"\u001a&\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e\u0012\u0004\u0012\u00020!0\u001dH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a\u0093\u0001\u00102\u001a\b\u0012\u0004\u0012\u000201002\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00102\f\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u00102\f\u0010*\u001a\b\u0012\u0004\u0012\u00020'0\u00102\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b2\u00103\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;", "itemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "Landroidx/compose/foundation/lazy/DataIndex;", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "", "headerIndexes", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "beyondBoundsInfo", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList-7Xnphek", "(ILandroidx/compose/foundation/lazy/LazyMeasuredItemProvider;IIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList", "Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "items", "extraItemsBefore", "extraItemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", "", "Landroidx/compose/foundation/lazy/LazyListPositionedItem;", "calculateItemsOffsets", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LazyListMeasureKt {
    private static final int calculateItemsOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a6  */
    /* renamed from: measureLazyList-7Xnphek, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LazyListMeasureResult m416measureLazyList7Xnphek(int i, LazyMeasuredItemProvider itemProvider, int i2, int i3, int i4, int i5, int i6, float f, long j, boolean z, List headerIndexes, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density, LazyListItemPlacementAnimator placementAnimator, LazyListBeyondBoundsInfo beyondBoundsInfo, Function3 layout) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        LazyMeasuredItem lazyMeasuredItem;
        List emptyList;
        List emptyList2;
        boolean z3;
        LazyMeasuredItem lazyMeasuredItem2;
        int i12;
        int i13;
        LazyListPositionedItem lazyListPositionedItem;
        List list;
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(headerIndexes, "headerIndexes");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(placementAnimator, "placementAnimator");
        Intrinsics.checkNotNullParameter(beyondBoundsInfo, "beyondBoundsInfo");
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (i3 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i <= 0) {
            return new LazyListMeasureResult(null, 0, false, 0.0f, (MeasureResult) layout.invoke(Integer.valueOf(Constraints.m2489getMinWidthimpl(j)), Integer.valueOf(Constraints.m2488getMinHeightimpl(j)), new Function1() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$1
                public final void invoke(@NotNull Placeable.PlacementScope invoke) {
                    Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return Unit.INSTANCE;
                }
            }), CollectionsKt.emptyList(), -i3, i2 + i4, 0, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4);
        }
        int i14 = i5;
        if (i14 >= i) {
            i14 = DataIndex.m396constructorimpl(i - 1);
            i7 = 0;
        } else {
            i7 = i6;
        }
        int roundToInt = MathKt.roundToInt(f);
        int i15 = i7 - roundToInt;
        if (DataIndex.m398equalsimpl0(i14, DataIndex.m396constructorimpl(0)) && i15 < 0) {
            roundToInt += i15;
            i15 = 0;
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i15 - i3;
        int i17 = -i3;
        int i18 = 0;
        while (i16 < 0 && i14 - DataIndex.m396constructorimpl(0) > 0) {
            int m396constructorimpl = DataIndex.m396constructorimpl(i14 - 1);
            LazyMeasuredItem m427getAndMeasureZjPyQlc = itemProvider.m427getAndMeasureZjPyQlc(m396constructorimpl);
            arrayList.add(0, m427getAndMeasureZjPyQlc);
            i18 = Math.max(i18, m427getAndMeasureZjPyQlc.getCrossAxisSize());
            i16 += m427getAndMeasureZjPyQlc.getSizeWithSpacings();
            i14 = m396constructorimpl;
        }
        if (i16 < i17) {
            roundToInt += i16;
            i16 = i17;
        }
        int i19 = i16 + i3;
        int i20 = i2 + i4;
        int i21 = i14;
        int i22 = i18;
        int coerceAtLeast = RangesKt.coerceAtLeast(i20, 0);
        int i23 = -i19;
        int size = arrayList.size();
        int i24 = i21;
        for (int i25 = 0; i25 < size; i25++) {
            LazyMeasuredItem lazyMeasuredItem3 = (LazyMeasuredItem) arrayList.get(i25);
            i24 = DataIndex.m396constructorimpl(i24 + 1);
            i23 += lazyMeasuredItem3.getSizeWithSpacings();
        }
        int i26 = i19;
        int i27 = i22;
        int i28 = i23;
        int i29 = i24;
        while (true) {
            if ((i28 <= coerceAtLeast || arrayList.isEmpty()) && i29 < i) {
                int i30 = coerceAtLeast;
                LazyMeasuredItem m427getAndMeasureZjPyQlc2 = itemProvider.m427getAndMeasureZjPyQlc(i29);
                i28 += m427getAndMeasureZjPyQlc2.getSizeWithSpacings();
                int i31 = i17;
                if (i28 <= i17 && i29 != i - 1) {
                    i8 = DataIndex.m396constructorimpl(i29 + 1);
                    i26 -= m427getAndMeasureZjPyQlc2.getSizeWithSpacings();
                } else {
                    int max = Math.max(i27, m427getAndMeasureZjPyQlc2.getCrossAxisSize());
                    arrayList.add(m427getAndMeasureZjPyQlc2);
                    i27 = max;
                    i8 = i21;
                }
                i29 = DataIndex.m396constructorimpl(i29 + 1);
                i21 = i8;
                coerceAtLeast = i30;
                i17 = i31;
            }
        }
        int i32 = i17;
        if (i28 < i2) {
            int i33 = i2 - i28;
            i26 -= i33;
            i28 += i33;
            int i34 = i27;
            int i35 = i21;
            while (i26 < i3 && i35 - DataIndex.m396constructorimpl(0) > 0) {
                i35 = DataIndex.m396constructorimpl(i35 - 1);
                LazyMeasuredItem m427getAndMeasureZjPyQlc3 = itemProvider.m427getAndMeasureZjPyQlc(i35);
                arrayList.add(0, m427getAndMeasureZjPyQlc3);
                i34 = Math.max(i34, m427getAndMeasureZjPyQlc3.getCrossAxisSize());
                i26 += m427getAndMeasureZjPyQlc3.getSizeWithSpacings();
            }
            roundToInt += i33;
            if (i26 < 0) {
                roundToInt += i26;
                i27 = i34;
                i9 = i28 + i26;
                i26 = 0;
                float f2 = (MathKt.getSign(MathKt.roundToInt(f)) == MathKt.getSign(roundToInt) || Math.abs(MathKt.roundToInt(f)) < Math.abs(roundToInt)) ? f : roundToInt;
                int i36 = -i26;
                LazyMeasuredItem lazyMeasuredItem4 = (LazyMeasuredItem) CollectionsKt.first((List) arrayList);
                if (i3 <= 0) {
                    int size2 = arrayList.size();
                    LazyMeasuredItem lazyMeasuredItem5 = lazyMeasuredItem4;
                    int i37 = i26;
                    int i38 = 0;
                    while (i38 < size2) {
                        int sizeWithSpacings = ((LazyMeasuredItem) arrayList.get(i38)).getSizeWithSpacings();
                        if (i37 == 0 || sizeWithSpacings > i37) {
                            break;
                        }
                        i10 = i27;
                        if (i38 == CollectionsKt.getLastIndex(arrayList)) {
                            break;
                        }
                        i37 -= sizeWithSpacings;
                        i38++;
                        lazyMeasuredItem5 = (LazyMeasuredItem) arrayList.get(i38);
                        i27 = i10;
                    }
                    i10 = i27;
                    i11 = i37;
                    lazyMeasuredItem = lazyMeasuredItem5;
                } else {
                    i10 = i27;
                    i11 = i26;
                    lazyMeasuredItem = lazyMeasuredItem4;
                }
                if (!beyondBoundsInfo.hasIntervals() && ((LazyMeasuredItem) CollectionsKt.first((List) arrayList)).getIndex() > measureLazyList_7Xnphek$startIndex(beyondBoundsInfo, i)) {
                    emptyList = new ArrayList();
                    int index = ((LazyMeasuredItem) CollectionsKt.first((List) arrayList)).getIndex() - 1;
                    int measureLazyList_7Xnphek$startIndex = measureLazyList_7Xnphek$startIndex(beyondBoundsInfo, i);
                    if (measureLazyList_7Xnphek$startIndex <= index) {
                        while (true) {
                            emptyList.add(itemProvider.m427getAndMeasureZjPyQlc(DataIndex.m396constructorimpl(index)));
                            if (index == measureLazyList_7Xnphek$startIndex) {
                                break;
                            }
                            index--;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                List list2 = emptyList;
                if (!beyondBoundsInfo.hasIntervals() && ((LazyMeasuredItem) CollectionsKt.last((List) arrayList)).getIndex() < measureLazyList_7Xnphek$endIndex(beyondBoundsInfo, i)) {
                    ArrayList arrayList2 = new ArrayList();
                    int index2 = ((LazyMeasuredItem) CollectionsKt.last((List) arrayList)).getIndex();
                    int measureLazyList_7Xnphek$endIndex = measureLazyList_7Xnphek$endIndex(beyondBoundsInfo, i);
                    while (index2 < measureLazyList_7Xnphek$endIndex) {
                        index2++;
                        arrayList2.add(itemProvider.m427getAndMeasureZjPyQlc(DataIndex.m396constructorimpl(index2)));
                    }
                    Unit unit2 = Unit.INSTANCE;
                    emptyList2 = arrayList2;
                } else {
                    emptyList2 = CollectionsKt.emptyList();
                }
                z3 = !Intrinsics.areEqual(lazyMeasuredItem, CollectionsKt.first((List) arrayList)) && list2.isEmpty() && emptyList2.isEmpty();
                int m2501constrainWidthK40F9xA = ConstraintsKt.m2501constrainWidthK40F9xA(j, !z ? i10 : i9);
                int m2500constrainHeightK40F9xA = ConstraintsKt.m2500constrainHeightK40F9xA(j, !z ? i9 : i10);
                final List calculateItemsOffsets = calculateItemsOffsets(arrayList, list2, emptyList2, m2501constrainWidthK40F9xA, m2500constrainHeightK40F9xA, i9, i2, i36, z, vertical, horizontal, z2, density);
                if (headerIndexes.isEmpty()) {
                    lazyMeasuredItem2 = lazyMeasuredItem;
                    i12 = 0;
                    i13 = i32;
                    lazyListPositionedItem = LazyListHeadersKt.findOrComposeLazyListHeader(calculateItemsOffsets, itemProvider, headerIndexes, i3, m2501constrainWidthK40F9xA, m2500constrainHeightK40F9xA);
                } else {
                    lazyMeasuredItem2 = lazyMeasuredItem;
                    i12 = 0;
                    i13 = i32;
                    lazyListPositionedItem = null;
                }
                final LazyListPositionedItem lazyListPositionedItem2 = lazyListPositionedItem;
                placementAnimator.onMeasured((int) f2, m2501constrainWidthK40F9xA, m2500constrainHeightK40F9xA, z2, calculateItemsOffsets, itemProvider);
                boolean z4 = i9 <= i2 ? 1 : i12;
                MeasureResult measureResult = (MeasureResult) layout.invoke(Integer.valueOf(m2501constrainWidthK40F9xA), Integer.valueOf(m2500constrainHeightK40F9xA), new Function1() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Placeable.PlacementScope invoke) {
                        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
                        List<LazyListPositionedItem> list3 = calculateItemsOffsets;
                        LazyListPositionedItem lazyListPositionedItem3 = lazyListPositionedItem2;
                        int size3 = list3.size();
                        for (int i39 = 0; i39 < size3; i39++) {
                            LazyListPositionedItem lazyListPositionedItem4 = list3.get(i39);
                            if (lazyListPositionedItem4 != lazyListPositionedItem3) {
                                lazyListPositionedItem4.place(invoke);
                            }
                        }
                        LazyListPositionedItem lazyListPositionedItem5 = lazyListPositionedItem2;
                        if (lazyListPositionedItem5 != null) {
                            lazyListPositionedItem5.place(invoke);
                        }
                    }
                });
                if (z3) {
                    ArrayList arrayList3 = new ArrayList(calculateItemsOffsets.size());
                    int size3 = calculateItemsOffsets.size();
                    while (i12 < size3) {
                        Object obj = calculateItemsOffsets.get(i12);
                        LazyListPositionedItem lazyListPositionedItem3 = (LazyListPositionedItem) obj;
                        if ((lazyListPositionedItem3.getIndex() >= ((LazyMeasuredItem) CollectionsKt.first((List) arrayList)).getIndex() && lazyListPositionedItem3.getIndex() <= ((LazyMeasuredItem) CollectionsKt.last((List) arrayList)).getIndex()) || lazyListPositionedItem3 == lazyListPositionedItem2) {
                            arrayList3.add(obj);
                        }
                        i12++;
                    }
                    list = arrayList3;
                } else {
                    list = calculateItemsOffsets;
                }
                return new LazyListMeasureResult(lazyMeasuredItem2, i11, z4, f2, measureResult, list, i13, i20, i, z2, !z ? Orientation.Vertical : Orientation.Horizontal, i4);
            }
            i27 = i34;
        }
        i9 = i28;
        if (MathKt.getSign(MathKt.roundToInt(f)) == MathKt.getSign(roundToInt)) {
        }
        int i362 = -i26;
        LazyMeasuredItem lazyMeasuredItem42 = (LazyMeasuredItem) CollectionsKt.first((List) arrayList);
        if (i3 <= 0) {
        }
        if (!beyondBoundsInfo.hasIntervals()) {
        }
        emptyList = CollectionsKt.emptyList();
        List list22 = emptyList;
        if (!beyondBoundsInfo.hasIntervals()) {
        }
        emptyList2 = CollectionsKt.emptyList();
        if (Intrinsics.areEqual(lazyMeasuredItem, CollectionsKt.first((List) arrayList))) {
        }
        int m2501constrainWidthK40F9xA2 = ConstraintsKt.m2501constrainWidthK40F9xA(j, !z ? i10 : i9);
        int m2500constrainHeightK40F9xA2 = ConstraintsKt.m2500constrainHeightK40F9xA(j, !z ? i9 : i10);
        final List<LazyListPositionedItem> calculateItemsOffsets2 = calculateItemsOffsets(arrayList, list22, emptyList2, m2501constrainWidthK40F9xA2, m2500constrainHeightK40F9xA2, i9, i2, i362, z, vertical, horizontal, z2, density);
        if (headerIndexes.isEmpty()) {
        }
        final LazyListPositionedItem lazyListPositionedItem22 = lazyListPositionedItem;
        placementAnimator.onMeasured((int) f2, m2501constrainWidthK40F9xA2, m2500constrainHeightK40F9xA2, z2, calculateItemsOffsets2, itemProvider);
        if (i9 <= i2) {
        }
        MeasureResult measureResult2 = (MeasureResult) layout.invoke(Integer.valueOf(m2501constrainWidthK40F9xA2), Integer.valueOf(m2500constrainHeightK40F9xA2), new Function1() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke((Placeable.PlacementScope) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Placeable.PlacementScope invoke) {
                Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
                List<LazyListPositionedItem> list3 = calculateItemsOffsets2;
                LazyListPositionedItem lazyListPositionedItem32 = lazyListPositionedItem22;
                int size32 = list3.size();
                for (int i39 = 0; i39 < size32; i39++) {
                    LazyListPositionedItem lazyListPositionedItem4 = list3.get(i39);
                    if (lazyListPositionedItem4 != lazyListPositionedItem32) {
                        lazyListPositionedItem4.place(invoke);
                    }
                }
                LazyListPositionedItem lazyListPositionedItem5 = lazyListPositionedItem22;
                if (lazyListPositionedItem5 != null) {
                    lazyListPositionedItem5.place(invoke);
                }
            }
        });
        if (z3) {
        }
        return new LazyListMeasureResult(lazyMeasuredItem2, i11, z4, f2, measureResult2, list, i13, i20, i, z2, !z ? Orientation.Vertical : Orientation.Horizontal, i4);
    }

    private static final int measureLazyList_7Xnphek$startIndex(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i) {
        return Math.min(lazyListBeyondBoundsInfo.getStart(), i - 1);
    }

    private static final int measureLazyList_7Xnphek$endIndex(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i) {
        return Math.min(lazyListBeyondBoundsInfo.getEnd(), i - 1);
    }

    private static final List calculateItemsOffsets(List list, List list2, List list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        int i6 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3 && i5 != 0) {
            throw new IllegalStateException("Check failed.");
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (!z3) {
            int size = list2.size();
            int i7 = i5;
            for (int i8 = 0; i8 < size; i8++) {
                LazyMeasuredItem lazyMeasuredItem = (LazyMeasuredItem) list2.get(i8);
                i7 -= lazyMeasuredItem.getSizeWithSpacings();
                arrayList.add(lazyMeasuredItem.position(i7, i, i2));
            }
            int size2 = list.size();
            int i9 = i5;
            for (int i10 = 0; i10 < size2; i10++) {
                LazyMeasuredItem lazyMeasuredItem2 = (LazyMeasuredItem) list.get(i10);
                arrayList.add(lazyMeasuredItem2.position(i9, i, i2));
                i9 += lazyMeasuredItem2.getSizeWithSpacings();
            }
            int size3 = list3.size();
            for (int i11 = 0; i11 < size3; i11++) {
                LazyMeasuredItem lazyMeasuredItem3 = (LazyMeasuredItem) list3.get(i11);
                arrayList.add(lazyMeasuredItem3.position(i9, i, i2));
                i9 += lazyMeasuredItem3.getSizeWithSpacings();
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int size4 = list.size();
            int[] iArr = new int[size4];
            for (int i12 = 0; i12 < size4; i12++) {
                iArr[i12] = ((LazyMeasuredItem) list.get(calculateItemsOffsets$reverseAware(i12, z2, size4))).getSize();
            }
            int[] iArr2 = new int[size4];
            for (int i13 = 0; i13 < size4; i13++) {
                iArr2[i13] = 0;
            }
            if (z) {
                if (vertical == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                vertical.arrange(density, i6, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                horizontal.arrange(density, i6, iArr, LayoutDirection.Ltr, iArr2);
            }
            IntProgression indices = ArraysKt.getIndices(iArr2);
            if (z2) {
                indices = RangesKt.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int i14 = iArr2[first];
                    LazyMeasuredItem lazyMeasuredItem4 = (LazyMeasuredItem) list.get(calculateItemsOffsets$reverseAware(first, z2, size4));
                    if (z2) {
                        i14 = (i6 - i14) - lazyMeasuredItem4.getSize();
                    }
                    arrayList.add(lazyMeasuredItem4.position(i14, i, i2));
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        }
        return arrayList;
    }
}
