package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.view.View;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.ae;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: NativeRender.java */
/* loaded from: classes2.dex */
public class IP extends com.bytedance.sdk.component.adexpress.icD.pvs<BackupView> {
    private com.bytedance.sdk.component.adexpress.icD.vG Jd;
    private com.bytedance.sdk.component.adexpress.icD.yiw NB;
    private BackupView icD;
    AtomicBoolean pvs = new AtomicBoolean(false);
    private final com.bytedance.sdk.component.adexpress.icD.Ju sUS;
    private final View vG;

    public IP(View view, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.component.adexpress.icD.Ju ju) {
        this.vG = view;
        this.sUS = ju;
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Jd
    public void pvs(com.bytedance.sdk.component.adexpress.icD.yiw yiwVar) {
        this.NB = yiwVar;
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.IP.1
            @Override // java.lang.Runnable
            public void run() {
                IP.this.icD();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD() {
        if (this.pvs.get()) {
            return;
        }
        com.bytedance.sdk.component.adexpress.icD.vG vGVar = this.Jd;
        boolean z = false;
        if (vGVar != null && vGVar.pvs((NativeExpressView) this.vG, 0)) {
            z = true;
        }
        if (!z) {
            this.NB.pvs(107, "backup false");
            return;
        }
        this.sUS.NB().yiw();
        BackupView backupView = (BackupView) this.vG.findViewWithTag("tt_express_backup_fl_tag_26");
        this.icD = backupView;
        if (backupView != null) {
            com.bytedance.sdk.component.adexpress.icD.IP ip = new com.bytedance.sdk.component.adexpress.icD.IP();
            BackupView backupView2 = this.icD;
            float realWidth = backupView2 == null ? 0.0f : backupView2.getRealWidth();
            BackupView backupView3 = this.icD;
            float realHeight = backupView3 != null ? backupView3.getRealHeight() : 0.0f;
            ip.pvs(true);
            ip.pvs(realWidth);
            ip.icD(realHeight);
            this.NB.pvs(this.icD, ip);
            return;
        }
        this.NB.pvs(107, "backupview is null");
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Jd
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public BackupView NB() {
        return this.icD;
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.pvs
    public void pvs(com.bytedance.sdk.component.adexpress.icD.vG vGVar) {
        this.Jd = vGVar;
    }
}
