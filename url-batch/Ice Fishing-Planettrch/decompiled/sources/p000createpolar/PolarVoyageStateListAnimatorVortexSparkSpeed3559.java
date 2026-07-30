package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageStateListAnimatorVortexSparkSpeed3559 {
    public static final PolarVoyageStateListAnimatorVortexSparkSpeed3559 PolarVoyageBitmapVisionAuroraPixel4705 = new PolarVoyageStateListAnimatorVortexSparkSpeed3559(-3, -9223372036854775807L, -1);
    public long PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public long PolarVoyageKotlinBetaPulseBeta3653;
    public final int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185 = 1;

    public PolarVoyageStateListAnimatorVortexSparkSpeed3559(int i, long j, long j2) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i;
        this.PolarVoyageKotlinBetaPulseBeta3653 = j;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = j2;
    }

    public static void PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageStateListAnimatorVortexSparkSpeed3559 polarVoyageStateListAnimatorVortexSparkSpeed3559, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        synchronized (polarVoyageStateListAnimatorVortexSparkSpeed3559) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j2 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j3 = polarVoyageStateListAnimatorVortexSparkSpeed3559.PolarVoyageKotlinBetaPulseBeta3653 + j;
                polarVoyageStateListAnimatorVortexSparkSpeed3559.PolarVoyageKotlinBetaPulseBeta3653 = j3;
                long j4 = polarVoyageStateListAnimatorVortexSparkSpeed3559.PolarVoyageBarcodeScannerInfernoSolarSpark7767 + j2;
                polarVoyageStateListAnimatorVortexSparkSpeed3559.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = j4;
                if (j4 > j3) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized long PolarVoyageZipVortexCelestial6185() {
        return this.PolarVoyageKotlinBetaPulseBeta3653 - this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    }

    public String toString() {
        switch (this.PolarVoyageZipVortexCelestial6185) {
            case 1:
                return "WindowCounter(streamId=" + this.PolarVoyageMotionLayoutTransitionHeroVision4068 + ", total=" + this.PolarVoyageKotlinBetaPulseBeta3653 + ", acknowledged=" + this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 + ", unacknowledged=" + PolarVoyageZipVortexCelestial6185() + ')';
            default:
                return super.toString();
        }
    }

    public PolarVoyageStateListAnimatorVortexSparkSpeed3559(int i) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i;
    }
}
