package com.appsflyer.internal;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class AFe1cSDK extends AFe1fSDK {
    public AFe1cSDK(String str, Boolean bool) {
        super(str, null, Boolean.FALSE, null, bool);
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean afDebugLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean afErrorLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean afInfoLog() {
        return false;
    }

    public AFe1cSDK() {
        this(null, null);
    }
}
