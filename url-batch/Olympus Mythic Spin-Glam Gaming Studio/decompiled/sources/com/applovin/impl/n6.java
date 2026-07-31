package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class n6 extends o6 {
    private final c3 g;

    public n6(c3 c3Var, com.applovin.impl.sdk.k kVar) {
        super("TaskReportMaxReward", kVar);
        this.g = c3Var;
    }

    @Override // com.applovin.impl.q6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.g.e());
        String s0 = this.g.s0();
        if (!StringUtils.isValidString(s0)) {
            s0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", s0);
        String B = this.g.B();
        if (!StringUtils.isValidString(B)) {
            B = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", B);
    }

    @Override // com.applovin.impl.o6
    protected void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Reported reward successfully for mediated ad: " + this.g);
        }
    }

    @Override // com.applovin.impl.q6
    protected String f() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.o6
    protected o4 h() {
        return this.g.o0();
    }

    @Override // com.applovin.impl.o6
    protected void i() {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.b(this.b, "No reward result was found for mediated ad: " + this.g);
        }
    }

    @Override // com.applovin.impl.q6
    protected void a(int i) {
        super.a(i);
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Failed to report reward for mediated ad: " + this.g + " - error code: " + i);
        }
        this.a.P().a(d2.u0, this.g);
    }
}
