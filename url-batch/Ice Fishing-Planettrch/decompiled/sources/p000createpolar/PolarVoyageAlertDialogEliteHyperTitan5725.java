package p000createpolar;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAlertDialogEliteHyperTitan5725 implements PolarVoyageChipEliteShadowPhoenix7219 {
    public boolean PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final PolarVoyageKotlinEclipseForceDelta6743 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageAlertDialogEliteHyperTitan5725(PolarVoyageKotlinEclipseForceDelta6743 polarVoyageKotlinEclipseForceDelta6743) {
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageKotlinEclipseForceDelta6743;
    }

    @Override // p000createpolar.PolarVoyageChipEliteShadowPhoenix7219
    public final PolarVoyageWorkManagerPhoenixGammaThunder6318 PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageInAppPurchaseHyperCelestialMaster2583 polarVoyageInAppPurchaseHyperCelestialMaster2583, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            PolarVoyageRemoteConfigSparkPixelCelestial1653 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = ((PolarVoyageActionBarInfernoPrime8377) list.get(i3)).PolarVoyageBarcodeScannerInfernoSolarSpark7767(j);
            i = Math.max(i, PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageItemDecorationUltraDeltaEpic7485);
            i2 = Math.max(i2, PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageStrictModeLegendEpic1532);
            arrayList.add(PolarVoyageBarcodeScannerInfernoSolarSpark7767);
        }
        boolean PolarVoyageSnackbarGammaEclipse2140 = polarVoyageInAppPurchaseHyperCelestialMaster2583.PolarVoyageSnackbarGammaEclipse2140();
        PolarVoyageKotlinEclipseForceDelta6743 polarVoyageKotlinEclipseForceDelta6743 = this.PolarVoyageZipVortexCelestial6185;
        if (PolarVoyageSnackbarGammaEclipse2140) {
            this.PolarVoyageMotionLayoutTransitionHeroVision4068 = true;
            polarVoyageKotlinEclipseForceDelta6743.PolarVoyageZipVortexCelestial6185.setValue(new PolarVoyageNotificationVisionTitanium2982((i2 & 4294967295L) | (i << 32)));
        } else if (!this.PolarVoyageMotionLayoutTransitionHeroVision4068) {
            polarVoyageKotlinEclipseForceDelta6743.PolarVoyageZipVortexCelestial6185.setValue(new PolarVoyageNotificationVisionTitanium2982((i2 & 4294967295L) | (i << 32)));
        }
        return polarVoyageInAppPurchaseHyperCelestialMaster2583.PolarVoyagePackageManagerCelestialPhoenix8393(i, i2, PolarVoyageLightSensorSpectraStormFusion7370.PolarVoyageItemDecorationUltraDeltaEpic7485, new PolarVoyageAsyncTaskNebulaThunder4234(1, arrayList));
    }
}
