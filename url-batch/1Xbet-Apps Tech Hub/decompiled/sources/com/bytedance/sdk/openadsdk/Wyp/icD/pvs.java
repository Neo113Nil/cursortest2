package com.bytedance.sdk.openadsdk.Wyp.icD;

import com.bytedance.sdk.component.so.vG;
import com.bytedance.sdk.openadsdk.Wyp.icD;
import com.bytedance.sdk.openadsdk.Wyp.pvs.Jd;
import com.bytedance.sdk.openadsdk.core.mnm;

/* compiled from: ReportThreadLogServiceImp.java */
/* loaded from: classes2.dex */
public class pvs implements vG {
    @Override // com.bytedance.sdk.component.so.vG
    public void pvs(final com.bytedance.sdk.component.so.icD.pvs pvsVar) {
        com.bytedance.sdk.openadsdk.Wyp.vG.pvs();
        com.bytedance.sdk.openadsdk.Wyp.vG.pvs("stats_sdk_thread_num", false, new icD() { // from class: com.bytedance.sdk.openadsdk.Wyp.icD.pvs.1
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                com.bytedance.sdk.component.so.icD.pvs pvsVar2;
                if (!mnm.Jd().OyE() || (pvsVar2 = pvsVar) == null || pvsVar2.pvs() == null) {
                    return null;
                }
                return Jd.icD().pvs("stats_sdk_thread_num").icD(pvsVar.pvs().toString());
            }
        });
    }
}
