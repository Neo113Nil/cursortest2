package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.CacheWindowLogic;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.StickyItemsPlacement;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyGrid.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class LazyGridKt$rememberLazyGridMeasurePolicy$1$1 implements LazyLayoutMeasurePolicy {
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ GraphicsContext $graphicsContext;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ Function0<LazyGridItemProvider> $itemProviderLambda;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyGridSlotsProvider $slots;
    final /* synthetic */ LazyGridState $state;
    final /* synthetic */ StickyItemsPlacement $stickyItemsScrollBehavior;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX WARN: Multi-variable type inference failed */
    LazyGridKt$rememberLazyGridMeasurePolicy$1$1(LazyGridState lazyGridState, boolean z, PaddingValues paddingValues, boolean z2, Function0<? extends LazyGridItemProvider> function0, LazyGridSlotsProvider lazyGridSlotsProvider, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, CoroutineScope coroutineScope, GraphicsContext graphicsContext, StickyItemsPlacement stickyItemsPlacement) {
        this.$state = lazyGridState;
        this.$isVertical = z;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z2;
        this.$itemProviderLambda = function0;
        this.$slots = lazyGridSlotsProvider;
        this.$verticalArrangement = vertical;
        this.$horizontalArrangement = horizontal;
        this.$coroutineScope = coroutineScope;
        this.$graphicsContext = graphicsContext;
        this.$stickyItemsScrollBehavior = stickyItemsPlacement;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0256  */
    /* JADX WARN: Type inference failed for: r21v1, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1] */
    /* JADX WARN: Type inference failed for: r26v0, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1] */
    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy
    /* renamed from: measure-0kLqBqw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MeasureResult mo922measure0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
        int i;
        int i2;
        int i3;
        float spacing;
        int m7475getMaxWidthimpl;
        int i4;
        long m7644constructorimpl;
        int lineIndexOfItem;
        int firstVisibleItemScrollOffset;
        float scrollToBeConsumed;
        CacheWindowLogic cacheWindowLogic;
        ObservableScopeInvalidator.m1007attachToScopeimpl(this.$state.m965getMeasurementScopeInvalidatorzYiylxw$foundation());
        boolean z = this.$state.getHasLookaheadOccurred() || lazyLayoutMeasureScope.isLookingAhead();
        CheckScrollableContainerConstraintsKt.m293checkScrollableContainerConstraintsK40F9xA(j, this.$isVertical ? Orientation.Vertical : Orientation.Horizontal);
        boolean z2 = this.$isVertical;
        PaddingValues paddingValues = this.$contentPadding;
        if (z2) {
            i = lazyLayoutMeasureScope.mo401roundToPx0680j_4(paddingValues.mo770calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            i = lazyLayoutMeasureScope.mo401roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        boolean z3 = this.$isVertical;
        PaddingValues paddingValues2 = this.$contentPadding;
        if (z3) {
            i2 = lazyLayoutMeasureScope.mo401roundToPx0680j_4(paddingValues2.mo771calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            i2 = lazyLayoutMeasureScope.mo401roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        int i5 = lazyLayoutMeasureScope.mo401roundToPx0680j_4(this.$contentPadding.getTop());
        int i6 = lazyLayoutMeasureScope.mo401roundToPx0680j_4(this.$contentPadding.getBottom());
        int i7 = i5 + i6;
        final int i8 = i + i2;
        boolean z4 = this.$isVertical;
        int i9 = z4 ? i7 : i8;
        if (z4 && !this.$reverseLayout) {
            i3 = i5;
        } else if (z4 && this.$reverseLayout) {
            i3 = i6;
        } else {
            i3 = (z4 || this.$reverseLayout) ? i2 : i;
        }
        final int i10 = i9 - i3;
        long m7494offsetNN6EwU = ConstraintsKt.m7494offsetNN6EwU(j, -i8, -i7);
        final LazyGridItemProvider invoke = this.$itemProviderLambda.invoke();
        final LazyGridSpanLayoutProvider spanLayoutProvider = invoke.getSpanLayoutProvider();
        LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
        final LazyGridSlots mo948invoke0kLqBqw = this.$slots.mo948invoke0kLqBqw(lazyLayoutMeasureScope2, m7494offsetNN6EwU);
        int length = mo948invoke0kLqBqw.getSizes().length;
        spanLayoutProvider.setSlotsPerLine(length);
        if (this.$isVertical) {
            Arrangement.Vertical vertical = this.$verticalArrangement;
            if (vertical != null) {
                spacing = vertical.getSpacing();
            } else {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement when isVertical == true");
                throw new KotlinNothingValueException();
            }
        } else {
            Arrangement.Horizontal horizontal = this.$horizontalArrangement;
            if (horizontal != null) {
                spacing = horizontal.getSpacing();
            } else {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalArrangement when isVertical == false");
                throw new KotlinNothingValueException();
            }
        }
        final int i11 = lazyLayoutMeasureScope.mo401roundToPx0680j_4(spacing);
        final int itemCount = invoke.getItemCount();
        if (this.$isVertical) {
            m7475getMaxWidthimpl = Constraints.m7474getMaxHeightimpl(j) - i7;
        } else {
            m7475getMaxWidthimpl = Constraints.m7475getMaxWidthimpl(j) - i8;
        }
        int i12 = m7475getMaxWidthimpl;
        if (this.$reverseLayout && i12 <= 0) {
            boolean z5 = this.$isVertical;
            if (!z5) {
                i += i12;
            }
            if (z5) {
                i5 += i12;
            }
            i4 = i7;
            m7644constructorimpl = IntOffset.m7644constructorimpl((i5 & 4294967295L) | (i << 32));
        } else {
            i4 = i7;
            m7644constructorimpl = IntOffset.m7644constructorimpl((i << 32) | (i5 & 4294967295L));
        }
        final LazyGridState lazyGridState = this.$state;
        final boolean z6 = this.$isVertical;
        final boolean z7 = this.$reverseLayout;
        final int i13 = i3;
        final long j2 = m7644constructorimpl;
        final ?? r26 = new LazyGridMeasuredItemProvider(invoke, lazyLayoutMeasureScope, i11, lazyGridState, z6, z7, i13, i10, j2) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
            final /* synthetic */ int $afterContentPadding;
            final /* synthetic */ int $beforeContentPadding;
            final /* synthetic */ boolean $isVertical;
            final /* synthetic */ boolean $reverseLayout;
            final /* synthetic */ LazyGridState $state;
            final /* synthetic */ LazyLayoutMeasureScope $this_LazyLayoutMeasurePolicy;
            final /* synthetic */ long $visualItemOffset;

            {
                this.$this_LazyLayoutMeasurePolicy = lazyLayoutMeasureScope;
                this.$state = lazyGridState;
                this.$isVertical = z6;
                this.$reverseLayout = z7;
                this.$beforeContentPadding = i13;
                this.$afterContentPadding = i10;
                this.$visualItemOffset = j2;
            }

            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
            /* renamed from: createItem-O3s9Psw, reason: not valid java name */
            public LazyGridMeasuredItem mo957createItemO3s9Psw(int index, Object key, Object contentType, int crossAxisSize, int mainAxisSpacing, List<? extends Placeable> placeables, long constraints, int lane, int span) {
                return new LazyGridMeasuredItem(index, key, this.$isVertical, crossAxisSize, mainAxisSpacing, this.$reverseLayout, this.$this_LazyLayoutMeasurePolicy.getLayoutDirection(), this.$beforeContentPadding, this.$afterContentPadding, placeables, this.$visualItemOffset, contentType, this.$state.getItemAnimator$foundation(), constraints, lane, span, null);
            }
        };
        final boolean z8 = this.$isVertical;
        final ?? r21 = new LazyGridMeasuredLineProvider(z8, mo948invoke0kLqBqw, itemCount, i11, r26, spanLayoutProvider) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
            final /* synthetic */ boolean $isVertical;
            final /* synthetic */ LazyGridSlots $resolvedSlots;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(z8, mo948invoke0kLqBqw, itemCount, i11, r26, spanLayoutProvider);
                this.$isVertical = z8;
                this.$resolvedSlots = mo948invoke0kLqBqw;
            }

            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider
            public LazyGridMeasuredLine createLine(int index, LazyGridMeasuredItem[] items, List<GridItemSpan> spans, int mainAxisSpacing) {
                return new LazyGridMeasuredLine(index, items, this.$resolvedSlots, spans, this.$isVertical, mainAxisSpacing);
            }
        };
        Function1 function1 = new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LazyGridKt$rememberLazyGridMeasurePolicy$1$1.measure_0kLqBqw$lambda$2(LazyGridSpanLayoutProvider.this, r21, ((Integer) obj).intValue());
            }
        };
        Function1 function12 = new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int lineIndexOfItem2;
                lineIndexOfItem2 = LazyGridSpanLayoutProvider.this.getLineIndexOfItem(((Integer) obj).intValue());
                return Integer.valueOf(lineIndexOfItem2);
            }
        };
        Snapshot.Companion companion = Snapshot.INSTANCE;
        LazyGridState lazyGridState2 = this.$state;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            int updateScrollPositionIfTheFirstItemWasMoved$foundation = lazyGridState2.updateScrollPositionIfTheFirstItemWasMoved$foundation(invoke, lazyGridState2.getFirstVisibleItemIndex());
            if (updateScrollPositionIfTheFirstItemWasMoved$foundation >= itemCount && itemCount > 0) {
                lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(itemCount - 1);
                firstVisibleItemScrollOffset = 0;
                int i14 = lineIndexOfItem;
                Unit unit = Unit.INSTANCE;
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                List<Integer> calculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, this.$state.getPinnedItems(), this.$state.getBeyondBoundsInfo());
                if (!lazyLayoutMeasureScope.isLookingAhead() || !z) {
                    scrollToBeConsumed = this.$state.getScrollToBeConsumed();
                } else {
                    scrollToBeConsumed = this.$state.getScrollDeltaBetweenPasses$foundation();
                }
                LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider = (LazyGridMeasuredLineProvider) r21;
                final int i15 = i4;
                LazyGridMeasureResult m960measureLazyGridt1x4au0 = LazyGridMeasureKt.m960measureLazyGridt1x4au0(itemCount, lazyGridMeasuredLineProvider, (LazyGridMeasuredItemProvider) r26, i12, i3, i10, i11, i14, firstVisibleItemScrollOffset, scrollToBeConsumed, m7494offsetNN6EwU, this.$isVertical, this.$verticalArrangement, this.$horizontalArrangement, this.$reverseLayout, lazyLayoutMeasureScope2, this.$state.getItemAnimator$foundation(), length, calculateLazyLayoutPinnedIndices, z, lazyLayoutMeasureScope.isLookingAhead(), this.$state.getApproachLayoutInfo(), this.$coroutineScope, this.$state.m966getPlacementScopeInvalidatorzYiylxw$foundation(), this.$graphicsContext, function1, function12, this.$stickyItemsScrollBehavior, new Function3() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        MeasureResult layout;
                        Function1 function13 = (Function1) obj3;
                        layout = LazyLayoutMeasureScope.this.layout(ConstraintsKt.m7492constrainWidthK40F9xA(r1, ((Integer) obj).intValue() + i8), ConstraintsKt.m7491constrainHeightK40F9xA(j, ((Integer) obj2).intValue() + i15), MapsKt.emptyMap(), function13);
                        return layout;
                    }
                });
                LazyGridState.applyMeasureResult$foundation$default(this.$state, m960measureLazyGridt1x4au0, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                Object prefetchStrategy = this.$state.getPrefetchStrategy();
                cacheWindowLogic = !(prefetchStrategy instanceof CacheWindowLogic) ? (CacheWindowLogic) prefetchStrategy : null;
                if (cacheWindowLogic != null) {
                    LazyGridKt.keepAroundItems(cacheWindowLogic, m960measureLazyGridt1x4au0.getOrientation(), m960measureLazyGridt1x4au0.getVisibleItemsInfo(), lazyGridMeasuredLineProvider);
                }
                return m960measureLazyGridt1x4au0;
            }
            lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(updateScrollPositionIfTheFirstItemWasMoved$foundation);
            firstVisibleItemScrollOffset = lazyGridState2.getFirstVisibleItemScrollOffset();
            int i142 = lineIndexOfItem;
            Unit unit2 = Unit.INSTANCE;
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            List<Integer> calculateLazyLayoutPinnedIndices2 = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, this.$state.getPinnedItems(), this.$state.getBeyondBoundsInfo());
            if (!lazyLayoutMeasureScope.isLookingAhead()) {
            }
            scrollToBeConsumed = this.$state.getScrollToBeConsumed();
            LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider2 = (LazyGridMeasuredLineProvider) r21;
            final int i152 = i4;
            LazyGridMeasureResult m960measureLazyGridt1x4au02 = LazyGridMeasureKt.m960measureLazyGridt1x4au0(itemCount, lazyGridMeasuredLineProvider2, (LazyGridMeasuredItemProvider) r26, i12, i3, i10, i11, i142, firstVisibleItemScrollOffset, scrollToBeConsumed, m7494offsetNN6EwU, this.$isVertical, this.$verticalArrangement, this.$horizontalArrangement, this.$reverseLayout, lazyLayoutMeasureScope2, this.$state.getItemAnimator$foundation(), length, calculateLazyLayoutPinnedIndices2, z, lazyLayoutMeasureScope.isLookingAhead(), this.$state.getApproachLayoutInfo(), this.$coroutineScope, this.$state.m966getPlacementScopeInvalidatorzYiylxw$foundation(), this.$graphicsContext, function1, function12, this.$stickyItemsScrollBehavior, new Function3() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    MeasureResult layout;
                    Function1 function13 = (Function1) obj3;
                    layout = LazyLayoutMeasureScope.this.layout(ConstraintsKt.m7492constrainWidthK40F9xA(r1, ((Integer) obj).intValue() + i8), ConstraintsKt.m7491constrainHeightK40F9xA(j, ((Integer) obj2).intValue() + i152), MapsKt.emptyMap(), function13);
                    return layout;
                }
            });
            LazyGridState.applyMeasureResult$foundation$default(this.$state, m960measureLazyGridt1x4au02, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
            Object prefetchStrategy2 = this.$state.getPrefetchStrategy();
            if (!(prefetchStrategy2 instanceof CacheWindowLogic)) {
            }
            if (cacheWindowLogic != null) {
            }
            return m960measureLazyGridt1x4au02;
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    static final ArrayList measure_0kLqBqw$lambda$2(LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1, int i) {
        LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = lazyGridSpanLayoutProvider.getLineConfiguration(i);
        int firstItemIndex = lineConfiguration.getFirstItemIndex();
        ArrayList arrayList = new ArrayList(lineConfiguration.getSpans().size());
        List<GridItemSpan> spans = lineConfiguration.getSpans();
        int size = spans.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int m944getCurrentLineSpanimpl = GridItemSpan.m944getCurrentLineSpanimpl(spans.get(i3).getPackedValue());
            arrayList.add(TuplesKt.to(Integer.valueOf(firstItemIndex), Constraints.m7462boximpl(lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.m964childConstraintsJhjzzOo$foundation(i2, m944getCurrentLineSpanimpl))));
            firstItemIndex++;
            i2 += m944getCurrentLineSpanimpl;
        }
        return arrayList;
    }
}
