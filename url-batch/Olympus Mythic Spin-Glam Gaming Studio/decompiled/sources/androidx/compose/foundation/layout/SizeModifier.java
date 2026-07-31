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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BN\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0018\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001d\u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010\u001eJ#\u0010!\u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b!\u0010\u001eJ#\u0010\"\u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010\u001eJ\u001a\u0010%\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001bH\u0016¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u001d\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u001d\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u001d\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R!\u0010.\u001a\u00020\u0013*\u00020+8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/foundation/layout/SizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/unit/Dp;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "<init>", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "F", "Z", "Landroidx/compose/ui/unit/Density;", "getTargetConstraints-OenEA2s", "(Landroidx/compose/ui/unit/Density;)J", "targetConstraints", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class SizeModifier extends InspectorValueInfo implements LayoutModifier {
    private final boolean enforceIncoming;
    private final float maxHeight;
    private final float maxWidth;
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ SizeModifier(float f, float f2, float f3, float f4, boolean z, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z, function1);
    }

    public /* synthetic */ SizeModifier(float f, float f2, float f3, float f4, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM() : f, (i & 2) != 0 ? Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM() : f2, (i & 4) != 0 ? Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM() : f3, (i & 8) != 0 ? Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM() : f4, z, function1, null);
    }

    private SizeModifier(float f, float f2, float f3, float f4, boolean z, Function1 function1) {
        super(function1);
        this.minWidth = f;
        this.minHeight = f2;
        this.maxWidth = f3;
        this.maxHeight = f4;
        this.enforceIncoming = z;
    }

    /* renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    private final long m368getTargetConstraintsOenEA2s(Density density) {
        int i;
        int coerceAtLeast;
        float f = this.maxWidth;
        Dp.Companion companion = Dp.INSTANCE;
        int i2 = 0;
        int mo265roundToPx0680j_4 = !Dp.m2509equalsimpl0(f, companion.m2515getUnspecifiedD9Ej5fM()) ? density.mo265roundToPx0680j_4(((Dp) RangesKt.coerceAtLeast(Dp.m2505boximpl(this.maxWidth), Dp.m2505boximpl(Dp.m2507constructorimpl(0)))).getValue()) : Integer.MAX_VALUE;
        int mo265roundToPx0680j_42 = !Dp.m2509equalsimpl0(this.maxHeight, companion.m2515getUnspecifiedD9Ej5fM()) ? density.mo265roundToPx0680j_4(((Dp) RangesKt.coerceAtLeast(Dp.m2505boximpl(this.maxHeight), Dp.m2505boximpl(Dp.m2507constructorimpl(0)))).getValue()) : Integer.MAX_VALUE;
        if (Dp.m2509equalsimpl0(this.minWidth, companion.m2515getUnspecifiedD9Ej5fM()) || (i = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(density.mo265roundToPx0680j_4(this.minWidth), mo265roundToPx0680j_4), 0)) == Integer.MAX_VALUE) {
            i = 0;
        }
        if (!Dp.m2509equalsimpl0(this.minHeight, companion.m2515getUnspecifiedD9Ej5fM()) && (coerceAtLeast = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(density.mo265roundToPx0680j_4(this.minHeight), mo265roundToPx0680j_42), 0)) != Integer.MAX_VALUE) {
            i2 = coerceAtLeast;
        }
        return ConstraintsKt.Constraints(i, mo265roundToPx0680j_4, i2, mo265roundToPx0680j_42);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo46measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        int coerceAtMost;
        int coerceAtLeast;
        int coerceAtMost2;
        int coerceAtLeast2;
        long Constraints;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m368getTargetConstraintsOenEA2s = m368getTargetConstraintsOenEA2s(measure);
        if (this.enforceIncoming) {
            Constraints = ConstraintsKt.m2499constrainN9IONVI(j, m368getTargetConstraintsOenEA2s);
        } else {
            float f = this.minWidth;
            Dp.Companion companion = Dp.INSTANCE;
            if (!Dp.m2509equalsimpl0(f, companion.m2515getUnspecifiedD9Ej5fM())) {
                coerceAtMost = Constraints.m2489getMinWidthimpl(m368getTargetConstraintsOenEA2s);
            } else {
                coerceAtMost = RangesKt.coerceAtMost(Constraints.m2489getMinWidthimpl(j), Constraints.m2487getMaxWidthimpl(m368getTargetConstraintsOenEA2s));
            }
            if (!Dp.m2509equalsimpl0(this.maxWidth, companion.m2515getUnspecifiedD9Ej5fM())) {
                coerceAtLeast = Constraints.m2487getMaxWidthimpl(m368getTargetConstraintsOenEA2s);
            } else {
                coerceAtLeast = RangesKt.coerceAtLeast(Constraints.m2487getMaxWidthimpl(j), Constraints.m2489getMinWidthimpl(m368getTargetConstraintsOenEA2s));
            }
            if (!Dp.m2509equalsimpl0(this.minHeight, companion.m2515getUnspecifiedD9Ej5fM())) {
                coerceAtMost2 = Constraints.m2488getMinHeightimpl(m368getTargetConstraintsOenEA2s);
            } else {
                coerceAtMost2 = RangesKt.coerceAtMost(Constraints.m2488getMinHeightimpl(j), Constraints.m2486getMaxHeightimpl(m368getTargetConstraintsOenEA2s));
            }
            if (!Dp.m2509equalsimpl0(this.maxHeight, companion.m2515getUnspecifiedD9Ej5fM())) {
                coerceAtLeast2 = Constraints.m2486getMaxHeightimpl(m368getTargetConstraintsOenEA2s);
            } else {
                coerceAtLeast2 = RangesKt.coerceAtLeast(Constraints.m2486getMaxHeightimpl(j), Constraints.m2488getMinHeightimpl(m368getTargetConstraintsOenEA2s));
            }
            Constraints = ConstraintsKt.Constraints(coerceAtMost, coerceAtLeast, coerceAtMost2, coerceAtLeast2);
        }
        final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(Constraints);
        return MeasureScope.layout$default(measure, mo1944measureBRTryo0.getWidth(), mo1944measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.foundation.layout.SizeModifier$measure$1
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
        long m368getTargetConstraintsOenEA2s = m368getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m2485getHasFixedWidthimpl(m368getTargetConstraintsOenEA2s)) {
            return Constraints.m2487getMaxWidthimpl(m368getTargetConstraintsOenEA2s);
        }
        return ConstraintsKt.m2501constrainWidthK40F9xA(m368getTargetConstraintsOenEA2s, measurable.minIntrinsicWidth(i));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m368getTargetConstraintsOenEA2s = m368getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m2484getHasFixedHeightimpl(m368getTargetConstraintsOenEA2s)) {
            return Constraints.m2486getMaxHeightimpl(m368getTargetConstraintsOenEA2s);
        }
        return ConstraintsKt.m2500constrainHeightK40F9xA(m368getTargetConstraintsOenEA2s, measurable.minIntrinsicHeight(i));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m368getTargetConstraintsOenEA2s = m368getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m2485getHasFixedWidthimpl(m368getTargetConstraintsOenEA2s)) {
            return Constraints.m2487getMaxWidthimpl(m368getTargetConstraintsOenEA2s);
        }
        return ConstraintsKt.m2501constrainWidthK40F9xA(m368getTargetConstraintsOenEA2s, measurable.maxIntrinsicWidth(i));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m368getTargetConstraintsOenEA2s = m368getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m2484getHasFixedHeightimpl(m368getTargetConstraintsOenEA2s)) {
            return Constraints.m2486getMaxHeightimpl(m368getTargetConstraintsOenEA2s);
        }
        return ConstraintsKt.m2500constrainHeightK40F9xA(m368getTargetConstraintsOenEA2s, measurable.maxIntrinsicHeight(i));
    }

    public boolean equals(Object other) {
        if (!(other instanceof SizeModifier)) {
            return false;
        }
        SizeModifier sizeModifier = (SizeModifier) other;
        return Dp.m2509equalsimpl0(this.minWidth, sizeModifier.minWidth) && Dp.m2509equalsimpl0(this.minHeight, sizeModifier.minHeight) && Dp.m2509equalsimpl0(this.maxWidth, sizeModifier.maxWidth) && Dp.m2509equalsimpl0(this.maxHeight, sizeModifier.maxHeight) && this.enforceIncoming == sizeModifier.enforceIncoming;
    }

    public int hashCode() {
        return ((((((Dp.m2510hashCodeimpl(this.minWidth) * 31) + Dp.m2510hashCodeimpl(this.minHeight)) * 31) + Dp.m2510hashCodeimpl(this.maxWidth)) * 31) + Dp.m2510hashCodeimpl(this.maxHeight)) * 31;
    }
}
