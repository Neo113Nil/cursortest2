package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyGridState.kt */
@Stable
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u008f\u00012\u00020\u0001:\u0002\u008f\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0006J?\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010$\u001a\u00020\t2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010)\u001a\u00020\t2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00102\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R$\u00107\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00078\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R+\u0010@\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b;\u00100\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R+\u0010G\u001a\u00020A2\u0006\u00106\u001a\u00020A8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bB\u00100\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR+\u0010N\u001a\u00020H2\u0006\u00106\u001a\u00020H8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bI\u00100\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR$\u0010Q\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010=R\"\u0010T\u001a\u00020H8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010K\"\u0004\bW\u0010MR\u0016\u0010X\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010RR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010UR/\u0010d\u001a\u0004\u0018\u00010^2\b\u00106\u001a\u0004\u0018\u00010^8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b_\u00100\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001a\u0010f\u001a\u00020e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010k\u001a\u00020j8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nRj\u0010y\u001a \u0012\u0004\u0012\u00020p\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020s0r0q0o2$\u00106\u001a \u0012\u0004\u0012\u00020p\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020s0r0q0o8@@@X\u0080\u008e\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\bt\u00100\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR0\u0010\u0080\u0001\u001a\u0004\u0018\u00010z2\b\u00106\u001a\u0004\u0018\u00010z8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b{\u00100\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u0018\u0010\u0081\u0001\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010UR'\u0010\u0082\u0001\u001a\u00020H2\u0006\u00106\u001a\u00020H8\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010U\u001a\u0005\b\u0083\u0001\u0010KR \u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0012\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010=R\u0012\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010=R\u0014\u0010\u008d\u0001\u001a\u00020.8F¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\u008e\u0001\u001a\u00020H8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010K\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0090\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "<init>", "(II)V", "", "delta", "", "notifyPrefetch", "(F)V", "index", "scrollOffset", "scrollToItem", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapToItemIndexInternal$foundation_release", "snapToItemIndexInternal", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchRawDelta", "(F)F", "distance", "onScroll$foundation_release", "onScroll", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "result", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;)V", "applyMeasureResult", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;)V", "updateScrollPositionIfTheFirstItemWasMoved", "Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "scrollPosition", "Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "layoutInfoState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "<set-?>", "scrollToBeConsumed", "F", "getScrollToBeConsumed$foundation_release", "()F", "slotsPerLine$delegate", "getSlotsPerLine$foundation_release", "()I", "setSlotsPerLine$foundation_release", "(I)V", "slotsPerLine", "Landroidx/compose/ui/unit/Density;", "density$delegate", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "", "isVertical$delegate", "isVertical$foundation_release", "()Z", "setVertical$foundation_release", "(Z)V", "isVertical", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "numMeasurePasses", "I", "getNumMeasurePasses$foundation_release", "prefetchingEnabled", "Z", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "lineToPrefetch", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "currentLinePrefetchHandles", "Landroidx/compose/runtime/collection/MutableVector;", "wasScrollingForward", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement$delegate", "getRemeasurement", "()Landroidx/compose/ui/layout/Remeasurement;", "setRemeasurement", "(Landroidx/compose/ui/layout/Remeasurement;)V", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "Landroidx/compose/foundation/lazy/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/AwaitFirstLayoutModifier;", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LineIndex;", "", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/Constraints;", "prefetchInfoRetriever$delegate", "getPrefetchInfoRetriever$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setPrefetchInfoRetriever$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "prefetchInfoRetriever", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator$delegate", "getPlacementAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "setPlacementAnimator$foundation_release", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;)V", "placementAnimator", "canScrollBackward", "canScrollForward", "getCanScrollForward$foundation_release", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getFirstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "layoutInfo", "isScrollInProgress", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LazyGridState implements ScrollableState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver Saver = ListSaverKt.listSaver(new Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final List<Integer> invoke(@NotNull SaverScope listSaver, @NotNull LazyGridState it) {
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(it.getFirstVisibleItemIndex()), Integer.valueOf(it.getFirstVisibleItemScrollOffset())});
        }
    }, new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final LazyGridState invoke(@NotNull List<Integer> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new LazyGridState(it.get(0).intValue(), it.get(1).intValue());
        }
    });
    private boolean canScrollBackward;
    private boolean canScrollForward;
    private int numMeasurePasses;
    private final LazyGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private boolean wasScrollingForward;
    private final MutableState layoutInfoState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EmptyLazyGridLayoutInfo.INSTANCE, null, 2, null);
    private final MutableInteractionSource internalInteractionSource = InteractionSourceKt.MutableInteractionSource();

    /* renamed from: slotsPerLine$delegate, reason: from kotlin metadata */
    private final MutableState slotsPerLine = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

    /* renamed from: density$delegate, reason: from kotlin metadata */
    private final MutableState density = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DensityKt.Density(1.0f, 1.0f), null, 2, null);

    /* renamed from: isVertical$delegate, reason: from kotlin metadata */
    private final MutableState isVertical = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    private final ScrollableState scrollableState = ScrollableStateKt.ScrollableState(new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$scrollableState$1
        {
            super(1);
        }

        @NotNull
        public final Float invoke(float f) {
            return Float.valueOf(-LazyGridState.this.onScroll$foundation_release(-f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).floatValue());
        }
    });
    private boolean prefetchingEnabled = true;
    private int lineToPrefetch = -1;
    private final MutableVector currentLinePrefetchHandles = new MutableVector(new LazyLayoutPrefetchState.PrefetchHandle[16], 0);

    /* renamed from: remeasurement$delegate, reason: from kotlin metadata */
    private final MutableState remeasurement = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final RemeasurementModifier remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$remeasurementModifier$1
        @Override // androidx.compose.ui.layout.RemeasurementModifier
        public void onRemeasurementAvailable(Remeasurement remeasurement) {
            Intrinsics.checkNotNullParameter(remeasurement, "remeasurement");
            LazyGridState.this.setRemeasurement(remeasurement);
        }
    };
    private final AwaitFirstLayoutModifier awaitLayoutModifier = new AwaitFirstLayoutModifier();

    /* renamed from: prefetchInfoRetriever$delegate, reason: from kotlin metadata */
    private final MutableState prefetchInfoRetriever = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$prefetchInfoRetriever$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m476invokebKFJvoY(((LineIndex) obj).getValue());
        }

        @NotNull
        /* renamed from: invoke-bKFJvoY, reason: not valid java name */
        public final List<Pair<Integer, Constraints>> m476invokebKFJvoY(int i) {
            return CollectionsKt.emptyList();
        }
    }, null, 2, null);

    /* renamed from: placementAnimator$delegate, reason: from kotlin metadata */
    private final MutableState placementAnimator = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final LazyLayoutPrefetchState prefetchState = new LazyLayoutPrefetchState();

    public LazyGridState(int i, int i2) {
        this.scrollPosition = new LazyGridScrollPosition(i, i2);
    }

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.m471getIndexVZbfaAc();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getScrollOffset();
    }

    public final LazyGridLayoutInfo getLayoutInfo() {
        return (LazyGridLayoutInfo) this.layoutInfoState.getValue();
    }

    /* renamed from: getInternalInteractionSource$foundation_release, reason: from getter */
    public final MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    /* renamed from: getScrollToBeConsumed$foundation_release, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    public final void setSlotsPerLine$foundation_release(int i) {
        this.slotsPerLine.setValue(Integer.valueOf(i));
    }

    public final Density getDensity$foundation_release() {
        return (Density) this.density.getValue();
    }

    public final void setDensity$foundation_release(Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.density.setValue(density);
    }

    public final boolean isVertical$foundation_release() {
        return ((Boolean) this.isVertical.getValue()).booleanValue();
    }

    public final void setVertical$foundation_release(boolean z) {
        this.isVertical.setValue(Boolean.valueOf(z));
    }

    private final Remeasurement getRemeasurement() {
        return (Remeasurement) this.remeasurement.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRemeasurement(Remeasurement remeasurement) {
        this.remeasurement.setValue(remeasurement);
    }

    /* renamed from: getRemeasurementModifier$foundation_release, reason: from getter */
    public final RemeasurementModifier getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    /* renamed from: getAwaitLayoutModifier$foundation_release, reason: from getter */
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    public final Function1 getPrefetchInfoRetriever$foundation_release() {
        return (Function1) this.prefetchInfoRetriever.getValue();
    }

    public final void setPrefetchInfoRetriever$foundation_release(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.prefetchInfoRetriever.setValue(function1);
    }

    public final LazyGridItemPlacementAnimator getPlacementAnimator$foundation_release() {
        return (LazyGridItemPlacementAnimator) this.placementAnimator.getValue();
    }

    public final void setPlacementAnimator$foundation_release(LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator) {
        this.placementAnimator.setValue(lazyGridItemPlacementAnimator);
    }

    public static /* synthetic */ Object scrollToItem$default(LazyGridState lazyGridState, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyGridState.scrollToItem(i, i2, continuation);
    }

    public final Object scrollToItem(int i, int i2, Continuation continuation) {
        Object scroll$default = ScrollableState.scroll$default(this, null, new LazyGridState$scrollToItem$2(this, i, i2, null), continuation, 1, null);
        return scroll$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll$default : Unit.INSTANCE;
    }

    public final void snapToItemIndexInternal$foundation_release(int index, int scrollOffset) {
        this.scrollPosition.m472requestPositionyO3Fmg4(ItemIndex.m439constructorimpl(index), scrollOffset);
        LazyGridItemPlacementAnimator placementAnimator$foundation_release = getPlacementAnimator$foundation_release();
        if (placementAnimator$foundation_release != null) {
            placementAnimator$foundation_release.reset();
        }
        Remeasurement remeasurement = getRemeasurement();
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object scroll(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        LazyGridState$scroll$1 lazyGridState$scroll$1;
        Object coroutine_suspended;
        int i;
        LazyGridState lazyGridState;
        ScrollableState scrollableState;
        if (continuation instanceof LazyGridState$scroll$1) {
            lazyGridState$scroll$1 = (LazyGridState$scroll$1) continuation;
            int i2 = lazyGridState$scroll$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lazyGridState$scroll$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lazyGridState$scroll$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = lazyGridState$scroll$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AwaitFirstLayoutModifier awaitFirstLayoutModifier = this.awaitLayoutModifier;
                    lazyGridState$scroll$1.L$0 = this;
                    lazyGridState$scroll$1.L$1 = mutatePriority;
                    lazyGridState$scroll$1.L$2 = function2;
                    lazyGridState$scroll$1.label = 1;
                    if (awaitFirstLayoutModifier.waitForFirstLayout(lazyGridState$scroll$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    lazyGridState = this;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function2 = (Function2) lazyGridState$scroll$1.L$2;
                    mutatePriority = (MutatePriority) lazyGridState$scroll$1.L$1;
                    lazyGridState = (LazyGridState) lazyGridState$scroll$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                scrollableState = lazyGridState.scrollableState;
                lazyGridState$scroll$1.L$0 = null;
                lazyGridState$scroll$1.L$1 = null;
                lazyGridState$scroll$1.L$2 = null;
                lazyGridState$scroll$1.label = 2;
                if (scrollableState.scroll(mutatePriority, function2, lazyGridState$scroll$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        lazyGridState$scroll$1 = new LazyGridState$scroll$1(this, continuation);
        Object obj2 = lazyGridState$scroll$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = lazyGridState$scroll$1.label;
        if (i != 0) {
        }
        scrollableState = lazyGridState.scrollableState;
        lazyGridState$scroll$1.L$0 = null;
        lazyGridState$scroll$1.L$1 = null;
        lazyGridState$scroll$1.L$2 = null;
        lazyGridState$scroll$1.label = 2;
        if (scrollableState.scroll(mutatePriority, function2, lazyGridState$scroll$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.scrollableState.dispatchRawDelta(delta);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    /* renamed from: getCanScrollForward$foundation_release, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    public final float onScroll$foundation_release(float distance) {
        if ((distance < 0.0f && !this.canScrollForward) || (distance > 0.0f && !this.canScrollBackward)) {
            return 0.0f;
        }
        if (Math.abs(this.scrollToBeConsumed) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.scrollToBeConsumed).toString());
        }
        float f = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f;
        if (Math.abs(f) > 0.5f) {
            float f2 = this.scrollToBeConsumed;
            Remeasurement remeasurement = getRemeasurement();
            if (remeasurement != null) {
                remeasurement.forceRemeasure();
            }
            if (this.prefetchingEnabled) {
                notifyPrefetch(f2 - this.scrollToBeConsumed);
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f3 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f3;
    }

    private final void notifyPrefetch(float delta) {
        int row;
        int index;
        MutableVector mutableVector;
        int size;
        LazyLayoutPrefetchState lazyLayoutPrefetchState = this.prefetchState;
        if (this.prefetchingEnabled) {
            LazyGridLayoutInfo layoutInfo = getLayoutInfo();
            if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
                return;
            }
            boolean z = delta < 0.0f;
            if (z) {
                LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.last(layoutInfo.getVisibleItemsInfo());
                row = (isVertical$foundation_release() ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn()) + 1;
                index = ((LazyGridItemInfo) CollectionsKt.last(layoutInfo.getVisibleItemsInfo())).getIndex() + 1;
            } else {
                LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt.first(layoutInfo.getVisibleItemsInfo());
                row = (isVertical$foundation_release() ? lazyGridItemInfo2.getRow() : lazyGridItemInfo2.getColumn()) - 1;
                index = ((LazyGridItemInfo) CollectionsKt.first(layoutInfo.getVisibleItemsInfo())).getIndex() - 1;
            }
            if (row == this.lineToPrefetch || index < 0 || index >= layoutInfo.getTotalItemsCount()) {
                return;
            }
            if (this.wasScrollingForward != z && (size = (mutableVector = this.currentLinePrefetchHandles).getSize()) > 0) {
                Object[] content = mutableVector.getContent();
                int i = 0;
                do {
                    ((LazyLayoutPrefetchState.PrefetchHandle) content[i]).cancel();
                    i++;
                } while (i < size);
            }
            this.wasScrollingForward = z;
            this.lineToPrefetch = row;
            this.currentLinePrefetchHandles.clear();
            List list = (List) getPrefetchInfoRetriever$foundation_release().invoke(LineIndex.m483boximpl(LineIndex.m484constructorimpl(row)));
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Pair pair = (Pair) list.get(i2);
                this.currentLinePrefetchHandles.add(lazyLayoutPrefetchState.m495schedulePrefetch0kLqBqw(((Number) pair.getFirst()).intValue(), ((Constraints) pair.getSecond()).getValue()));
            }
        }
    }

    /* renamed from: getPrefetchState$foundation_release, reason: from getter */
    public final LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    public final void applyMeasureResult$foundation_release(LazyGridMeasureResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.scrollPosition.updateFromMeasureResult(result);
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        this.canScrollForward = result.getCanScrollForward();
        LazyMeasuredLine firstVisibleLine = result.getFirstVisibleLine();
        this.canScrollBackward = ((firstVisibleLine != null ? firstVisibleLine.getIndex() : 0) == 0 && result.getFirstVisibleLineScrollOffset() == 0) ? false : true;
        this.numMeasurePasses++;
    }

    public final void updateScrollPositionIfTheFirstItemWasMoved$foundation_release(LazyGridItemProvider itemProvider) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(itemProvider);
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver getSaver() {
            return LazyGridState.Saver;
        }
    }
}
