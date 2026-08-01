package com.bytedance.adsdk.pvs.icD.icD.pvs;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: LtNode.java */
/* loaded from: classes.dex */
public class Mxy extends vA {
    public Mxy() {
        super(com.bytedance.adsdk.pvs.icD.Jd.vG.LT);
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public Object pvs(Map<String, JSONObject> map) {
        Object pvs;
        Object pvs2 = this.pvs.pvs(map);
        if (pvs2 == null || (pvs = this.icD.pvs(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.pvs.icD.NB.pvs.Jd.pvs(pvs2, (Number) pvs);
    }
}
