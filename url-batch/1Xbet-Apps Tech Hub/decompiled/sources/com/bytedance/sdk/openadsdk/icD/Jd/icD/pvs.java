package com.bytedance.sdk.openadsdk.icD.Jd.icD;

import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.vG;
import org.json.JSONObject;

/* compiled from: BaseEventModel.java */
/* loaded from: classes2.dex */
public class pvs<T extends vG> {
    private T Jd;
    private boolean NB = false;
    private String icD;
    private cR pvs;
    private JSONObject vG;

    public pvs(cR cRVar, String str, JSONObject jSONObject, T t) {
        this.pvs = cRVar;
        this.icD = str;
        this.vG = jSONObject;
        this.Jd = t;
    }

    public cR pvs() {
        return this.pvs;
    }

    public String icD() {
        return this.icD;
    }

    public JSONObject vG() {
        if (this.vG == null) {
            this.vG = new JSONObject();
        }
        return this.vG;
    }

    public T Jd() {
        return this.Jd;
    }

    public boolean NB() {
        return this.NB;
    }

    public void pvs(boolean z) {
        this.NB = z;
    }
}
