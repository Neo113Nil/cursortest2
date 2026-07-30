package com.appsflyer.internal;

/* loaded from: classes3.dex */
public abstract class AFh1pSDK extends AFa1qSDK {
    private final boolean afInfoLog;
    private final boolean i;

    AFh1pSDK() {
        this(null, null, null);
    }

    protected AFh1pSDK(String str, Boolean bool, Boolean bool2) {
        super(str, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
        this.afInfoLog = bool != null ? bool.booleanValue() : true;
        this.i = true;
    }
}
