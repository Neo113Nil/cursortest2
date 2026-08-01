package com.bytedance.sdk.openadsdk.component.reward.pvs;

import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.CvL;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.icD.icD;
import com.bytedance.sdk.openadsdk.utils.Pj;
import org.json.JSONObject;

/* compiled from: RewardFullEndCardManager.java */
/* loaded from: classes2.dex */
public class NB {
    private final com.bytedance.sdk.openadsdk.component.reward.view.icD icD;
    private final com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvs;
    private pvs vG;

    /* compiled from: RewardFullEndCardManager.java */
    public interface pvs {
        void mnm();

        void pvs(boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.component.reward.icD.icD icd, int i);
    }

    public NB(com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar) {
        this.pvs = pvsVar;
        this.icD = new com.bytedance.sdk.openadsdk.component.reward.view.icD(pvsVar);
    }

    public void pvs() {
        this.icD.pvs();
    }

    public void icD() {
        this.icD.vG();
    }

    public void pvs(com.bytedance.sdk.openadsdk.core.icD.NB nb) {
        this.icD.pvs(nb);
    }

    public void pvs(boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.component.reward.icD.icD icd, int i) {
        new StringBuilder("showEndCard() called with: isSkip = [").append(z).append("], force = [").append(z2).append("], isFromLandingPage = [").append(z3).append("], mAdType = [").append(icd);
        if (this.pvs.od.isFinishing() || icd == null) {
            return;
        }
        this.pvs.gSd.kj();
        if (z2) {
            this.pvs.bNS.set(true);
        }
        if (this.pvs.HWd && !this.pvs.mnm.get() && !com.bytedance.sdk.openadsdk.core.model.mnm.so(this.pvs.icD) && (!com.bytedance.sdk.openadsdk.core.model.mnm.icD(this.pvs.icD) || !this.pvs.bNS.get() || !this.pvs.vA.get())) {
            if (com.bytedance.sdk.openadsdk.core.model.mnm.icD(this.pvs.icD) && z3) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.core.model.mnm.icD(this.pvs.icD) || com.bytedance.sdk.openadsdk.core.model.mnm.vG(this.pvs.icD) || com.bytedance.sdk.openadsdk.core.model.mnm.Jd(this.pvs.icD)) {
                this.pvs.cRf.vG(false);
                icd.mnm();
                return;
            }
        }
        if (this.pvs.od.isDestroyed() || this.pvs.od.isFinishing()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.nativeexpress.icD icd2 = null;
        if (this.pvs.icD.OBt()) {
            com.bytedance.sdk.openadsdk.component.reward.view.vG vGVar = this.pvs.dX;
            if (vGVar != null && vGVar.pvs() != null) {
                icd2 = vGVar.pvs().getBrandBannerController();
            }
            if (icd2 != null) {
                icd2.icD();
            }
            this.pvs.od.finish();
            return;
        }
        pvs pvsVar = this.vG;
        if (pvsVar != null) {
            pvsVar.pvs(z, z2, z3, icd, i);
            return;
        }
        this.pvs.ny.Ju();
        this.pvs.dx.dyT();
        this.pvs.qh.set(false);
        this.pvs.kj.set(false);
        this.pvs.gA.pvs();
        this.pvs.cRf.pvs(!this.pvs.yiw && this.pvs.icD.yhq());
        if (this.pvs.Wyp.getAndSet(true)) {
            return;
        }
        if (rCZ.icD(this.pvs.icD)) {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(this.pvs.icD, this.pvs.NB, z, z2, z3, this.pvs.od.isFinishing(), i);
        }
        if (this.pvs.icD.pvs() && rCZ.icD(this.pvs.icD) && z) {
            this.pvs.cRf.Jd(true);
        }
        if (rCZ.icD(this.pvs.icD)) {
            this.pvs.cRf.vG(true);
        }
        so();
        if (rCZ.qh(this.pvs.icD)) {
            return;
        }
        this.pvs.cR.set(z);
        icd.bNS();
        if (this.pvs.icD.SJ()) {
            this.pvs.cRf.Jd(false);
        } else {
            this.pvs.cRf.Jd(rCZ.qh(this.pvs.icD));
        }
        this.pvs.cRf.vG(rCZ.icD(this.pvs.icD));
        if (this.pvs.icD.pvs() && rCZ.icD(this.pvs.icD) && z) {
            this.pvs.cRf.Jd(true);
        }
        this.pvs.dx.dX();
        if (this.pvs.gSd.bNS != null) {
            this.pvs.gSd.bNS.Jd();
        }
        this.pvs.gSd.vG();
        if (this.pvs.dX != null) {
            this.pvs.dX.sUS();
        }
        if (!TextUtils.isEmpty(cR.pvs(this.pvs.jhZ, this.pvs.icD))) {
            com.bytedance.sdk.openadsdk.utils.cR.pvs(this.pvs.od, rCZ.sUS(this.pvs.icD), this.pvs.icD, icD.pvs.vG);
            return;
        }
        if (cR.vG(this.pvs.icD) && this.pvs.Pj != null) {
            this.pvs.Pj.sUS();
        }
        if (cR.pvs(this.pvs.icD) || ((!cR.vG(this.pvs.icD) && this.pvs.dx.sP()) || (!cR.pvs(this.pvs.icD, this.pvs.dx.mnm(), this.pvs.dyT.Jd(), this.pvs.Pj.kj(), this.pvs.dx.CvL()) && !rCZ.icD(this.pvs.icD)))) {
            Jd();
            return;
        }
        if (!cR.Jd(this.pvs.icD) && !rCZ.icD(this.pvs.icD) && !cR.vG(this.pvs.icD)) {
            this.pvs.dx.pvs(true, 0, (String) null);
        }
        this.pvs.dx.pvs(0.0f);
        this.pvs.gSd.pvs(0.0f);
        if (!cR.vG(this.pvs.icD)) {
            this.pvs.Pj.pvs(8);
            this.pvs.dx.icD(0);
            this.pvs.dx.gSd();
        } else {
            this.pvs.dx.icD(8);
            this.pvs.Pj.pvs(0);
            this.pvs.Pj.yiw();
        }
        if (this.pvs.yiw) {
            Pj.pvs((View) icd.IP, 0);
            this.pvs.gSd.sUS(8);
        }
        if (rCZ.icD(this.pvs.icD)) {
            if (rCZ.mnm(this.pvs.icD) && !this.pvs.dx.Pj()) {
                if (!this.pvs.dx.mnm()) {
                    this.pvs.dyT.so();
                } else {
                    this.pvs.dyT.Mxy();
                    this.pvs.cRf.Jd(false);
                    this.pvs.dyT.pvs(this.pvs.Gp.NB());
                }
            } else {
                pvs(icd);
            }
        } else {
            icD(icd);
        }
        this.pvs.gSd.Jd(8);
        this.pvs.gSd.yiw();
        if (cR.vG(this.pvs.icD)) {
            this.pvs.SE.sendEmptyMessageDelayed(800, 100L);
            return;
        }
        this.pvs.SE.sendEmptyMessageDelayed(500, 100L);
        this.pvs.dx.pvs(this.pvs.ea, true);
        this.pvs.dx.vG(true);
        this.pvs.dx.icD(true);
        CvL Wyp = this.pvs.dx.Wyp();
        if (Wyp != null) {
            Wyp.pvs("prerender_page_show", (JSONObject) null);
        }
    }

    public void pvs(com.bytedance.sdk.openadsdk.component.reward.icD.icD icd) {
        int FN = this.pvs.icD.FN();
        boolean z = true;
        if (rCZ.qh(this.pvs.icD)) {
            FN = (this.pvs.icD.AEt() + 1) * 1000;
        }
        if (FN != -1) {
            if (FN >= 0) {
                this.pvs.cRf.Jd(false);
                if (rCZ.vG(this.pvs.icD)) {
                    if (rCZ.mnm(this.pvs.icD) && this.pvs.dyT.vA()) {
                        this.pvs.SE.sendEmptyMessageDelayed(600, FN);
                    } else {
                        this.pvs.SE.sendEmptyMessageDelayed(1, FN);
                    }
                } else {
                    this.pvs.SE.sendEmptyMessageDelayed(600, FN);
                }
            }
            z = false;
        } else if (rCZ.vG(this.pvs.icD)) {
            if (rCZ.mnm(this.pvs.icD) && this.pvs.dyT.vA()) {
                icd.mnm();
            } else {
                icd.dyT();
            }
            z = false;
        } else {
            icd.mnm();
        }
        if (!z || this.pvs.Ye == null) {
            return;
        }
        this.pvs.Ye.pvs(FN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.model.rCZ.vG(r4.pvs.icD) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean icD(com.bytedance.sdk.openadsdk.component.reward.icD.icD icd) {
        boolean z;
        this.pvs.so = yiw();
        int i = this.pvs.so;
        if (this.pvs.icD.NB()) {
            return false;
        }
        if (this.pvs.so == -1) {
            if (rCZ.vG(this.pvs.icD) && this.pvs.dx.mnm()) {
                icd.dyT();
                z = false;
            } else {
                icd.mnm();
                z = true;
            }
        } else {
            if (this.pvs.so >= 0) {
                this.pvs.rCZ.set(false);
                Message obtain = Message.obtain();
                obtain.what = TypedValues.TransitionType.TYPE_DURATION;
                obtain.arg1 = this.pvs.so;
                this.pvs.SE.sendMessage(obtain);
            }
            z = false;
        }
        if ((this.pvs.dx.ny() ? false : z) && this.pvs.Ye != null) {
            this.pvs.Ye.pvs(this.pvs.so);
        }
        return true;
    }

    private int yiw() {
        int mRq = this.pvs.icD.mRq();
        if (mRq <= 5000 && mRq >= 0) {
            if (mRq < 1000) {
                mRq += 1000;
            }
            int pvs2 = com.bytedance.sdk.openadsdk.core.mnm.Jd().pvs(this.pvs.icD.yTz());
            if (pvs2 <= 5000 && pvs2 >= 0) {
                if (pvs2 < 1000) {
                    pvs2 += 1000;
                }
                return Math.min(mRq, pvs2);
            }
        }
        return -1;
    }

    private void so() {
        if (rCZ.kj(this.pvs.icD) && this.pvs.ea) {
            this.pvs.cRf.icD(true);
            this.pvs.jlb.pvs(true);
        }
    }

    public void vG() {
        this.icD.Jd();
    }

    public void Jd() {
        pvs(true);
    }

    public void pvs(boolean z) {
        if (!cR.Jd(this.pvs.icD)) {
            this.pvs.dx.pvs(false, TTAdConstant.DOWNLOAD_URL_CODE, "end_card_timeout");
        }
        this.pvs.dx.Gp();
        this.pvs.dx.icD(8);
        this.pvs.Pj.pvs(8);
        if (this.pvs.yiw) {
            Pj.pvs((View) this.pvs.Zm.IP, 8);
            this.pvs.gSd.sUS(0);
        }
        this.pvs.gSd.Jd(8);
        if (this.pvs.icD.SJ()) {
            if (!this.icD.pvs(this.pvs.ny)) {
                this.pvs.od.finish();
            }
        } else {
            com.bytedance.sdk.openadsdk.activity.sUS sus = this.pvs.elv;
            if (sus != null) {
                this.icD.pvs(sus.ny().sUS());
            }
            this.icD.icD();
        }
        this.pvs.gSd.yiw();
        if (z) {
            icD(this.pvs.Zm);
        }
        this.pvs.cRf.vG(false);
        this.pvs.Gp.pvs(this.pvs.icD.FJ());
    }

    public boolean NB() {
        com.bytedance.sdk.openadsdk.component.reward.view.icD icd = this.icD;
        if (icd != null) {
            return icd.NB();
        }
        return false;
    }

    public void pvs(pvs pvsVar) {
        this.vG = pvsVar;
    }

    public pvs sUS() {
        return this.vG;
    }
}
