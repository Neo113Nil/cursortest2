package p000createpolar;

import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAnimatorSetHeroMasterNova7559 {
    public static final byte[] PolarVoyageBitmapVisionAuroraPixel4705 = {0, 0, 1};
    public byte[] PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public int PolarVoyageKotlinBetaPulseBeta3653;
    public int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public boolean PolarVoyageZipVortexCelestial6185;

    public final void PolarVoyageZipVortexCelestial6185(byte[] bArr, int i, int i2) {
        if (this.PolarVoyageZipVortexCelestial6185) {
            int i3 = i2 - i;
            byte[] bArr2 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            int length = bArr2.length;
            int i4 = this.PolarVoyageMotionLayoutTransitionHeroVision4068 + i3;
            if (length < i4) {
                this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.PolarVoyageBarcodeScannerInfernoSolarSpark7767, this.PolarVoyageMotionLayoutTransitionHeroVision4068, i3);
            this.PolarVoyageMotionLayoutTransitionHeroVision4068 += i3;
        }
    }
}
