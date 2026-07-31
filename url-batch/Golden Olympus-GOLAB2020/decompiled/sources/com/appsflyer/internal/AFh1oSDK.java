package com.appsflyer.internal;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.HashMap;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFh1oSDK {
    public String AFAdRevenueData;
    public String areAllFieldsValid;
    public Map<String, Object> component1;
    public Boolean component2;
    public Boolean getCurrencyIso4217Code;
    public Boolean getMediationNetwork;
    public Boolean getMonetizationNetwork;
    public Boolean getRevenue;

    private AFh1oSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.AFAdRevenueData = str;
        this.getRevenue = bool;
        this.getMonetizationNetwork = bool2;
        this.getMediationNetwork = bool3;
        this.getCurrencyIso4217Code = bool4;
        this.areAllFieldsValid = str2;
        this.component2 = bool5;
        this.component1 = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFh1oSDK)) {
            return false;
        }
        AFh1oSDK aFh1oSDK = (AFh1oSDK) obj;
        return Intrinsics.areEqual(this.AFAdRevenueData, aFh1oSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getRevenue, aFh1oSDK.getRevenue) && Intrinsics.areEqual(this.getMonetizationNetwork, aFh1oSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.getMediationNetwork, aFh1oSDK.getMediationNetwork) && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFh1oSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.areAllFieldsValid, aFh1oSDK.areAllFieldsValid) && Intrinsics.areEqual(this.component2, aFh1oSDK.component2) && Intrinsics.areEqual(this.component1, aFh1oSDK.component1);
    }

    public final int hashCode() {
        String str = this.AFAdRevenueData;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.getRevenue;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.getMonetizationNetwork;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.getMediationNetwork;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.getCurrencyIso4217Code;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.areAllFieldsValid;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.component2;
        return ((hashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31) + this.component1.hashCode();
    }

    public final String toString() {
        return "AdvertisingIdData(advertisingId=" + this.AFAdRevenueData + ", isLimited=" + this.getRevenue + ", isEnabled=" + this.getMonetizationNetwork + ", isGaidWithGps=" + this.getMediationNetwork + ", isGaidWithSamsungCloudDev=" + this.getCurrencyIso4217Code + ", gaidError=" + this.areAllFieldsValid + ", retry=" + this.component2 + ", metadata=" + this.component1 + ")";
    }

    public /* synthetic */ AFh1oSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : bool, (i4 & 4) != 0 ? null : bool2, (i4 & 8) != 0 ? null : bool3, (i4 & 16) != 0 ? null : bool4, (i4 & 32) != 0 ? null : str2, (i4 & 64) != 0 ? null : bool5, (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new HashMap() : map);
    }

    public AFh1oSDK() {
        this(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }
}
