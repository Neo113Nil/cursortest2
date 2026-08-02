package squareup.cash.ui.arcade.elements;

import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ArcadeComponent$Component$ActionableButtonCtaGroup extends CameraGraph$OperatingMode {
    public final ActionableButtonCtaGroup value;

    public ArcadeComponent$Component$ActionableButtonCtaGroup(ActionableButtonCtaGroup actionableButtonCtaGroup) {
        actionableButtonCtaGroup.getClass();
        this.value = actionableButtonCtaGroup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeComponent$Component$ActionableButtonCtaGroup) && Intrinsics.areEqual(this.value, ((ArcadeComponent$Component$ActionableButtonCtaGroup) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ActionableButtonCtaGroup(value=" + this.value + ")";
    }
}
