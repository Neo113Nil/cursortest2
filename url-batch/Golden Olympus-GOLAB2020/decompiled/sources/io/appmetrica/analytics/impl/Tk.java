package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Tk {

    /* renamed from: a, reason: collision with root package name */
    public final String f38327a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38328b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38329c;

    /* renamed from: d, reason: collision with root package name */
    public final String f38330d;

    /* renamed from: e, reason: collision with root package name */
    public final String f38331e;

    /* renamed from: f, reason: collision with root package name */
    public final int f38332f;

    /* renamed from: g, reason: collision with root package name */
    public final int f38333g;

    public Tk(JSONObject jSONObject) {
        this.f38327a = jSONObject.optString("analyticsSdkVersionName", "");
        this.f38328b = jSONObject.optString("kitBuildNumber", "");
        this.f38329c = jSONObject.optString("appVer", "");
        this.f38330d = jSONObject.optString("appBuild", "");
        this.f38331e = jSONObject.optString("osVer", "");
        this.f38332f = jSONObject.optInt("osApiLev", -1);
        this.f38333g = jSONObject.optInt("attribution_id", 0);
    }

    public final String toString() {
        return "SessionRequestParams(kitVersionName='" + this.f38327a + "', kitBuildNumber='" + this.f38328b + "', appVersion='" + this.f38329c + "', appBuild='" + this.f38330d + "', osVersion='" + this.f38331e + "', apiLevel=" + this.f38332f + ", attributionId=" + this.f38333g + ')';
    }
}
