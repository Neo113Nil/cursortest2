package p000createpolar;

import android.content.Context;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.Constants;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.ReferrerDetails;
import com.adjust.sdk.Reflection;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageBarcodeScannerTurboStorm1145 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ ActivityHandler PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageBarcodeScannerTurboStorm1145(ActivityHandler activityHandler, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = activityHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ILogger iLogger;
        ILogger iLogger2;
        ILogger iLogger3;
        ILogger iLogger4;
        ILogger iLogger5;
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        ActivityHandler activityHandler = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.gotOptOutResponseI();
                break;
            case 1:
                activityHandler.foregroundTimerFiredI();
                break;
            case 2:
                activityHandler.backgroundTimerFiredI();
                break;
            case 3:
                activityHandler.foregroundTimerFired();
                break;
            case 4:
                activityHandler.backgroundTimerFired();
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                Context context = activityHandler.getContext();
                iLogger = activityHandler.logger;
                ReferrerDetails huaweiAdsReferrer = Reflection.getHuaweiAdsReferrer(context, iLogger);
                if (huaweiAdsReferrer != null) {
                    activityHandler.sendInstallReferrer(huaweiAdsReferrer, Constants.REFERRER_API_HUAWEI_ADS);
                    break;
                }
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                Context context2 = activityHandler.getContext();
                iLogger2 = activityHandler.logger;
                ReferrerDetails huaweiAppGalleryReferrer = Reflection.getHuaweiAppGalleryReferrer(context2, iLogger2);
                if (huaweiAppGalleryReferrer != null) {
                    activityHandler.sendInstallReferrer(huaweiAppGalleryReferrer, Constants.REFERRER_API_HUAWEI_APP_GALLERY);
                    break;
                }
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                Context context3 = activityHandler.getContext();
                iLogger3 = activityHandler.logger;
                ReferrerDetails samsungReferrer = Reflection.getSamsungReferrer(context3, iLogger3);
                if (samsungReferrer != null) {
                    activityHandler.sendInstallReferrer(samsungReferrer, Constants.REFERRER_API_SAMSUNG);
                    break;
                }
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                Context context4 = activityHandler.getContext();
                iLogger4 = activityHandler.logger;
                ReferrerDetails xiaomiReferrer = Reflection.getXiaomiReferrer(context4, iLogger4);
                if (xiaomiReferrer != null) {
                    activityHandler.sendInstallReferrer(xiaomiReferrer, Constants.REFERRER_API_XIAOMI);
                    break;
                }
                break;
            default:
                Context context5 = activityHandler.getContext();
                iLogger5 = activityHandler.logger;
                ReferrerDetails vivoReferrer = Reflection.getVivoReferrer(context5, iLogger5);
                if (vivoReferrer != null) {
                    activityHandler.sendInstallReferrer(vivoReferrer, Constants.REFERRER_API_VIVO);
                    break;
                }
                break;
        }
    }
}
