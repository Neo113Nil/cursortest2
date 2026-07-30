package p000createpolar;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.polarvoyage.glacialoceans.icepathfinder.quest.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTransitionManagerHeroNovaX3322 extends PolarVoyageCombineRoguePulse7620 {
    public static final PolarVoyagePagingCosmosDragon7783 PolarVoyageDatabaseCosmosSpectraSolar3905;
    public PolarVoyageRewardedAdVisionPulsePrime7518 PolarVoyageActivityInfoBetaQuantum8726;
    public PolarVoyageImageCaptureTurboBetaSpark9944 PolarVoyageAlarmManagerShadowHyperBeta8339;
    public Integer PolarVoyageAlertDialogCyberHeroQuantum3938;
    public final PolarVoyageResourceEliteOlympian8553 PolarVoyageAnimatorSetSparkUltraMax8233;
    public final PolarVoyageRewardedAdUltraTitanium4787 PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final PolarVoyageResourceEliteOlympian8553 PolarVoyageBitmapMaxTitanTitan7960;
    public int PolarVoyageBitmapVisionAuroraPixel4705 = Integer.MIN_VALUE;
    public List PolarVoyageBottomSheetOmegaNeo1907;
    public final PolarVoyageFlowOnForceForceMax8828 PolarVoyageCameraPixelBlaze2629;
    public final PolarVoyageLayoutInflaterTitaniumMaxSolar6862 PolarVoyageCameraViewSpectraMaxSpectra2824;
    public final PolarVoyageLightSensorSparkBlazeTitanium9192 PolarVoyageCanvasElitePhoenix4750;
    public final String PolarVoyageCardViewAlphaVortexCelestial9747;
    public final PolarVoyageAlphaAnimationSparkNovaXTitan1212 PolarVoyageConfigurationMaxSpectraForce5418;
    public PolarVoyageToastUltraNeo6602 PolarVoyageContentProviderHyperSpark3838;
    public final PolarVoyageCameraOlympianTitaniumPrime3764 PolarVoyageDiffUtilDragonSpeedEclipse6225;
    public final PolarVoyageOnDeviceTranslatorVortexHero4840 PolarVoyageDiffUtilTurboStrike5735;
    public final PolarVoyageOnTouchListenerPrimePixelLegend8920 PolarVoyageDisplayMetricsVortexDragon9516;
    public int PolarVoyageDrawableDeltaHyperion5742;
    public final PolarVoyageAlphaAnimationSparkNovaXTitan1212 PolarVoyageFCMCelestialCosmosPixel3711;
    public final PolarVoyageDrawableCosmosEclipseMax6944 PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149;
    public final String PolarVoyageFlingGestureEclipsePrimeMax1376;
    public boolean PolarVoyageGuidelineStormSolar2850;
    public long PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyageOnTouchListenerPrimePixelLegend8920 PolarVoyageLayerDrawableShadowTitaniumOmega1942;
    public final ArrayList PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
    public PolarVoyageResourceEliteOlympian8553 PolarVoyageLifecycleOlympianOmega3762;
    public boolean PolarVoyageLooperThreadAlphaPrime1279;
    public int PolarVoyageMotionLayoutForceEpicAurora7183;
    public final PolarVoyageOnDeviceTranslatorVortexHero4840 PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587;
    public boolean PolarVoyageNavigationViewHyperHyperHyperion1793;
    public final PolarVoyageSupervisorJobVortexDelta5512 PolarVoyagePackageManagerCelestialPhoenix8393;
    public PolarVoyageToastUltraNeo6602 PolarVoyageRemoteModelManagerOlympianCelestial9141;
    public final PolarVoyageObserverMasterDelta3317 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageSnackbarGammaEclipse2140;
    public final PolarVoyageGradientDrawableNebulaMasterPhoenix2907 PolarVoyageStrictModeLegendEpic1532;
    public final AccessibilityManager PolarVoyageTextInputEditTextNebulaHero6651;
    public final PolarVoyageResourceEliteOlympian8553 PolarVoyageToolbarEclipseInfernoHero6368;
    public final PolarVoyageAlphaAnimationSparkNovaXTitan1212 PolarVoyageViewBindingPulseHeroSpeed5705;
    public final Handler PolarVoyageViewRogueMaster4778;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        int i = PolarVoyageItemDecorationVortexSolar5803.PolarVoyageZipVortexCelestial6185;
        PolarVoyagePagingCosmosDragon7783 polarVoyagePagingCosmosDragon7783 = new PolarVoyagePagingCosmosDragon7783(32);
        int i2 = polarVoyagePagingCosmosDragon7783.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (i2 < 0) {
            PolarVoyageMeteringPointSolarMax4741.PolarVoyageBitmapVisionAuroraPixel4705("");
            return;
        }
        int i3 = i2 + 32;
        int[] iArr2 = polarVoyagePagingCosmosDragon7783.PolarVoyageZipVortexCelestial6185;
        if (iArr2.length < i3) {
            polarVoyagePagingCosmosDragon7783.PolarVoyageZipVortexCelestial6185 = Arrays.copyOf(iArr2, Math.max(i3, (iArr2.length * 3) / 2));
        }
        int[] iArr3 = polarVoyagePagingCosmosDragon7783.PolarVoyageZipVortexCelestial6185;
        int i4 = polarVoyagePagingCosmosDragon7783.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (i2 != i4) {
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageSensorManagerFusionPixelSolar7026(i3, i2, i4, iArr3, iArr3);
        }
        PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageDelayCyberQuantumEclipse8687(i2, 0, 12, iArr, iArr3);
        polarVoyagePagingCosmosDragon7783.PolarVoyageMotionLayoutTransitionHeroVision4068 += 32;
        PolarVoyageDatabaseCosmosSpectraSolar3905 = polarVoyagePagingCosmosDragon7783;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [create-polar.PolarVoyageGradientDrawableNebulaMasterPhoenix2907] */
    /* JADX WARN: Type inference failed for: r3v3, types: [create-polar.PolarVoyageObserverMasterDelta3317] */
    public PolarVoyageTransitionManagerHeroNovaX3322(PolarVoyageRewardedAdUltraTitanium4787 polarVoyageRewardedAdUltraTitanium4787) {
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageRewardedAdUltraTitanium4787;
        int i = 0;
        this.PolarVoyageDiffUtilTurboStrike5735 = new PolarVoyageOnDeviceTranslatorVortexHero4840(this, i);
        Object systemService = polarVoyageRewardedAdUltraTitanium4787.getContext().getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.PolarVoyageTextInputEditTextNebulaHero6651 = accessibilityManager;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 100L;
        this.PolarVoyageStrictModeLegendEpic1532 = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: create-polar.PolarVoyageGradientDrawableNebulaMasterPhoenix2907
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                PolarVoyageTransitionManagerHeroNovaX3322 polarVoyageTransitionManagerHeroNovaX3322 = PolarVoyageTransitionManagerHeroNovaX3322.this;
                polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageBottomSheetOmegaNeo1907 = z ? polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageTextInputEditTextNebulaHero6651.getEnabledAccessibilityServiceList(-1) : PolarVoyageWindowManagerSpeedUltra3573.PolarVoyageItemDecorationUltraDeltaEpic7485;
            }
        };
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: create-polar.PolarVoyageObserverMasterDelta3317
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                PolarVoyageTransitionManagerHeroNovaX3322 polarVoyageTransitionManagerHeroNovaX3322 = PolarVoyageTransitionManagerHeroNovaX3322.this;
                polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageTextInputEditTextNebulaHero6651.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.PolarVoyageBottomSheetOmegaNeo1907 = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.PolarVoyageViewRogueMaster4778 = new Handler(Looper.getMainLooper());
        this.PolarVoyageCameraPixelBlaze2629 = new PolarVoyageFlowOnForceForceMax8828(this);
        this.PolarVoyageDrawableDeltaHyperion5742 = Integer.MIN_VALUE;
        this.PolarVoyageSnackbarGammaEclipse2140 = Integer.MIN_VALUE;
        this.PolarVoyageAnimatorSetSparkUltraMax8233 = new PolarVoyageResourceEliteOlympian8553();
        this.PolarVoyageBitmapMaxTitanTitan7960 = new PolarVoyageResourceEliteOlympian8553();
        this.PolarVoyageDisplayMetricsVortexDragon9516 = new PolarVoyageOnTouchListenerPrimePixelLegend8920(0);
        this.PolarVoyageLayerDrawableShadowTitaniumOmega1942 = new PolarVoyageOnTouchListenerPrimePixelLegend8920(0);
        this.PolarVoyageMotionLayoutForceEpicAurora7183 = -1;
        this.PolarVoyageCameraViewSpectraMaxSpectra2824 = new PolarVoyageLayoutInflaterTitaniumMaxSolar6862(0);
        this.PolarVoyagePackageManagerCelestialPhoenix8393 = PolarVoyageTransformNeoTitanium1654.PolarVoyageKotlinBetaPulseBeta3653(1, null, 6);
        this.PolarVoyageLooperThreadAlphaPrime1279 = true;
        PolarVoyageResourceEliteOlympian8553 polarVoyageResourceEliteOlympian8553 = PolarVoyageActivityCelestialTitaniumHyper5677.PolarVoyageZipVortexCelestial6185;
        polarVoyageResourceEliteOlympian8553.getClass();
        this.PolarVoyageLifecycleOlympianOmega3762 = polarVoyageResourceEliteOlympian8553;
        this.PolarVoyageDiffUtilDragonSpeedEclipse6225 = new PolarVoyageCameraOlympianTitaniumPrime3764();
        this.PolarVoyageFCMCelestialCosmosPixel3711 = new PolarVoyageAlphaAnimationSparkNovaXTitan1212();
        this.PolarVoyageViewBindingPulseHeroSpeed5705 = new PolarVoyageAlphaAnimationSparkNovaXTitan1212();
        this.PolarVoyageCardViewAlphaVortexCelestial9747 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.PolarVoyageFlingGestureEclipsePrimeMax1376 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = new PolarVoyageDrawableCosmosEclipseMax6944(6);
        this.PolarVoyageToolbarEclipseInfernoHero6368 = new PolarVoyageResourceEliteOlympian8553();
        this.PolarVoyageAlarmManagerShadowHyperBeta8339 = new PolarVoyageImageCaptureTurboBetaSpark9944(polarVoyageRewardedAdUltraTitanium4787.getSemanticsOwner().PolarVoyageZipVortexCelestial6185(), polarVoyageResourceEliteOlympian8553);
        int i2 = PolarVoyageAnalyticsMasterElite6073.PolarVoyageZipVortexCelestial6185;
        this.PolarVoyageConfigurationMaxSpectraForce5418 = new PolarVoyageAlphaAnimationSparkNovaXTitan1212();
        polarVoyageRewardedAdUltraTitanium4787.addOnAttachStateChangeListener(new PolarVoyageFCMCyberAurora5283(i, this));
        this.PolarVoyageCanvasElitePhoenix4750 = new PolarVoyageLightSensorSparkBlazeTitanium9192(2, this);
        this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = new ArrayList();
        this.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587 = new PolarVoyageOnDeviceTranslatorVortexHero4840(this, 1);
    }

    public static /* synthetic */ void PolarVoyageAlertDialogCyberHeroQuantum3938(PolarVoyageTransitionManagerHeroNovaX3322 polarVoyageTransitionManagerHeroNovaX3322, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageMotionLayoutForceEpicAurora7183(i, i2, num, null);
    }

    public static final boolean PolarVoyageAnimatorSetSparkUltraMax8233(PolarVoyageActivityFusionHyper3950 polarVoyageActivityFusionHyper3950) {
        PolarVoyageAnimatorDeltaUltraDragon6113 polarVoyageAnimatorDeltaUltraDragon6113 = polarVoyageActivityFusionHyper3950.PolarVoyageZipVortexCelestial6185;
        if (((Number) polarVoyageAnimatorDeltaUltraDragon6113.PolarVoyageMotionLayoutTransitionHeroVision4068()).floatValue() < ((Number) polarVoyageActivityFusionHyper3950.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068()).floatValue()) {
            return true;
        }
        ((Number) polarVoyageAnimatorDeltaUltraDragon6113.PolarVoyageMotionLayoutTransitionHeroVision4068()).floatValue();
        return false;
    }

    public static Region PolarVoyageCardViewAlphaVortexCelestial9747(PolarVoyageNestedScrollViewBlazeMaxMax1969 polarVoyageNestedScrollViewBlazeMaxMax1969) {
        if (!(polarVoyageNestedScrollViewBlazeMaxMax1969 instanceof PolarVoyageVelocityTrackerNovaXBetaFusion3202)) {
            return null;
        }
        PolarVoyageVelocityTrackerNovaXBetaFusion3202 polarVoyageVelocityTrackerNovaXBetaFusion3202 = (PolarVoyageVelocityTrackerNovaXBetaFusion3202) polarVoyageNestedScrollViewBlazeMaxMax1969;
        PolarVoyageCardViewPulseSpark7250 PolarVoyageCameraViewSpectraMaxSpectra2824 = polarVoyageVelocityTrackerNovaXBetaFusion3202.PolarVoyageCameraViewSpectraMaxSpectra2824();
        Region region = new Region(new Rect((int) PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageZipVortexCelestial6185, (int) PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageMotionLayoutTransitionHeroVision4068, (int) PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageKotlinBetaPulseBeta3653, (int) PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageBarcodeScannerInfernoSolarSpark7767));
        Region region2 = new Region();
        PolarVoyagePaintStormGammaSpectra4467 polarVoyagePaintStormGammaSpectra4467 = polarVoyageVelocityTrackerNovaXBetaFusion3202.PolarVoyageStrictModeLegendEpic1532;
        if (!(polarVoyagePaintStormGammaSpectra4467 instanceof PolarVoyagePaintStormGammaSpectra4467)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        region2.setPath(polarVoyagePaintStormGammaSpectra4467.PolarVoyageZipVortexCelestial6185, region);
        return region2;
    }

    public static String PolarVoyageDrawableDeltaHyperion5742(PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel2539) {
        PolarVoyageDelayAuroraSparkTurbo6655 polarVoyageDelayAuroraSparkTurbo6655;
        if (polarVoyageJobIntentServiceStormEclipsePixel2539 != null) {
            PolarVoyageInAppPurchaseTitaniumEpic6306 polarVoyageInAppPurchaseTitaniumEpic6306 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            PolarVoyageKeyframeThunderMegaVortex8492 polarVoyageKeyframeThunderMegaVortex8492 = polarVoyageInAppPurchaseTitaniumEpic6306.PolarVoyageItemDecorationUltraDeltaEpic7485;
            PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra2582 = PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageZipVortexCelestial6185;
            if (polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageLintBetaUltra2582)) {
                return PolarVoyageDragEventStrikeVortexLegend8366.PolarVoyageZipVortexCelestial6185((List) polarVoyageInAppPurchaseTitaniumEpic6306.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageLintBetaUltra2582), ",", null, 62);
            }
            PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra25822 = PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageLifecycleOlympianOmega3762;
            if (polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageLintBetaUltra25822)) {
                Object PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageLintBetaUltra25822);
                if (PolarVoyageTextInputEditTextNebulaHero6651 == null) {
                    PolarVoyageTextInputEditTextNebulaHero6651 = null;
                }
                PolarVoyageDelayAuroraSparkTurbo6655 polarVoyageDelayAuroraSparkTurbo66552 = (PolarVoyageDelayAuroraSparkTurbo6655) PolarVoyageTextInputEditTextNebulaHero6651;
                if (polarVoyageDelayAuroraSparkTurbo66552 != null) {
                    return polarVoyageDelayAuroraSparkTurbo66552.PolarVoyageStrictModeLegendEpic1532;
                }
            } else {
                Object PolarVoyageTextInputEditTextNebulaHero66512 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageCameraViewSpectraMaxSpectra2824);
                if (PolarVoyageTextInputEditTextNebulaHero66512 == null) {
                    PolarVoyageTextInputEditTextNebulaHero66512 = null;
                }
                List list = (List) PolarVoyageTextInputEditTextNebulaHero66512;
                if (list != null && (polarVoyageDelayAuroraSparkTurbo6655 = (PolarVoyageDelayAuroraSparkTurbo6655) PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageObserverEliteUltra2793(list)) != null) {
                    return polarVoyageDelayAuroraSparkTurbo6655.PolarVoyageStrictModeLegendEpic1532;
                }
            }
        }
        return null;
    }

    public static Rect PolarVoyageFCMCelestialCosmosPixel3711(PolarVoyageNestedScrollViewBlazeMaxMax1969 polarVoyageNestedScrollViewBlazeMaxMax1969) {
        if (!(polarVoyageNestedScrollViewBlazeMaxMax1969 instanceof PolarVoyageColorStateListSpectraSpectraEpic3899) && !(polarVoyageNestedScrollViewBlazeMaxMax1969 instanceof PolarVoyageThreadRogueMegaAurora9435)) {
            return null;
        }
        PolarVoyageCardViewPulseSpark7250 PolarVoyageCameraViewSpectraMaxSpectra2824 = polarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageCameraViewSpectraMaxSpectra2824();
        return new Rect((int) PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageZipVortexCelestial6185, (int) PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageMotionLayoutTransitionHeroVision4068, (int) PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageKotlinBetaPulseBeta3653, (int) PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
    }

    public static CharSequence PolarVoyageFlingGestureEclipsePrimeMax1376(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                subSequence.getClass();
                return subSequence;
            }
        }
        return charSequence;
    }

    public static final boolean PolarVoyageNavigationViewHyperHyperHyperion1793(PolarVoyageActivityFusionHyper3950 polarVoyageActivityFusionHyper3950) {
        PolarVoyageAnimatorDeltaUltraDragon6113 polarVoyageAnimatorDeltaUltraDragon6113 = polarVoyageActivityFusionHyper3950.PolarVoyageZipVortexCelestial6185;
        if (((Number) polarVoyageAnimatorDeltaUltraDragon6113.PolarVoyageMotionLayoutTransitionHeroVision4068()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) polarVoyageAnimatorDeltaUltraDragon6113.PolarVoyageMotionLayoutTransitionHeroVision4068()).floatValue();
        ((Number) polarVoyageActivityFusionHyper3950.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068()).floatValue();
        return false;
    }

    public static final boolean PolarVoyageRemoteModelManagerOlympianCelestial9141(PolarVoyageActivityFusionHyper3950 polarVoyageActivityFusionHyper3950, float f) {
        PolarVoyageAnimatorDeltaUltraDragon6113 polarVoyageAnimatorDeltaUltraDragon6113 = polarVoyageActivityFusionHyper3950.PolarVoyageZipVortexCelestial6185;
        if (f >= 0.0f || ((Number) polarVoyageAnimatorDeltaUltraDragon6113.PolarVoyageMotionLayoutTransitionHeroVision4068()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) polarVoyageAnimatorDeltaUltraDragon6113.PolarVoyageMotionLayoutTransitionHeroVision4068()).floatValue() < ((Number) polarVoyageActivityFusionHyper3950.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068()).floatValue();
        }
        return true;
    }

    public static float[] PolarVoyageViewBindingPulseHeroSpeed5705(PolarVoyageNestedScrollViewBlazeMaxMax1969 polarVoyageNestedScrollViewBlazeMaxMax1969) {
        if (!(polarVoyageNestedScrollViewBlazeMaxMax1969 instanceof PolarVoyageThreadRogueMegaAurora9435)) {
            return null;
        }
        PolarVoyageProcessCameraProviderSolarEpic3119 polarVoyageProcessCameraProviderSolarEpic3119 = ((PolarVoyageThreadRogueMegaAurora9435) polarVoyageNestedScrollViewBlazeMaxMax1969).PolarVoyageStrictModeLegendEpic1532;
        long j = polarVoyageProcessCameraProviderSolarEpic3119.PolarVoyageItemDecorationUltraDeltaEpic7485;
        long j2 = polarVoyageProcessCameraProviderSolarEpic3119.PolarVoyageTextInputEditTextNebulaHero6651;
        long j3 = polarVoyageProcessCameraProviderSolarEpic3119.PolarVoyageDiffUtilTurboStrike5735;
        long j4 = polarVoyageProcessCameraProviderSolarEpic3119.PolarVoyageBitmapVisionAuroraPixel4705;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public final void PolarVoyageActivityInfoBetaQuantum8726(PolarVoyageConfigurationMegaTitaniumQuantum2348 polarVoyageConfigurationMegaTitaniumQuantum2348, PolarVoyageCameraOlympianTitaniumPrime3764 polarVoyageCameraOlympianTitaniumPrime3764) {
        PolarVoyageInAppPurchaseTitaniumEpic6306 PolarVoyageDisplayMetricsVortexDragon9516;
        if (polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageViewBindingPulseHeroSpeed5705() && !this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(polarVoyageConfigurationMegaTitaniumQuantum2348)) {
            PolarVoyageConfigurationMegaTitaniumQuantum2348 polarVoyageConfigurationMegaTitaniumQuantum23482 = null;
            if (!polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageAlarmManagerShadowHyperBeta8339.PolarVoyageBarcodeScannerInfernoSolarSpark7767(8)) {
                polarVoyageConfigurationMegaTitaniumQuantum2348 = polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageNavigationViewHyperHyperHyperion1793();
                while (true) {
                    if (polarVoyageConfigurationMegaTitaniumQuantum2348 == null) {
                        polarVoyageConfigurationMegaTitaniumQuantum2348 = null;
                        break;
                    } else if (polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageAlarmManagerShadowHyperBeta8339.PolarVoyageBarcodeScannerInfernoSolarSpark7767(8)) {
                        break;
                    } else {
                        polarVoyageConfigurationMegaTitaniumQuantum2348 = polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageNavigationViewHyperHyperHyperion1793();
                    }
                }
            }
            if (polarVoyageConfigurationMegaTitaniumQuantum2348 == null || (PolarVoyageDisplayMetricsVortexDragon9516 = polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageDisplayMetricsVortexDragon9516()) == null) {
                return;
            }
            if (!PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                PolarVoyageConfigurationMegaTitaniumQuantum2348 PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageNavigationViewHyperHyperHyperion1793();
                while (true) {
                    if (PolarVoyageNavigationViewHyperHyperHyperion1793 != null) {
                        PolarVoyageInAppPurchaseTitaniumEpic6306 PolarVoyageDisplayMetricsVortexDragon95162 = PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageDisplayMetricsVortexDragon9516();
                        if (PolarVoyageDisplayMetricsVortexDragon95162 != null && PolarVoyageDisplayMetricsVortexDragon95162.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                            polarVoyageConfigurationMegaTitaniumQuantum23482 = PolarVoyageNavigationViewHyperHyperHyperion1793;
                            break;
                        }
                        PolarVoyageNavigationViewHyperHyperHyperion1793 = PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageNavigationViewHyperHyperHyperion1793();
                    } else {
                        break;
                    }
                }
                if (polarVoyageConfigurationMegaTitaniumQuantum23482 != null) {
                    polarVoyageConfigurationMegaTitaniumQuantum2348 = polarVoyageConfigurationMegaTitaniumQuantum23482;
                }
            }
            int i = polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageStrictModeLegendEpic1532;
            if (polarVoyageCameraOlympianTitaniumPrime3764.PolarVoyageZipVortexCelestial6185(i)) {
                PolarVoyageAlertDialogCyberHeroQuantum3938(this, PolarVoyageBitmapMaxTitanTitan7960(i), 2048, 1, 8);
            }
        }
    }

    public final Rect PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageItemDecorationPrimePrime4359 polarVoyageItemDecorationPrimePrime4359) {
        PolarVoyageFontFamilyPhantomInferno3561 polarVoyageFontFamilyPhantomInferno3561 = polarVoyageItemDecorationPrimePrime4359.PolarVoyageMotionLayoutTransitionHeroVision4068;
        float f = polarVoyageFontFamilyPhantomInferno3561.PolarVoyageZipVortexCelestial6185;
        float f2 = polarVoyageFontFamilyPhantomInferno3561.PolarVoyageMotionLayoutTransitionHeroVision4068;
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        PolarVoyageRewardedAdUltraTitanium4787 polarVoyageRewardedAdUltraTitanium4787 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        long PolarVoyageLayerDrawableShadowTitaniumOmega1942 = polarVoyageRewardedAdUltraTitanium4787.PolarVoyageLayerDrawableShadowTitaniumOmega1942((Float.floatToRawIntBits(f2) & 4294967295L) | (floatToRawIntBits << 32));
        float f3 = polarVoyageFontFamilyPhantomInferno3561.PolarVoyageKotlinBetaPulseBeta3653;
        float f4 = polarVoyageFontFamilyPhantomInferno3561.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        long PolarVoyageLayerDrawableShadowTitaniumOmega19422 = polarVoyageRewardedAdUltraTitanium4787.PolarVoyageLayerDrawableShadowTitaniumOmega1942((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        int i = (int) (PolarVoyageLayerDrawableShadowTitaniumOmega1942 >> 32);
        int i2 = (int) (PolarVoyageLayerDrawableShadowTitaniumOmega19422 >> 32);
        int i3 = (int) (PolarVoyageLayerDrawableShadowTitaniumOmega1942 & 4294967295L);
        int i4 = (int) (PolarVoyageLayerDrawableShadowTitaniumOmega19422 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    public final int PolarVoyageBitmapMaxTitanTitan7960(int i) {
        if (i == this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.getSemanticsOwner().PolarVoyageZipVortexCelestial6185().PolarVoyageTextInputEditTextNebulaHero6651) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f1, code lost:
    
        if (p000createpolar.PolarVoyageTransformNeoTitanium1654.PolarVoyageCameraPixelBlaze2629(r4, r2) == r7) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0030, B:15:0x005c, B:21:0x006e, B:23:0x0076, B:25:0x007f, B:27:0x0085, B:29:0x0094, B:31:0x009c, B:53:0x0046, B:55:0x004d), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f1 -> B:14:0x00f4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageMotionSceneHyperVisionVision6497 polarVoyageMotionSceneHyperVisionVision6497) {
        PolarVoyageLayoutPrimeForceBlaze5767 polarVoyageLayoutPrimeForceBlaze5767;
        int i;
        PolarVoyageLayoutInflaterTitaniumMaxSolar6862 polarVoyageLayoutInflaterTitaniumMaxSolar6862;
        PolarVoyageLayoutInflaterTitaniumMaxSolar6862 polarVoyageLayoutInflaterTitaniumMaxSolar68622;
        PolarVoyageCameraOlympianTitaniumPrime3764 polarVoyageCameraOlympianTitaniumPrime3764;
        PolarVoyageStorageCyberSparkSpeed8597 polarVoyageStorageCyberSparkSpeed8597;
        PolarVoyageCameraOlympianTitaniumPrime3764 polarVoyageCameraOlympianTitaniumPrime37642;
        PolarVoyageStorageCyberSparkSpeed8597 polarVoyageStorageCyberSparkSpeed85972;
        int i2;
        long j;
        Object PolarVoyageMotionLayoutTransitionHeroVision4068;
        try {
            if (polarVoyageMotionSceneHyperVisionVision6497 instanceof PolarVoyageLayoutPrimeForceBlaze5767) {
                polarVoyageLayoutPrimeForceBlaze5767 = (PolarVoyageLayoutPrimeForceBlaze5767) polarVoyageMotionSceneHyperVisionVision6497;
                int i3 = polarVoyageLayoutPrimeForceBlaze5767.PolarVoyageSnackbarGammaEclipse2140;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    polarVoyageLayoutPrimeForceBlaze5767.PolarVoyageSnackbarGammaEclipse2140 = i3 - Integer.MIN_VALUE;
                    Object obj = polarVoyageLayoutPrimeForceBlaze5767.PolarVoyageCameraPixelBlaze2629;
                    i = polarVoyageLayoutPrimeForceBlaze5767.PolarVoyageSnackbarGammaEclipse2140;
                    polarVoyageLayoutInflaterTitaniumMaxSolar6862 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
                    PolarVoyageDrawableCompatAuroraPulse6414 polarVoyageDrawableCompatAuroraPulse6414 = PolarVoyageDrawableCompatAuroraPulse6414.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    if (i != 0) {
                        PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageRotateAnimationCyberCelestialDelta4768(obj);
                        polarVoyageCameraOlympianTitaniumPrime3764 = new PolarVoyageCameraOlympianTitaniumPrime3764();
                        PolarVoyageSupervisorJobVortexDelta5512 polarVoyageSupervisorJobVortexDelta5512 = this.PolarVoyagePackageManagerCelestialPhoenix8393;
                        polarVoyageSupervisorJobVortexDelta5512.getClass();
                        polarVoyageStorageCyberSparkSpeed8597 = new PolarVoyageStorageCyberSparkSpeed8597(polarVoyageSupervisorJobVortexDelta5512);
                        polarVoyageLayoutPrimeForceBlaze5767.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageCameraOlympianTitaniumPrime3764;
                        polarVoyageLayoutPrimeForceBlaze5767.PolarVoyageViewRogueMaster4778 = polarVoyageStorageCyberSparkSpeed8597;
                        polarVoyageLayoutPrimeForceBlaze5767.PolarVoyageSnackbarGammaEclipse2140 = 1;
                        PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageStorageCyberSparkSpeed8597.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageLayoutPrimeForceBlaze5767);
                        if (PolarVoyageMotionLayoutTransitionHeroVision4068 != polarVoyageDrawableCompatAuroraPulse6414) {
                        }
                    } else if (i == 1) {
                        polarVoyageStorageCyberSparkSpeed85972 = polarVoyageLayoutPrimeForceBlaze5767.PolarVoyageViewRogueMaster4778;
                        polarVoyageCameraOlympianTitaniumPrime37642 = polarVoyageLayoutPrimeForceBlaze5767.PolarVoyageBottomSheetOmegaNeo1907;
                        PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageRotateAnimationCyberCelestialDelta4768(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        polarVoyageStorageCyberSparkSpeed85972 = polarVoyageLayoutPrimeForceBlaze5767.PolarVoyageViewRogueMaster4778;
                        polarVoyageCameraOlympianTitaniumPrime37642 = polarVoyageLayoutPrimeForceBlaze5767.PolarVoyageBottomSheetOmegaNeo1907;
                        PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageRotateAnimationCyberCelestialDelta4768(obj);
                        char c = 2;
                        polarVoyageLayoutInflaterTitaniumMaxSolar68622 = polarVoyageLayoutInflaterTitaniumMaxSolar6862;
                        polarVoyageCameraOlympianTitaniumPrime3764 = polarVoyageCameraOlympianTitaniumPrime37642;
                        polarVoyageLayoutInflaterTitaniumMaxSolar6862 = polarVoyageLayoutInflaterTitaniumMaxSolar68622;
                        polarVoyageStorageCyberSparkSpeed8597 = polarVoyageStorageCyberSparkSpeed85972;
                        polarVoyageLayoutPrimeForceBlaze5767.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageCameraOlympianTitaniumPrime3764;
                        polarVoyageLayoutPrimeForceBlaze5767.PolarVoyageViewRogueMaster4778 = polarVoyageStorageCyberSparkSpeed8597;
                        polarVoyageLayoutPrimeForceBlaze5767.PolarVoyageSnackbarGammaEclipse2140 = 1;
                        PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageStorageCyberSparkSpeed8597.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageLayoutPrimeForceBlaze5767);
                        if (PolarVoyageMotionLayoutTransitionHeroVision4068 != polarVoyageDrawableCompatAuroraPulse6414) {
                            return polarVoyageDrawableCompatAuroraPulse6414;
                        }
                        PolarVoyageStorageCyberSparkSpeed8597 polarVoyageStorageCyberSparkSpeed85973 = polarVoyageStorageCyberSparkSpeed8597;
                        polarVoyageCameraOlympianTitaniumPrime37642 = polarVoyageCameraOlympianTitaniumPrime3764;
                        obj = PolarVoyageMotionLayoutTransitionHeroVision4068;
                        polarVoyageStorageCyberSparkSpeed85972 = polarVoyageStorageCyberSparkSpeed85973;
                        if (((Boolean) obj).booleanValue()) {
                            polarVoyageLayoutInflaterTitaniumMaxSolar6862.clear();
                            return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
                        }
                        polarVoyageStorageCyberSparkSpeed85972.PolarVoyageKotlinBetaPulseBeta3653();
                        if (PolarVoyageSnackbarGammaEclipse2140()) {
                            int i4 = polarVoyageLayoutInflaterTitaniumMaxSolar6862.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                            for (int i5 = 0; i5 < i4; i5++) {
                                PolarVoyageConfigurationMegaTitaniumQuantum2348 polarVoyageConfigurationMegaTitaniumQuantum2348 = (PolarVoyageConfigurationMegaTitaniumQuantum2348) polarVoyageLayoutInflaterTitaniumMaxSolar6862.PolarVoyageStrictModeLegendEpic1532[i5];
                                PolarVoyageActivityInfoBetaQuantum8726(polarVoyageConfigurationMegaTitaniumQuantum2348, polarVoyageCameraOlympianTitaniumPrime37642);
                                PolarVoyageLifecycleOlympianOmega3762(polarVoyageConfigurationMegaTitaniumQuantum2348);
                            }
                            polarVoyageCameraOlympianTitaniumPrime37642.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 0;
                            long[] jArr = polarVoyageCameraOlympianTitaniumPrime37642.PolarVoyageZipVortexCelestial6185;
                            if (jArr != PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageZipVortexCelestial6185) {
                                try {
                                    PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageDialogFragmentPixelEliteHyperion4038(jArr, -9187201950435737472L);
                                    long[] jArr2 = polarVoyageCameraOlympianTitaniumPrime37642.PolarVoyageZipVortexCelestial6185;
                                    i2 = polarVoyageCameraOlympianTitaniumPrime37642.PolarVoyageKotlinBetaPulseBeta3653;
                                    int i6 = i2 >> 3;
                                    jArr2[i6] = ((~j) & jArr2[i6]) | j;
                                } catch (Throwable th) {
                                    th = th;
                                    polarVoyageLayoutInflaterTitaniumMaxSolar68622.clear();
                                    throw th;
                                }
                                j = 255 << ((i2 & 7) << 3);
                                polarVoyageLayoutInflaterTitaniumMaxSolar68622 = polarVoyageLayoutInflaterTitaniumMaxSolar6862;
                            } else {
                                polarVoyageLayoutInflaterTitaniumMaxSolar68622 = polarVoyageLayoutInflaterTitaniumMaxSolar6862;
                            }
                            polarVoyageCameraOlympianTitaniumPrime37642.PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageZipVortexCelestial6185(polarVoyageCameraOlympianTitaniumPrime37642.PolarVoyageKotlinBetaPulseBeta3653) - polarVoyageCameraOlympianTitaniumPrime37642.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                            if (!this.PolarVoyageGuidelineStormSolar2850) {
                                this.PolarVoyageGuidelineStormSolar2850 = true;
                                this.PolarVoyageViewRogueMaster4778.post(this.PolarVoyageCanvasElitePhoenix4750);
                            }
                        } else {
                            polarVoyageLayoutInflaterTitaniumMaxSolar68622 = polarVoyageLayoutInflaterTitaniumMaxSolar6862;
                        }
                        polarVoyageLayoutInflaterTitaniumMaxSolar68622.clear();
                        this.PolarVoyageAnimatorSetSparkUltraMax8233.PolarVoyageKotlinBetaPulseBeta3653();
                        this.PolarVoyageBitmapMaxTitanTitan7960.PolarVoyageKotlinBetaPulseBeta3653();
                        long j2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                        polarVoyageLayoutPrimeForceBlaze5767.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageCameraOlympianTitaniumPrime37642;
                        polarVoyageLayoutPrimeForceBlaze5767.PolarVoyageViewRogueMaster4778 = polarVoyageStorageCyberSparkSpeed85972;
                        c = 2;
                        polarVoyageLayoutPrimeForceBlaze5767.PolarVoyageSnackbarGammaEclipse2140 = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
            polarVoyageLayoutInflaterTitaniumMaxSolar68622 = polarVoyageLayoutInflaterTitaniumMaxSolar6862;
        }
        polarVoyageLayoutPrimeForceBlaze5767 = new PolarVoyageLayoutPrimeForceBlaze5767(this, polarVoyageMotionSceneHyperVisionVision6497);
        Object obj2 = polarVoyageLayoutPrimeForceBlaze5767.PolarVoyageCameraPixelBlaze2629;
        i = polarVoyageLayoutPrimeForceBlaze5767.PolarVoyageSnackbarGammaEclipse2140;
        polarVoyageLayoutInflaterTitaniumMaxSolar6862 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
        PolarVoyageDrawableCompatAuroraPulse6414 polarVoyageDrawableCompatAuroraPulse64142 = PolarVoyageDrawableCompatAuroraPulse6414.PolarVoyageItemDecorationUltraDeltaEpic7485;
    }

    public final int PolarVoyageBottomSheetOmegaNeo1907(PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel2539) {
        PolarVoyageInAppPurchaseTitaniumEpic6306 polarVoyageInAppPurchaseTitaniumEpic6306 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (!polarVoyageInAppPurchaseTitaniumEpic6306.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageZipVortexCelestial6185)) {
            PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra2582 = PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageDiffUtilDragonSpeedEclipse6225;
            if (polarVoyageInAppPurchaseTitaniumEpic6306.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageLintBetaUltra2582)) {
                return (int) (((PolarVoyageAlphaAnimationThunderStrikeHyperion3499) polarVoyageInAppPurchaseTitaniumEpic6306.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageLintBetaUltra2582)).PolarVoyageZipVortexCelestial6185 & 4294967295L);
            }
        }
        return this.PolarVoyageMotionLayoutForceEpicAurora7183;
    }

    public final PolarVoyageIntentServiceEclipseGammaHero3323 PolarVoyageCameraPixelBlaze2629() {
        if (this.PolarVoyageLooperThreadAlphaPrime1279) {
            this.PolarVoyageLooperThreadAlphaPrime1279 = false;
            PolarVoyageRewardedAdUltraTitanium4787 polarVoyageRewardedAdUltraTitanium4787 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            this.PolarVoyageLifecycleOlympianOmega3762 = PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageActivityInfoBetaQuantum8726(polarVoyageRewardedAdUltraTitanium4787.getSemanticsOwner());
            if (PolarVoyageSnackbarGammaEclipse2140()) {
                PolarVoyageResourceEliteOlympian8553 polarVoyageResourceEliteOlympian8553 = this.PolarVoyageLifecycleOlympianOmega3762;
                Resources resources = polarVoyageRewardedAdUltraTitanium4787.getContext().getResources();
                PolarVoyageAlphaAnimationSparkNovaXTitan1212 polarVoyageAlphaAnimationSparkNovaXTitan1212 = this.PolarVoyageFCMCelestialCosmosPixel3711;
                polarVoyageAlphaAnimationSparkNovaXTitan1212.PolarVoyageZipVortexCelestial6185();
                PolarVoyageAlphaAnimationSparkNovaXTitan1212 polarVoyageAlphaAnimationSparkNovaXTitan12122 = this.PolarVoyageViewBindingPulseHeroSpeed5705;
                polarVoyageAlphaAnimationSparkNovaXTitan12122.PolarVoyageZipVortexCelestial6185();
                PolarVoyageItemDecorationPrimePrime4359 polarVoyageItemDecorationPrimePrime4359 = (PolarVoyageItemDecorationPrimePrime4359) polarVoyageResourceEliteOlympian8553.PolarVoyageMotionLayoutTransitionHeroVision4068(-1);
                PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel2539 = polarVoyageItemDecorationPrimePrime4359 != null ? polarVoyageItemDecorationPrimePrime4359.PolarVoyageZipVortexCelestial6185 : null;
                polarVoyageJobIntentServiceStormEclipsePixel2539.getClass();
                int i = 1;
                ArrayList PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageTextWatcherFusionShadowMega6632.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageJobIntentServiceStormEclipsePixel2539, new PolarVoyageColorStateListInflaterBetaShadow7539(i, polarVoyageResourceEliteOlympian8553), new PolarVoyageColorStateListInflaterBetaShadow7539(2, resources), PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageGuidelineStormSolar2850(polarVoyageJobIntentServiceStormEclipsePixel2539));
                int size = PolarVoyageMotionLayoutTransitionHeroVision4068.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((PolarVoyageJobIntentServiceStormEclipsePixel2539) PolarVoyageMotionLayoutTransitionHeroVision4068.get(i - 1)).PolarVoyageTextInputEditTextNebulaHero6651;
                        int i3 = ((PolarVoyageJobIntentServiceStormEclipsePixel2539) PolarVoyageMotionLayoutTransitionHeroVision4068.get(i)).PolarVoyageTextInputEditTextNebulaHero6651;
                        polarVoyageAlphaAnimationSparkNovaXTitan1212.PolarVoyageDiffUtilTurboStrike5735(i2, i3);
                        polarVoyageAlphaAnimationSparkNovaXTitan12122.PolarVoyageDiffUtilTurboStrike5735(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.PolarVoyageLifecycleOlympianOmega3762;
    }

    public final void PolarVoyageCameraViewSpectraMaxSpectra2824(String str, int i, int i2) {
        AccessibilityEvent PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageBitmapMaxTitanTitan7960(i), 32);
        PolarVoyageItemDecorationUltraDeltaEpic7485.setContentChangeTypes(i2);
        if (str != null) {
            PolarVoyageItemDecorationUltraDeltaEpic7485.getText().add(str);
        }
        PolarVoyageLayerDrawableShadowTitaniumOmega1942(PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    public final void PolarVoyageContentProviderHyperSpark3838(PolarVoyageConfigurationMegaTitaniumQuantum2348 polarVoyageConfigurationMegaTitaniumQuantum2348) {
        if (this.PolarVoyageCameraViewSpectraMaxSpectra2824.add(polarVoyageConfigurationMegaTitaniumQuantum2348)) {
            this.PolarVoyagePackageManagerCelestialPhoenix8393.PolarVoyageRemoteModelManagerOlympianCelestial9141(PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185);
        }
    }

    public final boolean PolarVoyageDiffUtilDragonSpeedEclipse6225(PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel2539, int i, int i2, boolean z) {
        String PolarVoyageDrawableDeltaHyperion5742;
        PolarVoyageInAppPurchaseTitaniumEpic6306 polarVoyageInAppPurchaseTitaniumEpic6306 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int i3 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageTextInputEditTextNebulaHero6651;
        PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra2582 = PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (polarVoyageInAppPurchaseTitaniumEpic6306.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageLintBetaUltra2582) && PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539)) {
            PolarVoyageViewPagerNovaShadow8337 polarVoyageViewPagerNovaShadow8337 = (PolarVoyageViewPagerNovaShadow8337) ((PolarVoyageRewardedAdPulseVision5089) polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageLintBetaUltra2582)).PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (polarVoyageViewPagerNovaShadow8337 != null) {
                return ((Boolean) polarVoyageViewPagerNovaShadow8337.PolarVoyageBitmapVisionAuroraPixel4705(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.PolarVoyageMotionLayoutForceEpicAurora7183) && (PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageDrawableDeltaHyperion5742(polarVoyageJobIntentServiceStormEclipsePixel2539)) != null) {
            if (i < 0 || i != i2 || i2 > PolarVoyageDrawableDeltaHyperion5742.length()) {
                i = -1;
            }
            this.PolarVoyageMotionLayoutForceEpicAurora7183 = i;
            boolean z2 = PolarVoyageDrawableDeltaHyperion5742.length() > 0;
            PolarVoyageLayerDrawableShadowTitaniumOmega1942(PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageBitmapMaxTitanTitan7960(i3), z2 ? Integer.valueOf(this.PolarVoyageMotionLayoutForceEpicAurora7183) : null, z2 ? Integer.valueOf(this.PolarVoyageMotionLayoutForceEpicAurora7183) : null, z2 ? Integer.valueOf(PolarVoyageDrawableDeltaHyperion5742.length()) : null, PolarVoyageDrawableDeltaHyperion5742));
            PolarVoyagePackageManagerCelestialPhoenix8393(i3);
            return true;
        }
        return false;
    }

    public final boolean PolarVoyageDiffUtilTurboStrike5735(int i, long j, boolean z) {
        PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra2582;
        int i2;
        if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            PolarVoyageIntentServiceEclipseGammaHero3323 PolarVoyageCameraPixelBlaze2629 = PolarVoyageCameraPixelBlaze2629();
            if (!PolarVoyageJobSchedulerGammaMaster7383.PolarVoyageMotionLayoutTransitionHeroVision4068(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    polarVoyageLintBetaUltra2582 = PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBitmapMaxTitanTitan7960;
                } else {
                    if (z) {
                        PolarVoyageAdapterFusionMasterGamma8495.PolarVoyageMotionLayoutTransitionHeroVision4068();
                        return false;
                    }
                    polarVoyageLintBetaUltra2582 = PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageAnimatorSetSparkUltraMax8233;
                }
                Object[] objArr = PolarVoyageCameraPixelBlaze2629.PolarVoyageKotlinBetaPulseBeta3653;
                long[] jArr = PolarVoyageCameraPixelBlaze2629.PolarVoyageZipVortexCelestial6185;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    PolarVoyageItemDecorationPrimePrime4359 polarVoyageItemDecorationPrimePrime4359 = (PolarVoyageItemDecorationPrimePrime4359) objArr[(i3 << 3) + i6];
                                    PolarVoyageFontFamilyPhantomInferno3561 polarVoyageFontFamilyPhantomInferno3561 = polarVoyageItemDecorationPrimePrime4359.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                    float f = polarVoyageFontFamilyPhantomInferno3561.PolarVoyageZipVortexCelestial6185;
                                    i2 = i4;
                                    float f2 = polarVoyageFontFamilyPhantomInferno3561.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                    float f3 = polarVoyageFontFamilyPhantomInferno3561.PolarVoyageKotlinBetaPulseBeta3653;
                                    float f4 = polarVoyageFontFamilyPhantomInferno3561.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((intBitsToFloat2 < f4) & (intBitsToFloat >= f) & (intBitsToFloat < f3) & (intBitsToFloat2 >= f2)) {
                                        Object PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageItemDecorationPrimePrime4359.PolarVoyageZipVortexCelestial6185.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageLintBetaUltra2582);
                                        if (PolarVoyageTextInputEditTextNebulaHero6651 == null) {
                                            PolarVoyageTextInputEditTextNebulaHero6651 = null;
                                        }
                                        PolarVoyageActivityFusionHyper3950 polarVoyageActivityFusionHyper3950 = (PolarVoyageActivityFusionHyper3950) PolarVoyageTextInputEditTextNebulaHero6651;
                                        if (polarVoyageActivityFusionHyper3950 != null) {
                                            PolarVoyageAnimatorDeltaUltraDragon6113 polarVoyageAnimatorDeltaUltraDragon6113 = polarVoyageActivityFusionHyper3950.PolarVoyageZipVortexCelestial6185;
                                            if (i < 0) {
                                                if (((Number) polarVoyageAnimatorDeltaUltraDragon6113.PolarVoyageMotionLayoutTransitionHeroVision4068()).floatValue() <= 0.0f) {
                                                }
                                                z2 = true;
                                            } else {
                                                if (((Number) polarVoyageAnimatorDeltaUltraDragon6113.PolarVoyageMotionLayoutTransitionHeroVision4068()).floatValue() >= ((Number) polarVoyageActivityFusionHyper3950.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068()).floatValue()) {
                                                }
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    public final void PolarVoyageDisplayMetricsVortexDragon9516(PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel2539, PolarVoyageImageCaptureTurboBetaSpark9944 polarVoyageImageCaptureTurboBetaSpark9944) {
        int[] iArr = PolarVoyageActivityDeltaDelta4379.PolarVoyageZipVortexCelestial6185;
        PolarVoyageCameraOlympianTitaniumPrime3764 polarVoyageCameraOlympianTitaniumPrime3764 = new PolarVoyageCameraOlympianTitaniumPrime3764();
        List PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageRotateAnimationCyberCelestialDelta4768(4, polarVoyageJobIntentServiceStormEclipsePixel2539);
        PolarVoyageConfigurationMegaTitaniumQuantum2348 polarVoyageConfigurationMegaTitaniumQuantum2348 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageKotlinBetaPulseBeta3653;
        int size = PolarVoyageRotateAnimationCyberCelestialDelta4768.size();
        for (int i = 0; i < size; i++) {
            PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel25392 = (PolarVoyageJobIntentServiceStormEclipsePixel2539) PolarVoyageRotateAnimationCyberCelestialDelta4768.get(i);
            PolarVoyageIntentServiceEclipseGammaHero3323 PolarVoyageCameraPixelBlaze2629 = PolarVoyageCameraPixelBlaze2629();
            int i2 = polarVoyageJobIntentServiceStormEclipsePixel25392.PolarVoyageTextInputEditTextNebulaHero6651;
            if (PolarVoyageCameraPixelBlaze2629.PolarVoyageZipVortexCelestial6185(i2)) {
                if (!polarVoyageImageCaptureTurboBetaSpark9944.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068(i2)) {
                    PolarVoyageContentProviderHyperSpark3838(polarVoyageConfigurationMegaTitaniumQuantum2348);
                    return;
                }
                polarVoyageCameraOlympianTitaniumPrime3764.PolarVoyageZipVortexCelestial6185(i2);
            }
        }
        PolarVoyageCameraOlympianTitaniumPrime3764 polarVoyageCameraOlympianTitaniumPrime37642 = polarVoyageImageCaptureTurboBetaSpark9944.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int[] iArr2 = polarVoyageCameraOlympianTitaniumPrime37642.PolarVoyageMotionLayoutTransitionHeroVision4068;
        long[] jArr = polarVoyageCameraOlympianTitaniumPrime37642.PolarVoyageZipVortexCelestial6185;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !polarVoyageCameraOlympianTitaniumPrime3764.PolarVoyageMotionLayoutTransitionHeroVision4068(iArr2[(i3 << 3) + i5])) {
                            PolarVoyageContentProviderHyperSpark3838(polarVoyageConfigurationMegaTitaniumQuantum2348);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List PolarVoyageRotateAnimationCyberCelestialDelta47682 = PolarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageRotateAnimationCyberCelestialDelta4768(4, polarVoyageJobIntentServiceStormEclipsePixel2539);
        int size2 = PolarVoyageRotateAnimationCyberCelestialDelta47682.size();
        for (int i6 = 0; i6 < size2; i6++) {
            PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel25393 = (PolarVoyageJobIntentServiceStormEclipsePixel2539) PolarVoyageRotateAnimationCyberCelestialDelta47682.get(i6);
            PolarVoyageImageCaptureTurboBetaSpark9944 polarVoyageImageCaptureTurboBetaSpark99442 = (PolarVoyageImageCaptureTurboBetaSpark9944) this.PolarVoyageToolbarEclipseInfernoHero6368.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageJobIntentServiceStormEclipsePixel25393.PolarVoyageTextInputEditTextNebulaHero6651);
            if (polarVoyageImageCaptureTurboBetaSpark99442 != null && PolarVoyageCameraPixelBlaze2629().PolarVoyageZipVortexCelestial6185(polarVoyageJobIntentServiceStormEclipsePixel25393.PolarVoyageTextInputEditTextNebulaHero6651)) {
                PolarVoyageDisplayMetricsVortexDragon9516(polarVoyageJobIntentServiceStormEclipsePixel25393, polarVoyageImageCaptureTurboBetaSpark99442);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int i2;
        int i3;
        char c2;
        PolarVoyageCameraOlympianTitaniumPrime3764 polarVoyageCameraOlympianTitaniumPrime3764 = new PolarVoyageCameraOlympianTitaniumPrime3764();
        PolarVoyageCameraOlympianTitaniumPrime3764 polarVoyageCameraOlympianTitaniumPrime37642 = this.PolarVoyageDiffUtilDragonSpeedEclipse6225;
        int[] iArr = polarVoyageCameraOlympianTitaniumPrime37642.PolarVoyageMotionLayoutTransitionHeroVision4068;
        long[] jArr3 = polarVoyageCameraOlympianTitaniumPrime37642.PolarVoyageZipVortexCelestial6185;
        int length = jArr3.length - 2;
        PolarVoyageResourceEliteOlympian8553 polarVoyageResourceEliteOlympian8553 = this.PolarVoyageToolbarEclipseInfernoHero6368;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i5];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j5 & 255) < 128) {
                            int i8 = iArr[(i5 << 3) + i7];
                            c2 = c3;
                            PolarVoyageItemDecorationPrimePrime4359 polarVoyageItemDecorationPrimePrime4359 = (PolarVoyageItemDecorationPrimePrime4359) PolarVoyageCameraPixelBlaze2629().PolarVoyageMotionLayoutTransitionHeroVision4068(i8);
                            PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel2539 = polarVoyageItemDecorationPrimePrime4359 != null ? polarVoyageItemDecorationPrimePrime4359.PolarVoyageZipVortexCelestial6185 : null;
                            if (polarVoyageJobIntentServiceStormEclipsePixel2539 != null) {
                                if (polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBarcodeScannerInfernoSolarSpark7767)) {
                                }
                            }
                            polarVoyageCameraOlympianTitaniumPrime3764.PolarVoyageZipVortexCelestial6185(i8);
                            PolarVoyageImageCaptureTurboBetaSpark9944 polarVoyageImageCaptureTurboBetaSpark9944 = (PolarVoyageImageCaptureTurboBetaSpark9944) polarVoyageResourceEliteOlympian8553.PolarVoyageMotionLayoutTransitionHeroVision4068(i8);
                            if (polarVoyageImageCaptureTurboBetaSpark9944 != null) {
                                Object PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageImageCaptureTurboBetaSpark9944.PolarVoyageZipVortexCelestial6185.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                                r23 = PolarVoyageTextInputEditTextNebulaHero6651 != 0 ? PolarVoyageTextInputEditTextNebulaHero6651 : null;
                            }
                            PolarVoyageCameraViewSpectraMaxSpectra2824(r23, i8, 32);
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i7++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i5 == length) {
                    break;
                } else {
                    i5++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = polarVoyageCameraOlympianTitaniumPrime3764.PolarVoyageMotionLayoutTransitionHeroVision4068;
        long[] jArr4 = polarVoyageCameraOlympianTitaniumPrime3764.PolarVoyageZipVortexCelestial6185;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j6 = jArr4[i9];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j6 & j2) < j) {
                            int i12 = iArr2[(i9 << 3) + i11];
                            int hashCode = Integer.hashCode(i12) * (-862048943);
                            int i13 = hashCode ^ (hashCode << 16);
                            int i14 = i13 & 127;
                            int i15 = polarVoyageCameraOlympianTitaniumPrime37642.PolarVoyageKotlinBetaPulseBeta3653;
                            int i16 = (i13 >>> 7) & i15;
                            i = i4;
                            int i17 = 0;
                            while (true) {
                                long[] jArr5 = polarVoyageCameraOlympianTitaniumPrime37642.PolarVoyageZipVortexCelestial6185;
                                int i18 = i16 >> 3;
                                jArr2 = jArr4;
                                int i19 = (i16 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i18] >>> i19) | ((jArr5[i18 + 1] << (64 - i19)) & ((-i19) >> 63));
                                int i20 = i15;
                                long j8 = (i14 * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (true) {
                                    if (j9 == 0) {
                                        break;
                                    }
                                    i3 = (i16 + (Long.numberOfTrailingZeros(j9) >> 3)) & i20;
                                    int i21 = i20;
                                    if (polarVoyageCameraOlympianTitaniumPrime37642.PolarVoyageMotionLayoutTransitionHeroVision4068[i3] == i12) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i20 = i21;
                                }
                                i17 += 8;
                                i16 = (i16 + i17) & i2;
                                jArr4 = jArr2;
                                i15 = i2;
                                j6 = j4;
                            }
                            int i22 = i3;
                            if (i22 >= 0) {
                                polarVoyageCameraOlympianTitaniumPrime37642.PolarVoyageDiffUtilTurboStrike5735(i22);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i4;
                        }
                        j6 = j4 >> i;
                        i11++;
                        i4 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i10 != i4) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i9 == length2) {
                    break;
                }
                i9++;
                jArr4 = jArr;
                i4 = 8;
            }
        }
        polarVoyageResourceEliteOlympian8553.PolarVoyageKotlinBetaPulseBeta3653();
        PolarVoyageIntentServiceEclipseGammaHero3323 PolarVoyageCameraPixelBlaze2629 = PolarVoyageCameraPixelBlaze2629();
        int[] iArr3 = PolarVoyageCameraPixelBlaze2629.PolarVoyageMotionLayoutTransitionHeroVision4068;
        Object[] objArr = PolarVoyageCameraPixelBlaze2629.PolarVoyageKotlinBetaPulseBeta3653;
        long[] jArr6 = PolarVoyageCameraPixelBlaze2629.PolarVoyageZipVortexCelestial6185;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i23 = 0;
            while (true) {
                long j10 = jArr6[i23];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i24 = 8 - ((~(i23 - length3)) >>> 31);
                    for (int i25 = 0; i25 < i24; i25++) {
                        if ((j10 & j2) < j) {
                            int i26 = (i23 << 3) + i25;
                            int i27 = iArr3[i26];
                            PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel25392 = ((PolarVoyageItemDecorationPrimePrime4359) objArr[i26]).PolarVoyageZipVortexCelestial6185;
                            PolarVoyageInAppPurchaseTitaniumEpic6306 polarVoyageInAppPurchaseTitaniumEpic6306 = polarVoyageJobIntentServiceStormEclipsePixel25392.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                            PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra2582 = PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                            if (polarVoyageInAppPurchaseTitaniumEpic6306.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageLintBetaUltra2582) && polarVoyageCameraOlympianTitaniumPrime37642.PolarVoyageZipVortexCelestial6185(i27)) {
                                PolarVoyageCameraViewSpectraMaxSpectra2824((String) polarVoyageJobIntentServiceStormEclipsePixel25392.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageLintBetaUltra2582), i27, 16);
                            }
                            polarVoyageResourceEliteOlympian8553.PolarVoyageItemDecorationUltraDeltaEpic7485(i27, new PolarVoyageImageCaptureTurboBetaSpark9944(polarVoyageJobIntentServiceStormEclipsePixel25392, PolarVoyageCameraPixelBlaze2629()));
                        }
                        j10 >>= 8;
                    }
                    if (i24 != 8) {
                        break;
                    }
                }
                if (i23 == length3) {
                    break;
                } else {
                    i23++;
                }
            }
        }
        this.PolarVoyageAlarmManagerShadowHyperBeta8339 = new PolarVoyageImageCaptureTurboBetaSpark9944(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.getSemanticsOwner().PolarVoyageZipVortexCelestial6185(), PolarVoyageCameraPixelBlaze2629());
    }

    public final AccessibilityEvent PolarVoyageItemDecorationUltraDeltaEpic7485(int i, int i2) {
        PolarVoyageItemDecorationPrimePrime4359 polarVoyageItemDecorationPrimePrime4359;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        PolarVoyageRewardedAdUltraTitanium4787 polarVoyageRewardedAdUltraTitanium4787 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        obtain.setPackageName(polarVoyageRewardedAdUltraTitanium4787.getContext().getPackageName());
        obtain.setSource(polarVoyageRewardedAdUltraTitanium4787, i);
        if (PolarVoyageSnackbarGammaEclipse2140() && (polarVoyageItemDecorationPrimePrime4359 = (PolarVoyageItemDecorationPrimePrime4359) PolarVoyageCameraPixelBlaze2629().PolarVoyageMotionLayoutTransitionHeroVision4068(i)) != null) {
            PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel2539 = polarVoyageItemDecorationPrimePrime4359.PolarVoyageZipVortexCelestial6185;
            obtain.setPassword(polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageCardViewAlphaVortexCelestial9747));
            Object PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageCameraPixelBlaze2629);
            if (PolarVoyageTextInputEditTextNebulaHero6651 == null) {
                PolarVoyageTextInputEditTextNebulaHero6651 = null;
            }
            boolean PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageTextInputEditTextNebulaHero6651, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                PolarVoyageToolbarBlazeTitanium3444.PolarVoyageDiffUtilTurboStrike5735(obtain, PolarVoyageItemDecorationUltraDeltaEpic7485);
            }
        }
        return obtain;
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653(int i, PolarVoyageToastUltraNeo6602 polarVoyageToastUltraNeo6602, String str, Bundle bundle) {
        PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel2539;
        Region PolarVoyageCardViewAlphaVortexCelestial9747;
        float[] PolarVoyageViewBindingPulseHeroSpeed5705;
        Rect PolarVoyageFCMCelestialCosmosPixel3711;
        int i2;
        float PolarVoyageItemDecorationUltraDeltaEpic7485;
        float PolarVoyageItemDecorationUltraDeltaEpic74852;
        float PolarVoyageTextInputEditTextNebulaHero6651;
        float PolarVoyageTextInputEditTextNebulaHero66512;
        AccessibilityNodeInfo accessibilityNodeInfo;
        int i3;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo2 = polarVoyageToastUltraNeo6602.PolarVoyageZipVortexCelestial6185;
        PolarVoyageItemDecorationPrimePrime4359 polarVoyageItemDecorationPrimePrime4359 = (PolarVoyageItemDecorationPrimePrime4359) PolarVoyageCameraPixelBlaze2629().PolarVoyageMotionLayoutTransitionHeroVision4068(i);
        if (polarVoyageItemDecorationPrimePrime4359 == null || (polarVoyageJobIntentServiceStormEclipsePixel2539 = polarVoyageItemDecorationPrimePrime4359.PolarVoyageZipVortexCelestial6185) == null) {
            return;
        }
        PolarVoyageInAppPurchaseTitaniumEpic6306 polarVoyageInAppPurchaseTitaniumEpic6306 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        PolarVoyageKeyframeThunderMegaVortex8492 polarVoyageKeyframeThunderMegaVortex8492 = polarVoyageInAppPurchaseTitaniumEpic6306.PolarVoyageItemDecorationUltraDeltaEpic7485;
        String PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageDrawableDeltaHyperion5742(polarVoyageJobIntentServiceStormEclipsePixel2539);
        if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(str, this.PolarVoyageCardViewAlphaVortexCelestial9747)) {
            int PolarVoyageBarcodeScannerInfernoSolarSpark7767 = this.PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i);
            if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                return;
            }
            return;
        }
        if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(str, this.PolarVoyageFlingGestureEclipsePrimeMax1376)) {
            int PolarVoyageBarcodeScannerInfernoSolarSpark77672 = this.PolarVoyageViewBindingPulseHeroSpeed5705.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i);
            if (PolarVoyageBarcodeScannerInfernoSolarSpark77672 != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, PolarVoyageBarcodeScannerInfernoSolarSpark77672);
                return;
            }
            return;
        }
        boolean z = false;
        if (!polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageZipVortexCelestial6185) || bundle == null || !PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra2582 = PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageMotionLayoutForceEpicAurora7183;
            if (polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageLintBetaUltra2582) && bundle != null && PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(str, "androidx.compose.ui.semantics.testTag")) {
                Object PolarVoyageTextInputEditTextNebulaHero66513 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageLintBetaUltra2582);
                String str2 = (String) (PolarVoyageTextInputEditTextNebulaHero66513 == null ? null : PolarVoyageTextInputEditTextNebulaHero66513);
                if (str2 != null) {
                    accessibilityNodeInfo2.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(str, "androidx.compose.ui.semantics.id")) {
                accessibilityNodeInfo2.getExtras().putInt(str, polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageTextInputEditTextNebulaHero6651);
                return;
            }
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(str, "androidx.compose.ui.semantics.shapeType")) {
                Object PolarVoyageTextInputEditTextNebulaHero66514 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageAlarmManagerShadowHyperBeta8339);
                PolarVoyageTextViewStormDragon9134 polarVoyageTextViewStormDragon9134 = (PolarVoyageTextViewStormDragon9134) (PolarVoyageTextInputEditTextNebulaHero66514 == null ? null : PolarVoyageTextInputEditTextNebulaHero66514);
                if (polarVoyageTextViewStormDragon9134 != null) {
                    PolarVoyageNestedScrollViewBlazeMaxMax1969 PolarVoyageStrictModeLegendEpic1532 = PolarVoyageStrictModeLegendEpic1532(polarVoyageTextViewStormDragon9134, polarVoyageJobIntentServiceStormEclipsePixel2539);
                    if (PolarVoyageStrictModeLegendEpic1532 instanceof PolarVoyageColorStateListSpectraSpectraEpic3899) {
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", PolarVoyageFCMCelestialCosmosPixel3711(PolarVoyageStrictModeLegendEpic1532));
                        return;
                    } else if (PolarVoyageStrictModeLegendEpic1532 instanceof PolarVoyageThreadRogueMegaAurora9435) {
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", PolarVoyageFCMCelestialCosmosPixel3711(PolarVoyageStrictModeLegendEpic1532));
                        accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", PolarVoyageViewBindingPulseHeroSpeed5705(PolarVoyageStrictModeLegendEpic1532));
                        return;
                    } else if (!(PolarVoyageStrictModeLegendEpic1532 instanceof PolarVoyageVelocityTrackerNovaXBetaFusion3202)) {
                        PolarVoyageAdapterFusionMasterGamma8495.PolarVoyageMotionLayoutTransitionHeroVision4068();
                        return;
                    } else {
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", PolarVoyageCardViewAlphaVortexCelestial9747(PolarVoyageStrictModeLegendEpic1532));
                        return;
                    }
                }
                return;
            }
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(str, "androidx.compose.ui.semantics.shapeRect")) {
                Object PolarVoyageTextInputEditTextNebulaHero66515 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageAlarmManagerShadowHyperBeta8339);
                PolarVoyageTextViewStormDragon9134 polarVoyageTextViewStormDragon91342 = (PolarVoyageTextViewStormDragon9134) (PolarVoyageTextInputEditTextNebulaHero66515 == null ? null : PolarVoyageTextInputEditTextNebulaHero66515);
                if (polarVoyageTextViewStormDragon91342 == null || (PolarVoyageFCMCelestialCosmosPixel3711 = PolarVoyageFCMCelestialCosmosPixel3711(PolarVoyageStrictModeLegendEpic1532(polarVoyageTextViewStormDragon91342, polarVoyageJobIntentServiceStormEclipsePixel2539))) == null) {
                    return;
                }
                accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", PolarVoyageFCMCelestialCosmosPixel3711);
                return;
            }
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(str, "androidx.compose.ui.semantics.shapeCorners")) {
                Object PolarVoyageTextInputEditTextNebulaHero66516 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageAlarmManagerShadowHyperBeta8339);
                PolarVoyageTextViewStormDragon9134 polarVoyageTextViewStormDragon91343 = (PolarVoyageTextViewStormDragon9134) (PolarVoyageTextInputEditTextNebulaHero66516 == null ? null : PolarVoyageTextInputEditTextNebulaHero66516);
                if (polarVoyageTextViewStormDragon91343 == null || (PolarVoyageViewBindingPulseHeroSpeed5705 = PolarVoyageViewBindingPulseHeroSpeed5705(PolarVoyageStrictModeLegendEpic1532(polarVoyageTextViewStormDragon91343, polarVoyageJobIntentServiceStormEclipsePixel2539))) == null) {
                    return;
                }
                accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", PolarVoyageViewBindingPulseHeroSpeed5705);
                return;
            }
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(str, "androidx.compose.ui.semantics.shapeRegion")) {
                Object PolarVoyageTextInputEditTextNebulaHero66517 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageAlarmManagerShadowHyperBeta8339);
                PolarVoyageTextViewStormDragon9134 polarVoyageTextViewStormDragon91344 = (PolarVoyageTextViewStormDragon9134) (PolarVoyageTextInputEditTextNebulaHero66517 == null ? null : PolarVoyageTextInputEditTextNebulaHero66517);
                if (polarVoyageTextViewStormDragon91344 == null || (PolarVoyageCardViewAlphaVortexCelestial9747 = PolarVoyageCardViewAlphaVortexCelestial9747(PolarVoyageStrictModeLegendEpic1532(polarVoyageTextViewStormDragon91344, polarVoyageJobIntentServiceStormEclipsePixel2539))) == null) {
                    return;
                }
                accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", PolarVoyageCardViewAlphaVortexCelestial9747);
                return;
            }
            return;
        }
        int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i5 > 0 && i4 >= 0) {
            if (i4 < (PolarVoyageDrawableDeltaHyperion5742 != null ? PolarVoyageDrawableDeltaHyperion5742.length() : Integer.MAX_VALUE)) {
                PolarVoyageMenuNovaBetaVortex4446 PolarVoyageItemDecorationUltraDeltaEpic74853 = PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageInAppPurchaseTitaniumEpic6306);
                if (PolarVoyageItemDecorationUltraDeltaEpic74853 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i6 = 0;
                while (i6 < i5) {
                    int i7 = i4 + i6;
                    if (i7 >= PolarVoyageItemDecorationUltraDeltaEpic74853.PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185.PolarVoyageStrictModeLegendEpic1532.length()) {
                        arrayList.add(z);
                        i2 = i4;
                        accessibilityNodeInfo = accessibilityNodeInfo2;
                        i3 = i5;
                    } else {
                        PolarVoyagePaintFlagsDrawFilterThunderVortex4639 polarVoyagePaintFlagsDrawFilterThunderVortex4639 = PolarVoyageItemDecorationUltraDeltaEpic74853.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        PolarVoyageDelayAuroraSparkTurbo6655 polarVoyageDelayAuroraSparkTurbo6655 = (PolarVoyageDelayAuroraSparkTurbo6655) ((PolarVoyageAnimatorCelestialDeltaMaster5821) polarVoyagePaintFlagsDrawFilterThunderVortex4639.PolarVoyageKotlinBetaPulseBeta3653).PolarVoyageStrictModeLegendEpic1532;
                        if (i7 < 0 || i7 >= polarVoyageDelayAuroraSparkTurbo6655.PolarVoyageStrictModeLegendEpic1532.length()) {
                            StringBuilder PolarVoyageContentProviderHyperSpark3838 = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageContentProviderHyperSpark3838("offset(", i7, ") is out of bounds [0, ");
                            PolarVoyageContentProviderHyperSpark3838.append(polarVoyageDelayAuroraSparkTurbo6655.PolarVoyageStrictModeLegendEpic1532.length());
                            PolarVoyageContentProviderHyperSpark3838.append(')');
                            PolarVoyageShapeDrawableSpeedPixel9873.PolarVoyageZipVortexCelestial6185(PolarVoyageContentProviderHyperSpark3838.toString());
                        }
                        ArrayList arrayList2 = (ArrayList) polarVoyagePaintFlagsDrawFilterThunderVortex4639.PolarVoyageBitmapVisionAuroraPixel4705;
                        PolarVoyageLinearLayoutHyperionMega9664 polarVoyageLinearLayoutHyperionMega9664 = (PolarVoyageLinearLayoutHyperionMega9664) arrayList2.get(PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyagePackageManagerCelestialPhoenix8393(i7, arrayList2));
                        PolarVoyageFlowMaxRogue7812 polarVoyageFlowMaxRogue7812 = polarVoyageLinearLayoutHyperionMega9664.PolarVoyageZipVortexCelestial6185;
                        int PolarVoyageZipVortexCelestial6185 = polarVoyageLinearLayoutHyperionMega9664.PolarVoyageZipVortexCelestial6185(i7);
                        CharSequence charSequence = polarVoyageFlowMaxRogue7812.PolarVoyageBitmapVisionAuroraPixel4705;
                        if (PolarVoyageZipVortexCelestial6185 < 0 || PolarVoyageZipVortexCelestial6185 >= charSequence.length()) {
                            StringBuilder PolarVoyageContentProviderHyperSpark38382 = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageContentProviderHyperSpark3838("offset(", PolarVoyageZipVortexCelestial6185, ") is out of bounds [0,");
                            PolarVoyageContentProviderHyperSpark38382.append(charSequence.length());
                            PolarVoyageContentProviderHyperSpark38382.append(')');
                            PolarVoyageShapeDrawableSpeedPixel9873.PolarVoyageZipVortexCelestial6185(PolarVoyageContentProviderHyperSpark38382.toString());
                        }
                        PolarVoyageLifecycleCameraControllerPulsePixel1445 polarVoyageLifecycleCameraControllerPulsePixel1445 = polarVoyageFlowMaxRogue7812.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                        Layout layout = polarVoyageLifecycleCameraControllerPulsePixel1445.PolarVoyageBitmapVisionAuroraPixel4705;
                        int lineForOffset = layout.getLineForOffset(PolarVoyageZipVortexCelestial6185);
                        float PolarVoyageDiffUtilTurboStrike5735 = polarVoyageLifecycleCameraControllerPulsePixel1445.PolarVoyageDiffUtilTurboStrike5735(lineForOffset);
                        float PolarVoyageBarcodeScannerInfernoSolarSpark77673 = polarVoyageLifecycleCameraControllerPulsePixel1445.PolarVoyageBarcodeScannerInfernoSolarSpark7767(lineForOffset);
                        i2 = i4;
                        boolean z2 = layout.getParagraphDirection(lineForOffset) == 1;
                        boolean isRtlCharAt = layout.isRtlCharAt(PolarVoyageZipVortexCelestial6185);
                        if (!z2 || isRtlCharAt) {
                            if (z2 && isRtlCharAt) {
                                PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageLifecycleCameraControllerPulsePixel1445.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageZipVortexCelestial6185, false);
                                PolarVoyageTextInputEditTextNebulaHero66512 = polarVoyageLifecycleCameraControllerPulsePixel1445.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageZipVortexCelestial6185 + 1, true);
                            } else if (isRtlCharAt) {
                                PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageLifecycleCameraControllerPulsePixel1445.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageZipVortexCelestial6185, false);
                                PolarVoyageTextInputEditTextNebulaHero66512 = polarVoyageLifecycleCameraControllerPulsePixel1445.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageZipVortexCelestial6185 + 1, true);
                            } else {
                                PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageLifecycleCameraControllerPulsePixel1445.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageZipVortexCelestial6185, false);
                                PolarVoyageItemDecorationUltraDeltaEpic74852 = polarVoyageLifecycleCameraControllerPulsePixel1445.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageZipVortexCelestial6185 + 1, true);
                            }
                            float f = PolarVoyageTextInputEditTextNebulaHero6651;
                            PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageTextInputEditTextNebulaHero66512;
                            PolarVoyageItemDecorationUltraDeltaEpic74852 = f;
                        } else {
                            PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageLifecycleCameraControllerPulsePixel1445.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageZipVortexCelestial6185, false);
                            PolarVoyageItemDecorationUltraDeltaEpic74852 = polarVoyageLifecycleCameraControllerPulsePixel1445.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageZipVortexCelestial6185 + 1, true);
                        }
                        RectF rectF2 = new RectF(PolarVoyageItemDecorationUltraDeltaEpic7485, PolarVoyageDiffUtilTurboStrike5735, PolarVoyageItemDecorationUltraDeltaEpic74852, PolarVoyageBarcodeScannerInfernoSolarSpark77673);
                        accessibilityNodeInfo = accessibilityNodeInfo2;
                        i3 = i5;
                        long floatToRawIntBits = (Float.floatToRawIntBits(polarVoyageLinearLayoutHyperionMega9664.PolarVoyageDiffUtilTurboStrike5735) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                        int i8 = (int) (floatToRawIntBits >> 32);
                        int i9 = (int) (floatToRawIntBits & 4294967295L);
                        PolarVoyageCardViewPulseSpark7250 polarVoyageCardViewPulseSpark7250 = new PolarVoyageCardViewPulseSpark7250(Float.intBitsToFloat(i8) + rectF2.left, Float.intBitsToFloat(i9) + rectF2.top, Float.intBitsToFloat(i8) + rectF2.right, Float.intBitsToFloat(i9) + rectF2.bottom);
                        PolarVoyageCardViewNebulaTitanGamma6305 PolarVoyageBarcodeScannerInfernoSolarSpark77674 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                        long j = 0;
                        if (PolarVoyageBarcodeScannerInfernoSolarSpark77674 != null) {
                            if (!PolarVoyageBarcodeScannerInfernoSolarSpark77674.PolarVoyageClipDrawableLegendTitanium3361().PolarVoyageDisplayMetricsVortexDragon9516) {
                                PolarVoyageBarcodeScannerInfernoSolarSpark77674 = null;
                            }
                            if (PolarVoyageBarcodeScannerInfernoSolarSpark77674 != null) {
                                j = PolarVoyageBarcodeScannerInfernoSolarSpark77674.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(0L);
                            }
                        }
                        PolarVoyageCardViewPulseSpark7250 PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageCardViewPulseSpark7250.PolarVoyageBitmapVisionAuroraPixel4705(j);
                        PolarVoyageCardViewPulseSpark7250 PolarVoyageTextInputEditTextNebulaHero66518 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageTextInputEditTextNebulaHero6651();
                        if ((((((PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageZipVortexCelestial6185 > PolarVoyageTextInputEditTextNebulaHero66518.PolarVoyageKotlinBetaPulseBeta3653 ? 1 : (PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageZipVortexCelestial6185 == PolarVoyageTextInputEditTextNebulaHero66518.PolarVoyageKotlinBetaPulseBeta3653 ? 0 : -1)) < 0) & ((PolarVoyageTextInputEditTextNebulaHero66518.PolarVoyageZipVortexCelestial6185 > PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageKotlinBetaPulseBeta3653 ? 1 : (PolarVoyageTextInputEditTextNebulaHero66518.PolarVoyageZipVortexCelestial6185 == PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageKotlinBetaPulseBeta3653 ? 0 : -1)) < 0)) & ((PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageMotionLayoutTransitionHeroVision4068 > PolarVoyageTextInputEditTextNebulaHero66518.PolarVoyageBarcodeScannerInfernoSolarSpark7767 ? 1 : (PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageMotionLayoutTransitionHeroVision4068 == PolarVoyageTextInputEditTextNebulaHero66518.PolarVoyageBarcodeScannerInfernoSolarSpark7767 ? 0 : -1)) < 0)) & ((PolarVoyageTextInputEditTextNebulaHero66518.PolarVoyageMotionLayoutTransitionHeroVision4068 > PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageBarcodeScannerInfernoSolarSpark7767 ? 1 : (PolarVoyageTextInputEditTextNebulaHero66518.PolarVoyageMotionLayoutTransitionHeroVision4068 == PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageBarcodeScannerInfernoSolarSpark7767 ? 0 : -1)) < 0) ? PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageTextInputEditTextNebulaHero66518) : null) != null) {
                            PolarVoyageRewardedAdUltraTitanium4787 polarVoyageRewardedAdUltraTitanium4787 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                            long PolarVoyageLayerDrawableShadowTitaniumOmega1942 = polarVoyageRewardedAdUltraTitanium4787.PolarVoyageLayerDrawableShadowTitaniumOmega1942((Float.floatToRawIntBits(r1.PolarVoyageMotionLayoutTransitionHeroVision4068) & 4294967295L) | (Float.floatToRawIntBits(r1.PolarVoyageZipVortexCelestial6185) << 32));
                            long PolarVoyageLayerDrawableShadowTitaniumOmega19422 = polarVoyageRewardedAdUltraTitanium4787.PolarVoyageLayerDrawableShadowTitaniumOmega1942((Float.floatToRawIntBits(r1.PolarVoyageKotlinBetaPulseBeta3653) << 32) | (Float.floatToRawIntBits(r1.PolarVoyageBarcodeScannerInfernoSolarSpark7767) & 4294967295L));
                            int i10 = (int) (PolarVoyageLayerDrawableShadowTitaniumOmega1942 >> 32);
                            int i11 = (int) (PolarVoyageLayerDrawableShadowTitaniumOmega19422 >> 32);
                            int i12 = (int) (PolarVoyageLayerDrawableShadowTitaniumOmega1942 & 4294967295L);
                            int i13 = (int) (PolarVoyageLayerDrawableShadowTitaniumOmega19422 & 4294967295L);
                            rectF = new RectF(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)));
                        } else {
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i6++;
                    i5 = i3;
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                    i4 = i2;
                    z = false;
                }
                accessibilityNodeInfo2.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final boolean PolarVoyageLayerDrawableShadowTitaniumOmega1942(AccessibilityEvent accessibilityEvent) {
        if (!PolarVoyageSnackbarGammaEclipse2140()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.PolarVoyageNavigationViewHyperHyperHyperion1793 = true;
        }
        try {
            return ((Boolean) this.PolarVoyageDiffUtilTurboStrike5735.PolarVoyageZipVortexCelestial6185(accessibilityEvent)).booleanValue();
        } finally {
            this.PolarVoyageNavigationViewHyperHyperHyperion1793 = false;
        }
    }

    public final void PolarVoyageLifecycleOlympianOmega3762(PolarVoyageConfigurationMegaTitaniumQuantum2348 polarVoyageConfigurationMegaTitaniumQuantum2348) {
        if (polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageViewBindingPulseHeroSpeed5705() && !this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(polarVoyageConfigurationMegaTitaniumQuantum2348)) {
            int i = polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageStrictModeLegendEpic1532;
            PolarVoyageActivityFusionHyper3950 polarVoyageActivityFusionHyper3950 = (PolarVoyageActivityFusionHyper3950) this.PolarVoyageAnimatorSetSparkUltraMax8233.PolarVoyageMotionLayoutTransitionHeroVision4068(i);
            PolarVoyageActivityFusionHyper3950 polarVoyageActivityFusionHyper39502 = (PolarVoyageActivityFusionHyper3950) this.PolarVoyageBitmapMaxTitanTitan7960.PolarVoyageMotionLayoutTransitionHeroVision4068(i);
            if (polarVoyageActivityFusionHyper3950 == null && polarVoyageActivityFusionHyper39502 == null) {
                return;
            }
            AccessibilityEvent PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageItemDecorationUltraDeltaEpic7485(i, 4096);
            if (polarVoyageActivityFusionHyper3950 != null) {
                PolarVoyageItemDecorationUltraDeltaEpic7485.setScrollX((int) ((Number) polarVoyageActivityFusionHyper3950.PolarVoyageZipVortexCelestial6185.PolarVoyageMotionLayoutTransitionHeroVision4068()).floatValue());
                PolarVoyageItemDecorationUltraDeltaEpic7485.setMaxScrollX((int) ((Number) polarVoyageActivityFusionHyper3950.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068()).floatValue());
            }
            if (polarVoyageActivityFusionHyper39502 != null) {
                PolarVoyageItemDecorationUltraDeltaEpic7485.setScrollY((int) ((Number) polarVoyageActivityFusionHyper39502.PolarVoyageZipVortexCelestial6185.PolarVoyageMotionLayoutTransitionHeroVision4068()).floatValue());
                PolarVoyageItemDecorationUltraDeltaEpic7485.setMaxScrollY((int) ((Number) polarVoyageActivityFusionHyper39502.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068()).floatValue());
            }
            PolarVoyageLayerDrawableShadowTitaniumOmega1942(PolarVoyageItemDecorationUltraDeltaEpic7485);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x0428, code lost:
    
        if (r1.isEmpty() == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x045a, code lost:
    
        if (r5 != null) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x045f, code lost:
    
        if (r5 == null) goto L212;
     */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageLooperThreadAlphaPrime1279(PolarVoyageIntentServiceEclipseGammaHero3323 polarVoyageIntentServiceEclipseGammaHero3323) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i2;
        int i3;
        Integer num2;
        PolarVoyageInAppPurchaseTitaniumEpic6306 polarVoyageInAppPurchaseTitaniumEpic6306;
        PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel2539;
        int i4;
        boolean z;
        boolean z2;
        PolarVoyageKeyframeThunderMegaVortex8492 polarVoyageKeyframeThunderMegaVortex8492;
        int i5;
        int i6;
        PolarVoyageInAppPurchaseTitaniumEpic6306 polarVoyageInAppPurchaseTitaniumEpic63062;
        ArrayList arrayList3;
        int i7;
        long j;
        int i8;
        Integer num3;
        int i9;
        PolarVoyageKeyframeThunderMegaVortex8492 polarVoyageKeyframeThunderMegaVortex84922;
        int i10;
        int i11;
        PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel25392;
        PolarVoyagePushNotificationQuantumCelestial9827 polarVoyagePushNotificationQuantumCelestial9827;
        boolean z3;
        PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra2582;
        PolarVoyagePushNotificationQuantumCelestial9827 polarVoyagePushNotificationQuantumCelestial98272;
        boolean z4;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        Integer num4;
        AccessibilityEvent PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Integer num5;
        PolarVoyageIntentServiceEclipseGammaHero3323 polarVoyageIntentServiceEclipseGammaHero33232 = polarVoyageIntentServiceEclipseGammaHero3323;
        ArrayList arrayList4 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = polarVoyageIntentServiceEclipseGammaHero33232.PolarVoyageMotionLayoutTransitionHeroVision4068;
        long[] jArr3 = polarVoyageIntentServiceEclipseGammaHero33232.PolarVoyageZipVortexCelestial6185;
        int i16 = 2;
        int length = jArr3.length - 2;
        int i17 = 0;
        Integer num6 = 0;
        if (length < 0) {
            return;
        }
        int i18 = 0;
        while (true) {
            long j2 = jArr3[i18];
            int i19 = i16;
            int i20 = length;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i21 = 8;
                int i22 = 8 - ((~(i18 - i20)) >>> 31);
                long j3 = j2;
                int i23 = i17;
                while (i23 < i22) {
                    if ((j3 & 255) < 128) {
                        int i24 = iArr3[(i18 << 3) + i23];
                        PolarVoyageImageCaptureTurboBetaSpark9944 polarVoyageImageCaptureTurboBetaSpark9944 = (PolarVoyageImageCaptureTurboBetaSpark9944) this.PolarVoyageToolbarEclipseInfernoHero6368.PolarVoyageMotionLayoutTransitionHeroVision4068(i24);
                        if (polarVoyageImageCaptureTurboBetaSpark9944 != null) {
                            PolarVoyageInAppPurchaseTitaniumEpic6306 polarVoyageInAppPurchaseTitaniumEpic63063 = polarVoyageImageCaptureTurboBetaSpark9944.PolarVoyageZipVortexCelestial6185;
                            PolarVoyageKeyframeThunderMegaVortex8492 polarVoyageKeyframeThunderMegaVortex84923 = polarVoyageInAppPurchaseTitaniumEpic63063.PolarVoyageItemDecorationUltraDeltaEpic7485;
                            PolarVoyageItemDecorationPrimePrime4359 polarVoyageItemDecorationPrimePrime4359 = (PolarVoyageItemDecorationPrimePrime4359) polarVoyageIntentServiceEclipseGammaHero33232.PolarVoyageMotionLayoutTransitionHeroVision4068(i24);
                            PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel25393 = polarVoyageItemDecorationPrimePrime4359 != null ? polarVoyageItemDecorationPrimePrime4359.PolarVoyageZipVortexCelestial6185 : null;
                            if (polarVoyageJobIntentServiceStormEclipsePixel25393 == null) {
                                throw PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageKotlinBetaPulseBeta3653("no value for specified key");
                            }
                            int i25 = i21;
                            int i26 = polarVoyageJobIntentServiceStormEclipsePixel25393.PolarVoyageTextInputEditTextNebulaHero6651;
                            PolarVoyageInAppPurchaseTitaniumEpic6306 polarVoyageInAppPurchaseTitaniumEpic63064 = polarVoyageJobIntentServiceStormEclipsePixel25393.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                            iArr2 = iArr3;
                            PolarVoyageKeyframeThunderMegaVortex8492 polarVoyageKeyframeThunderMegaVortex84924 = polarVoyageInAppPurchaseTitaniumEpic63064.PolarVoyageItemDecorationUltraDeltaEpic7485;
                            jArr2 = jArr3;
                            Object[] objArr = polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageMotionLayoutTransitionHeroVision4068;
                            Object[] objArr2 = polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageKotlinBetaPulseBeta3653;
                            long[] jArr4 = polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageZipVortexCelestial6185;
                            i = i23;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                i3 = i22;
                                PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel25394 = polarVoyageJobIntentServiceStormEclipsePixel25393;
                                int i27 = 0;
                                z = false;
                                while (true) {
                                    long j4 = jArr4[i27];
                                    int i28 = i27;
                                    int i29 = i26;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i30 = 8 - ((~(i28 - length2)) >>> 31);
                                        int i31 = 0;
                                        while (i31 < i30) {
                                            if ((j4 & 255) < 128) {
                                                int i32 = (i28 << 3) + i31;
                                                Object obj = objArr[i32];
                                                int i33 = length2;
                                                Object obj2 = objArr2[i32];
                                                polarVoyageInAppPurchaseTitaniumEpic63062 = polarVoyageInAppPurchaseTitaniumEpic63063;
                                                PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra25822 = (PolarVoyageLintBetaUltra2582) obj;
                                                i7 = i31;
                                                PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra25823 = PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageAnimatorSetSparkUltraMax8233;
                                                if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageLintBetaUltra25822, polarVoyageLintBetaUltra25823)) {
                                                    j = j4;
                                                } else {
                                                    j = j4;
                                                    if (!PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageLintBetaUltra25822, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBitmapMaxTitanTitan7960)) {
                                                        z3 = false;
                                                        if (!z3) {
                                                            Object PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageKeyframeThunderMegaVortex84923.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageLintBetaUltra25822);
                                                            if (PolarVoyageTextInputEditTextNebulaHero6651 == null) {
                                                                PolarVoyageTextInputEditTextNebulaHero6651 = null;
                                                            }
                                                            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(obj2, PolarVoyageTextInputEditTextNebulaHero6651)) {
                                                                num3 = num6;
                                                                polarVoyageKeyframeThunderMegaVortex84922 = polarVoyageKeyframeThunderMegaVortex84923;
                                                                arrayList3 = arrayList5;
                                                                i8 = i25;
                                                                i10 = i29;
                                                                i9 = i24;
                                                                polarVoyageJobIntentServiceStormEclipsePixel25392 = polarVoyageJobIntentServiceStormEclipsePixel25394;
                                                                i11 = i33;
                                                                long j5 = j >> i8;
                                                                i25 = i8;
                                                                polarVoyageJobIntentServiceStormEclipsePixel25394 = polarVoyageJobIntentServiceStormEclipsePixel25392;
                                                                i31 = i7 + 1;
                                                                i29 = i10;
                                                                length2 = i11;
                                                                i24 = i9;
                                                                num6 = num3;
                                                                arrayList5 = arrayList3;
                                                                polarVoyageKeyframeThunderMegaVortex84923 = polarVoyageKeyframeThunderMegaVortex84922;
                                                                j4 = j5;
                                                                polarVoyageInAppPurchaseTitaniumEpic63063 = polarVoyageInAppPurchaseTitaniumEpic63062;
                                                            }
                                                        }
                                                        polarVoyageLintBetaUltra2582 = PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                                                        if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageLintBetaUltra25822, polarVoyageLintBetaUltra2582)) {
                                                            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageLintBetaUltra25822, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageMotionLayoutTransitionHeroVision4068) || PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageLintBetaUltra25822, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageViewBindingPulseHeroSpeed5705)) {
                                                                num3 = num6;
                                                                polarVoyageKeyframeThunderMegaVortex84922 = polarVoyageKeyframeThunderMegaVortex84923;
                                                                arrayList3 = arrayList5;
                                                                i10 = i29;
                                                                i9 = i24;
                                                                polarVoyageJobIntentServiceStormEclipsePixel25392 = polarVoyageJobIntentServiceStormEclipsePixel25394;
                                                                i11 = i33;
                                                                i8 = 8;
                                                                PolarVoyageAlertDialogCyberHeroQuantum3938(this, PolarVoyageBitmapMaxTitanTitan7960(i9), 2048, 64, 8);
                                                                PolarVoyageAlertDialogCyberHeroQuantum3938(this, PolarVoyageBitmapMaxTitanTitan7960(i9), 2048, num3, 8);
                                                            } else {
                                                                if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageLintBetaUltra25822, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageKotlinBetaPulseBeta3653)) {
                                                                    i8 = 8;
                                                                    PolarVoyageAlertDialogCyberHeroQuantum3938(this, PolarVoyageBitmapMaxTitanTitan7960(i24), 2048, 64, 8);
                                                                    PolarVoyageAlertDialogCyberHeroQuantum3938(this, PolarVoyageBitmapMaxTitanTitan7960(i24), 2048, num6, 8);
                                                                    num3 = num6;
                                                                } else if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageLintBetaUltra25822, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageFCMCelestialCosmosPixel3711)) {
                                                                    Object PolarVoyageTextInputEditTextNebulaHero66512 = polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageLayerDrawableShadowTitaniumOmega1942);
                                                                    if (PolarVoyageTextInputEditTextNebulaHero66512 == null) {
                                                                        PolarVoyageTextInputEditTextNebulaHero66512 = null;
                                                                    }
                                                                    PolarVoyageAlertDialogCyberHeroQuantum3938(this, PolarVoyageBitmapMaxTitanTitan7960(i24), 2048, 64, 8);
                                                                    PolarVoyageAlertDialogCyberHeroQuantum3938(this, PolarVoyageBitmapMaxTitanTitan7960(i24), 2048, num6, 8);
                                                                    num3 = num6;
                                                                    i8 = 8;
                                                                } else if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageLintBetaUltra25822, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageZipVortexCelestial6185)) {
                                                                    int PolarVoyageBitmapMaxTitanTitan7960 = PolarVoyageBitmapMaxTitanTitan7960(i24);
                                                                    obj2.getClass();
                                                                    PolarVoyageMotionLayoutForceEpicAurora7183(PolarVoyageBitmapMaxTitanTitan7960, 2048, 4, (List) obj2);
                                                                } else {
                                                                    PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra25824 = PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageLifecycleOlympianOmega3762;
                                                                    String str2 = "";
                                                                    if (!PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageLintBetaUltra25822, polarVoyageLintBetaUltra25824)) {
                                                                        Integer num7 = num6;
                                                                        polarVoyageKeyframeThunderMegaVortex84922 = polarVoyageKeyframeThunderMegaVortex84923;
                                                                        arrayList3 = arrayList5;
                                                                        i9 = i24;
                                                                        PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra25825 = PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageDiffUtilDragonSpeedEclipse6225;
                                                                        if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageLintBetaUltra25822, polarVoyageLintBetaUltra25825)) {
                                                                            Object PolarVoyageTextInputEditTextNebulaHero66513 = polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageLintBetaUltra25824);
                                                                            if (PolarVoyageTextInputEditTextNebulaHero66513 == null) {
                                                                                PolarVoyageTextInputEditTextNebulaHero66513 = null;
                                                                            }
                                                                            PolarVoyageDelayAuroraSparkTurbo6655 polarVoyageDelayAuroraSparkTurbo6655 = (PolarVoyageDelayAuroraSparkTurbo6655) PolarVoyageTextInputEditTextNebulaHero66513;
                                                                            if (polarVoyageDelayAuroraSparkTurbo6655 != null && (str = polarVoyageDelayAuroraSparkTurbo6655.PolarVoyageStrictModeLegendEpic1532) != null) {
                                                                                str2 = str;
                                                                            }
                                                                            long j6 = ((PolarVoyageAlphaAnimationThunderStrikeHyperion3499) polarVoyageInAppPurchaseTitaniumEpic63064.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageLintBetaUltra25825)).PolarVoyageZipVortexCelestial6185;
                                                                            num3 = num7;
                                                                            PolarVoyageLayerDrawableShadowTitaniumOmega1942(PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageBitmapMaxTitanTitan7960(i9), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str2.length()), PolarVoyageFlingGestureEclipsePrimeMax1376(str2)));
                                                                            i10 = i29;
                                                                            PolarVoyagePackageManagerCelestialPhoenix8393(i10);
                                                                            polarVoyageJobIntentServiceStormEclipsePixel25392 = polarVoyageJobIntentServiceStormEclipsePixel25394;
                                                                            i11 = i33;
                                                                        } else {
                                                                            i10 = i29;
                                                                            i11 = i33;
                                                                            num3 = num7;
                                                                            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageLintBetaUltra25822, polarVoyageLintBetaUltra25823) || PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageLintBetaUltra25822, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBitmapMaxTitanTitan7960)) {
                                                                                PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel25395 = polarVoyageJobIntentServiceStormEclipsePixel25394;
                                                                                PolarVoyageContentProviderHyperSpark3838(polarVoyageJobIntentServiceStormEclipsePixel25395.PolarVoyageKotlinBetaPulseBeta3653);
                                                                                int size = arrayList4.size();
                                                                                int i34 = 0;
                                                                                while (true) {
                                                                                    if (i34 >= size) {
                                                                                        polarVoyageJobIntentServiceStormEclipsePixel25392 = polarVoyageJobIntentServiceStormEclipsePixel25395;
                                                                                        polarVoyagePushNotificationQuantumCelestial98272 = null;
                                                                                        break;
                                                                                    }
                                                                                    polarVoyageJobIntentServiceStormEclipsePixel25392 = polarVoyageJobIntentServiceStormEclipsePixel25395;
                                                                                    if (((PolarVoyagePushNotificationQuantumCelestial9827) arrayList4.get(i34)).PolarVoyageItemDecorationUltraDeltaEpic7485 == i9) {
                                                                                        polarVoyagePushNotificationQuantumCelestial98272 = (PolarVoyagePushNotificationQuantumCelestial9827) arrayList4.get(i34);
                                                                                        break;
                                                                                    } else {
                                                                                        i34++;
                                                                                        polarVoyageJobIntentServiceStormEclipsePixel25395 = polarVoyageJobIntentServiceStormEclipsePixel25392;
                                                                                    }
                                                                                }
                                                                                polarVoyagePushNotificationQuantumCelestial98272.getClass();
                                                                                Object PolarVoyageTextInputEditTextNebulaHero66514 = polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageLintBetaUltra25823);
                                                                                if (PolarVoyageTextInputEditTextNebulaHero66514 == null) {
                                                                                    PolarVoyageTextInputEditTextNebulaHero66514 = null;
                                                                                }
                                                                                polarVoyagePushNotificationQuantumCelestial98272.PolarVoyageViewRogueMaster4778 = (PolarVoyageActivityFusionHyper3950) PolarVoyageTextInputEditTextNebulaHero66514;
                                                                                Object PolarVoyageTextInputEditTextNebulaHero66515 = polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBitmapMaxTitanTitan7960);
                                                                                if (PolarVoyageTextInputEditTextNebulaHero66515 == null) {
                                                                                    PolarVoyageTextInputEditTextNebulaHero66515 = null;
                                                                                }
                                                                                polarVoyagePushNotificationQuantumCelestial98272.PolarVoyageCameraPixelBlaze2629 = (PolarVoyageActivityFusionHyper3950) PolarVoyageTextInputEditTextNebulaHero66515;
                                                                                if (polarVoyagePushNotificationQuantumCelestial98272.PolarVoyageStrictModeLegendEpic1532.contains(polarVoyagePushNotificationQuantumCelestial98272)) {
                                                                                    this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.getSnapshotObserver().PolarVoyageZipVortexCelestial6185(polarVoyagePushNotificationQuantumCelestial98272, this.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587, new PolarVoyageTextWatcherInfernoPhoenix6234(1, polarVoyagePushNotificationQuantumCelestial98272, this));
                                                                                }
                                                                            } else if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageLintBetaUltra25822, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBottomSheetOmegaNeo1907)) {
                                                                                obj2.getClass();
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    i12 = 8;
                                                                                    PolarVoyageLayerDrawableShadowTitaniumOmega1942(PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageBitmapMaxTitanTitan7960(i10), 8));
                                                                                } else {
                                                                                    i12 = 8;
                                                                                }
                                                                                PolarVoyageAlertDialogCyberHeroQuantum3938(this, PolarVoyageBitmapMaxTitanTitan7960(i10), 2048, num3, i12);
                                                                                i8 = i12;
                                                                            } else {
                                                                                PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra25826 = PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageDisplayMetricsVortexDragon9516;
                                                                                if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageLintBetaUltra25822, polarVoyageLintBetaUltra25826)) {
                                                                                    List list = (List) polarVoyageInAppPurchaseTitaniumEpic63064.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageLintBetaUltra25826);
                                                                                    Object PolarVoyageTextInputEditTextNebulaHero66516 = polarVoyageKeyframeThunderMegaVortex84922.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageLintBetaUltra25826);
                                                                                    if (PolarVoyageTextInputEditTextNebulaHero66516 == null) {
                                                                                        PolarVoyageTextInputEditTextNebulaHero66516 = null;
                                                                                    }
                                                                                    List list2 = (List) PolarVoyageTextInputEditTextNebulaHero66516;
                                                                                    if (list2 != null) {
                                                                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                        if (list.size() > 0) {
                                                                                            list.get(0).getClass();
                                                                                            PolarVoyageR8UltraEliteBeta8736.PolarVoyageZipVortexCelestial6185();
                                                                                            return;
                                                                                        }
                                                                                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                        if (list2.size() > 0) {
                                                                                            list2.get(0).getClass();
                                                                                            PolarVoyageR8UltraEliteBeta8736.PolarVoyageZipVortexCelestial6185();
                                                                                            return;
                                                                                        }
                                                                                        z = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? false : true;
                                                                                    }
                                                                                    polarVoyageJobIntentServiceStormEclipsePixel25392 = polarVoyageJobIntentServiceStormEclipsePixel25394;
                                                                                } else {
                                                                                    if (obj2 instanceof PolarVoyageRewardedAdPulseVision5089) {
                                                                                        PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision5089 = (PolarVoyageRewardedAdPulseVision5089) obj2;
                                                                                        Object PolarVoyageTextInputEditTextNebulaHero66517 = polarVoyageKeyframeThunderMegaVortex84922.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageLintBetaUltra25822);
                                                                                        if (PolarVoyageTextInputEditTextNebulaHero66517 == null) {
                                                                                            PolarVoyageTextInputEditTextNebulaHero66517 = null;
                                                                                        }
                                                                                        if (polarVoyageRewardedAdPulseVision5089 != PolarVoyageTextInputEditTextNebulaHero66517) {
                                                                                            if (PolarVoyageTextInputEditTextNebulaHero66517 instanceof PolarVoyageRewardedAdPulseVision5089) {
                                                                                                String str3 = polarVoyageRewardedAdPulseVision5089.PolarVoyageZipVortexCelestial6185;
                                                                                                PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision50892 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageTextInputEditTextNebulaHero66517;
                                                                                                PolarVoyagePagingHeroCyberLegend1562 polarVoyagePagingHeroCyberLegend1562 = polarVoyageRewardedAdPulseVision50892.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                                                                                if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(str3, polarVoyageRewardedAdPulseVision50892.PolarVoyageZipVortexCelestial6185)) {
                                                                                                    PolarVoyagePagingHeroCyberLegend1562 polarVoyagePagingHeroCyberLegend15622 = polarVoyageRewardedAdPulseVision5089.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                                                                                    if (polarVoyagePagingHeroCyberLegend15622 == null) {
                                                                                                    }
                                                                                                    if (polarVoyagePagingHeroCyberLegend15622 != null) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            z4 = false;
                                                                                            if (z4) {
                                                                                                z = false;
                                                                                                polarVoyageJobIntentServiceStormEclipsePixel25392 = polarVoyageJobIntentServiceStormEclipsePixel25394;
                                                                                            }
                                                                                        }
                                                                                        z4 = true;
                                                                                        if (z4) {
                                                                                        }
                                                                                    }
                                                                                    z = true;
                                                                                    polarVoyageJobIntentServiceStormEclipsePixel25392 = polarVoyageJobIntentServiceStormEclipsePixel25394;
                                                                                }
                                                                            }
                                                                        }
                                                                        i8 = 8;
                                                                    } else if (polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageStrictModeLegendEpic1532)) {
                                                                        Object PolarVoyageTextInputEditTextNebulaHero66518 = polarVoyageKeyframeThunderMegaVortex84923.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageLintBetaUltra25824);
                                                                        if (PolarVoyageTextInputEditTextNebulaHero66518 == null) {
                                                                            PolarVoyageTextInputEditTextNebulaHero66518 = null;
                                                                        }
                                                                        PolarVoyageDelayAuroraSparkTurbo6655 polarVoyageDelayAuroraSparkTurbo66552 = (PolarVoyageDelayAuroraSparkTurbo6655) PolarVoyageTextInputEditTextNebulaHero66518;
                                                                        if (polarVoyageDelayAuroraSparkTurbo66552 == null) {
                                                                            polarVoyageDelayAuroraSparkTurbo66552 = "";
                                                                        }
                                                                        Object PolarVoyageTextInputEditTextNebulaHero66519 = polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageLintBetaUltra25824);
                                                                        if (PolarVoyageTextInputEditTextNebulaHero66519 == null) {
                                                                            PolarVoyageTextInputEditTextNebulaHero66519 = null;
                                                                        }
                                                                        CharSequence charSequence = (PolarVoyageDelayAuroraSparkTurbo6655) PolarVoyageTextInputEditTextNebulaHero66519;
                                                                        if (charSequence == null) {
                                                                            charSequence = "";
                                                                        }
                                                                        CharSequence PolarVoyageFlingGestureEclipsePrimeMax1376 = PolarVoyageFlingGestureEclipsePrimeMax1376(charSequence);
                                                                        int length3 = polarVoyageDelayAuroraSparkTurbo66552.length();
                                                                        int length4 = charSequence.length();
                                                                        Integer num8 = num6;
                                                                        int i35 = length3 > length4 ? length4 : length3;
                                                                        arrayList3 = arrayList5;
                                                                        int i36 = 0;
                                                                        while (true) {
                                                                            i13 = i35;
                                                                            if (i36 >= i35) {
                                                                                i14 = length3;
                                                                                break;
                                                                            }
                                                                            i14 = length3;
                                                                            if (polarVoyageDelayAuroraSparkTurbo66552.charAt(i36) != charSequence.charAt(i36)) {
                                                                                break;
                                                                            }
                                                                            i36++;
                                                                            i35 = i13;
                                                                            length3 = i14;
                                                                        }
                                                                        int i37 = 0;
                                                                        while (true) {
                                                                            if (i37 >= i13 - i36) {
                                                                                i15 = i37;
                                                                                break;
                                                                            }
                                                                            i15 = i37;
                                                                            if (polarVoyageDelayAuroraSparkTurbo66552.charAt((i14 - 1) - i37) != charSequence.charAt((length4 - 1) - i15)) {
                                                                                break;
                                                                            } else {
                                                                                i37 = i15 + 1;
                                                                            }
                                                                        }
                                                                        int i38 = (i14 - i15) - i36;
                                                                        int i39 = (length4 - i15) - i36;
                                                                        PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra25827 = PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageCardViewAlphaVortexCelestial9747;
                                                                        boolean PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageKeyframeThunderMegaVortex84923.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageLintBetaUltra25827);
                                                                        boolean PolarVoyageKotlinBetaPulseBeta36532 = polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageLintBetaUltra25827);
                                                                        boolean PolarVoyageKotlinBetaPulseBeta36533 = polarVoyageKeyframeThunderMegaVortex84923.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageLifecycleOlympianOmega3762);
                                                                        boolean z5 = PolarVoyageKotlinBetaPulseBeta36533 && !PolarVoyageKotlinBetaPulseBeta3653 && PolarVoyageKotlinBetaPulseBeta36532;
                                                                        boolean z6 = PolarVoyageKotlinBetaPulseBeta36533 && PolarVoyageKotlinBetaPulseBeta3653 && !PolarVoyageKotlinBetaPulseBeta36532;
                                                                        if (z5 || z6) {
                                                                            int PolarVoyageBitmapMaxTitanTitan79602 = PolarVoyageBitmapMaxTitanTitan7960(i24);
                                                                            Integer valueOf = Integer.valueOf(length4);
                                                                            i9 = i24;
                                                                            polarVoyageKeyframeThunderMegaVortex84922 = polarVoyageKeyframeThunderMegaVortex84923;
                                                                            num4 = num8;
                                                                            PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageBitmapMaxTitanTitan79602, num4, num8, valueOf, PolarVoyageFlingGestureEclipsePrimeMax1376);
                                                                        } else {
                                                                            PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageBitmapMaxTitanTitan7960(i24), 16);
                                                                            PolarVoyageRotateAnimationCyberCelestialDelta4768.setFromIndex(i36);
                                                                            PolarVoyageRotateAnimationCyberCelestialDelta4768.setRemovedCount(i38);
                                                                            PolarVoyageRotateAnimationCyberCelestialDelta4768.setAddedCount(i39);
                                                                            PolarVoyageRotateAnimationCyberCelestialDelta4768.setBeforeText(polarVoyageDelayAuroraSparkTurbo66552);
                                                                            PolarVoyageRotateAnimationCyberCelestialDelta4768.getText().add(PolarVoyageFlingGestureEclipsePrimeMax1376);
                                                                            i9 = i24;
                                                                            polarVoyageKeyframeThunderMegaVortex84922 = polarVoyageKeyframeThunderMegaVortex84923;
                                                                            num4 = num8;
                                                                        }
                                                                        PolarVoyageRotateAnimationCyberCelestialDelta4768.setClassName("android.widget.EditText");
                                                                        PolarVoyageLayerDrawableShadowTitaniumOmega1942(PolarVoyageRotateAnimationCyberCelestialDelta4768);
                                                                        if (z5 || z6) {
                                                                            num5 = num4;
                                                                            long j7 = ((PolarVoyageAlphaAnimationThunderStrikeHyperion3499) polarVoyageInAppPurchaseTitaniumEpic63064.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageDiffUtilDragonSpeedEclipse6225)).PolarVoyageZipVortexCelestial6185;
                                                                            PolarVoyageRotateAnimationCyberCelestialDelta4768.setFromIndex((int) (j7 >> 32));
                                                                            PolarVoyageRotateAnimationCyberCelestialDelta4768.setToIndex((int) (j7 & 4294967295L));
                                                                            PolarVoyageLayerDrawableShadowTitaniumOmega1942(PolarVoyageRotateAnimationCyberCelestialDelta4768);
                                                                        } else {
                                                                            num5 = num4;
                                                                        }
                                                                        i10 = i29;
                                                                        i11 = i33;
                                                                        num3 = num5;
                                                                        i8 = 8;
                                                                    } else {
                                                                        Integer num9 = num6;
                                                                        polarVoyageKeyframeThunderMegaVortex84922 = polarVoyageKeyframeThunderMegaVortex84923;
                                                                        arrayList3 = arrayList5;
                                                                        i9 = i24;
                                                                        i8 = 8;
                                                                        PolarVoyageAlertDialogCyberHeroQuantum3938(this, PolarVoyageBitmapMaxTitanTitan7960(i9), 2048, Integer.valueOf(i19), 8);
                                                                        i10 = i29;
                                                                        i11 = i33;
                                                                        num3 = num9;
                                                                    }
                                                                }
                                                                polarVoyageKeyframeThunderMegaVortex84922 = polarVoyageKeyframeThunderMegaVortex84923;
                                                                arrayList3 = arrayList5;
                                                                i10 = i29;
                                                                i9 = i24;
                                                                polarVoyageJobIntentServiceStormEclipsePixel25392 = polarVoyageJobIntentServiceStormEclipsePixel25394;
                                                                i11 = i33;
                                                            }
                                                            long j52 = j >> i8;
                                                            i25 = i8;
                                                            polarVoyageJobIntentServiceStormEclipsePixel25394 = polarVoyageJobIntentServiceStormEclipsePixel25392;
                                                            i31 = i7 + 1;
                                                            i29 = i10;
                                                            length2 = i11;
                                                            i24 = i9;
                                                            num6 = num3;
                                                            arrayList5 = arrayList3;
                                                            polarVoyageKeyframeThunderMegaVortex84923 = polarVoyageKeyframeThunderMegaVortex84922;
                                                            j4 = j52;
                                                            polarVoyageInAppPurchaseTitaniumEpic63063 = polarVoyageInAppPurchaseTitaniumEpic63062;
                                                        } else {
                                                            obj2.getClass();
                                                            String str4 = (String) obj2;
                                                            if (polarVoyageKeyframeThunderMegaVortex84923.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageLintBetaUltra2582)) {
                                                                PolarVoyageCameraViewSpectraMaxSpectra2824(str4, i24, i25);
                                                            }
                                                        }
                                                        num3 = num6;
                                                        polarVoyageKeyframeThunderMegaVortex84922 = polarVoyageKeyframeThunderMegaVortex84923;
                                                        arrayList3 = arrayList5;
                                                        i10 = i29;
                                                        i8 = 8;
                                                        i9 = i24;
                                                        polarVoyageJobIntentServiceStormEclipsePixel25392 = polarVoyageJobIntentServiceStormEclipsePixel25394;
                                                        i11 = i33;
                                                        long j522 = j >> i8;
                                                        i25 = i8;
                                                        polarVoyageJobIntentServiceStormEclipsePixel25394 = polarVoyageJobIntentServiceStormEclipsePixel25392;
                                                        i31 = i7 + 1;
                                                        i29 = i10;
                                                        length2 = i11;
                                                        i24 = i9;
                                                        num6 = num3;
                                                        arrayList5 = arrayList3;
                                                        polarVoyageKeyframeThunderMegaVortex84923 = polarVoyageKeyframeThunderMegaVortex84922;
                                                        j4 = j522;
                                                        polarVoyageInAppPurchaseTitaniumEpic63063 = polarVoyageInAppPurchaseTitaniumEpic63062;
                                                    }
                                                }
                                                int size2 = arrayList5.size();
                                                int i40 = 0;
                                                while (true) {
                                                    if (i40 >= size2) {
                                                        polarVoyagePushNotificationQuantumCelestial9827 = null;
                                                        break;
                                                    }
                                                    int i41 = size2;
                                                    if (((PolarVoyagePushNotificationQuantumCelestial9827) arrayList5.get(i40)).PolarVoyageItemDecorationUltraDeltaEpic7485 == i24) {
                                                        polarVoyagePushNotificationQuantumCelestial9827 = (PolarVoyagePushNotificationQuantumCelestial9827) arrayList5.get(i40);
                                                        break;
                                                    } else {
                                                        i40++;
                                                        size2 = i41;
                                                    }
                                                }
                                                if (polarVoyagePushNotificationQuantumCelestial9827 != null) {
                                                    z3 = false;
                                                } else {
                                                    polarVoyagePushNotificationQuantumCelestial9827 = new PolarVoyagePushNotificationQuantumCelestial9827(i24, arrayList4);
                                                    z3 = true;
                                                }
                                                arrayList4.add(polarVoyagePushNotificationQuantumCelestial9827);
                                                if (!z3) {
                                                }
                                                polarVoyageLintBetaUltra2582 = PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                                                if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageLintBetaUltra25822, polarVoyageLintBetaUltra2582)) {
                                                }
                                                num3 = num6;
                                                polarVoyageKeyframeThunderMegaVortex84922 = polarVoyageKeyframeThunderMegaVortex84923;
                                                arrayList3 = arrayList5;
                                                i10 = i29;
                                                i8 = 8;
                                                i9 = i24;
                                                polarVoyageJobIntentServiceStormEclipsePixel25392 = polarVoyageJobIntentServiceStormEclipsePixel25394;
                                                i11 = i33;
                                                long j5222 = j >> i8;
                                                i25 = i8;
                                                polarVoyageJobIntentServiceStormEclipsePixel25394 = polarVoyageJobIntentServiceStormEclipsePixel25392;
                                                i31 = i7 + 1;
                                                i29 = i10;
                                                length2 = i11;
                                                i24 = i9;
                                                num6 = num3;
                                                arrayList5 = arrayList3;
                                                polarVoyageKeyframeThunderMegaVortex84923 = polarVoyageKeyframeThunderMegaVortex84922;
                                                j4 = j5222;
                                                polarVoyageInAppPurchaseTitaniumEpic63063 = polarVoyageInAppPurchaseTitaniumEpic63062;
                                            } else {
                                                polarVoyageInAppPurchaseTitaniumEpic63062 = polarVoyageInAppPurchaseTitaniumEpic63063;
                                                arrayList3 = arrayList5;
                                                i7 = i31;
                                                j = j4;
                                                i8 = i25;
                                                num3 = num6;
                                                i9 = i24;
                                                polarVoyageKeyframeThunderMegaVortex84922 = polarVoyageKeyframeThunderMegaVortex84923;
                                                i10 = i29;
                                                i11 = length2;
                                            }
                                            polarVoyageJobIntentServiceStormEclipsePixel25392 = polarVoyageJobIntentServiceStormEclipsePixel25394;
                                            long j52222 = j >> i8;
                                            i25 = i8;
                                            polarVoyageJobIntentServiceStormEclipsePixel25394 = polarVoyageJobIntentServiceStormEclipsePixel25392;
                                            i31 = i7 + 1;
                                            i29 = i10;
                                            length2 = i11;
                                            i24 = i9;
                                            num6 = num3;
                                            arrayList5 = arrayList3;
                                            polarVoyageKeyframeThunderMegaVortex84923 = polarVoyageKeyframeThunderMegaVortex84922;
                                            j4 = j52222;
                                            polarVoyageInAppPurchaseTitaniumEpic63063 = polarVoyageInAppPurchaseTitaniumEpic63062;
                                        }
                                        num2 = num6;
                                        polarVoyageInAppPurchaseTitaniumEpic6306 = polarVoyageInAppPurchaseTitaniumEpic63063;
                                        polarVoyageKeyframeThunderMegaVortex8492 = polarVoyageKeyframeThunderMegaVortex84923;
                                        arrayList2 = arrayList5;
                                        i5 = i29;
                                        i4 = i24;
                                        polarVoyageJobIntentServiceStormEclipsePixel2539 = polarVoyageJobIntentServiceStormEclipsePixel25394;
                                        i6 = length2;
                                        if (i30 != i25) {
                                            break;
                                        }
                                    } else {
                                        num2 = num6;
                                        polarVoyageInAppPurchaseTitaniumEpic6306 = polarVoyageInAppPurchaseTitaniumEpic63063;
                                        polarVoyageKeyframeThunderMegaVortex8492 = polarVoyageKeyframeThunderMegaVortex84923;
                                        arrayList2 = arrayList5;
                                        i5 = i29;
                                        i4 = i24;
                                        polarVoyageJobIntentServiceStormEclipsePixel2539 = polarVoyageJobIntentServiceStormEclipsePixel25394;
                                        i6 = length2;
                                    }
                                    if (i28 == i6) {
                                        break;
                                    }
                                    i27 = i28 + 1;
                                    i26 = i5;
                                    length2 = i6;
                                    i24 = i4;
                                    num6 = num2;
                                    polarVoyageKeyframeThunderMegaVortex84923 = polarVoyageKeyframeThunderMegaVortex8492;
                                    polarVoyageJobIntentServiceStormEclipsePixel25394 = polarVoyageJobIntentServiceStormEclipsePixel2539;
                                    polarVoyageInAppPurchaseTitaniumEpic63063 = polarVoyageInAppPurchaseTitaniumEpic6306;
                                    arrayList5 = arrayList2;
                                    i25 = 8;
                                }
                            } else {
                                polarVoyageInAppPurchaseTitaniumEpic6306 = polarVoyageInAppPurchaseTitaniumEpic63063;
                                arrayList2 = arrayList5;
                                i3 = i22;
                                polarVoyageJobIntentServiceStormEclipsePixel2539 = polarVoyageJobIntentServiceStormEclipsePixel25393;
                                num2 = num6;
                                i4 = i24;
                                z = false;
                            }
                            if (!z) {
                                Iterator it = polarVoyageInAppPurchaseTitaniumEpic6306.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z2 = false;
                                        break;
                                    }
                                    if (!polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653((PolarVoyageLintBetaUltra2582) ((Map.Entry) it.next()).getKey())) {
                                        z2 = true;
                                        break;
                                    }
                                }
                                z = z2;
                            }
                            if (z) {
                                i2 = 8;
                                PolarVoyageAlertDialogCyberHeroQuantum3938(this, PolarVoyageBitmapMaxTitanTitan7960(i4), 2048, num2, 8);
                            } else {
                                i2 = 8;
                            }
                            j3 >>= i2;
                            i23 = i + 1;
                            polarVoyageIntentServiceEclipseGammaHero33232 = polarVoyageIntentServiceEclipseGammaHero3323;
                            i21 = i2;
                            num6 = num2;
                            iArr3 = iArr2;
                            jArr3 = jArr2;
                            i22 = i3;
                            arrayList5 = arrayList2;
                        }
                    }
                    i = i23;
                    arrayList2 = arrayList5;
                    iArr2 = iArr3;
                    jArr2 = jArr3;
                    i2 = i21;
                    i3 = i22;
                    num2 = num6;
                    j3 >>= i2;
                    i23 = i + 1;
                    polarVoyageIntentServiceEclipseGammaHero33232 = polarVoyageIntentServiceEclipseGammaHero3323;
                    i21 = i2;
                    num6 = num2;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i22 = i3;
                    arrayList5 = arrayList2;
                }
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                int i42 = i21;
                int i43 = i22;
                num = num6;
                if (i43 != i42) {
                    return;
                }
            } else {
                num = num6;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
            }
            if (i18 == i20) {
                return;
            }
            i18++;
            polarVoyageIntentServiceEclipseGammaHero33232 = polarVoyageIntentServiceEclipseGammaHero3323;
            num6 = num;
            i16 = i19;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            i17 = 0;
            length = i20;
        }
    }

    public final boolean PolarVoyageMotionLayoutForceEpicAurora7183(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !PolarVoyageSnackbarGammaEclipse2140()) {
            return false;
        }
        AccessibilityEvent PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageItemDecorationUltraDeltaEpic7485(i, i2);
        if (num != null) {
            PolarVoyageItemDecorationUltraDeltaEpic7485.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            PolarVoyageItemDecorationUltraDeltaEpic7485.setContentDescription(PolarVoyageDragEventStrikeVortexLegend8366.PolarVoyageZipVortexCelestial6185(list, ",", null, 62));
        }
        return PolarVoyageLayerDrawableShadowTitaniumOmega1942(PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    public final void PolarVoyagePackageManagerCelestialPhoenix8393(int i) {
        PolarVoyageRewardedAdVisionPulsePrime7518 polarVoyageRewardedAdVisionPulsePrime7518 = this.PolarVoyageActivityInfoBetaQuantum8726;
        if (polarVoyageRewardedAdVisionPulsePrime7518 != null) {
            PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel2539 = polarVoyageRewardedAdVisionPulsePrime7518.PolarVoyageZipVortexCelestial6185;
            if (i != polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageTextInputEditTextNebulaHero6651) {
                return;
            }
            if (SystemClock.uptimeMillis() - polarVoyageRewardedAdVisionPulsePrime7518.PolarVoyageDiffUtilTurboStrike5735 <= 1000) {
                AccessibilityEvent PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageBitmapMaxTitanTitan7960(polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageTextInputEditTextNebulaHero6651), 131072);
                PolarVoyageItemDecorationUltraDeltaEpic7485.setFromIndex(polarVoyageRewardedAdVisionPulsePrime7518.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                PolarVoyageItemDecorationUltraDeltaEpic7485.setToIndex(polarVoyageRewardedAdVisionPulsePrime7518.PolarVoyageBitmapVisionAuroraPixel4705);
                PolarVoyageItemDecorationUltraDeltaEpic7485.setAction(polarVoyageRewardedAdVisionPulsePrime7518.PolarVoyageMotionLayoutTransitionHeroVision4068);
                PolarVoyageItemDecorationUltraDeltaEpic7485.setMovementGranularity(polarVoyageRewardedAdVisionPulsePrime7518.PolarVoyageKotlinBetaPulseBeta3653);
                PolarVoyageItemDecorationUltraDeltaEpic7485.getText().add(PolarVoyageDrawableDeltaHyperion5742(polarVoyageJobIntentServiceStormEclipsePixel2539));
                PolarVoyageLayerDrawableShadowTitaniumOmega1942(PolarVoyageItemDecorationUltraDeltaEpic7485);
            }
        }
        this.PolarVoyageActivityInfoBetaQuantum8726 = null;
    }

    public final AccessibilityEvent PolarVoyageRotateAnimationCyberCelestialDelta4768(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageItemDecorationUltraDeltaEpic7485(i, 8192);
        if (num != null) {
            PolarVoyageItemDecorationUltraDeltaEpic7485.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            PolarVoyageItemDecorationUltraDeltaEpic7485.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            PolarVoyageItemDecorationUltraDeltaEpic7485.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            PolarVoyageItemDecorationUltraDeltaEpic7485.getText().add(charSequence);
        }
        return PolarVoyageItemDecorationUltraDeltaEpic7485;
    }

    public final boolean PolarVoyageSnackbarGammaEclipse2140() {
        return this.PolarVoyageTextInputEditTextNebulaHero6651.isEnabled() && !this.PolarVoyageBottomSheetOmegaNeo1907.isEmpty();
    }

    public final PolarVoyageNestedScrollViewBlazeMaxMax1969 PolarVoyageStrictModeLegendEpic1532(PolarVoyageTextViewStormDragon9134 polarVoyageTextViewStormDragon9134, PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel2539) {
        PolarVoyageCardViewNebulaTitanGamma6305 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        return polarVoyageTextViewStormDragon9134.PolarVoyageZipVortexCelestial6185(PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageClipboardManagerAuroraPixel8666(PolarVoyageBarcodeScannerInfernoSolarSpark7767 != null ? PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageRotateAnimationCyberCelestialDelta4768 : 0L), polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageFCMCelestialCosmosPixel3711, this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.getDensity());
    }

    public final void PolarVoyageTextInputEditTextNebulaHero6651() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (PolarVoyageSnackbarGammaEclipse2140()) {
                PolarVoyageDisplayMetricsVortexDragon9516(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.getSemanticsOwner().PolarVoyageZipVortexCelestial6185(), this.PolarVoyageAlarmManagerShadowHyperBeta8339);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                PolarVoyageLooperThreadAlphaPrime1279(PolarVoyageCameraPixelBlaze2629());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final int PolarVoyageViewRogueMaster4778(PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel2539) {
        PolarVoyageInAppPurchaseTitaniumEpic6306 polarVoyageInAppPurchaseTitaniumEpic6306 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (!polarVoyageInAppPurchaseTitaniumEpic6306.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageZipVortexCelestial6185)) {
            PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra2582 = PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageDiffUtilDragonSpeedEclipse6225;
            if (polarVoyageInAppPurchaseTitaniumEpic6306.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageLintBetaUltra2582)) {
                return (int) (((PolarVoyageAlphaAnimationThunderStrikeHyperion3499) polarVoyageInAppPurchaseTitaniumEpic6306.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageLintBetaUltra2582)).PolarVoyageZipVortexCelestial6185 >> 32);
            }
        }
        return this.PolarVoyageMotionLayoutForceEpicAurora7183;
    }

    @Override // p000createpolar.PolarVoyageCombineRoguePulse7620
    public final PolarVoyageRealtimeDatabaseEclipseUltra8894 PolarVoyageZipVortexCelestial6185(View view) {
        return this.PolarVoyageCameraPixelBlaze2629;
    }
}
