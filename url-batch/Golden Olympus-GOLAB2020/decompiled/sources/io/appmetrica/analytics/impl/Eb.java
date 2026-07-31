package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.ironsource.b9;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Eb {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f37429a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37430b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37431c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f37432d;

    /* renamed from: e, reason: collision with root package name */
    public final String f37433e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f37434f;

    /* renamed from: g, reason: collision with root package name */
    public final String f37435g;

    /* renamed from: h, reason: collision with root package name */
    public final String f37436h;

    /* renamed from: i, reason: collision with root package name */
    public final CounterConfigurationReporterType f37437i;

    /* renamed from: j, reason: collision with root package name */
    public final String f37438j;

    public Eb(@NonNull String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f37429a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f37430b = jSONObject2.getString("name");
        this.f37431c = jSONObject2.getInt("bytes_truncated");
        this.f37438j = JsonUtils.optStringOrNull(jSONObject2, "environment");
        String optString = jSONObject2.optString("trimmed_fields");
        this.f37432d = new HashMap();
        if (optString != null) {
            try {
                HashMap c4 = Bb.c(optString);
                if (c4 != null) {
                    for (Map.Entry entry : c4.entrySet()) {
                        this.f37432d.put(EnumC2668h4.valueOf((String) entry.getKey()), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f37433e = jSONObject3.getString(b9.h.f15462V);
        this.f37434f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f37435g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f37436h = jSONObject4.getString("api_key");
        this.f37437i = a(jSONObject4);
    }

    public final String a() {
        return this.f37436h;
    }

    public final int b() {
        return this.f37431c;
    }

    public final byte[] c() {
        return this.f37429a;
    }

    public final String d() {
        return this.f37438j;
    }

    public final String e() {
        return this.f37430b;
    }

    public final String f() {
        return this.f37433e;
    }

    public final Integer g() {
        return this.f37434f;
    }

    public final String h() {
        return this.f37435g;
    }

    @NonNull
    public final CounterConfigurationReporterType i() {
        return this.f37437i;
    }

    @NonNull
    public final HashMap<EnumC2668h4, Integer> j() {
        return this.f37432d;
    }

    public final String k() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f37432d.entrySet()) {
            hashMap.put(((EnumC2668h4) entry.getKey()).name(), (Integer) entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f37434f).put("psid", this.f37435g).put(b9.h.f15462V, this.f37433e)).put("reporter_configuration", new JSONObject().put("api_key", this.f37436h).put("reporter_type", this.f37437i.getStringValue())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f37429a, 0)).put("name", this.f37430b).put("bytes_truncated", this.f37431c).put("trimmed_fields", Bb.b(hashMap)).putOpt("environment", this.f37438j)).toString();
    }

    public static CounterConfigurationReporterType a(JSONObject jSONObject) {
        return jSONObject.has("reporter_type") ? CounterConfigurationReporterType.fromStringValue(jSONObject.getString("reporter_type")) : CounterConfigurationReporterType.MAIN;
    }

    public Eb(@NonNull C2773l6 c2773l6, @NonNull C2562d4 c2562d4, HashMap<EnumC2668h4, Integer> hashMap) {
        this.f37429a = c2773l6.getValueBytes();
        this.f37430b = c2773l6.getName();
        this.f37431c = c2773l6.getBytesTruncated();
        if (hashMap != null) {
            this.f37432d = hashMap;
        } else {
            this.f37432d = new HashMap();
        }
        Pf a4 = c2562d4.a();
        this.f37433e = a4.e();
        this.f37434f = a4.f();
        this.f37435g = a4.g();
        CounterConfiguration b4 = c2562d4.b();
        this.f37436h = b4.getApiKey();
        this.f37437i = b4.getReporterType();
        this.f37438j = c2773l6.f();
    }
}
