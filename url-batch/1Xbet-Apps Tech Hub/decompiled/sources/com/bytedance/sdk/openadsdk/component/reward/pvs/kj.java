package com.bytedance.sdk.openadsdk.component.reward.pvs;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RewardFullUgenEndcardManager.java */
/* loaded from: classes2.dex */
public class kj {
    private com.bytedance.adsdk.ugeno.component.icD IP;
    private com.bytedance.adsdk.ugeno.component.icD Ju;
    private String Mxy;
    private final pvs icD;
    final cR pvs;
    private volatile long sUS;
    private volatile long so;
    private boolean vA;
    private FrameLayout vG;
    private volatile long yiw;
    private final AtomicBoolean Jd = new AtomicBoolean(false);
    private final AtomicBoolean NB = new AtomicBoolean(false);
    private final AtomicBoolean Wyp = new AtomicBoolean(false);
    private long qh = 0;
    private long kj = 0;
    private String bNS = null;
    private boolean mnm = false;

    public kj(pvs pvsVar) {
        this.icD = pvsVar;
        this.pvs = pvsVar.icD;
        this.Mxy = pvsVar.NB;
    }

    public void pvs() {
        if (this.vA) {
            return;
        }
        this.vA = true;
        icD();
    }

    void icD() {
        this.vG = (FrameLayout) this.icD.qD.findViewById(com.bytedance.sdk.openadsdk.utils.kj.bNS);
    }

    public void vG() {
        com.bytedance.sdk.openadsdk.core.ugen.NB.pvs TN;
        cR cRVar = this.pvs;
        if (cRVar == null || (TN = cRVar.TN()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.ugen.icD.icD icd = new com.bytedance.sdk.openadsdk.core.ugen.icD.icD(this.icD.od, this.pvs, TN, this.Mxy, new com.bytedance.sdk.openadsdk.core.ugen.Jd.icD() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.kj.1
            @Override // com.bytedance.sdk.openadsdk.core.ugen.Jd.vG
            public void pvs() {
                kj.this.qh = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.Jd.vG
            public void pvs(int i, String str, String str2) {
                kj.this.bNS = str2;
                kj.this.Jd.set(false);
                com.bytedance.sdk.openadsdk.icD.vG.pvs(kj.this.pvs, false, kj.this.Mxy, "fail", SystemClock.elapsedRealtime() - kj.this.qh, str2, "endcard", i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.Jd.vG
            public void pvs(String str) {
                kj.this.bNS = str;
                com.bytedance.sdk.openadsdk.icD.vG.pvs(kj.this.pvs, false, kj.this.Mxy, FirebaseAnalytics.Param.SUCCESS, SystemClock.elapsedRealtime() - kj.this.qh, str, "endcard", 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.Jd.icD
            public void icD() {
                kj.this.NB();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.Jd.icD
            public void pvs(int i, String str) {
                kj.this.Jd.set(false);
                com.bytedance.sdk.openadsdk.icD.vG.pvs(kj.this.pvs, kj.this.Mxy, SystemClock.elapsedRealtime() - kj.this.sUS, i, str, (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.Jd.icD
            public void pvs(com.bytedance.adsdk.ugeno.component.icD<View> icd2) {
                kj.this.Ju = icd2;
                kj.this.Jd.set(true);
                kj.this.yiw = SystemClock.elapsedRealtime();
                kj.this.IP();
                kj.this.Mxy();
                com.bytedance.sdk.openadsdk.icD.vG.pvs(kj.this.pvs, kj.this.Mxy, kj.this.yiw - kj.this.sUS);
            }
        });
        if (this.pvs.NZI() != null) {
            icd.pvs(new com.bytedance.sdk.openadsdk.core.ugen.Jd.pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.kj.2
                @Override // com.bytedance.sdk.openadsdk.core.ugen.Jd.pvs
                public void icD() {
                }

                @Override // com.bytedance.sdk.openadsdk.core.ugen.Jd.pvs
                public String pvs() {
                    return "normal";
                }
            });
        }
        icd.pvs();
        icd.pvs(this.icD.gSd.Wyp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IP() {
        com.bytedance.sdk.openadsdk.core.ugen.NB.pvs NZI;
        cR cRVar = this.pvs;
        if (cRVar == null || (NZI = cRVar.NZI()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.ugen.icD.icD icd = new com.bytedance.sdk.openadsdk.core.ugen.icD.icD(this.icD.od, this.pvs, NZI, this.Mxy, new com.bytedance.sdk.openadsdk.core.ugen.Jd.icD() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.kj.3
            @Override // com.bytedance.sdk.openadsdk.core.ugen.Jd.icD
            public void icD() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.Jd.vG
            public void pvs() {
                kj.this.kj = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.Jd.vG
            public void pvs(int i, String str, String str2) {
                kj.this.NB.set(false);
                com.bytedance.sdk.openadsdk.icD.vG.pvs(kj.this.pvs, true, kj.this.Mxy, "fail", SystemClock.elapsedRealtime() - kj.this.kj, str2, "endcard", i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.Jd.vG
            public void pvs(String str) {
                com.bytedance.sdk.openadsdk.icD.vG.pvs(kj.this.pvs, true, kj.this.Mxy, FirebaseAnalytics.Param.SUCCESS, SystemClock.elapsedRealtime() - kj.this.kj, str, "endcard", 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.Jd.icD
            public void pvs(int i, String str) {
                kj.this.NB.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.Jd.icD
            public void pvs(com.bytedance.adsdk.ugeno.component.icD<View> icd2) {
                kj.this.IP = icd2;
                kj.this.NB.set(true);
            }
        });
        icd.pvs(new com.bytedance.sdk.openadsdk.core.ugen.Jd.pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.kj.4
            @Override // com.bytedance.sdk.openadsdk.core.ugen.Jd.pvs
            public String pvs() {
                return "overlay";
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.Jd.pvs
            public void icD() {
                kj.this.mnm = true;
                kj.this.icD.gSd.Wyp().performClick();
            }
        });
        icd.pvs();
        icd.pvs(this.icD.gSd.Wyp());
    }

    public boolean Jd() {
        return this.mnm;
    }

    public void pvs(int i) {
        Pj.pvs((View) this.vG, i);
    }

    public void NB() {
        this.sUS = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.icD.vG.pvs(this.pvs, this.Mxy);
    }

    public void sUS() {
        this.so = SystemClock.elapsedRealtime();
    }

    public void yiw() {
        Wyp();
        Mxy();
        com.bytedance.adsdk.ugeno.component.icD icd = this.Ju;
        if (icd != null) {
            this.vG.addView(icd.Mxy(), new FrameLayout.LayoutParams(this.Ju.bNS(), this.Ju.mnm()));
        }
    }

    public void so() {
        com.bytedance.adsdk.ugeno.component.icD icd = this.IP;
        if (icd != null) {
            this.vG.addView(icd.Mxy(), new FrameLayout.LayoutParams(this.IP.bNS(), this.IP.mnm()));
        }
    }

    public void Mxy() {
        if (this.so <= 0 || this.yiw <= 0 || this.Wyp.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.openadsdk.icD.vG.icD(this.yiw - this.so, this.pvs, this.Mxy, this.bNS);
    }

    public void Wyp() {
        com.bytedance.sdk.openadsdk.icD.vG.vG(this.pvs, this.Mxy);
    }

    public void qh() {
        com.bytedance.sdk.openadsdk.icD.vG.pvs(SystemClock.elapsedRealtime() - this.so, this.pvs, this.Mxy);
    }

    public boolean kj() {
        return this.Jd.get();
    }

    public boolean Ju() {
        return this.NB.get();
    }
}
