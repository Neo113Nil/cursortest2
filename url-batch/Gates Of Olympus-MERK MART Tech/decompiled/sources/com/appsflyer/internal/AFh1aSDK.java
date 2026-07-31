package com.appsflyer.internal;

import com.appsflyer.internal.AFi1pSDK;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class AFh1aSDK extends AFi1pSDK {
    AFh1aSDK(String str, String str2, Runnable runnable) {
        super(str, str2, runnable);
    }

    final void AFInAppEventParameterName(AFd1xSDK aFd1xSDK, AFc1aSDK<Map<String, Object>> aFc1aSDK) {
        AFb1tSDK.AFInAppEventType();
        if (AFb1tSDK.valueOf(aFd1xSDK, false) > 0 || !aFc1aSDK.AFInAppEventParameterName()) {
            return;
        }
        aFc1aSDK.AFInAppEventParameterName.AFInAppEventParameterName().execute(aFc1aSDK.AFKeystoreWrapper);
        this.AFLogger = System.currentTimeMillis();
        this.registerClient = AFi1pSDK.AFa1tSDK.STARTED;
        addObserver(new AFi1pSDK.AnonymousClass2());
    }
}
