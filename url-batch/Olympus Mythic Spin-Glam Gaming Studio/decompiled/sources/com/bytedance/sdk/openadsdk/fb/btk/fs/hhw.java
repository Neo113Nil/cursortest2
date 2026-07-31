package com.bytedance.sdk.openadsdk.fb.btk.fs;

import android.os.SystemClock;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.utils.iqz;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class hhw extends zn {
    private int fb = 0;
    private long fs;
    private final com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn zmn;
    private long zn;

    public hhw(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar) {
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
            jSONObject.put("total_duration", this.fs);
            jSONObject.put("buffers_time", this.zn);
            jSONObject.put("video_backup", this.fb);
        } catch (Throwable th) {
            iqz.zn("FeedOverModel", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.fb.btk.fs.zn
    public void zmn(zmn zmnVar) {
        super.zmn(zmnVar);
        JSONObject fb = zmnVar.fb();
        if (com.bytedance.sdk.openadsdk.uqh.btk.zmn("re_vi_en_le", 0) != 1) {
            return;
        }
        File file = new File(this.zmn.btk(), this.zmn.olo());
        if (file.exists()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                fb.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, com.bykv.vk.openvk.zmn.zmn.zmn.nps.fb.zmn(file.getAbsolutePath()));
                fb.put("level_cost_time", SystemClock.elapsedRealtime() - elapsedRealtime);
            } catch (JSONException unused) {
            }
        }
    }
}
