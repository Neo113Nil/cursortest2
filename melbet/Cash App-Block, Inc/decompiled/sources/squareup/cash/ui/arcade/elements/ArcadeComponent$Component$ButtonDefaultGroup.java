package squareup.cash.ui.arcade.elements;

import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ArcadeComponent$Component$ButtonDefaultGroup extends CameraGraph$OperatingMode {
    public final ButtonDefaultGroup value;

    public ArcadeComponent$Component$ButtonDefaultGroup(ButtonDefaultGroup buttonDefaultGroup) {
        buttonDefaultGroup.getClass();
        this.value = buttonDefaultGroup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeComponent$Component$ButtonDefaultGroup) && Intrinsics.areEqual(this.value, ((ArcadeComponent$Component$ButtonDefaultGroup) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ButtonDefaultGroup(value=" + this.value + ")";
    }
}
