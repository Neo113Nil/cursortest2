package p000createpolar;

import com.adjust.sdk.ActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageFirebaseMaxNeoEclipse5108 implements Runnable {
    public final /* synthetic */ String PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ String PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ ActivityHandler PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageFirebaseMaxNeoEclipse5108(ActivityHandler activityHandler, String str, String str2, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = activityHandler;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = str;
        this.PolarVoyageBottomSheetOmegaNeo1907 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        String str = this.PolarVoyageBottomSheetOmegaNeo1907;
        String str2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        ActivityHandler activityHandler = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.lambda$addGlobalPartnerParameter$23(str2, str);
                break;
            default:
                activityHandler.lambda$addGlobalCallbackParameter$21(str2, str);
                break;
        }
    }
}
