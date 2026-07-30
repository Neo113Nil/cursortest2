package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAuthVortexNebulaNeo9087 {
    public int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public int PolarVoyageBitmapVisionAuroraPixel4705;
    public int PolarVoyageKotlinBetaPulseBeta3653;
    public byte[] PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185;

    public PolarVoyageAuthVortexNebulaNeo9087(int i, int i2) {
        this.PolarVoyageZipVortexCelestial6185 = 0;
        this.PolarVoyageKotlinBetaPulseBeta3653 = i;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i2;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = new byte[(i2 * 2) - 1];
        this.PolarVoyageBitmapVisionAuroraPixel4705 = 0;
    }

    public int PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == 0);
        return this.PolarVoyageKotlinBetaPulseBeta3653;
    }

    public int PolarVoyageBitmapVisionAuroraPixel4705() {
        return (this.PolarVoyageKotlinBetaPulseBeta3653 * 8) + this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    }

    public void PolarVoyageBottomSheetOmegaNeo1907(PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312) {
        PolarVoyageViewRogueMaster4778(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185, polarVoyageTextRecognitionHeroOmega1312.PolarVoyageKotlinBetaPulseBeta3653);
        PolarVoyageCameraPixelBlaze2629(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068 * 8);
    }

    public void PolarVoyageCameraPixelBlaze2629(int i) {
        int i2 = i / 8;
        this.PolarVoyageKotlinBetaPulseBeta3653 = i2;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i - (i2 * 8);
        PolarVoyageZipVortexCelestial6185();
    }

    public void PolarVoyageContentProviderHyperSpark3838(int i) {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == 0);
        this.PolarVoyageKotlinBetaPulseBeta3653 += i;
        PolarVoyageZipVortexCelestial6185();
    }

    public boolean PolarVoyageDiffUtilTurboStrike5735() {
        switch (this.PolarVoyageZipVortexCelestial6185) {
            case 1:
                boolean z = (this.PolarVoyageMotionLayoutTransitionHeroVision4068[this.PolarVoyageKotlinBetaPulseBeta3653] & (128 >> this.PolarVoyageBarcodeScannerInfernoSolarSpark7767)) != 0;
                PolarVoyageDrawableDeltaHyperion5742();
                return z;
            default:
                boolean z2 = (((this.PolarVoyageMotionLayoutTransitionHeroVision4068[this.PolarVoyageBarcodeScannerInfernoSolarSpark7767] & 255) >> this.PolarVoyageBitmapVisionAuroraPixel4705) & 1) == 1;
                PolarVoyageSnackbarGammaEclipse2140(1);
                return z2;
        }
    }

    public void PolarVoyageDrawableDeltaHyperion5742() {
        int i = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 + 1;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i;
        if (i == 8) {
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 0;
            this.PolarVoyageKotlinBetaPulseBeta3653++;
        }
        PolarVoyageZipVortexCelestial6185();
    }

    public void PolarVoyageItemDecorationUltraDeltaEpic7485(byte[] bArr, int i) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            int i4 = this.PolarVoyageKotlinBetaPulseBeta3653;
            int i5 = i4 + 1;
            this.PolarVoyageKotlinBetaPulseBeta3653 = i5;
            byte b = bArr2[i4];
            int i6 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            int i9 = this.PolarVoyageKotlinBetaPulseBeta3653;
            this.PolarVoyageKotlinBetaPulseBeta3653 = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i8 - 8;
        }
        int i10 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 + i7;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i10;
        byte[] bArr4 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i11 = this.PolarVoyageKotlinBetaPulseBeta3653;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 0;
            this.PolarVoyageKotlinBetaPulseBeta3653 = i11 + 1;
        }
        PolarVoyageZipVortexCelestial6185();
    }

    public void PolarVoyageKotlinBetaPulseBeta3653() {
        if (this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == 0) {
            return;
        }
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 0;
        this.PolarVoyageKotlinBetaPulseBeta3653++;
        PolarVoyageZipVortexCelestial6185();
    }

    public int PolarVoyageMotionLayoutTransitionHeroVision4068() {
        return ((this.PolarVoyageBitmapVisionAuroraPixel4705 - this.PolarVoyageKotlinBetaPulseBeta3653) * 8) - this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    }

    public void PolarVoyageRotateAnimationCyberCelestialDelta4768(byte[] bArr, int i) {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == 0);
        System.arraycopy(this.PolarVoyageMotionLayoutTransitionHeroVision4068, this.PolarVoyageKotlinBetaPulseBeta3653, bArr, 0, i);
        this.PolarVoyageKotlinBetaPulseBeta3653 += i;
        PolarVoyageZipVortexCelestial6185();
    }

    public void PolarVoyageSnackbarGammaEclipse2140(int i) {
        int i2;
        switch (this.PolarVoyageZipVortexCelestial6185) {
            case 1:
                int i3 = i / 8;
                int i4 = this.PolarVoyageKotlinBetaPulseBeta3653 + i3;
                this.PolarVoyageKotlinBetaPulseBeta3653 = i4;
                int i5 = (i - (i3 * 8)) + this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i5;
                if (i5 > 7) {
                    this.PolarVoyageKotlinBetaPulseBeta3653 = i4 + 1;
                    this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i5 - 8;
                }
                PolarVoyageZipVortexCelestial6185();
                break;
            default:
                int i6 = i / 8;
                int i7 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 + i6;
                this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i7;
                int i8 = (i - (i6 * 8)) + this.PolarVoyageBitmapVisionAuroraPixel4705;
                this.PolarVoyageBitmapVisionAuroraPixel4705 = i8;
                boolean z = true;
                if (i8 > 7) {
                    this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i7 + 1;
                    this.PolarVoyageBitmapVisionAuroraPixel4705 = i8 - 8;
                }
                int i9 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                if (i9 < 0 || (i9 >= (i2 = this.PolarVoyageKotlinBetaPulseBeta3653) && (i9 != i2 || this.PolarVoyageBitmapVisionAuroraPixel4705 != 0))) {
                    z = false;
                }
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(z);
                break;
        }
    }

    public long PolarVoyageStrictModeLegendEpic1532(int i) {
        if (i <= 32) {
            int PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageTextInputEditTextNebulaHero6651(i);
            String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
            return PolarVoyageTextInputEditTextNebulaHero6651 & 4294967295L;
        }
        int PolarVoyageTextInputEditTextNebulaHero66512 = PolarVoyageTextInputEditTextNebulaHero6651(i - 32);
        int PolarVoyageTextInputEditTextNebulaHero66513 = PolarVoyageTextInputEditTextNebulaHero6651(32);
        String str2 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
        return (PolarVoyageTextInputEditTextNebulaHero66513 & 4294967295L) | ((PolarVoyageTextInputEditTextNebulaHero66512 & 4294967295L) << 32);
    }

    public int PolarVoyageTextInputEditTextNebulaHero6651(int i) {
        switch (this.PolarVoyageZipVortexCelestial6185) {
            case 1:
                if (i == 0) {
                    return 0;
                }
                this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 += i;
                int i2 = 0;
                while (true) {
                    int i3 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                    if (i3 <= 8) {
                        byte[] bArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        int i4 = this.PolarVoyageKotlinBetaPulseBeta3653;
                        int i5 = ((-1) >>> (32 - i)) & (((255 & bArr[i4]) >> (8 - i3)) | i2);
                        if (i3 == 8) {
                            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 0;
                            this.PolarVoyageKotlinBetaPulseBeta3653 = i4 + 1;
                        }
                        PolarVoyageZipVortexCelestial6185();
                        return i5;
                    }
                    int i6 = i3 - 8;
                    this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i6;
                    byte[] bArr2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    int i7 = this.PolarVoyageKotlinBetaPulseBeta3653;
                    this.PolarVoyageKotlinBetaPulseBeta3653 = i7 + 1;
                    i2 |= (bArr2[i7] & 255) << i6;
                }
            default:
                int i8 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                int min = Math.min(i, 8 - this.PolarVoyageBitmapVisionAuroraPixel4705);
                byte[] bArr3 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                int i9 = i8 + 1;
                int i10 = ((bArr3[i8] & 255) >> this.PolarVoyageBitmapVisionAuroraPixel4705) & (255 >> (8 - min));
                while (min < i) {
                    i10 |= (bArr3[i9] & 255) << min;
                    min += 8;
                    i9++;
                }
                int i11 = i10 & ((-1) >>> (32 - i));
                PolarVoyageSnackbarGammaEclipse2140(i);
                return i11;
        }
    }

    public void PolarVoyageViewRogueMaster4778(byte[] bArr, int i) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = bArr;
        this.PolarVoyageKotlinBetaPulseBeta3653 = 0;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 0;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = i;
    }

    public void PolarVoyageZipVortexCelestial6185() {
        int i;
        int i2 = this.PolarVoyageKotlinBetaPulseBeta3653;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(i2 >= 0 && (i2 < (i = this.PolarVoyageBitmapVisionAuroraPixel4705) || (i2 == i && this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == 0)));
    }

    public PolarVoyageAuthVortexNebulaNeo9087(byte[] bArr) {
        this.PolarVoyageZipVortexCelestial6185 = 2;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = bArr;
        this.PolarVoyageKotlinBetaPulseBeta3653 = bArr.length;
    }

    public PolarVoyageAuthVortexNebulaNeo9087(byte[] bArr, int i) {
        this.PolarVoyageZipVortexCelestial6185 = 1;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = bArr;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = i;
    }

    public PolarVoyageAuthVortexNebulaNeo9087() {
        this.PolarVoyageZipVortexCelestial6185 = 1;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageMotionLayoutTransitionHeroVision4068;
    }
}
