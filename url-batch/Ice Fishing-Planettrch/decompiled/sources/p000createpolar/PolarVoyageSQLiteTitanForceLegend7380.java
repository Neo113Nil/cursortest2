package p000createpolar;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.util.Log;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageSQLiteTitanForceLegend7380 {
    public static PolarVoyageSQLiteTitanForceLegend7380 PolarVoyageBitmapVisionAuroraPixel4705;
    public Object PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public Object PolarVoyageKotlinBetaPulseBeta3653;
    public final Object PolarVoyageMotionLayoutTransitionHeroVision4068;
    public int PolarVoyageZipVortexCelestial6185;

    public PolarVoyageSQLiteTitanForceLegend7380(Bundle bundle) {
        bundle.getClass();
        String string = bundle.getString("nav-entry-state:id");
        if (string == null) {
            PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageBottomSheetOmegaNeo1907("nav-entry-state:id");
            throw null;
        }
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = string;
        this.PolarVoyageZipVortexCelestial6185 = PolarVoyagePackageManagerNeoNeoTurbo8097.PolarVoyageBarcodeScannerInfernoSolarSpark7767(bundle, "nav-entry-state:destination-id");
        Bundle bundle2 = bundle.getBundle("nav-entry-state:args");
        if (bundle2 == null) {
            PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageBottomSheetOmegaNeo1907("nav-entry-state:args");
            throw null;
        }
        this.PolarVoyageKotlinBetaPulseBeta3653 = bundle2;
        Bundle bundle3 = bundle.getBundle("nav-entry-state:saved-state");
        if (bundle3 != null) {
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = bundle3;
        } else {
            PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageBottomSheetOmegaNeo1907("nav-entry-state:saved-state");
            throw null;
        }
    }

    public static synchronized PolarVoyageSQLiteTitanForceLegend7380 PolarVoyageViewRogueMaster4778(Context context) {
        PolarVoyageSQLiteTitanForceLegend7380 polarVoyageSQLiteTitanForceLegend7380;
        synchronized (PolarVoyageSQLiteTitanForceLegend7380.class) {
            try {
                if (PolarVoyageBitmapVisionAuroraPixel4705 == null) {
                    PolarVoyageBitmapVisionAuroraPixel4705 = new PolarVoyageSQLiteTitanForceLegend7380(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new PolarVoyageAsyncEpicCelestialSpectra3691("MessengerIpcClient"))));
                }
                polarVoyageSQLiteTitanForceLegend7380 = PolarVoyageBitmapVisionAuroraPixel4705;
            } catch (Throwable th) {
                throw th;
            }
        }
        return polarVoyageSQLiteTitanForceLegend7380;
    }

    public void PolarVoyageBarcodeScannerInfernoSolarSpark7767(float f) {
        ((Paint) this.PolarVoyageMotionLayoutTransitionHeroVision4068).setAlpha((int) Math.rint(f * 255.0f));
    }

    public void PolarVoyageBitmapVisionAuroraPixel4705(int i) {
        if (this.PolarVoyageZipVortexCelestial6185 == i) {
            return;
        }
        this.PolarVoyageZipVortexCelestial6185 = i;
        Paint paint = (Paint) this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(PolarVoyageTransformNeoTitanium1654.PolarVoyageAlarmManagerShadowHyperBeta8339(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(PolarVoyageTransformNeoTitanium1654.PolarVoyageConfigurationMaxSpectraForce5418(i)));
        }
    }

    public void PolarVoyageBottomSheetOmegaNeo1907(int i) {
        ((Paint) this.PolarVoyageMotionLayoutTransitionHeroVision4068).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public synchronized PolarVoyageDialogFragmentTitanCelestial7995 PolarVoyageCameraPixelBlaze2629(PolarVoyageAnimatorHeroPrime4575 polarVoyageAnimatorHeroPrime4575) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(polarVoyageAnimatorHeroPrime4575.toString()));
            }
            if (!((PolarVoyageFCMShadowUltra8547) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767).PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageAnimatorHeroPrime4575)) {
                PolarVoyageFCMShadowUltra8547 polarVoyageFCMShadowUltra8547 = new PolarVoyageFCMShadowUltra8547(this);
                this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageFCMShadowUltra8547;
                polarVoyageFCMShadowUltra8547.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageAnimatorHeroPrime4575);
            }
        } catch (Throwable th) {
            throw th;
        }
        return polarVoyageAnimatorHeroPrime4575.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185;
    }

    public void PolarVoyageDiffUtilTurboStrike5735(long j) {
        ((Paint) this.PolarVoyageMotionLayoutTransitionHeroVision4068).setColor(PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageGuidelineStormSolar2850(j));
    }

    public void PolarVoyageItemDecorationUltraDeltaEpic7485(Shader shader) {
        this.PolarVoyageKotlinBetaPulseBeta3653 = shader;
        ((Paint) this.PolarVoyageMotionLayoutTransitionHeroVision4068).setShader(shader);
    }

    public void PolarVoyageKotlinBetaPulseBeta3653() {
        HandlerThread handlerThread;
        synchronized (this.PolarVoyageMotionLayoutTransitionHeroVision4068) {
            try {
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(this.PolarVoyageZipVortexCelestial6185 > 0);
                int i = this.PolarVoyageZipVortexCelestial6185 - 1;
                this.PolarVoyageZipVortexCelestial6185 = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767) != null) {
                    handlerThread.quit();
                    this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = null;
                    this.PolarVoyageKotlinBetaPulseBeta3653 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int PolarVoyageMotionLayoutTransitionHeroVision4068() {
        Paint.Join strokeJoin = ((Paint) this.PolarVoyageMotionLayoutTransitionHeroVision4068).getStrokeJoin();
        int i = strokeJoin == null ? -1 : PolarVoyagePushNotificationCyberMasterHero2151.PolarVoyageMotionLayoutTransitionHeroVision4068[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public void PolarVoyageRotateAnimationCyberCelestialDelta4768(int i) {
        ((Paint) this.PolarVoyageMotionLayoutTransitionHeroVision4068).setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void PolarVoyageStrictModeLegendEpic1532(int i) {
        ((Paint) this.PolarVoyageMotionLayoutTransitionHeroVision4068).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageContentResolverMasterEclipseElite2308 polarVoyageContentResolverMasterEclipseElite2308) {
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageContentResolverMasterEclipseElite2308;
        ((Paint) this.PolarVoyageMotionLayoutTransitionHeroVision4068).setColorFilter(polarVoyageContentResolverMasterEclipseElite2308 != null ? polarVoyageContentResolverMasterEclipseElite2308.PolarVoyageZipVortexCelestial6185 : null);
    }

    public int PolarVoyageZipVortexCelestial6185() {
        Paint.Cap strokeCap = ((Paint) this.PolarVoyageMotionLayoutTransitionHeroVision4068).getStrokeCap();
        int i = strokeCap == null ? -1 : PolarVoyagePushNotificationCyberMasterHero2151.PolarVoyageZipVortexCelestial6185[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public PolarVoyageSQLiteTitanForceLegend7380(PolarVoyagePoseDetectionCelestialPhoenix4774 polarVoyagePoseDetectionCelestialPhoenix4774, int i) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyagePoseDetectionCelestialPhoenix4774.PolarVoyageCameraPixelBlaze2629;
        this.PolarVoyageZipVortexCelestial6185 = i;
        PolarVoyageR8ShadowLegendSpectra1821 polarVoyageR8ShadowLegendSpectra1821 = polarVoyagePoseDetectionCelestialPhoenix4774.PolarVoyageSnackbarGammaEclipse2140;
        this.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageR8ShadowLegendSpectra1821.PolarVoyageZipVortexCelestial6185();
        Bundle PolarVoyageStrictModeLegendEpic1532 = PolarVoyageTransformNeoTitanium1654.PolarVoyageStrictModeLegendEpic1532((PolarVoyageRippleDrawableRogueBlazeBlaze8980[]) Arrays.copyOf(new PolarVoyageRippleDrawableRogueBlazeBlaze8980[0], 0));
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageStrictModeLegendEpic1532;
        polarVoyageR8ShadowLegendSpectra1821.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageAlarmManagerShadowHyperBeta8339(PolarVoyageStrictModeLegendEpic1532);
    }

    public PolarVoyageSQLiteTitanForceLegend7380(Paint paint) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = paint;
        this.PolarVoyageZipVortexCelestial6185 = 3;
    }

    public PolarVoyageSQLiteTitanForceLegend7380(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new PolarVoyageFCMShadowUltra8547(this);
        this.PolarVoyageZipVortexCelestial6185 = 1;
        this.PolarVoyageKotlinBetaPulseBeta3653 = scheduledExecutorService;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = context.getApplicationContext();
    }

    public PolarVoyageSQLiteTitanForceLegend7380() {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = new Object();
        this.PolarVoyageKotlinBetaPulseBeta3653 = null;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = null;
        this.PolarVoyageZipVortexCelestial6185 = 0;
    }
}
