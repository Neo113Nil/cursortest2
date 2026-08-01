package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFk1ySDK implements AFk1zSDK {
    @Override // com.appsflyer.internal.AFk1zSDK
    public final String getMediationNetwork(String str) {
        str.getClass();
        return String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getRevenue().getHostName());
    }
}
