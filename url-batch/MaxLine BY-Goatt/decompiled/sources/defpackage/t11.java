package defpackage;

import com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV5V7;
import com.facebook.appevents.iap.InAppPurchaseUtils;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class t11 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ InAppPurchaseBillingClientWrapperV5V7 n;
    public final /* synthetic */ InAppPurchaseUtils.IAPProductType o;
    public final /* synthetic */ Runnable p;

    public /* synthetic */ t11(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable, int i) {
        this.m = i;
        this.n = inAppPurchaseBillingClientWrapperV5V7;
        this.o = iAPProductType;
        this.p = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        Runnable runnable = this.p;
        InAppPurchaseUtils.IAPProductType iAPProductType = this.o;
        InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7 = this.n;
        switch (i) {
            case 0:
                InAppPurchaseBillingClientWrapperV5V7.queryPurchases$lambda$0(inAppPurchaseBillingClientWrapperV5V7, iAPProductType, runnable);
                break;
            default:
                InAppPurchaseBillingClientWrapperV5V7.queryPurchaseHistory$lambda$1(inAppPurchaseBillingClientWrapperV5V7, iAPProductType, runnable);
                break;
        }
    }
}
