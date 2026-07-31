package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes3.dex */
public final class H7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f37608a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37609b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37610c;

    /* renamed from: d, reason: collision with root package name */
    public final String f37611d;

    /* renamed from: e, reason: collision with root package name */
    public final String f37612e;

    /* renamed from: f, reason: collision with root package name */
    public final String f37613f;

    /* renamed from: g, reason: collision with root package name */
    public final String f37614g;

    /* renamed from: h, reason: collision with root package name */
    public final String f37615h;

    /* renamed from: i, reason: collision with root package name */
    public final String f37616i;

    /* renamed from: j, reason: collision with root package name */
    public final String f37617j;

    /* renamed from: k, reason: collision with root package name */
    public final String f37618k;

    /* renamed from: l, reason: collision with root package name */
    public final String f37619l;

    /* renamed from: m, reason: collision with root package name */
    public final String f37620m;

    /* renamed from: n, reason: collision with root package name */
    public final String f37621n;

    public H7(Ab ab) {
        this.f37608a = ab.b("dId");
        this.f37609b = ab.b("uId");
        this.f37610c = ab.b("analyticsSdkVersionName");
        this.f37611d = ab.b("kitBuildNumber");
        this.f37612e = ab.b("kitBuildType");
        this.f37613f = ab.b("appVer");
        this.f37614g = ab.optString("app_debuggable", "0");
        this.f37615h = ab.b("appBuild");
        this.f37616i = ab.b("osVer");
        this.f37618k = ab.b(com.ironsource.ge.f16487q);
        this.f37619l = ab.b("root");
        this.f37620m = ab.optString(CommonUrlParts.APP_FRAMEWORK, FrameworkDetector.framework());
        int optInt = ab.optInt("osApiLev", -1);
        this.f37617j = optInt == -1 ? null : String.valueOf(optInt);
        int optInt2 = ab.optInt("attribution_id", 0);
        this.f37621n = optInt2 > 0 ? String.valueOf(optInt2) : null;
    }

    public final String toString() {
        return "DbNetworkTaskConfig{deviceId='" + this.f37608a + "', uuid='" + this.f37609b + "', analyticsSdkVersionName='" + this.f37610c + "', kitBuildNumber='" + this.f37611d + "', kitBuildType='" + this.f37612e + "', appVersion='" + this.f37613f + "', appDebuggable='" + this.f37614g + "', appBuildNumber='" + this.f37615h + "', osVersion='" + this.f37616i + "', osApiLevel='" + this.f37617j + "', locale='" + this.f37618k + "', deviceRootStatus='" + this.f37619l + "', appFramework='" + this.f37620m + "', attributionId='" + this.f37621n + "'}";
    }

    public H7() {
        this.f37608a = null;
        this.f37609b = null;
        this.f37610c = null;
        this.f37611d = null;
        this.f37612e = null;
        this.f37613f = null;
        this.f37614g = null;
        this.f37615h = null;
        this.f37616i = null;
        this.f37617j = null;
        this.f37618k = null;
        this.f37619l = null;
        this.f37620m = null;
        this.f37621n = null;
    }
}
