package p000createpolar;

import java.util.Set;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageDataBindingForceDragonEclipse4522 {
    public final Set PolarVoyageKotlinBetaPulseBeta3653;
    public final long PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final long PolarVoyageZipVortexCelestial6185;

    public PolarVoyageDataBindingForceDragonEclipse4522(long j, long j2, Set set) {
        this.PolarVoyageZipVortexCelestial6185 = j;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = j2;
        this.PolarVoyageKotlinBetaPulseBeta3653 = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PolarVoyageDataBindingForceDragonEclipse4522) {
            PolarVoyageDataBindingForceDragonEclipse4522 polarVoyageDataBindingForceDragonEclipse4522 = (PolarVoyageDataBindingForceDragonEclipse4522) obj;
            if (this.PolarVoyageZipVortexCelestial6185 == polarVoyageDataBindingForceDragonEclipse4522.PolarVoyageZipVortexCelestial6185 && this.PolarVoyageMotionLayoutTransitionHeroVision4068 == polarVoyageDataBindingForceDragonEclipse4522.PolarVoyageMotionLayoutTransitionHeroVision4068 && this.PolarVoyageKotlinBetaPulseBeta3653.equals(polarVoyageDataBindingForceDragonEclipse4522.PolarVoyageKotlinBetaPulseBeta3653)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.PolarVoyageZipVortexCelestial6185;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        return this.PolarVoyageKotlinBetaPulseBeta3653.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.PolarVoyageZipVortexCelestial6185 + ", maxAllowedDelay=" + this.PolarVoyageMotionLayoutTransitionHeroVision4068 + ", flags=" + this.PolarVoyageKotlinBetaPulseBeta3653 + "}";
    }
}
