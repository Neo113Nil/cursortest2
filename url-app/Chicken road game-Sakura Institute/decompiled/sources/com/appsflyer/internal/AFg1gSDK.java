package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;

/* loaded from: classes.dex */
public final class AFg1gSDK extends AFg1fSDK {
    private final AFd1kSDK AFInAppEventParameterName;

    public AFg1gSDK(AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.AFInAppEventParameterName = aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void e(AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z6) {
            if (y.x(str)) {
                str = "missing label";
            }
            this.AFInAppEventParameterName.getCurrency().values(th, withTag$SDK_prodRelease(str, aFg1aSDK));
        }
    }
}
