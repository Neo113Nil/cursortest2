package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Sk {

    /* renamed from: a, reason: collision with root package name */
    public final String f10953a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10954b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10955c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10956d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10957e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10958f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10959g;

    public Sk(JSONObject jSONObject) {
        this.f10953a = jSONObject.optString("analyticsSdkVersionName", "");
        this.f10954b = jSONObject.optString("kitBuildNumber", "");
        this.f10955c = jSONObject.optString("appVer", "");
        this.f10956d = jSONObject.optString("appBuild", "");
        this.f10957e = jSONObject.optString("osVer", "");
        this.f10958f = jSONObject.optInt("osApiLev", -1);
        this.f10959g = jSONObject.optInt("attribution_id", 0);
    }

    public final String toString() {
        return "SessionRequestParams(kitVersionName='" + this.f10953a + "', kitBuildNumber='" + this.f10954b + "', appVersion='" + this.f10955c + "', appBuild='" + this.f10956d + "', osVersion='" + this.f10957e + "', apiLevel=" + this.f10958f + ", attributionId=" + this.f10959g + ')';
    }
}
