package com.bytedance.sdk.openadsdk.core.iv;

import android.view.View;
import com.bytedance.sdk.openadsdk.utils.nu;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes13.dex */
public class doe extends com.bytedance.sdk.component.adexpress.fs.zmn<zmn> {
    private com.bytedance.sdk.component.adexpress.fs.nps btk;
    private com.bytedance.sdk.component.adexpress.fs.zn fb;
    private zmn fs;
    private final com.bytedance.sdk.component.adexpress.fs.mw hhw;
    AtomicBoolean zmn = new AtomicBoolean(false);
    private final View zn;

    public doe(View view, com.bytedance.sdk.component.adexpress.fs.mw mwVar) {
        this.zn = view;
        this.hhw = mwVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.fb
    public void zmn(com.bytedance.sdk.component.adexpress.fs.nps npsVar) {
        this.btk = npsVar;
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iv.doe.1
            @Override // java.lang.Runnable
            public void run() {
                doe.this.fs();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs() {
        if (this.zmn.get()) {
            return;
        }
        com.bytedance.sdk.component.adexpress.fs.zn znVar = this.fb;
        if (znVar == null || !znVar.zmn((phc) this.zn, 0)) {
            this.btk.zmn(107, "backup false");
            return;
        }
        this.hhw.btk().hhw();
        zmn zmnVar = (zmn) this.zn.findViewWithTag("tt_express_backup_fl_tag_26");
        this.fs = zmnVar;
        if (zmnVar != null) {
            com.bytedance.sdk.component.adexpress.fs.rt rtVar = new com.bytedance.sdk.component.adexpress.fs.rt();
            zmn zmnVar2 = this.fs;
            float realWidth = zmnVar2 == null ? 0.0f : zmnVar2.getRealWidth();
            zmn zmnVar3 = this.fs;
            float realHeight = zmnVar3 != null ? zmnVar3.getRealHeight() : 0.0f;
            rtVar.zmn(true);
            rtVar.zmn(realWidth);
            rtVar.fs(realHeight);
            this.btk.zmn(this.fs, rtVar);
            return;
        }
        this.btk.zmn(107, "backupview is null");
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.fb
    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
    public zmn btk() {
        return this.fs;
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.zmn
    public void zmn(com.bytedance.sdk.component.adexpress.fs.zn znVar) {
        this.fb = znVar;
    }
}
