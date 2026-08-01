package com.bytedance.adsdk.pvs.icD.icD.pvs;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: MultiNode.java */
/* loaded from: classes.dex */
public class Ju extends vA {
    public Ju() {
        super(com.bytedance.adsdk.pvs.icD.Jd.vG.MULTI);
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public Object pvs(Map<String, JSONObject> map) {
        Object pvs;
        Object pvs2 = this.pvs.pvs(map);
        if (pvs2 == null || (pvs = this.icD.pvs(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.pvs.icD.NB.pvs.yiw.pvs((Number) pvs2, (Number) pvs);
    }
}
