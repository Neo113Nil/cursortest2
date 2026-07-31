package com.bytedance.sdk.openadsdk.fb.btk.fs;

import com.bytedance.sdk.component.utils.iqz;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class rt extends zn {
    private final String btk;
    private final int fb;
    private long fs;
    private long zmn;
    private final int zn;

    public rt(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zmn zmnVar) {
        this.zn = zmnVar.zmn();
        this.fb = zmnVar.fs();
        this.btk = zmnVar.zn();
    }

    public void zmn(long j) {
        this.zmn = j;
    }

    public void fs(long j) {
        this.fs = j;
    }

    @Override // com.bytedance.sdk.openadsdk.fb.btk.fs.zn
    public void zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.zmn);
            jSONObject.put("total_duration", this.fs);
            jSONObject.put("error_code", this.zn);
            jSONObject.put("extra_error_code", this.fb);
            jSONObject.put("error_message", this.btk);
        } catch (Throwable th) {
            iqz.zn("PlayErrorModel", th.getMessage());
        }
    }
}
