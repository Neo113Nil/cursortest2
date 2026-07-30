package p000createpolar;

import com.adjust.sdk.ActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageContentProviderBetaBetaNovaX9910 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ String PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ ActivityHandler PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageContentProviderBetaBetaNovaX9910(ActivityHandler activityHandler, String str, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = activityHandler;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        String str = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        ActivityHandler activityHandler = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.lambda$setExternalDeviceIdInDelay$51(str);
                break;
            case 1:
                activityHandler.lambda$removeGlobalPartnerParameter$27(str);
                break;
            default:
                activityHandler.lambda$removeGlobalCallbackParameter$25(str);
                break;
        }
    }
}
