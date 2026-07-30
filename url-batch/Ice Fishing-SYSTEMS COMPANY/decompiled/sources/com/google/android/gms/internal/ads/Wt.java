package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Wt {

    /* renamed from: a, reason: collision with root package name */
    public final List f28490a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28491b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28492c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28493d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28494e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28495f;

    /* renamed from: g, reason: collision with root package name */
    public final long f28496g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f28497h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final GE f28498j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f28499k;

    /* renamed from: l, reason: collision with root package name */
    public final String f28500l;

    /* renamed from: m, reason: collision with root package name */
    public final String f28501m;

    /* renamed from: n, reason: collision with root package name */
    public final String f28502n;

    /* renamed from: o, reason: collision with root package name */
    public final JSONObject f28503o;

    /* renamed from: p, reason: collision with root package name */
    public final JSONObject f28504p;

    /* renamed from: q, reason: collision with root package name */
    public final String f28505q;

    /* renamed from: r, reason: collision with root package name */
    public final int f28506r;

    /* renamed from: s, reason: collision with root package name */
    public final long f28507s;

    /* renamed from: t, reason: collision with root package name */
    public final long f28508t;

    public Wt(JsonReader jsonReader) {
        String str;
        Bundle w9;
        char c4;
        List list = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String str2 = "";
        String str3 = "";
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        GE ge = null;
        long j9 = -1;
        long j10 = 0;
        long j11 = -1;
        int i = 0;
        int i4 = -1;
        int i9 = 1;
        int i10 = 0;
        boolean z8 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (Objects.equals(nextName, "nofill_urls")) {
                list = p8.g.q(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if (Objects.equals(nextName, "refresh_load_delay_time_interval")) {
                i4 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str3 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str4 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z8 = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i10 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j10 = jsonReader.nextLong();
            } else {
                C3151ea c3151ea = AbstractC3368ia.w9;
                str = str2;
                q2.r rVar = q2.r.f40116e;
                long j12 = j9;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    GE ge2 = new GE();
                    jsonReader.beginObject();
                    String str10 = str;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        int hashCode = nextName2.hashCode();
                        if (hashCode != -1724546052) {
                            if (hashCode == 3059181 && nextName2.equals("code")) {
                                c4 = 0;
                            }
                            c4 = 65535;
                        } else {
                            if (nextName2.equals("description")) {
                                c4 = 1;
                            }
                            c4 = 65535;
                        }
                        if (c4 == 0) {
                            jsonReader.nextInt();
                        } else if (c4 != 1) {
                            jsonReader.skipValue();
                        } else {
                            str10 = jsonReader.nextString();
                        }
                    }
                    jsonReader.endObject();
                    ge2.f25128b = str10;
                    ge = ge2;
                } else if ("bidding_data".equals(nextName)) {
                    str5 = jsonReader.nextString();
                } else {
                    C3151ea c3151ea2 = AbstractC3368ia.Ob;
                    SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
                    if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue() && Objects.equals(nextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(nextName)) {
                        str9 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(nextName)) {
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31456H7)).booleanValue()) {
                            try {
                                Bundle w10 = p8.g.w(p8.g.r(jsonReader));
                                if (w10 != null) {
                                    bundle = w10;
                                }
                            } catch (IOException | JSONException unused) {
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.Da)).booleanValue()) {
                            str7 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (!"adRequestUrl".equals(nextName)) {
                        C3151ea c3151ea3 = AbstractC3368ia.Ea;
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea3)).booleanValue() && Objects.equals(nextName, "adResponseBody")) {
                            str8 = jsonReader.nextString();
                        } else if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea3)).booleanValue() && Objects.equals(nextName, "adResponseHeaders")) {
                            jSONObject = p8.g.r(jsonReader);
                        } else {
                            if (Objects.equals(nextName, "max_parallel_renderers")) {
                                i9 = Math.max(1, jsonReader.nextInt());
                            } else if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.Ma)).booleanValue() && Objects.equals(nextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = p8.g.r(jsonReader);
                            } else if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31476K2)).booleanValue() && Objects.equals(nextName, "latency_extras")) {
                                try {
                                    w9 = p8.g.w(p8.g.r(jsonReader));
                                } catch (IOException | JSONException unused3) {
                                } catch (IllegalStateException unused4) {
                                }
                                if (w9 != null) {
                                    double d2 = w9.getDouble(com.anythink.core.common.d.g.f12486a);
                                    long j13 = (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) ? -1L : (long) d2;
                                    try {
                                        double d3 = w9.getDouble(com.anythink.core.common.d.g.f12487b);
                                        long j14 = (d3 > 9.223372036854776E18d || d3 < -9.223372036854776E18d) ? -1L : (long) d3;
                                        j11 = j13;
                                        j9 = j14;
                                    } catch (IOException | JSONException unused5) {
                                        j11 = j13;
                                    } catch (IllegalStateException unused6) {
                                        j11 = j13;
                                        jsonReader.skipValue();
                                        j9 = j12;
                                        str2 = str;
                                    }
                                    str2 = str;
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            j9 = j12;
                            str2 = str;
                        }
                    } else if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.Da)).booleanValue()) {
                        str6 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    j9 = j12;
                    str2 = str;
                }
                j9 = j12;
                str2 = str;
            }
            str = str2;
            str2 = str;
        }
        long j15 = j9;
        jsonReader.endObject();
        this.f28490a = list;
        this.f28492c = i;
        if (((Boolean) AbstractC2751Ra.f27377e.r()).booleanValue()) {
            this.f28493d = -1;
        } else {
            C3398j5 c3398j5 = AbstractC2479Ba.f24048a;
            if (((Long) c3398j5.r()).longValue() > -1) {
                this.f28493d = ((Long) c3398j5.r()).intValue();
            } else {
                this.f28493d = i4;
            }
        }
        this.f28491b = str3;
        this.f28494e = str4;
        this.f28495f = i10;
        this.f28496g = j10;
        this.f28498j = ge;
        this.f28497h = z8;
        this.i = str5;
        this.f28499k = bundle;
        this.f28500l = str6;
        this.f28501m = str7;
        this.f28502n = str8;
        this.f28503o = jSONObject;
        this.f28504p = jSONObject2;
        this.f28505q = str9;
        C3398j5 c3398j52 = AbstractC2717Pa.f26968a;
        this.f28506r = ((Long) c3398j52.r()).longValue() > 0 ? ((Long) c3398j52.r()).intValue() : i9;
        this.f28507s = j11;
        this.f28508t = j15;
    }
}
