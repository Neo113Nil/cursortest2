package p000createpolar;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFragmentCelestialDragonNovaX2958 {
    public static PolarVoyageFragmentCelestialDragonNovaX2958 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public static HandlerThread PolarVoyageStrictModeLegendEpic1532;
    public static final Object PolarVoyageTextInputEditTextNebulaHero6651 = new Object();
    public final PolarVoyageRealtimeDatabaseEclipseUltra8894 PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final long PolarVoyageBitmapVisionAuroraPixel4705;
    public final long PolarVoyageDiffUtilTurboStrike5735;
    public volatile PolarVoyageLayoutTitaniumOlympian9962 PolarVoyageKotlinBetaPulseBeta3653;
    public final Context PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final HashMap PolarVoyageZipVortexCelestial6185 = new HashMap();

    public PolarVoyageFragmentCelestialDragonNovaX2958(Context context, Looper looper) {
        PolarVoyageToastPhantomRogue2255 polarVoyageToastPhantomRogue2255 = new PolarVoyageToastPhantomRogue2255(1, this);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = context.getApplicationContext();
        PolarVoyageLayoutTitaniumOlympian9962 polarVoyageLayoutTitaniumOlympian9962 = new PolarVoyageLayoutTitaniumOlympian9962(looper, polarVoyageToastPhantomRogue2255);
        Looper.getMainLooper();
        this.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageLayoutTitaniumOlympian9962;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageRealtimeDatabaseEclipseUltra8894.PolarVoyageViewRogueMaster4778();
        this.PolarVoyageBitmapVisionAuroraPixel4705 = 5000L;
        this.PolarVoyageDiffUtilTurboStrike5735 = 300000L;
    }

    public final boolean PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageProGuardPulseStrikeForce2310 polarVoyageProGuardPulseStrikeForce2310, PolarVoyageOnDeviceTranslatorShadowTurboNeo2626 polarVoyageOnDeviceTranslatorShadowTurboNeo2626, String str) {
        boolean z;
        synchronized (this.PolarVoyageZipVortexCelestial6185) {
            try {
                PolarVoyageBroadcastPhantomTitan9115 polarVoyageBroadcastPhantomTitan9115 = (PolarVoyageBroadcastPhantomTitan9115) this.PolarVoyageZipVortexCelestial6185.get(polarVoyageProGuardPulseStrikeForce2310);
                if (polarVoyageBroadcastPhantomTitan9115 == null) {
                    polarVoyageBroadcastPhantomTitan9115 = new PolarVoyageBroadcastPhantomTitan9115(this, polarVoyageProGuardPulseStrikeForce2310);
                    polarVoyageBroadcastPhantomTitan9115.PolarVoyageZipVortexCelestial6185.put(polarVoyageOnDeviceTranslatorShadowTurboNeo2626, polarVoyageOnDeviceTranslatorShadowTurboNeo2626);
                    polarVoyageBroadcastPhantomTitan9115.PolarVoyageZipVortexCelestial6185(str, null);
                    this.PolarVoyageZipVortexCelestial6185.put(polarVoyageProGuardPulseStrikeForce2310, polarVoyageBroadcastPhantomTitan9115);
                } else {
                    this.PolarVoyageKotlinBetaPulseBeta3653.removeMessages(0, polarVoyageProGuardPulseStrikeForce2310);
                    if (polarVoyageBroadcastPhantomTitan9115.PolarVoyageZipVortexCelestial6185.containsKey(polarVoyageOnDeviceTranslatorShadowTurboNeo2626)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(polarVoyageProGuardPulseStrikeForce2310.toString()));
                    }
                    polarVoyageBroadcastPhantomTitan9115.PolarVoyageZipVortexCelestial6185.put(polarVoyageOnDeviceTranslatorShadowTurboNeo2626, polarVoyageOnDeviceTranslatorShadowTurboNeo2626);
                    int i = polarVoyageBroadcastPhantomTitan9115.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    if (i == 1) {
                        polarVoyageOnDeviceTranslatorShadowTurboNeo2626.onServiceConnected(polarVoyageBroadcastPhantomTitan9115.PolarVoyageDiffUtilTurboStrike5735, polarVoyageBroadcastPhantomTitan9115.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                    } else if (i == 2) {
                        polarVoyageBroadcastPhantomTitan9115.PolarVoyageZipVortexCelestial6185(str, null);
                    }
                }
                z = polarVoyageBroadcastPhantomTitan9115.PolarVoyageKotlinBetaPulseBeta3653;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void PolarVoyageZipVortexCelestial6185(String str, ServiceConnection serviceConnection, boolean z) {
        PolarVoyageProGuardPulseStrikeForce2310 polarVoyageProGuardPulseStrikeForce2310 = new PolarVoyageProGuardPulseStrikeForce2310(str, z);
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageLayerDrawableShadowTitaniumOmega1942(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.PolarVoyageZipVortexCelestial6185) {
            try {
                PolarVoyageBroadcastPhantomTitan9115 polarVoyageBroadcastPhantomTitan9115 = (PolarVoyageBroadcastPhantomTitan9115) this.PolarVoyageZipVortexCelestial6185.get(polarVoyageProGuardPulseStrikeForce2310);
                if (polarVoyageBroadcastPhantomTitan9115 == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(polarVoyageProGuardPulseStrikeForce2310.toString()));
                }
                if (!polarVoyageBroadcastPhantomTitan9115.PolarVoyageZipVortexCelestial6185.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(polarVoyageProGuardPulseStrikeForce2310.toString()));
                }
                polarVoyageBroadcastPhantomTitan9115.PolarVoyageZipVortexCelestial6185.remove(serviceConnection);
                if (polarVoyageBroadcastPhantomTitan9115.PolarVoyageZipVortexCelestial6185.isEmpty()) {
                    this.PolarVoyageKotlinBetaPulseBeta3653.sendMessageDelayed(this.PolarVoyageKotlinBetaPulseBeta3653.obtainMessage(0, polarVoyageProGuardPulseStrikeForce2310), this.PolarVoyageBitmapVisionAuroraPixel4705);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
