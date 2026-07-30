package p000createpolar;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IRunActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageBroadcastReceiverPrimeTitanium7054 implements IRunActivityHandler {
    public final /* synthetic */ String PolarVoyageKotlinBetaPulseBeta3653;
    public final /* synthetic */ String PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185;

    public /* synthetic */ PolarVoyageBroadcastReceiverPrimeTitanium7054(String str, String str2, int i) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = str;
        this.PolarVoyageKotlinBetaPulseBeta3653 = str2;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        int i = this.PolarVoyageZipVortexCelestial6185;
        String str = this.PolarVoyageKotlinBetaPulseBeta3653;
        String str2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.addGlobalCallbackParameterI(str2, str);
                break;
            default:
                activityHandler.addGlobalPartnerParameterI(str2, str);
                break;
        }
    }
}
