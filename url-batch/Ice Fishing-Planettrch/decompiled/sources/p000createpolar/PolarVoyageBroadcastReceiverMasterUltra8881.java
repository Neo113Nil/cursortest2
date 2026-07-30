package p000createpolar;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageBroadcastReceiverMasterUltra8881 implements PolarVoyageTimerFusionEpicGamma3640 {
    public final ConnectivityManager PolarVoyageMotionLayoutTransitionHeroVision4068;

    public PolarVoyageBroadcastReceiverMasterUltra8881(ConnectivityManager connectivityManager) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = connectivityManager;
    }

    @Override // p000createpolar.PolarVoyageTimerFusionEpicGamma3640
    public final boolean PolarVoyageZipVortexCelestial6185() {
        ConnectivityManager connectivityManager = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
