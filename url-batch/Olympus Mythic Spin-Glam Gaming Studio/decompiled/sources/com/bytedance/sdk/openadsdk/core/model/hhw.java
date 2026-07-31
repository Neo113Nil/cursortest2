package com.bytedance.sdk.openadsdk.core.model;

import com.facebook.internal.NativeProtocol;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class hhw {
    private int nps;
    private String zmn = "";
    private String fs = "";
    private String zn = "";
    private String fb = "";
    private double btk = -1.0d;
    private int hhw = -1;

    public String zmn() {
        return this.zmn;
    }

    public void zmn(String str) {
        this.zmn = str;
    }

    public String fs() {
        return this.fs;
    }

    public void fs(String str) {
        this.fs = str;
    }

    public String zn() {
        return this.zn;
    }

    public void zn(String str) {
        this.zn = str;
    }

    public double fb() {
        return this.btk;
    }

    public void zmn(double d) {
        if (d < 1.0d || d > 5.0d) {
            this.btk = -1.0d;
        } else {
            this.btk = d;
        }
    }

    public int btk() {
        return this.hhw;
    }

    public void zmn(int i) {
        if (i <= 0) {
            this.hhw = -1;
        } else {
            this.hhw = i;
        }
    }

    public int hhw() {
        return this.nps;
    }

    public void fs(int i) {
        this.nps = i;
    }

    public String nps() {
        return this.fb;
    }

    public void fb(String str) {
        this.fb = str;
    }

    public JSONObject zg() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, fs());
            jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, hhw());
            jSONObject.put("comment_num", btk());
            jSONObject.put(DownloadModel.DOWNLOAD_URL, zmn());
            jSONObject.put("package_name", zn());
            jSONObject.put("score", fb());
            jSONObject.put("app_category", nps());
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.iqz.zn(e.toString(), new Object[0]);
        }
        return jSONObject;
    }
}
