package com.bytedance.sdk.openadsdk.core.sUS;

import android.content.Context;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.yiw.vG.so;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.settings.sUS;
import com.bytedance.sdk.openadsdk.qh.icD;
import com.bytedance.sdk.openadsdk.qh.vG;

/* compiled from: TncHelper.java */
/* loaded from: classes2.dex */
public class pvs {
    public static boolean pvs = false;
    private static final int icD = Integer.parseInt("1371");
    private static long vG = System.currentTimeMillis();

    public static void pvs() {
        Context pvs2;
        if (!mnm.Jd().Mxy() || pvs || (pvs2 = mnm.pvs()) == null) {
            return;
        }
        try {
            vG.pvs().icD().pvs(pvs2, true, new icD(pvs2));
            vG.pvs().icD().pvs(pvs2, com.bytedance.sdk.openadsdk.multipro.icD.vG());
            vG = System.currentTimeMillis();
            pvs = true;
        } catch (Exception e) {
            Ju.pvs("TncHelper", "initTTAdNet: ", e.getMessage());
        }
    }

    public static void icD() {
        if (pvs) {
            sUS Jd = mnm.Jd();
            if (Jd.Mxy()) {
                long rcB = Jd.rcB();
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - vG >= rcB) {
                    vG = currentTimeMillis;
                    Context pvs2 = mnm.pvs();
                    if (pvs2 == null) {
                        return;
                    }
                    so.pvs().pvs(icD, pvs2).vG();
                }
            }
        }
    }
}
