package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class rp {
    private String fb = "Next Ad";
    private int fs;
    private int zmn;
    private int zn;

    public int zmn() {
        return this.zn;
    }

    public void zmn(int i) {
        this.zn = i;
    }

    public int fs() {
        return this.fs;
    }

    public void fs(int i) {
        this.fs = i;
    }

    public String zn() {
        return this.fb;
    }

    public void zmn(String str) {
        this.fb = str;
    }

    public int fb() {
        return this.zmn;
    }

    public void zn(int i) {
        this.zmn = i;
    }

    public static rp zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        rp rpVar = new rp();
        try {
            int max = Math.max(jSONObject.optInt("endcard_show_time", 0), 0);
            int optInt = jSONObject.optInt("is_allow_pause", 0);
            int optInt2 = jSONObject.optInt(CampaignEx.JSON_KEY_LANDING_TYPE, 0);
            String optString = jSONObject.optString("endcard_next_ad_text", "Next Ad");
            rpVar.zn(max);
            rpVar.fs(optInt);
            rpVar.zmn(optString);
            rpVar.zmn(optInt2);
        } catch (Throwable unused) {
        }
        return rpVar;
    }
}
