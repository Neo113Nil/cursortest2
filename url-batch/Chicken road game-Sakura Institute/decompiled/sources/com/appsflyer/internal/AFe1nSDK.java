package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class AFe1nSDK {
    public boolean AFInAppEventParameterName;
    final String AFInAppEventType;
    public boolean AFKeystoreWrapper;
    private final boolean AFLogger;
    private boolean d;
    private final byte[] e;
    public int registerClient;
    private final boolean unregisterClient;
    final Map<String, String> valueOf;
    public final String values;

    public AFe1nSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z) {
        this(str, bArr, str2, map, z, (byte) 0);
    }

    private AFe1nSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z, byte b) {
        this.d = true;
        this.AFInAppEventParameterName = false;
        this.AFKeystoreWrapper = true;
        this.registerClient = -1;
        this.values = str;
        this.e = bArr;
        this.AFInAppEventType = str2;
        this.valueOf = map;
        this.AFLogger = z;
        this.unregisterClient = true;
    }

    public AFe1nSDK(String str, String str2) {
        this(str, null, str2, new HashMap(), false);
    }

    public final byte[] AFInAppEventParameterName() {
        return this.e;
    }

    public final boolean values() {
        return this.AFLogger;
    }

    public final boolean valueOf() {
        return this.d;
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFInAppEventParameterName;
    }

    public final boolean AFInAppEventType() {
        return this.unregisterClient;
    }

    public final boolean unregisterClient() {
        return this.AFKeystoreWrapper;
    }
}
