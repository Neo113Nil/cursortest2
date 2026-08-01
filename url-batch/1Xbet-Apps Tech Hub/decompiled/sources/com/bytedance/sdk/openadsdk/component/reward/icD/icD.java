package com.bytedance.sdk.openadsdk.component.reward.icD;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.dyT;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.activity.icD;
import com.bytedance.sdk.openadsdk.component.reward.top.TopProxyLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.RFDownloadBarLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.RewardFullBaseLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.Ju;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.mnm;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.icD.icD;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;
import com.google.android.material.card.MaterialCardViewHelper;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: RewardFullAdType.java */
/* loaded from: classes2.dex */
public abstract class icD extends com.bytedance.sdk.openadsdk.component.reward.icD.pvs {
    public LinearLayout IP;
    public com.bytedance.sdk.openadsdk.core.widget.pvs Ju;
    private com.bytedance.sdk.openadsdk.Mxy.NB bNS;
    protected com.bytedance.sdk.openadsdk.core.icD.NB kj;
    protected String qh;

    /* compiled from: RewardFullAdType.java */
    public interface pvs {
        void pvs(boolean z);
    }

    public void IP() {
    }

    public pvs Jd() {
        return null;
    }

    public abstract boolean NB();

    protected boolean ae() {
        return true;
    }

    public abstract void pvs(FrameLayout frameLayout);

    public abstract boolean sUS();

    public void uc() {
    }

    public abstract void yiw();

    public icD(com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar) {
        super(pvsVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.pvs
    public void pvs(com.bytedance.sdk.openadsdk.core.video.vG.icD icd, dyT dyt) {
        super.pvs(icd, dyt);
        if (this.pvs.icD.pvs() && this.pvs.HWd) {
            this.pvs.dx.pvs(false);
        }
        if (rCZ.qh(this.pvs.icD)) {
            this.pvs.dyT.sUS();
        }
    }

    public void pvs(RewardFullBaseLayout rewardFullBaseLayout) {
        int ae = this.icD.ae();
        if (ae == 1 && !rCZ.qh(this.icD)) {
            icD(rewardFullBaseLayout);
            return;
        }
        if (ae == 3) {
            vG(rewardFullBaseLayout);
        } else if (ae == 5) {
            Jd(rewardFullBaseLayout);
        } else {
            pvs(rewardFullBaseLayout, this.pvs);
        }
    }

    public RFEndCardBackUpLayout so() {
        return new RFEndCardBackUpLayout(this.pvs.jhZ);
    }

    public View Mxy() {
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(this.pvs.od);
        pAGFrameLayout.setId(kj.XPz);
        PAGImageView pAGImageView = new PAGImageView(this.pvs.od);
        pAGImageView.setId(520093708);
        pAGImageView.setPadding(Pj.icD(this.pvs.jhZ, 8.0f), Pj.icD(this.pvs.jhZ, 8.0f), Pj.icD(this.pvs.jhZ, 8.0f), Pj.icD(this.pvs.jhZ, 8.0f));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(Pj.icD(this.pvs.od, 28.0f), Pj.icD(this.pvs.od, 28.0f));
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = Pj.icD(this.pvs.od, 20.0f);
        layoutParams.rightMargin = Pj.icD(this.pvs.od, 24.0f);
        pAGImageView.setBackground(com.bytedance.sdk.openadsdk.utils.so.pvs(this.pvs.od, "tt_mute_btn_bg"));
        pAGImageView.setLayoutParams(layoutParams);
        pAGImageView.setImageResource(uc.Jd(this.pvs.od, "tt_video_close_drawable"));
        pAGImageView.setContentDescription(uc.pvs(this.pvs.od, "tt_ad_close_text"));
        pAGImageView.setVisibility(8);
        PAGLogoView pAGLogoView = new PAGLogoView(this.pvs.od);
        pAGLogoView.setId(520093757);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, Pj.icD(this.pvs.od, 14.0f));
        layoutParams2.gravity = 8388691;
        layoutParams2.leftMargin = Pj.icD(this.pvs.od, 16.0f);
        layoutParams2.bottomMargin = Pj.icD(this.pvs.od, 100.0f);
        pAGLogoView.setLayoutParams(layoutParams2);
        PAGImageView pAGImageView2 = new PAGImageView(this.pvs.od);
        pAGImageView2.setId(kj.Yjw);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(Pj.icD(this.pvs.od, 32.0f), Pj.icD(this.pvs.od, 14.0f));
        layoutParams3.gravity = 8388693;
        layoutParams3.rightMargin = Pj.icD(this.pvs.od, 7.0f);
        layoutParams3.bottomMargin = Pj.icD(this.pvs.od, 100.0f);
        pAGImageView2.setLayoutParams(layoutParams3);
        pAGImageView2.setPadding(Pj.icD(this.pvs.od, 9.0f), 0, Pj.icD(this.pvs.od, 9.0f), 0);
        pAGImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        PlayableLoadingView playableLoadingView = new PlayableLoadingView(this.pvs.od);
        playableLoadingView.setId(kj.OBt);
        playableLoadingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        playableLoadingView.setClickable(true);
        playableLoadingView.setFocusable(true);
        pAGFrameLayout.addView(pAGLogoView);
        pAGFrameLayout.addView(pAGImageView2);
        pAGFrameLayout.addView(playableLoadingView);
        if (!this.pvs.icD.EAq() || !this.pvs.Ayu || this.pvs.pvs != 1) {
            TopProxyLayout topProxyLayout = new TopProxyLayout(this.pvs.od);
            topProxyLayout.setId(kj.xyK);
            topProxyLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            pAGFrameLayout.addView(topProxyLayout);
        }
        pAGFrameLayout.addView(pAGImageView);
        return pAGFrameLayout;
    }

    public View Wyp() {
        PAGRelativeLayout pAGRelativeLayout;
        if (this.icD.ae() != 5) {
            pAGRelativeLayout = new PAGRelativeLayout(this.pvs.od);
            pAGRelativeLayout.setId(kj.Sn);
        } else {
            pAGRelativeLayout = null;
        }
        new StringBuilder("getLoadingFrameView").append(pAGRelativeLayout);
        return pAGRelativeLayout;
    }

    protected int qh() {
        float f = 100.0f;
        if (this.icD.ae() == 1 && !rCZ.qh(this.icD)) {
            f = 20.0f;
        }
        return Pj.icD(this.pvs.jhZ, Ju.pvs(this.icD) ? 20.0f : f);
    }

    public void kj() {
        this.pvs.CvL.pvs(this.pvs.Jd);
        this.pvs.gSd.icD();
        this.pvs.gSd.pvs(qh());
        this.pvs.sP.pvs();
        if (!this.pvs.icD.SJ()) {
            if (this.pvs.yiw && TextUtils.isEmpty(cR.pvs(this.pvs.jhZ, this.icD))) {
                Ju();
            }
            this.pvs.dx.pvs();
            this.pvs.Pj.pvs();
        }
        this.pvs.dyT.pvs();
        this.pvs.cRf.pvs();
        if (rCZ.icD(this.pvs.icD)) {
            SSWebView so = this.pvs.dx.so();
            if (so != null) {
                so.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            }
            this.pvs.dx.Mxy().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.pvs.cRf.vG(true);
            if (rCZ.qh(this.pvs.icD)) {
                this.pvs.gSd.Jd();
                Pj.pvs((View) so, 4);
                Pj.pvs((View) this.pvs.dx.Mxy(), 0);
            }
        }
        if (mnm.vG(this.pvs.icD) || mnm.icD(this.pvs.icD) || mnm.Jd(this.pvs.icD)) {
            return;
        }
        this.pvs.gSd.pvs(Pj.icD(this.pvs.jhZ, this.pvs.joF), Pj.icD(this.pvs.jhZ, this.pvs.thO));
        this.pvs.ZhG.pvs();
        if (rCZ.qh(this.pvs.icD)) {
            this.pvs.dx.pvs(true);
            this.pvs.dx.NB();
            pvs(false, false, false, icD.C0090icD.vG);
        } else if (this.pvs.Ca) {
            this.pvs.gSd.icD(0);
        }
    }

    public void Ju() {
        LinearLayout linearLayout = (LinearLayout) this.pvs.qD.findViewById(kj.Ju);
        this.IP = linearLayout;
        Pj.pvs((View) linearLayout, 8);
        this.pvs.cGU = new com.bytedance.sdk.openadsdk.common.so(this.pvs.od, this.pvs.icD, "landingpage_endcard");
        this.pvs.cGU.vG().setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.icD.icD.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                icD.this.pvs.gSd.Wyp().performClick();
            }
        });
        this.IP.addView(this.pvs.cGU.NB(), new LinearLayout.LayoutParams(-1, -1));
        this.pvs.dx.pvs(this.pvs.cGU);
    }

    public void pvs(boolean z, boolean z2, boolean z3, int i) {
        this.pvs.sP.pvs(z, z2, z3, this, i);
    }

    public void bNS() {
        com.bytedance.sdk.openadsdk.core.widget.pvs pvsVar = this.Ju;
        if (pvsVar == null || !pvsVar.isShowing()) {
            return;
        }
        this.Ju.dismiss();
    }

    public void mnm() {
        if (this.pvs.yiw) {
            return;
        }
        this.pvs.cRf.sUS();
        if (this.pvs.Ayu && (this.pvs.elv instanceof com.bytedance.sdk.openadsdk.activity.pvs)) {
            return;
        }
        this.pvs.gSd.sUS(0);
    }

    public void vA() {
        this.Wyp.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
    }

    public void cR() {
        zM();
        if (this.pvs == null) {
            return;
        }
        if (this.pvs.Ye != null) {
            this.pvs.Ye.pvs();
        }
        this.pvs.pvs();
    }

    protected void zM() {
        if (this.pvs.Wyp.get() && !this.pvs.yiw && this.pvs.rCZ.getAndSet(false) && (this.pvs.so >= 0 || this.pvs.so == -1)) {
            Message obtain = Message.obtain();
            obtain.what = TypedValues.TransitionType.TYPE_DURATION;
            obtain.arg1 = this.pvs.so;
            this.pvs.SE.sendMessage(obtain);
        }
        if (this.pvs.Mxy <= 0 || !this.pvs.OT.getAndSet(false)) {
            return;
        }
        Message obtain2 = Message.obtain();
        obtain2.what = TypedValues.Custom.TYPE_INT;
        obtain2.arg1 = this.pvs.Mxy;
        this.pvs.SE.sendMessage(obtain2);
    }

    public void rCZ() {
        if (this.pvs == null) {
            return;
        }
        this.pvs.ZsW = false;
        boolean z = this.pvs.ZsW;
        boolean z2 = this.pvs.ea;
        if (!this.pvs.qh.get()) {
            this.pvs.ny.Wyp();
        }
        vA();
        this.pvs.dx.cR();
        this.pvs.dyT.IP();
        this.pvs.OT.set(true);
        if (this.pvs.Wyp.get()) {
            this.pvs.rCZ.set(true);
        }
        if (this.pvs.Ye != null) {
            this.pvs.Ye.icD();
        }
        this.pvs.icD();
    }

    public void OT() {
        if (this.pvs == null) {
            return;
        }
        if (this.pvs.gSd != null) {
            this.pvs.gSd.mnm();
        }
        boolean z = this.pvs.ea;
        this.pvs.jlb.pvs();
        DeviceUtils.yiw();
        this.pvs.dx.vA();
        if (this.pvs.ea) {
            this.pvs.od.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.icD.icD.2
                @Override // java.lang.Runnable
                public void run() {
                    if (icD.this.pvs.jlb.pvs() > 0) {
                        icD.this.pvs.jlb.pvs(false);
                    }
                }
            });
        }
    }

    public void ny() {
        if (this.pvs.dX != null) {
            this.pvs.dX.sUS();
        }
        if (this.pvs.gSd != null) {
            this.pvs.gSd.IP();
        }
        this.pvs.ny.dyT();
        if (!NB()) {
            this.pvs.Wyp.get();
        }
        this.pvs.dx.IP();
        this.pvs.dyT.NB();
        this.pvs.gSd.kj();
        this.pvs.sP.vG();
        this.pvs.CvL.icD();
        if (this.pvs.Ye != null) {
            this.pvs.Ye.vG();
        }
    }

    public void ZhG() {
        int zM;
        if (com.bytedance.sdk.openadsdk.core.mnm.Jd().rCZ(String.valueOf(this.pvs.sUS)) == 1) {
            if (this.pvs.Jd) {
                if (rCZ.qh(this.pvs.icD)) {
                    zM = com.bytedance.sdk.openadsdk.core.mnm.Jd().pvs(String.valueOf(this.pvs.sUS), true);
                } else {
                    zM = com.bytedance.sdk.openadsdk.core.mnm.Jd().Wyp(String.valueOf(this.pvs.sUS));
                }
            } else if (rCZ.qh(this.pvs.icD)) {
                zM = com.bytedance.sdk.openadsdk.core.mnm.Jd().pvs(String.valueOf(this.pvs.sUS), false);
            } else {
                zM = com.bytedance.sdk.openadsdk.core.mnm.Jd().zM(String.valueOf(this.pvs.sUS));
            }
            if (this.pvs.gSd != null && this.pvs.gSd.Mxy()) {
                if (this.pvs.gSd != null) {
                    this.pvs.gSd.Wyp().performClick();
                }
            } else if ((!this.pvs.Wyp.get() || rCZ.qh(this.pvs.icD)) && zM != -1) {
                if (((this.pvs.ny == null || this.pvs.ny.so() < zM * 1000) && (this.pvs.dyT == null || this.pvs.dyT.qh() - this.pvs.dyT.kj() < zM)) || this.pvs.cRf == null) {
                    return;
                }
                this.pvs.cRf.Jd();
            }
        }
    }

    public void dyT() {
        this.pvs.cRf.vG();
        this.pvs.cRf.NB(true);
    }

    public void dX() {
        this.kj = this.pvs.Gp.vG();
    }

    public void CvL() {
        if (!sUS() && ((this instanceof yiw) || (this instanceof so))) {
            this.pvs.Gp.icD();
            return;
        }
        if (!this.Mxy.pvs(this.NB.Mxy(), false)) {
            this.Wyp.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
            if (this.pvs.Ayu && (this.pvs.elv instanceof com.bytedance.sdk.openadsdk.activity.pvs)) {
                ((com.bytedance.sdk.openadsdk.activity.pvs) this.pvs.elv).rCZ();
            } else {
                pvs(icD.C0090icD.pvs);
                this.NB.pvs(!this.NB.CvL() ? 1 : 0, 4);
            }
        }
        if (this.pvs == null || this.pvs.icD == null || this.pvs.Ye == null || !this.pvs.icD.OBt()) {
            return;
        }
        this.pvs.Ye.pvs(this.pvs.ny.uc());
    }

    public void pvs(int i) {
        this.NB.Ju();
        pvs(false, true, false, i);
        if (this.pvs.Jd) {
            this.Mxy.pvs(10000);
        }
    }

    public void pvs(com.bytedance.sdk.openadsdk.Mxy.NB nb) {
        this.bNS = nb;
        vG();
        if (!this.pvs.icD.SJ() && ae()) {
            Gp();
        }
        if (ae()) {
            this.pvs.sP.icD();
        }
        if (mnm.vG(this.pvs.icD) || mnm.Jd(this.pvs.icD)) {
            this.Wyp.sendEmptyMessageDelayed(500, 100L);
        }
        this.pvs.gSd.pvs(this.pvs.OyE == 100.0f);
        dX();
        yiw();
    }

    public final void Gp() {
        if (this.pvs.od.isFinishing()) {
            return;
        }
        this.pvs.dx.Ju();
        String str = this.pvs.Jd ? "reward_endcard" : "fullscreen_endcard";
        this.pvs.dx.pvs(this.bNS, str, this.pvs.OhP);
        this.pvs.dyT.pvs(this.bNS, this.pvs.ea);
        this.pvs.dx.pvs(str, this.pvs.OhP);
        this.pvs.dx.NB();
    }

    public void pvs(Message message) {
        int i = message.what;
        int i2 = message.what;
        if (i2 == 1) {
            dyT();
            return;
        }
        if (i2 == 300) {
            if (this.pvs.Ayu && (this.pvs.elv instanceof com.bytedance.sdk.openadsdk.activity.pvs)) {
                ((com.bytedance.sdk.openadsdk.activity.pvs) this.pvs.elv).rCZ();
            } else {
                pvs(icD.C0090icD.icD);
                this.pvs.ny.pvs(!this.pvs.ny.CvL() ? 1 : 0, 1 ^ (this.pvs.ny.CvL() ? 1 : 0));
            }
            if (this.pvs.icD.ig() == null || this.pvs.icD.ig().pvs() == null) {
                return;
            }
            this.pvs.icD.ig().pvs().pvs(com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs.GENERAL_LINEAR_AD_ERROR);
            return;
        }
        if (i2 == 400) {
            this.pvs.ny.Ju();
            pvs(false, true, false, 3);
            return;
        }
        if (i2 == 500) {
            if (!rCZ.icD(this.pvs.icD)) {
                this.pvs.cRf.vG(false);
            }
            SSWebView so = this.pvs.dx.so();
            if (so != null && so.getWebView() != null) {
                so.Mxy();
                so.getWebView().resumeTimers();
            }
            if (this.pvs.dx.so() != null) {
                this.pvs.dx.pvs(1.0f);
                this.pvs.gSd.pvs(1.0f);
            }
            if (!this.pvs.icD.FJ() && this.pvs.ny.icD() && this.pvs.cR.get()) {
                this.pvs.ny.Ju();
                return;
            }
            return;
        }
        if (i2 == 600) {
            mnm();
            return;
        }
        if (i2 == 700) {
            int i3 = message.arg1;
            if (this.pvs.rCZ.get()) {
                return;
            }
            if (i3 > 0) {
                this.pvs.cRf.icD();
                this.pvs.cRf.pvs((i3 / 1000) + "s");
                this.pvs.cRf.NB(false);
                Message obtain = Message.obtain();
                obtain.what = TypedValues.TransitionType.TYPE_DURATION;
                obtain.arg1 = i3 + NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                this.pvs.so += NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                this.Wyp.sendMessageDelayed(obtain, 1000L);
                return;
            }
            this.Wyp.removeMessages(TypedValues.TransitionType.TYPE_DURATION);
            if (rCZ.vG(this.icD)) {
                if (this.pvs.dyT.vA() || !this.pvs.dx.mnm()) {
                    mnm();
                    return;
                } else {
                    dyT();
                    return;
                }
            }
            mnm();
            return;
        }
        if (i2 == 800) {
            if (!rCZ.icD(this.pvs.icD)) {
                this.pvs.cRf.vG(false);
            }
            this.pvs.gSd.pvs(1.0f);
            if (!this.pvs.icD.FJ() && this.pvs.ny.icD() && this.pvs.cR.get()) {
                this.pvs.ny.Ju();
                return;
            }
            return;
        }
        if (i2 == 900 && !this.pvs.OT.get()) {
            int i4 = message.arg1;
            double Gp = this.pvs.ny.Gp();
            pvs(i4, (long) (1000.0d * Gp));
            if (i4 > 0) {
                this.pvs.cRf.icD();
                this.pvs.cRf.pvs((i4 / 1000) + "s");
                this.pvs.cRf.NB(false);
                Message obtain2 = Message.obtain();
                obtain2.what = TypedValues.Custom.TYPE_INT;
                obtain2.arg1 = i4 + NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                this.pvs.Mxy = obtain2.arg1;
                this.Wyp.sendMessageDelayed(obtain2, 1000L);
                if (this.pvs.Ayu && (this.pvs.elv instanceof com.bytedance.sdk.openadsdk.activity.pvs) && Gp > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    ((com.bytedance.sdk.openadsdk.activity.pvs) this.pvs.elv).pvs((float) (1.0d - ((i4 / 1000.0f) / Gp)));
                    return;
                }
                return;
            }
            this.Wyp.removeMessages(TypedValues.Custom.TYPE_INT);
            mnm();
            com.bytedance.sdk.openadsdk.activity.sUS sus = this.pvs.elv;
            if (this.pvs.Ayu && (sus instanceof com.bytedance.sdk.openadsdk.activity.pvs)) {
                sus.ny().pvs(sus, new icD.Jd(5));
            }
        }
    }

    private void pvs(long j, long j2) {
        if (this.pvs.od instanceof TTRewardVideoActivity) {
            ((TTRewardVideoActivity) this.pvs.od).pvs(j2 - j, j2);
        }
    }

    static void pvs(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar) {
        Context context = frameLayout.getContext();
        if (pvsVar.HWd) {
            PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
            pAGFrameLayout.setId(kj.Wyp);
            frameLayout.addView(pAGFrameLayout, new FrameLayout.LayoutParams(-1, -1));
            pAGFrameLayout.addView(pvs(context));
            RFDownloadBarLayout rFDownloadBarLayout = new RFDownloadBarLayout(context);
            rFDownloadBarLayout.setId(kj.kj);
            rFDownloadBarLayout.setPadding(Pj.icD(context, 15.0f), 0, 0, 0);
            rFDownloadBarLayout.setBackgroundColor(uc.so(context, "tt_download_bar_background_new"));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, Pj.icD(context, 90.0f));
            layoutParams.gravity = 80;
            frameLayout.addView(rFDownloadBarLayout, layoutParams);
            PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
            pAGLinearLayout.setId(kj.Ju);
            pAGLinearLayout.setOrientation(1);
            pAGLinearLayout.setVisibility(8);
            frameLayout.addView(pAGLinearLayout, new FrameLayout.LayoutParams(-1, -1));
        }
        if (pvsVar.yWX) {
            SSWebView sSWebView = new SSWebView(context, true);
            sSWebView.setId(kj.IP);
            sSWebView.setLayerType(2, null);
            sSWebView.setVisibility(4);
            frameLayout.addView(sSWebView, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(kj.bNS);
            frameLayout2.setVisibility(4);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        }
        SSWebView sSWebView2 = new SSWebView(context, true);
        sSWebView2.setId(kj.mnm);
        sSWebView2.setVisibility(8);
        frameLayout.addView(sSWebView2, new FrameLayout.LayoutParams(-1, -1));
    }

    protected static FrameLayout pvs(Context context) {
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        pAGFrameLayout.setId(kj.qh);
        pAGFrameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        pAGFrameLayout.setLayoutParams(layoutParams);
        return pAGFrameLayout;
    }

    private void icD(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        frameLayout.addView(pAGRelativeLayout, new FrameLayout.LayoutParams(-1, -1));
        if (this.pvs.HWd) {
            PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
            pAGFrameLayout.setId(kj.qh);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, Pj.icD(context, 211.0f));
            layoutParams.addRule(13);
            pAGRelativeLayout.addView(pAGFrameLayout, layoutParams);
            View view = new View(context);
            view.setVisibility(8);
            view.setId(kj.vA);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.addRule(2, kj.qh);
            pAGRelativeLayout.addView(view, layoutParams2);
            RFDownloadBarLayout rFDownloadBarLayout = new RFDownloadBarLayout(context);
            rFDownloadBarLayout.setId(kj.kj);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(Pj.icD(context, 280.0f), Pj.icD(context, 70.0f));
            layoutParams3.addRule(2, kj.qh);
            layoutParams3.addRule(14);
            layoutParams3.bottomMargin = Pj.icD(context, 33.0f);
            pAGRelativeLayout.addView(rFDownloadBarLayout, layoutParams3);
            View view2 = new View(context);
            view2.setId(kj.wjr);
            view2.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams4.addRule(3, kj.qh);
            pAGRelativeLayout.addView(view2, layoutParams4);
            PAGTextView pAGTextView = new PAGTextView(context);
            pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
            pAGTextView.setLines(1);
            pAGTextView.setGravity(17);
            pAGTextView.setText(uc.icD(context, "tt_video_download_apk"));
            pAGTextView.setTextColor(-1);
            pAGTextView.setTextSize(2, 15.0f);
            pAGTextView.setBackground(com.bytedance.sdk.openadsdk.utils.so.pvs(context, "tt_reward_video_download_btn_bg"));
            pAGTextView.setId(520093705);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(Pj.icD(context, 260.0f), Pj.icD(context, 36.0f));
            layoutParams5.addRule(3, kj.qh);
            layoutParams5.addRule(14);
            layoutParams5.topMargin = Pj.icD(context, 70.0f);
            pAGRelativeLayout.addView(pAGTextView, layoutParams5);
        }
        if (this.pvs.yWX) {
            SSWebView sSWebView = new SSWebView(context, true);
            sSWebView.setLayerType(2, null);
            sSWebView.setVisibility(4);
            sSWebView.setId(kj.IP);
            pAGRelativeLayout.addView(sSWebView, new RelativeLayout.LayoutParams(-1, -1));
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(kj.bNS);
            frameLayout2.setVisibility(4);
            pAGRelativeLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        }
        SSWebView sSWebView2 = new SSWebView(context, true);
        sSWebView2.setVisibility(8);
        sSWebView2.setId(kj.mnm);
        pAGRelativeLayout.addView(sSWebView2, new RelativeLayout.LayoutParams(-1, -1));
    }

    private void vG(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        if (this.pvs.HWd) {
            frameLayout.addView(pvs(context));
            RFDownloadBarLayout rFDownloadBarLayout = new RFDownloadBarLayout(context);
            rFDownloadBarLayout.setBackground(com.bytedance.sdk.openadsdk.utils.so.pvs(context, "tt_reward_full_new_bar_bg"));
            rFDownloadBarLayout.setPadding(Pj.icD(context, 15.0f), 0, 0, 0);
            rFDownloadBarLayout.setId(kj.kj);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, Pj.icD(context, 76.0f));
            layoutParams.gravity = 80;
            layoutParams.leftMargin = Pj.icD(context, 10.0f);
            layoutParams.rightMargin = Pj.icD(context, 10.0f);
            layoutParams.setMarginStart(layoutParams.leftMargin);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
            layoutParams.bottomMargin = Pj.icD(context, 14.0f);
            frameLayout.addView(rFDownloadBarLayout, layoutParams);
            PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
            pAGLinearLayout.setId(kj.Ju);
            pAGLinearLayout.setVisibility(8);
            frameLayout.addView(pAGLinearLayout, new FrameLayout.LayoutParams(-1, -1));
        }
        if (this.pvs.yWX) {
            SSWebView sSWebView = new SSWebView(context, true);
            sSWebView.setLayerType(2, null);
            sSWebView.setVisibility(4);
            sSWebView.setId(kj.IP);
            frameLayout.addView(sSWebView, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(kj.bNS);
            frameLayout2.setVisibility(4);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        }
        SSWebView sSWebView2 = new SSWebView(context, true);
        sSWebView2.setVisibility(8);
        sSWebView2.setId(kj.mnm);
        frameLayout.addView(sSWebView2, new FrameLayout.LayoutParams(-1, -1));
    }

    private void Jd(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        if (this.pvs.HWd) {
            frameLayout.addView(pvs(context));
            RFDownloadBarLayout rFDownloadBarLayout = new RFDownloadBarLayout(context);
            rFDownloadBarLayout.setBackground(com.bytedance.sdk.openadsdk.utils.so.pvs(context, "tt_reward_full_new_bar_bg"));
            rFDownloadBarLayout.setPadding(Pj.icD(context, 15.0f), 0, 0, 0);
            rFDownloadBarLayout.setId(kj.kj);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, Pj.icD(context, 76.0f));
            layoutParams.gravity = 80;
            layoutParams.leftMargin = Pj.icD(context, 10.0f);
            layoutParams.rightMargin = Pj.icD(context, 10.0f);
            layoutParams.setMarginStart(layoutParams.leftMargin);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
            layoutParams.bottomMargin = Pj.icD(context, 14.0f);
            frameLayout.addView(rFDownloadBarLayout, layoutParams);
            PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
            pAGLinearLayout.setId(kj.Ju);
            pAGLinearLayout.setVisibility(8);
            frameLayout.addView(pAGLinearLayout, new FrameLayout.LayoutParams(-1, -1));
        }
        if (this.pvs.yWX) {
            SSWebView sSWebView = new SSWebView(context, true);
            sSWebView.setLayerType(2, null);
            sSWebView.setVisibility(4);
            sSWebView.setId(kj.IP);
            frameLayout.addView(sSWebView, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(kj.bNS);
            frameLayout2.setVisibility(4);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        }
        SSWebView sSWebView2 = new SSWebView(context, true);
        sSWebView2.setVisibility(8);
        sSWebView2.setId(kj.mnm);
        frameLayout.addView(sSWebView2, new FrameLayout.LayoutParams(-1, -1));
    }
}
