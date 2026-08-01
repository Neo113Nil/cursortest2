package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.dyT;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.activity.icD;
import com.bytedance.sdk.openadsdk.core.cR;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.mnm;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.vA;
import com.bytedance.sdk.openadsdk.core.widget.pvs;
import com.bytedance.sdk.openadsdk.utils.jlb;
import org.json.JSONObject;

/* compiled from: EndCardScene.java */
/* loaded from: classes2.dex */
public class vG extends sUS implements dyT.pvs, com.bytedance.sdk.openadsdk.core.video.vG.icD {
    private static String Jd;
    private static String Ju;
    private static String NB;
    private static String sUS;
    private static String yiw;
    private Bundle IP;
    private int bNS;
    private String cR;
    protected com.bytedance.sdk.openadsdk.component.reward.icD.icD icD;
    private icD.Jd mnm;
    protected final dyT pvs;
    private boolean vA;
    protected com.bytedance.sdk.openadsdk.component.reward.pvs.pvs vG;
    private String zM;

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public final void Mxy() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public final View Wyp() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void pvs(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void pvs(Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public boolean pvs(long j, boolean z) {
        return false;
    }

    public vG(icD icd, cR cRVar, int i) {
        super(icd, cRVar, i);
        this.pvs = new dyT(Looper.getMainLooper(), this);
        this.bNS = 0;
        pvs(cRVar, this.IP);
        try {
            mnm();
        } catch (Throwable th) {
            Ju.pvs("TTAD.EndCardScene", "onCreate: ", th);
            dyT();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    public final void pvs(Activity activity, Bundle bundle) {
        this.IP = bundle;
        super.pvs(activity, bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    public final View pvs() {
        return this.vG.qD;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    public void pvs(Activity activity, icD.Jd jd) {
        super.pvs(activity, jd);
        this.mnm = jd;
        Intent intent = activity.getIntent();
        this.zM = intent.getStringExtra("media_extra");
        this.cR = intent.getStringExtra("user_id");
        try {
            if (yiw == null) {
                yiw = uc.pvs(this.vG.jhZ, "tt_reward_msg");
                Jd = uc.pvs(this.vG.jhZ, "tt_msgPlayable");
                sUS = uc.pvs(this.vG.jhZ, "tt_negtiveBtnBtnText");
                Ju = uc.pvs(this.vG.jhZ, "tt_postiveBtnText");
                NB = uc.pvs(this.vG.jhZ, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            Ju.pvs("TTAD.EndCardScene", th.getMessage());
        }
        cR();
        so();
    }

    private void pvs(cR cRVar, Bundle bundle) {
        Activity ZhG = ZhG();
        com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar = new com.bytedance.sdk.openadsdk.component.reward.pvs.pvs(ZhG, this.pvs, cRVar, this, 2);
        this.vG = pvsVar;
        pvsVar.Ayu = ny().pvs();
        this.vG.elv = this;
        this.vG.jlb = ny().vA();
        com.bytedance.sdk.openadsdk.component.reward.pvs.icD.pvs(this.vG, ZhG.getIntent(), bundle);
        com.bytedance.sdk.openadsdk.component.reward.icD.icD pvs = com.bytedance.sdk.openadsdk.component.reward.icD.sUS.pvs(this.vG);
        this.icD = pvs;
        this.vG.Zm = pvs;
        new StringBuilder("init: mAdType = ").append(this.icD);
    }

    private void mnm() {
        this.vG.qD.pvs(this.icD);
        this.icD.pvs(this, this.pvs);
        this.icD.kj();
    }

    private void cR() {
        if (this.vA) {
            return;
        }
        this.vA = true;
        this.icD.pvs(this.kj);
        rCZ();
    }

    private void rCZ() {
        final View Wyp = this.vG.gSd.Wyp();
        if (Wyp != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.vG.1
                /* JADX WARN: Removed duplicated region for block: B:19:0x00d0 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x00d1  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onClick(View view) {
                    boolean z;
                    if (vG.this.vG.dx.ny()) {
                        boolean Ju2 = vG.this.vG.Pj.Ju();
                        vG.this.vG.dx.NB(Ju2);
                        vG.this.vG.gSd.sUS(8);
                        vG.this.vG.SE.sendEmptyMessageDelayed(600, 5000L);
                        if (!cR.vG(vG.this.vG.icD)) {
                            return;
                        }
                        if (cR.vG(vG.this.vG.icD) && Ju2) {
                            return;
                        }
                    }
                    if (vG.this.vG.icD.Uv()) {
                        if (vG.this.vG.icD.SJ()) {
                            if (vG.this.vG.sP != null) {
                                vG.this.vG.icD.cRf(2);
                                z = vG.this.vG.sP.NB();
                            }
                        } else if (vG.this.vG.icD.xyK() == 0 && !vG.this.vG.dx.bNS()) {
                            vG.this.vG.icD.cRf(11);
                            if (vG.this.vG.dx.Jd()) {
                                vG.this.vG.icD.cRf(12);
                            }
                            try {
                                vG.this.vG.gSd.vA();
                                z = true;
                            } catch (Exception unused) {
                            }
                        }
                        if (z) {
                            vG.this.vG.dx.ZhG();
                            vG.this.vG.Pj.qh();
                            vG.this.vG.Gp.sUS();
                            if (rCZ.qh(vG.this.vG.icD) && !rCZ.vG(vG.this.vG.icD) && vG.this.pvs(true, true)) {
                                return;
                            }
                            vG.this.dyT();
                            return;
                        }
                        return;
                    }
                    z = false;
                    if (z) {
                    }
                }
            };
            Wyp.setOnClickListener(onClickListener);
            Wyp.setTag(Wyp.getId(), onClickListener);
        }
        this.vG.cRf.pvs(new com.bytedance.sdk.openadsdk.component.reward.top.icD() { // from class: com.bytedance.sdk.openadsdk.activity.vG.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.icD
            public void pvs(View view) {
                vG vGVar = vG.this;
                if (vGVar.pvs(rCZ.qh(vGVar.vG.icD), false)) {
                    return;
                }
                if (rCZ.vG(vG.this.vG.icD)) {
                    if (vG.this.vG.dyT.zM()) {
                        vG.this.vG.dyT.icD(5);
                        return;
                    } else {
                        vG.this.vG.dx.yiw();
                        return;
                    }
                }
                if (rCZ.qh(vG.this.vG.icD) || (mnm.pvs(vG.this.vG.icD) && !vG.this.vG.mnm.get())) {
                    if (!rCZ.vG(vG.this.vG.icD) && vG.this.vG.dyT.zM()) {
                        vG.this.vG.dyT.icD(4);
                    }
                    vG.this.dyT();
                    return;
                }
                vG.this.dyT();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.icD
            public void icD(View view) {
                if (vG.this.icD != null && vG.this.icD.Jd() != null) {
                    vG.this.icD.Jd().pvs(vG.this.vG.ea);
                }
                vG.this.vG.ea = !vG.this.vG.ea;
                Object[] objArr = new Object[2];
                String str = "will set is Mute " + vG.this.vG.ea + " mLastVolume=" + vG.this.vG.jlb.pvs();
                vG.this.vG.ny.icD(vG.this.vG.ea);
                if (!rCZ.kj(vG.this.vG.icD) || vG.this.vG.Wyp.get()) {
                    if (rCZ.icD(vG.this.vG.icD)) {
                        vG.this.vG.jlb.pvs(vG.this.vG.ea, true);
                    }
                    vG.this.vG.dx.Jd(vG.this.vG.ea);
                    if (vG.this.vG.icD == null || vG.this.vG.icD.ig() == null || vG.this.vG.icD.ig().pvs() == null || vG.this.vG.ny == null) {
                        return;
                    }
                    if (vG.this.vG.ea) {
                        vG.this.vG.icD.ig().pvs().so(vG.this.vG.ny.yiw());
                    } else {
                        vG.this.vG.icD.ig().pvs().Mxy(vG.this.vG.ny.yiw());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.icD
            public void vG(View view) {
                vG.this.vG.gA.pvs(vG.this.icD);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.icD
            public void Jd(View view) {
                View view2 = Wyp;
                if (view2 != null) {
                    view2.performClick();
                }
            }
        });
    }

    private boolean OT() {
        if (this.vG.Wyp.get() && this.vG.yiw) {
            return false;
        }
        if (this.so.pvs()) {
            return this.vG.Wyp.get();
        }
        return true;
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
        if (OT()) {
            this.vG.cRf.pvs(this.vG.icD.yhq());
        }
        this.vG.gSd.bNS();
        this.vG.dx.zM();
        this.vG.dyT.Ju();
        if (this.icD.icD()) {
            this.vG.ny.pvs(this.icD);
            this.vG.ny.pvs(false, this, this.bNS != 0);
        }
        this.bNS++;
        if (this.vG.dX != null) {
            this.vG.dX.yiw();
        }
        this.vG.CvL.pvs(this.pvs);
        this.icD.uc();
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

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void c_() {
        Gp();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public final void sUS() {
        CvL();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public final void so() {
        if (ny() == null) {
            return;
        }
        this.vG.sP.pvs(this.mnm.pvs.getBoolean("isSkip", false), this.mnm.pvs.getBoolean("force", false), this.mnm.pvs.getBoolean("isFromLandingPage", false), this.icD, this.mnm.icD);
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
    public final void qh() {
        if (!this.vG.IP.getAndSet(true) || rCZ.qh(this.vG.icD)) {
            this.vG.Gp.pvs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void kj() {
        vG();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS, com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void IP() {
        boolean z = false;
        boolean z2 = (1.0f - (((float) this.vG.dyT.kj()) / ((float) this.vG.icD.AEt()))) * 100.0f >= ((float) com.bytedance.sdk.openadsdk.core.mnm.Jd().Gp(String.valueOf(this.vG.sUS)).sUS);
        int pvs = com.bytedance.sdk.openadsdk.core.mnm.Jd().pvs(String.valueOf(this.vG.sUS));
        if (pvs == 0) {
            boolean NB2 = this.vG.dx.Wyp().NB();
            if (this.vG.dyT.cR()) {
                NB2 = true;
            }
            z = z2 && NB2;
        } else if (pvs == 1) {
            z = z2;
        }
        if (z) {
            vG();
        }
    }

    public void vG() {
        if (ny().Mxy().getBoolean("reward_verify", false) || ny().Ju()) {
            return;
        }
        ny().Mxy().putBoolean("reward_verify", true);
        if (com.bytedance.sdk.openadsdk.core.mnm.Jd().mnm(String.valueOf(this.vG.sUS))) {
            pvs(true, this.vG.icD.rCZ(), this.vG.icD.uc(), 0, "");
        } else {
            com.bytedance.sdk.openadsdk.core.mnm.vG().pvs(ae(), new vA.icD() { // from class: com.bytedance.sdk.openadsdk.activity.vG.3
                @Override // com.bytedance.sdk.openadsdk.core.vA.icD
                public void pvs(int i, String str) {
                    vG.this.pvs(false, 0, "", i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.vA.icD
                public void pvs(cR.icD icd) {
                    vG.this.pvs(icd.icD, icd.vG.pvs(), icd.vG.icD(), 0, "");
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    public void vA() {
        super.vA();
        com.bytedance.sdk.openadsdk.component.reward.icD.icD icd = this.icD;
        if (icd != null) {
            icd.ZhG();
        }
    }

    public void NB() {
        com.bytedance.sdk.openadsdk.component.reward.icD.icD icd = this.icD;
        if (icd == null) {
            return;
        }
        icd.Gp();
        this.vG.sP.icD();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    public boolean zM() {
        com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar = this.vG;
        return pvsVar != null && pvsVar.ny.ZhG();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    protected boolean a_() {
        return this.vG.Jd;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    protected String uc() {
        return this.vG.sq;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    public String b_() {
        return this.vG.NB;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.sUS
    public void pvs(sUS sus, sUS sus2, icD.Jd jd) {
        super.pvs(sus, sus2, jd);
        if (sus != null || sus2 == this) {
            return;
        }
        if (rCZ.icD(this.vG.icD)) {
            ny().pvs(pvs());
        }
        cR();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pvs(final boolean z, boolean z2) {
        if (!this.vG.Jd || ny().Mxy().getBoolean("reward_verify", false) || ny().Ju()) {
            return false;
        }
        if (!z2 && ny().Mxy().getBoolean("user_has_give_up_reward", false)) {
            return false;
        }
        if (!com.bytedance.sdk.openadsdk.core.mnm.Jd().so(String.valueOf(this.vG.sUS))) {
            if (!z2) {
                return false;
            }
            if (z) {
                dyT();
                return true;
            }
        }
        this.vG.uc.set(true);
        if (z) {
            this.vG.dyT.bNS();
        }
        final com.bytedance.sdk.openadsdk.core.widget.pvs pvsVar = new com.bytedance.sdk.openadsdk.core.widget.pvs(this.vG.od);
        this.icD.Ju = pvsVar;
        if (z) {
            this.icD.Ju.pvs(Jd).icD(NB).vG(sUS);
        } else {
            this.icD.Ju.pvs(yiw).icD(Ju).vG(sUS);
        }
        this.icD.Ju.pvs(new pvs.InterfaceC0086pvs() { // from class: com.bytedance.sdk.openadsdk.activity.vG.4
            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.InterfaceC0086pvs
            public void pvs() {
                if (z) {
                    vG.this.vG.dyT.pvs(1000L);
                }
                pvsVar.dismiss();
                vG.this.vG.uc.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.InterfaceC0086pvs
            public void icD() {
                pvsVar.dismiss();
                vG.this.ny().Mxy().putBoolean("user_has_give_up_reward", true);
                vG.this.vG.uc.set(false);
                vG.this.vG.dyT.sUS(Integer.MAX_VALUE);
                if (z) {
                    if (rCZ.vG(vG.this.vG.icD)) {
                        if (vG.this.vG.dyT.zM()) {
                            vG.this.vG.dyT.icD(5);
                            return;
                        } else {
                            vG.this.vG.dx.yiw();
                            return;
                        }
                    }
                    vG.this.vG.Gp.sUS();
                    if (vG.this.vG.dyT.zM()) {
                        vG.this.vG.dyT.icD(4);
                    }
                    vG.this.dyT();
                }
            }
        }).show();
        return true;
    }

    private JSONObject ae() {
        JSONObject jSONObject = new JSONObject();
        int uc = (int) this.vG.ny.uc();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("reward_name", this.vG.icD.uc());
            jSONObject.put("reward_amount", this.vG.icD.rCZ());
            jSONObject.put("network", com.bytedance.sdk.component.utils.mnm.vG(this.vG.jhZ));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int sP = this.vG.icD.sP();
            String str = "unKnow";
            if (sP == 2) {
                str = jlb.icD();
            } else if (sP == 1) {
                str = jlb.vG();
            }
            jSONObject.put("user_agent", str);
            jSONObject.put("extra", this.vG.icD.Je());
            jSONObject.put("media_extra", this.zM);
            jSONObject.put("video_duration", this.vG.icD.od().sUS());
            jSONObject.put("play_start_ts", 0);
            jSONObject.put("play_end_ts", 0);
            jSONObject.put(TypedValues.TransitionType.S_DURATION, uc);
            jSONObject.put("user_id", this.cR);
            jSONObject.put("trans_id", com.bytedance.sdk.openadsdk.utils.rCZ.pvs().replace("-", ""));
            return jSONObject;
        } catch (Throwable th) {
            Ju.pvs("TTAD.EndCardScene", "", th);
            return null;
        }
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
}
