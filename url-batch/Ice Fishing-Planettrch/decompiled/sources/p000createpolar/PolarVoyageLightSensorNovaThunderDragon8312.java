package p000createpolar;

import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLightSensorNovaThunderDragon8312 {
    public final int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final int PolarVoyageBitmapVisionAuroraPixel4705;
    public final int PolarVoyageDiffUtilTurboStrike5735;
    public final boolean PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final int PolarVoyageKotlinBetaPulseBeta3653;
    public final char[] PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final byte[] PolarVoyageTextInputEditTextNebulaHero6651;
    public final String PolarVoyageZipVortexCelestial6185;

    public PolarVoyageLightSensorNovaThunderDragon8312(String str, char[] cArr, byte[] bArr, boolean z) {
        this.PolarVoyageZipVortexCelestial6185 = str;
        cArr.getClass();
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int PolarVoyageDiffUtilDragonSpeedEclipse6225 = PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilDragonSpeedEclipse6225(length);
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageDiffUtilDragonSpeedEclipse6225;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(PolarVoyageDiffUtilDragonSpeedEclipse6225);
            int i = 1 << (3 - numberOfTrailingZeros);
            this.PolarVoyageBitmapVisionAuroraPixel4705 = i;
            this.PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageDiffUtilDragonSpeedEclipse6225 >> numberOfTrailingZeros;
            this.PolarVoyageKotlinBetaPulseBeta3653 = cArr.length - 1;
            this.PolarVoyageTextInputEditTextNebulaHero6651 = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.PolarVoyageDiffUtilTurboStrike5735; i2++) {
                int i3 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageContentProviderHyperSpark3838(i2 * 8, i3)] = true;
            }
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PolarVoyageLightSensorNovaThunderDragon8312)) {
            return false;
        }
        PolarVoyageLightSensorNovaThunderDragon8312 polarVoyageLightSensorNovaThunderDragon8312 = (PolarVoyageLightSensorNovaThunderDragon8312) obj;
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485 == polarVoyageLightSensorNovaThunderDragon8312.PolarVoyageItemDecorationUltraDeltaEpic7485 && Arrays.equals(this.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageLightSensorNovaThunderDragon8312.PolarVoyageMotionLayoutTransitionHeroVision4068);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.PolarVoyageMotionLayoutTransitionHeroVision4068) + (this.PolarVoyageItemDecorationUltraDeltaEpic7485 ? 1231 : 1237);
    }

    public final String toString() {
        return this.PolarVoyageZipVortexCelestial6185;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PolarVoyageLightSensorNovaThunderDragon8312(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 128) {
                if (bArr[c] == -1) {
                    bArr[c] = (byte) i;
                } else {
                    PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778(PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageRotateAnimationCyberCelestialDelta4768("Duplicate character: %s", Character.valueOf(c)));
                    throw null;
                }
            } else {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778(PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageRotateAnimationCyberCelestialDelta4768("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
        }
    }
}
