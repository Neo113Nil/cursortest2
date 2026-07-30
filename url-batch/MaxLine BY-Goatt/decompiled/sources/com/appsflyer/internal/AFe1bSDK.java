package com.appsflyer.internal;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFe1bSDK extends AFa1qSDK {
    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFd1vSDK AFInAppEventParameterName() {
        return this.afErrorLog == 1 ? AFd1vSDK.CONVERSION : AFd1vSDK.LAUNCH;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean afRDLog() {
        return true;
    }
}
