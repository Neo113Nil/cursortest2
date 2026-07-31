package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Scroll.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0013\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0018\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J#\u0010\u001c\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J#\u0010\u001d\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b\u0005\u0010+R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b\u0006\u0010+R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/foundation/ScrollState;", "scrollerState", "", "isReversed", "isVertical", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "<init>", "(Landroidx/compose/foundation/ScrollState;ZZLandroidx/compose/foundation/OverscrollEffect;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/ScrollState;", "getScrollerState", "()Landroidx/compose/foundation/ScrollState;", "Z", "()Z", "Landroidx/compose/foundation/OverscrollEffect;", "getOverscrollEffect", "()Landroidx/compose/foundation/OverscrollEffect;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* data */ class ScrollingLayoutModifier implements LayoutModifier {
    private final boolean isReversed;
    private final boolean isVertical;
    private final OverscrollEffect overscrollEffect;
    private final ScrollState scrollerState;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollingLayoutModifier)) {
            return false;
        }
        ScrollingLayoutModifier scrollingLayoutModifier = (ScrollingLayoutModifier) other;
        return Intrinsics.areEqual(this.scrollerState, scrollingLayoutModifier.scrollerState) && this.isReversed == scrollingLayoutModifier.isReversed && this.isVertical == scrollingLayoutModifier.isVertical && Intrinsics.areEqual(this.overscrollEffect, scrollingLayoutModifier.overscrollEffect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.scrollerState.hashCode() * 31;
        boolean z = this.isReversed;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.isVertical;
        return ((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.overscrollEffect.hashCode();
    }

    public String toString() {
        return "ScrollingLayoutModifier(scrollerState=" + this.scrollerState + ", isReversed=" + this.isReversed + ", isVertical=" + this.isVertical + ", overscrollEffect=" + this.overscrollEffect + ')';
    }

    public ScrollingLayoutModifier(ScrollState scrollerState, boolean z, boolean z2, OverscrollEffect overscrollEffect) {
        Intrinsics.checkNotNullParameter(scrollerState, "scrollerState");
        Intrinsics.checkNotNullParameter(overscrollEffect, "overscrollEffect");
        this.scrollerState = scrollerState;
        this.isReversed = z;
        this.isVertical = z2;
        this.overscrollEffect = overscrollEffect;
    }

    public final ScrollState getScrollerState() {
        return this.scrollerState;
    }

    /* renamed from: isReversed, reason: from getter */
    public final boolean getIsReversed() {
        return this.isReversed;
    }

    /* renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo46measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        CheckScrollableContainerConstraintsKt.m168checkScrollableContainerConstraintsK40F9xA(j, this.isVertical ? Orientation.Vertical : Orientation.Horizontal);
        final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(Constraints.m2478copyZbe2FdA$default(j, 0, this.isVertical ? Constraints.m2487getMaxWidthimpl(j) : Integer.MAX_VALUE, 0, this.isVertical ? Integer.MAX_VALUE : Constraints.m2486getMaxHeightimpl(j), 5, null));
        int coerceAtMost = RangesKt.coerceAtMost(mo1944measureBRTryo0.getWidth(), Constraints.m2487getMaxWidthimpl(j));
        int coerceAtMost2 = RangesKt.coerceAtMost(mo1944measureBRTryo0.getHeight(), Constraints.m2486getMaxHeightimpl(j));
        final int height = mo1944measureBRTryo0.getHeight() - coerceAtMost2;
        int width = mo1944measureBRTryo0.getWidth() - coerceAtMost;
        if (!this.isVertical) {
            height = width;
        }
        this.overscrollEffect.setEnabled(height != 0);
        return MeasureScope.layout$default(measure, coerceAtMost, coerceAtMost2, null, new Function1() { // from class: androidx.compose.foundation.ScrollingLayoutModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                ScrollingLayoutModifier.this.getScrollerState().setMaxValue$foundation_release(height);
                int coerceIn = RangesKt.coerceIn(ScrollingLayoutModifier.this.getScrollerState().getValue(), 0, height);
                int i = ScrollingLayoutModifier.this.getIsReversed() ? coerceIn - height : -coerceIn;
                Placeable.PlacementScope.placeRelativeWithLayer$default(layout, mo1944measureBRTryo0, ScrollingLayoutModifier.this.getIsVertical() ? 0 : i, ScrollingLayoutModifier.this.getIsVertical() ? i : 0, 0.0f, null, 12, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.maxIntrinsicHeight(i);
    }
}
