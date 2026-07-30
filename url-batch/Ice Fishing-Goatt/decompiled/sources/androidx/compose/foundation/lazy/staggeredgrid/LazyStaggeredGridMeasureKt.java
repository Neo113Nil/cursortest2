package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyStaggeredGridMeasure.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082\b\u001a5\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\n0\u000e¢\u0006\u0002\b\u000fH\u0083\b¢\u0006\u0002\u0010\u0010\u001aR\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u000e2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u0001H\u0083\b\u001a;\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00142\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\"\u001a\u001d\u0010#\u001a\u00020\b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001e0\u001dH\u0002¢\u0006\u0002\u0010$\u001a\u001c\u0010%\u001a\u00020\u0005*\u00020\u00142\u0006\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020\u0003H\u0002\u001a7\u0010(\u001a\u00020\u0005\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00122\b\b\u0002\u0010)\u001a\u00020\u00012\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\b\u001a\u001c\u0010+\u001a\u00020\u0003*\u00020\u00142\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0003H\u0002\u001a+\u0010.\u001a\u00020\u0005*\u00020/2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\bø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\f\u00102\u001a\u00020\u0003*\u00020 H\u0002\u001a2\u00103\u001a\u00020\u0003\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u001d2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00030\u000eH\u0082\b¢\u0006\u0002\u00104\u001a\u0016\u00105\u001a\u00020\u0003*\u00020 2\b\b\u0002\u00106\u001a\u00020\u0003H\u0000\u001a\u001e\u00107\u001a\u00020\u0003*\u00020 2\u0006\u00108\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a,\u0010;\u001a\u00020<*\u00020\u00142\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020 2\u0006\u0010?\u001a\u00020 2\u0006\u0010@\u001a\u00020\u0001H\u0003\u001a\u008c\u0001\u0010A\u001a\u00020<*\u00020\f2\u0006\u0010B\u001a\u00020C2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u00012\u0006\u0010L\u001a\u00020\u00012\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010R\u001a\u00020\u00032\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020VH\u0001ø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a\u0014\u0010Y\u001a\u00020\u0005*\u00020 2\u0006\u0010Z\u001a\u00020\u0003H\u0002\u001a!\u0010[\u001a\u00020 *\u00020 2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eH\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\\"}, d2 = {"DebugLoggingEnabled", "", "Unset", "", "debugLog", "", "message", "Lkotlin/Function0;", "", "withDebugLogging", "T", "scope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "calculateExtraItems", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "position", "filter", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "itemIndex", "beforeVisibleBounds", "calculateVisibleItems", "measuredItems", "", "Lkotlin/collections/ArrayDeque;", "itemScrollOffsets", "", "mainAxisLayoutSize", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[II)Ljava/util/List;", "debugRender", "([Lkotlin/collections/ArrayDeque;)Ljava/lang/String;", "ensureIndicesInRange", "indices", "itemCount", "fastForEach", "reverse", "action", "findPreviousItemIndex", "item", "lane", "forEach", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "forEach-nIS5qE8", "(JLkotlin/jvm/functions/Function1;)V", "indexOfMaxValue", "indexOfMinBy", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "indexOfMinValue", "minBound", "maxInRange", "indexRange", "maxInRange-jy6DScQ", "([IJ)I", "measure", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "initialScrollDelta", "initialItemIndices", "initialItemOffsets", "canRestartMeasure", "measureStaggeredGrid", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "pinnedItems", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "resolvedSlots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "isVertical", "reverseLayout", "contentOffset", "Landroidx/compose/ui/unit/IntOffset;", "mainAxisAvailableSize", "mainAxisSpacing", "beforeContentPadding", "afterContentPadding", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "measureStaggeredGrid-XtK8cYQ", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIIILkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "offsetBy", "delta", "transform", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;
    private static final int Unset = Integer.MIN_VALUE;

    private static final void debugLog(Function0<String> function0) {
    }

    private static final <T> T withDebugLogging(LazyLayoutMeasureScope lazyLayoutMeasureScope, Function1<? super LazyLayoutMeasureScope, ? extends T> function1) {
        return function1.invoke(lazyLayoutMeasureScope);
    }

    private static final String debugRender(ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr) {
        return "";
    }

    /* renamed from: measureStaggeredGrid-XtK8cYQ, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m884measureStaggeredGridXtK8cYQ(LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j, boolean z, boolean z2, long j2, int i, int i2, int i3, int i4, CoroutineScope coroutineScope, GraphicsContext graphicsContext) {
        int i5;
        int m883maxInRangejy6DScQ;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j, z, lazyLayoutMeasureScope, i, j2, i3, i4, z2, i2, coroutineScope, graphicsContext, null);
        int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyStaggeredGridItemProvider, lazyStaggeredGridState.getScrollPosition().getIndices());
        int[] scrollOffsets = lazyStaggeredGridState.getScrollPosition().getScrollOffsets();
        if (updateScrollPositionIfTheFirstItemWasMoved$foundation_release.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
            int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr = new int[laneCount];
            int i6 = 0;
            while (i6 < laneCount) {
                if (i6 >= updateScrollPositionIfTheFirstItemWasMoved$foundation_release.length || (m883maxInRangejy6DScQ = updateScrollPositionIfTheFirstItemWasMoved$foundation_release[i6]) == -1) {
                    m883maxInRangejy6DScQ = i6 == 0 ? 0 : m883maxInRangejy6DScQ(iArr, SpanRange.m894constructorimpl(0, i6)) + 1;
                }
                iArr[i6] = m883maxInRangejy6DScQ;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i6], i6);
                i6++;
            }
            updateScrollPositionIfTheFirstItemWasMoved$foundation_release = iArr;
        }
        if (scrollOffsets.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            int laneCount2 = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr2 = new int[laneCount2];
            int i7 = 0;
            while (i7 < laneCount2) {
                if (i7 < scrollOffsets.length) {
                    i5 = scrollOffsets[i7];
                } else {
                    i5 = i7 == 0 ? 0 : iArr2[i7 - 1];
                }
                iArr2[i7] = i5;
                i7++;
            }
            scrollOffsets = iArr2;
        }
        return measure(lazyStaggeredGridMeasureContext, Math.round(lazyStaggeredGridState.getScrollToBeConsumed()), updateScrollPositionIfTheFirstItemWasMoved$foundation_release, scrollOffsets, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x0543, code lost:
    
        if ((r3 != null ? r3.getIndex() : -1) > r15) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x05dc, code lost:
    
        if (r9[r14] < r13) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x02eb, code lost:
    
        r4 = indexOfMinValue$default(r8, 0, 1, null);
        r5 = indexOfMaxValue(r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x02f6, code lost:
    
        if (r4 == r5) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x02fc, code lost:
    
        if (r8[r4] != r8[r5]) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x02fe, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0300, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0301, code lost:
    
        r5 = r29[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0304, code lost:
    
        if (r5 != (-1)) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0306, code lost:
    
        r5 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0307, code lost:
    
        r5 = findPreviousItemIndex(r0, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x030b, code lost:
    
        if (r5 >= 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0342, code lost:
    
        r7 = r29;
        r10 = r30;
        r46 = r1;
        r45 = r2;
        r1 = r0.m879getSpanRangelOCCd4c(r0.getItemProvider(), r5, r4);
        r4 = r0.getLaneInfo();
        r9 = r12;
        r26 = r13;
        r12 = (int) (r1 & 4294967295L);
        r29 = r14;
        r13 = (int) (r1 >> 32);
        r14 = r12 - r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0364, code lost:
    
        if (r14 == 1) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0366, code lost:
    
        r15 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0369, code lost:
    
        r4.setLane(r5, r15);
        r4 = r0.getMeasuredItemProvider().m888getAndMeasurejy6DScQ(r5, r1);
        r1 = m883maxInRangejy6DScQ(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0379, code lost:
    
        if (r14 == 1) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x037b, code lost:
    
        r2 = r0.getLaneInfo().getGaps(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0385, code lost:
    
        r14 = r13;
        r13 = r46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0388, code lost:
    
        if (r14 >= r12) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x038c, code lost:
    
        if (r8[r14] == r1) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x038e, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x038f, code lost:
    
        r27[r14].addFirst(r4);
        r7[r14] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0396, code lost:
    
        if (r2 != null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0398, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x039c, code lost:
    
        r8[r14] = (r1 + r4.getMainAxisSizeWithSpacings()) + r15;
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x039a, code lost:
    
        r15 = r2[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0384, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0368, code lost:
    
        r15 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x030d, code lost:
    
        r7 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x030f, code lost:
    
        if (r1 != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0315, code lost:
    
        if (measure$lambda$41$misalignedStart(r7, r0, r8, r4) == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0317, code lost:
    
        if (r47 == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0319, code lost:
    
        r0.getLaneInfo().reset();
        r1 = r7.length;
        r2 = new int[r1];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0324, code lost:
    
        if (r3 >= r1) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0326, code lost:
    
        r2[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x032d, code lost:
    
        r1 = r8.length;
        r3 = new int[r1];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0331, code lost:
    
        if (r5 >= r1) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0333, code lost:
    
        r3[r5] = r8[r4];
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0341, code lost:
    
        return measure(r0, r30, r2, r3, false);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final LazyStaggeredGridMeasureResult measure(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int[] iArr, int[] iArr2, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr3;
        int[] iArr4;
        int i7;
        int[] iArr5;
        int i8;
        int i9;
        int[] iArr6;
        int[] iArr7;
        int i10;
        int i11;
        int[] iArr8;
        int i12;
        int[] iArr9;
        boolean z2;
        int m6235constrainWidthK40F9xA;
        int m6217getMaxHeightimpl;
        int i13;
        List list;
        int i14;
        int i15;
        boolean z3;
        List<Integer> list2;
        List list3;
        int i16;
        int[] iArr10;
        int i17;
        int i18;
        int[] iArr11;
        boolean z4;
        final LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
        LazyLayoutMeasureScope measureScope = lazyStaggeredGridMeasureContext2.getMeasureScope();
        int itemCount = lazyStaggeredGridMeasureContext2.getItemProvider().getItemCount();
        if (itemCount <= 0 || lazyStaggeredGridMeasureContext2.getLaneCount() == 0) {
            int m6220getMinWidthimpl = Constraints.m6220getMinWidthimpl(lazyStaggeredGridMeasureContext.getConstraints());
            int m6219getMinHeightimpl = Constraints.m6219getMinHeightimpl(lazyStaggeredGridMeasureContext.getConstraints());
            lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation_release().onMeasured(0, m6220getMinWidthimpl, m6219getMinHeightimpl, new ArrayList(), lazyStaggeredGridMeasureContext.getMeasuredItemProvider().getKeyIndexMap(), lazyStaggeredGridMeasureContext.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext.getIsVertical(), false, lazyStaggeredGridMeasureContext.getLaneCount(), false, 0, 0, lazyStaggeredGridMeasureContext.getCoroutineScope(), lazyStaggeredGridMeasureContext.getGraphicsContext());
            long m838getMinSizeToFitDisappearingItemsYbymL2g = lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation_release().m838getMinSizeToFitDisappearingItemsYbymL2g();
            if (!IntSize.m6433equalsimpl0(m838getMinSizeToFitDisappearingItemsYbymL2g, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                m6220getMinWidthimpl = ConstraintsKt.m6235constrainWidthK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), IntSize.m6435getWidthimpl(m838getMinSizeToFitDisappearingItemsYbymL2g));
                m6219getMinHeightimpl = ConstraintsKt.m6234constrainHeightK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), IntSize.m6434getHeightimpl(m838getMinSizeToFitDisappearingItemsYbymL2g));
            }
            return new LazyStaggeredGridMeasureResult(iArr, iArr2, 0.0f, MeasureScope.layout$default(measureScope, m6220getMinWidthimpl, m6219getMinHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null), false, lazyStaggeredGridMeasureContext.getIsVertical(), false, lazyStaggeredGridMeasureContext.getResolvedSlots(), lazyStaggeredGridMeasureContext.getItemProvider().getSpanProvider(), measureScope, itemCount, CollectionsKt.emptyList(), IntSizeKt.IntSize(Constraints.m6220getMinWidthimpl(lazyStaggeredGridMeasureContext.getConstraints()), Constraints.m6219getMinHeightimpl(lazyStaggeredGridMeasureContext.getConstraints())), -lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), lazyStaggeredGridMeasureContext.getCoroutineScope(), null);
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        String str = "copyOf(this, size)";
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        int[] copyOf2 = Arrays.copyOf(iArr2, iArr2.length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
        ensureIndicesInRange(lazyStaggeredGridMeasureContext2, copyOf, itemCount);
        offsetBy(copyOf2, -i);
        int laneCount = lazyStaggeredGridMeasureContext2.getLaneCount();
        ArrayDeque[] arrayDequeArr = new ArrayDeque[laneCount];
        for (int i19 = 0; i19 < laneCount; i19++) {
            arrayDequeArr[i19] = new ArrayDeque(16);
        }
        offsetBy(copyOf2, -lazyStaggeredGridMeasureContext2.getBeforeContentPadding());
        boolean z5 = false;
        while (true) {
            if (!measure$lambda$41$hasSpaceBeforeFirst(copyOf, copyOf2, lazyStaggeredGridMeasureContext2)) {
                i2 = 0;
                i3 = -1;
                break;
            }
            i3 = indexOfMaxValue(copyOf);
            int i20 = copyOf[i3];
            int length = copyOf2.length;
            i2 = 0;
            for (int i21 = 0; i21 < length; i21++) {
                if (copyOf[i21] != copyOf[i3]) {
                    int i22 = copyOf2[i21];
                    int i23 = copyOf2[i3];
                    if (i22 < i23) {
                        copyOf2[i21] = i23;
                    }
                }
            }
            int findPreviousItemIndex = findPreviousItemIndex(lazyStaggeredGridMeasureContext2, i20, i3);
            if (findPreviousItemIndex < 0) {
                break;
            }
            long m879getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext2.m879getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext2.getItemProvider(), findPreviousItemIndex, i3);
            int i24 = (int) (m879getSpanRangelOCCd4c & 4294967295L);
            boolean z6 = z5;
            int i25 = (int) (m879getSpanRangelOCCd4c >> 32);
            int i26 = i24 - i25;
            lazyStaggeredGridMeasureContext2.getLaneInfo().setLane(findPreviousItemIndex, i26 != 1 ? -2 : i25);
            LazyStaggeredGridMeasuredItem m888getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext2.getMeasuredItemProvider().m888getAndMeasurejy6DScQ(findPreviousItemIndex, m879getSpanRangelOCCd4c);
            int m883maxInRangejy6DScQ = m883maxInRangejy6DScQ(copyOf2, m879getSpanRangelOCCd4c);
            int[] gaps = i26 != 1 ? lazyStaggeredGridMeasureContext2.getLaneInfo().getGaps(findPreviousItemIndex) : null;
            boolean z7 = z6;
            while (i25 < i24) {
                copyOf[i25] = findPreviousItemIndex;
                int mainAxisSizeWithSpacings = m883maxInRangejy6DScQ + m888getAndMeasurejy6DScQ.getMainAxisSizeWithSpacings() + (gaps == null ? 0 : gaps[i25]);
                copyOf2[i25] = mainAxisSizeWithSpacings;
                if (lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize() + mainAxisSizeWithSpacings <= 0) {
                    z7 = true;
                }
                i25++;
            }
            z5 = z7;
        }
        boolean z8 = z5;
        int i27 = -lazyStaggeredGridMeasureContext2.getBeforeContentPadding();
        int i28 = copyOf2[i2];
        if (i28 < i27) {
            i4 = i + i28;
            offsetBy(copyOf2, i27 - i28);
        } else {
            i4 = i;
        }
        offsetBy(copyOf2, lazyStaggeredGridMeasureContext2.getBeforeContentPadding());
        int i29 = -1;
        if (i3 == -1) {
            i3 = ArraysKt.indexOf(copyOf, i2);
        }
        if (i3 != -1 && measure$lambda$41$misalignedStart(copyOf, lazyStaggeredGridMeasureContext2, copyOf2, i3) && z) {
            lazyStaggeredGridMeasureContext2.getLaneInfo().reset();
            int length2 = copyOf.length;
            int[] iArr12 = new int[length2];
            int i30 = 0;
            while (i30 < length2) {
                iArr12[i30] = i29;
                i30++;
                i29 = -1;
            }
            int length3 = copyOf2.length;
            int[] iArr13 = new int[length3];
            for (int i31 = 0; i31 < length3; i31++) {
                iArr13[i31] = copyOf2[i3];
            }
            return measure(lazyStaggeredGridMeasureContext2, i4, iArr12, iArr13, false);
        }
        int[] copyOf3 = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(copyOf3, "copyOf(this, size)");
        int length4 = copyOf2.length;
        int[] iArr14 = new int[length4];
        for (int i32 = 0; i32 < length4; i32++) {
            iArr14[i32] = -copyOf2[i32];
        }
        int mainAxisSpacing = i27 + lazyStaggeredGridMeasureContext2.getMainAxisSpacing();
        int coerceAtLeast = RangesKt.coerceAtLeast(lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext2.getAfterContentPadding(), 0);
        LazyLayoutMeasureScope lazyLayoutMeasureScope = measureScope;
        boolean z9 = z8;
        int indexOfMinValue$default = indexOfMinValue$default(copyOf3, 0, 1, null);
        int i33 = 0;
        for (int i34 = -1; indexOfMinValue$default != i34 && i33 < lazyStaggeredGridMeasureContext2.getLaneCount(); i34 = -1) {
            int i35 = copyOf3[indexOfMinValue$default];
            int indexOfMinValue = indexOfMinValue(copyOf3, i35);
            i33++;
            if (i35 >= 0) {
                long m879getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext2.m879getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext2.getItemProvider(), i35, indexOfMinValue$default);
                ArrayDeque[] arrayDequeArr2 = arrayDequeArr;
                LazyStaggeredGridMeasuredItem m888getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext2.getMeasuredItemProvider().m888getAndMeasurejy6DScQ(i35, m879getSpanRangelOCCd4c2);
                String str2 = str;
                int[] iArr15 = copyOf;
                int[] iArr16 = copyOf2;
                int i36 = (int) (m879getSpanRangelOCCd4c2 & 4294967295L);
                int i37 = i4;
                int i38 = itemCount;
                int i39 = (int) (m879getSpanRangelOCCd4c2 >> 32);
                int i40 = i36 - i39;
                lazyStaggeredGridMeasureContext2.getLaneInfo().setLane(i35, i40 != 1 ? -2 : i39);
                int m883maxInRangejy6DScQ2 = m883maxInRangejy6DScQ(iArr14, m879getSpanRangelOCCd4c2);
                for (int i41 = i39; i41 < i36; i41++) {
                    iArr14[i41] = m888getAndMeasurejy6DScQ2.getMainAxisSizeWithSpacings() + m883maxInRangejy6DScQ2;
                    copyOf3[i41] = i35;
                    arrayDequeArr2[i41].addLast(m888getAndMeasurejy6DScQ2);
                }
                if (m883maxInRangejy6DScQ2 >= mainAxisSpacing || iArr14[i39] > mainAxisSpacing) {
                    z4 = z9;
                } else {
                    m888getAndMeasurejy6DScQ2.setVisible(false);
                    z4 = true;
                }
                i33 = i40 != 1 ? lazyStaggeredGridMeasureContext2.getLaneCount() : i33;
                copyOf2 = iArr16;
                z9 = z4;
                indexOfMinValue$default = indexOfMinValue;
                arrayDequeArr = arrayDequeArr2;
                str = str2;
                copyOf = iArr15;
                i4 = i37;
                itemCount = i38;
            } else {
                indexOfMinValue$default = indexOfMinValue;
            }
        }
        String str3 = str;
        int[] iArr17 = copyOf;
        int[] iArr18 = copyOf2;
        ArrayDeque[] arrayDequeArr3 = arrayDequeArr;
        int i42 = i4;
        int i43 = itemCount;
        loop9: while (true) {
            int i44 = 0;
            while (true) {
                if (i44 < length4) {
                    int i45 = iArr14[i44];
                    if (i45 < coerceAtLeast || i45 <= 0) {
                        break;
                    }
                    i44++;
                } else {
                    for (int i46 = 0; i46 < laneCount; i46++) {
                        if (!arrayDequeArr3[i46].isEmpty()) {
                            i5 = i43;
                            i6 = 1;
                            break loop9;
                        }
                    }
                }
            }
            i6 = 1;
            int indexOfMinValue$default2 = indexOfMinValue$default(iArr14, 0, 1, null);
            int maxOrThrow = ArraysKt.maxOrThrow(copyOf3) + 1;
            i5 = i43;
            if (maxOrThrow >= i5) {
                break;
            }
            boolean z10 = z9;
            int[] iArr19 = iArr18;
            int[] iArr20 = copyOf3;
            int i47 = length4;
            int[] iArr21 = iArr14;
            LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
            String str4 = str3;
            int i48 = i42;
            int i49 = coerceAtLeast;
            int i50 = laneCount;
            long m879getSpanRangelOCCd4c3 = lazyStaggeredGridMeasureContext2.m879getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext2.getItemProvider(), maxOrThrow, indexOfMinValue$default2);
            int i51 = (int) (m879getSpanRangelOCCd4c3 & 4294967295L);
            int i52 = (int) (m879getSpanRangelOCCd4c3 >> 32);
            int i53 = i51 - i52;
            lazyStaggeredGridMeasureContext2.getLaneInfo().setLane(maxOrThrow, i53 != 1 ? -2 : i52);
            LazyStaggeredGridMeasuredItem m888getAndMeasurejy6DScQ3 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m888getAndMeasurejy6DScQ(maxOrThrow, m879getSpanRangelOCCd4c3);
            int m883maxInRangejy6DScQ3 = m883maxInRangejy6DScQ(iArr21, m879getSpanRangelOCCd4c3);
            if (i53 != 1) {
                iArr11 = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(maxOrThrow);
                if (iArr11 == null) {
                    iArr11 = new int[lazyStaggeredGridMeasureContext.getLaneCount()];
                }
            } else {
                iArr11 = null;
            }
            for (int i54 = i52; i54 < i51; i54++) {
                if (iArr11 != null) {
                    iArr11[i54] = m883maxInRangejy6DScQ3 - iArr21[i54];
                }
                iArr20[i54] = maxOrThrow;
                iArr21[i54] = m883maxInRangejy6DScQ3 + m888getAndMeasurejy6DScQ3.getMainAxisSizeWithSpacings();
                arrayDequeArr3[i54].addLast(m888getAndMeasurejy6DScQ3);
            }
            lazyStaggeredGridMeasureContext.getLaneInfo().setGaps(maxOrThrow, iArr11);
            if (m883maxInRangejy6DScQ3 < mainAxisSpacing && iArr21[i52] <= mainAxisSpacing) {
                m888getAndMeasurejy6DScQ3.setVisible(false);
            }
            lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
            lazyLayoutMeasureScope = lazyLayoutMeasureScope2;
            i42 = i48;
            i43 = i5;
            coerceAtLeast = i49;
            z9 = z10;
            iArr18 = iArr19;
            laneCount = i50;
            iArr14 = iArr21;
            str3 = str4;
            length4 = i47;
            copyOf3 = iArr20;
        }
        int i55 = 0;
        while (i55 < laneCount) {
            ArrayDeque arrayDeque = arrayDequeArr3[i55];
            while (arrayDeque.size() > i6 && !((LazyStaggeredGridMeasuredItem) arrayDeque.first()).getIsVisible()) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) arrayDeque.removeFirst();
                int[] gaps2 = lazyStaggeredGridMeasuredItem.getSpan() != i6 ? lazyStaggeredGridMeasureContext2.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem.getIndex()) : null;
                iArr18[i55] = iArr18[i55] - (lazyStaggeredGridMeasuredItem.getMainAxisSizeWithSpacings() + (gaps2 == null ? 0 : gaps2[i55]));
                i6 = 1;
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) arrayDeque.firstOrNull();
            iArr17[i55] = lazyStaggeredGridMeasuredItem2 != null ? lazyStaggeredGridMeasuredItem2.getIndex() : -1;
            i55++;
            i6 = 1;
        }
        int length5 = copyOf3.length;
        int i56 = 0;
        while (true) {
            if (i56 >= length5) {
                break;
            }
            if (copyOf3[i56] == i5 - 1) {
                offsetBy(iArr14, -lazyStaggeredGridMeasureContext2.getMainAxisSpacing());
                break;
            }
            i56++;
        }
        int i57 = 0;
        while (true) {
            if (i57 < length4) {
                if (iArr14[i57] >= lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize()) {
                    iArr3 = iArr18;
                    i7 = coerceAtLeast;
                    iArr5 = copyOf3;
                    i8 = length4;
                    iArr6 = iArr14;
                    iArr4 = iArr17;
                    i9 = i42;
                    break;
                }
                i57++;
            } else {
                int mainAxisAvailableSize = lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize() - iArr14[indexOfMaxValue(iArr14)];
                iArr3 = iArr18;
                offsetBy(iArr3, -mainAxisAvailableSize);
                offsetBy(iArr14, mainAxisAvailableSize);
                boolean z11 = false;
                loop26: while (true) {
                    int length6 = iArr3.length;
                    int i58 = 0;
                    while (true) {
                        if (i58 >= length6) {
                            iArr4 = iArr17;
                            break loop26;
                        }
                        if (iArr3[i58] < lazyStaggeredGridMeasureContext2.getBeforeContentPadding()) {
                            break;
                        }
                        i58++;
                        iArr17 = iArr17;
                    }
                    coerceAtLeast = i11;
                    copyOf3 = iArr8;
                    i42 = i10;
                    z11 = z2;
                    length4 = i12;
                    iArr14 = iArr9;
                    iArr17 = iArr7;
                }
                int i59 = i42;
                i7 = coerceAtLeast;
                iArr5 = copyOf3;
                i8 = length4;
                int[] iArr22 = iArr14;
                if (z11 && z) {
                    lazyStaggeredGridMeasureContext2.getLaneInfo().reset();
                    return measure(lazyStaggeredGridMeasureContext2, i59, iArr4, iArr3, false);
                }
                i9 = i59 + mainAxisAvailableSize;
                int i60 = iArr3[indexOfMinValue$default(iArr3, 0, 1, null)];
                if (i60 < 0) {
                    i9 += i60;
                    iArr6 = iArr22;
                    offsetBy(iArr6, i60);
                    offsetBy(iArr3, -i60);
                } else {
                    iArr6 = iArr22;
                }
            }
        }
        float scrollToBeConsumed = (MathKt.getSign(Math.round(lazyStaggeredGridMeasureContext2.getState().getScrollToBeConsumed())) != MathKt.getSign(i9) || Math.abs(Math.round(lazyStaggeredGridMeasureContext2.getState().getScrollToBeConsumed())) < Math.abs(i9)) ? lazyStaggeredGridMeasureContext2.getState().getScrollToBeConsumed() : i9;
        int[] copyOf4 = Arrays.copyOf(iArr3, iArr3.length);
        Intrinsics.checkNotNullExpressionValue(copyOf4, str3);
        int length7 = copyOf4.length;
        for (int i61 = 0; i61 < length7; i61++) {
            copyOf4[i61] = -copyOf4[i61];
        }
        if (lazyStaggeredGridMeasureContext2.getBeforeContentPadding() > lazyStaggeredGridMeasureContext2.getMainAxisSpacing()) {
            for (int i62 = 0; i62 < laneCount; i62++) {
                ArrayDeque arrayDeque2 = arrayDequeArr3[i62];
                int size = arrayDeque2.size();
                int i63 = 0;
                while (i63 < size) {
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem3 = (LazyStaggeredGridMeasuredItem) arrayDeque2.get(i63);
                    int[] gaps3 = lazyStaggeredGridMeasureContext2.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem3.getIndex());
                    int mainAxisSizeWithSpacings2 = lazyStaggeredGridMeasuredItem3.getMainAxisSizeWithSpacings() + (gaps3 == null ? 0 : gaps3[i62]);
                    if (i63 != CollectionsKt.getLastIndex(arrayDeque2) && (i18 = iArr3[i62]) != 0 && i18 >= mainAxisSizeWithSpacings2) {
                        iArr3[i62] = i18 - mainAxisSizeWithSpacings2;
                        i63++;
                        iArr4[i62] = ((LazyStaggeredGridMeasuredItem) arrayDeque2.get(i63)).getIndex();
                    }
                }
            }
        }
        int beforeContentPadding = lazyStaggeredGridMeasureContext2.getBeforeContentPadding() + lazyStaggeredGridMeasureContext2.getAfterContentPadding();
        if (lazyStaggeredGridMeasureContext2.getIsVertical()) {
            m6235constrainWidthK40F9xA = Constraints.m6218getMaxWidthimpl(lazyStaggeredGridMeasureContext2.getConstraints());
        } else {
            m6235constrainWidthK40F9xA = ConstraintsKt.m6235constrainWidthK40F9xA(lazyStaggeredGridMeasureContext2.getConstraints(), ArraysKt.maxOrThrow(iArr6) + beforeContentPadding);
        }
        int i64 = m6235constrainWidthK40F9xA;
        if (lazyStaggeredGridMeasureContext2.getIsVertical()) {
            m6217getMaxHeightimpl = ConstraintsKt.m6234constrainHeightK40F9xA(lazyStaggeredGridMeasureContext2.getConstraints(), ArraysKt.maxOrThrow(iArr6) + beforeContentPadding);
        } else {
            m6217getMaxHeightimpl = Constraints.m6217getMaxHeightimpl(lazyStaggeredGridMeasureContext2.getConstraints());
        }
        int i65 = m6217getMaxHeightimpl;
        int min = (Math.min(lazyStaggeredGridMeasureContext2.getIsVertical() ? i65 : i64, lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize()) - lazyStaggeredGridMeasureContext2.getBeforeContentPadding()) + lazyStaggeredGridMeasureContext2.getAfterContentPadding();
        int i66 = copyOf4[0];
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext2.getPinnedItems();
        int size2 = pinnedItems.size() - 1;
        if (size2 >= 0) {
            int i67 = size2;
            int i68 = i66;
            list = null;
            while (true) {
                int i69 = i67 - 1;
                int intValue = pinnedItems.get(i67).intValue();
                int lane = lazyStaggeredGridMeasureContext2.getLaneInfo().getLane(intValue);
                i13 = beforeContentPadding;
                if (lane != -2 && lane != -1) {
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem4 = (LazyStaggeredGridMeasuredItem) arrayDequeArr3[lane].firstOrNull();
                } else {
                    for (int i70 = 0; i70 < laneCount; i70++) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem5 = (LazyStaggeredGridMeasuredItem) arrayDequeArr3[i70].firstOrNull();
                        if ((lazyStaggeredGridMeasuredItem5 != null ? lazyStaggeredGridMeasuredItem5.getIndex() : -1) <= intValue) {
                            i17 = laneCount;
                            break;
                        }
                    }
                    List list4 = list;
                    i17 = laneCount;
                    long m879getSpanRangelOCCd4c4 = lazyStaggeredGridMeasureContext2.m879getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext2.getItemProvider(), intValue, 0);
                    ArrayList arrayList = list4 == null ? new ArrayList() : list4;
                    LazyStaggeredGridMeasuredItem m888getAndMeasurejy6DScQ4 = lazyStaggeredGridMeasureContext2.getMeasuredItemProvider().m888getAndMeasurejy6DScQ(intValue, m879getSpanRangelOCCd4c4);
                    i68 -= m888getAndMeasurejy6DScQ4.getMainAxisSizeWithSpacings();
                    m888getAndMeasurejy6DScQ4.position(i68, 0, min);
                    arrayList.add(m888getAndMeasurejy6DScQ4);
                    list = arrayList;
                }
                if (i69 < 0) {
                    break;
                }
                beforeContentPadding = i13;
                i67 = i69;
                laneCount = i17;
            }
        } else {
            i13 = beforeContentPadding;
            list = null;
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        List<LazyStaggeredGridMeasuredItem> calculateVisibleItems = calculateVisibleItems(lazyStaggeredGridMeasureContext2, arrayDequeArr3, copyOf4, min);
        int i71 = copyOf4[0];
        List<Integer> pinnedItems2 = lazyStaggeredGridMeasureContext2.getPinnedItems();
        int size3 = pinnedItems2.size();
        int i72 = 0;
        ArrayList arrayList2 = null;
        while (i72 < size3) {
            int intValue2 = pinnedItems2.get(i72).intValue();
            if (intValue2 >= i5) {
                list2 = pinnedItems2;
            } else {
                int lane2 = lazyStaggeredGridMeasureContext2.getLaneInfo().getLane(intValue2);
                list2 = pinnedItems2;
                if (lane2 == -2 || lane2 == -1) {
                    for (int i73 : iArr5) {
                        if (i73 < intValue2) {
                        }
                    }
                    list3 = list;
                    i16 = size3;
                    long m879getSpanRangelOCCd4c5 = lazyStaggeredGridMeasureContext2.m879getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext2.getItemProvider(), intValue2, 0);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    iArr10 = iArr4;
                    List list5 = arrayList2;
                    LazyStaggeredGridMeasuredItem m888getAndMeasurejy6DScQ5 = lazyStaggeredGridMeasureContext2.getMeasuredItemProvider().m888getAndMeasurejy6DScQ(intValue2, m879getSpanRangelOCCd4c5);
                    m888getAndMeasurejy6DScQ5.position(i71, 0, min);
                    i71 += m888getAndMeasurejy6DScQ5.getMainAxisSizeWithSpacings();
                    list5.add(m888getAndMeasurejy6DScQ5);
                    arrayList2 = list5;
                }
                i72++;
                pinnedItems2 = list2;
                list = list3;
                size3 = i16;
                iArr4 = iArr10;
            }
            list3 = list;
            i16 = size3;
            iArr10 = iArr4;
            i72++;
            pinnedItems2 = list2;
            list = list3;
            size3 = i16;
            iArr4 = iArr10;
        }
        List list6 = list;
        int[] iArr23 = iArr4;
        if (arrayList2 == null) {
            arrayList2 = CollectionsKt.emptyList();
        }
        final ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(list6);
        arrayList3.addAll(calculateVisibleItems);
        arrayList3.addAll(arrayList2);
        lazyStaggeredGridMeasureContext2.getState().getItemAnimator$foundation_release().onMeasured((int) scrollToBeConsumed, i64, i65, arrayList3, lazyStaggeredGridMeasureContext2.getMeasuredItemProvider().getKeyIndexMap(), lazyStaggeredGridMeasureContext2.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext2.getIsVertical(), false, lazyStaggeredGridMeasureContext2.getLaneCount(), false, ArraysKt.minOrThrow(iArr3), ArraysKt.maxOrThrow(iArr6) + i13, lazyStaggeredGridMeasureContext2.getCoroutineScope(), lazyStaggeredGridMeasureContext2.getGraphicsContext());
        long m838getMinSizeToFitDisappearingItemsYbymL2g2 = lazyStaggeredGridMeasureContext2.getState().getItemAnimator$foundation_release().m838getMinSizeToFitDisappearingItemsYbymL2g();
        if (IntSize.m6433equalsimpl0(m838getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
            i14 = i65;
            i15 = i64;
        } else {
            int i74 = lazyStaggeredGridMeasureContext2.getIsVertical() ? i65 : i64;
            int m6235constrainWidthK40F9xA2 = ConstraintsKt.m6235constrainWidthK40F9xA(lazyStaggeredGridMeasureContext2.getConstraints(), Math.max(i64, IntSize.m6435getWidthimpl(m838getMinSizeToFitDisappearingItemsYbymL2g2)));
            int m6234constrainHeightK40F9xA = ConstraintsKt.m6234constrainHeightK40F9xA(lazyStaggeredGridMeasureContext2.getConstraints(), Math.max(i65, IntSize.m6434getHeightimpl(m838getMinSizeToFitDisappearingItemsYbymL2g2)));
            int i75 = lazyStaggeredGridMeasureContext2.getIsVertical() ? m6234constrainHeightK40F9xA : m6235constrainWidthK40F9xA2;
            if (i75 != i74) {
                int size4 = arrayList3.size();
                for (int i76 = 0; i76 < size4; i76++) {
                    arrayList3.get(i76).updateMainAxisLayoutSize(i75);
                }
            }
            i15 = m6235constrainWidthK40F9xA2;
            i14 = m6234constrainHeightK40F9xA;
        }
        int i77 = i8;
        int i78 = 0;
        while (true) {
            if (i78 < i77) {
                if (iArr6[i78] > lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize()) {
                    break;
                }
                i78++;
            } else {
                for (int i79 : iArr5) {
                    if (i79 >= i5 - 1) {
                        z3 = false;
                        break;
                    }
                }
            }
        }
        z3 = true;
        return new LazyStaggeredGridMeasureResult(iArr23, iArr3, scrollToBeConsumed, MeasureScope.layout$default(lazyLayoutMeasureScope, i15, i14, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$33
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
                List<LazyStaggeredGridMeasuredItem> list7 = arrayList3;
                LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext3 = lazyStaggeredGridMeasureContext2;
                int size5 = list7.size();
                for (int i80 = 0; i80 < size5; i80++) {
                    list7.get(i80).place(placementScope, lazyStaggeredGridMeasureContext3);
                }
                ObservableScopeInvalidator.m847attachToScopeimpl(lazyStaggeredGridMeasureContext2.getState().m892getPlacementScopeInvalidatorzYiylxw$foundation_release());
            }
        }, 4, null), z3, lazyStaggeredGridMeasureContext2.getIsVertical(), z9, lazyStaggeredGridMeasureContext2.getResolvedSlots(), lazyStaggeredGridMeasureContext2.getItemProvider().getSpanProvider(), lazyLayoutMeasureScope, i5, calculateVisibleItems, IntSizeKt.IntSize(i15, i14), i27, i7, lazyStaggeredGridMeasureContext2.getBeforeContentPadding(), lazyStaggeredGridMeasureContext2.getAfterContentPadding(), lazyStaggeredGridMeasureContext2.getMainAxisSpacing(), lazyStaggeredGridMeasureContext2.getCoroutineScope(), null);
    }

    private static final boolean measure$lambda$41$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (iArr2[i] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i2 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$41$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateVisibleItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr, int[] iArr, int i) {
        int i2 = 0;
        for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque : arrayDequeArr) {
            i2 += arrayDeque.size();
        }
        ArrayList arrayList = new ArrayList(i2);
        while (true) {
            for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque2 : arrayDequeArr) {
                if (!arrayDeque2.isEmpty()) {
                    int length = arrayDequeArr.length;
                    int i3 = -1;
                    int i4 = Integer.MAX_VALUE;
                    for (int i5 = 0; i5 < length; i5++) {
                        LazyStaggeredGridMeasuredItem firstOrNull = arrayDequeArr[i5].firstOrNull();
                        int index = firstOrNull != null ? firstOrNull.getIndex() : Integer.MAX_VALUE;
                        if (i4 > index) {
                            i3 = i5;
                            i4 = index;
                        }
                    }
                    LazyStaggeredGridMeasuredItem removeFirst = arrayDequeArr[i3].removeFirst();
                    if (removeFirst.getLane() == i3) {
                        long m894constructorimpl = SpanRange.m894constructorimpl(removeFirst.getLane(), removeFirst.getSpan());
                        int m883maxInRangejy6DScQ = m883maxInRangejy6DScQ(iArr, m894constructorimpl);
                        removeFirst.position(m883maxInRangejy6DScQ, lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i3], i);
                        arrayList.add(removeFirst);
                        int i6 = (int) (m894constructorimpl & 4294967295L);
                        for (int i7 = (int) (m894constructorimpl >> 32); i7 < i6; i7++) {
                            iArr[i7] = removeFirst.getMainAxisSizeWithSpacings() + m883maxInRangejy6DScQ;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateExtraItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, Function1<? super LazyStaggeredGridMeasuredItem, Unit> function1, Function1<? super Integer, Boolean> function12, boolean z) {
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        ArrayList arrayList = null;
        if (z) {
            int size = pinnedItems.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    int intValue = pinnedItems.get(size).intValue();
                    if (function12.invoke(Integer.valueOf(intValue)).booleanValue()) {
                        long m879getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m879getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue, 0);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        LazyStaggeredGridMeasuredItem m888getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m888getAndMeasurejy6DScQ(intValue, m879getSpanRangelOCCd4c);
                        function1.invoke(m888getAndMeasurejy6DScQ);
                        arrayList.add(m888getAndMeasurejy6DScQ);
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
        } else {
            int size2 = pinnedItems.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int intValue2 = pinnedItems.get(i2).intValue();
                if (function12.invoke(Integer.valueOf(intValue2)).booleanValue()) {
                    long m879getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext.m879getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue2, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem m888getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m888getAndMeasurejy6DScQ(intValue2, m879getSpanRangelOCCd4c2);
                    function1.invoke(m888getAndMeasurejy6DScQ2);
                    arrayList.add(m888getAndMeasurejy6DScQ2);
                }
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    /* renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m882forEachnIS5qE8(long j, Function1<? super Integer, Unit> function1) {
        int i = (int) (j & 4294967295L);
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            function1.invoke(Integer.valueOf(i2));
        }
    }

    private static final void offsetBy(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    /* renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m883maxInRangejy6DScQ(int[] iArr, long j) {
        int i = (int) (j & 4294967295L);
        int i2 = Integer.MIN_VALUE;
        for (int i3 = (int) (j >> 32); i3 < i; i3++) {
            i2 = Math.max(i2, iArr[i3]);
        }
        return i2;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i);
    }

    public static final int indexOfMinValue(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i + 1;
            int i6 = iArr[i4];
            if (i5 <= i6 && i6 < i3) {
                i2 = i4;
                i3 = i6;
            }
        }
        return i2;
    }

    private static final <T> int indexOfMinBy(T[] tArr, Function1<? super T, Integer> function1) {
        int length = tArr.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int intValue = function1.invoke(tArr[i3]).intValue();
            if (i2 > intValue) {
                i = i3;
                i2 = intValue;
            }
        }
        return i;
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    private static final int[] transform(int[] iArr, Function1<? super Integer, Integer> function1) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = function1.invoke(Integer.valueOf(iArr[i])).intValue();
        }
        return iArr;
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            while (true) {
                if (iArr[length] < i && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[length], length);
            }
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int i2) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i, i2);
    }

    private static final <T> void fastForEach(List<? extends T> list, boolean z, Function1<? super T, Unit> function1) {
        if (z) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i = size - 1;
                function1.invoke(list.get(size));
                if (i < 0) {
                    return;
                } else {
                    size = i;
                }
            }
        } else {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                function1.invoke(list.get(i2));
            }
        }
    }

    static /* synthetic */ void fastForEach$default(List list, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if (z) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i2 = size - 1;
                function1.invoke(list.get(size));
                if (i2 < 0) {
                    return;
                } else {
                    size = i2;
                }
            }
        } else {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                function1.invoke(list.get(i3));
            }
        }
    }
}
