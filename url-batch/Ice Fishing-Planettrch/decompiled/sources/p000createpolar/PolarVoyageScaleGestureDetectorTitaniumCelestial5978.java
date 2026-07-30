package p000createpolar;

import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageScaleGestureDetectorTitaniumCelestial5978 {
    public static final byte[] PolarVoyageDiffUtilTurboStrike5735 = {0, 0, 1};
    public int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public byte[] PolarVoyageBitmapVisionAuroraPixel4705;
    public int PolarVoyageKotlinBetaPulseBeta3653;
    public int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public boolean PolarVoyageZipVortexCelestial6185;

    public final void PolarVoyageZipVortexCelestial6185(byte[] bArr, int i, int i2) {
        if (this.PolarVoyageZipVortexCelestial6185) {
            int i3 = i2 - i;
            byte[] bArr2 = this.PolarVoyageBitmapVisionAuroraPixel4705;
            int length = bArr2.length;
            int i4 = this.PolarVoyageKotlinBetaPulseBeta3653 + i3;
            if (length < i4) {
                this.PolarVoyageBitmapVisionAuroraPixel4705 = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.PolarVoyageBitmapVisionAuroraPixel4705, this.PolarVoyageKotlinBetaPulseBeta3653, i3);
            this.PolarVoyageKotlinBetaPulseBeta3653 += i3;
        }
    }
}
