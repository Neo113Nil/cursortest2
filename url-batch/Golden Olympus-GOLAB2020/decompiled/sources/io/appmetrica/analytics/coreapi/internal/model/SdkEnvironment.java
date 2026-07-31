package io.appmetrica.analytics.coreapi.internal.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class SdkEnvironment {

    /* renamed from: a, reason: collision with root package name */
    private final AppVersionInfo f36963a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36964b;

    /* renamed from: c, reason: collision with root package name */
    private final ScreenInfo f36965c;

    /* renamed from: d, reason: collision with root package name */
    private final SdkInfo f36966d;

    /* renamed from: e, reason: collision with root package name */
    private final String f36967e;

    /* renamed from: f, reason: collision with root package name */
    private final List f36968f;

    public SdkEnvironment(@NotNull AppVersionInfo appVersionInfo, @NotNull String str, @NotNull ScreenInfo screenInfo, @NotNull SdkInfo sdkInfo, @NotNull String str2, @NotNull List<String> list) {
        this.f36963a = appVersionInfo;
        this.f36964b = str;
        this.f36965c = screenInfo;
        this.f36966d = sdkInfo;
        this.f36967e = str2;
        this.f36968f = list;
    }

    public static /* synthetic */ SdkEnvironment copy$default(SdkEnvironment sdkEnvironment, AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            appVersionInfo = sdkEnvironment.f36963a;
        }
        if ((i4 & 2) != 0) {
            str = sdkEnvironment.f36964b;
        }
        if ((i4 & 4) != 0) {
            screenInfo = sdkEnvironment.f36965c;
        }
        if ((i4 & 8) != 0) {
            sdkInfo = sdkEnvironment.f36966d;
        }
        if ((i4 & 16) != 0) {
            str2 = sdkEnvironment.f36967e;
        }
        if ((i4 & 32) != 0) {
            list = sdkEnvironment.f36968f;
        }
        String str3 = str2;
        List list2 = list;
        return sdkEnvironment.copy(appVersionInfo, str, screenInfo, sdkInfo, str3, list2);
    }

    @NotNull
    public final AppVersionInfo component1() {
        return this.f36963a;
    }

    @NotNull
    public final String component2() {
        return this.f36964b;
    }

    @NotNull
    public final ScreenInfo component3() {
        return this.f36965c;
    }

    @NotNull
    public final SdkInfo component4() {
        return this.f36966d;
    }

    @NotNull
    public final String component5() {
        return this.f36967e;
    }

    @NotNull
    public final List<String> component6() {
        return this.f36968f;
    }

    @NotNull
    public final SdkEnvironment copy(@NotNull AppVersionInfo appVersionInfo, @NotNull String str, @NotNull ScreenInfo screenInfo, @NotNull SdkInfo sdkInfo, @NotNull String str2, @NotNull List<String> list) {
        return new SdkEnvironment(appVersionInfo, str, screenInfo, sdkInfo, str2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkEnvironment)) {
            return false;
        }
        SdkEnvironment sdkEnvironment = (SdkEnvironment) obj;
        return Intrinsics.areEqual(this.f36963a, sdkEnvironment.f36963a) && Intrinsics.areEqual(this.f36964b, sdkEnvironment.f36964b) && Intrinsics.areEqual(this.f36965c, sdkEnvironment.f36965c) && Intrinsics.areEqual(this.f36966d, sdkEnvironment.f36966d) && Intrinsics.areEqual(this.f36967e, sdkEnvironment.f36967e) && Intrinsics.areEqual(this.f36968f, sdkEnvironment.f36968f);
    }

    @NotNull
    public final String getAppFramework() {
        return this.f36964b;
    }

    @NotNull
    public final AppVersionInfo getAppVersionInfo() {
        return this.f36963a;
    }

    @NotNull
    public final String getDeviceType() {
        return this.f36967e;
    }

    @NotNull
    public final List<String> getLocales() {
        return this.f36968f;
    }

    @NotNull
    public final ScreenInfo getScreenInfo() {
        return this.f36965c;
    }

    @NotNull
    public final SdkInfo getSdkInfo() {
        return this.f36966d;
    }

    public int hashCode() {
        return this.f36968f.hashCode() + ((this.f36967e.hashCode() + ((this.f36966d.hashCode() + ((this.f36965c.hashCode() + ((this.f36964b.hashCode() + (this.f36963a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "SdkEnvironment(appVersionInfo=" + this.f36963a + ", appFramework=" + this.f36964b + ", screenInfo=" + this.f36965c + ", sdkInfo=" + this.f36966d + ", deviceType=" + this.f36967e + ", locales=" + this.f36968f + ')';
    }
}
