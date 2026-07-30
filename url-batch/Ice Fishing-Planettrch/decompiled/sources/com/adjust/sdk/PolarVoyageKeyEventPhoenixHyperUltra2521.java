package com.adjust.sdk;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageKeyEventPhoenixHyperUltra2521 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ ActivityHandler PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageKeyEventPhoenixHyperUltra2521(ActivityHandler activityHandler, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = activityHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdjustConfig adjustConfig;
        ILogger iLogger;
        ILogger iLogger2;
        DeviceInfo deviceInfo;
        AdjustConfig adjustConfig2;
        AdjustConfig adjustConfig3;
        AdjustConfig adjustConfig4;
        AdjustAttribution adjustAttribution;
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        ActivityHandler activityHandler = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Context context = activityHandler.getContext();
                adjustConfig = activityHandler.adjustConfig;
                String str = adjustConfig.fbAppId;
                iLogger = activityHandler.logger;
                ReferrerDetails metaReferrer = Reflection.getMetaReferrer(context, str, iLogger);
                if (metaReferrer != null) {
                    activityHandler.sendInstallReferrer(metaReferrer, Constants.REFERRER_API_META);
                    break;
                }
                break;
            case 1:
                if (!SharedPreferencesManager.getDefaultInstance(activityHandler.getContext()).getLicenseVerificationTracked()) {
                    Context context2 = activityHandler.getContext();
                    iLogger2 = activityHandler.logger;
                    deviceInfo = activityHandler.deviceInfo;
                    LicenseData licenseRequiredData = Reflection.getLicenseRequiredData(context2, iLogger2, deviceInfo.appInstallTime);
                    if (licenseRequiredData != null) {
                        activityHandler.sendLicenseVerificationData(licenseRequiredData);
                        break;
                    }
                }
                break;
            default:
                adjustConfig2 = activityHandler.adjustConfig;
                if (adjustConfig2 != null) {
                    adjustConfig3 = activityHandler.adjustConfig;
                    if (adjustConfig3.onAttributionChangedListener != null) {
                        adjustConfig4 = activityHandler.adjustConfig;
                        OnAttributionChangedListener onAttributionChangedListener = adjustConfig4.onAttributionChangedListener;
                        adjustAttribution = activityHandler.attribution;
                        onAttributionChangedListener.onAttributionChanged(adjustAttribution);
                        break;
                    }
                }
                break;
        }
    }
}
