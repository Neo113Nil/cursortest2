package com.appsflyer.internal;

/* loaded from: classes.dex */
public abstract class AFe1cSDK extends AFe1fSDK {
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

    AFe1cSDK() {
        this(null, null);
    }

    AFe1cSDK(String str, Boolean bool) {
        super(str, null, Boolean.FALSE, null, bool);
    }
}
