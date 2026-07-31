package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class yi0 {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f14684a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14685b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14686c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14687d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f14688e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f14689f;

    /* renamed from: g, reason: collision with root package name */
    private final String f14690g;

    /* renamed from: h, reason: collision with root package name */
    private final String f14691h;

    /* renamed from: i, reason: collision with root package name */
    private final String f14692i;

    /* renamed from: j, reason: collision with root package name */
    private final int f14693j;

    /* renamed from: k, reason: collision with root package name */
    private final JSONObject f14694k;

    /* renamed from: l, reason: collision with root package name */
    private final String f14695l;

    /* renamed from: m, reason: collision with root package name */
    private final String f14696m;

    public yi0(JSONObject jSONObject) {
        this.f14692i = jSONObject.optString("url");
        this.f14685b = jSONObject.optString("base_uri");
        this.f14686c = jSONObject.optString("post_parameters");
        this.f14688e = j(jSONObject.optString("drt_include"));
        this.f14689f = j(jSONObject.optString("cookies_include", "true"));
        this.f14690g = jSONObject.optString("request_id");
        this.f14687d = jSONObject.optString("type");
        String optString = jSONObject.optString("errors");
        this.f14684a = optString == null ? null : Arrays.asList(optString.split(","));
        this.f14693j = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.f14691h = jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f14694k = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.f14695l = jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f14696m = jSONObject.optString("pool_key");
    }

    private static boolean j(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }

    public final int a() {
        return this.f14693j;
    }

    public final String b() {
        return this.f14685b;
    }

    public final String c() {
        return this.f14696m;
    }

    public final String d() {
        return this.f14686c;
    }

    public final String e() {
        return this.f14692i;
    }

    public final List<String> f() {
        return this.f14684a;
    }

    public final JSONObject g() {
        return this.f14694k;
    }

    public final boolean h() {
        return this.f14689f;
    }

    public final boolean i() {
        return this.f14688e;
    }
}
