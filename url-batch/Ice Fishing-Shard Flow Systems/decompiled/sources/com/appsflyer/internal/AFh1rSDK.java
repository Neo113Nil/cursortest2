package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFh1rSDK {
    public Boolean AFAdRevenueData;
    public Map<String, Object> areAllFieldsValid;
    public Boolean component1;
    public String component3;
    public Boolean getCurrencyIso4217Code;
    public Boolean getMediationNetwork;
    public String getMonetizationNetwork;
    public Boolean getRevenue;

    private AFh1rSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.getMonetizationNetwork = str;
        this.AFAdRevenueData = bool;
        this.getMediationNetwork = bool2;
        this.getCurrencyIso4217Code = bool3;
        this.getRevenue = bool4;
        this.component3 = str2;
        this.component1 = bool5;
        this.areAllFieldsValid = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFh1rSDK)) {
            return false;
        }
        AFh1rSDK aFh1rSDK = (AFh1rSDK) obj;
        return Intrinsics.a(this.getMonetizationNetwork, aFh1rSDK.getMonetizationNetwork) && Intrinsics.a(this.AFAdRevenueData, aFh1rSDK.AFAdRevenueData) && Intrinsics.a(this.getMediationNetwork, aFh1rSDK.getMediationNetwork) && Intrinsics.a(this.getCurrencyIso4217Code, aFh1rSDK.getCurrencyIso4217Code) && Intrinsics.a(this.getRevenue, aFh1rSDK.getRevenue) && Intrinsics.a(this.component3, aFh1rSDK.component3) && Intrinsics.a(this.component1, aFh1rSDK.component1) && Intrinsics.a(this.areAllFieldsValid, aFh1rSDK.areAllFieldsValid);
    }

    public final int hashCode() {
        String str = this.getMonetizationNetwork;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.AFAdRevenueData;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.getMediationNetwork;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.getCurrencyIso4217Code;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.getRevenue;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.component3;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.component1;
        return this.areAllFieldsValid.hashCode() + ((hashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AdvertisingIdData(advertisingId=" + this.getMonetizationNetwork + ", isLimited=" + this.AFAdRevenueData + ", isEnabled=" + this.getMediationNetwork + ", isGaidWithGps=" + this.getCurrencyIso4217Code + ", isGaidWithSamsungCloudDev=" + this.getRevenue + ", gaidError=" + this.component3 + ", retry=" + this.component1 + ", metadata=" + this.areAllFieldsValid + ")";
    }

    public /* synthetic */ AFh1rSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? null : bool2, (i2 & 8) != 0 ? null : bool3, (i2 & 16) != 0 ? null : bool4, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : bool5, (i2 & 128) != 0 ? new HashMap() : map);
    }

    public AFh1rSDK() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
