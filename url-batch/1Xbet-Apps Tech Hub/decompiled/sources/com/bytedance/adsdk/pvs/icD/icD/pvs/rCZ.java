package com.bytedance.adsdk.pvs.icD.icD.pvs;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: SymbolNode.java */
/* loaded from: classes.dex */
public class rCZ implements com.bytedance.adsdk.pvs.icD.icD.pvs {
    private com.bytedance.adsdk.pvs.icD.Jd.Jd pvs;

    public rCZ(com.bytedance.adsdk.pvs.icD.Jd.Jd jd) {
        this.pvs = jd;
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public Object pvs(Map<String, JSONObject> map) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public com.bytedance.adsdk.pvs.icD.Jd.NB pvs() {
        return this.pvs;
    }

    public String toString() {
        return icD();
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public String icD() {
        return this.pvs.pvs();
    }
}
