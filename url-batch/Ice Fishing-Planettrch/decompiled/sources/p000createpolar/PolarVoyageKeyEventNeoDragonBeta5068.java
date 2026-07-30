package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageKeyEventNeoDragonBeta5068 {
    public static final PolarVoyageLayoutGammaFusionTitanium3382 PolarVoyageItemDecorationUltraDeltaEpic7485;

    static {
        Integer num = PolarVoyageMotionLayoutTransitionCosmosShadowHero5172.PolarVoyageZipVortexCelestial6185;
        PolarVoyageItemDecorationUltraDeltaEpic7485 = (num == null || num.intValue() >= 34) ? new PolarVoyageChipGroupPhantomElite7240() : new PolarVoyageResourcesUltraAuroraNeo6055();
    }

    public long PolarVoyageBarcodeScannerInfernoSolarSpark7767(long j, long j2) {
        long PolarVoyageKotlinBetaPulseBeta3653;
        long j3;
        long j4;
        int PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (j2 <= j) {
            PolarVoyageR8UltraEliteBeta8736.PolarVoyageNavigationViewHyperHyperHyperion1793("Random range is empty: [", Long.valueOf(j), ", ", Long.valueOf(j2), ").");
            return 0L;
        }
        long j5 = j2 - j;
        if (j5 > 0) {
            if (((-j5) & j5) == j5) {
                int i = (int) j5;
                int i2 = (int) (j5 >>> 32);
                if (i != 0) {
                    PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageZipVortexCelestial6185(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068();
                } else {
                    j4 = (PolarVoyageZipVortexCelestial6185(31 - Integer.numberOfLeadingZeros(i2)) << 32) + (PolarVoyageMotionLayoutTransitionHeroVision4068() & 4294967295L);
                }
                j4 = PolarVoyageMotionLayoutTransitionHeroVision4068 & 4294967295L;
            } else {
                do {
                    PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageKotlinBetaPulseBeta3653() >>> 1;
                    j3 = PolarVoyageKotlinBetaPulseBeta3653 % j5;
                } while ((j5 - 1) + (PolarVoyageKotlinBetaPulseBeta3653 - j3) < 0);
                j4 = j3;
            }
            return j + j4;
        }
        while (true) {
            long PolarVoyageKotlinBetaPulseBeta36532 = PolarVoyageKotlinBetaPulseBeta3653();
            if (j <= PolarVoyageKotlinBetaPulseBeta36532 && PolarVoyageKotlinBetaPulseBeta36532 < j2) {
                return PolarVoyageKotlinBetaPulseBeta36532;
            }
        }
    }

    public abstract long PolarVoyageKotlinBetaPulseBeta3653();

    public abstract int PolarVoyageMotionLayoutTransitionHeroVision4068();

    public abstract int PolarVoyageZipVortexCelestial6185(int i);
}
