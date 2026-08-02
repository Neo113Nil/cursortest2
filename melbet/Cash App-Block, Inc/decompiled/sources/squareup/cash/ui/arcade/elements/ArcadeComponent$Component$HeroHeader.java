package squareup.cash.ui.arcade.elements;

import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ArcadeComponent$Component$HeroHeader extends CameraGraph$OperatingMode {
    public final HeroHeader value;

    public ArcadeComponent$Component$HeroHeader(HeroHeader heroHeader) {
        heroHeader.getClass();
        this.value = heroHeader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeComponent$Component$HeroHeader) && Intrinsics.areEqual(this.value, ((ArcadeComponent$Component$HeroHeader) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "HeroHeader(value=" + this.value + ")";
    }
}
