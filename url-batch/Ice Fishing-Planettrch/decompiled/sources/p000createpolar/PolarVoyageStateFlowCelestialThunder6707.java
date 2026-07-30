package p000createpolar;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageStateFlowCelestialThunder6707 implements PolarVoyageLooperThreadMasterHyperionSpeed7505 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final Object PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageStateFlowCelestialThunder6707(int i, Object obj) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
    }

    @Override // p000createpolar.PolarVoyageLooperThreadMasterHyperionSpeed7505
    public final void PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageTranslateAnimationMegaCyber7300 polarVoyageTranslateAnimationMegaCyber7300, PolarVoyageMaterialButtonSpeedStormGamma5612 polarVoyageMaterialButtonSpeedStormGamma5612) {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                PolarVoyageGradientDrawableBetaHero7445 polarVoyageGradientDrawableBetaHero7445 = (PolarVoyageGradientDrawableBetaHero7445) obj;
                if (polarVoyageMaterialButtonSpeedStormGamma5612 != PolarVoyageMaterialButtonSpeedStormGamma5612.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                polarVoyageTranslateAnimationMegaCyber7300.PolarVoyageTextInputEditTextNebulaHero6651().PolarVoyageDiffUtilTurboStrike5735(this);
                Bundle PolarVoyageLooperThreadAlphaPrime1279 = polarVoyageGradientDrawableBetaHero7445.PolarVoyageMotionLayoutTransitionHeroVision4068().PolarVoyageLooperThreadAlphaPrime1279("androidx.savedstate.Restarter");
                if (PolarVoyageLooperThreadAlphaPrime1279 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = PolarVoyageLooperThreadAlphaPrime1279.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, PolarVoyageStateFlowCelestialThunder6707.class.getClassLoader()).asSubclass(PolarVoyageOnItemLongClickListenerMegaDragon3735.class);
                        asSubclass.getClass();
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                newInstance.getClass();
                                if (!(polarVoyageGradientDrawableBetaHero7445 instanceof PolarVoyageAuthEpicRoguePhantom7282)) {
                                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageGradientDrawableBetaHero7445, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                PolarVoyageDisplayMetricsVortexEclipsePixel6252 PolarVoyageDiffUtilTurboStrike5735 = ((PolarVoyageAuthEpicRoguePhantom7282) polarVoyageGradientDrawableBetaHero7445).PolarVoyageDiffUtilTurboStrike5735();
                                PolarVoyageResourcesCelestialInferno9280 PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageGradientDrawableBetaHero7445.PolarVoyageMotionLayoutTransitionHeroVision4068();
                                PolarVoyageDiffUtilTurboStrike5735.getClass();
                                LinkedHashMap linkedHashMap = PolarVoyageDiffUtilTurboStrike5735.PolarVoyageZipVortexCelestial6185;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    str3.getClass();
                                    PolarVoyageValueAnimatorSparkDragonNovaX4109 polarVoyageValueAnimatorSparkDragonNovaX4109 = (PolarVoyageValueAnimatorSparkDragonNovaX4109) linkedHashMap.get(str3);
                                    if (polarVoyageValueAnimatorSparkDragonNovaX4109 != null) {
                                        PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageViewRogueMaster4778(polarVoyageValueAnimatorSparkDragonNovaX4109, PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageGradientDrawableBetaHero7445.PolarVoyageTextInputEditTextNebulaHero6651());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageCanvasElitePhoenix4750();
                                }
                            } catch (Exception e) {
                                PolarVoyageR8UltraEliteBeta8736.PolarVoyageCameraPixelBlaze2629("Failed to instantiate ", str2, e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageBottomSheetOmegaNeo1907("Class ", str2, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                PolarVoyageBannerAdPhoenixForcePhoenix6096 polarVoyageBannerAdPhoenixForcePhoenix6096 = (PolarVoyageBannerAdPhoenixForcePhoenix6096) obj;
                if (polarVoyageBannerAdPhoenixForcePhoenix6096.PolarVoyageViewRogueMaster4778 == null) {
                    PolarVoyageGyroscopeMaxTurbo5805 polarVoyageGyroscopeMaxTurbo5805 = (PolarVoyageGyroscopeMaxTurbo5805) polarVoyageBannerAdPhoenixForcePhoenix6096.getLastNonConfigurationInstance();
                    if (polarVoyageGyroscopeMaxTurbo5805 != null) {
                        polarVoyageBannerAdPhoenixForcePhoenix6096.PolarVoyageViewRogueMaster4778 = polarVoyageGyroscopeMaxTurbo5805.PolarVoyageZipVortexCelestial6185;
                    }
                    if (polarVoyageBannerAdPhoenixForcePhoenix6096.PolarVoyageViewRogueMaster4778 == null) {
                        polarVoyageBannerAdPhoenixForcePhoenix6096.PolarVoyageViewRogueMaster4778 = new PolarVoyageDisplayMetricsVortexEclipsePixel6252();
                    }
                }
                polarVoyageBannerAdPhoenixForcePhoenix6096.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageDiffUtilTurboStrike5735(this);
                return;
            case 2:
                new HashMap();
                PolarVoyageMotionLayoutTransitionCosmosPulse1881[] polarVoyageMotionLayoutTransitionCosmosPulse1881Arr = (PolarVoyageMotionLayoutTransitionCosmosPulse1881[]) obj;
                if (polarVoyageMotionLayoutTransitionCosmosPulse1881Arr.length > 0) {
                    PolarVoyageMotionLayoutTransitionCosmosPulse1881 polarVoyageMotionLayoutTransitionCosmosPulse1881 = polarVoyageMotionLayoutTransitionCosmosPulse1881Arr[0];
                    throw null;
                }
                if (polarVoyageMotionLayoutTransitionCosmosPulse1881Arr.length <= 0) {
                    return;
                }
                PolarVoyageMotionLayoutTransitionCosmosPulse1881 polarVoyageMotionLayoutTransitionCosmosPulse18812 = polarVoyageMotionLayoutTransitionCosmosPulse1881Arr[0];
                throw null;
            default:
                if (polarVoyageMaterialButtonSpeedStormGamma5612 != PolarVoyageMaterialButtonSpeedStormGamma5612.ON_CREATE) {
                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageMaterialButtonSpeedStormGamma5612, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    polarVoyageTranslateAnimationMegaCyber7300.PolarVoyageTextInputEditTextNebulaHero6651().PolarVoyageDiffUtilTurboStrike5735(this);
                    ((PolarVoyageSupervisorJobNovaXPrime8208) obj).PolarVoyageMotionLayoutTransitionHeroVision4068();
                    return;
                }
        }
    }
}
