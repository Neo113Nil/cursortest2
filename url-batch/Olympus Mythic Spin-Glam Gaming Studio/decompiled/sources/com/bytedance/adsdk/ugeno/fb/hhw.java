package com.bytedance.adsdk.ugeno.fb;

import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class hhw {
    private List<zmn> fs;
    private zmn zmn;
    private boolean zn = false;
    private int fb = 0;

    public zmn zmn() {
        return this.zmn;
    }

    public List<zmn> fs() {
        return this.fs;
    }

    public boolean zn() {
        return this.zn;
    }

    public int fb() {
        return this.fb;
    }

    public static class zmn {
        private Map<String, Object> btk;
        private String fb;
        private String fs;
        private Map<String, Object> hhw;
        private String zmn;
        private String zn = "global";

        public String zmn() {
            return this.zn;
        }

        public void zmn(String str) {
            this.zn = str;
        }

        public String fs() {
            return this.fb;
        }

        public void fs(String str) {
            this.fb = str;
        }

        public Map<String, Object> zn() {
            return this.btk;
        }

        public void zmn(Map<String, Object> map) {
            this.btk = map;
        }

        public void zn(String str) {
            this.zmn = str;
        }

        public String fb() {
            return this.zmn;
        }

        public void fb(String str) {
            this.fs = str;
        }

        public String btk() {
            return this.fs;
        }

        public void fs(Map<String, Object> map) {
            this.hhw = map;
        }

        public String toString() {
            return "Action{scheme='" + this.zn + "', name='" + this.fb + "', params=" + this.btk + ", host='" + this.fs + "', origin='" + this.zmn + "', extra=" + this.hhw + '}';
        }
    }

    public static hhw zmn(JSONObject jSONObject, JSONObject jSONObject2) {
        zmn zmn2;
        zmn zmn3;
        if (jSONObject == null) {
            return null;
        }
        hhw hhwVar = new hhw();
        Object opt = jSONObject.opt("on");
        JSONArray optJSONArray = jSONObject.optJSONArray("handlers");
        if (opt instanceof String) {
            zmn2 = klz.zmn((String) opt, jSONObject2);
        } else {
            zmn2 = opt instanceof JSONObject ? klz.zmn((JSONObject) opt, jSONObject2) : null;
        }
        if (zmn2 != null) {
            hhwVar.zmn = zmn2;
        }
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            Object opt2 = optJSONArray.opt(i);
            if (opt2 instanceof String) {
                zmn zmn4 = klz.zmn((String) opt2, jSONObject2);
                if (zmn4 != null) {
                    arrayList.add(zmn4);
                }
            } else if ((opt2 instanceof JSONObject) && (zmn3 = klz.zmn((JSONObject) opt2, jSONObject2)) != null) {
                arrayList.add(zmn3);
            }
        }
        hhwVar.fs = arrayList;
        if (jSONObject.has(POBCTAOverlayData.KEY_CTA_DELAY)) {
            hhwVar.fb = com.bytedance.adsdk.ugeno.nps.zn.zmn(com.bytedance.adsdk.ugeno.zn.fs.zmn(jSONObject.optString(POBCTAOverlayData.KEY_CTA_DELAY), jSONObject2), 0);
        }
        if (jSONObject.has("disable")) {
            hhwVar.zn = com.bytedance.adsdk.ugeno.nps.zn.zmn(com.bytedance.adsdk.ugeno.zn.fs.zmn(jSONObject.optString("disable"), jSONObject2), false);
        }
        return hhwVar;
    }
}
