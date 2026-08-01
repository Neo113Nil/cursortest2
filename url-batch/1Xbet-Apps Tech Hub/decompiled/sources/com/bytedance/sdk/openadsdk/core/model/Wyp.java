package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.core.icD.vG;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ClickEventModel.java */
/* loaded from: classes2.dex */
public class Wyp {
    private final int IP;
    private final int[] Jd;
    private final int Ju;
    private final long Mxy;
    private final float NB;
    private final long Wyp;
    private final SparseArray<vG.pvs> bNS;
    private final String cR;
    private final int[] icD;
    private final int kj;
    private final int mnm;
    private final int[] pvs;
    private final int qh;
    private final float sUS;
    private final float so;
    private final JSONObject vA;
    private final int[] vG;
    private final float yiw;
    private final JSONObject zM;

    private Wyp(pvs pvsVar) {
        this.pvs = pvsVar.qh;
        this.icD = pvsVar.kj;
        this.Jd = pvsVar.Ju;
        this.vG = pvsVar.Wyp;
        this.NB = pvsVar.Mxy;
        this.sUS = pvsVar.so;
        this.yiw = pvsVar.yiw;
        this.so = pvsVar.sUS;
        this.Mxy = pvsVar.NB;
        this.Wyp = pvsVar.Jd;
        this.qh = pvsVar.IP;
        this.kj = pvsVar.bNS;
        this.Ju = pvsVar.mnm;
        this.IP = pvsVar.cR;
        this.bNS = pvsVar.vA;
        this.cR = pvsVar.zM;
        this.mnm = pvsVar.uc;
        this.vA = pvsVar.rCZ;
        this.zM = pvsVar.OT;
    }

    public JSONObject pvs() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.zM;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.putOpt(next, this.zM.opt(next));
                    }
                } catch (Exception unused) {
                }
            }
            int[] iArr = this.pvs;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.pvs[1]));
            }
            int[] iArr2 = this.icD;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt("width", Integer.valueOf(iArr2[0])).putOpt("height", Integer.valueOf(this.icD[1]));
            }
            int[] iArr3 = this.vG;
            if (iArr3 != null && iArr3.length == 2) {
                jSONObject.putOpt("button_x", Integer.valueOf(iArr3[0])).putOpt("button_y", Integer.valueOf(this.vG[1]));
            }
            int[] iArr4 = this.Jd;
            if (iArr4 != null && iArr4.length == 2) {
                jSONObject.putOpt("button_width", Integer.valueOf(iArr4[0])).putOpt("button_height", Integer.valueOf(this.Jd[1]));
            }
            jSONObject.putOpt("down_x", Float.toString(this.NB)).putOpt("down_y", Float.toString(this.sUS)).putOpt("up_x", Float.toString(this.yiw)).putOpt("up_y", Float.toString(this.so)).putOpt("down_time", Long.valueOf(this.Mxy)).putOpt("up_time", Long.valueOf(this.Wyp)).putOpt("toolType", Integer.valueOf(this.qh)).putOpt("deviceId", Integer.valueOf(this.kj)).putOpt(FirebaseAnalytics.Param.SOURCE, Integer.valueOf(this.Ju)).putOpt("ft", pvs(this.bNS, this.IP)).putOpt("click_area_type", this.cR);
            int i = this.mnm;
            if (i > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i));
            }
            JSONObject jSONObject3 = this.vA;
            if (jSONObject3 != null) {
                jSONObject.putOpt("rectInfo", jSONObject3);
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    public static JSONObject pvs(SparseArray<vG.pvs> sparseArray, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    vG.pvs valueAt = sparseArray.valueAt(i2);
                    if (valueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(valueAt.vG)).putOpt("mr", Double.valueOf(valueAt.icD)).putOpt(TypedValues.CycleType.S_WAVE_PHASE, Integer.valueOf(valueAt.pvs)).putOpt("ts", Long.valueOf(valueAt.Jd));
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

    /* compiled from: ClickEventModel.java */
    public static class pvs {
        private int IP;
        private long Jd;
        private int[] Ju;
        private float Mxy;
        private long NB;
        private JSONObject OT;
        private int[] Wyp;
        private int bNS;
        private int cR;
        int icD;
        private int[] kj;
        private int mnm;
        float pvs;
        private int[] qh;
        private JSONObject rCZ;
        private float sUS;
        private float so;
        private int uc;
        private SparseArray<vG.pvs> vA;
        float vG;
        private float yiw;
        private String zM;

        public pvs pvs(int i) {
            this.uc = i;
            return this;
        }

        public pvs pvs(JSONObject jSONObject) {
            this.rCZ = jSONObject;
            return this;
        }

        public pvs icD(JSONObject jSONObject) {
            this.OT = jSONObject;
            return this;
        }

        public pvs icD(int i) {
            this.cR = i;
            return this;
        }

        public pvs pvs(SparseArray<vG.pvs> sparseArray) {
            this.vA = sparseArray;
            return this;
        }

        public pvs pvs(float f) {
            this.pvs = f;
            return this;
        }

        public pvs vG(int i) {
            this.icD = i;
            return this;
        }

        public pvs icD(float f) {
            this.vG = f;
            return this;
        }

        public pvs pvs(long j) {
            this.Jd = j;
            return this;
        }

        public pvs icD(long j) {
            this.NB = j;
            return this;
        }

        public pvs vG(float f) {
            this.sUS = f;
            return this;
        }

        public pvs Jd(float f) {
            this.yiw = f;
            return this;
        }

        public pvs NB(float f) {
            this.so = f;
            return this;
        }

        public pvs sUS(float f) {
            this.Mxy = f;
            return this;
        }

        public pvs pvs(int[] iArr) {
            this.Wyp = iArr;
            return this;
        }

        public pvs icD(int[] iArr) {
            this.qh = iArr;
            return this;
        }

        public pvs vG(int[] iArr) {
            this.kj = iArr;
            return this;
        }

        public pvs Jd(int[] iArr) {
            this.Ju = iArr;
            return this;
        }

        public pvs Jd(int i) {
            this.IP = i;
            return this;
        }

        public pvs NB(int i) {
            this.bNS = i;
            return this;
        }

        public pvs sUS(int i) {
            this.mnm = i;
            return this;
        }

        public pvs pvs(String str) {
            this.zM = str;
            return this;
        }

        public Wyp pvs() {
            return new Wyp(this);
        }
    }
}
