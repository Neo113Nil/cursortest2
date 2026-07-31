package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Offset.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B:\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0016\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntOffset;", "offset", "", "rtlAware", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "<init>", "(Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "getOffset", "()Lkotlin/jvm/functions/Function1;", "Z", "getRtlAware", "()Z", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
final class OffsetPxModifier extends InspectorValueInfo implements LayoutModifier {
    private final Function1 offset;
    private final boolean rtlAware;

    public final Function1 getOffset() {
        return this.offset;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffsetPxModifier(Function1 offset, boolean z, Function1 inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(offset, "offset");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.offset = offset;
        this.rtlAware = z;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo46measure3p2s80s(final MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(j);
        return MeasureScope.layout$default(measure, mo1944measureBRTryo0.getWidth(), mo1944measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.foundation.layout.OffsetPxModifier$measure$1
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
                long packedValue = ((IntOffset) OffsetPxModifier.this.getOffset().invoke(measure)).getPackedValue();
                if (OffsetPxModifier.this.getRtlAware()) {
                    Placeable.PlacementScope.placeRelativeWithLayer$default(layout, mo1944measureBRTryo0, IntOffset.m2553getXimpl(packedValue), IntOffset.m2554getYimpl(packedValue), 0.0f, null, 12, null);
                } else {
                    Placeable.PlacementScope.placeWithLayer$default(layout, mo1944measureBRTryo0, IntOffset.m2553getXimpl(packedValue), IntOffset.m2554getYimpl(packedValue), 0.0f, null, 12, null);
                }
            }
        }, 4, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        OffsetPxModifier offsetPxModifier = other instanceof OffsetPxModifier ? (OffsetPxModifier) other : null;
        if (offsetPxModifier == null) {
            return false;
        }
        return Intrinsics.areEqual(this.offset, offsetPxModifier.offset) && this.rtlAware == offsetPxModifier.rtlAware;
    }

    public int hashCode() {
        return (this.offset.hashCode() * 31) + Boolean.hashCode(this.rtlAware);
    }

    public String toString() {
        return "OffsetPxModifier(offset=" + this.offset + ", rtlAware=" + this.rtlAware + ')';
    }
}
