package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class t6 extends v6 {
    private final com.applovin.impl.sdk.ad.b g;
    private final AppLovinAdRewardListener h;

    public t6(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateAppLovinReward", kVar);
        this.g = bVar;
        this.h = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.q6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.g.getAdZone().e());
        String clCode = this.g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.q6
    public String f() {
        return "2.0/vr";
    }

    @Override // com.applovin.impl.v6
    protected boolean h() {
        return this.g.K0();
    }

    @Override // com.applovin.impl.v6
    protected void a(o4 o4Var) {
        this.g.a(o4Var);
        String b = o4Var.b();
        Map<String, String> a = o4Var.a();
        if (b.equals("accepted")) {
            this.h.userRewardVerified(this.g, a);
            return;
        }
        if (b.equals("quota_exceeded")) {
            this.h.userOverQuota(this.g, a);
        } else if (b.equals("rejected")) {
            this.h.userRewardRejected(this.g, a);
        } else {
            this.h.validationRequestFailed(this.g, -400);
        }
    }

    @Override // com.applovin.impl.q6
    protected void a(int i) {
        String str;
        super.a(i);
        if (i >= 400 && i < 500) {
            this.h.userRewardRejected(this.g, Collections.emptyMap());
            str = "rejected";
        } else {
            this.h.validationRequestFailed(this.g, i);
            str = "network_timeout";
        }
        this.g.a(o4.a(str));
    }
}
