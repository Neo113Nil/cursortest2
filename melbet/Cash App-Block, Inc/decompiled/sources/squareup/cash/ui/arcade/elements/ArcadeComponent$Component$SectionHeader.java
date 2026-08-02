package squareup.cash.ui.arcade.elements;

import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ArcadeComponent$Component$SectionHeader extends CameraGraph$OperatingMode {
    public final SectionHeader value;

    public ArcadeComponent$Component$SectionHeader(SectionHeader sectionHeader) {
        sectionHeader.getClass();
        this.value = sectionHeader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeComponent$Component$SectionHeader) && Intrinsics.areEqual(this.value, ((ArcadeComponent$Component$SectionHeader) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SectionHeader(value=" + this.value + ")";
    }
}
