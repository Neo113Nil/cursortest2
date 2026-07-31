package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.zn.zn;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class klz {
    private final float btk;
    private final int bvs;
    private final JSONObject cn;
    private final String cyb;
    private final float fb;
    private final int[] fs;
    private final float hhw;
    private final int iv;
    private final int klz;
    private final SparseArray<zn.zmn> mw;
    private final long nps;
    private final JSONObject olo;
    private final int rc;
    private final int rt;
    private final long zg;
    private final int[] zmn;
    private final float zn;

    private klz(@NonNull zmn zmnVar) {
        this.zmn = zmnVar.iv;
        this.fs = zmnVar.rc;
        this.zn = zmnVar.bvs;
        this.fb = zmnVar.zg;
        this.btk = zmnVar.nps;
        this.hhw = zmnVar.hhw;
        this.nps = zmnVar.btk;
        this.zg = zmnVar.fb;
        this.bvs = zmnVar.klz;
        this.iv = zmnVar.mw;
        this.rc = zmnVar.rt;
        this.klz = zmnVar.cyb;
        this.mw = zmnVar.cn;
        this.cyb = zmnVar.olo;
        this.rt = zmnVar.kgc;
        this.cn = zmnVar.kw;
        this.olo = zmnVar.iqz;
    }

    public JSONObject zmn() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.olo;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.putOpt(next, this.olo.opt(next));
                    }
                } catch (Exception unused) {
                }
            }
            int[] iArr = this.zmn;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.zmn[1]));
            }
            int[] iArr2 = this.fs;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt("width", Integer.valueOf(iArr2[0])).putOpt("height", Integer.valueOf(this.fs[1]));
            }
            jSONObject.putOpt("down_x", Float.toString(this.zn)).putOpt("down_y", Float.toString(this.fb)).putOpt("up_x", Float.toString(this.btk)).putOpt("up_y", Float.toString(this.hhw)).putOpt("down_time", Long.valueOf(this.nps)).putOpt("up_time", Long.valueOf(this.zg)).putOpt("toolType", Integer.valueOf(this.bvs)).putOpt("deviceId", Integer.valueOf(this.iv)).putOpt("source", Integer.valueOf(this.rc)).putOpt("ft", zmn(this.mw, this.klz)).putOpt("click_area_type", this.cyb);
            int i = this.rt;
            if (i > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i));
            }
            JSONObject jSONObject3 = this.cn;
            if (jSONObject3 != null) {
                jSONObject.putOpt("rectInfo", jSONObject3);
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    public static JSONObject zmn(SparseArray<zn.zmn> sparseArray, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    zn.zmn valueAt = sparseArray.valueAt(i2);
                    if (valueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(valueAt.zn)).putOpt("mr", Double.valueOf(valueAt.fs)).putOpt("phase", Integer.valueOf(valueAt.zmn)).putOpt("ts", Long.valueOf(valueAt.fb));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", Integer.valueOf(i)).putOpt("info", jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static class zmn {
        private long btk;
        private float bvs;
        private SparseArray<zn.zmn> cn;
        private int cyb;
        private long fb;
        int fs;
        private float hhw;
        private JSONObject iqz;
        private int[] iv;
        private int kgc;
        private int klz;
        private JSONObject kw;
        private int mw;
        private float nps;
        private String olo;
        private int[] rc;
        private int rt;
        private float zg;
        float zmn;
        float zn;

        public zmn zmn(int i) {
            this.kgc = i;
            return this;
        }

        public zmn zmn(JSONObject jSONObject) {
            this.kw = jSONObject;
            return this;
        }

        public zmn fs(JSONObject jSONObject) {
            this.iqz = jSONObject;
            return this;
        }

        public zmn fs(int i) {
            this.cyb = i;
            return this;
        }

        public zmn zmn(SparseArray<zn.zmn> sparseArray) {
            this.cn = sparseArray;
            return this;
        }

        public zmn zmn(float f) {
            this.zmn = f;
            return this;
        }

        public zmn zn(int i) {
            this.fs = i;
            return this;
        }

        public zmn fs(float f) {
            this.zn = f;
            return this;
        }

        public zmn zmn(long j) {
            this.fb = j;
            return this;
        }

        public zmn fs(long j) {
            this.btk = j;
            return this;
        }

        public zmn zn(float f) {
            this.hhw = f;
            return this;
        }

        public zmn fb(float f) {
            this.nps = f;
            return this;
        }

        public zmn btk(float f) {
            this.zg = f;
            return this;
        }

        public zmn hhw(float f) {
            this.bvs = f;
            return this;
        }

        public zmn zmn(int[] iArr) {
            this.iv = iArr;
            return this;
        }

        public zmn fs(int[] iArr) {
            this.rc = iArr;
            return this;
        }

        public zmn fb(int i) {
            this.klz = i;
            return this;
        }

        public zmn btk(int i) {
            this.mw = i;
            return this;
        }

        public zmn hhw(int i) {
            this.rt = i;
            return this;
        }

        public zmn zmn(String str) {
            this.olo = str;
            return this;
        }

        public klz zmn() {
            return new klz(this);
        }
    }
}
