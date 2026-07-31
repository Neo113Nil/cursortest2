package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BP\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u001c\u001a\u00020\u0019*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R)\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/foundation/layout/Direction;", "direction", "", "unbounded", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/IntOffset;", "alignmentCallback", "", "align", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "<init>", "(Landroidx/compose/foundation/layout/Direction;ZLkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/foundation/layout/Direction;", "Z", "Lkotlin/jvm/functions/Function2;", "Ljava/lang/Object;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
final class WrapContentModifier extends InspectorValueInfo implements LayoutModifier {
    private final Object align;
    private final Function2 alignmentCallback;
    private final Direction direction;
    private final boolean unbounded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentModifier(Direction direction, boolean z, Function2 alignmentCallback, Object align, Function1 inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(alignmentCallback, "alignmentCallback");
        Intrinsics.checkNotNullParameter(align, "align");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.direction = direction;
        this.unbounded = z;
        this.alignmentCallback = alignmentCallback;
        this.align = align;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo46measure3p2s80s(final MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Direction direction = this.direction;
        Direction direction2 = Direction.Vertical;
        int m2489getMinWidthimpl = direction != direction2 ? 0 : Constraints.m2489getMinWidthimpl(j);
        Direction direction3 = this.direction;
        Direction direction4 = Direction.Horizontal;
        final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(ConstraintsKt.Constraints(m2489getMinWidthimpl, (this.direction == direction2 || !this.unbounded) ? Constraints.m2487getMaxWidthimpl(j) : Integer.MAX_VALUE, direction3 == direction4 ? Constraints.m2488getMinHeightimpl(j) : 0, (this.direction == direction4 || !this.unbounded) ? Constraints.m2486getMaxHeightimpl(j) : Integer.MAX_VALUE));
        final int coerceIn = RangesKt.coerceIn(mo1944measureBRTryo0.getWidth(), Constraints.m2489getMinWidthimpl(j), Constraints.m2487getMaxWidthimpl(j));
        final int coerceIn2 = RangesKt.coerceIn(mo1944measureBRTryo0.getHeight(), Constraints.m2488getMinHeightimpl(j), Constraints.m2486getMaxHeightimpl(j));
        return MeasureScope.layout$default(measure, coerceIn, coerceIn2, null, new Function1() { // from class: androidx.compose.foundation.layout.WrapContentModifier$measure$1
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
                Function2 function2;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                function2 = WrapContentModifier.this.alignmentCallback;
                Placeable.PlacementScope.m1961place70tqf50$default(layout, mo1944measureBRTryo0, ((IntOffset) function2.invoke(IntSize.m2562boximpl(IntSizeKt.IntSize(coerceIn - mo1944measureBRTryo0.getWidth(), coerceIn2 - mo1944measureBRTryo0.getHeight())), measure.getLayoutDirection())).getPackedValue(), 0.0f, 2, null);
            }
        }, 4, null);
    }

    public boolean equals(Object other) {
        if (!(other instanceof WrapContentModifier)) {
            return false;
        }
        WrapContentModifier wrapContentModifier = (WrapContentModifier) other;
        return this.direction == wrapContentModifier.direction && this.unbounded == wrapContentModifier.unbounded && Intrinsics.areEqual(this.align, wrapContentModifier.align);
    }

    public int hashCode() {
        return (((this.direction.hashCode() * 31) + Boolean.hashCode(this.unbounded)) * 31) + this.align.hashCode();
    }
}
