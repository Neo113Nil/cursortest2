package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;

/* compiled from: ChooseAdHelper.java */
/* loaded from: classes2.dex */
public class pvs {
    public static void pvs(com.bytedance.sdk.openadsdk.core.model.pvs pvsVar, int i) {
        if (pvsVar == null || pvsVar.vG() == null || pvsVar.vG().size() <= 0) {
            return;
        }
        if (i >= pvsVar.vG().size()) {
            i = 0;
        }
        pvs(pvsVar.vG().get(i), !TextUtils.isEmpty(Jd.pvs(mnm.pvs()).pvs(r1)));
    }

    public static void pvs(final cR cRVar, final boolean z) {
        com.bytedance.sdk.openadsdk.core.Ju.icD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.1
            @Override // java.lang.Runnable
            public void run() {
                if (cR.this == null) {
                    return;
                }
                try {
                    Context pvs = mnm.pvs();
                    AdSlot jlb = cR.this.jlb();
                    if (jlb != null) {
                        NB.pvs(pvs).pvs(jlb.getCodeId());
                        if (z) {
                            NB.pvs(pvs).icD(jlb);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }
}
