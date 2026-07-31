package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: io.appmetrica.analytics.impl.m7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0348m7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1372a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;

    public C0348m7(C0198gb c0198gb) {
        this.f1372a = c0198gb.b("dId");
        this.b = c0198gb.b("uId");
        this.c = c0198gb.b("analyticsSdkVersionName");
        this.d = c0198gb.b("kitBuildNumber");
        this.e = c0198gb.b("kitBuildType");
        this.f = c0198gb.b("appVer");
        this.g = c0198gb.optString("app_debuggable", CommonUrlParts.Values.FALSE_INTEGER);
        this.h = c0198gb.b("appBuild");
        this.i = c0198gb.b("osVer");
        this.k = c0198gb.b("lang");
        this.l = c0198gb.b("root");
        this.m = c0198gb.optString(CommonUrlParts.APP_FRAMEWORK, FrameworkDetector.framework());
        int optInt = c0198gb.optInt("osApiLev", -1);
        this.j = optInt == -1 ? null : String.valueOf(optInt);
        int optInt2 = c0198gb.optInt("attribution_id", 0);
        this.n = optInt2 > 0 ? String.valueOf(optInt2) : null;
    }

    public final String toString() {
        return "DbNetworkTaskConfig{deviceId='" + this.f1372a + "', uuid='" + this.b + "', analyticsSdkVersionName='" + this.c + "', kitBuildNumber='" + this.d + "', kitBuildType='" + this.e + "', appVersion='" + this.f + "', appDebuggable='" + this.g + "', appBuildNumber='" + this.h + "', osVersion='" + this.i + "', osApiLevel='" + this.j + "', locale='" + this.k + "', deviceRootStatus='" + this.l + "', appFramework='" + this.m + "', attributionId='" + this.n + "'}";
    }

    public C0348m7() {
        this.f1372a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
    }
}
