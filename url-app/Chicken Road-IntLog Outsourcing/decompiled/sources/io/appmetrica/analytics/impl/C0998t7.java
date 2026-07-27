package io.appmetrica.analytics.impl;

import b2.AbstractC0279e;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: io.appmetrica.analytics.impl.t7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0998t7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9281a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9282b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9283c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9284d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9285e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9286f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9287g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9288h;

    /* renamed from: i, reason: collision with root package name */
    public final String f9289i;

    /* renamed from: j, reason: collision with root package name */
    public final String f9290j;

    /* renamed from: k, reason: collision with root package name */
    public final String f9291k;

    /* renamed from: l, reason: collision with root package name */
    public final String f9292l;

    /* renamed from: m, reason: collision with root package name */
    public final String f9293m;

    /* renamed from: n, reason: collision with root package name */
    public final String f9294n;

    public C0998t7(C0821mb c0821mb) {
        this.f9281a = c0821mb.b("dId");
        this.f9282b = c0821mb.b("uId");
        this.f9283c = c0821mb.b("analyticsSdkVersionName");
        this.f9284d = c0821mb.b("kitBuildNumber");
        this.f9285e = c0821mb.b("kitBuildType");
        this.f9286f = c0821mb.b("appVer");
        this.f9287g = c0821mb.optString("app_debuggable", CommonUrlParts.Values.FALSE_INTEGER);
        this.f9288h = c0821mb.b("appBuild");
        this.f9289i = c0821mb.b("osVer");
        this.f9291k = c0821mb.b("lang");
        this.f9292l = c0821mb.b("root");
        this.f9293m = c0821mb.optString(CommonUrlParts.APP_FRAMEWORK, FrameworkDetector.framework());
        int optInt = c0821mb.optInt("osApiLev", -1);
        this.f9290j = optInt == -1 ? null : String.valueOf(optInt);
        int optInt2 = c0821mb.optInt("attribution_id", 0);
        this.f9294n = optInt2 > 0 ? String.valueOf(optInt2) : null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DbNetworkTaskConfig{deviceId='");
        sb.append(this.f9281a);
        sb.append("', uuid='");
        sb.append(this.f9282b);
        sb.append("', analyticsSdkVersionName='");
        sb.append(this.f9283c);
        sb.append("', kitBuildNumber='");
        sb.append(this.f9284d);
        sb.append("', kitBuildType='");
        sb.append(this.f9285e);
        sb.append("', appVersion='");
        sb.append(this.f9286f);
        sb.append("', appDebuggable='");
        sb.append(this.f9287g);
        sb.append("', appBuildNumber='");
        sb.append(this.f9288h);
        sb.append("', osVersion='");
        sb.append(this.f9289i);
        sb.append("', osApiLevel='");
        sb.append(this.f9290j);
        sb.append("', locale='");
        sb.append(this.f9291k);
        sb.append("', deviceRootStatus='");
        sb.append(this.f9292l);
        sb.append("', appFramework='");
        sb.append(this.f9293m);
        sb.append("', attributionId='");
        return AbstractC0279e.h(sb, this.f9294n, "'}");
    }

    public C0998t7() {
        this.f9281a = null;
        this.f9282b = null;
        this.f9283c = null;
        this.f9284d = null;
        this.f9285e = null;
        this.f9286f = null;
        this.f9287g = null;
        this.f9288h = null;
        this.f9289i = null;
        this.f9290j = null;
        this.f9291k = null;
        this.f9292l = null;
        this.f9293m = null;
        this.f9294n = null;
    }
}
