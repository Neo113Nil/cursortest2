package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAnimationSetEliteStorm4036 {
    public int PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 0;
    public byte[] PolarVoyageBitmapVisionAuroraPixel4705;
    public int PolarVoyageKotlinBetaPulseBeta3653;
    public int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public int PolarVoyageZipVortexCelestial6185;

    public PolarVoyageAnimationSetEliteStorm4036(byte[] bArr, int i, int i2) {
        this.PolarVoyageBitmapVisionAuroraPixel4705 = bArr;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i;
        this.PolarVoyageKotlinBetaPulseBeta3653 = i;
        this.PolarVoyageZipVortexCelestial6185 = i2;
        PolarVoyageZipVortexCelestial6185();
    }

    public boolean PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        boolean z = (this.PolarVoyageBitmapVisionAuroraPixel4705[this.PolarVoyageKotlinBetaPulseBeta3653] & (128 >> this.PolarVoyageBarcodeScannerInfernoSolarSpark7767)) != 0;
        PolarVoyageStrictModeLegendEpic1532();
        return z;
    }

    public int PolarVoyageBitmapVisionAuroraPixel4705(int i) {
        int i2;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 += i;
        int i3 = 0;
        while (true) {
            i2 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i4;
            byte[] bArr = this.PolarVoyageBitmapVisionAuroraPixel4705;
            int i5 = this.PolarVoyageKotlinBetaPulseBeta3653;
            i3 |= (bArr[i5] & 255) << i4;
            if (!PolarVoyageItemDecorationUltraDeltaEpic7485(i5 + 1)) {
                r3 = 1;
            }
            this.PolarVoyageKotlinBetaPulseBeta3653 = i5 + r3;
        }
        byte[] bArr2 = this.PolarVoyageBitmapVisionAuroraPixel4705;
        int i6 = this.PolarVoyageKotlinBetaPulseBeta3653;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 0;
            this.PolarVoyageKotlinBetaPulseBeta3653 = i6 + (PolarVoyageItemDecorationUltraDeltaEpic7485(i6 + 1) ? 2 : 1);
        }
        PolarVoyageZipVortexCelestial6185();
        return i7;
    }

    public int PolarVoyageDiffUtilTurboStrike5735() {
        int i = 0;
        while (!PolarVoyageBarcodeScannerInfernoSolarSpark7767()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? PolarVoyageBitmapVisionAuroraPixel4705(i) : 0);
    }

    public boolean PolarVoyageItemDecorationUltraDeltaEpic7485(int i) {
        int i2 = i - 2;
        if (this.PolarVoyageMotionLayoutTransitionHeroVision4068 > i2 || i >= this.PolarVoyageZipVortexCelestial6185) {
            return false;
        }
        byte[] bArr = this.PolarVoyageBitmapVisionAuroraPixel4705;
        return bArr[i] == 3 && bArr[i2] == 0 && bArr[i - 1] == 0;
    }

    public boolean PolarVoyageKotlinBetaPulseBeta3653() {
        int i = this.PolarVoyageKotlinBetaPulseBeta3653;
        int i2 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int i3 = 0;
        while (this.PolarVoyageKotlinBetaPulseBeta3653 < this.PolarVoyageZipVortexCelestial6185 && !PolarVoyageBarcodeScannerInfernoSolarSpark7767()) {
            i3++;
        }
        boolean z = this.PolarVoyageKotlinBetaPulseBeta3653 == this.PolarVoyageZipVortexCelestial6185;
        this.PolarVoyageKotlinBetaPulseBeta3653 = i;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i2;
        return !z && PolarVoyageMotionLayoutTransitionHeroVision4068((i3 * 2) + 1);
    }

    public boolean PolarVoyageMotionLayoutTransitionHeroVision4068(int i) {
        int i2 = this.PolarVoyageKotlinBetaPulseBeta3653;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 > this.PolarVoyageZipVortexCelestial6185) {
                break;
            }
            if (PolarVoyageItemDecorationUltraDeltaEpic7485(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.PolarVoyageZipVortexCelestial6185;
        return i4 < i6 || (i4 == i6 && i5 == 0);
    }

    public void PolarVoyageRotateAnimationCyberCelestialDelta4768(int i) {
        int i2 = this.PolarVoyageKotlinBetaPulseBeta3653;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.PolarVoyageKotlinBetaPulseBeta3653 = i4;
        int i5 = (i - (i3 * 8)) + this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i5;
        if (i5 > 7) {
            this.PolarVoyageKotlinBetaPulseBeta3653 = i4 + 1;
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.PolarVoyageKotlinBetaPulseBeta3653) {
                PolarVoyageZipVortexCelestial6185();
                return;
            } else if (PolarVoyageItemDecorationUltraDeltaEpic7485(i2)) {
                this.PolarVoyageKotlinBetaPulseBeta3653++;
                i2 += 2;
            }
        }
    }

    public void PolarVoyageStrictModeLegendEpic1532() {
        int i = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 + 1;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i;
        if (i == 8) {
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 0;
            int i2 = this.PolarVoyageKotlinBetaPulseBeta3653;
            this.PolarVoyageKotlinBetaPulseBeta3653 = i2 + (PolarVoyageItemDecorationUltraDeltaEpic7485(i2 + 1) ? 2 : 1);
        }
        PolarVoyageZipVortexCelestial6185();
    }

    public int PolarVoyageTextInputEditTextNebulaHero6651() {
        int PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageDiffUtilTurboStrike5735();
        return ((PolarVoyageDiffUtilTurboStrike5735 + 1) / 2) * (PolarVoyageDiffUtilTurboStrike5735 % 2 == 0 ? -1 : 1);
    }

    public void PolarVoyageZipVortexCelestial6185() {
        int i;
        int i2 = this.PolarVoyageKotlinBetaPulseBeta3653;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(i2 >= 0 && (i2 < (i = this.PolarVoyageZipVortexCelestial6185) || (i2 == i && this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == 0)));
    }
}
