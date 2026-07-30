package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class AFa1qSDK {
    public final Map<String, Object> AFInAppEventParameterName;
    public AppsFlyerRequestListener AFInAppEventType;
    Map<String, Object> AFKeystoreWrapper;
    String AFLogger;
    private final boolean AFVersionDeclaration;
    String afDebugLog;
    public int afErrorLog;
    private byte[] afErrorLogForExcManagerOnly;
    public String afInfoLog;
    String afRDLog;
    public String valueOf;
    String values;

    public abstract AFd1vSDK AFInAppEventParameterName();

    public boolean afDebugLog() {
        return true;
    }

    public boolean afErrorLog() {
        return true;
    }

    public boolean afInfoLog() {
        return true;
    }

    public boolean afRDLog() {
        return false;
    }

    public AFa1qSDK() {
        this(null, null, null);
    }

    public AFa1qSDK(String str, String str2, Boolean bool) {
        this.AFInAppEventParameterName = new HashMap();
        this.afDebugLog = str;
        this.afInfoLog = str2;
        this.AFVersionDeclaration = bool != null ? bool.booleanValue() : true;
    }

    public AFa1qSDK valueOf(String str) {
        this.afInfoLog = str;
        return this;
    }

    public final boolean values() {
        return this.afDebugLog == null && this.valueOf == null;
    }

    public final AFa1qSDK AFInAppEventType(Map<String, ?> map) {
        synchronized (map) {
            this.AFInAppEventParameterName.putAll(map);
        }
        return this;
    }

    public final AFa1qSDK AFInAppEventParameterName(String str, Object obj) {
        synchronized (this.AFInAppEventParameterName) {
            this.AFInAppEventParameterName.put(str, obj);
        }
        return this;
    }

    public final Map<String, Object> AFInAppEventType() {
        return this.AFInAppEventParameterName;
    }

    public final AFa1qSDK valueOf(int i) {
        this.afErrorLog = i;
        synchronized (this.AFInAppEventParameterName) {
            if (this.AFInAppEventParameterName.containsKey("counter")) {
                this.AFInAppEventParameterName.put("counter", Integer.toString(i));
            }
            if (this.AFInAppEventParameterName.containsKey("launch_counter")) {
                this.AFInAppEventParameterName.put("launch_counter", Integer.toString(i));
            }
        }
        return this;
    }

    public final AFa1qSDK valueOf(byte[] bArr) {
        this.afErrorLogForExcManagerOnly = bArr;
        return this;
    }

    public final byte[] valueOf() {
        return this.afErrorLogForExcManagerOnly;
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFVersionDeclaration;
    }

    protected static String AFKeystoreWrapper(String str) {
        String AFKeystoreWrapper = AFa1dSDK.valueOf().AFInAppEventParameterName().AFInAppEventParameterName().AFKeystoreWrapper();
        return AFKeystoreWrapper != null ? Uri.parse(str).buildUpon().appendQueryParameter(AppsFlyerProperties.CHANNEL, AFKeystoreWrapper).build().toString() : str;
    }

    public static boolean AFInAppEventParameterName(double d) {
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
