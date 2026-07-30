package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageCoroutineBlazeVortex4945 {
    public final int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final Object PolarVoyageBitmapVisionAuroraPixel4705;
    public final int PolarVoyageKotlinBetaPulseBeta3653;
    public final PolarVoyagePaintSolarElite8455 PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final PolarVoyageInputFilterNeoSpark8169 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageCoroutineBlazeVortex4945(PolarVoyageInputFilterNeoSpark8169 polarVoyageInputFilterNeoSpark8169, PolarVoyagePaintSolarElite8455 polarVoyagePaintSolarElite8455, int i, int i2, Object obj) {
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageInputFilterNeoSpark8169;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyagePaintSolarElite8455;
        this.PolarVoyageKotlinBetaPulseBeta3653 = i;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i2;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolarVoyageCoroutineBlazeVortex4945)) {
            return false;
        }
        PolarVoyageCoroutineBlazeVortex4945 polarVoyageCoroutineBlazeVortex4945 = (PolarVoyageCoroutineBlazeVortex4945) obj;
        return PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageZipVortexCelestial6185, polarVoyageCoroutineBlazeVortex4945.PolarVoyageZipVortexCelestial6185) && PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageCoroutineBlazeVortex4945.PolarVoyageMotionLayoutTransitionHeroVision4068) && this.PolarVoyageKotlinBetaPulseBeta3653 == polarVoyageCoroutineBlazeVortex4945.PolarVoyageKotlinBetaPulseBeta3653 && this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == polarVoyageCoroutineBlazeVortex4945.PolarVoyageBarcodeScannerInfernoSolarSpark7767 && PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageBitmapVisionAuroraPixel4705, polarVoyageCoroutineBlazeVortex4945.PolarVoyageBitmapVisionAuroraPixel4705);
    }

    public final int hashCode() {
        PolarVoyageInputFilterNeoSpark8169 polarVoyageInputFilterNeoSpark8169 = this.PolarVoyageZipVortexCelestial6185;
        int PolarVoyageZipVortexCelestial6185 = PolarVoyageRealtimeDatabaseCyberShadowForce7689.PolarVoyageZipVortexCelestial6185(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767, PolarVoyageRealtimeDatabaseCyberShadowForce7689.PolarVoyageZipVortexCelestial6185(this.PolarVoyageKotlinBetaPulseBeta3653, (((polarVoyageInputFilterNeoSpark8169 == null ? 0 : polarVoyageInputFilterNeoSpark8169.hashCode()) * 31) + this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageItemDecorationUltraDeltaEpic7485) * 31, 31), 31);
        Object obj = this.PolarVoyageBitmapVisionAuroraPixel4705;
        return PolarVoyageZipVortexCelestial6185 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.PolarVoyageZipVortexCelestial6185);
        sb.append(", fontWeight=");
        sb.append(this.PolarVoyageMotionLayoutTransitionHeroVision4068);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.PolarVoyageKotlinBetaPulseBeta3653;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.PolarVoyageBitmapVisionAuroraPixel4705);
        sb.append(')');
        return sb.toString();
    }
}
