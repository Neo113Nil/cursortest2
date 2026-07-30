package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1cSDK.AnonymousClass2;

/* loaded from: classes3.dex */
public final class AFf1bSDK implements AFe1fSDK {
    private final Object AFInAppEventParameterName = new Object();
    private final AFd1sSDK AFInAppEventType;
    private final AFg1wSDK AFKeystoreWrapper;
    private AFh1aSDK AFLogger;
    private final AFg1zSDK d;
    private final AFe1ySDK e;
    private AFf1gSDK registerClient;
    private final AFe1cSDK unregisterClient;
    public final AFg1xSDK valueOf;
    private final AFg1ySDK values;

    @Override // com.appsflyer.internal.AFe1fSDK
    public final void values(AFe1dSDK<?> aFe1dSDK) {
    }

    public AFf1bSDK(AFg1ySDK aFg1ySDK, AFd1sSDK aFd1sSDK, AFg1wSDK aFg1wSDK, AFg1xSDK aFg1xSDK, AFe1ySDK aFe1ySDK, AFg1zSDK aFg1zSDK, AFe1cSDK aFe1cSDK) {
        this.values = aFg1ySDK;
        this.AFInAppEventType = aFd1sSDK;
        this.AFKeystoreWrapper = aFg1wSDK;
        this.valueOf = aFg1xSDK;
        this.e = aFe1ySDK;
        this.d = aFg1zSDK;
        this.unregisterClient = aFe1cSDK;
        aFe1cSDK.AFInAppEventParameterName.add(this);
    }

    public final void AFKeystoreWrapper(AFf1eSDK aFf1eSDK) {
        AFf1fSDK aFf1fSDK = new AFf1fSDK(this.values, this.AFInAppEventType, this.AFKeystoreWrapper, this.valueOf, this.e, this.d, "v1", aFf1eSDK);
        AFe1cSDK aFe1cSDK = this.unregisterClient;
        aFe1cSDK.valueOf.execute(aFe1cSDK.new AnonymousClass2(aFf1fSDK));
    }

    public final AFh1aSDK values() {
        AFh1aSDK aFh1aSDK;
        synchronized (this.AFInAppEventParameterName) {
            aFh1aSDK = this.AFLogger;
            this.AFLogger = null;
        }
        return aFh1aSDK;
    }

    private void AFInAppEventType(AFf1gSDK aFf1gSDK, AFf1eSDK aFf1eSDK) {
        synchronized (this.AFInAppEventParameterName) {
            this.registerClient = aFf1gSDK;
        }
        if (aFf1eSDK != null) {
            aFf1eSDK.onRemoteConfigUpdateFinished(aFf1gSDK);
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final void values(AFe1dSDK<?> aFe1dSDK, AFe1bSDK aFe1bSDK) {
        if (aFe1dSDK instanceof AFf1fSDK) {
            AFf1fSDK aFf1fSDK = (AFf1fSDK) aFe1dSDK;
            AFf1gSDK aFf1gSDK = aFf1fSDK.d;
            if (aFf1gSDK == null) {
                AFLogger.INSTANCE.w(AFg1aSDK.REMOTE_CONTROL, "update RC returned null result, something went wrong!");
                aFf1gSDK = AFf1gSDK.FAILURE;
            }
            if (aFf1gSDK != AFf1gSDK.USE_CACHED) {
                AFh1aSDK aFh1aSDK = aFf1fSDK.AFLogger;
                synchronized (this.AFInAppEventParameterName) {
                    this.AFLogger = aFh1aSDK;
                }
            }
            AFInAppEventType(aFf1gSDK, aFf1fSDK.registerClient);
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final void AFInAppEventType(AFe1dSDK<?> aFe1dSDK) {
        if (aFe1dSDK instanceof AFf1fSDK) {
            AFf1fSDK aFf1fSDK = (AFf1fSDK) aFe1dSDK;
            synchronized (this.AFInAppEventParameterName) {
                this.AFLogger = null;
            }
            AFInAppEventType(AFf1gSDK.FAILURE, aFf1fSDK.registerClient);
        }
    }
}
