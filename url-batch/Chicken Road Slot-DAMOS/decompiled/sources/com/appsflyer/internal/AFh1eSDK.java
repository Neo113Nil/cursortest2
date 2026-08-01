package com.appsflyer.internal;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFh1eSDK extends AFh1mSDK {
    @Override // com.appsflyer.internal.AFh1mSDK
    public final AFe1pSDK AFAdRevenueData() {
        return this.component4 == 1 ? AFe1pSDK.CONVERSION : AFe1pSDK.LAUNCH;
    }

    @Override // com.appsflyer.internal.AFh1mSDK
    public final boolean areAllFieldsValid() {
        return true;
    }
}
