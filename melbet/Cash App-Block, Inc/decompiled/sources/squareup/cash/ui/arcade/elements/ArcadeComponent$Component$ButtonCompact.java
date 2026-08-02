package squareup.cash.ui.arcade.elements;

import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ArcadeComponent$Component$ButtonCompact extends CameraGraph$OperatingMode {
    public final ButtonCompact value;

    public ArcadeComponent$Component$ButtonCompact(ButtonCompact buttonCompact) {
        buttonCompact.getClass();
        this.value = buttonCompact;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeComponent$Component$ButtonCompact) && Intrinsics.areEqual(this.value, ((ArcadeComponent$Component$ButtonCompact) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ButtonCompact(value=" + this.value + ")";
    }
}
