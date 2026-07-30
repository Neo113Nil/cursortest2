package p000createpolar;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageBroadcastPhantomTitan9115 implements ServiceConnection {
    public IBinder PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final PolarVoyageProGuardPulseStrikeForce2310 PolarVoyageBitmapVisionAuroraPixel4705;
    public ComponentName PolarVoyageDiffUtilTurboStrike5735;
    public boolean PolarVoyageKotlinBetaPulseBeta3653;
    public final /* synthetic */ PolarVoyageFragmentCelestialDragonNovaX2958 PolarVoyageTextInputEditTextNebulaHero6651;
    public final HashMap PolarVoyageZipVortexCelestial6185 = new HashMap();
    public int PolarVoyageMotionLayoutTransitionHeroVision4068 = 2;

    public PolarVoyageBroadcastPhantomTitan9115(PolarVoyageFragmentCelestialDragonNovaX2958 polarVoyageFragmentCelestialDragonNovaX2958, PolarVoyageProGuardPulseStrikeForce2310 polarVoyageProGuardPulseStrikeForce2310) {
        this.PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageFragmentCelestialDragonNovaX2958;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageProGuardPulseStrikeForce2310;
    }

    public final void PolarVoyageZipVortexCelestial6185(String str, Executor executor) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            PolarVoyageFragmentCelestialDragonNovaX2958 polarVoyageFragmentCelestialDragonNovaX2958 = this.PolarVoyageTextInputEditTextNebulaHero6651;
            PolarVoyageRealtimeDatabaseEclipseUltra8894 polarVoyageRealtimeDatabaseEclipseUltra8894 = polarVoyageFragmentCelestialDragonNovaX2958.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            Context context = polarVoyageFragmentCelestialDragonNovaX2958.PolarVoyageMotionLayoutTransitionHeroVision4068;
            boolean PolarVoyageLayerDrawableShadowTitaniumOmega1942 = polarVoyageRealtimeDatabaseEclipseUltra8894.PolarVoyageLayerDrawableShadowTitaniumOmega1942(context, str, this.PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageZipVortexCelestial6185(context), this, 4225, executor);
            this.PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageLayerDrawableShadowTitaniumOmega1942;
            if (PolarVoyageLayerDrawableShadowTitaniumOmega1942) {
                this.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageKotlinBetaPulseBeta3653.sendMessageDelayed(this.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageKotlinBetaPulseBeta3653.obtainMessage(1, this.PolarVoyageBitmapVisionAuroraPixel4705), this.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageDiffUtilTurboStrike5735);
            } else {
                this.PolarVoyageMotionLayoutTransitionHeroVision4068 = 2;
                try {
                    PolarVoyageFragmentCelestialDragonNovaX2958 polarVoyageFragmentCelestialDragonNovaX29582 = this.PolarVoyageTextInputEditTextNebulaHero6651;
                    polarVoyageFragmentCelestialDragonNovaX29582.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageBitmapMaxTitanTitan7960(polarVoyageFragmentCelestialDragonNovaX29582.PolarVoyageMotionLayoutTransitionHeroVision4068, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185) {
            try {
                this.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageKotlinBetaPulseBeta3653.removeMessages(1, this.PolarVoyageBitmapVisionAuroraPixel4705);
                this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = iBinder;
                this.PolarVoyageDiffUtilTurboStrike5735 = componentName;
                Iterator it = this.PolarVoyageZipVortexCelestial6185.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.PolarVoyageMotionLayoutTransitionHeroVision4068 = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185) {
            try {
                this.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageKotlinBetaPulseBeta3653.removeMessages(1, this.PolarVoyageBitmapVisionAuroraPixel4705);
                this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = null;
                this.PolarVoyageDiffUtilTurboStrike5735 = componentName;
                Iterator it = this.PolarVoyageZipVortexCelestial6185.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.PolarVoyageMotionLayoutTransitionHeroVision4068 = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
