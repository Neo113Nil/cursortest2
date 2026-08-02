package squareup.cash.ui.arcade.elements;

import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ArcadeComponent$Component$HeroNumericsHeader extends CameraGraph$OperatingMode {
    public final HeroNumericsHeader value;

    public ArcadeComponent$Component$HeroNumericsHeader(HeroNumericsHeader heroNumericsHeader) {
        heroNumericsHeader.getClass();
        this.value = heroNumericsHeader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeComponent$Component$HeroNumericsHeader) && Intrinsics.areEqual(this.value, ((ArcadeComponent$Component$HeroNumericsHeader) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "HeroNumericsHeader(value=" + this.value + ")";
    }
}
