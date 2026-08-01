package com.bytedance.sdk.openadsdk.core.yiw.icD;

import com.bytedance.sdk.openadsdk.core.yiw.icD.vG;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastFractionalProgressTracker.java */
/* loaded from: classes2.dex */
public class icD extends vG implements Comparable<icD> {
    private final float pvs;

    private icD(float f, String str, vG.EnumC0088vG enumC0088vG, Boolean bool) {
        super(str, enumC0088vG, bool);
        this.pvs = f;
    }

    public boolean pvs(float f) {
        return this.pvs <= f && !NB();
    }

    @Override // java.lang.Comparable
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public int compareTo(icD icd) {
        if (icd == null) {
            return 1;
        }
        float f = this.pvs;
        float f2 = icd.pvs;
        if (f > f2) {
            return 1;
        }
        return f < f2 ? -1 : 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.yiw.icD.vG
    public void k_() {
        super.k_();
    }

    /* compiled from: VastFractionalProgressTracker.java */
    public static class pvs {
        private final float icD;
        private final String pvs;
        private vG.EnumC0088vG vG = vG.EnumC0088vG.TRACKING_URL;
        private boolean Jd = false;

        public pvs(String str, float f) {
            this.pvs = str;
            this.icD = f;
        }

        public icD pvs() {
            return new icD(this.icD, this.pvs, this.vG, Boolean.valueOf(this.Jd));
        }
    }

    public JSONObject icD() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FirebaseAnalytics.Param.CONTENT, vG());
        jSONObject.put("trackingFraction", this.pvs);
        return jSONObject;
    }
}
