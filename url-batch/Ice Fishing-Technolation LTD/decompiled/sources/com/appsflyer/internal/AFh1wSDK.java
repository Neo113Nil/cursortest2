package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFh1wSDK extends AFh1ySDK {
    private final AFd1zSDK getMonetizationNetwork;
    private final boolean getRevenue;

    public AFh1wSDK(AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.getMonetizationNetwork = aFd1zSDK;
        this.getRevenue = true;
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final boolean getShouldExtendMsg() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void d(AFg1cSDK aFg1cSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.getMonetizationNetwork.copy().getMonetizationNetwork("D", getMediationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z4) {
            this.getMonetizationNetwork.copy().getMonetizationNetwork("E", getMediationNetwork(str, aFg1cSDK));
        }
        if (z4) {
            this.getMonetizationNetwork.copy().getRevenue(th);
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void i(AFg1cSDK aFg1cSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.getMonetizationNetwork.copy().getMonetizationNetwork("I", getMediationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void w(AFg1cSDK aFg1cSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.getMonetizationNetwork.copy().getMonetizationNetwork("W", getMediationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void v(AFg1cSDK aFg1cSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.getMonetizationNetwork.copy().getMonetizationNetwork("V", getMediationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void force(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.getMonetizationNetwork.copy().getMonetizationNetwork("F", getMediationNetwork(str, aFg1cSDK));
    }
}
