package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.ae;

/* compiled from: DynamicViewRender.java */
/* loaded from: classes2.dex */
public class Jd extends com.bytedance.sdk.component.adexpress.dynamic.pvs.pvs {
    private final Runnable Jd;
    private com.bytedance.sdk.component.adexpress.icD.yiw icD;
    private final com.bytedance.sdk.component.adexpress.icD.Ju pvs;
    private final com.bytedance.sdk.component.so.so vG;

    public Jd(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, com.bytedance.sdk.component.adexpress.dynamic.Jd.so soVar, com.bytedance.sdk.component.adexpress.icD.Ju ju, com.bytedance.sdk.component.adexpress.dynamic.NB.pvs pvsVar) {
        super(context, themeStatusBroadcastReceiver, z, soVar, ju, pvsVar);
        this.vG = new com.bytedance.sdk.component.so.so("dynamic_render_template") { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.Jd.1
            @Override // java.lang.Runnable
            public void run() {
                Jd.this.pvs.vG();
                com.bytedance.sdk.openadsdk.core.Ju.vG().post(Jd.this.Jd);
            }
        };
        this.Jd = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.Jd.2
            @Override // java.lang.Runnable
            public void run() {
                if (Jd.this.icD != null) {
                    Jd jd = Jd.this;
                    Jd.super.pvs(jd.icD);
                }
            }
        };
        this.pvs = ju;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.pvs.pvs, com.bytedance.sdk.component.adexpress.icD.Jd
    public void pvs(com.bytedance.sdk.component.adexpress.icD.yiw yiwVar) {
        this.icD = yiwVar;
        ae.icD(this.vG);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.pvs.pvs
    public void icD() {
        super.icD();
        com.bytedance.sdk.openadsdk.core.Ju.vG().removeCallbacks(this.Jd);
    }
}
