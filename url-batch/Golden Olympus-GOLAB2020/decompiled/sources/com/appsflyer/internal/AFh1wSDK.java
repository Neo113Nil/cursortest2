package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFh1wSDK extends AFg1gSDK {
    private final AFc1dSDK getMonetizationNetwork;
    private final boolean getRevenue;

    public AFh1wSDK(AFc1dSDK aFc1dSDK) {
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        this.getMonetizationNetwork = aFc1dSDK;
        this.getRevenue = true;
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void d(AFg1cSDK aFg1cSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z4) {
            this.getMonetizationNetwork.copy().getMonetizationNetwork("D", getRevenue(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z7) {
            this.getMonetizationNetwork.copy().getMonetizationNetwork("E", getRevenue(str, aFg1cSDK));
        }
        if (z7) {
            this.getMonetizationNetwork.copy().getMonetizationNetwork(th);
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void force(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.getMonetizationNetwork.copy().getMonetizationNetwork("F", getRevenue(str, aFg1cSDK));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final boolean getShouldExtendMsg() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void i(AFg1cSDK aFg1cSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z4) {
            this.getMonetizationNetwork.copy().getMonetizationNetwork("I", getRevenue(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void v(AFg1cSDK aFg1cSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z4) {
            this.getMonetizationNetwork.copy().getMonetizationNetwork("V", getRevenue(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void w(AFg1cSDK aFg1cSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z4) {
            this.getMonetizationNetwork.copy().getMonetizationNetwork("W", getRevenue(str, aFg1cSDK));
        }
    }
}
