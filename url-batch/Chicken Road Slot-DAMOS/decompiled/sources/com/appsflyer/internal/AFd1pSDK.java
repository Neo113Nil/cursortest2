package com.appsflyer.internal;

import kotlin.Pair;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFd1pSDK {
    public static boolean getCurrencyIso4217Code(String str, String str2) {
        str.getClass();
        str2.getClass();
        int mediationNetwork = AFk1xSDK.getMediationNetwork(str);
        int mediationNetwork2 = AFk1xSDK.getMediationNetwork(str2);
        Pair<Integer, Integer> monetizationNetwork = AFd1rSDK.getMonetizationNetwork(str2);
        Pair<Integer, Integer> AFAdRevenueData = AFd1rSDK.AFAdRevenueData(str2);
        return (mediationNetwork2 == -1 || monetizationNetwork != null) ? AFAdRevenueData != null ? ((Number) AFAdRevenueData.f5552d).intValue() <= mediationNetwork && mediationNetwork <= ((Number) AFAdRevenueData.f5553e).intValue() : monetizationNetwork != null && ((Number) monetizationNetwork.f5552d).intValue() <= mediationNetwork && mediationNetwork <= ((Number) monetizationNetwork.f5553e).intValue() : mediationNetwork2 == mediationNetwork;
    }
}
