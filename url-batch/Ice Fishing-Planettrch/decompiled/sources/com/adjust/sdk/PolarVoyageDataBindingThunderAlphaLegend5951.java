package com.adjust.sdk;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageDataBindingThunderAlphaLegend5951 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ ActivityHandler PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ EventResponseData PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageDataBindingThunderAlphaLegend5951(ActivityHandler activityHandler, EventResponseData eventResponseData, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = activityHandler;
        this.PolarVoyageStrictModeLegendEpic1532 = eventResponseData;
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
        EventResponseData eventResponseData = this.PolarVoyageStrictModeLegendEpic1532;
        ActivityHandler activityHandler = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                adjustConfig = activityHandler.adjustConfig;
                if (adjustConfig != null) {
                    adjustConfig2 = activityHandler.adjustConfig;
                    if (adjustConfig2.onEventTrackingSucceededListener != null) {
                        adjustConfig3 = activityHandler.adjustConfig;
                        adjustConfig3.onEventTrackingSucceededListener.onEventTrackingSucceeded(eventResponseData.getSuccessResponseData());
                        break;
                    }
                }
                break;
            default:
                adjustConfig4 = activityHandler.adjustConfig;
                if (adjustConfig4 != null) {
                    adjustConfig5 = activityHandler.adjustConfig;
                    if (adjustConfig5.onEventTrackingFailedListener != null) {
                        adjustConfig6 = activityHandler.adjustConfig;
                        adjustConfig6.onEventTrackingFailedListener.onEventTrackingFailed(eventResponseData.getFailureResponseData());
                        break;
                    }
                }
                break;
        }
    }
}
