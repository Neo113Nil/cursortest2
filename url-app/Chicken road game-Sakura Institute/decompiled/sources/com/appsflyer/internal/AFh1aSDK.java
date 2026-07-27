package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFh1aSDK {
    public final int AFInAppEventParameterName;
    public final String AFInAppEventType;
    public final long AFKeystoreWrapper;

    /* renamed from: e, reason: collision with root package name */
    public final AFh1bSDK f5949e;
    public final String registerClient;
    public final Throwable unregisterClient;
    public final String valueOf;
    public final long values;

    public AFh1aSDK(String str, String str2, long j4, long j5, int i2, AFh1bSDK aFh1bSDK, String str3, Throwable th) {
        this.AFInAppEventType = str;
        this.valueOf = str2;
        this.values = j4;
        this.AFKeystoreWrapper = j5;
        this.AFInAppEventParameterName = i2;
        this.f5949e = aFh1bSDK;
        this.registerClient = str3;
        this.unregisterClient = th;
    }
}
