package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFj1fSDK implements AFj1bSDK {
    @Override // com.appsflyer.internal.AFj1bSDK
    public final String getRevenue(String str) {
        str.getClass();
        return String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.getMediationNetwork().getHostName());
    }
}
