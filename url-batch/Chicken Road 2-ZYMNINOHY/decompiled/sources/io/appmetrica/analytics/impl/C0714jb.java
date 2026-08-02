package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.jb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0714jb {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f12117a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12118b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12119c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f12120d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12121e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f12122f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12123g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12124h;

    /* renamed from: i, reason: collision with root package name */
    public final CounterConfigurationReporterType f12125i;

    /* renamed from: j, reason: collision with root package name */
    public final String f12126j;

    public C0714jb(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f12117a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f12118b = jSONObject2.getString("name");
        this.f12119c = jSONObject2.getInt("bytes_truncated");
        this.f12126j = JsonUtils.optStringOrNull(jSONObject2, "environment");
        String optString = jSONObject2.optString("trimmed_fields");
        this.f12120d = new HashMap();
        if (optString != null) {
            try {
                HashMap c4 = AbstractC0637gb.c(optString);
                if (c4 != null) {
                    for (Map.Entry entry : c4.entrySet()) {
                        this.f12120d.put(L3.valueOf((String) entry.getKey()), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f12121e = jSONObject3.getString("package_name");
        this.f12122f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f12123g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f12124h = jSONObject4.getString("api_key");
        this.f12125i = a(jSONObject4);
    }

    public final String a() {
        return this.f12124h;
    }

    public final int b() {
        return this.f12119c;
    }

    public final byte[] c() {
        return this.f12117a;
    }

    public final String d() {
        return this.f12126j;
    }

    public final String e() {
        return this.f12118b;
    }

    public final String f() {
        return this.f12121e;
    }

    public final Integer g() {
        return this.f12122f;
    }

    public final String h() {
        return this.f12123g;
    }

    public final CounterConfigurationReporterType i() {
        return this.f12125i;
    }

    public final HashMap<L3, Integer> j() {
        return this.f12120d;
    }

    public final String k() throws JSONException {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f12120d.entrySet()) {
            hashMap.put(((L3) entry.getKey()).name(), (Integer) entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f12122f).put("psid", this.f12123g).put("package_name", this.f12121e)).put("reporter_configuration", new JSONObject().put("api_key", this.f12124h).put("reporter_type", this.f12125i.getStringValue())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f12117a, 0)).put("name", this.f12118b).put("bytes_truncated", this.f12119c).put("trimmed_fields", AbstractC0637gb.b(hashMap)).putOpt("environment", this.f12126j)).toString();
    }

    public static CounterConfigurationReporterType a(JSONObject jSONObject) {
        return jSONObject.has("reporter_type") ? CounterConfigurationReporterType.fromStringValue(jSONObject.getString("reporter_type")) : CounterConfigurationReporterType.MAIN;
    }

    public C0714jb(P5 p5, H3 h32, HashMap<L3, Integer> hashMap) {
        this.f12117a = p5.getValueBytes();
        this.f12118b = p5.getName();
        this.f12119c = p5.getBytesTruncated();
        if (hashMap != null) {
            this.f12120d = hashMap;
        } else {
            this.f12120d = new HashMap();
        }
        Bf a3 = h32.a();
        this.f12121e = a3.e();
        this.f12122f = a3.f();
        this.f12123g = a3.g();
        CounterConfiguration b4 = h32.b();
        this.f12124h = b4.getApiKey();
        this.f12125i = b4.getReporterType();
        this.f12126j = p5.f();
    }
}
