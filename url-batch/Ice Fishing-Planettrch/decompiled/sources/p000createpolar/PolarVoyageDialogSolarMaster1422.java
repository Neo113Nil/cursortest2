package p000createpolar;

import android.util.Log;
import android.view.MotionEvent;
import com.adjust.sdk.AdjustTimeoutCallback;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.SdkClickHandler;
import com.adjust.sdk.scheduler.TimerCycle;
import com.adjust.sdk.scheduler.TimerOnce;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageDialogSolarMaster1422 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final Object PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageDialogSolarMaster1422(PolarVoyageLayoutInflaterGammaVortex3108 polarVoyageLayoutInflaterGammaVortex3108, PolarVoyageViewModelQuantumDragonPhoenix2767 polarVoyageViewModelQuantumDragonPhoenix2767) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 12;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageViewModelQuantumDragonPhoenix2767;
    }

    private final void PolarVoyageZipVortexCelestial6185() {
        PolarVoyageNavigationPrimePhoenix7347 polarVoyageNavigationPrimePhoenix7347 = (PolarVoyageNavigationPrimePhoenix7347) this.PolarVoyageStrictModeLegendEpic1532;
        synchronized (polarVoyageNavigationPrimePhoenix7347.PolarVoyageZipVortexCelestial6185) {
            try {
                if (polarVoyageNavigationPrimePhoenix7347.PolarVoyageMotionLayoutTransitionHeroVision4068()) {
                    Log.e("WakeLock", String.valueOf(polarVoyageNavigationPrimePhoenix7347.PolarVoyageRotateAnimationCyberCelestialDelta4768).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    polarVoyageNavigationPrimePhoenix7347.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                    if (polarVoyageNavigationPrimePhoenix7347.PolarVoyageMotionLayoutTransitionHeroVision4068()) {
                        polarVoyageNavigationPrimePhoenix7347.PolarVoyageKotlinBetaPulseBeta3653 = 1;
                        polarVoyageNavigationPrimePhoenix7347.PolarVoyageBitmapVisionAuroraPixel4705();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        PolarVoyageContentProviderNovaXPixel3239 PolarVoyageMotionLayoutTransitionHeroVision4068;
        long j;
        ILogger iLogger;
        String str;
        Runnable runnable;
        ILogger iLogger2;
        String str2;
        Runnable runnable2;
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AdjustTimeoutCallback adjustTimeoutCallback = ((PolarVoyageTransitionManagerStrikeRogueSpark2628) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageStrictModeLegendEpic1532;
                OnAdidReadListener onAdidReadListener = adjustTimeoutCallback.getOnAdidReadListener();
                if (onAdidReadListener != null) {
                    onAdidReadListener.onAdidRead(null);
                }
                adjustTimeoutCallback.setOnAdidReadListener(null);
                return;
            case 1:
                AdjustTimeoutCallback adjustTimeoutCallback2 = ((PolarVoyageTransitionManagerStrikeRogueSpark2628) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageStrictModeLegendEpic1532;
                OnAttributionReadListener onAttributionReadListener = adjustTimeoutCallback2.getOnAttributionReadListener();
                if (onAttributionReadListener != null) {
                    onAttributionReadListener.onAttributionRead(null);
                }
                adjustTimeoutCallback2.setOnAttributionReadListener(null);
                return;
            case 2:
                PolarVoyageRewardedAdUltraTitanium4787 polarVoyageRewardedAdUltraTitanium4787 = (PolarVoyageRewardedAdUltraTitanium4787) this.PolarVoyageStrictModeLegendEpic1532;
                polarVoyageRewardedAdUltraTitanium4787.removeCallbacks(this);
                MotionEvent motionEvent = polarVoyageRewardedAdUltraTitanium4787.PolarVoyageLocationListenerInfernoQuantumOlympian6900;
                if (motionEvent != null) {
                    r2 = motionEvent.getToolType(0) == 3 ? 1 : 0;
                    int actionMasked = motionEvent.getActionMasked();
                    if (r2 != 0) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i = 2;
                    }
                    polarVoyageRewardedAdUltraTitanium4787.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(motionEvent, i, polarVoyageRewardedAdUltraTitanium4787.PolarVoyageAnalyticsSpeedEpic1910, false);
                    return;
                }
                return;
            case 3:
                ((PolarVoyageAnimatorCelestialBeta6967) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageBottomSheetOmegaNeo1907();
                throw null;
            case 4:
                PolarVoyageAssetManagerMasterQuantumHyper3660 polarVoyageAssetManagerMasterQuantumHyper3660 = (PolarVoyageAssetManagerMasterQuantumHyper3660) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageGradleUltraOlympian8635[] polarVoyageGradleUltraOlympian8635Arr = polarVoyageAssetManagerMasterQuantumHyper3660.PolarVoyageActivityInfoBetaQuantum8726;
                int length = polarVoyageGradleUltraOlympian8635Arr.length;
                while (r2 < length) {
                    PolarVoyageGradleUltraOlympian8635 polarVoyageGradleUltraOlympian8635 = polarVoyageGradleUltraOlympian8635Arr[r2];
                    polarVoyageGradleUltraOlympian8635.PolarVoyageRemoteModelManagerOlympianCelestial9141(true);
                    PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark4027 = polarVoyageGradleUltraOlympian8635.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    if (polarVoyageAdapterTitanSpark4027 != null) {
                        polarVoyageAdapterTitanSpark4027.PolarVoyageFCMCelestialCosmosPixel3711(polarVoyageGradleUltraOlympian8635.PolarVoyageBitmapVisionAuroraPixel4705);
                        polarVoyageGradleUltraOlympian8635.PolarVoyageItemDecorationUltraDeltaEpic7485 = null;
                        polarVoyageGradleUltraOlympian8635.PolarVoyageTextInputEditTextNebulaHero6651 = null;
                    }
                    r2++;
                }
                PolarVoyageAlarmManagerAlphaInferno3493 polarVoyageAlarmManagerAlphaInferno3493 = polarVoyageAssetManagerMasterQuantumHyper3660.PolarVoyageBitmapMaxTitanTitan7960;
                PolarVoyageEditTextNovaXUltraPrime4283 polarVoyageEditTextNovaXUltraPrime4283 = (PolarVoyageEditTextNovaXUltraPrime4283) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                if (polarVoyageEditTextNovaXUltraPrime4283 != null) {
                    polarVoyageEditTextNovaXUltraPrime4283.PolarVoyageZipVortexCelestial6185();
                    polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageRotateAnimationCyberCelestialDelta4768 = null;
                }
                polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageBottomSheetOmegaNeo1907 = null;
                return;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                ((SdkClickHandler) this.PolarVoyageStrictModeLegendEpic1532).sendNextSdkClickI();
                return;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                PolarVoyageColorDrawableNovaXPhoenix5992 polarVoyageColorDrawableNovaXPhoenix5992 = (PolarVoyageColorDrawableNovaXPhoenix5992) this.PolarVoyageStrictModeLegendEpic1532;
                synchronized (polarVoyageColorDrawableNovaXPhoenix5992) {
                    polarVoyageColorDrawableNovaXPhoenix5992.PolarVoyageTextInputEditTextNebulaHero6651++;
                    PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageColorDrawableNovaXPhoenix5992.PolarVoyageMotionLayoutTransitionHeroVision4068();
                }
                if (PolarVoyageMotionLayoutTransitionHeroVision4068 == null) {
                    return;
                }
                Thread currentThread = Thread.currentThread();
                String name = currentThread.getName();
                do {
                    PolarVoyageContentProviderNovaXPixel3239 polarVoyageContentProviderNovaXPixel3239 = PolarVoyageMotionLayoutTransitionHeroVision4068;
                    try {
                        currentThread.setName(polarVoyageContentProviderNovaXPixel3239.PolarVoyageZipVortexCelestial6185);
                        Logger logger = ((PolarVoyageColorDrawableNovaXPhoenix5992) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageMotionLayoutTransitionHeroVision4068;
                        PolarVoyageDrawerLayoutTurboStrikeTitanium4854 polarVoyageDrawerLayoutTurboStrikeTitanium4854 = polarVoyageContentProviderNovaXPixel3239.PolarVoyageKotlinBetaPulseBeta3653;
                        polarVoyageDrawerLayoutTurboStrikeTitanium4854.getClass();
                        boolean isLoggable = logger.isLoggable(Level.FINE);
                        if (isLoggable) {
                            j = System.nanoTime();
                            PolarVoyageVelocityTrackerShadowHyperionShadow8259.PolarVoyageKotlinBetaPulseBeta3653(logger, polarVoyageContentProviderNovaXPixel3239, polarVoyageDrawerLayoutTurboStrikeTitanium4854, "starting");
                        } else {
                            j = -1;
                        }
                        try {
                            long PolarVoyageZipVortexCelestial6185 = polarVoyageContentProviderNovaXPixel3239.PolarVoyageZipVortexCelestial6185();
                            if (isLoggable) {
                                PolarVoyageVelocityTrackerShadowHyperionShadow8259.PolarVoyageKotlinBetaPulseBeta3653(logger, polarVoyageContentProviderNovaXPixel3239, polarVoyageDrawerLayoutTurboStrikeTitanium4854, "finished run in " + PolarVoyageVelocityTrackerShadowHyperionShadow8259.PolarVoyageStrictModeLegendEpic1532(System.nanoTime() - j));
                            }
                            PolarVoyageColorDrawableNovaXPhoenix5992 polarVoyageColorDrawableNovaXPhoenix59922 = (PolarVoyageColorDrawableNovaXPhoenix5992) this.PolarVoyageStrictModeLegendEpic1532;
                            synchronized (polarVoyageColorDrawableNovaXPhoenix59922) {
                                PolarVoyageColorDrawableNovaXPhoenix5992.PolarVoyageZipVortexCelestial6185(polarVoyageColorDrawableNovaXPhoenix59922, polarVoyageContentProviderNovaXPixel3239, PolarVoyageZipVortexCelestial6185, true);
                                PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageColorDrawableNovaXPhoenix59922.PolarVoyageMotionLayoutTransitionHeroVision4068();
                            }
                        } catch (Throwable th) {
                            if (isLoggable) {
                                PolarVoyageVelocityTrackerShadowHyperionShadow8259.PolarVoyageKotlinBetaPulseBeta3653(logger, polarVoyageContentProviderNovaXPixel3239, polarVoyageDrawerLayoutTurboStrikeTitanium4854, "failed a run in " + PolarVoyageVelocityTrackerShadowHyperionShadow8259.PolarVoyageStrictModeLegendEpic1532(System.nanoTime() - j));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            PolarVoyageColorDrawableNovaXPhoenix5992 polarVoyageColorDrawableNovaXPhoenix59923 = (PolarVoyageColorDrawableNovaXPhoenix5992) this.PolarVoyageStrictModeLegendEpic1532;
                            synchronized (polarVoyageColorDrawableNovaXPhoenix59923) {
                                PolarVoyageColorDrawableNovaXPhoenix5992.PolarVoyageZipVortexCelestial6185(polarVoyageColorDrawableNovaXPhoenix59923, polarVoyageContentProviderNovaXPixel3239, -1L, false);
                                if (!(th2 instanceof InterruptedException)) {
                                    throw th2;
                                }
                                Thread.currentThread().interrupt();
                            }
                        } catch (Throwable th3) {
                            currentThread.setName(name);
                            throw th3;
                        }
                    }
                } while (PolarVoyageMotionLayoutTransitionHeroVision4068 != null);
                currentThread.setName(name);
                return;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                TimerCycle timerCycle = (TimerCycle) this.PolarVoyageStrictModeLegendEpic1532;
                iLogger = timerCycle.logger;
                str = timerCycle.name;
                iLogger.verbose("%s fired", str);
                runnable = timerCycle.command;
                runnable.run();
                return;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                TimerOnce timerOnce = (TimerOnce) this.PolarVoyageStrictModeLegendEpic1532;
                iLogger2 = timerOnce.logger;
                str2 = timerOnce.name;
                iLogger2.verbose("%s fired", str2);
                runnable2 = timerOnce.command;
                runnable2.run();
                timerOnce.waitingTask = null;
                return;
            case 9:
                ((PolarVoyageCameraViewVortexRogueNeo4402) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageItemDecorationUltraDeltaEpic7485();
                return;
            case 10:
                PolarVoyageBannerAdBlazeHyperion2492 polarVoyageBannerAdBlazeHyperion2492 = ((PolarVoyageCameraViewVortexRogueNeo4402) ((PolarVoyageRecyclerViewUltraBlazeThunder8612) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageStrictModeLegendEpic1532).PolarVoyageMotionLayoutTransitionHeroVision4068;
                polarVoyageBannerAdBlazeHyperion2492.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageBannerAdBlazeHyperion2492.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 11:
                ((PolarVoyageAudioManagerGammaAuroraStorm3060) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageZipVortexCelestial6185(new ConnectionResult(4));
                return;
            case 12:
                throw null;
            case 13:
                PolarVoyageZipVortexCelestial6185();
                return;
            case 14:
                if (((PolarVoyageRotateDrawableTurboHyperDelta7408) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageMotionLayoutTransitionHeroVision4068(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            default:
                synchronized (((PolarVoyageOnItemClickListenerFusionCelestial9091) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                    ((PolarVoyageTimerUltraHeroForce1819) ((PolarVoyageOnItemClickListenerFusionCelestial9091) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageZipVortexCelestial6185();
                }
                return;
        }
    }

    public /* synthetic */ PolarVoyageDialogSolarMaster1422(int i, Object obj) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
    }
}
