package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class yc0 {

    /* renamed from: a, reason: collision with root package name */
    public final List<xc0> f14607a;

    /* renamed from: b, reason: collision with root package name */
    public final List<String> f14608b;

    /* renamed from: c, reason: collision with root package name */
    public final List<String> f14609c;

    /* renamed from: d, reason: collision with root package name */
    public final List<String> f14610d;

    /* renamed from: e, reason: collision with root package name */
    public final List<String> f14611e;

    /* renamed from: f, reason: collision with root package name */
    public final List<String> f14612f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14613g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14614h;

    public yc0(JSONObject jSONObject) {
        if (io0.j(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            a3.r1.k(valueOf.length() != 0 ? "Mediation Response JSON: ".concat(valueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i7 = -1;
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            try {
                xc0 xc0Var = new xc0(jSONArray.getJSONObject(i8));
                "banner".equalsIgnoreCase(xc0Var.f14143v);
                arrayList.add(xc0Var);
                if (i7 < 0) {
                    Iterator<String> it = xc0Var.f14124c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i7 = i8;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f14607a = Collections.unmodifiableList(arrayList);
        this.f14613g = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject == null) {
            this.f14608b = null;
            this.f14609c = null;
            this.f14610d = null;
            this.f14611e = null;
            this.f14612f = null;
            this.f14614h = null;
            return;
        }
        optJSONObject.optLong("ad_network_timeout_millis", -1L);
        y2.t.h();
        this.f14608b = zc0.a(optJSONObject, "click_urls");
        y2.t.h();
        this.f14609c = zc0.a(optJSONObject, "imp_urls");
        y2.t.h();
        this.f14610d = zc0.a(optJSONObject, "downloaded_imp_urls");
        y2.t.h();
        this.f14611e = zc0.a(optJSONObject, "nofill_urls");
        y2.t.h();
        this.f14612f = zc0.a(optJSONObject, "remote_ping_urls");
        optJSONObject.optBoolean("render_in_browser", false);
        optJSONObject.optLong("refresh", -1L);
        yj0 c7 = yj0.c(optJSONObject.optJSONArray("rewards"));
        this.f14614h = c7 != null ? c7.f14705f : null;
        optJSONObject.optBoolean("use_displayed_impression", false);
        optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
        optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
        optJSONObject.optBoolean("allow_custom_click_gesture", false);
    }
}
