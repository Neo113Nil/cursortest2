package squareup.cash.ui.arcade.elements;

import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ArcadeComponent$Component$CellDefault extends CameraGraph$OperatingMode {
    public final CellDefault value;

    public ArcadeComponent$Component$CellDefault(CellDefault cellDefault) {
        cellDefault.getClass();
        this.value = cellDefault;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeComponent$Component$CellDefault) && Intrinsics.areEqual(this.value, ((ArcadeComponent$Component$CellDefault) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CellDefault(value=" + this.value + ")";
    }
}
