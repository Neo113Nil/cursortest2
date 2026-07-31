package androidx.compose.ui.layout;

import androidx.compose.ui.platform.InspectorValueInfo;
import com.ironsource.Y3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnGloballyPositionedModifier.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedModifierImpl;", "Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "callback", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectorInfo", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", Y3.f, "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class OnGloballyPositionedModifierImpl extends InspectorValueInfo implements OnGloballyPositionedModifier {
    private final Function1 callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnGloballyPositionedModifierImpl(Function1 callback, Function1 inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.callback = callback;
    }

    @Override // androidx.compose.ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.callback.invoke(coordinates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof OnGloballyPositionedModifierImpl) {
            return Intrinsics.areEqual(this.callback, ((OnGloballyPositionedModifierImpl) other).callback);
        }
        return false;
    }

    public int hashCode() {
        return this.callback.hashCode();
    }
}
