package p000createpolar;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageDataBindingMasterDragonCyber7565 implements Handler.Callback {
    public static PolarVoyageDataBindingMasterDragonCyber7565 PolarVoyageCameraViewSpectraMaxSpectra2824;
    public final PolarVoyageLayoutInflaterTitaniumMaxSolar6862 PolarVoyageAnimatorSetSparkUltraMax8233;
    public final PolarVoyageLayoutTitaniumOlympian9962 PolarVoyageBitmapMaxTitanTitan7960;
    public PolarVoyageAssetManagerHeroMaxNebula3100 PolarVoyageBottomSheetOmegaNeo1907;
    public final PolarVoyageFilterBlazeCelestial3240 PolarVoyageCameraPixelBlaze2629;
    public final AtomicInteger PolarVoyageContentProviderHyperSpark3838;
    public volatile boolean PolarVoyageDisplayMetricsVortexDragon9516;
    public final PolarVoyageBundlePhantomEclipseMega7910 PolarVoyageDrawableDeltaHyperion5742;
    public long PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyageLayoutInflaterTitaniumMaxSolar6862 PolarVoyageNavigationViewHyperHyperHyperion1793;
    public final ConcurrentHashMap PolarVoyageRemoteModelManagerOlympianCelestial9141;
    public PolarVoyageMotionLayoutEpicHyper1268 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final AtomicInteger PolarVoyageSnackbarGammaEclipse2140;
    public boolean PolarVoyageStrictModeLegendEpic1532;
    public final Context PolarVoyageViewRogueMaster4778;
    public static final Status PolarVoyageLayerDrawableShadowTitaniumOmega1942 = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status PolarVoyageMotionLayoutForceEpicAurora7183 = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object PolarVoyageAlertDialogCyberHeroQuantum3938 = new Object();

    public PolarVoyageDataBindingMasterDragonCyber7565(Context context, Looper looper) {
        PolarVoyageFilterBlazeCelestial3240 polarVoyageFilterBlazeCelestial3240 = PolarVoyageFilterBlazeCelestial3240.PolarVoyageKotlinBetaPulseBeta3653;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 10000L;
        this.PolarVoyageStrictModeLegendEpic1532 = false;
        this.PolarVoyageSnackbarGammaEclipse2140 = new AtomicInteger(1);
        this.PolarVoyageContentProviderHyperSpark3838 = new AtomicInteger(0);
        this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = new ConcurrentHashMap(5, 0.75f, 1);
        this.PolarVoyageNavigationViewHyperHyperHyperion1793 = new PolarVoyageLayoutInflaterTitaniumMaxSolar6862(0);
        this.PolarVoyageAnimatorSetSparkUltraMax8233 = new PolarVoyageLayoutInflaterTitaniumMaxSolar6862(0);
        this.PolarVoyageDisplayMetricsVortexDragon9516 = true;
        this.PolarVoyageViewRogueMaster4778 = context;
        PolarVoyageLayoutTitaniumOlympian9962 polarVoyageLayoutTitaniumOlympian9962 = new PolarVoyageLayoutTitaniumOlympian9962(looper, this);
        this.PolarVoyageBitmapMaxTitanTitan7960 = polarVoyageLayoutTitaniumOlympian9962;
        this.PolarVoyageCameraPixelBlaze2629 = polarVoyageFilterBlazeCelestial3240;
        this.PolarVoyageDrawableDeltaHyperion5742 = new PolarVoyageBundlePhantomEclipseMega7910(9);
        PackageManager packageManager = context.getPackageManager();
        if (PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageBitmapMaxTitanTitan7960 == null) {
            PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageBitmapMaxTitanTitan7960 = Boolean.valueOf(PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageBitmapMaxTitanTitan7960.booleanValue()) {
            this.PolarVoyageDisplayMetricsVortexDragon9516 = false;
        }
        polarVoyageLayoutTitaniumOlympian9962.sendMessage(polarVoyageLayoutTitaniumOlympian9962.obtainMessage(6));
    }

    public static PolarVoyageDataBindingMasterDragonCyber7565 PolarVoyageBarcodeScannerInfernoSolarSpark7767(Context context) {
        PolarVoyageDataBindingMasterDragonCyber7565 polarVoyageDataBindingMasterDragonCyber7565;
        HandlerThread handlerThread;
        synchronized (PolarVoyageAlertDialogCyberHeroQuantum3938) {
            if (PolarVoyageCameraViewSpectraMaxSpectra2824 == null) {
                synchronized (PolarVoyageFragmentCelestialDragonNovaX2958.PolarVoyageTextInputEditTextNebulaHero6651) {
                    try {
                        handlerThread = PolarVoyageFragmentCelestialDragonNovaX2958.PolarVoyageStrictModeLegendEpic1532;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            PolarVoyageFragmentCelestialDragonNovaX2958.PolarVoyageStrictModeLegendEpic1532 = handlerThread2;
                            handlerThread2.start();
                            handlerThread = PolarVoyageFragmentCelestialDragonNovaX2958.PolarVoyageStrictModeLegendEpic1532;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = PolarVoyageFilterBlazeCelestial3240.PolarVoyageMotionLayoutTransitionHeroVision4068;
                PolarVoyageCameraViewSpectraMaxSpectra2824 = new PolarVoyageDataBindingMasterDragonCyber7565(applicationContext, looper);
            }
            polarVoyageDataBindingMasterDragonCyber7565 = PolarVoyageCameraViewSpectraMaxSpectra2824;
        }
        return polarVoyageDataBindingMasterDragonCyber7565;
    }

    public static Status PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageToastOlympianNebulaHyperion1595 polarVoyageToastOlympianNebulaHyperion1595, ConnectionResult connectionResult) {
        return new Status(17, "API: " + ((String) polarVoyageToastOlympianNebulaHyperion1595.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageRotateAnimationCyberCelestialDelta4768) + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult), connectionResult.PolarVoyageRotateAnimationCyberCelestialDelta4768, connectionResult);
    }

    public final void PolarVoyageBitmapVisionAuroraPixel4705(ConnectionResult connectionResult, int i) {
        if (PolarVoyageZipVortexCelestial6185(connectionResult, i)) {
            return;
        }
        PolarVoyageLayoutTitaniumOlympian9962 polarVoyageLayoutTitaniumOlympian9962 = this.PolarVoyageBitmapMaxTitanTitan7960;
        polarVoyageLayoutTitaniumOlympian9962.sendMessage(polarVoyageLayoutTitaniumOlympian9962.obtainMessage(5, i, 0, connectionResult));
    }

    public final PolarVoyageCameraViewVortexRogueNeo4402 PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageAssetManagerHeroMaxNebula3100 polarVoyageAssetManagerHeroMaxNebula3100) {
        PolarVoyageToastOlympianNebulaHyperion1595 polarVoyageToastOlympianNebulaHyperion1595 = polarVoyageAssetManagerHeroMaxNebula3100.PolarVoyageBitmapVisionAuroraPixel4705;
        ConcurrentHashMap concurrentHashMap = this.PolarVoyageRemoteModelManagerOlympianCelestial9141;
        PolarVoyageCameraViewVortexRogueNeo4402 polarVoyageCameraViewVortexRogueNeo4402 = (PolarVoyageCameraViewVortexRogueNeo4402) concurrentHashMap.get(polarVoyageToastOlympianNebulaHyperion1595);
        if (polarVoyageCameraViewVortexRogueNeo4402 == null) {
            polarVoyageCameraViewVortexRogueNeo4402 = new PolarVoyageCameraViewVortexRogueNeo4402(this, polarVoyageAssetManagerHeroMaxNebula3100);
            concurrentHashMap.put(polarVoyageToastOlympianNebulaHyperion1595, polarVoyageCameraViewVortexRogueNeo4402);
        }
        if (polarVoyageCameraViewVortexRogueNeo4402.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBottomSheetOmegaNeo1907()) {
            this.PolarVoyageAnimatorSetSparkUltraMax8233.add(polarVoyageToastOlympianNebulaHyperion1595);
        }
        polarVoyageCameraViewVortexRogueNeo4402.PolarVoyageCameraPixelBlaze2629();
        return polarVoyageCameraViewVortexRogueNeo4402;
    }

    public final boolean PolarVoyageZipVortexCelestial6185(ConnectionResult connectionResult, int i) {
        boolean booleanValue;
        boolean isInstantApp;
        PendingIntent activity;
        Boolean bool;
        PolarVoyageFilterBlazeCelestial3240 polarVoyageFilterBlazeCelestial3240 = this.PolarVoyageCameraPixelBlaze2629;
        Context context = this.PolarVoyageViewRogueMaster4778;
        polarVoyageFilterBlazeCelestial3240.getClass();
        synchronized (PolarVoyageNavigationViewBlazeOmegaVision9396.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageZipVortexCelestial6185;
            if (context2 != null && (bool = PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageMotionLayoutTransitionHeroVision4068) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageMotionLayoutTransitionHeroVision4068 = null;
            if (PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageMotionLayoutTransitionHeroVision4068 = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageMotionLayoutTransitionHeroVision4068 = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageMotionLayoutTransitionHeroVision4068 = Boolean.FALSE;
                }
            }
            PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageZipVortexCelestial6185 = applicationContext;
            booleanValue = PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageMotionLayoutTransitionHeroVision4068.booleanValue();
        }
        if (booleanValue) {
            return false;
        }
        int i2 = connectionResult.PolarVoyageStrictModeLegendEpic1532;
        if ((i2 == 0 || connectionResult.PolarVoyageRotateAnimationCyberCelestialDelta4768 == null) ? false : true) {
            activity = connectionResult.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        } else {
            Intent PolarVoyageZipVortexCelestial6185 = polarVoyageFilterBlazeCelestial3240.PolarVoyageZipVortexCelestial6185(i2, context, null);
            activity = PolarVoyageZipVortexCelestial6185 != null ? PendingIntent.getActivity(context, 0, PolarVoyageZipVortexCelestial6185, 201326592) : null;
        }
        if (activity == null) {
            return false;
        }
        int i3 = connectionResult.PolarVoyageStrictModeLegendEpic1532;
        int i4 = GoogleApiActivity.PolarVoyageStrictModeLegendEpic1532;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        polarVoyageFilterBlazeCelestial3240.PolarVoyageDiffUtilTurboStrike5735(context, i3, PendingIntent.getActivity(context, 0, intent, PolarVoyagePackageManagerRogueNeoVortex2508.PolarVoyageZipVortexCelestial6185 | 134217728));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        if (r2 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x011a, code lost:
    
        if (r0 != 0) goto L84;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        PolarVoyageCameraViewVortexRogueNeo4402 polarVoyageCameraViewVortexRogueNeo4402;
        PolarVoyageLevelListDrawablePhoenixEclipse4200[] PolarVoyageMotionLayoutTransitionHeroVision4068;
        PolarVoyagePagingSourceEpicSolarStorm3628 polarVoyagePagingSourceEpicSolarStorm3628;
        PolarVoyagePagingSourceEpicSolarStorm3628 polarVoyagePagingSourceEpicSolarStorm36282;
        Context context = this.PolarVoyageViewRogueMaster4778;
        PolarVoyageLayoutInflaterTitaniumMaxSolar6862 polarVoyageLayoutInflaterTitaniumMaxSolar6862 = this.PolarVoyageAnimatorSetSparkUltraMax8233;
        PolarVoyageLayoutTitaniumOlympian9962 polarVoyageLayoutTitaniumOlympian9962 = this.PolarVoyageBitmapMaxTitanTitan7960;
        ConcurrentHashMap concurrentHashMap = this.PolarVoyageRemoteModelManagerOlympianCelestial9141;
        int i = message.what;
        int i2 = 0;
        switch (i) {
            case 1:
                this.PolarVoyageItemDecorationUltraDeltaEpic7485 = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                polarVoyageLayoutTitaniumOlympian9962.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    polarVoyageLayoutTitaniumOlympian9962.sendMessageDelayed(polarVoyageLayoutTitaniumOlympian9962.obtainMessage(12, (PolarVoyageToastOlympianNebulaHyperion1595) it.next()), this.PolarVoyageItemDecorationUltraDeltaEpic7485);
                }
                return true;
            case 2:
                throw PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageDiffUtilTurboStrike5735(message.obj);
            case 3:
                for (PolarVoyageCameraViewVortexRogueNeo4402 polarVoyageCameraViewVortexRogueNeo44022 : concurrentHashMap.values()) {
                    PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageContentProviderHyperSpark3838(polarVoyageCameraViewVortexRogueNeo44022.PolarVoyageViewRogueMaster4778.PolarVoyageBitmapMaxTitanTitan7960);
                    polarVoyageCameraViewVortexRogueNeo44022.PolarVoyageBottomSheetOmegaNeo1907 = null;
                    polarVoyageCameraViewVortexRogueNeo44022.PolarVoyageCameraPixelBlaze2629();
                }
                return true;
            case 4:
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
            case 13:
                PolarVoyageClipboardManagerThunderNovaSpectra2025 polarVoyageClipboardManagerThunderNovaSpectra2025 = (PolarVoyageClipboardManagerThunderNovaSpectra2025) message.obj;
                PolarVoyageAssetManagerHeroMaxNebula3100 polarVoyageAssetManagerHeroMaxNebula3100 = polarVoyageClipboardManagerThunderNovaSpectra2025.PolarVoyageKotlinBetaPulseBeta3653;
                PolarVoyageToastTurboGammaSolar3022 polarVoyageToastTurboGammaSolar3022 = polarVoyageClipboardManagerThunderNovaSpectra2025.PolarVoyageZipVortexCelestial6185;
                PolarVoyageCameraViewVortexRogueNeo4402 polarVoyageCameraViewVortexRogueNeo44023 = (PolarVoyageCameraViewVortexRogueNeo4402) concurrentHashMap.get(polarVoyageAssetManagerHeroMaxNebula3100.PolarVoyageBitmapVisionAuroraPixel4705);
                if (polarVoyageCameraViewVortexRogueNeo44023 == null) {
                    polarVoyageCameraViewVortexRogueNeo44023 = PolarVoyageKotlinBetaPulseBeta3653(polarVoyageClipboardManagerThunderNovaSpectra2025.PolarVoyageKotlinBetaPulseBeta3653);
                }
                if (!polarVoyageCameraViewVortexRogueNeo44023.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBottomSheetOmegaNeo1907() || this.PolarVoyageContentProviderHyperSpark3838.get() == polarVoyageClipboardManagerThunderNovaSpectra2025.PolarVoyageMotionLayoutTransitionHeroVision4068) {
                    polarVoyageCameraViewVortexRogueNeo44023.PolarVoyageDrawableDeltaHyperion5742(polarVoyageToastTurboGammaSolar3022);
                    return true;
                }
                polarVoyageToastTurboGammaSolar3022.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageLayerDrawableShadowTitaniumOmega1942);
                polarVoyageCameraViewVortexRogueNeo44023.PolarVoyageContentProviderHyperSpark3838();
                return true;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                int i3 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        polarVoyageCameraViewVortexRogueNeo4402 = (PolarVoyageCameraViewVortexRogueNeo4402) it2.next();
                        if (polarVoyageCameraViewVortexRogueNeo4402.PolarVoyageTextInputEditTextNebulaHero6651 == i3) {
                        }
                    } else {
                        polarVoyageCameraViewVortexRogueNeo4402 = null;
                    }
                }
                if (polarVoyageCameraViewVortexRogueNeo4402 == null) {
                    Log.wtf("GoogleApiManager", PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageContentProviderHyperSpark3838("Could not find API instance ", i3, " while trying to fail enqueued calls.").toString(), new Exception());
                    return true;
                }
                int i4 = connectionResult.PolarVoyageStrictModeLegendEpic1532;
                if (i4 != 13) {
                    polarVoyageCameraViewVortexRogueNeo4402.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageCameraViewVortexRogueNeo4402.PolarVoyageKotlinBetaPulseBeta3653, connectionResult));
                    return true;
                }
                this.PolarVoyageCameraPixelBlaze2629.getClass();
                AtomicBoolean atomicBoolean = PolarVoyageVideoCaptureCelestialLegend8331.PolarVoyageZipVortexCelestial6185;
                polarVoyageCameraViewVortexRogueNeo4402.PolarVoyageBitmapVisionAuroraPixel4705(new Status(17, "Error resolution was canceled by the user, original error message: " + ConnectionResult.PolarVoyageZipVortexCelestial6185(i4) + ": " + connectionResult.PolarVoyageBottomSheetOmegaNeo1907, null, null));
                return true;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                if (context.getApplicationContext() instanceof Application) {
                    PolarVoyageFilterCyberPhoenix6823.PolarVoyageZipVortexCelestial6185((Application) context.getApplicationContext());
                    PolarVoyageFilterCyberPhoenix6823 polarVoyageFilterCyberPhoenix6823 = PolarVoyageFilterCyberPhoenix6823.PolarVoyageViewRogueMaster4778;
                    PolarVoyageHandlerThreadGammaEclipseShadow6264 polarVoyageHandlerThreadGammaEclipseShadow6264 = new PolarVoyageHandlerThreadGammaEclipseShadow6264(this);
                    polarVoyageFilterCyberPhoenix6823.getClass();
                    synchronized (polarVoyageFilterCyberPhoenix6823) {
                        polarVoyageFilterCyberPhoenix6823.PolarVoyageRotateAnimationCyberCelestialDelta4768.add(polarVoyageHandlerThreadGammaEclipseShadow6264);
                    }
                    AtomicBoolean atomicBoolean2 = polarVoyageFilterCyberPhoenix6823.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    AtomicBoolean atomicBoolean3 = polarVoyageFilterCyberPhoenix6823.PolarVoyageStrictModeLegendEpic1532;
                    if (!atomicBoolean3.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean3.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                    }
                    if (!atomicBoolean2.get()) {
                        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 300000L;
                        return true;
                    }
                }
                return true;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                PolarVoyageKotlinBetaPulseBeta3653((PolarVoyageAssetManagerHeroMaxNebula3100) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    PolarVoyageCameraViewVortexRogueNeo4402 polarVoyageCameraViewVortexRogueNeo44024 = (PolarVoyageCameraViewVortexRogueNeo4402) concurrentHashMap.get(message.obj);
                    PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageContentProviderHyperSpark3838(polarVoyageCameraViewVortexRogueNeo44024.PolarVoyageViewRogueMaster4778.PolarVoyageBitmapMaxTitanTitan7960);
                    if (polarVoyageCameraViewVortexRogueNeo44024.PolarVoyageStrictModeLegendEpic1532) {
                        polarVoyageCameraViewVortexRogueNeo44024.PolarVoyageCameraPixelBlaze2629();
                        return true;
                    }
                }
                return true;
            case 10:
                polarVoyageLayoutInflaterTitaniumMaxSolar6862.getClass();
                PolarVoyageInsetDrawableSpectraElitePhantom6346 polarVoyageInsetDrawableSpectraElitePhantom6346 = new PolarVoyageInsetDrawableSpectraElitePhantom6346(polarVoyageLayoutInflaterTitaniumMaxSolar6862);
                while (polarVoyageInsetDrawableSpectraElitePhantom6346.hasNext()) {
                    PolarVoyageCameraViewVortexRogueNeo4402 polarVoyageCameraViewVortexRogueNeo44025 = (PolarVoyageCameraViewVortexRogueNeo4402) concurrentHashMap.remove((PolarVoyageToastOlympianNebulaHyperion1595) polarVoyageInsetDrawableSpectraElitePhantom6346.next());
                    if (polarVoyageCameraViewVortexRogueNeo44025 != null) {
                        polarVoyageCameraViewVortexRogueNeo44025.PolarVoyageContentProviderHyperSpark3838();
                    }
                }
                polarVoyageLayoutInflaterTitaniumMaxSolar6862.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    PolarVoyageCameraViewVortexRogueNeo4402 polarVoyageCameraViewVortexRogueNeo44026 = (PolarVoyageCameraViewVortexRogueNeo4402) concurrentHashMap.get(message.obj);
                    PolarVoyageDataBindingMasterDragonCyber7565 polarVoyageDataBindingMasterDragonCyber7565 = polarVoyageCameraViewVortexRogueNeo44026.PolarVoyageViewRogueMaster4778;
                    PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageContentProviderHyperSpark3838(polarVoyageDataBindingMasterDragonCyber7565.PolarVoyageBitmapMaxTitanTitan7960);
                    boolean z = polarVoyageCameraViewVortexRogueNeo44026.PolarVoyageStrictModeLegendEpic1532;
                    if (z) {
                        PolarVoyageToastOlympianNebulaHyperion1595 polarVoyageToastOlympianNebulaHyperion1595 = polarVoyageCameraViewVortexRogueNeo44026.PolarVoyageKotlinBetaPulseBeta3653;
                        PolarVoyageLayoutTitaniumOlympian9962 polarVoyageLayoutTitaniumOlympian99622 = polarVoyageCameraViewVortexRogueNeo44026.PolarVoyageViewRogueMaster4778.PolarVoyageBitmapMaxTitanTitan7960;
                        if (z) {
                            polarVoyageLayoutTitaniumOlympian99622.removeMessages(11, polarVoyageToastOlympianNebulaHyperion1595);
                            polarVoyageLayoutTitaniumOlympian99622.removeMessages(9, polarVoyageToastOlympianNebulaHyperion1595);
                            polarVoyageCameraViewVortexRogueNeo44026.PolarVoyageStrictModeLegendEpic1532 = false;
                        }
                        polarVoyageCameraViewVortexRogueNeo44026.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageDataBindingMasterDragonCyber7565.PolarVoyageCameraPixelBlaze2629.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageDataBindingMasterDragonCyber7565.PolarVoyageViewRogueMaster4778, PolarVoyageServiceVisionUltraNova5701.PolarVoyageZipVortexCelestial6185) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        polarVoyageCameraViewVortexRogueNeo44026.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBarcodeScannerInfernoSolarSpark7767("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    PolarVoyageCameraViewVortexRogueNeo4402 polarVoyageCameraViewVortexRogueNeo44027 = (PolarVoyageCameraViewVortexRogueNeo4402) concurrentHashMap.get(message.obj);
                    PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageContentProviderHyperSpark3838(polarVoyageCameraViewVortexRogueNeo44027.PolarVoyageViewRogueMaster4778.PolarVoyageBitmapMaxTitanTitan7960);
                    PolarVoyageBannerAdBlazeHyperion2492 polarVoyageBannerAdBlazeHyperion2492 = polarVoyageCameraViewVortexRogueNeo44027.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    if (polarVoyageBannerAdBlazeHyperion2492.PolarVoyageZipVortexCelestial6185() && polarVoyageCameraViewVortexRogueNeo44027.PolarVoyageDiffUtilTurboStrike5735.size() == 0) {
                        PolarVoyageBundlePhantomEclipseMega7910 polarVoyageBundlePhantomEclipseMega7910 = polarVoyageCameraViewVortexRogueNeo44027.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                        if (((Map) polarVoyageBundlePhantomEclipseMega7910.PolarVoyageStrictModeLegendEpic1532).isEmpty() && ((Map) polarVoyageBundlePhantomEclipseMega7910.PolarVoyageRotateAnimationCyberCelestialDelta4768).isEmpty()) {
                            polarVoyageBannerAdBlazeHyperion2492.PolarVoyageBarcodeScannerInfernoSolarSpark7767("Timing out service connection.");
                            return true;
                        }
                        polarVoyageCameraViewVortexRogueNeo44027.PolarVoyageRotateAnimationCyberCelestialDelta4768();
                        return true;
                    }
                }
                return true;
            case 14:
                throw PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageDiffUtilTurboStrike5735(message.obj);
            case 15:
                PolarVoyageGestureDetectorMegaTitanPixel2714 polarVoyageGestureDetectorMegaTitanPixel2714 = (PolarVoyageGestureDetectorMegaTitanPixel2714) message.obj;
                if (concurrentHashMap.containsKey(polarVoyageGestureDetectorMegaTitanPixel2714.PolarVoyageZipVortexCelestial6185)) {
                    PolarVoyageCameraViewVortexRogueNeo4402 polarVoyageCameraViewVortexRogueNeo44028 = (PolarVoyageCameraViewVortexRogueNeo4402) concurrentHashMap.get(polarVoyageGestureDetectorMegaTitanPixel2714.PolarVoyageZipVortexCelestial6185);
                    if (polarVoyageCameraViewVortexRogueNeo44028.PolarVoyageRotateAnimationCyberCelestialDelta4768.contains(polarVoyageGestureDetectorMegaTitanPixel2714) && !polarVoyageCameraViewVortexRogueNeo44028.PolarVoyageStrictModeLegendEpic1532) {
                        if (polarVoyageCameraViewVortexRogueNeo44028.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185()) {
                            polarVoyageCameraViewVortexRogueNeo44028.PolarVoyageTextInputEditTextNebulaHero6651();
                            return true;
                        }
                        polarVoyageCameraViewVortexRogueNeo44028.PolarVoyageCameraPixelBlaze2629();
                        return true;
                    }
                }
                return true;
            case 16:
                PolarVoyageGestureDetectorMegaTitanPixel2714 polarVoyageGestureDetectorMegaTitanPixel27142 = (PolarVoyageGestureDetectorMegaTitanPixel2714) message.obj;
                if (concurrentHashMap.containsKey(polarVoyageGestureDetectorMegaTitanPixel27142.PolarVoyageZipVortexCelestial6185)) {
                    PolarVoyageCameraViewVortexRogueNeo4402 polarVoyageCameraViewVortexRogueNeo44029 = (PolarVoyageCameraViewVortexRogueNeo4402) concurrentHashMap.get(polarVoyageGestureDetectorMegaTitanPixel27142.PolarVoyageZipVortexCelestial6185);
                    ArrayList arrayList = polarVoyageCameraViewVortexRogueNeo44029.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    PolarVoyageDataBindingMasterDragonCyber7565 polarVoyageDataBindingMasterDragonCyber75652 = polarVoyageCameraViewVortexRogueNeo44029.PolarVoyageViewRogueMaster4778;
                    LinkedList<PolarVoyageFaceDetectionNovaXTitanForce3828> linkedList = polarVoyageCameraViewVortexRogueNeo44029.PolarVoyageZipVortexCelestial6185;
                    if (arrayList.remove(polarVoyageGestureDetectorMegaTitanPixel27142)) {
                        polarVoyageDataBindingMasterDragonCyber75652.PolarVoyageBitmapMaxTitanTitan7960.removeMessages(15, polarVoyageGestureDetectorMegaTitanPixel27142);
                        polarVoyageDataBindingMasterDragonCyber75652.PolarVoyageBitmapMaxTitanTitan7960.removeMessages(16, polarVoyageGestureDetectorMegaTitanPixel27142);
                        PolarVoyageLevelListDrawablePhoenixEclipse4200 polarVoyageLevelListDrawablePhoenixEclipse4200 = polarVoyageGestureDetectorMegaTitanPixel27142.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (PolarVoyageFaceDetectionNovaXTitanForce3828 polarVoyageFaceDetectionNovaXTitanForce3828 : linkedList) {
                            if (polarVoyageFaceDetectionNovaXTitanForce3828 != null && (PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageFaceDetectionNovaXTitanForce3828.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageCameraViewVortexRogueNeo44029)) != null) {
                                int length = PolarVoyageMotionLayoutTransitionHeroVision4068.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= length) {
                                        break;
                                    }
                                    if (!PolarVoyageTransformNeoTitanium1654.PolarVoyageDrawableDeltaHyperion5742(PolarVoyageMotionLayoutTransitionHeroVision4068[i5], polarVoyageLevelListDrawablePhoenixEclipse4200)) {
                                        i5++;
                                    } else if (i5 >= 0) {
                                        arrayList2.add(polarVoyageFaceDetectionNovaXTitanForce3828);
                                    }
                                }
                            }
                        }
                        int size = arrayList2.size();
                        while (i2 < size) {
                            PolarVoyageFaceDetectionNovaXTitanForce3828 polarVoyageFaceDetectionNovaXTitanForce38282 = (PolarVoyageFaceDetectionNovaXTitanForce3828) arrayList2.get(i2);
                            linkedList.remove(polarVoyageFaceDetectionNovaXTitanForce38282);
                            polarVoyageFaceDetectionNovaXTitanForce38282.PolarVoyageBarcodeScannerInfernoSolarSpark7767(new PolarVoyageAdMobRogueOmegaAlpha2139(polarVoyageLevelListDrawablePhoenixEclipse4200));
                            i2++;
                        }
                    }
                }
                return true;
            case 17:
                PolarVoyageMotionLayoutEpicHyper1268 polarVoyageMotionLayoutEpicHyper1268 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                if (polarVoyageMotionLayoutEpicHyper1268 != null) {
                    if (polarVoyageMotionLayoutEpicHyper1268.PolarVoyageItemDecorationUltraDeltaEpic7485 <= 0) {
                        if (!this.PolarVoyageStrictModeLegendEpic1532) {
                            synchronized (PolarVoyagePagingSourceEpicSolarStorm3628.class) {
                                try {
                                    if (PolarVoyagePagingSourceEpicSolarStorm3628.PolarVoyageStrictModeLegendEpic1532 == null) {
                                        PolarVoyagePagingSourceEpicSolarStorm3628.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyagePagingSourceEpicSolarStorm3628(i2);
                                    }
                                    polarVoyagePagingSourceEpicSolarStorm3628 = PolarVoyagePagingSourceEpicSolarStorm3628.PolarVoyageStrictModeLegendEpic1532;
                                } finally {
                                }
                            }
                            polarVoyagePagingSourceEpicSolarStorm3628.getClass();
                            int i6 = ((SparseIntArray) this.PolarVoyageDrawableDeltaHyperion5742.PolarVoyageStrictModeLegendEpic1532).get(203400000, -1);
                            if (i6 != -1) {
                            }
                        }
                        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = null;
                        return true;
                    }
                    if (this.PolarVoyageBottomSheetOmegaNeo1907 == null) {
                        this.PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageAssetManagerHeroMaxNebula3100(this.PolarVoyageViewRogueMaster4778);
                    }
                    this.PolarVoyageBottomSheetOmegaNeo1907.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageMotionLayoutEpicHyper1268);
                    this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = null;
                    return true;
                }
                return true;
            case 18:
                ((PolarVoyageOnAttachStateChangeListenerFusionTitanium9818) message.obj).getClass();
                if (0 == 0) {
                    PolarVoyageMotionLayoutEpicHyper1268 polarVoyageMotionLayoutEpicHyper12682 = new PolarVoyageMotionLayoutEpicHyper1268(0, Arrays.asList(null));
                    if (this.PolarVoyageBottomSheetOmegaNeo1907 == null) {
                        this.PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageAssetManagerHeroMaxNebula3100(this.PolarVoyageViewRogueMaster4778);
                    }
                    this.PolarVoyageBottomSheetOmegaNeo1907.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageMotionLayoutEpicHyper12682);
                    return true;
                }
                PolarVoyageMotionLayoutEpicHyper1268 polarVoyageMotionLayoutEpicHyper12683 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                if (polarVoyageMotionLayoutEpicHyper12683 != null) {
                    List list = polarVoyageMotionLayoutEpicHyper12683.PolarVoyageStrictModeLegendEpic1532;
                    if (polarVoyageMotionLayoutEpicHyper12683.PolarVoyageItemDecorationUltraDeltaEpic7485 != 0 || (list != null && list.size() >= 0)) {
                        polarVoyageLayoutTitaniumOlympian9962.removeMessages(17);
                        PolarVoyageMotionLayoutEpicHyper1268 polarVoyageMotionLayoutEpicHyper12684 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                        if (polarVoyageMotionLayoutEpicHyper12684 != null) {
                            if (polarVoyageMotionLayoutEpicHyper12684.PolarVoyageItemDecorationUltraDeltaEpic7485 <= 0) {
                                if (!this.PolarVoyageStrictModeLegendEpic1532) {
                                    synchronized (PolarVoyagePagingSourceEpicSolarStorm3628.class) {
                                        try {
                                            if (PolarVoyagePagingSourceEpicSolarStorm3628.PolarVoyageStrictModeLegendEpic1532 == null) {
                                                PolarVoyagePagingSourceEpicSolarStorm3628.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyagePagingSourceEpicSolarStorm3628(i2);
                                            }
                                            polarVoyagePagingSourceEpicSolarStorm36282 = PolarVoyagePagingSourceEpicSolarStorm3628.PolarVoyageStrictModeLegendEpic1532;
                                        } finally {
                                        }
                                    }
                                    polarVoyagePagingSourceEpicSolarStorm36282.getClass();
                                    int i7 = ((SparseIntArray) this.PolarVoyageDrawableDeltaHyperion5742.PolarVoyageStrictModeLegendEpic1532).get(203400000, -1);
                                    if (i7 != -1) {
                                    }
                                }
                                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = null;
                            }
                            if (this.PolarVoyageBottomSheetOmegaNeo1907 == null) {
                                this.PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageAssetManagerHeroMaxNebula3100(this.PolarVoyageViewRogueMaster4778);
                            }
                            this.PolarVoyageBottomSheetOmegaNeo1907.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageMotionLayoutEpicHyper12684);
                            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = null;
                        }
                    } else {
                        PolarVoyageMotionLayoutEpicHyper1268 polarVoyageMotionLayoutEpicHyper12685 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                        if (polarVoyageMotionLayoutEpicHyper12685.PolarVoyageStrictModeLegendEpic1532 == null) {
                            polarVoyageMotionLayoutEpicHyper12685.PolarVoyageStrictModeLegendEpic1532 = new ArrayList();
                        }
                        polarVoyageMotionLayoutEpicHyper12685.PolarVoyageStrictModeLegendEpic1532.add(null);
                    }
                }
                if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768 == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(null);
                    this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageMotionLayoutEpicHyper1268(0, arrayList3);
                    polarVoyageLayoutTitaniumOlympian9962.sendMessageDelayed(polarVoyageLayoutTitaniumOlympian9962.obtainMessage(17), 0L);
                    return true;
                }
                return true;
            case 19:
                this.PolarVoyageStrictModeLegendEpic1532 = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i);
                return false;
        }
    }
}
