package squareup.cash.ui.arcade.elements;

import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ArcadeComponent$Component$RemoteImage extends CameraGraph$OperatingMode {
    public final RemoteImage value;

    public ArcadeComponent$Component$RemoteImage(RemoteImage remoteImage) {
        remoteImage.getClass();
        this.value = remoteImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeComponent$Component$RemoteImage) && Intrinsics.areEqual(this.value, ((ArcadeComponent$Component$RemoteImage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RemoteImage(value=" + this.value + ")";
    }
}
