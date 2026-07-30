package p000createpolar;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLaunchPrimeStrikeRogue2575 extends Binder {
    public final PolarVoyageAdapterTitanSpark4027 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageLaunchPrimeStrikeRogue2575(PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark4027) {
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageAdapterTitanSpark4027;
    }

    public final void PolarVoyageZipVortexCelestial6185(PolarVoyageContextShadowStrikeCelestial9029 polarVoyageContextShadowStrikeCelestial9029) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        int i = 3;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = polarVoyageContextShadowStrikeCelestial9029.PolarVoyageZipVortexCelestial6185;
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.PolarVoyageZipVortexCelestial6185.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageRotateDrawableTurboHyperDelta7408 polarVoyageRotateDrawableTurboHyperDelta7408 = new PolarVoyageRotateDrawableTurboHyperDelta7408();
        firebaseMessagingService.PolarVoyageItemDecorationUltraDeltaEpic7485.execute(new PolarVoyageBarrierHeroSparkInferno3191(firebaseMessagingService, intent, polarVoyageRotateDrawableTurboHyperDelta7408, i));
        polarVoyageRotateDrawableTurboHyperDelta7408.PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185(new PolarVoyageFilterTurboThunderEclipse3279(1), new PolarVoyageOnGlobalLayoutListenerTurboLegendHyperion3273(27, polarVoyageContextShadowStrikeCelestial9029));
    }
}
