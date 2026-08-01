package com.appsflyer.internal;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class AFh1jSDK extends AFh1mSDK {
    private final boolean copy;
    private final boolean equals;

    public AFh1jSDK(String str, Boolean bool, Boolean bool2) {
        super(str, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
        this.copy = bool != null ? bool.booleanValue() : true;
        this.equals = true;
    }

    public AFh1jSDK() {
        this(null, null, null);
    }
}
