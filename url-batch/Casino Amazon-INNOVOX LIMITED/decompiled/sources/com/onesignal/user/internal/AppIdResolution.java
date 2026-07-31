package com.onesignal.user.internal;

import com.onesignal.core.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppIdResolution.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/onesignal/user/internal/AppIdResolution;", "", "appId", "", "forceCreateUser", "", "failed", "(Ljava/lang/String;ZZ)V", "getAppId", "()Ljava/lang/String;", "getFailed", "()Z", "getForceCreateUser", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AppIdResolution {
    private final String appId;
    private final boolean failed;
    private final boolean forceCreateUser;

    public static /* synthetic */ AppIdResolution copy$default(AppIdResolution appIdResolution, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appIdResolution.appId;
        }
        if ((i & 2) != 0) {
            z = appIdResolution.forceCreateUser;
        }
        if ((i & 4) != 0) {
            z2 = appIdResolution.failed;
        }
        return appIdResolution.copy(str, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getForceCreateUser() {
        return this.forceCreateUser;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getFailed() {
        return this.failed;
    }

    public final AppIdResolution copy(String appId, boolean forceCreateUser, boolean failed) {
        return new AppIdResolution(appId, forceCreateUser, failed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppIdResolution)) {
            return false;
        }
        AppIdResolution appIdResolution = (AppIdResolution) other;
        return Intrinsics.areEqual(this.appId, appIdResolution.appId) && this.forceCreateUser == appIdResolution.forceCreateUser && this.failed == appIdResolution.failed;
    }

    public int hashCode() {
        String str = this.appId;
        return ((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.forceCreateUser)) * 31) + Boolean.hashCode(this.failed);
    }

    public String toString() {
        return "AppIdResolution(appId=" + this.appId + ", forceCreateUser=" + this.forceCreateUser + ", failed=" + this.failed + ')';
    }

    public AppIdResolution(String str, boolean z, boolean z2) {
        this.appId = str;
        this.forceCreateUser = z;
        this.failed = z2;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final boolean getForceCreateUser() {
        return this.forceCreateUser;
    }

    public final boolean getFailed() {
        return this.failed;
    }
}
