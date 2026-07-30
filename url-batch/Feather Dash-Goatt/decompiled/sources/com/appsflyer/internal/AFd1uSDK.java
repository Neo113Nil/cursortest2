package com.appsflyer.internal;

import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFd1uSDK implements AFd1vSDK {
    private final AFc1aSDK getMonetizationNetwork;

    public AFd1uSDK(AFc1aSDK aFc1aSDK) {
        aFc1aSDK.getClass();
        this.getMonetizationNetwork = aFc1aSDK;
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void getMediationNetwork(byte[] bArr, Map<String, String> map, int i) {
        bArr.getClass();
        if (new AFd1qSDK(bArr, map, 2000).getMediationNetwork()) {
            this.getMonetizationNetwork.getMediationNetwork();
        }
    }
}
