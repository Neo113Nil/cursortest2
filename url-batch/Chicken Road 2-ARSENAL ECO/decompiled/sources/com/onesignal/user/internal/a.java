package com.onesignal.user.internal;

/* loaded from: classes.dex */
public final class a {
    private final String appId;
    private final boolean failed;
    private final boolean forceCreateUser;

    public a(String str, boolean z5, boolean z6) {
        this.appId = str;
        this.forceCreateUser = z5;
        this.failed = z6;
    }

    public static /* synthetic */ a copy$default(a aVar, String str, boolean z5, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = aVar.appId;
        }
        if ((i7 & 2) != 0) {
            z5 = aVar.forceCreateUser;
        }
        if ((i7 & 4) != 0) {
            z6 = aVar.failed;
        }
        return aVar.copy(str, z5, z6);
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

    public final a copy(String str, boolean z5, boolean z6) {
        return new a(str, z5, z6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.i.a(this.appId, aVar.appId) && this.forceCreateUser == aVar.forceCreateUser && this.failed == aVar.failed;
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
