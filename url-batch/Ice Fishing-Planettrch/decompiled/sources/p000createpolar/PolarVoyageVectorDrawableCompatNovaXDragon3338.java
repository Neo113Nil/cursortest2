package p000createpolar;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageVectorDrawableCompatNovaXDragon3338 implements PolarVoyageStrictModeRogueLegendSpeed5357 {
    public short[] PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public int PolarVoyageBitmapVisionAuroraPixel4705;
    public int PolarVoyageDiffUtilTurboStrike5735;
    public final /* synthetic */ PolarVoyageProcessCameraProviderForceSolarMaster1494 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public short[] PolarVoyageKotlinBetaPulseBeta3653;
    public short[] PolarVoyageMotionLayoutTransitionHeroVision4068;
    public int PolarVoyageTextInputEditTextNebulaHero6651;
    public final short[] PolarVoyageZipVortexCelestial6185;

    public PolarVoyageVectorDrawableCompatNovaXDragon3338(PolarVoyageProcessCameraProviderForceSolarMaster1494 polarVoyageProcessCameraProviderForceSolarMaster1494) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageProcessCameraProviderForceSolarMaster1494;
        int i = polarVoyageProcessCameraProviderForceSolarMaster1494.PolarVoyageItemDecorationUltraDeltaEpic7485;
        this.PolarVoyageZipVortexCelestial6185 = new short[i];
        int i2 = i * polarVoyageProcessCameraProviderForceSolarMaster1494.PolarVoyageMotionLayoutTransitionHeroVision4068;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = new short[i2];
        this.PolarVoyageKotlinBetaPulseBeta3653 = new short[i2];
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new short[i2];
    }

    public final int PolarVoyageAnimatorSetSparkUltraMax8233(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.PolarVoyageBitmapVisionAuroraPixel4705 = i6 / i7;
        this.PolarVoyageDiffUtilTurboStrike5735 = i8 / i5;
        return i7;
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i, ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = this.PolarVoyageKotlinBetaPulseBeta3653;
        int i2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageMotionLayoutTransitionHeroVision4068;
        asShortBuffer.put(sArr, 0, i * i2);
        byteBuffer.position((i * 2 * i2) + byteBuffer.position());
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final void PolarVoyageBitmapVisionAuroraPixel4705(int i, long j, long j2) {
        int i2 = 0;
        while (true) {
            PolarVoyageProcessCameraProviderForceSolarMaster1494 polarVoyageProcessCameraProviderForceSolarMaster1494 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            int i3 = polarVoyageProcessCameraProviderForceSolarMaster1494.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (i2 >= i3) {
                return;
            }
            short[] sArr = this.PolarVoyageKotlinBetaPulseBeta3653;
            int i4 = (polarVoyageProcessCameraProviderForceSolarMaster1494.PolarVoyageBottomSheetOmegaNeo1907 * i3) + i2;
            short[] sArr2 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            int i5 = (i * i3) + i2;
            short s = sArr2[i5];
            short s2 = sArr2[i5 + i3];
            long j3 = polarVoyageProcessCameraProviderForceSolarMaster1494.PolarVoyageDrawableDeltaHyperion5742 * j;
            long j4 = (r1 + 1) * j2;
            long j5 = j4 - j3;
            long j6 = j4 - (polarVoyageProcessCameraProviderForceSolarMaster1494.PolarVoyageCameraPixelBlaze2629 * j2);
            sArr[i4] = (short) ((((j6 - j5) * s2) + (s * j5)) / j6);
            i2++;
        }
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final void PolarVoyageBottomSheetOmegaNeo1907(int i) {
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageNavigationViewHyperHyperHyperion1793(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767, this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageViewRogueMaster4778, i);
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final void PolarVoyageCameraPixelBlaze2629(int i) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageNavigationViewHyperHyperHyperion1793(this.PolarVoyageMotionLayoutTransitionHeroVision4068, this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageRotateAnimationCyberCelestialDelta4768, i);
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final Object PolarVoyageContentProviderHyperSpark3838() {
        return this.PolarVoyageKotlinBetaPulseBeta3653;
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final void PolarVoyageDiffUtilTurboStrike5735(int i, int i2) {
        for (int i3 = 0; i3 < this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageMotionLayoutTransitionHeroVision4068 * i2; i3++) {
            this.PolarVoyageMotionLayoutTransitionHeroVision4068[i + i3] = 0;
        }
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final void PolarVoyageDrawableDeltaHyperion5742() {
        this.PolarVoyageTextInputEditTextNebulaHero6651 = this.PolarVoyageBitmapVisionAuroraPixel4705;
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final void PolarVoyageItemDecorationUltraDeltaEpic7485(int i, int i2, int i3, int i4, int i5) {
        short[] sArr = this.PolarVoyageKotlinBetaPulseBeta3653;
        short[] sArr2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final boolean PolarVoyageKotlinBetaPulseBeta3653() {
        int i = this.PolarVoyageBitmapVisionAuroraPixel4705;
        return i != 0 && this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageContentProviderHyperSpark3838 != 0 && this.PolarVoyageDiffUtilTurboStrike5735 <= i * 3 && i * 2 > this.PolarVoyageTextInputEditTextNebulaHero6651 * 3;
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(int i) {
        this.PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageNavigationViewHyperHyperHyperion1793(this.PolarVoyageKotlinBetaPulseBeta3653, this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBottomSheetOmegaNeo1907, i);
    }

    public final short[] PolarVoyageNavigationViewHyperHyperHyperion1793(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final int PolarVoyageRemoteModelManagerOlympianCelestial9141(int i, int i2) {
        return PolarVoyageAnimatorSetSparkUltraMax8233(this.PolarVoyageZipVortexCelestial6185, 0, i, i2);
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final int PolarVoyageRotateAnimationCyberCelestialDelta4768(int i, int i2, int i3) {
        return PolarVoyageAnimatorSetSparkUltraMax8233(this.PolarVoyageMotionLayoutTransitionHeroVision4068, i, i2, i3);
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final Object PolarVoyageSnackbarGammaEclipse2140() {
        return this.PolarVoyageMotionLayoutTransitionHeroVision4068;
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final void PolarVoyageStrictModeLegendEpic1532(int i, int i2) {
        short[] sArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        PolarVoyageProcessCameraProviderForceSolarMaster1494 polarVoyageProcessCameraProviderForceSolarMaster1494 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i3 = polarVoyageProcessCameraProviderForceSolarMaster1494.PolarVoyageItemDecorationUltraDeltaEpic7485 / i2;
        int i4 = polarVoyageProcessCameraProviderForceSolarMaster1494.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.PolarVoyageZipVortexCelestial6185[i7] = (short) (i8 / i5);
        }
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final Object PolarVoyageTextInputEditTextNebulaHero6651() {
        return this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final int PolarVoyageViewRogueMaster4778() {
        return 2;
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final void PolarVoyageZipVortexCelestial6185(int i, ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        PolarVoyageProcessCameraProviderForceSolarMaster1494 polarVoyageProcessCameraProviderForceSolarMaster1494 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        asShortBuffer.get(sArr, polarVoyageProcessCameraProviderForceSolarMaster1494.PolarVoyageRotateAnimationCyberCelestialDelta4768 * polarVoyageProcessCameraProviderForceSolarMaster1494.PolarVoyageMotionLayoutTransitionHeroVision4068, i / 2);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final void flush() {
        this.PolarVoyageTextInputEditTextNebulaHero6651 = 0;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = 0;
        this.PolarVoyageDiffUtilTurboStrike5735 = 0;
    }
}
