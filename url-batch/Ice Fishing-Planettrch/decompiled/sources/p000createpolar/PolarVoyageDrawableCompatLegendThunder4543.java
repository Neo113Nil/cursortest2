package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageDrawableCompatLegendThunder4543 {
    public final PolarVoyageLooperGammaInferno3959 PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final int PolarVoyageBitmapVisionAuroraPixel4705;
    public final String PolarVoyageKotlinBetaPulseBeta3653;
    public final String PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final String PolarVoyageZipVortexCelestial6185;

    public PolarVoyageDrawableCompatLegendThunder4543(String str, String str2, String str3, PolarVoyageLooperGammaInferno3959 polarVoyageLooperGammaInferno3959, int i) {
        this.PolarVoyageZipVortexCelestial6185 = str;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = str2;
        this.PolarVoyageKotlinBetaPulseBeta3653 = str3;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageLooperGammaInferno3959;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PolarVoyageDrawableCompatLegendThunder4543)) {
            return false;
        }
        PolarVoyageDrawableCompatLegendThunder4543 polarVoyageDrawableCompatLegendThunder4543 = (PolarVoyageDrawableCompatLegendThunder4543) obj;
        String str = polarVoyageDrawableCompatLegendThunder4543.PolarVoyageZipVortexCelestial6185;
        String str2 = this.PolarVoyageZipVortexCelestial6185;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = polarVoyageDrawableCompatLegendThunder4543.PolarVoyageMotionLayoutTransitionHeroVision4068;
        String str4 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = polarVoyageDrawableCompatLegendThunder4543.PolarVoyageKotlinBetaPulseBeta3653;
        String str6 = this.PolarVoyageKotlinBetaPulseBeta3653;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        PolarVoyageLooperGammaInferno3959 polarVoyageLooperGammaInferno3959 = polarVoyageDrawableCompatLegendThunder4543.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        PolarVoyageLooperGammaInferno3959 polarVoyageLooperGammaInferno39592 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (polarVoyageLooperGammaInferno39592 == null) {
            if (polarVoyageLooperGammaInferno3959 != null) {
                return false;
            }
        } else if (!polarVoyageLooperGammaInferno39592.equals(polarVoyageLooperGammaInferno3959)) {
            return false;
        }
        int i = polarVoyageDrawableCompatLegendThunder4543.PolarVoyageBitmapVisionAuroraPixel4705;
        int i2 = this.PolarVoyageBitmapVisionAuroraPixel4705;
        return i2 == 0 ? i == 0 : PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageZipVortexCelestial6185(i2, i);
    }

    public final int hashCode() {
        String str = this.PolarVoyageZipVortexCelestial6185;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.PolarVoyageKotlinBetaPulseBeta3653;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        PolarVoyageLooperGammaInferno3959 polarVoyageLooperGammaInferno3959 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int hashCode4 = (hashCode3 ^ (polarVoyageLooperGammaInferno3959 == null ? 0 : polarVoyageLooperGammaInferno3959.hashCode())) * 1000003;
        int i = this.PolarVoyageBitmapVisionAuroraPixel4705;
        return hashCode4 ^ (i != 0 ? PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageLooperThreadAlphaPrime1279(i) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.PolarVoyageZipVortexCelestial6185);
        sb.append(", fid=");
        sb.append(this.PolarVoyageMotionLayoutTransitionHeroVision4068);
        sb.append(", refreshToken=");
        sb.append(this.PolarVoyageKotlinBetaPulseBeta3653);
        sb.append(", authToken=");
        sb.append(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
        sb.append(", responseCode=");
        int i = this.PolarVoyageBitmapVisionAuroraPixel4705;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
