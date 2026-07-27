package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFh1ySDK implements AFh1zSDK {
    private AFg1bSDK AFInAppEventParameterName;
    private AFg1hSDK AFInAppEventType;
    private final AFd1kSDK AFKeystoreWrapper;
    private AFg1gSDK values;

    public AFh1ySDK(AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.AFKeystoreWrapper = aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFh1zSDK
    public final void AFInAppEventParameterName() {
        AFg1bSDK aFg1bSDK = this.AFInAppEventParameterName;
        if (aFg1bSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1fSDK.v$default(aFLogger, AFg1aSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1bSDK);
            this.AFInAppEventParameterName = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1zSDK
    public final void AFInAppEventType() {
        AFg1hSDK aFg1hSDK = this.AFInAppEventType;
        if (aFg1hSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1fSDK.v$default(aFLogger, AFg1aSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1hSDK);
            this.AFInAppEventType = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1zSDK
    public final void AFKeystoreWrapper() {
        AFg1gSDK aFg1gSDK = this.values;
        if (aFg1gSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1fSDK.v$default(aFLogger, AFg1aSDK.EXCEPTION_MANAGER, "Releasing Exception Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1gSDK);
            this.values = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1zSDK
    public final void registerClient() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.AFInAppEventType == null) {
            this.AFInAppEventType = new AFg1hSDK();
        }
        AFg1hSDK aFg1hSDK = this.AFInAppEventType;
        Intrinsics.c(aFg1hSDK);
        aFLogger.registerClient(aFg1hSDK);
    }

    @Override // com.appsflyer.internal.AFh1zSDK
    public final void valueOf() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.values == null) {
            this.values = new AFg1gSDK(this.AFKeystoreWrapper);
        }
        AFg1gSDK aFg1gSDK = this.values;
        Intrinsics.c(aFg1gSDK);
        aFLogger.registerClient(aFg1gSDK);
    }

    @Override // com.appsflyer.internal.AFh1zSDK
    public final void values() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.AFInAppEventParameterName == null) {
            this.AFInAppEventParameterName = new AFg1bSDK(this.AFKeystoreWrapper);
        }
        AFg1bSDK aFg1bSDK = this.AFInAppEventParameterName;
        Intrinsics.c(aFg1bSDK);
        aFLogger.registerClient(aFg1bSDK);
    }
}
