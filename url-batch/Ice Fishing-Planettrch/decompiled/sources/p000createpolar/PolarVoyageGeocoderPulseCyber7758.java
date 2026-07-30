package p000createpolar;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageGeocoderPulseCyber7758 implements PolarVoyageNotificationManagerTitaniumPulse7448 {
    public final /* synthetic */ Object PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185;

    public /* synthetic */ PolarVoyageGeocoderPulseCyber7758(int i, Object obj) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = obj;
    }

    @Override // p000createpolar.PolarVoyageNotificationManagerTitaniumPulse7448
    public final Bundle PolarVoyageZipVortexCelestial6185() {
        PolarVoyageRippleDrawableRogueBlazeBlaze8980[] polarVoyageRippleDrawableRogueBlazeBlaze8980Arr;
        int i = this.PolarVoyageZipVortexCelestial6185;
        Object obj = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Bundle bundle = new Bundle();
                PolarVoyageFlipAnimationPrimePulse2668 polarVoyageFlipAnimationPrimePulse2668 = ((PolarVoyageBannerAdPhoenixForcePhoenix6096) obj).PolarVoyageContentProviderHyperSpark3838;
                polarVoyageFlipAnimationPrimePulse2668.getClass();
                LinkedHashMap linkedHashMap = polarVoyageFlipAnimationPrimePulse2668.PolarVoyageMotionLayoutTransitionHeroVision4068;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(polarVoyageFlipAnimationPrimePulse2668.PolarVoyageBarcodeScannerInfernoSolarSpark7767));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(polarVoyageFlipAnimationPrimePulse2668.PolarVoyageTextInputEditTextNebulaHero6651));
                return bundle;
            case 1:
                Map PolarVoyageBarcodeScannerInfernoSolarSpark7767 = ((PolarVoyageImageAnalysisSpeedVortexUltra2978) obj).PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : PolarVoyageBarcodeScannerInfernoSolarSpark7767.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            default:
                PolarVoyageServiceUltraUltraNeo9663 polarVoyageServiceUltraUltraNeo9663 = (PolarVoyageServiceUltraUltraNeo9663) obj;
                for (Map.Entry entry2 : PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageKeyframeEpicNovaXCyber9821((LinkedHashMap) polarVoyageServiceUltraUltraNeo9663.PolarVoyageBottomSheetOmegaNeo1907).entrySet()) {
                    polarVoyageServiceUltraUltraNeo9663.PolarVoyageBitmapMaxTitanTitan7960(((PolarVoyagePlaceholderVortexBetaPulse5592) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageKeyframeEpicNovaXCyber9821((LinkedHashMap) polarVoyageServiceUltraUltraNeo9663.PolarVoyageStrictModeLegendEpic1532).entrySet()) {
                    polarVoyageServiceUltraUltraNeo9663.PolarVoyageBitmapMaxTitanTitan7960(((PolarVoyageNotificationManagerTitaniumPulse7448) entry3.getValue()).PolarVoyageZipVortexCelestial6185(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) polarVoyageServiceUltraUltraNeo9663.PolarVoyageItemDecorationUltraDeltaEpic7485;
                if (linkedHashMap2.isEmpty()) {
                    polarVoyageRippleDrawableRogueBlazeBlaze8980Arr = new PolarVoyageRippleDrawableRogueBlazeBlaze8980[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList.add(new PolarVoyageRippleDrawableRogueBlazeBlaze8980((String) entry4.getKey(), entry4.getValue()));
                    }
                    polarVoyageRippleDrawableRogueBlazeBlaze8980Arr = (PolarVoyageRippleDrawableRogueBlazeBlaze8980[]) arrayList.toArray(new PolarVoyageRippleDrawableRogueBlazeBlaze8980[0]);
                }
                return PolarVoyageTransformNeoTitanium1654.PolarVoyageStrictModeLegendEpic1532((PolarVoyageRippleDrawableRogueBlazeBlaze8980[]) Arrays.copyOf(polarVoyageRippleDrawableRogueBlazeBlaze8980Arr, polarVoyageRippleDrawableRogueBlazeBlaze8980Arr.length));
        }
    }
}
