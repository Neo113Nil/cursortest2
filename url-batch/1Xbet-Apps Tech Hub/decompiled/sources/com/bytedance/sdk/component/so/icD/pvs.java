package com.bytedance.sdk.component.so.icD;

import org.json.JSONObject;

/* compiled from: ThreadLogModel.java */
/* loaded from: classes.dex */
public class pvs {
    public int Jd;
    public int icD;
    public int pvs;
    public int vG;

    public pvs(int i, int i2, int i3, int i4) {
        this.pvs = i;
        this.icD = i2;
        this.vG = i3;
        this.Jd = i4;
    }

    public JSONObject pvs() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.pvs);
            jSONObject.put("sdk_max_thread_num", this.icD);
            jSONObject.put("app_thread_num", this.vG);
            jSONObject.put("app_max_thread_num", this.Jd);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
