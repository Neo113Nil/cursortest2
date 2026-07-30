package defpackage;

import com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV2V4;
import com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV5V7;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.appevents.suggestedevents.ViewOnClickListener;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class s11 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ s11(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.m = i;
        this.q = obj;
        this.n = obj2;
        this.o = obj3;
        this.p = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        Object obj = this.p;
        Object obj2 = this.o;
        Object obj3 = this.n;
        Object obj4 = this.q;
        switch (i) {
            case 0:
                InAppPurchaseBillingClientWrapperV2V4.querySkuDetailsAsync$lambda$1((InAppPurchaseBillingClientWrapperV2V4) obj4, (Runnable) obj3, (InAppPurchaseUtils.IAPProductType) obj2, (List) obj);
                break;
            case 1:
                InAppPurchaseBillingClientWrapperV5V7.queryProductDetailsAsync$lambda$2((InAppPurchaseBillingClientWrapperV5V7) obj4, (Runnable) obj3, (InAppPurchaseUtils.IAPProductType) obj2, (List) obj);
                break;
            default:
                ViewOnClickListener.predictAndProcess$lambda$0((JSONObject) obj4, (String) obj3, (ViewOnClickListener) obj2, (String) obj);
                break;
        }
    }
}
