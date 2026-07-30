package p000createpolar;

import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageButtonNeoNebulaAurora5705 implements PolarVoyageExecutorCosmosBlaze9733 {
    public final float[] PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final float[] PolarVoyageZipVortexCelestial6185;

    public PolarVoyageButtonNeoNebulaAurora5705(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Array lengths must match and be nonzero");
            throw null;
        }
        this.PolarVoyageZipVortexCelestial6185 = fArr;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = fArr2;
    }

    @Override // p000createpolar.PolarVoyageExecutorCosmosBlaze9733
    public final float PolarVoyageMotionLayoutTransitionHeroVision4068(float f) {
        return PolarVoyagePreviewDeltaVisionCyber7933.PolarVoyageBarcodeScannerInfernoSolarSpark7767(f, this.PolarVoyageZipVortexCelestial6185, this.PolarVoyageMotionLayoutTransitionHeroVision4068);
    }

    @Override // p000createpolar.PolarVoyageExecutorCosmosBlaze9733
    public final float PolarVoyageZipVortexCelestial6185(float f) {
        return PolarVoyagePreviewDeltaVisionCyber7933.PolarVoyageBarcodeScannerInfernoSolarSpark7767(f, this.PolarVoyageMotionLayoutTransitionHeroVision4068, this.PolarVoyageZipVortexCelestial6185);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PolarVoyageButtonNeoNebulaAurora5705)) {
            return false;
        }
        PolarVoyageButtonNeoNebulaAurora5705 polarVoyageButtonNeoNebulaAurora5705 = (PolarVoyageButtonNeoNebulaAurora5705) obj;
        return Arrays.equals(this.PolarVoyageZipVortexCelestial6185, polarVoyageButtonNeoNebulaAurora5705.PolarVoyageZipVortexCelestial6185) && Arrays.equals(this.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageButtonNeoNebulaAurora5705.PolarVoyageMotionLayoutTransitionHeroVision4068);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.PolarVoyageMotionLayoutTransitionHeroVision4068) + (Arrays.hashCode(this.PolarVoyageZipVortexCelestial6185) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.PolarVoyageZipVortexCelestial6185);
        arrays.getClass();
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.PolarVoyageMotionLayoutTransitionHeroVision4068);
        arrays2.getClass();
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
