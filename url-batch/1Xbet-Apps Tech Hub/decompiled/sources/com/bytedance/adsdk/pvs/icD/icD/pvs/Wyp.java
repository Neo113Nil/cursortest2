package com.bytedance.adsdk.pvs.icD.icD.pvs;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: MethodNode.java */
/* loaded from: classes.dex */
public class Wyp implements com.bytedance.adsdk.pvs.icD.icD.pvs {
    private String icD;
    private com.bytedance.adsdk.pvs.icD.icD.pvs[] pvs;
    private com.bytedance.adsdk.pvs.icD.pvs.pvs vG;

    public Wyp(String str) {
        this.icD = str;
    }

    public void pvs(com.bytedance.adsdk.pvs.icD.icD.pvs[] pvsVarArr) {
        this.pvs = pvsVarArr;
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public Object pvs(Map<String, JSONObject> map) {
        com.bytedance.adsdk.pvs.icD.pvs.pvs pvsVar = new com.bytedance.adsdk.pvs.icD.pvs.pvs();
        this.vG = pvsVar;
        pvsVar.pvs(this.icD);
        Object[] objArr = new Object[this.pvs.length];
        int i = 0;
        while (true) {
            com.bytedance.adsdk.pvs.icD.icD.pvs[] pvsVarArr = this.pvs;
            if (i < pvsVarArr.length) {
                com.bytedance.adsdk.pvs.icD.icD.pvs pvsVar2 = pvsVarArr[i];
                if (pvsVar2 != null) {
                    objArr[i] = pvsVar2.pvs(map);
                }
                i++;
            } else {
                this.vG.pvs(objArr);
                return this.vG;
            }
        }
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public com.bytedance.adsdk.pvs.icD.Jd.NB pvs() {
        return com.bytedance.adsdk.pvs.icD.Jd.icD.METHOD;
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public String icD() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.icD).append("(");
        com.bytedance.adsdk.pvs.icD.icD.pvs[] pvsVarArr = this.pvs;
        if (pvsVarArr != null && pvsVarArr.length > 0) {
            int i = 0;
            while (true) {
                com.bytedance.adsdk.pvs.icD.icD.pvs[] pvsVarArr2 = this.pvs;
                if (i >= pvsVarArr2.length) {
                    break;
                }
                sb.append(pvsVarArr2[i].icD()).append(",");
                i++;
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
