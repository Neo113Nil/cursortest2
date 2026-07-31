package com.applovin.impl;

import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class o6 extends q6 {
    protected o6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    private JSONObject a(o4 o4Var) {
        JSONObject e = e();
        JsonUtils.putString(e, "result", o4Var.b());
        Map a2 = o4Var.a();
        if (a2 != null) {
            JsonUtils.putJSONObject(e, "params", new JSONObject(a2));
        }
        return e;
    }

    protected abstract void b(JSONObject jSONObject);

    @Override // com.applovin.impl.q6
    protected int g() {
        return ((Integer) this.a.a(x4.f1)).intValue();
    }

    protected abstract o4 h();

    protected abstract void i();

    @Override // java.lang.Runnable
    public void run() {
        o4 h = h();
        if (h == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Pending reward not found");
            }
            i();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Reporting pending reward: " + h + "...");
        }
        a(a(h), new a());
    }

    class a implements q0.e {
        a() {
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i) {
            o6.this.b(jSONObject);
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            o6.this.a(i);
        }
    }
}
