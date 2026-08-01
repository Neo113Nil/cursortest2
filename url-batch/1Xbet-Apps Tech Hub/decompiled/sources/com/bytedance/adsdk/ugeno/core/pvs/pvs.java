package com.bytedance.adsdk.ugeno.core.pvs;

import androidx.exifinterface.media.ExifInterface;
import com.bytedance.adsdk.ugeno.core.Ju;
import com.bytedance.adsdk.ugeno.core.qh;
import com.bytedance.sdk.component.uchain.action.EventChainAction;
import com.bytedance.sdk.component.uchain.listener.ICustomRouter;
import com.bytedance.sdk.component.uchain.listener.IEventChainLifeCycleListener;
import io.ktor.http.LinkHeader;
import org.json.JSONObject;

/* compiled from: UGenEventListenerAdapter.java */
/* loaded from: classes.dex */
public class pvs implements Ju {
    private JSONObject Jd;
    private volatile C0035pvs NB;
    private String icD;
    private Ju pvs;
    private boolean vG = true;
    private boolean sUS = false;

    public pvs(Ju ju) {
        this.pvs = ju;
    }

    public void pvs(JSONObject jSONObject) {
        this.Jd = jSONObject;
    }

    public void pvs(String str) {
        this.icD = str;
    }

    public void pvs(boolean z) {
        this.vG = z;
    }

    public boolean pvs() {
        String str;
        return this.vG && (str = this.icD) != null && ExifInterface.GPS_MEASUREMENT_3D.compareTo(str) <= 0 && this.Jd != null;
    }

    public void icD(boolean z) {
        this.sUS = z;
    }

    @Override // com.bytedance.adsdk.ugeno.core.Ju
    public void pvs(qh qhVar, Ju.icD icd, Ju.pvs pvsVar) {
        if (pvs()) {
            vG(qhVar, icd, pvsVar);
        } else {
            icD(qhVar, icd, pvsVar);
        }
    }

    private void icD(qh qhVar, Ju.icD icd, Ju.pvs pvsVar) {
        Ju ju = this.pvs;
        if (ju == null) {
            return;
        }
        ju.pvs(qhVar, icd, pvsVar);
    }

    private void vG(qh qhVar, Ju.icD icd, Ju.pvs pvsVar) {
        if (this.NB == null) {
            this.NB = icD();
        }
        this.NB.pvs(qhVar);
        this.NB.pvs(icd);
        this.NB.pvs(pvsVar);
        JSONObject vG = qhVar.vG();
        if (vG == null) {
            return;
        }
        new EventChainAction.Builder(vG.optString(LinkHeader.Parameters.Type)).setChainData(this.Jd).setEventChainLifeCycleListener(new IEventChainLifeCycleListener() { // from class: com.bytedance.adsdk.ugeno.core.pvs.pvs.1
        }).build().run();
    }

    private C0035pvs icD() {
        if (this.NB != null) {
            return this.NB;
        }
        synchronized (C0035pvs.class) {
            if (this.NB != null) {
                return this.NB;
            }
            this.NB = new C0035pvs();
            return this.NB;
        }
    }

    /* compiled from: UGenEventListenerAdapter.java */
    /* renamed from: com.bytedance.adsdk.ugeno.core.pvs.pvs$pvs, reason: collision with other inner class name */
    class C0035pvs implements ICustomRouter {
        private Ju.icD Jd;
        Ju.pvs pvs;
        private qh vG;

        C0035pvs() {
        }

        public void pvs(qh qhVar) {
            this.vG = qhVar;
        }

        public void pvs(Ju.icD icd) {
            this.Jd = icd;
        }

        public void pvs(Ju.pvs pvsVar) {
            this.pvs = pvsVar;
        }
    }
}
