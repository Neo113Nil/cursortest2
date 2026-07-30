package p000createpolar;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageAnimationSetEclipseBlaze5194 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ Object PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageAnimationSetEclipseBlaze5194(int i, Object obj, Object obj2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                PolarVoyageFCMShadowUltra8547 polarVoyageFCMShadowUltra8547 = (PolarVoyageFCMShadowUltra8547) this.PolarVoyageStrictModeLegendEpic1532;
                IBinder iBinder = (IBinder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                synchronized (polarVoyageFCMShadowUltra8547) {
                    if (iBinder == null) {
                        polarVoyageFCMShadowUltra8547.PolarVoyageZipVortexCelestial6185("Null service connection");
                    } else {
                        try {
                            polarVoyageFCMShadowUltra8547.PolarVoyageKotlinBetaPulseBeta3653 = new PolarVoyageBundlePhantomEclipseMega7910(iBinder);
                            polarVoyageFCMShadowUltra8547.PolarVoyageZipVortexCelestial6185 = 2;
                            ((ScheduledExecutorService) polarVoyageFCMShadowUltra8547.PolarVoyageDiffUtilTurboStrike5735.PolarVoyageKotlinBetaPulseBeta3653).execute(new PolarVoyageOnAttachStateChangeListenerNebulaEclipse2024(polarVoyageFCMShadowUltra8547, 0));
                        } catch (RemoteException e) {
                            polarVoyageFCMShadowUltra8547.PolarVoyageZipVortexCelestial6185(e.getMessage());
                        }
                    }
                }
                return;
            case 1:
                synchronized (((PolarVoyageOnItemClickListenerFusionCelestial9091) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                    PolarVoyageMotionLayoutMegaCosmosVision2977 polarVoyageMotionLayoutMegaCosmosVision2977 = (PolarVoyageMotionLayoutMegaCosmosVision2977) ((PolarVoyageOnItemClickListenerFusionCelestial9091) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageBottomSheetOmegaNeo1907;
                    Exception PolarVoyageBitmapVisionAuroraPixel4705 = ((PolarVoyageDialogFragmentTitanCelestial7995) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageBitmapVisionAuroraPixel4705();
                    PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageDisplayMetricsVortexDragon9516(PolarVoyageBitmapVisionAuroraPixel4705);
                    polarVoyageMotionLayoutMegaCosmosVision2977.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageBitmapVisionAuroraPixel4705);
                }
                return;
            case 2:
                synchronized (((PolarVoyageOnItemClickListenerFusionCelestial9091) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                    ((PolarVoyageHandlerRogueCelestialAlpha4942) ((PolarVoyageOnItemClickListenerFusionCelestial9091) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageMotionLayoutTransitionHeroVision4068(((PolarVoyageDialogFragmentTitanCelestial7995) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageDiffUtilTurboStrike5735());
                }
                return;
            case 3:
                PolarVoyageFCMShadowUltra8547 polarVoyageFCMShadowUltra85472 = (PolarVoyageFCMShadowUltra8547) this.PolarVoyageStrictModeLegendEpic1532;
                int i = ((PolarVoyageAnimatorHeroPrime4575) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageZipVortexCelestial6185;
                synchronized (polarVoyageFCMShadowUltra85472) {
                    PolarVoyageAnimatorHeroPrime4575 polarVoyageAnimatorHeroPrime4575 = (PolarVoyageAnimatorHeroPrime4575) polarVoyageFCMShadowUltra85472.PolarVoyageBitmapVisionAuroraPixel4705.get(i);
                    if (polarVoyageAnimatorHeroPrime4575 != null) {
                        Log.w("MessengerIpcClient", "Timing out request: " + i);
                        polarVoyageFCMShadowUltra85472.PolarVoyageBitmapVisionAuroraPixel4705.remove(i);
                        polarVoyageAnimatorHeroPrime4575.PolarVoyageMotionLayoutTransitionHeroVision4068(new PolarVoyageBarcodeScannerOlympianNeoShadow6002("Timed out waiting for response", null));
                        polarVoyageFCMShadowUltra85472.PolarVoyageKotlinBetaPulseBeta3653();
                    }
                }
                return;
            case 4:
                PolarVoyageOnItemClickListenerFusionCelestial9091 polarVoyageOnItemClickListenerFusionCelestial9091 = (PolarVoyageOnItemClickListenerFusionCelestial9091) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                PolarVoyageDialogFragmentTitanCelestial7995 polarVoyageDialogFragmentTitanCelestial7995 = (PolarVoyageDialogFragmentTitanCelestial7995) polarVoyageOnItemClickListenerFusionCelestial9091.PolarVoyageBottomSheetOmegaNeo1907;
                try {
                    PolarVoyageDialogFragmentTitanCelestial7995 PolarVoyageStrictModeLegendEpic1532 = ((PolarVoyageFirebaseModelDownloadConditionsAuroraGammaOmega1755) polarVoyageOnItemClickListenerFusionCelestial9091.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageStrictModeLegendEpic1532(((PolarVoyageDialogFragmentTitanCelestial7995) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageDiffUtilTurboStrike5735());
                    PolarVoyageSurfaceViewMegaSparkShadow6231 polarVoyageSurfaceViewMegaSparkShadow6231 = PolarVoyageStrictModeLegendEpic1532.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    PolarVoyageViewPager2InfernoEpic1202 polarVoyageViewPager2InfernoEpic1202 = PolarVoyageDrawableForcePrime1969.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    PolarVoyageStrictModeLegendEpic1532.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageViewPager2InfernoEpic1202, polarVoyageOnItemClickListenerFusionCelestial9091);
                    polarVoyageSurfaceViewMegaSparkShadow6231.PolarVoyageBitmapVisionAuroraPixel4705(new PolarVoyageOnItemClickListenerFusionCelestial9091((Executor) polarVoyageViewPager2InfernoEpic1202, (PolarVoyageMotionLayoutMegaCosmosVision2977) polarVoyageOnItemClickListenerFusionCelestial9091));
                    PolarVoyageStrictModeLegendEpic1532.PolarVoyageDrawableDeltaHyperion5742();
                    polarVoyageSurfaceViewMegaSparkShadow6231.PolarVoyageBitmapVisionAuroraPixel4705(new PolarVoyageOnItemClickListenerFusionCelestial9091((Executor) polarVoyageViewPager2InfernoEpic1202, (PolarVoyageTimerUltraHeroForce1819) polarVoyageOnItemClickListenerFusionCelestial9091));
                    PolarVoyageStrictModeLegendEpic1532.PolarVoyageDrawableDeltaHyperion5742();
                    return;
                } catch (PolarVoyageFilterVisionMax1453 e2) {
                    if (e2.getCause() instanceof Exception) {
                        polarVoyageOnItemClickListenerFusionCelestial9091.PolarVoyageBarcodeScannerInfernoSolarSpark7767((Exception) e2.getCause());
                        return;
                    } else {
                        polarVoyageDialogFragmentTitanCelestial7995.PolarVoyageRotateAnimationCyberCelestialDelta4768(e2);
                        return;
                    }
                } catch (CancellationException unused) {
                    polarVoyageOnItemClickListenerFusionCelestial9091.PolarVoyageZipVortexCelestial6185();
                    return;
                } catch (Exception e3) {
                    polarVoyageDialogFragmentTitanCelestial7995.PolarVoyageRotateAnimationCyberCelestialDelta4768(e3);
                    return;
                }
            default:
                PolarVoyageDialogFragmentTitanCelestial7995 polarVoyageDialogFragmentTitanCelestial79952 = (PolarVoyageDialogFragmentTitanCelestial7995) this.PolarVoyageStrictModeLegendEpic1532;
                try {
                    polarVoyageDialogFragmentTitanCelestial79952.PolarVoyageBottomSheetOmegaNeo1907(((Callable) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).call());
                    return;
                } catch (Exception e4) {
                    polarVoyageDialogFragmentTitanCelestial79952.PolarVoyageRotateAnimationCyberCelestialDelta4768(e4);
                    return;
                } catch (Throwable th) {
                    polarVoyageDialogFragmentTitanCelestial79952.PolarVoyageRotateAnimationCyberCelestialDelta4768(new RuntimeException(th));
                    return;
                }
        }
    }

    public /* synthetic */ PolarVoyageAnimationSetEclipseBlaze5194(PolarVoyagePushNotificationPixelFusion3898 polarVoyagePushNotificationPixelFusion3898, PolarVoyageDialogFragmentTitanCelestial7995 polarVoyageDialogFragmentTitanCelestial7995, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyagePushNotificationPixelFusion3898;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageDialogFragmentTitanCelestial7995;
    }
}
