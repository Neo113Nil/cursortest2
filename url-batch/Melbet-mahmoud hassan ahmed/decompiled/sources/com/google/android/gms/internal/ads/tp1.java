package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class tp1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12297a;

    /* renamed from: b, reason: collision with root package name */
    private final bp1 f12298b;

    /* renamed from: c, reason: collision with root package name */
    private final gb f12299c;

    /* renamed from: d, reason: collision with root package name */
    private final po0 f12300d;

    /* renamed from: e, reason: collision with root package name */
    private final y2.a f12301e;

    /* renamed from: f, reason: collision with root package name */
    private final ar f12302f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f12303g;

    /* renamed from: h, reason: collision with root package name */
    private final b40 f12304h;

    /* renamed from: i, reason: collision with root package name */
    private final lq1 f12305i;

    /* renamed from: j, reason: collision with root package name */
    private final et1 f12306j;

    /* renamed from: k, reason: collision with root package name */
    private final ScheduledExecutorService f12307k;

    /* renamed from: l, reason: collision with root package name */
    private final yr1 f12308l;

    /* renamed from: m, reason: collision with root package name */
    private final wv1 f12309m;

    /* renamed from: n, reason: collision with root package name */
    private final xw2 f12310n;

    /* renamed from: o, reason: collision with root package name */
    private final cy2 f12311o;

    /* renamed from: p, reason: collision with root package name */
    private final o42 f12312p;

    public tp1(Context context, bp1 bp1Var, gb gbVar, po0 po0Var, y2.a aVar, ar arVar, Executor executor, ks2 ks2Var, lq1 lq1Var, et1 et1Var, ScheduledExecutorService scheduledExecutorService, wv1 wv1Var, xw2 xw2Var, cy2 cy2Var, o42 o42Var, yr1 yr1Var) {
        this.f12297a = context;
        this.f12298b = bp1Var;
        this.f12299c = gbVar;
        this.f12300d = po0Var;
        this.f12301e = aVar;
        this.f12302f = arVar;
        this.f12303g = executor;
        this.f12304h = ks2Var.f7623i;
        this.f12305i = lq1Var;
        this.f12306j = et1Var;
        this.f12307k = scheduledExecutorService;
        this.f12309m = wv1Var;
        this.f12310n = xw2Var;
        this.f12311o = cy2Var;
        this.f12312p = o42Var;
        this.f12308l = yr1Var;
    }

    public static final wz i(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return r(optJSONObject);
    }

    public static final List<wz> j(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return e73.w();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return e73.w();
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
            wz r7 = r(optJSONArray.optJSONObject(i7));
            if (r7 != null) {
                arrayList.add(r7);
            }
        }
        return e73.u(arrayList);
    }

    private final pv k(int i7, int i8) {
        if (i7 == 0) {
            if (i8 == 0) {
                return pv.h();
            }
            i7 = 0;
        }
        return new pv(this.f12297a, new r2.h(i7, i8));
    }

    private static <T> cc3<T> l(cc3<T> cc3Var, T t6) {
        final Object obj = null;
        return rb3.g(cc3Var, Exception.class, new xa3(obj) { // from class: com.google.android.gms.internal.ads.ip1
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj2) {
                a3.r1.l("Error during loading assets.", (Exception) obj2);
                return rb3.i(null);
            }
        }, wo0.f13899f);
    }

    private static <T> cc3<T> m(boolean z6, final cc3<T> cc3Var, T t6) {
        return z6 ? rb3.n(cc3Var, new xa3() { // from class: com.google.android.gms.internal.ads.pp1
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return obj != null ? cc3.this : rb3.h(new u82(1, "Retrieve required value in native ad response failed."));
            }
        }, wo0.f13899f) : l(cc3Var, null);
    }

    private final cc3<z30> n(JSONObject jSONObject, boolean z6) {
        if (jSONObject == null) {
            return rb3.i(null);
        }
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return rb3.i(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z6) {
            return rb3.i(new z30(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return m(jSONObject.optBoolean("require"), rb3.m(this.f12298b.b(optString, optDouble, optBoolean), new e43() { // from class: com.google.android.gms.internal.ads.lp1
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                String str = optString;
                return new z30(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), optDouble, optInt, optInt2);
            }
        }, this.f12303g), null);
    }

    private final cc3<List<z30>> o(JSONArray jSONArray, boolean z6, boolean z7) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return rb3.i(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z7 ? jSONArray.length() : 1;
        for (int i7 = 0; i7 < length; i7++) {
            arrayList.add(n(jSONArray.optJSONObject(i7), z6));
        }
        return rb3.m(rb3.e(arrayList), new e43() { // from class: com.google.android.gms.internal.ads.mp1
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (z30 z30Var : (List) obj) {
                    if (z30Var != null) {
                        arrayList2.add(z30Var);
                    }
                }
                return arrayList2;
            }
        }, this.f12303g);
    }

    private final cc3<eu0> p(JSONObject jSONObject, rr2 rr2Var, ur2 ur2Var) {
        final cc3<eu0> b7 = this.f12305i.b(jSONObject.optString("base_url"), jSONObject.optString("html"), rr2Var, ur2Var, k(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return rb3.n(b7, new xa3() { // from class: com.google.android.gms.internal.ads.sp1
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                cc3 cc3Var = cc3.this;
                eu0 eu0Var = (eu0) obj;
                if (eu0Var == null || eu0Var.p() == null) {
                    throw new u82(1, "Retrieve video view in html5 ad response failed.");
                }
                return cc3Var;
            }
        }, wo0.f13899f);
    }

    private static Integer q(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final wz r(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new wz(optString, optString2);
    }

    final /* synthetic */ w30 a(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer q7 = q(jSONObject, "bg_color");
        Integer q8 = q(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new w30(optString, list, q7, q8, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.f12304h.f3206j, optBoolean);
    }

    final /* synthetic */ cc3 b(pv pvVar, rr2 rr2Var, ur2 ur2Var, String str, String str2, Object obj) {
        eu0 a7 = this.f12306j.a(pvVar, rr2Var, ur2Var);
        final ap0 g7 = ap0.g(a7);
        vr1 b7 = this.f12308l.b();
        a7.E0().V(b7, b7, b7, b7, b7, false, null, new y2.b(this.f12297a, null, null), null, null, this.f12312p, this.f12311o, this.f12309m, this.f12310n, null, b7);
        if (((Boolean) sw.c().b(m10.f8291r2)).booleanValue()) {
            a7.G0("/getNativeAdViewSignals", s70.f11711s);
        }
        a7.G0("/getNativeClickMeta", s70.f11712t);
        a7.E0().f1(new rv0() { // from class: com.google.android.gms.internal.ads.hp1
            @Override // com.google.android.gms.internal.ads.rv0
            public final void c(boolean z6) {
                ap0 ap0Var = ap0.this;
                if (z6) {
                    ap0Var.h();
                } else {
                    ap0Var.f(new u82(1, "Image Web View failed to load."));
                }
            }
        });
        a7.S(str, str2, null);
        return g7;
    }

    final /* synthetic */ cc3 c(String str, Object obj) {
        y2.t.A();
        eu0 a7 = ru0.a(this.f12297a, vv0.a(), "native-omid", false, false, this.f12299c, null, this.f12300d, null, null, this.f12301e, this.f12302f, null, null);
        final ap0 g7 = ap0.g(a7);
        a7.E0().f1(new rv0() { // from class: com.google.android.gms.internal.ads.jp1
            @Override // com.google.android.gms.internal.ads.rv0
            public final void c(boolean z6) {
                ap0.this.h();
            }
        });
        if (((Boolean) sw.c().b(m10.E3)).booleanValue()) {
            a7.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            a7.loadData(str, "text/html", "UTF-8");
        }
        return g7;
    }

    public final cc3<w30> d(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return rb3.i(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return m(optJSONObject.optBoolean("require"), rb3.m(o(optJSONArray, false, true), new e43() { // from class: com.google.android.gms.internal.ads.kp1
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                return tp1.this.a(optJSONObject, (List) obj);
            }
        }, this.f12303g), null);
    }

    public final cc3<z30> e(JSONObject jSONObject, String str) {
        return n(jSONObject.optJSONObject(str), this.f12304h.f3203g);
    }

    public final cc3<List<z30>> f(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        b40 b40Var = this.f12304h;
        return o(optJSONArray, b40Var.f3203g, b40Var.f3205i);
    }

    public final cc3<eu0> g(JSONObject jSONObject, String str, final rr2 rr2Var, final ur2 ur2Var) {
        if (!((Boolean) sw.c().b(m10.Z6)).booleanValue()) {
            return rb3.i(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return rb3.i(null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return rb3.i(null);
        }
        final String optString = optJSONObject.optString("base_url");
        final String optString2 = optJSONObject.optString("html");
        final pv k7 = k(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(optString2)) {
            return rb3.i(null);
        }
        final cc3 n7 = rb3.n(rb3.i(null), new xa3() { // from class: com.google.android.gms.internal.ads.np1
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return tp1.this.b(k7, rr2Var, ur2Var, optString, optString2, obj);
            }
        }, wo0.f13898e);
        return rb3.n(n7, new xa3() { // from class: com.google.android.gms.internal.ads.qp1
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                cc3 cc3Var = cc3.this;
                if (((eu0) obj) != null) {
                    return cc3Var;
                }
                throw new u82(1, "Retrieve Web View from image ad response failed.");
            }
        }, wo0.f13899f);
    }

    public final cc3<eu0> h(JSONObject jSONObject, rr2 rr2Var, ur2 ur2Var) {
        cc3<eu0> a7;
        JSONObject g7 = a3.a1.g(jSONObject, "html_containers", "instream");
        if (g7 != null) {
            return p(g7, rr2Var, ur2Var);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("vast_xml");
            boolean z6 = false;
            if (((Boolean) sw.c().b(m10.Y6)).booleanValue() && optJSONObject.has("html")) {
                z6 = true;
            }
            if (TextUtils.isEmpty(optString)) {
                if (!z6) {
                    io0.g("Required field 'vast_xml' or 'html' is missing");
                }
            } else if (!z6) {
                a7 = this.f12305i.a(optJSONObject);
                return l(rb3.o(a7, ((Integer) sw.c().b(m10.f8299s2)).intValue(), TimeUnit.SECONDS, this.f12307k), null);
            }
            a7 = p(optJSONObject, rr2Var, ur2Var);
            return l(rb3.o(a7, ((Integer) sw.c().b(m10.f8299s2)).intValue(), TimeUnit.SECONDS, this.f12307k), null);
        }
        return rb3.i(null);
    }
}
