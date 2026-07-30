package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageObserverThunderEclipseEpic5402 {
    public final float PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final float PolarVoyageZipVortexCelestial6185;

    public PolarVoyageObserverThunderEclipseEpic5402(float f, PolarVoyageEditTextAuroraHeroPulse9577 polarVoyageEditTextAuroraHeroPulse9577) {
        this.PolarVoyageZipVortexCelestial6185 = f;
        float PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageEditTextAuroraHeroPulse9577.PolarVoyageMotionLayoutTransitionHeroVision4068();
        float f2 = PolarVoyagePlaceholderAlphaNeo3893.PolarVoyageZipVortexCelestial6185;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068 * 386.0878f * 160.0f * 0.84f;
    }

    public final double PolarVoyageMotionLayoutTransitionHeroVision4068(float f) {
        float[] fArr = PolarVoyageLayoutInflaterMaxRogue9993.PolarVoyageZipVortexCelestial6185;
        return Math.log((Math.abs(f) * 0.35f) / (this.PolarVoyageZipVortexCelestial6185 * this.PolarVoyageMotionLayoutTransitionHeroVision4068));
    }

    public final PolarVoyageLooperThreadLegendSolar2555 PolarVoyageZipVortexCelestial6185(float f) {
        double PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068(f);
        double d = PolarVoyagePlaceholderAlphaNeo3893.PolarVoyageZipVortexCelestial6185;
        double d2 = d - 1.0d;
        return new PolarVoyageLooperThreadLegendSolar2555(f, (float) (Math.exp((d / d2) * PolarVoyageMotionLayoutTransitionHeroVision4068) * this.PolarVoyageZipVortexCelestial6185 * this.PolarVoyageMotionLayoutTransitionHeroVision4068), (long) (Math.exp(PolarVoyageMotionLayoutTransitionHeroVision4068 / d2) * 1000.0d));
    }
}
