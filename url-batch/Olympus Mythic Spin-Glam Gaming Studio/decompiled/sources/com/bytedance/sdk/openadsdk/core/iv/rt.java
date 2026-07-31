package com.bytedance.sdk.openadsdk.core.iv;

import com.bytedance.sdk.openadsdk.utils.nu;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class rt implements com.bytedance.adsdk.ugeno.core.kgc, com.bytedance.sdk.component.adexpress.fs.bvs {
    private long btk;
    private final String fb;
    private final String fs;
    private boolean hhw;
    private final com.bytedance.sdk.openadsdk.fb.fb.btk zmn;
    private final com.bytedance.sdk.openadsdk.core.model.nqi zn;

    public rt(com.bytedance.sdk.openadsdk.fb.fb.btk btkVar, String str, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, String str2, boolean z) {
        this.zmn = btkVar;
        this.fs = str;
        this.fb = str2;
        this.zn = nqiVar;
        this.hhw = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.bvs
    public void fb() {
        this.zmn.zmn();
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.bvs
    public void zmn(boolean z) {
        this.zmn.fs(z ? 1 : 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.bvs
    public void btk() {
        this.zmn.fs();
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.bvs
    public void zmn(int i, String str) {
        this.zmn.zmn(i, str);
        klz.zmn("Web", i, str, this.fs, this.fb, this.zn);
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.bvs
    public void zmn(int i) {
        this.btk = System.currentTimeMillis();
        if (i == 3) {
            this.zmn.zn("dynamic_render2_start");
        } else {
            this.zmn.zn("dynamic_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.bvs
    public void fs(int i) {
        if (i == 3) {
            this.zmn.fb("dynamic_sub_analysis2_start");
        } else {
            this.zmn.fb("dynamic_sub_analysis_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.bvs
    public void zn(int i) {
        if (i == 3) {
            this.zmn.fb("dynamic_sub_analysis2_end");
        } else {
            this.zmn.fb("dynamic_sub_analysis_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.bvs
    public void fb(int i) {
        if (i == 3) {
            this.zmn.fb("dynamic_sub_render2_start");
        } else {
            this.zmn.fb("dynamic_sub_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.bvs
    public void btk(int i) {
        if (i == 3) {
            this.zmn.fb("dynamic_sub_render2_end");
        } else {
            this.zmn.fb("dynamic_sub_render_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.bvs
    public void hhw(int i) {
        final String str;
        System.currentTimeMillis();
        if (i == 3) {
            this.zmn.nps("dynamic_render2_success");
            str = "dynamic2_render";
        } else {
            this.zmn.nps("dynamic_render_success");
            str = "dynamic_backup_native_render";
        }
        this.zmn.zmn(true);
        nu.fs(new com.bytedance.sdk.component.zg.fs.zn("dynamic_success") { // from class: com.bytedance.sdk.openadsdk.core.iv.rt.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.fb.zn.fs(rt.this.zn, rt.this.fs, str, (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.bvs
    public void zmn(int i, int i2, String str, boolean z) {
        if (!z) {
            this.zmn.zmn(true);
        }
        if (i == 3) {
            this.zmn.fs(i2, "dynamic_render2_error");
        } else {
            this.zmn.fs(i2, "dynamic_render_error");
        }
        klz.zmn("NDR", i2, str, this.fs, this.fb, this.zn);
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.bvs
    public void nps(int i) {
        this.zmn.zmn(i);
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.bvs
    public void hhw() {
        this.zmn.zmn(true);
        this.zmn.klz();
        nu.fs(new com.bytedance.sdk.component.zg.fs.zn("native_success") { // from class: com.bytedance.sdk.openadsdk.core.iv.rt.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.fb.zn.fs(rt.this.zn, rt.this.fs, "dynamic_backup_render", (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.bvs
    public void nps() {
        this.zmn.mw();
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.bvs
    public void zg() {
        this.zmn.rt();
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.bvs
    public void bvs() {
        this.zmn.fs();
    }

    public void iv() {
        this.zmn.iv();
        this.zmn.rc();
    }

    @Override // com.bytedance.adsdk.ugeno.core.kgc
    public void zmn() {
        this.zmn.zmn("ugen_render_start", this.hhw);
        this.zmn.btk("ugen_sub_analysis_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.kgc
    public void fs() {
        this.zmn.btk("ugen_sub_analysis_end");
    }

    @Override // com.bytedance.adsdk.ugeno.core.kgc
    public void zn() {
        this.zmn.btk("ugen_sub_render_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.kgc
    public void zmn(com.bytedance.adsdk.ugeno.core.olo oloVar) {
        if (oloVar.zmn() == 0) {
            this.zmn.btk("ugen_sub_render_end");
            this.zmn.hhw("ugen_render_success");
        } else {
            this.zmn.zn(oloVar.zmn(), "ugen_render_error");
            klz.zmn("UGen", oloVar.zmn(), oloVar.fs(), this.fs, this.fb, this.zn);
        }
        this.zmn.zmn(true);
    }
}
