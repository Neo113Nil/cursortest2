package com.applovin.impl.mediation.c;

import com.applovin.impl.sdk.b.d;
import com.applovin.impl.sdk.e.e;
import com.applovin.impl.sdk.e.f;
import com.applovin.impl.sdk.j;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends e {
    public static String a(j jVar) {
        return e.a((String) jVar.a(com.applovin.impl.sdk.b.a.f2995a), "1.0/mediate", jVar);
    }

    public static void a(JSONObject jSONObject, j jVar) {
        if (f.a(jSONObject, "signal_providers")) {
            jVar.a((d<d<String>>) d.p, (d<String>) jSONObject.toString());
            jVar.u().b("MediationConnectionUtils", "Updated signal provider(s)");
        }
    }

    public static String b(j jVar) {
        return e.a((String) jVar.a(com.applovin.impl.sdk.b.a.f2996b), "1.0/mediate", jVar);
    }

    public static void b(JSONObject jSONObject, j jVar) {
        if (f.a(jSONObject, "auto_init_adapters")) {
            jVar.a((d<d<String>>) d.q, (d<String>) jSONObject.toString());
            jVar.u().b("MediationConnectionUtils", "Updated auto-init adapter(s)");
        }
    }
}
