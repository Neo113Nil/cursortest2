package p000createpolar;

import android.graphics.RenderEffect;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageR8PrimeEclipseNebula8580 {
    public final int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final float PolarVoyageKotlinBetaPulseBeta3653;
    public final float PolarVoyageMotionLayoutTransitionHeroVision4068;
    public RenderEffect PolarVoyageZipVortexCelestial6185;

    public PolarVoyageR8PrimeEclipseNebula8580(float f, float f2, int i) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = f;
        this.PolarVoyageKotlinBetaPulseBeta3653 = f2;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i;
    }

    public final RenderEffect PolarVoyageZipVortexCelestial6185() {
        RenderEffect renderEffect = this.PolarVoyageZipVortexCelestial6185;
        if (renderEffect == null) {
            float f = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            float f2 = this.PolarVoyageKotlinBetaPulseBeta3653;
            renderEffect = (f == 0.0f && f2 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f, f2, PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageToolbarEclipseInfernoHero6368(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767));
            this.PolarVoyageZipVortexCelestial6185 = renderEffect;
        }
        return renderEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolarVoyageR8PrimeEclipseNebula8580)) {
            return false;
        }
        PolarVoyageR8PrimeEclipseNebula8580 polarVoyageR8PrimeEclipseNebula8580 = (PolarVoyageR8PrimeEclipseNebula8580) obj;
        return this.PolarVoyageMotionLayoutTransitionHeroVision4068 == polarVoyageR8PrimeEclipseNebula8580.PolarVoyageMotionLayoutTransitionHeroVision4068 && this.PolarVoyageKotlinBetaPulseBeta3653 == polarVoyageR8PrimeEclipseNebula8580.PolarVoyageKotlinBetaPulseBeta3653 && this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == polarVoyageR8PrimeEclipseNebula8580.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    }

    public final int hashCode() {
        return Integer.hashCode(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767) + PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageKotlinBetaPulseBeta3653, Float.hashCode(this.PolarVoyageMotionLayoutTransitionHeroVision4068) * 31, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.PolarVoyageMotionLayoutTransitionHeroVision4068 + ", radiusY=" + this.PolarVoyageKotlinBetaPulseBeta3653 + ", edgeTreatment=" + ((Object) PolarVoyageDebugStrikeHyper9028.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767)) + ')';
    }
}
