package squareup.cash.ui.arcade.elements;

import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ArcadeComponent$Component$ListOrdered extends CameraGraph$OperatingMode {
    public final ListOrdered value;

    public ArcadeComponent$Component$ListOrdered(ListOrdered listOrdered) {
        listOrdered.getClass();
        this.value = listOrdered;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeComponent$Component$ListOrdered) && Intrinsics.areEqual(this.value, ((ArcadeComponent$Component$ListOrdered) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ListOrdered(value=" + this.value + ")";
    }
}
