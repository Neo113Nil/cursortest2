package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFe1zSDK {
    public final String getCurrencyIso4217Code;
    public final AFe1sSDK getMonetizationNetwork;
    public final String getRevenue;

    public AFe1zSDK(String str, String str2, AFe1sSDK aFe1sSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFe1sSDK, "");
        this.getRevenue = str;
        this.getCurrencyIso4217Code = str2;
        this.getMonetizationNetwork = aFe1sSDK;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1zSDK)) {
            return false;
        }
        AFe1zSDK aFe1zSDK = (AFe1zSDK) obj;
        return Intrinsics.a(this.getRevenue, aFe1zSDK.getRevenue) && Intrinsics.a(this.getCurrencyIso4217Code, aFe1zSDK.getCurrencyIso4217Code) && this.getMonetizationNetwork == aFe1zSDK.getMonetizationNetwork;
    }

    public final int hashCode() {
        int hashCode = this.getRevenue.hashCode() * 31;
        String str = this.getCurrencyIso4217Code;
        return this.getMonetizationNetwork.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "HostMeta(name=" + this.getRevenue + ", prefix=" + this.getCurrencyIso4217Code + ", method=" + this.getMonetizationNetwork + ")";
    }
}
