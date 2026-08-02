package squareup.cash.ui.arcade.elements;

import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ArcadeComponent$Component$BetweenSection extends CameraGraph$OperatingMode {
    public final BetweenSection value;

    public ArcadeComponent$Component$BetweenSection(BetweenSection betweenSection) {
        betweenSection.getClass();
        this.value = betweenSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeComponent$Component$BetweenSection) && Intrinsics.areEqual(this.value, ((ArcadeComponent$Component$BetweenSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BetweenSection(value=" + this.value + ")";
    }
}
