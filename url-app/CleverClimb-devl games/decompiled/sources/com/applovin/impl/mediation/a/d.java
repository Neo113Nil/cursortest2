package com.applovin.impl.mediation.a;

import com.applovin.impl.sdk.j;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends a {
    private d(d dVar, com.applovin.impl.mediation.e eVar) {
        super(dVar.s(), dVar.r(), eVar, dVar.f2660b);
    }

    public d(JSONObject jSONObject, JSONObject jSONObject2, j jVar) {
        super(jSONObject, jSONObject2, null, jVar);
    }

    @Override // com.applovin.impl.mediation.a.a
    public a a(com.applovin.impl.mediation.e eVar) {
        return new d(this, eVar);
    }
}
