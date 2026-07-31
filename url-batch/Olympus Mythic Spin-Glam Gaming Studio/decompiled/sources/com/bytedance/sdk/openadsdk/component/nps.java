package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.kjb;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.component.hhw;
import com.bytedance.sdk.openadsdk.core.bvs;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.doe;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.so;
import com.bytedance.sdk.openadsdk.core.nqi;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.ww;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class nps implements kjb.zmn {
    private final nqi<com.bytedance.sdk.openadsdk.fb.zmn> fs;
    private AdSlot hhw;
    private PAGAppOpenAdLoadListener nps;
    private boolean rc;
    private int zg;
    private final Context zmn;
    private final hhw zn;
    private final AtomicBoolean fb = new AtomicBoolean(false);
    private int btk = 0;
    private volatile int bvs = 0;
    private final so iv = new so();

    public nps(Context context) {
        if (context != null) {
            this.zmn = context.getApplicationContext();
        } else {
            this.zmn = kgc.zmn();
        }
        this.fs = kgc.zn();
        this.zn = hhw.zmn(this.zmn);
    }

    public static nps zmn(Context context) {
        return new nps(context);
    }

    public void zmn(@NonNull AdSlot adSlot, com.bytedance.sdk.openadsdk.common.nps npsVar, int i) {
        if (npsVar == null) {
            return;
        }
        if (i <= 0) {
            i = com.bytedance.sdk.openadsdk.component.nps.zmn.nps();
        }
        this.hhw = adSlot;
        adSlot.setCacheScene(0);
        this.iv.zmn = !TextUtils.isEmpty(this.hhw.getBidAdm());
        if (npsVar instanceof PAGAppOpenAdLoadListener) {
            this.nps = (PAGAppOpenAdLoadListener) npsVar;
        }
        this.btk = zmn(this.hhw);
        this.zg = i;
        this.iv.zmn(ww.fs());
        this.iv.fs(com.bytedance.sdk.openadsdk.component.nps.zmn.fs());
        this.iv.fs(com.bytedance.sdk.openadsdk.component.nps.zmn.zn());
        if (this.iv.zmn) {
            fs(this.hhw);
        } else {
            new kjb(cn.fs().getLooper(), this).sendEmptyMessageDelayed(1, i);
            zmn();
        }
    }

    private void fs(@NonNull AdSlot adSlot) {
        this.bvs = 1;
        zn(adSlot);
    }

    private void zn(final AdSlot adSlot) {
        final ww fs = ww.fs();
        com.bytedance.sdk.openadsdk.core.model.kjb kjbVar = new com.bytedance.sdk.openadsdk.core.model.kjb();
        kjbVar.rc = this.iv;
        kjbVar.fb = 1;
        kjbVar.bvs = 2;
        this.fs.zmn(adSlot, kjbVar, 3, new doe() { // from class: com.bytedance.sdk.openadsdk.component.nps.1
            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
            public void zmn(int i, String str) {
                nps.this.bvs = 3;
                nps.this.zmn(new com.bytedance.sdk.openadsdk.component.btk.zn(2, 100, i, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
            public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.zn znVar) {
                nps.this.zmn(zmnVar, znVar, adSlot, fs);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(final com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.zn znVar, AdSlot adSlot, ww wwVar) {
        this.bvs = 2;
        if (zmnVar == null || zmnVar.btk() == null || zmnVar.btk().size() == 0) {
            this.bvs = 3;
            zmn(new com.bytedance.sdk.openadsdk.component.btk.zn(2, 100, Sdk.SDKError.Reason.AD_SERVER_ERROR_VALUE, bvs.zmn(Sdk.SDKError.Reason.AD_SERVER_ERROR_VALUE)));
            znVar.zmn(-3);
            znVar.zn(3);
            com.bytedance.sdk.openadsdk.core.model.zn.zmn(znVar);
            return;
        }
        final com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = zmnVar.btk().get(0);
        long xrr = nqiVar.xrr();
        so soVar = this.iv;
        soVar.fs = xrr;
        nqiVar.zn(soVar.iv());
        boolean hhw = com.bytedance.sdk.openadsdk.core.model.nqi.hhw(nqiVar);
        if (nqiVar.yj()) {
            zmn(new com.bytedance.sdk.openadsdk.component.btk.zn(1, 100, nqiVar, zmnVar));
            return;
        }
        if (hhw || nqiVar.dbc()) {
            zmn(new com.bytedance.sdk.openadsdk.component.btk.zn(1, 100, nqiVar, zmnVar));
            if (com.bytedance.sdk.openadsdk.core.model.nqi.btk(nqiVar)) {
                zmn(nqiVar, adSlot, false, zmnVar);
                return;
            } else {
                zmn(nqiVar, false, zmnVar);
                return;
            }
        }
        if (com.bytedance.sdk.openadsdk.core.model.nqi.btk(nqiVar)) {
            if (com.bytedance.sdk.openadsdk.component.nps.zmn.hhw()) {
                so soVar2 = this.iv;
                soVar2.fs = -1L;
                soVar2.zmn(3);
                zmn(new com.bytedance.sdk.openadsdk.component.btk.zn(1, 100, nqiVar, zmnVar));
                zmn(nqiVar, adSlot, false, zmnVar);
                return;
            }
            zmn(nqiVar, adSlot, !this.iv.zmn, zmnVar);
            if (this.iv.zmn) {
                com.bytedance.sdk.openadsdk.cyb.fb.zmn(nqiVar, wwVar.fb());
                if (xrr == 0) {
                    this.iv.zmn(2);
                    zmn(new com.bytedance.sdk.openadsdk.component.btk.zn(1, 100, nqiVar, zmnVar));
                    return;
                } else {
                    cn.fs().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.nps.2
                        @Override // java.lang.Runnable
                        public void run() {
                            nps.this.iv.zmn(2);
                            nps.this.zmn(new com.bytedance.sdk.openadsdk.component.btk.zn(1, 100, nqiVar, zmnVar));
                        }
                    }, xrr);
                    return;
                }
            }
            return;
        }
        so soVar3 = this.iv;
        soVar3.fs = -1L;
        soVar3.zmn(3);
        zmn(new com.bytedance.sdk.openadsdk.component.btk.zn(1, 100, nqiVar, zmnVar));
        zmn(nqiVar, false, zmnVar);
    }

    private void zmn() {
        nu.zn((Runnable) new com.bytedance.sdk.component.zg.fs.zn("tryGetAppOpenAdFromCache") { // from class: com.bytedance.sdk.openadsdk.component.nps.3
            @Override // java.lang.Runnable
            public void run() {
                nps.this.fs();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs() {
        final ww fs = ww.fs();
        com.bytedance.sdk.openadsdk.core.model.kjb kjbVar = new com.bytedance.sdk.openadsdk.core.model.kjb();
        kjbVar.rc = this.iv;
        kjbVar.fb = 1;
        kjbVar.bvs = 2;
        this.bvs = 1;
        this.fs.zmn(this.hhw, kjbVar, 3, new doe() { // from class: com.bytedance.sdk.openadsdk.component.nps.4
            boolean zmn = false;

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.phc
            public String zmn() {
                if (com.bytedance.sdk.openadsdk.component.nps.zmn.btk()) {
                    com.bytedance.sdk.openadsdk.component.btk.fs zmn = com.bytedance.sdk.openadsdk.common.kgc.zmn().zmn(nps.this.hhw);
                    if (zmn == null) {
                        return null;
                    }
                    nps.this.hhw.setCacheTime(zmn.fb());
                    return zmn.fs();
                }
                return nps.this.zn.zn(nps.this.btk);
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.phc
            public boolean zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
                com.bytedance.sdk.openadsdk.core.model.nqi nps;
                if (zmnVar != null && zmnVar.hhw() && (nps = zmnVar.nps()) != null) {
                    boolean btk = com.bytedance.sdk.openadsdk.core.model.nqi.btk(nps);
                    if (nps.yj() || !btk || com.bytedance.sdk.openadsdk.component.nps.zmn.hhw()) {
                        this.zmn = !nps.this.zn.fs(nps.utx());
                    } else if (!TextUtils.isEmpty(nps.this.zn.zmn(nps))) {
                        this.zmn = !nps.this.zn.fs(nps.utx());
                    } else {
                        this.zmn = false;
                        com.bytedance.sdk.openadsdk.component.fb.fs.fs(zmnVar.nps());
                    }
                    com.bytedance.sdk.openadsdk.core.rt.zn.fb.zmn(nps);
                }
                return this.zmn;
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
            public void zmn(int i, String str) {
                nps.this.bvs = 3;
                nps.this.zmn(new com.bytedance.sdk.openadsdk.component.btk.zn(2, 100, i, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
            public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.zn znVar) {
                com.bytedance.sdk.openadsdk.core.model.nqi nps;
                if (zmnVar == null || (nps = zmnVar.nps()) == null) {
                    return;
                }
                nps.zn(nps.this.iv.iv());
                if (this.zmn) {
                    nps.this.zn.zmn(nps.utx(), nps.wbj());
                    nps.this.zmn(new com.bytedance.sdk.openadsdk.component.btk.zn(1, 101, nps, (com.bytedance.sdk.openadsdk.core.model.zmn) null));
                } else {
                    nps npsVar = nps.this;
                    npsVar.zmn(zmnVar, znVar, npsVar.hhw, fs);
                }
            }
        });
    }

    private void zmn(@NonNull final com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, AdSlot adSlot, final boolean z, final com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        this.zn.zmn(nqiVar, adSlot, this.iv, new hhw.fs() { // from class: com.bytedance.sdk.openadsdk.component.nps.5
            @Override // com.bytedance.sdk.openadsdk.component.hhw.fs
            public void zmn() {
                if (z) {
                    nps.this.bvs = 4;
                    com.bytedance.sdk.openadsdk.component.btk.zn znVar = new com.bytedance.sdk.openadsdk.component.btk.zn(1, 100, nqiVar, zmnVar);
                    znVar.zmn(true);
                    nps.this.zmn(znVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.hhw.fs
            public void zmn(int i, String str) {
                if (z) {
                    nps.this.bvs = 5;
                    nps.this.zmn(new com.bytedance.sdk.openadsdk.component.btk.zn(2, 100, 10003, bvs.zmn(10003)));
                }
            }
        });
    }

    private void zmn(@NonNull final com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, final boolean z, final com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        this.zn.zmn(nqiVar, this.iv, new hhw.zmn() { // from class: com.bytedance.sdk.openadsdk.component.nps.6
            @Override // com.bytedance.sdk.openadsdk.component.hhw.zmn
            public void zmn(com.bytedance.sdk.openadsdk.iqz.zmn.fs fsVar) {
                if (z) {
                    nps.this.bvs = 4;
                    com.bytedance.sdk.openadsdk.component.btk.zn znVar = new com.bytedance.sdk.openadsdk.component.btk.zn(1, 100, nqiVar, zmnVar);
                    znVar.zmn(true);
                    nps.this.zmn(znVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.hhw.zmn
            public void zmn() {
                if (z) {
                    nps.this.bvs = 5;
                    nps.this.zmn(new com.bytedance.sdk.openadsdk.component.btk.zn(2, 100, 10003, bvs.zmn(10003)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(com.bytedance.sdk.openadsdk.component.btk.zn znVar) {
        int fs = znVar.fs();
        int zn = znVar.zn();
        com.bytedance.sdk.openadsdk.component.fb.fs.zmn(this.iv, zn, fs);
        if (!this.fb.compareAndSet(false, true)) {
            if (fs == 1 && zn == 100 && !this.iv.zmn) {
                hhw.zmn(kgc.zmn()).zmn(new com.bytedance.sdk.openadsdk.component.btk.zmn(this.btk, znVar.fb(), znVar.zmn()));
                if (this.rc) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.fb.fs.zmn(znVar.fb(), 1, this.iv);
                return;
            }
            return;
        }
        if (fs != 1) {
            if (fs == 2 || fs == 3) {
                PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener = this.nps;
                if (pAGAppOpenAdLoadListener != null) {
                    pAGAppOpenAdLoadListener.onError(znVar.btk(), znVar.hhw());
                }
                if (fs == 3) {
                    com.bytedance.sdk.openadsdk.component.fb.fs.zmn(this.bvs, this.zg, this.iv);
                    return;
                }
                return;
            }
            return;
        }
        if (zn == 100 && !this.iv.zmn) {
            this.zn.zmn(new com.bytedance.sdk.openadsdk.component.btk.zmn(this.btk, znVar.fb(), znVar.zmn()));
        }
        if (this.nps != null) {
            this.nps.onAdLoaded(new fb(this.zmn, znVar.fb(), zn == 101, this.hhw));
        }
        if (zn == 101) {
            com.bytedance.sdk.openadsdk.component.fb.fs.zmn(znVar.fb(), this.iv.zmn().fb());
        } else if (zn == 100) {
            com.bytedance.sdk.openadsdk.component.fb.fs.zmn(znVar.fb(), 0, this.iv);
            this.rc = true;
        }
    }

    public int zmn(@NonNull AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.component.utils.kjb.zmn
    public void zmn(Message message) {
        if (message.what != 1 || this.fb.get()) {
            return;
        }
        zmn(new com.bytedance.sdk.openadsdk.component.btk.zn(3, 102, Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE, bvs.zmn(Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE)));
    }
}
