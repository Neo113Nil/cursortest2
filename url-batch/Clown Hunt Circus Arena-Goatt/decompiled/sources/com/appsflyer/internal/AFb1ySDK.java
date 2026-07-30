package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AFb1ySDK {
    public final String AFInAppEventParameterName;
    public final Map<String, String> AFInAppEventType;
    public boolean AFKeystoreWrapper;
    private final boolean AFLogger;
    public int afDebugLog;
    private boolean afErrorLog;
    private final byte[] afInfoLog;
    private final boolean afRDLog;
    public boolean valueOf;
    public final String values;

    public AFb1ySDK() {
    }

    public static Map<String, String> valueOf(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                hashMap.put(URLEncoder.encode(entry.getKey(), "utf-8"), URLEncoder.encode(entry.getValue(), "utf-8"));
            } catch (UnsupportedEncodingException e) {
                AFLogger.afErrorLogForExcManagerOnly("failed to encode map", e);
            }
        }
        return hashMap;
    }

    public AFb1ySDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z) {
        this(str, bArr, str2, map, z, true);
    }

    public AFb1ySDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z, boolean z2) {
        this.afErrorLog = true;
        this.valueOf = false;
        this.AFKeystoreWrapper = true;
        this.afDebugLog = -1;
        this.AFInAppEventParameterName = str;
        this.afInfoLog = bArr;
        this.values = str2;
        this.AFInAppEventType = map;
        this.AFLogger = z;
        this.afRDLog = z2;
    }

    public AFb1ySDK(String str, String str2) {
        this(str, null, str2, new HashMap(), false);
    }

    public final byte[] values() {
        return this.afInfoLog;
    }

    public final boolean AFInAppEventType() {
        return this.AFLogger;
    }

    public final AFb1ySDK AFKeystoreWrapper(int i) {
        this.afDebugLog = i;
        return this;
    }

    public final boolean AFKeystoreWrapper() {
        return this.afErrorLog;
    }

    public final boolean AFInAppEventParameterName() {
        return this.valueOf;
    }

    public final boolean valueOf() {
        return this.afRDLog;
    }

    public final boolean afDebugLog() {
        return this.AFKeystoreWrapper;
    }
}
