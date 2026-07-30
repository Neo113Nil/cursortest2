package com.adjust.sdk;

import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageNavigationViewPhoenixTurbo2488 implements Runnable {
    public final /* synthetic */ Uri PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ ActivityHandler PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ Intent PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageNavigationViewPhoenixTurbo2488(ActivityHandler activityHandler, Intent intent, Uri uri) {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = activityHandler;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = uri;
        this.PolarVoyageStrictModeLegendEpic1532 = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdjustConfig adjustConfig;
        AdjustConfig adjustConfig2;
        boolean z;
        AdjustConfig adjustConfig3;
        ActivityHandler activityHandler = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        adjustConfig = activityHandler.adjustConfig;
        if (adjustConfig == null) {
            return;
        }
        adjustConfig2 = activityHandler.adjustConfig;
        OnDeferredDeeplinkResponseListener onDeferredDeeplinkResponseListener = adjustConfig2.onDeferredDeeplinkResponseListener;
        Uri uri = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (onDeferredDeeplinkResponseListener != null) {
            adjustConfig3 = activityHandler.adjustConfig;
            z = adjustConfig3.onDeferredDeeplinkResponseListener.launchReceivedDeeplink(uri);
        } else {
            z = true;
        }
        if (z) {
            activityHandler.launchDeeplinkMain(this.PolarVoyageStrictModeLegendEpic1532, uri);
        }
    }
}
