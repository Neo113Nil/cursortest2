package com.appsflyer.internal;

import defpackage.qy0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFg1xSDK {
    public final String AFAdRevenueData;
    public final boolean getMediationNetwork;
    public final long getMonetizationNetwork;

    public AFg1xSDK(String str, long j, boolean z) {
        str.getClass();
        this.AFAdRevenueData = str;
        this.getMonetizationNetwork = j;
        this.getMediationNetwork = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1xSDK)) {
            return false;
        }
        AFg1xSDK aFg1xSDK = (AFg1xSDK) obj;
        return Intrinsics.a(this.AFAdRevenueData, aFg1xSDK.AFAdRevenueData) && this.getMonetizationNetwork == aFg1xSDK.getMonetizationNetwork && this.getMediationNetwork == aFg1xSDK.getMediationNetwork;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int e = qy0.e(this.getMonetizationNetwork, this.AFAdRevenueData.hashCode() * 31, 31);
        boolean z = this.getMediationNetwork;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return e + i;
    }

    public final String toString() {
        return "AFUninstallToken(token=" + this.AFAdRevenueData + ", receivedTime=" + this.getMonetizationNetwork + ", isQueued=" + this.getMediationNetwork + ")";
    }
}
