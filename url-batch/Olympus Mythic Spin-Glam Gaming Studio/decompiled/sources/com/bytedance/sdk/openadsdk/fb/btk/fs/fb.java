package com.bytedance.sdk.openadsdk.fb.btk.fs;

import com.bytedance.sdk.component.utils.iqz;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class fb extends zn {
    public int fb = 0;
    public long fs;
    public long zmn;
    public int zn;

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
            jSONObject.put("total_duration", this.zmn);
            jSONObject.put("buffers_time", this.fs);
            jSONObject.put("break_reason", this.zn);
            jSONObject.put("video_backup", this.fb);
        } catch (Throwable th) {
            iqz.zn("FeedBreakModel", th.getMessage());
        }
    }
}
