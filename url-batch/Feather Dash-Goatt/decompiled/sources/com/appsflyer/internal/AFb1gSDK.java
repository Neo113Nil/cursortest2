package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFb1gSDK {
    public final String AFAdRevenueData;
    public final int getCurrencyIso4217Code;

    public AFb1gSDK(int i, String str) {
        str.getClass();
        this.getCurrencyIso4217Code = i;
        this.AFAdRevenueData = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFb1gSDK)) {
            return false;
        }
        AFb1gSDK aFb1gSDK = (AFb1gSDK) obj;
        return this.getCurrencyIso4217Code == aFb1gSDK.getCurrencyIso4217Code && Intrinsics.a(this.AFAdRevenueData, aFb1gSDK.AFAdRevenueData);
    }

    public final int hashCode() {
        return this.AFAdRevenueData.hashCode() + (Integer.hashCode(this.getCurrencyIso4217Code) * 31);
    }

    public final String toString() {
        return "AppSetIdModel(scope=" + this.getCurrencyIso4217Code + ", id=" + this.AFAdRevenueData + ")";
    }
}
