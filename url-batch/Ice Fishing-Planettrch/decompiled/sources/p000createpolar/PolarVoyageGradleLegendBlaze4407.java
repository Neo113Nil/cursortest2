package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageGradleLegendBlaze4407 {
    public final float PolarVoyageKotlinBetaPulseBeta3653;
    public final int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final int PolarVoyageZipVortexCelestial6185;

    public PolarVoyageGradleLegendBlaze4407(float f, int i, int i2) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i2;
        this.PolarVoyageKotlinBetaPulseBeta3653 = f;
    }

    public static PolarVoyageGradleLegendBlaze4407 PolarVoyageZipVortexCelestial6185(int i) {
        int i2 = (i >> 13) & 7;
        if (i2 == 0) {
            return null;
        }
        return new PolarVoyageGradleLegendBlaze4407(((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f, i2, (i >> 10) & 7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PolarVoyageGradleLegendBlaze4407)) {
            return false;
        }
        PolarVoyageGradleLegendBlaze4407 polarVoyageGradleLegendBlaze4407 = (PolarVoyageGradleLegendBlaze4407) obj;
        return this.PolarVoyageZipVortexCelestial6185 == polarVoyageGradleLegendBlaze4407.PolarVoyageZipVortexCelestial6185 && this.PolarVoyageMotionLayoutTransitionHeroVision4068 == polarVoyageGradleLegendBlaze4407.PolarVoyageMotionLayoutTransitionHeroVision4068 && Float.compare(this.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageGradleLegendBlaze4407.PolarVoyageKotlinBetaPulseBeta3653) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.PolarVoyageKotlinBetaPulseBeta3653) + (((this.PolarVoyageZipVortexCelestial6185 * 31) + this.PolarVoyageMotionLayoutTransitionHeroVision4068) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GainField{name=");
        sb.append(this.PolarVoyageZipVortexCelestial6185);
        sb.append(", originator=");
        sb.append(this.PolarVoyageMotionLayoutTransitionHeroVision4068);
        sb.append(", gain=");
        return PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageViewRogueMaster4778(sb, this.PolarVoyageKotlinBetaPulseBeta3653, '}');
    }
}
