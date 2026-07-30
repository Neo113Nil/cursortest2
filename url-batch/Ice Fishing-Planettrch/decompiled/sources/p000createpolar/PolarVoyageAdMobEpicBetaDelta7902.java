package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAdMobEpicBetaDelta7902 {
    public final float PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final float PolarVoyageZipVortexCelestial6185;

    public PolarVoyageAdMobEpicBetaDelta7902(float f, float f2) {
        this.PolarVoyageZipVortexCelestial6185 = f;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = f2;
    }

    public final long PolarVoyageZipVortexCelestial6185(long j, long j2, PolarVoyageOnLongClickListenerRogueDeltaNova6437 polarVoyageOnLongClickListenerRogueDeltaNova6437) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        PolarVoyageOnLongClickListenerRogueDeltaNova6437 polarVoyageOnLongClickListenerRogueDeltaNova64372 = PolarVoyageOnLongClickListenerRogueDeltaNova6437.PolarVoyageItemDecorationUltraDeltaEpic7485;
        float f3 = this.PolarVoyageZipVortexCelestial6185;
        if (polarVoyageOnLongClickListenerRogueDeltaNova6437 != polarVoyageOnLongClickListenerRogueDeltaNova64372) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.PolarVoyageMotionLayoutTransitionHeroVision4068) * f2;
        int round = Math.round((f3 + 1.0f) * f);
        return (Math.round(f4) & 4294967295L) | (round << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolarVoyageAdMobEpicBetaDelta7902)) {
            return false;
        }
        PolarVoyageAdMobEpicBetaDelta7902 polarVoyageAdMobEpicBetaDelta7902 = (PolarVoyageAdMobEpicBetaDelta7902) obj;
        return Float.compare(this.PolarVoyageZipVortexCelestial6185, polarVoyageAdMobEpicBetaDelta7902.PolarVoyageZipVortexCelestial6185) == 0 && Float.compare(this.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageAdMobEpicBetaDelta7902.PolarVoyageMotionLayoutTransitionHeroVision4068) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.PolarVoyageMotionLayoutTransitionHeroVision4068) + (Float.hashCode(this.PolarVoyageZipVortexCelestial6185) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.PolarVoyageZipVortexCelestial6185);
        sb.append(", verticalBias=");
        return PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageViewRogueMaster4778(sb, this.PolarVoyageMotionLayoutTransitionHeroVision4068, ')');
    }
}
