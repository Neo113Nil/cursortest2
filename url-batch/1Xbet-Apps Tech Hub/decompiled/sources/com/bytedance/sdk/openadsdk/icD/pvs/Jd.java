package com.bytedance.sdk.openadsdk.icD.pvs;

import android.content.Context;
import com.bytedance.sdk.component.sUS.pvs.pvs;
import com.bytedance.sdk.openadsdk.core.mnm;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AdLogSwitchUtils.java */
/* loaded from: classes2.dex */
public class Jd {
    public static AtomicInteger pvs = new AtomicInteger(0);
    public static final AtomicBoolean icD = new AtomicBoolean(false);

    public static void pvs(Context context, boolean z) {
        if (icD.compareAndSet(false, true)) {
            com.bytedance.sdk.component.sUS.pvs.icD.pvs(new pvs.C0052pvs().pvs(new Wyp()).icD(com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs.vG()).vG(com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs.NB()).pvs(com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs.Jd()).pvs(z).pvs(new qh()).pvs(so.pvs).icD(mnm.Jd().bNS()).pvs(mnm.Jd().mnm()).pvs(mnm.Jd().tCd()).pvs(), context);
            icD();
        }
    }

    public static void pvs(com.bytedance.sdk.openadsdk.icD.pvs pvsVar) {
        com.bytedance.sdk.component.sUS.pvs.Jd.pvs.pvs pvsVar2 = new com.bytedance.sdk.component.sUS.pvs.Jd.pvs.pvs(pvsVar.Jd(), pvsVar);
        pvsVar2.icD(pvsVar.NB() ? (byte) 1 : (byte) 2);
        pvsVar2.pvs((byte) 0);
        if (com.bytedance.sdk.component.sUS.pvs.icD.icD()) {
            pvs(mnm.pvs(), com.bytedance.sdk.openadsdk.multipro.icD.vG());
        }
        com.bytedance.sdk.component.sUS.pvs.icD.pvs(pvsVar2);
    }

    public static com.bytedance.sdk.openadsdk.Wyp.vG.icD pvs() {
        return kj.pvs;
    }

    public static void pvs(final List<String> list, final int i, final String str) {
        if (list == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.icD.vG.pvs(new com.bytedance.sdk.component.so.so("track") { // from class: com.bytedance.sdk.openadsdk.icD.pvs.Jd.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.sUS.pvs.icD.icD()) {
                    Jd.pvs(mnm.pvs(), com.bytedance.sdk.openadsdk.multipro.icD.vG());
                }
                com.bytedance.sdk.component.sUS.pvs.icD.pvs(com.bytedance.sdk.openadsdk.core.qh.pvs(mnm.pvs()), list, true, i, str);
            }
        });
    }

    public static void pvs(String str) {
        pvs(str, false);
    }

    public static void pvs(String str, boolean z) {
        if (com.bytedance.sdk.component.sUS.pvs.icD.icD()) {
            pvs(mnm.pvs(), com.bytedance.sdk.openadsdk.multipro.icD.vG());
        }
        com.bytedance.sdk.component.sUS.pvs.icD.pvs(str, z);
    }

    public static void icD() {
        com.bytedance.sdk.component.sUS.pvs.icD.vG();
    }

    public static void vG() {
        try {
            com.bytedance.sdk.component.sUS.pvs.icD.Jd();
            com.bytedance.sdk.component.sUS.pvs.icD.NB();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("AdLogSwitchUtils", th.getMessage());
        }
    }
}
