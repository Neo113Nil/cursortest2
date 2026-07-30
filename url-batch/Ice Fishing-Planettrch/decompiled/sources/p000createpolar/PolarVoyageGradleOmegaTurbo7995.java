package p000createpolar;

import com.adjust.sdk.PurchaseVerificationHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageGradleOmegaTurbo7995 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ PurchaseVerificationHandler PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageGradleOmegaTurbo7995(PurchaseVerificationHandler purchaseVerificationHandler, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = purchaseVerificationHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PurchaseVerificationHandler purchaseVerificationHandler = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                purchaseVerificationHandler.sendNextPurchaseVerificationPackageI();
                break;
            default:
                purchaseVerificationHandler.lastPackageRetryInMilli = 0L;
                purchaseVerificationHandler.sendNextPurchaseVerificationPackage();
                break;
        }
    }
}
