package com.appsflyer.internal;

import com.appsflyer.internal.AFe1cSDK.AnonymousClass5;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFc1rSDK implements Runnable {
    private final Map<String, Object> AFInAppEventParameterName;
    private final AFd1mSDK AFKeystoreWrapper;
    private final AFa1rSDK valueOf;

    public AFc1rSDK(AFd1mSDK aFd1mSDK, AFa1rSDK aFa1rSDK, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(aFd1mSDK, "");
        Intrinsics.checkNotNullParameter(aFa1rSDK, "");
        this.AFKeystoreWrapper = aFd1mSDK;
        this.valueOf = aFa1rSDK;
        this.AFInAppEventParameterName = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFf1iSDK aFf1nSDK;
        if (this.valueOf.AFInAppEventParameterName()) {
            AFf1iSDK aFf1iSDK = new AFf1iSDK(this.valueOf, this.AFKeystoreWrapper);
            aFf1iSDK.v = this.AFInAppEventParameterName;
            aFf1nSDK = aFf1iSDK;
        } else {
            aFf1nSDK = new AFf1nSDK(this.valueOf, this.AFKeystoreWrapper);
        }
        AFe1cSDK i = this.AFKeystoreWrapper.i();
        i.AFInAppEventParameterName.execute(i.new AnonymousClass5(aFf1nSDK));
    }
}
