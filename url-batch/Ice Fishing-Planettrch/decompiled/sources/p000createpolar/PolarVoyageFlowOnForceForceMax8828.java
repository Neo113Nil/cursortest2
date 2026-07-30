package p000createpolar;

import android.R;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFlowOnForceForceMax8828 extends PolarVoyageRealtimeDatabaseEclipseUltra8894 {
    public final /* synthetic */ PolarVoyageTransitionManagerHeroNovaX3322 PolarVoyageSnackbarGammaEclipse2140;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolarVoyageFlowOnForceForceMax8828(PolarVoyageTransitionManagerHeroNovaX3322 polarVoyageTransitionManagerHeroNovaX3322) {
        super(4);
        this.PolarVoyageSnackbarGammaEclipse2140 = polarVoyageTransitionManagerHeroNovaX3322;
    }

    @Override // p000createpolar.PolarVoyageRealtimeDatabaseEclipseUltra8894
    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i, PolarVoyageToastUltraNeo6602 polarVoyageToastUltraNeo6602, String str, Bundle bundle) {
        this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageKotlinBetaPulseBeta3653(i, polarVoyageToastUltraNeo6602, str, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:617:0x07ce, code lost:
    
        if (r6 == false) goto L380;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0c67  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x099f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x09ea  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0a33 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0a43  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0a5f  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0a74  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0a7e  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0aa4  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0ab5  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0ac8  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0c04  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0c15  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0c3f  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0c5f  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0c32  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0c08  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0ab9  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x07a9 A[LOOP:11: B:599:0x0788->B:608:0x07a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:609:0x07b4 A[EDGE_INSN: B:609:0x07b4->B:610:0x07b4 BREAK  A[LOOP:11: B:599:0x0788->B:608:0x07a9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x05ca  */
    /* JADX WARN: Type inference failed for: r2v102, types: [create-polar.PolarVoyageWindowManagerSpeedUltra3573] */
    /* JADX WARN: Type inference failed for: r2v103, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v104, types: [java.util.ArrayList] */
    @Override // p000createpolar.PolarVoyageRealtimeDatabaseEclipseUltra8894
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PolarVoyageToastUltraNeo6602 PolarVoyageDiffUtilTurboStrike5735(int i) {
        PolarVoyageTransitionManagerHeroNovaX3322 polarVoyageTransitionManagerHeroNovaX3322;
        PolarVoyageRewardedAdUltraTitanium4787 polarVoyageRewardedAdUltraTitanium4787;
        PolarVoyageAlphaAnimationSparkNovaXTitan1212 polarVoyageAlphaAnimationSparkNovaXTitan1212;
        PolarVoyageInAppPurchaseTitaniumEpic6306 polarVoyageInAppPurchaseTitaniumEpic6306;
        PolarVoyageConfigurationMegaTitaniumQuantum2348 polarVoyageConfigurationMegaTitaniumQuantum2348;
        PolarVoyageKeyframeThunderMegaVortex8492 polarVoyageKeyframeThunderMegaVortex8492;
        AccessibilityNodeInfo accessibilityNodeInfo;
        PolarVoyageToastUltraNeo6602 polarVoyageToastUltraNeo6602;
        PolarVoyageOnTouchListenerPrimePixelLegend8920 polarVoyageOnTouchListenerPrimePixelLegend8920;
        PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel2539;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        PolarVoyageToastUltraNeo6602 polarVoyageToastUltraNeo66022;
        int i2;
        Object PolarVoyageTextInputEditTextNebulaHero6651;
        PolarVoyageTransitionManagerHeroNovaX3322 polarVoyageTransitionManagerHeroNovaX33222;
        boolean z;
        Object PolarVoyageTextInputEditTextNebulaHero66512;
        PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision5089;
        PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision50892;
        PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision50893;
        String PolarVoyageDrawableDeltaHyperion5742;
        PolarVoyageMotionLayoutShadowAuroraInferno1500 polarVoyageMotionLayoutShadowAuroraInferno1500;
        Object PolarVoyageTextInputEditTextNebulaHero66513;
        PolarVoyageActivityFusionHyper3950 polarVoyageActivityFusionHyper3950;
        PolarVoyageActivityFusionHyper3950 polarVoyageActivityFusionHyper39502;
        int i3;
        int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        Bundle bundle;
        PolarVoyageRewardedAdUltraTitanium4787 polarVoyageRewardedAdUltraTitanium47872;
        int PolarVoyageBarcodeScannerInfernoSolarSpark77672;
        String str;
        PolarVoyageToastUltraNeo6602 polarVoyageToastUltraNeo66023;
        PolarVoyageRoomEntityCelestialCosmosPixel5838 PolarVoyageContentProviderHyperSpark3838;
        Object PolarVoyageTextInputEditTextNebulaHero66514;
        boolean z2;
        Object PolarVoyageTextInputEditTextNebulaHero66515;
        boolean z3;
        PolarVoyageConfigurationMegaTitaniumQuantum2348 polarVoyageConfigurationMegaTitaniumQuantum23482;
        PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision50894;
        boolean z4;
        boolean z5;
        char c;
        boolean z6;
        boolean z7;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i4;
        boolean z8;
        PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel25392;
        PolarVoyageGradientDrawableNeoVisionSpeed1253 PolarVoyageTextInputEditTextNebulaHero66516;
        PolarVoyageTransitionManagerHeroNovaX3322 polarVoyageTransitionManagerHeroNovaX33223 = this.PolarVoyageSnackbarGammaEclipse2140;
        AccessibilityManager accessibilityManager = polarVoyageTransitionManagerHeroNovaX33223.PolarVoyageTextInputEditTextNebulaHero6651;
        PolarVoyageRewardedAdUltraTitanium4787 polarVoyageRewardedAdUltraTitanium47873 = polarVoyageTransitionManagerHeroNovaX33223.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        PolarVoyageSensorManagerTitanEclipsePhoenix3200 viewTreeOwners = polarVoyageRewardedAdUltraTitanium47873.getViewTreeOwners();
        if (((viewTreeOwners == null || (PolarVoyageTextInputEditTextNebulaHero66516 = viewTreeOwners.PolarVoyageZipVortexCelestial6185.PolarVoyageTextInputEditTextNebulaHero6651()) == null) ? null : PolarVoyageTextInputEditTextNebulaHero66516.PolarVoyageBarcodeScannerInfernoSolarSpark7767) == PolarVoyageNotificationManagerBetaTitaniumCelestial6531.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            if (!accessibilityManager.isEnabled()) {
                polarVoyageToastUltraNeo66023 = new PolarVoyageToastUltraNeo6602(AccessibilityNodeInfo.obtain());
                polarVoyageTransitionManagerHeroNovaX33222 = polarVoyageTransitionManagerHeroNovaX33223;
                i2 = i;
                if (polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageNavigationViewHyperHyperHyperion1793) {
                    if (i2 == polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageDrawableDeltaHyperion5742) {
                        polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageContentProviderHyperSpark3838 = polarVoyageToastUltraNeo66023;
                    }
                    if (i2 == polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageSnackbarGammaEclipse2140) {
                        polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyageToastUltraNeo66023;
                    }
                }
                return polarVoyageToastUltraNeo66023;
            }
            polarVoyageToastUltraNeo66023 = null;
            polarVoyageTransitionManagerHeroNovaX33222 = polarVoyageTransitionManagerHeroNovaX33223;
            i2 = i;
            if (polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageNavigationViewHyperHyperHyperion1793) {
            }
            return polarVoyageToastUltraNeo66023;
        }
        PolarVoyageItemDecorationPrimePrime4359 polarVoyageItemDecorationPrimePrime4359 = (PolarVoyageItemDecorationPrimePrime4359) polarVoyageTransitionManagerHeroNovaX33223.PolarVoyageCameraPixelBlaze2629().PolarVoyageMotionLayoutTransitionHeroVision4068(i);
        if (polarVoyageItemDecorationPrimePrime4359 == null) {
            if (!accessibilityManager.isEnabled()) {
                polarVoyageToastUltraNeo66023 = new PolarVoyageToastUltraNeo6602(AccessibilityNodeInfo.obtain());
                polarVoyageTransitionManagerHeroNovaX33222 = polarVoyageTransitionManagerHeroNovaX33223;
                i2 = i;
                if (polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageNavigationViewHyperHyperHyperion1793) {
                }
                return polarVoyageToastUltraNeo66023;
            }
            polarVoyageToastUltraNeo66023 = null;
            polarVoyageTransitionManagerHeroNovaX33222 = polarVoyageTransitionManagerHeroNovaX33223;
            i2 = i;
            if (polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageNavigationViewHyperHyperHyperion1793) {
            }
            return polarVoyageToastUltraNeo66023;
        }
        PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel25393 = polarVoyageItemDecorationPrimePrime4359.PolarVoyageZipVortexCelestial6185;
        PolarVoyageInAppPurchaseTitaniumEpic6306 PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageJobIntentServiceStormEclipsePixel25393.PolarVoyageBottomSheetOmegaNeo1907();
        PolarVoyageConfigurationMegaTitaniumQuantum2348 polarVoyageConfigurationMegaTitaniumQuantum23483 = polarVoyageJobIntentServiceStormEclipsePixel25393.PolarVoyageKotlinBetaPulseBeta3653;
        Object PolarVoyageTextInputEditTextNebulaHero66517 = PolarVoyageBottomSheetOmegaNeo1907.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageCameraPixelBlaze2629);
        if (PolarVoyageTextInputEditTextNebulaHero66517 == null) {
            PolarVoyageTextInputEditTextNebulaHero66517 = null;
        }
        boolean PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageTextInputEditTextNebulaHero66517, Boolean.TRUE);
        if (PolarVoyageItemDecorationUltraDeltaEpic7485) {
            if (!(Build.VERSION.SDK_INT >= 34 ? PolarVoyageToolbarBlazeTitanium3444.PolarVoyageBitmapVisionAuroraPixel4705(accessibilityManager) : true)) {
                polarVoyageTransitionManagerHeroNovaX33222 = polarVoyageTransitionManagerHeroNovaX33223;
                i2 = i;
                polarVoyageToastUltraNeo66023 = null;
                if (polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageNavigationViewHyperHyperHyperion1793) {
                }
                return polarVoyageToastUltraNeo66023;
            }
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        PolarVoyageToastUltraNeo6602 polarVoyageToastUltraNeo66024 = new PolarVoyageToastUltraNeo6602(obtain);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            PolarVoyageToolbarBlazeTitanium3444.PolarVoyageTextInputEditTextNebulaHero6651(obtain, PolarVoyageItemDecorationUltraDeltaEpic7485);
        } else {
            polarVoyageToastUltraNeo66024.PolarVoyageDiffUtilTurboStrike5735(64, PolarVoyageItemDecorationUltraDeltaEpic7485);
        }
        if (i == -1) {
            Object parentForAccessibility = polarVoyageRewardedAdUltraTitanium47873.getParentForAccessibility();
            View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
            polarVoyageToastUltraNeo66024.PolarVoyageMotionLayoutTransitionHeroVision4068 = -1;
            obtain.setParent(view);
        } else {
            PolarVoyageJobIntentServiceStormEclipsePixel2539 PolarVoyageViewRogueMaster4778 = polarVoyageJobIntentServiceStormEclipsePixel25393.PolarVoyageViewRogueMaster4778();
            Integer valueOf = PolarVoyageViewRogueMaster4778 != null ? Integer.valueOf(PolarVoyageViewRogueMaster4778.PolarVoyageTextInputEditTextNebulaHero6651) : null;
            if (valueOf == null) {
                PolarVoyagePackageManagerUltraQuantumInferno5642.PolarVoyageKotlinBetaPulseBeta3653("semanticsNode " + i + " has null parent");
                throw new PolarVoyageToolbarNovaTitanSpeed3010();
            }
            int intValue = valueOf.intValue();
            if (intValue == polarVoyageRewardedAdUltraTitanium47873.getSemanticsOwner().PolarVoyageZipVortexCelestial6185().PolarVoyageTextInputEditTextNebulaHero6651) {
                intValue = -1;
            }
            polarVoyageToastUltraNeo66024.PolarVoyageMotionLayoutTransitionHeroVision4068 = intValue;
            obtain.setParent(polarVoyageRewardedAdUltraTitanium47873, intValue);
        }
        polarVoyageToastUltraNeo66024.PolarVoyageKotlinBetaPulseBeta3653 = i;
        obtain.setSource(polarVoyageRewardedAdUltraTitanium47873, i);
        obtain.setBoundsInScreen(polarVoyageTransitionManagerHeroNovaX33223.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageItemDecorationPrimePrime4359));
        PolarVoyageAlphaAnimationSparkNovaXTitan1212 polarVoyageAlphaAnimationSparkNovaXTitan12122 = polarVoyageTransitionManagerHeroNovaX33223.PolarVoyageConfigurationMaxSpectraForce5418;
        PolarVoyageOnTouchListenerPrimePixelLegend8920 polarVoyageOnTouchListenerPrimePixelLegend89202 = polarVoyageTransitionManagerHeroNovaX33223.PolarVoyageLayerDrawableShadowTitaniumOmega1942;
        Resources resources = polarVoyageRewardedAdUltraTitanium47873.getContext().getResources();
        polarVoyageToastUltraNeo66024.PolarVoyageTextInputEditTextNebulaHero6651("android.view.View");
        PolarVoyageInAppPurchaseTitaniumEpic6306 polarVoyageInAppPurchaseTitaniumEpic63062 = polarVoyageJobIntentServiceStormEclipsePixel25393.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        PolarVoyageKeyframeThunderMegaVortex8492 polarVoyageKeyframeThunderMegaVortex84922 = polarVoyageInAppPurchaseTitaniumEpic63062.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (polarVoyageKeyframeThunderMegaVortex84922.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageLifecycleOlympianOmega3762)) {
            polarVoyageToastUltraNeo66024.PolarVoyageTextInputEditTextNebulaHero6651("android.widget.EditText");
        }
        if (polarVoyageKeyframeThunderMegaVortex84922.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageCameraViewSpectraMaxSpectra2824)) {
            polarVoyageToastUltraNeo66024.PolarVoyageTextInputEditTextNebulaHero6651("android.widget.TextView");
        }
        Object PolarVoyageTextInputEditTextNebulaHero66518 = polarVoyageKeyframeThunderMegaVortex84922.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageLayerDrawableShadowTitaniumOmega1942);
        if (PolarVoyageTextInputEditTextNebulaHero66518 == null) {
            PolarVoyageTextInputEditTextNebulaHero66518 = null;
        }
        if (((PolarVoyageTextInputEditTextSparkForce5712) PolarVoyageTextInputEditTextNebulaHero66518) != null && ((polarVoyageJobIntentServiceStormEclipsePixel25393.PolarVoyageBitmapVisionAuroraPixel4705 || PolarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageRotateAnimationCyberCelestialDelta4768(4, polarVoyageJobIntentServiceStormEclipsePixel25393).isEmpty()) && (polarVoyageJobIntentServiceStormEclipsePixel25393.PolarVoyageSnackbarGammaEclipse2140() || polarVoyageInAppPurchaseTitaniumEpic63062.PolarVoyageRotateAnimationCyberCelestialDelta4768))) {
            polarVoyageToastUltraNeo66024.PolarVoyageTextInputEditTextNebulaHero6651("android.widget.ImageView");
        }
        obtain.setPackageName(polarVoyageRewardedAdUltraTitanium47873.getContext().getPackageName());
        obtain.setImportantForAccessibility(PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageCanvasElitePhoenix4750(polarVoyageJobIntentServiceStormEclipsePixel25393));
        boolean PolarVoyageBitmapVisionAuroraPixel4705 = i5 >= 34 ? PolarVoyageToolbarBlazeTitanium3444.PolarVoyageBitmapVisionAuroraPixel4705(accessibilityManager) : true;
        List PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageRotateAnimationCyberCelestialDelta4768(4, polarVoyageJobIntentServiceStormEclipsePixel25393);
        int size = PolarVoyageRotateAnimationCyberCelestialDelta4768.size();
        boolean z9 = PolarVoyageBitmapVisionAuroraPixel4705;
        int i6 = 0;
        int i7 = 0;
        while (i7 < size) {
            List list = PolarVoyageRotateAnimationCyberCelestialDelta4768;
            PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel25394 = (PolarVoyageJobIntentServiceStormEclipsePixel2539) PolarVoyageRotateAnimationCyberCelestialDelta4768.get(i7);
            int i8 = i7;
            PolarVoyageIntentServiceEclipseGammaHero3323 PolarVoyageCameraPixelBlaze2629 = polarVoyageTransitionManagerHeroNovaX33223.PolarVoyageCameraPixelBlaze2629();
            int i9 = size;
            int i10 = polarVoyageJobIntentServiceStormEclipsePixel25394.PolarVoyageTextInputEditTextNebulaHero6651;
            if (PolarVoyageCameraPixelBlaze2629.PolarVoyageZipVortexCelestial6185(i10)) {
                PolarVoyageRoomEntityCelestialCosmosPixel5838 polarVoyageRoomEntityCelestialCosmosPixel5838 = polarVoyageRewardedAdUltraTitanium47873.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(polarVoyageJobIntentServiceStormEclipsePixel25394.PolarVoyageKotlinBetaPulseBeta3653);
                if (i10 != -1) {
                    if (polarVoyageRoomEntityCelestialCosmosPixel5838 != null) {
                        obtain.addChild(polarVoyageRoomEntityCelestialCosmosPixel5838);
                    } else {
                        PolarVoyageItemDecorationPrimePrime4359 polarVoyageItemDecorationPrimePrime43592 = (PolarVoyageItemDecorationPrimePrime4359) polarVoyageTransitionManagerHeroNovaX33223.PolarVoyageCameraPixelBlaze2629().PolarVoyageMotionLayoutTransitionHeroVision4068(i10);
                        if (polarVoyageItemDecorationPrimePrime43592 == null || (polarVoyageJobIntentServiceStormEclipsePixel25392 = polarVoyageItemDecorationPrimePrime43592.PolarVoyageZipVortexCelestial6185) == null) {
                            z8 = false;
                        } else {
                            Object PolarVoyageTextInputEditTextNebulaHero66519 = polarVoyageJobIntentServiceStormEclipsePixel25392.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageCameraPixelBlaze2629);
                            if (PolarVoyageTextInputEditTextNebulaHero66519 == null) {
                                PolarVoyageTextInputEditTextNebulaHero66519 = null;
                            }
                            z8 = PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageTextInputEditTextNebulaHero66519, Boolean.TRUE);
                        }
                        if (z9 || !z8) {
                            obtain.addChild(polarVoyageRewardedAdUltraTitanium47873, i10);
                        }
                    }
                    polarVoyageAlphaAnimationSparkNovaXTitan12122.PolarVoyageDiffUtilTurboStrike5735(i10, i6);
                    i6++;
                }
            }
            i7 = i8 + 1;
            PolarVoyageRotateAnimationCyberCelestialDelta4768 = list;
            size = i9;
        }
        int i11 = polarVoyageTransitionManagerHeroNovaX33223.PolarVoyageDrawableDeltaHyperion5742;
        AccessibilityNodeInfo accessibilityNodeInfo4 = polarVoyageToastUltraNeo66024.PolarVoyageZipVortexCelestial6185;
        if (i == i11) {
            accessibilityNodeInfo4.setAccessibilityFocused(true);
            polarVoyageToastUltraNeo66024.PolarVoyageZipVortexCelestial6185(PolarVoyageAnimatorSetVisionEpic3385.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
        } else {
            accessibilityNodeInfo4.setAccessibilityFocused(false);
            polarVoyageToastUltraNeo66024.PolarVoyageZipVortexCelestial6185(PolarVoyageAnimatorSetVisionEpic3385.PolarVoyageKotlinBetaPulseBeta3653);
        }
        PolarVoyageDelayAuroraSparkTurbo6655 PolarVoyageDisplayMetricsVortexDragon9516 = PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDisplayMetricsVortexDragon9516(polarVoyageJobIntentServiceStormEclipsePixel25393);
        if (PolarVoyageDisplayMetricsVortexDragon9516 != null) {
            polarVoyageRewardedAdUltraTitanium47873.getFontFamilyResolver();
            PolarVoyageEditTextAuroraHeroPulse9577 density = polarVoyageRewardedAdUltraTitanium47873.getDensity();
            PolarVoyageDrawableCosmosEclipseMax6944 polarVoyageDrawableCosmosEclipseMax6944 = polarVoyageTransitionManagerHeroNovaX33223.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149;
            polarVoyageRewardedAdUltraTitanium4787 = polarVoyageRewardedAdUltraTitanium47873;
            String str2 = PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageStrictModeLegendEpic1532;
            polarVoyageOnTouchListenerPrimePixelLegend8920 = polarVoyageOnTouchListenerPrimePixelLegend89202;
            List list2 = PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageItemDecorationUltraDeltaEpic7485;
            SpannableString spannableString2 = new SpannableString(str2);
            ArrayList arrayList3 = PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            if (arrayList3 != null) {
                int size2 = arrayList3.size();
                polarVoyageConfigurationMegaTitaniumQuantum2348 = polarVoyageConfigurationMegaTitaniumQuantum23483;
                int i12 = 0;
                while (i12 < size2) {
                    ArrayList arrayList4 = arrayList3;
                    PolarVoyageActivityInfoOlympianCosmos2375 polarVoyageActivityInfoOlympianCosmos2375 = (PolarVoyageActivityInfoOlympianCosmos2375) arrayList3.get(i12);
                    int i13 = size2;
                    PolarVoyageSharedFlowThunderTitaniumNeo4341 polarVoyageSharedFlowThunderTitaniumNeo4341 = (PolarVoyageSharedFlowThunderTitaniumNeo4341) polarVoyageActivityInfoOlympianCosmos2375.PolarVoyageZipVortexCelestial6185;
                    int i14 = i12;
                    int i15 = polarVoyageActivityInfoOlympianCosmos2375.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    int i16 = polarVoyageActivityInfoOlympianCosmos2375.PolarVoyageKotlinBetaPulseBeta3653;
                    PolarVoyageTransitionManagerHeroNovaX3322 polarVoyageTransitionManagerHeroNovaX33224 = polarVoyageTransitionManagerHeroNovaX33223;
                    long PolarVoyageBitmapVisionAuroraPixel47052 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageZipVortexCelestial6185.PolarVoyageBitmapVisionAuroraPixel4705();
                    PolarVoyageAlphaAnimationSparkNovaXTitan1212 polarVoyageAlphaAnimationSparkNovaXTitan12123 = polarVoyageAlphaAnimationSparkNovaXTitan12122;
                    PolarVoyageInAppPurchaseTitaniumEpic6306 polarVoyageInAppPurchaseTitaniumEpic63063 = polarVoyageInAppPurchaseTitaniumEpic63062;
                    long j = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    PolarVoyagePaintSolarElite8455 polarVoyagePaintSolarElite8455 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageKotlinBetaPulseBeta3653;
                    PolarVoyageZipGammaTitanium6712 polarVoyageZipGammaTitanium6712 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                    PolarVoyageDebugHyperionAurora3532 polarVoyageDebugHyperionAurora3532 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    PolarVoyageToastUltraNeo6602 polarVoyageToastUltraNeo66025 = polarVoyageToastUltraNeo66024;
                    PolarVoyageZipSpeedSolar9113 polarVoyageZipSpeedSolar9113 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageBottomSheetOmegaNeo1907;
                    PolarVoyageKeyframeThunderMegaVortex8492 polarVoyageKeyframeThunderMegaVortex84923 = polarVoyageKeyframeThunderMegaVortex84922;
                    AccessibilityNodeInfo accessibilityNodeInfo5 = obtain;
                    long j2 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageViewRogueMaster4778;
                    PolarVoyageImageCaptureVisionStorm7789 polarVoyageImageCaptureVisionStorm7789 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageCameraPixelBlaze2629;
                    PolarVoyageFlowCollectorCosmosNovaBeta5120 polarVoyageFlowCollectorCosmosNovaBeta5120 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageZipVortexCelestial6185;
                    PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel25395 = polarVoyageJobIntentServiceStormEclipsePixel25393;
                    AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfo4;
                    if (!PolarVoyageContentResolverRogueSpeed9469.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageBitmapVisionAuroraPixel47052, polarVoyageFlowCollectorCosmosNovaBeta5120.PolarVoyageBitmapVisionAuroraPixel4705())) {
                        polarVoyageFlowCollectorCosmosNovaBeta5120 = PolarVoyageBitmapVisionAuroraPixel47052 != 16 ? new PolarVoyageOnGlobalLayoutListenerThunderCosmosVortex6865(PolarVoyageBitmapVisionAuroraPixel47052) : PolarVoyageOnLongClickListenerOlympianPhantomAlpha1069.PolarVoyageLayerDrawableShadowTitaniumOmega1942;
                    }
                    PolarVoyageLayoutOmegaVortex4134.PolarVoyageNavigationViewHyperHyperHyperion1793(spannableString2, polarVoyageFlowCollectorCosmosNovaBeta5120.PolarVoyageBitmapVisionAuroraPixel4705(), i15, i16);
                    SpannableString spannableString3 = spannableString2;
                    PolarVoyageLayoutOmegaVortex4134.PolarVoyageAnimatorSetSparkUltraMax8233(spannableString3, j, density, i15, i16);
                    if (polarVoyagePaintSolarElite8455 == null && polarVoyageZipGammaTitanium6712 == null) {
                        i4 = 33;
                    } else {
                        i4 = 33;
                        spannableString3.setSpan(new StyleSpan(PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyagePaintSolarElite8455 == null ? PolarVoyagePaintSolarElite8455.PolarVoyageViewRogueMaster4778 : polarVoyagePaintSolarElite8455, polarVoyageZipGammaTitanium6712 != null ? polarVoyageZipGammaTitanium6712.PolarVoyageZipVortexCelestial6185 : 0)), i15, i16, 33);
                    }
                    if (polarVoyageImageCaptureVisionStorm7789 != null) {
                        int i17 = polarVoyageImageCaptureVisionStorm7789.PolarVoyageZipVortexCelestial6185;
                        if ((i17 | 1) == i17) {
                            spannableString3.setSpan(new UnderlineSpan(), i15, i16, i4);
                        }
                        if ((i17 | 2) == i17) {
                            spannableString3.setSpan(new StrikethroughSpan(), i15, i16, i4);
                        }
                    }
                    if (polarVoyageDebugHyperionAurora3532 != null) {
                        spannableString3.setSpan(new ScaleXSpan(polarVoyageDebugHyperionAurora3532.PolarVoyageZipVortexCelestial6185), i15, i16, i4);
                    }
                    PolarVoyageLayoutOmegaVortex4134.PolarVoyageBitmapMaxTitanTitan7960(spannableString3, polarVoyageZipSpeedSolar9113, i15, i16);
                    if (j2 != 16) {
                        spannableString3.setSpan(new BackgroundColorSpan(PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageGuidelineStormSolar2850(j2)), i15, i16, i4);
                    }
                    i12 = i14 + 1;
                    spannableString2 = spannableString3;
                    polarVoyageJobIntentServiceStormEclipsePixel25393 = polarVoyageJobIntentServiceStormEclipsePixel25395;
                    arrayList3 = arrayList4;
                    size2 = i13;
                    polarVoyageTransitionManagerHeroNovaX33223 = polarVoyageTransitionManagerHeroNovaX33224;
                    polarVoyageAlphaAnimationSparkNovaXTitan12122 = polarVoyageAlphaAnimationSparkNovaXTitan12123;
                    polarVoyageInAppPurchaseTitaniumEpic63062 = polarVoyageInAppPurchaseTitaniumEpic63063;
                    polarVoyageToastUltraNeo66024 = polarVoyageToastUltraNeo66025;
                    obtain = accessibilityNodeInfo5;
                    polarVoyageKeyframeThunderMegaVortex84922 = polarVoyageKeyframeThunderMegaVortex84923;
                    accessibilityNodeInfo4 = accessibilityNodeInfo6;
                }
            } else {
                polarVoyageConfigurationMegaTitaniumQuantum2348 = polarVoyageConfigurationMegaTitaniumQuantum23483;
            }
            polarVoyageTransitionManagerHeroNovaX3322 = polarVoyageTransitionManagerHeroNovaX33223;
            polarVoyageAlphaAnimationSparkNovaXTitan1212 = polarVoyageAlphaAnimationSparkNovaXTitan12122;
            polarVoyageInAppPurchaseTitaniumEpic6306 = polarVoyageInAppPurchaseTitaniumEpic63062;
            AccessibilityNodeInfo accessibilityNodeInfo7 = accessibilityNodeInfo4;
            polarVoyageKeyframeThunderMegaVortex8492 = polarVoyageKeyframeThunderMegaVortex84922;
            accessibilityNodeInfo = obtain;
            polarVoyageToastUltraNeo6602 = polarVoyageToastUltraNeo66024;
            SpannableString spannableString4 = spannableString2;
            polarVoyageJobIntentServiceStormEclipsePixel2539 = polarVoyageJobIntentServiceStormEclipsePixel25393;
            int length = str2.length();
            ?? r2 = PolarVoyageWindowManagerSpeedUltra3573.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (list2 != null) {
                arrayList = new ArrayList(list2.size());
                int size3 = list2.size();
                for (int i18 = 0; i18 < size3; i18++) {
                    Object obj = list2.get(i18);
                    PolarVoyageActivityInfoOlympianCosmos2375 polarVoyageActivityInfoOlympianCosmos23752 = (PolarVoyageActivityInfoOlympianCosmos2375) obj;
                    if ((polarVoyageActivityInfoOlympianCosmos23752.PolarVoyageZipVortexCelestial6185 instanceof PolarVoyageProcessCameraProviderStormEpic2001) && PolarVoyageLooperTurboPixel4815.PolarVoyageZipVortexCelestial6185(0, length, polarVoyageActivityInfoOlympianCosmos23752.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageActivityInfoOlympianCosmos23752.PolarVoyageKotlinBetaPulseBeta3653)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = r2;
            }
            int size4 = arrayList.size();
            for (int i19 = 0; i19 < size4; i19++) {
                PolarVoyageActivityInfoOlympianCosmos2375 polarVoyageActivityInfoOlympianCosmos23753 = (PolarVoyageActivityInfoOlympianCosmos2375) arrayList.get(i19);
                PolarVoyageProcessCameraProviderStormEpic2001 polarVoyageProcessCameraProviderStormEpic2001 = (PolarVoyageProcessCameraProviderStormEpic2001) polarVoyageActivityInfoOlympianCosmos23753.PolarVoyageZipVortexCelestial6185;
                int i20 = polarVoyageActivityInfoOlympianCosmos23753.PolarVoyageMotionLayoutTransitionHeroVision4068;
                int i21 = polarVoyageActivityInfoOlympianCosmos23753.PolarVoyageKotlinBetaPulseBeta3653;
                if (!(polarVoyageProcessCameraProviderStormEpic2001 instanceof PolarVoyageProcessCameraProviderStormEpic2001)) {
                    PolarVoyageAdapterFusionMasterGamma8495.PolarVoyageMotionLayoutTransitionHeroVision4068();
                    return null;
                }
                spannableString4.setSpan(new TtsSpan.VerbatimBuilder(polarVoyageProcessCameraProviderStormEpic2001.PolarVoyageZipVortexCelestial6185).build(), i20, i21, 33);
            }
            int length2 = str2.length();
            if (list2 != null) {
                arrayList2 = new ArrayList(list2.size());
                int size5 = list2.size();
                for (int i22 = 0; i22 < size5; i22++) {
                    Object obj2 = list2.get(i22);
                    PolarVoyageActivityInfoOlympianCosmos2375 polarVoyageActivityInfoOlympianCosmos23754 = (PolarVoyageActivityInfoOlympianCosmos2375) obj2;
                    if ((polarVoyageActivityInfoOlympianCosmos23754.PolarVoyageZipVortexCelestial6185 instanceof PolarVoyageMotionLayoutHyperCosmosLegend2497) && PolarVoyageLooperTurboPixel4815.PolarVoyageZipVortexCelestial6185(0, length2, polarVoyageActivityInfoOlympianCosmos23754.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageActivityInfoOlympianCosmos23754.PolarVoyageKotlinBetaPulseBeta3653)) {
                        arrayList2.add(obj2);
                    }
                }
            } else {
                arrayList2 = r2;
            }
            int size6 = arrayList2.size();
            for (int i23 = 0; i23 < size6; i23++) {
                PolarVoyageActivityInfoOlympianCosmos2375 polarVoyageActivityInfoOlympianCosmos23755 = (PolarVoyageActivityInfoOlympianCosmos2375) arrayList2.get(i23);
                PolarVoyageMotionLayoutHyperCosmosLegend2497 polarVoyageMotionLayoutHyperCosmosLegend2497 = (PolarVoyageMotionLayoutHyperCosmosLegend2497) polarVoyageActivityInfoOlympianCosmos23755.PolarVoyageZipVortexCelestial6185;
                int i24 = polarVoyageActivityInfoOlympianCosmos23755.PolarVoyageMotionLayoutTransitionHeroVision4068;
                int i25 = polarVoyageActivityInfoOlympianCosmos23755.PolarVoyageKotlinBetaPulseBeta3653;
                WeakHashMap weakHashMap = (WeakHashMap) polarVoyageDrawableCosmosEclipseMax6944.PolarVoyageStrictModeLegendEpic1532;
                Object obj3 = weakHashMap.get(polarVoyageMotionLayoutHyperCosmosLegend2497);
                if (obj3 == null) {
                    obj3 = new URLSpan(polarVoyageMotionLayoutHyperCosmosLegend2497.PolarVoyageZipVortexCelestial6185);
                    weakHashMap.put(polarVoyageMotionLayoutHyperCosmosLegend2497, obj3);
                }
                spannableString4.setSpan((URLSpan) obj3, i24, i25, 33);
            }
            int length3 = str2.length();
            if (list2 != null) {
                r2 = new ArrayList(list2.size());
                int size7 = list2.size();
                for (int i26 = 0; i26 < size7; i26++) {
                    Object obj4 = list2.get(i26);
                    PolarVoyageActivityInfoOlympianCosmos2375 polarVoyageActivityInfoOlympianCosmos23756 = (PolarVoyageActivityInfoOlympianCosmos2375) obj4;
                    if ((polarVoyageActivityInfoOlympianCosmos23756.PolarVoyageZipVortexCelestial6185 instanceof PolarVoyageTranslateAnimationMegaCelestialBeta8224) && PolarVoyageLooperTurboPixel4815.PolarVoyageZipVortexCelestial6185(0, length3, polarVoyageActivityInfoOlympianCosmos23756.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageActivityInfoOlympianCosmos23756.PolarVoyageKotlinBetaPulseBeta3653)) {
                        r2.add(obj4);
                    }
                }
            }
            int size8 = r2.size();
            for (int i27 = 0; i27 < size8; i27++) {
                PolarVoyageActivityInfoOlympianCosmos2375 polarVoyageActivityInfoOlympianCosmos23757 = (PolarVoyageActivityInfoOlympianCosmos2375) r2.get(i27);
                int i28 = polarVoyageActivityInfoOlympianCosmos23757.PolarVoyageMotionLayoutTransitionHeroVision4068;
                Object obj5 = polarVoyageActivityInfoOlympianCosmos23757.PolarVoyageZipVortexCelestial6185;
                int i29 = polarVoyageActivityInfoOlympianCosmos23757.PolarVoyageKotlinBetaPulseBeta3653;
                if (i28 != i29) {
                    PolarVoyageTranslateAnimationMegaCelestialBeta8224 polarVoyageTranslateAnimationMegaCelestialBeta8224 = (PolarVoyageTranslateAnimationMegaCelestialBeta8224) obj5;
                    if (polarVoyageTranslateAnimationMegaCelestialBeta8224 instanceof PolarVoyageInterpolatorInfernoDelta1718) {
                        obj5.getClass();
                        PolarVoyageInterpolatorInfernoDelta1718 polarVoyageInterpolatorInfernoDelta1718 = (PolarVoyageInterpolatorInfernoDelta1718) obj5;
                        PolarVoyageActivityInfoOlympianCosmos2375 polarVoyageActivityInfoOlympianCosmos23758 = new PolarVoyageActivityInfoOlympianCosmos2375(i28, i29, polarVoyageInterpolatorInfernoDelta1718);
                        WeakHashMap weakHashMap2 = (WeakHashMap) polarVoyageDrawableCosmosEclipseMax6944.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                        Object obj6 = weakHashMap2.get(polarVoyageActivityInfoOlympianCosmos23758);
                        if (obj6 == null) {
                            obj6 = new URLSpan(polarVoyageInterpolatorInfernoDelta1718.PolarVoyageZipVortexCelestial6185);
                            weakHashMap2.put(polarVoyageActivityInfoOlympianCosmos23758, obj6);
                        }
                        spannableString4.setSpan((URLSpan) obj6, i28, i29, 33);
                    } else {
                        WeakHashMap weakHashMap3 = (WeakHashMap) polarVoyageDrawableCosmosEclipseMax6944.PolarVoyageBottomSheetOmegaNeo1907;
                        Object obj7 = weakHashMap3.get(polarVoyageActivityInfoOlympianCosmos23757);
                        if (obj7 == null) {
                            obj7 = new PolarVoyageCameraViewOmegaBeta2346(polarVoyageTranslateAnimationMegaCelestialBeta8224);
                            weakHashMap3.put(polarVoyageActivityInfoOlympianCosmos23757, obj7);
                        }
                        spannableString4.setSpan((ClickableSpan) obj7, i28, i29, 33);
                    }
                }
            }
            spannableString = (SpannableString) PolarVoyageTransitionManagerHeroNovaX3322.PolarVoyageFlingGestureEclipsePrimeMax1376(spannableString4);
            accessibilityNodeInfo2 = accessibilityNodeInfo7;
        } else {
            polarVoyageTransitionManagerHeroNovaX3322 = polarVoyageTransitionManagerHeroNovaX33223;
            polarVoyageRewardedAdUltraTitanium4787 = polarVoyageRewardedAdUltraTitanium47873;
            polarVoyageAlphaAnimationSparkNovaXTitan1212 = polarVoyageAlphaAnimationSparkNovaXTitan12122;
            polarVoyageInAppPurchaseTitaniumEpic6306 = polarVoyageInAppPurchaseTitaniumEpic63062;
            polarVoyageConfigurationMegaTitaniumQuantum2348 = polarVoyageConfigurationMegaTitaniumQuantum23483;
            polarVoyageKeyframeThunderMegaVortex8492 = polarVoyageKeyframeThunderMegaVortex84922;
            accessibilityNodeInfo = obtain;
            polarVoyageToastUltraNeo6602 = polarVoyageToastUltraNeo66024;
            polarVoyageOnTouchListenerPrimePixelLegend8920 = polarVoyageOnTouchListenerPrimePixelLegend89202;
            polarVoyageJobIntentServiceStormEclipsePixel2539 = polarVoyageJobIntentServiceStormEclipsePixel25393;
            spannableString = null;
            accessibilityNodeInfo2 = accessibilityNodeInfo4;
        }
        accessibilityNodeInfo2.setText(spannableString);
        PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra2582 = PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageFlingGestureEclipsePrimeMax1376;
        PolarVoyageKeyframeThunderMegaVortex8492 polarVoyageKeyframeThunderMegaVortex84924 = polarVoyageKeyframeThunderMegaVortex8492;
        if (polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageLintBetaUltra2582)) {
            accessibilityNodeInfo3 = accessibilityNodeInfo;
            accessibilityNodeInfo3.setContentInvalid(true);
            Object PolarVoyageTextInputEditTextNebulaHero665110 = polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageLintBetaUltra2582);
            if (PolarVoyageTextInputEditTextNebulaHero665110 == null) {
                PolarVoyageTextInputEditTextNebulaHero665110 = null;
            }
            accessibilityNodeInfo3.setError((CharSequence) PolarVoyageTextInputEditTextNebulaHero665110);
        } else {
            accessibilityNodeInfo3 = accessibilityNodeInfo;
        }
        String PolarVoyageBitmapMaxTitanTitan7960 = PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageBitmapMaxTitanTitan7960(polarVoyageJobIntentServiceStormEclipsePixel2539, resources);
        if (Build.VERSION.SDK_INT >= 30) {
            PolarVoyageObjectDetectionCosmosDragonNebula8799.PolarVoyageItemDecorationUltraDeltaEpic7485(accessibilityNodeInfo2, PolarVoyageBitmapMaxTitanTitan7960);
        } else {
            accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", PolarVoyageBitmapMaxTitanTitan7960);
        }
        accessibilityNodeInfo3.setCheckable(PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyageJobIntentServiceStormEclipsePixel2539));
        Object PolarVoyageTextInputEditTextNebulaHero665111 = polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageViewBindingPulseHeroSpeed5705);
        if (PolarVoyageTextInputEditTextNebulaHero665111 == null) {
            PolarVoyageTextInputEditTextNebulaHero665111 = null;
        }
        PolarVoyageSnackbarShadowCyberAlpha3691 polarVoyageSnackbarShadowCyberAlpha3691 = (PolarVoyageSnackbarShadowCyberAlpha3691) PolarVoyageTextInputEditTextNebulaHero665111;
        if (polarVoyageSnackbarShadowCyberAlpha3691 != null) {
            if (polarVoyageSnackbarShadowCyberAlpha3691 == PolarVoyageSnackbarShadowCyberAlpha3691.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                accessibilityNodeInfo2.setChecked(true);
            } else if (polarVoyageSnackbarShadowCyberAlpha3691 == PolarVoyageSnackbarShadowCyberAlpha3691.PolarVoyageStrictModeLegendEpic1532) {
                accessibilityNodeInfo2.setChecked(false);
            }
        }
        Object PolarVoyageTextInputEditTextNebulaHero665112 = polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageFCMCelestialCosmosPixel3711);
        if (PolarVoyageTextInputEditTextNebulaHero665112 == null) {
            PolarVoyageTextInputEditTextNebulaHero665112 = null;
        }
        Boolean bool = (Boolean) PolarVoyageTextInputEditTextNebulaHero665112;
        if (bool != null) {
            accessibilityNodeInfo2.setChecked(bool.booleanValue());
        }
        PolarVoyageInAppPurchaseTitaniumEpic6306 polarVoyageInAppPurchaseTitaniumEpic63064 = polarVoyageInAppPurchaseTitaniumEpic6306;
        if (!polarVoyageInAppPurchaseTitaniumEpic63064.PolarVoyageRotateAnimationCyberCelestialDelta4768 || PolarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageRotateAnimationCyberCelestialDelta4768(4, polarVoyageJobIntentServiceStormEclipsePixel2539).isEmpty()) {
            Object PolarVoyageTextInputEditTextNebulaHero665113 = polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageZipVortexCelestial6185);
            if (PolarVoyageTextInputEditTextNebulaHero665113 == null) {
                PolarVoyageTextInputEditTextNebulaHero665113 = null;
            }
            List list3 = (List) PolarVoyageTextInputEditTextNebulaHero665113;
            accessibilityNodeInfo3.setContentDescription(list3 != null ? (String) PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageObserverEliteUltra2793(list3) : null);
        }
        Object PolarVoyageTextInputEditTextNebulaHero665114 = polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageMotionLayoutForceEpicAurora7183);
        if (PolarVoyageTextInputEditTextNebulaHero665114 == null) {
            PolarVoyageTextInputEditTextNebulaHero665114 = null;
        }
        String str3 = (String) PolarVoyageTextInputEditTextNebulaHero665114;
        if (str3 != null) {
            PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel25396 = polarVoyageJobIntentServiceStormEclipsePixel2539;
            while (true) {
                if (polarVoyageJobIntentServiceStormEclipsePixel25396 == null) {
                    z7 = false;
                    break;
                }
                PolarVoyageInAppPurchaseTitaniumEpic6306 polarVoyageInAppPurchaseTitaniumEpic63065 = polarVoyageJobIntentServiceStormEclipsePixel25396.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra25822 = PolarVoyageJobSchedulerVortexPrime6352.PolarVoyageZipVortexCelestial6185;
                if (polarVoyageInAppPurchaseTitaniumEpic63065.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageLintBetaUltra25822)) {
                    z7 = ((Boolean) polarVoyageInAppPurchaseTitaniumEpic63065.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageLintBetaUltra25822)).booleanValue();
                    break;
                }
                polarVoyageJobIntentServiceStormEclipsePixel25396 = polarVoyageJobIntentServiceStormEclipsePixel25396.PolarVoyageViewRogueMaster4778();
            }
            if (z7) {
                accessibilityNodeInfo3.setViewIdResourceName(str3);
            }
        }
        Object PolarVoyageTextInputEditTextNebulaHero665115 = polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageItemDecorationUltraDeltaEpic7485);
        if (PolarVoyageTextInputEditTextNebulaHero665115 == null) {
            PolarVoyageTextInputEditTextNebulaHero665115 = null;
        }
        char c2 = 2;
        if (((PolarVoyageFilterGammaStrikeNova8373) PolarVoyageTextInputEditTextNebulaHero665115) != null) {
            if (Build.VERSION.SDK_INT < 28) {
                polarVoyageToastUltraNeo66022 = polarVoyageToastUltraNeo6602;
                polarVoyageToastUltraNeo66022.PolarVoyageDiffUtilTurboStrike5735(2, true);
                i2 = i;
                if (i2 != -1) {
                    int PolarVoyageBarcodeScannerInfernoSolarSpark77673 = polarVoyageAlphaAnimationSparkNovaXTitan1212.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageTextInputEditTextNebulaHero6651);
                    if (PolarVoyageBarcodeScannerInfernoSolarSpark77673 != -1) {
                        accessibilityNodeInfo3.setDrawingOrder(PolarVoyageBarcodeScannerInfernoSolarSpark77673);
                    } else {
                        Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                    }
                }
                accessibilityNodeInfo3.setPassword(polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageCardViewAlphaVortexCelestial9747));
                accessibilityNodeInfo3.setEditable(polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149));
                PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageToolbarEclipseInfernoHero6368);
                if (PolarVoyageTextInputEditTextNebulaHero6651 == null) {
                    PolarVoyageTextInputEditTextNebulaHero6651 = null;
                }
                Integer num = (Integer) PolarVoyageTextInputEditTextNebulaHero6651;
                accessibilityNodeInfo3.setMaxTextLength(num == null ? num.intValue() : -1);
                accessibilityNodeInfo3.setEnabled(PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539));
                PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra25823 = PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBottomSheetOmegaNeo1907;
                accessibilityNodeInfo3.setFocusable(polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageLintBetaUltra25823));
                if (accessibilityNodeInfo3.isFocusable()) {
                    polarVoyageTransitionManagerHeroNovaX33222 = polarVoyageTransitionManagerHeroNovaX3322;
                } else {
                    accessibilityNodeInfo3.setFocused(((Boolean) polarVoyageInAppPurchaseTitaniumEpic63064.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageLintBetaUltra25823)).booleanValue());
                    if (!accessibilityNodeInfo3.isFocused()) {
                        polarVoyageTransitionManagerHeroNovaX33222 = polarVoyageTransitionManagerHeroNovaX3322;
                        z = true;
                        accessibilityNodeInfo2.addAction(1);
                        accessibilityNodeInfo2.setVisibleToUser(PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageConfigurationMaxSpectraForce5418(polarVoyageJobIntentServiceStormEclipsePixel2539) ^ z);
                        PolarVoyageTextInputEditTextNebulaHero66512 = polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                        if (PolarVoyageTextInputEditTextNebulaHero66512 == null) {
                            PolarVoyageTextInputEditTextNebulaHero66512 = null;
                        }
                        PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageMotionLayoutForceEpicAurora7183(PolarVoyageTextInputEditTextNebulaHero66512);
                        accessibilityNodeInfo2.setClickable(false);
                        polarVoyageRewardedAdPulseVision5089 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageMotionLayoutTransitionHeroVision4068);
                        if (polarVoyageRewardedAdPulseVision5089 != null) {
                            PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageFCMCelestialCosmosPixel3711), Boolean.TRUE);
                            accessibilityNodeInfo2.setClickable(true);
                            if (PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539) && accessibilityNodeInfo3.isClickable()) {
                                polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(new PolarVoyageAnimatorSetVisionEpic3385(polarVoyageRewardedAdPulseVision5089.PolarVoyageZipVortexCelestial6185, 16));
                            }
                        }
                        accessibilityNodeInfo2.setLongClickable(false);
                        polarVoyageRewardedAdPulseVision50892 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageKotlinBetaPulseBeta3653);
                        if (polarVoyageRewardedAdPulseVision50892 != null) {
                            accessibilityNodeInfo2.setLongClickable(true);
                            if (PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539)) {
                                polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(new PolarVoyageAnimatorSetVisionEpic3385(polarVoyageRewardedAdPulseVision50892.PolarVoyageZipVortexCelestial6185, 32));
                            }
                        }
                        polarVoyageRewardedAdPulseVision50893 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageDrawableDeltaHyperion5742);
                        if (polarVoyageRewardedAdPulseVision50893 != null) {
                            polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(new PolarVoyageAnimatorSetVisionEpic3385(polarVoyageRewardedAdPulseVision50893.PolarVoyageZipVortexCelestial6185, 16384));
                        }
                        if (PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539)) {
                            PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision50895 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageStrictModeLegendEpic1532);
                            if (polarVoyageRewardedAdPulseVision50895 != null) {
                                polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(new PolarVoyageAnimatorSetVisionEpic3385(polarVoyageRewardedAdPulseVision50895.PolarVoyageZipVortexCelestial6185, 2097152));
                            }
                            PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision50896 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageCameraPixelBlaze2629);
                            if (polarVoyageRewardedAdPulseVision50896 != null) {
                                polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(new PolarVoyageAnimatorSetVisionEpic3385(polarVoyageRewardedAdPulseVision50896.PolarVoyageZipVortexCelestial6185, R.id.accessibilityActionImeEnter));
                            }
                            PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision50897 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageSnackbarGammaEclipse2140);
                            if (polarVoyageRewardedAdPulseVision50897 != null) {
                                polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(new PolarVoyageAnimatorSetVisionEpic3385(polarVoyageRewardedAdPulseVision50897.PolarVoyageZipVortexCelestial6185, 65536));
                            }
                            PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision50898 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageContentProviderHyperSpark3838);
                            if (polarVoyageRewardedAdPulseVision50898 != null && accessibilityNodeInfo3.isFocused()) {
                                ClipDescription primaryClipDescription = polarVoyageRewardedAdUltraTitanium4787.getClipboardManager().PolarVoyageZipVortexCelestial6185.getPrimaryClipDescription();
                                if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                    polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(new PolarVoyageAnimatorSetVisionEpic3385(polarVoyageRewardedAdPulseVision50898.PolarVoyageZipVortexCelestial6185, 32768));
                                }
                            }
                        }
                        PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageTransitionManagerHeroNovaX3322.PolarVoyageDrawableDeltaHyperion5742(polarVoyageJobIntentServiceStormEclipsePixel2539);
                        if (!(PolarVoyageDrawableDeltaHyperion5742 != null || PolarVoyageDrawableDeltaHyperion5742.length() == 0)) {
                            accessibilityNodeInfo3.setTextSelection(polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageViewRogueMaster4778(polarVoyageJobIntentServiceStormEclipsePixel2539), polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageJobIntentServiceStormEclipsePixel2539));
                            PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision50899 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageItemDecorationUltraDeltaEpic7485);
                            polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(new PolarVoyageAnimatorSetVisionEpic3385(polarVoyageRewardedAdPulseVision50899 != null ? polarVoyageRewardedAdPulseVision50899.PolarVoyageZipVortexCelestial6185 : null, 131072));
                            accessibilityNodeInfo2.addAction(256);
                            accessibilityNodeInfo2.addAction(512);
                            accessibilityNodeInfo2.setMovementGranularities(11);
                            List list4 = (List) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageZipVortexCelestial6185);
                            if ((list4 == null || list4.isEmpty()) && polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageZipVortexCelestial6185)) {
                                if (!polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageLifecycleOlympianOmega3762) || PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, polarVoyageLintBetaUltra25823), Boolean.TRUE)) {
                                    PolarVoyageConfigurationMegaTitaniumQuantum2348 PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageNavigationViewHyperHyperHyperion1793();
                                    while (true) {
                                        if (PolarVoyageNavigationViewHyperHyperHyperion1793 == null) {
                                            PolarVoyageNavigationViewHyperHyperHyperion1793 = null;
                                            break;
                                        }
                                        PolarVoyageInAppPurchaseTitaniumEpic6306 PolarVoyageDisplayMetricsVortexDragon95162 = PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageDisplayMetricsVortexDragon9516();
                                        if (PolarVoyageDisplayMetricsVortexDragon95162 != null) {
                                            c = c2;
                                            if (PolarVoyageDisplayMetricsVortexDragon95162.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                                                if (PolarVoyageDisplayMetricsVortexDragon95162.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageLifecycleOlympianOmega3762)) {
                                                    z6 = true;
                                                    if (!z6) {
                                                        break;
                                                    }
                                                    PolarVoyageNavigationViewHyperHyperHyperion1793 = PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageNavigationViewHyperHyperHyperion1793();
                                                    c2 = c;
                                                }
                                            }
                                        } else {
                                            c = c2;
                                        }
                                        z6 = false;
                                        if (!z6) {
                                        }
                                    }
                                    if (PolarVoyageNavigationViewHyperHyperHyperion1793 != null) {
                                        PolarVoyageInAppPurchaseTitaniumEpic6306 PolarVoyageDisplayMetricsVortexDragon95163 = PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageDisplayMetricsVortexDragon9516();
                                        if (PolarVoyageDisplayMetricsVortexDragon95163 != null) {
                                            Object PolarVoyageTextInputEditTextNebulaHero665116 = PolarVoyageDisplayMetricsVortexDragon95163.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageLintBetaUltra25823);
                                            if (PolarVoyageTextInputEditTextNebulaHero665116 == null) {
                                                PolarVoyageTextInputEditTextNebulaHero665116 = null;
                                            }
                                            z5 = PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageTextInputEditTextNebulaHero665116, Boolean.TRUE);
                                        } else {
                                            z5 = false;
                                        }
                                    }
                                    z4 = false;
                                    if (!z4) {
                                        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                    }
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        ArrayList arrayList5 = new ArrayList();
                                        arrayList5.add("androidx.compose.ui.semantics.id");
                                        CharSequence PolarVoyageBitmapVisionAuroraPixel47053 = polarVoyageToastUltraNeo66022.PolarVoyageBitmapVisionAuroraPixel4705();
                                        if (!(PolarVoyageBitmapVisionAuroraPixel47053 == null || PolarVoyageBitmapVisionAuroraPixel47053.length() == 0) && polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageZipVortexCelestial6185)) {
                                            arrayList5.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                        }
                                        if (polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageMotionLayoutForceEpicAurora7183)) {
                                            arrayList5.add("androidx.compose.ui.semantics.testTag");
                                        }
                                        if (polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageAlarmManagerShadowHyperBeta8339)) {
                                            arrayList5.add("androidx.compose.ui.semantics.shapeType");
                                            arrayList5.add("androidx.compose.ui.semantics.shapeRect");
                                            arrayList5.add("androidx.compose.ui.semantics.shapeCorners");
                                            arrayList5.add("androidx.compose.ui.semantics.shapeRegion");
                                        }
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            accessibilityNodeInfo3.setAvailableExtraData(arrayList5);
                                        }
                                    }
                                    polarVoyageMotionLayoutShadowAuroraInferno1500 = (PolarVoyageMotionLayoutShadowAuroraInferno1500) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageKotlinBetaPulseBeta3653);
                                    if (polarVoyageMotionLayoutShadowAuroraInferno1500 != null) {
                                        float f = polarVoyageMotionLayoutShadowAuroraInferno1500.PolarVoyageZipVortexCelestial6185;
                                        PolarVoyageFlingGestureBlazePulseLegend2819 polarVoyageFlingGestureBlazePulseLegend2819 = polarVoyageMotionLayoutShadowAuroraInferno1500.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                        PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra25824 = PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageTextInputEditTextNebulaHero6651;
                                        if (polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageLintBetaUltra25824)) {
                                            polarVoyageToastUltraNeo66022.PolarVoyageTextInputEditTextNebulaHero6651("android.widget.SeekBar");
                                        } else {
                                            polarVoyageToastUltraNeo66022.PolarVoyageTextInputEditTextNebulaHero6651("android.widget.ProgressBar");
                                        }
                                        if (polarVoyageMotionLayoutShadowAuroraInferno1500 != PolarVoyageMotionLayoutShadowAuroraInferno1500.PolarVoyageKotlinBetaPulseBeta3653) {
                                            accessibilityNodeInfo3.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, polarVoyageFlingGestureBlazePulseLegend2819.PolarVoyageZipVortexCelestial6185, polarVoyageFlingGestureBlazePulseLegend2819.PolarVoyageMotionLayoutTransitionHeroVision4068, f));
                                        }
                                        if (polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageLintBetaUltra25824) && PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539)) {
                                            float f2 = polarVoyageFlingGestureBlazePulseLegend2819.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                            float f3 = polarVoyageFlingGestureBlazePulseLegend2819.PolarVoyageZipVortexCelestial6185;
                                            if (f2 < f3) {
                                                f2 = f3;
                                            }
                                            if (f < f2) {
                                                polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(PolarVoyageAnimatorSetVisionEpic3385.PolarVoyageBitmapVisionAuroraPixel4705);
                                            }
                                            float f4 = polarVoyageFlingGestureBlazePulseLegend2819.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                            if (f3 > f4) {
                                                f3 = f4;
                                            }
                                            if (f > f3) {
                                                polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(PolarVoyageAnimatorSetVisionEpic3385.PolarVoyageDiffUtilTurboStrike5735);
                                            }
                                        }
                                    }
                                    if (PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539) && (polarVoyageRewardedAdPulseVision50894 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageTextInputEditTextNebulaHero6651)) != null) {
                                        polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(new PolarVoyageAnimatorSetVisionEpic3385(polarVoyageRewardedAdPulseVision50894.PolarVoyageZipVortexCelestial6185, R.id.accessibilityActionSetProgress));
                                    }
                                    PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415(polarVoyageToastUltraNeo66022, polarVoyageJobIntentServiceStormEclipsePixel2539);
                                    PolarVoyageTextInputEditTextNebulaHero66513 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageTextInputEditTextNebulaHero6651);
                                    if (PolarVoyageTextInputEditTextNebulaHero66513 == null) {
                                        PolarVoyageTextInputEditTextNebulaHero66513 = null;
                                    }
                                    if (PolarVoyageTextInputEditTextNebulaHero66513 == null) {
                                        PolarVoyageJobIntentServiceStormEclipsePixel2539 PolarVoyageViewRogueMaster47782 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageViewRogueMaster4778();
                                        if (PolarVoyageViewRogueMaster47782 != null) {
                                            Object PolarVoyageTextInputEditTextNebulaHero665117 = PolarVoyageViewRogueMaster47782.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBitmapVisionAuroraPixel4705);
                                            if (PolarVoyageTextInputEditTextNebulaHero665117 == null) {
                                                PolarVoyageTextInputEditTextNebulaHero665117 = null;
                                            }
                                            if (PolarVoyageTextInputEditTextNebulaHero665117 != null) {
                                                Object PolarVoyageTextInputEditTextNebulaHero665118 = PolarVoyageViewRogueMaster47782.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageDiffUtilTurboStrike5735);
                                                if (PolarVoyageTextInputEditTextNebulaHero665118 == null) {
                                                    PolarVoyageTextInputEditTextNebulaHero665118 = null;
                                                }
                                                if (PolarVoyageTextInputEditTextNebulaHero665118 != null) {
                                                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageZipVortexCelestial6185();
                                                } else if (polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageFCMCelestialCosmosPixel3711)) {
                                                    ArrayList arrayList6 = new ArrayList();
                                                    List PolarVoyageRotateAnimationCyberCelestialDelta47682 = PolarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageRotateAnimationCyberCelestialDelta4768(4, PolarVoyageViewRogueMaster47782);
                                                    int size9 = PolarVoyageRotateAnimationCyberCelestialDelta47682.size();
                                                    int i30 = 0;
                                                    for (int i31 = 0; i31 < size9; i31++) {
                                                        PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel25397 = (PolarVoyageJobIntentServiceStormEclipsePixel2539) PolarVoyageRotateAnimationCyberCelestialDelta47682.get(i31);
                                                        if (polarVoyageJobIntentServiceStormEclipsePixel25397.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageFCMCelestialCosmosPixel3711)) {
                                                            arrayList6.add(polarVoyageJobIntentServiceStormEclipsePixel25397);
                                                            if (polarVoyageJobIntentServiceStormEclipsePixel25397.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageBitmapMaxTitanTitan7960() < polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageBitmapMaxTitanTitan7960()) {
                                                                i30++;
                                                            }
                                                        }
                                                    }
                                                    if (!arrayList6.isEmpty()) {
                                                        boolean PolarVoyageViewRogueMaster47783 = PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageViewRogueMaster4778(arrayList6);
                                                        int i32 = PolarVoyageViewRogueMaster47783 ? 0 : i30;
                                                        int i33 = PolarVoyageViewRogueMaster47783 ? i30 : 0;
                                                        Object PolarVoyageTextInputEditTextNebulaHero665119 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageFCMCelestialCosmosPixel3711);
                                                        if (PolarVoyageTextInputEditTextNebulaHero665119 == null) {
                                                            PolarVoyageTextInputEditTextNebulaHero665119 = Boolean.FALSE;
                                                        }
                                                        accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i32, 1, i33, 1, false, ((Boolean) PolarVoyageTextInputEditTextNebulaHero665119).booleanValue()));
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        PolarVoyageR8UltraEliteBeta8736.PolarVoyageZipVortexCelestial6185();
                                    }
                                    polarVoyageActivityFusionHyper3950 = (PolarVoyageActivityFusionHyper3950) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageAnimatorSetSparkUltraMax8233);
                                    PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision508910 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                                    if (polarVoyageActivityFusionHyper3950 != null && polarVoyageRewardedAdPulseVision508910 != null) {
                                        PolarVoyageTextInputEditTextNebulaHero66515 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageDiffUtilTurboStrike5735);
                                        if (PolarVoyageTextInputEditTextNebulaHero66515 == null) {
                                            PolarVoyageTextInputEditTextNebulaHero66515 = null;
                                        }
                                        if (PolarVoyageTextInputEditTextNebulaHero66515 == null) {
                                            Object PolarVoyageTextInputEditTextNebulaHero665120 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBitmapVisionAuroraPixel4705);
                                            if (PolarVoyageTextInputEditTextNebulaHero665120 == null) {
                                                PolarVoyageTextInputEditTextNebulaHero665120 = null;
                                            }
                                            if (PolarVoyageTextInputEditTextNebulaHero665120 == null) {
                                                z3 = false;
                                                if (!z3) {
                                                    polarVoyageToastUltraNeo66022.PolarVoyageTextInputEditTextNebulaHero6651("android.widget.HorizontalScrollView");
                                                }
                                                if (((Number) polarVoyageActivityFusionHyper3950.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068()).floatValue() > 0.0f) {
                                                    accessibilityNodeInfo2.setScrollable(true);
                                                }
                                                if (PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539)) {
                                                    boolean PolarVoyageAnimatorSetSparkUltraMax8233 = PolarVoyageTransitionManagerHeroNovaX3322.PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyageActivityFusionHyper3950);
                                                    PolarVoyageOnLongClickListenerRogueDeltaNova6437 polarVoyageOnLongClickListenerRogueDeltaNova6437 = PolarVoyageOnLongClickListenerRogueDeltaNova6437.PolarVoyageStrictModeLegendEpic1532;
                                                    if (PolarVoyageAnimatorSetSparkUltraMax8233) {
                                                        polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(PolarVoyageAnimatorSetVisionEpic3385.PolarVoyageBitmapVisionAuroraPixel4705);
                                                        polarVoyageConfigurationMegaTitaniumQuantum23482 = polarVoyageConfigurationMegaTitaniumQuantum2348;
                                                        polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(!(polarVoyageConfigurationMegaTitaniumQuantum23482.PolarVoyageFCMCelestialCosmosPixel3711 == polarVoyageOnLongClickListenerRogueDeltaNova6437) ? PolarVoyageAnimatorSetVisionEpic3385.PolarVoyageRotateAnimationCyberCelestialDelta4768 : PolarVoyageAnimatorSetVisionEpic3385.PolarVoyageItemDecorationUltraDeltaEpic7485);
                                                    } else {
                                                        polarVoyageConfigurationMegaTitaniumQuantum23482 = polarVoyageConfigurationMegaTitaniumQuantum2348;
                                                    }
                                                    if (PolarVoyageTransitionManagerHeroNovaX3322.PolarVoyageNavigationViewHyperHyperHyperion1793(polarVoyageActivityFusionHyper3950)) {
                                                        polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(PolarVoyageAnimatorSetVisionEpic3385.PolarVoyageDiffUtilTurboStrike5735);
                                                        polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(!(polarVoyageConfigurationMegaTitaniumQuantum23482.PolarVoyageFCMCelestialCosmosPixel3711 == polarVoyageOnLongClickListenerRogueDeltaNova6437) ? PolarVoyageAnimatorSetVisionEpic3385.PolarVoyageItemDecorationUltraDeltaEpic7485 : PolarVoyageAnimatorSetVisionEpic3385.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                                                    }
                                                }
                                            }
                                        }
                                        z3 = true;
                                        if (!z3) {
                                        }
                                        if (((Number) polarVoyageActivityFusionHyper3950.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068()).floatValue() > 0.0f) {
                                        }
                                        if (PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539)) {
                                        }
                                    }
                                    polarVoyageActivityFusionHyper39502 = (PolarVoyageActivityFusionHyper3950) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBitmapMaxTitanTitan7960);
                                    if (polarVoyageActivityFusionHyper39502 != null && polarVoyageRewardedAdPulseVision508910 != null) {
                                        PolarVoyageTextInputEditTextNebulaHero66514 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageDiffUtilTurboStrike5735);
                                        if (PolarVoyageTextInputEditTextNebulaHero66514 == null) {
                                            PolarVoyageTextInputEditTextNebulaHero66514 = null;
                                        }
                                        if (PolarVoyageTextInputEditTextNebulaHero66514 == null) {
                                            Object PolarVoyageTextInputEditTextNebulaHero665121 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBitmapVisionAuroraPixel4705);
                                            if (PolarVoyageTextInputEditTextNebulaHero665121 == null) {
                                                PolarVoyageTextInputEditTextNebulaHero665121 = null;
                                            }
                                            if (PolarVoyageTextInputEditTextNebulaHero665121 == null) {
                                                z2 = false;
                                                if (!z2) {
                                                    polarVoyageToastUltraNeo66022.PolarVoyageTextInputEditTextNebulaHero6651("android.widget.ScrollView");
                                                }
                                                if (((Number) polarVoyageActivityFusionHyper39502.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068()).floatValue() > 0.0f) {
                                                    accessibilityNodeInfo2.setScrollable(true);
                                                }
                                                if (PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539)) {
                                                    if (PolarVoyageTransitionManagerHeroNovaX3322.PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyageActivityFusionHyper39502)) {
                                                        polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(PolarVoyageAnimatorSetVisionEpic3385.PolarVoyageBitmapVisionAuroraPixel4705);
                                                        polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(PolarVoyageAnimatorSetVisionEpic3385.PolarVoyageStrictModeLegendEpic1532);
                                                    }
                                                    if (PolarVoyageTransitionManagerHeroNovaX3322.PolarVoyageNavigationViewHyperHyperHyperion1793(polarVoyageActivityFusionHyper39502)) {
                                                        polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(PolarVoyageAnimatorSetVisionEpic3385.PolarVoyageDiffUtilTurboStrike5735);
                                                        polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(PolarVoyageAnimatorSetVisionEpic3385.PolarVoyageTextInputEditTextNebulaHero6651);
                                                    }
                                                }
                                            }
                                        }
                                        z2 = true;
                                        if (!z2) {
                                        }
                                        if (((Number) polarVoyageActivityFusionHyper39502.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068()).floatValue() > 0.0f) {
                                        }
                                        if (PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539)) {
                                        }
                                    }
                                    i3 = Build.VERSION.SDK_INT;
                                    if (i3 >= 29) {
                                        PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageDiffUtilTurboStrike5735(polarVoyageToastUltraNeo66022, polarVoyageJobIntentServiceStormEclipsePixel2539);
                                    }
                                    CharSequence charSequence = (CharSequence) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageCameraPixelBlaze2629(), PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                                    if (i3 >= 28) {
                                        accessibilityNodeInfo2.setPaneTitle(charSequence);
                                    } else {
                                        accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                    }
                                    if (PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539)) {
                                        PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision508911 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageCameraPixelBlaze2629(), PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageRemoteModelManagerOlympianCelestial9141);
                                        if (polarVoyageRewardedAdPulseVision508911 != null) {
                                            polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(new PolarVoyageAnimatorSetVisionEpic3385(polarVoyageRewardedAdPulseVision508911.PolarVoyageZipVortexCelestial6185, 262144));
                                        }
                                        PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision508912 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageCameraPixelBlaze2629(), PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageNavigationViewHyperHyperHyperion1793);
                                        if (polarVoyageRewardedAdPulseVision508912 != null) {
                                            polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(new PolarVoyageAnimatorSetVisionEpic3385(polarVoyageRewardedAdPulseVision508912.PolarVoyageZipVortexCelestial6185, 524288));
                                        }
                                        PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision508913 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageCameraPixelBlaze2629(), PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageAnimatorSetSparkUltraMax8233);
                                        if (polarVoyageRewardedAdPulseVision508913 != null) {
                                            polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(new PolarVoyageAnimatorSetVisionEpic3385(polarVoyageRewardedAdPulseVision508913.PolarVoyageZipVortexCelestial6185, 1048576));
                                        }
                                        PolarVoyageInAppPurchaseTitaniumEpic6306 PolarVoyageCameraPixelBlaze26292 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageCameraPixelBlaze2629();
                                        PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra25825 = PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageDisplayMetricsVortexDragon9516;
                                        if (PolarVoyageCameraPixelBlaze26292.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageDisplayMetricsVortexDragon9516)) {
                                            List list5 = (List) polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageCameraPixelBlaze2629().PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageLintBetaUltra25825);
                                            int size10 = list5.size();
                                            PolarVoyagePagingCosmosDragon7783 polarVoyagePagingCosmosDragon7783 = PolarVoyageTransitionManagerHeroNovaX3322.PolarVoyageDatabaseCosmosSpectraSolar3905;
                                            if (size10 >= polarVoyagePagingCosmosDragon7783.PolarVoyageMotionLayoutTransitionHeroVision4068) {
                                                throw new IllegalStateException("Can't have more than " + polarVoyagePagingCosmosDragon7783.PolarVoyageMotionLayoutTransitionHeroVision4068 + " custom actions for one widget");
                                            }
                                            PolarVoyageOnTouchListenerPrimePixelLegend8920 polarVoyageOnTouchListenerPrimePixelLegend89203 = new PolarVoyageOnTouchListenerPrimePixelLegend8920(0);
                                            PolarVoyageFaceDetectionEliteBlazeInferno3165 PolarVoyageZipVortexCelestial6185 = PolarVoyageBarcodeScannerFusionAurora5642.PolarVoyageZipVortexCelestial6185();
                                            PolarVoyageOnTouchListenerPrimePixelLegend8920 polarVoyageOnTouchListenerPrimePixelLegend89204 = polarVoyageOnTouchListenerPrimePixelLegend8920;
                                            if (polarVoyageOnTouchListenerPrimePixelLegend89204.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                                                PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageDiffUtilTurboStrike5735(polarVoyageOnTouchListenerPrimePixelLegend89204);
                                            }
                                            if (PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageOnTouchListenerPrimePixelLegend89204.PolarVoyageStrictModeLegendEpic1532, polarVoyageOnTouchListenerPrimePixelLegend89204.PolarVoyageBottomSheetOmegaNeo1907, i2) >= 0) {
                                                PolarVoyageFaceDetectionEliteBlazeInferno3165 polarVoyageFaceDetectionEliteBlazeInferno3165 = (PolarVoyageFaceDetectionEliteBlazeInferno3165) polarVoyageOnTouchListenerPrimePixelLegend89204.PolarVoyageMotionLayoutTransitionHeroVision4068(i2);
                                                int[] iArr = polarVoyagePagingCosmosDragon7783.PolarVoyageZipVortexCelestial6185;
                                                int i34 = polarVoyagePagingCosmosDragon7783.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                                int[] iArr2 = new int[16];
                                                int i35 = 0;
                                                int i36 = 0;
                                                while (i35 < i34) {
                                                    int i37 = iArr[i35];
                                                    int i38 = i34;
                                                    int i39 = i36 + 1;
                                                    PolarVoyageFaceDetectionEliteBlazeInferno3165 polarVoyageFaceDetectionEliteBlazeInferno31652 = polarVoyageFaceDetectionEliteBlazeInferno3165;
                                                    if (iArr2.length < i39) {
                                                        iArr2 = Arrays.copyOf(iArr2, Math.max(i39, (iArr2.length * 3) / 2));
                                                    }
                                                    iArr2[i36] = i37;
                                                    i35++;
                                                    i36 = i39;
                                                    i34 = i38;
                                                    polarVoyageFaceDetectionEliteBlazeInferno3165 = polarVoyageFaceDetectionEliteBlazeInferno31652;
                                                }
                                                PolarVoyageFaceDetectionEliteBlazeInferno3165 polarVoyageFaceDetectionEliteBlazeInferno31653 = polarVoyageFaceDetectionEliteBlazeInferno3165;
                                                ArrayList arrayList7 = new ArrayList();
                                                if (list5.size() > 0) {
                                                    PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageMotionLayoutForceEpicAurora7183(list5.get(0));
                                                    polarVoyageFaceDetectionEliteBlazeInferno31653.getClass();
                                                    throw null;
                                                }
                                                if (arrayList7.size() > 0) {
                                                    PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageMotionLayoutForceEpicAurora7183(arrayList7.get(0));
                                                    if (i36 <= 0) {
                                                        PolarVoyageMeteringPointSolarMax4741.PolarVoyageBitmapVisionAuroraPixel4705("Index must be between 0 and size");
                                                        return null;
                                                    }
                                                    int i40 = iArr2[0];
                                                    throw null;
                                                }
                                            } else if (list5.size() > 0) {
                                                PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageMotionLayoutForceEpicAurora7183(list5.get(0));
                                                polarVoyagePagingCosmosDragon7783.PolarVoyageMotionLayoutTransitionHeroVision4068(0);
                                                throw null;
                                            }
                                            polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i2, polarVoyageOnTouchListenerPrimePixelLegend89203);
                                            polarVoyageOnTouchListenerPrimePixelLegend89204.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i2, PolarVoyageZipVortexCelestial6185);
                                        }
                                    }
                                    boolean PolarVoyageTextInputEditTextNebulaHero665122 = PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageJobIntentServiceStormEclipsePixel2539, resources);
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        accessibilityNodeInfo2.setScreenReaderFocusable(PolarVoyageTextInputEditTextNebulaHero665122);
                                    } else {
                                        polarVoyageToastUltraNeo66022.PolarVoyageDiffUtilTurboStrike5735(1, PolarVoyageTextInputEditTextNebulaHero665122);
                                    }
                                    PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i2);
                                    if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 != -1) {
                                        PolarVoyageRoomEntityCelestialCosmosPixel5838 PolarVoyageContentProviderHyperSpark38382 = PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageContentProviderHyperSpark3838(polarVoyageRewardedAdUltraTitanium4787.getAndroidViewsHandler$ui_release(), PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                                        if (PolarVoyageContentProviderHyperSpark38382 != null) {
                                            accessibilityNodeInfo2.setTraversalBefore(PolarVoyageContentProviderHyperSpark38382);
                                            polarVoyageRewardedAdUltraTitanium47872 = polarVoyageRewardedAdUltraTitanium4787;
                                        } else {
                                            polarVoyageRewardedAdUltraTitanium47872 = polarVoyageRewardedAdUltraTitanium4787;
                                            accessibilityNodeInfo2.setTraversalBefore(polarVoyageRewardedAdUltraTitanium47872, PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                                        }
                                        bundle = null;
                                        polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageKotlinBetaPulseBeta3653(i2, polarVoyageToastUltraNeo66022, polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageCardViewAlphaVortexCelestial9747, null);
                                    } else {
                                        bundle = null;
                                        polarVoyageRewardedAdUltraTitanium47872 = polarVoyageRewardedAdUltraTitanium4787;
                                    }
                                    PolarVoyageBarcodeScannerInfernoSolarSpark77672 = polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageViewBindingPulseHeroSpeed5705.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i2);
                                    if (PolarVoyageBarcodeScannerInfernoSolarSpark77672 != -1 && (PolarVoyageContentProviderHyperSpark3838 = PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageContentProviderHyperSpark3838(polarVoyageRewardedAdUltraTitanium47872.getAndroidViewsHandler$ui_release(), PolarVoyageBarcodeScannerInfernoSolarSpark77672)) != null) {
                                        accessibilityNodeInfo2.setTraversalAfter(PolarVoyageContentProviderHyperSpark3838);
                                        polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageKotlinBetaPulseBeta3653(i2, polarVoyageToastUltraNeo66022, polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageFlingGestureEclipsePrimeMax1376, bundle);
                                    }
                                    str = (String) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageCameraPixelBlaze2629(), PolarVoyageJobSchedulerVortexPrime6352.PolarVoyageMotionLayoutTransitionHeroVision4068);
                                    if (str != null) {
                                        polarVoyageToastUltraNeo66022.PolarVoyageTextInputEditTextNebulaHero6651(str);
                                    }
                                    polarVoyageToastUltraNeo66023 = polarVoyageToastUltraNeo66022;
                                    if (polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageNavigationViewHyperHyperHyperion1793) {
                                    }
                                    return polarVoyageToastUltraNeo66023;
                                }
                                z4 = true;
                                if (!z4) {
                                }
                                if (Build.VERSION.SDK_INT >= 26) {
                                }
                                polarVoyageMotionLayoutShadowAuroraInferno1500 = (PolarVoyageMotionLayoutShadowAuroraInferno1500) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageKotlinBetaPulseBeta3653);
                                if (polarVoyageMotionLayoutShadowAuroraInferno1500 != null) {
                                }
                                if (PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539)) {
                                    polarVoyageToastUltraNeo66022.PolarVoyageZipVortexCelestial6185(new PolarVoyageAnimatorSetVisionEpic3385(polarVoyageRewardedAdPulseVision50894.PolarVoyageZipVortexCelestial6185, R.id.accessibilityActionSetProgress));
                                }
                                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415(polarVoyageToastUltraNeo66022, polarVoyageJobIntentServiceStormEclipsePixel2539);
                                PolarVoyageTextInputEditTextNebulaHero66513 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageTextInputEditTextNebulaHero6651);
                                if (PolarVoyageTextInputEditTextNebulaHero66513 == null) {
                                }
                                if (PolarVoyageTextInputEditTextNebulaHero66513 == null) {
                                }
                                polarVoyageActivityFusionHyper3950 = (PolarVoyageActivityFusionHyper3950) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageAnimatorSetSparkUltraMax8233);
                                PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision5089102 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                                if (polarVoyageActivityFusionHyper3950 != null) {
                                    PolarVoyageTextInputEditTextNebulaHero66515 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageDiffUtilTurboStrike5735);
                                    if (PolarVoyageTextInputEditTextNebulaHero66515 == null) {
                                    }
                                    if (PolarVoyageTextInputEditTextNebulaHero66515 == null) {
                                    }
                                    z3 = true;
                                    if (!z3) {
                                    }
                                    if (((Number) polarVoyageActivityFusionHyper3950.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068()).floatValue() > 0.0f) {
                                    }
                                    if (PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539)) {
                                    }
                                }
                                polarVoyageActivityFusionHyper39502 = (PolarVoyageActivityFusionHyper3950) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBitmapMaxTitanTitan7960);
                                if (polarVoyageActivityFusionHyper39502 != null) {
                                    PolarVoyageTextInputEditTextNebulaHero66514 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageDiffUtilTurboStrike5735);
                                    if (PolarVoyageTextInputEditTextNebulaHero66514 == null) {
                                    }
                                    if (PolarVoyageTextInputEditTextNebulaHero66514 == null) {
                                    }
                                    z2 = true;
                                    if (!z2) {
                                    }
                                    if (((Number) polarVoyageActivityFusionHyper39502.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068()).floatValue() > 0.0f) {
                                    }
                                    if (PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539)) {
                                    }
                                }
                                i3 = Build.VERSION.SDK_INT;
                                if (i3 >= 29) {
                                }
                                CharSequence charSequence2 = (CharSequence) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageCameraPixelBlaze2629(), PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                                if (i3 >= 28) {
                                }
                                if (PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539)) {
                                }
                                boolean PolarVoyageTextInputEditTextNebulaHero6651222 = PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageJobIntentServiceStormEclipsePixel2539, resources);
                                if (Build.VERSION.SDK_INT >= 28) {
                                }
                                PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i2);
                                if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 != -1) {
                                }
                                PolarVoyageBarcodeScannerInfernoSolarSpark77672 = polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageViewBindingPulseHeroSpeed5705.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i2);
                                if (PolarVoyageBarcodeScannerInfernoSolarSpark77672 != -1) {
                                    accessibilityNodeInfo2.setTraversalAfter(PolarVoyageContentProviderHyperSpark3838);
                                    polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageKotlinBetaPulseBeta3653(i2, polarVoyageToastUltraNeo66022, polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageFlingGestureEclipsePrimeMax1376, bundle);
                                }
                                str = (String) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageCameraPixelBlaze2629(), PolarVoyageJobSchedulerVortexPrime6352.PolarVoyageMotionLayoutTransitionHeroVision4068);
                                if (str != null) {
                                }
                                polarVoyageToastUltraNeo66023 = polarVoyageToastUltraNeo66022;
                                if (polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageNavigationViewHyperHyperHyperion1793) {
                                }
                                return polarVoyageToastUltraNeo66023;
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 26) {
                        }
                        polarVoyageMotionLayoutShadowAuroraInferno1500 = (PolarVoyageMotionLayoutShadowAuroraInferno1500) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageKotlinBetaPulseBeta3653);
                        if (polarVoyageMotionLayoutShadowAuroraInferno1500 != null) {
                        }
                        if (PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539)) {
                        }
                        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415(polarVoyageToastUltraNeo66022, polarVoyageJobIntentServiceStormEclipsePixel2539);
                        PolarVoyageTextInputEditTextNebulaHero66513 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageTextInputEditTextNebulaHero6651);
                        if (PolarVoyageTextInputEditTextNebulaHero66513 == null) {
                        }
                        if (PolarVoyageTextInputEditTextNebulaHero66513 == null) {
                        }
                        polarVoyageActivityFusionHyper3950 = (PolarVoyageActivityFusionHyper3950) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageAnimatorSetSparkUltraMax8233);
                        PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision50891022 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                        if (polarVoyageActivityFusionHyper3950 != null) {
                        }
                        polarVoyageActivityFusionHyper39502 = (PolarVoyageActivityFusionHyper3950) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBitmapMaxTitanTitan7960);
                        if (polarVoyageActivityFusionHyper39502 != null) {
                        }
                        i3 = Build.VERSION.SDK_INT;
                        if (i3 >= 29) {
                        }
                        CharSequence charSequence22 = (CharSequence) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageCameraPixelBlaze2629(), PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                        if (i3 >= 28) {
                        }
                        if (PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539)) {
                        }
                        boolean PolarVoyageTextInputEditTextNebulaHero66512222 = PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageJobIntentServiceStormEclipsePixel2539, resources);
                        if (Build.VERSION.SDK_INT >= 28) {
                        }
                        PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i2);
                        if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 != -1) {
                        }
                        PolarVoyageBarcodeScannerInfernoSolarSpark77672 = polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageViewBindingPulseHeroSpeed5705.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i2);
                        if (PolarVoyageBarcodeScannerInfernoSolarSpark77672 != -1) {
                        }
                        str = (String) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageCameraPixelBlaze2629(), PolarVoyageJobSchedulerVortexPrime6352.PolarVoyageMotionLayoutTransitionHeroVision4068);
                        if (str != null) {
                        }
                        polarVoyageToastUltraNeo66023 = polarVoyageToastUltraNeo66022;
                        if (polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageNavigationViewHyperHyperHyperion1793) {
                        }
                        return polarVoyageToastUltraNeo66023;
                    }
                    accessibilityNodeInfo2.addAction(2);
                    polarVoyageTransitionManagerHeroNovaX33222 = polarVoyageTransitionManagerHeroNovaX3322;
                    polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageSnackbarGammaEclipse2140 = i2;
                }
                z = true;
                accessibilityNodeInfo2.setVisibleToUser(PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageConfigurationMaxSpectraForce5418(polarVoyageJobIntentServiceStormEclipsePixel2539) ^ z);
                PolarVoyageTextInputEditTextNebulaHero66512 = polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                if (PolarVoyageTextInputEditTextNebulaHero66512 == null) {
                }
                PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageMotionLayoutForceEpicAurora7183(PolarVoyageTextInputEditTextNebulaHero66512);
                accessibilityNodeInfo2.setClickable(false);
                polarVoyageRewardedAdPulseVision5089 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageMotionLayoutTransitionHeroVision4068);
                if (polarVoyageRewardedAdPulseVision5089 != null) {
                }
                accessibilityNodeInfo2.setLongClickable(false);
                polarVoyageRewardedAdPulseVision50892 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageKotlinBetaPulseBeta3653);
                if (polarVoyageRewardedAdPulseVision50892 != null) {
                }
                polarVoyageRewardedAdPulseVision50893 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageDrawableDeltaHyperion5742);
                if (polarVoyageRewardedAdPulseVision50893 != null) {
                }
                if (PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539)) {
                }
                PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageTransitionManagerHeroNovaX3322.PolarVoyageDrawableDeltaHyperion5742(polarVoyageJobIntentServiceStormEclipsePixel2539);
                if (!(PolarVoyageDrawableDeltaHyperion5742 != null || PolarVoyageDrawableDeltaHyperion5742.length() == 0)) {
                }
                if (Build.VERSION.SDK_INT >= 26) {
                }
                polarVoyageMotionLayoutShadowAuroraInferno1500 = (PolarVoyageMotionLayoutShadowAuroraInferno1500) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageKotlinBetaPulseBeta3653);
                if (polarVoyageMotionLayoutShadowAuroraInferno1500 != null) {
                }
                if (PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539)) {
                }
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415(polarVoyageToastUltraNeo66022, polarVoyageJobIntentServiceStormEclipsePixel2539);
                PolarVoyageTextInputEditTextNebulaHero66513 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageTextInputEditTextNebulaHero6651);
                if (PolarVoyageTextInputEditTextNebulaHero66513 == null) {
                }
                if (PolarVoyageTextInputEditTextNebulaHero66513 == null) {
                }
                polarVoyageActivityFusionHyper3950 = (PolarVoyageActivityFusionHyper3950) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageAnimatorSetSparkUltraMax8233);
                PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision508910222 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                if (polarVoyageActivityFusionHyper3950 != null) {
                }
                polarVoyageActivityFusionHyper39502 = (PolarVoyageActivityFusionHyper3950) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBitmapMaxTitanTitan7960);
                if (polarVoyageActivityFusionHyper39502 != null) {
                }
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                }
                CharSequence charSequence222 = (CharSequence) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageCameraPixelBlaze2629(), PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                if (i3 >= 28) {
                }
                if (PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539)) {
                }
                boolean PolarVoyageTextInputEditTextNebulaHero665122222 = PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageJobIntentServiceStormEclipsePixel2539, resources);
                if (Build.VERSION.SDK_INT >= 28) {
                }
                PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i2);
                if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 != -1) {
                }
                PolarVoyageBarcodeScannerInfernoSolarSpark77672 = polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageViewBindingPulseHeroSpeed5705.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i2);
                if (PolarVoyageBarcodeScannerInfernoSolarSpark77672 != -1) {
                }
                str = (String) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageCameraPixelBlaze2629(), PolarVoyageJobSchedulerVortexPrime6352.PolarVoyageMotionLayoutTransitionHeroVision4068);
                if (str != null) {
                }
                polarVoyageToastUltraNeo66023 = polarVoyageToastUltraNeo66022;
                if (polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageNavigationViewHyperHyperHyperion1793) {
                }
                return polarVoyageToastUltraNeo66023;
            }
            accessibilityNodeInfo2.setHeading(true);
        }
        polarVoyageToastUltraNeo66022 = polarVoyageToastUltraNeo6602;
        i2 = i;
        if (i2 != -1) {
        }
        accessibilityNodeInfo3.setPassword(polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageCardViewAlphaVortexCelestial9747));
        accessibilityNodeInfo3.setEditable(polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149));
        PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageToolbarEclipseInfernoHero6368);
        if (PolarVoyageTextInputEditTextNebulaHero6651 == null) {
        }
        Integer num2 = (Integer) PolarVoyageTextInputEditTextNebulaHero6651;
        accessibilityNodeInfo3.setMaxTextLength(num2 == null ? num2.intValue() : -1);
        accessibilityNodeInfo3.setEnabled(PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539));
        PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra258232 = PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBottomSheetOmegaNeo1907;
        accessibilityNodeInfo3.setFocusable(polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageLintBetaUltra258232));
        if (accessibilityNodeInfo3.isFocusable()) {
        }
        z = true;
        accessibilityNodeInfo2.setVisibleToUser(PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageConfigurationMaxSpectraForce5418(polarVoyageJobIntentServiceStormEclipsePixel2539) ^ z);
        PolarVoyageTextInputEditTextNebulaHero66512 = polarVoyageKeyframeThunderMegaVortex84924.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageRotateAnimationCyberCelestialDelta4768);
        if (PolarVoyageTextInputEditTextNebulaHero66512 == null) {
        }
        PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageMotionLayoutForceEpicAurora7183(PolarVoyageTextInputEditTextNebulaHero66512);
        accessibilityNodeInfo2.setClickable(false);
        polarVoyageRewardedAdPulseVision5089 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageMotionLayoutTransitionHeroVision4068);
        if (polarVoyageRewardedAdPulseVision5089 != null) {
        }
        accessibilityNodeInfo2.setLongClickable(false);
        polarVoyageRewardedAdPulseVision50892 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageKotlinBetaPulseBeta3653);
        if (polarVoyageRewardedAdPulseVision50892 != null) {
        }
        polarVoyageRewardedAdPulseVision50893 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageDrawableDeltaHyperion5742);
        if (polarVoyageRewardedAdPulseVision50893 != null) {
        }
        if (PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539)) {
        }
        PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageTransitionManagerHeroNovaX3322.PolarVoyageDrawableDeltaHyperion5742(polarVoyageJobIntentServiceStormEclipsePixel2539);
        if (!(PolarVoyageDrawableDeltaHyperion5742 != null || PolarVoyageDrawableDeltaHyperion5742.length() == 0)) {
        }
        if (Build.VERSION.SDK_INT >= 26) {
        }
        polarVoyageMotionLayoutShadowAuroraInferno1500 = (PolarVoyageMotionLayoutShadowAuroraInferno1500) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageKotlinBetaPulseBeta3653);
        if (polarVoyageMotionLayoutShadowAuroraInferno1500 != null) {
        }
        if (PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539)) {
        }
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415(polarVoyageToastUltraNeo66022, polarVoyageJobIntentServiceStormEclipsePixel2539);
        PolarVoyageTextInputEditTextNebulaHero66513 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBottomSheetOmegaNeo1907().PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageTextInputEditTextNebulaHero6651);
        if (PolarVoyageTextInputEditTextNebulaHero66513 == null) {
        }
        if (PolarVoyageTextInputEditTextNebulaHero66513 == null) {
        }
        polarVoyageActivityFusionHyper3950 = (PolarVoyageActivityFusionHyper3950) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageAnimatorSetSparkUltraMax8233);
        PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision5089102222 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
        if (polarVoyageActivityFusionHyper3950 != null) {
        }
        polarVoyageActivityFusionHyper39502 = (PolarVoyageActivityFusionHyper3950) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseTitaniumEpic63064, PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBitmapMaxTitanTitan7960);
        if (polarVoyageActivityFusionHyper39502 != null) {
        }
        i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
        }
        CharSequence charSequence2222 = (CharSequence) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageCameraPixelBlaze2629(), PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
        if (i3 >= 28) {
        }
        if (PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539)) {
        }
        boolean PolarVoyageTextInputEditTextNebulaHero6651222222 = PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageJobIntentServiceStormEclipsePixel2539, resources);
        if (Build.VERSION.SDK_INT >= 28) {
        }
        PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i2);
        if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 != -1) {
        }
        PolarVoyageBarcodeScannerInfernoSolarSpark77672 = polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageViewBindingPulseHeroSpeed5705.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i2);
        if (PolarVoyageBarcodeScannerInfernoSolarSpark77672 != -1) {
        }
        str = (String) PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageCameraPixelBlaze2629(), PolarVoyageJobSchedulerVortexPrime6352.PolarVoyageMotionLayoutTransitionHeroVision4068);
        if (str != null) {
        }
        polarVoyageToastUltraNeo66023 = polarVoyageToastUltraNeo66022;
        if (polarVoyageTransitionManagerHeroNovaX33222.PolarVoyageNavigationViewHyperHyperHyperion1793) {
        }
        return polarVoyageToastUltraNeo66023;
    }

    @Override // p000createpolar.PolarVoyageRealtimeDatabaseEclipseUltra8894
    public final PolarVoyageToastUltraNeo6602 PolarVoyageItemDecorationUltraDeltaEpic7485(int i) {
        PolarVoyageTransitionManagerHeroNovaX3322 polarVoyageTransitionManagerHeroNovaX3322 = this.PolarVoyageSnackbarGammaEclipse2140;
        if (i != 1) {
            if (i == 2) {
                return PolarVoyageDiffUtilTurboStrike5735(polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageDrawableDeltaHyperion5742);
            }
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("Unknown focus type: ", i));
            return null;
        }
        int i2 = polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageSnackbarGammaEclipse2140;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return PolarVoyageDiffUtilTurboStrike5735(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x01a7, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x06ce, code lost:
    
        if (r0 != 16) goto L518;
     */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:598:? A[RETURN, SYNTHETIC] */
    @Override // p000createpolar.PolarVoyageRealtimeDatabaseEclipseUltra8894
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean PolarVoyageSnackbarGammaEclipse2140(int i, int i2, Bundle bundle) {
        PolarVoyageJobIntentServiceStormEclipsePixel2539 polarVoyageJobIntentServiceStormEclipsePixel2539;
        int i3;
        Integer num;
        PolarVoyageEventTurboPixel7111 polarVoyageEventTurboPixel7111;
        int i4;
        int i5;
        PolarVoyageMenuNovaBetaVortex4446 PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon8768;
        PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon87682;
        PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon87683;
        PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon87684;
        Float f;
        boolean z;
        PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision5089;
        PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon87685;
        float intBitsToFloat;
        PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision50892;
        PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon87686;
        PolarVoyageStateFlowNebulaMax1492 polarVoyageStateFlowNebulaMax1492;
        PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon87687;
        PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon87688;
        PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon87689;
        PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon876810;
        PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon876811;
        PolarVoyageStateFlowNebulaMax1492 polarVoyageStateFlowNebulaMax14922;
        PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision50893;
        long j;
        Object PolarVoyageTextInputEditTextNebulaHero6651;
        float f2;
        float f3;
        PolarVoyageStateFlowNebulaMax1492 polarVoyageStateFlowNebulaMax14923;
        PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon876812;
        PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon876813;
        PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon876814;
        PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon876815;
        PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon876816;
        PolarVoyageTransitionManagerHeroNovaX3322 polarVoyageTransitionManagerHeroNovaX3322 = this.PolarVoyageSnackbarGammaEclipse2140;
        AccessibilityManager accessibilityManager = polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageTextInputEditTextNebulaHero6651;
        Float valueOf = Float.valueOf(0.0f);
        PolarVoyageRewardedAdUltraTitanium4787 polarVoyageRewardedAdUltraTitanium4787 = polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        PolarVoyageItemDecorationPrimePrime4359 polarVoyageItemDecorationPrimePrime4359 = (PolarVoyageItemDecorationPrimePrime4359) polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageCameraPixelBlaze2629().PolarVoyageMotionLayoutTransitionHeroVision4068(i);
        if (polarVoyageItemDecorationPrimePrime4359 == null || (polarVoyageJobIntentServiceStormEclipsePixel2539 = polarVoyageItemDecorationPrimePrime4359.PolarVoyageZipVortexCelestial6185) == null) {
            return false;
        }
        PolarVoyageConfigurationMegaTitaniumQuantum2348 polarVoyageConfigurationMegaTitaniumQuantum2348 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageKotlinBetaPulseBeta3653;
        int i6 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageTextInputEditTextNebulaHero6651;
        PolarVoyageInAppPurchaseTitaniumEpic6306 polarVoyageInAppPurchaseTitaniumEpic6306 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        PolarVoyageKeyframeThunderMegaVortex8492 polarVoyageKeyframeThunderMegaVortex8492 = polarVoyageInAppPurchaseTitaniumEpic6306.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object PolarVoyageTextInputEditTextNebulaHero66512 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageCameraPixelBlaze2629);
        if (PolarVoyageTextInputEditTextNebulaHero66512 == null) {
            PolarVoyageTextInputEditTextNebulaHero66512 = null;
        }
        Boolean bool = Boolean.TRUE;
        if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageTextInputEditTextNebulaHero66512, bool)) {
            if (!(Build.VERSION.SDK_INT >= 34 ? PolarVoyageToolbarBlazeTitanium3444.PolarVoyageBitmapVisionAuroraPixel4705(accessibilityManager) : true)) {
                return false;
            }
        }
        if (i2 == 64) {
            if (!(accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled())) {
                return false;
            }
            int i7 = polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageDrawableDeltaHyperion5742;
            if (i7 == i) {
                return false;
            }
            if (i7 != Integer.MIN_VALUE) {
                i3 = 12;
                num = null;
                PolarVoyageTransitionManagerHeroNovaX3322.PolarVoyageAlertDialogCyberHeroQuantum3938(polarVoyageTransitionManagerHeroNovaX3322, i7, 65536, null, 12);
            } else {
                i3 = 12;
                num = null;
            }
            polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageDrawableDeltaHyperion5742 = i;
            polarVoyageRewardedAdUltraTitanium4787.invalidate();
            PolarVoyageTransitionManagerHeroNovaX3322.PolarVoyageAlertDialogCyberHeroQuantum3938(polarVoyageTransitionManagerHeroNovaX3322, i, 32768, num, i3);
            return true;
        }
        if (i2 == 128) {
            if (!(polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageDrawableDeltaHyperion5742 == i)) {
                return false;
            }
            polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageDrawableDeltaHyperion5742 = Integer.MIN_VALUE;
            polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageContentProviderHyperSpark3838 = null;
            polarVoyageRewardedAdUltraTitanium4787.invalidate();
            PolarVoyageTransitionManagerHeroNovaX3322.PolarVoyageAlertDialogCyberHeroQuantum3938(polarVoyageTransitionManagerHeroNovaX3322, i, 65536, null, 12);
            return true;
        }
        if (i2 != 256 && i2 != 512) {
            if (i2 == 16384) {
                Object PolarVoyageTextInputEditTextNebulaHero66513 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageDrawableDeltaHyperion5742);
                PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision50894 = (PolarVoyageRewardedAdPulseVision5089) (PolarVoyageTextInputEditTextNebulaHero66513 == null ? null : PolarVoyageTextInputEditTextNebulaHero66513);
                if (polarVoyageRewardedAdPulseVision50894 == null || (polarVoyageFragmentPulseEliteDragon8768 = (PolarVoyageFragmentPulseEliteDragon8768) polarVoyageRewardedAdPulseVision50894.PolarVoyageMotionLayoutTransitionHeroVision4068) == null) {
                    return false;
                }
                return ((Boolean) polarVoyageFragmentPulseEliteDragon8768.PolarVoyageMotionLayoutTransitionHeroVision4068()).booleanValue();
            }
            if (i2 == 131072) {
                boolean PolarVoyageDiffUtilDragonSpeedEclipse6225 = polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageDiffUtilDragonSpeedEclipse6225(polarVoyageJobIntentServiceStormEclipsePixel2539, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
                if (PolarVoyageDiffUtilDragonSpeedEclipse6225) {
                    PolarVoyageTransitionManagerHeroNovaX3322.PolarVoyageAlertDialogCyberHeroQuantum3938(polarVoyageTransitionManagerHeroNovaX3322, polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageBitmapMaxTitanTitan7960(i6), 0, null, 12);
                }
                return PolarVoyageDiffUtilDragonSpeedEclipse6225;
            }
            if (!PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735(polarVoyageJobIntentServiceStormEclipsePixel2539)) {
                return false;
            }
            if (i2 == 1) {
                if (polarVoyageRewardedAdUltraTitanium4787.isInTouchMode()) {
                    polarVoyageRewardedAdUltraTitanium4787.requestFocusFromTouch();
                }
                Object PolarVoyageTextInputEditTextNebulaHero66514 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageBitmapMaxTitanTitan7960);
                PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision50895 = (PolarVoyageRewardedAdPulseVision5089) (PolarVoyageTextInputEditTextNebulaHero66514 == null ? null : PolarVoyageTextInputEditTextNebulaHero66514);
                if (polarVoyageRewardedAdPulseVision50895 == null || (polarVoyageFragmentPulseEliteDragon87682 = (PolarVoyageFragmentPulseEliteDragon8768) polarVoyageRewardedAdPulseVision50895.PolarVoyageMotionLayoutTransitionHeroVision4068) == null) {
                    return false;
                }
                return ((Boolean) polarVoyageFragmentPulseEliteDragon87682.PolarVoyageMotionLayoutTransitionHeroVision4068()).booleanValue();
            }
            if (i2 == 2) {
                Object PolarVoyageTextInputEditTextNebulaHero66515 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBottomSheetOmegaNeo1907);
                if (PolarVoyageTextInputEditTextNebulaHero66515 == null) {
                    PolarVoyageTextInputEditTextNebulaHero66515 = null;
                }
                if (!PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageTextInputEditTextNebulaHero66515, bool)) {
                    return false;
                }
                ((PolarVoyageGradleSolarSpectra2186) polarVoyageRewardedAdUltraTitanium4787.getFocusOwner()).PolarVoyageMotionLayoutTransitionHeroVision4068(8, false, true);
                return true;
            }
            PolarVoyageOnLongClickListenerRogueDeltaNova6437 polarVoyageOnLongClickListenerRogueDeltaNova6437 = PolarVoyageOnLongClickListenerRogueDeltaNova6437.PolarVoyageStrictModeLegendEpic1532;
            switch (i2) {
                case 16:
                    Object PolarVoyageTextInputEditTextNebulaHero66516 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageMotionLayoutTransitionHeroVision4068);
                    if (PolarVoyageTextInputEditTextNebulaHero66516 == null) {
                        PolarVoyageTextInputEditTextNebulaHero66516 = null;
                    }
                    PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision50896 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageTextInputEditTextNebulaHero66516;
                    Boolean bool2 = (polarVoyageRewardedAdPulseVision50896 == null || (polarVoyageFragmentPulseEliteDragon87683 = (PolarVoyageFragmentPulseEliteDragon8768) polarVoyageRewardedAdPulseVision50896.PolarVoyageMotionLayoutTransitionHeroVision4068) == null) ? null : (Boolean) polarVoyageFragmentPulseEliteDragon87683.PolarVoyageMotionLayoutTransitionHeroVision4068();
                    PolarVoyageTransitionManagerHeroNovaX3322.PolarVoyageAlertDialogCyberHeroQuantum3938(polarVoyageTransitionManagerHeroNovaX3322, i, 1, null, 12);
                    if (bool2 != null) {
                        return bool2.booleanValue();
                    }
                    return false;
                case 32:
                    Object PolarVoyageTextInputEditTextNebulaHero66517 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageKotlinBetaPulseBeta3653);
                    PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision50897 = (PolarVoyageRewardedAdPulseVision5089) (PolarVoyageTextInputEditTextNebulaHero66517 == null ? null : PolarVoyageTextInputEditTextNebulaHero66517);
                    if (polarVoyageRewardedAdPulseVision50897 == null || (polarVoyageFragmentPulseEliteDragon87684 = (PolarVoyageFragmentPulseEliteDragon8768) polarVoyageRewardedAdPulseVision50897.PolarVoyageMotionLayoutTransitionHeroVision4068) == null) {
                        return false;
                    }
                    return ((Boolean) polarVoyageFragmentPulseEliteDragon87684.PolarVoyageMotionLayoutTransitionHeroVision4068()).booleanValue();
                case 4096:
                case 8192:
                    break;
                case 32768:
                    Object PolarVoyageTextInputEditTextNebulaHero66518 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageContentProviderHyperSpark3838);
                    PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision50898 = (PolarVoyageRewardedAdPulseVision5089) (PolarVoyageTextInputEditTextNebulaHero66518 == null ? null : PolarVoyageTextInputEditTextNebulaHero66518);
                    if (polarVoyageRewardedAdPulseVision50898 == null || (polarVoyageFragmentPulseEliteDragon87687 = (PolarVoyageFragmentPulseEliteDragon8768) polarVoyageRewardedAdPulseVision50898.PolarVoyageMotionLayoutTransitionHeroVision4068) == null) {
                        return false;
                    }
                    return ((Boolean) polarVoyageFragmentPulseEliteDragon87687.PolarVoyageMotionLayoutTransitionHeroVision4068()).booleanValue();
                case 65536:
                    Object PolarVoyageTextInputEditTextNebulaHero66519 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageSnackbarGammaEclipse2140);
                    PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision50899 = (PolarVoyageRewardedAdPulseVision5089) (PolarVoyageTextInputEditTextNebulaHero66519 == null ? null : PolarVoyageTextInputEditTextNebulaHero66519);
                    if (polarVoyageRewardedAdPulseVision50899 == null || (polarVoyageFragmentPulseEliteDragon87688 = (PolarVoyageFragmentPulseEliteDragon8768) polarVoyageRewardedAdPulseVision50899.PolarVoyageMotionLayoutTransitionHeroVision4068) == null) {
                        return false;
                    }
                    return ((Boolean) polarVoyageFragmentPulseEliteDragon87688.PolarVoyageMotionLayoutTransitionHeroVision4068()).booleanValue();
                case 262144:
                    Object PolarVoyageTextInputEditTextNebulaHero665110 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageRemoteModelManagerOlympianCelestial9141);
                    PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision508910 = (PolarVoyageRewardedAdPulseVision5089) (PolarVoyageTextInputEditTextNebulaHero665110 == null ? null : PolarVoyageTextInputEditTextNebulaHero665110);
                    if (polarVoyageRewardedAdPulseVision508910 == null || (polarVoyageFragmentPulseEliteDragon87689 = (PolarVoyageFragmentPulseEliteDragon8768) polarVoyageRewardedAdPulseVision508910.PolarVoyageMotionLayoutTransitionHeroVision4068) == null) {
                        return false;
                    }
                    return ((Boolean) polarVoyageFragmentPulseEliteDragon87689.PolarVoyageMotionLayoutTransitionHeroVision4068()).booleanValue();
                case 524288:
                    Object PolarVoyageTextInputEditTextNebulaHero665111 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageNavigationViewHyperHyperHyperion1793);
                    PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision508911 = (PolarVoyageRewardedAdPulseVision5089) (PolarVoyageTextInputEditTextNebulaHero665111 == null ? null : PolarVoyageTextInputEditTextNebulaHero665111);
                    if (polarVoyageRewardedAdPulseVision508911 == null || (polarVoyageFragmentPulseEliteDragon876810 = (PolarVoyageFragmentPulseEliteDragon8768) polarVoyageRewardedAdPulseVision508911.PolarVoyageMotionLayoutTransitionHeroVision4068) == null) {
                        return false;
                    }
                    return ((Boolean) polarVoyageFragmentPulseEliteDragon876810.PolarVoyageMotionLayoutTransitionHeroVision4068()).booleanValue();
                case 1048576:
                    Object PolarVoyageTextInputEditTextNebulaHero665112 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageAnimatorSetSparkUltraMax8233);
                    PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision508912 = (PolarVoyageRewardedAdPulseVision5089) (PolarVoyageTextInputEditTextNebulaHero665112 == null ? null : PolarVoyageTextInputEditTextNebulaHero665112);
                    if (polarVoyageRewardedAdPulseVision508912 == null || (polarVoyageFragmentPulseEliteDragon876811 = (PolarVoyageFragmentPulseEliteDragon8768) polarVoyageRewardedAdPulseVision508912.PolarVoyageMotionLayoutTransitionHeroVision4068) == null) {
                        return false;
                    }
                    return ((Boolean) polarVoyageFragmentPulseEliteDragon876811.PolarVoyageMotionLayoutTransitionHeroVision4068()).booleanValue();
                case 2097152:
                    String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                    Object PolarVoyageTextInputEditTextNebulaHero665113 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageStrictModeLegendEpic1532);
                    PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision508913 = (PolarVoyageRewardedAdPulseVision5089) (PolarVoyageTextInputEditTextNebulaHero665113 == null ? null : PolarVoyageTextInputEditTextNebulaHero665113);
                    if (polarVoyageRewardedAdPulseVision508913 == null || (polarVoyageStateFlowNebulaMax14922 = (PolarVoyageStateFlowNebulaMax1492) polarVoyageRewardedAdPulseVision508913.PolarVoyageMotionLayoutTransitionHeroVision4068) == null) {
                        return false;
                    }
                    if (string == null) {
                        string = "";
                    }
                    return ((Boolean) polarVoyageStateFlowNebulaMax14922.PolarVoyageZipVortexCelestial6185(new PolarVoyageDelayAuroraSparkTurbo6655(string))).booleanValue();
                case R.id.accessibilityActionShowOnScreen:
                    PolarVoyageJobIntentServiceStormEclipsePixel2539 PolarVoyageViewRogueMaster4778 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageViewRogueMaster4778();
                    if (PolarVoyageViewRogueMaster4778 != null) {
                        Object PolarVoyageTextInputEditTextNebulaHero665114 = PolarVoyageViewRogueMaster4778.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                        if (PolarVoyageTextInputEditTextNebulaHero665114 == null) {
                            PolarVoyageTextInputEditTextNebulaHero665114 = null;
                        }
                        polarVoyageRewardedAdPulseVision50893 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageTextInputEditTextNebulaHero665114;
                        while (PolarVoyageViewRogueMaster4778 != null && polarVoyageRewardedAdPulseVision50893 == null) {
                            PolarVoyageViewRogueMaster4778 = PolarVoyageViewRogueMaster4778.PolarVoyageViewRogueMaster4778();
                            if (PolarVoyageViewRogueMaster4778 != null) {
                                Object PolarVoyageTextInputEditTextNebulaHero665115 = PolarVoyageViewRogueMaster4778.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                                if (PolarVoyageTextInputEditTextNebulaHero665115 == null) {
                                    PolarVoyageTextInputEditTextNebulaHero665115 = null;
                                }
                                polarVoyageRewardedAdPulseVision50893 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageTextInputEditTextNebulaHero665115;
                            }
                        }
                        if (PolarVoyageViewRogueMaster4778 == null) {
                            PolarVoyageCardViewPulseSpark7250 PolarVoyageTextInputEditTextNebulaHero665116 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageTextInputEditTextNebulaHero6651();
                            return polarVoyageRewardedAdUltraTitanium4787.requestRectangleOnScreen(new Rect((int) Math.floor(PolarVoyageTextInputEditTextNebulaHero665116.PolarVoyageZipVortexCelestial6185), (int) Math.floor(PolarVoyageTextInputEditTextNebulaHero665116.PolarVoyageMotionLayoutTransitionHeroVision4068), PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageKeyframeEpicNovaXCyber9821((float) Math.ceil(PolarVoyageTextInputEditTextNebulaHero665116.PolarVoyageKotlinBetaPulseBeta3653)), PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageKeyframeEpicNovaXCyber9821((float) Math.ceil(PolarVoyageTextInputEditTextNebulaHero665116.PolarVoyageBarcodeScannerInfernoSolarSpark7767))));
                        }
                        PolarVoyageKeyframeThunderMegaVortex8492 polarVoyageKeyframeThunderMegaVortex84922 = PolarVoyageViewRogueMaster4778.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageItemDecorationUltraDeltaEpic7485;
                        PolarVoyageConfigurationMegaTitaniumQuantum2348 polarVoyageConfigurationMegaTitaniumQuantum23482 = PolarVoyageViewRogueMaster4778.PolarVoyageKotlinBetaPulseBeta3653;
                        PolarVoyageCardViewPulseSpark7250 PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageRotateAnimationCyberCelestialDelta4768((PolarVoyageGradientDrawableTurboForce1324) polarVoyageConfigurationMegaTitaniumQuantum23482.PolarVoyageAlarmManagerShadowHyperBeta8339.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                        PolarVoyageBitmapGammaRogue1691 PolarVoyageViewRogueMaster47782 = ((PolarVoyageGradientDrawableTurboForce1324) polarVoyageConfigurationMegaTitaniumQuantum23482.PolarVoyageAlarmManagerShadowHyperBeta8339.PolarVoyageBarcodeScannerInfernoSolarSpark7767).PolarVoyageViewRogueMaster4778();
                        PolarVoyageCardViewPulseSpark7250 PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageViewRogueMaster47782 != null ? ((PolarVoyageCardViewNebulaTitanGamma6305) PolarVoyageViewRogueMaster47782).PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(0L) : 0L);
                        PolarVoyageCardViewNebulaTitanGamma6305 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                        if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 != null) {
                            if (!PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageClipDrawableLegendTitanium3361().PolarVoyageDisplayMetricsVortexDragon9516) {
                                PolarVoyageBarcodeScannerInfernoSolarSpark7767 = null;
                            }
                            if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 != null) {
                                j = PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(0L);
                                PolarVoyageCardViewNebulaTitanGamma6305 PolarVoyageBarcodeScannerInfernoSolarSpark77672 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                                PolarVoyageCardViewPulseSpark7250 PolarVoyageZipVortexCelestial6185 = PolarVoyagePackageManagerNeoNeoTurbo8097.PolarVoyageZipVortexCelestial6185(j, PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageClipboardManagerAuroraPixel8666(PolarVoyageBarcodeScannerInfernoSolarSpark77672 != null ? PolarVoyageBarcodeScannerInfernoSolarSpark77672.PolarVoyageRotateAnimationCyberCelestialDelta4768 : 0L));
                                PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageKeyframeThunderMegaVortex84922.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageAnimatorSetSparkUltraMax8233);
                                if (PolarVoyageTextInputEditTextNebulaHero6651 == null) {
                                    PolarVoyageTextInputEditTextNebulaHero6651 = null;
                                }
                                Object PolarVoyageTextInputEditTextNebulaHero665117 = polarVoyageKeyframeThunderMegaVortex84922.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBitmapMaxTitanTitan7960);
                                f2 = PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185 - PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageZipVortexCelestial6185;
                                f3 = PolarVoyageZipVortexCelestial6185.PolarVoyageKotlinBetaPulseBeta3653 - PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageKotlinBetaPulseBeta3653;
                                if (Math.signum(f2) == Math.signum(f3)) {
                                    f2 = 0.0f;
                                } else if (Math.abs(f2) >= Math.abs(f3)) {
                                    f2 = f3;
                                }
                                if (polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageFCMCelestialCosmosPixel3711 != polarVoyageOnLongClickListenerRogueDeltaNova6437) {
                                    f2 = -f2;
                                }
                                float f4 = PolarVoyageZipVortexCelestial6185.PolarVoyageMotionLayoutTransitionHeroVision4068 - PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                float f5 = PolarVoyageZipVortexCelestial6185.PolarVoyageBarcodeScannerInfernoSolarSpark7767 - PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                                float f6 = Math.signum(f4) != Math.signum(f5) ? Math.abs(f4) < Math.abs(f5) ? f4 : f5 : 0.0f;
                                return polarVoyageRewardedAdPulseVision50893 == null ? false : false;
                            }
                        }
                        j = 0;
                        PolarVoyageCardViewNebulaTitanGamma6305 PolarVoyageBarcodeScannerInfernoSolarSpark776722 = polarVoyageJobIntentServiceStormEclipsePixel2539.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                        PolarVoyageCardViewPulseSpark7250 PolarVoyageZipVortexCelestial61852 = PolarVoyagePackageManagerNeoNeoTurbo8097.PolarVoyageZipVortexCelestial6185(j, PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageClipboardManagerAuroraPixel8666(PolarVoyageBarcodeScannerInfernoSolarSpark776722 != null ? PolarVoyageBarcodeScannerInfernoSolarSpark776722.PolarVoyageRotateAnimationCyberCelestialDelta4768 : 0L));
                        PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageKeyframeThunderMegaVortex84922.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageAnimatorSetSparkUltraMax8233);
                        if (PolarVoyageTextInputEditTextNebulaHero6651 == null) {
                        }
                        Object PolarVoyageTextInputEditTextNebulaHero6651172 = polarVoyageKeyframeThunderMegaVortex84922.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBitmapMaxTitanTitan7960);
                        f2 = PolarVoyageZipVortexCelestial61852.PolarVoyageZipVortexCelestial6185 - PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageZipVortexCelestial6185;
                        f3 = PolarVoyageZipVortexCelestial61852.PolarVoyageKotlinBetaPulseBeta3653 - PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageKotlinBetaPulseBeta3653;
                        if (Math.signum(f2) == Math.signum(f3)) {
                        }
                        if (polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageFCMCelestialCosmosPixel3711 != polarVoyageOnLongClickListenerRogueDeltaNova6437) {
                        }
                        float f42 = PolarVoyageZipVortexCelestial61852.PolarVoyageMotionLayoutTransitionHeroVision4068 - PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        float f52 = PolarVoyageZipVortexCelestial61852.PolarVoyageBarcodeScannerInfernoSolarSpark7767 - PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                        if (Math.signum(f42) != Math.signum(f52)) {
                        }
                        return polarVoyageRewardedAdPulseVision50893 == null ? false : false;
                    }
                    polarVoyageRewardedAdPulseVision50893 = null;
                    break;
                case R.id.accessibilityActionSetProgress:
                    if (bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                        return false;
                    }
                    Object PolarVoyageTextInputEditTextNebulaHero665118 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageTextInputEditTextNebulaHero6651);
                    PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision508914 = (PolarVoyageRewardedAdPulseVision5089) (PolarVoyageTextInputEditTextNebulaHero665118 == null ? null : PolarVoyageTextInputEditTextNebulaHero665118);
                    if (polarVoyageRewardedAdPulseVision508914 == null || (polarVoyageStateFlowNebulaMax14923 = (PolarVoyageStateFlowNebulaMax1492) polarVoyageRewardedAdPulseVision508914.PolarVoyageMotionLayoutTransitionHeroVision4068) == null) {
                        return false;
                    }
                    return ((Boolean) polarVoyageStateFlowNebulaMax14923.PolarVoyageZipVortexCelestial6185(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                case R.id.accessibilityActionImeEnter:
                    Object PolarVoyageTextInputEditTextNebulaHero665119 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageCameraPixelBlaze2629);
                    PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision508915 = (PolarVoyageRewardedAdPulseVision5089) (PolarVoyageTextInputEditTextNebulaHero665119 == null ? null : PolarVoyageTextInputEditTextNebulaHero665119);
                    if (polarVoyageRewardedAdPulseVision508915 == null || (polarVoyageFragmentPulseEliteDragon876812 = (PolarVoyageFragmentPulseEliteDragon8768) polarVoyageRewardedAdPulseVision508915.PolarVoyageMotionLayoutTransitionHeroVision4068) == null) {
                        return false;
                    }
                    return ((Boolean) polarVoyageFragmentPulseEliteDragon876812.PolarVoyageMotionLayoutTransitionHeroVision4068()).booleanValue();
                default:
                    switch (i2) {
                        case R.id.accessibilityActionScrollUp:
                        case R.id.accessibilityActionScrollLeft:
                        case R.id.accessibilityActionScrollDown:
                        case R.id.accessibilityActionScrollRight:
                            break;
                        default:
                            switch (i2) {
                                case R.id.accessibilityActionPageUp:
                                    Object PolarVoyageTextInputEditTextNebulaHero665120 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageLayerDrawableShadowTitaniumOmega1942);
                                    PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision508916 = (PolarVoyageRewardedAdPulseVision5089) (PolarVoyageTextInputEditTextNebulaHero665120 == null ? null : PolarVoyageTextInputEditTextNebulaHero665120);
                                    if (polarVoyageRewardedAdPulseVision508916 == null || (polarVoyageFragmentPulseEliteDragon876813 = (PolarVoyageFragmentPulseEliteDragon8768) polarVoyageRewardedAdPulseVision508916.PolarVoyageMotionLayoutTransitionHeroVision4068) == null) {
                                        return false;
                                    }
                                    return ((Boolean) polarVoyageFragmentPulseEliteDragon876813.PolarVoyageMotionLayoutTransitionHeroVision4068()).booleanValue();
                                case R.id.accessibilityActionPageDown:
                                    Object PolarVoyageTextInputEditTextNebulaHero665121 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageAlertDialogCyberHeroQuantum3938);
                                    PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision508917 = (PolarVoyageRewardedAdPulseVision5089) (PolarVoyageTextInputEditTextNebulaHero665121 == null ? null : PolarVoyageTextInputEditTextNebulaHero665121);
                                    if (polarVoyageRewardedAdPulseVision508917 == null || (polarVoyageFragmentPulseEliteDragon876814 = (PolarVoyageFragmentPulseEliteDragon8768) polarVoyageRewardedAdPulseVision508917.PolarVoyageMotionLayoutTransitionHeroVision4068) == null) {
                                        return false;
                                    }
                                    return ((Boolean) polarVoyageFragmentPulseEliteDragon876814.PolarVoyageMotionLayoutTransitionHeroVision4068()).booleanValue();
                                case R.id.accessibilityActionPageLeft:
                                    Object PolarVoyageTextInputEditTextNebulaHero665122 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageMotionLayoutForceEpicAurora7183);
                                    PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision508918 = (PolarVoyageRewardedAdPulseVision5089) (PolarVoyageTextInputEditTextNebulaHero665122 == null ? null : PolarVoyageTextInputEditTextNebulaHero665122);
                                    if (polarVoyageRewardedAdPulseVision508918 == null || (polarVoyageFragmentPulseEliteDragon876815 = (PolarVoyageFragmentPulseEliteDragon8768) polarVoyageRewardedAdPulseVision508918.PolarVoyageMotionLayoutTransitionHeroVision4068) == null) {
                                        return false;
                                    }
                                    return ((Boolean) polarVoyageFragmentPulseEliteDragon876815.PolarVoyageMotionLayoutTransitionHeroVision4068()).booleanValue();
                                case R.id.accessibilityActionPageRight:
                                    Object PolarVoyageTextInputEditTextNebulaHero665123 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageCameraViewSpectraMaxSpectra2824);
                                    PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision508919 = (PolarVoyageRewardedAdPulseVision5089) (PolarVoyageTextInputEditTextNebulaHero665123 == null ? null : PolarVoyageTextInputEditTextNebulaHero665123);
                                    if (polarVoyageRewardedAdPulseVision508919 == null || (polarVoyageFragmentPulseEliteDragon876816 = (PolarVoyageFragmentPulseEliteDragon8768) polarVoyageRewardedAdPulseVision508919.PolarVoyageMotionLayoutTransitionHeroVision4068) == null) {
                                        return false;
                                    }
                                    return ((Boolean) polarVoyageFragmentPulseEliteDragon876816.PolarVoyageMotionLayoutTransitionHeroVision4068()).booleanValue();
                                default:
                                    PolarVoyageOnTouchListenerPrimePixelLegend8920 polarVoyageOnTouchListenerPrimePixelLegend8920 = (PolarVoyageOnTouchListenerPrimePixelLegend8920) polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageMotionLayoutTransitionHeroVision4068(i);
                                    if (polarVoyageOnTouchListenerPrimePixelLegend8920 == null || ((CharSequence) polarVoyageOnTouchListenerPrimePixelLegend8920.PolarVoyageMotionLayoutTransitionHeroVision4068(i2)) == null) {
                                        return false;
                                    }
                                    Object PolarVoyageTextInputEditTextNebulaHero665124 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageDisplayMetricsVortexDragon9516);
                                    List list = (List) (PolarVoyageTextInputEditTextNebulaHero665124 == null ? null : PolarVoyageTextInputEditTextNebulaHero665124);
                                    if (list == null || list.size() <= 0) {
                                        return false;
                                    }
                                    list.get(0).getClass();
                                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageZipVortexCelestial6185();
                                    return false;
                            }
                    }
            }
            boolean z2 = i2 == 4096;
            boolean z3 = i2 == 8192;
            boolean z4 = i2 == 16908345;
            boolean z5 = i2 == 16908347;
            boolean z6 = i2 == 16908344;
            boolean z7 = i2 == 16908346;
            boolean z8 = z4 || z5 || z2 || z3;
            boolean z9 = z6 || z7 || z2 || z3;
            if (z2 || z3) {
                Object PolarVoyageTextInputEditTextNebulaHero665125 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageKotlinBetaPulseBeta3653);
                if (PolarVoyageTextInputEditTextNebulaHero665125 == null) {
                    PolarVoyageTextInputEditTextNebulaHero665125 = null;
                }
                PolarVoyageMotionLayoutShadowAuroraInferno1500 polarVoyageMotionLayoutShadowAuroraInferno1500 = (PolarVoyageMotionLayoutShadowAuroraInferno1500) PolarVoyageTextInputEditTextNebulaHero665125;
                Object PolarVoyageTextInputEditTextNebulaHero665126 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageTextInputEditTextNebulaHero6651);
                if (PolarVoyageTextInputEditTextNebulaHero665126 == null) {
                    PolarVoyageTextInputEditTextNebulaHero665126 = null;
                }
                PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision508920 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageTextInputEditTextNebulaHero665126;
                if (polarVoyageMotionLayoutShadowAuroraInferno1500 != null) {
                    PolarVoyageFlingGestureBlazePulseLegend2819 polarVoyageFlingGestureBlazePulseLegend2819 = polarVoyageMotionLayoutShadowAuroraInferno1500.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    if (polarVoyageRewardedAdPulseVision508920 != null) {
                        float f7 = polarVoyageFlingGestureBlazePulseLegend2819.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        float f8 = polarVoyageFlingGestureBlazePulseLegend2819.PolarVoyageZipVortexCelestial6185;
                        float f9 = f7 < f8 ? f8 : f7;
                        if (f8 <= f7) {
                            f7 = f8;
                        }
                        float f10 = (f9 - f7) / 20.0f;
                        if (z3) {
                            f10 = -f10;
                        }
                        PolarVoyageStateFlowNebulaMax1492 polarVoyageStateFlowNebulaMax14924 = (PolarVoyageStateFlowNebulaMax1492) polarVoyageRewardedAdPulseVision508920.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        if (polarVoyageStateFlowNebulaMax14924 != null) {
                            return ((Boolean) polarVoyageStateFlowNebulaMax14924.PolarVoyageZipVortexCelestial6185(Float.valueOf(polarVoyageMotionLayoutShadowAuroraInferno1500.PolarVoyageZipVortexCelestial6185 + f10))).booleanValue();
                        }
                        return false;
                    }
                }
            }
            long PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageRotateAnimationCyberCelestialDelta4768((PolarVoyageGradientDrawableTurboForce1324) polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageAlarmManagerShadowHyperBeta8339.PolarVoyageBarcodeScannerInfernoSolarSpark7767).PolarVoyageMotionLayoutTransitionHeroVision4068();
            ArrayList arrayList = new ArrayList();
            Object PolarVoyageTextInputEditTextNebulaHero665127 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyagePackageManagerCelestialPhoenix8393);
            if (PolarVoyageTextInputEditTextNebulaHero665127 == null) {
                PolarVoyageTextInputEditTextNebulaHero665127 = null;
            }
            PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision508921 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageTextInputEditTextNebulaHero665127;
            Float f11 = (polarVoyageRewardedAdPulseVision508921 == null || (polarVoyageStateFlowNebulaMax1492 = (PolarVoyageStateFlowNebulaMax1492) polarVoyageRewardedAdPulseVision508921.PolarVoyageMotionLayoutTransitionHeroVision4068) == null || !((Boolean) polarVoyageStateFlowNebulaMax1492.PolarVoyageZipVortexCelestial6185(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
            Object PolarVoyageTextInputEditTextNebulaHero665128 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
            if (PolarVoyageTextInputEditTextNebulaHero665128 == null) {
                PolarVoyageTextInputEditTextNebulaHero665128 = null;
            }
            PolarVoyageRewardedAdPulseVision5089 polarVoyageRewardedAdPulseVision508922 = (PolarVoyageRewardedAdPulseVision5089) PolarVoyageTextInputEditTextNebulaHero665128;
            if (polarVoyageRewardedAdPulseVision508922 == null) {
                return false;
            }
            PolarVoyagePagingHeroCyberLegend1562 polarVoyagePagingHeroCyberLegend1562 = polarVoyageRewardedAdPulseVision508922.PolarVoyageMotionLayoutTransitionHeroVision4068;
            Object PolarVoyageTextInputEditTextNebulaHero665129 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageAnimatorSetSparkUltraMax8233);
            if (PolarVoyageTextInputEditTextNebulaHero665129 == null) {
                PolarVoyageTextInputEditTextNebulaHero665129 = null;
            }
            PolarVoyageActivityFusionHyper3950 polarVoyageActivityFusionHyper3950 = (PolarVoyageActivityFusionHyper3950) PolarVoyageTextInputEditTextNebulaHero665129;
            if (polarVoyageActivityFusionHyper3950 == null || !z8) {
                f = f11;
                z = z9;
            } else {
                if (f11 != null) {
                    intBitsToFloat = f11.floatValue();
                    f = f11;
                    z = z9;
                } else {
                    f = f11;
                    z = z9;
                    intBitsToFloat = Float.intBitsToFloat((int) (PolarVoyageMotionLayoutTransitionHeroVision4068 >> 32));
                }
                if (z4 || z3) {
                    intBitsToFloat = -intBitsToFloat;
                }
                if ((polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageFCMCelestialCosmosPixel3711 == polarVoyageOnLongClickListenerRogueDeltaNova6437) && (z4 || z5)) {
                    intBitsToFloat = -intBitsToFloat;
                }
                if (PolarVoyageTransitionManagerHeroNovaX3322.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageActivityFusionHyper3950, intBitsToFloat)) {
                    PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra2582 = PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageMotionLayoutForceEpicAurora7183;
                    if (!polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageLintBetaUltra2582) && !polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageCameraViewSpectraMaxSpectra2824)) {
                        PolarVoyageObjectDetectionThunderHyperInferno3620 polarVoyageObjectDetectionThunderHyperInferno3620 = (PolarVoyageObjectDetectionThunderHyperInferno3620) polarVoyagePagingHeroCyberLegend1562;
                        if (polarVoyageObjectDetectionThunderHyperInferno3620 != null) {
                            return ((Boolean) polarVoyageObjectDetectionThunderHyperInferno3620.PolarVoyageDiffUtilTurboStrike5735(Float.valueOf(intBitsToFloat), valueOf)).booleanValue();
                        }
                        return false;
                    }
                    if (intBitsToFloat > 0.0f) {
                        Object PolarVoyageTextInputEditTextNebulaHero665130 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageCameraViewSpectraMaxSpectra2824);
                        polarVoyageRewardedAdPulseVision50892 = (PolarVoyageRewardedAdPulseVision5089) (PolarVoyageTextInputEditTextNebulaHero665130 == null ? null : PolarVoyageTextInputEditTextNebulaHero665130);
                    } else {
                        Object PolarVoyageTextInputEditTextNebulaHero665131 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageLintBetaUltra2582);
                        polarVoyageRewardedAdPulseVision50892 = (PolarVoyageRewardedAdPulseVision5089) (PolarVoyageTextInputEditTextNebulaHero665131 == null ? null : PolarVoyageTextInputEditTextNebulaHero665131);
                    }
                    if (polarVoyageRewardedAdPulseVision50892 == null || (polarVoyageFragmentPulseEliteDragon87686 = (PolarVoyageFragmentPulseEliteDragon8768) polarVoyageRewardedAdPulseVision50892.PolarVoyageMotionLayoutTransitionHeroVision4068) == null) {
                        return false;
                    }
                    return ((Boolean) polarVoyageFragmentPulseEliteDragon87686.PolarVoyageMotionLayoutTransitionHeroVision4068()).booleanValue();
                }
            }
            Object PolarVoyageTextInputEditTextNebulaHero665132 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageBitmapMaxTitanTitan7960);
            if (PolarVoyageTextInputEditTextNebulaHero665132 == null) {
                PolarVoyageTextInputEditTextNebulaHero665132 = null;
            }
            PolarVoyageActivityFusionHyper3950 polarVoyageActivityFusionHyper39502 = (PolarVoyageActivityFusionHyper3950) PolarVoyageTextInputEditTextNebulaHero665132;
            if (polarVoyageActivityFusionHyper39502 == null || !z) {
                return false;
            }
            float floatValue = f != null ? f.floatValue() : Float.intBitsToFloat((int) (4294967295L & PolarVoyageMotionLayoutTransitionHeroVision4068));
            if (z6 || z3) {
                floatValue = -floatValue;
            }
            if (!PolarVoyageTransitionManagerHeroNovaX3322.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageActivityFusionHyper39502, floatValue)) {
                return false;
            }
            PolarVoyageLintBetaUltra2582 polarVoyageLintBetaUltra25822 = PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageLayerDrawableShadowTitaniumOmega1942;
            if (!polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageLintBetaUltra25822) && !polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageAlertDialogCyberHeroQuantum3938)) {
                PolarVoyageObjectDetectionThunderHyperInferno3620 polarVoyageObjectDetectionThunderHyperInferno36202 = (PolarVoyageObjectDetectionThunderHyperInferno3620) polarVoyagePagingHeroCyberLegend1562;
                if (polarVoyageObjectDetectionThunderHyperInferno36202 != null) {
                    return ((Boolean) polarVoyageObjectDetectionThunderHyperInferno36202.PolarVoyageDiffUtilTurboStrike5735(valueOf, Float.valueOf(floatValue))).booleanValue();
                }
                return false;
            }
            if (floatValue > 0.0f) {
                Object PolarVoyageTextInputEditTextNebulaHero665133 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageAlertDialogCyberHeroQuantum3938);
                polarVoyageRewardedAdPulseVision5089 = (PolarVoyageRewardedAdPulseVision5089) (PolarVoyageTextInputEditTextNebulaHero665133 == null ? null : PolarVoyageTextInputEditTextNebulaHero665133);
            } else {
                Object PolarVoyageTextInputEditTextNebulaHero665134 = polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageLintBetaUltra25822);
                polarVoyageRewardedAdPulseVision5089 = (PolarVoyageRewardedAdPulseVision5089) (PolarVoyageTextInputEditTextNebulaHero665134 == null ? null : PolarVoyageTextInputEditTextNebulaHero665134);
            }
            if (polarVoyageRewardedAdPulseVision5089 == null || (polarVoyageFragmentPulseEliteDragon87685 = (PolarVoyageFragmentPulseEliteDragon8768) polarVoyageRewardedAdPulseVision5089.PolarVoyageMotionLayoutTransitionHeroVision4068) == null) {
                return false;
            }
            return ((Boolean) polarVoyageFragmentPulseEliteDragon87685.PolarVoyageMotionLayoutTransitionHeroVision4068()).booleanValue();
        }
        if (bundle == null) {
            return false;
        }
        int i8 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z10 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        boolean z11 = i2 == 256;
        Integer num2 = polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageAlertDialogCyberHeroQuantum3938;
        if (num2 == null || i6 != num2.intValue()) {
            polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageMotionLayoutForceEpicAurora7183 = -1;
            polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageAlertDialogCyberHeroQuantum3938 = Integer.valueOf(i6);
        }
        String PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageTransitionManagerHeroNovaX3322.PolarVoyageDrawableDeltaHyperion5742(polarVoyageJobIntentServiceStormEclipsePixel2539);
        if (PolarVoyageDrawableDeltaHyperion5742 == null || PolarVoyageDrawableDeltaHyperion5742.length() == 0) {
            return false;
        }
        String PolarVoyageDrawableDeltaHyperion57422 = PolarVoyageTransitionManagerHeroNovaX3322.PolarVoyageDrawableDeltaHyperion5742(polarVoyageJobIntentServiceStormEclipsePixel2539);
        if (PolarVoyageDrawableDeltaHyperion57422 != null && PolarVoyageDrawableDeltaHyperion57422.length() != 0) {
            if (i8 == 1) {
                Locale locale = polarVoyageRewardedAdUltraTitanium4787.getContext().getResources().getConfiguration().locale;
                if (PolarVoyageLaunchSpeedTurbo4241.PolarVoyageBitmapVisionAuroraPixel4705 == null) {
                    PolarVoyageLaunchSpeedTurbo4241 polarVoyageLaunchSpeedTurbo4241 = new PolarVoyageLaunchSpeedTurbo4241(0);
                    polarVoyageLaunchSpeedTurbo4241.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = BreakIterator.getCharacterInstance(locale);
                    PolarVoyageLaunchSpeedTurbo4241.PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageLaunchSpeedTurbo4241;
                }
                PolarVoyageLaunchSpeedTurbo4241 polarVoyageLaunchSpeedTurbo42412 = PolarVoyageLaunchSpeedTurbo4241.PolarVoyageBitmapVisionAuroraPixel4705;
                polarVoyageLaunchSpeedTurbo42412.getClass();
                polarVoyageLaunchSpeedTurbo42412.PolarVoyageDiffUtilTurboStrike5735(PolarVoyageDrawableDeltaHyperion57422);
                polarVoyageEventTurboPixel7111 = polarVoyageLaunchSpeedTurbo42412;
            } else if (i8 != 2) {
                if (i8 != 4) {
                    if (i8 == 8) {
                        if (PolarVoyageLicensingCyberHyper6902.PolarVoyageKotlinBetaPulseBeta3653 == null) {
                            PolarVoyageLicensingCyberHyper6902.PolarVoyageKotlinBetaPulseBeta3653 = new PolarVoyageLicensingCyberHyper6902();
                        }
                        PolarVoyageLicensingCyberHyper6902 polarVoyageLicensingCyberHyper6902 = PolarVoyageLicensingCyberHyper6902.PolarVoyageKotlinBetaPulseBeta3653;
                        polarVoyageLicensingCyberHyper6902.getClass();
                        polarVoyageLicensingCyberHyper6902.PolarVoyageZipVortexCelestial6185 = PolarVoyageDrawableDeltaHyperion57422;
                        polarVoyageEventTurboPixel7111 = polarVoyageLicensingCyberHyper6902;
                    }
                }
                if (polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageBillingClientUltraNeoPhantom8291.PolarVoyageZipVortexCelestial6185) && (PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageInAppPurchaseTitaniumEpic6306)) != null) {
                    if (i8 == 4) {
                        if (PolarVoyageLaunchSpeedTurbo4241.PolarVoyageTextInputEditTextNebulaHero6651 == null) {
                            PolarVoyageLaunchSpeedTurbo4241.PolarVoyageTextInputEditTextNebulaHero6651 = new PolarVoyageLaunchSpeedTurbo4241(2);
                        }
                        PolarVoyageLaunchSpeedTurbo4241 polarVoyageLaunchSpeedTurbo42413 = PolarVoyageLaunchSpeedTurbo4241.PolarVoyageTextInputEditTextNebulaHero6651;
                        polarVoyageLaunchSpeedTurbo42413.getClass();
                        polarVoyageLaunchSpeedTurbo42413.PolarVoyageZipVortexCelestial6185 = PolarVoyageDrawableDeltaHyperion57422;
                        polarVoyageLaunchSpeedTurbo42413.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageItemDecorationUltraDeltaEpic7485;
                        polarVoyageEventTurboPixel7111 = polarVoyageLaunchSpeedTurbo42413;
                    } else {
                        if (PolarVoyageExoPlayerShadowHyperSolar7512.PolarVoyageBitmapVisionAuroraPixel4705 == null) {
                            PolarVoyageExoPlayerShadowHyperSolar7512 polarVoyageExoPlayerShadowHyperSolar7512 = new PolarVoyageExoPlayerShadowHyperSolar7512();
                            new Rect();
                            PolarVoyageExoPlayerShadowHyperSolar7512.PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageExoPlayerShadowHyperSolar7512;
                        }
                        PolarVoyageExoPlayerShadowHyperSolar7512 polarVoyageExoPlayerShadowHyperSolar75122 = PolarVoyageExoPlayerShadowHyperSolar7512.PolarVoyageBitmapVisionAuroraPixel4705;
                        polarVoyageExoPlayerShadowHyperSolar75122.getClass();
                        polarVoyageExoPlayerShadowHyperSolar75122.PolarVoyageZipVortexCelestial6185 = PolarVoyageDrawableDeltaHyperion57422;
                        polarVoyageExoPlayerShadowHyperSolar75122.PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageItemDecorationUltraDeltaEpic7485;
                        polarVoyageExoPlayerShadowHyperSolar75122.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageJobIntentServiceStormEclipsePixel2539;
                        polarVoyageEventTurboPixel7111 = polarVoyageExoPlayerShadowHyperSolar75122;
                    }
                }
            } else {
                Locale locale2 = polarVoyageRewardedAdUltraTitanium4787.getContext().getResources().getConfiguration().locale;
                if (PolarVoyageLaunchSpeedTurbo4241.PolarVoyageDiffUtilTurboStrike5735 == null) {
                    PolarVoyageLaunchSpeedTurbo4241 polarVoyageLaunchSpeedTurbo42414 = new PolarVoyageLaunchSpeedTurbo4241(1);
                    polarVoyageLaunchSpeedTurbo42414.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = BreakIterator.getWordInstance(locale2);
                    PolarVoyageLaunchSpeedTurbo4241.PolarVoyageDiffUtilTurboStrike5735 = polarVoyageLaunchSpeedTurbo42414;
                }
                PolarVoyageLaunchSpeedTurbo4241 polarVoyageLaunchSpeedTurbo42415 = PolarVoyageLaunchSpeedTurbo4241.PolarVoyageDiffUtilTurboStrike5735;
                polarVoyageLaunchSpeedTurbo42415.getClass();
                polarVoyageLaunchSpeedTurbo42415.PolarVoyageDiffUtilTurboStrike5735(PolarVoyageDrawableDeltaHyperion57422);
                polarVoyageEventTurboPixel7111 = polarVoyageLaunchSpeedTurbo42415;
            }
            if (polarVoyageEventTurboPixel7111 != null) {
                return false;
            }
            int PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageJobIntentServiceStormEclipsePixel2539);
            if (PolarVoyageBottomSheetOmegaNeo1907 == -1) {
                PolarVoyageBottomSheetOmegaNeo1907 = z11 ? 0 : PolarVoyageDrawableDeltaHyperion5742.length();
            }
            int[] PolarVoyageZipVortexCelestial61853 = z11 ? polarVoyageEventTurboPixel7111.PolarVoyageZipVortexCelestial6185(PolarVoyageBottomSheetOmegaNeo1907) : polarVoyageEventTurboPixel7111.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageBottomSheetOmegaNeo1907);
            if (PolarVoyageZipVortexCelestial61853 == null) {
                return false;
            }
            int i9 = PolarVoyageZipVortexCelestial61853[0];
            int i10 = PolarVoyageZipVortexCelestial61853[1];
            if (z10 && !polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageZipVortexCelestial6185) && polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageAccelerometerTitanPrimeTitan9312.PolarVoyageLifecycleOlympianOmega3762)) {
                i4 = polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageViewRogueMaster4778(polarVoyageJobIntentServiceStormEclipsePixel2539);
                if (i4 == -1) {
                    i4 = z11 ? i9 : i10;
                }
                i5 = z11 ? i10 : i9;
            } else {
                i4 = z11 ? i10 : i9;
                i5 = i4;
            }
            polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageActivityInfoBetaQuantum8726 = new PolarVoyageRewardedAdVisionPulsePrime7518(polarVoyageJobIntentServiceStormEclipsePixel2539, z11 ? 256 : 512, i8, i9, i10, SystemClock.uptimeMillis());
            polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageDiffUtilDragonSpeedEclipse6225(polarVoyageJobIntentServiceStormEclipsePixel2539, i4, i5, true);
            return true;
        }
        polarVoyageEventTurboPixel7111 = null;
        if (polarVoyageEventTurboPixel7111 != null) {
        }
    }
}
