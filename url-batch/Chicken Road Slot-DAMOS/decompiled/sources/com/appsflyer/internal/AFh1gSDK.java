package com.appsflyer.internal;

import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFh1gSDK extends AFh1mSDK {
    public final AFe1pSDK hashCode;

    public AFh1gSDK(String str, byte[] bArr, String str2, AFe1pSDK aFe1pSDK, Map<String, String> map) {
        super(null, str, Boolean.FALSE);
        this.component3 = str2;
        getMediationNetwork(bArr);
        this.hashCode = aFe1pSDK;
        if (map != null) {
            this.getMediationNetwork.putAll(map);
        }
    }

    @Override // com.appsflyer.internal.AFh1mSDK
    public final AFe1pSDK AFAdRevenueData() {
        AFe1pSDK aFe1pSDK = this.hashCode;
        return aFe1pSDK != null ? aFe1pSDK : AFe1pSDK.CACHED_EVENT;
    }

    @Deprecated
    public AFh1gSDK() {
        this.hashCode = null;
    }
}
