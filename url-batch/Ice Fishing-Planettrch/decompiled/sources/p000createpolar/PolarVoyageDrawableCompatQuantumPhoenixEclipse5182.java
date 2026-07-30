package p000createpolar;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageDrawableCompatQuantumPhoenixEclipse5182 extends PolarVoyageImageCaptureBetaTitanium7525 implements PolarVoyageStateFlowNebulaMax1492 {
    public static final PolarVoyageDrawableCompatQuantumPhoenixEclipse5182 PolarVoyageSnackbarGammaEclipse2140 = new PolarVoyageDrawableCompatQuantumPhoenixEclipse5182(1, PolarVoyageTransformNeoTitanium1654.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    @Override // p000createpolar.PolarVoyageStateFlowNebulaMax1492
    public final Object PolarVoyageZipVortexCelestial6185(Object obj) {
        Context applicationContext = ((Context) obj).getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageViewRogueMaster4778(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new PolarVoyageBroadcastReceiverMasterUltra8881(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return PolarVoyageTimerFusionEpicGamma3640.PolarVoyageZipVortexCelestial6185;
    }
}
