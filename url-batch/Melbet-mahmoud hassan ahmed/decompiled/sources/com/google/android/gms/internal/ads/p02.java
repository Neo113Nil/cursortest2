package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p02 {

    /* renamed from: a, reason: collision with root package name */
    private final bw0 f9965a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f9966b;

    /* renamed from: c, reason: collision with root package name */
    private final po0 f9967c;

    /* renamed from: d, reason: collision with root package name */
    private final ks2 f9968d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f9969e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9970f;

    /* renamed from: g, reason: collision with root package name */
    private final rd1 f9971g;

    /* renamed from: h, reason: collision with root package name */
    private final vd1 f9972h;

    public p02(bw0 bw0Var, Context context, po0 po0Var, ks2 ks2Var, Executor executor, String str, rd1 rd1Var, vd1 vd1Var) {
        this.f9965a = bw0Var;
        this.f9966b = context;
        this.f9967c = po0Var;
        this.f9968d = ks2Var;
        this.f9969e = executor;
        this.f9970f = str;
        this.f9971g = rd1Var;
        this.f9972h = vd1Var;
    }

    private final cc3<ds2> e(final String str, final String str2) {
        cc0 a7 = y2.t.g().a(this.f9966b, this.f9967c);
        wb0<JSONObject> wb0Var = zb0.f15062b;
        final rb0 a8 = a7.a("google.afma.response.normalize", wb0Var, wb0Var);
        cc3<ds2> n7 = rb3.n(rb3.n(rb3.n(rb3.i(""), new xa3() { // from class: com.google.android.gms.internal.ads.n02
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                String str3 = str;
                String str4 = str2;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return rb3.i(jSONObject);
                } catch (JSONException e7) {
                    String valueOf = String.valueOf(e7.getMessage());
                    throw new JSONException(valueOf.length() != 0 ? "Preloaded loader: ".concat(valueOf) : new String("Preloaded loader: "));
                }
            }
        }, this.f9969e), new xa3() { // from class: com.google.android.gms.internal.ads.l02
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return rb0.this.a((JSONObject) obj);
            }
        }, this.f9969e), new xa3() { // from class: com.google.android.gms.internal.ads.m02
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return p02.this.d((JSONObject) obj);
            }
        }, this.f9969e);
        if (((Boolean) sw.c().b(m10.f8302s5)).booleanValue()) {
            rb3.r(n7, new o02(this), wo0.f13899f);
        }
        return n7;
    }

    private final String f(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f9970f));
            }
            return jSONObject.toString();
        } catch (JSONException e7) {
            io0.g("Failed to update the ad types for rendering. ".concat(e7.toString()));
            return str;
        }
    }

    private static final String g(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    public final cc3<ds2> c() {
        String str = this.f9968d.f7618d.C;
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) sw.c().b(m10.f8278p5)).booleanValue()) {
                String g7 = g(str);
                if (TextUtils.isEmpty(g7)) {
                    if (((Boolean) sw.c().b(m10.f8302s5)).booleanValue()) {
                        this.f9972h.h(true);
                    }
                    return rb3.h(new u82(15, "Invalid ad string."));
                }
                String b7 = this.f9965a.u().b(g7);
                if (!TextUtils.isEmpty(b7)) {
                    return e(str, f(b7));
                }
            }
        }
        av avVar = this.f9968d.f7618d.f7661x;
        if (avVar != null) {
            if (((Boolean) sw.c().b(m10.f8262n5)).booleanValue()) {
                String g8 = g(avVar.f2980f);
                String g9 = g(avVar.f2981g);
                if (!TextUtils.isEmpty(g9) && g8.equals(g9)) {
                    this.f9965a.u().d(g8);
                }
            }
            return e(avVar.f2980f, f(avVar.f2981g));
        }
        if (((Boolean) sw.c().b(m10.f8302s5)).booleanValue()) {
            this.f9972h.h(true);
        }
        return rb3.h(new u82(14, "Mismatch request IDs."));
    }

    final /* synthetic */ cc3 d(JSONObject jSONObject) {
        return rb3.i(new ds2(new as2(this.f9968d), cs2.a(new StringReader(jSONObject.toString()))));
    }
}
