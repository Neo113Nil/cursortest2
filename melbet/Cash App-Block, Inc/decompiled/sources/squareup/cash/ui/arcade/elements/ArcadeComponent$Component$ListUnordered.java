package squareup.cash.ui.arcade.elements;

import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ArcadeComponent$Component$ListUnordered extends CameraGraph$OperatingMode {
    public final ListUnordered value;

    public ArcadeComponent$Component$ListUnordered(ListUnordered listUnordered) {
        listUnordered.getClass();
        this.value = listUnordered;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeComponent$Component$ListUnordered) && Intrinsics.areEqual(this.value, ((ArcadeComponent$Component$ListUnordered) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ListUnordered(value=" + this.value + ")";
    }
}
