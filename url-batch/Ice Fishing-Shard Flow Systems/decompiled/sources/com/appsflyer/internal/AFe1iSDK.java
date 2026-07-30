package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;

/* loaded from: classes.dex */
public final class AFe1iSDK extends AFe1bSDK<String> {
    private final String component2;
    private final AFk1ySDK copy;
    private final AFc1kSDK copydefault;

    public AFe1iSDK(AFd1zSDK aFd1zSDK, String str, AFk1ySDK aFk1ySDK) {
        super(AFe1lSDK.IMPRESSIONS, new AFe1lSDK[]{AFe1lSDK.RC_CDN, AFe1lSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, str);
        this.component2 = str;
        this.copy = aFk1ySDK;
        this.copydefault = aFd1zSDK.AFAdRevenueData();
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AppsFlyerRequestListener component1() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean copy() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final void getMonetizationNetwork() {
        super.getMonetizationNetwork();
        AFe1ySDK<Result> aFe1ySDK = ((AFe1bSDK) this).component4;
        if (aFe1ySDK != 0) {
            int statusCode = aFe1ySDK.getStatusCode();
            if (statusCode == 200) {
                StringBuilder sb = new StringBuilder("Cross promotion impressions success: ");
                sb.append(this.component2);
                AFLogger.afInfoLog(sb.toString(), false);
                return;
            }
            if (statusCode != 301 && statusCode != 302) {
                StringBuilder sb2 = new StringBuilder("call to ");
                sb2.append(this.component2);
                sb2.append(" failed: ");
                sb2.append(statusCode);
                AFLogger.afInfoLog(sb2.toString());
                return;
            }
            StringBuilder sb3 = new StringBuilder("Cross promotion redirection success: ");
            sb3.append(this.component2);
            AFLogger.afInfoLog(sb3.toString(), false);
            String AFAdRevenueData = aFe1ySDK.AFAdRevenueData("Location");
            AFk1ySDK aFk1ySDK = this.copy;
            if (aFk1ySDK == null || AFAdRevenueData == null) {
                return;
            }
            aFk1ySDK.getMonetizationNetwork = AFAdRevenueData;
            Context context = aFk1ySDK.getRevenue.get();
            if (context != null) {
                try {
                    if (aFk1ySDK.getMonetizationNetwork != null) {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFk1ySDK.getMonetizationNetwork)).setFlags(268435456));
                    }
                } catch (Exception e7) {
                    AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e7)), e7);
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AFd1fSDK<String> getRevenue(String str) {
        AFd1mSDK aFd1mSDK = ((AFe1bSDK) this).component3;
        String monetizationNetwork = this.copydefault.getMonetizationNetwork();
        return aFd1mSDK.getCurrencyIso4217Code(AFk1zSDK.getMediationNetwork(monetizationNetwork) ? this.component2 : Uri.parse(this.component2).buildUpon().appendQueryParameter("advertising_id", monetizationNetwork).build().toString());
    }
}
