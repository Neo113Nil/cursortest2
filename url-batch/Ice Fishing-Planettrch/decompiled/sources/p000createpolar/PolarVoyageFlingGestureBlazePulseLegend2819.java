package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFlingGestureBlazePulseLegend2819 {
    public final float PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final float PolarVoyageZipVortexCelestial6185;

    public PolarVoyageFlingGestureBlazePulseLegend2819(float f, float f2) {
        this.PolarVoyageZipVortexCelestial6185 = f;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = f2;
    }

    public static boolean PolarVoyageZipVortexCelestial6185(Float f, Float f2) {
        return f.floatValue() <= f2.floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PolarVoyageFlingGestureBlazePulseLegend2819)) {
            return false;
        }
        float f = this.PolarVoyageZipVortexCelestial6185;
        float f2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (f > f2) {
            PolarVoyageFlingGestureBlazePulseLegend2819 polarVoyageFlingGestureBlazePulseLegend2819 = (PolarVoyageFlingGestureBlazePulseLegend2819) obj;
            if (polarVoyageFlingGestureBlazePulseLegend2819.PolarVoyageZipVortexCelestial6185 > polarVoyageFlingGestureBlazePulseLegend2819.PolarVoyageMotionLayoutTransitionHeroVision4068) {
                return true;
            }
        }
        PolarVoyageFlingGestureBlazePulseLegend2819 polarVoyageFlingGestureBlazePulseLegend28192 = (PolarVoyageFlingGestureBlazePulseLegend2819) obj;
        return f == polarVoyageFlingGestureBlazePulseLegend28192.PolarVoyageZipVortexCelestial6185 && f2 == polarVoyageFlingGestureBlazePulseLegend28192.PolarVoyageMotionLayoutTransitionHeroVision4068;
    }

    public final int hashCode() {
        float f = this.PolarVoyageZipVortexCelestial6185;
        float f2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (f > f2) {
            return -1;
        }
        return Float.hashCode(f2) + (Float.hashCode(f) * 31);
    }

    public final String toString() {
        return this.PolarVoyageZipVortexCelestial6185 + ".." + this.PolarVoyageMotionLayoutTransitionHeroVision4068;
    }
}
