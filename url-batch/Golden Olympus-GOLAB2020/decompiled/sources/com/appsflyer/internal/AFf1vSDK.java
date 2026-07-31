package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes.dex */
public final class AFf1vSDK extends AFe1dSDK<String> {
    private final AFh1mSDK component2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFf1vSDK(AFh1mSDK aFh1mSDK, AFc1dSDK aFc1dSDK) {
        super(r2, r3, aFc1dSDK, r0.toString(), aFh1mSDK.getRevenue);
        AFe1mSDK aFe1mSDK = aFh1mSDK.toString;
        AFe1mSDK aFe1mSDK2 = aFe1mSDK == null ? AFe1mSDK.CACHED_EVENT : aFe1mSDK;
        AFe1mSDK[] aFe1mSDKArr = {AFe1mSDK.RC_CDN};
        StringBuilder sb = new StringBuilder();
        sb.append(aFh1mSDK.getRevenue);
        sb.append("-");
        sb.append(getRevenue(aFh1mSDK));
        this.component2 = aFh1mSDK;
    }

    private boolean copy() {
        ResponseNetwork responseNetwork;
        AFe1mSDK aFe1mSDK = this.component2.toString;
        if (aFe1mSDK == null) {
            aFe1mSDK = AFe1mSDK.CACHED_EVENT;
        }
        return aFe1mSDK == AFe1mSDK.ARS_VALIDATE && (responseNetwork = ((AFe1dSDK) this).component1) != null && responseNetwork.getStatusCode() == 424;
    }

    private boolean equals() {
        ResponseNetwork responseNetwork = ((AFe1dSDK) this).component1;
        boolean z4 = this.getMediationNetwork == AFe1rSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1;
        AFe1mSDK aFe1mSDK = this.getMonetizationNetwork;
        return z4 && (aFe1mSDK == AFe1mSDK.CONVERSION || aFe1mSDK == AFe1mSDK.ATTR);
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final AppsFlyerRequestListener component3() {
        return this.component2.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        return super.getMediationNetwork() || copy() || equals();
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final AFd1nSDK<String> getRevenue(String str) {
        String encodeToString = Base64.encodeToString(this.component2.AFAdRevenueData(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(encodeToString)));
        ((AFe1dSDK) this).areAllFieldsValid.getCurrencyIso4217Code(this.component2.component1, encodeToString);
        AFd1oSDK aFd1oSDK = this.component4;
        return (AFd1nSDK) AFd1oSDK.getCurrencyIso4217Code(new Object[]{aFd1oSDK, this.component2}, -44698683, 44698684, System.identityHashCode(aFd1oSDK));
    }

    private static String getRevenue(AFh1mSDK aFh1mSDK) {
        try {
            return new URL(aFh1mSDK.component1).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }
}
