package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerClient;
import defpackage.qy0;
import defpackage.ry0;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0019\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 "}, d2 = {"Lcom/appsflyer/internal/AFi1zSDK;", "", "", "p0", "", "p1", "", "", "p2", "", "p3", "p4", "p5", "<init>", "(JFLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getMonetizationNetwork", "()Z", "getMediationNetwork", "AFAdRevenueData", "Ljava/lang/String;", "getRevenue", "I", "getCurrencyIso4217Code", "F", "component3", "Ljava/util/List;", "component1", "J"}, k = 1, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
public final class AFi1zSDK {

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    public final String getMonetizationNetwork;

    /* renamed from: component3, reason: from kotlin metadata */
    public final String getRevenue;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    public final float AFAdRevenueData;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    public List<String> component1;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    public long component3;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    public final int getCurrencyIso4217Code;

    public AFi1zSDK(long j, float f, List<String> list, int i, String str, String str2) {
        list.getClass();
        str.getClass();
        str2.getClass();
        this.component3 = j;
        this.AFAdRevenueData = f;
        this.component1 = list;
        this.getCurrencyIso4217Code = i;
        this.getMonetizationNetwork = str;
        this.getRevenue = str2;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!AFi1zSDK.class.equals(p0 != null ? p0.getClass() : null)) {
            return false;
        }
        p0.getClass();
        AFi1zSDK aFi1zSDK = (AFi1zSDK) p0;
        return this.component3 == aFi1zSDK.component3 && this.AFAdRevenueData == aFi1zSDK.AFAdRevenueData && Intrinsics.a(this.component1, aFi1zSDK.component1) && this.getCurrencyIso4217Code == aFi1zSDK.getCurrencyIso4217Code && Intrinsics.a(this.getMonetizationNetwork, aFi1zSDK.getMonetizationNetwork) && Intrinsics.a(this.getRevenue, aFi1zSDK.getRevenue);
    }

    public final boolean getMonetizationNetwork() {
        return TimeUnit.SECONDS.toMillis(this.component3) > AFa1tSDK.getMediationNetwork().getRevenue().areAllFieldsValid().getCurrencyIso4217Code();
    }

    public final int hashCode() {
        return this.getRevenue.hashCode() + ((this.getMonetizationNetwork.hashCode() + ((((this.component1.hashCode() + qy0.b(this.AFAdRevenueData, Long.hashCode(this.component3) * 31, 31)) * 31) + this.getCurrencyIso4217Code) * 31)) * 31);
    }
}
