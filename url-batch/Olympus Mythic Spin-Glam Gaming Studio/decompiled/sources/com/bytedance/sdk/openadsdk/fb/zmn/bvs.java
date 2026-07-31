package com.bytedance.sdk.openadsdk.fb.zmn;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class bvs implements com.bytedance.sdk.openadsdk.cyb.fs {
    private final boolean fs;
    private final com.bytedance.sdk.component.hhw.zmn.hhw.fb zmn;

    public bvs(boolean z, com.bytedance.sdk.component.hhw.zmn.hhw.fb fbVar) {
        this.zmn = fbVar;
        this.fs = z;
    }

    @Override // com.bytedance.sdk.openadsdk.cyb.fs
    @Nullable
    public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
        int i;
        if (this.zmn == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.fs);
        jSONObject.put("url", this.zmn.fs());
        int fb = this.zmn.fb();
        if (fb <= 0) {
            fb = 0;
        }
        jSONObject.put("retry_times", fb);
        jSONObject.put(CreativeInfo.c, this.zmn.hhw());
        jSONObject.put("track_type", this.zmn.btk());
        if (!this.fs) {
            i = 4;
        } else if (this.zmn.iv()) {
            i = 3;
        } else {
            i = this.zmn.fb() <= 0 ? 1 : 2;
        }
        jSONObject.put("upload_scene", i);
        String nps = this.zmn.nps();
        if (!TextUtils.isEmpty(nps)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : nps.split(StringUtils.COMMA)) {
                jSONArray.put(str);
            }
            jSONObject.put("error_code", jSONArray);
        }
        String bvs = this.zmn.bvs();
        if (!TextUtils.isEmpty(bvs)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : bvs.split(StringUtils.COMMA)) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        jSONObject.put("use_new_upload", this.zmn.klz());
        return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("track_link_result").fs(jSONObject.toString());
    }
}
