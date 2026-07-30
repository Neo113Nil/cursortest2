package p000createpolar;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyagePlaceholderAlphaQuantumGamma4175 {
    public final /* synthetic */ PolarVoyageBannerAdPhoenixForcePhoenix6096 PolarVoyageZipVortexCelestial6185;

    public /* synthetic */ PolarVoyagePlaceholderAlphaQuantumGamma4175(PolarVoyageBannerAdPhoenixForcePhoenix6096 polarVoyageBannerAdPhoenixForcePhoenix6096) {
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageBannerAdPhoenixForcePhoenix6096;
    }

    public final void PolarVoyageZipVortexCelestial6185(Context context) {
        context.getClass();
        PolarVoyageBannerAdPhoenixForcePhoenix6096 polarVoyageBannerAdPhoenixForcePhoenix6096 = this.PolarVoyageZipVortexCelestial6185;
        Bundle PolarVoyageLooperThreadAlphaPrime1279 = ((PolarVoyageResourcesCelestialInferno9280) polarVoyageBannerAdPhoenixForcePhoenix6096.PolarVoyageBottomSheetOmegaNeo1907.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageLooperThreadAlphaPrime1279("android:support:activity-result");
        if (PolarVoyageLooperThreadAlphaPrime1279 != null) {
            PolarVoyageFlipAnimationPrimePulse2668 polarVoyageFlipAnimationPrimePulse2668 = polarVoyageBannerAdPhoenixForcePhoenix6096.PolarVoyageContentProviderHyperSpark3838;
            LinkedHashMap linkedHashMap = polarVoyageFlipAnimationPrimePulse2668.PolarVoyageMotionLayoutTransitionHeroVision4068;
            LinkedHashMap linkedHashMap2 = polarVoyageFlipAnimationPrimePulse2668.PolarVoyageZipVortexCelestial6185;
            Bundle bundle = polarVoyageFlipAnimationPrimePulse2668.PolarVoyageTextInputEditTextNebulaHero6651;
            ArrayList<Integer> integerArrayList = PolarVoyageLooperThreadAlphaPrime1279.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = PolarVoyageLooperThreadAlphaPrime1279.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = PolarVoyageLooperThreadAlphaPrime1279.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                polarVoyageFlipAnimationPrimePulse2668.PolarVoyageBarcodeScannerInfernoSolarSpark7767.addAll(stringArrayList2);
            }
            Bundle bundle2 = PolarVoyageLooperThreadAlphaPrime1279.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageItemDecorationUltraDeltaEpic7485(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                polarVoyageFlipAnimationPrimePulse2668.PolarVoyageMotionLayoutTransitionHeroVision4068.put(str3, Integer.valueOf(intValue));
            }
        }
    }
}
