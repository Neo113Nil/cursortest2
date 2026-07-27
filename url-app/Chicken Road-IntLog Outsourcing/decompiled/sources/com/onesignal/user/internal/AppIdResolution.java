package com.onesignal.user.internal;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class AppIdResolution {
    private final String appId;
    private final boolean failed;
    private final boolean forceCreateUser;

    public AppIdResolution(String str, boolean z, boolean z5) {
        this.appId = str;
        this.forceCreateUser = z;
        this.failed = z5;
    }

    public static /* synthetic */ AppIdResolution copy$default(AppIdResolution appIdResolution, String str, boolean z, boolean z5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = appIdResolution.appId;
        }
        if ((i2 & 2) != 0) {
            z = appIdResolution.forceCreateUser;
        }
        if ((i2 & 4) != 0) {
            z5 = appIdResolution.failed;
        }
        return appIdResolution.copy(str, z, z5);
    }

    public final String component1() {
        return this.appId;
    }

    public final boolean component2() {
        return this.forceCreateUser;
    }

    public final boolean component3() {
        return this.failed;
    }

    public final AppIdResolution copy(String str, boolean z, boolean z5) {
        return new AppIdResolution(str, z, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppIdResolution)) {
            return false;
        }
        AppIdResolution appIdResolution = (AppIdResolution) obj;
        return i.a(this.appId, appIdResolution.appId) && this.forceCreateUser == appIdResolution.forceCreateUser && this.failed == appIdResolution.failed;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final boolean getFailed() {
        return this.failed;
    }

    public final boolean getForceCreateUser() {
        return this.forceCreateUser;
    }

    public int hashCode() {
        String str = this.appId;
        return Boolean.hashCode(this.failed) + ((Boolean.hashCode(this.forceCreateUser) + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    public String toString() {
        return "AppIdResolution(appId=" + this.appId + ", forceCreateUser=" + this.forceCreateUser + ", failed=" + this.failed + ')';
    }
}
