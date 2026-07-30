package p000createpolar;

import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePaintStormGammaSpectra4467 {
    public float[] PolarVoyageKotlinBetaPulseBeta3653;
    public RectF PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final Path PolarVoyageZipVortexCelestial6185;

    public PolarVoyagePaintStormGammaSpectra4467(Path path) {
        this.PolarVoyageZipVortexCelestial6185 = path;
    }

    public static void PolarVoyageZipVortexCelestial6185(PolarVoyagePaintStormGammaSpectra4467 polarVoyagePaintStormGammaSpectra4467, PolarVoyageProcessCameraProviderSolarEpic3119 polarVoyageProcessCameraProviderSolarEpic3119) {
        if (polarVoyagePaintStormGammaSpectra4467.PolarVoyageMotionLayoutTransitionHeroVision4068 == null) {
            polarVoyagePaintStormGammaSpectra4467.PolarVoyageMotionLayoutTransitionHeroVision4068 = new RectF();
        }
        RectF rectF = polarVoyagePaintStormGammaSpectra4467.PolarVoyageMotionLayoutTransitionHeroVision4068;
        rectF.getClass();
        float f = polarVoyageProcessCameraProviderSolarEpic3119.PolarVoyageZipVortexCelestial6185;
        long j = polarVoyageProcessCameraProviderSolarEpic3119.PolarVoyageItemDecorationUltraDeltaEpic7485;
        long j2 = polarVoyageProcessCameraProviderSolarEpic3119.PolarVoyageTextInputEditTextNebulaHero6651;
        long j3 = polarVoyageProcessCameraProviderSolarEpic3119.PolarVoyageDiffUtilTurboStrike5735;
        long j4 = polarVoyageProcessCameraProviderSolarEpic3119.PolarVoyageBitmapVisionAuroraPixel4705;
        rectF.set(f, polarVoyageProcessCameraProviderSolarEpic3119.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageProcessCameraProviderSolarEpic3119.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageProcessCameraProviderSolarEpic3119.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
        if (polarVoyagePaintStormGammaSpectra4467.PolarVoyageKotlinBetaPulseBeta3653 == null) {
            polarVoyagePaintStormGammaSpectra4467.PolarVoyageKotlinBetaPulseBeta3653 = new float[8];
        }
        float[] fArr = polarVoyagePaintStormGammaSpectra4467.PolarVoyageKotlinBetaPulseBeta3653;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = polarVoyagePaintStormGammaSpectra4467.PolarVoyageZipVortexCelestial6185;
        RectF rectF2 = polarVoyagePaintStormGammaSpectra4467.PolarVoyageMotionLayoutTransitionHeroVision4068;
        rectF2.getClass();
        float[] fArr2 = polarVoyagePaintStormGammaSpectra4467.PolarVoyageKotlinBetaPulseBeta3653;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(float f, float f2) {
        this.PolarVoyageZipVortexCelestial6185.lineTo(f, f2);
    }

    public final boolean PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyagePaintStormGammaSpectra4467 polarVoyagePaintStormGammaSpectra4467, PolarVoyagePaintStormGammaSpectra4467 polarVoyagePaintStormGammaSpectra44672, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(polarVoyagePaintStormGammaSpectra4467 instanceof PolarVoyagePaintStormGammaSpectra4467)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = polarVoyagePaintStormGammaSpectra4467.PolarVoyageZipVortexCelestial6185;
        if (polarVoyagePaintStormGammaSpectra44672 instanceof PolarVoyagePaintStormGammaSpectra4467) {
            return this.PolarVoyageZipVortexCelestial6185.op(path, polarVoyagePaintStormGammaSpectra44672.PolarVoyageZipVortexCelestial6185, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final PolarVoyageCardViewPulseSpark7250 PolarVoyageKotlinBetaPulseBeta3653() {
        if (this.PolarVoyageMotionLayoutTransitionHeroVision4068 == null) {
            this.PolarVoyageMotionLayoutTransitionHeroVision4068 = new RectF();
        }
        RectF rectF = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        rectF.getClass();
        this.PolarVoyageZipVortexCelestial6185.computeBounds(rectF, true);
        return new PolarVoyageCardViewPulseSpark7250(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(float f, float f2, float f3, float f4, float f5, float f6) {
        this.PolarVoyageZipVortexCelestial6185.cubicTo(f, f2, f3, f4, f5, f6);
    }
}
