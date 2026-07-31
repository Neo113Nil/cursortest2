package androidx.compose.ui.layout;

import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LayoutModifier.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B>\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR2\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00038\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/ui/layout/LayoutModifierImpl;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measureBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "<init>", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "measurable", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function3;", "getMeasureBlock", "()Lkotlin/jvm/functions/Function3;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class LayoutModifierImpl extends InspectorValueInfo implements LayoutModifier {
    private final Function3 measureBlock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutModifierImpl(Function3 measureBlock, Function1 inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(measureBlock, "measureBlock");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.measureBlock = measureBlock;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo46measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return (MeasureResult) this.measureBlock.invoke(measure, measurable, Constraints.m2475boximpl(j));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        LayoutModifierImpl layoutModifierImpl = other instanceof LayoutModifierImpl ? (LayoutModifierImpl) other : null;
        if (layoutModifierImpl == null) {
            return false;
        }
        return Intrinsics.areEqual(this.measureBlock, layoutModifierImpl.measureBlock);
    }

    public int hashCode() {
        return this.measureBlock.hashCode();
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.measureBlock + ')';
    }
}
