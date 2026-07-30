package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFi1oSDK implements AFi1rSDK {
    private String getMonetizationNetwork;

    private static String getRevenue(Activity activity) {
        Uri k_ = AFb1rSDK.k_(activity != null ? activity.getIntent() : null);
        String obj = k_ != null ? k_.toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (getRevenue(obj)) {
            return null;
        }
        return obj;
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    public final void getCurrencyIso4217Code(Activity activity) {
        activity.getClass();
        String str = this.getMonetizationNetwork;
        if (str == null || str.length() == 0) {
            this.getMonetizationNetwork = getRevenue(activity);
        }
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    public final String getMediationNetwork(Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String obj = referrer != null ? referrer.toString() : null;
        return obj == null ? "" : obj;
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    public final String getMonetizationNetwork(Activity activity) {
        String str = this.getMonetizationNetwork;
        this.getMonetizationNetwork = null;
        return (str == null || str.length() == 0) ? getRevenue(activity) : str;
    }

    private static boolean getRevenue(String str) {
        return kotlin.text.c.e(str, "android-app://");
    }
}
