package androidx.compose.foundation.lazy.grid;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyGridMeasure.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\u001aA\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nH\u0083\b\u001a\u008c\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002\u001a¸\u0002\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020-2\u0006\u0010.\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020423\u00105\u001a/\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(8\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020+090\u00010\n2/\u0010:\u001a+\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=0\n¢\u0006\u0002\b>\u0012\u0004\u0012\u00020?0;H\u0000ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a+\u0010B\u001a\u00020=\"\u0004\b\u0000\u0010C*\b\u0012\u0004\u0012\u0002HC0\r2\f\u0010D\u001a\b\u0012\u0004\u0012\u0002HC0EH\u0002¢\u0006\u0002\u0010F\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"calculateExtraItems", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "pinnedItems", "", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "filter", "Lkotlin/Function1;", "", "calculateItemsOffsets", "", "lines", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "itemsBefore", "itemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "isVertical", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "reverseLayout", "density", "Landroidx/compose/ui/unit/Density;", "measureLazyGrid", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "itemsCount", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "scrollToBeConsumed", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "itemAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "slotsPerLine", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "placementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "prefetchInfoRetriever", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "line", "Lkotlin/Pair;", "layout", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measureLazyGrid-OZKpZRA", "(ILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "addAllFromArray", "T", "arr", "", "(Ljava/util/List;[Ljava/lang/Object;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridMeasureKt {
    private static final int calculateItemsOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* renamed from: measureLazyGrid-OZKpZRA, reason: not valid java name */
    public static final LazyGridMeasureResult m814measureLazyGridOZKpZRA(int i, LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density, LazyLayoutItemAnimator<LazyGridMeasuredItem> lazyLayoutItemAnimator, int i8, List<Integer> list, CoroutineScope coroutineScope, final MutableState<Unit> mutableState, GraphicsContext graphicsContext, Function1<? super Integer, ? extends List<Pair<Integer, Constraints>>> function1, Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> function3) {
        int i9;
        int m6235constrainWidthK40F9xA;
        int m6217getMaxHeightimpl;
        int i10;
        List<LazyGridMeasuredItem> list2;
        int i11;
        LazyGridMeasuredItem[] items;
        LazyGridMeasuredItem lazyGridMeasuredItem;
        int i12;
        int i13;
        int i14 = i;
        List<Integer> list3 = list;
        if (i3 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding".toString());
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding".toString());
        }
        if (i14 <= 0) {
            int m6220getMinWidthimpl = Constraints.m6220getMinWidthimpl(j);
            int m6219getMinHeightimpl = Constraints.m6219getMinHeightimpl(j);
            lazyLayoutItemAnimator.onMeasured(0, m6220getMinWidthimpl, m6219getMinHeightimpl, new ArrayList(), lazyGridMeasuredItemProvider.getKeyIndexMap(), lazyGridMeasuredItemProvider, z, false, i8, false, 0, 0, coroutineScope, graphicsContext);
            long m838getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator.m838getMinSizeToFitDisappearingItemsYbymL2g();
            if (!IntSize.m6433equalsimpl0(m838getMinSizeToFitDisappearingItemsYbymL2g, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                m6220getMinWidthimpl = ConstraintsKt.m6235constrainWidthK40F9xA(j, IntSize.m6435getWidthimpl(m838getMinSizeToFitDisappearingItemsYbymL2g));
                m6219getMinHeightimpl = ConstraintsKt.m6234constrainHeightK40F9xA(j, IntSize.m6434getHeightimpl(m838getMinSizeToFitDisappearingItemsYbymL2g));
            }
            return new LazyGridMeasureResult(null, 0, false, 0.0f, function3.invoke(Integer.valueOf(m6220getMinWidthimpl), Integer.valueOf(m6219getMinHeightimpl), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }), false, coroutineScope, density, i8, function1, CollectionsKt.emptyList(), -i3, i2 + i4, 0, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
        }
        int round = Math.round(f);
        int i15 = i7 - round;
        if (i6 == 0 && i15 < 0) {
            round += i15;
            i15 = 0;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i16 = -i3;
        int i17 = (i5 < 0 ? i5 : 0) + i16;
        int i18 = i15 + i17;
        int i19 = i6;
        while (i18 < 0 && i19 > 0) {
            i19--;
            LazyGridMeasuredLine andMeasure = lazyGridMeasuredLineProvider.getAndMeasure(i19);
            arrayDeque.add(0, andMeasure);
            i18 += andMeasure.getMainAxisSizeWithSpacings();
        }
        if (i18 < i17) {
            round += i18;
            i18 = i17;
        }
        int i20 = i18 - i17;
        int i21 = i2 + i4;
        int i22 = round;
        int coerceAtLeast = RangesKt.coerceAtLeast(i21, 0);
        int i23 = i19;
        int i24 = i23;
        int i25 = -i20;
        int i26 = 0;
        boolean z3 = false;
        while (i26 < arrayDeque.size()) {
            if (i25 >= coerceAtLeast) {
                arrayDeque.remove(i26);
                z3 = true;
            } else {
                i24++;
                i25 += ((LazyGridMeasuredLine) arrayDeque.get(i26)).getMainAxisSizeWithSpacings();
                i26++;
            }
        }
        int i27 = i24;
        while (i27 < i14 && (i25 < coerceAtLeast || i25 <= 0 || arrayDeque.isEmpty())) {
            LazyGridMeasuredLine andMeasure2 = lazyGridMeasuredLineProvider.getAndMeasure(i27);
            if (andMeasure2.isEmpty()) {
                break;
            }
            int mainAxisSizeWithSpacings = i25 + andMeasure2.getMainAxisSizeWithSpacings();
            if (mainAxisSizeWithSpacings <= i17) {
                i12 = coerceAtLeast;
                i13 = mainAxisSizeWithSpacings;
                if (((LazyGridMeasuredItem) ArraysKt.last(andMeasure2.getItems())).getIndex() != i14 - 1) {
                    i20 -= andMeasure2.getMainAxisSizeWithSpacings();
                    i23 = i27 + 1;
                    z3 = true;
                    i27++;
                    i25 = i13;
                    coerceAtLeast = i12;
                }
            } else {
                i12 = coerceAtLeast;
                i13 = mainAxisSizeWithSpacings;
            }
            arrayDeque.add(andMeasure2);
            i27++;
            i25 = i13;
            coerceAtLeast = i12;
        }
        if (i25 < i2) {
            int i28 = i2 - i25;
            i20 -= i28;
            i25 += i28;
            while (i20 < i3 && i23 > 0) {
                int i29 = i23 - 1;
                LazyGridMeasuredLine andMeasure3 = lazyGridMeasuredLineProvider.getAndMeasure(i29);
                arrayDeque.add(0, andMeasure3);
                i20 += andMeasure3.getMainAxisSizeWithSpacings();
                i23 = i29;
            }
            i9 = i22 + i28;
            if (i20 < 0) {
                i9 += i20;
                i25 += i20;
                i20 = 0;
            }
        } else {
            i9 = i22;
        }
        float f2 = (MathKt.getSign(Math.round(f)) != MathKt.getSign(i9) || Math.abs(Math.round(f)) < Math.abs(i9)) ? f : i9;
        if (i20 < 0) {
            throw new IllegalArgumentException("negative initial offset".toString());
        }
        int i30 = -i20;
        LazyGridMeasuredLine lazyGridMeasuredLine = (LazyGridMeasuredLine) arrayDeque.first();
        LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) ArraysKt.firstOrNull(lazyGridMeasuredLine.getItems());
        int index = lazyGridMeasuredItem2 != null ? lazyGridMeasuredItem2.getIndex() : 0;
        LazyGridMeasuredLine lazyGridMeasuredLine2 = (LazyGridMeasuredLine) arrayDeque.lastOrNull();
        int index2 = (lazyGridMeasuredLine2 == null || (items = lazyGridMeasuredLine2.getItems()) == null || (lazyGridMeasuredItem = (LazyGridMeasuredItem) ArraysKt.lastOrNull(items)) == null) ? 0 : lazyGridMeasuredItem.getIndex();
        int size = list3.size();
        ArrayList arrayList = null;
        List list4 = null;
        int i31 = 0;
        while (i31 < size) {
            int i32 = size;
            int intValue = list3.get(i31).intValue();
            if (intValue < 0 || intValue >= index) {
                i11 = i31;
            } else {
                i11 = i31;
                int spanOf = lazyGridMeasuredLineProvider.spanOf(intValue);
                LazyGridMeasuredItem mo787getAndMeasurehBUhpc = lazyGridMeasuredItemProvider.mo787getAndMeasurehBUhpc(intValue, 0, spanOf, lazyGridMeasuredLineProvider.m818childConstraintsJhjzzOo$foundation_release(0, spanOf));
                ArrayList arrayList2 = list4 == null ? new ArrayList() : list4;
                arrayList2.add(mo787getAndMeasurehBUhpc);
                list4 = arrayList2;
            }
            i31 = i11 + 1;
            size = i32;
        }
        if (list4 == null) {
            list4 = CollectionsKt.emptyList();
        }
        List list5 = list4;
        int size2 = list3.size();
        int i33 = 0;
        while (i33 < size2) {
            int i34 = i33;
            int intValue2 = list3.get(i33).intValue();
            if (index2 + 1 <= intValue2 && intValue2 < i14) {
                int spanOf2 = lazyGridMeasuredLineProvider.spanOf(intValue2);
                LazyGridMeasuredItem mo787getAndMeasurehBUhpc2 = lazyGridMeasuredItemProvider.mo787getAndMeasurehBUhpc(intValue2, 0, spanOf2, lazyGridMeasuredLineProvider.m818childConstraintsJhjzzOo$foundation_release(0, spanOf2));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List list6 = arrayList;
                list6.add(mo787getAndMeasurehBUhpc2);
                arrayList = list6;
            }
            i33 = i34 + 1;
            i14 = i;
            list3 = list;
        }
        if (arrayList == null) {
            arrayList = CollectionsKt.emptyList();
        }
        if (i3 > 0 || i5 < 0) {
            int size3 = arrayDeque.size();
            int i35 = 0;
            while (i35 < size3) {
                int mainAxisSizeWithSpacings2 = ((LazyGridMeasuredLine) arrayDeque.get(i35)).getMainAxisSizeWithSpacings();
                if (i20 == 0 || mainAxisSizeWithSpacings2 > i20 || i35 == CollectionsKt.getLastIndex(arrayDeque)) {
                    break;
                }
                i20 -= mainAxisSizeWithSpacings2;
                i35++;
                lazyGridMeasuredLine = (LazyGridMeasuredLine) arrayDeque.get(i35);
            }
        }
        LazyGridMeasuredLine lazyGridMeasuredLine3 = lazyGridMeasuredLine;
        int i36 = i20;
        if (z) {
            m6235constrainWidthK40F9xA = Constraints.m6218getMaxWidthimpl(j);
        } else {
            m6235constrainWidthK40F9xA = ConstraintsKt.m6235constrainWidthK40F9xA(j, i25);
        }
        int i37 = m6235constrainWidthK40F9xA;
        if (z) {
            m6217getMaxHeightimpl = ConstraintsKt.m6234constrainHeightK40F9xA(j, i25);
        } else {
            m6217getMaxHeightimpl = Constraints.m6217getMaxHeightimpl(j);
        }
        int i38 = m6217getMaxHeightimpl;
        int i39 = i25;
        int i40 = index;
        int i41 = index2;
        List list7 = arrayList;
        final List<LazyGridMeasuredItem> calculateItemsOffsets = calculateItemsOffsets(arrayDeque, list5, list7, i37, i38, i39, i2, i30, z, vertical, horizontal, z2, density);
        lazyLayoutItemAnimator.onMeasured((int) f2, i37, i38, calculateItemsOffsets, lazyGridMeasuredItemProvider.getKeyIndexMap(), lazyGridMeasuredItemProvider, z, false, i8, false, i36, i39, coroutineScope, graphicsContext);
        long m838getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator.m838getMinSizeToFitDisappearingItemsYbymL2g();
        if (IntSize.m6433equalsimpl0(m838getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
            i10 = i37;
        } else {
            int i42 = z ? i38 : i37;
            i10 = ConstraintsKt.m6235constrainWidthK40F9xA(j, Math.max(i37, IntSize.m6435getWidthimpl(m838getMinSizeToFitDisappearingItemsYbymL2g2)));
            i38 = ConstraintsKt.m6234constrainHeightK40F9xA(j, Math.max(i38, IntSize.m6434getHeightimpl(m838getMinSizeToFitDisappearingItemsYbymL2g2)));
            int i43 = z ? i38 : i10;
            if (i43 != i42) {
                int size4 = calculateItemsOffsets.size();
                for (int i44 = 0; i44 < size4; i44++) {
                    calculateItemsOffsets.get(i44).updateMainAxisLayoutSize(i43);
                }
            }
        }
        boolean z4 = i41 != i + (-1) || i39 > i2;
        MeasureResult invoke = function3.invoke(Integer.valueOf(i10), Integer.valueOf(i38), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                List<LazyGridMeasuredItem> list8 = calculateItemsOffsets;
                int size5 = list8.size();
                for (int i45 = 0; i45 < size5; i45++) {
                    list8.get(i45).place(placementScope);
                }
                ObservableScopeInvalidator.m847attachToScopeimpl(mutableState);
            }
        });
        if (list5.isEmpty() && list7.isEmpty()) {
            list2 = calculateItemsOffsets;
        } else {
            ArrayList arrayList3 = new ArrayList(calculateItemsOffsets.size());
            int size5 = calculateItemsOffsets.size();
            int i45 = 0;
            while (i45 < size5) {
                LazyGridMeasuredItem lazyGridMeasuredItem3 = calculateItemsOffsets.get(i45);
                int index3 = lazyGridMeasuredItem3.getIndex();
                int i46 = i40;
                if (i46 <= index3 && index3 <= i41) {
                    arrayList3.add(lazyGridMeasuredItem3);
                }
                i45++;
                i40 = i46;
            }
            list2 = arrayList3;
        }
        return new LazyGridMeasureResult(lazyGridMeasuredLine3, i36, z4, f2, invoke, z3, coroutineScope, density, i8, function1, list2, i16, i21, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
    }

    private static final List<LazyGridMeasuredItem> calculateItemsOffsets(List<LazyGridMeasuredLine> list, List<LazyGridMeasuredItem> list2, List<LazyGridMeasuredItem> list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        int i6 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3 && i5 != 0) {
            throw new IllegalStateException("non-zero firstLineScrollOffset".toString());
        }
        int size = list.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += list.get(i8).getItems().length;
        }
        ArrayList arrayList = new ArrayList(i7);
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no items".toString());
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i9 = 0; i9 < size2; i9++) {
                iArr[i9] = list.get(calculateItemsOffsets$reverseAware(i9, z2, size2)).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            for (int i10 = 0; i10 < size2; i10++) {
                iArr2[i10] = 0;
            }
            if (z) {
                if (vertical == null) {
                    throw new IllegalArgumentException("null verticalArrangement".toString());
                }
                vertical.arrange(density, i6, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    throw new IllegalArgumentException("null horizontalArrangement".toString());
                }
                horizontal.arrange(density, i6, iArr, LayoutDirection.Ltr, iArr2);
            }
            IntRange indices = ArraysKt.getIndices(iArr2);
            if (z2) {
                indices = RangesKt.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int i11 = iArr2[first];
                    LazyGridMeasuredLine lazyGridMeasuredLine = list.get(calculateItemsOffsets$reverseAware(first, z2, size2));
                    if (z2) {
                        i11 = (i6 - i11) - lazyGridMeasuredLine.getMainAxisSize();
                    }
                    addAllFromArray(arrayList, lazyGridMeasuredLine.position(i11, i, i2));
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size() - 1;
            if (size3 >= 0) {
                int i12 = i5;
                while (true) {
                    int i13 = size3 - 1;
                    LazyGridMeasuredItem lazyGridMeasuredItem = list2.get(size3);
                    i12 -= lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                    lazyGridMeasuredItem.position(i12, 0, i, i2);
                    arrayList.add(lazyGridMeasuredItem);
                    if (i13 < 0) {
                        break;
                    }
                    size3 = i13;
                }
            }
            int size4 = list.size();
            int i14 = i5;
            for (int i15 = 0; i15 < size4; i15++) {
                LazyGridMeasuredLine lazyGridMeasuredLine2 = list.get(i15);
                addAllFromArray(arrayList, lazyGridMeasuredLine2.position(i14, i, i2));
                i14 += lazyGridMeasuredLine2.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            for (int i16 = 0; i16 < size5; i16++) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = list3.get(i16);
                lazyGridMeasuredItem2.position(i14, 0, i, i2);
                arrayList.add(lazyGridMeasuredItem2);
                i14 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final <T> void addAllFromArray(List<T> list, T[] tArr) {
        for (T t : tArr) {
            list.add(t);
        }
    }

    private static final List<LazyGridMeasuredItem> calculateExtraItems(List<Integer> list, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, Function1<? super Integer, Boolean> function1) {
        LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider2;
        int size = list.size();
        ArrayList arrayList = null;
        int i = 0;
        while (i < size) {
            int intValue = list.get(i).intValue();
            if (function1.invoke(Integer.valueOf(intValue)).booleanValue()) {
                int spanOf = lazyGridMeasuredLineProvider.spanOf(intValue);
                lazyGridMeasuredItemProvider2 = lazyGridMeasuredItemProvider;
                LazyGridMeasuredItem mo787getAndMeasurehBUhpc = lazyGridMeasuredItemProvider2.mo787getAndMeasurehBUhpc(intValue, 0, spanOf, lazyGridMeasuredLineProvider.m818childConstraintsJhjzzOo$foundation_release(0, spanOf));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(mo787getAndMeasurehBUhpc);
            } else {
                lazyGridMeasuredItemProvider2 = lazyGridMeasuredItemProvider;
            }
            i++;
            lazyGridMeasuredItemProvider = lazyGridMeasuredItemProvider2;
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }
}
