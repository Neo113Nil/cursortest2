package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class on0 {

    /* renamed from: d, reason: collision with root package name */
    private String f9728d;

    /* renamed from: e, reason: collision with root package name */
    private String f9729e;

    /* renamed from: f, reason: collision with root package name */
    private long f9730f;

    /* renamed from: g, reason: collision with root package name */
    private JSONObject f9731g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9732h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f9734j;

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f9725a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f9726b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, yc0> f9727c = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private final List<String> f9733i = new ArrayList();

    public on0(String str, long j7) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.f9732h = false;
        this.f9734j = false;
        this.f9729e = str;
        this.f9730f = j7;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f9731g = jSONObject;
            if (jSONObject.optInt("status", -1) != 1) {
                this.f9732h = false;
                io0.g("App settings could not be fetched successfully.");
                return;
            }
            this.f9732h = true;
            this.f9728d = this.f9731g.optString("app_id");
            JSONArray optJSONArray2 = this.f9731g.optJSONArray("ad_unit_id_settings");
            if (optJSONArray2 != null) {
                for (int i7 = 0; i7 < optJSONArray2.length(); i7++) {
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i7);
                    String optString = jSONObject2.optString("format");
                    String optString2 = jSONObject2.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if ("interstitial".equalsIgnoreCase(optString)) {
                            this.f9726b.add(optString2);
                        } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject2.optJSONObject("mediation_config")) != null) {
                            this.f9727c.put(optString2, new yc0(optJSONObject3));
                        }
                    }
                }
            }
            JSONArray optJSONArray3 = this.f9731g.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray3 != null) {
                for (int i8 = 0; i8 < optJSONArray3.length(); i8++) {
                    this.f9725a.add(optJSONArray3.optString(i8));
                }
            }
            if (((Boolean) sw.c().b(m10.f8254m5)).booleanValue() && (optJSONObject2 = this.f9731g.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                    this.f9733i.add(optJSONArray.get(i9).toString());
                }
            }
            if (!((Boolean) sw.c().b(m10.K4)).booleanValue() || (optJSONObject = this.f9731g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f9734j = optJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e7) {
            io0.h("Exception occurred while processing app setting json", e7);
            y2.t.p().s(e7, "AppSettings.parseAppSettingsJson");
        }
    }

    public final long a() {
        return this.f9730f;
    }

    public final String b() {
        return this.f9728d;
    }

    public final String c() {
        return this.f9729e;
    }

    public final List<String> d() {
        return this.f9733i;
    }

    public final Map<String, yc0> e() {
        return this.f9727c;
    }

    public final JSONObject f() {
        return this.f9731g;
    }

    public final void g(long j7) {
        this.f9730f = j7;
    }

    public final boolean h() {
        return this.f9734j;
    }

    public final boolean i() {
        return this.f9732h;
    }
}
