package p000createpolar;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageCameraRogueCosmosPhoenix1977 {
    public Object PolarVoyageBottomSheetOmegaNeo1907;
    public int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageCameraRogueCosmosPhoenix1977() {
        if (PolarVoyageConstraintLayoutVisionMasterDragon8646.PolarVoyageStrictModeLegendEpic1532 == null) {
            PolarVoyageConstraintLayoutVisionMasterDragon8646.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageConstraintLayoutVisionMasterDragon8646(8);
        }
    }

    public void PolarVoyageKotlinBetaPulseBeta3653() {
        while (true) {
            int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            PolarVoyageStateListAnimatorOmegaUltra5173 polarVoyageStateListAnimatorOmegaUltra5173 = (PolarVoyageStateListAnimatorOmegaUltra5173) this.PolarVoyageBottomSheetOmegaNeo1907;
            if (i >= polarVoyageStateListAnimatorOmegaUltra5173.PolarVoyageCameraPixelBlaze2629 || polarVoyageStateListAnimatorOmegaUltra5173.PolarVoyageRotateAnimationCyberCelestialDelta4768[i] >= 0) {
                return;
            } else {
                this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i + 1;
            }
        }
    }

    public void PolarVoyageMotionLayoutTransitionHeroVision4068() {
        if (((PolarVoyageStateListAnimatorOmegaUltra5173) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageSnackbarGammaEclipse2140 == this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            return;
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageBitmapVisionAuroraPixel4705();
    }

    public int PolarVoyageZipVortexCelestial6185(int i) {
        if (i < this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            return ((ByteBuffer) this.PolarVoyageBottomSheetOmegaNeo1907).getShort(this.PolarVoyageStrictModeLegendEpic1532 + i);
        }
        return 0;
    }

    public boolean hasNext() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485 < ((PolarVoyageStateListAnimatorOmegaUltra5173) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageCameraPixelBlaze2629;
    }

    public void remove() {
        PolarVoyageStateListAnimatorOmegaUltra5173 polarVoyageStateListAnimatorOmegaUltra5173 = (PolarVoyageStateListAnimatorOmegaUltra5173) this.PolarVoyageBottomSheetOmegaNeo1907;
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        if (this.PolarVoyageStrictModeLegendEpic1532 == -1) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Call next() before removing element from the iterator.");
            return;
        }
        polarVoyageStateListAnimatorOmegaUltra5173.PolarVoyageMotionLayoutTransitionHeroVision4068();
        polarVoyageStateListAnimatorOmegaUltra5173.PolarVoyageRotateAnimationCyberCelestialDelta4768(this.PolarVoyageStrictModeLegendEpic1532);
        this.PolarVoyageStrictModeLegendEpic1532 = -1;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageStateListAnimatorOmegaUltra5173.PolarVoyageSnackbarGammaEclipse2140;
    }
}
