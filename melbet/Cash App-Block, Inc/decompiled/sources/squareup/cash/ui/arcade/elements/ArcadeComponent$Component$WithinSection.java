package squareup.cash.ui.arcade.elements;

import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ArcadeComponent$Component$WithinSection extends CameraGraph$OperatingMode {
    public final WithinSection value;

    public ArcadeComponent$Component$WithinSection(WithinSection withinSection) {
        withinSection.getClass();
        this.value = withinSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeComponent$Component$WithinSection) && Intrinsics.areEqual(this.value, ((ArcadeComponent$Component$WithinSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "WithinSection(value=" + this.value + ")";
    }
}
