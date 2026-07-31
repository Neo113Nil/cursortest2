package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public class uqh {
    private final int fb;
    private final int fs;
    private final int zmn;
    private final int zn;

    public uqh(JSONObject jSONObject) {
        this.zmn = jSONObject.optInt("max_time", 0);
        this.fs = jSONObject.optInt("auto_skip_time", -1);
        this.zn = jSONObject.optInt("show_after_inactivity", 10);
        this.fb = jSONObject.optInt("user_wait_time", 10);
    }

    public int zmn() {
        return this.zmn;
    }

    public int fs() {
        return this.zn;
    }

    public int zn() {
        return this.fb;
    }
}
