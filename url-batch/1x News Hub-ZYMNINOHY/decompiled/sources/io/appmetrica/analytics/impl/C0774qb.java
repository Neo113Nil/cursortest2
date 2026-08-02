package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.qb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0774qb {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8150a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8151b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8152c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f8153d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8154e;
    public final Integer f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8155g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8156h;

    /* renamed from: i, reason: collision with root package name */
    public final CounterConfigurationReporterType f8157i;

    /* renamed from: j, reason: collision with root package name */
    public final String f8158j;

    public C0774qb(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f8150a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f8151b = jSONObject2.getString("name");
        this.f8152c = jSONObject2.getInt("bytes_truncated");
        this.f8158j = JsonUtils.optStringOrNull(jSONObject2, "environment");
        String optString = jSONObject2.optString("trimmed_fields");
        this.f8153d = new HashMap();
        if (optString != null) {
            try {
                HashMap c3 = AbstractC0696nb.c(optString);
                if (c3 != null) {
                    for (Map.Entry entry : c3.entrySet()) {
                        this.f8153d.put(T3.valueOf((String) entry.getKey()), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f8154e = jSONObject3.getString("package_name");
        this.f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f8155g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f8156h = jSONObject4.getString("api_key");
        this.f8157i = a(jSONObject4);
    }

    public final String a() {
        return this.f8156h;
    }

    public final int b() {
        return this.f8152c;
    }

    public final byte[] c() {
        return this.f8150a;
    }

    public final String d() {
        return this.f8158j;
    }

    public final String e() {
        return this.f8151b;
    }

    public final String f() {
        return this.f8154e;
    }

    public final Integer g() {
        return this.f;
    }

    public final String h() {
        return this.f8155g;
    }

    public final CounterConfigurationReporterType i() {
        return this.f8157i;
    }

    public final HashMap<T3, Integer> j() {
        return this.f8153d;
    }

    public final String k() throws JSONException {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f8153d.entrySet()) {
            hashMap.put(((T3) entry.getKey()).name(), (Integer) entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f).put("psid", this.f8155g).put("package_name", this.f8154e)).put("reporter_configuration", new JSONObject().put("api_key", this.f8156h).put("reporter_type", this.f8157i.getStringValue())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f8150a, 0)).put("name", this.f8151b).put("bytes_truncated", this.f8152c).put("trimmed_fields", AbstractC0696nb.b(hashMap)).putOpt("environment", this.f8158j)).toString();
    }

    public static CounterConfigurationReporterType a(JSONObject jSONObject) {
        return jSONObject.has("reporter_type") ? CounterConfigurationReporterType.fromStringValue(jSONObject.getString("reporter_type")) : CounterConfigurationReporterType.MAIN;
    }

    public C0774qb(W5 w5, P3 p3, HashMap<T3, Integer> hashMap) {
        this.f8150a = w5.getValueBytes();
        this.f8151b = w5.getName();
        this.f8152c = w5.getBytesTruncated();
        if (hashMap != null) {
            this.f8153d = hashMap;
        } else {
            this.f8153d = new HashMap();
        }
        Gf a3 = p3.a();
        this.f8154e = a3.e();
        this.f = a3.f();
        this.f8155g = a3.g();
        CounterConfiguration b3 = p3.b();
        this.f8156h = b3.getApiKey();
        this.f8157i = b3.getReporterType();
        this.f8158j = w5.f();
    }
}
