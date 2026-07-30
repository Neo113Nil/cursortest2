package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageFontFamilyHyperionStorm1277 {
    public final int PolarVoyageKotlinBetaPulseBeta3653;
    public final long PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final String PolarVoyageZipVortexCelestial6185;

    public PolarVoyageFontFamilyHyperionStorm1277(int i, long j, String str) {
        this.PolarVoyageZipVortexCelestial6185 = str;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = j;
        this.PolarVoyageKotlinBetaPulseBeta3653 = i;
        if (str.length() == 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract long PolarVoyageBarcodeScannerInfernoSolarSpark7767(float f, float f2, float f3);

    public abstract float PolarVoyageBitmapVisionAuroraPixel4705(float f, float f2, float f3);

    public abstract long PolarVoyageDiffUtilTurboStrike5735(float f, float f2, float f3, float f4, PolarVoyageFontFamilyHyperionStorm1277 polarVoyageFontFamilyHyperionStorm1277);

    public boolean PolarVoyageKotlinBetaPulseBeta3653() {
        return false;
    }

    public abstract float PolarVoyageMotionLayoutTransitionHeroVision4068(int i);

    public abstract float PolarVoyageZipVortexCelestial6185(int i);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolarVoyageFontFamilyHyperionStorm1277 polarVoyageFontFamilyHyperionStorm1277 = (PolarVoyageFontFamilyHyperionStorm1277) obj;
        if (this.PolarVoyageKotlinBetaPulseBeta3653 == polarVoyageFontFamilyHyperionStorm1277.PolarVoyageKotlinBetaPulseBeta3653 && this.PolarVoyageZipVortexCelestial6185.equals(polarVoyageFontFamilyHyperionStorm1277.PolarVoyageZipVortexCelestial6185)) {
            return PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageDisplayMetricsVortexDragon9516(this.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageFontFamilyHyperionStorm1277.PolarVoyageMotionLayoutTransitionHeroVision4068);
        }
        return false;
    }

    public int hashCode() {
        return PolarVoyageRealtimeDatabaseCyberShadowForce7689.PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageZipVortexCelestial6185.hashCode() * 31, 31, this.PolarVoyageMotionLayoutTransitionHeroVision4068) + this.PolarVoyageKotlinBetaPulseBeta3653;
    }

    public final String toString() {
        return this.PolarVoyageZipVortexCelestial6185 + " (id=" + this.PolarVoyageKotlinBetaPulseBeta3653 + ", model=" + ((Object) PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageFlowOnBetaCyber2473(this.PolarVoyageMotionLayoutTransitionHeroVision4068)) + ')';
    }
}
