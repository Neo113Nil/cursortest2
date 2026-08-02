package squareup.cash.ui.arcade.elements;

import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ArcadeComponent$Component$ButtonCtaGroup extends CameraGraph$OperatingMode {
    public final ButtonCtaGroup value;

    public ArcadeComponent$Component$ButtonCtaGroup(ButtonCtaGroup buttonCtaGroup) {
        buttonCtaGroup.getClass();
        this.value = buttonCtaGroup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeComponent$Component$ButtonCtaGroup) && Intrinsics.areEqual(this.value, ((ArcadeComponent$Component$ButtonCtaGroup) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ButtonCtaGroup(value=" + this.value + ")";
    }
}
