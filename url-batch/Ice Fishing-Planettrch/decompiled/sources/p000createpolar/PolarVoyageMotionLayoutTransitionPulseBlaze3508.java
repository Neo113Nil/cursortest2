package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMotionLayoutTransitionPulseBlaze3508 {
    public double PolarVoyageMotionLayoutTransitionHeroVision4068;
    public float PolarVoyageZipVortexCelestial6185;

    public final long PolarVoyageZipVortexCelestial6185(float f, float f2, long j) {
        float f3 = f - this.PolarVoyageZipVortexCelestial6185;
        double d = j / 1000.0d;
        double d2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        double d3 = f3;
        double d4 = (d2 * d3) + f2;
        double d5 = (-d2) * d;
        double d6 = (d * d4) + d3;
        double exp = Math.exp(d5) * d6;
        double exp2 = (Math.exp(d5) * d4) + (Math.exp(d5) * d6 * (-this.PolarVoyageMotionLayoutTransitionHeroVision4068));
        return (Float.floatToRawIntBits((float) exp2) & 4294967295L) | (Float.floatToRawIntBits((float) (exp + this.PolarVoyageZipVortexCelestial6185)) << 32);
    }
}
