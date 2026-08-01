package com.bytedance.sdk.openadsdk.core.pvs;

import com.bytedance.sdk.openadsdk.core.model.icD;
import com.bytedance.sdk.openadsdk.core.vA;
import com.bytedance.sdk.openadsdk.utils.ae;

/* compiled from: AdCallBackAdapter.java */
/* loaded from: classes2.dex */
public class pvs implements vA.pvs {
    private final vA.pvs pvs;

    public pvs(vA.pvs pvsVar) {
        this.pvs = pvsVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.vA.pvs
    public void pvs(final int i, final String str) {
        if (this.pvs != null) {
            if (ae.NB()) {
                this.pvs.pvs(i, str);
            } else {
                ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.pvs.pvs.1
                    @Override // java.lang.Runnable
                    public void run() {
                        pvs.this.pvs.pvs(i, str);
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.vA.pvs
    public void pvs(final com.bytedance.sdk.openadsdk.core.model.pvs pvsVar, final icD icd) {
        if (this.pvs != null) {
            if (ae.NB()) {
                this.pvs.pvs(pvsVar, icd);
            } else {
                ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.pvs.pvs.2
                    @Override // java.lang.Runnable
                    public void run() {
                        pvs.this.pvs.pvs(pvsVar, icd);
                    }
                });
            }
        }
    }
}
