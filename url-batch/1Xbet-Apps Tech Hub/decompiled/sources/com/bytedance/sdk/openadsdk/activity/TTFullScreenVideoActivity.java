package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bykv.vk.openvk.component.video.api.Jd.vG;
import com.bytedance.sdk.component.so.so;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView;
import com.bytedance.sdk.openadsdk.core.OT;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.mnm;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.bNS;
import com.bytedance.sdk.openadsdk.icD.yiw;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.zM;
import com.google.android.material.card.MaterialCardViewHelper;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes2.dex */
public class TTFullScreenVideoActivity extends TTBaseVideoActivity {
    private static com.bytedance.sdk.openadsdk.apiImpl.icD.icD kj;
    private boolean Ju;
    private com.bytedance.sdk.openadsdk.apiImpl.icD.icD qh;

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void IP() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void pvs(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean vA() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        kj = this.qh;
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        FullRewardExpressView pvs;
        super.onResume();
        if (this.icD == null || (pvs = this.icD.dX.pvs()) == null) {
            return;
        }
        pvs.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.icD() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.icD
            public void pvs() {
                TTFullScreenVideoActivity.this.zM();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.icD == null || cR.NB(this.icD.icD)) {
            return;
        }
        com.bykv.vk.openvk.component.video.api.vG.icD od = this.icD.icD.od();
        if (od == null) {
            com.bykv.vk.openvk.component.video.api.vG.icD icd = new com.bykv.vk.openvk.component.video.api.vG.icD();
            icd.pvs(10.0d);
            this.icD.icD.pvs(icd);
        } else if (od.sUS() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            od.pvs(10.0d);
        }
    }

    private void pvs(final String str) {
        ae.vG(new so("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTFullScreenVideoActivity.this.icD(1).executeFullVideoCallback(TTFullScreenVideoActivity.this.icD.sq, str);
                } catch (Throwable th) {
                    Ju.pvs("TTAD.FSVA", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void pvs(Intent intent) {
        super.pvs(intent);
        this.icD.Cwg = intent.getBooleanExtra("is_verity_playable", false);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void pvs(Bundle bundle) {
        if (!com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            this.qh = OT.pvs().Jd();
        }
        if (this.qh != null || bundle == null) {
            return;
        }
        this.qh = kj;
        kj = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void mnm() {
        final View Wyp = this.icD.gSd.Wyp();
        if (Wyp != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.3
                /* JADX WARN: Removed duplicated region for block: B:21:0x00db A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:22:0x00dc  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onClick(View view) {
                    boolean z;
                    if (TTFullScreenVideoActivity.this.icD.dx.ny() && TTFullScreenVideoActivity.this.icD.Wyp.get()) {
                        boolean Ju = TTFullScreenVideoActivity.this.icD.Pj.Ju();
                        TTFullScreenVideoActivity.this.icD.dx.NB(Ju);
                        TTFullScreenVideoActivity.this.icD.gSd.sUS(8);
                        TTFullScreenVideoActivity.this.icD.SE.sendEmptyMessageDelayed(600, 5000L);
                        if (!cR.vG(TTFullScreenVideoActivity.this.icD.icD)) {
                            return;
                        }
                        if (cR.vG(TTFullScreenVideoActivity.this.icD.icD) && Ju) {
                            return;
                        }
                    }
                    if (TTFullScreenVideoActivity.this.icD.icD.Uv()) {
                        if (TTFullScreenVideoActivity.this.icD.icD.SJ()) {
                            if (TTFullScreenVideoActivity.this.icD.sP != null) {
                                TTFullScreenVideoActivity.this.icD.icD.cRf(2);
                                z = TTFullScreenVideoActivity.this.icD.sP.NB();
                            }
                        } else if (TTFullScreenVideoActivity.this.icD.icD.xyK() == 0 && !TTFullScreenVideoActivity.this.icD.dx.bNS()) {
                            TTFullScreenVideoActivity.this.icD.icD.cRf(11);
                            if (TTFullScreenVideoActivity.this.icD.dx.Jd()) {
                                TTFullScreenVideoActivity.this.icD.icD.cRf(12);
                            }
                            try {
                                TTFullScreenVideoActivity.this.icD.gSd.vA();
                                z = true;
                            } catch (Exception unused) {
                            }
                        }
                        if (z) {
                            TTFullScreenVideoActivity.this.icD.dx.ZhG();
                            TTFullScreenVideoActivity.this.icD.Pj.qh();
                            TTFullScreenVideoActivity.this.icD.Gp.sUS();
                            TTFullScreenVideoActivity.this.finish();
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
        this.icD.cRf.pvs(new com.bytedance.sdk.openadsdk.component.reward.top.icD() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.icD
            public void pvs(View view) {
                if (rCZ.vG(TTFullScreenVideoActivity.this.icD.icD) && (rCZ.qh(TTFullScreenVideoActivity.this.icD.icD) || TTFullScreenVideoActivity.this.icD.Wyp.get())) {
                    if (TTFullScreenVideoActivity.this.icD.dyT.zM()) {
                        TTFullScreenVideoActivity.this.icD.dyT.icD(5);
                        return;
                    } else {
                        TTFullScreenVideoActivity.this.icD.dx.yiw();
                        return;
                    }
                }
                if (rCZ.qh(TTFullScreenVideoActivity.this.icD.icD) || (mnm.pvs(TTFullScreenVideoActivity.this.icD.icD) && !TTFullScreenVideoActivity.this.icD.mnm.get())) {
                    if (!rCZ.vG(TTFullScreenVideoActivity.this.icD.icD) && TTFullScreenVideoActivity.this.icD.dyT.zM()) {
                        TTFullScreenVideoActivity.this.icD.dyT.icD(4);
                    }
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                if (TTFullScreenVideoActivity.this.icD.icD.gOj()) {
                    if (TTFullScreenVideoActivity.this.icD.gSd.qh() != null) {
                        TTFullScreenVideoActivity.this.icD.icD.cRf(2);
                        TTFullScreenVideoActivity.this.icD.gSd.vA();
                        return;
                    }
                    return;
                }
                if (!TTFullScreenVideoActivity.this.icD.vG && TTFullScreenVideoActivity.this.icD.icD.Uv() && !TTFullScreenVideoActivity.this.icD.icD.SJ()) {
                    TTFullScreenVideoActivity.this.icD.icD.cRf(13);
                    try {
                        TTFullScreenVideoActivity.this.icD.gSd.vA();
                        return;
                    } catch (Exception unused) {
                    }
                }
                bNS.pvs pvsVar = new bNS.pvs();
                pvsVar.pvs(TTFullScreenVideoActivity.this.icD.ny.yiw());
                pvsVar.vG(TTFullScreenVideoActivity.this.icD.ny.zM());
                pvsVar.icD(TTFullScreenVideoActivity.this.icD.ny.qh());
                pvsVar.vG(3);
                pvsVar.Jd(TTFullScreenVideoActivity.this.icD.ny.cR());
                com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.pvs(TTFullScreenVideoActivity.this.icD.ny.vG(), pvsVar, TTFullScreenVideoActivity.this.icD.ny.pvs());
                com.bytedance.sdk.openadsdk.core.rCZ.vG(TTFullScreenVideoActivity.this.icD.sUS);
                TTFullScreenVideoActivity.this.icD.ny.pvs("skip", false);
                TTFullScreenVideoActivity.this.icD.cRf.Jd(false);
                if (TTFullScreenVideoActivity.this.icD.vG) {
                    TTFullScreenVideoActivity.this.pvs(true, 4);
                } else {
                    TTFullScreenVideoActivity.this.finish();
                }
                if (TTFullScreenVideoActivity.this.icD.icD != null && TTFullScreenVideoActivity.this.icD.icD.ig() != null && TTFullScreenVideoActivity.this.icD.ny != null) {
                    TTFullScreenVideoActivity.this.icD.icD.ig().pvs().sUS(TTFullScreenVideoActivity.this.icD.ny.yiw());
                    TTFullScreenVideoActivity.this.icD.icD.ig().pvs().NB(TTFullScreenVideoActivity.this.icD.ny.yiw());
                }
                com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(TTFullScreenVideoActivity.this.icD.icD, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.icD
            public void icD(View view) {
                TTFullScreenVideoActivity.this.icD.ea = !TTFullScreenVideoActivity.this.icD.ea;
                if (TTFullScreenVideoActivity.this.vG != null && TTFullScreenVideoActivity.this.vG.Jd() != null) {
                    TTFullScreenVideoActivity.this.vG.Jd().pvs(TTFullScreenVideoActivity.this.icD.ea);
                }
                TTFullScreenVideoActivity.this.icD.ny.icD(TTFullScreenVideoActivity.this.icD.ea);
                if (!rCZ.kj(TTFullScreenVideoActivity.this.icD.icD) || TTFullScreenVideoActivity.this.icD.Wyp.get()) {
                    if (rCZ.icD(TTFullScreenVideoActivity.this.icD.icD)) {
                        TTFullScreenVideoActivity.this.icD.jlb.pvs(TTFullScreenVideoActivity.this.icD.ea, true);
                    }
                    TTFullScreenVideoActivity.this.icD.dx.Jd(TTFullScreenVideoActivity.this.icD.ea);
                    if (TTFullScreenVideoActivity.this.icD.icD == null || TTFullScreenVideoActivity.this.icD.icD.ig() == null || TTFullScreenVideoActivity.this.icD.icD.ig().pvs() == null || TTFullScreenVideoActivity.this.icD.ny == null) {
                        return;
                    }
                    if (TTFullScreenVideoActivity.this.icD.ea) {
                        TTFullScreenVideoActivity.this.icD.icD.ig().pvs().so(TTFullScreenVideoActivity.this.icD.ny.yiw());
                    } else {
                        TTFullScreenVideoActivity.this.icD.icD.ig().pvs().Mxy(TTFullScreenVideoActivity.this.icD.ny.yiw());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.icD
            public void vG(View view) {
                TTFullScreenVideoActivity.this.icD.gA.pvs(TTFullScreenVideoActivity.this.vG);
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

    public boolean pvs(long j, boolean z) {
        yiw yiwVar = new yiw();
        yiwVar.pvs(System.currentTimeMillis(), 1.0f);
        if (this.vG != null && (this.vG instanceof com.bytedance.sdk.openadsdk.component.reward.icD.so)) {
            this.icD.ny.pvs(((com.bytedance.sdk.openadsdk.component.reward.icD.so) this.vG).gA(), yiwVar);
        } else {
            this.icD.ny.pvs(this.icD.gSd.sUS(), yiwVar);
        }
        vG.pvs pvsVar = new vG.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.5
            boolean pvs;

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void pvs(long j2, int i) {
                if (this.pvs) {
                    return;
                }
                this.pvs = true;
                TTFullScreenVideoActivity.this.Jd.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                TTFullScreenVideoActivity.this.bNS();
                TTFullScreenVideoActivity.this.icD.ny.pvs(j2, j2);
                TTFullScreenVideoActivity.this.icD.zM.set(true);
                if (TTFullScreenVideoActivity.this.icD.icD.bGM()) {
                    TTFullScreenVideoActivity.this.icD.icD.cRf(1);
                    TTFullScreenVideoActivity.this.icD.gSd.vA();
                }
                if (TTFullScreenVideoActivity.this.icD.icD.mnm() == 21 && !TTFullScreenVideoActivity.this.icD.icD.Jd()) {
                    TTFullScreenVideoActivity.this.icD.icD.icD(true);
                    TTFullScreenVideoActivity.this.icD.gSd.vA();
                }
                if (TTFullScreenVideoActivity.this.icD.vG) {
                    if (TTFullScreenVideoActivity.this.icD.icD.pY()) {
                        TTFullScreenVideoActivity.this.icD.cRf.vG();
                        return;
                    }
                    TTFullScreenVideoActivity.this.pvs(false, 5);
                    if (mnm.icD(TTFullScreenVideoActivity.this.icD.icD) && TTFullScreenVideoActivity.this.icD.Ye != null) {
                        TTFullScreenVideoActivity.this.icD.Ye.pvs(0L);
                    }
                    if (cR.NB(TTFullScreenVideoActivity.this.icD.icD)) {
                        return;
                    }
                    TTFullScreenVideoActivity.this.icD.ny.pvs("skip", true);
                    return;
                }
                if (TTFullScreenVideoActivity.this.icD.icD.pY()) {
                    TTFullScreenVideoActivity.this.icD.cRf.vG();
                    return;
                }
                if (!cR.NB(TTFullScreenVideoActivity.this.icD.icD)) {
                    TTFullScreenVideoActivity.this.icD.ny.pvs("skip", true);
                }
                TTFullScreenVideoActivity.this.finish();
            }

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void icD(long j2, int i) {
                TTFullScreenVideoActivity.this.Jd.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                if (TTFullScreenVideoActivity.this.icD.ny.icD()) {
                    TTFullScreenVideoActivity.this.Ju();
                    return;
                }
                TTFullScreenVideoActivity.this.icD.ny.Ju();
                Ju.pvs("TTAD.FSVA", "fullscreen_interstitial_ad", "onError、、、、、、、、");
                if (TTFullScreenVideoActivity.this.icD.vG) {
                    TTFullScreenVideoActivity.this.pvs(false, true, 3);
                    TTFullScreenVideoActivity.this.icD.ny.pvs(!TTFullScreenVideoActivity.this.icD.ny.CvL() ? 1 : 0, 2);
                } else {
                    TTFullScreenVideoActivity.this.finish();
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void pvs() {
                TTFullScreenVideoActivity.this.Jd.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                TTFullScreenVideoActivity.this.bNS();
                Object[] objArr = new Object[2];
                if (TTFullScreenVideoActivity.this.icD.vG) {
                    TTFullScreenVideoActivity.this.pvs(false, true, 6);
                } else {
                    TTFullScreenVideoActivity.this.finish();
                }
                TTFullScreenVideoActivity.this.icD.ny.pvs(!TTFullScreenVideoActivity.this.icD.ny.CvL() ? 1 : 0, 1 ^ (TTFullScreenVideoActivity.this.icD.ny.CvL() ? 1 : 0));
                TTFullScreenVideoActivity.this.icD.ny.Ju();
            }

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void pvs(long j2, long j3) {
                if (!TTFullScreenVideoActivity.this.icD.ZsW && TTFullScreenVideoActivity.this.icD.ny.icD()) {
                    TTFullScreenVideoActivity.this.icD.ny.bNS();
                }
                if (TTFullScreenVideoActivity.this.icD.Wyp.get()) {
                    return;
                }
                TTFullScreenVideoActivity.this.Jd.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                if (j2 != TTFullScreenVideoActivity.this.icD.ny.so()) {
                    TTFullScreenVideoActivity.this.bNS();
                }
                TTFullScreenVideoActivity.this.icD.ny.pvs(j2, j3);
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                long j4 = j2 / 1000;
                tTFullScreenVideoActivity.sUS = (int) (tTFullScreenVideoActivity.icD.ny.Gp() - j4);
                int i = (int) j4;
                if ((TTFullScreenVideoActivity.this.icD.uc.get() || TTFullScreenVideoActivity.this.icD.qh.get()) && TTFullScreenVideoActivity.this.icD.ny.icD()) {
                    TTFullScreenVideoActivity.this.icD.ny.bNS();
                }
                TTFullScreenVideoActivity.this.vG(i);
                if (TTFullScreenVideoActivity.this.sUS >= 0) {
                    TTFullScreenVideoActivity.this.icD.cRf.pvs(String.valueOf(TTFullScreenVideoActivity.this.sUS), null);
                }
            }
        };
        this.icD.ny.pvs(pvsVar);
        if (this.icD.gSd.bNS != null) {
            this.icD.gSd.bNS.pvs(pvsVar);
        }
        return this.icD.ny.pvs(j, z, null, this.vG);
    }

    protected void vG(int i) {
        int zM = com.bytedance.sdk.openadsdk.core.mnm.Jd().zM(String.valueOf(this.icD.sUS));
        if (!com.bytedance.sdk.openadsdk.core.mnm.Jd().sUS(String.valueOf(this.icD.sUS)) || (!cR.NB(this.icD.icD) && !this.icD.vG)) {
            if (i >= zM) {
                if (!this.icD.rW) {
                    this.icD.pvs(true);
                }
                pvs();
                return;
            }
            return;
        }
        if (!this.icD.rW) {
            this.icD.pvs(true);
        }
        if (i <= zM) {
            Jd(zM - i);
            this.icD.cRf.NB(false);
        } else {
            pvs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void pvs() {
        if (!cR.NB(this.icD.icD) && !this.icD.vG) {
            this.icD.cRf.pvs(null, "X");
        } else {
            this.icD.cRf.pvs(null, TTAdDislikeToast.getSkipText());
        }
        this.icD.cRf.NB(true);
    }

    private void Jd(int i) {
        this.icD.cRf.pvs(null, String.format(uc.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs(), "tt_skip_ad_time_text"), Integer.valueOf(i)));
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void c_() {
        if (this.icD.icD.UYh() != 100.0f) {
            this.Ju = true;
        }
        zM();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void NB() {
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            pvs("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.apiImpl.icD.icD icd = this.qh;
            if (icd != null) {
                icd.pvs();
            }
        }
        if (cR()) {
            this.icD.dX.Wyp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void Jd() {
        zM();
        this.icD.icD.udE();
        this.icD.icD.pvs(true);
        if (cR.NB(this.icD.icD)) {
            com.bytedance.sdk.openadsdk.icD.vG.icD(this.icD.icD, this.icD.NB, this.icD.icD.QnQ());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zM() {
        zM.pvs("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            pvs("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.apiImpl.icD.icD icd = this.qh;
        if (icd != null) {
            icd.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.icD != null) {
            this.icD.dyT.icD(this.icD.Cwg);
        }
        try {
            uc();
        } catch (Exception unused) {
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        uc();
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            pvs("recycleRes");
        }
        this.qh = null;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        kj = null;
    }

    private void uc() {
        if (this.so) {
            return;
        }
        this.so = true;
        zM.pvs("BVA", "invoke callback onAdClose, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            pvs("onAdClose");
            return;
        }
        com.bytedance.sdk.openadsdk.apiImpl.icD.icD icd = this.qh;
        if (icd != null) {
            icd.icD();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        if (this.icD == null || !icD(this.icD.icD) || pvs(this.icD.icD)) {
            return;
        }
        if (this.Ju) {
            this.Ju = false;
            finish();
        } else if (this.icD.dx.gA()) {
            finish();
        }
    }

    private boolean pvs(cR cRVar) {
        return cRVar == null || cRVar.UYh() == 100.0f;
    }

    private boolean icD(cR cRVar) {
        if (cRVar == null) {
            return false;
        }
        return com.bytedance.sdk.openadsdk.core.mnm.Jd().uc(String.valueOf(this.icD.sUS));
    }
}
