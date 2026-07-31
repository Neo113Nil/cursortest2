package com.appsflyer.internal;

/* loaded from: classes3.dex */
public abstract class AFh1zSDK extends AFa1rSDK {
    private boolean force;
    private final boolean i;
    private final boolean w;

    AFh1zSDK() {
        this(null, null, null, null, null);
    }

    public AFh1zSDK(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3) {
        super(str, str2, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false));
        this.w = bool != null ? bool.booleanValue() : true;
        this.i = bool2 != null ? bool2.booleanValue() : true;
    }

    public final boolean v() {
        return this.force;
    }

    public final boolean afInfoLog() {
        return this.w;
    }

    public final boolean i() {
        return this.i;
    }
}
