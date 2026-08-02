package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Xk {

    /* renamed from: a, reason: collision with root package name */
    public final String f6872a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6873b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6874c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6875d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6876e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6877g;

    public Xk(JSONObject jSONObject) {
        this.f6872a = jSONObject.optString("analyticsSdkVersionName", "");
        this.f6873b = jSONObject.optString("kitBuildNumber", "");
        this.f6874c = jSONObject.optString("appVer", "");
        this.f6875d = jSONObject.optString("appBuild", "");
        this.f6876e = jSONObject.optString("osVer", "");
        this.f = jSONObject.optInt("osApiLev", -1);
        this.f6877g = jSONObject.optInt("attribution_id", 0);
    }

    public final String toString() {
        return "SessionRequestParams(kitVersionName='" + this.f6872a + "', kitBuildNumber='" + this.f6873b + "', appVersion='" + this.f6874c + "', appBuild='" + this.f6875d + "', osVersion='" + this.f6876e + "', apiLevel=" + this.f + ", attributionId=" + this.f6877g + ')';
    }
}
