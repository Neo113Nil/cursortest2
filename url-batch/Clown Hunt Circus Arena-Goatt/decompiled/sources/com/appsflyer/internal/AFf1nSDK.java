package com.appsflyer.internal;

import com.appsflyer.internal.AFf1jSDK;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class AFf1nSDK extends AFf1jSDK {
    AFf1nSDK(String str, String str2, Runnable runnable) {
        super(str, str2, runnable);
    }

    final void values(AFb1fSDK aFb1fSDK, AFb1qSDK<Map<String, Object>> aFb1qSDK) {
        if (AFa1dSDK.valueOf().AFInAppEventType(aFb1fSDK, false) > 0 || !aFb1qSDK.AFKeystoreWrapper()) {
            return;
        }
        aFb1qSDK.AFKeystoreWrapper.valueOf().execute(aFb1qSDK.values);
        this.AFLogger = System.currentTimeMillis();
        this.afRDLog = AFf1jSDK.AFa1vSDK.STARTED;
        addObserver(new AFf1jSDK.AnonymousClass5());
    }
}
