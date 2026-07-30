package com.adjust.sdk.network;

import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.network.IActivityPackageSender;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageOnGlobalLayoutListenerVortexEpic7760 implements Runnable {
    public final /* synthetic */ ActivityPackageSender PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ IActivityPackageSender.ResponseDataCallbackSubscriber PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ Map PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ ActivityPackage PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageOnGlobalLayoutListenerVortexEpic7760(ActivityPackageSender activityPackageSender, IActivityPackageSender.ResponseDataCallbackSubscriber responseDataCallbackSubscriber, ActivityPackage activityPackage, Map map) {
        this.PolarVoyageBottomSheetOmegaNeo1907 = activityPackageSender;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = responseDataCallbackSubscriber;
        this.PolarVoyageStrictModeLegendEpic1532 = activityPackage;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.onResponseDataCallback(this.PolarVoyageBottomSheetOmegaNeo1907.sendActivityPackageSync(this.PolarVoyageStrictModeLegendEpic1532, this.PolarVoyageRotateAnimationCyberCelestialDelta4768));
    }
}
