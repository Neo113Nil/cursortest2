package p000createpolar;

import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageResourcesSolarTitanLegend6991 {
    public final int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final List PolarVoyageZipVortexCelestial6185;

    public PolarVoyageResourcesSolarTitanLegend6991(int i, List list) {
        this.PolarVoyageZipVortexCelestial6185 = list;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        StringBuilder PolarVoyageContentProviderHyperSpark3838 = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageContentProviderHyperSpark3838("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", i, "', bounds = '");
        PolarVoyageContentProviderHyperSpark3838.append(new PolarVoyageLinearLayoutHyperionSpectra2647(0, list.size() - 1, 1));
        PolarVoyageContentProviderHyperSpark3838.append("'.");
        throw new IllegalArgumentException(PolarVoyageContentProviderHyperSpark3838.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PolarVoyageResourcesSolarTitanLegend6991.class != obj.getClass()) {
            return false;
        }
        PolarVoyageResourcesSolarTitanLegend6991 polarVoyageResourcesSolarTitanLegend6991 = (PolarVoyageResourcesSolarTitanLegend6991) obj;
        return this.PolarVoyageMotionLayoutTransitionHeroVision4068 == polarVoyageResourcesSolarTitanLegend6991.PolarVoyageMotionLayoutTransitionHeroVision4068 && PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageZipVortexCelestial6185, polarVoyageResourcesSolarTitanLegend6991.PolarVoyageZipVortexCelestial6185);
    }

    public final int hashCode() {
        return this.PolarVoyageZipVortexCelestial6185.hashCode() + (this.PolarVoyageMotionLayoutTransitionHeroVision4068 * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.PolarVoyageMotionLayoutTransitionHeroVision4068 + ", mergedHistory=" + this.PolarVoyageZipVortexCelestial6185 + ')';
    }

    public PolarVoyageResourcesSolarTitanLegend6991() {
        this(-1, PolarVoyageWindowManagerSpeedUltra3573.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }
}
