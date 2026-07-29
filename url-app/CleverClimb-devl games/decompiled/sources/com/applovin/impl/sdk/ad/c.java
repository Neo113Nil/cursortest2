package com.applovin.impl.sdk.ad;

import android.text.TextUtils;
import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f2960a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2961b;

    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");


        /* renamed from: d, reason: collision with root package name */
        private final String f2965d;

        a(String str) {
            this.f2965d = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f2965d;
        }
    }

    public c(String str, com.applovin.impl.sdk.j jVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f2961b = str;
        this.f2960a = jVar;
    }

    private String a(com.applovin.impl.sdk.b.b<String> bVar) {
        for (String str : this.f2960a.b(bVar)) {
            if (this.f2961b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }

    public String a() {
        return this.f2961b;
    }

    public a b() {
        return a(com.applovin.impl.sdk.b.b.aD) != null ? a.REGULAR : a(com.applovin.impl.sdk.b.b.aE) != null ? a.AD_RESPONSE_JSON : a.UNSPECIFIED;
    }

    public String c() {
        String a2 = a(com.applovin.impl.sdk.b.b.aD);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        String a3 = a(com.applovin.impl.sdk.b.b.aE);
        if (TextUtils.isEmpty(a3)) {
            return null;
        }
        return a3;
    }

    public JSONObject d() {
        if (b() != a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f2961b.substring(c().length()), 0), "UTF-8"));
                this.f2960a.u().a("AdToken", "Decoded token into ad response: " + jSONObject);
                return jSONObject;
            } catch (JSONException e) {
                this.f2960a.u().b("AdToken", "Unable to decode token '" + this.f2961b + "' into JSON", e);
                return null;
            }
        } catch (Throwable th) {
            this.f2960a.u().b("AdToken", "Unable to process ad response from token '" + this.f2961b + "'", th);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2961b != null ? this.f2961b.equals(cVar.f2961b) : cVar.f2961b == null;
    }

    public int hashCode() {
        if (this.f2961b != null) {
            return this.f2961b.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AdToken{id=" + com.applovin.impl.sdk.e.i.a(32, this.f2961b) + ", type=" + b() + '}';
    }
}
