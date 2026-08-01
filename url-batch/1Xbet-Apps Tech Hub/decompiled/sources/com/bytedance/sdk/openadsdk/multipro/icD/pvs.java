package com.bytedance.sdk.openadsdk.multipro.icD;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.json.JSONObject;

/* compiled from: VideoControllerDataModel.java */
/* loaded from: classes2.dex */
public class pvs {
    public boolean Jd;
    public long NB;
    public boolean icD;
    public boolean pvs;
    public long sUS;
    public boolean vG;
    public long yiw;

    /* compiled from: VideoControllerDataModel.java */
    /* renamed from: com.bytedance.sdk.openadsdk.multipro.icD.pvs$pvs, reason: collision with other inner class name */
    public interface InterfaceC0092pvs {
        pvs sUS();
    }

    public pvs pvs(boolean z) {
        this.Jd = z;
        return this;
    }

    public pvs icD(boolean z) {
        this.pvs = z;
        return this;
    }

    public pvs vG(boolean z) {
        this.icD = z;
        return this;
    }

    public pvs Jd(boolean z) {
        this.vG = z;
        return this;
    }

    public pvs pvs(long j) {
        this.NB = j;
        return this;
    }

    public pvs icD(long j) {
        this.sUS = j;
        return this;
    }

    public pvs vG(long j) {
        this.yiw = j;
        return this;
    }

    public JSONObject pvs() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.pvs);
            jSONObject.put("isFromVideoDetailPage", this.icD);
            jSONObject.put("isFromDetailPage", this.vG);
            jSONObject.put(TypedValues.TransitionType.S_DURATION, this.NB);
            jSONObject.put("totalPlayDuration", this.sUS);
            jSONObject.put("currentPlayPosition", this.yiw);
            jSONObject.put("isAutoPlay", this.Jd);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static pvs pvs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        pvs pvsVar = new pvs();
        pvsVar.icD(jSONObject.optBoolean("isCompleted"));
        pvsVar.vG(jSONObject.optBoolean("isFromVideoDetailPage"));
        pvsVar.Jd(jSONObject.optBoolean("isFromDetailPage"));
        pvsVar.pvs(jSONObject.optLong(TypedValues.TransitionType.S_DURATION));
        pvsVar.icD(jSONObject.optLong("totalPlayDuration"));
        pvsVar.vG(jSONObject.optLong("currentPlayPosition"));
        pvsVar.pvs(jSONObject.optBoolean("isAutoPlay"));
        return pvsVar;
    }
}
