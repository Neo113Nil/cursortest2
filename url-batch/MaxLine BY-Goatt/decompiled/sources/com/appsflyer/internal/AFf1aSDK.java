package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFf1aSDK implements AFg1wSDK {
    @Override // com.appsflyer.internal.AFg1wSDK
    public final String AFInAppEventParameterName(String str) {
        str.getClass();
        return String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName());
    }
}
