package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePagingDataNovaEpic6132 extends PolarVoyageBannerAdAuroraGamma9142 {
    public float PolarVoyageMotionLayoutTransitionHeroVision4068;
    public float PolarVoyageZipVortexCelestial6185;

    public PolarVoyagePagingDataNovaEpic6132(float f, float f2) {
        this.PolarVoyageZipVortexCelestial6185 = f;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = f2;
    }

    @Override // p000createpolar.PolarVoyageBannerAdAuroraGamma9142
    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        this.PolarVoyageZipVortexCelestial6185 = 0.0f;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = 0.0f;
    }

    @Override // p000createpolar.PolarVoyageBannerAdAuroraGamma9142
    public final void PolarVoyageBitmapVisionAuroraPixel4705(float f, int i) {
        if (i == 0) {
            this.PolarVoyageZipVortexCelestial6185 = f;
        } else {
            if (i != 1) {
                return;
            }
            this.PolarVoyageMotionLayoutTransitionHeroVision4068 = f;
        }
    }

    @Override // p000createpolar.PolarVoyageBannerAdAuroraGamma9142
    public final PolarVoyageBannerAdAuroraGamma9142 PolarVoyageKotlinBetaPulseBeta3653() {
        return new PolarVoyagePagingDataNovaEpic6132(0.0f, 0.0f);
    }

    @Override // p000createpolar.PolarVoyageBannerAdAuroraGamma9142
    public final int PolarVoyageMotionLayoutTransitionHeroVision4068() {
        return 2;
    }

    @Override // p000createpolar.PolarVoyageBannerAdAuroraGamma9142
    public final float PolarVoyageZipVortexCelestial6185(int i) {
        if (i == 0) {
            return this.PolarVoyageZipVortexCelestial6185;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.PolarVoyageMotionLayoutTransitionHeroVision4068;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PolarVoyagePagingDataNovaEpic6132)) {
            return false;
        }
        PolarVoyagePagingDataNovaEpic6132 polarVoyagePagingDataNovaEpic6132 = (PolarVoyagePagingDataNovaEpic6132) obj;
        return polarVoyagePagingDataNovaEpic6132.PolarVoyageZipVortexCelestial6185 == this.PolarVoyageZipVortexCelestial6185 && polarVoyagePagingDataNovaEpic6132.PolarVoyageMotionLayoutTransitionHeroVision4068 == this.PolarVoyageMotionLayoutTransitionHeroVision4068;
    }

    public final int hashCode() {
        return Float.hashCode(this.PolarVoyageMotionLayoutTransitionHeroVision4068) + (Float.hashCode(this.PolarVoyageZipVortexCelestial6185) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.PolarVoyageZipVortexCelestial6185 + ", v2 = " + this.PolarVoyageMotionLayoutTransitionHeroVision4068;
    }
}
