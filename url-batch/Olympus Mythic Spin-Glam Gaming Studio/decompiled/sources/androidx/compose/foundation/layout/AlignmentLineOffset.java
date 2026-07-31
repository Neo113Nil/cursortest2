package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlignmentLine.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002J)\u0010\u000b\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u00020\u001c8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010!\u001a\u00020\u001c8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 \u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetTextUnit;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLine", "()Landroidx/compose/ui/layout/AlignmentLine;", "Landroidx/compose/ui/unit/TextUnit;", "before", "J", "getBefore-XSAIIZE", "()J", "after", "getAfter-XSAIIZE", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.AlignmentLineOffsetTextUnit, reason: from toString */
/* loaded from: classes5.dex */
final class AlignmentLineOffset extends InspectorValueInfo implements LayoutModifier {
    private final long after;
    private final AlignmentLine alignmentLine;
    private final long before;

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo46measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        MeasureResult m294alignmentLineOffsetMeasuretjqqzMA;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        m294alignmentLineOffsetMeasuretjqqzMA = AlignmentLineKt.m294alignmentLineOffsetMeasuretjqqzMA(measure, this.alignmentLine, !TextUnitKt.m2587isUnspecifiedR2X_6o(this.before) ? measure.mo266toDpGaN1DYA(this.before) : Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM(), !TextUnitKt.m2587isUnspecifiedR2X_6o(this.after) ? measure.mo266toDpGaN1DYA(this.after) : Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM(), measurable, j);
        return m294alignmentLineOffsetMeasuretjqqzMA;
    }

    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + TextUnit.m2580hashCodeimpl(this.before)) * 31) + TextUnit.m2580hashCodeimpl(this.after);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        AlignmentLineOffset alignmentLineOffset = other instanceof AlignmentLineOffset ? (AlignmentLineOffset) other : null;
        if (alignmentLineOffset == null) {
            return false;
        }
        return Intrinsics.areEqual(this.alignmentLine, alignmentLineOffset.alignmentLine) && TextUnit.m2576equalsimpl0(this.before, alignmentLineOffset.before) && TextUnit.m2576equalsimpl0(this.after, alignmentLineOffset.after);
    }

    public String toString() {
        return "AlignmentLineOffset(alignmentLine=" + this.alignmentLine + ", before=" + ((Object) TextUnit.m2581toStringimpl(this.before)) + ", after=" + ((Object) TextUnit.m2581toStringimpl(this.after)) + ')';
    }
}
