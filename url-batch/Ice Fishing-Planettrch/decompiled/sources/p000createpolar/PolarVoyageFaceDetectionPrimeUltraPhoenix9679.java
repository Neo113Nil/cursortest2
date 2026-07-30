package p000createpolar;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustPurchaseVerificationResult;
import com.adjust.sdk.AttributionHandler;
import com.adjust.sdk.AttributionResponseData;
import com.adjust.sdk.EventResponseData;
import com.adjust.sdk.IActivityHandler;
import com.adjust.sdk.LicenseData;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.OnDeeplinkResolvedListener;
import com.adjust.sdk.PackageHandler;
import com.adjust.sdk.PurchaseVerificationHandler;
import com.adjust.sdk.PurchaseVerificationResponseData;
import com.adjust.sdk.ResponseData;
import com.adjust.sdk.SdkClickResponseData;
import com.adjust.sdk.SessionResponseData;
import com.adjust.sdk.TrackingState;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFaceDetectionPrimeUltraPhoenix9679 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final Object PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageFaceDetectionPrimeUltraPhoenix9679(int i, Object obj, Object obj2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.PolarVoyageRotateAnimationCyberCelestialDelta4768).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.PolarVoyageRotateAnimationCyberCelestialDelta4768 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        p000createpolar.PolarVoyageThreadInfernoVisionHero2526.PolarVoyageCameraPixelBlaze2629.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.PolarVoyageRotateAnimationCyberCelestialDelta4768), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void PolarVoyageZipVortexCelestial6185() {
        boolean z = false;
        boolean z2 = false;
        while (true) {
            try {
                synchronized (((PolarVoyageThreadInfernoVisionHero2526) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageStrictModeLegendEpic1532) {
                    if (!z) {
                        PolarVoyageThreadInfernoVisionHero2526 polarVoyageThreadInfernoVisionHero2526 = (PolarVoyageThreadInfernoVisionHero2526) this.PolarVoyageStrictModeLegendEpic1532;
                        if (polarVoyageThreadInfernoVisionHero2526.PolarVoyageRotateAnimationCyberCelestialDelta4768 != 4) {
                            polarVoyageThreadInfernoVisionHero2526.PolarVoyageBottomSheetOmegaNeo1907++;
                            polarVoyageThreadInfernoVisionHero2526.PolarVoyageRotateAnimationCyberCelestialDelta4768 = 4;
                            z = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((PolarVoyageThreadInfernoVisionHero2526) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageStrictModeLegendEpic1532.poll();
                    this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = runnable;
                    if (runnable == null) {
                        ((PolarVoyageThreadInfernoVisionHero2526) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageRotateAnimationCyberCelestialDelta4768 = 1;
                    }
                }
                if (!z2) {
                    return;
                }
            } finally {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        List list;
        boolean z;
        List list2;
        List list3;
        Runnable runnable;
        List list4;
        PolarVoyageBottomSheetSpectraOlympianOlympian2905 polarVoyageBottomSheetSpectraOlympianOlympian2905;
        int i = 0;
        PolarVoyageBottomSheetSpectraOlympianOlympian2905 polarVoyageBottomSheetSpectraOlympianOlympian29052 = null;
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((ActivityHandler) this.PolarVoyageStrictModeLegendEpic1532).launchSessionResponseTasksI((SessionResponseData) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 1:
                ((ActivityHandler) this.PolarVoyageStrictModeLegendEpic1532).launchAttributionResponseTasksI((AttributionResponseData) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 2:
                ((ActivityHandler) this.PolarVoyageStrictModeLegendEpic1532).launchPurchaseVerificationResponseTasksI((PurchaseVerificationResponseData) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 3:
                ((OnDeeplinkResolvedListener) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).onDeeplinkResolved(((SdkClickResponseData) this.PolarVoyageStrictModeLegendEpic1532).resolvedDeeplink);
                return;
            case 4:
                ((PurchaseVerificationResponseData) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).activityPackage.getPurchaseVerificationCallback().onVerificationFinished((AdjustPurchaseVerificationResult) this.PolarVoyageStrictModeLegendEpic1532);
                return;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                ((OnDeeplinkResolvedListener) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).onDeeplinkResolved((String) this.PolarVoyageStrictModeLegendEpic1532);
                return;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                ((ActivityHandler) this.PolarVoyageStrictModeLegendEpic1532).sendLicenseVerificationDataI((LicenseData) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                ((ActivityHandler) this.PolarVoyageStrictModeLegendEpic1532).launchEventResponseTasksI((EventResponseData) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                ((ActivityHandler) this.PolarVoyageStrictModeLegendEpic1532).launchSdkClickResponseTasksI((SdkClickResponseData) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 9:
                ((OnAdidReadListener) ((PolarVoyageFCMThunderTitanium2442) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageViewRogueMaster4778).onAdidRead((String) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 10:
                ((OnAttributionReadListener) ((PolarVoyageFCMThunderTitanium2442) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageViewRogueMaster4778).onAttributionRead((AdjustAttribution) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 11:
                ((AsyncTaskExecutor) ((PolarVoyageWindowManagerInfernoPulseQuantum9931) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageBottomSheetOmegaNeo1907).onPostExecute(this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 12:
                AttributionHandler attributionHandler = (AttributionHandler) this.PolarVoyageStrictModeLegendEpic1532;
                weakReference = attributionHandler.activityHandlerWeakRef;
                IActivityHandler iActivityHandler = (IActivityHandler) weakReference.get();
                if (iActivityHandler == null) {
                    return;
                }
                attributionHandler.checkSessionResponseI(iActivityHandler, (SessionResponseData) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 13:
                AttributionHandler attributionHandler2 = (AttributionHandler) this.PolarVoyageStrictModeLegendEpic1532;
                weakReference2 = attributionHandler2.activityHandlerWeakRef;
                IActivityHandler iActivityHandler2 = (IActivityHandler) weakReference2.get();
                if (iActivityHandler2 == null) {
                    return;
                }
                attributionHandler2.checkSdkClickResponseI(iActivityHandler2, (SdkClickResponseData) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 14:
                AttributionHandler attributionHandler3 = (AttributionHandler) this.PolarVoyageStrictModeLegendEpic1532;
                weakReference3 = attributionHandler3.activityHandlerWeakRef;
                IActivityHandler iActivityHandler3 = (IActivityHandler) weakReference3.get();
                if (iActivityHandler3 == null) {
                    return;
                }
                attributionHandler3.checkAttributionResponseI(iActivityHandler3, (AttributionResponseData) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 15:
                AttributionHandler attributionHandler4 = (AttributionHandler) this.PolarVoyageStrictModeLegendEpic1532;
                weakReference4 = attributionHandler4.activityHandlerWeakRef;
                IActivityHandler iActivityHandler4 = (IActivityHandler) weakReference4.get();
                if (iActivityHandler4 == null) {
                    return;
                }
                ResponseData responseData = (ResponseData) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                if (responseData.trackingState == TrackingState.OPTED_OUT) {
                    iActivityHandler4.gotOptOutResponse();
                    return;
                } else {
                    if (responseData instanceof AttributionResponseData) {
                        attributionHandler4.checkAttributionResponseI(iActivityHandler4, (AttributionResponseData) responseData);
                        return;
                    }
                    return;
                }
            case 16:
                return;
            case 17:
                break;
            case 18:
                ((PackageHandler) this.PolarVoyageStrictModeLegendEpic1532).addI((ActivityPackage) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 19:
                ((PackageHandler) this.PolarVoyageStrictModeLegendEpic1532).sendNextI(((ResponseData) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).continueIn);
                return;
            case 20:
                ((PurchaseVerificationHandler) this.PolarVoyageStrictModeLegendEpic1532).sendPurchaseVerificationPackageI((ActivityPackage) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 21:
                ((PolarVoyageOnPreDrawListenerCelestialTitaniumAurora4421) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).accept(this.PolarVoyageStrictModeLegendEpic1532);
                return;
            case 22:
                ((PolarVoyageDebugStrikeEclipseQuantum3290) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageFCMCelestialCosmosPixel3711((PolarVoyageItemDecorationEclipsePhoenixHyperion3749) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 23:
                try {
                    PolarVoyageZipVortexCelestial6185();
                    return;
                } catch (Error e) {
                    synchronized (((PolarVoyageThreadInfernoVisionHero2526) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageStrictModeLegendEpic1532) {
                        ((PolarVoyageThreadInfernoVisionHero2526) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageRotateAnimationCyberCelestialDelta4768 = 1;
                        throw e;
                    }
                }
            case 24:
                ((SingleThreadCachedScheduler) this.PolarVoyageStrictModeLegendEpic1532).tryExecuteRunnable((Runnable) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                while (true) {
                    list = ((SingleThreadCachedScheduler) this.PolarVoyageStrictModeLegendEpic1532).queue;
                    synchronized (list) {
                        try {
                            z = ((SingleThreadCachedScheduler) this.PolarVoyageStrictModeLegendEpic1532).isTeardown;
                            if (z) {
                                return;
                            }
                            list2 = ((SingleThreadCachedScheduler) this.PolarVoyageStrictModeLegendEpic1532).queue;
                            boolean isEmpty = list2.isEmpty();
                            SingleThreadCachedScheduler singleThreadCachedScheduler = (SingleThreadCachedScheduler) this.PolarVoyageStrictModeLegendEpic1532;
                            if (isEmpty) {
                                singleThreadCachedScheduler.isThreadProcessing = false;
                                return;
                            }
                            list3 = singleThreadCachedScheduler.queue;
                            runnable = (Runnable) list3.get(0);
                            list4 = ((SingleThreadCachedScheduler) this.PolarVoyageStrictModeLegendEpic1532).queue;
                            list4.remove(0);
                        } finally {
                        }
                    }
                    ((SingleThreadCachedScheduler) this.PolarVoyageStrictModeLegendEpic1532).tryExecuteRunnable(runnable);
                }
            case 25:
                ConnectionResult connectionResult = (ConnectionResult) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                PolarVoyageOnItemClickListenerMasterDragonMax6359 polarVoyageOnItemClickListenerMasterDragonMax6359 = (PolarVoyageOnItemClickListenerMasterDragonMax6359) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageBannerAdBlazeHyperion2492 polarVoyageBannerAdBlazeHyperion2492 = (PolarVoyageBannerAdBlazeHyperion2492) polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageCameraViewVortexRogueNeo4402 polarVoyageCameraViewVortexRogueNeo4402 = (PolarVoyageCameraViewVortexRogueNeo4402) ((PolarVoyageDataBindingMasterDragonCyber7565) polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageCameraPixelBlaze2629).PolarVoyageRemoteModelManagerOlympianCelestial9141.get((PolarVoyageToastOlympianNebulaHyperion1595) polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                if (polarVoyageCameraViewVortexRogueNeo4402 == null) {
                    return;
                }
                if (connectionResult.PolarVoyageStrictModeLegendEpic1532 != 0) {
                    polarVoyageCameraViewVortexRogueNeo4402.PolarVoyageSnackbarGammaEclipse2140(connectionResult, null);
                    return;
                }
                polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageItemDecorationUltraDeltaEpic7485 = true;
                if (polarVoyageBannerAdBlazeHyperion2492.PolarVoyageBottomSheetOmegaNeo1907()) {
                    if (!polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageItemDecorationUltraDeltaEpic7485 || (polarVoyageBottomSheetSpectraOlympianOlympian2905 = (PolarVoyageBottomSheetSpectraOlympianOlympian2905) polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageBottomSheetOmegaNeo1907) == null) {
                        return;
                    }
                    polarVoyageBannerAdBlazeHyperion2492.PolarVoyageViewRogueMaster4778(polarVoyageBottomSheetSpectraOlympianOlympian2905, (Set) polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageViewRogueMaster4778);
                    return;
                }
                try {
                    polarVoyageBannerAdBlazeHyperion2492.PolarVoyageViewRogueMaster4778(null, polarVoyageBannerAdBlazeHyperion2492.PolarVoyageMotionLayoutTransitionHeroVision4068());
                    return;
                } catch (SecurityException e2) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
                    polarVoyageBannerAdBlazeHyperion2492.PolarVoyageBarcodeScannerInfernoSolarSpark7767("Failed to get service from broker.");
                    polarVoyageCameraViewVortexRogueNeo4402.PolarVoyageSnackbarGammaEclipse2140(new ConnectionResult(10), null);
                    return;
                }
            case 26:
                PolarVoyageAudioManagerGammaAuroraStorm3060 polarVoyageAudioManagerGammaAuroraStorm3060 = (PolarVoyageAudioManagerGammaAuroraStorm3060) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageServiceOmegaAurora1402 polarVoyageServiceOmegaAurora1402 = (PolarVoyageServiceOmegaAurora1402) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                ConnectionResult connectionResult2 = polarVoyageServiceOmegaAurora1402.PolarVoyageStrictModeLegendEpic1532;
                if (connectionResult2.PolarVoyageStrictModeLegendEpic1532 == 0) {
                    PolarVoyageServiceInfoEpicHeroStrike1910 polarVoyageServiceInfoEpicHeroStrike1910 = polarVoyageServiceOmegaAurora1402.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageDisplayMetricsVortexDragon9516(polarVoyageServiceInfoEpicHeroStrike1910);
                    ConnectionResult connectionResult3 = polarVoyageServiceInfoEpicHeroStrike1910.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    if (connectionResult3.PolarVoyageStrictModeLegendEpic1532 != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult3)), new Exception());
                        polarVoyageAudioManagerGammaAuroraStorm3060.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageZipVortexCelestial6185(connectionResult3);
                        polarVoyageAudioManagerGammaAuroraStorm3060.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageDrawableDeltaHyperion5742();
                        return;
                    }
                    PolarVoyageOnItemClickListenerMasterDragonMax6359 polarVoyageOnItemClickListenerMasterDragonMax63592 = polarVoyageAudioManagerGammaAuroraStorm3060.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    IBinder iBinder = polarVoyageServiceInfoEpicHeroStrike1910.PolarVoyageStrictModeLegendEpic1532;
                    if (iBinder != null) {
                        int i2 = PolarVoyageSupervisorJobSpeedSpeedStrike3298.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("create-polar.PolarVoyageBottomSheetSpectraOlympianOlympian2905");
                        polarVoyageBottomSheetSpectraOlympianOlympian29052 = queryLocalInterface instanceof PolarVoyageBottomSheetSpectraOlympianOlympian2905 ? (PolarVoyageBottomSheetSpectraOlympianOlympian2905) queryLocalInterface : new PolarVoyagePropertyValuesHolderBetaPulseSolar7860(iBinder);
                    }
                    Set set = polarVoyageAudioManagerGammaAuroraStorm3060.PolarVoyageBitmapVisionAuroraPixel4705;
                    polarVoyageOnItemClickListenerMasterDragonMax63592.getClass();
                    if (polarVoyageBottomSheetSpectraOlympianOlympian29052 == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        polarVoyageOnItemClickListenerMasterDragonMax63592.PolarVoyageZipVortexCelestial6185(new ConnectionResult(4));
                    } else {
                        polarVoyageOnItemClickListenerMasterDragonMax63592.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageBottomSheetSpectraOlympianOlympian29052;
                        polarVoyageOnItemClickListenerMasterDragonMax63592.PolarVoyageViewRogueMaster4778 = set;
                        if (polarVoyageOnItemClickListenerMasterDragonMax63592.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                            ((PolarVoyageBannerAdBlazeHyperion2492) polarVoyageOnItemClickListenerMasterDragonMax63592.PolarVoyageStrictModeLegendEpic1532).PolarVoyageViewRogueMaster4778(polarVoyageBottomSheetSpectraOlympianOlympian29052, set);
                        }
                    }
                } else {
                    polarVoyageAudioManagerGammaAuroraStorm3060.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageZipVortexCelestial6185(connectionResult2);
                }
                polarVoyageAudioManagerGammaAuroraStorm3060.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageDrawableDeltaHyperion5742();
                return;
            case 27:
                boolean z2 = ((PolarVoyageDialogFragmentTitanCelestial7995) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                PolarVoyageScaleAnimationStormSolar1159 polarVoyageScaleAnimationStormSolar1159 = (PolarVoyageScaleAnimationStormSolar1159) this.PolarVoyageStrictModeLegendEpic1532;
                if (z2) {
                    polarVoyageScaleAnimationStormSolar1159.PolarVoyageBottomSheetOmegaNeo1907.PolarVoyageViewRogueMaster4778();
                    return;
                }
                try {
                    ((PolarVoyageScaleAnimationStormSolar1159) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageBottomSheetOmegaNeo1907.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageScaleAnimationStormSolar1159.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageTextInputEditTextNebulaHero6651((PolarVoyageDialogFragmentTitanCelestial7995) this.PolarVoyageRotateAnimationCyberCelestialDelta4768));
                    return;
                } catch (PolarVoyageFilterVisionMax1453 e3) {
                    boolean z3 = e3.getCause() instanceof Exception;
                    PolarVoyageDialogFragmentTitanCelestial7995 polarVoyageDialogFragmentTitanCelestial7995 = ((PolarVoyageScaleAnimationStormSolar1159) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageBottomSheetOmegaNeo1907;
                    if (z3) {
                        polarVoyageDialogFragmentTitanCelestial7995.PolarVoyageRotateAnimationCyberCelestialDelta4768((Exception) e3.getCause());
                        return;
                    } else {
                        polarVoyageDialogFragmentTitanCelestial7995.PolarVoyageRotateAnimationCyberCelestialDelta4768(e3);
                        return;
                    }
                } catch (Exception e4) {
                    ((PolarVoyageScaleAnimationStormSolar1159) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageBottomSheetOmegaNeo1907.PolarVoyageRotateAnimationCyberCelestialDelta4768(e4);
                    return;
                }
            case 28:
                PolarVoyageScaleAnimationStormSolar1159 polarVoyageScaleAnimationStormSolar11592 = (PolarVoyageScaleAnimationStormSolar1159) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageDialogFragmentTitanCelestial7995 polarVoyageDialogFragmentTitanCelestial79952 = polarVoyageScaleAnimationStormSolar11592.PolarVoyageBottomSheetOmegaNeo1907;
                try {
                    PolarVoyageDialogFragmentTitanCelestial7995 polarVoyageDialogFragmentTitanCelestial79953 = (PolarVoyageDialogFragmentTitanCelestial7995) polarVoyageScaleAnimationStormSolar11592.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageTextInputEditTextNebulaHero6651((PolarVoyageDialogFragmentTitanCelestial7995) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                    if (polarVoyageDialogFragmentTitanCelestial79953 == null) {
                        polarVoyageScaleAnimationStormSolar11592.PolarVoyageBarcodeScannerInfernoSolarSpark7767(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    PolarVoyageSurfaceViewMegaSparkShadow6231 polarVoyageSurfaceViewMegaSparkShadow6231 = polarVoyageDialogFragmentTitanCelestial79953.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    PolarVoyageViewPager2InfernoEpic1202 polarVoyageViewPager2InfernoEpic1202 = PolarVoyageDrawableForcePrime1969.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    polarVoyageDialogFragmentTitanCelestial79953.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageViewPager2InfernoEpic1202, polarVoyageScaleAnimationStormSolar11592);
                    polarVoyageSurfaceViewMegaSparkShadow6231.PolarVoyageBitmapVisionAuroraPixel4705(new PolarVoyageOnItemClickListenerFusionCelestial9091((Executor) polarVoyageViewPager2InfernoEpic1202, (PolarVoyageMotionLayoutMegaCosmosVision2977) polarVoyageScaleAnimationStormSolar11592));
                    polarVoyageDialogFragmentTitanCelestial79953.PolarVoyageDrawableDeltaHyperion5742();
                    polarVoyageSurfaceViewMegaSparkShadow6231.PolarVoyageBitmapVisionAuroraPixel4705(new PolarVoyageOnItemClickListenerFusionCelestial9091((Executor) polarVoyageViewPager2InfernoEpic1202, (PolarVoyageTimerUltraHeroForce1819) polarVoyageScaleAnimationStormSolar11592));
                    polarVoyageDialogFragmentTitanCelestial79953.PolarVoyageDrawableDeltaHyperion5742();
                    return;
                } catch (PolarVoyageFilterVisionMax1453 e5) {
                    if (e5.getCause() instanceof Exception) {
                        polarVoyageDialogFragmentTitanCelestial79952.PolarVoyageRotateAnimationCyberCelestialDelta4768((Exception) e5.getCause());
                        return;
                    } else {
                        polarVoyageDialogFragmentTitanCelestial79952.PolarVoyageRotateAnimationCyberCelestialDelta4768(e5);
                        return;
                    }
                } catch (Exception e6) {
                    polarVoyageDialogFragmentTitanCelestial79952.PolarVoyageRotateAnimationCyberCelestialDelta4768(e6);
                    return;
                }
            default:
                synchronized (((PolarVoyageOnItemClickListenerFusionCelestial9091) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                    ((PolarVoyageServiceSolarDeltaFusion9632) ((PolarVoyageOnItemClickListenerFusionCelestial9091) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageDiffUtilTurboStrike5735((PolarVoyageDialogFragmentTitanCelestial7995) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                }
                return;
        }
        while (true) {
            try {
                ((Runnable) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).run();
            } catch (Throwable th) {
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageGuidelineStormSolar2850(PolarVoyageDialogFragmentLegendEpic2069.PolarVoyageItemDecorationUltraDeltaEpic7485, th);
            }
            Runnable PolarVoyageToolbarEclipseInfernoHero6368 = ((PolarVoyageMaterialCardViewLegendStrikeSpark1811) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageToolbarEclipseInfernoHero6368();
            if (PolarVoyageToolbarEclipseInfernoHero6368 == null) {
                return;
            }
            try {
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageToolbarEclipseInfernoHero6368;
                i++;
                if (i >= 16) {
                    PolarVoyageMaterialCardViewLegendStrikeSpark1811 polarVoyageMaterialCardViewLegendStrikeSpark1811 = (PolarVoyageMaterialCardViewLegendStrikeSpark1811) this.PolarVoyageStrictModeLegendEpic1532;
                    if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageClipboardManagerAuroraPixel8666(polarVoyageMaterialCardViewLegendStrikeSpark1811.PolarVoyageBottomSheetOmegaNeo1907, polarVoyageMaterialCardViewLegendStrikeSpark1811)) {
                        PolarVoyageMaterialCardViewLegendStrikeSpark1811 polarVoyageMaterialCardViewLegendStrikeSpark18112 = (PolarVoyageMaterialCardViewLegendStrikeSpark1811) this.PolarVoyageStrictModeLegendEpic1532;
                        PolarVoyageR8VisionOmegaNebula9943.PolarVoyageDisplayMetricsForceEclipseVision4728(polarVoyageMaterialCardViewLegendStrikeSpark18112.PolarVoyageBottomSheetOmegaNeo1907, polarVoyageMaterialCardViewLegendStrikeSpark18112, this);
                        return;
                    }
                }
            } catch (Throwable th2) {
                PolarVoyageMaterialCardViewLegendStrikeSpark1811 polarVoyageMaterialCardViewLegendStrikeSpark18113 = (PolarVoyageMaterialCardViewLegendStrikeSpark1811) this.PolarVoyageStrictModeLegendEpic1532;
                synchronized (polarVoyageMaterialCardViewLegendStrikeSpark18113.PolarVoyageDrawableDeltaHyperion5742) {
                    PolarVoyageMaterialCardViewLegendStrikeSpark1811.PolarVoyageSnackbarGammaEclipse2140.decrementAndGet(polarVoyageMaterialCardViewLegendStrikeSpark18113);
                    throw th2;
                }
            }
        }
    }

    public String toString() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case 23:
                Runnable runnable = (Runnable) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((PolarVoyageThreadInfernoVisionHero2526) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageRotateAnimationCyberCelestialDelta4768;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ PolarVoyageFaceDetectionPrimeUltraPhoenix9679(int i, Object obj, Object obj2, boolean z) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj;
        this.PolarVoyageStrictModeLegendEpic1532 = obj2;
    }

    public PolarVoyageFaceDetectionPrimeUltraPhoenix9679(PolarVoyageThreadInfernoVisionHero2526 polarVoyageThreadInfernoVisionHero2526) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 23;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageThreadInfernoVisionHero2526;
    }
}
