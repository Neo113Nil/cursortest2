package com.bytedance.adsdk.pvs.icD.icD.pvs;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: NotEqualNode.java */
/* loaded from: classes.dex */
public class IP extends vA {
    public IP() {
        super(com.bytedance.adsdk.pvs.icD.Jd.vG.NOT_EQ);
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public Object pvs(Map<String, JSONObject> map) {
        Object pvs = this.pvs.pvs(map);
        Object pvs2 = this.icD.pvs(map);
        if (pvs == null && pvs2 == null) {
            return Boolean.FALSE;
        }
        if (pvs == null && pvs2 != null) {
            return Boolean.TRUE;
        }
        if (pvs != null && pvs2 == null) {
            return Boolean.TRUE;
        }
        if ((pvs instanceof Number) && (pvs2 instanceof Number)) {
            return Boolean.valueOf(!com.bytedance.adsdk.pvs.icD.NB.pvs.icD.pvs((Number) pvs, (Number) pvs2));
        }
        return Boolean.valueOf(!pvs.equals(pvs2));
    }
}
