package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class zmn {
    private long btk;
    private long fb;
    private float fs;
    private String hhw;
    private String zmn;
    private List<C0108zmn> zn;

    public String zmn() {
        return this.zmn;
    }

    public void zmn(String str) {
        this.zmn = str;
    }

    public void zmn(float f) {
        this.fs = f;
    }

    public float fs() {
        return this.fs;
    }

    public List<C0108zmn> zn() {
        return this.zn;
    }

    public void zmn(List<C0108zmn> list) {
        this.zn = list;
    }

    public long fb() {
        return this.fb;
    }

    public void zmn(long j) {
        this.fb = j;
    }

    public long btk() {
        return this.btk;
    }

    public void fs(long j) {
        this.btk = j;
    }

    public String hhw() {
        return this.hhw;
    }

    public void fs(String str) {
        this.hhw = str;
    }

    public static zmn zmn(String str, com.bytedance.adsdk.ugeno.fs.zn znVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return zmn(new JSONObject(str), znVar);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static zmn zmn(JSONObject jSONObject, com.bytedance.adsdk.ugeno.fs.zn znVar) {
        return zmn(jSONObject, null, znVar);
    }

    public static zmn zmn(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.fs.zn znVar) {
        if (jSONObject == null) {
            return null;
        }
        zmn zmnVar = new zmn();
        zmnVar.zmn(jSONObject.optString("ordering"));
        String optString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", optString)) {
            zmnVar.zmn(-1.0f);
        } else {
            try {
                zmnVar.zmn(Float.parseFloat(optString));
            } catch (NumberFormatException unused) {
                zmnVar.zmn(0.0f);
            }
        }
        zmnVar.zmn(jSONObject.optLong(IronSourceConstants.EVENTS_DURATION, 0L));
        zmnVar.fs(com.bytedance.adsdk.ugeno.nps.zn.zmn(com.bytedance.adsdk.ugeno.zn.fs.zmn(jSONObject.optString("startDelay"), znVar.klz()), 0L));
        zmnVar.fs(jSONObject.optString("loopMode"));
        JSONArray optJSONArray = jSONObject.optJSONArray("animators");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.nps.fs.zmn(jSONObject2, optJSONObject);
                }
                arrayList.add(C0108zmn.zmn(optJSONObject, znVar));
            }
            zmnVar.zmn(arrayList);
        }
        return zmnVar;
    }

    /* renamed from: com.bytedance.adsdk.ugeno.core.zmn$zmn, reason: collision with other inner class name */
    public static class C0108zmn {
        private String btk;
        private String bvs;
        private long fb;
        private float fs;
        private float hhw;
        private String iv;
        private float nps;
        private float[] zg;
        private long zmn;
        private String zn;

        public long zmn() {
            return this.zmn;
        }

        public void zmn(long j) {
            this.zmn = j;
        }

        public float fs() {
            return this.fs;
        }

        public void zmn(float f) {
            this.fs = f;
        }

        public String zn() {
            return this.zn;
        }

        public void zmn(String str) {
            this.zn = str;
        }

        public long fb() {
            return this.fb;
        }

        public void fs(long j) {
            this.fb = j;
        }

        public String btk() {
            return this.btk;
        }

        public void fs(String str) {
            this.btk = str;
        }

        public float hhw() {
            return this.hhw;
        }

        public void fs(float f) {
            this.hhw = f;
        }

        public float nps() {
            return this.nps;
        }

        public void zn(float f) {
            this.nps = f;
        }

        public float[] zg() {
            return this.zg;
        }

        public void zmn(float[] fArr) {
            this.zg = fArr;
        }

        public String bvs() {
            return this.bvs;
        }

        public String iv() {
            return this.iv;
        }

        public void zn(String str) {
            this.iv = str;
        }

        public void fb(String str) {
            this.bvs = str;
        }

        public static C0108zmn zmn(JSONObject jSONObject, com.bytedance.adsdk.ugeno.fs.zn znVar) {
            if (jSONObject == null) {
                return null;
            }
            C0108zmn c0108zmn = new C0108zmn();
            c0108zmn.zmn(jSONObject.optLong(IronSourceConstants.EVENTS_DURATION));
            String optString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", optString)) {
                c0108zmn.zmn(-1.0f);
            } else {
                try {
                    c0108zmn.zmn(Float.parseFloat(optString));
                } catch (NumberFormatException unused) {
                    c0108zmn.zmn(0.0f);
                }
            }
            c0108zmn.zmn(jSONObject.optString("loopMode"));
            c0108zmn.fs(jSONObject.optString("type"));
            if (TextUtils.equals(c0108zmn.btk(), "ripple")) {
                c0108zmn.zn(jSONObject.optString("rippleColor"));
            }
            View rc = znVar.rc();
            Context context = rc != null ? rc.getContext() : null;
            if (TextUtils.equals(c0108zmn.btk(), "backgroundColor")) {
                String zmn = com.bytedance.adsdk.ugeno.zn.fs.zmn(jSONObject.optString("valueTo"), znVar.klz());
                int zmn2 = com.bytedance.adsdk.ugeno.nps.zmn.zmn(jSONObject.optString("valueFrom"));
                int zmn3 = com.bytedance.adsdk.ugeno.nps.zmn.zmn(zmn);
                c0108zmn.fs(zmn2);
                c0108zmn.zn(zmn3);
            } else if ((TextUtils.equals(c0108zmn.btk(), "translateX") || TextUtils.equals(c0108zmn.btk(), "translateY")) && context != null) {
                try {
                    float zmn4 = com.bytedance.adsdk.ugeno.nps.zg.zmn(context, (float) jSONObject.optDouble("valueFrom"));
                    float zmn5 = com.bytedance.adsdk.ugeno.nps.zg.zmn(context, (float) jSONObject.optDouble("valueTo"));
                    c0108zmn.fs(zmn4);
                    c0108zmn.zn(zmn5);
                } catch (Exception unused2) {
                    Log.e("animation", "animation ");
                }
            } else {
                c0108zmn.fs((float) jSONObject.optDouble("valueFrom"));
                c0108zmn.zn((float) jSONObject.optDouble("valueTo"));
            }
            c0108zmn.fb(jSONObject.optString("interpolator"));
            String zmn6 = com.bytedance.adsdk.ugeno.zn.fs.zmn(jSONObject.optString("startDelay"), znVar.klz());
            Log.d("TAG", "createAnimationModel: ");
            c0108zmn.fs(com.bytedance.adsdk.ugeno.nps.zn.zmn(zmn6, 0L));
            JSONArray optJSONArray = jSONObject.optJSONArray("values");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                float[] fArr = new float[optJSONArray.length()];
                int i = 0;
                if ((TextUtils.equals(c0108zmn.btk(), "translateX") || TextUtils.equals(c0108zmn.btk(), "translateY")) && context != null) {
                    while (i < optJSONArray.length()) {
                        fArr[i] = com.bytedance.adsdk.ugeno.nps.zg.zmn(context, (float) zmn.zmn(optJSONArray.optString(i), znVar.klz()));
                        i++;
                    }
                } else {
                    while (i < optJSONArray.length()) {
                        fArr[i] = (float) zmn.zmn(optJSONArray.optString(i), znVar.klz());
                        i++;
                    }
                }
                c0108zmn.zmn(fArr);
            }
            return c0108zmn;
        }
    }

    public static double zmn(Object obj, JSONObject jSONObject) {
        if (obj instanceof String) {
            return com.bytedance.adsdk.ugeno.nps.zn.zmn(com.bytedance.adsdk.ugeno.zn.fs.zmn((String) obj, jSONObject), 0.0d);
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Long) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Double) obj).doubleValue();
        }
        return 0.0d;
    }
}
