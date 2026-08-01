package com.bytedance.adsdk.ugeno.core.icD;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.core.Ju;
import com.bytedance.adsdk.ugeno.core.qh;
import com.bytedance.adsdk.ugeno.core.so;
import com.bytedance.adsdk.ugeno.icD.Mxy;
import io.ktor.http.LinkHeader;
import org.json.JSONObject;

/* compiled from: UGDelayEventProcessor.java */
/* loaded from: classes.dex */
public class icD implements Mxy.pvs {
    private qh Jd;
    private com.bytedance.adsdk.ugeno.component.icD NB;
    private Ju icD;
    private int pvs;
    private Handler sUS = new Mxy(Looper.getMainLooper(), this);
    private Context vG;

    public icD(Context context, qh qhVar, com.bytedance.adsdk.ugeno.component.icD icd) {
        this.vG = context;
        this.Jd = qhVar;
        this.NB = icd;
    }

    public void pvs(Ju ju) {
        this.icD = ju;
    }

    public void pvs() {
        qh qhVar = this.Jd;
        if (qhVar == null) {
            return;
        }
        try {
            int parseInt = Integer.parseInt(com.bytedance.adsdk.ugeno.pvs.vG.pvs(qhVar.vG().optString("delay"), this.NB.Wyp()));
            this.pvs = parseInt;
            this.sUS.sendEmptyMessageDelayed(1001, parseInt);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.icD.Mxy.pvs
    public void pvs(Message message) {
        if (message.what != 1001) {
            return;
        }
        JSONObject vG = this.Jd.vG();
        if (TextUtils.equals(vG.optString(LinkHeader.Parameters.Type), "onAnimation")) {
            String optString = vG.optString("nodeId");
            com.bytedance.adsdk.ugeno.component.icD icd = this.NB;
            com.bytedance.adsdk.ugeno.component.icD icD = icd.icD(icd).icD(optString);
            new so(icD.Mxy(), com.bytedance.adsdk.ugeno.core.pvs.pvs(vG.optJSONObject("animatorSet"), icD)).pvs();
        } else {
            Ju ju = this.icD;
            if (ju != null) {
                qh qhVar = this.Jd;
                com.bytedance.adsdk.ugeno.component.icD icd2 = this.NB;
                ju.pvs(qhVar, icd2, icd2);
            }
        }
        this.sUS.removeMessages(1001);
    }
}
