package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFh1mSDK extends AFa1qSDK {
    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean unregisterClient() {
        return true;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFf1zSDK values() {
        return this.AFLogger == 1 ? AFf1zSDK.CONVERSION : AFf1zSDK.LAUNCH;
    }
}
