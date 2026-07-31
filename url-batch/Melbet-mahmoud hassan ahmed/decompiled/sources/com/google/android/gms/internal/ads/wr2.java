package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class wr2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13926a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13927b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f13928c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f13929d;

    wr2(JsonReader jsonReader) {
        JSONObject h7 = a3.a1.h(jsonReader);
        this.f13929d = h7;
        this.f13926a = h7.optString("ad_html", null);
        this.f13927b = h7.optString("ad_base_url", null);
        this.f13928c = h7.optJSONObject("ad_json");
    }
}
