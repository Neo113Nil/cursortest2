package p000createpolar;

import android.graphics.Point;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFocusMeteringActionSpectraLegendForce9442 {
    public final Point PolarVoyageKotlinBetaPulseBeta3653;
    public final int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final int PolarVoyageZipVortexCelestial6185;

    public PolarVoyageFocusMeteringActionSpectraLegendForce9442(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.PolarVoyageZipVortexCelestial6185 = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i2;
        this.PolarVoyageKotlinBetaPulseBeta3653 = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PolarVoyageFocusMeteringActionSpectraLegendForce9442) {
            PolarVoyageFocusMeteringActionSpectraLegendForce9442 polarVoyageFocusMeteringActionSpectraLegendForce9442 = (PolarVoyageFocusMeteringActionSpectraLegendForce9442) obj;
            if (this.PolarVoyageZipVortexCelestial6185 == polarVoyageFocusMeteringActionSpectraLegendForce9442.PolarVoyageZipVortexCelestial6185 && this.PolarVoyageMotionLayoutTransitionHeroVision4068 == polarVoyageFocusMeteringActionSpectraLegendForce9442.PolarVoyageMotionLayoutTransitionHeroVision4068 && this.PolarVoyageKotlinBetaPulseBeta3653.equals(polarVoyageFocusMeteringActionSpectraLegendForce9442.PolarVoyageKotlinBetaPulseBeta3653)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.PolarVoyageKotlinBetaPulseBeta3653.hashCode() + (((this.PolarVoyageZipVortexCelestial6185 * 31) + this.PolarVoyageMotionLayoutTransitionHeroVision4068) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.PolarVoyageZipVortexCelestial6185;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.PolarVoyageMotionLayoutTransitionHeroVision4068);
        sb.append(", center=");
        sb.append(this.PolarVoyageKotlinBetaPulseBeta3653);
        sb.append('}');
        return sb.toString();
    }
}
