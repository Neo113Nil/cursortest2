package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000createpolar.PolarVoyageAccelerometerNovaCyberInferno4981;
import p000createpolar.PolarVoyageAnimatorHeroPrime4575;
import p000createpolar.PolarVoyageAsyncEpicCelestialSpectra3691;
import p000createpolar.PolarVoyageChipHeroNebula6696;
import p000createpolar.PolarVoyageColorStateListCyberPhoenixHero2775;
import p000createpolar.PolarVoyageConstraintSetClonePixelVortex4921;
import p000createpolar.PolarVoyageContentObserverThunderOmega9101;
import p000createpolar.PolarVoyageDialogFragmentTitanCelestial7995;
import p000createpolar.PolarVoyageDigitalInkRecognitionNebulaLegendTitanium8364;
import p000createpolar.PolarVoyageFlowOnCosmosTurbo3722;
import p000createpolar.PolarVoyageGraphDeltaPulse1659;
import p000createpolar.PolarVoyageGuidelineMasterRogue8570;
import p000createpolar.PolarVoyageLayoutInflaterMegaAlpha5562;
import p000createpolar.PolarVoyageMotionLayoutHeroSpeed4592;
import p000createpolar.PolarVoyageNavigationViewBlazeOmegaVision9396;
import p000createpolar.PolarVoyagePagingSourceEpicSolarStorm3628;
import p000createpolar.PolarVoyagePaintFlagsDrawFilterThunderVortex4639;
import p000createpolar.PolarVoyagePoseDetectionPrimeNebula3086;
import p000createpolar.PolarVoyageRemoteConfigEliteSpectra7350;
import p000createpolar.PolarVoyageResourcesCelestialInferno9280;
import p000createpolar.PolarVoyageRewardedAdEliteNova2598;
import p000createpolar.PolarVoyageRunnableBlazeDragon1360;
import p000createpolar.PolarVoyageSQLiteTitanForceLegend7380;
import p000createpolar.PolarVoyageStateEpicSpectraThunder6774;
import p000createpolar.PolarVoyageTextWatcherPhantomStorm4467;
import p000createpolar.PolarVoyageTextureViewQuantumDelta2831;
import p000createpolar.PolarVoyageTextureViewSpectraSpeed9597;
import p000createpolar.PolarVoyageViewPager2InfernoEpic1202;
import p000createpolar.PolarVoyageWorkManagerShadowTitanium6734;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static PolarVoyageRemoteConfigEliteSpectra7350 PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageColorStateListCyberPhoenixHero2775(5);
    public static PolarVoyageDigitalInkRecognitionNebulaLegendTitanium8364 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public static ScheduledThreadPoolExecutor PolarVoyageViewRogueMaster4778;
    public final PolarVoyageResourcesCelestialInferno9280 PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final PolarVoyagePoseDetectionPrimeNebula3086 PolarVoyageBitmapVisionAuroraPixel4705;
    public final ScheduledThreadPoolExecutor PolarVoyageDiffUtilTurboStrike5735;
    public final PolarVoyagePaintFlagsDrawFilterThunderVortex4639 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyageStateEpicSpectraThunder6774 PolarVoyageKotlinBetaPulseBeta3653;
    public final Context PolarVoyageMotionLayoutTransitionHeroVision4068;
    public boolean PolarVoyageStrictModeLegendEpic1532;
    public final ThreadPoolExecutor PolarVoyageTextInputEditTextNebulaHero6651;
    public final PolarVoyageRewardedAdEliteNova2598 PolarVoyageZipVortexCelestial6185;

    public FirebaseMessaging(PolarVoyageRewardedAdEliteNova2598 polarVoyageRewardedAdEliteNova2598, PolarVoyageRemoteConfigEliteSpectra7350 polarVoyageRemoteConfigEliteSpectra7350, PolarVoyageRemoteConfigEliteSpectra7350 polarVoyageRemoteConfigEliteSpectra73502, PolarVoyageWorkManagerShadowTitanium6734 polarVoyageWorkManagerShadowTitanium6734, PolarVoyageRemoteConfigEliteSpectra7350 polarVoyageRemoteConfigEliteSpectra73503, PolarVoyageTextureViewSpectraSpeed9597 polarVoyageTextureViewSpectraSpeed9597) {
        polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185();
        Context context = polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185;
        final PolarVoyagePaintFlagsDrawFilterThunderVortex4639 polarVoyagePaintFlagsDrawFilterThunderVortex4639 = new PolarVoyagePaintFlagsDrawFilterThunderVortex4639();
        final int i = 0;
        polarVoyagePaintFlagsDrawFilterThunderVortex4639.PolarVoyageMotionLayoutTransitionHeroVision4068 = 0;
        polarVoyagePaintFlagsDrawFilterThunderVortex4639.PolarVoyageKotlinBetaPulseBeta3653 = context;
        polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185();
        PolarVoyageMotionLayoutHeroSpeed4592 polarVoyageMotionLayoutHeroSpeed4592 = new PolarVoyageMotionLayoutHeroSpeed4592(polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185);
        final PolarVoyageStateEpicSpectraThunder6774 polarVoyageStateEpicSpectraThunder6774 = new PolarVoyageStateEpicSpectraThunder6774();
        polarVoyageStateEpicSpectraThunder6774.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageRewardedAdEliteNova2598;
        polarVoyageStateEpicSpectraThunder6774.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyagePaintFlagsDrawFilterThunderVortex4639;
        polarVoyageStateEpicSpectraThunder6774.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageMotionLayoutHeroSpeed4592;
        polarVoyageStateEpicSpectraThunder6774.PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageRemoteConfigEliteSpectra7350;
        polarVoyageStateEpicSpectraThunder6774.PolarVoyageDiffUtilTurboStrike5735 = polarVoyageRemoteConfigEliteSpectra73502;
        polarVoyageStateEpicSpectraThunder6774.PolarVoyageZipVortexCelestial6185 = polarVoyageWorkManagerShadowTitanium6734;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new PolarVoyageAsyncEpicCelestialSpectra3691("Firebase-Messaging-Task"));
        final int i2 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new PolarVoyageAsyncEpicCelestialSpectra3691("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new PolarVoyageAsyncEpicCelestialSpectra3691("Firebase-Messaging-File-Io"));
        this.PolarVoyageStrictModeLegendEpic1532 = false;
        PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageRemoteConfigEliteSpectra73503;
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageRewardedAdEliteNova2598;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = new PolarVoyagePoseDetectionPrimeNebula3086(this, polarVoyageTextureViewSpectraSpeed9597);
        polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185();
        final Context context2 = polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = context2;
        PolarVoyageRunnableBlazeDragon1360 polarVoyageRunnableBlazeDragon1360 = new PolarVoyageRunnableBlazeDragon1360();
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyagePaintFlagsDrawFilterThunderVortex4639;
        this.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageStateEpicSpectraThunder6774;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new PolarVoyageResourcesCelestialInferno9280(newSingleThreadExecutor);
        this.PolarVoyageDiffUtilTurboStrike5735 = scheduledThreadPoolExecutor;
        this.PolarVoyageTextInputEditTextNebulaHero6651 = threadPoolExecutor;
        polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(polarVoyageRunnableBlazeDragon1360);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: create-polar.PolarVoyageTextWatcherInfernoNeoLegend8594
            public final /* synthetic */ FirebaseMessaging PolarVoyageStrictModeLegendEpic1532;

            {
                this.PolarVoyageStrictModeLegendEpic1532 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                PolarVoyageDialogFragmentTitanCelestial7995 polarVoyageDialogFragmentTitanCelestial7995;
                int i3;
                int i4 = i;
                FirebaseMessaging firebaseMessaging = this.PolarVoyageStrictModeLegendEpic1532;
                switch (i4) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        if (firebaseMessaging.PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageDiffUtilTurboStrike5735() && firebaseMessaging.PolarVoyageItemDecorationUltraDeltaEpic7485(firebaseMessaging.PolarVoyageBarcodeScannerInfernoSolarSpark7767())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.PolarVoyageStrictModeLegendEpic1532) {
                                    firebaseMessaging.PolarVoyageTextInputEditTextNebulaHero6651(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context3 = firebaseMessaging.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyagePackageManagerCelestialPhoenix8393(context3);
                        PolarVoyageStateEpicSpectraThunder6774 polarVoyageStateEpicSpectraThunder67742 = firebaseMessaging.PolarVoyageKotlinBetaPulseBeta3653;
                        final boolean PolarVoyageDiffUtilTurboStrike5735 = firebaseMessaging.PolarVoyageDiffUtilTurboStrike5735();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences PolarVoyageBitmapMaxTitanTitan7960 = PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageBitmapMaxTitanTitan7960(context3);
                            if (!PolarVoyageBitmapMaxTitanTitan7960.contains("proxy_retention") || PolarVoyageBitmapMaxTitanTitan7960.getBoolean("proxy_retention", false) != PolarVoyageDiffUtilTurboStrike5735) {
                                PolarVoyageMotionLayoutHeroSpeed4592 polarVoyageMotionLayoutHeroSpeed45922 = (PolarVoyageMotionLayoutHeroSpeed4592) polarVoyageStateEpicSpectraThunder67742.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                                if (polarVoyageMotionLayoutHeroSpeed45922.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageMotionLayoutForceEpicAurora7183() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", PolarVoyageDiffUtilTurboStrike5735);
                                    PolarVoyageSQLiteTitanForceLegend7380 PolarVoyageViewRogueMaster47782 = PolarVoyageSQLiteTitanForceLegend7380.PolarVoyageViewRogueMaster4778(polarVoyageMotionLayoutHeroSpeed45922.PolarVoyageMotionLayoutTransitionHeroVision4068);
                                    synchronized (PolarVoyageViewRogueMaster47782) {
                                        i3 = PolarVoyageViewRogueMaster47782.PolarVoyageZipVortexCelestial6185;
                                        PolarVoyageViewRogueMaster47782.PolarVoyageZipVortexCelestial6185 = i3 + 1;
                                    }
                                    polarVoyageDialogFragmentTitanCelestial7995 = PolarVoyageViewRogueMaster47782.PolarVoyageCameraPixelBlaze2629(new PolarVoyageAnimatorHeroPrime4575(i3, 4, bundle, 0));
                                } else {
                                    IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
                                    PolarVoyageDialogFragmentTitanCelestial7995 polarVoyageDialogFragmentTitanCelestial79952 = new PolarVoyageDialogFragmentTitanCelestial7995();
                                    polarVoyageDialogFragmentTitanCelestial79952.PolarVoyageRotateAnimationCyberCelestialDelta4768(iOException);
                                    polarVoyageDialogFragmentTitanCelestial7995 = polarVoyageDialogFragmentTitanCelestial79952;
                                }
                                polarVoyageDialogFragmentTitanCelestial7995.PolarVoyageMotionLayoutTransitionHeroVision4068(new PolarVoyageFilterTurboThunderEclipse3279(1), new PolarVoyageHandlerRogueCelestialAlpha4942() { // from class: create-polar.PolarVoyageInputFilterShadowPrimeForce7152
                                    @Override // p000createpolar.PolarVoyageHandlerRogueCelestialAlpha4942
                                    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(Object obj) {
                                        SharedPreferences.Editor edit = PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageBitmapMaxTitanTitan7960(context3).edit();
                                        edit.putBoolean("proxy_retention", PolarVoyageDiffUtilTurboStrike5735);
                                        edit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.PolarVoyageDiffUtilTurboStrike5735()) {
                            firebaseMessaging.PolarVoyageBitmapVisionAuroraPixel4705();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new PolarVoyageAsyncEpicCelestialSpectra3691("Firebase-Messaging-Topics-Io"));
        PolarVoyageFlowOnCosmosTurbo3722.PolarVoyageDiffUtilTurboStrike5735(scheduledThreadPoolExecutor2, new Callable() { // from class: create-polar.PolarVoyageMapEclipseVortex1402
            @Override // java.util.concurrent.Callable
            public final Object call() {
                PolarVoyageTranslateAnimationTurboMasterVortex5816 polarVoyageTranslateAnimationTurboMasterVortex5816;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                PolarVoyagePaintFlagsDrawFilterThunderVortex4639 polarVoyagePaintFlagsDrawFilterThunderVortex46392 = polarVoyagePaintFlagsDrawFilterThunderVortex4639;
                PolarVoyageStateEpicSpectraThunder6774 polarVoyageStateEpicSpectraThunder67742 = polarVoyageStateEpicSpectraThunder6774;
                synchronized (PolarVoyageTranslateAnimationTurboMasterVortex5816.class) {
                    try {
                        WeakReference weakReference = PolarVoyageTranslateAnimationTurboMasterVortex5816.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        PolarVoyageTranslateAnimationTurboMasterVortex5816 polarVoyageTranslateAnimationTurboMasterVortex58162 = weakReference != null ? (PolarVoyageTranslateAnimationTurboMasterVortex5816) weakReference.get() : null;
                        if (polarVoyageTranslateAnimationTurboMasterVortex58162 == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            polarVoyageTranslateAnimationTurboMasterVortex5816 = new PolarVoyageTranslateAnimationTurboMasterVortex5816();
                            synchronized (polarVoyageTranslateAnimationTurboMasterVortex5816) {
                                polarVoyageTranslateAnimationTurboMasterVortex5816.PolarVoyageZipVortexCelestial6185 = PolarVoyageServiceUltraUltraNeo9663.PolarVoyageViewRogueMaster4778(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            PolarVoyageTranslateAnimationTurboMasterVortex5816.PolarVoyageMotionLayoutTransitionHeroVision4068 = new WeakReference(polarVoyageTranslateAnimationTurboMasterVortex5816);
                        } else {
                            polarVoyageTranslateAnimationTurboMasterVortex5816 = polarVoyageTranslateAnimationTurboMasterVortex58162;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new PolarVoyageCameraHyperOmegaTitan1048(firebaseMessaging, polarVoyagePaintFlagsDrawFilterThunderVortex46392, polarVoyageTranslateAnimationTurboMasterVortex5816, polarVoyageStateEpicSpectraThunder67742, context3, scheduledThreadPoolExecutor3);
            }
        }).PolarVoyageMotionLayoutTransitionHeroVision4068(scheduledThreadPoolExecutor, new PolarVoyageAccelerometerNovaCyberInferno4981(this, i));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: create-polar.PolarVoyageTextWatcherInfernoNeoLegend8594
            public final /* synthetic */ FirebaseMessaging PolarVoyageStrictModeLegendEpic1532;

            {
                this.PolarVoyageStrictModeLegendEpic1532 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                PolarVoyageDialogFragmentTitanCelestial7995 polarVoyageDialogFragmentTitanCelestial7995;
                int i3;
                int i4 = i2;
                FirebaseMessaging firebaseMessaging = this.PolarVoyageStrictModeLegendEpic1532;
                switch (i4) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        if (firebaseMessaging.PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageDiffUtilTurboStrike5735() && firebaseMessaging.PolarVoyageItemDecorationUltraDeltaEpic7485(firebaseMessaging.PolarVoyageBarcodeScannerInfernoSolarSpark7767())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.PolarVoyageStrictModeLegendEpic1532) {
                                    firebaseMessaging.PolarVoyageTextInputEditTextNebulaHero6651(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context3 = firebaseMessaging.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyagePackageManagerCelestialPhoenix8393(context3);
                        PolarVoyageStateEpicSpectraThunder6774 polarVoyageStateEpicSpectraThunder67742 = firebaseMessaging.PolarVoyageKotlinBetaPulseBeta3653;
                        final boolean PolarVoyageDiffUtilTurboStrike5735 = firebaseMessaging.PolarVoyageDiffUtilTurboStrike5735();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences PolarVoyageBitmapMaxTitanTitan7960 = PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageBitmapMaxTitanTitan7960(context3);
                            if (!PolarVoyageBitmapMaxTitanTitan7960.contains("proxy_retention") || PolarVoyageBitmapMaxTitanTitan7960.getBoolean("proxy_retention", false) != PolarVoyageDiffUtilTurboStrike5735) {
                                PolarVoyageMotionLayoutHeroSpeed4592 polarVoyageMotionLayoutHeroSpeed45922 = (PolarVoyageMotionLayoutHeroSpeed4592) polarVoyageStateEpicSpectraThunder67742.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                                if (polarVoyageMotionLayoutHeroSpeed45922.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageMotionLayoutForceEpicAurora7183() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", PolarVoyageDiffUtilTurboStrike5735);
                                    PolarVoyageSQLiteTitanForceLegend7380 PolarVoyageViewRogueMaster47782 = PolarVoyageSQLiteTitanForceLegend7380.PolarVoyageViewRogueMaster4778(polarVoyageMotionLayoutHeroSpeed45922.PolarVoyageMotionLayoutTransitionHeroVision4068);
                                    synchronized (PolarVoyageViewRogueMaster47782) {
                                        i3 = PolarVoyageViewRogueMaster47782.PolarVoyageZipVortexCelestial6185;
                                        PolarVoyageViewRogueMaster47782.PolarVoyageZipVortexCelestial6185 = i3 + 1;
                                    }
                                    polarVoyageDialogFragmentTitanCelestial7995 = PolarVoyageViewRogueMaster47782.PolarVoyageCameraPixelBlaze2629(new PolarVoyageAnimatorHeroPrime4575(i3, 4, bundle, 0));
                                } else {
                                    IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
                                    PolarVoyageDialogFragmentTitanCelestial7995 polarVoyageDialogFragmentTitanCelestial79952 = new PolarVoyageDialogFragmentTitanCelestial7995();
                                    polarVoyageDialogFragmentTitanCelestial79952.PolarVoyageRotateAnimationCyberCelestialDelta4768(iOException);
                                    polarVoyageDialogFragmentTitanCelestial7995 = polarVoyageDialogFragmentTitanCelestial79952;
                                }
                                polarVoyageDialogFragmentTitanCelestial7995.PolarVoyageMotionLayoutTransitionHeroVision4068(new PolarVoyageFilterTurboThunderEclipse3279(1), new PolarVoyageHandlerRogueCelestialAlpha4942() { // from class: create-polar.PolarVoyageInputFilterShadowPrimeForce7152
                                    @Override // p000createpolar.PolarVoyageHandlerRogueCelestialAlpha4942
                                    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(Object obj) {
                                        SharedPreferences.Editor edit = PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageBitmapMaxTitanTitan7960(context3).edit();
                                        edit.putBoolean("proxy_retention", PolarVoyageDiffUtilTurboStrike5735);
                                        edit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.PolarVoyageDiffUtilTurboStrike5735()) {
                            firebaseMessaging.PolarVoyageBitmapVisionAuroraPixel4705();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static synchronized PolarVoyageDigitalInkRecognitionNebulaLegendTitanium8364 PolarVoyageKotlinBetaPulseBeta3653(Context context) {
        PolarVoyageDigitalInkRecognitionNebulaLegendTitanium8364 polarVoyageDigitalInkRecognitionNebulaLegendTitanium8364;
        synchronized (FirebaseMessaging.class) {
            try {
                if (PolarVoyageRotateAnimationCyberCelestialDelta4768 == null) {
                    PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageDigitalInkRecognitionNebulaLegendTitanium8364(context);
                }
                polarVoyageDigitalInkRecognitionNebulaLegendTitanium8364 = PolarVoyageRotateAnimationCyberCelestialDelta4768;
            } catch (Throwable th) {
                throw th;
            }
        }
        return polarVoyageDigitalInkRecognitionNebulaLegendTitanium8364;
    }

    public static void PolarVoyageMotionLayoutTransitionHeroVision4068(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (PolarVoyageViewRogueMaster4778 == null) {
                    PolarVoyageViewRogueMaster4778 = new ScheduledThreadPoolExecutor(1, new PolarVoyageAsyncEpicCelestialSpectra3691("TAG"));
                }
                PolarVoyageViewRogueMaster4778.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized FirebaseMessaging getInstance(PolarVoyageRewardedAdEliteNova2598 polarVoyageRewardedAdEliteNova2598) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185();
            firebaseMessaging = (FirebaseMessaging) polarVoyageRewardedAdEliteNova2598.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageKotlinBetaPulseBeta3653(FirebaseMessaging.class);
            PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageLayerDrawableShadowTitaniumOmega1942(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final PolarVoyageGuidelineMasterRogue8570 PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        PolarVoyageGuidelineMasterRogue8570 PolarVoyageMotionLayoutTransitionHeroVision4068;
        PolarVoyageDigitalInkRecognitionNebulaLegendTitanium8364 PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageKotlinBetaPulseBeta3653(this.PolarVoyageMotionLayoutTransitionHeroVision4068);
        PolarVoyageRewardedAdEliteNova2598 polarVoyageRewardedAdEliteNova2598 = this.PolarVoyageZipVortexCelestial6185;
        polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185();
        String PolarVoyageKotlinBetaPulseBeta36532 = "[DEFAULT]".equals(polarVoyageRewardedAdEliteNova2598.PolarVoyageMotionLayoutTransitionHeroVision4068) ? "" : polarVoyageRewardedAdEliteNova2598.PolarVoyageKotlinBetaPulseBeta3653();
        String PolarVoyageKotlinBetaPulseBeta36533 = PolarVoyagePaintFlagsDrawFilterThunderVortex4639.PolarVoyageKotlinBetaPulseBeta3653(this.PolarVoyageZipVortexCelestial6185);
        synchronized (PolarVoyageKotlinBetaPulseBeta3653) {
            PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageGuidelineMasterRogue8570.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageZipVortexCelestial6185.getString(PolarVoyageKotlinBetaPulseBeta36532 + "|T|" + PolarVoyageKotlinBetaPulseBeta36533 + "|*", null));
        }
        return PolarVoyageMotionLayoutTransitionHeroVision4068;
    }

    public final void PolarVoyageBitmapVisionAuroraPixel4705() {
        PolarVoyageDialogFragmentTitanCelestial7995 polarVoyageDialogFragmentTitanCelestial7995;
        int i;
        PolarVoyageMotionLayoutHeroSpeed4592 polarVoyageMotionLayoutHeroSpeed4592 = (PolarVoyageMotionLayoutHeroSpeed4592) this.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int i2 = 1;
        if (polarVoyageMotionLayoutHeroSpeed4592.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageMotionLayoutForceEpicAurora7183() >= 241100000) {
            PolarVoyageSQLiteTitanForceLegend7380 PolarVoyageViewRogueMaster47782 = PolarVoyageSQLiteTitanForceLegend7380.PolarVoyageViewRogueMaster4778(polarVoyageMotionLayoutHeroSpeed4592.PolarVoyageMotionLayoutTransitionHeroVision4068);
            Bundle bundle = Bundle.EMPTY;
            synchronized (PolarVoyageViewRogueMaster47782) {
                i = PolarVoyageViewRogueMaster47782.PolarVoyageZipVortexCelestial6185;
                PolarVoyageViewRogueMaster47782.PolarVoyageZipVortexCelestial6185 = i + 1;
            }
            polarVoyageDialogFragmentTitanCelestial7995 = PolarVoyageViewRogueMaster47782.PolarVoyageCameraPixelBlaze2629(new PolarVoyageAnimatorHeroPrime4575(i, 5, bundle, 1)).PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageViewPager2InfernoEpic1202.PolarVoyageRotateAnimationCyberCelestialDelta4768, PolarVoyagePagingSourceEpicSolarStorm3628.PolarVoyagePackageManagerCelestialPhoenix8393);
        } else {
            IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
            PolarVoyageDialogFragmentTitanCelestial7995 polarVoyageDialogFragmentTitanCelestial79952 = new PolarVoyageDialogFragmentTitanCelestial7995();
            polarVoyageDialogFragmentTitanCelestial79952.PolarVoyageRotateAnimationCyberCelestialDelta4768(iOException);
            polarVoyageDialogFragmentTitanCelestial7995 = polarVoyageDialogFragmentTitanCelestial79952;
        }
        polarVoyageDialogFragmentTitanCelestial7995.PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageDiffUtilTurboStrike5735, new PolarVoyageAccelerometerNovaCyberInferno4981(this, i2));
    }

    public final boolean PolarVoyageDiffUtilTurboStrike5735() {
        String notificationDelegate;
        Context context = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyagePackageManagerCelestialPhoenix8393(context);
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
            if ("com.google.android.gms".equals(notificationDelegate)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "GMS core is set for proxying");
                }
                PolarVoyageRewardedAdEliteNova2598 polarVoyageRewardedAdEliteNova2598 = this.PolarVoyageZipVortexCelestial6185;
                polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185();
                if (polarVoyageRewardedAdEliteNova2598.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageTextureViewQuantumDelta2831.class) != null) {
                    return true;
                }
                if (PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageAnimatorSetSparkUltraMax8233() && PolarVoyageBottomSheetOmegaNeo1907 != null) {
                    return true;
                }
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    public final boolean PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageGuidelineMasterRogue8570 polarVoyageGuidelineMasterRogue8570) {
        if (polarVoyageGuidelineMasterRogue8570 != null) {
            return System.currentTimeMillis() > polarVoyageGuidelineMasterRogue8570.PolarVoyageZipVortexCelestial6185 + 604800000 || !this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageMotionLayoutTransitionHeroVision4068().equals((String) polarVoyageGuidelineMasterRogue8570.PolarVoyageKotlinBetaPulseBeta3653);
        }
        return true;
    }

    public final synchronized void PolarVoyageTextInputEditTextNebulaHero6651(long j) {
        PolarVoyageMotionLayoutTransitionHeroVision4068(new PolarVoyageChipHeroNebula6696(this, Math.min(Math.max(30L, 2 * j), 28800L)), j);
        this.PolarVoyageStrictModeLegendEpic1532 = true;
    }

    public final String PolarVoyageZipVortexCelestial6185() {
        PolarVoyageDialogFragmentTitanCelestial7995 polarVoyageDialogFragmentTitanCelestial7995;
        PolarVoyageGuidelineMasterRogue8570 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        if (!PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageBarcodeScannerInfernoSolarSpark7767)) {
            return (String) PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageMotionLayoutTransitionHeroVision4068;
        }
        String PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyagePaintFlagsDrawFilterThunderVortex4639.PolarVoyageKotlinBetaPulseBeta3653(this.PolarVoyageZipVortexCelestial6185);
        PolarVoyageResourcesCelestialInferno9280 polarVoyageResourcesCelestialInferno9280 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        synchronized (polarVoyageResourcesCelestialInferno9280) {
            polarVoyageDialogFragmentTitanCelestial7995 = (PolarVoyageDialogFragmentTitanCelestial7995) ((PolarVoyageContentObserverThunderOmega9101) polarVoyageResourcesCelestialInferno9280.PolarVoyageRotateAnimationCyberCelestialDelta4768).get(PolarVoyageKotlinBetaPulseBeta3653);
            int i = 3;
            if (polarVoyageDialogFragmentTitanCelestial7995 == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + PolarVoyageKotlinBetaPulseBeta3653);
                }
                PolarVoyageStateEpicSpectraThunder6774 polarVoyageStateEpicSpectraThunder6774 = this.PolarVoyageKotlinBetaPulseBeta3653;
                polarVoyageDialogFragmentTitanCelestial7995 = polarVoyageStateEpicSpectraThunder6774.PolarVoyageStrictModeLegendEpic1532(polarVoyageStateEpicSpectraThunder6774.PolarVoyageSnackbarGammaEclipse2140(PolarVoyagePaintFlagsDrawFilterThunderVortex4639.PolarVoyageKotlinBetaPulseBeta3653((PolarVoyageRewardedAdEliteNova2598) polarVoyageStateEpicSpectraThunder6774.PolarVoyageMotionLayoutTransitionHeroVision4068), "*", new Bundle())).PolarVoyageStrictModeLegendEpic1532(this.PolarVoyageTextInputEditTextNebulaHero6651, new PolarVoyageGraphDeltaPulse1659(this, PolarVoyageKotlinBetaPulseBeta3653, PolarVoyageBarcodeScannerInfernoSolarSpark7767, i)).PolarVoyageBarcodeScannerInfernoSolarSpark7767((Executor) polarVoyageResourcesCelestialInferno9280.PolarVoyageStrictModeLegendEpic1532, new PolarVoyageTextWatcherPhantomStorm4467(polarVoyageResourcesCelestialInferno9280, PolarVoyageKotlinBetaPulseBeta3653));
                ((PolarVoyageContentObserverThunderOmega9101) polarVoyageResourcesCelestialInferno9280.PolarVoyageRotateAnimationCyberCelestialDelta4768).put(PolarVoyageKotlinBetaPulseBeta3653, polarVoyageDialogFragmentTitanCelestial7995);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + PolarVoyageKotlinBetaPulseBeta3653);
            }
        }
        try {
            return (String) PolarVoyageFlowOnCosmosTurbo3722.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageDialogFragmentTitanCelestial7995);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }
}
