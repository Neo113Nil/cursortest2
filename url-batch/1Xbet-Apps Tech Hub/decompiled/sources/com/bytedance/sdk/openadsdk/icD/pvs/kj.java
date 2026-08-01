package com.bytedance.sdk.openadsdk.icD.pvs;

import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.rCZ;

/* compiled from: StatsLogAdLogImpl.java */
/* loaded from: classes2.dex */
class kj implements com.bytedance.sdk.openadsdk.Wyp.vG.icD {
    public static final kj pvs = new kj();

    private kj() {
    }

    @Override // com.bytedance.sdk.openadsdk.Wyp.vG.icD
    public void pvs(com.bytedance.sdk.openadsdk.Wyp.icD icd) {
        pvs(icd, false);
    }

    @Override // com.bytedance.sdk.openadsdk.Wyp.vG.icD
    public void pvs(final com.bytedance.sdk.openadsdk.Wyp.icD icd, final boolean z) {
        pvs(new com.bytedance.sdk.component.so.so("uploadLogEvent") { // from class: com.bytedance.sdk.openadsdk.icD.pvs.kj.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.Wyp.pvs.vG logStats = icd.getLogStats();
                    if (logStats == null) {
                        return;
                    }
                    com.bytedance.sdk.component.sUS.pvs.Jd.pvs.pvs pvsVar = new com.bytedance.sdk.component.sUS.pvs.Jd.pvs.pvs(rCZ.pvs(), logStats.pvs());
                    pvsVar.vG((byte) 0);
                    pvsVar.icD(z ? (byte) 2 : (byte) 3);
                    pvsVar.pvs((byte) 1);
                    if (com.bytedance.sdk.component.sUS.pvs.icD.icD()) {
                        Jd.pvs(mnm.pvs(), com.bytedance.sdk.openadsdk.multipro.icD.vG());
                    }
                    com.bytedance.sdk.component.sUS.pvs.icD.pvs(pvsVar);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void pvs(com.bytedance.sdk.component.so.so soVar) {
        if (soVar == null) {
            return;
        }
        if (!ae.sUS()) {
            ae.icD(soVar, 5);
        } else {
            soVar.run();
        }
    }
}
