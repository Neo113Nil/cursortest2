package com.applovin.impl.mediation.a;

import com.applovin.impl.sdk.j;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g extends e {
    public g(JSONObject jSONObject, JSONObject jSONObject2, j jVar) {
        super(jSONObject, jSONObject2, jVar);
    }

    int a() {
        return a("max_signal_length", 2048);
    }

    public boolean b() {
        return b("only_collect_signal_when_initialized", (Boolean) false);
    }

    @Override // com.applovin.impl.mediation.a.e
    public String toString() {
        return "SignalProviderSpec{specObject=" + s() + '}';
    }
}
