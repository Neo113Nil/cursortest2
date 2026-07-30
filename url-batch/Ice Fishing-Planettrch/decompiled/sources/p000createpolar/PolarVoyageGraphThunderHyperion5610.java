package p000createpolar;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustPlayStoreSubscription;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageGraphThunderHyperion5610 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ AdjustPlayStoreSubscription PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ ActivityHandler PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageGraphThunderHyperion5610(ActivityHandler activityHandler, AdjustPlayStoreSubscription adjustPlayStoreSubscription, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = activityHandler;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = adjustPlayStoreSubscription;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        AdjustPlayStoreSubscription adjustPlayStoreSubscription = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        ActivityHandler activityHandler = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.lambda$trackPlayStoreSubscription$42(adjustPlayStoreSubscription);
                break;
            default:
                activityHandler.lambda$trackPlayStoreSubscription$43(adjustPlayStoreSubscription);
                break;
        }
    }
}
