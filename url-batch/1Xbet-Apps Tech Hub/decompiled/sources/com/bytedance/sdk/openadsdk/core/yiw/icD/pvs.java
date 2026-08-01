package com.bytedance.sdk.openadsdk.core.yiw.icD;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.yiw.icD.vG;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastAbsoluteProgressTracker.java */
/* loaded from: classes2.dex */
public class pvs extends vG implements Comparable<pvs> {
    public long pvs;

    protected pvs(long j, String str, vG.EnumC0088vG enumC0088vG, Boolean bool) {
        super(str, enumC0088vG, bool);
        this.pvs = j;
    }

    public static int pvs(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] split = str.split(":");
        if (split.length == 3) {
            try {
                return (int) ((Integer.parseInt(split[0]) * 60 * 60 * 1000) + (Integer.parseInt(split[1]) * 60 * 1000) + (Float.parseFloat(split[2]) * 1000.0f));
            } catch (Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    public boolean pvs(long j) {
        return this.pvs <= j && !NB();
    }

    @Override // java.lang.Comparable
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public int compareTo(pvs pvsVar) {
        if (pvsVar == null) {
            return 1;
        }
        long j = this.pvs;
        long j2 = pvsVar.pvs;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    /* compiled from: VastAbsoluteProgressTracker.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.yiw.icD.pvs$pvs, reason: collision with other inner class name */
    public static class C0087pvs {
        private final long icD;
        private final String pvs;
        private vG.EnumC0088vG vG = vG.EnumC0088vG.TRACKING_URL;
        private boolean Jd = false;

        public C0087pvs(String str, long j) {
            this.pvs = str;
            this.icD = j;
        }

        public pvs pvs() {
            return new pvs(this.icD, this.pvs, this.vG, Boolean.valueOf(this.Jd));
        }
    }

    public JSONObject pvs() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FirebaseAnalytics.Param.CONTENT, vG());
        jSONObject.put("trackingMilliseconds", this.pvs);
        return jSONObject;
    }
}
