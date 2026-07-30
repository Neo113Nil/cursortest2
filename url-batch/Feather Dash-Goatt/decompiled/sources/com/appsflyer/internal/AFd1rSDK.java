package com.appsflyer.internal;

import kotlin.Pair;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFd1rSDK {
    public static boolean getRevenue(String str, String str2) {
        str.getClass();
        str2.getClass();
        int AFAdRevenueData = AFj1aSDK.AFAdRevenueData(str);
        int AFAdRevenueData2 = AFj1aSDK.AFAdRevenueData(str2);
        Pair<Integer, Integer> mediationNetwork = AFd1pSDK.getMediationNetwork(str2);
        Pair<Integer, Integer> currencyIso4217Code = AFd1pSDK.getCurrencyIso4217Code(str2);
        return (AFAdRevenueData2 == -1 || mediationNetwork != null) ? currencyIso4217Code != null ? ((Number) currencyIso4217Code.d).intValue() <= AFAdRevenueData && AFAdRevenueData <= ((Number) currencyIso4217Code.e).intValue() : mediationNetwork != null && ((Number) mediationNetwork.d).intValue() <= AFAdRevenueData && AFAdRevenueData <= ((Number) mediationNetwork.e).intValue() : AFAdRevenueData2 == AFAdRevenueData;
    }
}
