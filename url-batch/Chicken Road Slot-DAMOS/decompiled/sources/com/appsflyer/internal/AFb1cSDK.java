package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFb1cSDK implements AFb1hSDK {
    private final AFc1eSDK AFAdRevenueData;
    private final AFf1eSDK getCurrencyIso4217Code;
    private final AFc1hSDK getMonetizationNetwork;

    public AFb1cSDK(AFc1eSDK aFc1eSDK, AFc1hSDK aFc1hSDK, AFf1eSDK aFf1eSDK) {
        aFc1eSDK.getClass();
        aFc1hSDK.getClass();
        aFf1eSDK.getClass();
        this.AFAdRevenueData = aFc1eSDK;
        this.getMonetizationNetwork = aFc1hSDK;
        this.getCurrencyIso4217Code = aFf1eSDK;
    }

    @Override // com.appsflyer.internal.AFb1hSDK
    public final boolean AFAdRevenueData() {
        return !this.getCurrencyIso4217Code.getCurrencyIso4217Code() && !this.AFAdRevenueData.getMediationNetwork() && AFj1kSDK.getMediationNetwork(this.getMonetizationNetwork.getMonetizationNetwork) && AFj1kSDK.getMonetizationNetwork(this.getMonetizationNetwork.getMonetizationNetwork);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.appsflyer.internal.e] */
    @Override // com.appsflyer.internal.AFb1hSDK
    public final void getMonetizationNetwork() {
        Context context = this.getMonetizationNetwork.getMonetizationNetwork;
        if (context != null) {
            try {
                AppSet.getClient(context).getAppSetIdInfo().d(new w7.d() { // from class: com.appsflyer.internal.e
                    @Override // w7.d
                    public final void b(Object obj) {
                        AFb1cSDK.getMonetizationNetwork(AFb1cSDK.this, (AppSetIdInfo) obj);
                    }
                });
            } catch (Throwable th) {
                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "Error while trying to  fetch App set ID", th, false, false, false, false, 120, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFb1cSDK aFb1cSDK, AppSetIdInfo appSetIdInfo) {
        aFb1cSDK.getClass();
        AFc1eSDK aFc1eSDK = aFb1cSDK.AFAdRevenueData;
        int scope = appSetIdInfo.getScope();
        String id2 = appSetIdInfo.getId();
        id2.getClass();
        aFc1eSDK.copydefault = new AFb1gSDK(scope, id2);
    }
}
