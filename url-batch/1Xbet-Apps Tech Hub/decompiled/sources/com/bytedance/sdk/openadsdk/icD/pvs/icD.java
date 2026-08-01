package com.bytedance.sdk.openadsdk.icD.pvs;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.http.LinkHeader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* compiled from: AdEvenRecord.java */
/* loaded from: classes2.dex */
public class icD {
    public int Jd;
    public AtomicInteger pvs = new AtomicInteger(0);
    public AtomicInteger icD = new AtomicInteger(0);
    public AtomicLong vG = new AtomicLong(0);
    public AtomicInteger NB = new AtomicInteger(0);
    public Map<Integer, Integer> sUS = new HashMap();
    public AtomicBoolean yiw = new AtomicBoolean(false);

    public icD(int i) {
        this.Jd = i;
    }

    JSONObject pvs() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FirebaseAnalytics.Param.SUCCESS, this.pvs.get());
            jSONObject.put("fail", this.icD.get());
            jSONObject.put(LinkHeader.Parameters.Type, this.Jd);
            jSONObject.put(TypedValues.TransitionType.S_DURATION, this.vG.get() / this.pvs.get());
            JSONObject jSONObject2 = new JSONObject();
            if (this.sUS.size() > 0) {
                for (Map.Entry<Integer, Integer> entry : this.sUS.entrySet()) {
                    jSONObject2.put(String.valueOf(entry.getKey()), entry.getValue());
                }
            }
            jSONObject.put("fail_error_code", jSONObject2);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    JSONObject icD() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FirebaseAnalytics.Param.SUCCESS, this.pvs.get());
            jSONObject.put("fail", this.icD.get());
            jSONObject.put(LinkHeader.Parameters.Type, this.Jd);
            jSONObject.put("time", this.NB.get());
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
