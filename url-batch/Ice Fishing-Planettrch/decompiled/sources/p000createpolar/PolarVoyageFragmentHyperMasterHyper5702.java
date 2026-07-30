package p000createpolar;

import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFragmentHyperMasterHyper5702 {
    public int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public Object PolarVoyageBitmapVisionAuroraPixel4705;
    public boolean PolarVoyageKotlinBetaPulseBeta3653;
    public boolean PolarVoyageMotionLayoutTransitionHeroVision4068;
    public int PolarVoyageZipVortexCelestial6185;

    public PolarVoyageFragmentHyperMasterHyper5702(int i) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        byte[] bArr = new byte[131];
        this.PolarVoyageBitmapVisionAuroraPixel4705 = bArr;
        bArr[2] = 1;
    }

    public void PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = false;
        this.PolarVoyageKotlinBetaPulseBeta3653 = false;
    }

    public void PolarVoyageBitmapVisionAuroraPixel4705(int i) {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(!this.PolarVoyageMotionLayoutTransitionHeroVision4068);
        boolean z = i == this.PolarVoyageZipVortexCelestial6185;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = z;
        if (z) {
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 3;
            this.PolarVoyageKotlinBetaPulseBeta3653 = false;
        }
    }

    public void PolarVoyageKotlinBetaPulseBeta3653(int i) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 |= i > 0;
        this.PolarVoyageZipVortexCelestial6185 += i;
    }

    public boolean PolarVoyageMotionLayoutTransitionHeroVision4068(int i) {
        if (!this.PolarVoyageMotionLayoutTransitionHeroVision4068) {
            return false;
        }
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 -= i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = false;
        this.PolarVoyageKotlinBetaPulseBeta3653 = true;
        return true;
    }

    public void PolarVoyageZipVortexCelestial6185(byte[] bArr, int i, int i2) {
        if (this.PolarVoyageMotionLayoutTransitionHeroVision4068) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.PolarVoyageBitmapVisionAuroraPixel4705;
            int length = bArr2.length;
            int i4 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 + i3;
            if (length < i4) {
                this.PolarVoyageBitmapVisionAuroraPixel4705 = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.PolarVoyageBitmapVisionAuroraPixel4705, this.PolarVoyageBarcodeScannerInfernoSolarSpark7767, i3);
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 += i3;
        }
    }

    public PolarVoyageFragmentHyperMasterHyper5702(PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188) {
        this.PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageMaterialButtonDragonCyberMega6188;
    }
}
