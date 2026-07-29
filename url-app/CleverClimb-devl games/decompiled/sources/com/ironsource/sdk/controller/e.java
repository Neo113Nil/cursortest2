package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.sdk.controller.c;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PermissionsJSAdapter.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static final String f7133b = "e";

    /* renamed from: a, reason: collision with root package name */
    private Context f7134a;

    public e(Context context) {
        this.f7134a = context;
    }

    /* compiled from: PermissionsJSAdapter.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        String f7135a;

        /* renamed from: b, reason: collision with root package name */
        JSONObject f7136b;

        /* renamed from: c, reason: collision with root package name */
        String f7137c;

        /* renamed from: d, reason: collision with root package name */
        String f7138d;

        private a() {
        }
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a();
        aVar.f7135a = jSONObject.optString("functionName");
        aVar.f7136b = jSONObject.optJSONObject("functionParams");
        aVar.f7137c = jSONObject.optString("success");
        aVar.f7138d = jSONObject.optString("fail");
        return aVar;
    }

    void a(String str, c.C0376c.a aVar) throws Exception {
        a a2 = a(str);
        if ("getPermissions".equals(a2.f7135a)) {
            b(a2.f7136b, a2, aVar);
            return;
        }
        if ("isPermissionGranted".equals(a2.f7135a)) {
            a(a2.f7136b, a2, aVar);
            return;
        }
        com.ironsource.sdk.g.e.a(f7133b, "PermissionsJSAdapter unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, a aVar, c.C0376c.a aVar2) {
        com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g();
        try {
            String string = jSONObject.getString("permission");
            gVar.a("permission", string);
            if (com.ironsource.environment.a.a(this.f7134a, string)) {
                gVar.a("status", String.valueOf(com.ironsource.environment.a.b(this.f7134a, string)));
                aVar2.a(true, aVar.f7137c, gVar);
            } else {
                gVar.a("status", "unhandledPermission");
                aVar2.a(false, aVar.f7138d, gVar);
            }
        } catch (Exception e) {
            e.printStackTrace();
            gVar.a("errMsg", e.getMessage());
            aVar2.a(false, aVar.f7138d, gVar);
        }
    }

    public void b(JSONObject jSONObject, a aVar, c.C0376c.a aVar2) {
        com.ironsource.sdk.data.g gVar = new com.ironsource.sdk.data.g();
        try {
            gVar.a("permissions", com.ironsource.environment.a.a(this.f7134a, jSONObject.getJSONArray("permissions")));
            aVar2.a(true, aVar.f7137c, gVar);
        } catch (Exception e) {
            e.printStackTrace();
            com.ironsource.sdk.g.e.a(f7133b, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e.getMessage());
            gVar.a("errMsg", e.getMessage());
            aVar2.a(false, aVar.f7138d, gVar);
        }
    }
}
