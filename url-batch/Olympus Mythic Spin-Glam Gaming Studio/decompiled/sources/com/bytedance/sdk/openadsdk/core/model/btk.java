package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class btk {
    private fb fs;
    private ArrayList<zmn> zmn;

    public btk(JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            zmn zmnVar = new zmn(jSONArray.optJSONObject(i));
            if (this.zmn == null) {
                this.zmn = new ArrayList<>();
            }
            this.zmn.add(zmnVar);
        }
    }

    public static boolean zmn(nqi nqiVar) {
        if (nqiVar == null || nqiVar.yj()) {
            return false;
        }
        int ldx = nqiVar.ldx();
        int zq = nqiVar.zq();
        return (ldx == 3 || ldx == 7 || ldx == 8) && (zq == 5 || zq == 15 || zq == 50);
    }

    public ArrayList<zmn> zmn() {
        return this.zmn;
    }

    @Nullable
    public fb fs() {
        if (this.fs == null) {
            this.fs = new fb();
            ArrayList<zmn> arrayList = this.zmn;
            if (arrayList != null) {
                Iterator<zmn> it = arrayList.iterator();
                while (it.hasNext()) {
                    zmn next = it.next();
                    com.bytedance.sdk.openadsdk.core.rt.fb zmn2 = next.zmn();
                    Set<com.bytedance.sdk.openadsdk.core.rt.iv> fs = next.fs();
                    if (zmn2 != null) {
                        this.fs.zmn().zmn(zmn2);
                    }
                    if (fs != null) {
                        this.fs.fs().addAll(fs);
                    }
                }
            }
        }
        return this.fs;
    }

    public boolean zn() {
        ArrayList<zmn> arrayList = this.zmn;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public static class zmn {
        private Set<com.bytedance.sdk.openadsdk.core.rt.iv> fb;
        private final String fs;
        private final String zmn;
        private com.bytedance.sdk.openadsdk.core.rt.fb zn;

        public zmn(JSONObject jSONObject) {
            this.zmn = jSONObject.optString("vast_url");
            this.fs = jSONObject.optString("vast_content");
            JSONObject optJSONObject = jSONObject.optJSONObject("videoTrackers");
            if (optJSONObject != null) {
                com.bytedance.sdk.openadsdk.core.rt.fb fbVar = new com.bytedance.sdk.openadsdk.core.rt.fb();
                this.zn = fbVar;
                fbVar.zmn(optJSONObject);
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("viewabilityVendor");
            if (optJSONArray != null) {
                this.fb = com.bytedance.sdk.openadsdk.core.rt.iv.zmn(optJSONArray);
            }
        }

        public com.bytedance.sdk.openadsdk.core.rt.fb zmn() {
            return this.zn;
        }

        public void zmn(com.bytedance.sdk.openadsdk.core.rt.fb fbVar) {
            this.zn = fbVar;
        }

        public Set<com.bytedance.sdk.openadsdk.core.rt.iv> fs() {
            return this.fb;
        }

        public void zmn(Set<com.bytedance.sdk.openadsdk.core.rt.iv> set) {
            this.fb = set;
        }

        public String zn() {
            return this.zmn;
        }

        public String fb() {
            return this.fs;
        }
    }
}
