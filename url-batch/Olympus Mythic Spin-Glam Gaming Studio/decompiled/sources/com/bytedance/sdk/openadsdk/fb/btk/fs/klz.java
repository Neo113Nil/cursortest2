package com.bytedance.sdk.openadsdk.fb.btk.fs;

import com.bytedance.sdk.component.utils.iqz;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class klz extends zn {
    private long fb;
    private long fs;
    private String zmn;
    private long zn;

    public void zmn(String str) {
        this.zmn = str;
    }

    public void zmn(long j) {
        this.fs = j;
    }

    public void fs(long j) {
        this.zn = j;
    }

    public void zn(long j) {
        this.fb = j;
    }

    @Override // com.bytedance.sdk.openadsdk.fb.btk.fs.zn
    public void zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.zmn);
            jSONObject.put("preload_size", this.fs);
            jSONObject.put("load_time", this.zn);
            jSONObject.put("local_cache", this.fb);
        } catch (Throwable th) {
            iqz.zn("LoadVideoSuccessModel", th.getMessage());
        }
    }
}
