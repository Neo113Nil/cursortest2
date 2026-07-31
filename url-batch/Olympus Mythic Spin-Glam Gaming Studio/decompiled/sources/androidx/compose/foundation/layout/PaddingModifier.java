package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Padding.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BN\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0018\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R \u0010\u0005\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\"R \u0010\u0006\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\"R \u0010\u0007\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b%\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/layout/PaddingModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/unit/Dp;", "start", ViewHierarchyConstants.DIMENSION_TOP_KEY, "end", "bottom", "", "rtlAware", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "<init>", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "F", "getStart-D9Ej5fM", "()F", "getTop-D9Ej5fM", "getEnd-D9Ej5fM", "getBottom-D9Ej5fM", "Z", "getRtlAware", "()Z", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
final class PaddingModifier extends InspectorValueInfo implements LayoutModifier {
    private final float bottom;
    private final float end;
    private final boolean rtlAware;
    private final float start;
    private final float top;

    public /* synthetic */ PaddingModifier(float f, float f2, float f3, float f4, boolean z, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z, function1);
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStart() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTop() {
        return this.top;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    private PaddingModifier(float f, float f2, float f3, float f4, boolean z, Function1 function1) {
        super(function1);
        this.start = f;
        this.top = f2;
        this.end = f3;
        this.bottom = f4;
        this.rtlAware = z;
        if ((f < 0.0f && !Dp.m2509equalsimpl0(f, Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM())) || ((f2 < 0.0f && !Dp.m2509equalsimpl0(f2, Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM())) || ((f3 < 0.0f && !Dp.m2509equalsimpl0(f3, Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM())) || (f4 < 0.0f && !Dp.m2509equalsimpl0(f4, Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM()))))) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo46measure3p2s80s(final MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        int mo265roundToPx0680j_4 = measure.mo265roundToPx0680j_4(this.start) + measure.mo265roundToPx0680j_4(this.end);
        int mo265roundToPx0680j_42 = measure.mo265roundToPx0680j_4(this.top) + measure.mo265roundToPx0680j_4(this.bottom);
        final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(ConstraintsKt.m2503offsetNN6EwU(j, -mo265roundToPx0680j_4, -mo265roundToPx0680j_42));
        return MeasureScope.layout$default(measure, ConstraintsKt.m2501constrainWidthK40F9xA(j, mo1944measureBRTryo0.getWidth() + mo265roundToPx0680j_4), ConstraintsKt.m2500constrainHeightK40F9xA(j, mo1944measureBRTryo0.getHeight() + mo265roundToPx0680j_42), null, new Function1() { // from class: androidx.compose.foundation.layout.PaddingModifier$measure$1
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
                if (PaddingModifier.this.getRtlAware()) {
                    Placeable.PlacementScope.placeRelative$default(layout, mo1944measureBRTryo0, measure.mo265roundToPx0680j_4(PaddingModifier.this.getStart()), measure.mo265roundToPx0680j_4(PaddingModifier.this.getTop()), 0.0f, 4, null);
                } else {
                    Placeable.PlacementScope.place$default(layout, mo1944measureBRTryo0, measure.mo265roundToPx0680j_4(PaddingModifier.this.getStart()), measure.mo265roundToPx0680j_4(PaddingModifier.this.getTop()), 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    public int hashCode() {
        return (((((((Dp.m2510hashCodeimpl(this.start) * 31) + Dp.m2510hashCodeimpl(this.top)) * 31) + Dp.m2510hashCodeimpl(this.end)) * 31) + Dp.m2510hashCodeimpl(this.bottom)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    public boolean equals(Object other) {
        PaddingModifier paddingModifier = other instanceof PaddingModifier ? (PaddingModifier) other : null;
        return paddingModifier != null && Dp.m2509equalsimpl0(this.start, paddingModifier.start) && Dp.m2509equalsimpl0(this.top, paddingModifier.top) && Dp.m2509equalsimpl0(this.end, paddingModifier.end) && Dp.m2509equalsimpl0(this.bottom, paddingModifier.bottom) && this.rtlAware == paddingModifier.rtlAware;
    }
}
