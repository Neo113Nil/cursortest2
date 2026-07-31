package com.bytedance.adsdk.zmn;

import com.bytedance.adsdk.ugeno.zn.zmn;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zn implements com.bytedance.adsdk.ugeno.zn.zmn {
    @Override // com.bytedance.adsdk.ugeno.zn.zmn
    public zmn.InterfaceC0118zmn zmn(String str) {
        return zmn.zmn(str);
    }

    static class zmn implements zmn.InterfaceC0118zmn {
        private String fs;
        private com.bytedance.adsdk.zmn.fs.zmn zmn;

        private zmn(String str) {
            this.fs = str;
            this.zmn = com.bytedance.adsdk.zmn.fs.zmn.zmn(str);
        }

        public static zmn zmn(String str) {
            return new zmn(str);
        }

        @Override // com.bytedance.adsdk.ugeno.zn.zmn.InterfaceC0118zmn
        public Object zmn(JSONObject jSONObject) {
            com.bytedance.adsdk.zmn.fs.zmn zmnVar = this.zmn;
            if (zmnVar == null) {
                return this.fs;
            }
            Object zmn = zmnVar.zmn(jSONObject);
            if (zmn instanceof String) {
                return zmn;
            }
            if (zmn instanceof com.bytedance.adsdk.zmn.fs.zmn.zmn) {
                return String.valueOf(olo.zmn((com.bytedance.adsdk.zmn.fs.zmn.zmn) zmn));
            }
            if (zmn != null && zmn.getClass().isArray()) {
                try {
                    return new JSONArray(zmn).toString();
                } catch (JSONException unused) {
                    return String.valueOf(zmn);
                }
            }
            return String.valueOf(zmn);
        }
    }
}
