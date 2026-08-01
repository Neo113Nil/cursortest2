package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFf1aSDK {
    public final boolean getMediationNetwork;
    public final long getMonetizationNetwork;
    public final String getRevenue;

    public AFf1aSDK(String str, long j, boolean z10) {
        str.getClass();
        this.getRevenue = str;
        this.getMonetizationNetwork = j;
        this.getMediationNetwork = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1aSDK)) {
            return false;
        }
        AFf1aSDK aFf1aSDK = (AFf1aSDK) obj;
        return Intrinsics.a(this.getRevenue, aFf1aSDK.getRevenue) && this.getMonetizationNetwork == aFf1aSDK.getMonetizationNetwork && this.getMediationNetwork == aFf1aSDK.getMediationNetwork;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int c10 = n0.l.c(this.getRevenue.hashCode() * 31, 31, this.getMonetizationNetwork);
        boolean z10 = this.getMediationNetwork;
        int i3 = z10;
        if (z10 != 0) {
            i3 = 1;
        }
        return c10 + i3;
    }

    public final String toString() {
        return "AFUninstallToken(token=" + this.getRevenue + ", receivedTime=" + this.getMonetizationNetwork + ", isQueued=" + this.getMediationNetwork + ")";
    }
}
