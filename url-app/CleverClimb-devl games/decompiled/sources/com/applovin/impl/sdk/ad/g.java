package com.applovin.impl.sdk.ad;

import android.R;
import android.graphics.Color;
import android.net.Uri;
import com.applovin.impl.adview.g;
import com.applovin.impl.adview.q;
import com.applovin.impl.adview.u;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.e.l;
import com.applovin.sdk.AppLovinAdType;
import com.tapjoy.TapjoyConstants;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class g extends AppLovinAdBase {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f2976a;

    /* renamed from: b, reason: collision with root package name */
    private List<com.applovin.impl.sdk.c.a> f2977b;

    /* renamed from: c, reason: collision with root package name */
    private List<com.applovin.impl.sdk.c.a> f2978c;

    /* renamed from: d, reason: collision with root package name */
    private List<com.applovin.impl.sdk.c.a> f2979d;
    private List<com.applovin.impl.sdk.c.a> e;

    public enum a {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    public enum b {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    public g(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.j jVar) {
        super(jSONObject, jSONObject2, bVar, jVar);
        this.f2976a = new AtomicBoolean();
    }

    private float a(AppLovinAdType appLovinAdType, float f, boolean z) {
        if (appLovinAdType.equals(AppLovinAdType.INCENTIVIZED)) {
            return 0.5f;
        }
        return (appLovinAdType.equals(AppLovinAdType.REGULAR) && z && f == -1.0f) ? 0.5f : 0.0f;
    }

    private String a() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    private g.a b(boolean z) {
        return z ? g.a.WhiteXOnTransparentGrey : g.a.WhiteXOnOpaqueBlack;
    }

    private String c() {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    public boolean A() {
        return getBooleanFromAdObject("lock_current_orientation", false);
    }

    public int B() {
        return getIntFromAdObject("countdown_length", 0);
    }

    public int C() {
        int parseColor = Color.parseColor("#C8FFFFFF");
        String stringFromAdObject = getStringFromAdObject("countdown_color", null);
        if (!com.applovin.impl.sdk.e.i.b(stringFromAdObject)) {
            return parseColor;
        }
        try {
            return Color.parseColor(stringFromAdObject);
        } catch (Throwable th) {
            this.sdk.u().b("DirectAd", "Unable to parse countdown color", th);
            return parseColor;
        }
    }

    public int D() {
        String stringFromAdObject = getStringFromAdObject("video_background_color", null);
        if (com.applovin.impl.sdk.e.i.b(stringFromAdObject)) {
            try {
                return Color.parseColor(stringFromAdObject);
            } catch (Throwable unused) {
            }
        }
        return -16777216;
    }

    public int E() {
        int i = hasVideoUrl() ? -16777216 : -1157627904;
        String stringFromAdObject = getStringFromAdObject("graphic_background_color", null);
        if (!com.applovin.impl.sdk.e.i.b(stringFromAdObject)) {
            return i;
        }
        try {
            return Color.parseColor(stringFromAdObject);
        } catch (Throwable unused) {
            return i;
        }
    }

    public a F() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", null);
        if (com.applovin.impl.sdk.e.i.b(stringFromAdObject)) {
            if (TapjoyConstants.TJC_FULLSCREEN_AD_DISMISS_URL.equalsIgnoreCase(stringFromAdObject)) {
                return a.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return a.DO_NOT_DISMISS;
            }
        }
        return a.UNSPECIFIED;
    }

    public List<String> G() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        return stringFromAdObject != null ? com.applovin.impl.sdk.e.c.a(stringFromAdObject) : this.sdk.b(com.applovin.impl.sdk.b.b.bu);
    }

    public String H() {
        return getStringFromAdObject("cache_prefix", null);
    }

    public boolean I() {
        return getBooleanFromAdObject("progress_bar_enabled", false);
    }

    public int J() {
        String stringFromAdObject = getStringFromAdObject("progress_bar_color", "#C8FFFFFF");
        if (com.applovin.impl.sdk.e.i.b(stringFromAdObject)) {
            try {
                return Color.parseColor(stringFromAdObject);
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public boolean K() {
        return getBooleanFromAdObject("vs_buffer_indicator_enabled", false);
    }

    public boolean L() {
        return getBooleanFromAdObject("vs_buffer_indicator_initial_load_enabled", false);
    }

    public int M() {
        return getIntFromAdObject("vs_buffer_indicator_style", R.attr.progressBarStyleLarge);
    }

    public int N() {
        String stringFromAdObject = getStringFromAdObject("vs_buffer_indicator_color", null);
        if (com.applovin.impl.sdk.e.i.b(stringFromAdObject)) {
            try {
                return Color.parseColor(stringFromAdObject);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public int O() {
        int parseColor = Color.parseColor("#66000000");
        String stringFromAdObject = getStringFromAdObject("vs_buffer_indicator_bg_color", null);
        if (!com.applovin.impl.sdk.e.i.b(stringFromAdObject)) {
            return parseColor;
        }
        try {
            return Color.parseColor(stringFromAdObject);
        } catch (Throwable unused) {
            return parseColor;
        }
    }

    public boolean P() {
        return getBooleanFromAdObject("clear_dismissible", false);
    }

    public int Q() {
        int a2;
        if (!((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.fk)).booleanValue()) {
            return l.a(this.adObject);
        }
        synchronized (this.adObjectLock) {
            a2 = l.a(this.adObject);
        }
        return a2;
    }

    public int R() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    public boolean S() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", false);
    }

    public int T() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.a(com.applovin.impl.sdk.b.b.cM)).intValue());
    }

    public int U() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.a(com.applovin.impl.sdk.b.b.cN)).intValue());
    }

    public int V() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.a(com.applovin.impl.sdk.b.b.cL)).intValue());
    }

    public boolean W() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.cK));
    }

    public boolean X() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.de));
    }

    public boolean Y() {
        return getBooleanFromAdObject("stop_video_player_after_poststitial_render", false);
    }

    public boolean Z() {
        return getBooleanFromAdObject("unhide_adview_on_render", false);
    }

    protected g.a a(int i) {
        return i == 1 ? g.a.WhiteXOnTransparentGrey : i == 2 ? g.a.Invisible : g.a.WhiteXOnOpaqueBlack;
    }

    public void a(boolean z) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("html_resources_cached", z);
            }
        } catch (Throwable unused) {
        }
    }

    public long aa() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1L);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1L;
    }

    public int ab() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    public boolean ac() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", true);
    }

    public AtomicBoolean ad() {
        return this.f2976a;
    }

    public boolean ae() {
        return getBooleanFromAdObject("show_skip_button_on_click", false);
    }

    public boolean af() {
        return getBooleanFromAdObject("restore_original_orientation", false);
    }

    public boolean ag() {
        return getBooleanFromAdObject("use_stream_url_on_cache_drop", false);
    }

    public List<com.applovin.impl.sdk.c.a> ah() {
        if (this.f2977b != null) {
            return this.f2977b;
        }
        if (((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.fk)).booleanValue()) {
            synchronized (this.adObjectLock) {
                this.f2977b = l.a("video_end_urls", this.adObject, getClCode(), a(), this.sdk);
            }
        } else {
            this.f2977b = l.a("video_end_urls", this.adObject, getClCode(), a(), this.sdk);
        }
        return this.f2977b;
    }

    public List<com.applovin.impl.sdk.c.a> ai() {
        if (this.f2978c != null) {
            return this.f2978c;
        }
        if (((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.fk)).booleanValue()) {
            synchronized (this.adObjectLock) {
                this.f2978c = l.a("click_tracking_urls", this.adObject, getClCode(), c(), this.sdk);
            }
        } else {
            this.f2978c = l.a("click_tracking_urls", this.adObject, getClCode(), c(), this.sdk);
        }
        return this.f2978c;
    }

    public List<com.applovin.impl.sdk.c.a> aj() {
        if (this.f2979d != null) {
            return this.f2979d;
        }
        if (((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.fk)).booleanValue()) {
            synchronized (this.adObjectLock) {
                this.f2979d = l.a("video_click_tracking_urls", this.adObject, getClCode(), null, this.sdk);
            }
        } else {
            this.f2979d = l.a("video_click_tracking_urls", this.adObject, getClCode(), null, this.sdk);
        }
        if (this.f2979d.isEmpty()) {
            this.f2979d = ai();
        }
        return this.f2979d;
    }

    public List<com.applovin.impl.sdk.c.a> ak() {
        if (this.e != null) {
            return this.e;
        }
        if (((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.fk)).booleanValue()) {
            synchronized (this.adObjectLock) {
                this.e = l.a("imp_urls", this.adObject, getClCode(), null, this.sdk);
            }
        } else {
            this.e = l.a("imp_urls", this.adObject, getClCode(), null, this.sdk);
        }
        return this.e;
    }

    public boolean al() {
        return getBooleanFromAdObject("render_poststitial_on_attach", false);
    }

    public boolean am() {
        return getBooleanFromAdObject("render_poststitial_on_set_content_view", false);
    }

    public boolean an() {
        return getBooleanFromAdObject("playback_requires_user_action", true);
    }

    public boolean ao() {
        return getBooleanFromAdObject("sanitize_webview", false);
    }

    public String ap() {
        String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    public boolean aq() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", false);
    }

    public u ar() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new u(jsonObjectFromAdObject, this.sdk);
        }
        return null;
    }

    public List<String> as() {
        return com.applovin.impl.sdk.e.c.a(getStringFromAdObject("wls", ""));
    }

    public List<String> at() {
        return com.applovin.impl.sdk.e.c.a(getStringFromAdObject("wlh", null));
    }

    public boolean au() {
        return getBooleanFromAdObject("tvv", false);
    }

    public Uri av() {
        String stringFromAdObject = getStringFromAdObject("mute_image", null);
        if (com.applovin.impl.sdk.e.i.b(stringFromAdObject)) {
            try {
                return Uri.parse(stringFromAdObject);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public Uri aw() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "");
        if (com.applovin.impl.sdk.e.i.b(stringFromAdObject)) {
            try {
                return Uri.parse(stringFromAdObject);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public void b(Uri uri) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("mute_image", uri);
            }
        } catch (Throwable unused) {
        }
    }

    public boolean b() {
        this.sdk.u().d("DirectAd", "Attempting to invoke isVideoStream() from base ad class");
        return false;
    }

    public void c(Uri uri) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("unmute_image", uri);
            }
        } catch (Throwable unused) {
        }
    }

    public Uri e() {
        this.sdk.u().d("DirectAd", "Attempting to invoke getVideoUri() from base ad class");
        return null;
    }

    public Uri g() {
        this.sdk.u().d("DirectAd", "Attempting to invoke getClickDestinationUri() from base ad class");
        return null;
    }

    public Uri h() {
        this.sdk.u().d("DirectAd", "Attempting to invoke getVideoClickDestinationUri() from base ad class");
        return null;
    }

    public b m() {
        String upperCase = getStringFromAdObject("ad_target", b.DEFAULT.toString()).toUpperCase(Locale.ENGLISH);
        return "ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase) ? b.ACTIVITY_PORTRAIT : "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? b.ACTIVITY_LANDSCAPE : b.DEFAULT;
    }

    public float n() {
        return getFloatFromAdObject("close_delay", 0.0f);
    }

    public float o() {
        return getFloatFromAdObject("close_delay_graphic", a(getType(), n(), hasVideoUrl()));
    }

    public g.a p() {
        int intFromAdObject = getIntFromAdObject("close_style", -1);
        return intFromAdObject == -1 ? b(hasVideoUrl()) : a(intFromAdObject);
    }

    public g.a q() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? p() : a(intFromAdObject);
    }

    public boolean r() {
        return getBooleanFromAdObject("dismiss_on_skip", false);
    }

    public boolean s() {
        return getBooleanFromAdObject("html_resources_cached", false);
    }

    public String t() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("video_button_properties", null);
        return jsonObjectFromAdObject != null ? com.applovin.impl.sdk.e.f.a(jsonObjectFromAdObject, "video_button_html", "", this.sdk) : "";
    }

    public q u() {
        return new q(getJsonObjectFromAdObject("video_button_properties", null), this.sdk);
    }

    public boolean v() {
        return getBooleanFromAdObject("video_clickable", false);
    }

    public boolean w() {
        return getBooleanFromAdObject("accelerate_hardware", false);
    }

    public boolean x() {
        return getBooleanFromAdObject("keep_screen_on", false);
    }

    public boolean y() {
        return getBooleanFromAdObject("hide_close_on_exit_graphic", false);
    }

    public boolean z() {
        return getBooleanFromAdObject("hide_close_on_exit", false);
    }
}
