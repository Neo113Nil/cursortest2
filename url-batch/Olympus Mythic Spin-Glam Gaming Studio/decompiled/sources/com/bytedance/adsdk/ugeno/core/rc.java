package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class rc {
    private Map<String, Object> fb;
    private JSONObject fs;
    private Context zmn;
    private JSONObject zn;

    public void zmn(Context context) {
        this.zmn = context;
    }

    public void zmn(JSONObject jSONObject) {
        this.fs = jSONObject;
    }

    public JSONObject zmn() {
        return this.zn;
    }

    public void fs(JSONObject jSONObject) {
        this.zn = jSONObject;
    }

    public Map<String, Object> fs() {
        return this.fb;
    }

    public void zmn(Map<String, Object> map) {
        this.fb = map;
    }
}
