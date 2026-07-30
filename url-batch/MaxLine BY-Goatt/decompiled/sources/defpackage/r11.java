package defpackage;

import com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV2V4;
import com.facebook.appevents.iap.InAppPurchaseUtils;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class r11 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ InAppPurchaseBillingClientWrapperV2V4 n;
    public final /* synthetic */ InAppPurchaseUtils.IAPProductType o;
    public final /* synthetic */ Runnable p;

    public /* synthetic */ r11(InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4, InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable, int i) {
        this.m = i;
        this.n = inAppPurchaseBillingClientWrapperV2V4;
        this.o = iAPProductType;
        this.p = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        Runnable runnable = this.p;
        InAppPurchaseUtils.IAPProductType iAPProductType = this.o;
        InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4 = this.n;
        switch (i) {
            case 0:
                InAppPurchaseBillingClientWrapperV2V4.queryPurchaseHistory$lambda$2(inAppPurchaseBillingClientWrapperV2V4, iAPProductType, runnable);
                break;
            default:
                InAppPurchaseBillingClientWrapperV2V4.queryPurchases$lambda$0(inAppPurchaseBillingClientWrapperV2V4, iAPProductType, runnable);
                break;
        }
    }
}
