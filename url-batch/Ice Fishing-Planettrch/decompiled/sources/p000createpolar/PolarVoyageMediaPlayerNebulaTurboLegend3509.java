package p000createpolar;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.Handler;
import android.os.Process;
import android.os.StrictMode;
import android.util.LongSparseArray;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustThirdPartySharing;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageMediaPlayerNebulaTurboLegend3509 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ Object PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageMediaPlayerNebulaTurboLegend3509(int i, Object obj, Object obj2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        PolarVoyageLiveDataSolarQuantumUltra7998 polarVoyageLiveDataSolarQuantumUltra7998;
        PolarVoyageR8UltraEliteBeta8736 polarVoyageR8UltraEliteBeta8736;
        int i;
        long j;
        boolean z;
        int i2 = 1;
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((ActivityHandler) this.PolarVoyageStrictModeLegendEpic1532).lambda$trackThirdPartySharing$37((AdjustThirdPartySharing) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 1:
                ((ActivityHandler) this.PolarVoyageStrictModeLegendEpic1532).lambda$new$2((AdjustConfig) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 2:
                PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageViewRogueMaster4778((PolarVoyageRotateAnimationShadowPulse6120) this.PolarVoyageStrictModeLegendEpic1532, (LongSparseArray) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 3:
                PolarVoyageVectorDrawableTitaniumStorm2009 polarVoyageVectorDrawableTitaniumStorm2009 = (PolarVoyageVectorDrawableTitaniumStorm2009) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageMediaPlayerNebulaTurboLegend3509 polarVoyageMediaPlayerNebulaTurboLegend3509 = (PolarVoyageMediaPlayerNebulaTurboLegend3509) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                ((PolarVoyageContentObserverDragonTitaniumNebula2107) polarVoyageVectorDrawableTitaniumStorm2009.PolarVoyageViewRogueMaster4778).PolarVoyageItemDecorationUltraDeltaEpic7485();
                PolarVoyageImageAnalysisNovaUltra4777 polarVoyageImageAnalysisNovaUltra4777 = (PolarVoyageImageAnalysisNovaUltra4777) polarVoyageVectorDrawableTitaniumStorm2009.PolarVoyageBottomSheetOmegaNeo1907;
                synchronized (polarVoyageImageAnalysisNovaUltra4777.PolarVoyageZipVortexCelestial6185) {
                    polarVoyageImageAnalysisNovaUltra4777.PolarVoyageMotionLayoutTransitionHeroVision4068();
                    polarVoyageMediaPlayerNebulaTurboLegend3509.run();
                }
                return;
            case 4:
                Context context = (Context) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageBindingAdapterStrikeCosmos6770 polarVoyageBindingAdapterStrikeCosmos6770 = (PolarVoyageBindingAdapterStrikeCosmos6770) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageZipVortexCelestial6185 = (AudioManager) context.getSystemService("audio");
                polarVoyageBindingAdapterStrikeCosmos6770.PolarVoyageKotlinBetaPulseBeta3653();
                return;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                PolarVoyageJobSchedulerVisionFusion2049 polarVoyageJobSchedulerVisionFusion2049 = (PolarVoyageJobSchedulerVisionFusion2049) this.PolarVoyageStrictModeLegendEpic1532;
                synchronized (((PolarVoyageTransformNeoUltra1411) this.PolarVoyageRotateAnimationCyberCelestialDelta4768)) {
                }
                PolarVoyageLiveDataScopeDeltaForce2288 polarVoyageLiveDataScopeDeltaForce2288 = polarVoyageJobSchedulerVisionFusion2049.PolarVoyageMotionLayoutTransitionHeroVision4068;
                String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                PolarVoyageDatabaseVortexUltraNova4004 polarVoyageDatabaseVortexUltraNova4004 = polarVoyageLiveDataScopeDeltaForce2288.PolarVoyageZipVortexCelestial6185.PolarVoyageNavigationViewHyperHyperHyperion1793;
                polarVoyageDatabaseVortexUltraNova4004.PolarVoyageToolbarEclipseInfernoHero6368(polarVoyageDatabaseVortexUltraNova4004.PolarVoyageViewBindingPulseHeroSpeed5705((PolarVoyageCombineBlazePulse1497) polarVoyageDatabaseVortexUltraNova4004.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageDiffUtilTurboStrike5735), 1013, new PolarVoyageMeteringPointSolarMax4741(i2));
                return;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                PolarVoyageJobSchedulerVisionFusion2049 polarVoyageJobSchedulerVisionFusion20492 = (PolarVoyageJobSchedulerVisionFusion2049) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageRoomHyperCosmosEclipse5154 polarVoyageRoomHyperCosmosEclipse5154 = (PolarVoyageRoomHyperCosmosEclipse5154) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                PolarVoyageLiveDataScopeDeltaForce2288 polarVoyageLiveDataScopeDeltaForce22882 = polarVoyageJobSchedulerVisionFusion20492.PolarVoyageMotionLayoutTransitionHeroVision4068;
                String str2 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                PolarVoyageZoomStateAlphaVision6590.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageLiveDataScopeDeltaForce22882.PolarVoyageZipVortexCelestial6185.PolarVoyageFCMCelestialCosmosPixel3711, polarVoyageRoomHyperCosmosEclipse5154);
                return;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821 = (PolarVoyageAnimatorCelestialDeltaMaster5821) this.PolarVoyageStrictModeLegendEpic1532;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageBottomSheetOmegaNeo1907).post(new PolarVoyageMediaPlayerNebulaTurboLegend3509(8, polarVoyageAnimatorCelestialDeltaMaster5821, routedDevice));
                    return;
                }
                return;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster58212 = (PolarVoyageAnimatorCelestialDeltaMaster5821) this.PolarVoyageStrictModeLegendEpic1532;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                if (((PolarVoyagePreviewPixelEpic6778) polarVoyageAnimatorCelestialDeltaMaster58212.PolarVoyageViewRogueMaster4778) == null || (polarVoyageLiveDataSolarQuantumUltra7998 = ((PolarVoyageAnnotationProcessorPixelRogueSpectra9718) ((PolarVoyageRealtimeDatabaseEclipseUltra8894) polarVoyageAnimatorCelestialDeltaMaster58212.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageStrictModeLegendEpic1532).PolarVoyageStrictModeLegendEpic1532) == null || audioDeviceInfo.equals(polarVoyageLiveDataSolarQuantumUltra7998.PolarVoyageStrictModeLegendEpic1532)) {
                    return;
                }
                polarVoyageLiveDataSolarQuantumUltra7998.PolarVoyageStrictModeLegendEpic1532 = audioDeviceInfo;
                Context context2 = polarVoyageLiveDataSolarQuantumUltra7998.PolarVoyageZipVortexCelestial6185;
                PolarVoyageOnTouchListenerInfernoShadow9357 polarVoyageOnTouchListenerInfernoShadow9357 = polarVoyageLiveDataSolarQuantumUltra7998.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                List PolarVoyageZipVortexCelestial6185 = polarVoyageLiveDataSolarQuantumUltra7998.PolarVoyageZipVortexCelestial6185();
                PolarVoyageLifecycleCameraControllerUltraShadowDelta8620 polarVoyageLifecycleCameraControllerUltraShadowDelta8620 = PolarVoyageObjectDetectionEliteTitanVision5765.PolarVoyageBitmapVisionAuroraPixel4705;
                polarVoyageLiveDataSolarQuantumUltra7998.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageObjectDetectionEliteTitanVision5765.PolarVoyageMotionLayoutTransitionHeroVision4068(context2, context2.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), polarVoyageOnTouchListenerInfernoShadow9357, audioDeviceInfo, PolarVoyageZipVortexCelestial6185));
                return;
            case 9:
                PolarVoyageVideoCaptureSolarDragonGamma9082 polarVoyageVideoCaptureSolarDragonGamma9082 = (PolarVoyageVideoCaptureSolarDragonGamma9082) this.PolarVoyageStrictModeLegendEpic1532;
                Object apply = ((PolarVoyagePropertyValuesHolderOlympianTurboHero8288) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).apply(polarVoyageVideoCaptureSolarDragonGamma9082.PolarVoyageDiffUtilTurboStrike5735);
                polarVoyageVideoCaptureSolarDragonGamma9082.PolarVoyageDiffUtilTurboStrike5735 = apply;
                PolarVoyageTextRecognitionBetaStrike2727 polarVoyageTextRecognitionBetaStrike2727 = new PolarVoyageTextRecognitionBetaStrike2727(polarVoyageVideoCaptureSolarDragonGamma9082, apply, i2);
                PolarVoyagePropertyValuesHolderHyperionUltra8479 polarVoyagePropertyValuesHolderHyperionUltra8479 = (PolarVoyagePropertyValuesHolderHyperionUltra8479) polarVoyageVideoCaptureSolarDragonGamma9082.PolarVoyageKotlinBetaPulseBeta3653;
                if (polarVoyagePropertyValuesHolderHyperionUltra8479.PolarVoyageZipVortexCelestial6185.getLooper().getThread().isAlive()) {
                    polarVoyagePropertyValuesHolderHyperionUltra8479.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageTextRecognitionBetaStrike2727);
                    return;
                }
                return;
            case 10:
                PolarVoyageBannerAdPhoenixForcePhoenix6096 polarVoyageBannerAdPhoenixForcePhoenix6096 = (PolarVoyageBannerAdPhoenixForcePhoenix6096) this.PolarVoyageStrictModeLegendEpic1532;
                polarVoyageBannerAdPhoenixForcePhoenix6096.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageZipVortexCelestial6185(new PolarVoyageRoomEntityPulseForceBeta9506((PolarVoyageObjectAnimatorPulseOmegaTitanium2177) this.PolarVoyageRotateAnimationCyberCelestialDelta4768, polarVoyageBannerAdPhoenixForcePhoenix6096));
                return;
            case 11:
                PolarVoyagePermissionFusionSpark4903 polarVoyagePermissionFusionSpark4903 = (PolarVoyagePermissionFusionSpark4903) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageRemoteConfigEliteSpectra7350 polarVoyageRemoteConfigEliteSpectra7350 = (PolarVoyageRemoteConfigEliteSpectra7350) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                if (polarVoyagePermissionFusionSpark4903.PolarVoyageMotionLayoutTransitionHeroVision4068 != PolarVoyagePermissionFusionSpark4903.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
                    PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("provide() can be called only once.");
                    return;
                }
                synchronized (polarVoyagePermissionFusionSpark4903) {
                    polarVoyageR8UltraEliteBeta8736 = polarVoyagePermissionFusionSpark4903.PolarVoyageZipVortexCelestial6185;
                    polarVoyagePermissionFusionSpark4903.PolarVoyageZipVortexCelestial6185 = null;
                    polarVoyagePermissionFusionSpark4903.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageRemoteConfigEliteSpectra7350;
                }
                polarVoyageR8UltraEliteBeta8736.getClass();
                return;
            case 12:
                PolarVoyageFragmentLegendRogue2777 polarVoyageFragmentLegendRogue2777 = (PolarVoyageFragmentLegendRogue2777) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageRemoteConfigEliteSpectra7350 polarVoyageRemoteConfigEliteSpectra73502 = (PolarVoyageRemoteConfigEliteSpectra7350) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                synchronized (polarVoyageFragmentLegendRogue2777) {
                    try {
                        if (polarVoyageFragmentLegendRogue2777.PolarVoyageMotionLayoutTransitionHeroVision4068 == null) {
                            polarVoyageFragmentLegendRogue2777.PolarVoyageZipVortexCelestial6185.add(polarVoyageRemoteConfigEliteSpectra73502);
                        } else {
                            polarVoyageFragmentLegendRogue2777.PolarVoyageMotionLayoutTransitionHeroVision4068.add(polarVoyageRemoteConfigEliteSpectra73502.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 13:
                PolarVoyageThemeOverlayUltraInferno5971 polarVoyageThemeOverlayUltraInferno5971 = (PolarVoyageThemeOverlayUltraInferno5971) this.PolarVoyageStrictModeLegendEpic1532;
                Runnable runnable = (Runnable) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                Process.setThreadPriority(polarVoyageThemeOverlayUltraInferno5971.PolarVoyageKotlinBetaPulseBeta3653);
                StrictMode.ThreadPolicy threadPolicy = polarVoyageThemeOverlayUltraInferno5971.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 14:
                ((PolarVoyageCameraEliteHyperion3107) ((PolarVoyageZoomStateAlphaVision6590) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageZipVortexCelestial6185((PolarVoyageObserverOlympianSpeed4485) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 15:
                Callable callable = (Callable) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark4027 = (PolarVoyageAdapterTitanSpark4027) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                try {
                    Object call = callable.call();
                    PolarVoyageLifecycleCameraControllerAlphaQuantumRogue3425 polarVoyageLifecycleCameraControllerAlphaQuantumRogue3425 = (PolarVoyageLifecycleCameraControllerAlphaQuantumRogue3425) polarVoyageAdapterTitanSpark4027.PolarVoyageStrictModeLegendEpic1532;
                    if (call == null) {
                        call = PolarVoyageDragEventGammaThunder1866.PolarVoyageDrawableDeltaHyperion5742;
                    }
                    if (PolarVoyageDragEventGammaThunder1866.PolarVoyageCameraPixelBlaze2629.PolarVoyageSnackbarGammaEclipse2140(polarVoyageLifecycleCameraControllerAlphaQuantumRogue3425, null, call)) {
                        PolarVoyageDragEventGammaThunder1866.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageLifecycleCameraControllerAlphaQuantumRogue3425);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    polarVoyageAdapterTitanSpark4027.PolarVoyageCardViewAlphaVortexCelestial9747(e);
                    return;
                }
            case 16:
                PolarVoyageGradlePluginDragonEpicDelta4266 polarVoyageGradlePluginDragonEpicDelta4266 = (PolarVoyageGradlePluginDragonEpicDelta4266) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageFragmentHyperMasterHyper5702 polarVoyageFragmentHyperMasterHyper5702 = (PolarVoyageFragmentHyperMasterHyper5702) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                int i3 = polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageFlingGestureEclipsePrimeMax1376 - polarVoyageFragmentHyperMasterHyper5702.PolarVoyageZipVortexCelestial6185;
                polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageFlingGestureEclipsePrimeMax1376 = i3;
                if (polarVoyageFragmentHyperMasterHyper5702.PolarVoyageKotlinBetaPulseBeta3653) {
                    polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = polarVoyageFragmentHyperMasterHyper5702.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                    polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageToolbarEclipseInfernoHero6368 = true;
                }
                if (i3 == 0) {
                    PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow5566 = ((PolarVoyageMaterialButtonDragonCyberMega6188) polarVoyageFragmentHyperMasterHyper5702.PolarVoyageBitmapVisionAuroraPixel4705).PolarVoyageZipVortexCelestial6185;
                    int i4 = -1;
                    if (!polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageKotlinHeroHyper4083.PolarVoyageZipVortexCelestial6185.PolarVoyageContentProviderHyperSpark3838() && polarVoyageRoomDaoPulseShadow5566.PolarVoyageContentProviderHyperSpark3838()) {
                        polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageWithContextPulseSolarHyperion4393 = -1;
                        polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageThreadPhoenixVisionSolar1313 = 0L;
                    }
                    if (!polarVoyageRoomDaoPulseShadow5566.PolarVoyageContentProviderHyperSpark3838()) {
                        List asList = Arrays.asList(((PolarVoyageContextOlympianSpeed2181) polarVoyageRoomDaoPulseShadow5566).PolarVoyageItemDecorationUltraDeltaEpic7485);
                        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(asList.size() == polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageSnackbarGammaEclipse2140.size());
                        for (int i5 = 0; i5 < asList.size(); i5++) {
                            ((PolarVoyageDataBindingSpeedMegaOlympian4968) polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageSnackbarGammaEclipse2140.get(i5)).PolarVoyageMotionLayoutTransitionHeroVision4068 = (PolarVoyageRoomDaoPulseShadow5566) asList.get(i5);
                        }
                    }
                    long j2 = -9223372036854775807L;
                    if (polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageToolbarEclipseInfernoHero6368) {
                        boolean z2 = ((PolarVoyageMaterialButtonDragonCyberMega6188) polarVoyageFragmentHyperMasterHyper5702.PolarVoyageBitmapVisionAuroraPixel4705).PolarVoyageZipVortexCelestial6185.PolarVoyageContentProviderHyperSpark3838() && polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageKotlinHeroHyper4083.PolarVoyageZipVortexCelestial6185.PolarVoyageContentProviderHyperSpark3838();
                        boolean equals = ((PolarVoyageMaterialButtonDragonCyberMega6188) polarVoyageFragmentHyperMasterHyper5702.PolarVoyageBitmapVisionAuroraPixel4705).PolarVoyageMotionLayoutTransitionHeroVision4068.equals(polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageKotlinHeroHyper4083.PolarVoyageMotionLayoutTransitionHeroVision4068);
                        boolean z3 = ((PolarVoyageMaterialButtonDragonCyberMega6188) polarVoyageFragmentHyperMasterHyper5702.PolarVoyageBitmapVisionAuroraPixel4705).PolarVoyageBarcodeScannerInfernoSolarSpark7767 == polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageKotlinHeroHyper4083.PolarVoyageAnimatorSetSparkUltraMax8233;
                        if (z2 || (equals && z3)) {
                            i2 = 0;
                        }
                        if (i2 != 0) {
                            i4 = polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageDiffUtilTurboStrike5735();
                            if (polarVoyageRoomDaoPulseShadow5566.PolarVoyageContentProviderHyperSpark3838() || ((PolarVoyageMaterialButtonDragonCyberMega6188) polarVoyageFragmentHyperMasterHyper5702.PolarVoyageBitmapVisionAuroraPixel4705).PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068()) {
                                j2 = ((PolarVoyageMaterialButtonDragonCyberMega6188) polarVoyageFragmentHyperMasterHyper5702.PolarVoyageBitmapVisionAuroraPixel4705).PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                            } else {
                                PolarVoyageMaterialButtonDragonCyberMega6188 polarVoyageMaterialButtonDragonCyberMega6188 = (PolarVoyageMaterialButtonDragonCyberMega6188) polarVoyageFragmentHyperMasterHyper5702.PolarVoyageBitmapVisionAuroraPixel4705;
                                PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497 = polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                long j3 = polarVoyageMaterialButtonDragonCyberMega6188.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                                Object obj = polarVoyageCombineBlazePulse1497.PolarVoyageZipVortexCelestial6185;
                                PolarVoyageScrollViewFusionVision5184 polarVoyageScrollViewFusionVision5184 = polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageDrawableDeltaHyperion5742;
                                polarVoyageRoomDaoPulseShadow5566.PolarVoyageTextInputEditTextNebulaHero6651(obj, polarVoyageScrollViewFusionVision5184);
                                j2 = j3 + polarVoyageScrollViewFusionVision5184.PolarVoyageBitmapVisionAuroraPixel4705;
                            }
                        }
                        i = i4;
                        j = j2;
                        z = i2;
                    } else {
                        i = -1;
                        j = -9223372036854775807L;
                        z = 0;
                    }
                    polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageToolbarEclipseInfernoHero6368 = false;
                    polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageDiffUtilDragonSpeedEclipse6225((PolarVoyageMaterialButtonDragonCyberMega6188) polarVoyageFragmentHyperMasterHyper5702.PolarVoyageBitmapVisionAuroraPixel4705, 1, z, polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149, j, i);
                    return;
                }
                return;
            case 17:
                ((PolarVoyageRunnableBlazeDragon1360) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageZipVortexCelestial6185((Intent) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 18:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageRotateDrawableTurboHyperDelta7408 polarVoyageRotateDrawableTurboHyperDelta7408 = (PolarVoyageRotateDrawableTurboHyperDelta7408) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                try {
                    polarVoyageRotateDrawableTurboHyperDelta7408.PolarVoyageZipVortexCelestial6185(firebaseMessaging.PolarVoyageZipVortexCelestial6185());
                    return;
                } catch (Exception e2) {
                    polarVoyageRotateDrawableTurboHyperDelta7408.PolarVoyageZipVortexCelestial6185.PolarVoyageRotateAnimationCyberCelestialDelta4768(e2);
                    return;
                }
            case 19:
                ((PolarVoyageDebugStrikeEclipseQuantum3290) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageFCMCelestialCosmosPixel3711((PolarVoyageButtonBetaFusion6638) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 20:
                PolarVoyageAsyncTaskPrimeForceThunder9800 polarVoyageAsyncTaskPrimeForceThunder9800 = (PolarVoyageAsyncTaskPrimeForceThunder9800) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageRotateDrawableTurboHyperDelta7408 polarVoyageRotateDrawableTurboHyperDelta74082 = (PolarVoyageRotateDrawableTurboHyperDelta7408) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                try {
                    polarVoyageRotateDrawableTurboHyperDelta74082.PolarVoyageZipVortexCelestial6185(polarVoyageAsyncTaskPrimeForceThunder9800.PolarVoyageMotionLayoutTransitionHeroVision4068());
                    return;
                } catch (Exception e3) {
                    polarVoyageRotateDrawableTurboHyperDelta74082.PolarVoyageZipVortexCelestial6185.PolarVoyageRotateAnimationCyberCelestialDelta4768(e3);
                    return;
                }
            case 21:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.PolarVoyageStrictModeLegendEpic1532;
                JobParameters jobParameters = (JobParameters) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                int i6 = JobInfoSchedulerService.PolarVoyageItemDecorationUltraDeltaEpic7485;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 22:
                PolarVoyageKeyframeHeroNovaXEclipse7748 polarVoyageKeyframeHeroNovaXEclipse7748 = (PolarVoyageKeyframeHeroNovaXEclipse7748) this.PolarVoyageStrictModeLegendEpic1532;
                polarVoyageKeyframeHeroNovaXEclipse7748.PolarVoyageAlarmManagerShadowHyperBeta8339.set(polarVoyageKeyframeHeroNovaXEclipse7748.PolarVoyageCameraViewSpectraMaxSpectra2824((PolarVoyageZoomStateAlphaVision6590) this.PolarVoyageRotateAnimationCyberCelestialDelta4768, polarVoyageKeyframeHeroNovaXEclipse7748.PolarVoyageFCMCelestialCosmosPixel3711, 0));
                return;
            case 23:
                ((PolarVoyageAudioManagerPulseMega5140) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageBarcodeScannerInfernoSolarSpark7767.reportTrackChangeEvent((TrackChangeEvent) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 24:
                ((PolarVoyageAudioManagerPulseMega5140) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageBarcodeScannerInfernoSolarSpark7767.reportNetworkEvent((NetworkEvent) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 25:
                ((PolarVoyageAudioManagerPulseMega5140) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageBarcodeScannerInfernoSolarSpark7767.reportPlaybackErrorEvent((PlaybackErrorEvent) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 26:
                ((PolarVoyageAudioManagerPulseMega5140) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageBarcodeScannerInfernoSolarSpark7767.reportPlaybackMetrics((PlaybackMetrics) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 27:
                ((PolarVoyageAudioManagerPulseMega5140) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageBarcodeScannerInfernoSolarSpark7767.reportPlaybackStateEvent((PlaybackStateEvent) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 28:
                ((PolarVoyageScaleAnimationVortexAurora2886) this.PolarVoyageStrictModeLegendEpic1532).accept((PolarVoyageNestedScrollViewNeoTurbo2079) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            default:
                PolarVoyageMLKitQuantumEpic5634 polarVoyageMLKitQuantumEpic5634 = (PolarVoyageMLKitQuantumEpic5634) this.PolarVoyageStrictModeLegendEpic1532;
                Context context3 = (Context) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context3.registerReceiver(new PolarVoyagePoseDetectionMasterTitanium4242(i2, polarVoyageMLKitQuantumEpic5634), intentFilter);
                return;
        }
    }
}
