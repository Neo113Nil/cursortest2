package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AFd1cSDK {
    final Map<String, String> AFAdRevenueData;
    private final byte[] areAllFieldsValid;
    private boolean component1;
    private final boolean component2;
    private final boolean component3;
    public int component4;
    public boolean getCurrencyIso4217Code;
    public boolean getMediationNetwork;
    public final String getMonetizationNetwork;
    final String getRevenue;

    public AFd1cSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z4) {
        this(str, bArr, str2, map, z4, (byte) 0);
    }

    public final boolean AFAdRevenueData() {
        return this.component2;
    }

    public final boolean component3() {
        return this.getCurrencyIso4217Code;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.component3;
    }

    public final boolean getMediationNetwork() {
        return this.component1;
    }

    public final boolean getMonetizationNetwork() {
        return this.getMediationNetwork;
    }

    public final byte[] getRevenue() {
        return this.areAllFieldsValid;
    }

    private AFd1cSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z4, byte b4) {
        this.component1 = true;
        this.getMediationNetwork = false;
        this.getCurrencyIso4217Code = true;
        this.component4 = -1;
        this.getMonetizationNetwork = str;
        this.areAllFieldsValid = bArr;
        this.getRevenue = str2;
        this.AFAdRevenueData = map;
        this.component2 = z4;
        this.component3 = true;
    }

    public AFd1cSDK(String str, String str2) {
        this(str, null, str2, new HashMap(), false);
    }
}
