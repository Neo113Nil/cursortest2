package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C1442c4;
import com.ironsource.gr;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o9;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sk;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: b, reason: collision with root package name */
    private static final String f19340b = "q";

    /* renamed from: c, reason: collision with root package name */
    private static final String f19341c = "getPermissions";

    /* renamed from: d, reason: collision with root package name */
    private static final String f19342d = "isPermissionGranted";

    /* renamed from: e, reason: collision with root package name */
    private static final String f19343e = "permissions";

    /* renamed from: f, reason: collision with root package name */
    private static final String f19344f = "permission";

    /* renamed from: g, reason: collision with root package name */
    private static final String f19345g = "status";

    /* renamed from: h, reason: collision with root package name */
    private static final String f19346h = "functionName";

    /* renamed from: i, reason: collision with root package name */
    private static final String f19347i = "functionParams";

    /* renamed from: j, reason: collision with root package name */
    private static final String f19348j = "success";

    /* renamed from: k, reason: collision with root package name */
    private static final String f19349k = "fail";

    /* renamed from: l, reason: collision with root package name */
    private static final String f19350l = "unhandledPermission";

    /* renamed from: a, reason: collision with root package name */
    private Context f19351a;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        String f19352a;

        /* renamed from: b, reason: collision with root package name */
        JSONObject f19353b;

        /* renamed from: c, reason: collision with root package name */
        String f19354c;

        /* renamed from: d, reason: collision with root package name */
        String f19355d;

        private b() {
        }
    }

    public q(Context context) {
        this.f19351a = context;
    }

    private b a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f19352a = jSONObject.optString("functionName");
        bVar.f19353b = jSONObject.optJSONObject("functionParams");
        bVar.f19354c = jSONObject.optString("success");
        bVar.f19355d = jSONObject.optString("fail");
        return bVar;
    }

    public void b(JSONObject jSONObject, b bVar, sk skVar) {
        String str;
        boolean z4;
        gr grVar = new gr();
        try {
            String string = jSONObject.getString(f19344f);
            grVar.b(f19344f, string);
            if (C1442c4.d(this.f19351a, string)) {
                grVar.b("status", String.valueOf(C1442c4.c(this.f19351a, string)));
                str = bVar.f19354c;
                z4 = true;
            } else {
                grVar.b("status", f19350l);
                str = bVar.f19355d;
                z4 = false;
            }
            skVar.a(z4, str, grVar);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            grVar.b("errMsg", e4.getMessage());
            skVar.a(false, bVar.f19355d, grVar);
        }
    }

    void a(String str, sk skVar) {
        b a4 = a(str);
        if (f19341c.equals(a4.f19352a)) {
            a(a4.f19353b, a4, skVar);
            return;
        }
        if (f19342d.equals(a4.f19352a)) {
            b(a4.f19353b, a4, skVar);
            return;
        }
        Logger.i(f19340b, "PermissionsJSAdapter unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, b bVar, sk skVar) {
        gr grVar = new gr();
        try {
            grVar.a(f19343e, C1442c4.a(this.f19351a, jSONObject.getJSONArray(f19343e)));
            skVar.a(true, bVar.f19354c, grVar);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            Logger.i(f19340b, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e4.getMessage());
            grVar.b("errMsg", e4.getMessage());
            skVar.a(false, bVar.f19355d, grVar);
        }
    }
}
