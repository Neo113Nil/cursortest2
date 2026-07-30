package p000createpolar;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageContentResolverAuroraBlazeSpeed3571 implements PolarVoyageStrictModeRogueLegendSpeed5357 {
    public float[] PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public double PolarVoyageBitmapVisionAuroraPixel4705;
    public double PolarVoyageDiffUtilTurboStrike5735;
    public final /* synthetic */ PolarVoyageProcessCameraProviderForceSolarMaster1494 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public float[] PolarVoyageKotlinBetaPulseBeta3653;
    public float[] PolarVoyageMotionLayoutTransitionHeroVision4068;
    public double PolarVoyageTextInputEditTextNebulaHero6651;
    public final float[] PolarVoyageZipVortexCelestial6185;

    public PolarVoyageContentResolverAuroraBlazeSpeed3571(PolarVoyageProcessCameraProviderForceSolarMaster1494 polarVoyageProcessCameraProviderForceSolarMaster1494) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageProcessCameraProviderForceSolarMaster1494;
        int i = polarVoyageProcessCameraProviderForceSolarMaster1494.PolarVoyageItemDecorationUltraDeltaEpic7485;
        this.PolarVoyageZipVortexCelestial6185 = new float[i];
        int i2 = i * polarVoyageProcessCameraProviderForceSolarMaster1494.PolarVoyageMotionLayoutTransitionHeroVision4068;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = new float[i2];
        this.PolarVoyageKotlinBetaPulseBeta3653 = new float[i2];
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new float[i2];
    }

    public final int PolarVoyageAnimatorSetSparkUltraMax8233(float[] fArr, int i, int i2, int i3) {
        int i4 = this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageMotionLayoutTransitionHeroVision4068 * i;
        double d = 1.0d;
        int i5 = 0;
        double d2 = 0.0d;
        int i6 = 255;
        int i7 = i2;
        while (i7 <= i3) {
            double d3 = 0.0d;
            for (int i8 = 0; i8 < i7; i8++) {
                d3 += Math.abs(fArr[i4 + i8] - fArr[(i4 + i7) + i8]);
            }
            int i9 = i4;
            double d4 = i7;
            if (i5 * d3 < d * d4) {
                i5 = i7;
                d = d3;
            }
            if (i6 * d3 > d4 * d2) {
                i6 = i7;
                d2 = d3;
            }
            i7++;
            i4 = i9;
        }
        this.PolarVoyageBitmapVisionAuroraPixel4705 = d / i5;
        this.PolarVoyageDiffUtilTurboStrike5735 = d2 / i6;
        return i5;
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.PolarVoyageKotlinBetaPulseBeta3653;
        int i2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageMotionLayoutTransitionHeroVision4068;
        asFloatBuffer.put(fArr, 0, i * i2);
        byteBuffer.position((i * 4 * i2) + byteBuffer.position());
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
            float[] fArr = this.PolarVoyageKotlinBetaPulseBeta3653;
            int i4 = (polarVoyageProcessCameraProviderForceSolarMaster1494.PolarVoyageBottomSheetOmegaNeo1907 * i3) + i2;
            float[] fArr2 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            int i5 = (i * i3) + i2;
            float f = fArr2[i5];
            float f2 = fArr2[i5 + i3];
            long j3 = polarVoyageProcessCameraProviderForceSolarMaster1494.PolarVoyageDrawableDeltaHyperion5742 * j;
            long j4 = (r1 + 1) * j2;
            long j5 = j4 - j3;
            fArr[i4] = (((r10 - j5) * f2) + (j5 * f)) / (j4 - (polarVoyageProcessCameraProviderForceSolarMaster1494.PolarVoyageCameraPixelBlaze2629 * j2));
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
            this.PolarVoyageMotionLayoutTransitionHeroVision4068[i + i3] = 0.0f;
        }
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final void PolarVoyageDrawableDeltaHyperion5742() {
        this.PolarVoyageTextInputEditTextNebulaHero6651 = this.PolarVoyageBitmapVisionAuroraPixel4705;
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final void PolarVoyageItemDecorationUltraDeltaEpic7485(int i, int i2, int i3, int i4, int i5) {
        float[] fArr = this.PolarVoyageKotlinBetaPulseBeta3653;
        float[] fArr2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                fArr[i7] = ((fArr2[i8] * i10) + (fArr2[i9] * (i - i10))) / i;
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final boolean PolarVoyageKotlinBetaPulseBeta3653() {
        double d = this.PolarVoyageBitmapVisionAuroraPixel4705;
        return d != 0.0d && this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageContentProviderHyperSpark3838 != 0 && this.PolarVoyageDiffUtilTurboStrike5735 <= d * 3.0d && d * 2.0d > this.PolarVoyageTextInputEditTextNebulaHero6651 * 3.0d;
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(int i) {
        this.PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageNavigationViewHyperHyperHyperion1793(this.PolarVoyageKotlinBetaPulseBeta3653, this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBottomSheetOmegaNeo1907, i);
    }

    public final float[] PolarVoyageNavigationViewHyperHyperHyperion1793(float[] fArr, int i, int i2) {
        int length = fArr.length;
        int i3 = this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i4 = length / i3;
        return i + i2 <= i4 ? fArr : Arrays.copyOf(fArr, (((i4 * 3) / 2) + i2) * i3);
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
        PolarVoyageProcessCameraProviderForceSolarMaster1494 polarVoyageProcessCameraProviderForceSolarMaster1494 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i3 = polarVoyageProcessCameraProviderForceSolarMaster1494.PolarVoyageItemDecorationUltraDeltaEpic7485 / i2;
        int i4 = polarVoyageProcessCameraProviderForceSolarMaster1494.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            double d = 0.0d;
            for (int i8 = 0; i8 < i5; i8++) {
                d += this.PolarVoyageMotionLayoutTransitionHeroVision4068[(i7 * i5) + i6 + i8];
            }
            this.PolarVoyageZipVortexCelestial6185[i7] = (float) (d / i5);
        }
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final Object PolarVoyageTextInputEditTextNebulaHero6651() {
        return this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final int PolarVoyageViewRogueMaster4778() {
        return 4;
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final void PolarVoyageZipVortexCelestial6185(int i, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        PolarVoyageProcessCameraProviderForceSolarMaster1494 polarVoyageProcessCameraProviderForceSolarMaster1494 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        asFloatBuffer.get(fArr, polarVoyageProcessCameraProviderForceSolarMaster1494.PolarVoyageRotateAnimationCyberCelestialDelta4768 * polarVoyageProcessCameraProviderForceSolarMaster1494.PolarVoyageMotionLayoutTransitionHeroVision4068, i / 4);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // p000createpolar.PolarVoyageStrictModeRogueLegendSpeed5357
    public final void flush() {
        this.PolarVoyageTextInputEditTextNebulaHero6651 = 0.0d;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = 0.0d;
        this.PolarVoyageDiffUtilTurboStrike5735 = 0.0d;
    }
}
