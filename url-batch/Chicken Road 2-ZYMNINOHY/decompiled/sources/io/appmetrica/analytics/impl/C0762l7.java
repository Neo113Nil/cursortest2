package io.appmetrica.analytics.impl;

import E.AbstractC0005f;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: io.appmetrica.analytics.impl.l7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0762l7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12269a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12270b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12271c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12272d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12273e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12274f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12275g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12276h;

    /* renamed from: i, reason: collision with root package name */
    public final String f12277i;

    /* renamed from: j, reason: collision with root package name */
    public final String f12278j;

    /* renamed from: k, reason: collision with root package name */
    public final String f12279k;

    /* renamed from: l, reason: collision with root package name */
    public final String f12280l;

    /* renamed from: m, reason: collision with root package name */
    public final String f12281m;
    public final String n;

    public C0762l7(C0611fb c0611fb) {
        this.f12269a = c0611fb.b("dId");
        this.f12270b = c0611fb.b("uId");
        this.f12271c = c0611fb.b("analyticsSdkVersionName");
        this.f12272d = c0611fb.b("kitBuildNumber");
        this.f12273e = c0611fb.b("kitBuildType");
        this.f12274f = c0611fb.b("appVer");
        this.f12275g = c0611fb.optString("app_debuggable", CommonUrlParts.Values.FALSE_INTEGER);
        this.f12276h = c0611fb.b("appBuild");
        this.f12277i = c0611fb.b("osVer");
        this.f12279k = c0611fb.b("lang");
        this.f12280l = c0611fb.b("root");
        this.f12281m = c0611fb.optString(CommonUrlParts.APP_FRAMEWORK, FrameworkDetector.framework());
        int optInt = c0611fb.optInt("osApiLev", -1);
        this.f12278j = optInt == -1 ? null : String.valueOf(optInt);
        int optInt2 = c0611fb.optInt("attribution_id", 0);
        this.n = optInt2 > 0 ? String.valueOf(optInt2) : null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DbNetworkTaskConfig{deviceId='");
        sb.append(this.f12269a);
        sb.append("', uuid='");
        sb.append(this.f12270b);
        sb.append("', analyticsSdkVersionName='");
        sb.append(this.f12271c);
        sb.append("', kitBuildNumber='");
        sb.append(this.f12272d);
        sb.append("', kitBuildType='");
        sb.append(this.f12273e);
        sb.append("', appVersion='");
        sb.append(this.f12274f);
        sb.append("', appDebuggable='");
        sb.append(this.f12275g);
        sb.append("', appBuildNumber='");
        sb.append(this.f12276h);
        sb.append("', osVersion='");
        sb.append(this.f12277i);
        sb.append("', osApiLevel='");
        sb.append(this.f12278j);
        sb.append("', locale='");
        sb.append(this.f12279k);
        sb.append("', deviceRootStatus='");
        sb.append(this.f12280l);
        sb.append("', appFramework='");
        sb.append(this.f12281m);
        sb.append("', attributionId='");
        return AbstractC0005f.q(sb, this.n, "'}");
    }

    public C0762l7() {
        this.f12269a = null;
        this.f12270b = null;
        this.f12271c = null;
        this.f12272d = null;
        this.f12273e = null;
        this.f12274f = null;
        this.f12275g = null;
        this.f12276h = null;
        this.f12277i = null;
        this.f12278j = null;
        this.f12279k = null;
        this.f12280l = null;
        this.f12281m = null;
        this.n = null;
    }
}
