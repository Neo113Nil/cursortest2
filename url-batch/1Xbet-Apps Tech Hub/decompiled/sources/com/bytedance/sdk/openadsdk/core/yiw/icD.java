package com.bytedance.sdk.openadsdk.core.yiw;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.core.yiw.vG.pvs;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastIcon.java */
/* loaded from: classes2.dex */
public class icD extends vG {
    private long Wyp;
    private long qh;

    public icD(int i, int i2, long j, long j2, pvs.EnumC0089pvs enumC0089pvs, pvs.icD icd, String str, List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> list, List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> list2, String str2) {
        super(i, i2, enumC0089pvs, icd, str, list, list2, str2);
        this.Wyp = j;
        this.qh = j2;
        this.Mxy = "icon_click";
    }

    @Override // com.bytedance.sdk.openadsdk.core.yiw.vG
    public JSONObject pvs() throws JSONException {
        JSONObject pvs = super.pvs();
        if (pvs != null) {
            pvs.put(TypedValues.CycleType.S_WAVE_OFFSET, this.Wyp);
            pvs.put(TypedValues.TransitionType.S_DURATION, this.qh);
        }
        return pvs;
    }

    public static icD pvs(JSONObject jSONObject) {
        vG icD = vG.icD(jSONObject);
        if (icD == null) {
            return null;
        }
        return new icD(icD.pvs, icD.icD, jSONObject.optLong(TypedValues.CycleType.S_WAVE_OFFSET, -1L), jSONObject.optLong(TypedValues.TransitionType.S_DURATION, -1L), icD.vG, icD.Jd, icD.NB, icD.sUS, icD.yiw, icD.so);
    }
}
