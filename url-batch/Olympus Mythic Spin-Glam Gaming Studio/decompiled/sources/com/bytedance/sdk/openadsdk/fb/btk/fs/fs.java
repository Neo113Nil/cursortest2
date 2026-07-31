package com.bytedance.sdk.openadsdk.fb.btk.fs;

import com.bytedance.sdk.component.utils.iqz;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class fs extends zn {
    private int fb;
    private long fs;
    private long zmn;
    private int zn;

    public void zmn(long j) {
        this.zmn = j;
    }

    public void fs(long j) {
        this.fs = j;
    }

    public void zmn(int i) {
        this.zn = i;
    }

    public void fs(int i) {
        this.fb = i;
    }

    @Override // com.bytedance.sdk.openadsdk.fb.btk.fs.zn
    public void zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.zmn);
            jSONObject.put("total_duration", this.fs);
            jSONObject.put("vbtt_skip_type", this.zn);
            jSONObject.put("skip_reason", this.fb);
        } catch (Throwable th) {
            iqz.zn("EndcardSkipModel", th.getMessage());
        }
    }
}
