package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFe1aSDK extends AFe1bSDK<String> {
    private final AFh1jSDK component2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFe1aSDK(AFh1jSDK aFh1jSDK, AFd1zSDK aFd1zSDK) {
        super(r2, r3, aFd1zSDK, r0.toString(), aFh1jSDK.component4);
        AFe1lSDK aFe1lSDK = aFh1jSDK.hashCode;
        AFe1lSDK aFe1lSDK2 = aFe1lSDK == null ? AFe1lSDK.CACHED_EVENT : aFe1lSDK;
        AFe1lSDK[] aFe1lSDKArr = {AFe1lSDK.RC_CDN};
        StringBuilder sb = new StringBuilder();
        sb.append(aFh1jSDK.component4);
        sb.append("-");
        sb.append(getMonetizationNetwork(aFh1jSDK));
        this.component2 = aFh1jSDK;
    }

    private boolean copydefault() {
        ResponseNetwork responseNetwork;
        AFe1lSDK aFe1lSDK = this.component2.hashCode;
        if (aFe1lSDK == null) {
            aFe1lSDK = AFe1lSDK.CACHED_EVENT;
        }
        return aFe1lSDK == AFe1lSDK.ARS_VALIDATE && (responseNetwork = ((AFe1bSDK) this).component4) != null && responseNetwork.getStatusCode() == 424;
    }

    private boolean equals() {
        ResponseNetwork responseNetwork = ((AFe1bSDK) this).component4;
        boolean z = this.AFAdRevenueData == AFe1rSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1;
        AFe1lSDK aFe1lSDK = this.getMonetizationNetwork;
        return z && (aFe1lSDK == AFe1lSDK.CONVERSION || aFe1lSDK == AFe1lSDK.ATTR);
    }

    private static String getMonetizationNetwork(AFh1jSDK aFh1jSDK) {
        try {
            return new URL(aFh1jSDK.component3).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final boolean AFAdRevenueData() {
        return super.AFAdRevenueData() || copydefault() || equals();
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AppsFlyerRequestListener component1() {
        return this.component2.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean copy() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AFd1fSDK<String> getRevenue(String str) {
        String encodeToString = Base64.encodeToString(this.component2.getCurrencyIso4217Code(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(encodeToString)));
        ((AFe1bSDK) this).areAllFieldsValid.getMonetizationNetwork(this.component2.component3, encodeToString);
        return ((AFe1bSDK) this).component3.getRevenue(this.component2);
    }
}
