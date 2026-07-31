package com.bytedance.sdk.openadsdk.fb.btk.fs;

import com.bytedance.sdk.component.utils.iqz;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class iv extends zn {
    private String btk;
    private int fb;
    private long fs;
    private String hhw;
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

    public void zmn(int i) {
        this.fb = i;
    }

    public void fs(String str) {
        this.btk = str;
    }

    public void zn(String str) {
        this.hhw = str;
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
            jSONObject.put("error_code", this.fb);
            jSONObject.put("error_message", this.btk);
            jSONObject.put("error_message_server", this.hhw);
        } catch (Throwable th) {
            iqz.zn("LoadVideoErrorModel", th.getMessage());
        }
    }
}
