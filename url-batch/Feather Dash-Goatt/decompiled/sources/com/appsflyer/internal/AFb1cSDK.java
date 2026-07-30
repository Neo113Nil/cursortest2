package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import defpackage.qr0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFb1cSDK implements AFb1hSDK {
    private final AFc1gSDK AFAdRevenueData;
    private final AFc1fSDK getCurrencyIso4217Code;
    private final AFf1kSDK getMediationNetwork;

    public AFb1cSDK(AFc1gSDK aFc1gSDK, AFc1fSDK aFc1fSDK, AFf1kSDK aFf1kSDK) {
        aFc1gSDK.getClass();
        aFc1fSDK.getClass();
        aFf1kSDK.getClass();
        this.AFAdRevenueData = aFc1gSDK;
        this.getCurrencyIso4217Code = aFc1fSDK;
        this.getMediationNetwork = aFf1kSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFb1cSDK aFb1cSDK, AppSetIdInfo appSetIdInfo) {
        aFb1cSDK.getClass();
        AFc1gSDK aFc1gSDK = aFb1cSDK.AFAdRevenueData;
        int scope = appSetIdInfo.getScope();
        String id = appSetIdInfo.getId();
        id.getClass();
        aFc1gSDK.equals = new AFb1gSDK(scope, id);
    }

    @Override // com.appsflyer.internal.AFb1hSDK
    public final boolean getCurrencyIso4217Code() {
        return !this.getMediationNetwork.getRevenue() && !this.AFAdRevenueData.getMonetizationNetwork() && AFj1pSDK.getMediationNetwork(this.getCurrencyIso4217Code.getCurrencyIso4217Code) && AFj1pSDK.getCurrencyIso4217Code(this.getCurrencyIso4217Code.getCurrencyIso4217Code);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.appsflyer.internal.e] */
    @Override // com.appsflyer.internal.AFb1hSDK
    public final void getMonetizationNetwork() {
        Context context = this.getCurrencyIso4217Code.getCurrencyIso4217Code;
        if (context != null) {
            try {
                AppSet.getClient(context).getAppSetIdInfo().d(new qr0() { // from class: com.appsflyer.internal.e
                    @Override // defpackage.qr0
                    public final void h(Object obj) {
                        AFb1cSDK.AFAdRevenueData(AFb1cSDK.this, (AppSetIdInfo) obj);
                    }
                });
            } catch (Throwable th) {
                AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "Error while trying to  fetch App set ID", th, false, false, false, false, 120, null);
            }
        }
    }
}
