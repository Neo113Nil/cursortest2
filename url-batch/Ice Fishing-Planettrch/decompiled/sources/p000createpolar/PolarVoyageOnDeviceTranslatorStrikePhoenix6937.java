package p000createpolar;

import com.adjust.sdk.AttributionHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageOnDeviceTranslatorStrikePhoenix6937 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ AttributionHandler PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageOnDeviceTranslatorStrikePhoenix6937(AttributionHandler attributionHandler, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = attributionHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        AttributionHandler attributionHandler = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                attributionHandler.sendAttributionRequest();
                break;
            case 1:
                attributionHandler.lastInitiatedBy = "sdk";
                attributionHandler.getAttributionI(0L);
                break;
            default:
                attributionHandler.sendAttributionRequestI();
                break;
        }
    }
}
