package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.yg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4235yg {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f35363a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35364b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35365c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35366d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35367e;

    /* renamed from: f, reason: collision with root package name */
    public final int f35368f;

    /* renamed from: g, reason: collision with root package name */
    public final int f35369g;

    /* renamed from: h, reason: collision with root package name */
    public final int f35370h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f35371j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f35372k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f35373l;

    /* renamed from: m, reason: collision with root package name */
    public final long f35374m;

    /* renamed from: n, reason: collision with root package name */
    public final long f35375n;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4235yg(String str) {
        long j9;
        long j10;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f35363a = a(jSONObject, "aggressive_media_codec_release", AbstractC3368ia.f31780s0);
        this.f35364b = b(jSONObject, "byte_buffer_precache_limit", AbstractC3368ia.f31733n);
        this.f35365c = b(jSONObject, "exo_cache_buffer_size", AbstractC3368ia.f31391A);
        this.f35366d = b(jSONObject, "exo_connect_timeout_millis", AbstractC3368ia.f31696j);
        C3151ea c3151ea = AbstractC3368ia.i;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.f35367e = b(jSONObject, "exo_read_timeout_millis", AbstractC3368ia.f31706k);
            this.f35368f = b(jSONObject, "load_check_interval_bytes", AbstractC3368ia.f31715l);
            this.f35369g = b(jSONObject, "player_precache_limit", AbstractC3368ia.f31725m);
            this.f35370h = b(jSONObject, "socket_receive_buffer_size", AbstractC3368ia.f31742o);
            this.i = a(jSONObject, "use_cache_data_source", AbstractC3368ia.f31692i5);
            b(jSONObject, "min_retry_count", AbstractC3368ia.f31752p);
            this.f35371j = a(jSONObject, "treat_load_exception_as_non_fatal", AbstractC3368ia.f31769r);
            this.f35372k = a(jSONObject, "enable_multiple_video_playback", AbstractC3368ia.f31837y2);
            this.f35373l = a(jSONObject, "use_range_http_data_source", AbstractC3368ia.f31394A2);
            C3151ea c3151ea2 = AbstractC3368ia.f31403B2;
            if (jSONObject != null) {
                try {
                    j9 = jSONObject.getLong("range_http_data_source_high_water_mark");
                } catch (JSONException unused3) {
                }
                this.f35374m = j9;
                C3151ea c3151ea3 = AbstractC3368ia.f31411C2;
                if (jSONObject != null) {
                    try {
                        j10 = jSONObject.getLong("range_http_data_source_low_water_mark");
                    } catch (JSONException unused4) {
                    }
                    this.f35375n = j10;
                }
                j10 = ((Long) q2.r.f40116e.f40119c.a(c3151ea3)).longValue();
                this.f35375n = j10;
            }
            j9 = ((Long) q2.r.f40116e.f40119c.a(c3151ea2)).longValue();
            this.f35374m = j9;
            C3151ea c3151ea32 = AbstractC3368ia.f31411C2;
            if (jSONObject != null) {
            }
            j10 = ((Long) q2.r.f40116e.f40119c.a(c3151ea32)).longValue();
            this.f35375n = j10;
        }
        this.f35367e = b(jSONObject, "exo_read_timeout_millis", AbstractC3368ia.f31706k);
        this.f35368f = b(jSONObject, "load_check_interval_bytes", AbstractC3368ia.f31715l);
        this.f35369g = b(jSONObject, "player_precache_limit", AbstractC3368ia.f31725m);
        this.f35370h = b(jSONObject, "socket_receive_buffer_size", AbstractC3368ia.f31742o);
        this.i = a(jSONObject, "use_cache_data_source", AbstractC3368ia.f31692i5);
        b(jSONObject, "min_retry_count", AbstractC3368ia.f31752p);
        this.f35371j = a(jSONObject, "treat_load_exception_as_non_fatal", AbstractC3368ia.f31769r);
        this.f35372k = a(jSONObject, "enable_multiple_video_playback", AbstractC3368ia.f31837y2);
        this.f35373l = a(jSONObject, "use_range_http_data_source", AbstractC3368ia.f31394A2);
        C3151ea c3151ea22 = AbstractC3368ia.f31403B2;
        if (jSONObject != null) {
        }
        j9 = ((Long) q2.r.f40116e.f40119c.a(c3151ea22)).longValue();
        this.f35374m = j9;
        C3151ea c3151ea322 = AbstractC3368ia.f31411C2;
        if (jSONObject != null) {
        }
        j10 = ((Long) q2.r.f40116e.f40119c.a(c3151ea322)).longValue();
        this.f35375n = j10;
    }

    public static final boolean a(JSONObject jSONObject, String str, C3151ea c3151ea) {
        boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(c3151ea)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return booleanValue;
    }

    public static final int b(JSONObject jSONObject, String str, C3151ea c3151ea) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) q2.r.f40116e.f40119c.a(c3151ea)).intValue();
    }
}
