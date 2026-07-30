package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerClient;
import defpackage.ry0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B+\b\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/appsflyer/internal/AFa1jSDK;", "", "", "", "p0", "Lcom/appsflyer/internal/AFa1gSDK;", "p1", "<init>", "(Ljava/util/Map;Lcom/appsflyer/internal/AFa1gSDK;)V", "", "getCurrencyIso4217Code", "(Ljava/lang/String;)Z", "", "getMediationNetwork", "(Ljava/lang/String;Ljava/lang/Object;)V", "getMonetizationNetwork", "Ljava/util/Map;", "getRevenue", "AFAdRevenueData", "Lcom/appsflyer/internal/AFa1gSDK;", "AFa1ySDK"}, k = 1, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
public final class AFa1jSDK {

    /* renamed from: AFa1ySDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    final AFa1gSDK AFAdRevenueData;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    final Map<String, Object> getRevenue;

    public /* synthetic */ AFa1jSDK(Map map, AFa1gSDK aFa1gSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? null : aFa1gSDK);
    }

    public static final AFa1jSDK getRevenue(AFh1sSDK aFh1sSDK) {
        return Companion.getMediationNetwork(aFh1sSDK);
    }

    public final boolean getCurrencyIso4217Code(String p0) {
        p0.getClass();
        return this.getRevenue.containsKey(p0);
    }

    public final void getMediationNetwork(String p0, Object p1) {
        p0.getClass();
        this.getRevenue.put(p0, p1);
        AFa1gSDK aFa1gSDK = this.AFAdRevenueData;
        if (aFa1gSDK != null) {
            aFa1gSDK.getMonetizationNetwork(this.getRevenue);
        }
    }

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFa1jSDK$AFa1ySDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFh1sSDK;", "p0", "Lcom/appsflyer/internal/AFa1jSDK;", "getMediationNetwork", "(Lcom/appsflyer/internal/AFh1sSDK;)Lcom/appsflyer/internal/AFa1jSDK;", "Lcom/appsflyer/internal/AFa1gSDK;", "getCurrencyIso4217Code", "(Lcom/appsflyer/internal/AFa1gSDK;)Lcom/appsflyer/internal/AFa1jSDK;"}, k = 1, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFa1jSDK$AFa1ySDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static AFa1jSDK getCurrencyIso4217Code(AFa1gSDK p0) {
            p0.getClass();
            return new AFa1jSDK(new LinkedHashMap(), p0, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static AFa1jSDK getMediationNetwork(AFh1sSDK p0) {
            p0.getClass();
            Map<String, Object> map = p0.AFAdRevenueData;
            map.getClass();
            return new AFa1jSDK(map, null, 2, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AFa1jSDK(Map<String, Object> map, AFa1gSDK aFa1gSDK) {
        this.getRevenue = map;
        this.AFAdRevenueData = aFa1gSDK;
    }

    public /* synthetic */ AFa1jSDK(Map map, AFa1gSDK aFa1gSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFa1gSDK);
    }

    public static final AFa1jSDK getMediationNetwork(AFa1gSDK aFa1gSDK) {
        return Companion.getCurrencyIso4217Code(aFa1gSDK);
    }
}
