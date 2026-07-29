package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private String f3343a;

    /* renamed from: b, reason: collision with root package name */
    private String f3344b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f3345c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f3346d;
    private boolean e;
    private int f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f3347a;

        /* renamed from: b, reason: collision with root package name */
        private String f3348b;

        /* renamed from: c, reason: collision with root package name */
        private Map<String, String> f3349c;

        /* renamed from: d, reason: collision with root package name */
        private Map<String, String> f3350d;
        private boolean e;

        public a a(String str) {
            this.f3347a = str;
            return this;
        }

        public a a(Map<String, String> map) {
            this.f3349c = map;
            return this;
        }

        public a a(boolean z) {
            this.e = z;
            return this;
        }

        public e a() {
            return new e(this);
        }

        public a b(String str) {
            this.f3348b = str;
            return this;
        }

        public a b(Map<String, String> map) {
            this.f3350d = map;
            return this;
        }
    }

    private e(a aVar) {
        this.f3343a = aVar.f3347a;
        this.f3344b = aVar.f3348b;
        this.f3345c = aVar.f3349c;
        this.f3346d = aVar.f3350d;
        this.e = aVar.e;
        this.f = 0;
    }

    e(JSONObject jSONObject, j jVar) throws Exception {
        String string;
        Map<String, String> a2;
        String string2 = jSONObject.getString("targetUrl");
        int i = jSONObject.getInt("attemptNumber");
        Map<String, String> a3 = com.applovin.impl.sdk.e.f.a(jSONObject, "parameters") ? com.applovin.impl.sdk.e.f.a(jSONObject.getJSONObject("parameters")) : Collections.EMPTY_MAP;
        if (((Boolean) jVar.a(com.applovin.impl.sdk.b.b.dF)).booleanValue()) {
            string = com.applovin.impl.sdk.e.f.a(jSONObject, "backupUrl", "", jVar);
            if (!com.applovin.impl.sdk.e.f.a(jSONObject, "requestBody")) {
                a2 = Collections.EMPTY_MAP;
                this.f3343a = string2;
                this.f3344b = string;
                this.f3345c = a3;
                this.f3346d = a2;
                this.e = jSONObject.optBoolean("isEncodingEnabled", false);
                this.f = i;
            }
        } else {
            string = jSONObject.getString("backupUrl");
        }
        a2 = com.applovin.impl.sdk.e.f.a(jSONObject.getJSONObject("requestBody"));
        this.f3343a = string2;
        this.f3344b = string;
        this.f3345c = a3;
        this.f3346d = a2;
        this.e = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f = i;
    }

    public static a j() {
        return new a();
    }

    String a() {
        return this.f3343a;
    }

    String b() {
        return this.f3344b;
    }

    Map<String, String> c() {
        return this.f3346d;
    }

    Map<String, String> d() {
        return this.f3345c;
    }

    boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f3343a == null ? eVar.f3343a != null : !this.f3343a.equals(eVar.f3343a)) {
            return false;
        }
        if (this.f3344b == null ? eVar.f3344b != null : !this.f3344b.equals(eVar.f3344b)) {
            return false;
        }
        if (this.f3345c == null ? eVar.f3345c != null : !this.f3345c.equals(eVar.f3345c)) {
            return false;
        }
        if (this.f3346d == null ? eVar.f3346d == null : this.f3346d.equals(eVar.f3346d)) {
            return this.f == eVar.f && this.e == eVar.e;
        }
        return false;
    }

    int f() {
        return this.f;
    }

    void g() {
        this.f++;
    }

    void h() {
        HashMap hashMap = new HashMap();
        if (this.f3345c != null) {
            hashMap.putAll(this.f3345c);
        }
        hashMap.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f3345c = hashMap;
    }

    public int hashCode() {
        return ((((((((this.f * 31) + (this.f3343a != null ? this.f3343a.hashCode() : 0)) * 31) + (this.f3344b != null ? this.f3344b.hashCode() : 0)) * 31) + (this.f3345c != null ? this.f3345c.hashCode() : 0)) * 31) + (this.f3346d != null ? this.f3346d.hashCode() : 0) + (this.e ? 1 : 0)) * 31;
    }

    JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("targetUrl", this.f3343a);
        jSONObject.put("backupUrl", this.f3344b);
        jSONObject.put("isEncodingEnabled", this.e);
        jSONObject.put("attemptNumber", this.f);
        if (this.f3345c != null) {
            jSONObject.put("parameters", new JSONObject(this.f3345c));
        }
        if (this.f3346d != null) {
            jSONObject.put("requestBody", new JSONObject(this.f3346d));
        }
        return jSONObject;
    }

    public String toString() {
        return "PostbackRequest{targetUrl='" + this.f3343a + "', backupUrl='" + this.f3344b + "', parameters='" + this.f3345c + "', requestBody=" + this.f3346d + ", attemptNumber=" + this.f + ", isEncodingEnabled=" + this.e + '}';
    }
}
