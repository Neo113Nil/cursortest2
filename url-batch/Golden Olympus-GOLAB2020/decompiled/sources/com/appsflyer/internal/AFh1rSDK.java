package com.appsflyer.internal;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class AFh1rSDK {
    public Map<String, Object> AFAdRevenueData;
    public String areAllFieldsValid;
    public String component1;
    public int component2;
    public String component3;
    public String component4;
    private byte[] copy;
    public AppsFlyerRequestListener getCurrencyIso4217Code;
    public String getMediationNetwork;
    public Map<String, Object> getMonetizationNetwork;
    public String getRevenue;
    private final boolean toString;

    public AFh1rSDK() {
        this(null, null, null);
    }

    public final AFh1rSDK AFAdRevenueData(int i4) {
        this.component2 = i4;
        synchronized (this.AFAdRevenueData) {
            try {
                if (this.AFAdRevenueData.containsKey("counter")) {
                    this.AFAdRevenueData.put("counter", Integer.toString(i4));
                }
                if (this.AFAdRevenueData.containsKey("launch_counter")) {
                    this.AFAdRevenueData.put("launch_counter", Integer.toString(i4));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public boolean areAllFieldsValid() {
        return false;
    }

    public boolean component2() {
        return true;
    }

    public boolean component4() {
        return true;
    }

    public abstract AFe1mSDK getCurrencyIso4217Code();

    public final AFh1rSDK getCurrencyIso4217Code(byte[] bArr) {
        this.copy = bArr;
        return this;
    }

    public final boolean getMediationNetwork() {
        return this.areAllFieldsValid == null && this.getRevenue == null;
    }

    public final boolean getMonetizationNetwork() {
        return this.toString;
    }

    public boolean getRevenue() {
        return true;
    }

    public AFh1rSDK(String str, String str2, Boolean bool) {
        this.AFAdRevenueData = new HashMap();
        this.areAllFieldsValid = str;
        this.component1 = str2;
        this.toString = bool != null ? bool.booleanValue() : true;
    }

    public static boolean getCurrencyIso4217Code(double d4) {
        if (d4 < 0.0d || d4 >= 1.0d) {
            return false;
        }
        if (d4 == 0.0d) {
            return true;
        }
        int i4 = (int) (1.0d / d4);
        if (i4 + 1 > 0) {
            return ((int) ((Math.random() * ((double) i4)) + 1.0d)) != i4;
        }
        throw new IllegalArgumentException("Unsupported max value");
    }

    public final AFh1rSDK getMediationNetwork(Map<String, ?> map) {
        synchronized (map) {
            this.AFAdRevenueData.putAll(map);
        }
        return this;
    }

    public final AFh1rSDK getMediationNetwork(String str, Object obj) {
        synchronized (this.AFAdRevenueData) {
            this.AFAdRevenueData.put(str, obj);
        }
        return this;
    }

    public final byte[] AFAdRevenueData() {
        return this.copy;
    }
}
