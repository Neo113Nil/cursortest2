package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u0010*\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightImpl;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "", "weight", "", "fill", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "<init>", "(FZLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/unit/Density;", "", "parentData", "Landroidx/compose/foundation/layout/RowColumnParentData;", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Landroidx/compose/foundation/layout/RowColumnParentData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "getWeight", "()F", "Z", "getFill", "()Z", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LayoutWeightImpl extends InspectorValueInfo implements ParentDataModifier {
    private final boolean fill;
    private final float weight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutWeightImpl(float f, boolean z, Function1 inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.weight = f;
        this.fill = z;
    }

    @Override // androidx.compose.ui.layout.ParentDataModifier
    public RowColumnParentData modifyParentData(Density density, Object obj) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, 7, null);
        }
        rowColumnParentData.setWeight(this.weight);
        rowColumnParentData.setFill(this.fill);
        return rowColumnParentData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        LayoutWeightImpl layoutWeightImpl = other instanceof LayoutWeightImpl ? (LayoutWeightImpl) other : null;
        if (layoutWeightImpl == null) {
            return false;
        }
        return this.weight == layoutWeightImpl.weight && this.fill == layoutWeightImpl.fill;
    }

    public int hashCode() {
        return (Float.hashCode(this.weight) * 31) + Boolean.hashCode(this.fill);
    }

    public String toString() {
        return "LayoutWeightImpl(weight=" + this.weight + ", fill=" + this.fill + ')';
    }
}
