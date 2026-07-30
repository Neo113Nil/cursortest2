package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageEditTextMaxBlazeNovaX6704 {
    public final int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final Object[] PolarVoyageKotlinBetaPulseBeta3653;
    public final String PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final PolarVoyageFlowCollectorPixelTurbo5520 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageEditTextMaxBlazeNovaX6704(PolarVoyageDrawableCompatOlympianPrime6391 polarVoyageDrawableCompatOlympianPrime6391, String str, Object[] objArr) {
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageDrawableCompatOlympianPrime6391;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = str;
        this.PolarVoyageKotlinBetaPulseBeta3653 = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    public final int PolarVoyageZipVortexCelestial6185() {
        int i = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
