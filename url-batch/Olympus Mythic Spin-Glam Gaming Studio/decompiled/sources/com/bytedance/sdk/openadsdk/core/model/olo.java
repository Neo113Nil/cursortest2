package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class olo {
    private zmn fs;
    private zmn zmn;

    public olo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("easy_playable");
        if (optJSONObject != null) {
            this.zmn = new zmn(optJSONObject.optJSONObject("components"));
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("popup");
        if (optJSONObject2 != null) {
            this.fs = new zmn(optJSONObject2.optJSONObject("components"));
        }
    }

    public static boolean zmn(nqi nqiVar) {
        return zmn(nqiVar, false);
    }

    public static boolean zmn(nqi nqiVar, boolean z) {
        olo vv;
        if (nqiVar == null || (vv = nqiVar.vv()) == null) {
            return false;
        }
        if (z) {
            zmn zmnVar = vv.fs;
            return zmnVar != null && zmnVar.zmn();
        }
        zmn zmnVar2 = vv.zmn;
        return zmnVar2 != null && zmnVar2.zmn();
    }

    public static zmn fs(nqi nqiVar) {
        olo vv;
        if (nqiVar == null || (vv = nqiVar.vv()) == null) {
            return null;
        }
        return vv.fs;
    }

    public static zmn zn(nqi nqiVar) {
        olo vv;
        if (nqiVar == null || (vv = nqiVar.vv()) == null) {
            return null;
        }
        return vv.zmn;
    }

    public static class zmn {
        C0165zmn fs;
        C0165zmn zmn;

        public zmn(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            if (jSONObject.has("vertical")) {
                this.zmn = new C0165zmn(jSONObject.optJSONObject("vertical"));
            }
            if (jSONObject.has("horizontal")) {
                this.fs = new C0165zmn(jSONObject.optJSONObject("horizontal"));
            }
        }

        public boolean zmn() {
            C0165zmn c0165zmn = this.fs;
            if (c0165zmn != null && c0165zmn.zmn()) {
                return true;
            }
            C0165zmn c0165zmn2 = this.zmn;
            return c0165zmn2 != null && c0165zmn2.zmn();
        }

        public String zmn(boolean z) {
            if (z) {
                C0165zmn c0165zmn = this.zmn;
                if (c0165zmn != null) {
                    return c0165zmn.zmn;
                }
                return "";
            }
            C0165zmn c0165zmn2 = this.fs;
            if (c0165zmn2 != null) {
                return c0165zmn2.zmn;
            }
            return "";
        }

        /* renamed from: com.bytedance.sdk.openadsdk.core.model.olo$zmn$zmn, reason: collision with other inner class name */
        public static class C0165zmn {
            String zmn;

            public C0165zmn(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return;
                }
                this.zmn = jSONObject.optString("entry");
            }

            public boolean zmn() {
                return !TextUtils.isEmpty(this.zmn);
            }
        }
    }
}
