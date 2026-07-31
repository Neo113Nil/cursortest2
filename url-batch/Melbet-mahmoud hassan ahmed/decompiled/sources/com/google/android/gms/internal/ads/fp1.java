package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fp1 {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f5168a;

    /* renamed from: b, reason: collision with root package name */
    private final tp1 f5169b;

    /* renamed from: c, reason: collision with root package name */
    private final yp1 f5170c;

    public fp1(dc3 dc3Var, tp1 tp1Var, yp1 yp1Var) {
        this.f5168a = dc3Var;
        this.f5169b = tp1Var;
        this.f5170c = yp1Var;
    }

    public final cc3<rm1> a(final ds2 ds2Var, final rr2 rr2Var, final JSONObject jSONObject) {
        JSONObject optJSONObject;
        cc3 n7;
        final cc3 E = this.f5168a.E(new Callable() { // from class: com.google.android.gms.internal.ads.dp1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ds2 ds2Var2 = ds2Var;
                rr2 rr2Var2 = rr2Var;
                JSONObject jSONObject2 = jSONObject;
                rm1 rm1Var = new rm1();
                rm1Var.v(jSONObject2.optInt("template_id", -1));
                rm1Var.i(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                rm1Var.s(optJSONObject2 != null ? optJSONObject2.optString("omid_partner_name") : null);
                ks2 ks2Var = ds2Var2.f4312a.f2953a;
                if (!ks2Var.f7621g.contains(Integer.toString(rm1Var.K()))) {
                    int K = rm1Var.K();
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("Invalid template ID: ");
                    sb.append(K);
                    throw new u82(1, sb.toString());
                }
                if (rm1Var.K() == 3) {
                    if (rm1Var.g0() == null) {
                        throw new u82(1, "No custom template id for custom template ad response.");
                    }
                    if (!ks2Var.f7622h.contains(rm1Var.g0())) {
                        throw new u82(1, "Unexpected custom template id in the response.");
                    }
                }
                rm1Var.t(jSONObject2.optDouble("rating", -1.0d));
                String optString = jSONObject2.optString("headline", null);
                if (rr2Var2.J) {
                    y2.t.q();
                    String d7 = a3.g2.d();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(d7).length() + 3 + String.valueOf(optString).length());
                    sb2.append(d7);
                    sb2.append(" : ");
                    sb2.append(optString);
                    optString = sb2.toString();
                }
                rm1Var.u("headline", optString);
                rm1Var.u("body", jSONObject2.optString("body", null));
                rm1Var.u("call_to_action", jSONObject2.optString("call_to_action", null));
                rm1Var.u("store", jSONObject2.optString("store", null));
                rm1Var.u("price", jSONObject2.optString("price", null));
                rm1Var.u("advertiser", jSONObject2.optString("advertiser", null));
                return rm1Var;
            }
        });
        final cc3<List<z30>> f7 = this.f5169b.f(jSONObject, "images");
        final cc3<eu0> g7 = this.f5169b.g(jSONObject, "images", rr2Var, ds2Var.f4313b.f3934b);
        final cc3<z30> e7 = this.f5169b.e(jSONObject, "secondary_image");
        final cc3<z30> e8 = this.f5169b.e(jSONObject, "app_icon");
        final cc3<w30> d7 = this.f5169b.d(jSONObject, "attribution");
        final cc3<eu0> h7 = this.f5169b.h(jSONObject, rr2Var, ds2Var.f4313b.f3934b);
        final tp1 tp1Var = this.f5169b;
        if (jSONObject.optBoolean("enable_omid") && (optJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String optString = optJSONObject.optString("omid_html");
            if (!TextUtils.isEmpty(optString)) {
                n7 = rb3.n(rb3.i(null), new xa3() { // from class: com.google.android.gms.internal.ads.op1
                    @Override // com.google.android.gms.internal.ads.xa3
                    public final cc3 c(Object obj) {
                        return tp1.this.c(optString, obj);
                    }
                }, wo0.f13898e);
                final cc3 cc3Var = n7;
                final cc3<List<xp1>> a7 = this.f5170c.a(jSONObject, "custom_assets");
                return rb3.b(E, f7, g7, e7, e8, d7, h7, cc3Var, a7).a(new Callable() { // from class: com.google.android.gms.internal.ads.ep1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        cc3 cc3Var2 = E;
                        cc3 cc3Var3 = f7;
                        cc3 cc3Var4 = e8;
                        cc3 cc3Var5 = e7;
                        cc3 cc3Var6 = d7;
                        JSONObject jSONObject2 = jSONObject;
                        cc3 cc3Var7 = h7;
                        cc3 cc3Var8 = g7;
                        cc3 cc3Var9 = cc3Var;
                        cc3 cc3Var10 = a7;
                        rm1 rm1Var = (rm1) cc3Var2.get();
                        rm1Var.n((List) cc3Var3.get());
                        rm1Var.k((n40) cc3Var4.get());
                        rm1Var.o((n40) cc3Var5.get());
                        rm1Var.h((g40) cc3Var6.get());
                        rm1Var.q(tp1.j(jSONObject2));
                        rm1Var.j(tp1.i(jSONObject2));
                        eu0 eu0Var = (eu0) cc3Var7.get();
                        if (eu0Var != null) {
                            rm1Var.y(eu0Var);
                            rm1Var.x(eu0Var.c0());
                            rm1Var.w(eu0Var.p());
                        }
                        eu0 eu0Var2 = (eu0) cc3Var8.get();
                        if (eu0Var2 != null) {
                            rm1Var.m(eu0Var2);
                            rm1Var.z(eu0Var2.c0());
                        }
                        eu0 eu0Var3 = (eu0) cc3Var9.get();
                        if (eu0Var3 != null) {
                            rm1Var.r(eu0Var3);
                        }
                        for (xp1 xp1Var : (List) cc3Var10.get()) {
                            if (xp1Var.f14298a != 1) {
                                rm1Var.l(xp1Var.f14299b, xp1Var.f14301d);
                            } else {
                                rm1Var.u(xp1Var.f14299b, xp1Var.f14300c);
                            }
                        }
                        return rm1Var;
                    }
                }, this.f5168a);
            }
        }
        n7 = rb3.i(null);
        final cc3 cc3Var2 = n7;
        final cc3 a72 = this.f5170c.a(jSONObject, "custom_assets");
        return rb3.b(E, f7, g7, e7, e8, d7, h7, cc3Var2, a72).a(new Callable() { // from class: com.google.android.gms.internal.ads.ep1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cc3 cc3Var22 = E;
                cc3 cc3Var3 = f7;
                cc3 cc3Var4 = e8;
                cc3 cc3Var5 = e7;
                cc3 cc3Var6 = d7;
                JSONObject jSONObject2 = jSONObject;
                cc3 cc3Var7 = h7;
                cc3 cc3Var8 = g7;
                cc3 cc3Var9 = cc3Var2;
                cc3 cc3Var10 = a72;
                rm1 rm1Var = (rm1) cc3Var22.get();
                rm1Var.n((List) cc3Var3.get());
                rm1Var.k((n40) cc3Var4.get());
                rm1Var.o((n40) cc3Var5.get());
                rm1Var.h((g40) cc3Var6.get());
                rm1Var.q(tp1.j(jSONObject2));
                rm1Var.j(tp1.i(jSONObject2));
                eu0 eu0Var = (eu0) cc3Var7.get();
                if (eu0Var != null) {
                    rm1Var.y(eu0Var);
                    rm1Var.x(eu0Var.c0());
                    rm1Var.w(eu0Var.p());
                }
                eu0 eu0Var2 = (eu0) cc3Var8.get();
                if (eu0Var2 != null) {
                    rm1Var.m(eu0Var2);
                    rm1Var.z(eu0Var2.c0());
                }
                eu0 eu0Var3 = (eu0) cc3Var9.get();
                if (eu0Var3 != null) {
                    rm1Var.r(eu0Var3);
                }
                for (xp1 xp1Var : (List) cc3Var10.get()) {
                    if (xp1Var.f14298a != 1) {
                        rm1Var.l(xp1Var.f14299b, xp1Var.f14301d);
                    } else {
                        rm1Var.u(xp1Var.f14299b, xp1Var.f14300c);
                    }
                }
                return rm1Var;
            }
        }, this.f5168a);
    }
}
