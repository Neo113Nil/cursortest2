package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class AFi1oSDK implements AFi1kSDK {
    private String getRevenue;

    private static String AFAdRevenueData(Activity activity) {
        Uri j_ = AFb1rSDK.j_(activity != null ? activity.getIntent() : null);
        String obj = j_ != null ? j_.toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (getRevenue(obj)) {
            return null;
        }
        return obj;
    }

    private static boolean getRevenue(String str) {
        return StringsKt.K(str, "android-app://", false, 2, null);
    }

    @Override // com.appsflyer.internal.AFi1kSDK
    public final String getCurrencyIso4217Code(Activity activity) {
        String str = this.getRevenue;
        this.getRevenue = null;
        return (str == null || str.length() == 0) ? AFAdRevenueData(activity) : str;
    }

    @Override // com.appsflyer.internal.AFi1kSDK
    public final void getMediationNetwork(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        String str = this.getRevenue;
        if (str == null || str.length() == 0) {
            this.getRevenue = AFAdRevenueData(activity);
        }
    }

    @Override // com.appsflyer.internal.AFi1kSDK
    public final String getMonetizationNetwork(Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String obj = referrer != null ? referrer.toString() : null;
        return obj == null ? "" : obj;
    }
}
