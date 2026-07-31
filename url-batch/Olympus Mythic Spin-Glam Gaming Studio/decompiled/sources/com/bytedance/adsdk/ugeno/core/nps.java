package com.bytedance.adsdk.ugeno.core;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class nps {
    private String btk;
    private float bvs;
    private JSONObject fb;
    private JSONObject fs;
    private JSONObject hhw;
    private boolean iv;
    private boolean nps;
    private float zg;
    private JSONObject zmn;
    private String zn;

    public nps(JSONObject jSONObject, JSONObject jSONObject2) {
        this(jSONObject, jSONObject2, null);
    }

    public nps(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject optJSONObject;
        this.iv = true;
        if (jSONObject != null) {
            if (jSONObject.has("body")) {
                this.zmn = jSONObject.optJSONObject("body");
            } else {
                this.zmn = jSONObject.optJSONObject("main_template");
            }
            this.fs = jSONObject.optJSONObject("sub_templates");
            if (jSONObject.has(Constants.REFERRER_API_META)) {
                optJSONObject = jSONObject.optJSONObject(Constants.REFERRER_API_META);
            } else {
                optJSONObject = jSONObject.optJSONObject("template_info");
            }
            if (optJSONObject != null) {
                if (jSONObject.has("body")) {
                    this.nps = true;
                    String optString = optJSONObject.optString("version");
                    this.zn = optString;
                    if (TextUtils.isEmpty(optString)) {
                        this.zn = "3.0";
                    }
                } else {
                    this.zn = optJSONObject.optString("sdk_version");
                }
                if (optJSONObject.has("adType")) {
                    this.btk = optJSONObject.optString("adType");
                }
                if (optJSONObject.has("gestureThrough")) {
                    this.iv = com.bytedance.adsdk.ugeno.nps.zn.zmn(optJSONObject.optString("gestureThrough"), true);
                }
            } else if (jSONObject.has("body")) {
                this.zn = "3.0";
                this.nps = true;
            }
            this.fb = jSONObject2;
            this.hhw = jSONObject3;
        }
    }

    public zmn zmn() {
        return btk();
    }

    public void zmn(float f, float f2) {
        this.zg = f;
        this.bvs = f2;
    }

    private zmn btk() {
        if (!fb()) {
            return zmn(this.zmn, (zmn) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("flexDirection", "row");
            jSONObject.put("justifyContent", "flex_start");
            jSONObject.put("alignItems", "flex_start");
            jSONObject.put("clickable", false);
            jSONObject.put("width", "match_parent");
            jSONObject.put("height", "wrap_content");
            float f = this.zg;
            if (f > 0.0f) {
                jSONObject.put("width", f);
            }
            float f2 = this.bvs;
            if (f2 > 0.0f) {
                jSONObject.put("height", f2);
            }
            JSONObject jSONObject2 = this.fb;
            if (jSONObject2 != null) {
                String optString = jSONObject2.optString("xSize");
                if (!TextUtils.isEmpty(optString)) {
                    JSONObject jSONObject3 = new JSONObject(optString);
                    if (jSONObject3.optInt("width") > 0) {
                        jSONObject.put("width", jSONObject3.optInt("width"));
                    }
                    if (jSONObject3.optInt("height") > 0) {
                        jSONObject.put("height", jSONObject3.optInt("height"));
                    }
                }
            }
        } catch (JSONException unused) {
        }
        zmn zmnVar = new zmn();
        zmnVar.fs = "View";
        zmnVar.zmn = "virtualNode";
        zmnVar.zn = jSONObject;
        zmnVar.hhw = null;
        zmnVar.nps = this.zn;
        zmnVar.bvs = this.iv;
        zmnVar.zg = this.btk;
        zmnVar.zmn(zmn(this.zmn, zmnVar));
        return zmnVar;
    }

    public String fs() {
        return this.zn;
    }

    public List<zmn> zn() {
        if (this.fs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = this.fs.keys();
        while (keys.hasNext()) {
            zmn zmn2 = zmn(this.fs.optJSONObject(keys.next()), (zmn) null);
            if (zmn2 != null) {
                arrayList.add(zmn2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zmn zmn(JSONObject jSONObject, zmn zmnVar) {
        String optString;
        String optString2;
        zmn zmn2;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.has("type")) {
            optString = jSONObject.optString("type");
        } else {
            optString = jSONObject.optString("name");
        }
        String optString3 = jSONObject.optString("id");
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.equals(next, "children")) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
        zmn zmnVar2 = new zmn();
        zmnVar2.zmn = optString3;
        if (this.nps && TextUtils.equals(VastTagName.VIDEO, optString)) {
            zmnVar2.fs = optString + "V3";
        } else {
            zmnVar2.fs = optString;
        }
        zmnVar2.zn = jSONObject2;
        zmnVar2.hhw = zmnVar;
        zmnVar2.nps = this.zn;
        zmnVar2.bvs = this.iv;
        zmnVar2.zg = this.btk;
        if (jSONObject2.has("i18n")) {
            zmnVar2.fb = jSONObject2.optJSONObject("i18n");
        }
        if (TextUtils.equals(optString, "CustomComponent")) {
            zmn(jSONObject, zmnVar2.zn);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("children");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int i = 0;
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                if (jSONObject.has("type")) {
                    optString2 = jSONObject.optString("type");
                } else {
                    optString2 = jSONObject.optString("name");
                }
                String zmn3 = com.bytedance.adsdk.ugeno.zn.fs.zmn(optJSONObject.optString("id"), this.fb);
                if (TextUtils.equals(optString2, "Template")) {
                    JSONObject jSONObject3 = this.fs;
                    if (jSONObject3 != null) {
                        optJSONObject = jSONObject3.optJSONObject(zmn3);
                    } else {
                        zmn2 = null;
                        if (zmn2 != null) {
                            zmn2.fs(fs(zmn2));
                            zmn2.zmn(zmn(zmn2));
                        }
                        if (!zn(zmn2)) {
                            i++;
                            zmnVar2.fs(zmn2);
                        } else if (zmn2 != null) {
                            zmnVar2.zmn(i2 - i, zmn2);
                        }
                    }
                }
                zmn2 = zmn(optJSONObject, zmnVar2);
                if (zmn2 != null) {
                }
                if (!zn(zmn2)) {
                }
            }
        }
        return zmnVar2;
    }

    public boolean zmn(zmn zmnVar) {
        JSONObject btk;
        if (zmnVar == null || (btk = zmnVar.btk()) == null) {
            return false;
        }
        return TextUtils.equals(btk.optString("width"), "match_parent");
    }

    public boolean fs(zmn zmnVar) {
        JSONObject btk;
        if (zmnVar == null || (btk = zmnVar.btk()) == null) {
            return false;
        }
        return TextUtils.equals(btk.optString("height"), "match_parent");
    }

    public boolean zn(zmn zmnVar) {
        JSONObject btk;
        if (zmnVar == null || (btk = zmnVar.btk()) == null) {
            return false;
        }
        return TextUtils.equals(btk.optString(X3.i.L), com.facebook.appevents.codeless.internal.Constants.PATH_TYPE_ABSOLUTE);
    }

    public boolean fb() {
        return this.nps;
    }

    private void zmn(JSONObject jSONObject, JSONObject jSONObject2) {
        if (this.hhw == null || jSONObject2 == null) {
            return;
        }
        try {
            String optString = this.hhw.optString(jSONObject2.optString("targetId"));
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(optString);
            JSONObject optJSONObject = jSONObject2.optJSONObject("targetProps");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt = optJSONObject.opt(next);
                    if (TextUtils.equals(next, "events") && jSONObject3.has("events")) {
                        if (opt instanceof JSONArray) {
                            com.bytedance.adsdk.ugeno.nps.fs.zmn(jSONObject3.optJSONArray("events"), (JSONArray) opt);
                        }
                    } else {
                        jSONObject3.put(next, opt);
                    }
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("children");
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                optJSONArray.put(jSONObject3);
                if (jSONObject.has("children")) {
                    return;
                }
                jSONObject.put("children", optJSONArray);
            }
        } catch (JSONException unused) {
        }
    }

    public static boolean fb(zmn zmnVar) {
        return (zmnVar == null || zmnVar.zn == null) ? false : true;
    }

    public static class zmn {
        private LinkedList<zmn> btk;
        private boolean bvs;
        private JSONObject fb;
        private String fs;
        private zmn hhw;
        private boolean iv;
        private String nps;
        private boolean rc;
        private String zg;
        private String zmn;
        private JSONObject zn;

        public String zmn() {
            return this.zmn;
        }

        public String fs() {
            return this.nps;
        }

        public boolean zn() {
            return this.bvs;
        }

        public String fb() {
            return this.fs;
        }

        public void zmn(String str) {
            this.fs = str;
        }

        public void zmn(boolean z) {
            this.iv = z;
        }

        public void fs(boolean z) {
            this.rc = z;
        }

        public JSONObject btk() {
            return this.zn;
        }

        public List<zmn> hhw() {
            return this.btk;
        }

        public void zmn(zmn zmnVar) {
            if (this.btk == null) {
                this.btk = new LinkedList<>();
            }
            this.btk.add(zmnVar);
        }

        public void fs(zmn zmnVar) {
            if (this.btk == null) {
                this.btk = new LinkedList<>();
            }
            this.btk.addLast(zmnVar);
        }

        public void zmn(int i, zmn zmnVar) {
            if (this.btk == null) {
                this.btk = new LinkedList<>();
            }
            this.btk.add(i, zmnVar);
        }

        public JSONObject nps() {
            return this.fb;
        }

        public String toString() {
            return "UGNode{id='" + this.zmn + "', name='" + this.fs + "'}";
        }
    }
}
