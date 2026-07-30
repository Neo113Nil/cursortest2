package com.adjust.sdk;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageRemoteConfigPhantomAlpha9506 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ ActivityHandler PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ SessionResponseData PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageRemoteConfigPhantomAlpha9506(ActivityHandler activityHandler, SessionResponseData sessionResponseData, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = activityHandler;
        this.PolarVoyageStrictModeLegendEpic1532 = sessionResponseData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdjustConfig adjustConfig;
        AdjustConfig adjustConfig2;
        AdjustConfig adjustConfig3;
        AdjustConfig adjustConfig4;
        AdjustConfig adjustConfig5;
        AdjustConfig adjustConfig6;
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        SessionResponseData sessionResponseData = this.PolarVoyageStrictModeLegendEpic1532;
        ActivityHandler activityHandler = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                adjustConfig = activityHandler.adjustConfig;
                if (adjustConfig != null) {
                    adjustConfig2 = activityHandler.adjustConfig;
                    if (adjustConfig2.onSessionTrackingSucceededListener != null) {
                        adjustConfig3 = activityHandler.adjustConfig;
                        adjustConfig3.onSessionTrackingSucceededListener.onSessionTrackingSucceeded(sessionResponseData.getSuccessResponseData());
                        break;
                    }
                }
                break;
            default:
                adjustConfig4 = activityHandler.adjustConfig;
                if (adjustConfig4 != null) {
                    adjustConfig5 = activityHandler.adjustConfig;
                    if (adjustConfig5.onSessionTrackingFailedListener != null) {
                        adjustConfig6 = activityHandler.adjustConfig;
                        adjustConfig6.onSessionTrackingFailedListener.onSessionTrackingFailed(sessionResponseData.getFailureResponseData());
                        break;
                    }
                }
                break;
        }
    }
}
