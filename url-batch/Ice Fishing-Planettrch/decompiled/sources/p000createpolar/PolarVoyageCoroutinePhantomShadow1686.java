package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public interface PolarVoyageCoroutinePhantomShadow1686 {
    public static final PolarVoyageNavigationViewAuroraStrike6665 PolarVoyageZipVortexCelestial6185 = PolarVoyageNavigationViewAuroraStrike6665.PolarVoyageZipVortexCelestial6185;

    default float PolarVoyageZipVortexCelestial6185(float f, float f2, float f3) {
        PolarVoyageZipVortexCelestial6185.getClass();
        float f4 = f2 + f;
        if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        return Math.abs(f) < Math.abs(f5) ? f : f5;
    }
}
