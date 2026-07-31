package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.nu;

/* loaded from: classes5.dex */
public class fs {
    public static void zmn(final nqi nqiVar, final boolean z, final boolean z2) {
        com.bytedance.sdk.openadsdk.core.cn.fs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.fs.1
            @Override // java.lang.Runnable
            public void run() {
                nqi nqiVar2 = nqi.this;
                if (nqiVar2 == null || nqiVar2.dbc() || nqi.hhw(nqi.this)) {
                    return;
                }
                try {
                    Context zmn = com.bytedance.sdk.openadsdk.core.kgc.zmn();
                    AdSlot utx = nqi.this.utx();
                    if (utx != null) {
                        boolean zn = com.bytedance.sdk.openadsdk.utils.fs.zn();
                        if (zn) {
                            if (z2) {
                                kgc.zmn(zmn).zmn(utx.getCodeId(), nqi.this);
                            } else {
                                nps.zmn(zmn).zmn(utx.getCodeId(), nqi.this);
                            }
                        } else if (z2) {
                            olo.zmn(zmn).zmn(utx.getCodeId(), nqi.this);
                        } else {
                            hhw.zmn(zmn).zmn(utx.getCodeId(), nqi.this);
                        }
                        if (z) {
                            if (zn) {
                                if (z2) {
                                    kgc.zmn(zmn).zmn(utx);
                                    return;
                                } else {
                                    nps.zmn(zmn).zmn(utx);
                                    return;
                                }
                            }
                            if (z2) {
                                olo.zmn(zmn).zmn(utx);
                            } else {
                                hhw.zmn(zmn).zmn(utx);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static boolean zmn(final com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        com.bytedance.sdk.openadsdk.activity.single.fs fsVar2;
        int i = 0;
        if (fsVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.activity.single.zg zgVar = fsVar.tdm;
        if (zgVar == null || zgVar.jy() == null) {
            fsVar2 = null;
        } else {
            fsVar2 = fsVar.tdm.jy();
            if (fsVar2 != null) {
                i = fsVar2.ev();
            }
        }
        boolean zmn = nu.zmn(fsVar.nu, fsVar.fs, fsVar.btk, fsVar.fb ? 7 : 5, i);
        if (zmn) {
            if (fsVar.fs != null) {
                am.zmn().zmn(fsVar.fs, new am.fs() { // from class: com.bytedance.sdk.openadsdk.component.reward.fs.2
                    @Override // com.bytedance.sdk.openadsdk.core.am.fs
                    public void zmn() {
                        com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar3;
                        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar4 = com.bytedance.sdk.openadsdk.component.reward.zmn.fs.this;
                        if (fsVar4 == null || (fsVar3 = fsVar4.ww) == null) {
                            return;
                        }
                        fsVar3.xrr();
                    }
                });
            }
            if (fsVar2 != null && fsVar2.rp()) {
                fsVar2.am();
            }
        }
        return zmn;
    }
}
