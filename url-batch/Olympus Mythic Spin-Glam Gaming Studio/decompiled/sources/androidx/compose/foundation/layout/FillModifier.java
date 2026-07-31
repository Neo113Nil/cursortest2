package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0015\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/FillModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/foundation/layout/Direction;", "direction", "", "fraction", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "<init>", "(Landroidx/compose/foundation/layout/Direction;FLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/foundation/layout/Direction;", "F", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
final class FillModifier extends InspectorValueInfo implements LayoutModifier {
    private final Direction direction;
    private final float fraction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FillModifier(Direction direction, float f, Function1 inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.direction = direction;
        this.fraction = f;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo46measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        int m2489getMinWidthimpl;
        int m2487getMaxWidthimpl;
        int m2486getMaxHeightimpl;
        int i;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (Constraints.m2483getHasBoundedWidthimpl(j) && this.direction != Direction.Vertical) {
            m2489getMinWidthimpl = RangesKt.coerceIn(MathKt.roundToInt(Constraints.m2487getMaxWidthimpl(j) * this.fraction), Constraints.m2489getMinWidthimpl(j), Constraints.m2487getMaxWidthimpl(j));
            m2487getMaxWidthimpl = m2489getMinWidthimpl;
        } else {
            m2489getMinWidthimpl = Constraints.m2489getMinWidthimpl(j);
            m2487getMaxWidthimpl = Constraints.m2487getMaxWidthimpl(j);
        }
        if (Constraints.m2482getHasBoundedHeightimpl(j) && this.direction != Direction.Horizontal) {
            i = RangesKt.coerceIn(MathKt.roundToInt(Constraints.m2486getMaxHeightimpl(j) * this.fraction), Constraints.m2488getMinHeightimpl(j), Constraints.m2486getMaxHeightimpl(j));
            m2486getMaxHeightimpl = i;
        } else {
            int m2488getMinHeightimpl = Constraints.m2488getMinHeightimpl(j);
            m2486getMaxHeightimpl = Constraints.m2486getMaxHeightimpl(j);
            i = m2488getMinHeightimpl;
        }
        final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(ConstraintsKt.Constraints(m2489getMinWidthimpl, m2487getMaxWidthimpl, i, m2486getMaxHeightimpl));
        return MeasureScope.layout$default(measure, mo1944measureBRTryo0.getWidth(), mo1944measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.foundation.layout.FillModifier$measure$1
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

    public boolean equals(Object other) {
        if (other instanceof FillModifier) {
            FillModifier fillModifier = (FillModifier) other;
            if (this.direction == fillModifier.direction && this.fraction == fillModifier.fraction) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.direction.hashCode() * 31) + Float.hashCode(this.fraction);
    }
}
