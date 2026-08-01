package com.bytedance.sdk.openadsdk.core.nativeexpress;

import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.ae;
import org.json.JSONObject;

/* compiled from: ExpressRenderEventMonitor.java */
/* loaded from: classes2.dex */
public class qh implements com.bytedance.adsdk.ugeno.core.mnm, com.bytedance.sdk.component.adexpress.icD.Mxy {
    private final String Jd;
    private long NB;
    private final String icD;
    private final com.bytedance.sdk.openadsdk.icD.vG.NB pvs;
    private final cR vG;

    public qh(com.bytedance.sdk.openadsdk.icD.vG.NB nb, String str, cR cRVar, String str2) {
        this.pvs = nb;
        this.icD = str;
        this.Jd = str2;
        this.vG = cRVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Mxy
    public void Jd() {
        this.pvs.pvs();
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Mxy
    public void pvs(boolean z) {
        this.pvs.pvs(z ? 1 : 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Mxy
    public void NB() {
        this.pvs.icD();
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Mxy
    public void pvs(int i, String str) {
        this.pvs.pvs(i, null);
        Mxy.pvs("Web", i, str, this.icD, this.Jd, this.vG);
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Mxy
    public void pvs(int i) {
        this.NB = System.currentTimeMillis();
        if (i == 3) {
            this.pvs.vG("dynamic_render2_start");
        } else {
            this.pvs.vG("dynamic_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Mxy
    public void icD(int i) {
        if (i == 3) {
            this.pvs.Jd("dynamic_sub_analysis2_start");
        } else {
            this.pvs.Jd("dynamic_sub_analysis_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Mxy
    public void vG(int i) {
        if (i == 3) {
            this.pvs.Jd("dynamic_sub_analysis2_end");
        } else {
            this.pvs.Jd("dynamic_sub_analysis_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Mxy
    public void Jd(int i) {
        if (i == 3) {
            this.pvs.Jd("dynamic_sub_render2_start");
        } else {
            this.pvs.Jd("dynamic_sub_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Mxy
    public void NB(int i) {
        if (i == 3) {
            this.pvs.Jd("dynamic_sub_render2_end");
        } else {
            this.pvs.Jd("dynamic_sub_render_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Mxy
    public void sUS(int i) {
        final String str;
        System.currentTimeMillis();
        if (i == 3) {
            this.pvs.yiw("dynamic_render2_success");
            str = "dynamic2_render";
        } else {
            this.pvs.yiw("dynamic_render_success");
            str = "dynamic_backup_native_render";
        }
        this.pvs.pvs(true);
        ae.icD(new com.bytedance.sdk.component.so.so("dynamic_success") { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.qh.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.icD.vG.icD(qh.this.vG, qh.this.icD, str, (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Mxy
    public void pvs(int i, int i2, String str, boolean z) {
        if (!z) {
            this.pvs.pvs(true);
        }
        if (i == 3) {
            this.pvs.icD(i2, "dynamic_render2_error");
        } else {
            this.pvs.icD(i2, "dynamic_render_error");
        }
        Mxy.pvs("NDR", i2, str, this.icD, this.Jd, this.vG);
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Mxy
    public void sUS() {
        this.pvs.vG();
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Mxy
    public void yiw() {
        this.pvs.pvs(true);
        this.pvs.Ju();
        ae.icD(new com.bytedance.sdk.component.so.so("native_success") { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.qh.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.icD.vG.icD(qh.this.vG, qh.this.icD, "dynamic_backup_render", (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Mxy
    public void so() {
        this.pvs.IP();
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Mxy
    public void Mxy() {
        this.pvs.bNS();
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Mxy
    public void Wyp() {
        this.pvs.icD();
    }

    public void qh() {
        this.pvs.qh();
        this.pvs.kj();
    }

    @Override // com.bytedance.adsdk.ugeno.core.mnm
    public void pvs() {
        this.pvs.NB("ugen_render_start");
        this.pvs.NB("ugen_sub_analysis_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.mnm
    public void icD() {
        this.pvs.NB("ugen_sub_analysis_end");
    }

    @Override // com.bytedance.adsdk.ugeno.core.mnm
    public void vG() {
        this.pvs.NB("ugen_sub_render_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.mnm
    public void pvs(com.bytedance.adsdk.ugeno.core.bNS bns) {
        if (bns.pvs() == 0) {
            this.pvs.NB("ugen_sub_render_end");
            this.pvs.sUS("ugen_render_success");
        } else {
            this.pvs.vG(bns.pvs(), "ugen_render_error");
            Mxy.pvs("UGen", bns.pvs(), bns.icD(), this.icD, this.Jd, this.vG);
        }
        this.pvs.pvs(true);
    }
}
