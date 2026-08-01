package com.bytedance.sdk.openadsdk.core.yiw.pvs;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.yiw.icD.vG;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;
import org.json.JSONObject;

/* compiled from: VastXmlParser.java */
/* loaded from: classes2.dex */
public abstract class icD {
    protected double Jd;
    public int NB;
    protected final Context icD;
    public int pvs;
    public pvs sUS;
    protected int vG;

    /* compiled from: VastXmlParser.java */
    public static class pvs {
        public int icD;
        public int pvs;
        public boolean vG;
    }

    public abstract com.bytedance.sdk.openadsdk.core.yiw.pvs pvs(String str, List<vG> list);

    public icD(Context context, int i, int i2) {
        this.vG = 0;
        this.Jd = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (i2 > 0 && i > 0) {
            this.Jd = i / i2;
        }
        float NB = Pj.NB(context);
        if (NB != 0.0f && i > 0) {
            this.vG = (int) (i / NB);
        }
        this.icD = context.getApplicationContext();
    }

    protected void pvs(Exception exc, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", exc.getMessage());
            jSONObject.put("error_code", i);
            com.bytedance.sdk.openadsdk.Wyp.vG.pvs().pvs("load_vast", jSONObject);
        } catch (Exception unused) {
        }
    }

    protected boolean pvs(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return Integer.parseInt(str) < 2;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    protected String icD(String str, List<vG> list) {
        String str2;
        com.bytedance.sdk.component.yiw.icD pvs2;
        int i = this.pvs;
        if (i >= 5) {
            return null;
        }
        this.pvs = i + 1;
        if (str == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.yiw.icD.icD vG = com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().vG();
            vG.icD(str);
            pvs2 = vG.pvs();
            str2 = pvs2.Jd();
        } catch (Exception e) {
            e = e;
            str2 = null;
        }
        try {
            pvs2.pvs();
        } catch (Exception e2) {
            e = e2;
            pvs(e, 0);
            if (!list.isEmpty()) {
                vG.icD(list, com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs.WRAPPER_TIMEOUT, -1L, null);
            }
            return str2;
        }
        return str2;
    }
}
