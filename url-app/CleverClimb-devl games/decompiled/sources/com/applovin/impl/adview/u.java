package com.applovin.impl.adview;

import android.webkit.WebSettings;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.j f2628a;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f2629b;

    public u(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        this.f2628a = jVar;
        this.f2629b = jSONObject;
    }

    public Integer a() {
        int i;
        String a2 = com.applovin.impl.sdk.e.f.a(this.f2629b, "mixed_content_mode", (String) null, this.f2628a);
        if (com.applovin.impl.sdk.e.i.b(a2)) {
            if ("always_allow".equalsIgnoreCase(a2)) {
                i = 0;
            } else if ("never_allow".equalsIgnoreCase(a2)) {
                i = 1;
            } else if ("compatibility_mode".equalsIgnoreCase(a2)) {
                i = 2;
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    public WebSettings.PluginState b() {
        String a2 = com.applovin.impl.sdk.e.f.a(this.f2629b, "plugin_state", (String) null, this.f2628a);
        if (com.applovin.impl.sdk.e.i.b(a2)) {
            if (TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER_ON.equalsIgnoreCase(a2)) {
                return WebSettings.PluginState.ON;
            }
            if ("on_demand".equalsIgnoreCase(a2)) {
                return WebSettings.PluginState.ON_DEMAND;
            }
            if ("off".equalsIgnoreCase(a2)) {
                return WebSettings.PluginState.OFF;
            }
        }
        return null;
    }

    public Boolean c() {
        return com.applovin.impl.sdk.e.f.a(this.f2629b, "allow_file_access", (Boolean) null, this.f2628a);
    }

    public Boolean d() {
        return com.applovin.impl.sdk.e.f.a(this.f2629b, "load_with_overview_mode", (Boolean) null, this.f2628a);
    }

    public Boolean e() {
        return com.applovin.impl.sdk.e.f.a(this.f2629b, "use_wide_view_port", (Boolean) null, this.f2628a);
    }

    public Boolean f() {
        return com.applovin.impl.sdk.e.f.a(this.f2629b, "allow_content_access", (Boolean) null, this.f2628a);
    }

    public Boolean g() {
        return com.applovin.impl.sdk.e.f.a(this.f2629b, "use_built_in_zoom_controls", (Boolean) null, this.f2628a);
    }

    public Boolean h() {
        return com.applovin.impl.sdk.e.f.a(this.f2629b, "display_zoom_controls", (Boolean) null, this.f2628a);
    }

    public Boolean i() {
        return com.applovin.impl.sdk.e.f.a(this.f2629b, "save_form_data", (Boolean) null, this.f2628a);
    }

    public Boolean j() {
        return com.applovin.impl.sdk.e.f.a(this.f2629b, "geolocation_enabled", (Boolean) null, this.f2628a);
    }

    public Boolean k() {
        return com.applovin.impl.sdk.e.f.a(this.f2629b, "need_initial_focus", (Boolean) null, this.f2628a);
    }

    public Boolean l() {
        return com.applovin.impl.sdk.e.f.a(this.f2629b, "allow_file_access_from_file_urls", (Boolean) null, this.f2628a);
    }

    public Boolean m() {
        return com.applovin.impl.sdk.e.f.a(this.f2629b, "allow_universal_access_from_file_urls", (Boolean) null, this.f2628a);
    }

    public Boolean n() {
        return com.applovin.impl.sdk.e.f.a(this.f2629b, "offscreen_pre_raster", (Boolean) null, this.f2628a);
    }
}
