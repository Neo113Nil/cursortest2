package com.bytedance.sdk.openadsdk.klz.zmn;

import com.bytedance.sdk.openadsdk.core.fkt;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class iv extends com.bytedance.sdk.component.zmn.kgc<JSONObject, JSONObject> {
    public static final HashSet<String> zmn = new HashSet<>(Arrays.asList("endcardDynamicCreatives", "multiOpenCovert", "speedVideoOrTimer", "openPlayable", "skipToNextAd"));
    private final fkt fs;

    public iv(fkt fktVar) {
        this.fs = fktVar;
    }

    public static void zmn(com.bytedance.sdk.component.zmn.cn cnVar, fkt fktVar) {
        cnVar.zmn(zmn, new iv(fktVar));
    }

    @Override // com.bytedance.sdk.component.zmn.fb
    public JSONObject zmn(String str, JSONObject jSONObject, com.bytedance.sdk.component.zmn.btk btkVar) throws Exception {
        if ("endcardDynamicCreatives".equals(str)) {
            return this.fs.bvs(jSONObject);
        }
        if ("multiOpenCovert".equals(str)) {
            this.fs.iv(jSONObject);
            return null;
        }
        if ("skipToNextAd".equals(str)) {
            this.fs.zmn(jSONObject, str);
            return null;
        }
        if ("speedVideoOrTimer".equals(str)) {
            return this.fs.zg(jSONObject);
        }
        if ("openPlayable".equals(str)) {
            return this.fs.nps(jSONObject);
        }
        return null;
    }
}
