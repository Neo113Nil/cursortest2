package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class sq0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11918a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11919b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11920c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11921d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11922e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11923f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11924g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11925h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11926i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f11927j;

    /* renamed from: k, reason: collision with root package name */
    public final int f11928k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f11929l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f11930m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f11931n;

    public sq0(String str) {
        String string;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f11918a = a(jSONObject, "aggressive_media_codec_release", m10.D);
        this.f11919b = b(jSONObject, "byte_buffer_precache_limit", m10.f8224j);
        this.f11920c = b(jSONObject, "exo_cache_buffer_size", m10.f8288r);
        this.f11921d = b(jSONObject, "exo_connect_timeout_millis", m10.f8192f);
        e10<String> e10Var = m10.f8184e;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.f11922e = string;
            this.f11923f = b(jSONObject, "exo_read_timeout_millis", m10.f8200g);
            this.f11924g = b(jSONObject, "load_check_interval_bytes", m10.f8208h);
            this.f11925h = b(jSONObject, "player_precache_limit", m10.f8216i);
            this.f11926i = b(jSONObject, "socket_receive_buffer_size", m10.f8232k);
            this.f11927j = a(jSONObject, "use_cache_data_source", m10.O2);
            this.f11928k = b(jSONObject, "min_retry_count", m10.f8240l);
            this.f11929l = a(jSONObject, "treat_load_exception_as_non_fatal", m10.f8264o);
            this.f11930m = a(jSONObject, "using_official_simple_exo_player", m10.f8298s1);
            this.f11931n = a(jSONObject, "enable_multiple_video_playback", m10.f8306t1);
        }
        string = (String) sw.c().b(e10Var);
        this.f11922e = string;
        this.f11923f = b(jSONObject, "exo_read_timeout_millis", m10.f8200g);
        this.f11924g = b(jSONObject, "load_check_interval_bytes", m10.f8208h);
        this.f11925h = b(jSONObject, "player_precache_limit", m10.f8216i);
        this.f11926i = b(jSONObject, "socket_receive_buffer_size", m10.f8232k);
        this.f11927j = a(jSONObject, "use_cache_data_source", m10.O2);
        this.f11928k = b(jSONObject, "min_retry_count", m10.f8240l);
        this.f11929l = a(jSONObject, "treat_load_exception_as_non_fatal", m10.f8264o);
        this.f11930m = a(jSONObject, "using_official_simple_exo_player", m10.f8298s1);
        this.f11931n = a(jSONObject, "enable_multiple_video_playback", m10.f8306t1);
    }

    private static final boolean a(JSONObject jSONObject, String str, e10<Boolean> e10Var) {
        boolean booleanValue = ((Boolean) sw.c().b(e10Var)).booleanValue();
        if (jSONObject == null) {
            return booleanValue;
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            return booleanValue;
        }
    }

    private static final int b(JSONObject jSONObject, String str, e10<Integer> e10Var) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) sw.c().b(e10Var)).intValue();
    }
}
