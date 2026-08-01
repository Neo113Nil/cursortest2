package com.bytedance.adsdk.ugeno.core;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: UGenEvent.java */
/* loaded from: classes.dex */
public class qh {
    private qh Jd;
    private qh NB;
    private int icD;
    private com.bytedance.adsdk.ugeno.component.icD pvs;
    private JSONObject vG;

    public com.bytedance.adsdk.ugeno.component.icD pvs() {
        return this.pvs;
    }

    public void pvs(com.bytedance.adsdk.ugeno.component.icD icd) {
        this.pvs = icd;
    }

    public int icD() {
        return this.icD;
    }

    public void pvs(int i) {
        this.icD = i;
    }

    public JSONObject vG() {
        return this.vG;
    }

    public void pvs(JSONObject jSONObject) {
        this.vG = jSONObject;
    }

    public qh Jd() {
        return this.Jd;
    }

    public void pvs(qh qhVar) {
        this.Jd = qhVar;
    }

    public void icD(qh qhVar) {
        this.NB = qhVar;
    }

    public String toString() {
        return "UGenEvent{mWidget=" + this.pvs + ", mEventType=" + this.icD + ", mEvent=" + this.vG + AbstractJsonLexerKt.END_OBJ;
    }
}
