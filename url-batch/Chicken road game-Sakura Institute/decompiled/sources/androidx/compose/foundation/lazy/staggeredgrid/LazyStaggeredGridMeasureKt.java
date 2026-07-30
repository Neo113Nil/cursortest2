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
    public static final LazyStaggeredGridMeasureResult m892measureStaggeredGridXtK8cYQ(LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j, boolean z, boolean z2, long j2, int i, int i2, int i3, int i4, CoroutineScope coroutineScope, GraphicsContext graphicsContext) {
        int i5;
        int m891maxInRangejy6DScQ;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j, z, lazyLayoutMeasureScope, i, j2, i3, i4, z2, i2, coroutineScope, graphicsContext, null);
        int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyStaggeredGridItemProvider, lazyStaggeredGridState.getScrollPosition().getIndices());
        int[] scrollOffsets = lazyStaggeredGridState.getScrollPosition().getScrollOffsets();
        if (updateScrollPositionIfTheFirstItemWasMoved$foundation_release.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
            int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr = new int[laneCount];
            int i6 = 0;
            while (i6 < laneCount) {
                if (i6 >= updateScrollPositionIfTheFirstItemWasMoved$foundation_release.length || (m891maxInRangejy6DScQ = updateScrollPositionIfTheFirstItemWasMoved$foundation_release[i6]) == -1) {
                    m891maxInRangejy6DScQ = i6 == 0 ? 0 : m891maxInRangejy6DScQ(iArr, SpanRange.m902constructorimpl(0, i6)) + 1;
                }
                iArr[i6] = m891maxInRangejy6DScQ;
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

    /* JADX WARN: Code restructure failed: missing block: B:236:0x055c, code lost:
    
        if (r13[r11] > r14) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x02f4, code lost:
    
        r6 = indexOfMinValue$default(r8, 0, 1, null);
        r7 = indexOfMaxValue(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x02ff, code lost:
    
        if (r6 == r7) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0305, code lost:
    
        if (r8[r6] != r8[r7]) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0307, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0309, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x030a, code lost:
    
        r7 = r31[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x030d, code lost:
    
        if (r7 != (-1)) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x030f, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0310, code lost:
    
        r7 = findPreviousItemIndex(r0, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0314, code lost:
    
        if (r7 >= 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0356, code lost:
    
        r14 = r25;
        r13 = r31;
        r47 = r5;
        r5 = r0.m887getSpanRangelOCCd4c(r46.getItemProvider(), r7, r6);
        r15 = r46.getLaneInfo();
        r48 = r3;
        r32 = r4;
        r3 = (int) (r5 & 4294967295L);
        r24 = r11;
        r25 = r12;
        r4 = (int) (r5 >> 32);
        r11 = r3 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0380, code lost:
    
        if (r11 == 1) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0382, code lost:
    
        r20 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0387, code lost:
    
        if (r20 == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0389, code lost:
    
        r12 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x038c, code lost:
    
        r15.setLane(r7, r12);
        r12 = r46.getMeasuredItemProvider().m896getAndMeasurejy6DScQ(r7, r5);
        r5 = m891maxInRangejy6DScQ(r8, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x039c, code lost:
    
        if (r11 == 1) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x039e, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x03a1, code lost:
    
        if (r6 == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x03a3, code lost:
    
        r15 = r46.getLaneInfo().getGaps(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x03ad, code lost:
    
        if (r4 >= r3) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x03b1, code lost:
    
        if (r8[r4] == r5) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x03b3, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x03b4, code lost:
    
        r10[r4].addFirst(r12);
        r13[r4] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x03bb, code lost:
    
        if (r15 != null) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x03bd, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x03c1, code lost:
    
        r8[r4] = (r12.getMainAxisSizeWithSpacings() + r5) + r6;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x03bf, code lost:
    
        r6 = r15[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x03ac, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x03a0, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x038b, code lost:
    
        r12 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0385, code lost:
    
        r20 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0316, code lost:
    
        r13 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0318, code lost:
    
        if (r1 != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x031e, code lost:
    
        if (measure$lambda$38$misalignedStart(r13, r0, r8, r6) == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x034a, code lost:
    
        r14 = r25;
        r48 = r3;
        r32 = r4;
        r47 = r5;
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0320, code lost:
    
        if (r50 == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0322, code lost:
    
        r46.getLaneInfo().reset();
        r1 = r13.length;
        r2 = new int[r1];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x032d, code lost:
    
        if (r3 >= r1) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x032f, code lost:
    
        r2[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0335, code lost:
    
        r1 = r8.length;
        r3 = new int[r1];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0339, code lost:
    
        if (r4 >= r1) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x033b, code lost:
    
        r3[r4] = r8[r6];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0349, code lost:
    
        return measure(r0, r25, r2, r3, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:256:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x064b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final LazyStaggeredGridMeasureResult measure(final LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int[] iArr, int[] iArr2, boolean z) {
        LazyLayoutMeasureScope lazyLayoutMeasureScope;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr3;
        int i7;
        int i8;
        int[] iArr4;
        int i9;
        int i10;
        int[] iArr5;
        int[] iArr6;
        int i11;
        int i12;
        int[] iArr7;
        int[] iArr8;
        int i13;
        int i14;
        int i15;
        int[] iArr9;
        int m6269constrainWidthK40F9xA;
        int m6251getMaxHeightimpl;
        int i16;
        int i17;
        ArrayList arrayList;
        int i18;
        int i19;
        boolean z2;
        boolean z3;
        boolean z4;
        List<Integer> list;
        int[] iArr10;
        int i20;
        boolean z5;
        int[] iArr11;
        int[] iArr12;
        boolean z6;
        int i21;
        int[] iArr13;
        int i22;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
        int i23 = i;
        LazyLayoutMeasureScope measureScope = lazyStaggeredGridMeasureContext.getMeasureScope();
        int itemCount = lazyStaggeredGridMeasureContext.getItemProvider().getItemCount();
        if (itemCount <= 0 || lazyStaggeredGridMeasureContext.getLaneCount() == 0) {
            int m6254getMinWidthimpl = Constraints.m6254getMinWidthimpl(lazyStaggeredGridMeasureContext.getConstraints());
            int m6253getMinHeightimpl = Constraints.m6253getMinHeightimpl(lazyStaggeredGridMeasureContext.getConstraints());
            lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation_release().onMeasured(0, m6254getMinWidthimpl, m6253getMinHeightimpl, new ArrayList(), lazyStaggeredGridMeasureContext.getMeasuredItemProvider().getKeyIndexMap(), lazyStaggeredGridMeasureContext.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext.getIsVertical(), false, lazyStaggeredGridMeasureContext.getLaneCount(), false, 0, 0, lazyStaggeredGridMeasureContext.getCoroutineScope(), lazyStaggeredGridMeasureContext.getGraphicsContext());
            long m846getMinSizeToFitDisappearingItemsYbymL2g = lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation_release().m846getMinSizeToFitDisappearingItemsYbymL2g();
            if (!IntSize.m6467equalsimpl0(m846getMinSizeToFitDisappearingItemsYbymL2g, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
                m6254getMinWidthimpl = ConstraintsKt.m6269constrainWidthK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), IntSize.m6469getWidthimpl(m846getMinSizeToFitDisappearingItemsYbymL2g));
                m6253getMinHeightimpl = ConstraintsKt.m6268constrainHeightK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), IntSize.m6468getHeightimpl(m846getMinSizeToFitDisappearingItemsYbymL2g));
            }
            return new LazyStaggeredGridMeasureResult(iArr, iArr2, 0.0f, MeasureScope.layout$default(measureScope, m6254getMinWidthimpl, m6253getMinHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null), false, lazyStaggeredGridMeasureContext.getIsVertical(), false, lazyStaggeredGridMeasureContext.getResolvedSlots(), lazyStaggeredGridMeasureContext.getItemProvider().getSpanProvider(), measureScope, itemCount, CollectionsKt.emptyList(), IntSizeKt.IntSize(Constraints.m6254getMinWidthimpl(lazyStaggeredGridMeasureContext.getConstraints()), Constraints.m6253getMinHeightimpl(lazyStaggeredGridMeasureContext.getConstraints())), -lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), lazyStaggeredGridMeasureContext.getCoroutineScope(), null);
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        String str = "copyOf(this, size)";
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        int[] copyOf2 = Arrays.copyOf(iArr2, iArr2.length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
        ensureIndicesInRange(lazyStaggeredGridMeasureContext2, copyOf, itemCount);
        offsetBy(copyOf2, -i23);
        int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
        ArrayDeque[] arrayDequeArr = new ArrayDeque[laneCount];
        for (int i24 = 0; i24 < laneCount; i24++) {
            arrayDequeArr[i24] = new ArrayDeque(16);
        }
        offsetBy(copyOf2, -lazyStaggeredGridMeasureContext.getBeforeContentPadding());
        boolean z7 = false;
        while (true) {
            if (!measure$lambda$38$hasSpaceBeforeFirst(copyOf, copyOf2, lazyStaggeredGridMeasureContext2)) {
                lazyLayoutMeasureScope = measureScope;
                i2 = itemCount;
                i3 = -1;
                break;
            }
            i3 = indexOfMaxValue(copyOf);
            int i25 = copyOf[i3];
            int length = copyOf2.length;
            for (int i26 = 0; i26 < length; i26++) {
                if (copyOf[i26] != copyOf[i3]) {
                    int i27 = copyOf2[i26];
                    int i28 = copyOf2[i3];
                    if (i27 < i28) {
                        copyOf2[i26] = i28;
                    }
                }
            }
            int findPreviousItemIndex = findPreviousItemIndex(lazyStaggeredGridMeasureContext2, i25, i3);
            if (findPreviousItemIndex < 0) {
                lazyLayoutMeasureScope = measureScope;
                i2 = itemCount;
                break;
            }
            long m887getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext2.m887getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), findPreviousItemIndex, i3);
            int i29 = (int) (4294967295L & m887getSpanRangelOCCd4c);
            LazyLayoutMeasureScope lazyLayoutMeasureScope2 = measureScope;
            int i30 = itemCount;
            int i31 = (int) (m887getSpanRangelOCCd4c >> 32);
            int i32 = i29 - i31;
            lazyStaggeredGridMeasureContext.getLaneInfo().setLane(findPreviousItemIndex, i32 != 1 ? -2 : i31);
            LazyStaggeredGridMeasuredItem m896getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m896getAndMeasurejy6DScQ(findPreviousItemIndex, m887getSpanRangelOCCd4c);
            int m891maxInRangejy6DScQ = m891maxInRangejy6DScQ(copyOf2, m887getSpanRangelOCCd4c);
            int[] gaps = i32 != 1 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(findPreviousItemIndex) : null;
            while (i31 < i29) {
                copyOf[i31] = findPreviousItemIndex;
                int mainAxisSizeWithSpacings = m896getAndMeasurejy6DScQ.getMainAxisSizeWithSpacings() + m891maxInRangejy6DScQ + (gaps == null ? 0 : gaps[i31]);
                copyOf2[i31] = mainAxisSizeWithSpacings;
                if (lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + mainAxisSizeWithSpacings <= 0) {
                    z7 = true;
                }
                i31++;
            }
            measureScope = lazyLayoutMeasureScope2;
            itemCount = i30;
        }
        int i33 = -lazyStaggeredGridMeasureContext.getBeforeContentPadding();
        int i34 = copyOf2[0];
        if (i34 < i33) {
            i23 += i34;
            offsetBy(copyOf2, i33 - i34);
        }
        offsetBy(copyOf2, lazyStaggeredGridMeasureContext.getBeforeContentPadding());
        int i35 = -1;
        if (i3 == -1) {
            i3 = ArraysKt.indexOf(copyOf, 0);
        }
        if (i3 != -1 && measure$lambda$38$misalignedStart(copyOf, lazyStaggeredGridMeasureContext2, copyOf2, i3) && z) {
            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
            int length2 = copyOf.length;
            int[] iArr14 = new int[length2];
            int i36 = 0;
            while (i36 < length2) {
                iArr14[i36] = i35;
                i36++;
                i35 = -1;
            }
            int length3 = copyOf2.length;
            int[] iArr15 = new int[length3];
            for (int i37 = 0; i37 < length3; i37++) {
                iArr15[i37] = copyOf2[i3];
            }
            return measure(lazyStaggeredGridMeasureContext2, i23, iArr14, iArr15, false);
        }
        int[] copyOf3 = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(copyOf3, "copyOf(this, size)");
        int length4 = copyOf2.length;
        int[] iArr16 = new int[length4];
        for (int i38 = 0; i38 < length4; i38++) {
            iArr16[i38] = -copyOf2[i38];
        }
        int mainAxisSpacing = i33 + lazyStaggeredGridMeasureContext.getMainAxisSpacing();
        int coerceAtLeast = RangesKt.coerceAtLeast(lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext.getAfterContentPadding(), 0);
        boolean z8 = z7;
        int indexOfMinValue$default = indexOfMinValue$default(copyOf3, 0, 1, null);
        int i39 = 0;
        while (indexOfMinValue$default != -1 && i39 < lazyStaggeredGridMeasureContext.getLaneCount()) {
            int i40 = copyOf3[indexOfMinValue$default];
            int indexOfMinValue = indexOfMinValue(copyOf3, i40);
            i39++;
            if (i40 >= 0) {
                int i41 = i23;
                long m887getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext2.m887getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), i40, indexOfMinValue$default);
                LazyStaggeredGridMeasuredItem m896getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m896getAndMeasurejy6DScQ(i40, m887getSpanRangelOCCd4c2);
                int i42 = i33;
                String str2 = str;
                int[] iArr17 = copyOf;
                int i43 = (int) (m887getSpanRangelOCCd4c2 & 4294967295L);
                int[] iArr18 = copyOf2;
                int i44 = laneCount;
                int i45 = (int) (m887getSpanRangelOCCd4c2 >> 32);
                int i46 = i43 - i45;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(i40, i46 != 1 ? -2 : i45);
                int m891maxInRangejy6DScQ2 = m891maxInRangejy6DScQ(iArr16, m887getSpanRangelOCCd4c2);
                for (int i47 = i45; i47 < i43; i47++) {
                    iArr16[i47] = m896getAndMeasurejy6DScQ2.getMainAxisSizeWithSpacings() + m891maxInRangejy6DScQ2;
                    copyOf3[i47] = i40;
                    arrayDequeArr[i47].addLast(m896getAndMeasurejy6DScQ2);
                }
                if (m891maxInRangejy6DScQ2 >= mainAxisSpacing || iArr16[i45] > mainAxisSpacing) {
                    i22 = 1;
                } else {
                    m896getAndMeasurejy6DScQ2.setVisible(false);
                    i22 = 1;
                    z8 = true;
                }
                i39 = i46 != i22 ? lazyStaggeredGridMeasureContext.getLaneCount() : i39;
                indexOfMinValue$default = indexOfMinValue;
                i23 = i41;
                str = str2;
                i33 = i42;
                copyOf = iArr17;
                laneCount = i44;
                copyOf2 = iArr18;
            } else {
                indexOfMinValue$default = indexOfMinValue;
            }
        }
        int i48 = i23;
        int i49 = i33;
        String str3 = str;
        int[] iArr19 = copyOf;
        int[] iArr20 = copyOf2;
        int i50 = laneCount;
        loop9: while (true) {
            for (int i51 = 0; i51 < length4; i51++) {
                int i52 = iArr16[i51];
                if (i52 < coerceAtLeast || i52 <= 0) {
                    i4 = i50;
                    break;
                }
            }
            i4 = i50;
            for (int i53 = 0; i53 < i4; i53++) {
                if (!arrayDequeArr[i53].isEmpty()) {
                    i5 = i2;
                    i6 = 1;
                    break loop9;
                }
            }
            i6 = 1;
            int indexOfMinValue$default2 = indexOfMinValue$default(iArr16, 0, 1, null);
            int maxOrThrow = ArraysKt.maxOrThrow(copyOf3) + 1;
            i5 = i2;
            if (maxOrThrow >= i5) {
                break;
            }
            int i54 = coerceAtLeast;
            i2 = i5;
            int i55 = i48;
            int i56 = i4;
            int[] iArr21 = iArr16;
            int[] iArr22 = copyOf3;
            long m887getSpanRangelOCCd4c3 = lazyStaggeredGridMeasureContext2.m887getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), maxOrThrow, indexOfMinValue$default2);
            int i57 = (int) (m887getSpanRangelOCCd4c3 & 4294967295L);
            i50 = i56;
            int i58 = (int) (m887getSpanRangelOCCd4c3 >> 32);
            int i59 = i57 - i58;
            lazyStaggeredGridMeasureContext.getLaneInfo().setLane(maxOrThrow, i59 != 1 ? -2 : i58);
            LazyStaggeredGridMeasuredItem m896getAndMeasurejy6DScQ3 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m896getAndMeasurejy6DScQ(maxOrThrow, m887getSpanRangelOCCd4c3);
            int m891maxInRangejy6DScQ3 = m891maxInRangejy6DScQ(iArr21, m887getSpanRangelOCCd4c3);
            if (i59 != 1) {
                iArr13 = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(maxOrThrow);
                if (iArr13 == null) {
                    iArr13 = new int[lazyStaggeredGridMeasureContext.getLaneCount()];
                }
            } else {
                iArr13 = null;
            }
            for (int i60 = i58; i60 < i57; i60++) {
                if (iArr13 != null) {
                    iArr13[i60] = m891maxInRangejy6DScQ3 - iArr21[i60];
                }
                iArr22[i60] = maxOrThrow;
                iArr21[i60] = m896getAndMeasurejy6DScQ3.getMainAxisSizeWithSpacings() + m891maxInRangejy6DScQ3;
                arrayDequeArr[i60].addLast(m896getAndMeasurejy6DScQ3);
            }
            lazyStaggeredGridMeasureContext.getLaneInfo().setGaps(maxOrThrow, iArr13);
            if (m891maxInRangejy6DScQ3 < mainAxisSpacing && iArr21[i58] <= mainAxisSpacing) {
                m896getAndMeasurejy6DScQ3.setVisible(false);
            }
            coerceAtLeast = i54;
            copyOf3 = iArr22;
            i48 = i55;
            iArr16 = iArr21;
        }
        int i61 = 0;
        while (i61 < i4) {
            ArrayDeque arrayDeque = arrayDequeArr[i61];
            while (arrayDeque.size() > i6 && !((LazyStaggeredGridMeasuredItem) arrayDeque.first()).getIsVisible()) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) arrayDeque.removeFirst();
                int[] gaps2 = lazyStaggeredGridMeasuredItem.getSpan() != i6 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem.getIndex()) : null;
                iArr20[i61] = iArr20[i61] - (lazyStaggeredGridMeasuredItem.getMainAxisSizeWithSpacings() + (gaps2 == null ? 0 : gaps2[i61]));
                i6 = 1;
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) arrayDeque.firstOrNull();
            iArr19[i61] = lazyStaggeredGridMeasuredItem2 != null ? lazyStaggeredGridMeasuredItem2.getIndex() : -1;
            i61++;
            i6 = 1;
        }
        int length5 = copyOf3.length;
        int i62 = 0;
        while (true) {
            if (i62 >= length5) {
                break;
            }
            if (copyOf3[i62] == i5 - 1) {
                offsetBy(iArr16, -lazyStaggeredGridMeasureContext.getMainAxisSpacing());
                break;
            }
            i62++;
        }
        int i63 = 0;
        while (true) {
            if (i63 < length4) {
                if (iArr16[i63] >= lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) {
                    i7 = coerceAtLeast;
                    i8 = i4;
                    iArr4 = copyOf3;
                    i9 = length4;
                    iArr6 = iArr16;
                    i11 = i48;
                    iArr5 = iArr19;
                    iArr3 = iArr20;
                    break;
                }
                i63++;
            } else {
                int mainAxisAvailableSize = lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() - iArr16[indexOfMaxValue(iArr16)];
                iArr3 = iArr20;
                offsetBy(iArr3, -mainAxisAvailableSize);
                offsetBy(iArr16, mainAxisAvailableSize);
                boolean z9 = false;
                loop26: while (true) {
                    int length6 = iArr3.length;
                    int i64 = 0;
                    while (true) {
                        if (i64 >= length6) {
                            i7 = coerceAtLeast;
                            i8 = i4;
                            iArr4 = copyOf3;
                            i9 = length4;
                            i10 = i48;
                            iArr5 = iArr19;
                            break loop26;
                        }
                        if (iArr3[i64] < lazyStaggeredGridMeasureContext.getBeforeContentPadding()) {
                            break;
                        }
                        i64++;
                        i48 = i48;
                    }
                    copyOf3 = iArr8;
                    coerceAtLeast = i13;
                    iArr19 = iArr7;
                    length4 = i15;
                    iArr16 = iArr9;
                    i4 = i14;
                    i48 = i12;
                }
                int[] iArr23 = iArr16;
                if (z9 && z) {
                    lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                    return measure(lazyStaggeredGridMeasureContext2, i10, iArr5, iArr3, false);
                }
                int i65 = mainAxisAvailableSize + i10;
                int i66 = iArr3[indexOfMinValue$default(iArr3, 0, 1, null)];
                if (i66 < 0) {
                    i65 += i66;
                    iArr6 = iArr23;
                    offsetBy(iArr6, i66);
                    offsetBy(iArr3, -i66);
                } else {
                    iArr6 = iArr23;
                }
                i11 = i65;
            }
        }
        float scrollToBeConsumed = (MathKt.getSign(Math.round(lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed())) != MathKt.getSign(i11) || Math.abs(Math.round(lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed())) < Math.abs(i11)) ? lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed() : i11;
        int[] copyOf4 = Arrays.copyOf(iArr3, iArr3.length);
        Intrinsics.checkNotNullExpressionValue(copyOf4, str3);
        int length7 = copyOf4.length;
        for (int i67 = 0; i67 < length7; i67++) {
            copyOf4[i67] = -copyOf4[i67];
        }
        if (lazyStaggeredGridMeasureContext.getBeforeContentPadding() > lazyStaggeredGridMeasureContext.getMainAxisSpacing()) {
            int i68 = i8;
            for (int i69 = 0; i69 < i68; i69++) {
                ArrayDeque arrayDeque2 = arrayDequeArr[i69];
                int size = arrayDeque2.size();
                int i70 = 0;
                while (i70 < size) {
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem3 = (LazyStaggeredGridMeasuredItem) arrayDeque2.get(i70);
                    int[] gaps3 = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem3.getIndex());
                    int mainAxisSizeWithSpacings2 = lazyStaggeredGridMeasuredItem3.getMainAxisSizeWithSpacings() + (gaps3 == null ? 0 : gaps3[i69]);
                    if (i70 != CollectionsKt.getLastIndex(arrayDeque2) && (i21 = iArr3[i69]) != 0 && i21 >= mainAxisSizeWithSpacings2) {
                        iArr3[i69] = i21 - mainAxisSizeWithSpacings2;
                        i70++;
                        iArr5[i69] = ((LazyStaggeredGridMeasuredItem) arrayDeque2.get(i70)).getIndex();
                    }
                }
            }
        }
        int beforeContentPadding = lazyStaggeredGridMeasureContext.getBeforeContentPadding() + lazyStaggeredGridMeasureContext.getAfterContentPadding();
        if (lazyStaggeredGridMeasureContext.getIsVertical()) {
            m6269constrainWidthK40F9xA = Constraints.m6252getMaxWidthimpl(lazyStaggeredGridMeasureContext.getConstraints());
        } else {
            m6269constrainWidthK40F9xA = ConstraintsKt.m6269constrainWidthK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), ArraysKt.maxOrThrow(iArr6) + beforeContentPadding);
        }
        if (lazyStaggeredGridMeasureContext.getIsVertical()) {
            m6251getMaxHeightimpl = ConstraintsKt.m6268constrainHeightK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), ArraysKt.maxOrThrow(iArr6) + beforeContentPadding);
        } else {
            m6251getMaxHeightimpl = Constraints.m6251getMaxHeightimpl(lazyStaggeredGridMeasureContext.getConstraints());
        }
        int min = (Math.min(lazyStaggeredGridMeasureContext.getIsVertical() ? m6251getMaxHeightimpl : m6269constrainWidthK40F9xA, lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) - lazyStaggeredGridMeasureContext.getBeforeContentPadding()) + lazyStaggeredGridMeasureContext.getAfterContentPadding();
        int i71 = copyOf4[0];
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        int size2 = pinnedItems.size() - 1;
        if (size2 >= 0) {
            arrayList = null;
            while (true) {
                int i72 = size2 - 1;
                int intValue = pinnedItems.get(size2).intValue();
                List<Integer> list2 = pinnedItems;
                int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(intValue);
                i17 = m6251getMaxHeightimpl;
                if (lane == -2 || lane == -1) {
                    int length8 = iArr5.length;
                    int i73 = 0;
                    while (i73 < length8) {
                        int i74 = length8;
                        if (!(iArr5[i73] > intValue)) {
                            z6 = false;
                            break;
                        }
                        i73++;
                        length8 = i74;
                    }
                    z6 = true;
                }
                if (z6) {
                    i16 = m6269constrainWidthK40F9xA;
                    long m887getSpanRangelOCCd4c4 = lazyStaggeredGridMeasureContext2.m887getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem m896getAndMeasurejy6DScQ4 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m896getAndMeasurejy6DScQ(intValue, m887getSpanRangelOCCd4c4);
                    i71 -= m896getAndMeasurejy6DScQ4.getMainAxisSizeWithSpacings();
                    m896getAndMeasurejy6DScQ4.position(i71, 0, min);
                    arrayList.add(m896getAndMeasurejy6DScQ4);
                } else {
                    i16 = m6269constrainWidthK40F9xA;
                }
                if (i72 < 0) {
                    break;
                }
                pinnedItems = list2;
                m6251getMaxHeightimpl = i17;
                size2 = i72;
                m6269constrainWidthK40F9xA = i16;
            }
        } else {
            i16 = m6269constrainWidthK40F9xA;
            i17 = m6251getMaxHeightimpl;
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = CollectionsKt.emptyList();
        }
        List<LazyStaggeredGridMeasuredItem> calculateVisibleItems = calculateVisibleItems(lazyStaggeredGridMeasureContext2, arrayDequeArr, copyOf4, min);
        int i75 = copyOf4[0];
        List<Integer> pinnedItems2 = lazyStaggeredGridMeasureContext.getPinnedItems();
        int size3 = pinnedItems2.size();
        int i76 = 0;
        ArrayList arrayList2 = null;
        while (i76 < size3) {
            int intValue2 = pinnedItems2.get(i76).intValue();
            if (intValue2 >= i5) {
                iArr10 = iArr4;
                list = pinnedItems2;
            } else {
                int lane2 = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(intValue2);
                list = pinnedItems2;
                if (lane2 != -2 && lane2 != -1) {
                    if (iArr4[lane2] < intValue2) {
                        iArr10 = iArr4;
                        i20 = size3;
                    } else {
                        iArr10 = iArr4;
                    }
                } else {
                    iArr10 = iArr4;
                    int length9 = iArr10.length;
                    i20 = size3;
                    int i77 = 0;
                    while (i77 < length9) {
                        int i78 = length9;
                        if (!(iArr10[i77] < intValue2)) {
                            z5 = false;
                            break;
                        }
                        i77++;
                        length9 = i78;
                    }
                }
                z5 = true;
                if (z5) {
                    iArr11 = iArr5;
                    iArr12 = iArr10;
                } else {
                    iArr11 = iArr5;
                    iArr12 = iArr10;
                    long m887getSpanRangelOCCd4c5 = lazyStaggeredGridMeasureContext2.m887getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue2, 0);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    List list3 = arrayList2;
                    LazyStaggeredGridMeasuredItem m896getAndMeasurejy6DScQ5 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m896getAndMeasurejy6DScQ(intValue2, m887getSpanRangelOCCd4c5);
                    m896getAndMeasurejy6DScQ5.position(i75, 0, min);
                    i75 += m896getAndMeasurejy6DScQ5.getMainAxisSizeWithSpacings();
                    list3.add(m896getAndMeasurejy6DScQ5);
                    arrayList2 = list3;
                }
                i76++;
                lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
                size3 = i20;
                pinnedItems2 = list;
                iArr4 = iArr12;
                iArr5 = iArr11;
            }
            i20 = size3;
            z5 = false;
            if (z5) {
            }
            i76++;
            lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
            size3 = i20;
            pinnedItems2 = list;
            iArr4 = iArr12;
            iArr5 = iArr11;
        }
        int[] iArr24 = iArr4;
        int[] iArr25 = iArr5;
        if (arrayList2 == null) {
            arrayList2 = CollectionsKt.emptyList();
        }
        final ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList);
        arrayList3.addAll(calculateVisibleItems);
        arrayList3.addAll(arrayList2);
        lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation_release().onMeasured((int) scrollToBeConsumed, i16, i17, arrayList3, lazyStaggeredGridMeasureContext.getMeasuredItemProvider().getKeyIndexMap(), lazyStaggeredGridMeasureContext.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext.getIsVertical(), false, lazyStaggeredGridMeasureContext.getLaneCount(), false, ArraysKt.minOrThrow(iArr3), ArraysKt.maxOrThrow(iArr6) + beforeContentPadding, lazyStaggeredGridMeasureContext.getCoroutineScope(), lazyStaggeredGridMeasureContext.getGraphicsContext());
        long m846getMinSizeToFitDisappearingItemsYbymL2g2 = lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation_release().m846getMinSizeToFitDisappearingItemsYbymL2g();
        if (IntSize.m6467equalsimpl0(m846getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
            i18 = i17;
            i19 = i16;
        } else {
            int i79 = lazyStaggeredGridMeasureContext.getIsVertical() ? i17 : i16;
            i19 = ConstraintsKt.m6269constrainWidthK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), Math.max(i16, IntSize.m6469getWidthimpl(m846getMinSizeToFitDisappearingItemsYbymL2g2)));
            int m6268constrainHeightK40F9xA = ConstraintsKt.m6268constrainHeightK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), Math.max(i17, IntSize.m6468getHeightimpl(m846getMinSizeToFitDisappearingItemsYbymL2g2)));
            int i80 = lazyStaggeredGridMeasureContext.getIsVertical() ? m6268constrainHeightK40F9xA : i19;
            if (i80 != i79) {
                int size4 = arrayList3.size();
                for (int i81 = 0; i81 < size4; i81++) {
                    arrayList3.get(i81).updateMainAxisLayoutSize(i80);
                }
            }
            i18 = m6268constrainHeightK40F9xA;
        }
        int i82 = i9;
        int i83 = 0;
        while (true) {
            if (i83 >= i82) {
                z2 = false;
                break;
            }
            if (iArr6[i83] > lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) {
                z2 = true;
                break;
            }
            i83++;
        }
        if (!z2) {
            int length10 = iArr24.length;
            int i84 = 0;
            while (true) {
                if (i84 >= length10) {
                    z4 = true;
                    break;
                }
                if (!(iArr24[i84] < i5 + (-1))) {
                    z4 = false;
                    break;
                }
                i84++;
            }
            if (!z4) {
                z3 = false;
                return new LazyStaggeredGridMeasureResult(iArr25, iArr3, scrollToBeConsumed, MeasureScope.layout$default(lazyLayoutMeasureScope, i19, i18, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$30
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
                        List<LazyStaggeredGridMeasuredItem> list4 = arrayList3;
                        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext3 = lazyStaggeredGridMeasureContext;
                        int size5 = list4.size();
                        for (int i85 = 0; i85 < size5; i85++) {
                            list4.get(i85).place(placementScope, lazyStaggeredGridMeasureContext3);
                        }
                        ObservableScopeInvalidator.m855attachToScopeimpl(lazyStaggeredGridMeasureContext.getState().m900getPlacementScopeInvalidatorzYiylxw$foundation_release());
                    }
                }, 4, null), z3, lazyStaggeredGridMeasureContext.getIsVertical(), z8, lazyStaggeredGridMeasureContext.getResolvedSlots(), lazyStaggeredGridMeasureContext.getItemProvider().getSpanProvider(), lazyLayoutMeasureScope, i5, calculateVisibleItems, IntSizeKt.IntSize(i19, i18), i49, i7, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), lazyStaggeredGridMeasureContext.getCoroutineScope(), null);
            }
        }
        z3 = true;
        return new LazyStaggeredGridMeasureResult(iArr25, iArr3, scrollToBeConsumed, MeasureScope.layout$default(lazyLayoutMeasureScope, i19, i18, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$30
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
                List<LazyStaggeredGridMeasuredItem> list4 = arrayList3;
                LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext3 = lazyStaggeredGridMeasureContext;
                int size5 = list4.size();
                for (int i85 = 0; i85 < size5; i85++) {
                    list4.get(i85).place(placementScope, lazyStaggeredGridMeasureContext3);
                }
                ObservableScopeInvalidator.m855attachToScopeimpl(lazyStaggeredGridMeasureContext.getState().m900getPlacementScopeInvalidatorzYiylxw$foundation_release());
            }
        }, 4, null), z3, lazyStaggeredGridMeasureContext.getIsVertical(), z8, lazyStaggeredGridMeasureContext.getResolvedSlots(), lazyStaggeredGridMeasureContext.getItemProvider().getSpanProvider(), lazyLayoutMeasureScope, i5, calculateVisibleItems, IntSizeKt.IntSize(i19, i18), i49, i7, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), lazyStaggeredGridMeasureContext.getCoroutineScope(), null);
    }

    private static final boolean measure$lambda$38$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (iArr2[i] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i2 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$38$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i) {
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
                        long m902constructorimpl = SpanRange.m902constructorimpl(removeFirst.getLane(), removeFirst.getSpan());
                        int m891maxInRangejy6DScQ = m891maxInRangejy6DScQ(iArr, m902constructorimpl);
                        removeFirst.position(m891maxInRangejy6DScQ, lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i3], i);
                        arrayList.add(removeFirst);
                        int i6 = (int) (m902constructorimpl & 4294967295L);
                        for (int i7 = (int) (m902constructorimpl >> 32); i7 < i6; i7++) {
                            iArr[i7] = removeFirst.getMainAxisSizeWithSpacings() + m891maxInRangejy6DScQ;
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
                        long m887getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m887getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue, 0);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        LazyStaggeredGridMeasuredItem m896getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m896getAndMeasurejy6DScQ(intValue, m887getSpanRangelOCCd4c);
                        function1.invoke(m896getAndMeasurejy6DScQ);
                        arrayList.add(m896getAndMeasurejy6DScQ);
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
                    long m887getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext.m887getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue2, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem m896getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m896getAndMeasurejy6DScQ(intValue2, m887getSpanRangelOCCd4c2);
                    function1.invoke(m896getAndMeasurejy6DScQ2);
                    arrayList.add(m896getAndMeasurejy6DScQ2);
                }
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    /* renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m890forEachnIS5qE8(long j, Function1<? super Integer, Unit> function1) {
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
    private static final int m891maxInRangejy6DScQ(int[] iArr, long j) {
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
