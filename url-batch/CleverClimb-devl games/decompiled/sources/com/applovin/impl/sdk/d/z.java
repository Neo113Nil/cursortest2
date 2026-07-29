package com.applovin.impl.sdk.d;

import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.network.b;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class z extends a {
    z(String str, com.applovin.impl.sdk.j jVar) {
        super(str, jVar);
    }

    void a(String str, JSONObject jSONObject, int i, final a.b bVar) {
        w<JSONObject> wVar = new w<JSONObject>(com.applovin.impl.sdk.network.b.a(this.f3073b).a(com.applovin.impl.sdk.e.e.a(str, this.f3073b)).c(com.applovin.impl.sdk.e.e.b(str, this.f3073b)).a(com.applovin.impl.sdk.e.e.c(this.f3073b)).b("POST").a(jSONObject).a((b.a) new JSONObject()).a(i).a(), this.f3073b) { // from class: com.applovin.impl.sdk.d.z.1
            @Override // com.applovin.impl.sdk.d.w, com.applovin.impl.sdk.network.a.b
            public void a(int i2) {
                bVar.a(i2);
            }

            @Override // com.applovin.impl.sdk.d.w, com.applovin.impl.sdk.network.a.b
            public void a(JSONObject jSONObject2, int i2) {
                bVar.a(jSONObject2, i2);
            }
        };
        wVar.a(com.applovin.impl.sdk.b.b.ay);
        wVar.b(com.applovin.impl.sdk.b.b.az);
        this.f3073b.C().a(wVar);
    }
}
