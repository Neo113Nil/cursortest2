package p000createpolar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePropertyValuesHolderPixelBlaze4806 extends BroadcastReceiver {
    public Object PolarVoyageKotlinBetaPulseBeta3653;
    public Context PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185 = 0;

    public PolarVoyagePropertyValuesHolderPixelBlaze4806(PolarVoyageBundlePhantomEclipseMega7910 polarVoyageBundlePhantomEclipseMega7910) {
        this.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageBundlePhantomEclipseMega7910;
    }

    public void PolarVoyageZipVortexCelestial6185() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        PolarVoyageChipHeroNebula6696 polarVoyageChipHeroNebula6696 = (PolarVoyageChipHeroNebula6696) this.PolarVoyageKotlinBetaPulseBeta3653;
        if (polarVoyageChipHeroNebula6696 != null) {
            Context context = ((FirebaseMessaging) polarVoyageChipHeroNebula6696.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageMotionLayoutTransitionHeroVision4068;
            this.PolarVoyageMotionLayoutTransitionHeroVision4068 = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.PolarVoyageZipVortexCelestial6185) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                PolarVoyageChipHeroNebula6696 polarVoyageChipHeroNebula6696 = (PolarVoyageChipHeroNebula6696) this.PolarVoyageKotlinBetaPulseBeta3653;
                if (polarVoyageChipHeroNebula6696 != null && polarVoyageChipHeroNebula6696.PolarVoyageZipVortexCelestial6185()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    PolarVoyageChipHeroNebula6696 polarVoyageChipHeroNebula66962 = (PolarVoyageChipHeroNebula6696) this.PolarVoyageKotlinBetaPulseBeta3653;
                    ((FirebaseMessaging) polarVoyageChipHeroNebula66962.PolarVoyageBottomSheetOmegaNeo1907).getClass();
                    FirebaseMessaging.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageChipHeroNebula66962, 0L);
                    Context context2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.PolarVoyageKotlinBetaPulseBeta3653 = null;
                    return;
                }
                return;
            default:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    Object obj = ((PolarVoyageBundlePhantomEclipseMega7910) this.PolarVoyageKotlinBetaPulseBeta3653).PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    throw null;
                }
                return;
        }
    }

    public /* synthetic */ PolarVoyagePropertyValuesHolderPixelBlaze4806() {
    }
}
