package com.adjust.sdk;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageOnGlobalLayoutListenerVortexEpic7760 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ ActivityHandler PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ OnAdidReadListener PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageOnGlobalLayoutListenerVortexEpic7760(ActivityHandler activityHandler, OnAdidReadListener onAdidReadListener, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = activityHandler;
        this.PolarVoyageStrictModeLegendEpic1532 = onAdidReadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActivityState activityState;
        ActivityState activityState2;
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        ActivityHandler activityHandler = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        OnAdidReadListener onAdidReadListener = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityState = activityHandler.activityState;
                onAdidReadListener.onAdidRead(activityState.adid);
                break;
            default:
                activityState2 = activityHandler.activityState;
                onAdidReadListener.onAdidRead(activityState2.adid);
                break;
        }
    }
}
