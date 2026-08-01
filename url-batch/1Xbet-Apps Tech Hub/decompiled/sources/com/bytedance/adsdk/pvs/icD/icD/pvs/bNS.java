package com.bytedance.adsdk.pvs.icD.icD.pvs;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: NumberNode.java */
/* loaded from: classes.dex */
public class bNS implements com.bytedance.adsdk.pvs.icD.icD.pvs {
    private Number pvs;

    public bNS(String str) {
        if (str.indexOf(46) >= 0) {
            Float valueOf = Float.valueOf(str);
            this.pvs = valueOf;
            if (Float.isInfinite(valueOf.floatValue())) {
                this.pvs = Double.valueOf(str);
                return;
            }
            return;
        }
        try {
            this.pvs = Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            this.pvs = Long.valueOf(str);
        }
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public Object pvs(Map<String, JSONObject> map) {
        return this.pvs;
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public com.bytedance.adsdk.pvs.icD.Jd.NB pvs() {
        return com.bytedance.adsdk.pvs.icD.Jd.sUS.NUMBER;
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public String icD() {
        return this.pvs.toString();
    }

    public String toString() {
        return icD();
    }
}
