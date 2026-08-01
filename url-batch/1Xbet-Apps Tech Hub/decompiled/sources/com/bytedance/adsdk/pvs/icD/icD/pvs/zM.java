package com.bytedance.adsdk.pvs.icD.icD.pvs;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: QuestionNodeImpl.java */
/* loaded from: classes.dex */
public class zM implements com.bytedance.adsdk.pvs.icD.icD.icD {
    private com.bytedance.adsdk.pvs.icD.icD.pvs icD;
    private com.bytedance.adsdk.pvs.icD.icD.pvs pvs;
    private com.bytedance.adsdk.pvs.icD.icD.pvs vG;

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public Object pvs(Map<String, JSONObject> map) {
        Object pvs = this.pvs.pvs(map);
        if (pvs == null) {
            return null;
        }
        if (((Boolean) pvs).booleanValue()) {
            return this.icD.pvs(map);
        }
        return this.vG.pvs(map);
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public com.bytedance.adsdk.pvs.icD.Jd.NB pvs() {
        return com.bytedance.adsdk.pvs.icD.Jd.sUS.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.icD
    public void pvs(com.bytedance.adsdk.pvs.icD.icD.pvs pvsVar) {
        this.pvs = pvsVar;
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.icD
    public void icD(com.bytedance.adsdk.pvs.icD.icD.pvs pvsVar) {
        this.icD = pvsVar;
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.icD
    public void vG(com.bytedance.adsdk.pvs.icD.icD.pvs pvsVar) {
        this.vG = pvsVar;
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public String icD() {
        return this.pvs.icD() + "?" + this.icD.icD() + ":" + this.vG.icD();
    }

    public String toString() {
        return icD();
    }
}
