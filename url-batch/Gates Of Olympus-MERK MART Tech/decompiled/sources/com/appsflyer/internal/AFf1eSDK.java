package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1cSDK.AnonymousClass5;

/* loaded from: classes3.dex */
public final class AFf1eSDK implements AFe1fSDK {
    public final AFf1cSDK AFInAppEventParameterName;
    private final Object AFInAppEventType = new Object();
    private final AFf1fSDK AFKeystoreWrapper;
    private final AFf1gSDK AFLogger;
    private final AFe1wSDK d;
    private AFh1jSDK e;
    private AFf1kSDK registerClient;
    private final AFe1cSDK unregisterClient;
    private final AFd1pSDK valueOf;
    private final AFg1xSDK values;

    @Override // com.appsflyer.internal.AFe1fSDK
    public final void AFKeystoreWrapper(AFe1dSDK<?> aFe1dSDK) {
    }

    public AFf1eSDK(AFf1fSDK aFf1fSDK, AFd1pSDK aFd1pSDK, AFg1xSDK aFg1xSDK, AFf1cSDK aFf1cSDK, AFe1wSDK aFe1wSDK, AFf1gSDK aFf1gSDK, AFe1cSDK aFe1cSDK) {
        this.AFKeystoreWrapper = aFf1fSDK;
        this.valueOf = aFd1pSDK;
        this.values = aFg1xSDK;
        this.AFInAppEventParameterName = aFf1cSDK;
        this.d = aFe1wSDK;
        this.AFLogger = aFf1gSDK;
        this.unregisterClient = aFe1cSDK;
        aFe1cSDK.valueOf.add(this);
    }

    public final void valueOf(AFf1jSDK aFf1jSDK) {
        AFf1lSDK aFf1lSDK = new AFf1lSDK(this.AFKeystoreWrapper, this.valueOf, this.values, this.AFInAppEventParameterName, this.d, this.AFLogger, "v1", aFf1jSDK);
        AFe1cSDK aFe1cSDK = this.unregisterClient;
        aFe1cSDK.AFInAppEventParameterName.execute(aFe1cSDK.new AnonymousClass5(aFf1lSDK));
    }

    public final AFh1jSDK AFKeystoreWrapper() {
        AFh1jSDK aFh1jSDK;
        synchronized (this.AFInAppEventType) {
            aFh1jSDK = this.e;
            this.e = null;
        }
        return aFh1jSDK;
    }

    private void values(AFf1kSDK aFf1kSDK, AFf1jSDK aFf1jSDK) {
        synchronized (this.AFInAppEventType) {
            this.registerClient = aFf1kSDK;
        }
        if (aFf1jSDK != null) {
            aFf1jSDK.onRemoteConfigUpdateFinished(aFf1kSDK);
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final void valueOf(AFe1dSDK<?> aFe1dSDK, AFe1bSDK aFe1bSDK) {
        if (aFe1dSDK instanceof AFf1lSDK) {
            AFf1lSDK aFf1lSDK = (AFf1lSDK) aFe1dSDK;
            AFf1kSDK aFf1kSDK = aFf1lSDK.d;
            if (aFf1kSDK == null) {
                AFLogger.INSTANCE.w(AFg1jSDK.REMOTE_CONTROL, "update RC returned null result, something went wrong!");
                aFf1kSDK = AFf1kSDK.FAILURE;
            }
            if (aFf1kSDK != AFf1kSDK.USE_CACHED) {
                AFh1jSDK aFh1jSDK = aFf1lSDK.unregisterClient;
                synchronized (this.AFInAppEventType) {
                    this.e = aFh1jSDK;
                }
            }
            values(aFf1kSDK, aFf1lSDK.e);
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final void valueOf(AFe1dSDK<?> aFe1dSDK) {
        if (aFe1dSDK instanceof AFf1lSDK) {
            AFf1lSDK aFf1lSDK = (AFf1lSDK) aFe1dSDK;
            synchronized (this.AFInAppEventType) {
                this.e = null;
            }
            values(AFf1kSDK.FAILURE, aFf1lSDK.e);
        }
    }
}
