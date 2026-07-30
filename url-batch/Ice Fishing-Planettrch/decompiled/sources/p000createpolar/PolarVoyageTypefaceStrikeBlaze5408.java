package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTypefaceStrikeBlaze5408 {
    public final PolarVoyageFragmentManagerEliteStrikeOlympian2692 PolarVoyageZipVortexCelestial6185;

    static {
        new PolarVoyageTypefaceStrikeBlaze5408("", 0, 0);
    }

    public PolarVoyageTypefaceStrikeBlaze5408(String str, int i, int i2) {
        this.PolarVoyageZipVortexCelestial6185 = new PolarVoyageFragmentManagerEliteStrikeOlympian2692(str, i, i2);
    }

    public static PolarVoyageTypefaceStrikeBlaze5408 PolarVoyageZipVortexCelestial6185(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        String sb;
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            sb = "M0," + i8 + " A" + i7 + "," + i8 + " 0 1,1 " + i + "," + i8 + " A" + i7 + "," + i8 + " 0 1,1 0," + i8 + " Z";
        } else {
            StringBuilder sb2 = new StringBuilder("M ");
            int min = Math.min(i / 2, i2 / 2);
            int min2 = Math.min(min, i3);
            int min3 = Math.min(min, i4);
            int min4 = Math.min(min, i5);
            int min5 = Math.min(min, i6);
            sb2.append(min2);
            sb2.append(",0 L ");
            sb2.append(i - min3);
            sb2.append(",0");
            if (min3 > 0) {
                sb2.append(" A ");
                sb2.append(min3);
                sb2.append(",");
                sb2.append(min3);
                sb2.append(" 0 0,1 ");
                sb2.append(i);
                sb2.append(",");
                sb2.append(min3);
            }
            sb2.append(" L ");
            sb2.append(i);
            sb2.append(",");
            sb2.append(i2 - min4);
            if (min4 > 0) {
                sb2.append(" A ");
                sb2.append(min4);
                sb2.append(",");
                sb2.append(min4);
                sb2.append(" 0 0,1 ");
                sb2.append(i - min4);
                sb2.append(",");
                sb2.append(i2);
            }
            sb2.append(" L ");
            sb2.append(min5);
            sb2.append(",");
            sb2.append(i2);
            if (min5 > 0) {
                sb2.append(" A ");
                sb2.append(min5);
                sb2.append(",");
                sb2.append(min5);
                sb2.append(" 0 0,1 0,");
                sb2.append(i2 - min5);
            }
            if (min2 > 0) {
                sb2.append(" L 0,");
                sb2.append(min2);
                sb2.append(" A ");
                sb2.append(min2);
                sb2.append(",");
                sb2.append(min2);
                sb2.append(" 0 0,1 ");
                sb2.append(min2);
                sb2.append(",0");
            }
            sb2.append(" Z");
            sb = sb2.toString();
        }
        return new PolarVoyageTypefaceStrikeBlaze5408(sb, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PolarVoyageTypefaceStrikeBlaze5408) {
            return this.PolarVoyageZipVortexCelestial6185.equals(((PolarVoyageTypefaceStrikeBlaze5408) obj).PolarVoyageZipVortexCelestial6185);
        }
        return false;
    }

    public final int hashCode() {
        return this.PolarVoyageZipVortexCelestial6185.hashCode();
    }

    public final String toString() {
        return this.PolarVoyageZipVortexCelestial6185.toString();
    }
}
