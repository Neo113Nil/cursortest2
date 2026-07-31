package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class fs {
    private String btk;
    private String fb;
    private String fs;
    private boolean hhw;
    private String zmn;
    private String zn;

    public void zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.zmn = jSONObject.optString("icon");
        this.fs = jSONObject.optString("text");
        this.zn = jSONObject.optString(CampaignEx.JSON_KEY_PRIVACY_URL);
        this.fb = jSONObject.optString("privacy_title");
        this.btk = jSONObject.optString("iab_privacy_bar_text");
    }

    public String zmn() {
        return this.zmn;
    }

    public String fs() {
        return this.fs;
    }

    public String zn() {
        return this.zn;
    }

    public String fb() {
        return this.btk;
    }

    public String btk() {
        return this.fb;
    }

    public boolean hhw() {
        return this.hhw;
    }

    public void zmn(boolean z) {
        this.hhw = z;
    }

    public JSONObject nps() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_PRIVACY_URL, this.zn);
            jSONObject.put("privacy_title", this.fb);
            jSONObject.put("text", this.fs);
            jSONObject.put("icon", this.zmn);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
