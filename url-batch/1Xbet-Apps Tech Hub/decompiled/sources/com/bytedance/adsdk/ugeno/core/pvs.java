package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AnimationSetModel.java */
/* loaded from: classes.dex */
public class pvs {
    private long Jd;
    private long NB;
    private float icD;
    private String pvs;
    private String sUS;
    private List<C0034pvs> vG;

    public String pvs() {
        return this.pvs;
    }

    public void pvs(String str) {
        this.pvs = str;
    }

    public void pvs(float f) {
        this.icD = f;
    }

    public float icD() {
        return this.icD;
    }

    public List<C0034pvs> vG() {
        return this.vG;
    }

    public void pvs(List<C0034pvs> list) {
        this.vG = list;
    }

    public long Jd() {
        return this.Jd;
    }

    public void pvs(long j) {
        this.Jd = j;
    }

    public long NB() {
        return this.NB;
    }

    public void icD(long j) {
        this.NB = j;
    }

    public String sUS() {
        return this.sUS;
    }

    public void icD(String str) {
        this.sUS = str;
    }

    public static pvs pvs(String str, com.bytedance.adsdk.ugeno.component.icD icd) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return pvs(new JSONObject(str), icd);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static pvs pvs(JSONObject jSONObject, com.bytedance.adsdk.ugeno.component.icD icd) {
        return pvs(jSONObject, null, icd);
    }

    public static pvs pvs(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.component.icD icd) {
        if (jSONObject == null) {
            return null;
        }
        pvs pvsVar = new pvs();
        pvsVar.pvs(jSONObject.optString("ordering"));
        String optString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", optString)) {
            pvsVar.pvs(-1.0f);
        } else {
            try {
                pvsVar.pvs(Float.parseFloat(optString));
            } catch (NumberFormatException unused) {
                pvsVar.pvs(0.0f);
            }
        }
        pvsVar.pvs(jSONObject.optLong(TypedValues.TransitionType.S_DURATION, 0L));
        pvsVar.icD(com.bytedance.adsdk.ugeno.icD.vG.pvs(com.bytedance.adsdk.ugeno.pvs.vG.pvs(jSONObject.optString("startDelay"), icd.Wyp()), 0L));
        pvsVar.icD(jSONObject.optString("loopMode"));
        JSONArray optJSONArray = jSONObject.optJSONArray("animators");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.icD.icD.pvs(jSONObject2, optJSONObject);
                }
                arrayList.add(C0034pvs.pvs(optJSONObject, icd));
            }
            pvsVar.pvs(arrayList);
        }
        return pvsVar;
    }

    /* compiled from: AnimationSetModel.java */
    /* renamed from: com.bytedance.adsdk.ugeno.core.pvs$pvs, reason: collision with other inner class name */
    public static class C0034pvs {
        private long Jd;
        private String Mxy;
        private String NB;
        private String Wyp;
        private float icD;
        private long pvs;
        private float sUS;
        private float[] so;
        private String vG;
        private float yiw;

        public long pvs() {
            return this.pvs;
        }

        public void pvs(long j) {
            this.pvs = j;
        }

        public float icD() {
            return this.icD;
        }

        public void pvs(float f) {
            this.icD = f;
        }

        public String vG() {
            return this.vG;
        }

        public void pvs(String str) {
            this.vG = str;
        }

        public long Jd() {
            return this.Jd;
        }

        public void icD(long j) {
            this.Jd = j;
        }

        public String NB() {
            return this.NB;
        }

        public void icD(String str) {
            this.NB = str;
        }

        public float sUS() {
            return this.sUS;
        }

        public void icD(float f) {
            this.sUS = f;
        }

        public float yiw() {
            return this.yiw;
        }

        public void vG(float f) {
            this.yiw = f;
        }

        public float[] so() {
            return this.so;
        }

        public void pvs(float[] fArr) {
            this.so = fArr;
        }

        public String Mxy() {
            return this.Mxy;
        }

        public String Wyp() {
            return this.Wyp;
        }

        public void vG(String str) {
            this.Wyp = str;
        }

        public void Jd(String str) {
            this.Mxy = str;
        }

        public static C0034pvs pvs(JSONObject jSONObject, com.bytedance.adsdk.ugeno.component.icD icd) {
            if (jSONObject == null) {
                return null;
            }
            C0034pvs c0034pvs = new C0034pvs();
            c0034pvs.pvs(jSONObject.optLong(TypedValues.TransitionType.S_DURATION));
            String optString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", optString)) {
                c0034pvs.pvs(-1.0f);
            } else {
                try {
                    c0034pvs.pvs(Float.parseFloat(optString));
                } catch (NumberFormatException unused) {
                    c0034pvs.pvs(0.0f);
                }
            }
            c0034pvs.pvs(jSONObject.optString("loopMode"));
            c0034pvs.icD(jSONObject.optString(LinkHeader.Parameters.Type));
            if (TextUtils.equals(c0034pvs.NB(), "ripple")) {
                c0034pvs.vG(jSONObject.optString("rippleColor"));
            }
            View Mxy = icd.Mxy();
            Context context = Mxy != null ? Mxy.getContext() : null;
            if (TextUtils.equals(c0034pvs.NB(), "backgroundColor")) {
                String pvs = com.bytedance.adsdk.ugeno.pvs.vG.pvs(jSONObject.optString("valueTo"), icd.Wyp());
                int pvs2 = com.bytedance.adsdk.ugeno.icD.pvs.pvs(jSONObject.optString("valueFrom"));
                int pvs3 = com.bytedance.adsdk.ugeno.icD.pvs.pvs(pvs);
                c0034pvs.icD(pvs2);
                c0034pvs.vG(pvs3);
            } else if ((TextUtils.equals(c0034pvs.NB(), "translateX") || TextUtils.equals(c0034pvs.NB(), "translateY")) && context != null) {
                try {
                    float pvs4 = com.bytedance.adsdk.ugeno.icD.so.pvs(context, (float) jSONObject.optDouble("valueFrom"));
                    float pvs5 = com.bytedance.adsdk.ugeno.icD.so.pvs(context, (float) jSONObject.optDouble("valueTo"));
                    c0034pvs.icD(pvs4);
                    c0034pvs.vG(pvs5);
                } catch (Exception unused2) {
                    Log.e("animation", "animation ");
                }
            } else {
                c0034pvs.icD((float) jSONObject.optDouble("valueFrom"));
                c0034pvs.vG((float) jSONObject.optDouble("valueTo"));
            }
            c0034pvs.Jd(jSONObject.optString("interpolator"));
            String pvs6 = com.bytedance.adsdk.ugeno.pvs.vG.pvs(jSONObject.optString("startDelay"), icd.Wyp());
            Log.d("TAG", "createAnimationModel: ");
            c0034pvs.icD(com.bytedance.adsdk.ugeno.icD.vG.pvs(pvs6, 0L));
            JSONArray optJSONArray = jSONObject.optJSONArray("values");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                float[] fArr = new float[optJSONArray.length()];
                int i = 0;
                if ((TextUtils.equals(c0034pvs.NB(), "translateX") || TextUtils.equals(c0034pvs.NB(), "translateY")) && context != null) {
                    while (i < optJSONArray.length()) {
                        fArr[i] = com.bytedance.adsdk.ugeno.icD.so.pvs(context, (float) optJSONArray.optDouble(i));
                        i++;
                    }
                } else {
                    while (i < optJSONArray.length()) {
                        fArr[i] = (float) optJSONArray.optDouble(i);
                        i++;
                    }
                }
                c0034pvs.pvs(fArr);
            }
            return c0034pvs;
        }
    }
}
