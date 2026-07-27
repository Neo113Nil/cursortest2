package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AFe1nSDK {
    public boolean AFInAppEventParameterName;
    final String AFInAppEventType;
    public boolean AFKeystoreWrapper;
    private final boolean AFLogger;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5883d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f5884e;
    public int registerClient;
    private final boolean unregisterClient;
    final Map<String, String> valueOf;
    public final String values;

    public AFe1nSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z4) {
        this(str, bArr, str2, map, z4, (byte) 0);
    }

    public final byte[] AFInAppEventParameterName() {
        return this.f5884e;
    }

    public final boolean AFInAppEventType() {
        return this.unregisterClient;
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFInAppEventParameterName;
    }

    public final boolean unregisterClient() {
        return this.AFKeystoreWrapper;
    }

    public final boolean valueOf() {
        return this.f5883d;
    }

    public final boolean values() {
        return this.AFLogger;
    }

    private AFe1nSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z4, byte b4) {
        this.f5883d = true;
        this.AFInAppEventParameterName = false;
        this.AFKeystoreWrapper = true;
        this.registerClient = -1;
        this.values = str;
        this.f5884e = bArr;
        this.AFInAppEventType = str2;
        this.valueOf = map;
        this.AFLogger = z4;
        this.unregisterClient = true;
    }

    public AFe1nSDK(String str, String str2) {
        this(str, null, str2, new HashMap(), false);
    }
}
