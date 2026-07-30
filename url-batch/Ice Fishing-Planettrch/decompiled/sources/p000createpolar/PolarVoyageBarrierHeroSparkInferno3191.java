package p000createpolar;

import android.content.Intent;
import android.media.AudioTrack;
import android.os.Handler;
import android.util.Pair;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageBarrierHeroSparkInferno3191 implements Runnable {
    public final /* synthetic */ Object PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ Object PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageBarrierHeroSparkInferno3191(PolarVoyageShapeDrawableTitanFusionSpeed5859 polarVoyageShapeDrawableTitanFusionSpeed5859, PolarVoyageLayoutInfernoSpeed9711 polarVoyageLayoutInfernoSpeed9711, PolarVoyageBindingAdapterGammaOlympianCelestial7569 polarVoyageBindingAdapterGammaOlympianCelestial7569, PolarVoyageAsyncTaskMasterVision4556 polarVoyageAsyncTaskMasterVision4556) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 1;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageShapeDrawableTitanFusionSpeed5859;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageLayoutInfernoSpeed9711;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageAsyncTaskMasterVision4556;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AudioTrack audioTrack = (AudioTrack) this.PolarVoyageStrictModeLegendEpic1532;
                Handler handler = (Handler) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                PolarVoyageInterpolatorTitaniumOlympian2745 polarVoyageInterpolatorTitaniumOlympian2745 = (PolarVoyageInterpolatorTitaniumOlympian2745) this.PolarVoyageBottomSheetOmegaNeo1907;
                int i2 = 8;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new PolarVoyageLightSensorSparkBlazeTitanium9192(i2, polarVoyageInterpolatorTitaniumOlympian2745));
                    }
                    synchronized (PolarVoyageViewAuroraQuantum6418.PolarVoyageAnimatorSetSparkUltraMax8233) {
                        try {
                            int i3 = PolarVoyageViewAuroraQuantum6418.PolarVoyageDisplayMetricsVortexDragon9516 - 1;
                            PolarVoyageViewAuroraQuantum6418.PolarVoyageDisplayMetricsVortexDragon9516 = i3;
                            if (i3 == 0) {
                                ScheduledExecutorService scheduledExecutorService = PolarVoyageViewAuroraQuantum6418.PolarVoyageBitmapMaxTitanTitan7960;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                PolarVoyageViewAuroraQuantum6418.PolarVoyageBitmapMaxTitanTitan7960 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new PolarVoyageLightSensorSparkBlazeTitanium9192(i2, polarVoyageInterpolatorTitaniumOlympian2745));
                    }
                    synchronized (PolarVoyageViewAuroraQuantum6418.PolarVoyageAnimatorSetSparkUltraMax8233) {
                        try {
                            int i4 = PolarVoyageViewAuroraQuantum6418.PolarVoyageDisplayMetricsVortexDragon9516 - 1;
                            PolarVoyageViewAuroraQuantum6418.PolarVoyageDisplayMetricsVortexDragon9516 = i4;
                            if (i4 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = PolarVoyageViewAuroraQuantum6418.PolarVoyageBitmapMaxTitanTitan7960;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                PolarVoyageViewAuroraQuantum6418.PolarVoyageBitmapMaxTitanTitan7960 = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
            case 1:
                PolarVoyageShapeDrawableTitanFusionSpeed5859 polarVoyageShapeDrawableTitanFusionSpeed5859 = (PolarVoyageShapeDrawableTitanFusionSpeed5859) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageLayoutInfernoSpeed9711 polarVoyageLayoutInfernoSpeed9711 = (PolarVoyageLayoutInfernoSpeed9711) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                String str = polarVoyageLayoutInfernoSpeed9711.PolarVoyageZipVortexCelestial6185;
                PolarVoyageAsyncTaskMasterVision4556 polarVoyageAsyncTaskMasterVision4556 = (PolarVoyageAsyncTaskMasterVision4556) this.PolarVoyageBottomSheetOmegaNeo1907;
                polarVoyageShapeDrawableTitanFusionSpeed5859.getClass();
                Logger logger = PolarVoyageShapeDrawableTitanFusionSpeed5859.PolarVoyageDiffUtilTurboStrike5735;
                try {
                    PolarVoyageKeyEventCelestialTitaniumBlaze4887 PolarVoyageZipVortexCelestial6185 = polarVoyageShapeDrawableTitanFusionSpeed5859.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageZipVortexCelestial6185(str);
                    if (PolarVoyageZipVortexCelestial6185 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        polarVoyageShapeDrawableTitanFusionSpeed5859.PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageRotateAnimationCyberCelestialDelta4768(new PolarVoyageGraphDeltaPulse1659(polarVoyageShapeDrawableTitanFusionSpeed5859, polarVoyageLayoutInfernoSpeed9711, ((PolarVoyageActivityInfoPixelEliteNovaX7277) PolarVoyageZipVortexCelestial6185).PolarVoyageZipVortexCelestial6185(polarVoyageAsyncTaskMasterVision4556), i));
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    return;
                }
            case 2:
                PolarVoyageViewPagerMegaAurora4578 polarVoyageViewPagerMegaAurora4578 = (PolarVoyageViewPagerMegaAurora4578) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageRewardedAdPixelMaxEclipse6420 polarVoyageRewardedAdPixelMaxEclipse6420 = (PolarVoyageRewardedAdPixelMaxEclipse6420) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.PolarVoyageBottomSheetOmegaNeo1907;
                try {
                    PolarVoyageInputFilterThunderPulseVision4837 PolarVoyageNavigationViewHyperHyperHyperion1793 = PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageNavigationViewHyperHyperHyperion1793(polarVoyageViewPagerMegaAurora4578.PolarVoyageItemDecorationUltraDeltaEpic7485);
                    if (PolarVoyageNavigationViewHyperHyperHyperion1793 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    PolarVoyageEventEpicPulseTitanium4610 polarVoyageEventEpicPulseTitanium4610 = (PolarVoyageEventEpicPulseTitanium4610) PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageZipVortexCelestial6185;
                    synchronized (polarVoyageEventEpicPulseTitanium4610.PolarVoyageBottomSheetOmegaNeo1907) {
                        polarVoyageEventEpicPulseTitanium4610.PolarVoyageCameraPixelBlaze2629 = threadPoolExecutor;
                    }
                    PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185(new PolarVoyageDigitalInkRecognitionOlympianThunder3233(polarVoyageRewardedAdPixelMaxEclipse6420, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    polarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageAlertDialogCyberHeroQuantum3938(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 3:
                FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.PolarVoyageStrictModeLegendEpic1532;
                Intent intent = (Intent) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                PolarVoyageRotateDrawableTurboHyperDelta7408 polarVoyageRotateDrawableTurboHyperDelta7408 = (PolarVoyageRotateDrawableTurboHyperDelta7408) this.PolarVoyageBottomSheetOmegaNeo1907;
                try {
                    firebaseMessagingService.PolarVoyageMotionLayoutTransitionHeroVision4068(intent);
                    return;
                } finally {
                    polarVoyageRotateDrawableTurboHyperDelta7408.PolarVoyageZipVortexCelestial6185(null);
                }
            case 4:
                PolarVoyageConstraintSetNovaSolarAlpha1105 polarVoyageConstraintSetNovaSolarAlpha1105 = (PolarVoyageConstraintSetNovaSolarAlpha1105) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageDatabasePhantomBeta6832 polarVoyageDatabasePhantomBeta6832 = (PolarVoyageDatabasePhantomBeta6832) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497 = (PolarVoyageCombineBlazePulse1497) this.PolarVoyageBottomSheetOmegaNeo1907;
                PolarVoyageDatabaseVortexUltraNova4004 polarVoyageDatabaseVortexUltraNova4004 = polarVoyageConstraintSetNovaSolarAlpha1105.PolarVoyageKotlinBetaPulseBeta3653;
                PolarVoyageLifecycleCameraControllerUltraShadowDelta8620 PolarVoyageDiffUtilTurboStrike5735 = polarVoyageDatabasePhantomBeta6832.PolarVoyageDiffUtilTurboStrike5735();
                PolarVoyageStateEpicSpectraThunder6774 polarVoyageStateEpicSpectraThunder6774 = polarVoyageDatabaseVortexUltraNova4004.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                PolarVoyageGradlePluginDragonEpicDelta4266 polarVoyageGradlePluginDragonEpicDelta4266 = polarVoyageDatabaseVortexUltraNova4004.PolarVoyageTextInputEditTextNebulaHero6651;
                polarVoyageGradlePluginDragonEpicDelta4266.getClass();
                polarVoyageStateEpicSpectraThunder6774.getClass();
                polarVoyageStateEpicSpectraThunder6774.PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageBottomSheetOmegaNeo1907(PolarVoyageDiffUtilTurboStrike5735);
                if (!PolarVoyageDiffUtilTurboStrike5735.isEmpty()) {
                    polarVoyageStateEpicSpectraThunder6774.PolarVoyageDiffUtilTurboStrike5735 = (PolarVoyageCombineBlazePulse1497) PolarVoyageDiffUtilTurboStrike5735.get(0);
                    polarVoyageCombineBlazePulse1497.getClass();
                    polarVoyageStateEpicSpectraThunder6774.PolarVoyageZipVortexCelestial6185 = polarVoyageCombineBlazePulse1497;
                }
                if (((PolarVoyageCombineBlazePulse1497) polarVoyageStateEpicSpectraThunder6774.PolarVoyageBitmapVisionAuroraPixel4705) == null) {
                    polarVoyageStateEpicSpectraThunder6774.PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageStateEpicSpectraThunder6774.PolarVoyageRotateAnimationCyberCelestialDelta4768(polarVoyageGradlePluginDragonEpicDelta4266, (PolarVoyageDialogPhantomEliteAurora3058) polarVoyageStateEpicSpectraThunder6774.PolarVoyageKotlinBetaPulseBeta3653, (PolarVoyageCombineBlazePulse1497) polarVoyageStateEpicSpectraThunder6774.PolarVoyageDiffUtilTurboStrike5735, (PolarVoyageScrollViewFusionVision5184) polarVoyageStateEpicSpectraThunder6774.PolarVoyageMotionLayoutTransitionHeroVision4068);
                }
                polarVoyageStateEpicSpectraThunder6774.PolarVoyageContentProviderHyperSpark3838(polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageRotateAnimationCyberCelestialDelta4768());
                return;
            default:
                PolarVoyageSensorManagerStormPhantomSolar9259 polarVoyageSensorManagerStormPhantomSolar9259 = (PolarVoyageSensorManagerStormPhantomSolar9259) this.PolarVoyageStrictModeLegendEpic1532;
                Pair pair = (Pair) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                polarVoyageSensorManagerStormPhantomSolar9259.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBitmapMaxTitanTitan7960(((Integer) pair.first).intValue(), (PolarVoyageCombineBlazePulse1497) pair.second, (PolarVoyageTextViewStormLegend8893) this.PolarVoyageBottomSheetOmegaNeo1907);
                return;
        }
    }

    public /* synthetic */ PolarVoyageBarrierHeroSparkInferno3191(Object obj, Object obj2, Object obj3, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj2;
        this.PolarVoyageBottomSheetOmegaNeo1907 = obj3;
    }
}
