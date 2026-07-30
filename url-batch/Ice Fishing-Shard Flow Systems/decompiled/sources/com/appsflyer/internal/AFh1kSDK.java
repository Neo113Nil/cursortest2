package com.appsflyer.internal;

/* loaded from: classes.dex */
public abstract class AFh1kSDK extends AFh1sSDK {
    private final boolean copy;
    private final boolean copydefault;

    public AFh1kSDK() {
        this(null, null, null);
    }

    public AFh1kSDK(String str, Boolean bool, Boolean bool2) {
        super(str, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
        this.copydefault = bool != null ? bool.booleanValue() : true;
        this.copy = true;
    }
}
