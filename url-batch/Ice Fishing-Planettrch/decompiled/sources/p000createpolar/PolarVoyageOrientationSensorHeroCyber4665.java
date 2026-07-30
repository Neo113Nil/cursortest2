package p000createpolar;

import android.util.Range;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageOrientationSensorHeroCyber4665 {
    public Range PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public double PolarVoyageKotlinBetaPulseBeta3653;
    public long PolarVoyageMotionLayoutTransitionHeroVision4068;
    public long PolarVoyageZipVortexCelestial6185;

    public PolarVoyageOrientationSensorHeroCyber4665() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = range;
        this.PolarVoyageKotlinBetaPulseBeta3653 = ((Double) range.getUpper()).doubleValue();
        this.PolarVoyageZipVortexCelestial6185 = -9223372036854775807L;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = -9223372036854775807L;
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653(float f) {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(f > 0.0f);
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f));
        PolarVoyageMotionLayoutTransitionHeroVision4068();
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068() {
        this.PolarVoyageKotlinBetaPulseBeta3653 = ((Double) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.getUpper()).doubleValue();
        this.PolarVoyageZipVortexCelestial6185 = -9223372036854775807L;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = -9223372036854775807L;
    }

    public final void PolarVoyageZipVortexCelestial6185(long j, long j2) {
        double doubleValue;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(j != -9223372036854775807L);
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(j2 != -9223372036854775807L);
        long j3 = this.PolarVoyageZipVortexCelestial6185;
        if (j3 != -9223372036854775807L) {
            if (this.PolarVoyageMotionLayoutTransitionHeroVision4068 != -9223372036854775807L && j != j3) {
                doubleValue = (j2 - r4) / (j - j3);
                this.PolarVoyageKotlinBetaPulseBeta3653 = (((Double) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.PolarVoyageKotlinBetaPulseBeta3653 * 0.800000011920929d);
                this.PolarVoyageZipVortexCelestial6185 = j;
                this.PolarVoyageMotionLayoutTransitionHeroVision4068 = j2;
            }
        }
        doubleValue = ((Double) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.getUpper()).doubleValue();
        this.PolarVoyageKotlinBetaPulseBeta3653 = (((Double) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.PolarVoyageKotlinBetaPulseBeta3653 * 0.800000011920929d);
        this.PolarVoyageZipVortexCelestial6185 = j;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = j2;
    }
}
