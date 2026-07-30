package p000createpolar;

import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.SdkClickHandler;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageOnGlobalLayoutListenerVisionStrikeNova2734 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ SdkClickHandler PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ ActivityPackage PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageOnGlobalLayoutListenerVisionStrikeNova2734(SdkClickHandler sdkClickHandler, ActivityPackage activityPackage, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = sdkClickHandler;
        this.PolarVoyageStrictModeLegendEpic1532 = activityPackage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        ILogger iLogger;
        List list2;
        ILogger iLogger2;
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        ActivityPackage activityPackage = this.PolarVoyageStrictModeLegendEpic1532;
        SdkClickHandler sdkClickHandler = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                list = sdkClickHandler.packageQueue;
                list.add(activityPackage);
                iLogger = sdkClickHandler.logger;
                list2 = sdkClickHandler.packageQueue;
                iLogger.debug("Added sdk_click %d", Integer.valueOf(list2.size()));
                iLogger2 = sdkClickHandler.logger;
                iLogger2.verbose("%s", activityPackage.getExtendedString());
                sdkClickHandler.sendNextSdkClick();
                break;
            default:
                sdkClickHandler.sendSdkClickI(activityPackage);
                sdkClickHandler.sendNextSdkClick();
                break;
        }
    }
}
