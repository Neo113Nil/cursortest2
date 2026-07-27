package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFj1tSDK implements AFj1uSDK {
    @Override // com.appsflyer.internal.AFj1uSDK
    public final String AFInAppEventParameterName(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String format = String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName());
        Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
