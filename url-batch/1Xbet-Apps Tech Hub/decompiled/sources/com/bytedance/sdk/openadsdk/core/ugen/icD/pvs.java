package com.bytedance.sdk.openadsdk.core.ugen.icD;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.bytedance.adsdk.ugeno.core.IP;
import com.bytedance.adsdk.ugeno.core.Ju;
import com.bytedance.adsdk.ugeno.core.Wyp;
import com.bytedance.adsdk.ugeno.core.qh;
import com.bytedance.sdk.openadsdk.core.ugen.Jd.Jd;
import com.bytedance.sdk.openadsdk.utils.ae;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UGenEndCardRender.java */
/* loaded from: classes2.dex */
public class pvs implements IP, Ju {
    private IP Jd;
    private com.bytedance.adsdk.ugeno.component.icD<View> icD;
    private final Context pvs;
    private InterfaceC0080pvs vG;

    /* compiled from: UGenEndCardRender.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.ugen.icD.pvs$pvs, reason: collision with other inner class name */
    interface InterfaceC0080pvs {
        void pvs(qh qhVar);
    }

    public pvs(Context context) {
        this.pvs = context;
    }

    public void pvs(final JSONObject jSONObject, final JSONObject jSONObject2, final Jd jd) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            icD(jSONObject, jSONObject2, jd);
        } else {
            ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ugen.icD.pvs.1
                @Override // java.lang.Runnable
                public void run() {
                    pvs.this.icD(jSONObject, jSONObject2, jd);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(JSONObject jSONObject, JSONObject jSONObject2, Jd jd) {
        try {
            Wyp wyp = new Wyp(this.pvs);
            com.bytedance.adsdk.ugeno.component.icD<View> pvs = wyp.pvs(jSONObject);
            this.icD = pvs;
            if (pvs == null) {
                if (jd != null) {
                    jd.pvs(PathInterpolatorCompat.MAX_NUM_POINTS, "ugen render fail");
                    return;
                }
                return;
            }
            View Mxy = pvs.Mxy();
            if (Mxy != null) {
                Mxy.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.ugen.icD.pvs.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
            wyp.pvs((Ju) this);
            wyp.pvs((IP) this);
            if (jSONObject2 != null) {
                try {
                    jSONObject2.put("language", com.bytedance.sdk.openadsdk.core.qh.pvs());
                    jSONObject2.put("os", "Android");
                } catch (JSONException unused) {
                }
            }
            wyp.icD(jSONObject2);
            if (jd != null) {
                jd.pvs(this.icD);
            }
        } catch (Exception e) {
            if (jd != null) {
                jd.pvs(PathInterpolatorCompat.MAX_NUM_POINTS, "ugen render fail exception is" + e.getMessage());
            }
        }
    }

    public void pvs(InterfaceC0080pvs interfaceC0080pvs) {
        this.vG = interfaceC0080pvs;
    }

    public void pvs(IP ip) {
        this.Jd = ip;
    }

    @Override // com.bytedance.adsdk.ugeno.core.Ju
    public void pvs(qh qhVar, Ju.icD icd, Ju.pvs pvsVar) {
        InterfaceC0080pvs interfaceC0080pvs;
        if (qhVar == null) {
            return;
        }
        if ((qhVar.icD() == 1 || qhVar.icD() == 4) && (interfaceC0080pvs = this.vG) != null) {
            interfaceC0080pvs.pvs(qhVar);
        }
        if (icd == null || qhVar.Jd() == null) {
            return;
        }
        icd.pvs(qhVar.Jd());
    }

    @Override // com.bytedance.adsdk.ugeno.core.IP
    public void pvs(com.bytedance.adsdk.ugeno.component.icD icd, MotionEvent motionEvent) {
        IP ip = this.Jd;
        if (ip != null) {
            ip.pvs(icd, motionEvent);
        }
    }
}
