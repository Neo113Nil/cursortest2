package p000createpolar;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.network.ErrorCodes;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageCountDownTimerNovaXNebula3211 implements Handler.Callback, PolarVoyageNavigationViewVortexPulse6567, PolarVoyageCardViewNeoPhoenix5286 {
    public static final long PolarVoyageCombineBlazeSparkInferno2844 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageGuidelineStormSolar2850(10000);
    public final long PolarVoyageActivityInfoBetaQuantum8726;
    public boolean PolarVoyageAlarmManagerShadowHyperBeta8339;
    public final PolarVoyageTraceMegaMaster3202 PolarVoyageAlertDialogCyberHeroQuantum3938;
    public boolean PolarVoyageAlertDialogNovaXCelestial4954;
    public final PolarVoyageScrollViewFusionVision5184 PolarVoyageAnimatorSetSparkUltraMax8233;
    public final long PolarVoyageBitmapMaxTitanTitan7960;
    public final PolarVoyageDrawableMaxNovaX8749 PolarVoyageBottomSheetOmegaNeo1907;
    public final PolarVoyageRemoteModelManagerPulseMaxNovaX6329 PolarVoyageCameraPixelBlaze2629;
    public int PolarVoyageCameraViewEclipseLegendStrike8028;
    public final PolarVoyageConstraintSetNovaSolarAlpha1105 PolarVoyageCameraViewSpectraMaxSpectra2824;
    public int PolarVoyageCanvasElitePhoenix4750;
    public final PolarVoyageContextAlphaAurora8980 PolarVoyageCardViewAlphaVortexCelestial9747;
    public boolean PolarVoyageClipboardManagerAuroraPixel8666;
    public boolean PolarVoyageColorStateListEliteStrikeOlympian8131;
    public PolarVoyageAccelerometerMaxShadowCosmos8778 PolarVoyageConfigurationMaxSpectraForce5418;
    public final PolarVoyageSQLiteTitanForceLegend7380 PolarVoyageContentProviderHyperSpark3838;
    public boolean PolarVoyageDatabaseCosmosSpectraSolar3905;
    public PolarVoyageMotionSceneSpectraAuroraThunder3244 PolarVoyageDelayCyberQuantumEclipse8687;
    public final PolarVoyageDatabaseVortexUltraNova4004 PolarVoyageDiffUtilDragonSpeedEclipse6225;
    public boolean PolarVoyageDisplayMetricsForceEclipseVision4728;
    public final PolarVoyageDiffUtilSpeedCelestial7413 PolarVoyageDisplayMetricsVortexDragon9516;
    public final PolarVoyageSnackbarTitanSpectra1637 PolarVoyageDrawableDeltaHyperion5742;
    public final PolarVoyagePropertyValuesHolderHyperionUltra8479 PolarVoyageFCMCelestialCosmosPixel3711;
    public PolarVoyageGuidelineEpicPrimeMax7757 PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149;
    public final boolean PolarVoyageFlingGestureEclipsePrimeMax1376;
    public PolarVoyageAssetManagerQuantumSpectraPhoenix6233 PolarVoyageFlowOnBetaCyber2473;
    public boolean PolarVoyageGuidelineStormSolar2850;
    public final PolarVoyageServiceStormMasterPixel9641[] PolarVoyageItemDecorationUltraDeltaEpic7485;
    public PolarVoyageAccelerometerMaxShadowCosmos8778 PolarVoyageKotlinHeroHyper4083;
    public final ArrayList PolarVoyageLayerDrawableShadowTitaniumOmega1942;
    public PolarVoyageMaterialButtonDragonCyberMega6188 PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
    public final PolarVoyageClipboardManagerUltraRogue9881 PolarVoyageLifecycleOlympianOmega3762;
    public final PolarVoyageTextRecognitionMaxPhantom8204 PolarVoyageLooperThreadAlphaPrime1279;
    public int PolarVoyageMapTurboRogueTitan9291;
    public final PolarVoyageVelocityTrackerPhantomTitaniumStrike2970 PolarVoyageMotionLayoutForceEpicAurora7183;
    public PolarVoyageFragmentHyperMasterHyper5702 PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587;
    public boolean PolarVoyageMotionSceneStormSolarBeta2208;
    public final PolarVoyageInterstitialAdMasterShadowCosmos9360 PolarVoyageNavigationViewHyperHyperHyperion1793;
    public boolean PolarVoyageObserverEliteUltra2793;
    public boolean PolarVoyageOnPreDrawListenerNovaCelestialDragon7415;
    public final PolarVoyageKaptNeoFusion1280 PolarVoyagePackageManagerCelestialPhoenix8393;
    public int PolarVoyageProcessCameraProviderQuantumCosmosPulse5576;
    public final Looper PolarVoyageRemoteModelManagerOlympianCelestial9141;
    public final boolean[] PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public boolean PolarVoyageSensorManagerFusionPixelSolar7026;
    public final PolarVoyagePropertyValuesHolderHyperionUltra8479 PolarVoyageSnackbarGammaEclipse2140;
    public final PolarVoyageGestureDetectorPhoenixNovaX9940[] PolarVoyageStrictModeLegendEpic1532;
    public long PolarVoyageThreadPhoenixVisionSolar1313;
    public final boolean PolarVoyageViewBindingPulseHeroSpeed5705;
    public final PolarVoyageViewPagerSparkVision4365 PolarVoyageViewRogueMaster4778;
    public long PolarVoyageWithContextPulseSolarHyperion4393;
    public long PolarVoyageCardViewSpectraTurbo5149 = -9223372036854775807L;
    public boolean PolarVoyageHandlerThreadMaxAurora5064 = false;
    public boolean PolarVoyagePoseDetectionCosmosVision6217 = false;
    public float PolarVoyageViewPagerPhantomHyperionNova3183 = 1.0f;
    public PolarVoyageTextureViewThunderTurboStrike2293 PolarVoyageToolbarEclipseInfernoHero6368 = PolarVoyageTextureViewThunderTurboStrike2293.PolarVoyageMotionLayoutTransitionHeroVision4068;
    public long PolarVoyageBottomSheetNovaXNova5051 = -9223372036854775807L;
    public long PolarVoyageKeyframeEpicNovaXCyber9821 = -9223372036854775807L;

    public PolarVoyageCountDownTimerNovaXNebula3211(Context context, PolarVoyageGestureDetectorPhoenixNovaX9940[] polarVoyageGestureDetectorPhoenixNovaX9940Arr, PolarVoyageGestureDetectorPhoenixNovaX9940[] polarVoyageGestureDetectorPhoenixNovaX9940Arr2, PolarVoyageDrawableMaxNovaX8749 polarVoyageDrawableMaxNovaX8749, PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision4365, PolarVoyageRemoteModelManagerPulseMaxNovaX6329 polarVoyageRemoteModelManagerPulseMaxNovaX6329, PolarVoyageSnackbarTitanSpectra1637 polarVoyageSnackbarTitanSpectra1637, int i, PolarVoyageDatabaseVortexUltraNova4004 polarVoyageDatabaseVortexUltraNova4004, PolarVoyageGuidelineEpicPrimeMax7757 polarVoyageGuidelineEpicPrimeMax7757, PolarVoyageTextRecognitionMaxPhantom8204 polarVoyageTextRecognitionMaxPhantom8204, long j, Looper looper, PolarVoyageVelocityTrackerPhantomTitaniumStrike2970 polarVoyageVelocityTrackerPhantomTitaniumStrike2970, PolarVoyageTraceMegaMaster3202 polarVoyageTraceMegaMaster3202, PolarVoyageClipboardManagerUltraRogue9881 polarVoyageClipboardManagerUltraRogue9881, PolarVoyageMotionSceneSpectraAuroraThunder3244 polarVoyageMotionSceneSpectraAuroraThunder3244, final PolarVoyageCardViewNeoPhoenix5286 polarVoyageCardViewNeoPhoenix5286, boolean z) {
        Looper looper2;
        this.PolarVoyageAlertDialogCyberHeroQuantum3938 = polarVoyageTraceMegaMaster3202;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageDrawableMaxNovaX8749;
        this.PolarVoyageViewRogueMaster4778 = polarVoyageViewPagerSparkVision4365;
        this.PolarVoyageCameraPixelBlaze2629 = polarVoyageRemoteModelManagerPulseMaxNovaX6329;
        this.PolarVoyageDrawableDeltaHyperion5742 = polarVoyageSnackbarTitanSpectra1637;
        this.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576 = i;
        boolean z2 = false;
        this.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = polarVoyageGuidelineEpicPrimeMax7757;
        this.PolarVoyageLooperThreadAlphaPrime1279 = polarVoyageTextRecognitionMaxPhantom8204;
        this.PolarVoyageActivityInfoBetaQuantum8726 = j;
        this.PolarVoyageMotionLayoutForceEpicAurora7183 = polarVoyageVelocityTrackerPhantomTitaniumStrike2970;
        this.PolarVoyageLifecycleOlympianOmega3762 = polarVoyageClipboardManagerUltraRogue9881;
        this.PolarVoyageDelayCyberQuantumEclipse8687 = polarVoyageMotionSceneSpectraAuroraThunder3244;
        this.PolarVoyageDiffUtilDragonSpeedEclipse6225 = polarVoyageDatabaseVortexUltraNova4004;
        this.PolarVoyageFlingGestureEclipsePrimeMax1376 = z;
        this.PolarVoyageBitmapMaxTitanTitan7960 = polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageDrawableDeltaHyperion5742;
        PolarVoyageBannerAdPixelLegend3546 polarVoyageBannerAdPixelLegend3546 = PolarVoyageRoomDaoPulseShadow5566.PolarVoyageZipVortexCelestial6185;
        PolarVoyageMaterialButtonDragonCyberMega6188 PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageRotateAnimationCyberCelestialDelta4768(polarVoyageViewPagerSparkVision4365);
        this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = PolarVoyageRotateAnimationCyberCelestialDelta4768;
        this.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587 = new PolarVoyageFragmentHyperMasterHyper5702(PolarVoyageRotateAnimationCyberCelestialDelta4768);
        this.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageGestureDetectorPhoenixNovaX9940[polarVoyageGestureDetectorPhoenixNovaX9940Arr.length];
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new boolean[polarVoyageGestureDetectorPhoenixNovaX9940Arr.length];
        polarVoyageDrawableMaxNovaX8749.getClass();
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = new PolarVoyageServiceStormMasterPixel9641[polarVoyageGestureDetectorPhoenixNovaX9940Arr.length];
        boolean z3 = false;
        for (int i2 = 0; i2 < polarVoyageGestureDetectorPhoenixNovaX9940Arr.length; i2++) {
            PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX9940 = polarVoyageGestureDetectorPhoenixNovaX9940Arr[i2];
            polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageViewRogueMaster4778 = i2;
            polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageCameraPixelBlaze2629 = polarVoyageClipboardManagerUltraRogue9881;
            polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageDrawableDeltaHyperion5742 = polarVoyageVelocityTrackerPhantomTitaniumStrike2970;
            this.PolarVoyageStrictModeLegendEpic1532[i2] = polarVoyageGestureDetectorPhoenixNovaX9940;
            PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99402 = this.PolarVoyageStrictModeLegendEpic1532[i2];
            synchronized (polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageCameraViewSpectraMaxSpectra2824 = polarVoyageDrawableMaxNovaX8749;
            }
            PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99403 = polarVoyageGestureDetectorPhoenixNovaX9940Arr2[i2];
            if (polarVoyageGestureDetectorPhoenixNovaX99403 != null) {
                polarVoyageGestureDetectorPhoenixNovaX99403.PolarVoyageViewRogueMaster4778 = i2;
                polarVoyageGestureDetectorPhoenixNovaX99403.PolarVoyageCameraPixelBlaze2629 = polarVoyageClipboardManagerUltraRogue9881;
                polarVoyageGestureDetectorPhoenixNovaX99403.PolarVoyageDrawableDeltaHyperion5742 = polarVoyageVelocityTrackerPhantomTitaniumStrike2970;
                z3 = true;
            }
            this.PolarVoyageItemDecorationUltraDeltaEpic7485[i2] = new PolarVoyageServiceStormMasterPixel9641(polarVoyageGestureDetectorPhoenixNovaX9940Arr[i2], polarVoyageGestureDetectorPhoenixNovaX99403, i2);
        }
        this.PolarVoyageViewBindingPulseHeroSpeed5705 = z3;
        this.PolarVoyageDisplayMetricsVortexDragon9516 = new PolarVoyageDiffUtilSpeedCelestial7413(this, polarVoyageVelocityTrackerPhantomTitaniumStrike2970);
        this.PolarVoyageLayerDrawableShadowTitaniumOmega1942 = new ArrayList();
        this.PolarVoyageNavigationViewHyperHyperHyperion1793 = new PolarVoyageInterstitialAdMasterShadowCosmos9360();
        this.PolarVoyageAnimatorSetSparkUltraMax8233 = new PolarVoyageScrollViewFusionVision5184();
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(polarVoyageDrawableMaxNovaX8749.PolarVoyageZipVortexCelestial6185 == null);
        polarVoyageDrawableMaxNovaX8749.PolarVoyageZipVortexCelestial6185 = this;
        polarVoyageDrawableMaxNovaX8749.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageSnackbarTitanSpectra1637;
        this.PolarVoyageSensorManagerFusionPixelSolar7026 = true;
        PolarVoyagePropertyValuesHolderHyperionUltra8479 PolarVoyageZipVortexCelestial6185 = polarVoyageVelocityTrackerPhantomTitaniumStrike2970.PolarVoyageZipVortexCelestial6185(looper, null);
        this.PolarVoyageFCMCelestialCosmosPixel3711 = PolarVoyageZipVortexCelestial6185;
        this.PolarVoyageCameraViewSpectraMaxSpectra2824 = new PolarVoyageConstraintSetNovaSolarAlpha1105(polarVoyageDatabaseVortexUltraNova4004, PolarVoyageZipVortexCelestial6185, new PolarVoyageOnGlobalLayoutListenerTurboLegendHyperion3273(12, this), polarVoyageMotionSceneSpectraAuroraThunder3244);
        this.PolarVoyagePackageManagerCelestialPhoenix8393 = new PolarVoyageKaptNeoFusion1280(this, polarVoyageDatabaseVortexUltraNova4004, PolarVoyageZipVortexCelestial6185, polarVoyageClipboardManagerUltraRogue9881);
        PolarVoyageSQLiteTitanForceLegend7380 polarVoyageSQLiteTitanForceLegend7380 = new PolarVoyageSQLiteTitanForceLegend7380();
        this.PolarVoyageContentProviderHyperSpark3838 = polarVoyageSQLiteTitanForceLegend7380;
        synchronized (polarVoyageSQLiteTitanForceLegend7380.PolarVoyageMotionLayoutTransitionHeroVision4068) {
            try {
                if (((Looper) polarVoyageSQLiteTitanForceLegend7380.PolarVoyageKotlinBetaPulseBeta3653) == null) {
                    if (polarVoyageSQLiteTitanForceLegend7380.PolarVoyageZipVortexCelestial6185 == 0 && ((HandlerThread) polarVoyageSQLiteTitanForceLegend7380.PolarVoyageBarcodeScannerInfernoSolarSpark7767) == null) {
                        z2 = true;
                    }
                    PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(z2);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    polarVoyageSQLiteTitanForceLegend7380.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = handlerThread;
                    handlerThread.start();
                    polarVoyageSQLiteTitanForceLegend7380.PolarVoyageKotlinBetaPulseBeta3653 = ((HandlerThread) polarVoyageSQLiteTitanForceLegend7380.PolarVoyageBarcodeScannerInfernoSolarSpark7767).getLooper();
                }
                polarVoyageSQLiteTitanForceLegend7380.PolarVoyageZipVortexCelestial6185++;
                looper2 = (Looper) polarVoyageSQLiteTitanForceLegend7380.PolarVoyageKotlinBetaPulseBeta3653;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = looper2;
        PolarVoyagePropertyValuesHolderHyperionUltra8479 PolarVoyageZipVortexCelestial61852 = polarVoyageVelocityTrackerPhantomTitaniumStrike2970.PolarVoyageZipVortexCelestial6185(looper2, this);
        this.PolarVoyageSnackbarGammaEclipse2140 = PolarVoyageZipVortexCelestial61852;
        this.PolarVoyageCardViewAlphaVortexCelestial9747 = new PolarVoyageContextAlphaAurora8980(context, looper2, this);
        PolarVoyageZipVortexCelestial61852.PolarVoyageMotionLayoutTransitionHeroVision4068(35, new PolarVoyageCardViewNeoPhoenix5286() { // from class: create-polar.PolarVoyageTextureViewEclipseThunder7401
            @Override // p000createpolar.PolarVoyageCardViewNeoPhoenix5286
            public final void PolarVoyageZipVortexCelestial6185(long j2, long j3, PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356, MediaFormat mediaFormat) {
                polarVoyageCardViewNeoPhoenix5286.PolarVoyageZipVortexCelestial6185(j2, j3, polarVoyageDisplayMetricsSpectraNeoHero6356, mediaFormat);
                PolarVoyageCountDownTimerNovaXNebula3211.this.PolarVoyageZipVortexCelestial6185(j2, j3, polarVoyageDisplayMetricsSpectraNeoHero6356, mediaFormat);
            }
        }).PolarVoyageMotionLayoutTransitionHeroVision4068();
        PolarVoyageZipVortexCelestial61852.PolarVoyageMotionLayoutTransitionHeroVision4068(39, new PolarVoyageBroadcastBetaPhantomHero6008(this)).PolarVoyageMotionLayoutTransitionHeroVision4068();
    }

    public static Pair PolarVoyageAlertDialogNovaXCelestial4954(PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow5566, PolarVoyageAccelerometerMaxShadowCosmos8778 polarVoyageAccelerometerMaxShadowCosmos8778, boolean z, int i, boolean z2, PolarVoyageInterstitialAdMasterShadowCosmos9360 polarVoyageInterstitialAdMasterShadowCosmos9360, PolarVoyageScrollViewFusionVision5184 polarVoyageScrollViewFusionVision5184) {
        int PolarVoyageColorStateListEliteStrikeOlympian8131;
        PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow55662 = polarVoyageAccelerometerMaxShadowCosmos8778.PolarVoyageZipVortexCelestial6185;
        if (polarVoyageRoomDaoPulseShadow5566.PolarVoyageContentProviderHyperSpark3838()) {
            return null;
        }
        PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow55663 = polarVoyageRoomDaoPulseShadow55662.PolarVoyageContentProviderHyperSpark3838() ? polarVoyageRoomDaoPulseShadow5566 : polarVoyageRoomDaoPulseShadow55662;
        try {
            Pair PolarVoyageStrictModeLegendEpic1532 = polarVoyageRoomDaoPulseShadow55663.PolarVoyageStrictModeLegendEpic1532(polarVoyageInterstitialAdMasterShadowCosmos9360, polarVoyageScrollViewFusionVision5184, polarVoyageAccelerometerMaxShadowCosmos8778.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageAccelerometerMaxShadowCosmos8778.PolarVoyageKotlinBetaPulseBeta3653);
            if (!polarVoyageRoomDaoPulseShadow5566.equals(polarVoyageRoomDaoPulseShadow55663)) {
                if (polarVoyageRoomDaoPulseShadow5566.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageStrictModeLegendEpic1532.first) == -1) {
                    if (!z || (PolarVoyageColorStateListEliteStrikeOlympian8131 = PolarVoyageColorStateListEliteStrikeOlympian8131(polarVoyageInterstitialAdMasterShadowCosmos9360, polarVoyageScrollViewFusionVision5184, i, z2, PolarVoyageStrictModeLegendEpic1532.first, polarVoyageRoomDaoPulseShadow55663, polarVoyageRoomDaoPulseShadow5566)) == -1) {
                        return null;
                    }
                    return polarVoyageRoomDaoPulseShadow5566.PolarVoyageStrictModeLegendEpic1532(polarVoyageInterstitialAdMasterShadowCosmos9360, polarVoyageScrollViewFusionVision5184, PolarVoyageColorStateListEliteStrikeOlympian8131, -9223372036854775807L);
                }
                if (polarVoyageRoomDaoPulseShadow55663.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageStrictModeLegendEpic1532.first, polarVoyageScrollViewFusionVision5184).PolarVoyageDiffUtilTurboStrike5735 && polarVoyageRoomDaoPulseShadow55663.PolarVoyageCameraPixelBlaze2629(polarVoyageScrollViewFusionVision5184.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageInterstitialAdMasterShadowCosmos9360, 0L).PolarVoyageViewRogueMaster4778 == polarVoyageRoomDaoPulseShadow55663.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageStrictModeLegendEpic1532.first)) {
                    return polarVoyageRoomDaoPulseShadow5566.PolarVoyageStrictModeLegendEpic1532(polarVoyageInterstitialAdMasterShadowCosmos9360, polarVoyageScrollViewFusionVision5184, polarVoyageRoomDaoPulseShadow5566.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageStrictModeLegendEpic1532.first, polarVoyageScrollViewFusionVision5184).PolarVoyageKotlinBetaPulseBeta3653, polarVoyageAccelerometerMaxShadowCosmos8778.PolarVoyageKotlinBetaPulseBeta3653);
                }
            }
            return PolarVoyageStrictModeLegendEpic1532;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int PolarVoyageColorStateListEliteStrikeOlympian8131(PolarVoyageInterstitialAdMasterShadowCosmos9360 polarVoyageInterstitialAdMasterShadowCosmos9360, PolarVoyageScrollViewFusionVision5184 polarVoyageScrollViewFusionVision5184, int i, boolean z, Object obj, PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow5566, PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow55662) {
        PolarVoyageInterstitialAdMasterShadowCosmos9360 polarVoyageInterstitialAdMasterShadowCosmos93602 = polarVoyageInterstitialAdMasterShadowCosmos9360;
        PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow55663 = polarVoyageRoomDaoPulseShadow5566;
        Object obj2 = polarVoyageRoomDaoPulseShadow55663.PolarVoyageCameraPixelBlaze2629(polarVoyageRoomDaoPulseShadow55663.PolarVoyageTextInputEditTextNebulaHero6651(obj, polarVoyageScrollViewFusionVision5184).PolarVoyageKotlinBetaPulseBeta3653, polarVoyageInterstitialAdMasterShadowCosmos9360, 0L).PolarVoyageZipVortexCelestial6185;
        for (int i2 = 0; i2 < polarVoyageRoomDaoPulseShadow55662.PolarVoyageSnackbarGammaEclipse2140(); i2++) {
            if (polarVoyageRoomDaoPulseShadow55662.PolarVoyageCameraPixelBlaze2629(i2, polarVoyageInterstitialAdMasterShadowCosmos9360, 0L).PolarVoyageZipVortexCelestial6185.equals(obj2)) {
                return i2;
            }
        }
        int PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageRoomDaoPulseShadow55663.PolarVoyageMotionLayoutTransitionHeroVision4068(obj);
        int PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageRoomDaoPulseShadow55663.PolarVoyageItemDecorationUltraDeltaEpic7485();
        int i3 = -1;
        int i4 = 0;
        while (i4 < PolarVoyageItemDecorationUltraDeltaEpic7485 && i3 == -1) {
            PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow55664 = polarVoyageRoomDaoPulseShadow55663;
            int PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageRoomDaoPulseShadow55664.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageScrollViewFusionVision5184, polarVoyageInterstitialAdMasterShadowCosmos93602, i, z);
            if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 == -1) {
                break;
            }
            i3 = polarVoyageRoomDaoPulseShadow55662.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageRoomDaoPulseShadow55664.PolarVoyageViewRogueMaster4778(PolarVoyageBarcodeScannerInfernoSolarSpark7767));
            i4++;
            polarVoyageRoomDaoPulseShadow55663 = polarVoyageRoomDaoPulseShadow55664;
            PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            polarVoyageInterstitialAdMasterShadowCosmos93602 = polarVoyageInterstitialAdMasterShadowCosmos9360;
        }
        if (i3 == -1) {
            return -1;
        }
        return polarVoyageRoomDaoPulseShadow55662.PolarVoyageDiffUtilTurboStrike5735(i3, polarVoyageScrollViewFusionVision5184, false).PolarVoyageKotlinBetaPulseBeta3653;
    }

    public static boolean PolarVoyagePackageManagerCelestialPhoenix8393(PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877) {
        if (polarVoyageAdMobDeltaMasterShadow9877 != null) {
            try {
                PolarVoyageServiceVortexCosmosAlpha1023 polarVoyageServiceVortexCosmosAlpha1023 = polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageZipVortexCelestial6185;
                if (polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageBitmapVisionAuroraPixel4705) {
                    for (PolarVoyageFragmentTransactionVisionVortex9832 polarVoyageFragmentTransactionVisionVortex9832 : polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageKotlinBetaPulseBeta3653) {
                        if (polarVoyageFragmentTransactionVisionVortex9832 != null) {
                            polarVoyageFragmentTransactionVisionVortex9832.PolarVoyageBitmapVisionAuroraPixel4705();
                        }
                    }
                } else {
                    polarVoyageServiceVortexCosmosAlpha1023.PolarVoyageViewRogueMaster4778();
                }
                if ((!polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageBitmapVisionAuroraPixel4705 ? 0L : polarVoyageServiceVortexCosmosAlpha1023.PolarVoyageDiffUtilTurboStrike5735()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final void PolarVoyageAccelerometerUltraSolarSolar9029(float f) {
        this.PolarVoyageViewPagerPhantomHyperionNova3183 = f;
        float f2 = f * this.PolarVoyageCardViewAlphaVortexCelestial9747.PolarVoyageTextInputEditTextNebulaHero6651;
        for (PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 : this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX9940 = polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185;
            if (polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageStrictModeLegendEpic1532 == 1) {
                polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageKotlinBetaPulseBeta3653(2, Float.valueOf(f2));
                PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99402 = polarVoyageServiceStormMasterPixel9641.PolarVoyageKotlinBetaPulseBeta3653;
                if (polarVoyageGestureDetectorPhoenixNovaX99402 != null) {
                    polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageKotlinBetaPulseBeta3653(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final boolean PolarVoyageActivityInfoBetaQuantum8726() {
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532;
        long j = polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageDiffUtilTurboStrike5735;
        if (polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageBitmapVisionAuroraPixel4705) {
            return j == -9223372036854775807L || this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageAnimatorSetSparkUltraMax8233 < j || !PolarVoyageConstraintSetCloneCelestialHero1930();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x029b, code lost:
    
        if (((long) ((r3.PolarVoyageBitmapVisionAuroraPixel4705() - r23.PolarVoyageWithContextPulseSolarHyperion4393) / r23.PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageBarcodeScannerInfernoSolarSpark7767().PolarVoyageZipVortexCelestial6185)) > 10000000) goto L255;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageAdapterDelegateNebulaNeoVision8476() {
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877;
        long j;
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98772;
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98773;
        PolarVoyageServiceStormMasterPixel9641[] polarVoyageServiceStormMasterPixel9641Arr;
        PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha1105;
        boolean z;
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98774;
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98775;
        PolarVoyageAdMobDeltaMasterShadow9877 PolarVoyageZipVortexCelestial6185;
        boolean z2;
        int i;
        PolarVoyageServiceStormMasterPixel9641[] polarVoyageServiceStormMasterPixel9641Arr2;
        int i2;
        boolean z3;
        boolean z4;
        char c;
        int i3;
        int i4;
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98776;
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98777;
        boolean z5;
        int i5;
        if (this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185.PolarVoyageContentProviderHyperSpark3838() || !this.PolarVoyagePackageManagerCelestialPhoenix8393.PolarVoyageBottomSheetOmegaNeo1907) {
            return;
        }
        this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageCameraPixelBlaze2629(this.PolarVoyageWithContextPulseSolarHyperion4393);
        PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha11052 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98778 = polarVoyageConstraintSetNovaSolarAlpha11052.PolarVoyageViewRogueMaster4778;
        if (polarVoyageAdMobDeltaMasterShadow98778 == null || (!polarVoyageAdMobDeltaMasterShadow98778.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageBottomSheetOmegaNeo1907 && polarVoyageAdMobDeltaMasterShadow98778.PolarVoyageTextInputEditTextNebulaHero6651() && polarVoyageConstraintSetNovaSolarAlpha11052.PolarVoyageViewRogueMaster4778.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageDiffUtilTurboStrike5735 != -9223372036854775807L && polarVoyageConstraintSetNovaSolarAlpha11052.PolarVoyageDrawableDeltaHyperion5742 < 100)) {
            PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha11053 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
            long j2 = this.PolarVoyageWithContextPulseSolarHyperion4393;
            PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
            PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98779 = polarVoyageConstraintSetNovaSolarAlpha11053.PolarVoyageViewRogueMaster4778;
            PolarVoyageChipGroupHyperCelestial9288 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageAdMobDeltaMasterShadow98779 == null ? polarVoyageConstraintSetNovaSolarAlpha11053.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageZipVortexCelestial6185, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageAnimatorSetSparkUltraMax8233, -9223372036854775807L) : polarVoyageConstraintSetNovaSolarAlpha11053.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageZipVortexCelestial6185, polarVoyageAdMobDeltaMasterShadow98779, j2);
            if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 != null) {
                PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha11054 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
                PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow987710 = polarVoyageConstraintSetNovaSolarAlpha11054.PolarVoyageViewRogueMaster4778;
                long j3 = polarVoyageAdMobDeltaMasterShadow987710 == null ? 1000000000000L : (polarVoyageAdMobDeltaMasterShadow987710.PolarVoyageContentProviderHyperSpark3838 + polarVoyageAdMobDeltaMasterShadow987710.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageDiffUtilTurboStrike5735) - PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageMotionLayoutTransitionHeroVision4068;
                int i6 = 0;
                while (true) {
                    if (i6 >= polarVoyageConstraintSetNovaSolarAlpha11054.PolarVoyageRemoteModelManagerOlympianCelestial9141.size()) {
                        polarVoyageAdMobDeltaMasterShadow9877 = null;
                        break;
                    }
                    PolarVoyageChipGroupHyperCelestial9288 polarVoyageChipGroupHyperCelestial9288 = ((PolarVoyageAdMobDeltaMasterShadow9877) polarVoyageConstraintSetNovaSolarAlpha11054.PolarVoyageRemoteModelManagerOlympianCelestial9141.get(i6)).PolarVoyageTextInputEditTextNebulaHero6651;
                    long j4 = polarVoyageChipGroupHyperCelestial9288.PolarVoyageDiffUtilTurboStrike5735;
                    long j5 = PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageDiffUtilTurboStrike5735;
                    if ((j4 == -9223372036854775807L || j4 == j5) && polarVoyageChipGroupHyperCelestial9288.PolarVoyageMotionLayoutTransitionHeroVision4068 == PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageMotionLayoutTransitionHeroVision4068 && polarVoyageChipGroupHyperCelestial9288.PolarVoyageZipVortexCelestial6185.equals(PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageZipVortexCelestial6185)) {
                        polarVoyageAdMobDeltaMasterShadow9877 = (PolarVoyageAdMobDeltaMasterShadow9877) polarVoyageConstraintSetNovaSolarAlpha11054.PolarVoyageRemoteModelManagerOlympianCelestial9141.remove(i6);
                        break;
                    }
                    i6++;
                }
                if (polarVoyageAdMobDeltaMasterShadow9877 == null) {
                    PolarVoyageCountDownTimerNovaXNebula3211 polarVoyageCountDownTimerNovaXNebula3211 = (PolarVoyageCountDownTimerNovaXNebula3211) polarVoyageConstraintSetNovaSolarAlpha11054.PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageStrictModeLegendEpic1532;
                    PolarVoyageGestureDetectorPhoenixNovaX9940[] polarVoyageGestureDetectorPhoenixNovaX9940Arr = polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageStrictModeLegendEpic1532;
                    PolarVoyageDrawableMaxNovaX8749 polarVoyageDrawableMaxNovaX8749 = polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageBottomSheetOmegaNeo1907;
                    PolarVoyageRemoteModelManagerPulseMaxNovaX6329 polarVoyageRemoteModelManagerPulseMaxNovaX6329 = polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageCameraPixelBlaze2629;
                    PolarVoyageClipboardManagerUltraRogue9881 polarVoyageClipboardManagerUltraRogue9881 = polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageLifecycleOlympianOmega3762;
                    polarVoyageRemoteModelManagerPulseMaxNovaX6329.getClass();
                    j = -9223372036854775807L;
                    PolarVoyageAlarmManagerAlphaInferno3493 polarVoyageAlarmManagerAlphaInferno3493 = new PolarVoyageAlarmManagerAlphaInferno3493(polarVoyageRemoteModelManagerPulseMaxNovaX6329, polarVoyageClipboardManagerUltraRogue9881);
                    PolarVoyageKaptNeoFusion1280 polarVoyageKaptNeoFusion1280 = polarVoyageCountDownTimerNovaXNebula3211.PolarVoyagePackageManagerCelestialPhoenix8393;
                    PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision4365 = polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageViewRogueMaster4778;
                    polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageDelayCyberQuantumEclipse8687.getClass();
                    polarVoyageAdMobDeltaMasterShadow9877 = new PolarVoyageAdMobDeltaMasterShadow9877(polarVoyageGestureDetectorPhoenixNovaX9940Arr, j3, polarVoyageDrawableMaxNovaX8749, polarVoyageAlarmManagerAlphaInferno3493, polarVoyageKaptNeoFusion1280, PolarVoyageBarcodeScannerInfernoSolarSpark7767, polarVoyageViewPagerSparkVision4365);
                } else {
                    j = -9223372036854775807L;
                    polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                    polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageContentProviderHyperSpark3838 = j3;
                }
                PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow987711 = polarVoyageConstraintSetNovaSolarAlpha11054.PolarVoyageViewRogueMaster4778;
                if (polarVoyageAdMobDeltaMasterShadow987711 == null) {
                    polarVoyageConstraintSetNovaSolarAlpha11054.PolarVoyageStrictModeLegendEpic1532 = polarVoyageAdMobDeltaMasterShadow9877;
                    polarVoyageConstraintSetNovaSolarAlpha11054.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageAdMobDeltaMasterShadow9877;
                    polarVoyageConstraintSetNovaSolarAlpha11054.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageAdMobDeltaMasterShadow9877;
                } else if (polarVoyageAdMobDeltaMasterShadow9877 != polarVoyageAdMobDeltaMasterShadow987711.PolarVoyageCameraPixelBlaze2629) {
                    polarVoyageAdMobDeltaMasterShadow987711.PolarVoyageMotionLayoutTransitionHeroVision4068();
                    polarVoyageAdMobDeltaMasterShadow987711.PolarVoyageCameraPixelBlaze2629 = polarVoyageAdMobDeltaMasterShadow9877;
                    polarVoyageAdMobDeltaMasterShadow987711.PolarVoyageKotlinBetaPulseBeta3653();
                }
                polarVoyageConstraintSetNovaSolarAlpha11054.PolarVoyageSnackbarGammaEclipse2140 = null;
                polarVoyageConstraintSetNovaSolarAlpha11054.PolarVoyageViewRogueMaster4778 = polarVoyageAdMobDeltaMasterShadow9877;
                polarVoyageConstraintSetNovaSolarAlpha11054.PolarVoyageDrawableDeltaHyperion5742++;
                polarVoyageConstraintSetNovaSolarAlpha11054.PolarVoyageViewRogueMaster4778();
                if (!polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
                    long j6 = PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = true;
                    polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageZipVortexCelestial6185.PolarVoyageMotionLayoutTransitionHeroVision4068(this, j6);
                } else if (polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageBitmapVisionAuroraPixel4705) {
                    this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageMotionLayoutTransitionHeroVision4068(8, polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageZipVortexCelestial6185).PolarVoyageMotionLayoutTransitionHeroVision4068();
                }
                if (this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532 == polarVoyageAdMobDeltaMasterShadow9877) {
                    PolarVoyageDatabaseCosmosSpectraSolar3905(PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageMotionLayoutTransitionHeroVision4068, true);
                }
                PolarVoyageDisplayMetricsVortexDragon9516(false);
                if (this.PolarVoyageMotionSceneStormSolarBeta2208) {
                    PolarVoyageLifecycleOlympianOmega3762();
                } else {
                    this.PolarVoyageMotionSceneStormSolarBeta2208 = PolarVoyagePackageManagerCelestialPhoenix8393(this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageViewRogueMaster4778);
                    PolarVoyageAnalyticsSpeedEpic1910();
                }
                PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha11055 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
                if (!this.PolarVoyageAlertDialogNovaXCelestial4954 && this.PolarVoyageViewBindingPulseHeroSpeed5705 && !this.PolarVoyageObserverEliteUltra2793 && !PolarVoyageBitmapVisionAuroraPixel4705() && (polarVoyageAdMobDeltaMasterShadow98776 = polarVoyageConstraintSetNovaSolarAlpha11055.PolarVoyageBottomSheetOmegaNeo1907) != null && polarVoyageAdMobDeltaMasterShadow98776 == polarVoyageConstraintSetNovaSolarAlpha11055.PolarVoyageRotateAnimationCyberCelestialDelta4768 && (polarVoyageAdMobDeltaMasterShadow98777 = polarVoyageAdMobDeltaMasterShadow98776.PolarVoyageCameraPixelBlaze2629) != null && (z5 = polarVoyageAdMobDeltaMasterShadow98777.PolarVoyageBitmapVisionAuroraPixel4705)) {
                    PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(z5);
                    if (((long) ((polarVoyageAdMobDeltaMasterShadow98777.PolarVoyageBitmapVisionAuroraPixel4705() - this.PolarVoyageWithContextPulseSolarHyperion4393) / this.PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageBarcodeScannerInfernoSolarSpark7767().PolarVoyageZipVortexCelestial6185)) <= 10000000) {
                        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow987712 = polarVoyageConstraintSetNovaSolarAlpha11055.PolarVoyageBottomSheetOmegaNeo1907;
                        polarVoyageAdMobDeltaMasterShadow987712.getClass();
                        polarVoyageConstraintSetNovaSolarAlpha11055.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageAdMobDeltaMasterShadow987712.PolarVoyageCameraPixelBlaze2629;
                        polarVoyageConstraintSetNovaSolarAlpha11055.PolarVoyageViewRogueMaster4778();
                        polarVoyageConstraintSetNovaSolarAlpha11055.PolarVoyageBottomSheetOmegaNeo1907.getClass();
                        PolarVoyageServiceStormMasterPixel9641[] polarVoyageServiceStormMasterPixel9641Arr3 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow987713 = polarVoyageConstraintSetNovaSolarAlpha11055.PolarVoyageBottomSheetOmegaNeo1907;
                        if (polarVoyageAdMobDeltaMasterShadow987713 != null) {
                            PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision43652 = polarVoyageAdMobDeltaMasterShadow987713.PolarVoyageSnackbarGammaEclipse2140;
                            for (int i7 = 0; i7 < polarVoyageServiceStormMasterPixel9641Arr3.length; i7++) {
                                if (polarVoyageViewPagerSparkVision43652.PolarVoyageTextInputEditTextNebulaHero6651(i7)) {
                                    PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 = polarVoyageServiceStormMasterPixel9641Arr3[i7];
                                    if (polarVoyageServiceStormMasterPixel9641.PolarVoyageKotlinBetaPulseBeta3653 != null && !polarVoyageServiceStormMasterPixel9641.PolarVoyageDiffUtilTurboStrike5735()) {
                                        PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel96412 = polarVoyageServiceStormMasterPixel9641Arr3[i7];
                                        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(!polarVoyageServiceStormMasterPixel96412.PolarVoyageDiffUtilTurboStrike5735());
                                        if (PolarVoyageServiceStormMasterPixel9641.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageServiceStormMasterPixel96412.PolarVoyageZipVortexCelestial6185)) {
                                            i5 = 3;
                                        } else {
                                            PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX9940 = polarVoyageServiceStormMasterPixel96412.PolarVoyageKotlinBetaPulseBeta3653;
                                            i5 = (polarVoyageGestureDetectorPhoenixNovaX9940 == null || polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageSnackbarGammaEclipse2140 == 0) ? 2 : 4;
                                        }
                                        polarVoyageServiceStormMasterPixel96412.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i5;
                                        PolarVoyageBottomSheetOmegaNeo1907(polarVoyageAdMobDeltaMasterShadow987713, i7, false, polarVoyageAdMobDeltaMasterShadow987713.PolarVoyageBitmapVisionAuroraPixel4705());
                                    }
                                }
                            }
                            if (PolarVoyageBitmapVisionAuroraPixel4705()) {
                                this.PolarVoyageCardViewSpectraTurbo5149 = polarVoyageAdMobDeltaMasterShadow987713.PolarVoyageZipVortexCelestial6185.PolarVoyageTextInputEditTextNebulaHero6651();
                                if (!polarVoyageAdMobDeltaMasterShadow987713.PolarVoyageTextInputEditTextNebulaHero6651()) {
                                    polarVoyageConstraintSetNovaSolarAlpha11055.PolarVoyageDrawableDeltaHyperion5742(polarVoyageAdMobDeltaMasterShadow987713);
                                    PolarVoyageDisplayMetricsVortexDragon9516(false);
                                    PolarVoyageLifecycleOlympianOmega3762();
                                }
                            }
                        }
                    }
                }
                boolean z6 = this.PolarVoyageViewBindingPulseHeroSpeed5705;
                PolarVoyageServiceStormMasterPixel9641[] polarVoyageServiceStormMasterPixel9641Arr4 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha11056 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
                polarVoyageAdMobDeltaMasterShadow98772 = polarVoyageConstraintSetNovaSolarAlpha11056.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                if (polarVoyageAdMobDeltaMasterShadow98772 != null) {
                    if (polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageCameraPixelBlaze2629 == null || this.PolarVoyageAlertDialogNovaXCelestial4954) {
                        if (polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageBottomSheetOmegaNeo1907 || this.PolarVoyageAlertDialogNovaXCelestial4954) {
                            for (PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel96413 : polarVoyageServiceStormMasterPixel9641Arr4) {
                                if (polarVoyageServiceStormMasterPixel96413.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageAdMobDeltaMasterShadow98772) != null) {
                                    PolarVoyageGestureDetectorPhoenixNovaX9940 PolarVoyageBarcodeScannerInfernoSolarSpark77672 = polarVoyageServiceStormMasterPixel96413.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageAdMobDeltaMasterShadow98772);
                                    PolarVoyageBarcodeScannerInfernoSolarSpark77672.getClass();
                                    if (PolarVoyageBarcodeScannerInfernoSolarSpark77672.PolarVoyageViewRogueMaster4778()) {
                                        long j7 = polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageDiffUtilTurboStrike5735;
                                        long j8 = (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? -9223372036854775807L : j7 + polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageContentProviderHyperSpark3838;
                                        PolarVoyageGestureDetectorPhoenixNovaX9940 PolarVoyageBarcodeScannerInfernoSolarSpark77673 = polarVoyageServiceStormMasterPixel96413.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageAdMobDeltaMasterShadow98772);
                                        PolarVoyageBarcodeScannerInfernoSolarSpark77673.getClass();
                                        PolarVoyageServiceStormMasterPixel9641.PolarVoyageViewRogueMaster4778(PolarVoyageBarcodeScannerInfernoSolarSpark77673, j8);
                                    }
                                }
                            }
                        }
                    } else if (polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageBitmapVisionAuroraPixel4705) {
                        int i8 = 0;
                        while (true) {
                            if (i8 < polarVoyageServiceStormMasterPixel9641Arr4.length) {
                                PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel96414 = polarVoyageServiceStormMasterPixel9641Arr4[i8];
                                if (!polarVoyageServiceStormMasterPixel96414.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageAdMobDeltaMasterShadow98772, polarVoyageServiceStormMasterPixel96414.PolarVoyageZipVortexCelestial6185) || !polarVoyageServiceStormMasterPixel96414.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageAdMobDeltaMasterShadow98772, polarVoyageServiceStormMasterPixel96414.PolarVoyageKotlinBetaPulseBeta3653)) {
                                    break;
                                } else {
                                    i8++;
                                }
                            } else if (!PolarVoyageBitmapVisionAuroraPixel4705() || polarVoyageConstraintSetNovaSolarAlpha11056.PolarVoyageBottomSheetOmegaNeo1907 != polarVoyageConstraintSetNovaSolarAlpha11056.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                                PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow987714 = polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageCameraPixelBlaze2629;
                                if (polarVoyageAdMobDeltaMasterShadow987714.PolarVoyageBitmapVisionAuroraPixel4705 || this.PolarVoyageWithContextPulseSolarHyperion4393 >= polarVoyageAdMobDeltaMasterShadow987714.PolarVoyageBitmapVisionAuroraPixel4705()) {
                                    boolean z7 = polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageCameraPixelBlaze2629.PolarVoyageBitmapVisionAuroraPixel4705;
                                    if (z7) {
                                        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(z7);
                                    }
                                    PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision43653 = polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageSnackbarGammaEclipse2140;
                                    PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow987715 = polarVoyageConstraintSetNovaSolarAlpha11056.PolarVoyageBottomSheetOmegaNeo1907;
                                    PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow987716 = polarVoyageConstraintSetNovaSolarAlpha11056.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                                    if (polarVoyageAdMobDeltaMasterShadow987715 == polarVoyageAdMobDeltaMasterShadow987716) {
                                        polarVoyageAdMobDeltaMasterShadow987716.getClass();
                                        polarVoyageConstraintSetNovaSolarAlpha11056.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageAdMobDeltaMasterShadow987716.PolarVoyageCameraPixelBlaze2629;
                                    }
                                    PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow987717 = polarVoyageConstraintSetNovaSolarAlpha11056.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                                    polarVoyageAdMobDeltaMasterShadow987717.getClass();
                                    polarVoyageConstraintSetNovaSolarAlpha11056.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageAdMobDeltaMasterShadow987717.PolarVoyageCameraPixelBlaze2629;
                                    polarVoyageConstraintSetNovaSolarAlpha11056.PolarVoyageViewRogueMaster4778();
                                    PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow987718 = polarVoyageConstraintSetNovaSolarAlpha11056.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                                    polarVoyageAdMobDeltaMasterShadow987718.getClass();
                                    PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision43654 = polarVoyageAdMobDeltaMasterShadow987718.PolarVoyageSnackbarGammaEclipse2140;
                                    PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow5566 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185;
                                    PolarVoyageSharedFlowRogueDeltaForce1577(polarVoyageRoomDaoPulseShadow5566, polarVoyageAdMobDeltaMasterShadow987718.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185, polarVoyageRoomDaoPulseShadow5566, polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185, -9223372036854775807L, false);
                                    if (polarVoyageAdMobDeltaMasterShadow987718.PolarVoyageBitmapVisionAuroraPixel4705 && ((z6 && this.PolarVoyageCardViewSpectraTurbo5149 != j) || polarVoyageAdMobDeltaMasterShadow987718.PolarVoyageZipVortexCelestial6185.PolarVoyageTextInputEditTextNebulaHero6651() != j)) {
                                        this.PolarVoyageCardViewSpectraTurbo5149 = j;
                                        boolean z8 = z6 && !this.PolarVoyageObserverEliteUltra2793;
                                        if (z8) {
                                            int i9 = 0;
                                            while (true) {
                                                if (i9 >= polarVoyageServiceStormMasterPixel9641Arr4.length) {
                                                    break;
                                                }
                                                boolean PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageViewPagerSparkVision43654.PolarVoyageTextInputEditTextNebulaHero6651(i9);
                                                PolarVoyagePagingSpectraDelta6398[] polarVoyagePagingSpectraDelta6398Arr = (PolarVoyagePagingSpectraDelta6398[]) polarVoyageViewPagerSparkVision43654.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                                                if (PolarVoyageTextInputEditTextNebulaHero6651 && polarVoyageServiceStormMasterPixel9641Arr4[i9].PolarVoyageZipVortexCelestial6185.PolarVoyageStrictModeLegendEpic1532 != -2 && !PolarVoyageScaleGestureDetectorSpeedGamma3567.PolarVoyageZipVortexCelestial6185(polarVoyagePagingSpectraDelta6398Arr[i9].PolarVoyageItemDecorationUltraDeltaEpic7485().PolarVoyageSnackbarGammaEclipse2140, polarVoyagePagingSpectraDelta6398Arr[i9].PolarVoyageItemDecorationUltraDeltaEpic7485().PolarVoyageBottomSheetOmegaNeo1907) && !polarVoyageServiceStormMasterPixel9641Arr4[i9].PolarVoyageDiffUtilTurboStrike5735()) {
                                                    z8 = false;
                                                    break;
                                                }
                                                i9++;
                                            }
                                        }
                                        if (!z8) {
                                            long PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageAdMobDeltaMasterShadow987718.PolarVoyageBitmapVisionAuroraPixel4705();
                                            for (PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel96415 : polarVoyageServiceStormMasterPixel9641Arr4) {
                                                PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99402 = polarVoyageServiceStormMasterPixel96415.PolarVoyageKotlinBetaPulseBeta3653;
                                                PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99403 = polarVoyageServiceStormMasterPixel96415.PolarVoyageZipVortexCelestial6185;
                                                if (PolarVoyageServiceStormMasterPixel9641.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageGestureDetectorPhoenixNovaX99403) && (i4 = polarVoyageServiceStormMasterPixel96415.PolarVoyageBarcodeScannerInfernoSolarSpark7767) != 4 && i4 != 2) {
                                                    PolarVoyageServiceStormMasterPixel9641.PolarVoyageViewRogueMaster4778(polarVoyageGestureDetectorPhoenixNovaX99403, PolarVoyageBitmapVisionAuroraPixel4705);
                                                }
                                                if (polarVoyageGestureDetectorPhoenixNovaX99402 != null) {
                                                    if ((polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageSnackbarGammaEclipse2140 != 0) && polarVoyageServiceStormMasterPixel96415.PolarVoyageBarcodeScannerInfernoSolarSpark7767 != 3) {
                                                        PolarVoyageServiceStormMasterPixel9641.PolarVoyageViewRogueMaster4778(polarVoyageGestureDetectorPhoenixNovaX99402, PolarVoyageBitmapVisionAuroraPixel4705);
                                                    }
                                                }
                                            }
                                            if (!polarVoyageAdMobDeltaMasterShadow987718.PolarVoyageTextInputEditTextNebulaHero6651()) {
                                                polarVoyageConstraintSetNovaSolarAlpha11056.PolarVoyageDrawableDeltaHyperion5742(polarVoyageAdMobDeltaMasterShadow987718);
                                                PolarVoyageDisplayMetricsVortexDragon9516(false);
                                                PolarVoyageLifecycleOlympianOmega3762();
                                            }
                                        }
                                    }
                                    for (PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel96416 : polarVoyageServiceStormMasterPixel9641Arr4) {
                                        long PolarVoyageBitmapVisionAuroraPixel47052 = polarVoyageAdMobDeltaMasterShadow987718.PolarVoyageBitmapVisionAuroraPixel4705();
                                        PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99404 = polarVoyageServiceStormMasterPixel96416.PolarVoyageZipVortexCelestial6185;
                                        int i10 = polarVoyageServiceStormMasterPixel96416.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                        boolean PolarVoyageTextInputEditTextNebulaHero66512 = polarVoyageViewPagerSparkVision43653.PolarVoyageTextInputEditTextNebulaHero6651(i10);
                                        boolean PolarVoyageTextInputEditTextNebulaHero66513 = polarVoyageViewPagerSparkVision43654.PolarVoyageTextInputEditTextNebulaHero6651(i10);
                                        PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99405 = polarVoyageServiceStormMasterPixel96416.PolarVoyageKotlinBetaPulseBeta3653;
                                        if (polarVoyageGestureDetectorPhoenixNovaX99405 == null || (i3 = polarVoyageServiceStormMasterPixel96416.PolarVoyageBarcodeScannerInfernoSolarSpark7767) == 3 || (i3 == 0 && PolarVoyageServiceStormMasterPixel9641.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageGestureDetectorPhoenixNovaX99404))) {
                                            polarVoyageGestureDetectorPhoenixNovaX99405 = polarVoyageGestureDetectorPhoenixNovaX99404;
                                        }
                                        if (!PolarVoyageTextInputEditTextNebulaHero66512 || polarVoyageGestureDetectorPhoenixNovaX99405.PolarVoyageDisplayMetricsVortexDragon9516) {
                                            c = 65534;
                                        } else {
                                            int i11 = polarVoyageGestureDetectorPhoenixNovaX99404.PolarVoyageStrictModeLegendEpic1532;
                                            c = 65534;
                                            boolean z9 = i11 == -2;
                                            PolarVoyageNestedScrollViewDragonNebulaPrime2058 polarVoyageNestedScrollViewDragonNebulaPrime2058 = ((PolarVoyageNestedScrollViewDragonNebulaPrime2058[]) polarVoyageViewPagerSparkVision43653.PolarVoyageStrictModeLegendEpic1532)[i10];
                                            PolarVoyageNestedScrollViewDragonNebulaPrime2058 polarVoyageNestedScrollViewDragonNebulaPrime20582 = ((PolarVoyageNestedScrollViewDragonNebulaPrime2058[]) polarVoyageViewPagerSparkVision43654.PolarVoyageStrictModeLegendEpic1532)[i10];
                                            if (!PolarVoyageTextInputEditTextNebulaHero66513 || !Objects.equals(polarVoyageNestedScrollViewDragonNebulaPrime20582, polarVoyageNestedScrollViewDragonNebulaPrime2058) || z9 || polarVoyageServiceStormMasterPixel96416.PolarVoyageDiffUtilTurboStrike5735()) {
                                                PolarVoyageServiceStormMasterPixel9641.PolarVoyageViewRogueMaster4778(polarVoyageGestureDetectorPhoenixNovaX99405, PolarVoyageBitmapVisionAuroraPixel47052);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha11057 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
                polarVoyageAdMobDeltaMasterShadow98773 = polarVoyageConstraintSetNovaSolarAlpha11057.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                if (polarVoyageAdMobDeltaMasterShadow98773 != null && polarVoyageConstraintSetNovaSolarAlpha11057.PolarVoyageStrictModeLegendEpic1532 != polarVoyageAdMobDeltaMasterShadow98773 && !polarVoyageAdMobDeltaMasterShadow98773.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                    polarVoyageServiceStormMasterPixel9641Arr2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision43655 = polarVoyageAdMobDeltaMasterShadow98773.PolarVoyageSnackbarGammaEclipse2140;
                    z3 = true;
                    for (i2 = 0; i2 < polarVoyageServiceStormMasterPixel9641Arr2.length; i2++) {
                        int PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageServiceStormMasterPixel9641Arr2[i2].PolarVoyageKotlinBetaPulseBeta3653();
                        PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel96417 = polarVoyageServiceStormMasterPixel9641Arr2[i2];
                        PolarVoyageDiffUtilSpeedCelestial7413 polarVoyageDiffUtilSpeedCelestial7413 = this.PolarVoyageDisplayMetricsVortexDragon9516;
                        int PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageServiceStormMasterPixel96417.PolarVoyageRotateAnimationCyberCelestialDelta4768(polarVoyageServiceStormMasterPixel96417.PolarVoyageZipVortexCelestial6185, polarVoyageAdMobDeltaMasterShadow98773, polarVoyageViewPagerSparkVision43655, polarVoyageDiffUtilSpeedCelestial7413);
                        int PolarVoyageRotateAnimationCyberCelestialDelta47682 = polarVoyageServiceStormMasterPixel96417.PolarVoyageRotateAnimationCyberCelestialDelta4768(polarVoyageServiceStormMasterPixel96417.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageAdMobDeltaMasterShadow98773, polarVoyageViewPagerSparkVision43655, polarVoyageDiffUtilSpeedCelestial7413);
                        if (PolarVoyageRotateAnimationCyberCelestialDelta4768 == 1) {
                            PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageRotateAnimationCyberCelestialDelta47682;
                        }
                        if ((PolarVoyageRotateAnimationCyberCelestialDelta4768 & 2) != 0 && (z4 = this.PolarVoyageClipboardManagerAuroraPixel8666) && z4) {
                            this.PolarVoyageClipboardManagerAuroraPixel8666 = false;
                            if (this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageContentProviderHyperSpark3838) {
                                this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageDiffUtilTurboStrike5735(2);
                            }
                        }
                        this.PolarVoyageMapTurboRogueTitan9291 -= PolarVoyageKotlinBetaPulseBeta3653 - polarVoyageServiceStormMasterPixel9641Arr2[i2].PolarVoyageKotlinBetaPulseBeta3653();
                        z3 &= (PolarVoyageRotateAnimationCyberCelestialDelta4768 & 1) != 0;
                    }
                    if (z3) {
                        for (int i12 = 0; i12 < polarVoyageServiceStormMasterPixel9641Arr2.length; i12++) {
                            if (polarVoyageViewPagerSparkVision43655.PolarVoyageTextInputEditTextNebulaHero6651(i12)) {
                                if (!(polarVoyageServiceStormMasterPixel9641Arr2[i12].PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageAdMobDeltaMasterShadow98773) != null)) {
                                    PolarVoyageBottomSheetOmegaNeo1907(polarVoyageAdMobDeltaMasterShadow98773, i12, false, polarVoyageAdMobDeltaMasterShadow98773.PolarVoyageBitmapVisionAuroraPixel4705());
                                }
                            }
                        }
                    }
                    if (z3) {
                        polarVoyageConstraintSetNovaSolarAlpha11057.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageItemDecorationUltraDeltaEpic7485 = true;
                    }
                }
                polarVoyageServiceStormMasterPixel9641Arr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                polarVoyageConstraintSetNovaSolarAlpha1105 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
                z = false;
                while (PolarVoyageConstraintSetCloneCelestialHero1930() && !this.PolarVoyageAlertDialogNovaXCelestial4954 && (polarVoyageAdMobDeltaMasterShadow98774 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageStrictModeLegendEpic1532) != null && (polarVoyageAdMobDeltaMasterShadow98775 = polarVoyageAdMobDeltaMasterShadow98774.PolarVoyageCameraPixelBlaze2629) != null && this.PolarVoyageWithContextPulseSolarHyperion4393 >= polarVoyageAdMobDeltaMasterShadow98775.PolarVoyageBitmapVisionAuroraPixel4705() && polarVoyageAdMobDeltaMasterShadow98775.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                    if (z) {
                        PolarVoyageFCMCelestialCosmosPixel3711();
                    }
                    this.PolarVoyageObserverEliteUltra2793 = false;
                    PolarVoyageZipVortexCelestial6185 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageZipVortexCelestial6185();
                    PolarVoyageZipVortexCelestial6185.getClass();
                    if (this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185.equals(PolarVoyageZipVortexCelestial6185.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185)) {
                        PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        if (polarVoyageCombineBlazePulse1497.PolarVoyageMotionLayoutTransitionHeroVision4068 == -1) {
                            PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse14972 = PolarVoyageZipVortexCelestial6185.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185;
                            if (polarVoyageCombineBlazePulse14972.PolarVoyageMotionLayoutTransitionHeroVision4068 == -1 && polarVoyageCombineBlazePulse1497.PolarVoyageBitmapVisionAuroraPixel4705 != polarVoyageCombineBlazePulse14972.PolarVoyageBitmapVisionAuroraPixel4705) {
                                z2 = true;
                                PolarVoyageChipGroupHyperCelestial9288 polarVoyageChipGroupHyperCelestial92882 = PolarVoyageZipVortexCelestial6185.PolarVoyageTextInputEditTextNebulaHero6651;
                                boolean z10 = z2;
                                PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse14973 = polarVoyageChipGroupHyperCelestial92882.PolarVoyageZipVortexCelestial6185;
                                long j9 = polarVoyageChipGroupHyperCelestial92882.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageCombineBlazePulse14973, j9, polarVoyageChipGroupHyperCelestial92882.PolarVoyageBarcodeScannerInfernoSolarSpark7767, j9, !z10, 0);
                                PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587();
                                PolarVoyageIntentNovaTitanium7230();
                                if (PolarVoyageBitmapVisionAuroraPixel4705() && PolarVoyageZipVortexCelestial6185 == polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageBottomSheetOmegaNeo1907) {
                                    for (PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel96418 : polarVoyageServiceStormMasterPixel9641Arr) {
                                        int i13 = polarVoyageServiceStormMasterPixel96418.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                                        if (i13 == 3 || i13 == 4) {
                                            boolean z11 = i13 == 4;
                                            PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99406 = polarVoyageServiceStormMasterPixel96418.PolarVoyageZipVortexCelestial6185;
                                            PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99407 = polarVoyageServiceStormMasterPixel96418.PolarVoyageKotlinBetaPulseBeta3653;
                                            if (z11) {
                                                polarVoyageGestureDetectorPhoenixNovaX99407.getClass();
                                                polarVoyageGestureDetectorPhoenixNovaX99407.PolarVoyageKotlinBetaPulseBeta3653(17, polarVoyageGestureDetectorPhoenixNovaX99406);
                                            } else {
                                                polarVoyageGestureDetectorPhoenixNovaX99407.getClass();
                                                polarVoyageGestureDetectorPhoenixNovaX99406.PolarVoyageKotlinBetaPulseBeta3653(17, polarVoyageGestureDetectorPhoenixNovaX99407);
                                            }
                                            polarVoyageServiceStormMasterPixel96418.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageServiceStormMasterPixel96418.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == 4 ? 0 : 1;
                                        } else if (i13 == 2) {
                                            polarVoyageServiceStormMasterPixel96418.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 0;
                                        }
                                    }
                                }
                                if (this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBitmapVisionAuroraPixel4705 == 3) {
                                    PolarVoyageHandlerFusionOlympian7396();
                                }
                                PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision43656 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageStrictModeLegendEpic1532.PolarVoyageSnackbarGammaEclipse2140;
                                for (i = 0; i < polarVoyageServiceStormMasterPixel9641Arr.length; i++) {
                                    if (polarVoyageViewPagerSparkVision43656.PolarVoyageTextInputEditTextNebulaHero6651(i)) {
                                        PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel96419 = polarVoyageServiceStormMasterPixel9641Arr[i];
                                        PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99408 = polarVoyageServiceStormMasterPixel96419.PolarVoyageKotlinBetaPulseBeta3653;
                                        PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99409 = polarVoyageServiceStormMasterPixel96419.PolarVoyageZipVortexCelestial6185;
                                        if (PolarVoyageServiceStormMasterPixel9641.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageGestureDetectorPhoenixNovaX99409)) {
                                            polarVoyageGestureDetectorPhoenixNovaX99409.PolarVoyageItemDecorationUltraDeltaEpic7485();
                                        } else if (polarVoyageGestureDetectorPhoenixNovaX99408 != null) {
                                            if (polarVoyageGestureDetectorPhoenixNovaX99408.PolarVoyageSnackbarGammaEclipse2140 != 0) {
                                                polarVoyageGestureDetectorPhoenixNovaX99408.PolarVoyageItemDecorationUltraDeltaEpic7485();
                                            }
                                        }
                                    }
                                }
                                z = true;
                            }
                        }
                    }
                    z2 = false;
                    PolarVoyageChipGroupHyperCelestial9288 polarVoyageChipGroupHyperCelestial928822 = PolarVoyageZipVortexCelestial6185.PolarVoyageTextInputEditTextNebulaHero6651;
                    boolean z102 = z2;
                    PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse149732 = polarVoyageChipGroupHyperCelestial928822.PolarVoyageZipVortexCelestial6185;
                    long j92 = polarVoyageChipGroupHyperCelestial928822.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageCombineBlazePulse149732, j92, polarVoyageChipGroupHyperCelestial928822.PolarVoyageBarcodeScannerInfernoSolarSpark7767, j92, !z102, 0);
                    PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587();
                    PolarVoyageIntentNovaTitanium7230();
                    if (PolarVoyageBitmapVisionAuroraPixel4705()) {
                        while (r2 < r1) {
                        }
                    }
                    if (this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBitmapVisionAuroraPixel4705 == 3) {
                    }
                    PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision436562 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageStrictModeLegendEpic1532.PolarVoyageSnackbarGammaEclipse2140;
                    while (i < polarVoyageServiceStormMasterPixel9641Arr.length) {
                    }
                    z = true;
                }
                this.PolarVoyageDelayCyberQuantumEclipse8687.getClass();
            }
        }
        j = -9223372036854775807L;
        if (this.PolarVoyageMotionSceneStormSolarBeta2208) {
        }
        PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha110552 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
        if (!this.PolarVoyageAlertDialogNovaXCelestial4954) {
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(z5);
            if (((long) ((polarVoyageAdMobDeltaMasterShadow98777.PolarVoyageBitmapVisionAuroraPixel4705() - this.PolarVoyageWithContextPulseSolarHyperion4393) / this.PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageBarcodeScannerInfernoSolarSpark7767().PolarVoyageZipVortexCelestial6185)) <= 10000000) {
            }
        }
        boolean z62 = this.PolarVoyageViewBindingPulseHeroSpeed5705;
        PolarVoyageServiceStormMasterPixel9641[] polarVoyageServiceStormMasterPixel9641Arr42 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha110562 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
        polarVoyageAdMobDeltaMasterShadow98772 = polarVoyageConstraintSetNovaSolarAlpha110562.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (polarVoyageAdMobDeltaMasterShadow98772 != null) {
        }
        PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha110572 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
        polarVoyageAdMobDeltaMasterShadow98773 = polarVoyageConstraintSetNovaSolarAlpha110572.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (polarVoyageAdMobDeltaMasterShadow98773 != null) {
            polarVoyageServiceStormMasterPixel9641Arr2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision436552 = polarVoyageAdMobDeltaMasterShadow98773.PolarVoyageSnackbarGammaEclipse2140;
            z3 = true;
            while (i2 < polarVoyageServiceStormMasterPixel9641Arr2.length) {
            }
            if (z3) {
            }
            if (z3) {
            }
        }
        polarVoyageServiceStormMasterPixel9641Arr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        polarVoyageConstraintSetNovaSolarAlpha1105 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
        z = false;
        while (PolarVoyageConstraintSetCloneCelestialHero1930()) {
            if (z) {
            }
            this.PolarVoyageObserverEliteUltra2793 = false;
            PolarVoyageZipVortexCelestial6185 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageZipVortexCelestial6185();
            PolarVoyageZipVortexCelestial6185.getClass();
            if (this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185.equals(PolarVoyageZipVortexCelestial6185.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185)) {
            }
            z2 = false;
            PolarVoyageChipGroupHyperCelestial9288 polarVoyageChipGroupHyperCelestial9288222 = PolarVoyageZipVortexCelestial6185.PolarVoyageTextInputEditTextNebulaHero6651;
            boolean z1022 = z2;
            PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497322 = polarVoyageChipGroupHyperCelestial9288222.PolarVoyageZipVortexCelestial6185;
            long j922 = polarVoyageChipGroupHyperCelestial9288222.PolarVoyageMotionLayoutTransitionHeroVision4068;
            this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageCombineBlazePulse1497322, j922, polarVoyageChipGroupHyperCelestial9288222.PolarVoyageBarcodeScannerInfernoSolarSpark7767, j922, !z1022, 0);
            PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587();
            PolarVoyageIntentNovaTitanium7230();
            if (PolarVoyageBitmapVisionAuroraPixel4705()) {
            }
            if (this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBitmapVisionAuroraPixel4705 == 3) {
            }
            PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision4365622 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageStrictModeLegendEpic1532.PolarVoyageSnackbarGammaEclipse2140;
            while (i < polarVoyageServiceStormMasterPixel9641Arr.length) {
            }
            z = true;
        }
        this.PolarVoyageDelayCyberQuantumEclipse8687.getClass();
    }

    public final void PolarVoyageAlarmManagerBetaMaxPhantom7852(boolean z, boolean z2) {
        long j;
        this.PolarVoyageColorStateListEliteStrikeOlympian8131 = z;
        if (!z || z2) {
            j = -9223372036854775807L;
        } else {
            this.PolarVoyageMotionLayoutForceEpicAurora7183.getClass();
            j = SystemClock.elapsedRealtime();
        }
        this.PolarVoyageKeyframeEpicNovaXCyber9821 = j;
    }

    public final void PolarVoyageAlarmManagerShadowHyperBeta8339(PolarVoyageBindingAdapterStrikeCosmos6770 polarVoyageBindingAdapterStrikeCosmos6770) {
        PolarVoyageSQLiteTitanForceLegend7380 polarVoyageSQLiteTitanForceLegend7380 = this.PolarVoyageContentProviderHyperSpark3838;
        PolarVoyagePropertyValuesHolderHyperionUltra8479 polarVoyagePropertyValuesHolderHyperionUltra8479 = this.PolarVoyageSnackbarGammaEclipse2140;
        try {
            PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803(true, false, true, false);
            PolarVoyageGuidelineStormSolar2850();
            PolarVoyageRemoteModelManagerPulseMaxNovaX6329 polarVoyageRemoteModelManagerPulseMaxNovaX6329 = this.PolarVoyageCameraPixelBlaze2629;
            PolarVoyageClipboardManagerUltraRogue9881 polarVoyageClipboardManagerUltraRogue9881 = this.PolarVoyageLifecycleOlympianOmega3762;
            ConcurrentHashMap concurrentHashMap = polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageContentProviderHyperSpark3838;
            PolarVoyageInAppPurchaseMaxEpic8738 polarVoyageInAppPurchaseMaxEpic8738 = (PolarVoyageInAppPurchaseMaxEpic8738) concurrentHashMap.get(polarVoyageClipboardManagerUltraRogue9881);
            if (polarVoyageInAppPurchaseMaxEpic8738 != null) {
                int i = polarVoyageInAppPurchaseMaxEpic8738.PolarVoyageZipVortexCelestial6185 - 1;
                polarVoyageInAppPurchaseMaxEpic8738.PolarVoyageZipVortexCelestial6185 = i;
                if (i == 0) {
                    concurrentHashMap.remove(polarVoyageClipboardManagerUltraRogue9881);
                    polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageKotlinBetaPulseBeta3653();
                }
            }
            if (polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageContentProviderHyperSpark3838.isEmpty()) {
                polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageRemoteModelManagerOlympianCelestial9141 = -1L;
            }
            PolarVoyageContextAlphaAurora8980 polarVoyageContextAlphaAurora8980 = this.PolarVoyageCardViewAlphaVortexCelestial9747;
            polarVoyageContextAlphaAurora8980.PolarVoyageKotlinBetaPulseBeta3653 = null;
            polarVoyageContextAlphaAurora8980.PolarVoyageZipVortexCelestial6185();
            polarVoyageContextAlphaAurora8980.PolarVoyageMotionLayoutTransitionHeroVision4068(0);
            this.PolarVoyageBottomSheetOmegaNeo1907.PolarVoyageStrictModeLegendEpic1532();
            PolarVoyageCombineBlazeSparkInferno2844(1);
        } finally {
            polarVoyagePropertyValuesHolderHyperionUltra8479.PolarVoyageZipVortexCelestial6185.removeCallbacksAndMessages(null);
            polarVoyageSQLiteTitanForceLegend7380.PolarVoyageKotlinBetaPulseBeta3653();
            polarVoyageBindingAdapterStrikeCosmos6770.PolarVoyageKotlinBetaPulseBeta3653();
        }
    }

    public final void PolarVoyageAlertDialogCyberHeroQuantum3938(PolarVoyageTransitionBlazePixel9380 polarVoyageTransitionBlazePixel9380, float f, boolean z, boolean z2) {
        PolarVoyageTransitionBlazePixel9380 polarVoyageTransitionBlazePixel93802;
        int i;
        if (z) {
            if (z2) {
                this.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587.PolarVoyageKotlinBetaPulseBeta3653(1);
            }
            PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
            PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61882 = new PolarVoyageMaterialButtonDragonCyberMega6188(polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageZipVortexCelestial6185, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageBarcodeScannerInfernoSolarSpark7767, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageBitmapVisionAuroraPixel4705, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageDiffUtilTurboStrike5735, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageTextInputEditTextNebulaHero6651, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageItemDecorationUltraDeltaEpic7485, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageStrictModeLegendEpic1532, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageRotateAnimationCyberCelestialDelta4768, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageBottomSheetOmegaNeo1907, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageViewRogueMaster4778, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageCameraPixelBlaze2629, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageDrawableDeltaHyperion5742, polarVoyageTransitionBlazePixel9380, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageRemoteModelManagerOlympianCelestial9141, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageNavigationViewHyperHyperHyperion1793, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageAnimatorSetSparkUltraMax8233, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageBitmapMaxTitanTitan7960, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageContentProviderHyperSpark3838);
            polarVoyageTransitionBlazePixel93802 = polarVoyageTransitionBlazePixel9380;
            this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = polarVoyageMaterialButtonDragonCyberMega61882;
        } else {
            polarVoyageTransitionBlazePixel93802 = polarVoyageTransitionBlazePixel9380;
        }
        float f2 = polarVoyageTransitionBlazePixel93802.PolarVoyageZipVortexCelestial6185;
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532;
        while (true) {
            i = 0;
            if (polarVoyageAdMobDeltaMasterShadow9877 == null) {
                break;
            }
            PolarVoyagePagingSpectraDelta6398[] polarVoyagePagingSpectraDelta6398Arr = (PolarVoyagePagingSpectraDelta6398[]) polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            int length = polarVoyagePagingSpectraDelta6398Arr.length;
            while (i < length) {
                PolarVoyagePagingSpectraDelta6398 polarVoyagePagingSpectraDelta6398 = polarVoyagePagingSpectraDelta6398Arr[i];
                if (polarVoyagePagingSpectraDelta6398 != null) {
                    polarVoyagePagingSpectraDelta6398.PolarVoyageStrictModeLegendEpic1532(f2);
                }
                i++;
            }
            polarVoyageAdMobDeltaMasterShadow9877 = polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageCameraPixelBlaze2629;
        }
        PolarVoyageServiceStormMasterPixel9641[] polarVoyageServiceStormMasterPixel9641Arr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int length2 = polarVoyageServiceStormMasterPixel9641Arr.length;
        while (i < length2) {
            PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 = polarVoyageServiceStormMasterPixel9641Arr[i];
            float f3 = polarVoyageTransitionBlazePixel93802.PolarVoyageZipVortexCelestial6185;
            polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185.PolarVoyageLifecycleOlympianOmega3762(f, f3);
            PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX9940 = polarVoyageServiceStormMasterPixel9641.PolarVoyageKotlinBetaPulseBeta3653;
            if (polarVoyageGestureDetectorPhoenixNovaX9940 != null) {
                polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageLifecycleOlympianOmega3762(f, f3);
            }
            i++;
        }
    }

    public final void PolarVoyageAnalyticsSpeedEpic1910() {
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageViewRogueMaster4778;
        boolean z = this.PolarVoyageMotionSceneStormSolarBeta2208 || (polarVoyageAdMobDeltaMasterShadow9877 != null && polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185());
        PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
        if (z != polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageTextInputEditTextNebulaHero6651) {
            this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageMotionLayoutTransitionHeroVision4068(z);
        }
    }

    public final void PolarVoyageAnimatorSetSparkUltraMax8233(PolarVoyageServiceVortexCosmosAlpha1023 polarVoyageServiceVortexCosmosAlpha1023) {
        PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha1105 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageViewRogueMaster4778;
        if (polarVoyageAdMobDeltaMasterShadow9877 != null && polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageZipVortexCelestial6185 == polarVoyageServiceVortexCosmosAlpha1023) {
            polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageCameraPixelBlaze2629(this.PolarVoyageWithContextPulseSolarHyperion4393);
            PolarVoyageLifecycleOlympianOmega3762();
            return;
        }
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98772 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageCameraPixelBlaze2629;
        if (polarVoyageAdMobDeltaMasterShadow98772 == null || polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageZipVortexCelestial6185 != polarVoyageServiceVortexCosmosAlpha1023) {
            return;
        }
        PolarVoyageDiffUtilDragonSpeedEclipse6225();
    }

    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        for (PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 : this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            PolarVoyageTextureViewThunderTurboStrike2293 polarVoyageTextureViewThunderTurboStrike2293 = this.PolarVoyageAlarmManagerShadowHyperBeta8339 ? this.PolarVoyageToolbarEclipseInfernoHero6368 : null;
            polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185.PolarVoyageKotlinBetaPulseBeta3653(18, polarVoyageTextureViewThunderTurboStrike2293);
            PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX9940 = polarVoyageServiceStormMasterPixel9641.PolarVoyageKotlinBetaPulseBeta3653;
            if (polarVoyageGestureDetectorPhoenixNovaX9940 != null) {
                polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageKotlinBetaPulseBeta3653(18, polarVoyageTextureViewThunderTurboStrike2293);
            }
        }
    }

    public final void PolarVoyageBitmapMaxTitanTitan7960(IOException iOException, int i) {
        PolarVoyageAssetManagerQuantumSpectraPhoenix6233 polarVoyageAssetManagerQuantumSpectraPhoenix6233 = new PolarVoyageAssetManagerQuantumSpectraPhoenix6233(0, iOException, i);
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532;
        if (polarVoyageAdMobDeltaMasterShadow9877 != null) {
            polarVoyageAssetManagerQuantumSpectraPhoenix6233 = polarVoyageAssetManagerQuantumSpectraPhoenix6233.PolarVoyageZipVortexCelestial6185(polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185);
        }
        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageAnimatorSetSparkUltraMax8233("ExoPlayerImplInternal", "Playback error", polarVoyageAssetManagerQuantumSpectraPhoenix6233);
        PolarVoyageProximitySensorStrikeNeo2764(false, false);
        this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageDiffUtilTurboStrike5735(polarVoyageAssetManagerQuantumSpectraPhoenix6233);
    }

    public final boolean PolarVoyageBitmapVisionAuroraPixel4705() {
        if (!this.PolarVoyageViewBindingPulseHeroSpeed5705) {
            return false;
        }
        for (PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 : this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            if (polarVoyageServiceStormMasterPixel9641.PolarVoyageDiffUtilTurboStrike5735()) {
                return true;
            }
        }
        return false;
    }

    public final void PolarVoyageBottomSheetNovaXNova5051(boolean z) {
        if (!z) {
            PolarVoyageAccelerometerMaxShadowCosmos8778 polarVoyageAccelerometerMaxShadowCosmos8778 = this.PolarVoyageConfigurationMaxSpectraForce5418;
            PolarVoyagePropertyValuesHolderHyperionUltra8479 polarVoyagePropertyValuesHolderHyperionUltra8479 = this.PolarVoyageSnackbarGammaEclipse2140;
            if (polarVoyageAccelerometerMaxShadowCosmos8778 != null && this.PolarVoyageGuidelineStormSolar2850 && !polarVoyagePropertyValuesHolderHyperionUltra8479.PolarVoyageZipVortexCelestial6185.hasMessages(37)) {
                this.PolarVoyageCanvasElitePhoenix4750++;
            }
            int i = this.PolarVoyageCanvasElitePhoenix4750;
            if (i > 0) {
                this.PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageBarcodeScannerInfernoSolarSpark7767(new PolarVoyageLightSensorSparkBlazeTitanium9192(this, i));
            }
            this.PolarVoyageCanvasElitePhoenix4750 = 0;
            this.PolarVoyageGuidelineStormSolar2850 = false;
            polarVoyagePropertyValuesHolderHyperionUltra8479.PolarVoyageBitmapVisionAuroraPixel4705(37);
            PolarVoyageAccelerometerMaxShadowCosmos8778 polarVoyageAccelerometerMaxShadowCosmos87782 = this.PolarVoyageConfigurationMaxSpectraForce5418;
            if (polarVoyageAccelerometerMaxShadowCosmos87782 != null) {
                PolarVoyageProcessCameraProviderQuantumCosmosPulse5576(polarVoyageAccelerometerMaxShadowCosmos87782);
                this.PolarVoyageConfigurationMaxSpectraForce5418 = null;
                this.PolarVoyageGuidelineStormSolar2850 = false;
            }
        }
        this.PolarVoyageAlarmManagerShadowHyperBeta8339 = z;
        PolarVoyageBarcodeScannerInfernoSolarSpark7767();
    }

    public final void PolarVoyageBottomSheetOmegaNeo1907(PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877, int i, boolean z, long j) {
        PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 = this.PolarVoyageItemDecorationUltraDeltaEpic7485[i];
        boolean PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageServiceStormMasterPixel9641.PolarVoyageTextInputEditTextNebulaHero6651();
        PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX9940 = polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185;
        if (PolarVoyageTextInputEditTextNebulaHero6651) {
            return;
        }
        boolean z2 = polarVoyageAdMobDeltaMasterShadow9877 == this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision4365 = polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageSnackbarGammaEclipse2140;
        PolarVoyageNestedScrollViewDragonNebulaPrime2058 polarVoyageNestedScrollViewDragonNebulaPrime2058 = ((PolarVoyageNestedScrollViewDragonNebulaPrime2058[]) polarVoyageViewPagerSparkVision4365.PolarVoyageStrictModeLegendEpic1532)[i];
        PolarVoyagePagingSpectraDelta6398 polarVoyagePagingSpectraDelta6398 = ((PolarVoyagePagingSpectraDelta6398[]) polarVoyageViewPagerSparkVision4365.PolarVoyageRotateAnimationCyberCelestialDelta4768)[i];
        boolean z3 = PolarVoyageConstraintSetCloneCelestialHero1930() && this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBitmapVisionAuroraPixel4705 == 3;
        boolean z4 = !z && z3;
        this.PolarVoyageMapTurboRogueTitan9291++;
        PolarVoyageFragmentTransactionVisionVortex9832 polarVoyageFragmentTransactionVisionVortex9832 = polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageKotlinBetaPulseBeta3653[i];
        long j2 = polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageContentProviderHyperSpark3838;
        PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497 = polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185;
        PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99402 = polarVoyageServiceStormMasterPixel9641.PolarVoyageKotlinBetaPulseBeta3653;
        int length = polarVoyagePagingSpectraDelta6398 != null ? polarVoyagePagingSpectraDelta6398.length() : 0;
        PolarVoyageDisplayMetricsSpectraNeoHero6356[] polarVoyageDisplayMetricsSpectraNeoHero6356Arr = new PolarVoyageDisplayMetricsSpectraNeoHero6356[length];
        for (int i2 = 0; i2 < length; i2++) {
            polarVoyagePagingSpectraDelta6398.getClass();
            polarVoyageDisplayMetricsSpectraNeoHero6356Arr[i2] = polarVoyagePagingSpectraDelta6398.PolarVoyageMotionLayoutTransitionHeroVision4068(i2);
        }
        int i3 = polarVoyageServiceStormMasterPixel9641.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        PolarVoyageDiffUtilSpeedCelestial7413 polarVoyageDiffUtilSpeedCelestial7413 = this.PolarVoyageDisplayMetricsVortexDragon9516;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            polarVoyageServiceStormMasterPixel9641.PolarVoyageBitmapVisionAuroraPixel4705 = true;
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageSnackbarGammaEclipse2140 == 0);
            polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageNestedScrollViewDragonNebulaPrime2058;
            polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageAlertDialogCyberHeroQuantum3938 = polarVoyageCombineBlazePulse1497;
            polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageSnackbarGammaEclipse2140 = 1;
            polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageRemoteModelManagerOlympianCelestial9141(z4, z2);
            polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageLooperThreadAlphaPrime1279(polarVoyageDisplayMetricsSpectraNeoHero6356Arr, polarVoyageFragmentTransactionVisionVortex9832, j, j2, polarVoyageCombineBlazePulse1497);
            polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageActivityInfoBetaQuantum8726(j, z4, true);
            polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageGestureDetectorPhoenixNovaX9940);
        } else {
            polarVoyageServiceStormMasterPixel9641.PolarVoyageDiffUtilTurboStrike5735 = true;
            polarVoyageGestureDetectorPhoenixNovaX99402.getClass();
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageSnackbarGammaEclipse2140 == 0);
            polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageNestedScrollViewDragonNebulaPrime2058;
            polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageAlertDialogCyberHeroQuantum3938 = polarVoyageCombineBlazePulse1497;
            polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageSnackbarGammaEclipse2140 = 1;
            polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageRemoteModelManagerOlympianCelestial9141(z4, z2);
            polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageLooperThreadAlphaPrime1279(polarVoyageDisplayMetricsSpectraNeoHero6356Arr, polarVoyageFragmentTransactionVisionVortex9832, j, j2, polarVoyageCombineBlazePulse1497);
            polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageActivityInfoBetaQuantum8726(j, z4, true);
            polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageGestureDetectorPhoenixNovaX99402);
        }
        PolarVoyageConstraintLayoutSpectraElite2658 polarVoyageConstraintLayoutSpectraElite2658 = new PolarVoyageConstraintLayoutSpectraElite2658(this);
        PolarVoyageGestureDetectorPhoenixNovaX9940 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageServiceStormMasterPixel9641.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageAdMobDeltaMasterShadow9877);
        PolarVoyageBarcodeScannerInfernoSolarSpark7767.getClass();
        PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageKotlinBetaPulseBeta3653(11, polarVoyageConstraintLayoutSpectraElite2658);
        if (z3 && z2) {
            polarVoyageServiceStormMasterPixel9641.PolarVoyageCameraPixelBlaze2629();
        }
    }

    public final long PolarVoyageCameraPixelBlaze2629(PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow5566, Object obj, long j) {
        PolarVoyageScrollViewFusionVision5184 polarVoyageScrollViewFusionVision5184 = this.PolarVoyageAnimatorSetSparkUltraMax8233;
        int i = polarVoyageRoomDaoPulseShadow5566.PolarVoyageTextInputEditTextNebulaHero6651(obj, polarVoyageScrollViewFusionVision5184).PolarVoyageKotlinBetaPulseBeta3653;
        PolarVoyageInterstitialAdMasterShadowCosmos9360 polarVoyageInterstitialAdMasterShadowCosmos9360 = this.PolarVoyageNavigationViewHyperHyperHyperion1793;
        polarVoyageRoomDaoPulseShadow5566.PolarVoyageDrawableDeltaHyperion5742(i, polarVoyageInterstitialAdMasterShadowCosmos9360);
        if (polarVoyageInterstitialAdMasterShadowCosmos9360.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == -9223372036854775807L || !polarVoyageInterstitialAdMasterShadowCosmos9360.PolarVoyageZipVortexCelestial6185() || !polarVoyageInterstitialAdMasterShadowCosmos9360.PolarVoyageTextInputEditTextNebulaHero6651) {
            return -9223372036854775807L;
        }
        long j2 = polarVoyageInterstitialAdMasterShadowCosmos9360.PolarVoyageBitmapVisionAuroraPixel4705;
        return PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageLifecycleOlympianOmega3762((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - polarVoyageInterstitialAdMasterShadowCosmos9360.PolarVoyageBarcodeScannerInfernoSolarSpark7767) - (j + polarVoyageScrollViewFusionVision5184.PolarVoyageBitmapVisionAuroraPixel4705);
    }

    public final void PolarVoyageCameraViewEclipseLegendStrike8028(PolarVoyageTransitionBlazePixel9380 polarVoyageTransitionBlazePixel9380) {
        this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageBitmapVisionAuroraPixel4705(16);
        PolarVoyageDiffUtilSpeedCelestial7413 polarVoyageDiffUtilSpeedCelestial7413 = this.PolarVoyageDisplayMetricsVortexDragon9516;
        polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageTransitionBlazePixel9380);
        PolarVoyageTransitionBlazePixel9380 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        PolarVoyageAlertDialogCyberHeroQuantum3938(PolarVoyageBarcodeScannerInfernoSolarSpark7767, PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageZipVortexCelestial6185, true, true);
    }

    public final PolarVoyageMaterialButtonDragonCyberMega6188 PolarVoyageCameraViewSpectraMaxSpectra2824(PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497, long j, long j2, long j3, boolean z, int i) {
        PolarVoyageLifecycleCameraControllerUltraShadowDelta8620 polarVoyageLifecycleCameraControllerUltraShadowDelta8620;
        boolean z2;
        this.PolarVoyageSensorManagerFusionPixelSolar7026 = (!this.PolarVoyageSensorManagerFusionPixelSolar7026 && j == this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageAnimatorSetSparkUltraMax8233 && polarVoyageCombineBlazePulse1497.equals(this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageMotionLayoutTransitionHeroVision4068)) ? false : true;
        PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587();
        PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
        PolarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244 polarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244 = polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision4365 = polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageStrictModeLegendEpic1532;
        List list = polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (this.PolarVoyagePackageManagerCelestialPhoenix8393.PolarVoyageBottomSheetOmegaNeo1907) {
            PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532;
            polarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244 = polarVoyageAdMobDeltaMasterShadow9877 == null ? PolarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244.PolarVoyageBarcodeScannerInfernoSolarSpark7767 : polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageDrawableDeltaHyperion5742;
            polarVoyageViewPagerSparkVision4365 = polarVoyageAdMobDeltaMasterShadow9877 == null ? this.PolarVoyageViewRogueMaster4778 : polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageSnackbarGammaEclipse2140;
            PolarVoyagePagingSpectraDelta6398[] polarVoyagePagingSpectraDelta6398Arr = (PolarVoyagePagingSpectraDelta6398[]) polarVoyageViewPagerSparkVision4365.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            PolarVoyageDatabasePhantomBeta6832 polarVoyageDatabasePhantomBeta6832 = new PolarVoyageDatabasePhantomBeta6832(4);
            boolean z3 = false;
            for (PolarVoyagePagingSpectraDelta6398 polarVoyagePagingSpectraDelta6398 : polarVoyagePagingSpectraDelta6398Arr) {
                if (polarVoyagePagingSpectraDelta6398 != null) {
                    PolarVoyageAsyncCelestialNebulaSpeed1878 polarVoyageAsyncCelestialNebulaSpeed1878 = polarVoyagePagingSpectraDelta6398.PolarVoyageMotionLayoutTransitionHeroVision4068(0).PolarVoyageViewRogueMaster4778;
                    if (polarVoyageAsyncCelestialNebulaSpeed1878 == null) {
                        polarVoyageDatabasePhantomBeta6832.PolarVoyageMotionLayoutTransitionHeroVision4068(new PolarVoyageAsyncCelestialNebulaSpeed1878(new PolarVoyageRotateAnimationOmegaPrimeVortex9371[0]));
                    } else {
                        polarVoyageDatabasePhantomBeta6832.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageAsyncCelestialNebulaSpeed1878);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                polarVoyageLifecycleCameraControllerUltraShadowDelta8620 = polarVoyageDatabasePhantomBeta6832.PolarVoyageDiffUtilTurboStrike5735();
            } else {
                PolarVoyageTextRecognitionPrimeVortexHero1477 polarVoyageTextRecognitionPrimeVortexHero1477 = PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageStrictModeLegendEpic1532;
                polarVoyageLifecycleCameraControllerUltraShadowDelta8620 = PolarVoyageLifecycleCameraControllerUltraShadowDelta8620.PolarVoyageViewRogueMaster4778;
            }
            list = polarVoyageLifecycleCameraControllerUltraShadowDelta8620;
            if (polarVoyageAdMobDeltaMasterShadow9877 != null) {
                PolarVoyageChipGroupHyperCelestial9288 polarVoyageChipGroupHyperCelestial9288 = polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageTextInputEditTextNebulaHero6651;
                if (polarVoyageChipGroupHyperCelestial9288.PolarVoyageBarcodeScannerInfernoSolarSpark7767 != j2) {
                    polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageChipGroupHyperCelestial9288.PolarVoyageZipVortexCelestial6185(j2);
                }
            }
            PolarVoyageServiceStormMasterPixel9641[] polarVoyageServiceStormMasterPixel9641Arr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha1105 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
            PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98772 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageStrictModeLegendEpic1532;
            if (polarVoyageAdMobDeltaMasterShadow98772 == polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageRotateAnimationCyberCelestialDelta4768 && polarVoyageAdMobDeltaMasterShadow98772 != null) {
                PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision43652 = polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageSnackbarGammaEclipse2140;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= polarVoyageServiceStormMasterPixel9641Arr.length) {
                        z2 = true;
                        break;
                    }
                    if (polarVoyageViewPagerSparkVision43652.PolarVoyageTextInputEditTextNebulaHero6651(i2)) {
                        if (polarVoyageServiceStormMasterPixel9641Arr[i2].PolarVoyageZipVortexCelestial6185.PolarVoyageStrictModeLegendEpic1532 != 1) {
                            z2 = false;
                            break;
                        }
                        if (((PolarVoyageNestedScrollViewDragonNebulaPrime2058[]) polarVoyageViewPagerSparkVision43652.PolarVoyageStrictModeLegendEpic1532)[i2].PolarVoyageZipVortexCelestial6185 != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.PolarVoyageClipboardManagerAuroraPixel8666) {
                    this.PolarVoyageClipboardManagerAuroraPixel8666 = z5;
                    if (!z5 && this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageContentProviderHyperSpark3838) {
                        this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageDiffUtilTurboStrike5735(2);
                    }
                }
            }
        } else if (!polarVoyageCombineBlazePulse1497.equals(polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageMotionLayoutTransitionHeroVision4068)) {
            polarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244 = PolarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            polarVoyageViewPagerSparkVision4365 = this.PolarVoyageViewRogueMaster4778;
            list = PolarVoyageLifecycleCameraControllerUltraShadowDelta8620.PolarVoyageViewRogueMaster4778;
        }
        PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision43653 = polarVoyageViewPagerSparkVision4365;
        List list2 = list;
        PolarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244 polarVoyageOnAttachStateChangeListenerMegaBlazeFusion42442 = polarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244;
        if (z) {
            PolarVoyageFragmentHyperMasterHyper5702 polarVoyageFragmentHyperMasterHyper5702 = this.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587;
            if (!polarVoyageFragmentHyperMasterHyper5702.PolarVoyageKotlinBetaPulseBeta3653 || polarVoyageFragmentHyperMasterHyper5702.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == 5) {
                polarVoyageFragmentHyperMasterHyper5702.PolarVoyageMotionLayoutTransitionHeroVision4068 = true;
                polarVoyageFragmentHyperMasterHyper5702.PolarVoyageKotlinBetaPulseBeta3653 = true;
                polarVoyageFragmentHyperMasterHyper5702.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i;
            } else {
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(i == 5);
            }
        }
        PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61882 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
        return polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageCombineBlazePulse1497, j, j2, j3, PolarVoyageContentProviderHyperSpark3838(polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageRemoteModelManagerOlympianCelestial9141), polarVoyageOnAttachStateChangeListenerMegaBlazeFusion42442, polarVoyageViewPagerSparkVision43653, list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageCanvasElitePhoenix4750() {
        int i;
        int i2;
        float f = this.PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageBarcodeScannerInfernoSolarSpark7767().PolarVoyageZipVortexCelestial6185;
        PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha1105 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98772 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision4365 = null;
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98773 = polarVoyageAdMobDeltaMasterShadow9877;
        boolean z = true;
        while (polarVoyageAdMobDeltaMasterShadow98773 != null && polarVoyageAdMobDeltaMasterShadow98773.PolarVoyageBitmapVisionAuroraPixel4705) {
            PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
            PolarVoyageViewPagerSparkVision4365 PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageAdMobDeltaMasterShadow98773.PolarVoyageRotateAnimationCyberCelestialDelta4768(f, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageZipVortexCelestial6185, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageViewRogueMaster4778);
            PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision43652 = polarVoyageAdMobDeltaMasterShadow98773 == this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532 ? PolarVoyageRotateAnimationCyberCelestialDelta4768 : polarVoyageViewPagerSparkVision4365;
            PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision43653 = polarVoyageAdMobDeltaMasterShadow98773.PolarVoyageSnackbarGammaEclipse2140;
            PolarVoyagePagingSpectraDelta6398[] polarVoyagePagingSpectraDelta6398Arr = (PolarVoyagePagingSpectraDelta6398[]) PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            if (polarVoyageViewPagerSparkVision43653 != null && ((PolarVoyagePagingSpectraDelta6398[]) polarVoyageViewPagerSparkVision43653.PolarVoyageRotateAnimationCyberCelestialDelta4768).length == polarVoyagePagingSpectraDelta6398Arr.length) {
                for (int i3 = 0; i3 < polarVoyagePagingSpectraDelta6398Arr.length; i3++) {
                    if (PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageDiffUtilTurboStrike5735(polarVoyageViewPagerSparkVision43653, i3)) {
                    }
                }
                if (polarVoyageAdMobDeltaMasterShadow98773 == polarVoyageAdMobDeltaMasterShadow98772) {
                    z = false;
                }
                polarVoyageAdMobDeltaMasterShadow98773 = polarVoyageAdMobDeltaMasterShadow98773.PolarVoyageCameraPixelBlaze2629;
                polarVoyageViewPagerSparkVision4365 = polarVoyageViewPagerSparkVision43652;
            }
            PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha11052 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
            if (z) {
                PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98774 = polarVoyageConstraintSetNovaSolarAlpha11052.PolarVoyageStrictModeLegendEpic1532;
                boolean z2 = (polarVoyageConstraintSetNovaSolarAlpha11052.PolarVoyageDrawableDeltaHyperion5742(polarVoyageAdMobDeltaMasterShadow98774) & 1) != 0;
                boolean[] zArr = new boolean[this.PolarVoyageItemDecorationUltraDeltaEpic7485.length];
                polarVoyageViewPagerSparkVision43652.getClass();
                long PolarVoyageZipVortexCelestial6185 = polarVoyageAdMobDeltaMasterShadow98774.PolarVoyageZipVortexCelestial6185(polarVoyageViewPagerSparkVision43652, this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageAnimatorSetSparkUltraMax8233, z2, zArr);
                PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61882 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                boolean z3 = (polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageBitmapVisionAuroraPixel4705 == 4 || PolarVoyageZipVortexCelestial6185 == polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageAnimatorSetSparkUltraMax8233) ? false : true;
                PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61883 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                i = 4;
                this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageMaterialButtonDragonCyberMega61883.PolarVoyageMotionLayoutTransitionHeroVision4068, PolarVoyageZipVortexCelestial6185, polarVoyageMaterialButtonDragonCyberMega61883.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageMaterialButtonDragonCyberMega61883.PolarVoyageBarcodeScannerInfernoSolarSpark7767, z3, 5);
                if (z3) {
                    PolarVoyageDatabaseCosmosSpectraSolar3905(PolarVoyageZipVortexCelestial6185, true);
                }
                PolarVoyageTextInputEditTextNebulaHero6651();
                boolean[] zArr2 = new boolean[this.PolarVoyageItemDecorationUltraDeltaEpic7485.length];
                int i4 = 0;
                while (true) {
                    PolarVoyageServiceStormMasterPixel9641[] polarVoyageServiceStormMasterPixel9641Arr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    if (i4 >= polarVoyageServiceStormMasterPixel9641Arr.length) {
                        break;
                    }
                    int PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageServiceStormMasterPixel9641Arr[i4].PolarVoyageKotlinBetaPulseBeta3653();
                    zArr2[i4] = this.PolarVoyageItemDecorationUltraDeltaEpic7485[i4].PolarVoyageTextInputEditTextNebulaHero6651();
                    PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 = this.PolarVoyageItemDecorationUltraDeltaEpic7485[i4];
                    PolarVoyageFragmentTransactionVisionVortex9832 polarVoyageFragmentTransactionVisionVortex9832 = polarVoyageAdMobDeltaMasterShadow98774.PolarVoyageKotlinBetaPulseBeta3653[i4];
                    PolarVoyageDiffUtilSpeedCelestial7413 polarVoyageDiffUtilSpeedCelestial7413 = this.PolarVoyageDisplayMetricsVortexDragon9516;
                    long j = this.PolarVoyageWithContextPulseSolarHyperion4393;
                    boolean z4 = zArr[i4];
                    PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX9940 = polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185;
                    if (PolarVoyageServiceStormMasterPixel9641.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageGestureDetectorPhoenixNovaX9940)) {
                        if (polarVoyageFragmentTransactionVisionVortex9832 != polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageContentProviderHyperSpark3838) {
                            polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185(polarVoyageGestureDetectorPhoenixNovaX9940, polarVoyageDiffUtilSpeedCelestial7413);
                        } else if (z4) {
                            polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageActivityInfoBetaQuantum8726(j, false, true);
                        }
                    }
                    PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99402 = polarVoyageServiceStormMasterPixel9641.PolarVoyageKotlinBetaPulseBeta3653;
                    if (polarVoyageGestureDetectorPhoenixNovaX99402 != null && PolarVoyageServiceStormMasterPixel9641.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageGestureDetectorPhoenixNovaX99402)) {
                        if (polarVoyageFragmentTransactionVisionVortex9832 != polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageContentProviderHyperSpark3838) {
                            polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185(polarVoyageGestureDetectorPhoenixNovaX99402, polarVoyageDiffUtilSpeedCelestial7413);
                        } else if (z4) {
                            polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageActivityInfoBetaQuantum8726(j, false, true);
                        }
                    }
                    if (PolarVoyageKotlinBetaPulseBeta3653 - this.PolarVoyageItemDecorationUltraDeltaEpic7485[i4].PolarVoyageKotlinBetaPulseBeta3653() > 0) {
                        PolarVoyageCardViewAlphaVortexCelestial9747(i4, false);
                    }
                    this.PolarVoyageMapTurboRogueTitan9291 -= PolarVoyageKotlinBetaPulseBeta3653 - this.PolarVoyageItemDecorationUltraDeltaEpic7485[i4].PolarVoyageKotlinBetaPulseBeta3653();
                    i4++;
                }
                PolarVoyageViewRogueMaster4778(zArr2, this.PolarVoyageWithContextPulseSolarHyperion4393);
                polarVoyageAdMobDeltaMasterShadow98774.PolarVoyageItemDecorationUltraDeltaEpic7485 = true;
            } else {
                i = 4;
                polarVoyageConstraintSetNovaSolarAlpha11052.PolarVoyageDrawableDeltaHyperion5742(polarVoyageAdMobDeltaMasterShadow98773);
                if (polarVoyageAdMobDeltaMasterShadow98773.PolarVoyageBitmapVisionAuroraPixel4705) {
                    long max = Math.max(polarVoyageAdMobDeltaMasterShadow98773.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageMotionLayoutTransitionHeroVision4068, this.PolarVoyageWithContextPulseSolarHyperion4393 - polarVoyageAdMobDeltaMasterShadow98773.PolarVoyageContentProviderHyperSpark3838);
                    if (this.PolarVoyageViewBindingPulseHeroSpeed5705 && PolarVoyageBitmapVisionAuroraPixel4705() && this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageBottomSheetOmegaNeo1907 == polarVoyageAdMobDeltaMasterShadow98773) {
                        PolarVoyageTextInputEditTextNebulaHero6651();
                    }
                    i2 = 4;
                    polarVoyageAdMobDeltaMasterShadow98773.PolarVoyageZipVortexCelestial6185(PolarVoyageRotateAnimationCyberCelestialDelta4768, max, false, new boolean[polarVoyageAdMobDeltaMasterShadow98773.PolarVoyageRotateAnimationCyberCelestialDelta4768.length]);
                    PolarVoyageDisplayMetricsVortexDragon9516(true);
                    if (this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBitmapVisionAuroraPixel4705 == i2) {
                        PolarVoyageLifecycleOlympianOmega3762();
                        PolarVoyageIntentNovaTitanium7230();
                        this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageDiffUtilTurboStrike5735(2);
                        return;
                    }
                    return;
                }
            }
            i2 = i;
            PolarVoyageDisplayMetricsVortexDragon9516(true);
            if (this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBitmapVisionAuroraPixel4705 == i2) {
            }
        }
    }

    public final void PolarVoyageCardViewAlphaVortexCelestial9747(int i, boolean z) {
        boolean[] zArr = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageBarcodeScannerInfernoSolarSpark7767(new PolarVoyageInAppPurchaseAuroraHyperPhantom8141(this, i, z));
        }
    }

    public final void PolarVoyageCardViewSpectraTurbo5149(PolarVoyageGuidelineEpicPrimeMax7757 polarVoyageGuidelineEpicPrimeMax7757) {
        this.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = polarVoyageGuidelineEpicPrimeMax7757;
    }

    public final void PolarVoyageClipboardManagerAuroraPixel8666(PolarVoyageOnTouchListenerInfernoShadow9357 polarVoyageOnTouchListenerInfernoShadow9357, boolean z) {
        PolarVoyageDrawableMaxNovaX8749 polarVoyageDrawableMaxNovaX8749 = this.PolarVoyageBottomSheetOmegaNeo1907;
        if (!polarVoyageDrawableMaxNovaX8749.PolarVoyageStrictModeLegendEpic1532.equals(polarVoyageOnTouchListenerInfernoShadow9357)) {
            polarVoyageDrawableMaxNovaX8749.PolarVoyageStrictModeLegendEpic1532 = polarVoyageOnTouchListenerInfernoShadow9357;
            polarVoyageDrawableMaxNovaX8749.PolarVoyageTextInputEditTextNebulaHero6651();
        }
        if (!z) {
            polarVoyageOnTouchListenerInfernoShadow9357 = null;
        }
        PolarVoyageContextAlphaAurora8980 polarVoyageContextAlphaAurora8980 = this.PolarVoyageCardViewAlphaVortexCelestial9747;
        if (!Objects.equals(polarVoyageContextAlphaAurora8980.PolarVoyageBarcodeScannerInfernoSolarSpark7767, polarVoyageOnTouchListenerInfernoShadow9357)) {
            polarVoyageContextAlphaAurora8980.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageOnTouchListenerInfernoShadow9357;
            int i = polarVoyageOnTouchListenerInfernoShadow9357 == null ? 0 : 1;
            polarVoyageContextAlphaAurora8980.PolarVoyageDiffUtilTurboStrike5735 = i;
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageSnackbarGammaEclipse2140("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
        }
        PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
        boolean z2 = polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageViewRogueMaster4778;
        PolarVoyageRoomStormMaster7636(polarVoyageContextAlphaAurora8980.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageBitmapVisionAuroraPixel4705, z2), polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageDrawableDeltaHyperion5742, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageCameraPixelBlaze2629, z2);
    }

    public final void PolarVoyageCombineBlazeSparkInferno2844(int i) {
        PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
        if (polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageBitmapVisionAuroraPixel4705 != i) {
            if (i != 2) {
                this.PolarVoyageBottomSheetNovaXNova5051 = -9223372036854775807L;
            }
            if (i != 3 && polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageContentProviderHyperSpark3838) {
                this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageItemDecorationUltraDeltaEpic7485(false);
            }
            this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageTextInputEditTextNebulaHero6651(i);
        }
    }

    public final void PolarVoyageConfigurationMaxSpectraForce5418(int i, int i2, PolarVoyageGraphSpeedThunderDragon6179 polarVoyageGraphSpeedThunderDragon6179) {
        this.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587.PolarVoyageKotlinBetaPulseBeta3653(1);
        PolarVoyageKaptNeoFusion1280 polarVoyageKaptNeoFusion1280 = this.PolarVoyagePackageManagerCelestialPhoenix8393;
        polarVoyageKaptNeoFusion1280.getClass();
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(i >= 0 && i <= i2 && i2 <= polarVoyageKaptNeoFusion1280.PolarVoyageMotionLayoutTransitionHeroVision4068.size());
        polarVoyageKaptNeoFusion1280.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageGraphSpeedThunderDragon6179;
        polarVoyageKaptNeoFusion1280.PolarVoyageTextInputEditTextNebulaHero6651(i, i2);
        PolarVoyageLayerDrawableShadowTitaniumOmega1942(polarVoyageKaptNeoFusion1280.PolarVoyageMotionLayoutTransitionHeroVision4068(), false);
    }

    public final boolean PolarVoyageConstraintSetCloneCelestialHero1930() {
        PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
        return polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageViewRogueMaster4778 && polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageDrawableDeltaHyperion5742 == 0;
    }

    public final long PolarVoyageContentProviderHyperSpark3838(long j) {
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageViewRogueMaster4778;
        if (polarVoyageAdMobDeltaMasterShadow9877 == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.PolarVoyageWithContextPulseSolarHyperion4393 - polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageContentProviderHyperSpark3838));
    }

    public final void PolarVoyageDatabaseCosmosSpectraSolar3905(long j, boolean z) {
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532;
        long j2 = j + (polarVoyageAdMobDeltaMasterShadow9877 == null ? 1000000000000L : polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageContentProviderHyperSpark3838);
        this.PolarVoyageWithContextPulseSolarHyperion4393 = j2;
        this.PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653(j2);
        for (PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 : this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            long j3 = this.PolarVoyageWithContextPulseSolarHyperion4393;
            PolarVoyageGestureDetectorPhoenixNovaX9940 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageServiceStormMasterPixel9641.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageAdMobDeltaMasterShadow9877);
            if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 != null) {
                PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageActivityInfoBetaQuantum8726(j3, false, z);
            }
        }
        for (PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98772 = r0.PolarVoyageStrictModeLegendEpic1532; polarVoyageAdMobDeltaMasterShadow98772 != null; polarVoyageAdMobDeltaMasterShadow98772 = polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageCameraPixelBlaze2629) {
            for (PolarVoyagePagingSpectraDelta6398 polarVoyagePagingSpectraDelta6398 : (PolarVoyagePagingSpectraDelta6398[]) polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                if (polarVoyagePagingSpectraDelta6398 != null) {
                    polarVoyagePagingSpectraDelta6398.PolarVoyageRotateAnimationCyberCelestialDelta4768();
                }
            }
        }
    }

    public final void PolarVoyageDelayCyberQuantumEclipse8687(PolarVoyageTextureViewThunderTurboStrike2293 polarVoyageTextureViewThunderTurboStrike2293) {
        this.PolarVoyageToolbarEclipseInfernoHero6368 = polarVoyageTextureViewThunderTurboStrike2293;
        PolarVoyageBarcodeScannerInfernoSolarSpark7767();
    }

    public final void PolarVoyageDialogFragmentPixelEliteHyperion4038(PolarVoyageCardViewNeoPhoenix5286 polarVoyageCardViewNeoPhoenix5286) {
        for (PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 : this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX9940 = polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185;
            if (polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageStrictModeLegendEpic1532 == 2) {
                polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageKotlinBetaPulseBeta3653(7, polarVoyageCardViewNeoPhoenix5286);
                PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99402 = polarVoyageServiceStormMasterPixel9641.PolarVoyageKotlinBetaPulseBeta3653;
                if (polarVoyageGestureDetectorPhoenixNovaX99402 != null) {
                    polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageKotlinBetaPulseBeta3653(7, polarVoyageCardViewNeoPhoenix5286);
                }
            }
        }
    }

    public final void PolarVoyageDiffUtilDragonSpeedEclipse6225() {
        PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha1105 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
        polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageBottomSheetOmegaNeo1907();
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageCameraPixelBlaze2629;
        if (polarVoyageAdMobDeltaMasterShadow9877 != null) {
            PolarVoyageServiceVortexCosmosAlpha1023 polarVoyageServiceVortexCosmosAlpha1023 = polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageZipVortexCelestial6185;
            if ((!polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageBarcodeScannerInfernoSolarSpark7767 || polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageBitmapVisionAuroraPixel4705) && !polarVoyageServiceVortexCosmosAlpha1023.PolarVoyageZipVortexCelestial6185()) {
                PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow5566 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185;
                if (polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageBitmapVisionAuroraPixel4705) {
                    polarVoyageServiceVortexCosmosAlpha1023.PolarVoyageBottomSheetOmegaNeo1907();
                }
                Iterator it = this.PolarVoyageCameraPixelBlaze2629.PolarVoyageContentProviderHyperSpark3838.values().iterator();
                while (it.hasNext()) {
                    if (((PolarVoyageInAppPurchaseMaxEpic8738) it.next()).PolarVoyageMotionLayoutTransitionHeroVision4068) {
                        return;
                    }
                }
                if (!polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
                    long j = polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = true;
                    polarVoyageServiceVortexCosmosAlpha1023.PolarVoyageMotionLayoutTransitionHeroVision4068(this, j);
                    return;
                }
                PolarVoyageAnalyticsGammaNeo1453 polarVoyageAnalyticsGammaNeo1453 = new PolarVoyageAnalyticsGammaNeo1453();
                polarVoyageAnalyticsGammaNeo1453.PolarVoyageZipVortexCelestial6185 = this.PolarVoyageWithContextPulseSolarHyperion4393 - polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageContentProviderHyperSpark3838;
                float f = this.PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageBarcodeScannerInfernoSolarSpark7767().PolarVoyageZipVortexCelestial6185;
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(f > 0.0f || f == -3.4028235E38f);
                polarVoyageAnalyticsGammaNeo1453.PolarVoyageMotionLayoutTransitionHeroVision4068 = f;
                long j2 = this.PolarVoyageKeyframeEpicNovaXCyber9821;
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(j2 >= 0 || j2 == -9223372036854775807L);
                polarVoyageAnalyticsGammaNeo1453.PolarVoyageKotlinBetaPulseBeta3653 = j2;
                PolarVoyageLooperThreadPixelSpark4667 polarVoyageLooperThreadPixelSpark4667 = new PolarVoyageLooperThreadPixelSpark4667(polarVoyageAnalyticsGammaNeo1453);
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageCameraPixelBlaze2629 == null);
                polarVoyageServiceVortexCosmosAlpha1023.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageLooperThreadPixelSpark4667);
            }
        }
    }

    public final void PolarVoyageDiffUtilTurboStrike5735() {
        PolarVoyageCanvasElitePhoenix4750();
        PolarVoyageMotionSceneStormSolarBeta2208(true);
    }

    public final void PolarVoyageDisplayMetricsForceEclipseVision4728(PolarVoyageActivityInfoBetaFusion4959 polarVoyageActivityInfoBetaFusion4959) {
        Looper looper = polarVoyageActivityInfoBetaFusion4959.PolarVoyageBitmapVisionAuroraPixel4705;
        if (looper.getThread().isAlive()) {
            this.PolarVoyageMotionLayoutForceEpicAurora7183.PolarVoyageZipVortexCelestial6185(looper, null).PolarVoyageBarcodeScannerInfernoSolarSpark7767(new PolarVoyageLightSensorSparkBlazeTitanium9192(18, this, polarVoyageActivityInfoBetaFusion4959));
        } else {
            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("TAG", "Trying to send message on a dead thread.");
            polarVoyageActivityInfoBetaFusion4959.PolarVoyageZipVortexCelestial6185(false);
        }
    }

    public final void PolarVoyageDisplayMetricsVortexDragon9516(boolean z) {
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageViewRogueMaster4778;
        PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497 = polarVoyageAdMobDeltaMasterShadow9877 == null ? this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageMotionLayoutTransitionHeroVision4068 : polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185;
        boolean equals = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBottomSheetOmegaNeo1907.equals(polarVoyageCombineBlazePulse1497);
        if (!equals) {
            this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageCombineBlazePulse1497);
        }
        PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
        polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyageAdMobDeltaMasterShadow9877 == null ? polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageAnimatorSetSparkUltraMax8233 : polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61882 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
        polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageNavigationViewHyperHyperHyperion1793 = PolarVoyageContentProviderHyperSpark3838(polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageRemoteModelManagerOlympianCelestial9141);
        if ((!equals || z) && polarVoyageAdMobDeltaMasterShadow9877 != null && polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageBitmapVisionAuroraPixel4705) {
            PolarVoyageWindowManagerOlympianNovaNebula5076(polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185, polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageSnackbarGammaEclipse2140);
        }
    }

    public final long PolarVoyageDrawableDeltaHyperion5742(PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877) {
        if (polarVoyageAdMobDeltaMasterShadow9877 == null) {
            return 0L;
        }
        long j = polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageContentProviderHyperSpark3838;
        if (!polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageBitmapVisionAuroraPixel4705) {
            return j;
        }
        int i = 0;
        while (true) {
            PolarVoyageServiceStormMasterPixel9641[] polarVoyageServiceStormMasterPixel9641Arr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (i >= polarVoyageServiceStormMasterPixel9641Arr.length) {
                return j;
            }
            if (polarVoyageServiceStormMasterPixel9641Arr[i].PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageAdMobDeltaMasterShadow9877) != null) {
                PolarVoyageGestureDetectorPhoenixNovaX9940 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageServiceStormMasterPixel9641Arr[i].PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageAdMobDeltaMasterShadow9877);
                Objects.requireNonNull(PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                long j2 = PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageBitmapMaxTitanTitan7960;
                if (j2 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j = Math.max(j2, j);
            }
            i++;
        }
    }

    public final void PolarVoyageFCMCelestialCosmosPixel3711() {
        PolarVoyageFragmentHyperMasterHyper5702 polarVoyageFragmentHyperMasterHyper5702 = this.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587;
        PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
        boolean z = polarVoyageFragmentHyperMasterHyper5702.PolarVoyageMotionLayoutTransitionHeroVision4068 | (((PolarVoyageMaterialButtonDragonCyberMega6188) polarVoyageFragmentHyperMasterHyper5702.PolarVoyageBitmapVisionAuroraPixel4705) != polarVoyageMaterialButtonDragonCyberMega6188);
        polarVoyageFragmentHyperMasterHyper5702.PolarVoyageMotionLayoutTransitionHeroVision4068 = z;
        polarVoyageFragmentHyperMasterHyper5702.PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageMaterialButtonDragonCyberMega6188;
        if (z) {
            PolarVoyageGradlePluginDragonEpicDelta4266 polarVoyageGradlePluginDragonEpicDelta4266 = this.PolarVoyageAlertDialogCyberHeroQuantum3938.PolarVoyageItemDecorationUltraDeltaEpic7485;
            polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageBarcodeScannerInfernoSolarSpark7767(new PolarVoyageMediaPlayerNebulaTurboLegend3509(16, polarVoyageGradlePluginDragonEpicDelta4266, polarVoyageFragmentHyperMasterHyper5702));
            this.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587 = new PolarVoyageFragmentHyperMasterHyper5702(this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803);
        }
    }

    public final void PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149() {
        this.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587.PolarVoyageKotlinBetaPulseBeta3653(1);
        throw null;
    }

    public final void PolarVoyageFlingGestureEclipsePrimeMax1376() {
        PolarVoyageLayerDrawableShadowTitaniumOmega1942(this.PolarVoyagePackageManagerCelestialPhoenix8393.PolarVoyageMotionLayoutTransitionHeroVision4068(), true);
    }

    public final void PolarVoyageFlowOnBetaCyber2473(int i) {
        this.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576 = i;
        PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow5566 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185;
        PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha1105 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
        polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageTextInputEditTextNebulaHero6651 = i;
        int PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageNavigationViewHyperHyperHyperion1793(polarVoyageRoomDaoPulseShadow5566);
        if ((PolarVoyageNavigationViewHyperHyperHyperion1793 & 1) != 0) {
            PolarVoyageMotionSceneStormSolarBeta2208(true);
        } else if ((PolarVoyageNavigationViewHyperHyperHyperion1793 & 2) != 0) {
            PolarVoyageTextInputEditTextNebulaHero6651();
        }
        PolarVoyageDisplayMetricsVortexDragon9516(false);
    }

    public final void PolarVoyageGuidelineStormSolar2850() {
        for (int i = 0; i < this.PolarVoyageItemDecorationUltraDeltaEpic7485.length; i++) {
            PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX9940 = this.PolarVoyageStrictModeLegendEpic1532[i];
            synchronized (polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageCameraViewSpectraMaxSpectra2824 = null;
            }
            PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 = this.PolarVoyageItemDecorationUltraDeltaEpic7485[i];
            PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99402 = polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185;
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageSnackbarGammaEclipse2140 == 0);
            polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageAnimatorSetSparkUltraMax8233();
            polarVoyageServiceStormMasterPixel9641.PolarVoyageBitmapVisionAuroraPixel4705 = false;
            PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99403 = polarVoyageServiceStormMasterPixel9641.PolarVoyageKotlinBetaPulseBeta3653;
            if (polarVoyageGestureDetectorPhoenixNovaX99403 != null) {
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(polarVoyageGestureDetectorPhoenixNovaX99403.PolarVoyageSnackbarGammaEclipse2140 == 0);
                polarVoyageGestureDetectorPhoenixNovaX99403.PolarVoyageAnimatorSetSparkUltraMax8233();
                polarVoyageServiceStormMasterPixel9641.PolarVoyageDiffUtilTurboStrike5735 = false;
            }
        }
    }

    public final void PolarVoyageHandlerFusionOlympian7396() {
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532;
        if (polarVoyageAdMobDeltaMasterShadow9877 == null) {
            return;
        }
        PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision4365 = polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageSnackbarGammaEclipse2140;
        int i = 0;
        while (true) {
            PolarVoyageServiceStormMasterPixel9641[] polarVoyageServiceStormMasterPixel9641Arr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (i >= polarVoyageServiceStormMasterPixel9641Arr.length) {
                return;
            }
            if (polarVoyageViewPagerSparkVision4365.PolarVoyageTextInputEditTextNebulaHero6651(i)) {
                polarVoyageServiceStormMasterPixel9641Arr[i].PolarVoyageCameraPixelBlaze2629();
            }
            i++;
        }
    }

    public final long PolarVoyageHandlerThreadMaxAurora5064(PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497, long j, boolean z, boolean z2) {
        PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha1105;
        int i;
        PolarVoyageLocationListenerInfernoQuantumOlympian6900();
        boolean z3 = true;
        PolarVoyageAlarmManagerBetaMaxPhantom7852(false, true);
        if (z2 || this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBitmapVisionAuroraPixel4705 == 3) {
            PolarVoyageCombineBlazeSparkInferno2844(2);
        }
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98772 = polarVoyageAdMobDeltaMasterShadow9877;
        while (polarVoyageAdMobDeltaMasterShadow98772 != null && !polarVoyageCombineBlazePulse1497.equals(polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185)) {
            polarVoyageAdMobDeltaMasterShadow98772 = polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageCameraPixelBlaze2629;
        }
        if (z || polarVoyageAdMobDeltaMasterShadow9877 != polarVoyageAdMobDeltaMasterShadow98772 || (polarVoyageAdMobDeltaMasterShadow98772 != null && polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageContentProviderHyperSpark3838 + j < 0)) {
            for (int i2 = 0; i2 < this.PolarVoyageItemDecorationUltraDeltaEpic7485.length; i2++) {
                PolarVoyageItemDecorationUltraDeltaEpic7485(i2);
            }
            this.PolarVoyageCardViewSpectraTurbo5149 = -9223372036854775807L;
            if (polarVoyageAdMobDeltaMasterShadow98772 != null) {
                while (true) {
                    polarVoyageConstraintSetNovaSolarAlpha1105 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
                    if (polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageStrictModeLegendEpic1532 == polarVoyageAdMobDeltaMasterShadow98772) {
                        break;
                    }
                    polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageZipVortexCelestial6185();
                }
                polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageDrawableDeltaHyperion5742(polarVoyageAdMobDeltaMasterShadow98772);
                polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageContentProviderHyperSpark3838 = 1000000000000L;
                PolarVoyageViewRogueMaster4778(new boolean[this.PolarVoyageItemDecorationUltraDeltaEpic7485.length], this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageBitmapVisionAuroraPixel4705());
                polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageItemDecorationUltraDeltaEpic7485 = true;
            }
        }
        PolarVoyageTextInputEditTextNebulaHero6651();
        if (this.PolarVoyageAlarmManagerShadowHyperBeta8339) {
            for (PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 : this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                if (polarVoyageServiceStormMasterPixel9641.PolarVoyageTextInputEditTextNebulaHero6651() && ((i = polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185.PolarVoyageStrictModeLegendEpic1532) == 2 || i == 4)) {
                    this.PolarVoyageGuidelineStormSolar2850 = true;
                    break;
                }
            }
        }
        PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha11052 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
        if (polarVoyageAdMobDeltaMasterShadow98772 != null) {
            polarVoyageConstraintSetNovaSolarAlpha11052.PolarVoyageDrawableDeltaHyperion5742(polarVoyageAdMobDeltaMasterShadow98772);
            if (!polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageBitmapVisionAuroraPixel4705) {
                polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageMotionLayoutTransitionHeroVision4068(j, -9223372036854775807L);
            } else if (polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageDiffUtilTurboStrike5735) {
                if (this.PolarVoyageAlarmManagerShadowHyperBeta8339) {
                    this.PolarVoyageToolbarEclipseInfernoHero6368.getClass();
                    if (!this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185.PolarVoyageContentProviderHyperSpark3838() && polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185.equals(this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageMotionLayoutTransitionHeroVision4068)) {
                        long j2 = polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageContentProviderHyperSpark3838 + j;
                        boolean z4 = true;
                        for (PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel96412 : this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                            if (polarVoyageServiceStormMasterPixel96412.PolarVoyageTextInputEditTextNebulaHero6651()) {
                                PolarVoyageGestureDetectorPhoenixNovaX9940 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageServiceStormMasterPixel96412.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageAdMobDeltaMasterShadow98772);
                                z4 &= PolarVoyageBarcodeScannerInfernoSolarSpark7767 != null && PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageViewBindingPulseHeroSpeed5705(j2);
                            }
                        }
                        if (z4) {
                            PolarVoyageServiceVortexCosmosAlpha1023 polarVoyageServiceVortexCosmosAlpha1023 = polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageZipVortexCelestial6185;
                            long j3 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageAnimatorSetSparkUltraMax8233;
                            PolarVoyageGuidelineEpicPrimeMax7757 polarVoyageGuidelineEpicPrimeMax7757 = PolarVoyageGuidelineEpicPrimeMax7757.PolarVoyageKotlinBetaPulseBeta3653;
                            if (polarVoyageServiceVortexCosmosAlpha1023.PolarVoyageItemDecorationUltraDeltaEpic7485(j3, polarVoyageGuidelineEpicPrimeMax7757) == polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageZipVortexCelestial6185.PolarVoyageItemDecorationUltraDeltaEpic7485(j, polarVoyageGuidelineEpicPrimeMax7757)) {
                                z3 = false;
                            }
                        }
                    }
                }
                j = polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageZipVortexCelestial6185.PolarVoyageCameraPixelBlaze2629(j);
                polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageZipVortexCelestial6185.PolarVoyageDrawableDeltaHyperion5742(j - this.PolarVoyageBitmapMaxTitanTitan7960);
            }
            PolarVoyageDatabaseCosmosSpectraSolar3905(j, z3);
            PolarVoyageLifecycleOlympianOmega3762();
        } else {
            polarVoyageConstraintSetNovaSolarAlpha11052.PolarVoyageMotionLayoutTransitionHeroVision4068();
            PolarVoyageDatabaseCosmosSpectraSolar3905(j, true);
        }
        PolarVoyageDisplayMetricsVortexDragon9516(false);
        this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageDiffUtilTurboStrike5735(2);
        return j;
    }

    public final void PolarVoyageIntentNovaTitanium7230() {
        long j;
        float f;
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532;
        if (polarVoyageAdMobDeltaMasterShadow9877 == null) {
            return;
        }
        long PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageBitmapVisionAuroraPixel4705 ? polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageZipVortexCelestial6185.PolarVoyageTextInputEditTextNebulaHero6651() : -9223372036854775807L;
        if (PolarVoyageTextInputEditTextNebulaHero6651 != -9223372036854775807L) {
            if (!polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageTextInputEditTextNebulaHero6651()) {
                this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageDrawableDeltaHyperion5742(polarVoyageAdMobDeltaMasterShadow9877);
                PolarVoyageDisplayMetricsVortexDragon9516(false);
                PolarVoyageLifecycleOlympianOmega3762();
            }
            PolarVoyageDatabaseCosmosSpectraSolar3905(PolarVoyageTextInputEditTextNebulaHero6651, true);
            if (PolarVoyageTextInputEditTextNebulaHero6651 != this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageAnimatorSetSparkUltraMax8233) {
                PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageMotionLayoutTransitionHeroVision4068, PolarVoyageTextInputEditTextNebulaHero6651, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageKotlinBetaPulseBeta3653, PolarVoyageTextInputEditTextNebulaHero6651, true, 5);
            }
        } else {
            PolarVoyageDiffUtilSpeedCelestial7413 polarVoyageDiffUtilSpeedCelestial7413 = this.PolarVoyageDisplayMetricsVortexDragon9516;
            boolean z = polarVoyageAdMobDeltaMasterShadow9877 != this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            PolarVoyageAlarmManagerBetaStrikeSpark3235 polarVoyageAlarmManagerBetaStrikeSpark3235 = polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageItemDecorationUltraDeltaEpic7485;
            PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX9940 = polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            if (polarVoyageGestureDetectorPhoenixNovaX9940 == null || polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageCameraPixelBlaze2629() || ((z && polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageSnackbarGammaEclipse2140 != 2) || (!polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageSnackbarGammaEclipse2140() && (z || polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageViewRogueMaster4778())))) {
                polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageViewRogueMaster4778 = true;
                if (polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageCameraPixelBlaze2629) {
                    polarVoyageAlarmManagerBetaStrikeSpark3235.PolarVoyageDiffUtilTurboStrike5735();
                }
            } else {
                PolarVoyageLocationManagerFusionMax8504 polarVoyageLocationManagerFusionMax8504 = polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageBottomSheetOmegaNeo1907;
                polarVoyageLocationManagerFusionMax8504.getClass();
                long PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageLocationManagerFusionMax8504.PolarVoyageBitmapVisionAuroraPixel4705();
                if (polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageViewRogueMaster4778) {
                    if (PolarVoyageBitmapVisionAuroraPixel4705 >= polarVoyageAlarmManagerBetaStrikeSpark3235.PolarVoyageBitmapVisionAuroraPixel4705()) {
                        polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageViewRogueMaster4778 = false;
                        if (polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageCameraPixelBlaze2629) {
                            polarVoyageAlarmManagerBetaStrikeSpark3235.PolarVoyageDiffUtilTurboStrike5735();
                        }
                    } else if (polarVoyageAlarmManagerBetaStrikeSpark3235.PolarVoyageStrictModeLegendEpic1532) {
                        polarVoyageAlarmManagerBetaStrikeSpark3235.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageAlarmManagerBetaStrikeSpark3235.PolarVoyageBitmapVisionAuroraPixel4705());
                        polarVoyageAlarmManagerBetaStrikeSpark3235.PolarVoyageStrictModeLegendEpic1532 = false;
                    }
                }
                polarVoyageAlarmManagerBetaStrikeSpark3235.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageBitmapVisionAuroraPixel4705);
                PolarVoyageTransitionBlazePixel9380 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageLocationManagerFusionMax8504.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                if (!PolarVoyageBarcodeScannerInfernoSolarSpark7767.equals(polarVoyageAlarmManagerBetaStrikeSpark3235.PolarVoyageViewRogueMaster4778)) {
                    polarVoyageAlarmManagerBetaStrikeSpark3235.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                    polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageStrictModeLegendEpic1532.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageMotionLayoutTransitionHeroVision4068(16, PolarVoyageBarcodeScannerInfernoSolarSpark7767).PolarVoyageMotionLayoutTransitionHeroVision4068();
                }
            }
            long PolarVoyageBitmapVisionAuroraPixel47052 = polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageBitmapVisionAuroraPixel4705();
            this.PolarVoyageWithContextPulseSolarHyperion4393 = PolarVoyageBitmapVisionAuroraPixel47052;
            long j2 = PolarVoyageBitmapVisionAuroraPixel47052 - polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageContentProviderHyperSpark3838;
            long j3 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageAnimatorSetSparkUltraMax8233;
            if (!this.PolarVoyageLayerDrawableShadowTitaniumOmega1942.isEmpty() && !this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068()) {
                if (this.PolarVoyageSensorManagerFusionPixelSolar7026) {
                    this.PolarVoyageSensorManagerFusionPixelSolar7026 = false;
                }
                PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61882 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageZipVortexCelestial6185.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185);
                int min = Math.min(this.PolarVoyageCameraViewEclipseLegendStrike8028, this.PolarVoyageLayerDrawableShadowTitaniumOmega1942.size());
                if (min > 0 && this.PolarVoyageLayerDrawableShadowTitaniumOmega1942.get(min - 1) != null) {
                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageZipVortexCelestial6185();
                    return;
                } else {
                    if (min < this.PolarVoyageLayerDrawableShadowTitaniumOmega1942.size() && this.PolarVoyageLayerDrawableShadowTitaniumOmega1942.get(min) != null) {
                        PolarVoyageR8UltraEliteBeta8736.PolarVoyageZipVortexCelestial6185();
                        return;
                    }
                    this.PolarVoyageCameraViewEclipseLegendStrike8028 = min;
                }
            }
            if (this.PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageZipVortexCelestial6185()) {
                boolean z2 = !this.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587.PolarVoyageKotlinBetaPulseBeta3653;
                PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61883 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageMaterialButtonDragonCyberMega61883.PolarVoyageMotionLayoutTransitionHeroVision4068, j2, polarVoyageMaterialButtonDragonCyberMega61883.PolarVoyageKotlinBetaPulseBeta3653, j2, z2, 6);
            } else {
                PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61884 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                polarVoyageMaterialButtonDragonCyberMega61884.PolarVoyageAnimatorSetSparkUltraMax8233 = j2;
                polarVoyageMaterialButtonDragonCyberMega61884.PolarVoyageBitmapMaxTitanTitan7960 = SystemClock.elapsedRealtime();
            }
        }
        this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageRemoteModelManagerOlympianCelestial9141 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageViewRogueMaster4778.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61885 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
        polarVoyageMaterialButtonDragonCyberMega61885.PolarVoyageNavigationViewHyperHyperHyperion1793 = PolarVoyageContentProviderHyperSpark3838(polarVoyageMaterialButtonDragonCyberMega61885.PolarVoyageRemoteModelManagerOlympianCelestial9141);
        PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61886 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
        if (polarVoyageMaterialButtonDragonCyberMega61886.PolarVoyageViewRogueMaster4778 && polarVoyageMaterialButtonDragonCyberMega61886.PolarVoyageBitmapVisionAuroraPixel4705 == 3 && PolarVoyageLayerSpeedBlazeVortex2881(polarVoyageMaterialButtonDragonCyberMega61886.PolarVoyageZipVortexCelestial6185, polarVoyageMaterialButtonDragonCyberMega61886.PolarVoyageMotionLayoutTransitionHeroVision4068)) {
            PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61887 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
            float f2 = 1.0f;
            if (polarVoyageMaterialButtonDragonCyberMega61887.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageZipVortexCelestial6185 == 1.0f) {
                PolarVoyageTextRecognitionMaxPhantom8204 polarVoyageTextRecognitionMaxPhantom8204 = this.PolarVoyageLooperThreadAlphaPrime1279;
                long PolarVoyageCameraPixelBlaze2629 = PolarVoyageCameraPixelBlaze2629(polarVoyageMaterialButtonDragonCyberMega61887.PolarVoyageZipVortexCelestial6185, polarVoyageMaterialButtonDragonCyberMega61887.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185, polarVoyageMaterialButtonDragonCyberMega61887.PolarVoyageAnimatorSetSparkUltraMax8233);
                long j4 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageNavigationViewHyperHyperHyperion1793;
                if (polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageKotlinBetaPulseBeta3653 != -9223372036854775807L) {
                    long j5 = PolarVoyageCameraPixelBlaze2629 - j4;
                    long j6 = polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageCameraPixelBlaze2629;
                    if (j6 == -9223372036854775807L) {
                        polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageCameraPixelBlaze2629 = j5;
                        polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageDrawableDeltaHyperion5742 = 0L;
                    } else {
                        polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageCameraPixelBlaze2629 = Math.max(j5, (long) ((j5 * 9.999871E-4f) + (j6 * 0.999f)));
                        polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageDrawableDeltaHyperion5742 = (long) ((9.999871E-4f * Math.abs(j5 - r9)) + (polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageDrawableDeltaHyperion5742 * 0.999f));
                    }
                    if (polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageViewRogueMaster4778 != -9223372036854775807L) {
                        j = 1000;
                        if (SystemClock.elapsedRealtime() - polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageViewRogueMaster4778 < 1000) {
                            f2 = polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageBottomSheetOmegaNeo1907;
                        }
                    } else {
                        j = 1000;
                    }
                    polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageViewRogueMaster4778 = SystemClock.elapsedRealtime();
                    long j7 = (polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageDrawableDeltaHyperion5742 * 3) + polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageCameraPixelBlaze2629;
                    if (polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageItemDecorationUltraDeltaEpic7485 > j7) {
                        float PolarVoyageLifecycleOlympianOmega3762 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageLifecycleOlympianOmega3762(j);
                        f = 1.0E-7f;
                        long[] jArr = {j7, polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageBitmapVisionAuroraPixel4705, polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageItemDecorationUltraDeltaEpic7485 - (((long) ((polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageBottomSheetOmegaNeo1907 - 1.0f) * PolarVoyageLifecycleOlympianOmega3762)) + ((long) ((polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageStrictModeLegendEpic1532 - 1.0f) * PolarVoyageLifecycleOlympianOmega3762)))};
                        long j8 = jArr[0];
                        for (int i = 1; i < 3; i++) {
                            long j9 = jArr[i];
                            if (j9 > j8) {
                                j8 = j9;
                            }
                        }
                        polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageItemDecorationUltraDeltaEpic7485 = j8;
                    } else {
                        f = 1.0E-7f;
                        long PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageCameraPixelBlaze2629 - ((long) (Math.max(0.0f, polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageBottomSheetOmegaNeo1907 - 1.0f) / 1.0E-7f)), polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageItemDecorationUltraDeltaEpic7485, j7);
                        polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageItemDecorationUltraDeltaEpic7485;
                        long j10 = polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageTextInputEditTextNebulaHero6651;
                        if (j10 != -9223372036854775807L && PolarVoyageItemDecorationUltraDeltaEpic7485 > j10) {
                            polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageItemDecorationUltraDeltaEpic7485 = j10;
                        }
                    }
                    long j11 = PolarVoyageCameraPixelBlaze2629 - polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    if (Math.abs(j11) < polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageZipVortexCelestial6185) {
                        polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageBottomSheetOmegaNeo1907 = 1.0f;
                    } else {
                        polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageDiffUtilTurboStrike5735((f * j11) + 1.0f, polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageRotateAnimationCyberCelestialDelta4768, polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageStrictModeLegendEpic1532);
                    }
                    f2 = polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageBottomSheetOmegaNeo1907;
                }
                if (this.PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageBarcodeScannerInfernoSolarSpark7767().PolarVoyageZipVortexCelestial6185 != f2) {
                    PolarVoyageTransitionBlazePixel9380 polarVoyageTransitionBlazePixel9380 = new PolarVoyageTransitionBlazePixel9380(f2, this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageMotionLayoutTransitionHeroVision4068);
                    this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageBitmapVisionAuroraPixel4705(16);
                    this.PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageTransitionBlazePixel9380);
                    PolarVoyageAlertDialogCyberHeroQuantum3938(this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageSnackbarGammaEclipse2140, this.PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageBarcodeScannerInfernoSolarSpark7767().PolarVoyageZipVortexCelestial6185, false, false);
                }
            }
        }
    }

    public final void PolarVoyageItemDecorationUltraDeltaEpic7485(int i) {
        PolarVoyageServiceStormMasterPixel9641[] polarVoyageServiceStormMasterPixel9641Arr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageServiceStormMasterPixel9641Arr[i].PolarVoyageKotlinBetaPulseBeta3653();
        PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 = polarVoyageServiceStormMasterPixel9641Arr[i];
        PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX9940 = polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185;
        PolarVoyageDiffUtilSpeedCelestial7413 polarVoyageDiffUtilSpeedCelestial7413 = this.PolarVoyageDisplayMetricsVortexDragon9516;
        polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185(polarVoyageGestureDetectorPhoenixNovaX9940, polarVoyageDiffUtilSpeedCelestial7413);
        PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99402 = polarVoyageServiceStormMasterPixel9641.PolarVoyageKotlinBetaPulseBeta3653;
        if (polarVoyageGestureDetectorPhoenixNovaX99402 != null) {
            boolean z = (polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageSnackbarGammaEclipse2140 == 0 || polarVoyageServiceStormMasterPixel9641.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == 3) ? false : true;
            polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185(polarVoyageGestureDetectorPhoenixNovaX99402, polarVoyageDiffUtilSpeedCelestial7413);
            polarVoyageServiceStormMasterPixel9641.PolarVoyageStrictModeLegendEpic1532(false);
            if (z) {
                PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99403 = polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185;
                polarVoyageGestureDetectorPhoenixNovaX99402.getClass();
                polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageKotlinBetaPulseBeta3653(17, polarVoyageGestureDetectorPhoenixNovaX99403);
            }
        }
        polarVoyageServiceStormMasterPixel9641.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 0;
        PolarVoyageCardViewAlphaVortexCelestial9747(i, false);
        this.PolarVoyageMapTurboRogueTitan9291 -= PolarVoyageKotlinBetaPulseBeta3653;
    }

    public final void PolarVoyageKeyframeEpicNovaXCyber9821(long j) {
        boolean z;
        if (this.PolarVoyageAlarmManagerShadowHyperBeta8339) {
            this.PolarVoyageToolbarEclipseInfernoHero6368.getClass();
            z = true;
        } else {
            z = false;
        }
        PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
        long j2 = PolarVoyageCombineBlazeSparkInferno2844;
        if (z) {
            r4 = polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageBitmapVisionAuroraPixel4705 != 3 ? j2 : 1000L;
            for (PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 : this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                long j3 = this.PolarVoyageWithContextPulseSolarHyperion4393;
                long j4 = this.PolarVoyageThreadPhoenixVisionSolar1313;
                PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX9940 = polarVoyageServiceStormMasterPixel9641.PolarVoyageKotlinBetaPulseBeta3653;
                PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99402 = polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185;
                long PolarVoyageStrictModeLegendEpic1532 = PolarVoyageServiceStormMasterPixel9641.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageGestureDetectorPhoenixNovaX99402) ? polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageStrictModeLegendEpic1532(j3, j4) : Long.MAX_VALUE;
                if (polarVoyageGestureDetectorPhoenixNovaX9940 != null && polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageSnackbarGammaEclipse2140 != 0) {
                    PolarVoyageStrictModeLegendEpic1532 = Math.min(PolarVoyageStrictModeLegendEpic1532, polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageStrictModeLegendEpic1532(j3, j4));
                }
                r4 = Math.min(r4, PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageGuidelineStormSolar2850(PolarVoyageStrictModeLegendEpic1532));
            }
            if (this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageViewRogueMaster4778()) {
                PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532;
                if ((polarVoyageAdMobDeltaMasterShadow9877 != null ? polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageCameraPixelBlaze2629 : null) != null) {
                    if ((PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageLifecycleOlympianOmega3762(r4) * this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageZipVortexCelestial6185) + this.PolarVoyageWithContextPulseSolarHyperion4393 >= r1.PolarVoyageBitmapVisionAuroraPixel4705()) {
                        r4 = Math.min(r4, j2);
                    }
                }
            }
        } else if (polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageBitmapVisionAuroraPixel4705 != 3 || PolarVoyageConstraintSetCloneCelestialHero1930()) {
            r4 = j2;
        }
        this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageZipVortexCelestial6185.sendEmptyMessageAtTime(2, j + r4);
    }

    @Override // p000createpolar.PolarVoyageNavigationViewVortexPulse6567
    public final void PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageInAppPurchaseShadowBlazeCyber6689 polarVoyageInAppPurchaseShadowBlazeCyber6689) {
        this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageMotionLayoutTransitionHeroVision4068(9, (PolarVoyageServiceVortexCosmosAlpha1023) polarVoyageInAppPurchaseShadowBlazeCyber6689).PolarVoyageMotionLayoutTransitionHeroVision4068();
    }

    public final void PolarVoyageKotlinHeroHyper4083(PolarVoyageBroadcastBetaPhantomHero6008 polarVoyageBroadcastBetaPhantomHero6008) {
        for (PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 : this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX9940 = polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185;
            if (polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageStrictModeLegendEpic1532 == 4) {
                polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageKotlinBetaPulseBeta3653(23, polarVoyageBroadcastBetaPhantomHero6008);
                PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99402 = polarVoyageServiceStormMasterPixel9641.PolarVoyageKotlinBetaPulseBeta3653;
                if (polarVoyageGestureDetectorPhoenixNovaX99402 != null) {
                    polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageKotlinBetaPulseBeta3653(23, polarVoyageBroadcastBetaPhantomHero6008);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03aa A[Catch: all -> 0x03a5, TryCatch #1 {all -> 0x03a5, blocks: (B:127:0x03a1, B:128:0x03aa, B:130:0x03b0, B:43:0x03bf, B:65:0x03c6, B:67:0x03cc, B:69:0x03d6, B:71:0x03e3, B:74:0x03e6), top: B:41:0x036c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageLayerDrawableShadowTitaniumOmega1942(PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow5566, boolean z) {
        long j;
        PolarVoyageInterstitialAdMasterShadowCosmos9360 polarVoyageInterstitialAdMasterShadowCosmos9360;
        Object obj;
        int i;
        long PolarVoyageItemDecorationUltraDeltaEpic7485;
        long j2;
        boolean z2;
        boolean z3;
        boolean z4;
        PolarVoyageScrollViewFusionVision5184 polarVoyageScrollViewFusionVision5184;
        boolean z5;
        PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow55662;
        PolarVoyageScrollViewFusionVision5184 polarVoyageScrollViewFusionVision51842;
        PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow55663;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        int i2;
        PolarVoyageTextRecognitionDeltaMaster4620 polarVoyageTextRecognitionDeltaMaster4620;
        int i3;
        long longValue;
        boolean z6;
        int i4;
        boolean z7;
        PolarVoyageScrollViewFusionVision5184 polarVoyageScrollViewFusionVision51843;
        PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow55664;
        PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow55665;
        PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497;
        boolean z8;
        PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow55666;
        long j8;
        int PolarVoyageAnimatorSetSparkUltraMax8233;
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877;
        PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
        PolarVoyageAccelerometerMaxShadowCosmos8778 polarVoyageAccelerometerMaxShadowCosmos8778 = this.PolarVoyageKotlinHeroHyper4083;
        PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha1105 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
        int i5 = this.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576;
        boolean z9 = this.PolarVoyageHandlerThreadMaxAurora5064;
        PolarVoyageInterstitialAdMasterShadowCosmos9360 polarVoyageInterstitialAdMasterShadowCosmos93602 = this.PolarVoyageNavigationViewHyperHyperHyperion1793;
        PolarVoyageScrollViewFusionVision5184 polarVoyageScrollViewFusionVision51844 = this.PolarVoyageAnimatorSetSparkUltraMax8233;
        if (polarVoyageRoomDaoPulseShadow5566.PolarVoyageContentProviderHyperSpark3838()) {
            PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse14972 = PolarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageDisplayMetricsVortexDragon9516;
            boolean z10 = (polarVoyageCombineBlazePulse14972.equals(polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageMotionLayoutTransitionHeroVision4068) && polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageAnimatorSetSparkUltraMax8233 == 0) ? false : true;
            PolarVoyageTextRecognitionDeltaMaster4620 polarVoyageTextRecognitionDeltaMaster46202 = new PolarVoyageTextRecognitionDeltaMaster4620(polarVoyageCombineBlazePulse14972, 0L, -9223372036854775807L, false, true, false, z10, z10 && z && !polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageZipVortexCelestial6185.PolarVoyageContentProviderHyperSpark3838() && !polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageZipVortexCelestial6185.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185, polarVoyageScrollViewFusionVision51844).PolarVoyageDiffUtilTurboStrike5735, 4);
            polarVoyageRoomDaoPulseShadow55664 = polarVoyageRoomDaoPulseShadow5566;
            j5 = 0;
            polarVoyageTextRecognitionDeltaMaster4620 = polarVoyageTextRecognitionDeltaMaster46202;
            polarVoyageScrollViewFusionVision51843 = polarVoyageScrollViewFusionVision51844;
        } else {
            PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse14973 = polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageMotionLayoutTransitionHeroVision4068;
            Object obj2 = polarVoyageCombineBlazePulse14973.PolarVoyageZipVortexCelestial6185;
            PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow55667 = polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageZipVortexCelestial6185;
            boolean z11 = polarVoyageRoomDaoPulseShadow55667.PolarVoyageContentProviderHyperSpark3838() || polarVoyageRoomDaoPulseShadow55667.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageCombineBlazePulse14973.PolarVoyageZipVortexCelestial6185, polarVoyageScrollViewFusionVision51844).PolarVoyageDiffUtilTurboStrike5735;
            long j9 = (polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068() || z11) ? polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageKotlinBetaPulseBeta3653 : polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageAnimatorSetSparkUltraMax8233;
            if (polarVoyageAccelerometerMaxShadowCosmos8778 != null) {
                boolean z12 = true;
                j = 1;
                PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow55668 = polarVoyageRoomDaoPulseShadow5566;
                Pair PolarVoyageAlertDialogNovaXCelestial4954 = PolarVoyageAlertDialogNovaXCelestial4954(polarVoyageRoomDaoPulseShadow55668, polarVoyageAccelerometerMaxShadowCosmos8778, true, i5, z9, polarVoyageInterstitialAdMasterShadowCosmos93602, polarVoyageScrollViewFusionVision51844);
                if (PolarVoyageAlertDialogNovaXCelestial4954 == null) {
                    i4 = polarVoyageRoomDaoPulseShadow55668.PolarVoyageZipVortexCelestial6185(z9);
                    obj = obj2;
                    longValue = j9;
                    z6 = false;
                    z7 = false;
                } else {
                    long j10 = polarVoyageAccelerometerMaxShadowCosmos8778.PolarVoyageKotlinBetaPulseBeta3653;
                    obj = PolarVoyageAlertDialogNovaXCelestial4954.first;
                    if (j10 == -9223372036854775807L) {
                        i4 = polarVoyageRoomDaoPulseShadow55668.PolarVoyageTextInputEditTextNebulaHero6651(obj, polarVoyageScrollViewFusionVision51844).PolarVoyageKotlinBetaPulseBeta3653;
                        obj = obj2;
                        longValue = j9;
                        z6 = false;
                    } else {
                        longValue = ((Long) PolarVoyageAlertDialogNovaXCelestial4954.second).longValue();
                        z6 = true;
                        i4 = -1;
                    }
                    z7 = polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageBitmapVisionAuroraPixel4705 == 4;
                    z12 = false;
                }
                z4 = z6;
                z3 = z12;
                z2 = z7;
                j2 = longValue;
                i = i4;
                polarVoyageInterstitialAdMasterShadowCosmos9360 = polarVoyageInterstitialAdMasterShadowCosmos93602;
                polarVoyageRoomDaoPulseShadow55663 = polarVoyageRoomDaoPulseShadow55668;
                polarVoyageScrollViewFusionVision51842 = polarVoyageScrollViewFusionVision51844;
            } else {
                j = 1;
                PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow55669 = polarVoyageRoomDaoPulseShadow5566;
                if (polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageZipVortexCelestial6185.PolarVoyageContentProviderHyperSpark3838()) {
                    i = polarVoyageRoomDaoPulseShadow55669.PolarVoyageZipVortexCelestial6185(z9);
                    polarVoyageInterstitialAdMasterShadowCosmos9360 = polarVoyageInterstitialAdMasterShadowCosmos93602;
                    obj = obj2;
                } else if (polarVoyageRoomDaoPulseShadow55669.PolarVoyageMotionLayoutTransitionHeroVision4068(obj2) == -1) {
                    obj = obj2;
                    int PolarVoyageColorStateListEliteStrikeOlympian8131 = PolarVoyageColorStateListEliteStrikeOlympian8131(polarVoyageInterstitialAdMasterShadowCosmos93602, polarVoyageScrollViewFusionVision51844, i5, z9, obj, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageZipVortexCelestial6185, polarVoyageRoomDaoPulseShadow55669);
                    polarVoyageInterstitialAdMasterShadowCosmos9360 = polarVoyageInterstitialAdMasterShadowCosmos93602;
                    PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow556610 = polarVoyageRoomDaoPulseShadow55669;
                    polarVoyageScrollViewFusionVision5184 = polarVoyageScrollViewFusionVision51844;
                    if (PolarVoyageColorStateListEliteStrikeOlympian8131 == -1) {
                        PolarVoyageColorStateListEliteStrikeOlympian8131 = polarVoyageRoomDaoPulseShadow556610.PolarVoyageZipVortexCelestial6185(z9);
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    i = PolarVoyageColorStateListEliteStrikeOlympian8131;
                    z3 = z5;
                    j2 = j9;
                    z2 = false;
                    polarVoyageRoomDaoPulseShadow55662 = polarVoyageRoomDaoPulseShadow556610;
                    z4 = false;
                    polarVoyageRoomDaoPulseShadow55663 = polarVoyageRoomDaoPulseShadow55662;
                    polarVoyageScrollViewFusionVision51842 = polarVoyageScrollViewFusionVision5184;
                } else {
                    polarVoyageInterstitialAdMasterShadowCosmos9360 = polarVoyageInterstitialAdMasterShadowCosmos93602;
                    obj = obj2;
                    if (j9 == -9223372036854775807L) {
                        i = polarVoyageRoomDaoPulseShadow55669.PolarVoyageTextInputEditTextNebulaHero6651(obj, polarVoyageScrollViewFusionVision51844).PolarVoyageKotlinBetaPulseBeta3653;
                    } else if (z11) {
                        polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageZipVortexCelestial6185.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageCombineBlazePulse14973.PolarVoyageZipVortexCelestial6185, polarVoyageScrollViewFusionVision51844);
                        if (polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageZipVortexCelestial6185.PolarVoyageCameraPixelBlaze2629(polarVoyageScrollViewFusionVision51844.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageInterstitialAdMasterShadowCosmos9360, 0L).PolarVoyageViewRogueMaster4778 == polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageZipVortexCelestial6185.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageCombineBlazePulse14973.PolarVoyageZipVortexCelestial6185)) {
                            Pair PolarVoyageStrictModeLegendEpic1532 = polarVoyageRoomDaoPulseShadow55669.PolarVoyageStrictModeLegendEpic1532(polarVoyageInterstitialAdMasterShadowCosmos9360, polarVoyageScrollViewFusionVision51844, polarVoyageRoomDaoPulseShadow55669.PolarVoyageTextInputEditTextNebulaHero6651(obj, polarVoyageScrollViewFusionVision51844).PolarVoyageKotlinBetaPulseBeta3653, j9 + polarVoyageScrollViewFusionVision51844.PolarVoyageBitmapVisionAuroraPixel4705);
                            obj = PolarVoyageStrictModeLegendEpic1532.first;
                            PolarVoyageItemDecorationUltraDeltaEpic7485 = ((Long) PolarVoyageStrictModeLegendEpic1532.second).longValue();
                        } else {
                            PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageRoomDaoPulseShadow55669.PolarVoyageTextInputEditTextNebulaHero6651(obj, polarVoyageScrollViewFusionVision51844).PolarVoyageBarcodeScannerInfernoSolarSpark7767 != -9223372036854775807L ? PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageItemDecorationUltraDeltaEpic7485(j9, 0L, polarVoyageScrollViewFusionVision51844.PolarVoyageBarcodeScannerInfernoSolarSpark7767 - 1) : j9;
                        }
                        j2 = PolarVoyageItemDecorationUltraDeltaEpic7485;
                        i = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                        polarVoyageRoomDaoPulseShadow55663 = polarVoyageRoomDaoPulseShadow55669;
                        polarVoyageScrollViewFusionVision51842 = polarVoyageScrollViewFusionVision51844;
                    } else {
                        i = -1;
                    }
                }
                j2 = j9;
                z2 = false;
                z3 = false;
                polarVoyageRoomDaoPulseShadow55662 = polarVoyageRoomDaoPulseShadow55669;
                polarVoyageScrollViewFusionVision5184 = polarVoyageScrollViewFusionVision51844;
                z4 = false;
                polarVoyageRoomDaoPulseShadow55663 = polarVoyageRoomDaoPulseShadow55662;
                polarVoyageScrollViewFusionVision51842 = polarVoyageScrollViewFusionVision5184;
            }
            if (i != -1) {
                Pair PolarVoyageStrictModeLegendEpic15322 = polarVoyageRoomDaoPulseShadow55663.PolarVoyageStrictModeLegendEpic1532(polarVoyageInterstitialAdMasterShadowCosmos9360, polarVoyageScrollViewFusionVision51842, i, -9223372036854775807L);
                obj = PolarVoyageStrictModeLegendEpic15322.first;
                j2 = ((Long) PolarVoyageStrictModeLegendEpic15322.second).longValue();
                j3 = -9223372036854775807L;
            } else {
                j3 = j2;
            }
            PolarVoyageCombineBlazePulse1497 PolarVoyageContentProviderHyperSpark3838 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageContentProviderHyperSpark3838(polarVoyageRoomDaoPulseShadow55663, obj, j2);
            int i6 = PolarVoyageContentProviderHyperSpark3838.PolarVoyageBitmapVisionAuroraPixel4705;
            boolean z13 = i6 == -1 || ((i3 = polarVoyageCombineBlazePulse14973.PolarVoyageBitmapVisionAuroraPixel4705) != -1 && i6 >= i3);
            boolean equals = polarVoyageCombineBlazePulse14973.PolarVoyageZipVortexCelestial6185.equals(obj);
            boolean z14 = equals && !polarVoyageCombineBlazePulse14973.PolarVoyageMotionLayoutTransitionHeroVision4068() && !PolarVoyageContentProviderHyperSpark3838.PolarVoyageMotionLayoutTransitionHeroVision4068() && z13;
            PolarVoyageScrollViewFusionVision5184 PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageRoomDaoPulseShadow55663.PolarVoyageTextInputEditTextNebulaHero6651(obj, polarVoyageScrollViewFusionVision51842);
            if (z11 || j9 != j3) {
                j4 = j3;
            } else {
                Object obj3 = polarVoyageCombineBlazePulse14973.PolarVoyageZipVortexCelestial6185;
                int i7 = polarVoyageCombineBlazePulse14973.PolarVoyageMotionLayoutTransitionHeroVision4068;
                j4 = j3;
                if (obj3.equals(PolarVoyageContentProviderHyperSpark3838.PolarVoyageZipVortexCelestial6185)) {
                    if (polarVoyageCombineBlazePulse14973.PolarVoyageMotionLayoutTransitionHeroVision4068()) {
                        PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageTextInputEditTextNebulaHero6651(i7);
                    }
                    if (PolarVoyageContentProviderHyperSpark3838.PolarVoyageMotionLayoutTransitionHeroVision4068()) {
                        PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageContentProviderHyperSpark3838.PolarVoyageMotionLayoutTransitionHeroVision4068);
                    }
                }
            }
            if (z14) {
                PolarVoyageContentProviderHyperSpark3838 = polarVoyageCombineBlazePulse14973;
            }
            if (!PolarVoyageContentProviderHyperSpark3838.PolarVoyageMotionLayoutTransitionHeroVision4068()) {
                if (equals && polarVoyageCombineBlazePulse14973.PolarVoyageMotionLayoutTransitionHeroVision4068()) {
                    PolarVoyageKotlinInfernoTitan8536 PolarVoyageZipVortexCelestial6185 = polarVoyageRoomDaoPulseShadow55663.PolarVoyageTextInputEditTextNebulaHero6651(obj, polarVoyageScrollViewFusionVision51842).PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185(polarVoyageCombineBlazePulse14973.PolarVoyageMotionLayoutTransitionHeroVision4068);
                    PolarVoyageZipVortexCelestial6185.getClass();
                    long j11 = polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageKotlinBetaPulseBeta3653;
                    j5 = 0;
                    if (j11 == -9223372036854775807L || 0 > j11) {
                        int i8 = PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185;
                        int i9 = polarVoyageCombineBlazePulse14973.PolarVoyageKotlinBetaPulseBeta3653;
                        if (i8 > i9 && PolarVoyageZipVortexCelestial6185.PolarVoyageBitmapVisionAuroraPixel4705[i9] == 2) {
                            long j12 = polarVoyageRoomDaoPulseShadow55663.PolarVoyageTextInputEditTextNebulaHero6651(obj, polarVoyageScrollViewFusionVision51842).PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                            if (j12 != -9223372036854775807L) {
                                j2 = Math.min(j12 - j, j2);
                            }
                            j6 = j2;
                            j7 = j6;
                        }
                    }
                } else {
                    j5 = 0;
                }
                j6 = j2;
                j7 = j4;
            } else if (PolarVoyageContentProviderHyperSpark3838.equals(polarVoyageCombineBlazePulse14973)) {
                j6 = polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageAnimatorSetSparkUltraMax8233;
                j7 = j4;
                j5 = 0;
            } else {
                polarVoyageRoomDaoPulseShadow55663.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageContentProviderHyperSpark3838.PolarVoyageZipVortexCelestial6185, polarVoyageScrollViewFusionVision51842);
                if (PolarVoyageContentProviderHyperSpark3838.PolarVoyageKotlinBetaPulseBeta3653 == polarVoyageScrollViewFusionVision51842.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageContentProviderHyperSpark3838.PolarVoyageMotionLayoutTransitionHeroVision4068)) {
                    polarVoyageScrollViewFusionVision51842.PolarVoyageTextInputEditTextNebulaHero6651.getClass();
                }
                j7 = j4;
                j5 = 0;
                j6 = 0;
            }
            boolean z15 = (PolarVoyageContentProviderHyperSpark3838.equals(polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageMotionLayoutTransitionHeroVision4068) && j6 == polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageAnimatorSetSparkUltraMax8233) ? false : true;
            int i10 = polarVoyageRoomDaoPulseShadow55663.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185) == -1 ? 4 : 3;
            if (PolarVoyageContentProviderHyperSpark3838.PolarVoyageZipVortexCelestial6185.equals(polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185) && PolarVoyageContentProviderHyperSpark3838.PolarVoyageMotionLayoutTransitionHeroVision4068 != -1) {
                PolarVoyageKotlinInfernoTitan8536 PolarVoyageZipVortexCelestial61852 = polarVoyageRoomDaoPulseShadow55663.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageContentProviderHyperSpark3838.PolarVoyageZipVortexCelestial6185, polarVoyageScrollViewFusionVision51842).PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185(PolarVoyageContentProviderHyperSpark3838.PolarVoyageMotionLayoutTransitionHeroVision4068);
                int i11 = PolarVoyageContentProviderHyperSpark3838.PolarVoyageKotlinBetaPulseBeta3653;
                int[] iArr = PolarVoyageZipVortexCelestial61852.PolarVoyageBitmapVisionAuroraPixel4705;
                if (i11 >= iArr.length || iArr[i11] != 2) {
                    i2 = 0;
                    polarVoyageTextRecognitionDeltaMaster4620 = new PolarVoyageTextRecognitionDeltaMaster4620(PolarVoyageContentProviderHyperSpark3838, j6, j7, z2, z3, z4, z15, (z15 || !z || polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageZipVortexCelestial6185.PolarVoyageContentProviderHyperSpark3838() || polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageZipVortexCelestial6185.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185, polarVoyageScrollViewFusionVision51842).PolarVoyageDiffUtilTurboStrike5735) ? false : true, i2);
                    polarVoyageRoomDaoPulseShadow55664 = polarVoyageRoomDaoPulseShadow55663;
                    polarVoyageScrollViewFusionVision51843 = polarVoyageScrollViewFusionVision51842;
                }
            }
            i2 = i10;
            polarVoyageTextRecognitionDeltaMaster4620 = new PolarVoyageTextRecognitionDeltaMaster4620(PolarVoyageContentProviderHyperSpark3838, j6, j7, z2, z3, z4, z15, (z15 || !z || polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageZipVortexCelestial6185.PolarVoyageContentProviderHyperSpark3838() || polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageZipVortexCelestial6185.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185, polarVoyageScrollViewFusionVision51842).PolarVoyageDiffUtilTurboStrike5735) ? false : true, i2);
            polarVoyageRoomDaoPulseShadow55664 = polarVoyageRoomDaoPulseShadow55663;
            polarVoyageScrollViewFusionVision51843 = polarVoyageScrollViewFusionVision51842;
        }
        PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse14974 = polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageZipVortexCelestial6185;
        long j13 = polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageMotionLayoutTransitionHeroVision4068;
        try {
            if (polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageBitmapVisionAuroraPixel4705) {
                z8 = true;
                if (this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBitmapVisionAuroraPixel4705 != 1) {
                    PolarVoyageCombineBlazeSparkInferno2844(4);
                }
                PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803(false, false, false, true);
            } else {
                z8 = true;
            }
            PolarVoyageServiceStormMasterPixel9641[] polarVoyageServiceStormMasterPixel9641Arr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            int length = polarVoyageServiceStormMasterPixel9641Arr.length;
            int i12 = 0;
            PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow556611 = polarVoyageScrollViewFusionVision51843;
            while (i12 < length) {
                PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 = polarVoyageServiceStormMasterPixel9641Arr[i12];
                PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX9940 = polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185;
                boolean equals2 = Objects.equals(polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageMotionLayoutForceEpicAurora7183, polarVoyageRoomDaoPulseShadow55664);
                if (equals2 == 0) {
                    polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageMotionLayoutForceEpicAurora7183 = polarVoyageRoomDaoPulseShadow55664;
                    polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageAlertDialogCyberHeroQuantum3938();
                }
                PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99402 = polarVoyageServiceStormMasterPixel9641.PolarVoyageKotlinBetaPulseBeta3653;
                if (polarVoyageGestureDetectorPhoenixNovaX99402 != null && !Objects.equals(polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageMotionLayoutForceEpicAurora7183, polarVoyageRoomDaoPulseShadow55664)) {
                    polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageMotionLayoutForceEpicAurora7183 = polarVoyageRoomDaoPulseShadow55664;
                    polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageAlertDialogCyberHeroQuantum3938();
                }
                i12++;
                polarVoyageRoomDaoPulseShadow556611 = equals2;
            }
            try {
                if (polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageTextInputEditTextNebulaHero6651) {
                    polarVoyageRoomDaoPulseShadow556611 = polarVoyageRoomDaoPulseShadow55664;
                    if (!polarVoyageRoomDaoPulseShadow556611.PolarVoyageContentProviderHyperSpark3838()) {
                        for (PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98772 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532; polarVoyageAdMobDeltaMasterShadow98772 != null; polarVoyageAdMobDeltaMasterShadow98772 = polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageCameraPixelBlaze2629) {
                            if (polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185.equals(polarVoyageCombineBlazePulse14974)) {
                                polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageTextInputEditTextNebulaHero6651 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageRoomDaoPulseShadow556611, polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageTextInputEditTextNebulaHero6651);
                                polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageBottomSheetOmegaNeo1907();
                            }
                        }
                        boolean z16 = polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                        try {
                            PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha11052 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
                            polarVoyageCombineBlazePulse1497 = polarVoyageCombineBlazePulse14974;
                            try {
                                j13 = PolarVoyageHandlerThreadMaxAurora5064(polarVoyageCombineBlazePulse1497, j13, polarVoyageConstraintSetNovaSolarAlpha11052.PolarVoyageStrictModeLegendEpic1532 != polarVoyageConstraintSetNovaSolarAlpha11052.PolarVoyageRotateAnimationCyberCelestialDelta4768 ? z8 : false, z16);
                                PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61882 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                                PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse14975 = polarVoyageCombineBlazePulse1497;
                                PolarVoyageSharedFlowRogueDeltaForce1577(polarVoyageRoomDaoPulseShadow5566, polarVoyageCombineBlazePulse14975, polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageZipVortexCelestial6185, polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageMotionLayoutTransitionHeroVision4068, !polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageDiffUtilTurboStrike5735 ? j13 : -9223372036854775807L, false);
                                if (!polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageTextInputEditTextNebulaHero6651 || polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageKotlinBetaPulseBeta3653 != this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageKotlinBetaPulseBeta3653) {
                                    long j14 = polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageKotlinBetaPulseBeta3653;
                                    boolean z17 = polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageItemDecorationUltraDeltaEpic7485;
                                    this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageCombineBlazePulse14975, j13, j14, !z17 ? j13 : this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBarcodeScannerInfernoSolarSpark7767, z17, polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageStrictModeLegendEpic1532);
                                }
                                PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587();
                                PolarVoyagePoseDetectionCosmosVision6217(polarVoyageRoomDaoPulseShadow5566, this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185);
                                this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageStrictModeLegendEpic1532(polarVoyageRoomDaoPulseShadow5566);
                                if (!polarVoyageRoomDaoPulseShadow5566.PolarVoyageContentProviderHyperSpark3838()) {
                                    this.PolarVoyageKotlinHeroHyper4083 = null;
                                }
                                PolarVoyageDisplayMetricsVortexDragon9516(false);
                                this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageDiffUtilTurboStrike5735(2);
                            } catch (Throwable th) {
                                th = th;
                                j13 = j13;
                                polarVoyageRoomDaoPulseShadow55666 = polarVoyageRoomDaoPulseShadow556611;
                                polarVoyageRoomDaoPulseShadow55665 = polarVoyageRoomDaoPulseShadow55666;
                                PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61883 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                                PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow556612 = polarVoyageMaterialButtonDragonCyberMega61883.PolarVoyageZipVortexCelestial6185;
                                PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse14976 = polarVoyageMaterialButtonDragonCyberMega61883.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse14977 = polarVoyageCombineBlazePulse1497;
                                PolarVoyageSharedFlowRogueDeltaForce1577(polarVoyageRoomDaoPulseShadow55665, polarVoyageCombineBlazePulse14977, polarVoyageRoomDaoPulseShadow556612, polarVoyageCombineBlazePulse14976, polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageDiffUtilTurboStrike5735 ? j13 : -9223372036854775807L, false);
                                if (!polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageTextInputEditTextNebulaHero6651) {
                                }
                                long j15 = polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageKotlinBetaPulseBeta3653;
                                boolean z18 = polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageItemDecorationUltraDeltaEpic7485;
                                this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageCombineBlazePulse14977, j13, j15, z18 ? j13 : this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBarcodeScannerInfernoSolarSpark7767, z18, polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageStrictModeLegendEpic1532);
                                PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587();
                                PolarVoyagePoseDetectionCosmosVision6217(polarVoyageRoomDaoPulseShadow55665, this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185);
                                this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageStrictModeLegendEpic1532(polarVoyageRoomDaoPulseShadow55665);
                                if (!polarVoyageRoomDaoPulseShadow55665.PolarVoyageContentProviderHyperSpark3838()) {
                                }
                                PolarVoyageDisplayMetricsVortexDragon9516(false);
                                this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageDiffUtilTurboStrike5735(2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            polarVoyageCombineBlazePulse1497 = polarVoyageCombineBlazePulse14974;
                            polarVoyageRoomDaoPulseShadow55666 = polarVoyageRoomDaoPulseShadow556611;
                            polarVoyageRoomDaoPulseShadow55665 = polarVoyageRoomDaoPulseShadow55666;
                            PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega618832 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                            PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow5566122 = polarVoyageMaterialButtonDragonCyberMega618832.PolarVoyageZipVortexCelestial6185;
                            PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse149762 = polarVoyageMaterialButtonDragonCyberMega618832.PolarVoyageMotionLayoutTransitionHeroVision4068;
                            PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse149772 = polarVoyageCombineBlazePulse1497;
                            PolarVoyageSharedFlowRogueDeltaForce1577(polarVoyageRoomDaoPulseShadow55665, polarVoyageCombineBlazePulse149772, polarVoyageRoomDaoPulseShadow5566122, polarVoyageCombineBlazePulse149762, polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageDiffUtilTurboStrike5735 ? j13 : -9223372036854775807L, false);
                            if (!polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageTextInputEditTextNebulaHero6651) {
                            }
                            long j152 = polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageKotlinBetaPulseBeta3653;
                            boolean z182 = polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageItemDecorationUltraDeltaEpic7485;
                            this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageCombineBlazePulse149772, j13, j152, z182 ? j13 : this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBarcodeScannerInfernoSolarSpark7767, z182, polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageStrictModeLegendEpic1532);
                            PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587();
                            PolarVoyagePoseDetectionCosmosVision6217(polarVoyageRoomDaoPulseShadow55665, this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185);
                            this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageStrictModeLegendEpic1532(polarVoyageRoomDaoPulseShadow55665);
                            if (!polarVoyageRoomDaoPulseShadow55665.PolarVoyageContentProviderHyperSpark3838()) {
                            }
                            PolarVoyageDisplayMetricsVortexDragon9516(false);
                            this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageDiffUtilTurboStrike5735(2);
                            throw th;
                        }
                    }
                } else {
                    try {
                        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98773 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                        long PolarVoyageDrawableDeltaHyperion5742 = polarVoyageAdMobDeltaMasterShadow98773 == null ? j5 : PolarVoyageDrawableDeltaHyperion5742(polarVoyageAdMobDeltaMasterShadow98773);
                        try {
                            try {
                                if (PolarVoyageBitmapVisionAuroraPixel4705() && (polarVoyageAdMobDeltaMasterShadow9877 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageBottomSheetOmegaNeo1907) != null) {
                                    j8 = PolarVoyageDrawableDeltaHyperion5742(polarVoyageAdMobDeltaMasterShadow9877);
                                    PolarVoyageAnimatorSetSparkUltraMax8233 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyageRoomDaoPulseShadow5566, this.PolarVoyageWithContextPulseSolarHyperion4393, PolarVoyageDrawableDeltaHyperion5742, j8);
                                    if ((PolarVoyageAnimatorSetSparkUltraMax8233 & 1) == 0) {
                                        PolarVoyageMotionSceneStormSolarBeta2208(false);
                                    } else if ((PolarVoyageAnimatorSetSparkUltraMax8233 & 2) != 0) {
                                        PolarVoyageTextInputEditTextNebulaHero6651();
                                    }
                                }
                                PolarVoyageAnimatorSetSparkUltraMax8233 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyageRoomDaoPulseShadow5566, this.PolarVoyageWithContextPulseSolarHyperion4393, PolarVoyageDrawableDeltaHyperion5742, j8);
                                if ((PolarVoyageAnimatorSetSparkUltraMax8233 & 1) == 0) {
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                polarVoyageRoomDaoPulseShadow556611 = polarVoyageRoomDaoPulseShadow5566;
                                polarVoyageCombineBlazePulse1497 = polarVoyageCombineBlazePulse14974;
                                polarVoyageRoomDaoPulseShadow55666 = polarVoyageRoomDaoPulseShadow556611;
                                polarVoyageRoomDaoPulseShadow55665 = polarVoyageRoomDaoPulseShadow55666;
                                PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188322 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                                PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow55661222 = polarVoyageMaterialButtonDragonCyberMega6188322.PolarVoyageZipVortexCelestial6185;
                                PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497622 = polarVoyageMaterialButtonDragonCyberMega6188322.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497722 = polarVoyageCombineBlazePulse1497;
                                PolarVoyageSharedFlowRogueDeltaForce1577(polarVoyageRoomDaoPulseShadow55665, polarVoyageCombineBlazePulse1497722, polarVoyageRoomDaoPulseShadow55661222, polarVoyageCombineBlazePulse1497622, polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageDiffUtilTurboStrike5735 ? j13 : -9223372036854775807L, false);
                                if (!polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageTextInputEditTextNebulaHero6651 || polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageKotlinBetaPulseBeta3653 != this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageKotlinBetaPulseBeta3653) {
                                    long j1522 = polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageKotlinBetaPulseBeta3653;
                                    boolean z1822 = polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageItemDecorationUltraDeltaEpic7485;
                                    this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageCombineBlazePulse1497722, j13, j1522, z1822 ? j13 : this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBarcodeScannerInfernoSolarSpark7767, z1822, polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageStrictModeLegendEpic1532);
                                }
                                PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587();
                                PolarVoyagePoseDetectionCosmosVision6217(polarVoyageRoomDaoPulseShadow55665, this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185);
                                this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageStrictModeLegendEpic1532(polarVoyageRoomDaoPulseShadow55665);
                                if (!polarVoyageRoomDaoPulseShadow55665.PolarVoyageContentProviderHyperSpark3838()) {
                                    this.PolarVoyageKotlinHeroHyper4083 = null;
                                }
                                PolarVoyageDisplayMetricsVortexDragon9516(false);
                                this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageDiffUtilTurboStrike5735(2);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            polarVoyageRoomDaoPulseShadow556611 = polarVoyageRoomDaoPulseShadow5566;
                        }
                        j8 = j5;
                    } catch (Throwable th5) {
                        th = th5;
                        polarVoyageRoomDaoPulseShadow556611 = polarVoyageRoomDaoPulseShadow55664;
                    }
                }
                polarVoyageCombineBlazePulse1497 = polarVoyageCombineBlazePulse14974;
                PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega618822 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse149752 = polarVoyageCombineBlazePulse1497;
                PolarVoyageSharedFlowRogueDeltaForce1577(polarVoyageRoomDaoPulseShadow5566, polarVoyageCombineBlazePulse149752, polarVoyageMaterialButtonDragonCyberMega618822.PolarVoyageZipVortexCelestial6185, polarVoyageMaterialButtonDragonCyberMega618822.PolarVoyageMotionLayoutTransitionHeroVision4068, !polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageDiffUtilTurboStrike5735 ? j13 : -9223372036854775807L, false);
                if (!polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageTextInputEditTextNebulaHero6651) {
                }
                long j142 = polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageKotlinBetaPulseBeta3653;
                boolean z172 = polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageItemDecorationUltraDeltaEpic7485;
                this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageCombineBlazePulse149752, j13, j142, !z172 ? j13 : this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBarcodeScannerInfernoSolarSpark7767, z172, polarVoyageTextRecognitionDeltaMaster4620.PolarVoyageStrictModeLegendEpic1532);
                PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587();
                PolarVoyagePoseDetectionCosmosVision6217(polarVoyageRoomDaoPulseShadow5566, this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185);
                this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageStrictModeLegendEpic1532(polarVoyageRoomDaoPulseShadow5566);
                if (!polarVoyageRoomDaoPulseShadow5566.PolarVoyageContentProviderHyperSpark3838()) {
                }
                PolarVoyageDisplayMetricsVortexDragon9516(false);
                this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageDiffUtilTurboStrike5735(2);
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            polarVoyageRoomDaoPulseShadow55665 = polarVoyageRoomDaoPulseShadow55664;
            polarVoyageCombineBlazePulse1497 = polarVoyageCombineBlazePulse14974;
        }
    }

    public final boolean PolarVoyageLayerSpeedBlazeVortex2881(PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow5566, PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497) {
        if (polarVoyageCombineBlazePulse1497.PolarVoyageMotionLayoutTransitionHeroVision4068() || polarVoyageRoomDaoPulseShadow5566.PolarVoyageContentProviderHyperSpark3838()) {
            return false;
        }
        int i = polarVoyageRoomDaoPulseShadow5566.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageCombineBlazePulse1497.PolarVoyageZipVortexCelestial6185, this.PolarVoyageAnimatorSetSparkUltraMax8233).PolarVoyageKotlinBetaPulseBeta3653;
        PolarVoyageInterstitialAdMasterShadowCosmos9360 polarVoyageInterstitialAdMasterShadowCosmos9360 = this.PolarVoyageNavigationViewHyperHyperHyperion1793;
        polarVoyageRoomDaoPulseShadow5566.PolarVoyageDrawableDeltaHyperion5742(i, polarVoyageInterstitialAdMasterShadowCosmos9360);
        return polarVoyageInterstitialAdMasterShadowCosmos9360.PolarVoyageZipVortexCelestial6185() && polarVoyageInterstitialAdMasterShadowCosmos9360.PolarVoyageTextInputEditTextNebulaHero6651 && polarVoyageInterstitialAdMasterShadowCosmos9360.PolarVoyageBarcodeScannerInfernoSolarSpark7767 != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        long j3;
        boolean z5;
        PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow5566;
        PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow55662;
        PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497;
        List list;
        this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageBitmapVisionAuroraPixel4705(2);
        this.PolarVoyageGuidelineStormSolar2850 = false;
        if (this.PolarVoyageConfigurationMaxSpectraForce5418 != null) {
            this.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587.PolarVoyageKotlinBetaPulseBeta3653(1);
            this.PolarVoyageConfigurationMaxSpectraForce5418 = null;
        }
        this.PolarVoyageFlowOnBetaCyber2473 = null;
        PolarVoyageAlarmManagerBetaMaxPhantom7852(false, true);
        PolarVoyageDiffUtilSpeedCelestial7413 polarVoyageDiffUtilSpeedCelestial7413 = this.PolarVoyageDisplayMetricsVortexDragon9516;
        polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageCameraPixelBlaze2629 = false;
        PolarVoyageAlarmManagerBetaStrikeSpark3235 polarVoyageAlarmManagerBetaStrikeSpark3235 = polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (polarVoyageAlarmManagerBetaStrikeSpark3235.PolarVoyageStrictModeLegendEpic1532) {
            polarVoyageAlarmManagerBetaStrikeSpark3235.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageAlarmManagerBetaStrikeSpark3235.PolarVoyageBitmapVisionAuroraPixel4705());
            polarVoyageAlarmManagerBetaStrikeSpark3235.PolarVoyageStrictModeLegendEpic1532 = false;
        }
        this.PolarVoyageWithContextPulseSolarHyperion4393 = 1000000000000L;
        for (int i = 0; i < this.PolarVoyageItemDecorationUltraDeltaEpic7485.length; i++) {
            try {
                PolarVoyageItemDecorationUltraDeltaEpic7485(i);
            } catch (PolarVoyageAssetManagerQuantumSpectraPhoenix6233 e) {
                e = e;
                PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageAnimatorSetSparkUltraMax8233("ExoPlayerImplInternal", "Disable failed.", e);
                if (z) {
                }
                this.PolarVoyageMapTurboRogueTitan9291 = 0;
                PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse14972 = polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageMotionLayoutTransitionHeroVision4068;
                long j4 = polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageAnimatorSetSparkUltraMax8233;
                if (!this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068()) {
                }
                j = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageKotlinBetaPulseBeta3653;
                if (z2) {
                }
                this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageMotionLayoutTransitionHeroVision4068();
                this.PolarVoyageMotionSceneStormSolarBeta2208 = false;
                polarVoyageRoomDaoPulseShadow5566 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185;
                if (z3) {
                }
                polarVoyageRoomDaoPulseShadow55662 = polarVoyageRoomDaoPulseShadow5566;
                polarVoyageCombineBlazePulse1497 = polarVoyageCombineBlazePulse14972;
                PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61882 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                int i2 = polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageBitmapVisionAuroraPixel4705;
                if (z4) {
                }
                PolarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244 polarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244 = z5 ? PolarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244.PolarVoyageBarcodeScannerInfernoSolarSpark7767 : polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageItemDecorationUltraDeltaEpic7485;
                PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision4365 = z5 ? this.PolarVoyageViewRogueMaster4778 : polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageStrictModeLegendEpic1532;
                if (z5) {
                }
                this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = new PolarVoyageMaterialButtonDragonCyberMega6188(polarVoyageRoomDaoPulseShadow55662, polarVoyageCombineBlazePulse1497, j3, j2, i2, r14, false, polarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244, polarVoyageViewPagerSparkVision4365, list, polarVoyageCombineBlazePulse1497, polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageViewRogueMaster4778, polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageCameraPixelBlaze2629, polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageDrawableDeltaHyperion5742, polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageSnackbarGammaEclipse2140, j2, 0L, j2, 0L, false);
                if (z3) {
                }
            } catch (RuntimeException e2) {
                e = e2;
                PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageAnimatorSetSparkUltraMax8233("ExoPlayerImplInternal", "Disable failed.", e);
                if (z) {
                }
                this.PolarVoyageMapTurboRogueTitan9291 = 0;
                PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61883 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse149722 = polarVoyageMaterialButtonDragonCyberMega61883.PolarVoyageMotionLayoutTransitionHeroVision4068;
                long j42 = polarVoyageMaterialButtonDragonCyberMega61883.PolarVoyageAnimatorSetSparkUltraMax8233;
                if (!this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068()) {
                }
                j = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageKotlinBetaPulseBeta3653;
                if (z2) {
                }
                this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageMotionLayoutTransitionHeroVision4068();
                this.PolarVoyageMotionSceneStormSolarBeta2208 = false;
                polarVoyageRoomDaoPulseShadow5566 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185;
                if (z3) {
                }
                polarVoyageRoomDaoPulseShadow55662 = polarVoyageRoomDaoPulseShadow5566;
                polarVoyageCombineBlazePulse1497 = polarVoyageCombineBlazePulse149722;
                PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega618822 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                int i22 = polarVoyageMaterialButtonDragonCyberMega618822.PolarVoyageBitmapVisionAuroraPixel4705;
                if (z4) {
                }
                PolarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244 polarVoyageOnAttachStateChangeListenerMegaBlazeFusion42442 = z5 ? PolarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244.PolarVoyageBarcodeScannerInfernoSolarSpark7767 : polarVoyageMaterialButtonDragonCyberMega618822.PolarVoyageItemDecorationUltraDeltaEpic7485;
                PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision43652 = z5 ? this.PolarVoyageViewRogueMaster4778 : polarVoyageMaterialButtonDragonCyberMega618822.PolarVoyageStrictModeLegendEpic1532;
                if (z5) {
                }
                this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = new PolarVoyageMaterialButtonDragonCyberMega6188(polarVoyageRoomDaoPulseShadow55662, polarVoyageCombineBlazePulse1497, j3, j2, i22, r14, false, polarVoyageOnAttachStateChangeListenerMegaBlazeFusion42442, polarVoyageViewPagerSparkVision43652, list, polarVoyageCombineBlazePulse1497, polarVoyageMaterialButtonDragonCyberMega618822.PolarVoyageViewRogueMaster4778, polarVoyageMaterialButtonDragonCyberMega618822.PolarVoyageCameraPixelBlaze2629, polarVoyageMaterialButtonDragonCyberMega618822.PolarVoyageDrawableDeltaHyperion5742, polarVoyageMaterialButtonDragonCyberMega618822.PolarVoyageSnackbarGammaEclipse2140, j2, 0L, j2, 0L, false);
                if (z3) {
                }
            }
        }
        this.PolarVoyageCardViewSpectraTurbo5149 = -9223372036854775807L;
        if (z) {
            for (PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 : this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                try {
                    polarVoyageServiceStormMasterPixel9641.PolarVoyageBottomSheetOmegaNeo1907();
                } catch (RuntimeException e3) {
                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageAnimatorSetSparkUltraMax8233("ExoPlayerImplInternal", "Reset failed.", e3);
                }
            }
        }
        this.PolarVoyageMapTurboRogueTitan9291 = 0;
        PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega618832 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
        PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497222 = polarVoyageMaterialButtonDragonCyberMega618832.PolarVoyageMotionLayoutTransitionHeroVision4068;
        long j422 = polarVoyageMaterialButtonDragonCyberMega618832.PolarVoyageAnimatorSetSparkUltraMax8233;
        if (!this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068()) {
            PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61884 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
            PolarVoyageScrollViewFusionVision5184 polarVoyageScrollViewFusionVision5184 = this.PolarVoyageAnimatorSetSparkUltraMax8233;
            PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse14973 = polarVoyageMaterialButtonDragonCyberMega61884.PolarVoyageMotionLayoutTransitionHeroVision4068;
            PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow55663 = polarVoyageMaterialButtonDragonCyberMega61884.PolarVoyageZipVortexCelestial6185;
            if (!polarVoyageRoomDaoPulseShadow55663.PolarVoyageContentProviderHyperSpark3838() && !polarVoyageRoomDaoPulseShadow55663.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageCombineBlazePulse14973.PolarVoyageZipVortexCelestial6185, polarVoyageScrollViewFusionVision5184).PolarVoyageDiffUtilTurboStrike5735) {
                j = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageAnimatorSetSparkUltraMax8233;
                if (z2) {
                    j2 = j422;
                    j3 = j;
                    z5 = false;
                } else {
                    this.PolarVoyageKotlinHeroHyper4083 = null;
                    Pair PolarVoyageSnackbarGammaEclipse2140 = PolarVoyageSnackbarGammaEclipse2140(this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185);
                    polarVoyageCombineBlazePulse1497222 = (PolarVoyageCombineBlazePulse1497) PolarVoyageSnackbarGammaEclipse2140.first;
                    long longValue = ((Long) PolarVoyageSnackbarGammaEclipse2140.second).longValue();
                    z5 = polarVoyageCombineBlazePulse1497222.equals(this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageMotionLayoutTransitionHeroVision4068) ? false : true;
                    j2 = longValue;
                    j3 = -9223372036854775807L;
                }
                this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageMotionLayoutTransitionHeroVision4068();
                this.PolarVoyageMotionSceneStormSolarBeta2208 = false;
                polarVoyageRoomDaoPulseShadow5566 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185;
                if (z3 || !(polarVoyageRoomDaoPulseShadow5566 instanceof PolarVoyageContextOlympianSpeed2181)) {
                    polarVoyageRoomDaoPulseShadow55662 = polarVoyageRoomDaoPulseShadow5566;
                } else {
                    PolarVoyageContextOlympianSpeed2181 polarVoyageContextOlympianSpeed2181 = (PolarVoyageContextOlympianSpeed2181) polarVoyageRoomDaoPulseShadow5566;
                    PolarVoyageGraphSpeedThunderDragon6179 polarVoyageGraphSpeedThunderDragon6179 = this.PolarVoyagePackageManagerCelestialPhoenix8393.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    PolarVoyageRoomDaoPulseShadow5566[] polarVoyageRoomDaoPulseShadow5566Arr = polarVoyageContextOlympianSpeed2181.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    PolarVoyageRoomDaoPulseShadow5566[] polarVoyageRoomDaoPulseShadow5566Arr2 = new PolarVoyageRoomDaoPulseShadow5566[polarVoyageRoomDaoPulseShadow5566Arr.length];
                    for (int i3 = 0; i3 < polarVoyageRoomDaoPulseShadow5566Arr.length; i3++) {
                        polarVoyageRoomDaoPulseShadow5566Arr2[i3] = new PolarVoyageAccelerometerSpectraNeoNovaX4106(polarVoyageRoomDaoPulseShadow5566Arr[i3]);
                    }
                    polarVoyageRoomDaoPulseShadow55662 = new PolarVoyageContextOlympianSpeed2181(polarVoyageRoomDaoPulseShadow5566Arr2, polarVoyageContextOlympianSpeed2181.PolarVoyageStrictModeLegendEpic1532, polarVoyageGraphSpeedThunderDragon6179);
                    if (polarVoyageCombineBlazePulse1497222.PolarVoyageMotionLayoutTransitionHeroVision4068 != -1) {
                        polarVoyageRoomDaoPulseShadow55662.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageCombineBlazePulse1497222.PolarVoyageZipVortexCelestial6185, this.PolarVoyageAnimatorSetSparkUltraMax8233);
                        int i4 = this.PolarVoyageAnimatorSetSparkUltraMax8233.PolarVoyageKotlinBetaPulseBeta3653;
                        PolarVoyageInterstitialAdMasterShadowCosmos9360 polarVoyageInterstitialAdMasterShadowCosmos9360 = this.PolarVoyageNavigationViewHyperHyperHyperion1793;
                        polarVoyageRoomDaoPulseShadow55662.PolarVoyageCameraPixelBlaze2629(i4, polarVoyageInterstitialAdMasterShadowCosmos9360, 0L);
                        if (polarVoyageInterstitialAdMasterShadowCosmos9360.PolarVoyageZipVortexCelestial6185()) {
                            polarVoyageCombineBlazePulse1497 = new PolarVoyageCombineBlazePulse1497(polarVoyageCombineBlazePulse1497222.PolarVoyageBarcodeScannerInfernoSolarSpark7767, polarVoyageCombineBlazePulse1497222.PolarVoyageZipVortexCelestial6185);
                            PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188222 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                            int i222 = polarVoyageMaterialButtonDragonCyberMega6188222.PolarVoyageBitmapVisionAuroraPixel4705;
                            PolarVoyageAssetManagerQuantumSpectraPhoenix6233 polarVoyageAssetManagerQuantumSpectraPhoenix6233 = z4 ? null : polarVoyageMaterialButtonDragonCyberMega6188222.PolarVoyageDiffUtilTurboStrike5735;
                            PolarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244 polarVoyageOnAttachStateChangeListenerMegaBlazeFusion424422 = z5 ? PolarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244.PolarVoyageBarcodeScannerInfernoSolarSpark7767 : polarVoyageMaterialButtonDragonCyberMega6188222.PolarVoyageItemDecorationUltraDeltaEpic7485;
                            PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision436522 = z5 ? this.PolarVoyageViewRogueMaster4778 : polarVoyageMaterialButtonDragonCyberMega6188222.PolarVoyageStrictModeLegendEpic1532;
                            if (z5) {
                                PolarVoyageTextRecognitionPrimeVortexHero1477 polarVoyageTextRecognitionPrimeVortexHero1477 = PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageStrictModeLegendEpic1532;
                                list = PolarVoyageLifecycleCameraControllerUltraShadowDelta8620.PolarVoyageViewRogueMaster4778;
                            } else {
                                list = polarVoyageMaterialButtonDragonCyberMega6188222.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                            }
                            this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = new PolarVoyageMaterialButtonDragonCyberMega6188(polarVoyageRoomDaoPulseShadow55662, polarVoyageCombineBlazePulse1497, j3, j2, i222, polarVoyageAssetManagerQuantumSpectraPhoenix6233, false, polarVoyageOnAttachStateChangeListenerMegaBlazeFusion424422, polarVoyageViewPagerSparkVision436522, list, polarVoyageCombineBlazePulse1497, polarVoyageMaterialButtonDragonCyberMega6188222.PolarVoyageViewRogueMaster4778, polarVoyageMaterialButtonDragonCyberMega6188222.PolarVoyageCameraPixelBlaze2629, polarVoyageMaterialButtonDragonCyberMega6188222.PolarVoyageDrawableDeltaHyperion5742, polarVoyageMaterialButtonDragonCyberMega6188222.PolarVoyageSnackbarGammaEclipse2140, j2, 0L, j2, 0L, false);
                            if (z3) {
                                PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha1105 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
                                if (!polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageRemoteModelManagerOlympianCelestial9141.isEmpty()) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i5 = 0; i5 < polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageRemoteModelManagerOlympianCelestial9141.size(); i5++) {
                                        ((PolarVoyageAdMobDeltaMasterShadow9877) polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageRemoteModelManagerOlympianCelestial9141.get(i5)).PolarVoyageStrictModeLegendEpic1532();
                                    }
                                    polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageRemoteModelManagerOlympianCelestial9141 = arrayList;
                                    polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageCameraPixelBlaze2629 = null;
                                    polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageBottomSheetOmegaNeo1907();
                                }
                                PolarVoyageKaptNeoFusion1280 polarVoyageKaptNeoFusion1280 = this.PolarVoyagePackageManagerCelestialPhoenix8393;
                                HashMap hashMap = polarVoyageKaptNeoFusion1280.PolarVoyageDiffUtilTurboStrike5735;
                                for (PolarVoyageRotateAnimationUltraEpic9645 polarVoyageRotateAnimationUltraEpic9645 : hashMap.values()) {
                                    try {
                                        polarVoyageRotateAnimationUltraEpic9645.PolarVoyageZipVortexCelestial6185.PolarVoyageDrawableDeltaHyperion5742(polarVoyageRotateAnimationUltraEpic9645.PolarVoyageMotionLayoutTransitionHeroVision4068);
                                    } catch (RuntimeException e4) {
                                        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageAnimatorSetSparkUltraMax8233("MediaSourceList", "Failed to release child source.", e4);
                                    }
                                    PolarVoyageR8ForceCyberCosmos6934 polarVoyageR8ForceCyberCosmos6934 = polarVoyageRotateAnimationUltraEpic9645.PolarVoyageZipVortexCelestial6185;
                                    PolarVoyageSensorManagerStormPhantomSolar9259 polarVoyageSensorManagerStormPhantomSolar9259 = polarVoyageRotateAnimationUltraEpic9645.PolarVoyageKotlinBetaPulseBeta3653;
                                    polarVoyageR8ForceCyberCosmos6934.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageSensorManagerStormPhantomSolar9259);
                                    polarVoyageRotateAnimationUltraEpic9645.PolarVoyageZipVortexCelestial6185.PolarVoyageContentProviderHyperSpark3838(polarVoyageSensorManagerStormPhantomSolar9259);
                                }
                                hashMap.clear();
                                polarVoyageKaptNeoFusion1280.PolarVoyageTextInputEditTextNebulaHero6651.clear();
                                polarVoyageKaptNeoFusion1280.PolarVoyageBottomSheetOmegaNeo1907 = false;
                                return;
                            }
                            return;
                        }
                    }
                }
                polarVoyageCombineBlazePulse1497 = polarVoyageCombineBlazePulse1497222;
                PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61882222 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                int i2222 = polarVoyageMaterialButtonDragonCyberMega61882222.PolarVoyageBitmapVisionAuroraPixel4705;
                if (z4) {
                }
                PolarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244 polarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244222 = z5 ? PolarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244.PolarVoyageBarcodeScannerInfernoSolarSpark7767 : polarVoyageMaterialButtonDragonCyberMega61882222.PolarVoyageItemDecorationUltraDeltaEpic7485;
                PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision4365222 = z5 ? this.PolarVoyageViewRogueMaster4778 : polarVoyageMaterialButtonDragonCyberMega61882222.PolarVoyageStrictModeLegendEpic1532;
                if (z5) {
                }
                this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = new PolarVoyageMaterialButtonDragonCyberMega6188(polarVoyageRoomDaoPulseShadow55662, polarVoyageCombineBlazePulse1497, j3, j2, i2222, polarVoyageAssetManagerQuantumSpectraPhoenix6233, false, polarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244222, polarVoyageViewPagerSparkVision4365222, list, polarVoyageCombineBlazePulse1497, polarVoyageMaterialButtonDragonCyberMega61882222.PolarVoyageViewRogueMaster4778, polarVoyageMaterialButtonDragonCyberMega61882222.PolarVoyageCameraPixelBlaze2629, polarVoyageMaterialButtonDragonCyberMega61882222.PolarVoyageDrawableDeltaHyperion5742, polarVoyageMaterialButtonDragonCyberMega61882222.PolarVoyageSnackbarGammaEclipse2140, j2, 0L, j2, 0L, false);
                if (z3) {
                }
            }
        }
        j = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageKotlinBetaPulseBeta3653;
        if (z2) {
        }
        this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageMotionLayoutTransitionHeroVision4068();
        this.PolarVoyageMotionSceneStormSolarBeta2208 = false;
        polarVoyageRoomDaoPulseShadow5566 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185;
        if (z3) {
        }
        polarVoyageRoomDaoPulseShadow55662 = polarVoyageRoomDaoPulseShadow5566;
        polarVoyageCombineBlazePulse1497 = polarVoyageCombineBlazePulse1497222;
        PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega618822222 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
        int i22222 = polarVoyageMaterialButtonDragonCyberMega618822222.PolarVoyageBitmapVisionAuroraPixel4705;
        if (z4) {
        }
        PolarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244 polarVoyageOnAttachStateChangeListenerMegaBlazeFusion42442222 = z5 ? PolarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244.PolarVoyageBarcodeScannerInfernoSolarSpark7767 : polarVoyageMaterialButtonDragonCyberMega618822222.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision43652222 = z5 ? this.PolarVoyageViewRogueMaster4778 : polarVoyageMaterialButtonDragonCyberMega618822222.PolarVoyageStrictModeLegendEpic1532;
        if (z5) {
        }
        this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = new PolarVoyageMaterialButtonDragonCyberMega6188(polarVoyageRoomDaoPulseShadow55662, polarVoyageCombineBlazePulse1497, j3, j2, i22222, polarVoyageAssetManagerQuantumSpectraPhoenix6233, false, polarVoyageOnAttachStateChangeListenerMegaBlazeFusion42442222, polarVoyageViewPagerSparkVision43652222, list, polarVoyageCombineBlazePulse1497, polarVoyageMaterialButtonDragonCyberMega618822222.PolarVoyageViewRogueMaster4778, polarVoyageMaterialButtonDragonCyberMega618822222.PolarVoyageCameraPixelBlaze2629, polarVoyageMaterialButtonDragonCyberMega618822222.PolarVoyageDrawableDeltaHyperion5742, polarVoyageMaterialButtonDragonCyberMega618822222.PolarVoyageSnackbarGammaEclipse2140, j2, 0L, j2, 0L, false);
        if (z3) {
        }
    }

    public final void PolarVoyageLifecycleOlympianOmega3762() {
        boolean PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (PolarVoyagePackageManagerCelestialPhoenix8393(this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageViewRogueMaster4778)) {
            PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageViewRogueMaster4778;
            long PolarVoyageContentProviderHyperSpark3838 = PolarVoyageContentProviderHyperSpark3838(!polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageBitmapVisionAuroraPixel4705 ? 0L : polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageZipVortexCelestial6185.PolarVoyageDiffUtilTurboStrike5735());
            PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98772 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532;
            long j = PolarVoyageLayerSpeedBlazeVortex2881(this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185, polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185) ? this.PolarVoyageLooperThreadAlphaPrime1279.PolarVoyageItemDecorationUltraDeltaEpic7485 : -9223372036854775807L;
            PolarVoyageClipboardManagerUltraRogue9881 polarVoyageClipboardManagerUltraRogue9881 = this.PolarVoyageLifecycleOlympianOmega3762;
            PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow5566 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185;
            PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497 = polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185;
            float f = this.PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageBarcodeScannerInfernoSolarSpark7767().PolarVoyageZipVortexCelestial6185;
            boolean z = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageViewRogueMaster4778;
            PolarVoyageImageAnalysisTitaniumLegendMega6315 polarVoyageImageAnalysisTitaniumLegendMega6315 = new PolarVoyageImageAnalysisTitaniumLegendMega6315(polarVoyageClipboardManagerUltraRogue9881, polarVoyageRoomDaoPulseShadow5566, polarVoyageCombineBlazePulse1497, PolarVoyageContentProviderHyperSpark3838, f, this.PolarVoyageColorStateListEliteStrikeOlympian8131, j);
            PolarVoyageMotionLayoutTransitionHeroVision4068 = this.PolarVoyageCameraPixelBlaze2629.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageImageAnalysisTitaniumLegendMega6315);
            PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98773 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532;
            if (!PolarVoyageMotionLayoutTransitionHeroVision4068 && polarVoyageAdMobDeltaMasterShadow98773.PolarVoyageBitmapVisionAuroraPixel4705 && PolarVoyageContentProviderHyperSpark3838 < 500000 && this.PolarVoyageBitmapMaxTitanTitan7960 > 0) {
                polarVoyageAdMobDeltaMasterShadow98773.PolarVoyageZipVortexCelestial6185.PolarVoyageDrawableDeltaHyperion5742(this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageAnimatorSetSparkUltraMax8233);
                PolarVoyageMotionLayoutTransitionHeroVision4068 = this.PolarVoyageCameraPixelBlaze2629.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageImageAnalysisTitaniumLegendMega6315);
            }
        } else {
            PolarVoyageMotionLayoutTransitionHeroVision4068 = false;
        }
        this.PolarVoyageMotionSceneStormSolarBeta2208 = PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (PolarVoyageMotionLayoutTransitionHeroVision4068) {
            PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98774 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageViewRogueMaster4778;
            polarVoyageAdMobDeltaMasterShadow98774.getClass();
            PolarVoyageAnalyticsGammaNeo1453 polarVoyageAnalyticsGammaNeo1453 = new PolarVoyageAnalyticsGammaNeo1453();
            polarVoyageAnalyticsGammaNeo1453.PolarVoyageZipVortexCelestial6185 = this.PolarVoyageWithContextPulseSolarHyperion4393 - polarVoyageAdMobDeltaMasterShadow98774.PolarVoyageContentProviderHyperSpark3838;
            float f2 = this.PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageBarcodeScannerInfernoSolarSpark7767().PolarVoyageZipVortexCelestial6185;
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(f2 > 0.0f || f2 == -3.4028235E38f);
            polarVoyageAnalyticsGammaNeo1453.PolarVoyageMotionLayoutTransitionHeroVision4068 = f2;
            long j2 = this.PolarVoyageKeyframeEpicNovaXCyber9821;
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(j2 >= 0 || j2 == -9223372036854775807L);
            polarVoyageAnalyticsGammaNeo1453.PolarVoyageKotlinBetaPulseBeta3653 = j2;
            PolarVoyageLooperThreadPixelSpark4667 polarVoyageLooperThreadPixelSpark4667 = new PolarVoyageLooperThreadPixelSpark4667(polarVoyageAnalyticsGammaNeo1453);
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(polarVoyageAdMobDeltaMasterShadow98774.PolarVoyageCameraPixelBlaze2629 == null);
            polarVoyageAdMobDeltaMasterShadow98774.PolarVoyageZipVortexCelestial6185.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageLooperThreadPixelSpark4667);
        }
        PolarVoyageAnalyticsSpeedEpic1910();
    }

    public final void PolarVoyageLocationListenerInfernoQuantumOlympian6900() {
        PolarVoyageDiffUtilSpeedCelestial7413 polarVoyageDiffUtilSpeedCelestial7413 = this.PolarVoyageDisplayMetricsVortexDragon9516;
        polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageCameraPixelBlaze2629 = false;
        PolarVoyageAlarmManagerBetaStrikeSpark3235 polarVoyageAlarmManagerBetaStrikeSpark3235 = polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (polarVoyageAlarmManagerBetaStrikeSpark3235.PolarVoyageStrictModeLegendEpic1532) {
            polarVoyageAlarmManagerBetaStrikeSpark3235.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageAlarmManagerBetaStrikeSpark3235.PolarVoyageBitmapVisionAuroraPixel4705());
            polarVoyageAlarmManagerBetaStrikeSpark3235.PolarVoyageStrictModeLegendEpic1532 = false;
        }
        for (PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 : this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX9940 = polarVoyageServiceStormMasterPixel9641.PolarVoyageKotlinBetaPulseBeta3653;
            PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99402 = polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185;
            if (PolarVoyageServiceStormMasterPixel9641.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageGestureDetectorPhoenixNovaX99402)) {
                PolarVoyageServiceStormMasterPixel9641.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageGestureDetectorPhoenixNovaX99402);
            }
            if (polarVoyageGestureDetectorPhoenixNovaX9940 != null && polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageSnackbarGammaEclipse2140 != 0) {
                PolarVoyageServiceStormMasterPixel9641.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageGestureDetectorPhoenixNovaX9940);
            }
        }
    }

    public final boolean PolarVoyageLooperThreadAlphaPrime1279(int i, PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497) {
        PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha1105 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageBottomSheetOmegaNeo1907;
        if (polarVoyageAdMobDeltaMasterShadow9877 != null && polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185.equals(polarVoyageCombineBlazePulse1497)) {
            PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 = this.PolarVoyageItemDecorationUltraDeltaEpic7485[i];
            PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98772 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageBottomSheetOmegaNeo1907;
            int i2 = polarVoyageServiceStormMasterPixel9641.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            boolean z = (i2 == 2 || i2 == 4) && polarVoyageServiceStormMasterPixel9641.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageAdMobDeltaMasterShadow98772) == polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185;
            boolean z2 = polarVoyageServiceStormMasterPixel9641.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == 3 && polarVoyageServiceStormMasterPixel9641.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageAdMobDeltaMasterShadow98772) == polarVoyageServiceStormMasterPixel9641.PolarVoyageKotlinBetaPulseBeta3653;
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    public final void PolarVoyageMapTurboRogueTitan9291(boolean z, PolarVoyageBindingAdapterStrikeCosmos6770 polarVoyageBindingAdapterStrikeCosmos6770) {
        if (this.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415 != z) {
            this.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415 = z;
            if (!z) {
                for (PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 : this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                    polarVoyageServiceStormMasterPixel9641.PolarVoyageBottomSheetOmegaNeo1907();
                }
            }
        }
        if (polarVoyageBindingAdapterStrikeCosmos6770 != null) {
            polarVoyageBindingAdapterStrikeCosmos6770.PolarVoyageKotlinBetaPulseBeta3653();
        }
    }

    public final void PolarVoyageMotionLayoutForceEpicAurora7183(PolarVoyageServiceVortexCosmosAlpha1023 polarVoyageServiceVortexCosmosAlpha1023) {
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877;
        PolarVoyageCountDownTimerNovaXNebula3211 polarVoyageCountDownTimerNovaXNebula3211;
        PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha1105 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98772 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageViewRogueMaster4778;
        PolarVoyageDiffUtilSpeedCelestial7413 polarVoyageDiffUtilSpeedCelestial7413 = this.PolarVoyageDisplayMetricsVortexDragon9516;
        if (polarVoyageAdMobDeltaMasterShadow98772 != null && polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageZipVortexCelestial6185 == polarVoyageServiceVortexCosmosAlpha1023) {
            polarVoyageAdMobDeltaMasterShadow98772.getClass();
            if (!polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageBitmapVisionAuroraPixel4705) {
                float f = polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageBarcodeScannerInfernoSolarSpark7767().PolarVoyageZipVortexCelestial6185;
                PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageDiffUtilTurboStrike5735(f, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageZipVortexCelestial6185, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageViewRogueMaster4778);
            }
            PolarVoyageWindowManagerOlympianNovaNebula5076(polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185, polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageSnackbarGammaEclipse2140);
            if (polarVoyageAdMobDeltaMasterShadow98772 == polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageStrictModeLegendEpic1532) {
                PolarVoyageDatabaseCosmosSpectraSolar3905(polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageMotionLayoutTransitionHeroVision4068, true);
                PolarVoyageViewRogueMaster4778(new boolean[this.PolarVoyageItemDecorationUltraDeltaEpic7485.length], polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageBitmapVisionAuroraPixel4705());
                polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageItemDecorationUltraDeltaEpic7485 = true;
                PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61882 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497 = polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageMotionLayoutTransitionHeroVision4068;
                long j = polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageMotionLayoutTransitionHeroVision4068;
                polarVoyageCountDownTimerNovaXNebula3211 = this;
                polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageCombineBlazePulse1497, j, polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageKotlinBetaPulseBeta3653, j, false, 5);
            } else {
                polarVoyageCountDownTimerNovaXNebula3211 = this;
            }
            polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageLifecycleOlympianOmega3762();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageRemoteModelManagerOlympianCelestial9141.size()) {
                polarVoyageAdMobDeltaMasterShadow9877 = null;
                break;
            }
            polarVoyageAdMobDeltaMasterShadow9877 = (PolarVoyageAdMobDeltaMasterShadow9877) polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageRemoteModelManagerOlympianCelestial9141.get(i);
            if (polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageZipVortexCelestial6185 == polarVoyageServiceVortexCosmosAlpha1023) {
                break;
            } else {
                i++;
            }
        }
        if (polarVoyageAdMobDeltaMasterShadow9877 != null) {
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(!polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageBitmapVisionAuroraPixel4705);
            float f2 = polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageBarcodeScannerInfernoSolarSpark7767().PolarVoyageZipVortexCelestial6185;
            PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61883 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
            polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageDiffUtilTurboStrike5735(f2, polarVoyageMaterialButtonDragonCyberMega61883.PolarVoyageZipVortexCelestial6185, polarVoyageMaterialButtonDragonCyberMega61883.PolarVoyageViewRogueMaster4778);
            PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98773 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageCameraPixelBlaze2629;
            if (polarVoyageAdMobDeltaMasterShadow98773 == null || polarVoyageAdMobDeltaMasterShadow98773.PolarVoyageZipVortexCelestial6185 != polarVoyageServiceVortexCosmosAlpha1023) {
                return;
            }
            PolarVoyageDiffUtilDragonSpeedEclipse6225();
        }
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageTextViewHeroTitanHyperion5542 polarVoyageTextViewHeroTitanHyperion5542, int i) {
        this.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587.PolarVoyageKotlinBetaPulseBeta3653(1);
        PolarVoyageKaptNeoFusion1280 polarVoyageKaptNeoFusion1280 = this.PolarVoyagePackageManagerCelestialPhoenix8393;
        if (i == -1) {
            i = polarVoyageKaptNeoFusion1280.PolarVoyageMotionLayoutTransitionHeroVision4068.size();
        }
        PolarVoyageLayerDrawableShadowTitaniumOmega1942(polarVoyageKaptNeoFusion1280.PolarVoyageZipVortexCelestial6185(i, polarVoyageTextViewHeroTitanHyperion5542.PolarVoyageZipVortexCelestial6185, polarVoyageTextViewHeroTitanHyperion5542.PolarVoyageMotionLayoutTransitionHeroVision4068), false);
    }

    public final void PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587() {
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532;
        this.PolarVoyageAlertDialogNovaXCelestial4954 = polarVoyageAdMobDeltaMasterShadow9877 != null && polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageRotateAnimationCyberCelestialDelta4768 && this.PolarVoyagePoseDetectionCosmosVision6217;
    }

    public final void PolarVoyageMotionSceneStormSolarBeta2208(boolean z) {
        PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185;
        long PolarVoyageHandlerThreadMaxAurora5064 = PolarVoyageHandlerThreadMaxAurora5064(polarVoyageCombineBlazePulse1497, this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageAnimatorSetSparkUltraMax8233, true, false);
        if (PolarVoyageHandlerThreadMaxAurora5064 != this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageAnimatorSetSparkUltraMax8233) {
            PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
            this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageCombineBlazePulse1497, PolarVoyageHandlerThreadMaxAurora5064, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageBarcodeScannerInfernoSolarSpark7767, z, 5);
        }
    }

    public final void PolarVoyageNavigationViewHyperHyperHyperion1793() {
        PolarVoyageAccelerometerUltraSolarSolar9029(this.PolarVoyageViewPagerPhantomHyperionNova3183);
    }

    public final void PolarVoyageObserverEliteUltra2793(boolean z) {
        this.PolarVoyageHandlerThreadMaxAurora5064 = z;
        PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow5566 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185;
        PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha1105 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
        polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageItemDecorationUltraDeltaEpic7485 = z;
        int PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageNavigationViewHyperHyperHyperion1793(polarVoyageRoomDaoPulseShadow5566);
        if ((PolarVoyageNavigationViewHyperHyperHyperion1793 & 1) != 0) {
            PolarVoyageMotionSceneStormSolarBeta2208(true);
        } else if ((PolarVoyageNavigationViewHyperHyperHyperion1793 & 2) != 0) {
            PolarVoyageTextInputEditTextNebulaHero6651();
        }
        PolarVoyageDisplayMetricsVortexDragon9516(false);
    }

    public final void PolarVoyageOnPreDrawListenerNovaCelestialDragon7415(PolarVoyageActivityInfoBetaFusion4959 polarVoyageActivityInfoBetaFusion4959) {
        polarVoyageActivityInfoBetaFusion4959.getClass();
        PolarVoyagePropertyValuesHolderHyperionUltra8479 polarVoyagePropertyValuesHolderHyperionUltra8479 = this.PolarVoyageSnackbarGammaEclipse2140;
        if (polarVoyageActivityInfoBetaFusion4959.PolarVoyageBitmapVisionAuroraPixel4705 != this.PolarVoyageRemoteModelManagerOlympianCelestial9141) {
            polarVoyagePropertyValuesHolderHyperionUltra8479.PolarVoyageMotionLayoutTransitionHeroVision4068(15, polarVoyageActivityInfoBetaFusion4959).PolarVoyageMotionLayoutTransitionHeroVision4068();
            return;
        }
        synchronized (polarVoyageActivityInfoBetaFusion4959) {
        }
        try {
            polarVoyageActivityInfoBetaFusion4959.PolarVoyageZipVortexCelestial6185.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageActivityInfoBetaFusion4959.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageActivityInfoBetaFusion4959.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
            polarVoyageActivityInfoBetaFusion4959.PolarVoyageZipVortexCelestial6185(true);
            int i = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBitmapVisionAuroraPixel4705;
            if (i == 3 || i == 2) {
                polarVoyagePropertyValuesHolderHyperionUltra8479.PolarVoyageDiffUtilTurboStrike5735(2);
            }
        } catch (Throwable th) {
            polarVoyageActivityInfoBetaFusion4959.PolarVoyageZipVortexCelestial6185(true);
            throw th;
        }
    }

    public final void PolarVoyagePaintMaxNova4034(Object obj, PolarVoyageBindingAdapterStrikeCosmos6770 polarVoyageBindingAdapterStrikeCosmos6770) {
        for (PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 : this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX9940 = polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185;
            if (polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageStrictModeLegendEpic1532 == 2) {
                int i = polarVoyageServiceStormMasterPixel9641.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                if (i == 4 || i == 1) {
                    PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99402 = polarVoyageServiceStormMasterPixel9641.PolarVoyageKotlinBetaPulseBeta3653;
                    polarVoyageGestureDetectorPhoenixNovaX99402.getClass();
                    polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyageKotlinBetaPulseBeta3653(1, obj);
                } else {
                    polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageKotlinBetaPulseBeta3653(1, obj);
                }
            }
        }
        int i2 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBitmapVisionAuroraPixel4705;
        if (i2 == 3 || i2 == 2) {
            this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageDiffUtilTurboStrike5735(2);
        }
        if (polarVoyageBindingAdapterStrikeCosmos6770 != null) {
            polarVoyageBindingAdapterStrikeCosmos6770.PolarVoyageKotlinBetaPulseBeta3653();
        }
    }

    public final void PolarVoyagePoseDetectionCosmosVision6217(PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow5566, PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow55662) {
        if (polarVoyageRoomDaoPulseShadow5566.PolarVoyageContentProviderHyperSpark3838() && polarVoyageRoomDaoPulseShadow55662.PolarVoyageContentProviderHyperSpark3838()) {
            return;
        }
        ArrayList arrayList = this.PolarVoyageLayerDrawableShadowTitaniumOmega1942;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageMotionLayoutForceEpicAurora7183(arrayList.get(size));
            throw null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:27|(21:(8:29|(1:95)(3:35|(1:39)|40)|41|(1:50)|48|49|19|20)(1:96)|55|56|(1:58)(1:88)|59|60|61|(1:63)(1:86)|64|65|66|67|68|69|70|71|72|73|18|19|20)|51|52|(1:54)(1:92)) */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0190, code lost:
    
        r0 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageProcessCameraProviderQuantumCosmosPulse5576(PolarVoyageAccelerometerMaxShadowCosmos8778 polarVoyageAccelerometerMaxShadowCosmos8778) {
        long longValue;
        long j;
        PolarVoyageCombineBlazePulse1497 PolarVoyageContentProviderHyperSpark3838;
        long j2;
        boolean z;
        boolean z2;
        PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497;
        long j3;
        long j4;
        long j5;
        boolean z3;
        long PolarVoyageHandlerThreadMaxAurora5064;
        PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188;
        PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse14972;
        PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow5566;
        long j6;
        PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse14973;
        long j7;
        long j8;
        PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61882;
        int i;
        int i2;
        long j9;
        PolarVoyageCountDownTimerNovaXNebula3211 polarVoyageCountDownTimerNovaXNebula3211 = this;
        if (polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageGuidelineStormSolar2850) {
            if (polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageConfigurationMaxSpectraForce5418 != null) {
                polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageCanvasElitePhoenix4750++;
                polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587.PolarVoyageKotlinBetaPulseBeta3653(1);
            }
            polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageConfigurationMaxSpectraForce5418 = polarVoyageAccelerometerMaxShadowCosmos8778;
            return;
        }
        polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587.PolarVoyageKotlinBetaPulseBeta3653(1);
        Pair PolarVoyageAlertDialogNovaXCelestial4954 = PolarVoyageAlertDialogNovaXCelestial4954(polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185, polarVoyageAccelerometerMaxShadowCosmos8778, true, polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576, polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageHandlerThreadMaxAurora5064, polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageNavigationViewHyperHyperHyperion1793, polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageAnimatorSetSparkUltraMax8233);
        if (PolarVoyageAlertDialogNovaXCelestial4954 == null) {
            Pair PolarVoyageSnackbarGammaEclipse2140 = polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageSnackbarGammaEclipse2140(polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185);
            PolarVoyageContentProviderHyperSpark3838 = (PolarVoyageCombineBlazePulse1497) PolarVoyageSnackbarGammaEclipse2140.first;
            longValue = ((Long) PolarVoyageSnackbarGammaEclipse2140.second).longValue();
            z = !polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185.PolarVoyageContentProviderHyperSpark3838();
            j2 = 0;
            j = -9223372036854775807L;
        } else {
            Object obj = PolarVoyageAlertDialogNovaXCelestial4954.first;
            longValue = ((Long) PolarVoyageAlertDialogNovaXCelestial4954.second).longValue();
            j = polarVoyageAccelerometerMaxShadowCosmos8778.PolarVoyageKotlinBetaPulseBeta3653 == -9223372036854775807L ? -9223372036854775807L : longValue;
            PolarVoyageContentProviderHyperSpark3838 = polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageContentProviderHyperSpark3838(polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185, obj, longValue);
            if (PolarVoyageContentProviderHyperSpark3838.PolarVoyageMotionLayoutTransitionHeroVision4068()) {
                polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageContentProviderHyperSpark3838.PolarVoyageZipVortexCelestial6185, polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageAnimatorSetSparkUltraMax8233);
                if (polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageAnimatorSetSparkUltraMax8233.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageContentProviderHyperSpark3838.PolarVoyageMotionLayoutTransitionHeroVision4068) == PolarVoyageContentProviderHyperSpark3838.PolarVoyageKotlinBetaPulseBeta3653) {
                    polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageAnimatorSetSparkUltraMax8233.PolarVoyageTextInputEditTextNebulaHero6651.getClass();
                }
                polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageAnimatorSetSparkUltraMax8233.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185(PolarVoyageContentProviderHyperSpark3838.PolarVoyageMotionLayoutTransitionHeroVision4068).getClass();
                j = Math.max(j, 0L);
                longValue = 0;
                j2 = 0;
            } else {
                j2 = 0;
                if (polarVoyageAccelerometerMaxShadowCosmos8778.PolarVoyageKotlinBetaPulseBeta3653 != -9223372036854775807L) {
                    z = false;
                }
            }
            z = true;
        }
        try {
            try {
                if (polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185.PolarVoyageContentProviderHyperSpark3838()) {
                    polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageKotlinHeroHyper4083 = polarVoyageAccelerometerMaxShadowCosmos8778;
                } else {
                    PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61883 = polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                    if (PolarVoyageAlertDialogNovaXCelestial4954 == null) {
                        if (polarVoyageMaterialButtonDragonCyberMega61883.PolarVoyageBitmapVisionAuroraPixel4705 != 1) {
                            polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageCombineBlazeSparkInferno2844(4);
                        }
                        polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803(false, true, false, true);
                    } else {
                        try {
                            try {
                                try {
                                    try {
                                        if (PolarVoyageContentProviderHyperSpark3838.equals(polarVoyageMaterialButtonDragonCyberMega61883.PolarVoyageMotionLayoutTransitionHeroVision4068)) {
                                            PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532;
                                            if (polarVoyageAdMobDeltaMasterShadow9877 == null || !polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageBitmapVisionAuroraPixel4705 || longValue == j2) {
                                                j5 = longValue;
                                            } else {
                                                PolarVoyageServiceVortexCosmosAlpha1023 polarVoyageServiceVortexCosmosAlpha1023 = polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageZipVortexCelestial6185;
                                                long j10 = polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageBottomSheetOmegaNeo1907;
                                                if (polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageAlarmManagerShadowHyperBeta8339 && j10 != -9223372036854775807L) {
                                                    polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageToolbarEclipseInfernoHero6368.getClass();
                                                }
                                                j5 = polarVoyageServiceVortexCosmosAlpha1023.PolarVoyageItemDecorationUltraDeltaEpic7485(longValue, polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149);
                                            }
                                            if (PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageGuidelineStormSolar2850(j5) != PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageGuidelineStormSolar2850(polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageAnimatorSetSparkUltraMax8233) || ((i = (polarVoyageMaterialButtonDragonCyberMega61882 = polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803).PolarVoyageBitmapVisionAuroraPixel4705) != 2 && i != 3)) {
                                                z2 = z;
                                                polarVoyageCombineBlazePulse1497 = PolarVoyageContentProviderHyperSpark3838;
                                            }
                                            j8 = polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageAnimatorSetSparkUltraMax8233;
                                            i2 = 2;
                                            j9 = j8;
                                            z2 = z;
                                            polarVoyageCombineBlazePulse14973 = PolarVoyageContentProviderHyperSpark3838;
                                            j7 = j;
                                            polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageCombineBlazePulse14973, j8, j7, j9, z2, i2);
                                        }
                                        z2 = z;
                                        polarVoyageCombineBlazePulse1497 = PolarVoyageContentProviderHyperSpark3838;
                                        j5 = longValue;
                                        polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageSharedFlowRogueDeltaForce1577(polarVoyageRoomDaoPulseShadow5566, polarVoyageCombineBlazePulse14972, polarVoyageRoomDaoPulseShadow5566, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageMotionLayoutTransitionHeroVision4068, j6, true);
                                        polarVoyageCombineBlazePulse14973 = polarVoyageCombineBlazePulse14972;
                                        j7 = j6;
                                        j8 = PolarVoyageHandlerThreadMaxAurora5064;
                                        i2 = 2;
                                        j9 = j8;
                                        polarVoyageCountDownTimerNovaXNebula3211 = this;
                                        polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageCombineBlazePulse14973, j8, j7, j9, z2, i2);
                                    } catch (Throwable th) {
                                        th = th;
                                        polarVoyageCombineBlazePulse1497 = polarVoyageCombineBlazePulse14972;
                                        j3 = j6;
                                        j4 = PolarVoyageHandlerThreadMaxAurora5064;
                                        polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageCombineBlazePulse1497, j4, j3, j4, z2, 2);
                                        throw th;
                                    }
                                    polarVoyageRoomDaoPulseShadow5566 = polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageZipVortexCelestial6185;
                                    j6 = j;
                                } catch (Throwable th2) {
                                    th = th2;
                                    polarVoyageCombineBlazePulse1497 = polarVoyageCombineBlazePulse14972;
                                    j3 = j;
                                    j4 = PolarVoyageHandlerThreadMaxAurora5064;
                                    polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageCombineBlazePulse1497, j4, j3, j4, z2, 2);
                                    throw th;
                                }
                                polarVoyageMaterialButtonDragonCyberMega6188 = polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                                polarVoyageCombineBlazePulse14972 = polarVoyageCombineBlazePulse1497;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha1105 = polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageCameraViewSpectraMaxSpectra2824;
                            PolarVoyageHandlerThreadMaxAurora5064 = polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageHandlerThreadMaxAurora5064(polarVoyageCombineBlazePulse1497, j5, polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageStrictModeLegendEpic1532 != polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageRotateAnimationCyberCelestialDelta4768, z3);
                            z2 |= longValue != PolarVoyageHandlerThreadMaxAurora5064;
                        } catch (Throwable th4) {
                            th = th4;
                            j3 = j;
                            j4 = longValue;
                            polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageCombineBlazePulse1497, j4, j3, j4, z2, 2);
                            throw th;
                        }
                        z3 = polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBitmapVisionAuroraPixel4705 == 4;
                    }
                }
                z2 = z;
                polarVoyageCombineBlazePulse14973 = PolarVoyageContentProviderHyperSpark3838;
                j8 = longValue;
                j7 = j;
                i2 = 2;
                j9 = j8;
                polarVoyageCountDownTimerNovaXNebula3211 = this;
                polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageCombineBlazePulse14973, j8, j7, j9, z2, i2);
            } catch (Throwable th5) {
                th = th5;
                z2 = z;
                polarVoyageCombineBlazePulse1497 = PolarVoyageContentProviderHyperSpark3838;
                j4 = longValue;
                j3 = j;
            }
        } catch (Throwable th6) {
            th = th6;
            z2 = z;
            polarVoyageCombineBlazePulse1497 = PolarVoyageContentProviderHyperSpark3838;
        }
    }

    public final void PolarVoyageProximitySensorStrikeNeo2764(boolean z, boolean z2) {
        PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803(z || !this.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415, false, true, false);
        this.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587.PolarVoyageKotlinBetaPulseBeta3653(z2 ? 1 : 0);
        PolarVoyageRemoteModelManagerPulseMaxNovaX6329 polarVoyageRemoteModelManagerPulseMaxNovaX6329 = this.PolarVoyageCameraPixelBlaze2629;
        ConcurrentHashMap concurrentHashMap = polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageContentProviderHyperSpark3838;
        PolarVoyageClipboardManagerUltraRogue9881 polarVoyageClipboardManagerUltraRogue9881 = this.PolarVoyageLifecycleOlympianOmega3762;
        PolarVoyageInAppPurchaseMaxEpic8738 polarVoyageInAppPurchaseMaxEpic8738 = (PolarVoyageInAppPurchaseMaxEpic8738) concurrentHashMap.get(polarVoyageClipboardManagerUltraRogue9881);
        if (polarVoyageInAppPurchaseMaxEpic8738 != null) {
            int i = polarVoyageInAppPurchaseMaxEpic8738.PolarVoyageZipVortexCelestial6185 - 1;
            polarVoyageInAppPurchaseMaxEpic8738.PolarVoyageZipVortexCelestial6185 = i;
            if (i == 0) {
                concurrentHashMap.remove(polarVoyageClipboardManagerUltraRogue9881);
                polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageKotlinBetaPulseBeta3653();
            }
        }
        this.PolarVoyageCardViewAlphaVortexCelestial9747.PolarVoyageKotlinBetaPulseBeta3653(1, this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageViewRogueMaster4778);
        PolarVoyageCombineBlazeSparkInferno2844(1);
    }

    public final void PolarVoyageRemoteModelManagerOlympianCelestial9141(int i) {
        PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
        PolarVoyageRoomStormMaster7636(i, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageDrawableDeltaHyperion5742, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageCameraPixelBlaze2629, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageViewRogueMaster4778);
    }

    public final void PolarVoyageRoomStormMaster7636(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.PolarVoyageAlarmManagerShadowHyperBeta8339;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
        if (polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageViewRogueMaster4778 == z2 && polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageDrawableDeltaHyperion5742 == i2 && polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageCameraPixelBlaze2629 == i3) {
            return;
        }
        this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageBitmapVisionAuroraPixel4705(i3, i2, z2);
        PolarVoyageAlarmManagerBetaMaxPhantom7852(false, false);
        PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha1105 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
        for (PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageStrictModeLegendEpic1532; polarVoyageAdMobDeltaMasterShadow9877 != null; polarVoyageAdMobDeltaMasterShadow9877 = polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageCameraPixelBlaze2629) {
            for (PolarVoyagePagingSpectraDelta6398 polarVoyagePagingSpectraDelta6398 : (PolarVoyagePagingSpectraDelta6398[]) polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                if (polarVoyagePagingSpectraDelta6398 != null) {
                    polarVoyagePagingSpectraDelta6398.PolarVoyageZipVortexCelestial6185(z2);
                }
            }
        }
        if (!PolarVoyageConstraintSetCloneCelestialHero1930()) {
            PolarVoyageLocationListenerInfernoQuantumOlympian6900();
            PolarVoyageIntentNovaTitanium7230();
            PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61882 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
            if (polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageContentProviderHyperSpark3838) {
                this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageItemDecorationUltraDeltaEpic7485(false);
            }
            polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageCameraPixelBlaze2629(this.PolarVoyageWithContextPulseSolarHyperion4393);
            return;
        }
        int i4 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBitmapVisionAuroraPixel4705;
        PolarVoyagePropertyValuesHolderHyperionUltra8479 polarVoyagePropertyValuesHolderHyperionUltra8479 = this.PolarVoyageSnackbarGammaEclipse2140;
        if (i4 != 3) {
            if (i4 == 2) {
                polarVoyagePropertyValuesHolderHyperionUltra8479.PolarVoyageDiffUtilTurboStrike5735(2);
            }
        } else {
            PolarVoyageDiffUtilSpeedCelestial7413 polarVoyageDiffUtilSpeedCelestial7413 = this.PolarVoyageDisplayMetricsVortexDragon9516;
            polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageCameraPixelBlaze2629 = true;
            polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageDiffUtilTurboStrike5735();
            PolarVoyageHandlerFusionOlympian7396();
            polarVoyagePropertyValuesHolderHyperionUltra8479.PolarVoyageDiffUtilTurboStrike5735(2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x0244, code lost:
    
        if (r6 >= r4.PolarVoyageKotlinBetaPulseBeta3653) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageRotateAnimationCyberCelestialDelta4768() {
        boolean z;
        boolean z2;
        long j;
        boolean z3;
        boolean z4;
        long j2;
        boolean z5;
        int i;
        boolean z6;
        PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188;
        int i2;
        boolean z7;
        this.PolarVoyageMotionLayoutForceEpicAurora7183.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageBitmapVisionAuroraPixel4705(2);
        if (!this.PolarVoyageFlingGestureEclipsePrimeMax1376) {
            PolarVoyageAdapterDelegateNebulaNeoVision8476();
        }
        int i3 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBitmapVisionAuroraPixel4705;
        if (i3 == 1 || i3 == 4) {
            return;
        }
        if (this.PolarVoyageFlingGestureEclipsePrimeMax1376) {
            PolarVoyageAdapterDelegateNebulaNeoVision8476();
        }
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532;
        if (polarVoyageAdMobDeltaMasterShadow9877 == null) {
            PolarVoyageKeyframeEpicNovaXCyber9821(uptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        PolarVoyageIntentNovaTitanium7230();
        if (polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageBitmapVisionAuroraPixel4705) {
            this.PolarVoyageMotionLayoutForceEpicAurora7183.getClass();
            this.PolarVoyageThreadPhoenixVisionSolar1313 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageLifecycleOlympianOmega3762(SystemClock.elapsedRealtime());
            polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageZipVortexCelestial6185.PolarVoyageDrawableDeltaHyperion5742(this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageAnimatorSetSparkUltraMax8233 - this.PolarVoyageBitmapMaxTitanTitan7960);
            z = true;
            z2 = true;
            int i4 = 0;
            while (true) {
                PolarVoyageServiceStormMasterPixel9641[] polarVoyageServiceStormMasterPixel9641Arr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                if (i4 >= polarVoyageServiceStormMasterPixel9641Arr.length) {
                    break;
                }
                PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 = polarVoyageServiceStormMasterPixel9641Arr[i4];
                if (polarVoyageServiceStormMasterPixel9641.PolarVoyageKotlinBetaPulseBeta3653() == 0) {
                    PolarVoyageCardViewAlphaVortexCelestial9747(i4, false);
                } else {
                    long j3 = this.PolarVoyageWithContextPulseSolarHyperion4393;
                    long j4 = this.PolarVoyageThreadPhoenixVisionSolar1313;
                    PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX9940 = polarVoyageServiceStormMasterPixel9641.PolarVoyageKotlinBetaPulseBeta3653;
                    PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99402 = polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185;
                    if (PolarVoyageServiceStormMasterPixel9641.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageGestureDetectorPhoenixNovaX99402)) {
                        polarVoyageGestureDetectorPhoenixNovaX99402.PolarVoyagePackageManagerCelestialPhoenix8393(j3, j4);
                    }
                    if (polarVoyageGestureDetectorPhoenixNovaX9940 != null && polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyageSnackbarGammaEclipse2140 != 0) {
                        polarVoyageGestureDetectorPhoenixNovaX9940.PolarVoyagePackageManagerCelestialPhoenix8393(j3, j4);
                    }
                    if (z) {
                        PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99403 = polarVoyageServiceStormMasterPixel9641.PolarVoyageKotlinBetaPulseBeta3653;
                        PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX99404 = polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185;
                        boolean PolarVoyageCameraPixelBlaze2629 = PolarVoyageServiceStormMasterPixel9641.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageGestureDetectorPhoenixNovaX99404) ? polarVoyageGestureDetectorPhoenixNovaX99404.PolarVoyageCameraPixelBlaze2629() : true;
                        if (polarVoyageGestureDetectorPhoenixNovaX99403 != null && polarVoyageGestureDetectorPhoenixNovaX99403.PolarVoyageSnackbarGammaEclipse2140 != 0) {
                            PolarVoyageCameraPixelBlaze2629 &= polarVoyageGestureDetectorPhoenixNovaX99403.PolarVoyageCameraPixelBlaze2629();
                        }
                        if (PolarVoyageCameraPixelBlaze2629) {
                            z = true;
                            PolarVoyageGestureDetectorPhoenixNovaX9940 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageServiceStormMasterPixel9641.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageAdMobDeltaMasterShadow9877);
                            z7 = PolarVoyageBarcodeScannerInfernoSolarSpark7767 != null || PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageViewRogueMaster4778() || PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageSnackbarGammaEclipse2140() || PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageCameraPixelBlaze2629();
                            PolarVoyageCardViewAlphaVortexCelestial9747(i4, z7);
                            z2 = !z2 && z7;
                            if (z7) {
                                PolarVoyageViewBindingPulseHeroSpeed5705(i4);
                            }
                        }
                    }
                    z = false;
                    PolarVoyageGestureDetectorPhoenixNovaX9940 PolarVoyageBarcodeScannerInfernoSolarSpark77672 = polarVoyageServiceStormMasterPixel9641.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageAdMobDeltaMasterShadow9877);
                    if (PolarVoyageBarcodeScannerInfernoSolarSpark77672 != null) {
                    }
                    PolarVoyageCardViewAlphaVortexCelestial9747(i4, z7);
                    if (z2) {
                    }
                    if (z7) {
                    }
                }
                i4++;
            }
        } else {
            polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageZipVortexCelestial6185.PolarVoyageViewRogueMaster4778();
            z = true;
            z2 = true;
        }
        long j5 = polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageDiffUtilTurboStrike5735;
        boolean z8 = z && polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageBitmapVisionAuroraPixel4705 && (j5 == -9223372036854775807L || j5 <= this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageAnimatorSetSparkUltraMax8233);
        if (z8 && this.PolarVoyageAlertDialogNovaXCelestial4954) {
            this.PolarVoyageAlertDialogNovaXCelestial4954 = false;
            int i5 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageDrawableDeltaHyperion5742;
            this.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587.PolarVoyageKotlinBetaPulseBeta3653(0);
            PolarVoyageRoomStormMaster7636(this.PolarVoyageCardViewAlphaVortexCelestial9747.PolarVoyageKotlinBetaPulseBeta3653(this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBitmapVisionAuroraPixel4705, false), i5, 5, false);
        }
        if (!z8 || !polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageBottomSheetOmegaNeo1907) {
            PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61882 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
            if (polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageBitmapVisionAuroraPixel4705 == 2) {
                PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha1105 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
                if (this.PolarVoyageMapTurboRogueTitan9291 == 0) {
                    z5 = PolarVoyageActivityInfoBetaQuantum8726();
                } else if (z2) {
                    if (polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageTextInputEditTextNebulaHero6651) {
                        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98772 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageStrictModeLegendEpic1532;
                        long j6 = PolarVoyageLayerSpeedBlazeVortex2881(polarVoyageMaterialButtonDragonCyberMega61882.PolarVoyageZipVortexCelestial6185, polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185) ? this.PolarVoyageLooperThreadAlphaPrime1279.PolarVoyageItemDecorationUltraDeltaEpic7485 : -9223372036854775807L;
                        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98773 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageViewRogueMaster4778;
                        boolean z9 = polarVoyageAdMobDeltaMasterShadow98773.PolarVoyageTextInputEditTextNebulaHero6651() && polarVoyageAdMobDeltaMasterShadow98773.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageBottomSheetOmegaNeo1907;
                        boolean z10 = polarVoyageAdMobDeltaMasterShadow98773.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185.PolarVoyageMotionLayoutTransitionHeroVision4068() && !polarVoyageAdMobDeltaMasterShadow98773.PolarVoyageBitmapVisionAuroraPixel4705;
                        if (!z9 && !z10) {
                            long PolarVoyageContentProviderHyperSpark3838 = PolarVoyageContentProviderHyperSpark3838(polarVoyageAdMobDeltaMasterShadow98773.PolarVoyageBarcodeScannerInfernoSolarSpark7767());
                            PolarVoyageRemoteModelManagerPulseMaxNovaX6329 polarVoyageRemoteModelManagerPulseMaxNovaX6329 = this.PolarVoyageCameraPixelBlaze2629;
                            PolarVoyageClipboardManagerUltraRogue9881 polarVoyageClipboardManagerUltraRogue9881 = this.PolarVoyageLifecycleOlympianOmega3762;
                            j = -9223372036854775807L;
                            PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow5566 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185;
                            PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497 = polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185;
                            float f = this.PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageBarcodeScannerInfernoSolarSpark7767().PolarVoyageZipVortexCelestial6185;
                            boolean z11 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageViewRogueMaster4778;
                            boolean z12 = this.PolarVoyageColorStateListEliteStrikeOlympian8131;
                            polarVoyageRemoteModelManagerPulseMaxNovaX6329.getClass();
                            long j7 = j6;
                            PolarVoyageAsyncNebulaPhoenixPhoenix2769 polarVoyageAsyncNebulaPhoenixPhoenix2769 = polarVoyageRoomDaoPulseShadow5566.PolarVoyageCameraPixelBlaze2629(polarVoyageRoomDaoPulseShadow5566.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageCombineBlazePulse1497.PolarVoyageZipVortexCelestial6185, polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageMotionLayoutTransitionHeroVision4068).PolarVoyageKotlinBetaPulseBeta3653, polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageZipVortexCelestial6185, 0L).PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068;
                            if (polarVoyageAsyncNebulaPhoenixPhoenix2769 != null) {
                                String scheme = polarVoyageAsyncNebulaPhoenixPhoenix2769.PolarVoyageZipVortexCelestial6185.getScheme();
                                if (TextUtils.isEmpty(scheme) || PolarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageNavigationViewHyperHyperHyperion1793.contains(scheme)) {
                                    z4 = true;
                                    if (f != 1.0f) {
                                        PolarVoyageContentProviderHyperSpark3838 = Math.round(PolarVoyageContentProviderHyperSpark3838 / f);
                                    }
                                    j2 = !z12 ? z4 ? polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageBottomSheetOmegaNeo1907 : polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageRotateAnimationCyberCelestialDelta4768 : z4 ? polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageStrictModeLegendEpic1532 : polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageItemDecorationUltraDeltaEpic7485;
                                    if (j7 != -9223372036854775807L) {
                                        j2 = Math.min(j7 / 2, j2);
                                    }
                                    if (j2 > 0 && PolarVoyageContentProviderHyperSpark3838 < j2) {
                                        if (!(!z4 ? polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageCameraPixelBlaze2629 : false)) {
                                            PolarVoyageInAppPurchaseMaxEpic8738 polarVoyageInAppPurchaseMaxEpic8738 = (PolarVoyageInAppPurchaseMaxEpic8738) polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageContentProviderHyperSpark3838.get(polarVoyageClipboardManagerUltraRogue9881);
                                            polarVoyageInAppPurchaseMaxEpic8738.getClass();
                                            synchronized (polarVoyageInAppPurchaseMaxEpic8738) {
                                                i = polarVoyageInAppPurchaseMaxEpic8738.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                                            }
                                            int i6 = i * polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                            PolarVoyageInAppPurchaseMaxEpic8738 polarVoyageInAppPurchaseMaxEpic87382 = (PolarVoyageInAppPurchaseMaxEpic8738) polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageContentProviderHyperSpark3838.get(polarVoyageClipboardManagerUltraRogue9881);
                                            polarVoyageInAppPurchaseMaxEpic87382.getClass();
                                        }
                                        z5 = false;
                                        if (z5) {
                                            PolarVoyageCombineBlazeSparkInferno2844(3);
                                            this.PolarVoyageFlowOnBetaCyber2473 = null;
                                            if (PolarVoyageConstraintSetCloneCelestialHero1930()) {
                                                PolarVoyageAlarmManagerBetaMaxPhantom7852(false, false);
                                                PolarVoyageDiffUtilSpeedCelestial7413 polarVoyageDiffUtilSpeedCelestial7413 = this.PolarVoyageDisplayMetricsVortexDragon9516;
                                                z3 = true;
                                                polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageCameraPixelBlaze2629 = true;
                                                polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageDiffUtilTurboStrike5735();
                                                PolarVoyageHandlerFusionOlympian7396();
                                                if (this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBitmapVisionAuroraPixel4705 == 2) {
                                                    int i7 = 0;
                                                    while (true) {
                                                        PolarVoyageServiceStormMasterPixel9641[] polarVoyageServiceStormMasterPixel9641Arr2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                                                        if (i7 >= polarVoyageServiceStormMasterPixel9641Arr2.length) {
                                                            break;
                                                        }
                                                        if (polarVoyageServiceStormMasterPixel9641Arr2[i7].PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageAdMobDeltaMasterShadow9877) != null ? z3 : false) {
                                                            PolarVoyageViewBindingPulseHeroSpeed5705(i7);
                                                        }
                                                        i7++;
                                                    }
                                                    PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega61883 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                                                    if (!polarVoyageMaterialButtonDragonCyberMega61883.PolarVoyageTextInputEditTextNebulaHero6651 && polarVoyageMaterialButtonDragonCyberMega61883.PolarVoyageNavigationViewHyperHyperHyperion1793 < 500000 && PolarVoyagePackageManagerCelestialPhoenix8393(this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageViewRogueMaster4778) && PolarVoyageConstraintSetCloneCelestialHero1930()) {
                                                        z6 = z3;
                                                        if (z6) {
                                                            this.PolarVoyageBottomSheetNovaXNova5051 = -9223372036854775807L;
                                                        } else {
                                                            long j8 = this.PolarVoyageBottomSheetNovaXNova5051;
                                                            PolarVoyageVelocityTrackerPhantomTitaniumStrike2970 polarVoyageVelocityTrackerPhantomTitaniumStrike2970 = this.PolarVoyageMotionLayoutForceEpicAurora7183;
                                                            if (j8 == -9223372036854775807L) {
                                                                polarVoyageVelocityTrackerPhantomTitaniumStrike2970.getClass();
                                                                this.PolarVoyageBottomSheetNovaXNova5051 = SystemClock.elapsedRealtime();
                                                            } else {
                                                                polarVoyageVelocityTrackerPhantomTitaniumStrike2970.getClass();
                                                                if (SystemClock.elapsedRealtime() - this.PolarVoyageBottomSheetNovaXNova5051 >= 4000) {
                                                                    throw new PolarVoyageTextInputLayoutQuantumNeo3334(0, 4000);
                                                                }
                                                            }
                                                        }
                                                        boolean z13 = (PolarVoyageConstraintSetCloneCelestialHero1930() || this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBitmapVisionAuroraPixel4705 != 3) ? false : z3;
                                                        if (this.PolarVoyageClipboardManagerAuroraPixel8666 || !this.PolarVoyageDisplayMetricsForceEclipseVision4728 || !z13) {
                                                            z3 = false;
                                                        }
                                                        polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                                                        if (polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageContentProviderHyperSpark3838 != z3) {
                                                            this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageItemDecorationUltraDeltaEpic7485(z3);
                                                        }
                                                        this.PolarVoyageDisplayMetricsForceEclipseVision4728 = false;
                                                        if (!z3 && (i2 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBitmapVisionAuroraPixel4705) != 4 && (z13 || i2 == 2 || (i2 == 3 && this.PolarVoyageMapTurboRogueTitan9291 != 0))) {
                                                            PolarVoyageKeyframeEpicNovaXCyber9821(uptimeMillis);
                                                        }
                                                        Trace.endSection();
                                                    }
                                                }
                                                z6 = false;
                                                if (z6) {
                                                }
                                                if (PolarVoyageConstraintSetCloneCelestialHero1930()) {
                                                }
                                                if (this.PolarVoyageClipboardManagerAuroraPixel8666) {
                                                }
                                                z3 = false;
                                                polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
                                                if (polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageContentProviderHyperSpark3838 != z3) {
                                                }
                                                this.PolarVoyageDisplayMetricsForceEclipseVision4728 = false;
                                                if (!z3) {
                                                    PolarVoyageKeyframeEpicNovaXCyber9821(uptimeMillis);
                                                }
                                                Trace.endSection();
                                            }
                                        }
                                    }
                                    z5 = true;
                                    if (z5) {
                                    }
                                }
                            }
                            z4 = false;
                            if (f != 1.0f) {
                            }
                            if (!z12) {
                            }
                            if (j7 != -9223372036854775807L) {
                            }
                            if (j2 > 0) {
                                if (!(!z4 ? polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageCameraPixelBlaze2629 : false)) {
                                }
                                z5 = false;
                                if (z5) {
                                }
                            }
                            z5 = true;
                            if (z5) {
                            }
                        }
                    }
                    j = -9223372036854775807L;
                    z5 = true;
                    if (z5) {
                    }
                } else {
                    z5 = false;
                }
                j = -9223372036854775807L;
                if (z5) {
                }
            } else {
                j = -9223372036854775807L;
            }
            z3 = true;
            if (this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBitmapVisionAuroraPixel4705 == 3 && (this.PolarVoyageMapTurboRogueTitan9291 != 0 ? !z2 : !PolarVoyageActivityInfoBetaQuantum8726())) {
                PolarVoyageAlarmManagerBetaMaxPhantom7852(PolarVoyageConstraintSetCloneCelestialHero1930(), false);
                PolarVoyageCombineBlazeSparkInferno2844(2);
                if (this.PolarVoyageColorStateListEliteStrikeOlympian8131) {
                    for (PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98774 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532; polarVoyageAdMobDeltaMasterShadow98774 != null; polarVoyageAdMobDeltaMasterShadow98774 = polarVoyageAdMobDeltaMasterShadow98774.PolarVoyageCameraPixelBlaze2629) {
                        for (PolarVoyagePagingSpectraDelta6398 polarVoyagePagingSpectraDelta6398 : (PolarVoyagePagingSpectraDelta6398[]) polarVoyageAdMobDeltaMasterShadow98774.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                            if (polarVoyagePagingSpectraDelta6398 != null) {
                                polarVoyagePagingSpectraDelta6398.PolarVoyageBottomSheetOmegaNeo1907();
                            }
                        }
                    }
                    PolarVoyageTextRecognitionMaxPhantom8204 polarVoyageTextRecognitionMaxPhantom8204 = this.PolarVoyageLooperThreadAlphaPrime1279;
                    long j9 = polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    if (j9 != j) {
                        long j10 = j9 + polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageItemDecorationUltraDeltaEpic7485 = j10;
                        long j11 = polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageTextInputEditTextNebulaHero6651;
                        if (j11 != j && j10 > j11) {
                            polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageItemDecorationUltraDeltaEpic7485 = j11;
                        }
                        polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageViewRogueMaster4778 = j;
                    }
                }
                PolarVoyageLocationListenerInfernoQuantumOlympian6900();
            }
            if (this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBitmapVisionAuroraPixel4705 == 2) {
            }
            z6 = false;
            if (z6) {
            }
            if (PolarVoyageConstraintSetCloneCelestialHero1930()) {
            }
            if (this.PolarVoyageClipboardManagerAuroraPixel8666) {
            }
            z3 = false;
            polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
            if (polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageContentProviderHyperSpark3838 != z3) {
            }
            this.PolarVoyageDisplayMetricsForceEclipseVision4728 = false;
            if (!z3) {
            }
            Trace.endSection();
        }
        PolarVoyageCombineBlazeSparkInferno2844(4);
        PolarVoyageLocationListenerInfernoQuantumOlympian6900();
        z3 = true;
        if (this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBitmapVisionAuroraPixel4705 == 2) {
        }
        z6 = false;
        if (z6) {
        }
        if (PolarVoyageConstraintSetCloneCelestialHero1930()) {
        }
        if (this.PolarVoyageClipboardManagerAuroraPixel8666) {
        }
        z3 = false;
        polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
        if (polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageContentProviderHyperSpark3838 != z3) {
        }
        this.PolarVoyageDisplayMetricsForceEclipseVision4728 = false;
        if (!z3) {
        }
        Trace.endSection();
    }

    public final void PolarVoyageSensorManagerFusionPixelSolar7026(PolarVoyageMotionSceneSpectraAuroraThunder3244 polarVoyageMotionSceneSpectraAuroraThunder3244) {
        this.PolarVoyageDelayCyberQuantumEclipse8687 = polarVoyageMotionSceneSpectraAuroraThunder3244;
        PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow5566 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185;
        PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha1105 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
        polarVoyageConstraintSetNovaSolarAlpha1105.getClass();
        polarVoyageMotionSceneSpectraAuroraThunder3244.getClass();
        if (polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageRemoteModelManagerOlympianCelestial9141.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageRemoteModelManagerOlympianCelestial9141.size(); i++) {
            ((PolarVoyageAdMobDeltaMasterShadow9877) polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageRemoteModelManagerOlympianCelestial9141.get(i)).PolarVoyageStrictModeLegendEpic1532();
        }
        polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageRemoteModelManagerOlympianCelestial9141 = arrayList;
        polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageCameraPixelBlaze2629 = null;
        polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageBottomSheetOmegaNeo1907();
    }

    public final void PolarVoyageSharedFlowRogueDeltaForce1577(PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow5566, PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497, PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow55662, PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse14972, long j, boolean z) {
        boolean PolarVoyageLayerSpeedBlazeVortex2881 = PolarVoyageLayerSpeedBlazeVortex2881(polarVoyageRoomDaoPulseShadow5566, polarVoyageCombineBlazePulse1497);
        Object obj = polarVoyageCombineBlazePulse1497.PolarVoyageZipVortexCelestial6185;
        if (!PolarVoyageLayerSpeedBlazeVortex2881) {
            PolarVoyageTransitionBlazePixel9380 polarVoyageTransitionBlazePixel9380 = polarVoyageCombineBlazePulse1497.PolarVoyageMotionLayoutTransitionHeroVision4068() ? PolarVoyageTransitionBlazePixel9380.PolarVoyageBarcodeScannerInfernoSolarSpark7767 : this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageSnackbarGammaEclipse2140;
            PolarVoyageDiffUtilSpeedCelestial7413 polarVoyageDiffUtilSpeedCelestial7413 = this.PolarVoyageDisplayMetricsVortexDragon9516;
            if (polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageBarcodeScannerInfernoSolarSpark7767().equals(polarVoyageTransitionBlazePixel9380)) {
                return;
            }
            this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageBitmapVisionAuroraPixel4705(16);
            polarVoyageDiffUtilSpeedCelestial7413.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageTransitionBlazePixel9380);
            PolarVoyageAlertDialogCyberHeroQuantum3938(this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageSnackbarGammaEclipse2140, polarVoyageTransitionBlazePixel9380.PolarVoyageZipVortexCelestial6185, false, false);
            return;
        }
        PolarVoyageScrollViewFusionVision5184 polarVoyageScrollViewFusionVision5184 = this.PolarVoyageAnimatorSetSparkUltraMax8233;
        int i = polarVoyageRoomDaoPulseShadow5566.PolarVoyageTextInputEditTextNebulaHero6651(obj, polarVoyageScrollViewFusionVision5184).PolarVoyageKotlinBetaPulseBeta3653;
        PolarVoyageInterstitialAdMasterShadowCosmos9360 polarVoyageInterstitialAdMasterShadowCosmos9360 = this.PolarVoyageNavigationViewHyperHyperHyperion1793;
        polarVoyageRoomDaoPulseShadow5566.PolarVoyageDrawableDeltaHyperion5742(i, polarVoyageInterstitialAdMasterShadowCosmos9360);
        PolarVoyageDisplayMetricsShadowDragon3850 polarVoyageDisplayMetricsShadowDragon3850 = polarVoyageInterstitialAdMasterShadowCosmos9360.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageTextRecognitionMaxPhantom8204 polarVoyageTextRecognitionMaxPhantom8204 = this.PolarVoyageLooperThreadAlphaPrime1279;
        polarVoyageTextRecognitionMaxPhantom8204.getClass();
        polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageLifecycleOlympianOmega3762(polarVoyageDisplayMetricsShadowDragon3850.PolarVoyageZipVortexCelestial6185);
        polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageLifecycleOlympianOmega3762(polarVoyageDisplayMetricsShadowDragon3850.PolarVoyageMotionLayoutTransitionHeroVision4068);
        polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageLifecycleOlympianOmega3762(polarVoyageDisplayMetricsShadowDragon3850.PolarVoyageKotlinBetaPulseBeta3653);
        float f = polarVoyageDisplayMetricsShadowDragon3850.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageRotateAnimationCyberCelestialDelta4768 = f;
        float f2 = polarVoyageDisplayMetricsShadowDragon3850.PolarVoyageBitmapVisionAuroraPixel4705;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageStrictModeLegendEpic1532 = f2;
        if (f == 1.0f && f2 == 1.0f) {
            polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageKotlinBetaPulseBeta3653 = -9223372036854775807L;
        }
        polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageZipVortexCelestial6185();
        if (j != -9223372036854775807L) {
            polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageCameraPixelBlaze2629(polarVoyageRoomDaoPulseShadow5566, obj, j);
            polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageZipVortexCelestial6185();
            return;
        }
        if (!Objects.equals(!polarVoyageRoomDaoPulseShadow55662.PolarVoyageContentProviderHyperSpark3838() ? polarVoyageRoomDaoPulseShadow55662.PolarVoyageCameraPixelBlaze2629(polarVoyageRoomDaoPulseShadow55662.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageCombineBlazePulse14972.PolarVoyageZipVortexCelestial6185, polarVoyageScrollViewFusionVision5184).PolarVoyageKotlinBetaPulseBeta3653, polarVoyageInterstitialAdMasterShadowCosmos9360, 0L).PolarVoyageZipVortexCelestial6185 : null, polarVoyageInterstitialAdMasterShadowCosmos9360.PolarVoyageZipVortexCelestial6185) || z) {
            polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = -9223372036854775807L;
            polarVoyageTextRecognitionMaxPhantom8204.PolarVoyageZipVortexCelestial6185();
        }
    }

    public final Pair PolarVoyageSnackbarGammaEclipse2140(PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow5566) {
        long j = 0;
        if (polarVoyageRoomDaoPulseShadow5566.PolarVoyageContentProviderHyperSpark3838()) {
            return Pair.create(PolarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageDisplayMetricsVortexDragon9516, 0L);
        }
        int PolarVoyageZipVortexCelestial6185 = polarVoyageRoomDaoPulseShadow5566.PolarVoyageZipVortexCelestial6185(this.PolarVoyageHandlerThreadMaxAurora5064);
        Pair PolarVoyageStrictModeLegendEpic1532 = polarVoyageRoomDaoPulseShadow5566.PolarVoyageStrictModeLegendEpic1532(this.PolarVoyageNavigationViewHyperHyperHyperion1793, this.PolarVoyageAnimatorSetSparkUltraMax8233, PolarVoyageZipVortexCelestial6185, -9223372036854775807L);
        PolarVoyageCombineBlazePulse1497 PolarVoyageContentProviderHyperSpark3838 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageContentProviderHyperSpark3838(polarVoyageRoomDaoPulseShadow5566, PolarVoyageStrictModeLegendEpic1532.first, 0L);
        long longValue = ((Long) PolarVoyageStrictModeLegendEpic1532.second).longValue();
        if (PolarVoyageContentProviderHyperSpark3838.PolarVoyageMotionLayoutTransitionHeroVision4068()) {
            Object obj = PolarVoyageContentProviderHyperSpark3838.PolarVoyageZipVortexCelestial6185;
            PolarVoyageScrollViewFusionVision5184 polarVoyageScrollViewFusionVision5184 = this.PolarVoyageAnimatorSetSparkUltraMax8233;
            polarVoyageRoomDaoPulseShadow5566.PolarVoyageTextInputEditTextNebulaHero6651(obj, polarVoyageScrollViewFusionVision5184);
            if (PolarVoyageContentProviderHyperSpark3838.PolarVoyageKotlinBetaPulseBeta3653 == polarVoyageScrollViewFusionVision5184.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageContentProviderHyperSpark3838.PolarVoyageMotionLayoutTransitionHeroVision4068)) {
                polarVoyageScrollViewFusionVision5184.PolarVoyageTextInputEditTextNebulaHero6651.getClass();
            }
        } else {
            j = longValue;
        }
        return Pair.create(PolarVoyageContentProviderHyperSpark3838, Long.valueOf(j));
    }

    @Override // p000createpolar.PolarVoyageNavigationViewVortexPulse6567
    public final void PolarVoyageStrictModeLegendEpic1532(PolarVoyageServiceVortexCosmosAlpha1023 polarVoyageServiceVortexCosmosAlpha1023) {
        this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageMotionLayoutTransitionHeroVision4068(8, polarVoyageServiceVortexCosmosAlpha1023).PolarVoyageMotionLayoutTransitionHeroVision4068();
    }

    public final void PolarVoyageTextInputEditTextNebulaHero6651() {
        PolarVoyageGestureDetectorPhoenixNovaX9940 polarVoyageGestureDetectorPhoenixNovaX9940;
        if (this.PolarVoyageViewBindingPulseHeroSpeed5705 && PolarVoyageBitmapVisionAuroraPixel4705()) {
            for (PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 : this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                int PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageServiceStormMasterPixel9641.PolarVoyageKotlinBetaPulseBeta3653();
                PolarVoyageDiffUtilSpeedCelestial7413 polarVoyageDiffUtilSpeedCelestial7413 = this.PolarVoyageDisplayMetricsVortexDragon9516;
                if (polarVoyageServiceStormMasterPixel9641.PolarVoyageDiffUtilTurboStrike5735()) {
                    int i = polarVoyageServiceStormMasterPixel9641.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        try {
                            polarVoyageGestureDetectorPhoenixNovaX9940 = polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185;
                        } catch (RuntimeException e) {
                            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageAnimatorSetSparkUltraMax8233("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        polarVoyageGestureDetectorPhoenixNovaX9940 = polarVoyageServiceStormMasterPixel9641.PolarVoyageKotlinBetaPulseBeta3653;
                        polarVoyageGestureDetectorPhoenixNovaX9940.getClass();
                    }
                    polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185(polarVoyageGestureDetectorPhoenixNovaX9940, polarVoyageDiffUtilSpeedCelestial7413);
                    try {
                        polarVoyageServiceStormMasterPixel9641.PolarVoyageStrictModeLegendEpic1532(z);
                    } catch (RuntimeException e2) {
                        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageAnimatorSetSparkUltraMax8233("RendererHolder", "Reset prewarming failed.", e2);
                    }
                    polarVoyageServiceStormMasterPixel9641.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i2;
                }
                this.PolarVoyageMapTurboRogueTitan9291 -= PolarVoyageKotlinBetaPulseBeta3653 - polarVoyageServiceStormMasterPixel9641.PolarVoyageKotlinBetaPulseBeta3653();
            }
            this.PolarVoyageCardViewSpectraTurbo5149 = -9223372036854775807L;
        }
    }

    public final void PolarVoyageThreadPhoenixVisionSolar1313(boolean z) {
        this.PolarVoyagePoseDetectionCosmosVision6217 = z;
        PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587();
        if (this.PolarVoyageAlertDialogNovaXCelestial4954) {
            PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha1105 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
            if (polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageRotateAnimationCyberCelestialDelta4768 != polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageStrictModeLegendEpic1532) {
                PolarVoyageMotionSceneStormSolarBeta2208(true);
                PolarVoyageDisplayMetricsVortexDragon9516(false);
            }
        }
    }

    public final void PolarVoyageToolbarEclipseInfernoHero6368() {
        this.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587.PolarVoyageKotlinBetaPulseBeta3653(1);
        PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803(false, false, false, true);
        PolarVoyageRemoteModelManagerPulseMaxNovaX6329 polarVoyageRemoteModelManagerPulseMaxNovaX6329 = this.PolarVoyageCameraPixelBlaze2629;
        ConcurrentHashMap concurrentHashMap = polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageContentProviderHyperSpark3838;
        long id = Thread.currentThread().getId();
        long j = polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageRemoteModelManagerOlympianCelestial9141;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageDiffUtilDragonSpeedEclipse6225("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageRemoteModelManagerOlympianCelestial9141 = id;
        PolarVoyageClipboardManagerUltraRogue9881 polarVoyageClipboardManagerUltraRogue9881 = this.PolarVoyageLifecycleOlympianOmega3762;
        PolarVoyageInAppPurchaseMaxEpic8738 polarVoyageInAppPurchaseMaxEpic8738 = (PolarVoyageInAppPurchaseMaxEpic8738) concurrentHashMap.get(polarVoyageClipboardManagerUltraRogue9881);
        if (polarVoyageInAppPurchaseMaxEpic8738 == null) {
            PolarVoyageInAppPurchaseMaxEpic8738 polarVoyageInAppPurchaseMaxEpic87382 = new PolarVoyageInAppPurchaseMaxEpic8738();
            polarVoyageInAppPurchaseMaxEpic87382.PolarVoyageZipVortexCelestial6185 = 1;
            concurrentHashMap.put(polarVoyageClipboardManagerUltraRogue9881, polarVoyageInAppPurchaseMaxEpic87382);
        } else {
            polarVoyageInAppPurchaseMaxEpic8738.PolarVoyageZipVortexCelestial6185++;
        }
        PolarVoyageInAppPurchaseMaxEpic8738 polarVoyageInAppPurchaseMaxEpic87383 = (PolarVoyageInAppPurchaseMaxEpic8738) concurrentHashMap.get(polarVoyageClipboardManagerUltraRogue9881);
        polarVoyageInAppPurchaseMaxEpic87383.getClass();
        Integer num = (Integer) polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageSnackbarGammaEclipse2140.get(polarVoyageClipboardManagerUltraRogue9881.PolarVoyageZipVortexCelestial6185);
        int intValue = (num == null || num.intValue() == -1) ? polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageViewRogueMaster4778 : num.intValue();
        if (intValue == -1) {
            intValue = 13107200;
        }
        polarVoyageInAppPurchaseMaxEpic87383.PolarVoyageKotlinBetaPulseBeta3653 = intValue;
        polarVoyageInAppPurchaseMaxEpic87383.PolarVoyageMotionLayoutTransitionHeroVision4068 = false;
        PolarVoyageCombineBlazeSparkInferno2844(this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185.PolarVoyageContentProviderHyperSpark3838() ? 4 : 2);
        PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803;
        boolean z = polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageViewRogueMaster4778;
        PolarVoyageRoomStormMaster7636(this.PolarVoyageCardViewAlphaVortexCelestial9747.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageBitmapVisionAuroraPixel4705, z), polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageDrawableDeltaHyperion5742, polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageCameraPixelBlaze2629, z);
        PolarVoyageSnackbarTitanSpectra1637 polarVoyageSnackbarTitanSpectra1637 = this.PolarVoyageDrawableDeltaHyperion5742;
        polarVoyageSnackbarTitanSpectra1637.getClass();
        PolarVoyageKaptNeoFusion1280 polarVoyageKaptNeoFusion1280 = this.PolarVoyagePackageManagerCelestialPhoenix8393;
        ArrayList arrayList = polarVoyageKaptNeoFusion1280.PolarVoyageMotionLayoutTransitionHeroVision4068;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(!polarVoyageKaptNeoFusion1280.PolarVoyageBottomSheetOmegaNeo1907);
        polarVoyageKaptNeoFusion1280.PolarVoyageViewRogueMaster4778 = polarVoyageSnackbarTitanSpectra1637;
        for (int i = 0; i < arrayList.size(); i++) {
            PolarVoyageActionBarSparkUltra6353 polarVoyageActionBarSparkUltra6353 = (PolarVoyageActionBarSparkUltra6353) arrayList.get(i);
            polarVoyageKaptNeoFusion1280.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageActionBarSparkUltra6353);
            polarVoyageKaptNeoFusion1280.PolarVoyageTextInputEditTextNebulaHero6651.add(polarVoyageActionBarSparkUltra6353);
        }
        polarVoyageKaptNeoFusion1280.PolarVoyageBottomSheetOmegaNeo1907 = true;
        this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageDiffUtilTurboStrike5735(2);
    }

    public final void PolarVoyageViewBindingPulseHeroSpeed5705(int i) {
        PolarVoyageServiceStormMasterPixel9641 polarVoyageServiceStormMasterPixel9641 = this.PolarVoyageItemDecorationUltraDeltaEpic7485[i];
        try {
            PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532;
            polarVoyageAdMobDeltaMasterShadow9877.getClass();
            PolarVoyageGestureDetectorPhoenixNovaX9940 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageServiceStormMasterPixel9641.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageAdMobDeltaMasterShadow9877);
            PolarVoyageBarcodeScannerInfernoSolarSpark7767.getClass();
            PolarVoyageFragmentTransactionVisionVortex9832 polarVoyageFragmentTransactionVisionVortex9832 = PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageContentProviderHyperSpark3838;
            polarVoyageFragmentTransactionVisionVortex9832.getClass();
            polarVoyageFragmentTransactionVisionVortex9832.PolarVoyageBitmapVisionAuroraPixel4705();
        } catch (IOException | RuntimeException e) {
            int i2 = polarVoyageServiceStormMasterPixel9641.PolarVoyageZipVortexCelestial6185.PolarVoyageStrictModeLegendEpic1532;
            if (i2 != 3 && i2 != 5) {
                throw e;
            }
            PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision4365 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532.PolarVoyageSnackbarGammaEclipse2140;
            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageAnimatorSetSparkUltraMax8233("ExoPlayerImplInternal", "Disabling track due to error: ".concat(PolarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageKotlinBetaPulseBeta3653(((PolarVoyagePagingSpectraDelta6398[]) polarVoyageViewPagerSparkVision4365.PolarVoyageRotateAnimationCyberCelestialDelta4768)[i].PolarVoyageItemDecorationUltraDeltaEpic7485())), e);
            PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision43652 = new PolarVoyageViewPagerSparkVision4365((PolarVoyageNestedScrollViewDragonNebulaPrime2058[]) ((PolarVoyageNestedScrollViewDragonNebulaPrime2058[]) polarVoyageViewPagerSparkVision4365.PolarVoyageStrictModeLegendEpic1532).clone(), (PolarVoyagePagingSpectraDelta6398[]) ((PolarVoyagePagingSpectraDelta6398[]) polarVoyageViewPagerSparkVision4365.PolarVoyageRotateAnimationCyberCelestialDelta4768).clone(), (PolarVoyageInstrumentationUltraTitanUltra1540) polarVoyageViewPagerSparkVision4365.PolarVoyageBottomSheetOmegaNeo1907, polarVoyageViewPagerSparkVision4365.PolarVoyageViewRogueMaster4778);
            ((PolarVoyageNestedScrollViewDragonNebulaPrime2058[]) polarVoyageViewPagerSparkVision43652.PolarVoyageStrictModeLegendEpic1532)[i] = null;
            ((PolarVoyagePagingSpectraDelta6398[]) polarVoyageViewPagerSparkVision43652.PolarVoyageRotateAnimationCyberCelestialDelta4768)[i] = null;
            PolarVoyageItemDecorationUltraDeltaEpic7485(i);
            PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98772 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageStrictModeLegendEpic1532;
            polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageZipVortexCelestial6185(polarVoyageViewPagerSparkVision43652, this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageAnimatorSetSparkUltraMax8233, false, new boolean[polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageRotateAnimationCyberCelestialDelta4768.length]);
        }
    }

    public final void PolarVoyageViewPagerHeroUltra9192(int i, int i2, List list) {
        this.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587.PolarVoyageKotlinBetaPulseBeta3653(1);
        PolarVoyageKaptNeoFusion1280 polarVoyageKaptNeoFusion1280 = this.PolarVoyagePackageManagerCelestialPhoenix8393;
        polarVoyageKaptNeoFusion1280.getClass();
        ArrayList arrayList = polarVoyageKaptNeoFusion1280.PolarVoyageMotionLayoutTransitionHeroVision4068;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(i >= 0 && i <= i2 && i2 <= arrayList.size());
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((PolarVoyageActionBarSparkUltra6353) arrayList.get(i3)).PolarVoyageZipVortexCelestial6185.PolarVoyageNavigationViewHyperHyperHyperion1793((PolarVoyageVideoCaptureNebulaHyperion7251) list.get(i3 - i));
        }
        PolarVoyageLayerDrawableShadowTitaniumOmega1942(polarVoyageKaptNeoFusion1280.PolarVoyageMotionLayoutTransitionHeroVision4068(), false);
    }

    public final void PolarVoyageViewPagerPhantomHyperionNova3183(PolarVoyageGraphSpeedThunderDragon6179 polarVoyageGraphSpeedThunderDragon6179) {
        this.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587.PolarVoyageKotlinBetaPulseBeta3653(1);
        PolarVoyageKaptNeoFusion1280 polarVoyageKaptNeoFusion1280 = this.PolarVoyagePackageManagerCelestialPhoenix8393;
        int size = polarVoyageKaptNeoFusion1280.PolarVoyageMotionLayoutTransitionHeroVision4068.size();
        if (polarVoyageGraphSpeedThunderDragon6179.PolarVoyageMotionLayoutTransitionHeroVision4068.length != size) {
            polarVoyageGraphSpeedThunderDragon6179 = new PolarVoyageGraphSpeedThunderDragon6179(new Random(polarVoyageGraphSpeedThunderDragon6179.PolarVoyageZipVortexCelestial6185.nextLong())).PolarVoyageZipVortexCelestial6185(size);
        }
        polarVoyageKaptNeoFusion1280.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageGraphSpeedThunderDragon6179;
        PolarVoyageLayerDrawableShadowTitaniumOmega1942(polarVoyageKaptNeoFusion1280.PolarVoyageMotionLayoutTransitionHeroVision4068(), false);
    }

    public final void PolarVoyageViewRogueMaster4778(boolean[] zArr, long j) {
        PolarVoyageServiceStormMasterPixel9641[] polarVoyageServiceStormMasterPixel9641Arr;
        PolarVoyageCountDownTimerNovaXNebula3211 polarVoyageCountDownTimerNovaXNebula3211;
        long j2;
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision4365 = polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageSnackbarGammaEclipse2140;
        int i = 0;
        while (true) {
            polarVoyageServiceStormMasterPixel9641Arr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (i >= polarVoyageServiceStormMasterPixel9641Arr.length) {
                break;
            }
            if (!polarVoyageViewPagerSparkVision4365.PolarVoyageTextInputEditTextNebulaHero6651(i)) {
                polarVoyageServiceStormMasterPixel9641Arr[i].PolarVoyageBottomSheetOmegaNeo1907();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < polarVoyageServiceStormMasterPixel9641Arr.length) {
            if (polarVoyageViewPagerSparkVision4365.PolarVoyageTextInputEditTextNebulaHero6651(i2) && polarVoyageServiceStormMasterPixel9641Arr[i2].PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageAdMobDeltaMasterShadow9877) == null) {
                polarVoyageCountDownTimerNovaXNebula3211 = this;
                j2 = j;
                polarVoyageCountDownTimerNovaXNebula3211.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageAdMobDeltaMasterShadow9877, i2, zArr[i2], j2);
            } else {
                polarVoyageCountDownTimerNovaXNebula3211 = this;
                j2 = j;
            }
            i2++;
            this = polarVoyageCountDownTimerNovaXNebula3211;
            j = j2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageWindowManagerOlympianNovaNebula5076(PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497, PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision4365) {
        boolean z;
        int length;
        int i;
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877 = this.PolarVoyageCameraViewSpectraMaxSpectra2824.PolarVoyageViewRogueMaster4778;
        polarVoyageAdMobDeltaMasterShadow9877.getClass();
        PolarVoyageContentProviderHyperSpark3838(polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageBarcodeScannerInfernoSolarSpark7767());
        if (PolarVoyageLayerSpeedBlazeVortex2881(this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185, polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185)) {
            long j = this.PolarVoyageLooperThreadAlphaPrime1279.PolarVoyageItemDecorationUltraDeltaEpic7485;
        }
        PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow5566 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageZipVortexCelestial6185;
        float f = this.PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageBarcodeScannerInfernoSolarSpark7767().PolarVoyageZipVortexCelestial6185;
        boolean z2 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageViewRogueMaster4778;
        PolarVoyagePagingSpectraDelta6398[] polarVoyagePagingSpectraDelta6398Arr = (PolarVoyagePagingSpectraDelta6398[]) polarVoyageViewPagerSparkVision4365.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageRemoteModelManagerPulseMaxNovaX6329 polarVoyageRemoteModelManagerPulseMaxNovaX6329 = this.PolarVoyageCameraPixelBlaze2629;
        polarVoyageRemoteModelManagerPulseMaxNovaX6329.getClass();
        PolarVoyageContentProviderNebulaVisionCyber2673 polarVoyageContentProviderNebulaVisionCyber2673 = polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageSnackbarGammaEclipse2140;
        PolarVoyageClipboardManagerUltraRogue9881 polarVoyageClipboardManagerUltraRogue9881 = this.PolarVoyageLifecycleOlympianOmega3762;
        Integer num = (Integer) polarVoyageContentProviderNebulaVisionCyber2673.get(polarVoyageClipboardManagerUltraRogue9881.PolarVoyageZipVortexCelestial6185);
        int intValue = (num == null || num.intValue() == -1) ? polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageViewRogueMaster4778 : num.intValue();
        PolarVoyageInAppPurchaseMaxEpic8738 polarVoyageInAppPurchaseMaxEpic8738 = (PolarVoyageInAppPurchaseMaxEpic8738) polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageContentProviderHyperSpark3838.get(polarVoyageClipboardManagerUltraRogue9881);
        polarVoyageInAppPurchaseMaxEpic8738.getClass();
        if (intValue == -1) {
            PolarVoyageAsyncNebulaPhoenixPhoenix2769 polarVoyageAsyncNebulaPhoenixPhoenix2769 = polarVoyageRoomDaoPulseShadow5566.PolarVoyageCameraPixelBlaze2629(polarVoyageRoomDaoPulseShadow5566.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageCombineBlazePulse1497.PolarVoyageZipVortexCelestial6185, polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageMotionLayoutTransitionHeroVision4068).PolarVoyageKotlinBetaPulseBeta3653, polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageZipVortexCelestial6185, 0L).PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (polarVoyageAsyncNebulaPhoenixPhoenix2769 != null) {
                String scheme = polarVoyageAsyncNebulaPhoenixPhoenix2769.PolarVoyageZipVortexCelestial6185.getScheme();
                if (TextUtils.isEmpty(scheme) || PolarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageNavigationViewHyperHyperHyperion1793.contains(scheme)) {
                    z = true;
                    length = polarVoyagePagingSpectraDelta6398Arr.length;
                    i = 0;
                    int i2 = 0;
                    while (true) {
                        int i3 = 13107200;
                        if (i >= length) {
                            PolarVoyagePagingSpectraDelta6398 polarVoyagePagingSpectraDelta6398 = polarVoyagePagingSpectraDelta6398Arr[i];
                            if (polarVoyagePagingSpectraDelta6398 != null) {
                                switch (polarVoyagePagingSpectraDelta6398.PolarVoyageTextInputEditTextNebulaHero6651().PolarVoyageKotlinBetaPulseBeta3653) {
                                    case -2:
                                        i3 = 0;
                                        i2 += i3;
                                        break;
                                    case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                                    case 1:
                                        i2 += i3;
                                        break;
                                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                        i3 = 144310272;
                                        i2 += i3;
                                        break;
                                    case 2:
                                        i3 = z ? 19660800 : 131072000;
                                        i2 += i3;
                                        break;
                                    case 3:
                                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                                        i3 = 131072;
                                        i2 += i3;
                                        break;
                                    case 4:
                                        i3 = 26214400;
                                        i2 += i3;
                                        break;
                                    default:
                                        PolarVoyageR8UltraEliteBeta8736.PolarVoyageDrawableDeltaHyperion5742();
                                        break;
                                }
                                return;
                            }
                            i++;
                        } else {
                            intValue = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageTextInputEditTextNebulaHero6651(i2, 13107200, 210239488);
                        }
                    }
                }
            }
            z = false;
            length = polarVoyagePagingSpectraDelta6398Arr.length;
            i = 0;
            int i22 = 0;
            while (true) {
                int i32 = 13107200;
                if (i >= length) {
                }
                i++;
            }
        }
        polarVoyageInAppPurchaseMaxEpic8738.PolarVoyageKotlinBetaPulseBeta3653 = intValue;
        polarVoyageRemoteModelManagerPulseMaxNovaX6329.PolarVoyageKotlinBetaPulseBeta3653();
    }

    public final void PolarVoyageWithContextPulseSolarHyperion4393(PolarVoyageTextViewHeroTitanHyperion5542 polarVoyageTextViewHeroTitanHyperion5542) {
        this.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587.PolarVoyageKotlinBetaPulseBeta3653(1);
        int i = polarVoyageTextViewHeroTitanHyperion5542.PolarVoyageKotlinBetaPulseBeta3653;
        PolarVoyageGraphSpeedThunderDragon6179 polarVoyageGraphSpeedThunderDragon6179 = polarVoyageTextViewHeroTitanHyperion5542.PolarVoyageMotionLayoutTransitionHeroVision4068;
        ArrayList arrayList = polarVoyageTextViewHeroTitanHyperion5542.PolarVoyageZipVortexCelestial6185;
        if (i != -1) {
            this.PolarVoyageKotlinHeroHyper4083 = new PolarVoyageAccelerometerMaxShadowCosmos8778(new PolarVoyageContextOlympianSpeed2181(arrayList, polarVoyageGraphSpeedThunderDragon6179), polarVoyageTextViewHeroTitanHyperion5542.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageTextViewHeroTitanHyperion5542.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
        }
        PolarVoyageKaptNeoFusion1280 polarVoyageKaptNeoFusion1280 = this.PolarVoyagePackageManagerCelestialPhoenix8393;
        ArrayList arrayList2 = polarVoyageKaptNeoFusion1280.PolarVoyageMotionLayoutTransitionHeroVision4068;
        polarVoyageKaptNeoFusion1280.PolarVoyageTextInputEditTextNebulaHero6651(0, arrayList2.size());
        PolarVoyageLayerDrawableShadowTitaniumOmega1942(polarVoyageKaptNeoFusion1280.PolarVoyageZipVortexCelestial6185(arrayList2.size(), arrayList, polarVoyageGraphSpeedThunderDragon6179), false);
    }

    @Override // p000createpolar.PolarVoyageCardViewNeoPhoenix5286
    public final void PolarVoyageZipVortexCelestial6185(long j, long j2, PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356, MediaFormat mediaFormat) {
        if (this.PolarVoyageGuidelineStormSolar2850) {
            this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageZipVortexCelestial6185(37).PolarVoyageMotionLayoutTransitionHeroVision4068();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i;
        int i2;
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow9877;
        PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497;
        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98772;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i3 = message.arg2;
                    this.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587.PolarVoyageKotlinBetaPulseBeta3653(1);
                    PolarVoyageRoomStormMaster7636(this.PolarVoyageCardViewAlphaVortexCelestial9747.PolarVoyageKotlinBetaPulseBeta3653(this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBitmapVisionAuroraPixel4705, z), i3 >> 4, i3 & 15, z);
                    break;
                case 2:
                    PolarVoyageRotateAnimationCyberCelestialDelta4768();
                    break;
                case 3:
                    PolarVoyageProcessCameraProviderQuantumCosmosPulse5576((PolarVoyageAccelerometerMaxShadowCosmos8778) message.obj);
                    break;
                case 4:
                    PolarVoyageCameraViewEclipseLegendStrike8028((PolarVoyageTransitionBlazePixel9380) message.obj);
                    break;
                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                    PolarVoyageCardViewSpectraTurbo5149((PolarVoyageGuidelineEpicPrimeMax7757) message.obj);
                    break;
                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                    PolarVoyageProximitySensorStrikeNeo2764(false, true);
                    break;
                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                    PolarVoyageAlarmManagerShadowHyperBeta8339((PolarVoyageBindingAdapterStrikeCosmos6770) message.obj);
                    return true;
                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                    PolarVoyageMotionLayoutForceEpicAurora7183((PolarVoyageServiceVortexCosmosAlpha1023) message.obj);
                    break;
                case 9:
                    PolarVoyageAnimatorSetSparkUltraMax8233((PolarVoyageServiceVortexCosmosAlpha1023) message.obj);
                    break;
                case 10:
                    PolarVoyageCanvasElitePhoenix4750();
                    break;
                case 11:
                    PolarVoyageFlowOnBetaCyber2473(message.arg1);
                    break;
                case 12:
                    PolarVoyageObserverEliteUltra2793(message.arg1 != 0);
                    break;
                case 13:
                    PolarVoyageMapTurboRogueTitan9291(message.arg1 != 0, (PolarVoyageBindingAdapterStrikeCosmos6770) message.obj);
                    break;
                case 14:
                    PolarVoyageOnPreDrawListenerNovaCelestialDragon7415((PolarVoyageActivityInfoBetaFusion4959) message.obj);
                    break;
                case 15:
                    PolarVoyageDisplayMetricsForceEclipseVision4728((PolarVoyageActivityInfoBetaFusion4959) message.obj);
                    break;
                case 16:
                    PolarVoyageTransitionBlazePixel9380 polarVoyageTransitionBlazePixel9380 = (PolarVoyageTransitionBlazePixel9380) message.obj;
                    PolarVoyageAlertDialogCyberHeroQuantum3938(polarVoyageTransitionBlazePixel9380, polarVoyageTransitionBlazePixel9380.PolarVoyageZipVortexCelestial6185, true, false);
                    break;
                case 17:
                    PolarVoyageWithContextPulseSolarHyperion4393((PolarVoyageTextViewHeroTitanHyperion5542) message.obj);
                    break;
                case 18:
                    PolarVoyageMotionLayoutTransitionHeroVision4068((PolarVoyageTextViewHeroTitanHyperion5542) message.obj, message.arg1);
                    break;
                case 19:
                    PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageMotionLayoutForceEpicAurora7183(message.obj);
                    PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149();
                    throw null;
                case 20:
                    PolarVoyageConfigurationMaxSpectraForce5418(message.arg1, message.arg2, (PolarVoyageGraphSpeedThunderDragon6179) message.obj);
                    break;
                case 21:
                    PolarVoyageViewPagerPhantomHyperionNova3183((PolarVoyageGraphSpeedThunderDragon6179) message.obj);
                    break;
                case 22:
                    PolarVoyageFlingGestureEclipsePrimeMax1376();
                    break;
                case 23:
                    PolarVoyageThreadPhoenixVisionSolar1313(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    PolarVoyageDiffUtilTurboStrike5735();
                    break;
                case 26:
                    PolarVoyageCanvasElitePhoenix4750();
                    PolarVoyageMotionSceneStormSolarBeta2208(true);
                    break;
                case 27:
                    PolarVoyageViewPagerHeroUltra9192(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    PolarVoyageSensorManagerFusionPixelSolar7026((PolarVoyageMotionSceneSpectraAuroraThunder3244) message.obj);
                    break;
                case 29:
                    PolarVoyageToolbarEclipseInfernoHero6368();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    PolarVoyagePaintMaxNova4034(pair.first, (PolarVoyageBindingAdapterStrikeCosmos6770) pair.second);
                    break;
                case 31:
                    PolarVoyageClipboardManagerAuroraPixel8666((PolarVoyageOnTouchListenerInfernoShadow9357) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    PolarVoyageAccelerometerUltraSolarSolar9029(((Float) message.obj).floatValue());
                    break;
                case 33:
                    PolarVoyageRemoteModelManagerOlympianCelestial9141(message.arg1);
                    break;
                case 34:
                    PolarVoyageNavigationViewHyperHyperHyperion1793();
                    break;
                case 35:
                    PolarVoyageDialogFragmentPixelEliteHyperion4038((PolarVoyageCardViewNeoPhoenix5286) message.obj);
                    break;
                case 36:
                    PolarVoyageBottomSheetNovaXNova5051(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.PolarVoyageGuidelineStormSolar2850 = false;
                    PolarVoyageAccelerometerMaxShadowCosmos8778 polarVoyageAccelerometerMaxShadowCosmos8778 = this.PolarVoyageConfigurationMaxSpectraForce5418;
                    if (polarVoyageAccelerometerMaxShadowCosmos8778 != null) {
                        PolarVoyageProcessCameraProviderQuantumCosmosPulse5576(polarVoyageAccelerometerMaxShadowCosmos8778);
                        this.PolarVoyageConfigurationMaxSpectraForce5418 = null;
                        break;
                    }
                    break;
                case 38:
                    PolarVoyageDelayCyberQuantumEclipse8687((PolarVoyageTextureViewThunderTurboStrike2293) message.obj);
                    break;
                case 39:
                    PolarVoyageKotlinHeroHyper4083((PolarVoyageBroadcastBetaPhantomHero6008) message.obj);
                    break;
            }
        } catch (PolarVoyageAssetManagerQuantumSpectraPhoenix6233 e) {
            e = e;
            int i4 = e.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha1105 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
            if (i4 == 1 && (polarVoyageAdMobDeltaMasterShadow98772 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageRotateAnimationCyberCelestialDelta4768) != null && e.PolarVoyageSnackbarGammaEclipse2140 == null) {
                e = e.PolarVoyageZipVortexCelestial6185(polarVoyageAdMobDeltaMasterShadow98772.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185);
            }
            int i5 = e.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            PolarVoyagePropertyValuesHolderHyperionUltra8479 polarVoyagePropertyValuesHolderHyperionUltra8479 = this.PolarVoyageSnackbarGammaEclipse2140;
            if (i5 == 1 && (polarVoyageCombineBlazePulse1497 = e.PolarVoyageSnackbarGammaEclipse2140) != null && PolarVoyageLooperThreadAlphaPrime1279(e.PolarVoyageViewRogueMaster4778, polarVoyageCombineBlazePulse1497)) {
                this.PolarVoyageObserverEliteUltra2793 = true;
                PolarVoyageTextInputEditTextNebulaHero6651();
                PolarVoyageAdMobDeltaMasterShadow9877 PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageTextInputEditTextNebulaHero6651();
                PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98773 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageStrictModeLegendEpic1532;
                if (polarVoyageAdMobDeltaMasterShadow98773 != PolarVoyageTextInputEditTextNebulaHero6651) {
                    while (polarVoyageAdMobDeltaMasterShadow98773 != null) {
                        PolarVoyageAdMobDeltaMasterShadow9877 polarVoyageAdMobDeltaMasterShadow98774 = polarVoyageAdMobDeltaMasterShadow98773.PolarVoyageCameraPixelBlaze2629;
                        if (polarVoyageAdMobDeltaMasterShadow98774 == PolarVoyageTextInputEditTextNebulaHero6651) {
                            break;
                        }
                        polarVoyageAdMobDeltaMasterShadow98773 = polarVoyageAdMobDeltaMasterShadow98774;
                    }
                }
                polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageDrawableDeltaHyperion5742(polarVoyageAdMobDeltaMasterShadow98773);
                if (this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageBitmapVisionAuroraPixel4705 != 4) {
                    PolarVoyageLifecycleOlympianOmega3762();
                    polarVoyagePropertyValuesHolderHyperionUltra8479.PolarVoyageDiffUtilTurboStrike5735(2);
                }
            } else {
                PolarVoyageAssetManagerQuantumSpectraPhoenix6233 polarVoyageAssetManagerQuantumSpectraPhoenix6233 = this.PolarVoyageFlowOnBetaCyber2473;
                if (polarVoyageAssetManagerQuantumSpectraPhoenix6233 != null) {
                    polarVoyageAssetManagerQuantumSpectraPhoenix6233.addSuppressed(e);
                    e = this.PolarVoyageFlowOnBetaCyber2473;
                }
                if (e.PolarVoyageRotateAnimationCyberCelestialDelta4768 == 1 && polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageStrictModeLegendEpic1532 != polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                    while (true) {
                        polarVoyageAdMobDeltaMasterShadow9877 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageStrictModeLegendEpic1532;
                        if (polarVoyageAdMobDeltaMasterShadow9877 == polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                            break;
                        }
                        polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageZipVortexCelestial6185();
                    }
                    PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageMotionLayoutForceEpicAurora7183(polarVoyageAdMobDeltaMasterShadow9877);
                    PolarVoyageFCMCelestialCosmosPixel3711();
                    PolarVoyageChipGroupHyperCelestial9288 polarVoyageChipGroupHyperCelestial9288 = polarVoyageAdMobDeltaMasterShadow9877.PolarVoyageTextInputEditTextNebulaHero6651;
                    PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse14972 = polarVoyageChipGroupHyperCelestial9288.PolarVoyageZipVortexCelestial6185;
                    long j = polarVoyageChipGroupHyperCelestial9288.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageCombineBlazePulse14972, j, polarVoyageChipGroupHyperCelestial9288.PolarVoyageBarcodeScannerInfernoSolarSpark7767, j, true, 0);
                }
                if (e.PolarVoyageContentProviderHyperSpark3838 && (this.PolarVoyageFlowOnBetaCyber2473 == null || (i2 = e.PolarVoyageItemDecorationUltraDeltaEpic7485) == 5004 || i2 == 5003)) {
                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageDelayCyberQuantumEclipse8687("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.PolarVoyageFlowOnBetaCyber2473 == null) {
                        this.PolarVoyageFlowOnBetaCyber2473 = e;
                    }
                    PolarVoyageCameraViewRogueMax2859 PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyagePropertyValuesHolderHyperionUltra8479.PolarVoyageMotionLayoutTransitionHeroVision4068(25, e);
                    Handler handler = polarVoyagePropertyValuesHolderHyperionUltra8479.PolarVoyageZipVortexCelestial6185;
                    Message message2 = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185();
                } else {
                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageAnimatorSetSparkUltraMax8233("ExoPlayerImplInternal", "Playback error", e);
                    PolarVoyageProximitySensorStrikeNeo2764(true, false);
                    this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageDiffUtilTurboStrike5735(e);
                }
            }
        } catch (PolarVoyagePagingSourceEpicCyber8929 e2) {
            PolarVoyageBitmapMaxTitanTitan7960(e2, e2.PolarVoyageItemDecorationUltraDeltaEpic7485);
        } catch (PolarVoyagePagingSourceFusionPhoenixThunder6968 e3) {
            PolarVoyageBitmapMaxTitanTitan7960(e3, e3.PolarVoyageItemDecorationUltraDeltaEpic7485);
        } catch (PolarVoyageToastNeoOmega7549 e4) {
            boolean z2 = e4.PolarVoyageItemDecorationUltraDeltaEpic7485;
            int i6 = e4.PolarVoyageStrictModeLegendEpic1532;
            if (i6 == 1) {
                i = z2 ? 3001 : 3003;
            } else {
                if (i6 == 4) {
                    i = z2 ? 3002 : 3004;
                }
                PolarVoyageBitmapMaxTitanTitan7960(e4, r3);
            }
            r3 = i;
            PolarVoyageBitmapMaxTitanTitan7960(e4, r3);
        } catch (IOException e5) {
            PolarVoyageBitmapMaxTitanTitan7960(e5, 2000);
        } catch (RuntimeException e6) {
            PolarVoyageAssetManagerQuantumSpectraPhoenix6233 polarVoyageAssetManagerQuantumSpectraPhoenix62332 = new PolarVoyageAssetManagerQuantumSpectraPhoenix6233(2, e6, ((e6 instanceof IllegalStateException) || (e6 instanceof IllegalArgumentException)) ? ErrorCodes.PROTOCOL_EXCEPTION : 1000);
            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageAnimatorSetSparkUltraMax8233("ExoPlayerImplInternal", "Playback error", polarVoyageAssetManagerQuantumSpectraPhoenix62332);
            PolarVoyageProximitySensorStrikeNeo2764(true, false);
            this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803 = this.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803.PolarVoyageDiffUtilTurboStrike5735(polarVoyageAssetManagerQuantumSpectraPhoenix62332);
        }
        PolarVoyageFCMCelestialCosmosPixel3711();
        return true;
    }
}
