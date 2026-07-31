package com.bytedance.sdk.openadsdk.fb.btk.fs;

import com.bytedance.sdk.component.utils.iqz;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class zg extends zn {
    private int fb;
    private long fs;
    private final com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn zmn;
    private long zn;

    public zg(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar) {
        this.zmn = znVar;
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

    @Override // com.bytedance.sdk.openadsdk.fb.btk.fs.zn
    public void zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("video_start_duration", this.fs);
            jSONObject.put("video_cache_size", this.zn);
            jSONObject.put("is_auto_play", this.fb);
        } catch (Throwable th) {
            iqz.zn("FeedPlayModel", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.fb.btk.fs.zn
    public void zmn(zmn zmnVar) {
        if (this.zmn.rp()) {
            String btk = this.zmn.btk();
            String olo = this.zmn.olo();
            File fs = com.bykv.vk.openvk.zmn.zmn.fs.fb.fs.fs(btk, olo);
            File zn = com.bykv.vk.openvk.zmn.zmn.fs.fb.fs.zn(btk, olo);
            if (zn.exists()) {
                fs = zn;
            }
            try {
                zmnVar.fb().put("moov_box_pos", com.bykv.vk.openvk.zmn.zmn.zmn.nps.fb.zmn(fs));
            } catch (JSONException unused) {
            }
        }
    }
}
