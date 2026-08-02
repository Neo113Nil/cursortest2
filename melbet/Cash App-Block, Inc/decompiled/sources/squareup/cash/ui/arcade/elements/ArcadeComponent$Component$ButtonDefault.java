package squareup.cash.ui.arcade.elements;

import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ArcadeComponent$Component$ButtonDefault extends CameraGraph$OperatingMode {
    public final ButtonDefault value;

    public ArcadeComponent$Component$ButtonDefault(ButtonDefault buttonDefault) {
        buttonDefault.getClass();
        this.value = buttonDefault;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeComponent$Component$ButtonDefault) && Intrinsics.areEqual(this.value, ((ArcadeComponent$Component$ButtonDefault) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ButtonDefault(value=" + this.value + ")";
    }
}
