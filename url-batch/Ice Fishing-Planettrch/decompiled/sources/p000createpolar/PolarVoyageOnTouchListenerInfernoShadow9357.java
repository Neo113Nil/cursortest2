package p000createpolar;

import android.media.AudioAttributes;
import android.os.Build;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageOnTouchListenerInfernoShadow9357 {
    public static final PolarVoyageOnTouchListenerInfernoShadow9357 PolarVoyageMotionLayoutTransitionHeroVision4068 = new PolarVoyageOnTouchListenerInfernoShadow9357();
    public AudioAttributes PolarVoyageZipVortexCelestial6185;

    static {
        PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageAnimatorSetSparkUltraMax8233(0, 1, 2, 3, 4);
        PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageMotionLayoutForceEpicAurora7183(5);
        PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageMotionLayoutForceEpicAurora7183(6);
    }

    public final AudioAttributes PolarVoyageZipVortexCelestial6185() {
        if (this.PolarVoyageZipVortexCelestial6185 == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                usage.setAllowedCapturePolicy(1);
                usage.setHapticChannelsMuted(true);
            }
            if (i >= 32) {
                usage.setSpatializationBehavior(0);
                usage.setIsContentSpatialized(false);
            }
            this.PolarVoyageZipVortexCelestial6185 = usage.build();
        }
        return this.PolarVoyageZipVortexCelestial6185;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PolarVoyageOnTouchListenerInfernoShadow9357.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -436042064;
    }
}
