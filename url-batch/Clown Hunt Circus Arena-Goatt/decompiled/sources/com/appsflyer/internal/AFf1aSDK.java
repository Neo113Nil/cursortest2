package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFf1aSDK implements AFg1wSDK {
    @Override // com.appsflyer.internal.AFg1wSDK
    public final String AFInAppEventParameterName(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String format = String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName());
        Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
