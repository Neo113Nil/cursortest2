package com.appsflyer.internal;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFg1aSDK extends AFg1hSDK {
    private final boolean AFAdRevenueData;
    private final AFd1zSDK getMediationNetwork;

    public AFg1aSDK(AFd1zSDK aFd1zSDK) {
        aFd1zSDK.getClass();
        this.getMediationNetwork = aFd1zSDK;
        this.AFAdRevenueData = true;
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void d(AFg1cSDK aFg1cSDK, String str, boolean z) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z) {
            this.getMediationNetwork.copy().getMediationNetwork("D", getMonetizationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        aFg1cSDK.getClass();
        str.getClass();
        th.getClass();
        if (z4) {
            this.getMediationNetwork.copy().getMediationNetwork("E", getMonetizationNetwork(str, aFg1cSDK));
        }
        if (z4) {
            this.getMediationNetwork.copy().getCurrencyIso4217Code(th);
        }
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void force(AFg1cSDK aFg1cSDK, String str) {
        aFg1cSDK.getClass();
        str.getClass();
        this.getMediationNetwork.copy().getMediationNetwork("F", getMonetizationNetwork(str, aFg1cSDK));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final boolean getShouldExtendMsg() {
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void i(AFg1cSDK aFg1cSDK, String str, boolean z) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z) {
            this.getMediationNetwork.copy().getMediationNetwork("I", getMonetizationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void v(AFg1cSDK aFg1cSDK, String str, boolean z) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z) {
            this.getMediationNetwork.copy().getMediationNetwork("V", getMonetizationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void w(AFg1cSDK aFg1cSDK, String str, boolean z) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z) {
            this.getMediationNetwork.copy().getMediationNetwork("W", getMonetizationNetwork(str, aFg1cSDK));
        }
    }
}
