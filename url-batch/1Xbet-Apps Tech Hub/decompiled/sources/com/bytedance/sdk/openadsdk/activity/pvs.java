package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.dyT;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.activity.icD;
import com.bytedance.sdk.openadsdk.component.reward.pvs.NB;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.video.vG.pvs;
import com.bytedance.sdk.openadsdk.icD.icD;
import com.bytedance.sdk.openadsdk.utils.zM;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: AdScene.java */
/* loaded from: classes2.dex */
public abstract class pvs extends sUS implements dyT.pvs, NB.pvs, com.bytedance.sdk.openadsdk.core.video.vG.icD {
    private boolean IP;
    protected int Jd;
    private int Ju;
    private final AtomicBoolean NB;
    private boolean bNS;
    protected com.bytedance.sdk.openadsdk.component.reward.icD.icD icD;
    protected final dyT pvs;
    private int sUS;
    protected com.bytedance.sdk.openadsdk.component.reward.pvs.pvs vG;
    private Bundle yiw;

    @Override // com.bytedance.sdk.openadsdk.activity.sUS, com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void IP() {
    }

    protected abstract void icD();

    public void kj() {
    }

    public void pvs(int i) {
    }

    public abstract void pvs(Bundle bundle);

    protected abstract void vG();

    protected abstract void yiw();

    public pvs(icD icd, cR cRVar, int i) {
        super(icd, cRVar, i);
        this.pvs = new dyT(Looper.getMainLooper(), this);
        this.NB = new AtomicBoolean(false);
        this.sUS = 1;
        this.Ju = 0;
        this.IP = false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    public final void pvs(Activity activity, Bundle bundle) {
        this.yiw = bundle;
        super.pvs(activity, bundle);
        pvs(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    public final View pvs() {
        return this.vG.qD;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    public void pvs(Activity activity, icD.Jd jd) {
        super.pvs(activity, jd);
        this.sUS = this.so.rcB();
        pvs(this.so, this.yiw);
        if (this.vG.Ayu && this.Mxy > 0) {
            this.vG.ea = jd.vG;
        }
        try {
            OT();
            ae();
        } catch (Throwable th) {
            Ju.pvs("TTAD.AdScene", "onCreate: ", th);
            com.bytedance.sdk.openadsdk.Wyp.vG.icD();
            dyT();
        }
    }

    private void pvs(cR cRVar, Bundle bundle) {
        Activity ZhG = ZhG();
        com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar = new com.bytedance.sdk.openadsdk.component.reward.pvs.pvs(ZhG, this.pvs, cRVar, this, 1);
        this.vG = pvsVar;
        pvsVar.Ayu = ny().pvs();
        this.vG.tQ = ny().yiw();
        this.vG.elv = this;
        this.vG.jlb = ny().vA();
        Intent intent = ZhG.getIntent();
        com.bytedance.sdk.openadsdk.component.reward.pvs.icD.pvs(this.vG, intent, bundle);
        if (intent != null) {
            com.bytedance.sdk.openadsdk.component.reward.pvs.icD.pvs(intent, this.vG);
            cRVar.pvs(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.vG.rW) {
            icD();
        }
        com.bytedance.sdk.openadsdk.component.reward.icD.icD pvs = com.bytedance.sdk.openadsdk.component.reward.icD.sUS.pvs(this.vG);
        this.icD = pvs;
        this.vG.Zm = pvs;
        this.vG.sP.pvs(this);
        if (this.vG.Ayu) {
            this.vG.ny.pvs(new pvs.InterfaceC0085pvs() { // from class: com.bytedance.sdk.openadsdk.activity.pvs.1
                @Override // com.bytedance.sdk.openadsdk.core.video.vG.pvs.InterfaceC0085pvs
                public void pvs(int i) {
                    icD ny = pvs.this.ny();
                    if (ny == null) {
                        return;
                    }
                    ny.pvs(i);
                }
            });
            ny().yiw().setShowSound(cR.NB(cRVar));
        }
        new StringBuilder("init: mAdType = ").append(this.icD);
    }

    private void OT() {
        this.vG.qD.pvs(this.icD);
        this.icD.pvs(this, this.pvs);
        this.icD.kj();
    }

    private void ae() {
        this.icD.pvs(this.kj);
        this.Jd = (int) this.vG.ny.Gp();
        if (this.vG.Ayu) {
            pvs(this.vG.Gp.NB());
            pvs(this.vG.Gp.Jd());
        }
        vG();
        dx();
        if (this.vG.icD.ig() == null || this.vG.icD.ig().pvs() == null) {
            return;
        }
        this.vG.icD.ig().pvs().pvs(0L);
    }

    private void pvs(com.bytedance.sdk.openadsdk.core.icD.icD icd) {
        if (icd != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("ad_show_order", Integer.valueOf(this.Mxy + 1));
            icd.pvs(hashMap);
        }
    }

    private boolean gA() {
        if (this.vG.Wyp.get() && this.vG.yiw) {
            return false;
        }
        if (this.so.pvs()) {
            return this.vG.Wyp.get();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    public void pvs(Activity activity) {
        super.pvs(activity);
        com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar = this.vG;
        if (pvsVar == null) {
            return;
        }
        pvsVar.CvL.pvs();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    public final void icD(Activity activity) {
        com.bytedance.sdk.openadsdk.component.reward.icD.icD icd;
        super.icD(activity);
        if (this.vG == null || (icd = this.icD) == null) {
            return;
        }
        icd.cR();
        this.vG.ZsW = true;
        this.vG.CvL.icD(this.pvs);
        if (gA()) {
            this.vG.cRf.pvs(this.vG.icD.yhq());
        }
        this.vG.gSd.bNS();
        this.vG.dx.zM();
        this.vG.dyT.Ju();
        if (this.icD.icD()) {
            this.vG.ny.pvs(this.icD);
            this.vG.ny.pvs(false, this, this.Ju != 0);
        }
        this.Ju++;
        jlb();
        if (this.vG.dX != null) {
            this.vG.dX.yiw();
        }
        this.vG.CvL.pvs(this.pvs);
        this.icD.uc();
    }

    private void jlb() {
        if (this.so.pvs() && !this.IP) {
            this.IP = true;
            pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.pvs.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.component.reward.pvs.sUS sus = pvs.this.vG.ae;
                    float[] pvs = pvs.this.vG.CvL.pvs(pvs.this.sUS);
                    pvs pvsVar = pvs.this;
                    sus.pvs(pvs, pvsVar, pvsVar.icD);
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    public void vG(Activity activity) {
        super.vG(activity);
        com.bytedance.sdk.openadsdk.component.reward.icD.icD icd = this.icD;
        if (icd == null) {
            return;
        }
        icd.OT();
    }

    private void dx() {
        if (this.so.pvs()) {
            return;
        }
        if (rCZ.qh(this.vG.icD)) {
            pvs(false, icD.C0090icD.vG);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.icD.icD icd = this.icD;
        if (icd != null) {
            icd.pvs(this.vG.gSd.sUS());
            this.icD.CvL();
        }
    }

    public final void pvs(boolean z, int i) {
        pvs(z, false, i);
    }

    public final void pvs(boolean z, boolean z2, int i) {
        this.vG.sP.pvs(z, z2, false, this.vG.Zm, i);
    }

    @Override // com.bytedance.sdk.component.utils.dyT.pvs
    public final void pvs(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.icD.icD icd = this.icD;
        if (icd == null) {
            return;
        }
        icd.pvs(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public final void Jd() {
        Gp();
        this.vG.icD.udE();
        this.vG.icD.pvs(true);
        if (cR.NB(this.vG.icD)) {
            com.bytedance.sdk.openadsdk.icD.vG.icD(this.vG.icD, this.vG.NB, this.vG.icD.QnQ());
        }
    }

    protected final void NB() {
        Message message = new Message();
        message.what = 400;
        if (this.so.FJ()) {
            pvs(10000);
        }
        this.pvs.sendMessageDelayed(message, 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public final void sUS() {
        if (this.NB.compareAndSet(false, true)) {
            zM.pvs("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
            yiw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public final void so() {
        com.bytedance.sdk.openadsdk.component.reward.icD.icD icd = this.icD;
        if (icd == null) {
            return;
        }
        icd.IP();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    public final void Jd(Activity activity) {
        super.Jd(activity);
        com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar = this.vG;
        if (pvsVar == null) {
            return;
        }
        pvsVar.dx.ae();
        com.bytedance.sdk.openadsdk.utils.vG.pvs(activity, this.vG.icD);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    public final void NB(Activity activity) {
        super.NB(activity);
        com.bytedance.sdk.openadsdk.component.reward.icD.icD icd = this.icD;
        if (icd == null) {
            return;
        }
        icd.rCZ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public final void Mxy() {
        this.vG.ny.ae();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public final View Wyp() {
        return this.vG.ny.gA();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public final void qh() {
        if (!this.vG.IP.getAndSet(true) || rCZ.qh(this.vG.icD)) {
            this.vG.Gp.pvs();
        }
    }

    protected final void Ju() {
        this.pvs.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    public void bNS() {
        super.bNS();
        com.bytedance.sdk.openadsdk.component.reward.icD.icD icd = this.icD;
        if (icd == null) {
            return;
        }
        icd.ny();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pvs.NB.pvs
    public void pvs(boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.component.reward.icD.icD icd, int i) {
        pvs(z, z2, z3, i);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pvs.NB.pvs
    public void mnm() {
        vG NB;
        icD ny = ny();
        if (ny == null || (NB = ny.NB()) == null) {
            return;
        }
        NB.NB();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    public void vA() {
        super.vA();
        com.bytedance.sdk.openadsdk.component.reward.icD.icD icd = this.icD;
        if (icd != null) {
            icd.ZhG();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    public void pvs(sUS sus, sUS sus2, icD.Jd jd) {
        super.pvs(sus, sus2, jd);
        if (sus == this && (sus2 instanceof vG)) {
            if (jd.icD == 3) {
                this.vG.ny.pvs(!this.vG.ny.CvL() ? 1 : 0, 2);
            } else if (jd.icD == 6) {
                this.vG.ny.pvs(!this.vG.ny.CvL() ? 1 : 0, !this.vG.ny.CvL() ? 1 : 0);
            } else if (jd.icD == 5 && !cR.NB(this.vG.icD) && jd.Jd) {
                this.vG.ny.pvs("skip", true);
            }
            this.vG.cRf.pvs(false);
            this.vG.cRf.Jd(false);
        }
        if (sus2.Mxy != 0 || this.Mxy == 0) {
            return;
        }
        this.so.Mxy("0");
        Map<String, Object> Wby = this.so.Wby();
        if (Wby != null) {
            Wby.put(FirebaseAnalytics.Param.PRICE, "0");
        }
    }

    public void pvs(float f) {
        icD ny = ny();
        if (ny == null) {
            return;
        }
        ny.pvs(f);
        if (this.bNS || f < this.so.Eyq() / 100.0f) {
            return;
        }
        this.bNS = true;
        sUS so = ny.so();
        if (so instanceof pvs) {
            ((pvs) so).cR();
        }
    }

    public void cR() {
        com.bytedance.sdk.openadsdk.core.video.pvs.icD pvs = cR.pvs(CacheDirFactory.getICacheDir(this.so.LHy()).pvs(), this.so);
        pvs.pvs("material_meta", this.so);
        pvs.pvs("ad_slot", this.so.jlb());
        com.bytedance.sdk.openadsdk.core.video.Jd.pvs.pvs(pvs, new com.bykv.vk.openvk.component.video.api.NB.icD() { // from class: com.bytedance.sdk.openadsdk.activity.pvs.3
            @Override // com.bykv.vk.openvk.component.video.api.NB.pvs.InterfaceC0017pvs
            public void pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar, int i) {
            }

            @Override // com.bykv.vk.openvk.component.video.api.NB.pvs.InterfaceC0017pvs
            public void pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar, int i, String str) {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    public boolean zM() {
        com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar = this.vG;
        return pvsVar != null && pvsVar.ny.ZhG();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    protected String uc() {
        return this.vG.sq;
    }

    protected icD.Jd icD(int i) {
        icD.Jd jd = new icD.Jd(i);
        jd.vG = this.vG.ea;
        return jd;
    }

    public void rCZ() {
        ny().pvs(this, icD(icD.C0090icD.icD));
    }
}
