package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageGuidelineMasterPrimeRogue8517 extends PolarVoyageBannerAdAuroraGamma9142 {
    public float PolarVoyageKotlinBetaPulseBeta3653;
    public float PolarVoyageMotionLayoutTransitionHeroVision4068;
    public float PolarVoyageZipVortexCelestial6185;

    public PolarVoyageGuidelineMasterPrimeRogue8517(float f, float f2, float f3) {
        this.PolarVoyageZipVortexCelestial6185 = f;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = f2;
        this.PolarVoyageKotlinBetaPulseBeta3653 = f3;
    }

    @Override // p000createpolar.PolarVoyageBannerAdAuroraGamma9142
    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        this.PolarVoyageZipVortexCelestial6185 = 0.0f;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = 0.0f;
        this.PolarVoyageKotlinBetaPulseBeta3653 = 0.0f;
    }

    @Override // p000createpolar.PolarVoyageBannerAdAuroraGamma9142
    public final void PolarVoyageBitmapVisionAuroraPixel4705(float f, int i) {
        if (i == 0) {
            this.PolarVoyageZipVortexCelestial6185 = f;
        } else if (i == 1) {
            this.PolarVoyageMotionLayoutTransitionHeroVision4068 = f;
        } else {
            if (i != 2) {
                return;
            }
            this.PolarVoyageKotlinBetaPulseBeta3653 = f;
        }
    }

    @Override // p000createpolar.PolarVoyageBannerAdAuroraGamma9142
    public final PolarVoyageBannerAdAuroraGamma9142 PolarVoyageKotlinBetaPulseBeta3653() {
        return new PolarVoyageGuidelineMasterPrimeRogue8517(0.0f, 0.0f, 0.0f);
    }

    @Override // p000createpolar.PolarVoyageBannerAdAuroraGamma9142
    public final int PolarVoyageMotionLayoutTransitionHeroVision4068() {
        return 3;
    }

    @Override // p000createpolar.PolarVoyageBannerAdAuroraGamma9142
    public final float PolarVoyageZipVortexCelestial6185(int i) {
        if (i == 0) {
            return this.PolarVoyageZipVortexCelestial6185;
        }
        if (i == 1) {
            return this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.PolarVoyageKotlinBetaPulseBeta3653;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PolarVoyageGuidelineMasterPrimeRogue8517)) {
            return false;
        }
        PolarVoyageGuidelineMasterPrimeRogue8517 polarVoyageGuidelineMasterPrimeRogue8517 = (PolarVoyageGuidelineMasterPrimeRogue8517) obj;
        return polarVoyageGuidelineMasterPrimeRogue8517.PolarVoyageZipVortexCelestial6185 == this.PolarVoyageZipVortexCelestial6185 && polarVoyageGuidelineMasterPrimeRogue8517.PolarVoyageMotionLayoutTransitionHeroVision4068 == this.PolarVoyageMotionLayoutTransitionHeroVision4068 && polarVoyageGuidelineMasterPrimeRogue8517.PolarVoyageKotlinBetaPulseBeta3653 == this.PolarVoyageKotlinBetaPulseBeta3653;
    }

    public final int hashCode() {
        return Float.hashCode(this.PolarVoyageKotlinBetaPulseBeta3653) + PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageMotionLayoutTransitionHeroVision4068, Float.hashCode(this.PolarVoyageZipVortexCelestial6185) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.PolarVoyageZipVortexCelestial6185 + ", v2 = " + this.PolarVoyageMotionLayoutTransitionHeroVision4068 + ", v3 = " + this.PolarVoyageKotlinBetaPulseBeta3653;
    }
}
