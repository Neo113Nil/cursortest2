package com.bytedance.sdk.openadsdk.fb.btk.fs;

import com.bytedance.sdk.component.utils.iqz;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class btk extends zn {
    private long fs;
    private long zmn;

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
        } catch (Throwable th) {
            iqz.zn("FeedContinueModel", th.getMessage());
        }
    }
}
