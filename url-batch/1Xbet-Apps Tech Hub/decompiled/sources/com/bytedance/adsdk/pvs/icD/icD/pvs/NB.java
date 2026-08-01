package com.bytedance.adsdk.pvs.icD.icD.pvs;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: GtEqNode.java */
/* loaded from: classes.dex */
public class NB extends vA {
    public NB() {
        super(com.bytedance.adsdk.pvs.icD.Jd.vG.GT_EQ);
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public Object pvs(Map<String, JSONObject> map) {
        Object pvs;
        if (this.pvs.pvs(map) == null || (pvs = this.icD.pvs(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) com.bytedance.adsdk.pvs.icD.NB.pvs.Jd.pvs(r0, (Number) pvs)).booleanValue());
    }
}
