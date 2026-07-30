package p000createpolar;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustEvent;
import com.adjust.sdk.OnPurchaseVerificationFinishedListener;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageFlowCollectorSolarSpectraHero8258 implements Runnable {
    public final /* synthetic */ OnPurchaseVerificationFinishedListener PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ AdjustEvent PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ ActivityHandler PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageFlowCollectorSolarSpectraHero8258(ActivityHandler activityHandler, AdjustEvent adjustEvent, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = activityHandler;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = adjustEvent;
        this.PolarVoyageBottomSheetOmegaNeo1907 = onPurchaseVerificationFinishedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener = this.PolarVoyageBottomSheetOmegaNeo1907;
        AdjustEvent adjustEvent = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        ActivityHandler activityHandler = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.lambda$verifyAndTrackPlayStorePurchase$46(adjustEvent, onPurchaseVerificationFinishedListener);
                break;
            default:
                activityHandler.lambda$verifyAndTrackPlayStorePurchase$47(adjustEvent, onPurchaseVerificationFinishedListener);
                break;
        }
    }
}
