package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFd1cSDK implements AFd1bSDK {
    private final AFd1gSDK values;

    public AFd1cSDK(AFd1gSDK aFd1gSDK) {
        Intrinsics.checkNotNullParameter(aFd1gSDK, "");
        this.values = aFd1gSDK;
    }

    @Override // com.appsflyer.internal.AFd1bSDK
    public final void valueOf(byte[] bArr, Map<String, String> map, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (new AFd1aSDK(bArr, map, 2000).AFKeystoreWrapper()) {
            this.values.AFInAppEventType();
        }
    }
}
