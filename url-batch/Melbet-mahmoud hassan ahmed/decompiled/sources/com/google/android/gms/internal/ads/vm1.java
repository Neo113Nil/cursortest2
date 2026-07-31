package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vm1 extends wm1 {

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f13444b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f13445c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f13446d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f13447e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f13448f;

    /* renamed from: g, reason: collision with root package name */
    private final String f13449g;

    public vm1(rr2 rr2Var, JSONObject jSONObject) {
        super(rr2Var);
        this.f13444b = a3.a1.g(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f13445c = a3.a1.k(false, jSONObject, "allow_pub_owned_ad_view");
        this.f13446d = a3.a1.k(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f13447e = a3.a1.k(false, jSONObject, "enable_omid");
        this.f13449g = a3.a1.b("", jSONObject, "watermark_overlay_png_base64");
        this.f13448f = jSONObject.optJSONObject("overlay") != null;
    }

    @Override // com.google.android.gms.internal.ads.wm1
    public final String a() {
        return this.f13449g;
    }

    @Override // com.google.android.gms.internal.ads.wm1
    public final JSONObject b() {
        JSONObject jSONObject = this.f13444b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f13866a.A);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.wm1
    public final boolean c() {
        return this.f13447e;
    }

    @Override // com.google.android.gms.internal.ads.wm1
    public final boolean d() {
        return this.f13445c;
    }

    @Override // com.google.android.gms.internal.ads.wm1
    public final boolean e() {
        return this.f13446d;
    }

    @Override // com.google.android.gms.internal.ads.wm1
    public final boolean f() {
        return this.f13448f;
    }
}
