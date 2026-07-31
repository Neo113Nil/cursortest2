package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class AFa1rSDK {
    public String AFInAppEventParameterName;
    public Map<String, Object> AFInAppEventType;
    public final Map<String, Object> AFKeystoreWrapper;
    public int AFLogger;
    public String d;
    public String e;
    private final boolean i;
    public String registerClient;
    public String unregisterClient;
    private byte[] v;
    public AppsFlyerRequestListener valueOf;
    public String values;

    public boolean AFLogger() {
        return true;
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return true;
    }

    public boolean unregisterClient() {
        return false;
    }

    public abstract AFe1eSDK valueOf();

    public AFa1rSDK() {
        this(null, null, null);
    }

    public AFa1rSDK(String str, String str2, Boolean bool) {
        this.AFKeystoreWrapper = new HashMap();
        this.e = str;
        this.registerClient = str2;
        this.i = bool != null ? bool.booleanValue() : true;
    }

    public AFa1rSDK values(String str) {
        this.registerClient = str;
        return this;
    }

    public final boolean AFInAppEventParameterName() {
        return this.e == null && this.AFInAppEventParameterName == null;
    }

    public final AFa1rSDK values(Map<String, ?> map) {
        synchronized (map) {
            this.AFKeystoreWrapper.putAll(map);
        }
        return this;
    }

    public final AFa1rSDK valueOf(String str, Object obj) {
        synchronized (this.AFKeystoreWrapper) {
            this.AFKeystoreWrapper.put(str, obj);
        }
        return this;
    }

    public final Map<String, Object> AFKeystoreWrapper() {
        return this.AFKeystoreWrapper;
    }

    public final AFa1rSDK AFInAppEventParameterName(int i) {
        this.AFLogger = i;
        synchronized (this.AFKeystoreWrapper) {
            if (this.AFKeystoreWrapper.containsKey("counter")) {
                this.AFKeystoreWrapper.put("counter", Integer.toString(i));
            }
            if (this.AFKeystoreWrapper.containsKey("launch_counter")) {
                this.AFKeystoreWrapper.put("launch_counter", Integer.toString(i));
            }
        }
        return this;
    }

    public final AFa1rSDK AFInAppEventType(byte[] bArr) {
        this.v = bArr;
        return this;
    }

    public final byte[] values() {
        return this.v;
    }

    public final boolean AFInAppEventType() {
        return this.i;
    }

    protected static String AFInAppEventType(String str) {
        String AFInAppEventParameterName = AFb1tSDK.AFInAppEventType().values().values().AFInAppEventParameterName();
        return AFInAppEventParameterName != null ? Uri.parse(str).buildUpon().appendQueryParameter(AppsFlyerProperties.CHANNEL, AFInAppEventParameterName).build().toString() : str;
    }

    public static boolean AFInAppEventType(double d) {
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
