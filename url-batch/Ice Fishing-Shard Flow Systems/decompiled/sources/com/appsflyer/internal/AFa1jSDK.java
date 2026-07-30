package com.appsflyer.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFa1jSDK {
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);
    final AFa1gSDK AFAdRevenueData;
    final Map<String, Object> getMonetizationNetwork;

    @Metadata
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        public static AFa1jSDK getCurrencyIso4217Code(AFa1gSDK aFa1gSDK) {
            Intrinsics.checkNotNullParameter(aFa1gSDK, "");
            return new AFa1jSDK(new LinkedHashMap(), aFa1gSDK, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static AFa1jSDK getMediationNetwork(AFh1sSDK aFh1sSDK) {
            Intrinsics.checkNotNullParameter(aFh1sSDK, "");
            Map<String, Object> map = aFh1sSDK.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(map, "");
            return new AFa1jSDK(map, null, 2, 0 == true ? 1 : 0);
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AFa1jSDK(Map<String, Object> map, AFa1gSDK aFa1gSDK) {
        this.getMonetizationNetwork = map;
        this.AFAdRevenueData = aFa1gSDK;
    }

    public static final AFa1jSDK getRevenue(AFh1sSDK aFh1sSDK) {
        return AFa1ySDK.getMediationNetwork(aFh1sSDK);
    }

    public final boolean getCurrencyIso4217Code(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.getMonetizationNetwork.containsKey(str);
    }

    public final void getMediationNetwork(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getMonetizationNetwork.put(str, obj);
        AFa1gSDK aFa1gSDK = this.AFAdRevenueData;
        if (aFa1gSDK != null) {
            aFa1gSDK.getMonetizationNetwork(this.getMonetizationNetwork);
        }
    }

    public static final AFa1jSDK getMediationNetwork(AFa1gSDK aFa1gSDK) {
        return AFa1ySDK.getCurrencyIso4217Code(aFa1gSDK);
    }

    public /* synthetic */ AFa1jSDK(Map map, AFa1gSDK aFa1gSDK, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i2 & 2) != 0 ? null : aFa1gSDK);
    }

    public /* synthetic */ AFa1jSDK(Map map, AFa1gSDK aFa1gSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFa1gSDK);
    }
}
