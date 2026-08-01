package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c"}, d2 = {"Lcom/appsflyer/internal/AFh1rSDK;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getCurrencyIso4217Code", "Ljava/lang/String;", "getMediationNetwork", "component3", "getRevenue", "AFAdRevenueData", "Ljava/lang/Boolean;", "getMonetizationNetwork", "component2", "component1", "Ljava/util/Map;", "areAllFieldsValid"}, k = 1, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AFh1rSDK {

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    public Boolean getMonetizationNetwork;

    /* renamed from: component1, reason: from kotlin metadata */
    public Map<String, Object> component3;

    /* renamed from: component2, reason: from kotlin metadata */
    public Boolean areAllFieldsValid;

    /* renamed from: component3, reason: from kotlin metadata */
    public String getRevenue;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    public String getMediationNetwork;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    public Boolean getCurrencyIso4217Code;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    public Boolean AFAdRevenueData;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    public Boolean component2;

    public /* synthetic */ AFh1rSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : bool, (i3 & 4) != 0 ? null : bool2, (i3 & 8) != 0 ? null : bool3, (i3 & 16) != 0 ? null : bool4, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? null : bool5, (i3 & 128) != 0 ? new HashMap() : map);
    }

    public final boolean equals(Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof AFh1rSDK)) {
            return false;
        }
        AFh1rSDK aFh1rSDK = (AFh1rSDK) p02;
        return Intrinsics.a(this.getMediationNetwork, aFh1rSDK.getMediationNetwork) && Intrinsics.a(this.component2, aFh1rSDK.component2) && Intrinsics.a(this.getMonetizationNetwork, aFh1rSDK.getMonetizationNetwork) && Intrinsics.a(this.getCurrencyIso4217Code, aFh1rSDK.getCurrencyIso4217Code) && Intrinsics.a(this.AFAdRevenueData, aFh1rSDK.AFAdRevenueData) && Intrinsics.a(this.getRevenue, aFh1rSDK.getRevenue) && Intrinsics.a(this.areAllFieldsValid, aFh1rSDK.areAllFieldsValid) && Intrinsics.a(this.component3, aFh1rSDK.component3);
    }

    public final int hashCode() {
        String str = this.getMediationNetwork;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.component2;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.getMonetizationNetwork;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.getCurrencyIso4217Code;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.AFAdRevenueData;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.getRevenue;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.areAllFieldsValid;
        return this.component3.hashCode() + ((hashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AdvertisingIdData(advertisingId=" + this.getMediationNetwork + ", isLimited=" + this.component2 + ", isEnabled=" + this.getMonetizationNetwork + ", isGaidWithGps=" + this.getCurrencyIso4217Code + ", isGaidWithSamsungCloudDev=" + this.AFAdRevenueData + ", gaidError=" + this.getRevenue + ", retry=" + this.areAllFieldsValid + ", metadata=" + this.component3 + ")";
    }

    private AFh1rSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map<String, Object> map) {
        map.getClass();
        this.getMediationNetwork = str;
        this.component2 = bool;
        this.getMonetizationNetwork = bool2;
        this.getCurrencyIso4217Code = bool3;
        this.AFAdRevenueData = bool4;
        this.getRevenue = str2;
        this.areAllFieldsValid = bool5;
        this.component3 = map;
    }

    public AFh1rSDK() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
