package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Xk {

    /* renamed from: a, reason: collision with root package name */
    public final String f7709a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7710b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7711c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7712d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7713e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7714f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7715g;

    public Xk(JSONObject jSONObject) {
        this.f7709a = jSONObject.optString("analyticsSdkVersionName", "");
        this.f7710b = jSONObject.optString("kitBuildNumber", "");
        this.f7711c = jSONObject.optString("appVer", "");
        this.f7712d = jSONObject.optString("appBuild", "");
        this.f7713e = jSONObject.optString("osVer", "");
        this.f7714f = jSONObject.optInt("osApiLev", -1);
        this.f7715g = jSONObject.optInt("attribution_id", 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionRequestParams(kitVersionName='");
        sb.append(this.f7709a);
        sb.append("', kitBuildNumber='");
        sb.append(this.f7710b);
        sb.append("', appVersion='");
        sb.append(this.f7711c);
        sb.append("', appBuild='");
        sb.append(this.f7712d);
        sb.append("', osVersion='");
        sb.append(this.f7713e);
        sb.append("', apiLevel=");
        sb.append(this.f7714f);
        sb.append(", attributionId=");
        return B0.o.k(sb, this.f7715g, ')');
    }
}
