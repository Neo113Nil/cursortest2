package squareup.cash.ui.arcade.elements;

import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ArcadeComponent$Component$ActionableButtonDefault extends CameraGraph$OperatingMode {
    public final ActionableButtonDefault value;

    public ArcadeComponent$Component$ActionableButtonDefault(ActionableButtonDefault actionableButtonDefault) {
        actionableButtonDefault.getClass();
        this.value = actionableButtonDefault;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeComponent$Component$ActionableButtonDefault) && Intrinsics.areEqual(this.value, ((ArcadeComponent$Component$ActionableButtonDefault) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ActionableButtonDefault(value=" + this.value + ")";
    }
}
