package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFd1rSDK {
    public static boolean getRevenue(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int AFAdRevenueData = AFj1aSDK.AFAdRevenueData(str);
        int AFAdRevenueData2 = AFj1aSDK.AFAdRevenueData(str2);
        Pair<Integer, Integer> mediationNetwork = AFd1pSDK.getMediationNetwork(str2);
        Pair<Integer, Integer> currencyIso4217Code = AFd1pSDK.getCurrencyIso4217Code(str2);
        return (AFAdRevenueData2 == -1 || mediationNetwork != null) ? currencyIso4217Code != null ? ((Number) currencyIso4217Code.f6112d).intValue() <= AFAdRevenueData && AFAdRevenueData <= ((Number) currencyIso4217Code.f6113e).intValue() : mediationNetwork != null && ((Number) mediationNetwork.f6112d).intValue() <= AFAdRevenueData && AFAdRevenueData <= ((Number) mediationNetwork.f6113e).intValue() : AFAdRevenueData2 == AFAdRevenueData;
    }
}
