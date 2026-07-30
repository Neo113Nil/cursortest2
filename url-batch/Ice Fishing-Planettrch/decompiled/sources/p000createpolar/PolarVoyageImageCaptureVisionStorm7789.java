package p000createpolar;

import java.util.ArrayList;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageImageCaptureVisionStorm7789 {
    public final int PolarVoyageZipVortexCelestial6185;
    public static final PolarVoyageImageCaptureVisionStorm7789 PolarVoyageMotionLayoutTransitionHeroVision4068 = new PolarVoyageImageCaptureVisionStorm7789(0);
    public static final PolarVoyageImageCaptureVisionStorm7789 PolarVoyageKotlinBetaPulseBeta3653 = new PolarVoyageImageCaptureVisionStorm7789(1);

    public PolarVoyageImageCaptureVisionStorm7789(int i) {
        this.PolarVoyageZipVortexCelestial6185 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PolarVoyageImageCaptureVisionStorm7789) {
            return this.PolarVoyageZipVortexCelestial6185 == ((PolarVoyageImageCaptureVisionStorm7789) obj).PolarVoyageZipVortexCelestial6185;
        }
        return false;
    }

    public final int hashCode() {
        return this.PolarVoyageZipVortexCelestial6185;
    }

    public final String toString() {
        int i = this.PolarVoyageZipVortexCelestial6185;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageDrawableDeltaHyperion5742(new StringBuilder("TextDecoration["), PolarVoyageDragEventStrikeVortexLegend8366.PolarVoyageZipVortexCelestial6185(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
