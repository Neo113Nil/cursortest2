package p000createpolar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageServiceInfoSolarPhantom3718 extends BroadcastReceiver {
    public final /* synthetic */ PolarVoyageAdapterDelegateInfernoShadow5109 PolarVoyageMotionLayoutTransitionHeroVision4068;
    public PolarVoyageAdapterDelegateInfernoShadow5109 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageServiceInfoSolarPhantom3718(PolarVoyageAdapterDelegateInfernoShadow5109 polarVoyageAdapterDelegateInfernoShadow5109, PolarVoyageAdapterDelegateInfernoShadow5109 polarVoyageAdapterDelegateInfernoShadow51092) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageAdapterDelegateInfernoShadow5109;
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageAdapterDelegateInfernoShadow51092;
    }

    public final void PolarVoyageZipVortexCelestial6185() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageItemDecorationUltraDeltaEpic7485.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            PolarVoyageAdapterDelegateInfernoShadow5109 polarVoyageAdapterDelegateInfernoShadow5109 = this.PolarVoyageZipVortexCelestial6185;
            if (polarVoyageAdapterDelegateInfernoShadow5109 == null) {
                return;
            }
            if (polarVoyageAdapterDelegateInfernoShadow5109.PolarVoyageBarcodeScannerInfernoSolarSpark7767()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                PolarVoyageAdapterDelegateInfernoShadow5109 polarVoyageAdapterDelegateInfernoShadow51092 = this.PolarVoyageZipVortexCelestial6185;
                polarVoyageAdapterDelegateInfernoShadow51092.PolarVoyageBottomSheetOmegaNeo1907.PolarVoyageDiffUtilTurboStrike5735.schedule(polarVoyageAdapterDelegateInfernoShadow51092, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.PolarVoyageZipVortexCelestial6185 = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
