package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xc0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14122a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14123b;

    /* renamed from: c, reason: collision with root package name */
    public final List<String> f14124c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14125d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14126e;

    /* renamed from: f, reason: collision with root package name */
    public final List<String> f14127f;

    /* renamed from: g, reason: collision with root package name */
    public final List<String> f14128g;

    /* renamed from: h, reason: collision with root package name */
    public final List<String> f14129h;

    /* renamed from: i, reason: collision with root package name */
    public final List<String> f14130i;

    /* renamed from: j, reason: collision with root package name */
    public final List<String> f14131j;

    /* renamed from: k, reason: collision with root package name */
    public final String f14132k;

    /* renamed from: l, reason: collision with root package name */
    public final List<String> f14133l;

    /* renamed from: m, reason: collision with root package name */
    public final List<String> f14134m;

    /* renamed from: n, reason: collision with root package name */
    public final List<String> f14135n;

    /* renamed from: o, reason: collision with root package name */
    public final String f14136o;

    /* renamed from: p, reason: collision with root package name */
    public final String f14137p;

    /* renamed from: q, reason: collision with root package name */
    public final String f14138q;

    /* renamed from: r, reason: collision with root package name */
    public final String f14139r;

    /* renamed from: s, reason: collision with root package name */
    public final String f14140s;

    /* renamed from: t, reason: collision with root package name */
    public final List<String> f14141t;

    /* renamed from: u, reason: collision with root package name */
    public final String f14142u;

    /* renamed from: v, reason: collision with root package name */
    public final String f14143v;

    public xc0(JSONObject jSONObject) {
        List<String> list;
        this.f14123b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            arrayList.add(jSONArray.getString(i7));
        }
        this.f14124c = Collections.unmodifiableList(arrayList);
        this.f14125d = jSONObject.optString("allocation_id", null);
        y2.t.h();
        this.f14127f = zc0.a(jSONObject, "clickurl");
        y2.t.h();
        this.f14128g = zc0.a(jSONObject, "imp_urls");
        y2.t.h();
        this.f14129h = zc0.a(jSONObject, "downloaded_imp_urls");
        y2.t.h();
        this.f14131j = zc0.a(jSONObject, "fill_urls");
        y2.t.h();
        this.f14133l = zc0.a(jSONObject, "video_start_urls");
        y2.t.h();
        this.f14135n = zc0.a(jSONObject, "video_complete_urls");
        y2.t.h();
        this.f14134m = zc0.a(jSONObject, "video_reward_urls");
        this.f14136o = jSONObject.optString("transaction_id");
        this.f14137p = jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            y2.t.h();
            list = zc0.a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.f14130i = list;
        this.f14122a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f14132k = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f14126e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.f14138q = jSONObject.optString("html_template", null);
        this.f14139r = jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.f14140s = optJSONObject3 != null ? optJSONObject3.toString() : null;
        y2.t.h();
        this.f14141t = zc0.a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.f14142u = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.f14143v = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
