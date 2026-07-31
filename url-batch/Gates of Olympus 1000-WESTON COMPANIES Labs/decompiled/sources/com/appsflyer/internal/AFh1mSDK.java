package com.appsflyer.internal;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class AFh1mSDK {
    public Map<String, Object> AFAdRevenueData;
    public String areAllFieldsValid;
    public String component1;
    public String component2;
    public String component3;
    public int component4;
    public String copydefault;
    public AppsFlyerRequestListener getCurrencyIso4217Code;
    public final Map<String, String> getMediationNetwork;
    public String getMonetizationNetwork;
    public Map<String, Object> getRevenue;
    private byte[] hashCode;
    private final boolean toString;

    public abstract AFe1pSDK AFAdRevenueData();

    public boolean areAllFieldsValid() {
        return false;
    }

    public boolean component1() {
        return true;
    }

    public boolean component4() {
        return true;
    }

    public boolean getMediationNetwork() {
        return true;
    }

    public AFh1mSDK() {
        this(null, null, null);
    }

    public AFh1mSDK(String str, String str2, Boolean bool) {
        this.AFAdRevenueData = new HashMap();
        this.getMediationNetwork = new HashMap();
        this.areAllFieldsValid = str;
        this.component2 = str2;
        this.toString = bool != null ? bool.booleanValue() : true;
    }

    public final boolean getRevenue() {
        return this.areAllFieldsValid == null && this.component3 == null;
    }

    public final AFh1mSDK AFAdRevenueData(Map<String, ?> map) {
        synchronized (map) {
            this.AFAdRevenueData.putAll(map);
        }
        return this;
    }

    public final AFh1mSDK getMonetizationNetwork(String str, Object obj) {
        synchronized (this.AFAdRevenueData) {
            this.AFAdRevenueData.put(str, obj);
        }
        return this;
    }

    public final AFh1mSDK AFAdRevenueData(int i) {
        this.component4 = i;
        synchronized (this.AFAdRevenueData) {
            if (this.AFAdRevenueData.containsKey("counter")) {
                this.AFAdRevenueData.put("counter", Integer.toString(i));
            }
            if (this.AFAdRevenueData.containsKey("launch_counter")) {
                this.AFAdRevenueData.put("launch_counter", Integer.toString(i));
            }
        }
        return this;
    }

    public final AFh1mSDK getMediationNetwork(byte[] bArr) {
        this.hashCode = bArr;
        return this;
    }

    public final byte[] getMonetizationNetwork() {
        return this.hashCode;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.toString;
    }

    public static boolean getRevenue(double d) {
        if (d < 0.0d || d >= 1.0d) {
            return false;
        }
        if (d == 0.0d) {
            return true;
        }
        int i = (int) (1.0d / d);
        if (i + 1 > 0) {
            return ((int) ((Math.random() * ((double) i)) + 1.0d)) != i;
        }
        throw new IllegalArgumentException("Unsupported max value");
    }
}
