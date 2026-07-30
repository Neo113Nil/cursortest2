package p000createpolar;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFlipAnimationPrimePulse2668 {
    public final /* synthetic */ PolarVoyageBannerAdPhoenixForcePhoenix6096 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final LinkedHashMap PolarVoyageZipVortexCelestial6185 = new LinkedHashMap();
    public final LinkedHashMap PolarVoyageMotionLayoutTransitionHeroVision4068 = new LinkedHashMap();
    public final LinkedHashMap PolarVoyageKotlinBetaPulseBeta3653 = new LinkedHashMap();
    public final ArrayList PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new ArrayList();
    public final transient LinkedHashMap PolarVoyageBitmapVisionAuroraPixel4705 = new LinkedHashMap();
    public final LinkedHashMap PolarVoyageDiffUtilTurboStrike5735 = new LinkedHashMap();
    public final Bundle PolarVoyageTextInputEditTextNebulaHero6651 = new Bundle();

    public PolarVoyageFlipAnimationPrimePulse2668(PolarVoyageBannerAdPhoenixForcePhoenix6096 polarVoyageBannerAdPhoenixForcePhoenix6096) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageBannerAdPhoenixForcePhoenix6096;
    }

    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(String str) {
        Integer num;
        str.getClass();
        if (!this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.contains(str) && (num = (Integer) this.PolarVoyageMotionLayoutTransitionHeroVision4068.remove(str)) != null) {
            this.PolarVoyageZipVortexCelestial6185.remove(num);
        }
        this.PolarVoyageBitmapVisionAuroraPixel4705.remove(str);
        LinkedHashMap linkedHashMap = this.PolarVoyageDiffUtilTurboStrike5735;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.PolarVoyageTextInputEditTextNebulaHero6651;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((PolarVoyageServiceInfoVortexEpicTurbo8786) PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageLooperThreadAlphaPrime1279(bundle, str)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.PolarVoyageKotlinBetaPulseBeta3653;
        PolarVoyageFirebaseBetaSpeedLegend5621 polarVoyageFirebaseBetaSpeedLegend5621 = (PolarVoyageFirebaseBetaSpeedLegend5621) linkedHashMap2.get(str);
        if (polarVoyageFirebaseBetaSpeedLegend5621 != null) {
            ArrayList arrayList = polarVoyageFirebaseBetaSpeedLegend5621.PolarVoyageMotionLayoutTransitionHeroVision4068;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                polarVoyageFirebaseBetaSpeedLegend5621.PolarVoyageZipVortexCelestial6185.PolarVoyageDiffUtilTurboStrike5735((PolarVoyageLooperThreadMasterHyperionSpeed7505) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653(String str) {
        LinkedHashMap linkedHashMap = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        PolarVoyageObserverInfernoCosmosPhoenix9860 polarVoyageObserverInfernoCosmosPhoenix9860 = new PolarVoyageObserverInfernoCosmosPhoenix9860(0);
        Iterator it = new PolarVoyageTransformHeroLegendPulse4169(new PolarVoyagePreviewBlazeForce3304(polarVoyageObserverInfernoCosmosPhoenix9860, new PolarVoyageCanvasCyberNovaElite7830(19, polarVoyageObserverInfernoCosmosPhoenix9860), 2)).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.PolarVoyageZipVortexCelestial6185;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageStrictModeLegendEpic1532("Sequence contains no element matching the predicate.");
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(int i, PolarVoyageNavigationViewNebulaNovaXPhoenix7849 polarVoyageNavigationViewNebulaNovaXPhoenix7849, Object obj) {
        Bundle bundle;
        int i2;
        PolarVoyageBannerAdPhoenixForcePhoenix6096 polarVoyageBannerAdPhoenixForcePhoenix6096 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageRealtimeDatabaseEclipseUltra8894 PolarVoyageFCMCelestialCosmosPixel3711 = polarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageFCMCelestialCosmosPixel3711(polarVoyageBannerAdPhoenixForcePhoenix6096, obj);
        int i3 = 0;
        if (PolarVoyageFCMCelestialCosmosPixel3711 != null) {
            new Handler(Looper.getMainLooper()).post(new PolarVoyageLocationManagerStrikeStormHyper3447(i, i3, this, PolarVoyageFCMCelestialCosmosPixel3711));
            return;
        }
        Intent PolarVoyageLayerDrawableShadowTitaniumOmega1942 = polarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageLayerDrawableShadowTitaniumOmega1942(polarVoyageBannerAdPhoenixForcePhoenix6096, obj);
        if (PolarVoyageLayerDrawableShadowTitaniumOmega1942.getExtras() != null) {
            Bundle extras = PolarVoyageLayerDrawableShadowTitaniumOmega1942.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                PolarVoyageLayerDrawableShadowTitaniumOmega1942.setExtrasClassLoader(polarVoyageBannerAdPhoenixForcePhoenix6096.getClassLoader());
            }
        }
        if (PolarVoyageLayerDrawableShadowTitaniumOmega1942.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = PolarVoyageLayerDrawableShadowTitaniumOmega1942.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            PolarVoyageLayerDrawableShadowTitaniumOmega1942.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(PolarVoyageLayerDrawableShadowTitaniumOmega1942.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(PolarVoyageLayerDrawableShadowTitaniumOmega1942.getAction())) {
                polarVoyageBannerAdPhoenixForcePhoenix6096.startActivityForResult(PolarVoyageLayerDrawableShadowTitaniumOmega1942, i, bundle2);
                return;
            }
            PolarVoyageObserverLegendVisionTitan8703 polarVoyageObserverLegendVisionTitan8703 = (PolarVoyageObserverLegendVisionTitan8703) PolarVoyageLayerDrawableShadowTitaniumOmega1942.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                polarVoyageObserverLegendVisionTitan8703.getClass();
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                polarVoyageBannerAdPhoenixForcePhoenix6096.startIntentSenderForResult(polarVoyageObserverLegendVisionTitan8703.PolarVoyageItemDecorationUltraDeltaEpic7485, i2, polarVoyageObserverLegendVisionTitan8703.PolarVoyageStrictModeLegendEpic1532, polarVoyageObserverLegendVisionTitan8703.PolarVoyageRotateAnimationCyberCelestialDelta4768, polarVoyageObserverLegendVisionTitan8703.PolarVoyageBottomSheetOmegaNeo1907, 0, bundle2);
                return;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new PolarVoyageLocationManagerStrikeStormHyper3447(i2, 1, this, e));
                return;
            }
        }
        String[] stringArrayExtra = PolarVoyageLayerDrawableShadowTitaniumOmega1942.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < stringArrayExtra.length; i4++) {
            if (TextUtils.isEmpty(stringArrayExtra[i4])) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageSnackbarGammaEclipse2140(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                return;
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i4], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i4));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i5 = 0;
            while (i3 < stringArrayExtra.length) {
                if (!hashSet.contains(Integer.valueOf(i3))) {
                    strArr[i5] = stringArrayExtra[i3];
                    i5++;
                }
                i3++;
            }
        }
        polarVoyageBannerAdPhoenixForcePhoenix6096.requestPermissions(stringArrayExtra, i);
    }

    public final boolean PolarVoyageZipVortexCelestial6185(int i, int i2, Intent intent) {
        String str = (String) this.PolarVoyageZipVortexCelestial6185.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        PolarVoyageSoundPoolSolarForceAurora4666 polarVoyageSoundPoolSolarForceAurora4666 = (PolarVoyageSoundPoolSolarForceAurora4666) this.PolarVoyageBitmapVisionAuroraPixel4705.get(str);
        if ((polarVoyageSoundPoolSolarForceAurora4666 != null ? polarVoyageSoundPoolSolarForceAurora4666.PolarVoyageZipVortexCelestial6185 : null) != null) {
            ArrayList arrayList = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            if (arrayList.contains(str)) {
                polarVoyageSoundPoolSolarForceAurora4666.PolarVoyageZipVortexCelestial6185.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageSoundPoolSolarForceAurora4666.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageViewBindingPulseHeroSpeed5705(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.PolarVoyageDiffUtilTurboStrike5735.remove(str);
        this.PolarVoyageTextInputEditTextNebulaHero6651.putParcelable(str, new PolarVoyageServiceInfoVortexEpicTurbo8786(intent, i2));
        return true;
    }
}
