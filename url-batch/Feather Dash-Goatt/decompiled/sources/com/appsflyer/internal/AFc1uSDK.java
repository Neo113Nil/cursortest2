package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFc1uSDK {
    final String getCurrencyIso4217Code;
    final int getMediationNetwork;
    final List<AFe1lSDK> getMonetizationNetwork;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1uSDK(String str, List<? extends AFe1lSDK> list, int i) {
        str.getClass();
        list.getClass();
        this.getCurrencyIso4217Code = str;
        this.getMonetizationNetwork = list;
        this.getMediationNetwork = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1uSDK)) {
            return false;
        }
        AFc1uSDK aFc1uSDK = (AFc1uSDK) obj;
        return Intrinsics.a(this.getCurrencyIso4217Code, aFc1uSDK.getCurrencyIso4217Code) && Intrinsics.a(this.getMonetizationNetwork, aFc1uSDK.getMonetizationNetwork) && this.getMediationNetwork == aFc1uSDK.getMediationNetwork;
    }

    public final int hashCode() {
        return Integer.hashCode(this.getMediationNetwork) + ((this.getMonetizationNetwork.hashCode() + (this.getCurrencyIso4217Code.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "StorageConfigTypeEntry(cacheDirName=" + this.getCurrencyIso4217Code + ", eventTypes=" + this.getMonetizationNetwork + ", maxCapacity=" + this.getMediationNetwork + ")";
    }
}
