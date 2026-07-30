package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMagnetometerMasterTurbo6314 extends PolarVoyageFlatMapSolarShadowAlpha5929 {
    public final /* synthetic */ int PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ String PolarVoyageCameraPixelBlaze2629;
    public final /* synthetic */ PolarVoyageNavigationViewNebulaNovaXPhoenix7849 PolarVoyageDrawableDeltaHyperion5742;
    public final /* synthetic */ PolarVoyageFlipAnimationPrimePulse2668 PolarVoyageViewRogueMaster4778;

    public /* synthetic */ PolarVoyageMagnetometerMasterTurbo6314(PolarVoyageFlipAnimationPrimePulse2668 polarVoyageFlipAnimationPrimePulse2668, String str, PolarVoyageNavigationViewNebulaNovaXPhoenix7849 polarVoyageNavigationViewNebulaNovaXPhoenix7849, int i) {
        this.PolarVoyageBottomSheetOmegaNeo1907 = i;
        this.PolarVoyageViewRogueMaster4778 = polarVoyageFlipAnimationPrimePulse2668;
        this.PolarVoyageCameraPixelBlaze2629 = str;
        this.PolarVoyageDrawableDeltaHyperion5742 = polarVoyageNavigationViewNebulaNovaXPhoenix7849;
    }

    @Override // p000createpolar.PolarVoyageFlatMapSolarShadowAlpha5929
    public final void PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587(Object obj) {
        int i = this.PolarVoyageBottomSheetOmegaNeo1907;
        PolarVoyageNavigationViewNebulaNovaXPhoenix7849 polarVoyageNavigationViewNebulaNovaXPhoenix7849 = this.PolarVoyageDrawableDeltaHyperion5742;
        String str = this.PolarVoyageCameraPixelBlaze2629;
        PolarVoyageFlipAnimationPrimePulse2668 polarVoyageFlipAnimationPrimePulse2668 = this.PolarVoyageViewRogueMaster4778;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                LinkedHashMap linkedHashMap = polarVoyageFlipAnimationPrimePulse2668.PolarVoyageMotionLayoutTransitionHeroVision4068;
                ArrayList arrayList = polarVoyageFlipAnimationPrimePulse2668.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                Object obj2 = linkedHashMap.get(str);
                if (obj2 == null) {
                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageViewRogueMaster4778("Attempting to launch an unregistered ActivityResultLauncher with contract ", polarVoyageNavigationViewNebulaNovaXPhoenix7849, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int intValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    polarVoyageFlipAnimationPrimePulse2668.PolarVoyageMotionLayoutTransitionHeroVision4068(intValue, polarVoyageNavigationViewNebulaNovaXPhoenix7849, obj);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                LinkedHashMap linkedHashMap2 = polarVoyageFlipAnimationPrimePulse2668.PolarVoyageMotionLayoutTransitionHeroVision4068;
                ArrayList arrayList2 = polarVoyageFlipAnimationPrimePulse2668.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                Object obj3 = linkedHashMap2.get(str);
                PolarVoyageResourceHyperOlympianOmega5605 polarVoyageResourceHyperOlympianOmega5605 = (PolarVoyageResourceHyperOlympianOmega5605) polarVoyageNavigationViewNebulaNovaXPhoenix7849;
                if (obj3 == null) {
                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageViewRogueMaster4778("Attempting to launch an unregistered ActivityResultLauncher with contract ", polarVoyageResourceHyperOlympianOmega5605, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int intValue2 = ((Number) obj3).intValue();
                arrayList2.add(str);
                try {
                    polarVoyageFlipAnimationPrimePulse2668.PolarVoyageMotionLayoutTransitionHeroVision4068(intValue2, polarVoyageResourceHyperOlympianOmega5605, obj);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str);
                    throw e2;
                }
        }
    }
}
