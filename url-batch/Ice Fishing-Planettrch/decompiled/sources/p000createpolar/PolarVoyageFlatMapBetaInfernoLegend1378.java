package p000createpolar;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.OnAttributionReadListener;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFlatMapBetaInfernoLegend1378 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ ActivityHandler PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ OnAttributionReadListener PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageFlatMapBetaInfernoLegend1378(ActivityHandler activityHandler, OnAttributionReadListener onAttributionReadListener, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = activityHandler;
        this.PolarVoyageStrictModeLegendEpic1532 = onAttributionReadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdjustAttribution adjustAttribution;
        AdjustAttribution adjustAttribution2;
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        ActivityHandler activityHandler = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        OnAttributionReadListener onAttributionReadListener = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                adjustAttribution = activityHandler.attribution;
                onAttributionReadListener.onAttributionRead(adjustAttribution);
                break;
            default:
                adjustAttribution2 = activityHandler.attribution;
                onAttributionReadListener.onAttributionRead(adjustAttribution2);
                break;
        }
    }
}
