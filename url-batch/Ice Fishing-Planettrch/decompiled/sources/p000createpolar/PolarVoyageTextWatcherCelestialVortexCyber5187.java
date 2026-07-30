package p000createpolar;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageTextWatcherCelestialVortexCyber5187 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ Object PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageTextWatcherCelestialVortexCyber5187(int i, Object obj, Object obj2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock;
        int i = 5;
        int i2 = 6;
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                PolarVoyagePoseDetectionMasterTitanium4242 polarVoyagePoseDetectionMasterTitanium4242 = (PolarVoyagePoseDetectionMasterTitanium4242) this.PolarVoyageStrictModeLegendEpic1532;
                Context context = (Context) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                PolarVoyageMLKitQuantumEpic5634 polarVoyageMLKitQuantumEpic5634 = (PolarVoyageMLKitQuantumEpic5634) polarVoyagePoseDetectionMasterTitanium4242.PolarVoyageMotionLayoutTransitionHeroVision4068;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i2 = type != 9 ? 8 : 7;
                                        }
                                        i2 = 5;
                                    }
                                }
                                i2 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i2 = 3;
                                    break;
                                case 3:
                                case 4:
                                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i2 = 4;
                                    break;
                                case 13:
                                    i2 = 5;
                                    break;
                                case 18:
                                    i2 = 2;
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i2 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i2 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                    if (Build.VERSION.SDK_INT >= 31 || i2 != 5) {
                        polarVoyageMLKitQuantumEpic5634.PolarVoyageKotlinBetaPulseBeta3653(i2);
                        return;
                    }
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        telephonyManager.getClass();
                        PolarVoyageDragEventEpicForceOmega9157 polarVoyageDragEventEpicForceOmega9157 = new PolarVoyageDragEventEpicForceOmega9157(polarVoyageMLKitQuantumEpic5634);
                        telephonyManager.registerTelephonyCallback(polarVoyageMLKitQuantumEpic5634.PolarVoyageZipVortexCelestial6185, polarVoyageDragEventEpicForceOmega9157);
                        telephonyManager.unregisterTelephonyCallback(polarVoyageDragEventEpicForceOmega9157);
                        return;
                    } catch (RuntimeException unused2) {
                        polarVoyageMLKitQuantumEpic5634.PolarVoyageKotlinBetaPulseBeta3653(5);
                        return;
                    }
                }
                i2 = 0;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                polarVoyageMLKitQuantumEpic5634.PolarVoyageKotlinBetaPulseBeta3653(i2);
                return;
            case 1:
                ((PolarVoyageAssetManagerMasterQuantumHyper3660) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageLooperThreadAlphaPrime1279((PolarVoyagePaintMegaCelestial9975) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 2:
                PolarVoyageJobSchedulerVisionFusion2049 polarVoyageJobSchedulerVisionFusion2049 = (PolarVoyageJobSchedulerVisionFusion2049) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageRoomHyperCosmosEclipse5154 polarVoyageRoomHyperCosmosEclipse5154 = (PolarVoyageRoomHyperCosmosEclipse5154) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                PolarVoyageLiveDataScopeDeltaForce2288 polarVoyageLiveDataScopeDeltaForce2288 = polarVoyageJobSchedulerVisionFusion2049.PolarVoyageMotionLayoutTransitionHeroVision4068;
                String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                PolarVoyageZoomStateAlphaVision6590.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageLiveDataScopeDeltaForce2288.PolarVoyageZipVortexCelestial6185.PolarVoyageViewBindingPulseHeroSpeed5705, polarVoyageRoomHyperCosmosEclipse5154);
                return;
            case 3:
                PolarVoyageJobSchedulerVisionFusion2049 polarVoyageJobSchedulerVisionFusion20492 = (PolarVoyageJobSchedulerVisionFusion2049) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageObserverOlympianSpeed4485 polarVoyageObserverOlympianSpeed4485 = (PolarVoyageObserverOlympianSpeed4485) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                PolarVoyageLiveDataScopeDeltaForce2288 polarVoyageLiveDataScopeDeltaForce22882 = polarVoyageJobSchedulerVisionFusion20492.PolarVoyageMotionLayoutTransitionHeroVision4068;
                String str2 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                polarVoyageLiveDataScopeDeltaForce22882.PolarVoyageZipVortexCelestial6185.PolarVoyageViewRogueMaster4778.PolarVoyageBitmapVisionAuroraPixel4705(25, new PolarVoyageDialogHyperionOlympian3932(polarVoyageObserverOlympianSpeed4485));
                return;
            case 4:
                PolarVoyageJobSchedulerVisionFusion2049 polarVoyageJobSchedulerVisionFusion20493 = (PolarVoyageJobSchedulerVisionFusion2049) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageTransformNeoUltra1411 polarVoyageTransformNeoUltra1411 = (PolarVoyageTransformNeoUltra1411) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                synchronized (polarVoyageTransformNeoUltra1411) {
                }
                PolarVoyageLiveDataScopeDeltaForce2288 polarVoyageLiveDataScopeDeltaForce22883 = polarVoyageJobSchedulerVisionFusion20493.PolarVoyageMotionLayoutTransitionHeroVision4068;
                String str3 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                PolarVoyageDatabaseVortexUltraNova4004 polarVoyageDatabaseVortexUltraNova4004 = polarVoyageLiveDataScopeDeltaForce22883.PolarVoyageZipVortexCelestial6185.PolarVoyageNavigationViewHyperHyperHyperion1793;
                PolarVoyageLayoutInflaterPulseBeta9407 PolarVoyageViewBindingPulseHeroSpeed5705 = polarVoyageDatabaseVortexUltraNova4004.PolarVoyageViewBindingPulseHeroSpeed5705((PolarVoyageCombineBlazePulse1497) polarVoyageDatabaseVortexUltraNova4004.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageDiffUtilTurboStrike5735);
                polarVoyageDatabaseVortexUltraNova4004.PolarVoyageToolbarEclipseInfernoHero6368(PolarVoyageViewBindingPulseHeroSpeed5705, 1020, new PolarVoyageOnGlobalLayoutListenerTurboLegendHyperion3273(PolarVoyageViewBindingPulseHeroSpeed5705, polarVoyageTransformNeoUltra1411, i));
                return;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                PolarVoyageFaceDetectionAlphaHyperion4342 polarVoyageFaceDetectionAlphaHyperion4342 = (PolarVoyageFaceDetectionAlphaHyperion4342) this.PolarVoyageStrictModeLegendEpic1532;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                PolarVoyageBundlePhantomEclipseMega7910 polarVoyageBundlePhantomEclipseMega7910 = polarVoyageFaceDetectionAlphaHyperion4342.PolarVoyageZipVortexCelestial6185;
                polarVoyageBundlePhantomEclipseMega7910.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new PolarVoyageTextWatcherCelestialVortexCyber5187(i2, polarVoyageBundlePhantomEclipseMega7910, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            default:
                PolarVoyageBundlePhantomEclipseMega7910 polarVoyageBundlePhantomEclipseMega79102 = (PolarVoyageBundlePhantomEclipseMega7910) this.PolarVoyageStrictModeLegendEpic1532;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                synchronized (polarVoyageBundlePhantomEclipseMega79102) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) polarVoyageBundlePhantomEclipseMega79102.PolarVoyageRotateAnimationCyberCelestialDelta4768) != null) {
                        wakeLock.release();
                    }
                }
                return;
        }
    }
}
