package com.appsflyer.internal;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class AFe1fSDK extends AFa1qSDK {
    private final boolean AFLogger$LogLevel;
    public boolean afWarnLog;
    private final boolean getLevel;

    public AFe1fSDK(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3) {
        super(str, str2, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false));
        this.getLevel = bool != null ? bool.booleanValue() : true;
        this.AFLogger$LogLevel = bool2 != null ? bool2.booleanValue() : true;
    }

    public final boolean AFVersionDeclaration() {
        return this.getLevel;
    }

    public final boolean afWarnLog() {
        return this.afWarnLog;
    }

    public final boolean getLevel() {
        return this.AFLogger$LogLevel;
    }

    public AFe1fSDK() {
        this(null, null, null, null, null);
    }
}
