package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.so.so;
import com.bytedance.sdk.component.utils.dyT;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.component.sUS;
import com.bytedance.sdk.openadsdk.core.Ju;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.ny;
import com.bytedance.sdk.openadsdk.core.model.uc;
import com.bytedance.sdk.openadsdk.core.vA;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.gA;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TTAppOpenAdLoadManager.java */
/* loaded from: classes2.dex */
public class yiw implements dyT.pvs {
    private final vA<com.bytedance.sdk.openadsdk.icD.pvs> icD;
    private final Context pvs;
    private boolean qh;
    private AdSlot sUS;
    private int so;
    private final sUS vG;
    private PAGAppOpenAdLoadListener yiw;
    private final AtomicBoolean Jd = new AtomicBoolean(false);
    private int NB = 0;
    private volatile int Mxy = 0;
    private final ny Wyp = new ny();

    public yiw(Context context) {
        if (context != null) {
            this.pvs = context.getApplicationContext();
        } else {
            this.pvs = mnm.pvs();
        }
        this.icD = mnm.vG();
        this.vG = sUS.pvs(this.pvs);
    }

    public static yiw pvs(Context context) {
        return new yiw(context);
    }

    public void pvs(AdSlot adSlot, com.bytedance.sdk.openadsdk.common.Jd jd, int i) {
        if (jd == null) {
            return;
        }
        if (i <= 0) {
            i = 3500;
        }
        this.sUS = adSlot;
        this.Wyp.pvs = !TextUtils.isEmpty(adSlot.getBidAdm());
        if (jd instanceof PAGAppOpenAdLoadListener) {
            this.yiw = (PAGAppOpenAdLoadListener) jd;
        }
        this.NB = pvs(this.sUS);
        this.so = i;
        this.Wyp.pvs(gA.pvs());
        if (this.Wyp.pvs || com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().dX(this.sUS.getCodeId()) == 0) {
            icD(this.sUS);
        }
        if (this.Wyp.pvs) {
            return;
        }
        new dyT(Ju.icD().getLooper(), this).sendEmptyMessageDelayed(1, i);
        pvs();
    }

    private void icD(final AdSlot adSlot) {
        final gA pvs = gA.pvs();
        this.Mxy = 1;
        uc ucVar = new uc();
        ucVar.Wyp = this.Wyp;
        ucVar.Jd = 1;
        ucVar.so = 2;
        this.icD.pvs(adSlot, ucVar, 3, new vA.pvs() { // from class: com.bytedance.sdk.openadsdk.component.yiw.1
            @Override // com.bytedance.sdk.openadsdk.core.vA.pvs
            public void pvs(int i, String str) {
                yiw.this.Mxy = 3;
                yiw.this.pvs(new com.bytedance.sdk.openadsdk.component.NB.icD(2, 100, i, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.vA.pvs
            public void pvs(com.bytedance.sdk.openadsdk.core.model.pvs pvsVar, com.bytedance.sdk.openadsdk.core.model.icD icd) {
                yiw.this.Mxy = 2;
                if (pvsVar == null || pvsVar.vG() == null || pvsVar.vG().size() == 0) {
                    yiw.this.Mxy = 3;
                    yiw.this.pvs(new com.bytedance.sdk.openadsdk.component.NB.icD(2, 100, 20001, com.bytedance.sdk.openadsdk.core.yiw.pvs(20001)));
                    icd.pvs(-3);
                    com.bytedance.sdk.openadsdk.core.model.icD.pvs(icd);
                    return;
                }
                final cR cRVar = pvsVar.vG().get(0);
                long IP = cRVar.IP();
                yiw.this.Wyp.icD = IP;
                if (cRVar.OUT()) {
                    yiw.this.pvs(new com.bytedance.sdk.openadsdk.component.NB.icD(1, 100, cRVar));
                    return;
                }
                if (cR.NB(cRVar)) {
                    int kj = mnm.Jd().kj();
                    if (kj == 1 || kj == 3) {
                        yiw.this.Wyp.icD = -1L;
                        yiw.this.Wyp.pvs(3);
                        yiw.this.pvs(new com.bytedance.sdk.openadsdk.component.NB.icD(1, 100, cRVar));
                        yiw.this.pvs(cRVar, adSlot, false);
                        return;
                    }
                    yiw.this.pvs(cRVar, adSlot, !r11.Wyp.pvs);
                } else {
                    if (mnm.Jd().qh() == 1) {
                        yiw.this.Wyp.icD = -1L;
                        yiw.this.Wyp.pvs(3);
                        yiw.this.pvs(new com.bytedance.sdk.openadsdk.component.NB.icD(1, 100, cRVar));
                        yiw.this.pvs(cRVar, false);
                        return;
                    }
                    yiw.this.pvs(cRVar, !r11.Wyp.pvs);
                }
                if (yiw.this.Wyp.pvs) {
                    com.bytedance.sdk.openadsdk.Wyp.vG.pvs(cRVar, pvs.vG());
                    Object[] objArr = new Object[3];
                    Long.valueOf(IP);
                    if (IP == 0) {
                        yiw.this.Wyp.pvs(2);
                        yiw.this.pvs(new com.bytedance.sdk.openadsdk.component.NB.icD(1, 100, cRVar));
                    } else {
                        Ju.icD().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.yiw.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                yiw.this.Wyp.pvs(2);
                                yiw.this.pvs(new com.bytedance.sdk.openadsdk.component.NB.icD(1, 100, cRVar));
                            }
                        }, IP);
                    }
                }
            }
        });
    }

    private void pvs() {
        ae.icD(new so("tryGetAppOpenAdFromCache") { // from class: com.bytedance.sdk.openadsdk.component.yiw.2
            @Override // java.lang.Runnable
            public void run() {
                int kj;
                cR NB = yiw.this.vG.NB(yiw.this.NB);
                if (NB == null) {
                    yiw.this.pvs(false);
                    return;
                }
                boolean NB2 = cR.NB(NB);
                if (NB.OUT()) {
                    yiw.this.pvs(new com.bytedance.sdk.openadsdk.component.NB.icD(1, 101, NB));
                    return;
                }
                if (!NB2 && mnm.Jd().qh() == 1) {
                    yiw.this.pvs(new com.bytedance.sdk.openadsdk.component.NB.icD(1, 101, NB));
                    return;
                }
                if (!NB2 || ((kj = mnm.Jd().kj()) != 2 && kj != 3)) {
                    if (yiw.this.vG.icD(yiw.this.NB) || yiw.this.vG.Jd(yiw.this.NB)) {
                        if (com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().dX(yiw.this.sUS.getCodeId()) == 0) {
                            yiw.this.vG.yiw(yiw.this.NB);
                        }
                        if (!NB2) {
                            if (yiw.this.vG.icD(NB)) {
                                yiw.this.pvs(new com.bytedance.sdk.openadsdk.component.NB.icD(1, 101, NB));
                                return;
                            } else {
                                yiw.this.pvs(false);
                                com.bytedance.sdk.openadsdk.component.Jd.pvs.icD(NB);
                                return;
                            }
                        }
                        if (TextUtils.isEmpty(yiw.this.vG.pvs(NB))) {
                            yiw.this.pvs(false);
                            com.bytedance.sdk.openadsdk.component.Jd.pvs.icD(NB);
                            return;
                        } else {
                            yiw.this.pvs(new com.bytedance.sdk.openadsdk.component.NB.icD(1, 101, NB));
                            return;
                        }
                    }
                    yiw.this.pvs(true);
                    return;
                }
                yiw.this.pvs(new com.bytedance.sdk.openadsdk.component.NB.icD(1, 101, NB));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(boolean z) {
        if (z) {
            this.vG.yiw(this.NB);
        }
        if (com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().dX(this.sUS.getCodeId()) == 1) {
            icD(this.sUS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(final cR cRVar, AdSlot adSlot, final boolean z) {
        this.vG.pvs(cRVar, adSlot, this.Wyp, new sUS.vG() { // from class: com.bytedance.sdk.openadsdk.component.yiw.3
            @Override // com.bytedance.sdk.openadsdk.component.sUS.vG
            public void pvs() {
                Log.d("TTAppOpenAdLoadManager", "preLoadSuccess: video load success");
                if (z) {
                    yiw.this.Mxy = 4;
                    com.bytedance.sdk.openadsdk.component.NB.icD icd = new com.bytedance.sdk.openadsdk.component.NB.icD(1, 100, cRVar);
                    icd.pvs(true);
                    yiw.this.pvs(icd);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.sUS.vG
            public void pvs(int i, String str) {
                if (z) {
                    yiw.this.Mxy = 5;
                    yiw.this.pvs(new com.bytedance.sdk.openadsdk.component.NB.icD(2, 100, 10003, com.bytedance.sdk.openadsdk.core.yiw.pvs(10003)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(final cR cRVar, final boolean z) {
        this.vG.pvs(cRVar, this.Wyp, new sUS.icD() { // from class: com.bytedance.sdk.openadsdk.component.yiw.4
            @Override // com.bytedance.sdk.openadsdk.component.sUS.icD
            public void pvs(com.bytedance.sdk.openadsdk.qh.pvs.icD icd) {
                Log.d("TTAppOpenAdLoadManager", "preLoadSuccess: image load success");
                if (z) {
                    yiw.this.Mxy = 4;
                    com.bytedance.sdk.openadsdk.component.NB.icD icd2 = new com.bytedance.sdk.openadsdk.component.NB.icD(1, 100, cRVar);
                    icd2.pvs(true);
                    yiw.this.pvs(icd2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.sUS.icD
            public void pvs() {
                Log.d("TTAppOpenAdLoadManager", "preLoadFail: image load fail");
                if (z) {
                    yiw.this.Mxy = 5;
                    yiw.this.pvs(new com.bytedance.sdk.openadsdk.component.NB.icD(2, 100, 10003, com.bytedance.sdk.openadsdk.core.yiw.pvs(10003)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(com.bytedance.sdk.openadsdk.component.NB.icD icd) {
        int icD = icd.icD();
        int vG = icd.vG();
        if (this.Jd.get()) {
            if (icD == 1 && vG == 100 && icd.pvs()) {
                sUS.pvs(mnm.pvs()).pvs(new com.bytedance.sdk.openadsdk.component.NB.pvs(this.NB, icd.Jd()));
                if (this.qh) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.Jd.pvs.pvs(icd.Jd(), 1, this.Wyp);
                return;
            }
            return;
        }
        if (icD != 1) {
            if (icD == 2 || icD == 3) {
                PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener = this.yiw;
                if (pAGAppOpenAdLoadListener != null) {
                    pAGAppOpenAdLoadListener.onError(icd.NB(), icd.sUS());
                }
                this.Jd.set(true);
                if (icD == 3) {
                    com.bytedance.sdk.openadsdk.component.Jd.pvs.pvs(this.Mxy, this.so);
                    return;
                }
                return;
            }
            return;
        }
        if (this.yiw != null) {
            this.yiw.onAdLoaded(new Jd(this.pvs, icd.Jd(), vG == 101, this.sUS));
        }
        this.Jd.set(true);
        if (vG == 101) {
            com.bytedance.sdk.openadsdk.component.Jd.pvs.pvs(icd.Jd(), this.Wyp.pvs().vG());
            return;
        }
        if (vG == 100) {
            com.bytedance.sdk.openadsdk.component.Jd.pvs.pvs(icd.Jd(), 0, this.Wyp);
            this.qh = true;
            if (this.Wyp.pvs) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().dX(this.sUS.getCodeId()) == 0) {
                this.vG.pvs(this.sUS);
            } else {
                this.vG.pvs(new com.bytedance.sdk.openadsdk.component.NB.pvs(this.NB, icd.Jd()));
            }
        }
    }

    public int pvs(AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.component.utils.dyT.pvs
    public void pvs(Message message) {
        if (message.what != 1 || this.Jd.get()) {
            return;
        }
        pvs(new com.bytedance.sdk.openadsdk.component.NB.icD(3, 102, 10002, com.bytedance.sdk.openadsdk.core.yiw.pvs(10002)));
    }
}
