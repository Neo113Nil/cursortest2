package com.bytedance.sdk.openadsdk.sUS;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.NB.mnm;
import com.bytedance.sdk.component.NB.qh;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONObject;

/* compiled from: ImageLoaderLogListenerWrapper.java */
/* loaded from: classes2.dex */
public class icD<T> implements mnm<T> {
    private final cR Jd;
    private final String icD;
    private final long pvs = SystemClock.elapsedRealtime();
    private final mnm<T> vG;

    public icD(cR cRVar, String str, mnm<T> mnmVar) {
        this.vG = mnmVar;
        this.Jd = cRVar;
        this.icD = str;
    }

    @Override // com.bytedance.sdk.component.NB.mnm
    public void pvs(qh<T> qhVar) {
        mnm<T> mnmVar = this.vG;
        if (mnmVar != null) {
            mnmVar.pvs(qhVar);
        }
        if (this.Jd != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime() - this.pvs;
            final int yiw = qhVar.yiw() / 1024;
            final int i = qhVar.sUS() ? 1 : 0;
            com.bytedance.sdk.openadsdk.Wyp.vG.pvs("load_image_success", false, new com.bytedance.sdk.openadsdk.Wyp.icD() { // from class: com.bytedance.sdk.openadsdk.sUS.icD.1
                @Override // com.bytedance.sdk.openadsdk.Wyp.icD
                public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TypedValues.TransitionType.S_DURATION, elapsedRealtime);
                    jSONObject.put(ImagesContract.URL, icD.this.icD);
                    jSONObject.put("preload_size", yiw);
                    jSONObject.put("local_cache", i);
                    jSONObject.put("image_mode", icD.this.Jd.Ye());
                    return com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().pvs("load_image_success").pvs(icD.this.Jd.LDD()).icD(jSONObject.toString());
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.NB.mnm
    public void pvs(final int i, final String str, Throwable th) {
        mnm<T> mnmVar = this.vG;
        if (mnmVar != null) {
            mnmVar.pvs(i, str, th);
        }
        cR cRVar = this.Jd;
        if (cRVar == null || TextUtils.isEmpty(jlb.pvs(cRVar))) {
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - this.pvs;
        com.bytedance.sdk.openadsdk.Wyp.vG.pvs("load_image_error", false, new com.bytedance.sdk.openadsdk.Wyp.icD() { // from class: com.bytedance.sdk.openadsdk.sUS.icD.2
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TypedValues.TransitionType.S_DURATION, elapsedRealtime);
                jSONObject.put(ImagesContract.URL, icD.this.icD);
                jSONObject.put("error_code", i);
                jSONObject.put("error_message", str);
                jSONObject.put("image_mode", icD.this.Jd.Ye());
                return com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().pvs("load_image_error").pvs(icD.this.Jd.LDD()).icD(jSONObject.toString());
            }
        });
    }
}
