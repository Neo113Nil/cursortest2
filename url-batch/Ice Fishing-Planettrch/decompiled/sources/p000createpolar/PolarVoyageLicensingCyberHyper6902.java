package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLicensingCyberHyper6902 extends PolarVoyageEventTurboPixel7111 {
    public static PolarVoyageLicensingCyberHyper6902 PolarVoyageKotlinBetaPulseBeta3653;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // p000createpolar.PolarVoyageEventTurboPixel7111
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i) {
        int length = PolarVoyageKotlinBetaPulseBeta3653().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && PolarVoyageKotlinBetaPulseBeta3653().charAt(i - 1) == '\n' && !PolarVoyageBitmapVisionAuroraPixel4705(i)) {
            i--;
        }
        int i2 = i - 1;
        while (i2 > 0 && (PolarVoyageKotlinBetaPulseBeta3653().charAt(i2) == '\n' || (i2 != 0 && PolarVoyageKotlinBetaPulseBeta3653().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return PolarVoyageMotionLayoutTransitionHeroVision4068(i2, i);
    }

    public final boolean PolarVoyageBitmapVisionAuroraPixel4705(int i) {
        if (i <= 0 || PolarVoyageKotlinBetaPulseBeta3653().charAt(i - 1) == '\n') {
            return false;
        }
        return i == PolarVoyageKotlinBetaPulseBeta3653().length() || PolarVoyageKotlinBetaPulseBeta3653().charAt(i) == '\n';
    }

    @Override // p000createpolar.PolarVoyageEventTurboPixel7111
    public final int[] PolarVoyageZipVortexCelestial6185(int i) {
        int length = PolarVoyageKotlinBetaPulseBeta3653().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && PolarVoyageKotlinBetaPulseBeta3653().charAt(i) == '\n' && (PolarVoyageKotlinBetaPulseBeta3653().charAt(i) == '\n' || (i != 0 && PolarVoyageKotlinBetaPulseBeta3653().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !PolarVoyageBitmapVisionAuroraPixel4705(i2)) {
            i2++;
        }
        return PolarVoyageMotionLayoutTransitionHeroVision4068(i, i2);
    }
}
