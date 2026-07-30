package p000createpolar;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePoseDetectionPrimeNebula3086 implements PolarVoyageR8EpicBlaze3675 {
    public Object PolarVoyageBottomSheetOmegaNeo1907;
    public boolean PolarVoyageItemDecorationUltraDeltaEpic7485;
    public Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final Object PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyagePoseDetectionPrimeNebula3086(Context context, Runnable runnable, Boolean bool) {
        Spatializer spatializer;
        int immersiveAudioLevel;
        AudioManager PolarVoyageActivityInfoBetaQuantum8726 = context == null ? null : PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageActivityInfoBetaQuantum8726(context);
        if (PolarVoyageActivityInfoBetaQuantum8726 == null || (bool != null && bool.booleanValue())) {
            this.PolarVoyageStrictModeLegendEpic1532 = null;
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = false;
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = null;
            this.PolarVoyageBottomSheetOmegaNeo1907 = null;
            return;
        }
        spatializer = PolarVoyageActivityInfoBetaQuantum8726.getSpatializer();
        this.PolarVoyageStrictModeLegendEpic1532 = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = immersiveAudioLevel != 0;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        Handler handler = new Handler(myLooper);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = handler;
        PolarVoyageAsyncTaskTurboTurboEclipse6332 polarVoyageAsyncTaskTurboTurboEclipse6332 = new PolarVoyageAsyncTaskTurboTurboEclipse6332(runnable);
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageAsyncTaskTurboTurboEclipse6332;
        spatializer.addOnSpatializerStateChangedListener(new PolarVoyageCardViewBetaHyper8130(0, handler), polarVoyageAsyncTaskTurboTurboEclipse6332);
    }

    public static IOException PolarVoyageZipVortexCelestial6185(PolarVoyagePoseDetectionPrimeNebula3086 polarVoyagePoseDetectionPrimeNebula3086, boolean z, IOException iOException, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        if (iOException != null) {
            polarVoyagePoseDetectionPrimeNebula3086.PolarVoyageBottomSheetOmegaNeo1907(iOException);
        }
        return ((PolarVoyageItemDecorationOlympianMax4846) polarVoyagePoseDetectionPrimeNebula3086.PolarVoyageStrictModeLegendEpic1532).PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyagePoseDetectionPrimeNebula3086, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    public PolarVoyageCameraPhantomNova9854 PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i) {
        PolarVoyageCameraPhantomNova9854 polarVoyageCameraPhantomNova9854;
        PolarVoyageGuidelineUltraElitePixel3662 polarVoyageGuidelineUltraElitePixel3662 = (PolarVoyageGuidelineUltraElitePixel3662) this.PolarVoyageBottomSheetOmegaNeo1907;
        synchronized (polarVoyageGuidelineUltraElitePixel3662.PolarVoyageSnackbarGammaEclipse2140) {
            if (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768)[i] = true;
            Object obj = ((PolarVoyageLayerDrawableEclipseHyper3612) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageBarcodeScannerInfernoSolarSpark7767.get(i);
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFlingGestureEclipsePrimeMax1376(polarVoyageGuidelineUltraElitePixel3662.PolarVoyageAlertDialogCyberHeroQuantum3938, (PolarVoyageCameraPhantomNova9854) obj);
            polarVoyageCameraPhantomNova9854 = (PolarVoyageCameraPhantomNova9854) obj;
        }
        return polarVoyageCameraPhantomNova9854;
    }

    public PolarVoyageLocationListenerEclipseGammaTurbo4972 PolarVoyageBitmapVisionAuroraPixel4705() {
        PolarVoyageAccelerometerVisionTitaniumAurora6325 PolarVoyageBitmapVisionAuroraPixel4705 = ((PolarVoyageAlertDialogTitanHyper8130) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageBitmapVisionAuroraPixel4705();
        PolarVoyageLocationListenerEclipseGammaTurbo4972 polarVoyageLocationListenerEclipseGammaTurbo4972 = PolarVoyageBitmapVisionAuroraPixel4705 instanceof PolarVoyageLocationListenerEclipseGammaTurbo4972 ? (PolarVoyageLocationListenerEclipseGammaTurbo4972) PolarVoyageBitmapVisionAuroraPixel4705 : null;
        if (polarVoyageLocationListenerEclipseGammaTurbo4972 != null) {
            return polarVoyageLocationListenerEclipseGammaTurbo4972;
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("no connection for CONNECT tunnels");
        return null;
    }

    public void PolarVoyageBottomSheetOmegaNeo1907(IOException iOException) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = true;
        ((PolarVoyageAlertDialogTitanHyper8130) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageBitmapVisionAuroraPixel4705().PolarVoyageZipVortexCelestial6185((PolarVoyageItemDecorationOlympianMax4846) this.PolarVoyageStrictModeLegendEpic1532, iOException);
    }

    public synchronized boolean PolarVoyageDiffUtilTurboStrike5735() {
        boolean z;
        boolean z2;
        try {
            synchronized (this) {
                try {
                    if (!this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                        Boolean PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageTextInputEditTextNebulaHero6651();
                        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageTextInputEditTextNebulaHero6651;
                        if (PolarVoyageTextInputEditTextNebulaHero6651 == null) {
                            ((PolarVoyageAdapterDelegateAlphaVortex7437) ((PolarVoyageTextureViewSpectraSpeed9597) this.PolarVoyageStrictModeLegendEpic1532)).PolarVoyageZipVortexCelestial6185(new PolarVoyageBroadcastDragonShadowRogue6783(12));
                        }
                        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = true;
                    }
                } finally {
                }
            }
            return z2;
        } catch (Throwable th) {
            throw th;
        }
        Boolean bool = (Boolean) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            PolarVoyageRewardedAdEliteNova2598 polarVoyageRewardedAdEliteNova2598 = ((FirebaseMessaging) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageZipVortexCelestial6185;
            polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185();
            PolarVoyageRotateDrawableFusionNovaPixel1663 polarVoyageRotateDrawableFusionNovaPixel1663 = (PolarVoyageRotateDrawableFusionNovaPixel1663) polarVoyageRewardedAdEliteNova2598.PolarVoyageTextInputEditTextNebulaHero6651.get();
            synchronized (polarVoyageRotateDrawableFusionNovaPixel1663) {
                z = polarVoyageRotateDrawableFusionNovaPixel1663.PolarVoyageZipVortexCelestial6185;
            }
            z2 = z;
        }
        return z2;
    }

    public PolarVoyageResourcesTurboPhoenixTitanium1530 PolarVoyageItemDecorationUltraDeltaEpic7485(boolean z) {
        try {
            PolarVoyageResourcesTurboPhoenixTitanium1530 PolarVoyageItemDecorationUltraDeltaEpic7485 = ((PolarVoyageAlertDialogTitanHyper8130) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageItemDecorationUltraDeltaEpic7485(z);
            if (PolarVoyageItemDecorationUltraDeltaEpic7485 == null) {
                return PolarVoyageItemDecorationUltraDeltaEpic7485;
            }
            PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageDrawableDeltaHyperion5742 = this;
            return PolarVoyageItemDecorationUltraDeltaEpic7485;
        } catch (IOException e) {
            PolarVoyageBottomSheetOmegaNeo1907(e);
            throw e;
        }
    }

    @Override // p000createpolar.PolarVoyageR8EpicBlaze3675
    public void PolarVoyageKotlinBetaPulseBeta3653() {
        SparseArray sparseArray = (SparseArray) this.PolarVoyageBottomSheetOmegaNeo1907;
        ((PolarVoyageR8EpicBlaze3675) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageKotlinBetaPulseBeta3653();
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((PolarVoyageProcessCameraProviderFusionCelestialMega7106) sparseArray.valueAt(i)).PolarVoyageStrictModeLegendEpic1532 = true;
            }
        }
    }

    public void PolarVoyageMotionLayoutTransitionHeroVision4068(boolean z) {
        PolarVoyageGuidelineUltraElitePixel3662 polarVoyageGuidelineUltraElitePixel3662 = (PolarVoyageGuidelineUltraElitePixel3662) this.PolarVoyageBottomSheetOmegaNeo1907;
        synchronized (polarVoyageGuidelineUltraElitePixel3662.PolarVoyageSnackbarGammaEclipse2140) {
            try {
                if (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                    throw new IllegalStateException("editor is closed");
                }
                if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(((PolarVoyageLayerDrawableEclipseHyper3612) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageTextInputEditTextNebulaHero6651, this)) {
                    PolarVoyageGuidelineUltraElitePixel3662.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageGuidelineUltraElitePixel3662, this, z);
                }
                this.PolarVoyageItemDecorationUltraDeltaEpic7485 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void PolarVoyageRotateAnimationCyberCelestialDelta4768() {
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            ((PolarVoyagePropertyValuesHolderHyperionUltra8479) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageBarcodeScannerInfernoSolarSpark7767(new PolarVoyageLightSensorSparkBlazeTitanium9192(5, this));
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = false;
        }
    }

    @Override // p000createpolar.PolarVoyageR8EpicBlaze3675
    public PolarVoyageDrawerLayoutUltraMasterShadow4631 PolarVoyageSnackbarGammaEclipse2140(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.PolarVoyageBottomSheetOmegaNeo1907;
        PolarVoyageR8EpicBlaze3675 polarVoyageR8EpicBlaze3675 = (PolarVoyageR8EpicBlaze3675) this.PolarVoyageStrictModeLegendEpic1532;
        if (i2 != 3 && i2 != 5) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = true;
        }
        if (i2 != 3) {
            return polarVoyageR8EpicBlaze3675.PolarVoyageSnackbarGammaEclipse2140(i, i2);
        }
        PolarVoyageProcessCameraProviderFusionCelestialMega7106 polarVoyageProcessCameraProviderFusionCelestialMega7106 = (PolarVoyageProcessCameraProviderFusionCelestialMega7106) sparseArray.get(i);
        if (polarVoyageProcessCameraProviderFusionCelestialMega7106 != null) {
            return polarVoyageProcessCameraProviderFusionCelestialMega7106;
        }
        PolarVoyageProcessCameraProviderFusionCelestialMega7106 polarVoyageProcessCameraProviderFusionCelestialMega71062 = new PolarVoyageProcessCameraProviderFusionCelestialMega7106(polarVoyageR8EpicBlaze3675.PolarVoyageSnackbarGammaEclipse2140(i, i2), (PolarVoyageAdapterDelegateBetaGammaBeta9555) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
        sparseArray.put(i, polarVoyageProcessCameraProviderFusionCelestialMega71062);
        return polarVoyageProcessCameraProviderFusionCelestialMega71062;
    }

    @Override // p000createpolar.PolarVoyageR8EpicBlaze3675
    public void PolarVoyageStrictModeLegendEpic1532(PolarVoyagePaintMegaCelestial9975 polarVoyagePaintMegaCelestial9975) {
        ((PolarVoyageR8EpicBlaze3675) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageStrictModeLegendEpic1532(polarVoyagePaintMegaCelestial9975);
    }

    public Boolean PolarVoyageTextInputEditTextNebulaHero6651() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        PolarVoyageRewardedAdEliteNova2598 polarVoyageRewardedAdEliteNova2598 = ((FirebaseMessaging) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageZipVortexCelestial6185;
        polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185();
        Context context = polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public PolarVoyageAlarmManagerAlphaInferno3493 PolarVoyageViewRogueMaster4778() {
        PolarVoyageItemDecorationOlympianMax4846 polarVoyageItemDecorationOlympianMax4846 = (PolarVoyageItemDecorationOlympianMax4846) this.PolarVoyageStrictModeLegendEpic1532;
        if (polarVoyageItemDecorationOlympianMax4846.PolarVoyageRemoteModelManagerOlympianCelestial9141) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Check failed.");
            return null;
        }
        polarVoyageItemDecorationOlympianMax4846.PolarVoyageRemoteModelManagerOlympianCelestial9141 = true;
        polarVoyageItemDecorationOlympianMax4846.PolarVoyageViewRogueMaster4778.PolarVoyageRotateAnimationCyberCelestialDelta4768();
        synchronized (polarVoyageItemDecorationOlympianMax4846) {
            if (polarVoyageItemDecorationOlympianMax4846.PolarVoyageCameraViewSpectraMaxSpectra2824 == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (polarVoyageItemDecorationOlympianMax4846.PolarVoyageDisplayMetricsVortexDragon9516 || polarVoyageItemDecorationOlympianMax4846.PolarVoyageLayerDrawableShadowTitaniumOmega1942) {
                throw new IllegalStateException("Check failed.");
            }
            if (polarVoyageItemDecorationOlympianMax4846.PolarVoyageAnimatorSetSparkUltraMax8233) {
                throw new IllegalStateException("Check failed.");
            }
            if (!polarVoyageItemDecorationOlympianMax4846.PolarVoyageBitmapMaxTitanTitan7960) {
                throw new IllegalStateException("Check failed.");
            }
            polarVoyageItemDecorationOlympianMax4846.PolarVoyageBitmapMaxTitanTitan7960 = false;
            polarVoyageItemDecorationOlympianMax4846.PolarVoyageDisplayMetricsVortexDragon9516 = true;
            polarVoyageItemDecorationOlympianMax4846.PolarVoyageLayerDrawableShadowTitaniumOmega1942 = true;
        }
        PolarVoyageAccelerometerVisionTitaniumAurora6325 PolarVoyageBitmapVisionAuroraPixel4705 = ((PolarVoyageAlertDialogTitanHyper8130) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageBitmapVisionAuroraPixel4705();
        PolarVoyageBitmapVisionAuroraPixel4705.getClass();
        PolarVoyageLocationListenerEclipseGammaTurbo4972 polarVoyageLocationListenerEclipseGammaTurbo4972 = (PolarVoyageLocationListenerEclipseGammaTurbo4972) PolarVoyageBitmapVisionAuroraPixel4705;
        polarVoyageLocationListenerEclipseGammaTurbo4972.PolarVoyageBitmapVisionAuroraPixel4705.setSoTimeout(0);
        polarVoyageLocationListenerEclipseGammaTurbo4972.PolarVoyageItemDecorationUltraDeltaEpic7485();
        return new PolarVoyageAlarmManagerAlphaInferno3493(this);
    }

    public PolarVoyagePoseDetectionPrimeNebula3086(PolarVoyageItemDecorationOlympianMax4846 polarVoyageItemDecorationOlympianMax4846, PolarVoyageRotateAnimationNeoMegaPulse7927 polarVoyageRotateAnimationNeoMegaPulse7927, PolarVoyageAlertDialogTitanHyper8130 polarVoyageAlertDialogTitanHyper8130) {
        polarVoyageRotateAnimationNeoMegaPulse7927.getClass();
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageItemDecorationOlympianMax4846;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageRotateAnimationNeoMegaPulse7927;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageAlertDialogTitanHyper8130;
    }

    public PolarVoyagePoseDetectionPrimeNebula3086(PolarVoyageR8EpicBlaze3675 polarVoyageR8EpicBlaze3675, PolarVoyageAdapterDelegateBetaGammaBeta9555 polarVoyageAdapterDelegateBetaGammaBeta9555) {
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageR8EpicBlaze3675;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageAdapterDelegateBetaGammaBeta9555;
        this.PolarVoyageBottomSheetOmegaNeo1907 = new SparseArray();
    }

    public PolarVoyagePoseDetectionPrimeNebula3086(Context context, Looper looper, Looper looper2, PolarVoyageLiveDataScopeDeltaForce2288 polarVoyageLiveDataScopeDeltaForce2288, PolarVoyageVelocityTrackerPhantomTitaniumStrike2970 polarVoyageVelocityTrackerPhantomTitaniumStrike2970) {
        this.PolarVoyageStrictModeLegendEpic1532 = context.getApplicationContext();
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageVelocityTrackerPhantomTitaniumStrike2970.PolarVoyageZipVortexCelestial6185(looper, null);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageAnalyticsVortexNovaDragon9493(this, polarVoyageVelocityTrackerPhantomTitaniumStrike2970.PolarVoyageZipVortexCelestial6185(looper2, null), polarVoyageLiveDataScopeDeltaForce2288);
    }

    public PolarVoyagePoseDetectionPrimeNebula3086() {
        this.PolarVoyageStrictModeLegendEpic1532 = new Object();
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new ArrayList();
        this.PolarVoyageBottomSheetOmegaNeo1907 = new ArrayList();
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = true;
    }

    public PolarVoyagePoseDetectionPrimeNebula3086(PolarVoyageGuidelineUltraElitePixel3662 polarVoyageGuidelineUltraElitePixel3662, PolarVoyageLayerDrawableEclipseHyper3612 polarVoyageLayerDrawableEclipseHyper3612) {
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageGuidelineUltraElitePixel3662;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageLayerDrawableEclipseHyper3612;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new boolean[2];
    }

    public PolarVoyagePoseDetectionPrimeNebula3086(FirebaseMessaging firebaseMessaging, PolarVoyageTextureViewSpectraSpeed9597 polarVoyageTextureViewSpectraSpeed9597) {
        this.PolarVoyageBottomSheetOmegaNeo1907 = firebaseMessaging;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageTextureViewSpectraSpeed9597;
    }
}
