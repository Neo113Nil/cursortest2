package p000createpolar;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IRunActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageMotionSceneTitaniumStrike5853 implements IRunActivityHandler {
    public final /* synthetic */ boolean PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185;

    public /* synthetic */ PolarVoyageMotionSceneTitaniumStrike5853(int i, boolean z) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = z;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        int i = this.PolarVoyageZipVortexCelestial6185;
        boolean z = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.tryTrackMeasurementConsentI(z);
                break;
            default:
                activityHandler.tryTrackMeasurementConsentI(z);
                break;
        }
    }
}
