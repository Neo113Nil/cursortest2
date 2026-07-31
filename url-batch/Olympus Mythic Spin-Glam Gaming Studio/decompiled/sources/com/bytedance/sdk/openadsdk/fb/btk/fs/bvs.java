package com.bytedance.sdk.openadsdk.fb.btk.fs;

import com.bytedance.sdk.component.utils.iqz;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class bvs extends zn {
    private final long fs;
    private final String zmn;

    public bvs(String str, long j) {
        this.zmn = str;
        this.fs = j;
    }

    @Override // com.bytedance.sdk.openadsdk.fb.btk.fs.zn
    public void zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.zmn);
            jSONObject.put("preload_size", this.fs);
        } catch (Throwable th) {
            iqz.zn("LoadVideoCancelModel", th.getMessage());
        }
    }
}
