package p000createpolar;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IRunActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageNavigationViewPulseHeroPhantom3034 implements IRunActivityHandler {
    public final /* synthetic */ String PolarVoyageKotlinBetaPulseBeta3653;
    public final /* synthetic */ String PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185;

    public /* synthetic */ PolarVoyageNavigationViewPulseHeroPhantom3034(String str, String str2, int i) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = str;
        this.PolarVoyageKotlinBetaPulseBeta3653 = str2;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.PolarVoyageZipVortexCelestial6185) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.addGlobalPartnerParameterI(this.PolarVoyageMotionLayoutTransitionHeroVision4068, this.PolarVoyageKotlinBetaPulseBeta3653);
                break;
            default:
                activityHandler.addGlobalCallbackParameterI(this.PolarVoyageMotionLayoutTransitionHeroVision4068, this.PolarVoyageKotlinBetaPulseBeta3653);
                break;
        }
    }
}
