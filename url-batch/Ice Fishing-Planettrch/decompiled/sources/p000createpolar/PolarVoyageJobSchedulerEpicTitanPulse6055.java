package p000createpolar;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustAdRevenue;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageJobSchedulerEpicTitanPulse6055 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ AdjustAdRevenue PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ ActivityHandler PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageJobSchedulerEpicTitanPulse6055(ActivityHandler activityHandler, AdjustAdRevenue adjustAdRevenue, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = activityHandler;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = adjustAdRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        AdjustAdRevenue adjustAdRevenue = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        ActivityHandler activityHandler = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.lambda$trackAdRevenue$41(adjustAdRevenue);
                break;
            default:
                activityHandler.lambda$trackAdRevenue$40(adjustAdRevenue);
                break;
        }
    }
}
