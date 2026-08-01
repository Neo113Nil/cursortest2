package com.bytedance.adsdk.pvs.icD.icD.pvs;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: DoubleAmpNode.java */
/* loaded from: classes.dex */
public class icD extends vA {
    public icD() {
        super(com.bytedance.adsdk.pvs.icD.Jd.vG.DOUBLE_AMP);
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public Object pvs(Map<String, JSONObject> map) {
        return Boolean.valueOf(com.bytedance.adsdk.pvs.icD.NB.icD.pvs(this.pvs.pvs(map)) && com.bytedance.adsdk.pvs.icD.NB.icD.pvs(this.icD.pvs(map)));
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs.vA
    public String toString() {
        return icD();
    }
}
