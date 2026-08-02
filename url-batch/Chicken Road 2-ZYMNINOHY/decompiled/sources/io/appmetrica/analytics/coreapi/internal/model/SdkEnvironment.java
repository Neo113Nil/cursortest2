package io.appmetrica.analytics.coreapi.internal.model;

import E.AbstractC0005f;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class SdkEnvironment {

    /* renamed from: a, reason: collision with root package name */
    private final AppVersionInfo f9669a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9670b;

    /* renamed from: c, reason: collision with root package name */
    private final ScreenInfo f9671c;

    /* renamed from: d, reason: collision with root package name */
    private final SdkInfo f9672d;

    /* renamed from: e, reason: collision with root package name */
    private final String f9673e;

    /* renamed from: f, reason: collision with root package name */
    private final List f9674f;

    public SdkEnvironment(AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List<String> list) {
        this.f9669a = appVersionInfo;
        this.f9670b = str;
        this.f9671c = screenInfo;
        this.f9672d = sdkInfo;
        this.f9673e = str2;
        this.f9674f = list;
    }

    public static /* synthetic */ SdkEnvironment copy$default(SdkEnvironment sdkEnvironment, AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            appVersionInfo = sdkEnvironment.f9669a;
        }
        if ((i4 & 2) != 0) {
            str = sdkEnvironment.f9670b;
        }
        if ((i4 & 4) != 0) {
            screenInfo = sdkEnvironment.f9671c;
        }
        if ((i4 & 8) != 0) {
            sdkInfo = sdkEnvironment.f9672d;
        }
        if ((i4 & 16) != 0) {
            str2 = sdkEnvironment.f9673e;
        }
        if ((i4 & 32) != 0) {
            list = sdkEnvironment.f9674f;
        }
        String str3 = str2;
        List list2 = list;
        return sdkEnvironment.copy(appVersionInfo, str, screenInfo, sdkInfo, str3, list2);
    }

    public final AppVersionInfo component1() {
        return this.f9669a;
    }

    public final String component2() {
        return this.f9670b;
    }

    public final ScreenInfo component3() {
        return this.f9671c;
    }

    public final SdkInfo component4() {
        return this.f9672d;
    }

    public final String component5() {
        return this.f9673e;
    }

    public final List<String> component6() {
        return this.f9674f;
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
        return i.a(this.f9669a, sdkEnvironment.f9669a) && i.a(this.f9670b, sdkEnvironment.f9670b) && i.a(this.f9671c, sdkEnvironment.f9671c) && i.a(this.f9672d, sdkEnvironment.f9672d) && i.a(this.f9673e, sdkEnvironment.f9673e) && i.a(this.f9674f, sdkEnvironment.f9674f);
    }

    public final String getAppFramework() {
        return this.f9670b;
    }

    public final AppVersionInfo getAppVersionInfo() {
        return this.f9669a;
    }

    public final String getDeviceType() {
        return this.f9673e;
    }

    public final List<String> getLocales() {
        return this.f9674f;
    }

    public final ScreenInfo getScreenInfo() {
        return this.f9671c;
    }

    public final SdkInfo getSdkInfo() {
        return this.f9672d;
    }

    public int hashCode() {
        return this.f9674f.hashCode() + AbstractC0005f.f((this.f9672d.hashCode() + ((this.f9671c.hashCode() + AbstractC0005f.f(this.f9669a.hashCode() * 31, 31, this.f9670b)) * 31)) * 31, 31, this.f9673e);
    }

    public String toString() {
        return "SdkEnvironment(appVersionInfo=" + this.f9669a + ", appFramework=" + this.f9670b + ", screenInfo=" + this.f9671c + ", sdkInfo=" + this.f9672d + ", deviceType=" + this.f9673e + ", locales=" + this.f9674f + ')';
    }
}
