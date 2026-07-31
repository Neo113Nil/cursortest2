package com.bytedance.sdk.openadsdk.klz.zmn;

import com.bytedance.sdk.openadsdk.core.fkt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class bvs extends com.bytedance.sdk.component.zmn.fb<JSONObject, JSONObject> {
    private String fs;
    private final fkt zmn;

    public bvs(fkt fktVar, String str) {
        this.zmn = fktVar;
        this.fs = str;
    }

    public static void zmn(com.bytedance.sdk.component.zmn.cn cnVar, fkt fktVar) {
        cnVar.zmn("endcardDynamicCreatives", new bvs(fktVar, "endcardDynamicCreatives"));
        cnVar.zmn("multiOpenCovert", new bvs(fktVar, "multiOpenCovert"));
        cnVar.zmn("skipToNextAd", new bvs(fktVar, "skipToNextAd"));
        cnVar.zmn("speedVideoOrTimer", new bvs(fktVar, "speedVideoOrTimer"));
        cnVar.zmn("openPlayable", new bvs(fktVar, "openPlayable"));
    }

    @Override // com.bytedance.sdk.component.zmn.fb
    public JSONObject zmn(String str, JSONObject jSONObject, com.bytedance.sdk.component.zmn.btk btkVar) throws Exception {
        if ("endcardDynamicCreatives".equals(this.fs)) {
            return this.zmn.bvs(jSONObject);
        }
        if ("multiOpenCovert".equals(this.fs)) {
            this.zmn.iv(jSONObject);
            return null;
        }
        if ("skipToNextAd".equals(this.fs)) {
            this.zmn.zmn(jSONObject, this.fs);
            return null;
        }
        if ("speedVideoOrTimer".equals(this.fs)) {
            return this.zmn.zg(jSONObject);
        }
        if ("openPlayable".equals(this.fs)) {
            return this.zmn.nps(jSONObject);
        }
        return null;
    }
}
