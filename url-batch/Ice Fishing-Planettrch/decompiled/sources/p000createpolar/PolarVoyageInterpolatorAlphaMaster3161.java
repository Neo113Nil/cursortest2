package p000createpolar;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageInterpolatorAlphaMaster3161 {
    public static final LinkedHashMap PolarVoyageMotionLayoutTransitionHeroVision4068 = new LinkedHashMap();
    public final LinkedHashMap PolarVoyageZipVortexCelestial6185 = new LinkedHashMap();

    public final PolarVoyageWindowManagerSpectraSpark4068 PolarVoyageMotionLayoutTransitionHeroVision4068(String str) {
        str.getClass();
        if (str.length() <= 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("navigator name cannot be an empty string");
            return null;
        }
        PolarVoyageWindowManagerSpectraSpark4068 polarVoyageWindowManagerSpectraSpark4068 = (PolarVoyageWindowManagerSpectraSpark4068) this.PolarVoyageZipVortexCelestial6185.get(str);
        if (polarVoyageWindowManagerSpectraSpark4068 != null) {
            return polarVoyageWindowManagerSpectraSpark4068;
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageBottomSheetOmegaNeo1907("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }

    public final void PolarVoyageZipVortexCelestial6185(PolarVoyageWindowManagerSpectraSpark4068 polarVoyageWindowManagerSpectraSpark4068) {
        polarVoyageWindowManagerSpectraSpark4068.getClass();
        String PolarVoyageAnimatorSetSparkUltraMax8233 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyageWindowManagerSpectraSpark4068.getClass());
        if (PolarVoyageAnimatorSetSparkUltraMax8233.length() <= 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.PolarVoyageZipVortexCelestial6185;
        PolarVoyageWindowManagerSpectraSpark4068 polarVoyageWindowManagerSpectraSpark40682 = (PolarVoyageWindowManagerSpectraSpark4068) linkedHashMap.get(PolarVoyageAnimatorSetSparkUltraMax8233);
        if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageWindowManagerSpectraSpark40682, polarVoyageWindowManagerSpectraSpark4068)) {
            return;
        }
        if (polarVoyageWindowManagerSpectraSpark40682 != null && polarVoyageWindowManagerSpectraSpark40682.PolarVoyageMotionLayoutTransitionHeroVision4068) {
            PolarVoyageR8UltraEliteBeta8736.PolarVoyageBottomSheetOmegaNeo1907("Navigator ", polarVoyageWindowManagerSpectraSpark4068, " is replacing an already attached ", polarVoyageWindowManagerSpectraSpark40682);
        } else if (polarVoyageWindowManagerSpectraSpark4068.PolarVoyageMotionLayoutTransitionHeroVision4068) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageBottomSheetOmegaNeo1907("Navigator ", polarVoyageWindowManagerSpectraSpark4068, " is already attached to another NavController");
        }
    }
}
