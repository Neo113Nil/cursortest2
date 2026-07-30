package p000createpolar;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustThirdPartySharing;
import com.adjust.sdk.IRunActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageCoroutineSolarDragonOmega5371 implements IRunActivityHandler {
    public final /* synthetic */ AdjustThirdPartySharing PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185;

    public /* synthetic */ PolarVoyageCoroutineSolarDragonOmega5371(AdjustThirdPartySharing adjustThirdPartySharing, int i) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = adjustThirdPartySharing;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        int i = this.PolarVoyageZipVortexCelestial6185;
        AdjustThirdPartySharing adjustThirdPartySharing = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.tryTrackThirdPartySharingI(adjustThirdPartySharing);
                break;
            default:
                activityHandler.tryTrackThirdPartySharingI(adjustThirdPartySharing);
                break;
        }
    }
}
