package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTransformBetaBeta5811 {
    public final double PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final double PolarVoyageBitmapVisionAuroraPixel4705;
    public final double PolarVoyageDiffUtilTurboStrike5735;
    public final double PolarVoyageKotlinBetaPulseBeta3653;
    public final double PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final double PolarVoyageTextInputEditTextNebulaHero6651;
    public final double PolarVoyageZipVortexCelestial6185;

    public PolarVoyageTransformBetaBeta5811(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.PolarVoyageZipVortexCelestial6185 = d;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = d2;
        this.PolarVoyageKotlinBetaPulseBeta3653 = d3;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = d4;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = d5;
        this.PolarVoyageDiffUtilTurboStrike5735 = d6;
        this.PolarVoyageTextInputEditTextNebulaHero6651 = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Parameters cannot be NaN");
            throw null;
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d4 < 0.0d) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("The transfer function must be increasing");
            throw null;
        }
        if (d2 < 0.0d || d < 0.0d) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolarVoyageTransformBetaBeta5811)) {
            return false;
        }
        PolarVoyageTransformBetaBeta5811 polarVoyageTransformBetaBeta5811 = (PolarVoyageTransformBetaBeta5811) obj;
        return Double.compare(this.PolarVoyageZipVortexCelestial6185, polarVoyageTransformBetaBeta5811.PolarVoyageZipVortexCelestial6185) == 0 && Double.compare(this.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageTransformBetaBeta5811.PolarVoyageMotionLayoutTransitionHeroVision4068) == 0 && Double.compare(this.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageTransformBetaBeta5811.PolarVoyageKotlinBetaPulseBeta3653) == 0 && Double.compare(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767, polarVoyageTransformBetaBeta5811.PolarVoyageBarcodeScannerInfernoSolarSpark7767) == 0 && Double.compare(this.PolarVoyageBitmapVisionAuroraPixel4705, polarVoyageTransformBetaBeta5811.PolarVoyageBitmapVisionAuroraPixel4705) == 0 && Double.compare(this.PolarVoyageDiffUtilTurboStrike5735, polarVoyageTransformBetaBeta5811.PolarVoyageDiffUtilTurboStrike5735) == 0 && Double.compare(this.PolarVoyageTextInputEditTextNebulaHero6651, polarVoyageTransformBetaBeta5811.PolarVoyageTextInputEditTextNebulaHero6651) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.PolarVoyageTextInputEditTextNebulaHero6651) + ((Double.hashCode(this.PolarVoyageDiffUtilTurboStrike5735) + ((Double.hashCode(this.PolarVoyageBitmapVisionAuroraPixel4705) + ((Double.hashCode(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767) + ((Double.hashCode(this.PolarVoyageKotlinBetaPulseBeta3653) + ((Double.hashCode(this.PolarVoyageMotionLayoutTransitionHeroVision4068) + (Double.hashCode(this.PolarVoyageZipVortexCelestial6185) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.PolarVoyageZipVortexCelestial6185 + ", a=" + this.PolarVoyageMotionLayoutTransitionHeroVision4068 + ", b=" + this.PolarVoyageKotlinBetaPulseBeta3653 + ", c=" + this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 + ", d=" + this.PolarVoyageBitmapVisionAuroraPixel4705 + ", e=" + this.PolarVoyageDiffUtilTurboStrike5735 + ", f=" + this.PolarVoyageTextInputEditTextNebulaHero6651 + ')';
    }

    public /* synthetic */ PolarVoyageTransformBetaBeta5811(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
