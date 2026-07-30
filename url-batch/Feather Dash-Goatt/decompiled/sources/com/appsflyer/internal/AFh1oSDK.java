package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFh1oSDK {
    public final String AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    public final Intent getMonetizationNetwork;

    public AFh1oSDK(Activity activity, AFi1rSDK aFi1rSDK) {
        activity.getClass();
        aFi1rSDK.getClass();
        this.getMonetizationNetwork = activity.getIntent();
        this.getCurrencyIso4217Code = aFi1rSDK.getMediationNetwork(activity);
        this.AFAdRevenueData = aFi1rSDK.getMonetizationNetwork(activity);
    }
}
