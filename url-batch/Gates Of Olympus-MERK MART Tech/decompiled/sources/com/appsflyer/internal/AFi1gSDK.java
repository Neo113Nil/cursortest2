package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFi1gSDK implements AFi1hSDK {
    @Override // com.appsflyer.internal.AFi1hSDK
    public final String AFKeystoreWrapper(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String format = String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.AFInAppEventType().getHostName());
        Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
