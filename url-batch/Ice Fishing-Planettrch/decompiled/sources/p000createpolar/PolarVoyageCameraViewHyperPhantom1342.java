package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageCameraViewHyperPhantom1342 {
    public static final PolarVoyageCameraViewHyperPhantom1342 PolarVoyageDiffUtilTurboStrike5735 = new PolarVoyageCameraViewHyperPhantom1342(10485760, 200, 10000, 604800000, 81920);
    public final long PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final int PolarVoyageBitmapVisionAuroraPixel4705;
    public final int PolarVoyageKotlinBetaPulseBeta3653;
    public final int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final long PolarVoyageZipVortexCelestial6185;

    public PolarVoyageCameraViewHyperPhantom1342(long j, int i, int i2, long j2, int i3) {
        this.PolarVoyageZipVortexCelestial6185 = j;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i;
        this.PolarVoyageKotlinBetaPulseBeta3653 = i2;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = j2;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PolarVoyageCameraViewHyperPhantom1342) {
            PolarVoyageCameraViewHyperPhantom1342 polarVoyageCameraViewHyperPhantom1342 = (PolarVoyageCameraViewHyperPhantom1342) obj;
            if (this.PolarVoyageZipVortexCelestial6185 == polarVoyageCameraViewHyperPhantom1342.PolarVoyageZipVortexCelestial6185 && this.PolarVoyageMotionLayoutTransitionHeroVision4068 == polarVoyageCameraViewHyperPhantom1342.PolarVoyageMotionLayoutTransitionHeroVision4068 && this.PolarVoyageKotlinBetaPulseBeta3653 == polarVoyageCameraViewHyperPhantom1342.PolarVoyageKotlinBetaPulseBeta3653 && this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == polarVoyageCameraViewHyperPhantom1342.PolarVoyageBarcodeScannerInfernoSolarSpark7767 && this.PolarVoyageBitmapVisionAuroraPixel4705 == polarVoyageCameraViewHyperPhantom1342.PolarVoyageBitmapVisionAuroraPixel4705) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.PolarVoyageZipVortexCelestial6185;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.PolarVoyageMotionLayoutTransitionHeroVision4068) * 1000003) ^ this.PolarVoyageKotlinBetaPulseBeta3653) * 1000003;
        long j2 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        return this.PolarVoyageBitmapVisionAuroraPixel4705 ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.PolarVoyageZipVortexCelestial6185 + ", loadBatchSize=" + this.PolarVoyageMotionLayoutTransitionHeroVision4068 + ", criticalSectionEnterTimeoutMs=" + this.PolarVoyageKotlinBetaPulseBeta3653 + ", eventCleanUpAge=" + this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 + ", maxBlobByteSizePerRow=" + this.PolarVoyageBitmapVisionAuroraPixel4705 + "}";
    }
}
