package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFh1qSDK {
    public final String AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    public final Intent getMonetizationNetwork;

    public AFh1qSDK(Activity activity, AFi1oSDK aFi1oSDK) {
        activity.getClass();
        aFi1oSDK.getClass();
        this.getMonetizationNetwork = activity.getIntent();
        this.getCurrencyIso4217Code = aFi1oSDK.getMediationNetwork(activity);
        this.AFAdRevenueData = aFi1oSDK.getRevenue(activity);
    }
}
