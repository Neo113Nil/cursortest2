package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFg1kSDK implements AFg1mSDK {
    private AFg1oSDK AFInAppEventParameterName;
    private AFg1nSDK AFInAppEventType;
    private AFg1lSDK AFKeystoreWrapper;
    private final AFd1mSDK values;

    public AFg1kSDK(AFd1mSDK aFd1mSDK) {
        Intrinsics.checkNotNullParameter(aFd1mSDK, "");
        this.values = aFd1mSDK;
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void values() {
        AFg1nSDK aFg1nSDK = this.AFInAppEventType;
        if (aFg1nSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1pSDK.v$default(aFLogger, AFg1jSDK.EXCEPTION_MANAGER, "Releasing Exception Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1nSDK);
            this.AFInAppEventType = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void AFInAppEventParameterName() {
        AFg1lSDK aFg1lSDK = this.AFKeystoreWrapper;
        if (aFg1lSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1pSDK.v$default(aFLogger, AFg1jSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1lSDK);
            this.AFKeystoreWrapper = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void valueOf() {
        AFg1oSDK aFg1oSDK = this.AFInAppEventParameterName;
        if (aFg1oSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1pSDK.v$default(aFLogger, AFg1jSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1oSDK);
            this.AFInAppEventParameterName = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void registerClient() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1pSDK[] aFg1pSDKArr = new AFg1pSDK[1];
        if (this.AFInAppEventParameterName == null) {
            this.AFInAppEventParameterName = new AFg1oSDK();
        }
        AFg1oSDK aFg1oSDK = this.AFInAppEventParameterName;
        Intrinsics.checkNotNull(aFg1oSDK);
        aFg1pSDKArr[0] = aFg1oSDK;
        aFLogger.registerClient(aFg1pSDKArr);
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void AFInAppEventType() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1pSDK[] aFg1pSDKArr = new AFg1pSDK[1];
        if (this.AFKeystoreWrapper == null) {
            this.AFKeystoreWrapper = new AFg1lSDK(this.values);
        }
        AFg1lSDK aFg1lSDK = this.AFKeystoreWrapper;
        Intrinsics.checkNotNull(aFg1lSDK);
        aFg1pSDKArr[0] = aFg1lSDK;
        aFLogger.registerClient(aFg1pSDKArr);
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void AFKeystoreWrapper() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1pSDK[] aFg1pSDKArr = new AFg1pSDK[1];
        if (this.AFInAppEventType == null) {
            this.AFInAppEventType = new AFg1nSDK(this.values);
        }
        AFg1nSDK aFg1nSDK = this.AFInAppEventType;
        Intrinsics.checkNotNull(aFg1nSDK);
        aFg1pSDKArr[0] = aFg1nSDK;
        aFLogger.registerClient(aFg1pSDKArr);
    }
}
