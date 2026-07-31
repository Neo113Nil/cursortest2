package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.gr;
import com.ironsource.io;
import com.ironsource.o9;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sk;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: c, reason: collision with root package name */
    private static final String f19313c = "o";

    /* renamed from: d, reason: collision with root package name */
    private static final String f19314d = "activate";

    /* renamed from: e, reason: collision with root package name */
    private static final String f19315e = "startSession";

    /* renamed from: f, reason: collision with root package name */
    private static final String f19316f = "finishSession";

    /* renamed from: g, reason: collision with root package name */
    private static final String f19317g = "impressionOccurred";

    /* renamed from: h, reason: collision with root package name */
    private static final String f19318h = "getOmidData";

    /* renamed from: i, reason: collision with root package name */
    private static final String f19319i = "omidFunction";

    /* renamed from: j, reason: collision with root package name */
    private static final String f19320j = "omidParams";

    /* renamed from: k, reason: collision with root package name */
    private static final String f19321k = "success";

    /* renamed from: l, reason: collision with root package name */
    private static final String f19322l = "fail";

    /* renamed from: m, reason: collision with root package name */
    private static final String f19323m = "%s | unsupported OMID API";

    /* renamed from: a, reason: collision with root package name */
    private final Context f19324a;

    /* renamed from: b, reason: collision with root package name */
    private final io f19325b = new io();

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        String f19326a;

        /* renamed from: b, reason: collision with root package name */
        JSONObject f19327b;

        /* renamed from: c, reason: collision with root package name */
        String f19328c;

        /* renamed from: d, reason: collision with root package name */
        String f19329d;

        private b() {
        }
    }

    public o(Context context) {
        this.f19324a = context;
    }

    private b a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f19326a = jSONObject.optString(f19319i);
        bVar.f19327b = jSONObject.optJSONObject(f19320j);
        bVar.f19328c = jSONObject.optString("success");
        bVar.f19329d = jSONObject.optString("fail");
        return bVar;
    }

    void a(String str, sk skVar) {
        char c4;
        b a4 = a(str);
        gr grVar = new gr();
        JSONObject jSONObject = a4.f19327b;
        if (jSONObject != null) {
            String optString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(optString)) {
                grVar.b("adViewId", optString);
            }
        }
        try {
            String str2 = a4.f19326a;
            switch (str2.hashCode()) {
                case -1655974669:
                    if (str2.equals(f19314d)) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -984459207:
                    if (str2.equals(f19318h)) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 70701699:
                    if (str2.equals(f19316f)) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1208109646:
                    if (str2.equals(f19317g)) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1850541012:
                    if (str2.equals(f19315e)) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            if (c4 != 0) {
                if (c4 == 1) {
                    this.f19325b.d(a4.f19327b);
                } else if (c4 == 2) {
                    this.f19325b.b(a4.f19327b);
                } else if (c4 == 3) {
                    this.f19325b.c(a4.f19327b);
                } else if (c4 != 4) {
                    throw new IllegalArgumentException(String.format(f19323m, a4.f19326a));
                }
                skVar.a(true, a4.f19328c, grVar);
            }
            this.f19325b.a(this.f19324a);
            grVar = this.f19325b.a();
            skVar.a(true, a4.f19328c, grVar);
        } catch (Exception e4) {
            o9.d().a(e4);
            grVar.b("errMsg", e4.getMessage());
            Logger.i(f19313c, "OMIDJSAdapter " + a4.f19326a + " Exception: " + e4.getMessage());
            skVar.a(false, a4.f19329d, grVar);
        }
    }
}
