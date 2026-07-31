package com.bytedance.sdk.openadsdk.core.iv;

import android.content.Context;
import com.bytedance.sdk.openadsdk.utils.nu;

/* loaded from: classes3.dex */
public class nps extends com.bytedance.sdk.component.adexpress.dynamic.zmn.zmn {
    private final Runnable fb;
    private com.bytedance.sdk.component.adexpress.fs.nps fs;
    private final com.bytedance.sdk.component.adexpress.fs.mw zmn;
    private final com.bytedance.sdk.component.zg.fs.zn zn;

    public nps(Context context, boolean z, com.bytedance.sdk.component.adexpress.dynamic.btk.zg zgVar, com.bytedance.sdk.component.adexpress.fs.mw mwVar, com.bytedance.sdk.component.adexpress.dynamic.hhw.zmn zmnVar) {
        super(context, z, zgVar, mwVar, zmnVar);
        this.zn = new com.bytedance.sdk.component.zg.fs.zn("dynamic_render_template") { // from class: com.bytedance.sdk.openadsdk.core.iv.nps.1
            @Override // java.lang.Runnable
            public void run() {
                nps.this.zmn.zn();
                com.bytedance.sdk.openadsdk.core.cn.zn().post(nps.this.fb);
            }
        };
        this.fb = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iv.nps.2
            @Override // java.lang.Runnable
            public void run() {
                if (nps.this.fs != null) {
                    nps npsVar = nps.this;
                    nps.super.zmn(npsVar.fs);
                }
            }
        };
        this.zmn = mwVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zmn.zmn, com.bytedance.sdk.component.adexpress.fs.fb
    public void zmn(com.bytedance.sdk.component.adexpress.fs.nps npsVar) {
        this.fs = npsVar;
        nu.zn((Runnable) this.zn);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zmn.zmn
    public void fs() {
        super.fs();
        com.bytedance.sdk.openadsdk.core.cn.zn().removeCallbacks(this.fb);
    }
}
