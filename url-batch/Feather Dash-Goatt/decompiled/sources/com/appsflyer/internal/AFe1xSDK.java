package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFe1xSDK {
    final String getCurrencyIso4217Code;
    final String getMonetizationNetwork;

    public AFe1xSDK(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.getMonetizationNetwork = str;
        this.getCurrencyIso4217Code = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1xSDK)) {
            return false;
        }
        AFe1xSDK aFe1xSDK = (AFe1xSDK) obj;
        return Intrinsics.a(this.getMonetizationNetwork, aFe1xSDK.getMonetizationNetwork) && Intrinsics.a(this.getCurrencyIso4217Code, aFe1xSDK.getCurrencyIso4217Code);
    }

    public final int hashCode() {
        return this.getCurrencyIso4217Code.hashCode() + (this.getMonetizationNetwork.hashCode() * 31);
    }

    public final String toString() {
        return "HostConfig(prefix=" + this.getMonetizationNetwork + ", host=" + this.getCurrencyIso4217Code + ")";
    }
}
