package nl.dionsegijn.konfetti.core;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;

/* loaded from: classes9.dex */
public final class Rotation {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Rotation) && Float.compare(1.0f, 1.0f) == 0 && Float.compare(0.5f, 0.5f) == 0 && Float.compare(8.0f, 8.0f) == 0 && Float.compare(1.5f, 1.5f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(1.5f) + CameraState$Type$EnumUnboxingLocalUtility.m(8.0f, CameraState$Type$EnumUnboxingLocalUtility.m(0.5f, CameraState$Type$EnumUnboxingLocalUtility.m(1.0f, 31, 31), 31), 31);
    }

    public final String toString() {
        return "Rotation(enabled=true, speed=1.0, variance=0.5, multiplier2D=8.0, multiplier3D=1.5)";
    }
}
