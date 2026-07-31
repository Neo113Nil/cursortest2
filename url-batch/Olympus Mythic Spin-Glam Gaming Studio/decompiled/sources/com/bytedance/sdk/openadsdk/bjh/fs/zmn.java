package com.bytedance.sdk.openadsdk.bjh.fs;

import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zmn {
    private final int fs;
    private final int zmn;
    private final float zn;

    public zmn(int i, int i2, float f) {
        this.zmn = i;
        this.fs = i2;
        this.zn = f;
    }

    public static JSONObject zmn(zmn zmnVar) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", zmnVar.zmn);
        jSONObject.put("height", zmnVar.fs);
        jSONObject.put("alpha", zmnVar.zn);
        return jSONObject;
    }
}
