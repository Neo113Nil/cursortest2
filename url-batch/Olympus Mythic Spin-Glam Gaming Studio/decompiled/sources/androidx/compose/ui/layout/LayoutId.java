package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LayoutId.kt */
@Immutable
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\u0004*\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/layout/LayoutId;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/layout/LayoutIdParentData;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "", "layoutId", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/unit/Density;", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getLayoutId", "()Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
final class LayoutId extends InspectorValueInfo implements ParentDataModifier, LayoutIdParentData {
    private final Object layoutId;

    @Override // androidx.compose.ui.layout.ParentDataModifier
    public Object modifyParentData(Density density, Object obj) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        return this;
    }

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    public Object getLayoutId() {
        return this.layoutId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutId(Object layoutId, Function1 inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(layoutId, "layoutId");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.layoutId = layoutId;
    }

    public int hashCode() {
        return getLayoutId().hashCode();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        LayoutId layoutId = other instanceof LayoutId ? (LayoutId) other : null;
        if (layoutId == null) {
            return false;
        }
        return Intrinsics.areEqual(getLayoutId(), layoutId.getLayoutId());
    }

    public String toString() {
        return "LayoutId(id=" + getLayoutId() + ')';
    }
}
