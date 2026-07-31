package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u4;
import com.applovin.impl.v;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.utils.SdksMapping;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class w5 extends i5 {
    private final q0.e g;

    public w5(q0.e eVar, com.applovin.impl.sdk.k kVar) {
        super("TaskFetchMediationDebuggerInfo", kVar, true);
        this.g = eVar;
    }

    protected Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.a.a(x4.k5)).booleanValue()) {
            hashMap.put("sdk_key", this.a.i0());
        }
        Map G = this.a.A().G();
        hashMap.put("package_name", String.valueOf(G.get("package_name")));
        hashMap.put("app_version", String.valueOf(G.get("app_version")));
        Map N = this.a.A().N();
        hashMap.put("platform", String.valueOf(N.get("platform")));
        hashMap.put("os", String.valueOf(N.get("os")));
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map e = e();
        JSONObject a2 = a(a());
        if (((Boolean) this.a.a(x4.C5)).booleanValue() || ((Boolean) this.a.a(x4.z5)).booleanValue()) {
            JsonUtils.putAll(a2, (Map<String, ?>) e);
            e = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.a).c("POST").b(l3.i(this.a)).a(l3.h(this.a)).b(e).a(a2).a((Object) new JSONObject()).c(((Long) this.a.a(r3.t7)).intValue()).a(u4.a.a(((Integer) this.a.a(x4.r5)).intValue())).a(), this.a, d());
        aVar.c(r3.p7);
        aVar.b(r3.q7);
        this.a.q0().a(aVar);
    }

    class a extends l6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z) {
            super(aVar, kVar, z);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i) {
            w5.this.g.a(str, jSONObject, i);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            w5.this.g.a(str, i, str2, jSONObject);
        }
    }

    private JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArrayIfValid(jSONObject, SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS, w3.b(this.a));
        JsonUtils.putBoolean(jSONObject, "is_tablet", AppLovinSdkUtils.isTablet(context));
        v.a f = this.a.A().f();
        JsonUtils.putStringIfValid(jSONObject, "dnt_code", f.b().b());
        JsonUtils.putStringIfValid(jSONObject, "idfa", f.a());
        Map k0 = this.a.k0();
        if (!CollectionUtils.isEmpty(k0)) {
            JsonUtils.putJSONObject(jSONObject, "segments", new JSONObject(k0));
        }
        return jSONObject;
    }
}
