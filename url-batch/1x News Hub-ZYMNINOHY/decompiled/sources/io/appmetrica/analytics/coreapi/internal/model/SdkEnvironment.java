package io.appmetrica.analytics.coreapi.internal.model;

import java.util.List;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class SdkEnvironment {

    /* renamed from: a, reason: collision with root package name */
    private final AppVersionInfo f5416a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5417b;

    /* renamed from: c, reason: collision with root package name */
    private final ScreenInfo f5418c;

    /* renamed from: d, reason: collision with root package name */
    private final SdkInfo f5419d;

    /* renamed from: e, reason: collision with root package name */
    private final String f5420e;
    private final List f;

    public SdkEnvironment(AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List<String> list) {
        this.f5416a = appVersionInfo;
        this.f5417b = str;
        this.f5418c = screenInfo;
        this.f5419d = sdkInfo;
        this.f5420e = str2;
        this.f = list;
    }

    public static /* synthetic */ SdkEnvironment copy$default(SdkEnvironment sdkEnvironment, AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            appVersionInfo = sdkEnvironment.f5416a;
        }
        if ((i3 & 2) != 0) {
            str = sdkEnvironment.f5417b;
        }
        if ((i3 & 4) != 0) {
            screenInfo = sdkEnvironment.f5418c;
        }
        if ((i3 & 8) != 0) {
            sdkInfo = sdkEnvironment.f5419d;
        }
        if ((i3 & 16) != 0) {
            str2 = sdkEnvironment.f5420e;
        }
        if ((i3 & 32) != 0) {
            list = sdkEnvironment.f;
        }
        String str3 = str2;
        List list2 = list;
        return sdkEnvironment.copy(appVersionInfo, str, screenInfo, sdkInfo, str3, list2);
    }

    public final AppVersionInfo component1() {
        return this.f5416a;
    }

    public final String component2() {
        return this.f5417b;
    }

    public final ScreenInfo component3() {
        return this.f5418c;
    }

    public final SdkInfo component4() {
        return this.f5419d;
    }

    public final String component5() {
        return this.f5420e;
    }

    public final List<String> component6() {
        return this.f;
    }

    public final SdkEnvironment copy(AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List<String> list) {
        return new SdkEnvironment(appVersionInfo, str, screenInfo, sdkInfo, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkEnvironment)) {
            return false;
        }
        SdkEnvironment sdkEnvironment = (SdkEnvironment) obj;
        return j.a(this.f5416a, sdkEnvironment.f5416a) && j.a(this.f5417b, sdkEnvironment.f5417b) && j.a(this.f5418c, sdkEnvironment.f5418c) && j.a(this.f5419d, sdkEnvironment.f5419d) && j.a(this.f5420e, sdkEnvironment.f5420e) && j.a(this.f, sdkEnvironment.f);
    }

    public final String getAppFramework() {
        return this.f5417b;
    }

    public final AppVersionInfo getAppVersionInfo() {
        return this.f5416a;
    }

    public final String getDeviceType() {
        return this.f5420e;
    }

    public final List<String> getLocales() {
        return this.f;
    }

    public final ScreenInfo getScreenInfo() {
        return this.f5418c;
    }

    public final SdkInfo getSdkInfo() {
        return this.f5419d;
    }

    public int hashCode() {
        return this.f.hashCode() + ((this.f5420e.hashCode() + ((this.f5419d.hashCode() + ((this.f5418c.hashCode() + ((this.f5417b.hashCode() + (this.f5416a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "SdkEnvironment(appVersionInfo=" + this.f5416a + ", appFramework=" + this.f5417b + ", screenInfo=" + this.f5418c + ", sdkInfo=" + this.f5419d + ", deviceType=" + this.f5420e + ", locales=" + this.f + ')';
    }
}
