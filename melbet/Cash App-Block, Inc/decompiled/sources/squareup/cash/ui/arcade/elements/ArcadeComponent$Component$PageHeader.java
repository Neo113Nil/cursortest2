package squareup.cash.ui.arcade.elements;

import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ArcadeComponent$Component$PageHeader extends CameraGraph$OperatingMode {
    public final PageHeader value;

    public ArcadeComponent$Component$PageHeader(PageHeader pageHeader) {
        pageHeader.getClass();
        this.value = pageHeader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeComponent$Component$PageHeader) && Intrinsics.areEqual(this.value, ((ArcadeComponent$Component$PageHeader) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PageHeader(value=" + this.value + ")";
    }
}
