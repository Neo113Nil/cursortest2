package com.onesignal.debug.internal.logging.otel.android;

import C4.p;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {
    private final String appPackageId;
    private final String appVersion;
    private final Context context;
    private final String crashStoragePath;
    private final Function0<Boolean> getIsInForeground;

    public d(String crashStoragePath, String appPackageId, String appVersion, Context context, Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(crashStoragePath, "crashStoragePath");
        Intrinsics.checkNotNullParameter(appPackageId, "appPackageId");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        this.crashStoragePath = crashStoragePath;
        this.appPackageId = appPackageId;
        this.appVersion = appVersion;
        this.context = context;
        this.getIsInForeground = function0;
    }

    public static /* synthetic */ d copy$default(d dVar, String str, String str2, String str3, Context context, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dVar.crashStoragePath;
        }
        if ((i2 & 2) != 0) {
            str2 = dVar.appPackageId;
        }
        if ((i2 & 4) != 0) {
            str3 = dVar.appVersion;
        }
        if ((i2 & 8) != 0) {
            context = dVar.context;
        }
        if ((i2 & 16) != 0) {
            function0 = dVar.getIsInForeground;
        }
        Function0 function02 = function0;
        String str4 = str3;
        return dVar.copy(str, str2, str4, context, function02);
    }

    public final String component1() {
        return this.crashStoragePath;
    }

    public final String component2() {
        return this.appPackageId;
    }

    public final String component3() {
        return this.appVersion;
    }

    public final Context component4() {
        return this.context;
    }

    public final Function0<Boolean> component5() {
        return this.getIsInForeground;
    }

    public final d copy(String crashStoragePath, String appPackageId, String appVersion, Context context, Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(crashStoragePath, "crashStoragePath");
        Intrinsics.checkNotNullParameter(appPackageId, "appPackageId");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        return new d(crashStoragePath, appPackageId, appVersion, context, function0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.a(this.crashStoragePath, dVar.crashStoragePath) && Intrinsics.a(this.appPackageId, dVar.appPackageId) && Intrinsics.a(this.appVersion, dVar.appVersion) && Intrinsics.a(this.context, dVar.context) && Intrinsics.a(this.getIsInForeground, dVar.getIsInForeground);
    }

    public final String getAppPackageId() {
        return this.appPackageId;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getCrashStoragePath() {
        return this.crashStoragePath;
    }

    public final Function0<Boolean> getGetIsInForeground() {
        return this.getIsInForeground;
    }

    public int hashCode() {
        int e7 = p.e(this.appVersion, p.e(this.appPackageId, this.crashStoragePath.hashCode() * 31, 31), 31);
        Context context = this.context;
        int hashCode = (e7 + (context == null ? 0 : context.hashCode())) * 31;
        Function0<Boolean> function0 = this.getIsInForeground;
        return hashCode + (function0 != null ? function0.hashCode() : 0);
    }

    public String toString() {
        return "OtelPlatformProviderConfig(crashStoragePath=" + this.crashStoragePath + ", appPackageId=" + this.appPackageId + ", appVersion=" + this.appVersion + ", context=" + this.context + ", getIsInForeground=" + this.getIsInForeground + ')';
    }

    public /* synthetic */ d(String str, String str2, String str3, Context context, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? null : context, (i2 & 16) != 0 ? null : function0);
    }
}
