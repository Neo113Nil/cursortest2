package com.appsflyer.internal;

/* loaded from: classes3.dex */
public final class AFh1jSDK {
    public final long AFInAppEventParameterName;
    public final String AFInAppEventType;
    public final String AFKeystoreWrapper;
    public final String AFLogger;
    public final AFh1kSDK e;
    public final Throwable registerClient;
    public final long valueOf;
    public final int values;

    public AFh1jSDK(String str, String str2, long j, long j2, int i, AFh1kSDK aFh1kSDK, String str3, Throwable th) {
        this.AFInAppEventType = str;
        this.AFKeystoreWrapper = str2;
        this.AFInAppEventParameterName = j;
        this.valueOf = j2;
        this.values = i;
        this.e = aFh1kSDK;
        this.AFLogger = str3;
        this.registerClient = th;
    }
}
