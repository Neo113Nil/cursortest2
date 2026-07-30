package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLooperGammaInferno3959 {
    public final int PolarVoyageKotlinBetaPulseBeta3653;
    public final long PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final String PolarVoyageZipVortexCelestial6185;

    public PolarVoyageLooperGammaInferno3959(int i, long j, String str) {
        this.PolarVoyageZipVortexCelestial6185 = str;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = j;
        this.PolarVoyageKotlinBetaPulseBeta3653 = i;
    }

    public static PolarVoyageImageCaptureShadowBlaze1163 PolarVoyageZipVortexCelestial6185() {
        byte b = 0;
        PolarVoyageImageCaptureShadowBlaze1163 polarVoyageImageCaptureShadowBlaze1163 = new PolarVoyageImageCaptureShadowBlaze1163(b, b);
        polarVoyageImageCaptureShadowBlaze1163.PolarVoyageBottomSheetOmegaNeo1907 = 0L;
        return polarVoyageImageCaptureShadowBlaze1163;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PolarVoyageLooperGammaInferno3959)) {
            return false;
        }
        PolarVoyageLooperGammaInferno3959 polarVoyageLooperGammaInferno3959 = (PolarVoyageLooperGammaInferno3959) obj;
        String str = polarVoyageLooperGammaInferno3959.PolarVoyageZipVortexCelestial6185;
        String str2 = this.PolarVoyageZipVortexCelestial6185;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.PolarVoyageMotionLayoutTransitionHeroVision4068 != polarVoyageLooperGammaInferno3959.PolarVoyageMotionLayoutTransitionHeroVision4068) {
            return false;
        }
        int i = polarVoyageLooperGammaInferno3959.PolarVoyageKotlinBetaPulseBeta3653;
        int i2 = this.PolarVoyageKotlinBetaPulseBeta3653;
        return i2 == 0 ? i == 0 : PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageZipVortexCelestial6185(i2, i);
    }

    public final int hashCode() {
        String str = this.PolarVoyageZipVortexCelestial6185;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i2 = this.PolarVoyageKotlinBetaPulseBeta3653;
        return i ^ (i2 != 0 ? PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageLooperThreadAlphaPrime1279(i2) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.PolarVoyageZipVortexCelestial6185);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.PolarVoyageMotionLayoutTransitionHeroVision4068);
        sb.append(", responseCode=");
        int i = this.PolarVoyageKotlinBetaPulseBeta3653;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
