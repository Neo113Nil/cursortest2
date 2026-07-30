package p000createpolar;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAdapterDelegateInfernoShadow5109 implements Runnable {
    public static final Object PolarVoyageCameraPixelBlaze2629 = new Object();
    public static Boolean PolarVoyageDrawableDeltaHyperion5742;
    public static Boolean PolarVoyageSnackbarGammaEclipse2140;
    public final PolarVoyageCameraHyperOmegaTitan1048 PolarVoyageBottomSheetOmegaNeo1907;
    public final Context PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PowerManager.WakeLock PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final PolarVoyagePaintFlagsDrawFilterThunderVortex4639 PolarVoyageStrictModeLegendEpic1532;
    public final long PolarVoyageViewRogueMaster4778;

    public PolarVoyageAdapterDelegateInfernoShadow5109(PolarVoyageCameraHyperOmegaTitan1048 polarVoyageCameraHyperOmegaTitan1048, Context context, PolarVoyagePaintFlagsDrawFilterThunderVortex4639 polarVoyagePaintFlagsDrawFilterThunderVortex4639, long j) {
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageCameraHyperOmegaTitan1048;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = context;
        this.PolarVoyageViewRogueMaster4778 = j;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyagePaintFlagsDrawFilterThunderVortex4639;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean PolarVoyageKotlinBetaPulseBeta3653(Context context) {
        boolean booleanValue;
        synchronized (PolarVoyageCameraPixelBlaze2629) {
            try {
                Boolean bool = PolarVoyageDrawableDeltaHyperion5742;
                Boolean valueOf = Boolean.valueOf(bool == null ? PolarVoyageMotionLayoutTransitionHeroVision4068(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                PolarVoyageDrawableDeltaHyperion5742 = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean PolarVoyageMotionLayoutTransitionHeroVision4068(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    public static boolean PolarVoyageZipVortexCelestial6185(Context context) {
        boolean booleanValue;
        synchronized (PolarVoyageCameraPixelBlaze2629) {
            try {
                Boolean bool = PolarVoyageSnackbarGammaEclipse2140;
                Boolean valueOf = Boolean.valueOf(bool == null ? PolarVoyageMotionLayoutTransitionHeroVision4068(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                PolarVoyageSnackbarGammaEclipse2140 = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        boolean z;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.PolarVoyageItemDecorationUltraDeltaEpic7485.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        PolarVoyageCameraHyperOmegaTitan1048 polarVoyageCameraHyperOmegaTitan1048 = this.PolarVoyageBottomSheetOmegaNeo1907;
        Context context = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        boolean PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageKotlinBetaPulseBeta3653(context);
        PowerManager.WakeLock wakeLock = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (PolarVoyageKotlinBetaPulseBeta3653) {
            wakeLock.acquire(180000L);
        }
        try {
            try {
                try {
                    polarVoyageCameraHyperOmegaTitan1048.PolarVoyageBarcodeScannerInfernoSolarSpark7767(true);
                    if (!this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageBitmapVisionAuroraPixel4705()) {
                        polarVoyageCameraHyperOmegaTitan1048.PolarVoyageBarcodeScannerInfernoSolarSpark7767(false);
                        if (PolarVoyageKotlinBetaPulseBeta3653(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (!PolarVoyageZipVortexCelestial6185(context) || PolarVoyageBarcodeScannerInfernoSolarSpark7767()) {
                        if (polarVoyageCameraHyperOmegaTitan1048.PolarVoyageBitmapVisionAuroraPixel4705()) {
                            polarVoyageCameraHyperOmegaTitan1048.PolarVoyageBarcodeScannerInfernoSolarSpark7767(false);
                        } else {
                            polarVoyageCameraHyperOmegaTitan1048.PolarVoyageDiffUtilTurboStrike5735(this.PolarVoyageViewRogueMaster4778);
                        }
                        if (PolarVoyageKotlinBetaPulseBeta3653(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    new PolarVoyageServiceInfoSolarPhantom3718(this, this).PolarVoyageZipVortexCelestial6185();
                    if (PolarVoyageKotlinBetaPulseBeta3653(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (RuntimeException unused3) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                polarVoyageCameraHyperOmegaTitan1048.PolarVoyageBarcodeScannerInfernoSolarSpark7767(false);
                if (PolarVoyageKotlinBetaPulseBeta3653(context)) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th) {
            if (PolarVoyageKotlinBetaPulseBeta3653(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
