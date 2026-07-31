package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class AFe1nSDK {
    final String AFInAppEventParameterName;
    public boolean AFInAppEventType;
    public boolean AFKeystoreWrapper;
    private final byte[] AFLogger;
    public int d;
    private final boolean e;
    private final boolean registerClient;
    private boolean unregisterClient;
    public final String valueOf;
    final Map<String, String> values;

    public AFe1nSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z) {
        this(str, bArr, str2, map, z, (byte) 0);
    }

    private AFe1nSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z, byte b) {
        this.unregisterClient = true;
        this.AFKeystoreWrapper = false;
        this.AFInAppEventType = true;
        this.d = -1;
        this.valueOf = str;
        this.AFLogger = bArr;
        this.AFInAppEventParameterName = str2;
        this.values = map;
        this.e = z;
        this.registerClient = true;
    }

    public AFe1nSDK(String str, String str2) {
        this(str, null, str2, new HashMap(), false);
    }

    public final byte[] AFInAppEventType() {
        return this.AFLogger;
    }

    public final boolean valueOf() {
        return this.e;
    }

    public final boolean values() {
        return this.unregisterClient;
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFKeystoreWrapper;
    }

    public final boolean AFInAppEventParameterName() {
        return this.registerClient;
    }

    public final boolean d() {
        return this.AFInAppEventType;
    }
}
