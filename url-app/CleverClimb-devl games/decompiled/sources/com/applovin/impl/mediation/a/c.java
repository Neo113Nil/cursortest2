package com.applovin.impl.mediation.a;

import com.applovin.impl.sdk.j;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends a {
    private c(c cVar, com.applovin.impl.mediation.e eVar) {
        super(cVar.s(), cVar.r(), eVar, cVar.f2660b);
    }

    public c(JSONObject jSONObject, JSONObject jSONObject2, j jVar) {
        super(jSONObject, jSONObject2, null, jVar);
    }

    @Override // com.applovin.impl.mediation.a.a
    public a a(com.applovin.impl.mediation.e eVar) {
        return new c(this, eVar);
    }

    public long h() {
        long b2 = b("ad_expiration_ms", -1L);
        return b2 >= 0 ? b2 : a("ad_expiration_ms", ((Long) this.f2660b.a(com.applovin.impl.sdk.b.a.K)).longValue());
    }
}
