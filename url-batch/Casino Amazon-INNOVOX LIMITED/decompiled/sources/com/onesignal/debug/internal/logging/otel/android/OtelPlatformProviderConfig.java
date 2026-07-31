package com.onesignal.debug.internal.logging.otel.android;

import android.content.Context;
import com.onesignal.core.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OtelPlatformProvider.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0013\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tHÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001b\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/onesignal/debug/internal/logging/otel/android/OtelPlatformProviderConfig;", "", "crashStoragePath", "", "appPackageId", "appVersion", "context", "Landroid/content/Context;", "getIsInForeground", "Lkotlin/Function0;", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "getAppPackageId", "()Ljava/lang/String;", "getAppVersion", "getContext", "()Landroid/content/Context;", "getCrashStoragePath", "getGetIsInForeground", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OtelPlatformProviderConfig {
    private final String appPackageId;
    private final String appVersion;
    private final Context context;
    private final String crashStoragePath;
    private final Function0<Boolean> getIsInForeground;

    public static /* synthetic */ OtelPlatformProviderConfig copy$default(OtelPlatformProviderConfig otelPlatformProviderConfig, String str, String str2, String str3, Context context, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = otelPlatformProviderConfig.crashStoragePath;
        }
        if ((i & 2) != 0) {
            str2 = otelPlatformProviderConfig.appPackageId;
        }
        if ((i & 4) != 0) {
            str3 = otelPlatformProviderConfig.appVersion;
        }
        if ((i & 8) != 0) {
            context = otelPlatformProviderConfig.context;
        }
        if ((i & 16) != 0) {
            function0 = otelPlatformProviderConfig.getIsInForeground;
        }
        Function0 function02 = function0;
        String str4 = str3;
        return otelPlatformProviderConfig.copy(str, str2, str4, context, function02);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCrashStoragePath() {
        return this.crashStoragePath;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAppPackageId() {
        return this.appPackageId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: component4, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public final Function0<Boolean> component5() {
        return this.getIsInForeground;
    }

    public final OtelPlatformProviderConfig copy(String crashStoragePath, String appPackageId, String appVersion, Context context, Function0<Boolean> getIsInForeground) {
        Intrinsics.checkNotNullParameter(crashStoragePath, "crashStoragePath");
        Intrinsics.checkNotNullParameter(appPackageId, "appPackageId");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        return new OtelPlatformProviderConfig(crashStoragePath, appPackageId, appVersion, context, getIsInForeground);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtelPlatformProviderConfig)) {
            return false;
        }
        OtelPlatformProviderConfig otelPlatformProviderConfig = (OtelPlatformProviderConfig) other;
        return Intrinsics.areEqual(this.crashStoragePath, otelPlatformProviderConfig.crashStoragePath) && Intrinsics.areEqual(this.appPackageId, otelPlatformProviderConfig.appPackageId) && Intrinsics.areEqual(this.appVersion, otelPlatformProviderConfig.appVersion) && Intrinsics.areEqual(this.context, otelPlatformProviderConfig.context) && Intrinsics.areEqual(this.getIsInForeground, otelPlatformProviderConfig.getIsInForeground);
    }

    public int hashCode() {
        int hashCode = ((((this.crashStoragePath.hashCode() * 31) + this.appPackageId.hashCode()) * 31) + this.appVersion.hashCode()) * 31;
        Context context = this.context;
        int hashCode2 = (hashCode + (context == null ? 0 : context.hashCode())) * 31;
        Function0<Boolean> function0 = this.getIsInForeground;
        return hashCode2 + (function0 != null ? function0.hashCode() : 0);
    }

    public String toString() {
        return "OtelPlatformProviderConfig(crashStoragePath=" + this.crashStoragePath + ", appPackageId=" + this.appPackageId + ", appVersion=" + this.appVersion + ", context=" + this.context + ", getIsInForeground=" + this.getIsInForeground + ')';
    }

    public OtelPlatformProviderConfig(String crashStoragePath, String appPackageId, String appVersion, Context context, Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(crashStoragePath, "crashStoragePath");
        Intrinsics.checkNotNullParameter(appPackageId, "appPackageId");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        this.crashStoragePath = crashStoragePath;
        this.appPackageId = appPackageId;
        this.appVersion = appVersion;
        this.context = context;
        this.getIsInForeground = function0;
    }

    public /* synthetic */ OtelPlatformProviderConfig(String str, String str2, String str3, Context context, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : context, (i & 16) != 0 ? null : function0);
    }

    public final String getCrashStoragePath() {
        return this.crashStoragePath;
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

    public final Function0<Boolean> getGetIsInForeground() {
        return this.getIsInForeground;
    }
}
