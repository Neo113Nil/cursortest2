package com.appsflyer.internal;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
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
    private final boolean hashCode;
    private byte[] toString;

    public AFh1mSDK(String str, String str2, Boolean bool) {
        this.AFAdRevenueData = new HashMap();
        this.getMediationNetwork = new HashMap();
        this.areAllFieldsValid = str;
        this.component2 = str2;
        this.hashCode = bool != null ? bool.booleanValue() : true;
    }

    public static boolean getRevenue(double d10) {
        if (d10 < 0.0d || d10 >= 1.0d) {
            return false;
        }
        if (d10 == 0.0d) {
            return true;
        }
        int i3 = (int) (1.0d / d10);
        if (i3 + 1 > 0) {
            return ((int) ((Math.random() * ((double) i3)) + 1.0d)) != i3;
        }
        a1.e("Unsupported max value");
        return false;
    }

    public abstract AFe1pSDK AFAdRevenueData();

    public final AFh1mSDK AFAdRevenueData(int i3) {
        this.component4 = i3;
        synchronized (this.AFAdRevenueData) {
            try {
                if (this.AFAdRevenueData.containsKey("counter")) {
                    this.AFAdRevenueData.put("counter", Integer.toString(i3));
                }
                if (this.AFAdRevenueData.containsKey("launch_counter")) {
                    this.AFAdRevenueData.put("launch_counter", Integer.toString(i3));
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

    public boolean component1() {
        return true;
    }

    public boolean component4() {
        return true;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.hashCode;
    }

    public final AFh1mSDK getMediationNetwork(byte[] bArr) {
        this.toString = bArr;
        return this;
    }

    public final AFh1mSDK getMonetizationNetwork(String str, Object obj) {
        synchronized (this.AFAdRevenueData) {
            this.AFAdRevenueData.put(str, obj);
        }
        return this;
    }

    public boolean getMediationNetwork() {
        return true;
    }

    public final byte[] getMonetizationNetwork() {
        return this.toString;
    }

    public AFh1mSDK() {
        this(null, null, null);
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
}
