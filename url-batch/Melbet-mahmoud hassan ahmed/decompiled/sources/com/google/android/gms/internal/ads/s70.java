package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s70 {

    /* renamed from: a, reason: collision with root package name */
    public static final t70<eu0> f11693a = new t70() { // from class: com.google.android.gms.internal.ads.a70
        @Override // com.google.android.gms.internal.ads.t70
        public final void a(Object obj, Map map) {
            gv0 gv0Var = (gv0) obj;
            t70<eu0> t70Var = s70.f11693a;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                io0.g("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = gv0Var.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                boolean z6 = true;
                if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                    z6 = false;
                }
                Boolean valueOf = Boolean.valueOf(z6);
                hashMap.put(str2, valueOf);
                String obj2 = valueOf.toString();
                StringBuilder sb = new StringBuilder(str2.length() + 14 + obj2.length());
                sb.append("/canOpenURLs;");
                sb.append(str2);
                sb.append(";");
                sb.append(obj2);
                a3.r1.k(sb.toString());
            }
            ((da0) gv0Var).t("openableURLs", hashMap);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final t70<eu0> f11694b = new t70() { // from class: com.google.android.gms.internal.ads.x60
        @Override // com.google.android.gms.internal.ads.t70
        public final void a(Object obj, Map map) {
            gv0 gv0Var = (gv0) obj;
            t70<eu0> t70Var = s70.f11693a;
            if (!((Boolean) sw.c().b(m10.Z5)).booleanValue()) {
                io0.g("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                io0.g("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            Boolean valueOf = Boolean.valueOf(gv0Var.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            hashMap.put(str, valueOf);
            String obj2 = valueOf.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + obj2.length());
            sb.append("/canOpenApp;");
            sb.append(str);
            sb.append(";");
            sb.append(obj2);
            a3.r1.k(sb.toString());
            ((da0) gv0Var).t("openableApp", hashMap);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final t70<eu0> f11695c = new t70() { // from class: com.google.android.gms.internal.ads.y60
        @Override // com.google.android.gms.internal.ads.t70
        public final void a(Object obj, Map map) {
            s70.c((gv0) obj, map);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final t70<eu0> f11696d = new k70();

    /* renamed from: e, reason: collision with root package name */
    public static final t70<eu0> f11697e = new l70();

    /* renamed from: f, reason: collision with root package name */
    public static final t70<eu0> f11698f = new t70() { // from class: com.google.android.gms.internal.ads.b70
        @Override // com.google.android.gms.internal.ads.t70
        public final void a(Object obj, Map map) {
            gv0 gv0Var = (gv0) obj;
            t70<eu0> t70Var = s70.f11693a;
            String str = (String) map.get("u");
            if (str == null) {
                io0.g("URL missing from httpTrack GMSG.");
            } else {
                new a3.f1(gv0Var.getContext(), ((ov0) gv0Var).l().f10301f, str).b();
            }
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public static final t70<Object> f11699g = new m70();

    /* renamed from: h, reason: collision with root package name */
    public static final t70<eu0> f11700h = new n70();

    /* renamed from: i, reason: collision with root package name */
    public static final t70<eu0> f11701i = new t70() { // from class: com.google.android.gms.internal.ads.c70
        @Override // com.google.android.gms.internal.ads.t70
        public final void a(Object obj, Map map) {
            nv0 nv0Var = (nv0) obj;
            t70<eu0> t70Var = s70.f11693a;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                gb I = nv0Var.I();
                if (I != null) {
                    I.c().e(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException unused) {
                io0.g("Could not parse touch parameters from gmsg.");
            }
        }
    };

    /* renamed from: j, reason: collision with root package name */
    public static final t70<eu0> f11702j = new o70();

    /* renamed from: k, reason: collision with root package name */
    public static final t70<eu0> f11703k = new p70();

    /* renamed from: l, reason: collision with root package name */
    public static final t70<tq0> f11704l = new gs0();

    /* renamed from: m, reason: collision with root package name */
    public static final t70<tq0> f11705m = new hs0();

    /* renamed from: n, reason: collision with root package name */
    public static final t70<eu0> f11706n = new v60();

    /* renamed from: o, reason: collision with root package name */
    public static final i80 f11707o = new i80();

    /* renamed from: p, reason: collision with root package name */
    public static final t70<eu0> f11708p = new q70();

    /* renamed from: q, reason: collision with root package name */
    public static final t70<eu0> f11709q = new r70();

    /* renamed from: r, reason: collision with root package name */
    public static final t70<eu0> f11710r = new g70();

    /* renamed from: s, reason: collision with root package name */
    public static final t70<eu0> f11711s = new h70();

    /* renamed from: t, reason: collision with root package name */
    public static final t70<eu0> f11712t = new i70();

    public static t70<eu0> a(final pi1 pi1Var) {
        return new t70() { // from class: com.google.android.gms.internal.ads.w60
            @Override // com.google.android.gms.internal.ads.t70
            public final void a(Object obj, Map map) {
                eu0 eu0Var = (eu0) obj;
                s70.d(map, pi1.this);
                String str = (String) map.get("u");
                if (str == null) {
                    io0.g("URL missing from click GMSG.");
                } else {
                    rb3.r(s70.b(eu0Var, str), new j70(eu0Var), wo0.f13894a);
                }
            }
        };
    }

    public static cc3<String> b(eu0 eu0Var, String str) {
        Uri parse = Uri.parse(str);
        try {
            gb I = eu0Var.I();
            if (I != null && I.f(parse)) {
                parse = I.a(parse, eu0Var.getContext(), eu0Var.c0(), eu0Var.j());
            }
        } catch (hb unused) {
            io0.g(str.length() != 0 ? "Unable to append parameter to URL: ".concat(str) : new String("Unable to append parameter to URL: "));
        }
        final String b7 = rm0.b(parse, eu0Var.getContext());
        long longValue = a30.f2584e.e().longValue();
        if (longValue <= 0 || longValue > 214106404) {
            return rb3.i(b7);
        }
        ib3 E = ib3.E(eu0Var.A0());
        f70 f70Var = new e43() { // from class: com.google.android.gms.internal.ads.f70
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                t70<eu0> t70Var = s70.f11693a;
                if (!a30.f2590k.e().booleanValue()) {
                    return "failure_click_attok";
                }
                y2.t.p().s(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        };
        dc3 dc3Var = wo0.f13899f;
        return rb3.f(rb3.m(rb3.f(E, Throwable.class, f70Var, dc3Var), new e43() { // from class: com.google.android.gms.internal.ads.d70
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                String str2 = b7;
                String str3 = (String) obj;
                t70<eu0> t70Var = s70.f11693a;
                if (str3 != null) {
                    if (a30.f2585f.e().booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str2).getHost();
                        for (int i7 = 0; i7 < 3; i7++) {
                            if (!host.endsWith(strArr[i7])) {
                            }
                        }
                    }
                    String e7 = a30.f2580a.e();
                    String e8 = a30.f2581b.e();
                    if (!TextUtils.isEmpty(e7)) {
                        str2 = str2.replace(e7, str3);
                    }
                    if (!TextUtils.isEmpty(e8)) {
                        Uri parse2 = Uri.parse(str2);
                        if (TextUtils.isEmpty(parse2.getQueryParameter(e8))) {
                            return parse2.buildUpon().appendQueryParameter(e8, str3).toString();
                        }
                    }
                }
                return str2;
            }
        }, dc3Var), Throwable.class, new e43() { // from class: com.google.android.gms.internal.ads.e70
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                String str2 = b7;
                Throwable th = (Throwable) obj;
                t70<eu0> t70Var = s70.f11693a;
                if (a30.f2590k.e().booleanValue()) {
                    y2.t.p().s(th, "prepareClickUrl.attestation2");
                }
                return str2;
            }
        }, dc3Var);
    }

    static /* synthetic */ void c(gv0 gv0Var, Map map) {
        JSONException jSONException;
        String str;
        PackageManager packageManager = gv0Var.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString("p");
                        String optString6 = jSONObject2.optString("c");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e7) {
                                String valueOf = String.valueOf(optString7);
                                io0.e(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e7);
                            }
                        }
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        try {
                            jSONObject.put(optString, packageManager.resolveActivity(intent, 65536) != null);
                        } catch (JSONException e8) {
                            jSONException = e8;
                            str = "Error constructing openable urls response.";
                            io0.e(str, jSONException);
                        }
                    } catch (JSONException e9) {
                        jSONException = e9;
                        str = "Error parsing the intent data.";
                    }
                }
                ((da0) gv0Var).s("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((da0) gv0Var).s("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((da0) gv0Var).s("openableIntents", new JSONObject());
        }
    }

    public static void d(Map<String, String> map, pi1 pi1Var) {
        if (((Boolean) sw.c().b(m10.l7)).booleanValue() && map.containsKey("sc") && map.get("sc").equals("1") && pi1Var != null) {
            pi1Var.r();
        }
    }
}
