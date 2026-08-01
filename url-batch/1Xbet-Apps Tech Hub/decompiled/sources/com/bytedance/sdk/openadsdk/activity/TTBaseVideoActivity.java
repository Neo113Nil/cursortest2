package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.component.utils.dyT;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.component.reward.kj;
import com.bytedance.sdk.openadsdk.core.Ju;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.icD.icD;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.ny;
import com.bytedance.sdk.openadsdk.utils.zM;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class TTBaseVideoActivity extends TTBaseActivity implements dyT.pvs, com.bytedance.sdk.openadsdk.core.video.vG.icD {
    final dyT Jd;
    private final AtomicBoolean Ju;
    int Mxy;
    protected IListenerManager NB;
    protected com.bytedance.sdk.openadsdk.Mxy.NB Wyp;
    com.bytedance.sdk.openadsdk.component.reward.pvs.pvs icD;
    private int kj;
    public final String pvs;
    private boolean qh;
    int sUS;
    boolean so;
    protected com.bytedance.sdk.openadsdk.component.reward.icD.icD vG;

    protected abstract void NB();

    public boolean cR() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void kj() {
    }

    protected abstract void mnm();

    protected abstract void pvs();

    protected void pvs(Intent intent) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void pvs(Bundle bundle) {
    }

    public abstract boolean vA();

    public TTBaseVideoActivity() {
        this.pvs = vA() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.Jd = new dyT(Looper.getMainLooper(), this);
        this.qh = false;
        this.kj = 0;
        this.Mxy = 1;
        this.Ju = new AtomicBoolean(false);
        this.Wyp = new com.bytedance.sdk.openadsdk.Mxy.NB() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.2
            @Override // com.bytedance.sdk.openadsdk.Mxy.NB
            public void pvs() {
                TTBaseVideoActivity.this.IP();
            }
        };
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar;
        super.onCreate(bundle);
        zM.pvs("BVA", "onCreate ".concat(String.valueOf(this)));
        mnm.pvs(getApplicationContext());
        if (!Ju.NB()) {
            finish();
            return;
        }
        cR pvs = com.bytedance.sdk.openadsdk.component.reward.pvs.icD.pvs(getIntent(), bundle, this);
        if (pvs == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.utils.icD.pvs(pvs);
        this.Mxy = pvs.rcB();
        pvs(pvs, bundle);
        if (bundle != null) {
            if (pvs.reT()) {
                this.Ju.set(true);
            }
            if (pvs.Mvw() && (pvsVar = this.icD) != null) {
                pvsVar.Ju.set(true);
            }
            com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar2 = this.icD;
            if (pvsVar2 != null) {
                pvsVar2.Gp.yiw();
            }
        }
        try {
            zM();
            uc();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.BVA", "onCreate: ", th);
            com.bytedance.sdk.openadsdk.Wyp.vG.icD();
            finish();
        }
    }

    private void pvs(cR cRVar, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar = new com.bytedance.sdk.openadsdk.component.reward.pvs.pvs(this, this.Jd, cRVar, this, 0);
        this.icD = pvsVar;
        com.bytedance.sdk.openadsdk.component.reward.pvs.icD.pvs(pvsVar, getIntent(), bundle);
        Intent intent = getIntent();
        if (intent != null) {
            pvs(intent);
            cRVar.pvs(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.icD.rW) {
            pvs();
        }
        com.bytedance.sdk.openadsdk.component.reward.icD.icD pvs = com.bytedance.sdk.openadsdk.component.reward.icD.sUS.pvs(this.icD);
        this.vG = pvs;
        this.icD.Zm = pvs;
        new StringBuilder("init: mAdType = ").append(this.vG);
    }

    private void zM() {
        setContentView(this.icD.qD);
        this.icD.qD.pvs(this.vG);
        this.vG.pvs(this, this.Jd);
        this.vG.kj();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar = this.icD;
        if (pvsVar == null || pvsVar.icD == null) {
            return;
        }
        cR cRVar = this.icD.icD;
        if (this.yiw && !cRVar.sR() && !TextUtils.isEmpty(cR.pvs(this, cRVar))) {
            finish();
        }
        if (cRVar.sR()) {
            cRVar.NB(false);
        }
    }

    private void uc() {
        this.vG.pvs(this.Wyp);
        this.sUS = (int) this.icD.ny.Gp();
        mnm();
        vG();
        if (this.icD.icD.ig() == null || this.icD.icD.ig().pvs() == null) {
            return;
        }
        this.icD.icD.ig().pvs().pvs(0L);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar = this.icD;
        if (pvsVar != null && pvsVar.Gp != null) {
            this.icD.Gp.icD(z);
            this.icD.Gp.vG(z);
        }
        com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar2 = this.icD;
        if (pvsVar2 == null || !(pvsVar2.Zm instanceof com.bytedance.sdk.openadsdk.component.reward.icD.NB)) {
            return;
        }
        ((com.bytedance.sdk.openadsdk.component.reward.icD.NB) this.icD.Zm).icD(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void qh() {
        if (!this.icD.IP.getAndSet(true) || rCZ.qh(this.icD.icD)) {
            this.icD.Gp.pvs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void so() {
        com.bytedance.sdk.openadsdk.component.reward.icD.icD icd = this.vG;
        if (icd == null) {
            return;
        }
        icd.IP();
    }

    public void pvs(boolean z, int i) {
        pvs(z, false, i);
    }

    public void pvs(boolean z, boolean z2, int i) {
        com.bytedance.sdk.openadsdk.component.reward.icD.icD icd = this.vG;
        if (icd == null) {
            return;
        }
        icd.pvs(z, z2, false, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void Mxy() {
        this.icD.ny.ae();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public View Wyp() {
        return this.icD.ny.gA();
    }

    protected void vG() {
        if (rCZ.qh(this.icD.icD)) {
            pvs(false, icD.C0090icD.vG);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.icD.icD icd = this.vG;
        if (icd != null) {
            icd.pvs(this.icD.gSd.sUS());
            this.vG.CvL();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        zM.pvs("BVA", "onStart ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar = this.icD;
        if (pvsVar == null) {
            return;
        }
        pvsVar.dx.ae();
        com.bytedance.sdk.openadsdk.utils.vG.pvs(this, this.icD.icD);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.icD.icD icd;
        super.onResume();
        zM.pvs("BVA", "onResume ".concat(String.valueOf(this)));
        if (this.icD == null || (icd = this.vG) == null) {
            return;
        }
        icd.cR();
        this.icD.ZsW = true;
        this.icD.CvL.icD(this.Jd);
        if (rCZ()) {
            this.icD.cRf.pvs(this.icD.icD.yhq());
        }
        this.icD.gSd.bNS();
        this.icD.dx.zM();
        this.icD.dyT.Ju();
        if (this.vG.icD()) {
            this.icD.ny.pvs(this.vG);
            this.icD.ny.pvs(false, this, this.kj != 0);
        }
        this.kj++;
        yiw();
        if (this.icD.dX != null) {
            this.icD.dX.yiw();
        }
        this.icD.CvL.pvs(this.Jd);
        this.vG.uc();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        zM.pvs("BVA", "onPause ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.icD.icD icd = this.vG;
        if (icd == null) {
            return;
        }
        icd.rCZ();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        zM.pvs("BVA", "onStop ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.icD.icD icd = this.vG;
        if (icd == null) {
            return;
        }
        icd.OT();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        zM.pvs("BVA", "onDestroy ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar = this.icD;
        if (pvsVar == null || this.vG == null) {
            return;
        }
        if (pvsVar.neB > 0 && this.icD.Ju.get()) {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(String.valueOf(SystemClock.elapsedRealtime() - this.icD.neB), this.icD.icD, this.pvs, this.icD.ny.pvs());
            this.icD.neB = 0L;
        }
        this.icD.gA.icD();
        this.Jd.removeCallbacksAndMessages(null);
        this.vG.ny();
        com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(this.icD.icD);
        final AdSlot jlb = this.icD.icD.jlb();
        if (this.icD.ny.ZhG() || jlb == null || !TextUtils.isEmpty(jlb.getBidAdm())) {
            return;
        }
        Ju.icD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.1
            @Override // java.lang.Runnable
            public void run() {
                if (TTBaseVideoActivity.this.vA()) {
                    kj.pvs(mnm.pvs()).pvs(jlb);
                } else {
                    com.bytedance.sdk.openadsdk.component.reward.NB.pvs(mnm.pvs()).pvs(jlb);
                }
            }
        });
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar = this.icD;
        if (pvsVar == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        if (pvsVar.Ju.get()) {
            this.icD.icD.so(true);
        }
        if (this.Ju.get()) {
            this.icD.icD.fhd();
        }
        com.bytedance.sdk.openadsdk.component.reward.pvs.icD.pvs(this.icD, bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.bytedance.sdk.openadsdk.component.reward.icD.icD icd;
        if (this.icD == null || (icd = this.vG) == null) {
            super.onBackPressed();
        } else {
            icd.ZhG();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar = this.icD;
        if (pvsVar == null) {
            return;
        }
        pvsVar.CvL.pvs();
    }

    @Override // com.bytedance.sdk.component.utils.dyT.pvs
    public void pvs(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.icD.icD icd = this.vG;
        if (icd == null) {
            return;
        }
        icd.pvs(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public final void sUS() {
        if (this.Ju.compareAndSet(false, true)) {
            zM.pvs("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
            NB();
        }
    }

    protected IListenerManager icD(int i) {
        if (this.NB == null) {
            this.NB = com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs().pvs(i));
        }
        return this.NB;
    }

    protected void yiw() {
        if (cR() && !this.qh) {
            this.qh = true;
            getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.component.reward.pvs.sUS sus = TTBaseVideoActivity.this.icD.ae;
                    float[] pvs = TTBaseVideoActivity.this.icD.CvL.pvs(TTBaseVideoActivity.this.Mxy);
                    TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                    sus.pvs(pvs, tTBaseVideoActivity, tTBaseVideoActivity.vG);
                }
            });
        }
    }

    protected void Ju() {
        Message message = new Message();
        message.what = 400;
        if (vA()) {
            pvs(10000);
        }
        this.Jd.sendMessageDelayed(message, 2000L);
    }

    protected void bNS() {
        this.Jd.removeMessages(400);
    }

    private boolean rCZ() {
        if (this.icD.Wyp.get() && this.icD.yiw) {
            return false;
        }
        if ((this instanceof TTFullScreenExpressVideoActivity) || (this instanceof TTRewardExpressVideoActivity)) {
            return this.icD.Wyp.get();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.icD == null) {
            return;
        }
        if (ny.NB()) {
            Pj.icD((Activity) this);
        }
        if (!rCZ.icD(this.icD.icD) || this.icD.Wyp.get()) {
            return;
        }
        ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
    }
}
