package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.dv;
import com.ironsource.environment.StringUtils;
import com.ironsource.gr;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o9;
import com.ironsource.qn;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sk;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class u {

    /* renamed from: d, reason: collision with root package name */
    private static final String f19362d = "u";

    /* renamed from: e, reason: collision with root package name */
    private static final String f19363e = "updateToken";

    /* renamed from: f, reason: collision with root package name */
    private static final String f19364f = "getToken";

    /* renamed from: g, reason: collision with root package name */
    private static final String f19365g = "functionName";

    /* renamed from: h, reason: collision with root package name */
    private static final String f19366h = "functionParams";

    /* renamed from: i, reason: collision with root package name */
    private static final String f19367i = "success";

    /* renamed from: j, reason: collision with root package name */
    private static final String f19368j = "fail";

    /* renamed from: b, reason: collision with root package name */
    private Context f19370b;

    /* renamed from: a, reason: collision with root package name */
    private qn f19369a = new qn();

    /* renamed from: c, reason: collision with root package name */
    private dv f19371c = new dv();

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        String f19372a;

        /* renamed from: b, reason: collision with root package name */
        JSONObject f19373b;

        /* renamed from: c, reason: collision with root package name */
        String f19374c;

        /* renamed from: d, reason: collision with root package name */
        String f19375d;

        private b() {
        }
    }

    public u(Context context) {
        this.f19370b = context;
    }

    private b a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f19372a = jSONObject.optString("functionName");
        bVar.f19373b = jSONObject.optJSONObject("functionParams");
        bVar.f19374c = jSONObject.optString("success");
        bVar.f19375d = jSONObject.optString("fail");
        return bVar;
    }

    private void a(b bVar, sk skVar) {
        try {
            JSONObject a4 = this.f19371c.a();
            Iterator<String> keys = a4.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = a4.get(next);
                if (obj instanceof String) {
                    a4.put(next, StringUtils.encodeURI((String) obj));
                }
            }
            skVar.a(true, bVar.f19374c, a4);
        } catch (Exception e4) {
            o9.d().a(e4);
            skVar.a(false, bVar.f19375d, e4.getMessage());
        }
    }

    void a(String str, sk skVar) {
        b a4 = a(str);
        if (f19363e.equals(a4.f19372a)) {
            a(a4.f19373b, a4, skVar);
            return;
        }
        if (f19364f.equals(a4.f19372a)) {
            a(a4, skVar);
            return;
        }
        Logger.i(f19362d, "unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, b bVar, sk skVar) {
        gr grVar = new gr();
        try {
            this.f19369a.a(jSONObject);
            skVar.a(true, bVar.f19374c, grVar);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            Logger.i(f19362d, "updateToken exception " + e4.getMessage());
            skVar.a(false, bVar.f19375d, grVar);
        }
    }
}
