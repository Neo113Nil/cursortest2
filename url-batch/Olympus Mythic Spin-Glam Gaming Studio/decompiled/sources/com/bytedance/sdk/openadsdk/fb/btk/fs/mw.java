package com.bytedance.sdk.openadsdk.fb.btk.fs;

import com.bytedance.sdk.component.utils.iqz;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class mw extends zn {
    public int fs;
    public long zmn;
    public long zn;

    public void zmn(long j) {
        this.zmn = j;
    }

    public void zmn(int i) {
        this.fs = i;
    }

    public void fs(long j) {
        this.zn = j;
    }

    @Override // com.bytedance.sdk.openadsdk.fb.btk.fs.zn
    public void zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.zmn);
            jSONObject.put("buffers_count", this.fs);
            jSONObject.put("total_duration", this.zn);
        } catch (Throwable th) {
            iqz.zn("PlayBufferModel", th.getMessage());
        }
    }
}
