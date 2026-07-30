package p000createpolar;

import com.adjust.sdk.ActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyagePushNotificationCosmosFusionAlpha3896 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ ActivityHandler PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyagePushNotificationCosmosFusionAlpha3896(ActivityHandler activityHandler, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = activityHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        ActivityHandler activityHandler = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.lambda$sendPreinstallReferrer$19();
                break;
            case 1:
                activityHandler.lambda$removeGlobalPartnerParameters$31();
                break;
            case 2:
                activityHandler.lambda$endFirstSessionDelay$48();
                break;
            case 3:
                activityHandler.lambda$sendPreinstallReferrer$18();
                break;
            case 4:
                activityHandler.lambda$sendReftagReferrer$17();
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                activityHandler.lambda$removeGlobalCallbackParameters$29();
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                activityHandler.lambda$gdprForgetMe$34();
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                activityHandler.lambda$gdprForgetMe$35();
                break;
            default:
                activityHandler.lambda$sendReftagReferrer$16();
                break;
        }
    }
}
