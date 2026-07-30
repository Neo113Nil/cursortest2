package p000createpolar;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageInterstitialAdEpicPulse3280 implements ServiceConnection {
    public final ArrayDeque PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public PolarVoyageLaunchPrimeStrikeRogue2575 PolarVoyageBitmapVisionAuroraPixel4705;
    public boolean PolarVoyageDiffUtilTurboStrike5735;
    public final ScheduledThreadPoolExecutor PolarVoyageKotlinBetaPulseBeta3653;
    public final Intent PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final Context PolarVoyageZipVortexCelestial6185;

    public PolarVoyageInterstitialAdEpicPulse3280(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new PolarVoyageAsyncEpicCelestialSpectra3691("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new ArrayDeque();
        this.PolarVoyageDiffUtilTurboStrike5735 = false;
        Context applicationContext = context.getApplicationContext();
        this.PolarVoyageZipVortexCelestial6185 = applicationContext;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.PolarVoyageKotlinBetaPulseBeta3653 = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[LOOP:0: B:18:0x0054->B:20:0x005c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageKotlinBetaPulseBeta3653() {
        PolarVoyageInterstitialAdEpicPulse3280 polarVoyageInterstitialAdEpicPulse3280;
        ArrayDeque arrayDeque;
        PolarVoyageRealtimeDatabaseEclipseUltra8894 PolarVoyageViewRogueMaster4778;
        Context context;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.PolarVoyageDiffUtilTurboStrike5735);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.PolarVoyageDiffUtilTurboStrike5735) {
            return;
        }
        this.PolarVoyageDiffUtilTurboStrike5735 = true;
        try {
            PolarVoyageViewRogueMaster4778 = PolarVoyageRealtimeDatabaseEclipseUltra8894.PolarVoyageViewRogueMaster4778();
            context = this.PolarVoyageZipVortexCelestial6185;
            polarVoyageInterstitialAdEpicPulse3280 = this;
            try {
            } catch (SecurityException e) {
                e = e;
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
                polarVoyageInterstitialAdEpicPulse3280.PolarVoyageDiffUtilTurboStrike5735 = false;
                while (true) {
                    arrayDeque = polarVoyageInterstitialAdEpicPulse3280.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                    if (!arrayDeque.isEmpty()) {
                    }
                    ((PolarVoyageContextShadowStrikeCelestial9029) arrayDeque.poll()).PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageKotlinBetaPulseBeta3653(null);
                }
            }
        } catch (SecurityException e2) {
            e = e2;
            polarVoyageInterstitialAdEpicPulse3280 = this;
        }
        if (PolarVoyageViewRogueMaster4778.PolarVoyageLayerDrawableShadowTitaniumOmega1942(context, context.getClass().getName(), this.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageInterstitialAdEpicPulse3280, 65, null)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        polarVoyageInterstitialAdEpicPulse3280.PolarVoyageDiffUtilTurboStrike5735 = false;
        while (true) {
            arrayDeque = polarVoyageInterstitialAdEpicPulse3280.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            if (!arrayDeque.isEmpty()) {
                return;
            } else {
                ((PolarVoyageContextShadowStrikeCelestial9029) arrayDeque.poll()).PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageKotlinBetaPulseBeta3653(null);
            }
        }
    }

    public final synchronized PolarVoyageDialogFragmentTitanCelestial7995 PolarVoyageMotionLayoutTransitionHeroVision4068(Intent intent) {
        PolarVoyageContextShadowStrikeCelestial9029 polarVoyageContextShadowStrikeCelestial9029;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            polarVoyageContextShadowStrikeCelestial9029 = new PolarVoyageContextShadowStrikeCelestial9029(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.PolarVoyageKotlinBetaPulseBeta3653;
            polarVoyageContextShadowStrikeCelestial9029.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185(scheduledThreadPoolExecutor, new PolarVoyageOnGlobalLayoutListenerTurboLegendHyperion3273(28, scheduledThreadPoolExecutor.schedule(new PolarVoyageLightSensorSparkBlazeTitanium9192(27, polarVoyageContextShadowStrikeCelestial9029), 20L, TimeUnit.SECONDS)));
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.add(polarVoyageContextShadowStrikeCelestial9029);
            PolarVoyageZipVortexCelestial6185();
        } catch (Throwable th) {
            throw th;
        }
        return polarVoyageContextShadowStrikeCelestial9029.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185;
    }

    public final synchronized void PolarVoyageZipVortexCelestial6185() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                PolarVoyageLaunchPrimeStrikeRogue2575 polarVoyageLaunchPrimeStrikeRogue2575 = this.PolarVoyageBitmapVisionAuroraPixel4705;
                if (polarVoyageLaunchPrimeStrikeRogue2575 == null || !polarVoyageLaunchPrimeStrikeRogue2575.isBinderAlive()) {
                    PolarVoyageKotlinBetaPulseBeta3653();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageZipVortexCelestial6185((PolarVoyageContextShadowStrikeCelestial9029) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.PolarVoyageDiffUtilTurboStrike5735 = false;
            if (iBinder instanceof PolarVoyageLaunchPrimeStrikeRogue2575) {
                this.PolarVoyageBitmapVisionAuroraPixel4705 = (PolarVoyageLaunchPrimeStrikeRogue2575) iBinder;
                PolarVoyageZipVortexCelestial6185();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            while (!arrayDeque.isEmpty()) {
                ((PolarVoyageContextShadowStrikeCelestial9029) arrayDeque.poll()).PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageKotlinBetaPulseBeta3653(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        PolarVoyageZipVortexCelestial6185();
    }
}
