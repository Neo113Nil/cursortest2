package p000createpolar;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageConstraintSetForceAurora6987 {
    public final Long PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final Long PolarVoyageBitmapVisionAuroraPixel4705;
    public final Long PolarVoyageDiffUtilTurboStrike5735;
    public final Map PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyageCameraPhantomNova9854 PolarVoyageKotlinBetaPulseBeta3653;
    public final boolean PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final Long PolarVoyageTextInputEditTextNebulaHero6651;
    public final boolean PolarVoyageZipVortexCelestial6185;

    public PolarVoyageConstraintSetForceAurora6987(boolean z, boolean z2, PolarVoyageCameraPhantomNova9854 polarVoyageCameraPhantomNova9854, Long l, Long l2, Long l3, Long l4, Map map) {
        map.getClass();
        this.PolarVoyageZipVortexCelestial6185 = z;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = z2;
        this.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageCameraPhantomNova9854;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = l;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = l2;
        this.PolarVoyageDiffUtilTurboStrike5735 = l3;
        this.PolarVoyageTextInputEditTextNebulaHero6651 = l4;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageKeyframeEpicNovaXCyber9821(map);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.PolarVoyageZipVortexCelestial6185) {
            arrayList.add("isRegularFile");
        }
        if (this.PolarVoyageMotionLayoutTransitionHeroVision4068) {
            arrayList.add("isDirectory");
        }
        Long l = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (l != null) {
            arrayList.add("byteCount=" + l.longValue());
        }
        Long l2 = this.PolarVoyageBitmapVisionAuroraPixel4705;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2.longValue());
        }
        Long l3 = this.PolarVoyageDiffUtilTurboStrike5735;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3.longValue());
        }
        Long l4 = this.PolarVoyageTextInputEditTextNebulaHero6651;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4.longValue());
        }
        Map map = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyagePaintMaxNova4034(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public /* synthetic */ PolarVoyageConstraintSetForceAurora6987(boolean z, boolean z2, PolarVoyageCameraPhantomNova9854 polarVoyageCameraPhantomNova9854, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, polarVoyageCameraPhantomNova9854, l, l2, l3, l4, PolarVoyageLightSensorSpectraStormFusion7370.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }
}
