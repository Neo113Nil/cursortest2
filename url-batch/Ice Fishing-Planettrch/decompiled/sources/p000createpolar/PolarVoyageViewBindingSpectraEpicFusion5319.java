package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageViewBindingSpectraEpicFusion5319 {
    public final long PolarVoyageKotlinBetaPulseBeta3653;
    public final long PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final long PolarVoyageZipVortexCelestial6185;

    public PolarVoyageViewBindingSpectraEpicFusion5319(long j, long j2, long j3) {
        this.PolarVoyageZipVortexCelestial6185 = j;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = j2;
        this.PolarVoyageKotlinBetaPulseBeta3653 = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PolarVoyageViewBindingSpectraEpicFusion5319) {
            PolarVoyageViewBindingSpectraEpicFusion5319 polarVoyageViewBindingSpectraEpicFusion5319 = (PolarVoyageViewBindingSpectraEpicFusion5319) obj;
            if (this.PolarVoyageZipVortexCelestial6185 == polarVoyageViewBindingSpectraEpicFusion5319.PolarVoyageZipVortexCelestial6185 && this.PolarVoyageMotionLayoutTransitionHeroVision4068 == polarVoyageViewBindingSpectraEpicFusion5319.PolarVoyageMotionLayoutTransitionHeroVision4068 && this.PolarVoyageKotlinBetaPulseBeta3653 == polarVoyageViewBindingSpectraEpicFusion5319.PolarVoyageKotlinBetaPulseBeta3653) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.PolarVoyageZipVortexCelestial6185;
        long j2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.PolarVoyageKotlinBetaPulseBeta3653;
        return ((int) ((j3 >>> 32) ^ j3)) ^ i;
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.PolarVoyageZipVortexCelestial6185 + ", elapsedRealtime=" + this.PolarVoyageMotionLayoutTransitionHeroVision4068 + ", uptimeMillis=" + this.PolarVoyageKotlinBetaPulseBeta3653 + "}";
    }
}
