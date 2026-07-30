package com.appsflyer.internal;

/* loaded from: classes.dex */
public abstract class AFe1fSDK extends AFa1qSDK {
    private final boolean AFLogger$LogLevel;
    public boolean afWarnLog;
    private final boolean getLevel;

    AFe1fSDK() {
        this(null, null, null, null, null);
    }

    public AFe1fSDK(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3) {
        super(str, str2, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false));
        this.getLevel = bool != null ? bool.booleanValue() : true;
        this.AFLogger$LogLevel = bool2 != null ? bool2.booleanValue() : true;
    }

    public final boolean afWarnLog() {
        return this.afWarnLog;
    }

    public final boolean AFVersionDeclaration() {
        return this.getLevel;
    }

    public final boolean getLevel() {
        return this.AFLogger$LogLevel;
    }
}
