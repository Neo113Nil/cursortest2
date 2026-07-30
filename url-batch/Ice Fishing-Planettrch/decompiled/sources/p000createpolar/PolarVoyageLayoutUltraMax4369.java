package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLayoutUltraMax4369 implements PolarVoyageLiveDataScopeBetaSolar8471 {
    public final long PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final long PolarVoyageKotlinBetaPulseBeta3653;
    public final PolarVoyageConstraintSetCloneInfernoEliteDelta1883 PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final int PolarVoyageZipVortexCelestial6185;

    public PolarVoyageLayoutUltraMax4369(int i, int i2, PolarVoyageConstraintSetCloneInfernoEliteDelta1883 polarVoyageConstraintSetCloneInfernoEliteDelta1883) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageConstraintSetCloneInfernoEliteDelta1883;
        this.PolarVoyageKotlinBetaPulseBeta3653 = i * 1000000;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i2 * 1000000;
    }

    @Override // p000createpolar.PolarVoyageLiveDataScopeBetaSolar8471
    public final long PolarVoyageBarcodeScannerInfernoSolarSpark7767(float f, float f2, float f3) {
        return this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 + this.PolarVoyageKotlinBetaPulseBeta3653;
    }

    @Override // p000createpolar.PolarVoyageLiveDataScopeBetaSolar8471
    public final float PolarVoyageKotlinBetaPulseBeta3653(long j, float f, float f2, float f3) {
        long j2 = j - this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.PolarVoyageKotlinBetaPulseBeta3653;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (PolarVoyageMotionLayoutTransitionHeroVision4068(j4, f, f2, f3) - PolarVoyageMotionLayoutTransitionHeroVision4068(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // p000createpolar.PolarVoyageLiveDataScopeBetaSolar8471
    public final float PolarVoyageMotionLayoutTransitionHeroVision4068(long j, float f, float f2, float f3) {
        long j2 = j - this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.PolarVoyageKotlinBetaPulseBeta3653;
        if (j2 > j3) {
            j2 = j3;
        }
        float PolarVoyageMotionLayoutTransitionHeroVision4068 = this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageZipVortexCelestial6185 == 0 ? 1.0f : j2 / j3);
        return (f2 * PolarVoyageMotionLayoutTransitionHeroVision4068) + ((1.0f - PolarVoyageMotionLayoutTransitionHeroVision4068) * f);
    }
}
