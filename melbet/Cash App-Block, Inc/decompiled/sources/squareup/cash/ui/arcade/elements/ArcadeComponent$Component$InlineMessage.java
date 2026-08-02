package squareup.cash.ui.arcade.elements;

import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ArcadeComponent$Component$InlineMessage extends CameraGraph$OperatingMode {
    public final InlineMessage value;

    public ArcadeComponent$Component$InlineMessage(InlineMessage inlineMessage) {
        inlineMessage.getClass();
        this.value = inlineMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeComponent$Component$InlineMessage) && Intrinsics.areEqual(this.value, ((ArcadeComponent$Component$InlineMessage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "InlineMessage(value=" + this.value + ")";
    }
}
