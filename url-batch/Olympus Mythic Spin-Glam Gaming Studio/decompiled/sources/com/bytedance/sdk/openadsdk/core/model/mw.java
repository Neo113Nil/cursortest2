package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class mw {
    private String fs;
    private String zmn;
    private int zn;

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

    public int zn() {
        return this.zn;
    }

    public void zmn(int i) {
        this.zn = i;
    }

    @Nullable
    public JSONObject fb() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("u", this.zmn);
            jSONObject.put("ft", this.zn);
            jSONObject.put("fu", this.fs);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
