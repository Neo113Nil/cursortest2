package com.bytedance.adsdk.pvs.icD.icD.pvs;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: StringNode.java */
/* loaded from: classes.dex */
public class uc implements com.bytedance.adsdk.pvs.icD.icD.pvs {
    private final String pvs;

    public uc(String str) {
        this.pvs = str;
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public Object pvs(Map<String, JSONObject> map) {
        return this.pvs;
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public com.bytedance.adsdk.pvs.icD.Jd.NB pvs() {
        return com.bytedance.adsdk.pvs.icD.Jd.sUS.STRING;
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public String icD() {
        return "'" + this.pvs + "'";
    }

    public String toString() {
        return icD();
    }
}
