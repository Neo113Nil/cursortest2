package com.bytedance.sdk.openadsdk.icD.pvs;

import android.content.Context;
import com.bytedance.sdk.component.utils.mnm;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.jlb;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: OverSeaLogDepend.java */
/* loaded from: classes2.dex */
public class qh implements com.bytedance.sdk.component.sUS.pvs.NB {
    private final String pvs = "[6109]";

    @Override // com.bytedance.sdk.component.sUS.pvs.NB
    public boolean icD() {
        return false;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB
    public com.bytedance.sdk.component.sUS.pvs.yiw kj() {
        return null;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB
    public com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvs(JSONObject jSONObject) {
        return null;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB
    public boolean pvs() {
        return false;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB
    public int sUS() {
        return 1;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB
    public boolean so() {
        return true;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB
    public boolean vG() {
        return true;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB
    public boolean yiw() {
        return false;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB
    public boolean pvs(Context context) {
        return mnm.pvs(context);
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB
    public String pvs(String str) {
        return com.bytedance.sdk.component.Jd.pvs.icD(str, com.bytedance.sdk.openadsdk.core.pvs.pvs());
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB
    public String icD(String str) {
        return com.bytedance.sdk.component.Jd.pvs.pvs(str, com.bytedance.sdk.openadsdk.core.pvs.pvs());
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB
    public String Mxy() {
        return jlb.vG();
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB
    public com.bytedance.sdk.component.sUS.pvs.NB.vG Wyp() {
        return new yiw();
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB
    public Executor Jd() {
        return ae.vG();
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB
    public Executor NB() {
        return ae.yiw();
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB
    public com.bytedance.sdk.component.sUS.pvs.sUS qh() {
        com.bytedance.sdk.component.sUS.pvs.sUS pvs;
        synchronized (this) {
            pvs = com.bytedance.sdk.openadsdk.multipro.pvs.pvs.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs());
        }
        return pvs;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB
    public void pvs(boolean z, int i, long j, com.bytedance.sdk.component.sUS.pvs.sUS.Jd jd) {
        Runnable pvs;
        if (jd == null) {
            return;
        }
        pvs.pvs(pvs.vG, z, i, j);
        if (z) {
            com.bytedance.sdk.openadsdk.Wyp.vG.pvs("track_link_result", false, (com.bytedance.sdk.openadsdk.Wyp.icD) new Ju(true, jd));
            return;
        }
        IP sR = com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().sR();
        if (sR != null && jd.Jd() < sR.pvs(jd.sUS())) {
            if (!sR.pvs() || (pvs = jd.pvs(com.bytedance.sdk.openadsdk.core.qh.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs()), null)) == null) {
                return;
            }
            ae.pvs().schedule(pvs, sR.icD(jd.sUS()), TimeUnit.SECONDS);
            return;
        }
        com.bytedance.sdk.openadsdk.Wyp.vG.pvs("track_link_result", false, (com.bytedance.sdk.openadsdk.Wyp.icD) new Ju(false, jd));
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB
    public void pvs(boolean z) {
        pvs.pvs(pvs.sUS, z);
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB
    public boolean IP() {
        return BinderPoolService.pvs;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB
    public int vG(String str) {
        return com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().sR().pvs(str);
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB
    public void Ju() {
        pvs.pvs(pvs.sUS);
    }
}
