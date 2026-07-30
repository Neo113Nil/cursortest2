package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageRotateDrawableLegendForce9155 implements PolarVoyageRemoteConfigEliteSpectra7350 {
    public static final Object PolarVoyageKotlinBetaPulseBeta3653 = new Object();
    public volatile PolarVoyageRemoteConfigEliteSpectra7350 PolarVoyageMotionLayoutTransitionHeroVision4068;
    public volatile Object PolarVoyageZipVortexCelestial6185 = PolarVoyageKotlinBetaPulseBeta3653;

    public PolarVoyageRotateDrawableLegendForce9155(PolarVoyageRemoteConfigEliteSpectra7350 polarVoyageRemoteConfigEliteSpectra7350) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageRemoteConfigEliteSpectra7350;
    }

    @Override // p000createpolar.PolarVoyageRemoteConfigEliteSpectra7350
    public final Object get() {
        Object obj;
        Object obj2 = this.PolarVoyageZipVortexCelestial6185;
        Object obj3 = PolarVoyageKotlinBetaPulseBeta3653;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.PolarVoyageZipVortexCelestial6185;
                if (obj == obj3) {
                    obj = this.PolarVoyageMotionLayoutTransitionHeroVision4068.get();
                    this.PolarVoyageZipVortexCelestial6185 = obj;
                    this.PolarVoyageMotionLayoutTransitionHeroVision4068 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
