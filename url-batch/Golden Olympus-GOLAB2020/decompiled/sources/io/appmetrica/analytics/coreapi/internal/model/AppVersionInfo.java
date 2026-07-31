package io.appmetrica.analytics.coreapi.internal.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class AppVersionInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f36957a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36958b;

    public AppVersionInfo(@NotNull String str, @NotNull String str2) {
        this.f36957a = str;
        this.f36958b = str2;
    }

    public static /* synthetic */ AppVersionInfo copy$default(AppVersionInfo appVersionInfo, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = appVersionInfo.f36957a;
        }
        if ((i4 & 2) != 0) {
            str2 = appVersionInfo.f36958b;
        }
        return appVersionInfo.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.f36957a;
    }

    @NotNull
    public final String component2() {
        return this.f36958b;
    }

    @NotNull
    public final AppVersionInfo copy(@NotNull String str, @NotNull String str2) {
        return new AppVersionInfo(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppVersionInfo)) {
            return false;
        }
        AppVersionInfo appVersionInfo = (AppVersionInfo) obj;
        return Intrinsics.areEqual(this.f36957a, appVersionInfo.f36957a) && Intrinsics.areEqual(this.f36958b, appVersionInfo.f36958b);
    }

    @NotNull
    public final String getAppBuildNumber() {
        return this.f36958b;
    }

    @NotNull
    public final String getAppVersionName() {
        return this.f36957a;
    }

    public int hashCode() {
        return this.f36958b.hashCode() + (this.f36957a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AppVersionInfo(appVersionName=" + this.f36957a + ", appBuildNumber=" + this.f36958b + ')';
    }
}
