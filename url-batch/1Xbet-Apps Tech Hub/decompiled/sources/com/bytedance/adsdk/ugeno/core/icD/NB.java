package com.bytedance.adsdk.ugeno.core.icD;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.core.Ju;
import com.bytedance.adsdk.ugeno.core.qh;
import com.bytedance.adsdk.ugeno.icD.Mxy;
import org.json.JSONObject;

/* compiled from: UGTimerEventProcessor.java */
/* loaded from: classes.dex */
public class NB implements Mxy.pvs {
    private Context Jd;
    private qh NB;
    private int icD;
    private boolean pvs;
    private com.bytedance.adsdk.ugeno.component.icD sUS;
    private Ju vG;
    private Handler yiw = new Mxy(Looper.getMainLooper(), this);

    public NB(Context context, qh qhVar, com.bytedance.adsdk.ugeno.component.icD icd) {
        this.Jd = context;
        this.NB = qhVar;
        this.sUS = icd;
    }

    public void pvs(Ju ju) {
        this.vG = ju;
    }

    public void pvs() {
        qh qhVar = this.NB;
        if (qhVar == null) {
            return;
        }
        JSONObject vG = qhVar.vG();
        try {
            this.icD = Integer.parseInt(com.bytedance.adsdk.ugeno.pvs.vG.pvs(vG.optString("interval", "8000"), this.sUS.Wyp()));
            this.pvs = vG.optBoolean("repeat");
            this.yiw.sendEmptyMessageDelayed(1001, this.icD);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.icD.Mxy.pvs
    public void pvs(Message message) {
        if (message.what != 1001) {
            return;
        }
        Ju ju = this.vG;
        if (ju != null) {
            qh qhVar = this.NB;
            com.bytedance.adsdk.ugeno.component.icD icd = this.sUS;
            ju.pvs(qhVar, icd, icd);
        }
        if (this.pvs) {
            this.yiw.sendEmptyMessageDelayed(1001, this.icD);
        } else {
            this.yiw.removeMessages(1001);
        }
    }
}
