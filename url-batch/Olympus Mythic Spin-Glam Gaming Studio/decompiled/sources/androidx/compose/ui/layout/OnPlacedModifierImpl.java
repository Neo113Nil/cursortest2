package androidx.compose.ui.layout;

import androidx.compose.ui.platform.InspectorValueInfo;
import com.ironsource.Y3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnPlacedModifier.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/layout/OnPlacedModifierImpl;", "Landroidx/compose/ui/layout/OnPlacedModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/layout/LayoutCoordinates;", Y3.f, "", "onPlaced", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/Function1;", "callback", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnPlacedModifierImpl extends InspectorValueInfo implements OnPlacedModifier {
    private final Function1 callback;

    @Override // androidx.compose.ui.layout.OnPlacedModifier
    public void onPlaced(LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.callback.invoke(coordinates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof OnPlacedModifierImpl) {
            return Intrinsics.areEqual(this.callback, ((OnPlacedModifierImpl) other).callback);
        }
        return false;
    }

    public int hashCode() {
        return this.callback.hashCode();
    }
}
