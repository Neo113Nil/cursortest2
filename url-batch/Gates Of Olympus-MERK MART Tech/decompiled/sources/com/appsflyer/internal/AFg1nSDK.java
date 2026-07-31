package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class AFg1nSDK extends AFg1pSDK {
    private final AFd1mSDK AFInAppEventParameterName;

    public AFg1nSDK(AFd1mSDK aFd1mSDK) {
        Intrinsics.checkNotNullParameter(aFd1mSDK, "");
        this.AFInAppEventParameterName = aFd1mSDK;
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final void e(AFg1jSDK aFg1jSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1jSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z3) {
            if (StringsKt.isBlank(str)) {
                str = "missing label";
            }
            this.AFInAppEventParameterName.onInstallConversionFailureNative().AFKeystoreWrapper(th, withTag$SDK_prodRelease(str, aFg1jSDK));
        }
    }
}
