package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFe1bSDK extends AFa1qSDK {
    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean afRDLog() {
        return true;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFd1vSDK AFInAppEventParameterName() {
        if (this.afErrorLog == 1) {
            return AFd1vSDK.CONVERSION;
        }
        return AFd1vSDK.LAUNCH;
    }
}
