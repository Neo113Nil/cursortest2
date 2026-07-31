package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.b9;
import com.ironsource.gr;
import com.ironsource.nm;
import com.ironsource.of;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.ironsource.sk;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    private static final String f19258c = "i";

    /* renamed from: d, reason: collision with root package name */
    private static final String f19259d = "getDeviceData";

    /* renamed from: e, reason: collision with root package name */
    private static final String f19260e = "deviceDataFunction";

    /* renamed from: f, reason: collision with root package name */
    private static final String f19261f = "deviceDataParams";

    /* renamed from: g, reason: collision with root package name */
    private static final String f19262g = "success";

    /* renamed from: h, reason: collision with root package name */
    private static final String f19263h = "fail";

    /* renamed from: a, reason: collision with root package name */
    private Context f19264a;

    /* renamed from: b, reason: collision with root package name */
    private final of f19265b = nm.S().f();

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        String f19266a;

        /* renamed from: b, reason: collision with root package name */
        JSONObject f19267b;

        /* renamed from: c, reason: collision with root package name */
        String f19268c;

        /* renamed from: d, reason: collision with root package name */
        String f19269d;

        private b() {
        }
    }

    public i(Context context) {
        this.f19264a = context;
    }

    private gr a() {
        gr grVar = new gr();
        grVar.b(SDKUtils.encodeString(b9.i.f15561i0), SDKUtils.encodeString(String.valueOf(this.f19265b.c())));
        grVar.b(SDKUtils.encodeString(b9.i.f15563j0), SDKUtils.encodeString(String.valueOf(this.f19265b.h(this.f19264a))));
        grVar.b(SDKUtils.encodeString(b9.i.f15565k0), SDKUtils.encodeString(String.valueOf(this.f19265b.J(this.f19264a))));
        grVar.b(SDKUtils.encodeString(b9.i.f15567l0), SDKUtils.encodeString(String.valueOf(this.f19265b.l(this.f19264a))));
        grVar.b(SDKUtils.encodeString(b9.i.f15569m0), SDKUtils.encodeString(String.valueOf(this.f19265b.c(this.f19264a))));
        grVar.b(SDKUtils.encodeString(b9.i.f15571n0), SDKUtils.encodeString(String.valueOf(this.f19265b.d(this.f19264a))));
        return grVar;
    }

    private b a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f19266a = jSONObject.optString(f19260e);
        bVar.f19267b = jSONObject.optJSONObject(f19261f);
        bVar.f19268c = jSONObject.optString("success");
        bVar.f19269d = jSONObject.optString("fail");
        return bVar;
    }

    void a(String str, sk skVar) {
        b a4 = a(str);
        if (f19259d.equals(a4.f19266a)) {
            skVar.a(true, a4.f19268c, a());
            return;
        }
        Logger.i(f19258c, "unhandled API request " + str);
    }
}
