package com.bytedance.sdk.component.sUS.pvs;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.cR;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: EventMultiUtils.java */
/* loaded from: classes.dex */
public class Jd {
    public static final Jd pvs = new Jd();

    public void pvs(pvs pvsVar, Context context) {
        icD(pvsVar, context);
        so.yiw().pvs(context);
        so.yiw().pvs(pvsVar.Wyp());
        so.yiw().icD(pvsVar.yiw());
        so.yiw().vG(pvsVar.so());
        so.yiw().pvs(pvsVar.icD());
        so.yiw().Jd(pvsVar.Mxy());
        so.yiw().NB(pvsVar.sUS());
        so.yiw().pvs(pvsVar.pvs() == null ? com.bytedance.sdk.component.sUS.pvs.pvs.pvs.NB.pvs : pvsVar.pvs());
        so.yiw().icD(pvsVar.qh());
        so.yiw().pvs(pvsVar.Jd());
        so.yiw().pvs(pvsVar.vG());
        so.yiw().pvs(pvsVar.NB());
        com.bytedance.sdk.component.sUS.pvs.icD.vG.vG.pvs(pvsVar.Ju());
        com.bytedance.sdk.component.sUS.pvs.icD.vG.vG.icD(pvsVar.kj());
        pvs(pvsVar);
    }

    private void pvs(pvs pvsVar) {
        Executor NB;
        if (Looper.myLooper() != Looper.getMainLooper() && com.bytedance.sdk.component.sUS.pvs.vG.pvs.icD()) {
            com.bytedance.sdk.component.sUS.pvs.vG.pvs.pvs();
            return;
        }
        NB Jd = pvsVar.Jd();
        if (Jd == null || !com.bytedance.sdk.component.sUS.pvs.vG.pvs.icD() || (NB = Jd.NB()) == null) {
            return;
        }
        NB.execute(new Runnable() { // from class: com.bytedance.sdk.component.sUS.pvs.Jd.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.sUS.pvs.vG.pvs.pvs();
            }
        });
    }

    public void pvs(boolean z) {
        so.yiw().pvs(z);
    }

    private void icD(pvs pvsVar, Context context) {
        vG.pvs(context, "context == null");
        vG.pvs(pvsVar, "AdLogConfig == null");
        vG.pvs(pvsVar.Jd(), "AdLogDepend ==null");
    }

    private boolean pvs(Context context, NB nb) {
        if (context == null || nb == null) {
            return false;
        }
        if (nb.sUS() == 2) {
            return true;
        }
        if (nb.sUS() == 1) {
            return nb.IP();
        }
        try {
            return cR.pvs(context);
        } catch (Throwable th) {
            th.getMessage();
            return true;
        }
    }

    public void pvs() {
        final NB mnm = so.yiw().mnm();
        if (mnm == null || so.yiw().sUS() == null || mnm.Jd() == null) {
            return;
        }
        if (so.yiw().icD()) {
            if (pvs(so.yiw().sUS(), mnm)) {
                so.yiw().Mxy();
                return;
            } else if (vG()) {
                mnm.Jd().execute(new com.bytedance.sdk.component.sUS.pvs.NB.NB("start") { // from class: com.bytedance.sdk.component.sUS.pvs.Jd.2
                    @Override // java.lang.Runnable
                    public void run() {
                        Jd.this.pvs(mnm.sUS());
                    }
                });
                return;
            } else {
                pvs(mnm.sUS());
                return;
            }
        }
        so.yiw().Mxy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(int i) {
        if (i == 0) {
            com.bytedance.sdk.component.sUS.pvs.icD.icD.pvs.pvs();
        } else if (i == 1) {
            com.bytedance.sdk.component.sUS.pvs.icD.icD.icD.pvs();
        }
    }

    public void icD() {
        final NB mnm = so.yiw().mnm();
        if (mnm == null || so.yiw().sUS() == null || mnm.Jd() == null) {
            return;
        }
        if (so.yiw().icD()) {
            if (pvs(so.yiw().sUS(), mnm)) {
                so.yiw().qh();
                return;
            } else if (vG()) {
                mnm.Jd().execute(new com.bytedance.sdk.component.sUS.pvs.NB.NB("stop") { // from class: com.bytedance.sdk.component.sUS.pvs.Jd.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Jd.this.icD(mnm.sUS());
                    }
                });
                return;
            } else {
                icD(mnm.sUS());
                return;
            }
        }
        so.yiw().qh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(int i) {
        if (i == 0) {
            com.bytedance.sdk.component.sUS.pvs.icD.icD.pvs.icD();
        } else if (i == 1) {
            com.bytedance.sdk.component.sUS.pvs.icD.icD.icD.icD();
        }
    }

    public void pvs(com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar) {
        icD(pvsVar);
    }

    private boolean vG() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    private void icD(final com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar) {
        final NB mnm = so.yiw().mnm();
        if (pvsVar == null || mnm == null || so.yiw().sUS() == null || mnm.Jd() == null) {
            return;
        }
        if (so.yiw().icD()) {
            if (pvs(so.yiw().sUS(), mnm)) {
                so.yiw().pvs(pvsVar);
                return;
            }
            vG();
            if (vG()) {
                mnm.Jd().execute(new com.bytedance.sdk.component.sUS.pvs.NB.NB("dispatchEvent") { // from class: com.bytedance.sdk.component.sUS.pvs.Jd.4
                    @Override // java.lang.Runnable
                    public void run() {
                        Jd.this.pvs(pvsVar, mnm.sUS());
                    }
                });
                return;
            } else {
                pvs(pvsVar, mnm.sUS());
                return;
            }
        }
        so.yiw().pvs(pvsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar, int i) {
        if (i == 0) {
            com.bytedance.sdk.component.sUS.pvs.icD.icD.pvs.pvs(pvsVar);
        } else if (i == 1) {
            com.bytedance.sdk.component.sUS.pvs.icD.icD.icD.pvs(pvsVar);
        }
    }

    public void pvs(final String str, final List<String> list, final boolean z, Map<String, String> map, final int i, final String str2) {
        final NB mnm = so.yiw().mnm();
        if (mnm == null || so.yiw().sUS() == null || mnm.Jd() == null) {
            return;
        }
        if (mnm.so()) {
            if (mnm.sUS() == 1) {
                if (list == null || list.isEmpty()) {
                    return;
                }
            } else if (mnm.sUS() == 0 && (TextUtils.isEmpty(str) || list == null || list.isEmpty())) {
                return;
            }
            if (so.yiw().icD() && !pvs(so.yiw().sUS(), mnm)) {
                if (vG()) {
                    mnm.Jd().execute(new com.bytedance.sdk.component.sUS.pvs.NB.NB("trackFailed") { // from class: com.bytedance.sdk.component.sUS.pvs.Jd.5
                        @Override // java.lang.Runnable
                        public void run() {
                            Jd.this.pvs(str, (List<String>) list, z, mnm.sUS(), i, str2);
                        }
                    });
                    return;
                } else {
                    pvs(str, list, z, mnm.sUS(), i, str2);
                    return;
                }
            }
            so.yiw().pvs(str, list, z, map, i, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(String str, List<String> list, boolean z, int i, int i2, String str2) {
        if (i == 0) {
            com.bytedance.sdk.component.sUS.pvs.icD.icD.pvs.pvs(str, list, z);
        } else if (i == 1) {
            com.bytedance.sdk.component.sUS.pvs.icD.icD.icD.pvs(str, list, z, i2, str2);
        }
    }

    public void pvs(final String str, final boolean z) {
        final NB mnm = so.yiw().mnm();
        if (mnm == null || so.yiw().sUS() == null || mnm.Jd() == null || !mnm.so()) {
            return;
        }
        if (mnm.sUS() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        if (!so.yiw().icD() || pvs(so.yiw().sUS(), mnm)) {
            so.yiw().pvs(str, z);
        } else if (vG()) {
            mnm.Jd().execute(new com.bytedance.sdk.component.sUS.pvs.NB.NB("trackFailed") { // from class: com.bytedance.sdk.component.sUS.pvs.Jd.6
                @Override // java.lang.Runnable
                public void run() {
                    Jd.this.pvs(str, mnm.sUS(), z);
                }
            });
        } else {
            pvs(str, mnm.sUS(), z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(String str, int i, boolean z) {
        if (i == 0) {
            com.bytedance.sdk.component.sUS.pvs.icD.icD.pvs.pvs(str);
        } else if (i == 1) {
            com.bytedance.sdk.component.sUS.pvs.icD.icD.icD.pvs(str, z);
        }
    }
}
