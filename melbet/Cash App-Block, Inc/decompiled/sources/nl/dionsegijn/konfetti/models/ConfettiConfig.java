package nl.dionsegijn.konfetti.models;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;

/* loaded from: classes8.dex */
public final class ConfettiConfig {
    public boolean fadeOut;
    public long timeToLive;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfettiConfig)) {
            return false;
        }
        ConfettiConfig confettiConfig = (ConfettiConfig) obj;
        return this.fadeOut == confettiConfig.fadeOut && this.timeToLive == confettiConfig.timeToLive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        boolean z = this.fadeOut;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return ((Long.hashCode(0L) + ((((((Long.hashCode(this.timeToLive) + (r0 * 31)) * 31) + 1) * 31) + 1) * 31)) * 31) + 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfettiConfig(fadeOut=");
        sb.append(this.fadeOut);
        sb.append(", timeToLive=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.timeToLive, ", rotate=true, accelerate=true, delay=0, speedDensityIndependent=true)", sb);
    }
}
