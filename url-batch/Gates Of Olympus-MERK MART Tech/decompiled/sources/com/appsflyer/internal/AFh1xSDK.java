package com.appsflyer.internal;

/* loaded from: classes3.dex */
public final class AFh1xSDK extends AFa1rSDK {
    @Override // com.appsflyer.internal.AFa1rSDK
    public final boolean unregisterClient() {
        return true;
    }

    @Override // com.appsflyer.internal.AFa1rSDK
    public final AFe1eSDK valueOf() {
        if (this.AFLogger == 1) {
            return AFe1eSDK.CONVERSION;
        }
        return AFe1eSDK.LAUNCH;
    }
}
