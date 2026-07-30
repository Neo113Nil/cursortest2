package defpackage;

import android.content.Context;
import com.facebook.appevents.iap.InAppPurchaseAutoLogger;
import com.facebook.appevents.iap.InAppPurchaseUtils;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class q11 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ InAppPurchaseUtils.BillingClientVersion n;
    public final /* synthetic */ Context o;

    public /* synthetic */ q11(InAppPurchaseUtils.BillingClientVersion billingClientVersion, Context context, int i) {
        this.m = i;
        this.n = billingClientVersion;
        this.o = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.m) {
            case 0:
                InAppPurchaseAutoLogger.startIapLogging$lambda$1$lambda$0(this.n, this.o);
                break;
            default:
                InAppPurchaseAutoLogger.startIapLogging$lambda$2(this.n, this.o);
                break;
        }
    }
}
