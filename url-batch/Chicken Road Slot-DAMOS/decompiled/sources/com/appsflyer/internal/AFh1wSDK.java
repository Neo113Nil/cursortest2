package com.appsflyer.internal;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFh1wSDK extends AFh1ySDK {
    private final boolean getCurrencyIso4217Code;
    private final AFd1zSDK getMediationNetwork;

    public AFh1wSDK(AFd1zSDK aFd1zSDK) {
        aFd1zSDK.getClass();
        this.getMediationNetwork = aFd1zSDK;
        this.getCurrencyIso4217Code = true;
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void d(AFg1cSDK aFg1cSDK, String str, boolean z10) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z10) {
            this.getMediationNetwork.copy().getMonetizationNetwork("D", getMediationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z10, boolean z11, boolean z12, boolean z13) {
        aFg1cSDK.getClass();
        str.getClass();
        th.getClass();
        if (z13) {
            this.getMediationNetwork.copy().getMonetizationNetwork("E", getMediationNetwork(str, aFg1cSDK));
        }
        if (z13) {
            this.getMediationNetwork.copy().getRevenue(th);
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void force(AFg1cSDK aFg1cSDK, String str) {
        aFg1cSDK.getClass();
        str.getClass();
        this.getMediationNetwork.copy().getMonetizationNetwork("F", getMediationNetwork(str, aFg1cSDK));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final boolean getShouldExtendMsg() {
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void i(AFg1cSDK aFg1cSDK, String str, boolean z10) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z10) {
            this.getMediationNetwork.copy().getMonetizationNetwork("I", getMediationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void v(AFg1cSDK aFg1cSDK, String str, boolean z10) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z10) {
            this.getMediationNetwork.copy().getMonetizationNetwork("V", getMediationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void w(AFg1cSDK aFg1cSDK, String str, boolean z10) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z10) {
            this.getMediationNetwork.copy().getMonetizationNetwork("W", getMediationNetwork(str, aFg1cSDK));
        }
    }
}
