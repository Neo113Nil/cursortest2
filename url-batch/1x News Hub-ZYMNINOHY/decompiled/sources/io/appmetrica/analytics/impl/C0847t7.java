package io.appmetrica.analytics.impl;

import E1.AbstractC0033i;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: io.appmetrica.analytics.impl.t7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0847t7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8340a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8341b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8342c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8343d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8344e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8345g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8346h;

    /* renamed from: i, reason: collision with root package name */
    public final String f8347i;

    /* renamed from: j, reason: collision with root package name */
    public final String f8348j;

    /* renamed from: k, reason: collision with root package name */
    public final String f8349k;

    /* renamed from: l, reason: collision with root package name */
    public final String f8350l;

    /* renamed from: m, reason: collision with root package name */
    public final String f8351m;

    /* renamed from: n, reason: collision with root package name */
    public final String f8352n;

    public C0847t7(C0670mb c0670mb) {
        this.f8340a = c0670mb.b("dId");
        this.f8341b = c0670mb.b("uId");
        this.f8342c = c0670mb.b("analyticsSdkVersionName");
        this.f8343d = c0670mb.b("kitBuildNumber");
        this.f8344e = c0670mb.b("kitBuildType");
        this.f = c0670mb.b("appVer");
        this.f8345g = c0670mb.optString("app_debuggable", CommonUrlParts.Values.FALSE_INTEGER);
        this.f8346h = c0670mb.b("appBuild");
        this.f8347i = c0670mb.b("osVer");
        this.f8349k = c0670mb.b("lang");
        this.f8350l = c0670mb.b("root");
        this.f8351m = c0670mb.optString(CommonUrlParts.APP_FRAMEWORK, FrameworkDetector.framework());
        int optInt = c0670mb.optInt("osApiLev", -1);
        this.f8348j = optInt == -1 ? null : String.valueOf(optInt);
        int optInt2 = c0670mb.optInt("attribution_id", 0);
        this.f8352n = optInt2 > 0 ? String.valueOf(optInt2) : null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DbNetworkTaskConfig{deviceId='");
        sb.append(this.f8340a);
        sb.append("', uuid='");
        sb.append(this.f8341b);
        sb.append("', analyticsSdkVersionName='");
        sb.append(this.f8342c);
        sb.append("', kitBuildNumber='");
        sb.append(this.f8343d);
        sb.append("', kitBuildType='");
        sb.append(this.f8344e);
        sb.append("', appVersion='");
        sb.append(this.f);
        sb.append("', appDebuggable='");
        sb.append(this.f8345g);
        sb.append("', appBuildNumber='");
        sb.append(this.f8346h);
        sb.append("', osVersion='");
        sb.append(this.f8347i);
        sb.append("', osApiLevel='");
        sb.append(this.f8348j);
        sb.append("', locale='");
        sb.append(this.f8349k);
        sb.append("', deviceRootStatus='");
        sb.append(this.f8350l);
        sb.append("', appFramework='");
        sb.append(this.f8351m);
        sb.append("', attributionId='");
        return AbstractC0033i.m(sb, this.f8352n, "'}");
    }

    public C0847t7() {
        this.f8340a = null;
        this.f8341b = null;
        this.f8342c = null;
        this.f8343d = null;
        this.f8344e = null;
        this.f = null;
        this.f8345g = null;
        this.f8346h = null;
        this.f8347i = null;
        this.f8348j = null;
        this.f8349k = null;
        this.f8350l = null;
        this.f8351m = null;
        this.f8352n = null;
    }
}
