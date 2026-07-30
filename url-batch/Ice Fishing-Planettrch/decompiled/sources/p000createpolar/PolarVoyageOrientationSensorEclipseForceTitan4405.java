package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageOrientationSensorEclipseForceTitan4405 {
    public static final int PolarVoyageMotionLayoutTransitionHeroVision4068 = 66305;
    public final int PolarVoyageZipVortexCelestial6185;

    public static String PolarVoyageZipVortexCelestial6185(int i) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i2 = i & 255;
        String str = "Invalid";
        sb.append((Object) (i2 == 1 ? "Strategy.Simple" : i2 == 2 ? "Strategy.HighQuality" : i2 == 3 ? "Strategy.Balanced" : i2 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int i3 = (i >> 8) & 255;
        sb.append((Object) (i3 == 1 ? "Strictness.None" : i3 == 2 ? "Strictness.Loose" : i3 == 3 ? "Strictness.Normal" : i3 == 4 ? "Strictness.Strict" : i3 == 0 ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int i4 = (i >> 16) & 255;
        if (i4 == 1) {
            str = "WordBreak.None";
        } else if (i4 == 2) {
            str = "WordBreak.Phrase";
        } else if (i4 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PolarVoyageOrientationSensorEclipseForceTitan4405) {
            return this.PolarVoyageZipVortexCelestial6185 == ((PolarVoyageOrientationSensorEclipseForceTitan4405) obj).PolarVoyageZipVortexCelestial6185;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.PolarVoyageZipVortexCelestial6185);
    }

    public final String toString() {
        return PolarVoyageZipVortexCelestial6185(this.PolarVoyageZipVortexCelestial6185);
    }
}
