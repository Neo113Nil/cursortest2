package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFirestoreBetaQuantum3615 implements Comparable {
    public final float PolarVoyageItemDecorationUltraDeltaEpic7485;

    public static String PolarVoyageMotionLayoutTransitionHeroVision4068(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    public static final boolean PolarVoyageZipVortexCelestial6185(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.PolarVoyageItemDecorationUltraDeltaEpic7485, ((PolarVoyageFirestoreBetaQuantum3615) obj).PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PolarVoyageFirestoreBetaQuantum3615) {
            return Float.compare(this.PolarVoyageItemDecorationUltraDeltaEpic7485, ((PolarVoyageFirestoreBetaQuantum3615) obj).PolarVoyageItemDecorationUltraDeltaEpic7485) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    public final String toString() {
        return PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }
}
