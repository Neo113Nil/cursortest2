package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTraceAuroraOmega8225 {
    public final int PolarVoyageZipVortexCelestial6185;

    public static String PolarVoyageZipVortexCelestial6185(int i) {
        return i == 1 ? "Hyphens.None" : i == 2 ? "Hyphens.Auto" : i == Integer.MIN_VALUE ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PolarVoyageTraceAuroraOmega8225) {
            return this.PolarVoyageZipVortexCelestial6185 == ((PolarVoyageTraceAuroraOmega8225) obj).PolarVoyageZipVortexCelestial6185;
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
