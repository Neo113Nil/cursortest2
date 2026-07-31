package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class ev {
    private JSONObject btk;
    private String fb;
    private String fs;
    private zmn hhw;
    private String zmn;
    private String zn;

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
        return this.fb;
    }

    public JSONObject btk() {
        return this.btk;
    }

    public zmn hhw() {
        return this.hhw;
    }

    public static ev zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ev evVar = new ev();
        evVar.zmn = jSONObject.optString("id");
        evVar.fb = jSONObject.optString("data");
        evVar.zn = jSONObject.optString("url");
        evVar.fs = jSONObject.optString("md5");
        evVar.btk = jSONObject.optJSONObject("custom_components");
        JSONObject optJSONObject = jSONObject.optJSONObject("preload");
        if (optJSONObject != null) {
            evVar.hhw = zmn.zmn(optJSONObject);
        }
        return evVar;
    }

    public static class zmn {
        private JSONArray fs;
        private JSONArray zmn;
        private JSONArray zn;

        public JSONArray zmn() {
            return this.zmn;
        }

        public void zmn(JSONArray jSONArray) {
            this.zmn = jSONArray;
        }

        public JSONArray fs() {
            return this.fs;
        }

        public void fs(JSONArray jSONArray) {
            this.fs = jSONArray;
        }

        public JSONArray zn() {
            return this.zn;
        }

        public void zn(JSONArray jSONArray) {
            this.zn = jSONArray;
        }

        public static zmn zmn(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("image");
            zmn zmnVar = new zmn();
            zmnVar.zmn(optJSONArray);
            zmnVar.fs(jSONObject.optJSONArray("fetch"));
            zmnVar.zn(jSONObject.optJSONArray("script"));
            return zmnVar;
        }
    }
}
