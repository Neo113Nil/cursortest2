package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFc1sSDK {
    final String AFAdRevenueData;
    final List<AFe1pSDK> getMediationNetwork;
    final int getMonetizationNetwork;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1sSDK(String str, List<? extends AFe1pSDK> list, int i3) {
        str.getClass();
        list.getClass();
        this.AFAdRevenueData = str;
        this.getMediationNetwork = list;
        this.getMonetizationNetwork = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1sSDK)) {
            return false;
        }
        AFc1sSDK aFc1sSDK = (AFc1sSDK) obj;
        return Intrinsics.a(this.AFAdRevenueData, aFc1sSDK.AFAdRevenueData) && Intrinsics.a(this.getMediationNetwork, aFc1sSDK.getMediationNetwork) && this.getMonetizationNetwork == aFc1sSDK.getMonetizationNetwork;
    }

    public final int hashCode() {
        return Integer.hashCode(this.getMonetizationNetwork) + ((this.getMediationNetwork.hashCode() + (this.AFAdRevenueData.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "StorageConfigTypeEntry(cacheDirName=" + this.AFAdRevenueData + ", eventTypes=" + this.getMediationNetwork + ", maxCapacity=" + this.getMonetizationNetwork + ")";
    }
}
