package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* loaded from: classes5.dex */
public class doe {
    private String zmn = "horizontal";
    private int fs = 1;
    private int zn = 1;
    private int fb = 0;
    private int btk = 0;
    private int hhw = 0;
    private int nps = 0;
    private int zg = 5000;
    private int bvs = 500;
    private int iv = 0;

    public String zmn() {
        return this.zmn;
    }

    public int fs() {
        return this.fs;
    }

    public int zn() {
        return this.zn;
    }

    public int fb() {
        return this.fb;
    }

    public int btk() {
        return this.btk;
    }

    public int hhw() {
        return this.hhw;
    }

    public int nps() {
        return this.nps;
    }

    public int zg() {
        return this.zg;
    }

    public int bvs() {
        return this.bvs;
    }

    public int iv() {
        return this.iv;
    }

    public static doe zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new doe();
        }
        doe doeVar = new doe();
        doeVar.zmn = jSONObject.optString("direction", "horizontal");
        doeVar.fs = jSONObject.optInt("auto_loop", 1);
        doeVar.zn = jSONObject.optInt("allow_manual_loop", 1);
        doeVar.fb = jSONObject.optInt("unlimited_loop", 0);
        doeVar.btk = jSONObject.optInt("left_margin", 0);
        doeVar.hhw = jSONObject.optInt("right_margin", 0);
        doeVar.nps = jSONObject.optInt("ad_margin", 0);
        doeVar.zg = jSONObject.optInt("loop_interval_time", 5000);
        doeVar.bvs = jSONObject.optInt("flip_speed", 500);
        doeVar.iv = jSONObject.optInt("stop_auto_loop", 0);
        return doeVar;
    }
}
