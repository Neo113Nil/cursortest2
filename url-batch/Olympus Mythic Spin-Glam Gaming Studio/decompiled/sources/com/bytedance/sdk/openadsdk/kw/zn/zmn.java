package com.bytedance.sdk.openadsdk.kw.zn;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class zmn {
    public long btk;
    public boolean fb;
    public boolean fs;
    public long hhw;
    public long nps;
    public boolean zmn;
    public boolean zn;

    /* renamed from: com.bytedance.sdk.openadsdk.kw.zn.zmn$zmn, reason: collision with other inner class name */
    public interface InterfaceC0200zmn {
        zmn hhw();
    }

    public zmn zmn(boolean z) {
        this.fb = z;
        return this;
    }

    public zmn fs(boolean z) {
        this.zmn = z;
        return this;
    }

    public zmn zn(boolean z) {
        this.fs = z;
        return this;
    }

    public zmn fb(boolean z) {
        this.zn = z;
        return this;
    }

    public zmn zmn(long j) {
        this.btk = j;
        return this;
    }

    public zmn fs(long j) {
        this.hhw = j;
        return this;
    }

    public zmn zn(long j) {
        this.nps = j;
        return this;
    }

    public JSONObject zmn() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.zmn);
            jSONObject.put("isFromVideoDetailPage", this.fs);
            jSONObject.put("isFromDetailPage", this.zn);
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, this.btk);
            jSONObject.put("totalPlayDuration", this.hhw);
            jSONObject.put("currentPlayPosition", this.nps);
            jSONObject.put("isAutoPlay", this.fb);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static zmn zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        zmn zmnVar = new zmn();
        zmnVar.fs(jSONObject.optBoolean("isCompleted"));
        zmnVar.zn(jSONObject.optBoolean("isFromVideoDetailPage"));
        zmnVar.fb(jSONObject.optBoolean("isFromDetailPage"));
        zmnVar.zmn(jSONObject.optLong(IronSourceConstants.EVENTS_DURATION));
        zmnVar.fs(jSONObject.optLong("totalPlayDuration"));
        zmnVar.zn(jSONObject.optLong("currentPlayPosition"));
        zmnVar.zmn(jSONObject.optBoolean("isAutoPlay"));
        return zmnVar;
    }
}
