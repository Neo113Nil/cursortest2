package androidx.compose.foundation.lazy;

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
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyListMeasure.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008c\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001a\\\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002\u001a4\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H\u0002\u001a£\u0002\u0010$\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u0002012\u0006\u0010\u001b\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u00102\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\b\u00103\u001a\u0004\u0018\u00010!2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092/\u0010:\u001a+\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0<¢\u0006\u0002\b?\u0012\u0004\u0012\u00020@0;H\u0000ø\u0001\u0000¢\u0006\u0004\bA\u0010B\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"calculateItemsOffsets", "", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "items", "", "extraItemsBefore", "extraItemsAfter", "layoutWidth", "", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", "isVertical", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "reverseLayout", "density", "Landroidx/compose/ui/unit/Density;", "createItemsAfterList", "visibleItems", "measuredItemProvider", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "itemsCount", "beyondBoundsItemCount", "pinnedItems", "consumedScroll", "", "isLookingAhead", "lastPostLookaheadLayoutInfo", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "createItemsBeforeList", "currentFirstItemIndex", "measureLazyList", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenItems", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "scrollToBeConsumed", "constraints", "Landroidx/compose/ui/unit/Constraints;", "headerIndexes", "itemAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "hasLookaheadPassOccurred", "postLookaheadLayoutInfo", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "placementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "layout", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measureLazyList-x0Ok8Vo", "(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IIIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyListMeasureKt {
    private static final int calculateItemsOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03a9  */
    /* renamed from: measureLazyList-x0Ok8Vo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LazyListMeasureResult m780measureLazyListx0Ok8Vo(int i, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, List<Integer> list, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density, LazyLayoutItemAnimator<LazyListMeasuredItem> lazyLayoutItemAnimator, int i8, List<Integer> list2, boolean z3, final boolean z4, LazyListLayoutInfo lazyListLayoutInfo, CoroutineScope coroutineScope, final MutableState<Unit> mutableState, GraphicsContext graphicsContext, Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> function3) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider2;
        int i14;
        int i15;
        int i16;
        int i17;
        LazyListMeasuredItem lazyListMeasuredItem;
        int i18;
        LazyListMeasuredItem lazyListMeasuredItem2;
        int i19;
        int i20;
        int i21 = i3;
        if (i21 < 0) {
            throw new IllegalArgumentException("invalid beforeContentPadding".toString());
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("invalid afterContentPadding".toString());
        }
        if (i <= 0) {
            int m6220getMinWidthimpl = Constraints.m6220getMinWidthimpl(j);
            int m6219getMinHeightimpl = Constraints.m6219getMinHeightimpl(j);
            lazyLayoutItemAnimator.onMeasured(0, m6220getMinWidthimpl, m6219getMinHeightimpl, new ArrayList(), lazyListMeasuredItemProvider.getKeyIndexMap(), lazyListMeasuredItemProvider, z, z4, 1, z3, 0, 0, coroutineScope, graphicsContext);
            if (!z4) {
                long m838getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator.m838getMinSizeToFitDisappearingItemsYbymL2g();
                if (!IntSize.m6433equalsimpl0(m838getMinSizeToFitDisappearingItemsYbymL2g, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                    m6220getMinWidthimpl = ConstraintsKt.m6235constrainWidthK40F9xA(j, IntSize.m6435getWidthimpl(m838getMinSizeToFitDisappearingItemsYbymL2g));
                    m6219getMinHeightimpl = ConstraintsKt.m6234constrainHeightK40F9xA(j, IntSize.m6434getHeightimpl(m838getMinSizeToFitDisappearingItemsYbymL2g));
                }
            }
            return new LazyListMeasureResult(null, 0, false, 0.0f, function3.invoke(Integer.valueOf(m6220getMinWidthimpl), Integer.valueOf(m6219getMinHeightimpl), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }), 0.0f, false, coroutineScope, density, lazyListMeasuredItemProvider.getChildConstraints(), CollectionsKt.emptyList(), -i21, i2 + i4, 0, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5, null);
        }
        int i22 = i6;
        if (i22 >= i) {
            i22 = i - 1;
            i9 = 0;
        } else {
            i9 = i7;
        }
        int round = Math.round(f);
        int i23 = i9 - round;
        if (i22 == 0 && i23 < 0) {
            round += i23;
            i23 = 0;
        }
        int i24 = round;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i25 = -i21;
        int i26 = (i5 < 0 ? i5 : 0) + i25;
        int i27 = i23 + i26;
        int i28 = 0;
        while (i27 < 0 && i22 > 0) {
            int i29 = i22 - 1;
            int i30 = i26;
            LazyListMeasuredItem m786getAndMeasure0kLqBqw$default = LazyListMeasuredItemProvider.m786getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i29, 0L, 2, null);
            arrayDeque.add(0, m786getAndMeasure0kLqBqw$default);
            i28 = Math.max(i28, m786getAndMeasure0kLqBqw$default.getCrossAxisSize());
            i27 = m786getAndMeasure0kLqBqw$default.getMainAxisSizeWithSpacings() + i27;
            i22 = i29;
            i26 = i30;
            i25 = i25;
            i24 = i24;
        }
        int i31 = i27;
        int i32 = i24;
        int i33 = i25;
        int i34 = i26;
        int i35 = i28;
        if (i31 < i34) {
            i11 = i32 + i31;
            i10 = i34;
        } else {
            i10 = i31;
            i11 = i32;
        }
        int i36 = i10 - i34;
        int i37 = i2 + i4;
        int coerceAtLeast = RangesKt.coerceAtLeast(i37, 0);
        int i38 = -i36;
        int i39 = i22;
        int i40 = 0;
        boolean z5 = false;
        while (i40 < arrayDeque.size()) {
            if (i38 >= coerceAtLeast) {
                arrayDeque.remove(i40);
                z5 = true;
            } else {
                i39++;
                i38 += ((LazyListMeasuredItem) arrayDeque.get(i40)).getMainAxisSizeWithSpacings();
                i40++;
            }
        }
        int i41 = i22;
        int i42 = i35;
        int i43 = i36;
        int i44 = i38;
        boolean z6 = z5;
        int i45 = i37;
        int i46 = i39;
        while (i46 < i && (i44 < coerceAtLeast || i44 <= 0 || arrayDeque.isEmpty())) {
            int i47 = i45;
            int i48 = i44;
            int i49 = coerceAtLeast;
            int i50 = i41;
            int i51 = i43;
            int i52 = i42;
            LazyListMeasuredItem m786getAndMeasure0kLqBqw$default2 = LazyListMeasuredItemProvider.m786getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i46, 0L, 2, null);
            int i53 = i46;
            int mainAxisSizeWithSpacings = m786getAndMeasure0kLqBqw$default2.getMainAxisSizeWithSpacings() + i48;
            if (mainAxisSizeWithSpacings <= i34 && i53 != i - 1) {
                i20 = i53 + 1;
                i43 = i51 - m786getAndMeasure0kLqBqw$default2.getMainAxisSizeWithSpacings();
                z6 = true;
            } else {
                int max = Math.max(i52, m786getAndMeasure0kLqBqw$default2.getCrossAxisSize());
                arrayDeque.add(m786getAndMeasure0kLqBqw$default2);
                i43 = i51;
                i52 = max;
                i20 = i50;
            }
            i44 = mainAxisSizeWithSpacings;
            i45 = i47;
            i46 = i53 + 1;
            i42 = i52;
            i41 = i20;
            coerceAtLeast = i49;
        }
        int i54 = i45;
        int i55 = i41;
        int i56 = i43;
        int i57 = i42;
        int i58 = i46;
        int i59 = i44;
        if (i59 < i2) {
            int i60 = i2 - i59;
            int i61 = i59 + i60;
            int i62 = i56 - i60;
            i14 = i55;
            while (i62 < i21 && i14 > 0) {
                i14--;
                int i63 = i62;
                LazyListMeasuredItem m786getAndMeasure0kLqBqw$default3 = LazyListMeasuredItemProvider.m786getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i14, 0L, 2, null);
                arrayDeque.add(0, m786getAndMeasure0kLqBqw$default3);
                i57 = Math.max(i57, m786getAndMeasure0kLqBqw$default3.getCrossAxisSize());
                i62 = i63 + m786getAndMeasure0kLqBqw$default3.getMainAxisSizeWithSpacings();
                i58 = i58;
                i21 = i3;
            }
            i12 = i58;
            int i64 = i62;
            i13 = 0;
            lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
            i15 = i60 + i11;
            if (i64 < 0) {
                i15 += i64;
                i16 = i61 + i64;
                i17 = 0;
            } else {
                i16 = i61;
                i17 = i64;
            }
        } else {
            i12 = i58;
            i13 = 0;
            lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
            i14 = i55;
            i15 = i11;
            i16 = i59;
            i17 = i56;
        }
        float f2 = (MathKt.getSign(Math.round(f)) != MathKt.getSign(i15) || Math.abs(Math.round(f)) < Math.abs(i15)) ? f : i15;
        float f3 = f - f2;
        float f4 = 0.0f;
        if (z4 && i15 > i11 && f3 <= 0.0f) {
            f4 = (i15 - i11) + f3;
        }
        float f5 = f4;
        if (i17 < 0) {
            throw new IllegalArgumentException("negative currentFirstItemScrollOffset".toString());
        }
        int i65 = -i17;
        LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) arrayDeque.first();
        if (i3 > 0 || i5 < 0) {
            int size = arrayDeque.size();
            int i66 = i13;
            while (i66 < size) {
                int mainAxisSizeWithSpacings2 = ((LazyListMeasuredItem) arrayDeque.get(i66)).getMainAxisSizeWithSpacings();
                if (i17 == 0 || mainAxisSizeWithSpacings2 > i17) {
                    break;
                }
                lazyListMeasuredItem = lazyListMeasuredItem3;
                if (i66 == CollectionsKt.getLastIndex(arrayDeque)) {
                    break;
                }
                i17 -= mainAxisSizeWithSpacings2;
                i66++;
                lazyListMeasuredItem3 = (LazyListMeasuredItem) arrayDeque.get(i66);
            }
            lazyListMeasuredItem = lazyListMeasuredItem3;
            i18 = i17;
            lazyListMeasuredItem2 = lazyListMeasuredItem;
        } else {
            i18 = i17;
            lazyListMeasuredItem2 = lazyListMeasuredItem3;
        }
        List<LazyListMeasuredItem> createItemsBeforeList = createItemsBeforeList(i14, lazyListMeasuredItemProvider2, i8, list2);
        int size2 = createItemsBeforeList.size();
        int i67 = i57;
        for (int i68 = 0; i68 < size2; i68++) {
            i67 = Math.max(i67, createItemsBeforeList.get(i68).getCrossAxisSize());
        }
        ArrayDeque arrayDeque2 = arrayDeque;
        List<LazyListMeasuredItem> createItemsAfterList = createItemsAfterList(arrayDeque2, lazyListMeasuredItemProvider, i, i8, list2, f2, z4, lazyListLayoutInfo);
        int size3 = createItemsAfterList.size();
        int i69 = i67;
        for (int i70 = 0; i70 < size3; i70++) {
            i69 = Math.max(i69, createItemsAfterList.get(i70).getCrossAxisSize());
        }
        boolean z7 = Intrinsics.areEqual(lazyListMeasuredItem2, arrayDeque.first()) && createItemsBeforeList.isEmpty() && createItemsAfterList.isEmpty();
        int m6235constrainWidthK40F9xA = ConstraintsKt.m6235constrainWidthK40F9xA(j, z ? i69 : i16);
        if (z) {
            i69 = i16;
        }
        int m6234constrainHeightK40F9xA = ConstraintsKt.m6234constrainHeightK40F9xA(j, i69);
        float f6 = f2;
        final ArrayList calculateItemsOffsets = calculateItemsOffsets(arrayDeque2, createItemsBeforeList, createItemsAfterList, m6235constrainWidthK40F9xA, m6234constrainHeightK40F9xA, i16, i2, i65, z, vertical, horizontal, z2, density);
        LazyListMeasuredItem lazyListMeasuredItem4 = lazyListMeasuredItem2;
        lazyLayoutItemAnimator.onMeasured((int) f6, m6235constrainWidthK40F9xA, m6234constrainHeightK40F9xA, calculateItemsOffsets, lazyListMeasuredItemProvider.getKeyIndexMap(), lazyListMeasuredItemProvider, z, z4, 1, z3, i18, i16, coroutineScope, graphicsContext);
        int i71 = m6235constrainWidthK40F9xA;
        int i72 = i16;
        if (!z4) {
            long m838getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator.m838getMinSizeToFitDisappearingItemsYbymL2g();
            if (!IntSize.m6433equalsimpl0(m838getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                int i73 = z ? m6234constrainHeightK40F9xA : i71;
                i71 = ConstraintsKt.m6235constrainWidthK40F9xA(j, Math.max(i71, IntSize.m6435getWidthimpl(m838getMinSizeToFitDisappearingItemsYbymL2g2)));
                int m6234constrainHeightK40F9xA2 = ConstraintsKt.m6234constrainHeightK40F9xA(j, Math.max(m6234constrainHeightK40F9xA, IntSize.m6434getHeightimpl(m838getMinSizeToFitDisappearingItemsYbymL2g2)));
                int i74 = z ? m6234constrainHeightK40F9xA2 : i71;
                if (i74 != i73) {
                    int size4 = calculateItemsOffsets.size();
                    for (int i75 = 0; i75 < size4; i75++) {
                        calculateItemsOffsets.get(i75).updateMainAxisLayoutSize(i74);
                    }
                }
                i19 = m6234constrainHeightK40F9xA2;
                int i76 = i71;
                final LazyListMeasuredItem findOrComposeLazyListHeader = list.isEmpty() ? LazyListHeadersKt.findOrComposeLazyListHeader(calculateItemsOffsets, lazyListMeasuredItemProvider, list, i3, i76, i19) : null;
                boolean z8 = i12 >= i || i72 > i2;
                MeasureResult invoke = function3.invoke(Integer.valueOf(i76), Integer.valueOf(i19), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
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
                        List<LazyListMeasuredItem> list3 = calculateItemsOffsets;
                        LazyListMeasuredItem lazyListMeasuredItem5 = findOrComposeLazyListHeader;
                        boolean z9 = z4;
                        int size5 = list3.size();
                        for (int i77 = 0; i77 < size5; i77++) {
                            LazyListMeasuredItem lazyListMeasuredItem6 = list3.get(i77);
                            if (lazyListMeasuredItem6 != lazyListMeasuredItem5) {
                                lazyListMeasuredItem6.place(placementScope, z9);
                            }
                        }
                        LazyListMeasuredItem lazyListMeasuredItem7 = findOrComposeLazyListHeader;
                        if (lazyListMeasuredItem7 != null) {
                            lazyListMeasuredItem7.place(placementScope, z4);
                        }
                        ObservableScopeInvalidator.m847attachToScopeimpl(mutableState);
                    }
                });
                if (!z7) {
                    ArrayList arrayList = new ArrayList(calculateItemsOffsets.size());
                    int size5 = calculateItemsOffsets.size();
                    for (int i77 = 0; i77 < size5; i77++) {
                        LazyListMeasuredItem lazyListMeasuredItem5 = calculateItemsOffsets.get(i77);
                        LazyListMeasuredItem lazyListMeasuredItem6 = lazyListMeasuredItem5;
                        if ((lazyListMeasuredItem6.getIndex() >= ((LazyListMeasuredItem) arrayDeque.first()).getIndex() && lazyListMeasuredItem6.getIndex() <= ((LazyListMeasuredItem) arrayDeque.last()).getIndex()) || lazyListMeasuredItem6 == findOrComposeLazyListHeader) {
                            arrayList.add(lazyListMeasuredItem5);
                        }
                    }
                    calculateItemsOffsets = arrayList;
                }
                return new LazyListMeasureResult(lazyListMeasuredItem4, i18, z8, f6, invoke, f5, z6, coroutineScope, density, lazyListMeasuredItemProvider.getChildConstraints(), calculateItemsOffsets, i33, i54, i, z2, !z ? Orientation.Vertical : Orientation.Horizontal, i4, i5, null);
            }
        }
        i19 = m6234constrainHeightK40F9xA;
        int i762 = i71;
        if (list.isEmpty()) {
        }
        if (i12 >= i) {
        }
        MeasureResult invoke2 = function3.invoke(Integer.valueOf(i762), Integer.valueOf(i19), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
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
                List<LazyListMeasuredItem> list3 = calculateItemsOffsets;
                LazyListMeasuredItem lazyListMeasuredItem52 = findOrComposeLazyListHeader;
                boolean z9 = z4;
                int size52 = list3.size();
                for (int i772 = 0; i772 < size52; i772++) {
                    LazyListMeasuredItem lazyListMeasuredItem62 = list3.get(i772);
                    if (lazyListMeasuredItem62 != lazyListMeasuredItem52) {
                        lazyListMeasuredItem62.place(placementScope, z9);
                    }
                }
                LazyListMeasuredItem lazyListMeasuredItem7 = findOrComposeLazyListHeader;
                if (lazyListMeasuredItem7 != null) {
                    lazyListMeasuredItem7.place(placementScope, z4);
                }
                ObservableScopeInvalidator.m847attachToScopeimpl(mutableState);
            }
        });
        if (!z7) {
        }
        return new LazyListMeasureResult(lazyListMeasuredItem4, i18, z8, f6, invoke2, f5, z6, coroutineScope, density, lazyListMeasuredItemProvider.getChildConstraints(), calculateItemsOffsets, i33, i54, i, z2, !z ? Orientation.Vertical : Orientation.Horizontal, i4, i5, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        r6 = r6.get(r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final List<LazyListMeasuredItem> createItemsAfterList(List<LazyListMeasuredItem> list, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i, int i2, List<Integer> list2, float f, boolean z, LazyListLayoutInfo lazyListLayoutInfo) {
        ArrayList arrayList;
        LazyListItemInfo lazyListItemInfo;
        LazyListMeasuredItem lazyListMeasuredItem;
        LazyListMeasuredItem lazyListMeasuredItem2;
        int mainAxisSizeWithSpacings;
        LazyListMeasuredItem lazyListMeasuredItem3;
        int index;
        int min;
        LazyListMeasuredItem lazyListMeasuredItem4;
        LazyListMeasuredItem lazyListMeasuredItem5;
        int i3 = i - 1;
        int min2 = Math.min(((LazyListMeasuredItem) CollectionsKt.last((List) list)).getIndex() + i2, i3);
        int index2 = ((LazyListMeasuredItem) CollectionsKt.last((List) list)).getIndex() + 1;
        if (index2 <= min2) {
            int i4 = index2;
            arrayList = null;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(LazyListMeasuredItemProvider.m786getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i4, 0L, 2, null));
                if (i4 == min2) {
                    break;
                }
                i4++;
            }
        } else {
            arrayList = null;
        }
        if (z && lazyListLayoutInfo != null && !lazyListLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            List<LazyListItemInfo> visibleItemsInfo = lazyListLayoutInfo.getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    lazyListItemInfo = null;
                    break;
                }
                if (visibleItemsInfo.get(size).getIndex() <= min2 || (size != 0 && visibleItemsInfo.get(size - 1).getIndex() > min2)) {
                }
            }
            LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) CollectionsKt.last((List) lazyListLayoutInfo.getVisibleItemsInfo());
            if (lazyListItemInfo != null && (index = lazyListItemInfo.getIndex()) <= (min = Math.min(lazyListItemInfo2.getIndex(), i3))) {
                int i5 = index;
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                lazyListMeasuredItem5 = null;
                                break;
                            }
                            lazyListMeasuredItem5 = arrayList.get(i6);
                            if (lazyListMeasuredItem5.getIndex() == i5) {
                                break;
                            }
                            i6++;
                        }
                        lazyListMeasuredItem4 = lazyListMeasuredItem5;
                    } else {
                        lazyListMeasuredItem4 = null;
                    }
                    if (lazyListMeasuredItem4 == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(LazyListMeasuredItemProvider.m786getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i5, 0L, 2, null));
                    }
                    if (i5 == min) {
                        break;
                    }
                    i5++;
                }
            }
            float viewportEndOffset = ((lazyListLayoutInfo.getViewportEndOffset() - lazyListItemInfo2.getOffset()) - lazyListItemInfo2.getSize()) - f;
            if (viewportEndOffset > 0.0f) {
                int index3 = lazyListItemInfo2.getIndex() + 1;
                int i7 = 0;
                while (index3 < i && i7 < viewportEndOffset) {
                    if (index3 <= min2) {
                        int size3 = list.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size3) {
                                lazyListMeasuredItem3 = null;
                                break;
                            }
                            lazyListMeasuredItem3 = list.get(i8);
                            if (lazyListMeasuredItem3.getIndex() == index3) {
                                break;
                            }
                            i8++;
                        }
                        lazyListMeasuredItem = lazyListMeasuredItem3;
                    } else if (arrayList != null) {
                        int size4 = arrayList.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size4) {
                                lazyListMeasuredItem2 = null;
                                break;
                            }
                            lazyListMeasuredItem2 = arrayList.get(i9);
                            if (lazyListMeasuredItem2.getIndex() == index3) {
                                break;
                            }
                            i9++;
                        }
                        lazyListMeasuredItem = lazyListMeasuredItem2;
                    } else {
                        lazyListMeasuredItem = null;
                    }
                    if (lazyListMeasuredItem != null) {
                        index3++;
                        mainAxisSizeWithSpacings = lazyListMeasuredItem.getMainAxisSizeWithSpacings();
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(LazyListMeasuredItemProvider.m786getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, index3, 0L, 2, null));
                        index3++;
                        mainAxisSizeWithSpacings = ((LazyListMeasuredItem) CollectionsKt.last((List) arrayList)).getMainAxisSizeWithSpacings();
                    }
                    i7 += mainAxisSizeWithSpacings;
                }
            }
        }
        if (arrayList != null && ((LazyListMeasuredItem) CollectionsKt.last((List) arrayList)).getIndex() > min2) {
            min2 = ((LazyListMeasuredItem) CollectionsKt.last((List) arrayList)).getIndex();
        }
        int size5 = list2.size();
        for (int i10 = 0; i10 < size5; i10++) {
            int intValue = list2.get(i10).intValue();
            if (intValue > min2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(LazyListMeasuredItemProvider.m786getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, intValue, 0L, 2, null));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<LazyListMeasuredItem> createItemsBeforeList(int i, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i2, List<Integer> list) {
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider2;
        int max = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (max <= i3) {
            int i4 = i3;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
                arrayList.add(LazyListMeasuredItemProvider.m786getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider2, i4, 0L, 2, null));
                if (i4 == max) {
                    break;
                }
                i4--;
                lazyListMeasuredItemProvider = lazyListMeasuredItemProvider2;
            }
        } else {
            lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i5 = size - 1;
                int intValue = list.get(size).intValue();
                if (intValue < max) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(LazyListMeasuredItemProvider.m786getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider2, intValue, 0L, 2, null));
                }
                if (i5 < 0) {
                    break;
                }
                size = i5;
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<LazyListMeasuredItem> calculateItemsOffsets(List<LazyListMeasuredItem> list, List<LazyListMeasuredItem> list2, List<LazyListMeasuredItem> list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        int i6 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3 && i5 != 0) {
            throw new IllegalStateException("non-zero itemsScrollOffset".toString());
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no extra items".toString());
            }
            int size = list.size();
            int[] iArr = new int[size];
            for (int i7 = 0; i7 < size; i7++) {
                iArr[i7] = list.get(calculateItemsOffsets$reverseAware(i7, z2, size)).getSize();
            }
            int[] iArr2 = new int[size];
            for (int i8 = 0; i8 < size; i8++) {
                iArr2[i8] = 0;
            }
            if (z) {
                if (vertical == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                }
                vertical.arrange(density, i6, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    throw new IllegalArgumentException("null horizontalArrangement when isVertical == false".toString());
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
                    int i9 = iArr2[first];
                    LazyListMeasuredItem lazyListMeasuredItem = list.get(calculateItemsOffsets$reverseAware(first, z2, size));
                    if (z2) {
                        i9 = (i6 - i9) - lazyListMeasuredItem.getSize();
                    }
                    lazyListMeasuredItem.position(i9, i, i2);
                    arrayList.add(lazyListMeasuredItem);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size2 = list2.size();
            int i10 = i5;
            for (int i11 = 0; i11 < size2; i11++) {
                LazyListMeasuredItem lazyListMeasuredItem2 = list2.get(i11);
                i10 -= lazyListMeasuredItem2.getMainAxisSizeWithSpacings();
                lazyListMeasuredItem2.position(i10, i, i2);
                arrayList.add(lazyListMeasuredItem2);
            }
            int size3 = list.size();
            int i12 = i5;
            for (int i13 = 0; i13 < size3; i13++) {
                LazyListMeasuredItem lazyListMeasuredItem3 = list.get(i13);
                lazyListMeasuredItem3.position(i12, i, i2);
                arrayList.add(lazyListMeasuredItem3);
                i12 += lazyListMeasuredItem3.getMainAxisSizeWithSpacings();
            }
            int size4 = list3.size();
            for (int i14 = 0; i14 < size4; i14++) {
                LazyListMeasuredItem lazyListMeasuredItem4 = list3.get(i14);
                lazyListMeasuredItem4.position(i12, i, i2);
                arrayList.add(lazyListMeasuredItem4);
                i12 += lazyListMeasuredItem4.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }
}
