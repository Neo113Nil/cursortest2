package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B2\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0014\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0019\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ#\u0010\u001d\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ#\u0010\u001e\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001aJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0017H\u0016¢\u0006\u0004\b$\u0010%R \u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R \u0010\u0005\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010(\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/unit/Dp;", "minWidth", "minHeight", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "<init>", "(FFLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "F", "getMinWidth-D9Ej5fM", "()F", "getMinHeight-D9Ej5fM", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
final class UnspecifiedConstraintsModifier extends InspectorValueInfo implements LayoutModifier {
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ UnspecifiedConstraintsModifier(float f, float f2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, function1);
    }

    private UnspecifiedConstraintsModifier(float f, float f2, Function1 function1) {
        super(function1);
        this.minWidth = f;
        this.minHeight = f2;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo46measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        int m2489getMinWidthimpl;
        int m2488getMinHeightimpl;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        float f = this.minWidth;
        Dp.Companion companion = Dp.INSTANCE;
        if (!Dp.m2509equalsimpl0(f, companion.m2515getUnspecifiedD9Ej5fM()) && Constraints.m2489getMinWidthimpl(j) == 0) {
            m2489getMinWidthimpl = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(measure.mo265roundToPx0680j_4(this.minWidth), Constraints.m2487getMaxWidthimpl(j)), 0);
        } else {
            m2489getMinWidthimpl = Constraints.m2489getMinWidthimpl(j);
        }
        int m2487getMaxWidthimpl = Constraints.m2487getMaxWidthimpl(j);
        if (!Dp.m2509equalsimpl0(this.minHeight, companion.m2515getUnspecifiedD9Ej5fM()) && Constraints.m2488getMinHeightimpl(j) == 0) {
            m2488getMinHeightimpl = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(measure.mo265roundToPx0680j_4(this.minHeight), Constraints.m2486getMaxHeightimpl(j)), 0);
        } else {
            m2488getMinHeightimpl = Constraints.m2488getMinHeightimpl(j);
        }
        final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(ConstraintsKt.Constraints(m2489getMinWidthimpl, m2487getMaxWidthimpl, m2488getMinHeightimpl, Constraints.m2486getMaxHeightimpl(j)));
        return MeasureScope.layout$default(measure, mo1944measureBRTryo0.getWidth(), mo1944measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.foundation.layout.UnspecifiedConstraintsModifier$measure$1
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
                Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return RangesKt.coerceAtLeast(measurable.minIntrinsicWidth(i), !Dp.m2509equalsimpl0(this.minWidth, Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo265roundToPx0680j_4(this.minWidth) : 0);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return RangesKt.coerceAtLeast(measurable.maxIntrinsicWidth(i), !Dp.m2509equalsimpl0(this.minWidth, Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo265roundToPx0680j_4(this.minWidth) : 0);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return RangesKt.coerceAtLeast(measurable.minIntrinsicHeight(i), !Dp.m2509equalsimpl0(this.minHeight, Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo265roundToPx0680j_4(this.minHeight) : 0);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return RangesKt.coerceAtLeast(measurable.maxIntrinsicHeight(i), !Dp.m2509equalsimpl0(this.minHeight, Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo265roundToPx0680j_4(this.minHeight) : 0);
    }

    public boolean equals(Object other) {
        if (!(other instanceof UnspecifiedConstraintsModifier)) {
            return false;
        }
        UnspecifiedConstraintsModifier unspecifiedConstraintsModifier = (UnspecifiedConstraintsModifier) other;
        return Dp.m2509equalsimpl0(this.minWidth, unspecifiedConstraintsModifier.minWidth) && Dp.m2509equalsimpl0(this.minHeight, unspecifiedConstraintsModifier.minHeight);
    }

    public int hashCode() {
        return (Dp.m2510hashCodeimpl(this.minWidth) * 31) + Dp.m2510hashCodeimpl(this.minHeight);
    }
}
