package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.work.WorkRequest;
import com.bykv.vk.openvk.component.video.api.Jd.vG;
import com.bytedance.sdk.component.so.so;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView;
import com.bytedance.sdk.openadsdk.core.OT;
import com.bytedance.sdk.openadsdk.core.cR;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.vA;
import com.bytedance.sdk.openadsdk.core.widget.pvs;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.bNS;
import com.bytedance.sdk.openadsdk.icD.yiw;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.bytedance.sdk.openadsdk.utils.zM;
import com.google.android.material.card.MaterialCardViewHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTRewardVideoActivity extends TTBaseVideoActivity {
    private static String IP;
    private static String bNS;
    private static String cR;
    private static String mnm;
    private static com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs rCZ;
    private static String vA;
    protected com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs Ju;
    private boolean ZhG;
    protected int kj;
    protected int qh;
    private String uc;
    private String zM;
    private final AtomicBoolean OT = new AtomicBoolean(false);
    private int ny = -1;

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean vA() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        rCZ = this.Ju;
        if (this.OT.get() && this.icD != null) {
            this.icD.icD.JO();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (IP == null) {
                IP = uc.pvs(this, "tt_reward_msg");
                bNS = uc.pvs(this, "tt_msgPlayable");
                mnm = uc.pvs(this, "tt_negtiveBtnBtnText");
                vA = uc.pvs(this, "tt_postiveBtnText");
                cR = uc.pvs(this, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            Ju.pvs("TTAD.RVA", th.getMessage());
        }
        if (bundle == null || this.icD == null || !this.icD.icD.IL()) {
            return;
        }
        this.OT.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        FullRewardExpressView pvs;
        super.onResume();
        if (this.icD == null || (pvs = this.icD.dX.pvs()) == null) {
            return;
        }
        pvs.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.icD() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.icD
            public void pvs() {
                TTRewardVideoActivity.this.rCZ();
            }
        });
    }

    protected void pvs(String str) {
        pvs(str, false, 0, "", 0, "");
    }

    protected void finalize() throws Throwable {
        super.finalize();
        rCZ = null;
    }

    private void pvs(final String str, final boolean z, final int i, final String str2, final int i2, final String str3) {
        ae.vG(new so("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTRewardVideoActivity.this.icD(0).executeRewardVideoCallback(TTRewardVideoActivity.this.icD.sq, str, z, i, str2, i2, str3);
                } catch (Throwable th) {
                    Ju.pvs("TTAD.RVA", "rewarded_video", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void pvs(Bundle bundle) {
        if (!com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            this.Ju = OT.pvs().vG();
        }
        if (this.Ju != null || bundle == null) {
            return;
        }
        this.Ju = rCZ;
        rCZ = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void pvs() {
        this.icD.cRf.pvs(null, TTAdDislikeToast.getSkipText());
        this.icD.cRf.NB(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void mnm() {
        final View Wyp = this.icD.gSd.Wyp();
        if (Wyp != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.3
                /* JADX WARN: Removed duplicated region for block: B:21:0x00dc A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:22:0x00dd  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onClick(View view) {
                    boolean z;
                    if (TTRewardVideoActivity.this.icD.dx.ny() && TTRewardVideoActivity.this.icD.Wyp.get()) {
                        boolean Ju = TTRewardVideoActivity.this.icD.Pj.Ju();
                        TTRewardVideoActivity.this.icD.dx.NB(Ju);
                        TTRewardVideoActivity.this.icD.gSd.sUS(8);
                        TTRewardVideoActivity.this.icD.SE.sendEmptyMessageDelayed(600, 5000L);
                        if (!cR.vG(TTRewardVideoActivity.this.icD.icD)) {
                            return;
                        }
                        if (cR.vG(TTRewardVideoActivity.this.icD.icD) && Ju) {
                            return;
                        }
                    }
                    if (TTRewardVideoActivity.this.icD.icD.Uv()) {
                        if (TTRewardVideoActivity.this.icD.icD.SJ()) {
                            if (TTRewardVideoActivity.this.icD.sP != null) {
                                TTRewardVideoActivity.this.icD.icD.cRf(2);
                                z = TTRewardVideoActivity.this.icD.sP.NB();
                            }
                        } else if (TTRewardVideoActivity.this.icD.icD.xyK() == 0 && !TTRewardVideoActivity.this.icD.dx.bNS()) {
                            TTRewardVideoActivity.this.icD.icD.cRf(11);
                            if (TTRewardVideoActivity.this.icD.dx.Jd()) {
                                TTRewardVideoActivity.this.icD.icD.cRf(12);
                            }
                            try {
                                TTRewardVideoActivity.this.icD.gSd.vA();
                                z = true;
                            } catch (Exception unused) {
                            }
                        }
                        if (z) {
                            TTRewardVideoActivity.this.icD.dx.ZhG();
                            TTRewardVideoActivity.this.icD.Pj.qh();
                            TTRewardVideoActivity.this.icD.Gp.sUS();
                            if (rCZ.qh(TTRewardVideoActivity.this.icD.icD) && !rCZ.vG(TTRewardVideoActivity.this.icD.icD)) {
                                TTRewardVideoActivity.this.pvs(true, true);
                                return;
                            } else {
                                TTRewardVideoActivity.this.finish();
                                return;
                            }
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
        this.icD.cRf.pvs(new com.bytedance.sdk.openadsdk.component.reward.top.icD() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.icD
            public void pvs(View view) {
                if (TTRewardVideoActivity.this.icD.icD.gOj()) {
                    if (TTRewardVideoActivity.this.icD.gSd.qh() != null) {
                        TTRewardVideoActivity.this.icD.icD.cRf(2);
                        TTRewardVideoActivity.this.icD.gSd.vA();
                        return;
                    }
                    return;
                }
                if (!TTRewardVideoActivity.this.icD.vG && TTRewardVideoActivity.this.icD.icD.Uv() && !TTRewardVideoActivity.this.icD.icD.SJ()) {
                    TTRewardVideoActivity.this.icD.icD.cRf(13);
                    try {
                        TTRewardVideoActivity.this.icD.gSd.vA();
                        return;
                    } catch (Exception unused) {
                    }
                }
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.pvs(rCZ.qh(tTRewardVideoActivity.icD.icD), false);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.icD
            public void icD(View view) {
                if (TTRewardVideoActivity.this.vG != null && TTRewardVideoActivity.this.vG.Jd() != null) {
                    TTRewardVideoActivity.this.vG.Jd().pvs(TTRewardVideoActivity.this.icD.ea);
                }
                TTRewardVideoActivity.this.icD.ea = !TTRewardVideoActivity.this.icD.ea;
                Object[] objArr = new Object[2];
                String str = "will set is Mute " + TTRewardVideoActivity.this.icD.ea + " mLastVolume=" + TTRewardVideoActivity.this.icD.jlb.pvs();
                TTRewardVideoActivity.this.icD.ny.icD(TTRewardVideoActivity.this.icD.ea);
                if (!rCZ.kj(TTRewardVideoActivity.this.icD.icD) || TTRewardVideoActivity.this.icD.Wyp.get()) {
                    if (rCZ.icD(TTRewardVideoActivity.this.icD.icD)) {
                        TTRewardVideoActivity.this.icD.jlb.pvs(TTRewardVideoActivity.this.icD.ea, true);
                    }
                    TTRewardVideoActivity.this.icD.dx.Jd(TTRewardVideoActivity.this.icD.ea);
                    if (TTRewardVideoActivity.this.icD.icD == null || TTRewardVideoActivity.this.icD.icD.ig() == null || TTRewardVideoActivity.this.icD.icD.ig().pvs() == null || TTRewardVideoActivity.this.icD.ny == null) {
                        return;
                    }
                    if (TTRewardVideoActivity.this.icD.ea) {
                        TTRewardVideoActivity.this.icD.icD.ig().pvs().so(TTRewardVideoActivity.this.icD.ny.yiw());
                    } else {
                        TTRewardVideoActivity.this.icD.icD.ig().pvs().Mxy(TTRewardVideoActivity.this.icD.ny.yiw());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.icD
            public void vG(View view) {
                TTRewardVideoActivity.this.icD.gA.pvs(TTRewardVideoActivity.this.vG);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(final boolean z, boolean z2) {
        if (!z2 && this.ZhG && this.icD.Wyp.get() && rCZ.vG(this.icD.icD)) {
            this.icD.dx.yiw();
            return;
        }
        if (!mnm.Jd().so(String.valueOf(this.icD.sUS))) {
            if (!z2 && this.icD.Wyp.get() && rCZ.vG(this.icD.icD)) {
                this.icD.dx.yiw();
                return;
            } else if (z) {
                finish();
                return;
            } else {
                uc();
                return;
            }
        }
        if (this.OT.get()) {
            if (this.icD.Wyp.get() && rCZ.vG(this.icD.icD)) {
                this.icD.dx.yiw();
                return;
            } else if (z) {
                finish();
                return;
            } else {
                uc();
                return;
            }
        }
        if (rCZ.vG(this.icD.icD) && this.icD.dx.Mxy().getVisibility() == 0) {
            this.icD.dx.yiw();
            return;
        }
        this.icD.uc.set(true);
        this.icD.ny.bNS();
        if (z) {
            this.icD.dyT.bNS();
        }
        final com.bytedance.sdk.openadsdk.core.widget.pvs pvsVar = new com.bytedance.sdk.openadsdk.core.widget.pvs(this);
        this.vG.Ju = pvsVar;
        if (z) {
            this.vG.Ju.pvs(bNS).icD(cR).vG(mnm);
        } else {
            this.vG.Ju.pvs(IP).icD(vA).vG(mnm);
        }
        this.vG.Ju.pvs(new pvs.InterfaceC0086pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.InterfaceC0086pvs
            public void pvs() {
                TTRewardVideoActivity.this.icD.ny.IP();
                if (z) {
                    TTRewardVideoActivity.this.icD.dyT.pvs(1000L);
                }
                pvsVar.dismiss();
                TTRewardVideoActivity.this.icD.uc.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.InterfaceC0086pvs
            public void icD() {
                pvsVar.dismiss();
                TTRewardVideoActivity.this.ZhG = true;
                TTRewardVideoActivity.this.icD.uc.set(false);
                TTRewardVideoActivity.this.icD.dyT.sUS(Integer.MAX_VALUE);
                if (!z) {
                    TTRewardVideoActivity.this.uc();
                    return;
                }
                if (rCZ.vG(TTRewardVideoActivity.this.icD.icD)) {
                    if (TTRewardVideoActivity.this.icD.dyT.zM()) {
                        TTRewardVideoActivity.this.icD.dyT.icD(5);
                        return;
                    } else {
                        TTRewardVideoActivity.this.icD.dx.yiw();
                        return;
                    }
                }
                TTRewardVideoActivity.this.icD.Gp.sUS();
                if (TTRewardVideoActivity.this.icD.dyT.zM()) {
                    TTRewardVideoActivity.this.icD.dyT.icD(4);
                }
                TTRewardVideoActivity.this.finish();
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0076, code lost:
    
        if (r3.icD.mnm.get() == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void uc() {
        com.bytedance.sdk.openadsdk.core.yiw.pvs ig;
        bNS.pvs pvsVar = new bNS.pvs();
        pvsVar.pvs(this.icD.ny.yiw());
        pvsVar.vG(this.icD.ny.zM());
        pvsVar.icD(this.icD.ny.qh());
        pvsVar.vG(3);
        pvsVar.Jd(this.icD.ny.cR());
        com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.pvs(this.icD.ny.vG(), pvsVar, this.icD.ny.pvs());
        com.bytedance.sdk.openadsdk.core.rCZ.vG(this.icD.sUS);
        this.icD.ny.pvs("skip", false);
        if (this.icD.vG) {
            pvs(true, 4);
            if (com.bytedance.sdk.openadsdk.core.model.mnm.pvs(this.icD.icD)) {
            }
            ig = this.icD.icD.ig();
            if (ig != null) {
                com.bytedance.sdk.openadsdk.core.yiw.Jd pvs = ig.pvs();
                long yiw = this.icD.ny.yiw();
                pvs.sUS(yiw);
                pvs.NB(yiw);
            }
            com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(this.icD.icD, 5);
        }
        finish();
        ig = this.icD.icD.ig();
        if (ig != null) {
        }
        com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(this.icD.icD, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void pvs(Intent intent) {
        super.pvs(intent);
        this.zM = intent.getStringExtra("media_extra");
        this.uc = intent.getStringExtra("user_id");
    }

    public boolean pvs(long j, boolean z) {
        yiw yiwVar = new yiw();
        yiwVar.pvs(System.currentTimeMillis(), 1.0f);
        this.icD.ny.pvs(this.icD.gSd.sUS(), yiwVar);
        vG.pvs pvsVar = new vG.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.6
            boolean pvs;

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void pvs(long j2, int i) {
                if (this.pvs) {
                    return;
                }
                this.pvs = true;
                TTRewardVideoActivity.this.Jd.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                TTRewardVideoActivity.this.bNS();
                TTRewardVideoActivity.this.zM();
                TTRewardVideoActivity.this.icD.ny.pvs(j2, j2);
                TTRewardVideoActivity.this.icD.zM.set(true);
                if (TTRewardVideoActivity.this.icD.icD.bGM()) {
                    TTRewardVideoActivity.this.icD.icD.cRf(1);
                    TTRewardVideoActivity.this.icD.gSd.vA();
                }
                if (TTRewardVideoActivity.this.icD.icD.mnm() == 21 && !TTRewardVideoActivity.this.icD.icD.Jd()) {
                    TTRewardVideoActivity.this.icD.icD.icD(true);
                    TTRewardVideoActivity.this.icD.gSd.vA();
                }
                TTRewardVideoActivity.this.kj = (int) (System.currentTimeMillis() / 1000);
                if (com.bytedance.sdk.openadsdk.core.model.mnm.vG(TTRewardVideoActivity.this.icD.icD) || com.bytedance.sdk.openadsdk.core.model.mnm.icD(TTRewardVideoActivity.this.icD.icD) || com.bytedance.sdk.openadsdk.core.model.mnm.Jd(TTRewardVideoActivity.this.icD.icD)) {
                    TTRewardVideoActivity.this.pvs(false, 5);
                    if (!com.bytedance.sdk.openadsdk.core.model.mnm.icD(TTRewardVideoActivity.this.icD.icD) || TTRewardVideoActivity.this.icD.Ye == null) {
                        return;
                    }
                    TTRewardVideoActivity.this.icD.Ye.pvs(0L);
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.mnm.pvs(TTRewardVideoActivity.this.icD.icD) && !TTRewardVideoActivity.this.icD.mnm.get()) {
                    TTRewardVideoActivity.this.icD.pvs(true);
                    TTRewardVideoActivity.this.icD.cRf.NB(true);
                    return;
                }
                if (TTRewardVideoActivity.this.icD.vG) {
                    if (TTRewardVideoActivity.this.icD.icD.pY()) {
                        TTRewardVideoActivity.this.icD.cRf.vG();
                        return;
                    }
                    TTRewardVideoActivity.this.pvs(false, 5);
                    if (cR.NB(TTRewardVideoActivity.this.icD.icD)) {
                        return;
                    }
                    TTRewardVideoActivity.this.icD.ny.pvs("skip", true);
                    return;
                }
                if (TTRewardVideoActivity.this.icD.icD.pY()) {
                    TTRewardVideoActivity.this.icD.cRf.vG();
                    return;
                }
                if (!cR.NB(TTRewardVideoActivity.this.icD.icD)) {
                    TTRewardVideoActivity.this.icD.ny.pvs("skip", true);
                }
                TTRewardVideoActivity.this.finish();
            }

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void icD(long j2, int i) {
                TTRewardVideoActivity.this.Jd.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                if (TTRewardVideoActivity.this.icD.ny.icD()) {
                    TTRewardVideoActivity.this.Ju();
                    return;
                }
                TTRewardVideoActivity.this.icD.ny.Ju();
                TTRewardVideoActivity.this.zM();
                if (TTRewardVideoActivity.this.icD.vG) {
                    TTRewardVideoActivity.this.pvs(false, true, 3);
                } else {
                    TTRewardVideoActivity.this.finish();
                }
                TTRewardVideoActivity.this.icD.ny.pvs(1 ^ (TTRewardVideoActivity.this.icD.ny.CvL() ? 1 : 0), 2);
            }

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void pvs() {
                TTRewardVideoActivity.this.Jd.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                TTRewardVideoActivity.this.bNS();
                TTRewardVideoActivity.this.zM();
                if (TTRewardVideoActivity.this.icD.vG) {
                    TTRewardVideoActivity.this.pvs(false, true, 6);
                } else {
                    TTRewardVideoActivity.this.finish();
                }
                TTRewardVideoActivity.this.icD.ny.pvs(!TTRewardVideoActivity.this.icD.ny.CvL() ? 1 : 0, 1 ^ (TTRewardVideoActivity.this.icD.ny.CvL() ? 1 : 0));
                TTRewardVideoActivity.this.icD.ny.Ju();
            }

            @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
            public void pvs(long j2, long j3) {
                if (!TTRewardVideoActivity.this.icD.ZsW && TTRewardVideoActivity.this.icD.ny.icD()) {
                    TTRewardVideoActivity.this.icD.ny.bNS();
                }
                if (TTRewardVideoActivity.this.icD.Wyp.get()) {
                    return;
                }
                TTRewardVideoActivity.this.Jd.removeMessages(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
                if (j2 != TTRewardVideoActivity.this.icD.ny.so()) {
                    TTRewardVideoActivity.this.bNS();
                }
                TTRewardVideoActivity.this.icD.ny.pvs(j2, j3);
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                long j4 = j2 / 1000;
                double d = j4;
                tTRewardVideoActivity.sUS = (int) (tTRewardVideoActivity.icD.ny.Gp() - d);
                if (TTRewardVideoActivity.this.sUS >= 0) {
                    TTRewardVideoActivity.this.icD.cRf.pvs(String.valueOf(TTRewardVideoActivity.this.sUS), null);
                }
                TTRewardVideoActivity tTRewardVideoActivity2 = TTRewardVideoActivity.this;
                tTRewardVideoActivity2.sUS = (int) (tTRewardVideoActivity2.icD.ny.Gp() - d);
                int i = (int) j4;
                int Wyp = mnm.Jd().Wyp(String.valueOf(TTRewardVideoActivity.this.icD.sUS));
                boolean z2 = Wyp >= 0;
                if ((TTRewardVideoActivity.this.icD.uc.get() || TTRewardVideoActivity.this.icD.qh.get()) && TTRewardVideoActivity.this.icD.ny.icD()) {
                    TTRewardVideoActivity.this.icD.ny.bNS();
                }
                TTRewardVideoActivity.this.icD.gSd.NB(i);
                TTRewardVideoActivity.this.pvs(j2, j3);
                if (TTRewardVideoActivity.this.sUS > 0) {
                    TTRewardVideoActivity.this.icD.cRf.Jd(true);
                    if (z2 && i >= Wyp) {
                        TTRewardVideoActivity.this.icD.pvs(true);
                        TTRewardVideoActivity.this.icD.cRf.pvs(String.valueOf(TTRewardVideoActivity.this.sUS), TTAdDislikeToast.getSkipText());
                        TTRewardVideoActivity.this.icD.cRf.NB(true);
                        return;
                    }
                    TTRewardVideoActivity.this.icD.cRf.pvs(String.valueOf(TTRewardVideoActivity.this.sUS), null);
                }
            }
        };
        this.icD.ny.pvs(pvsVar);
        if (this.icD.gSd.bNS != null) {
            this.icD.gSd.bNS.pvs(pvsVar);
        }
        boolean pvs = this.icD.ny.pvs(j, z, null, this.vG);
        if (pvs && !z) {
            this.qh = (int) (System.currentTimeMillis() / 1000);
        }
        return pvs;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void c_() {
        rCZ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rCZ() {
        zM.pvs("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            pvs("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs pvsVar = this.Ju;
        if (pvsVar != null) {
            pvsVar.onAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(final boolean z, final int i, final String str, final int i2, final String str2) {
        zM.pvs("BVA", "invoke callback onRewardVerify: " + z + ", " + i + ", " + str + ", " + i2 + ", " + str2 + "; " + this);
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            pvs("onRewardVerify", z, i, str, i2, str2);
        } else {
            this.Jd.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.7
                @Override // java.lang.Runnable
                public void run() {
                    if (TTRewardVideoActivity.this.Ju != null) {
                        TTRewardVideoActivity.this.Ju.pvs(z, i, str, i2, str2);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void NB() {
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            pvs("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs pvsVar = this.Ju;
            if (pvsVar != null) {
                pvsVar.pvs();
            }
        }
        if (cR()) {
            this.icD.dX.Wyp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void kj() {
        zM();
    }

    protected void zM() {
        if (this.OT.get()) {
            return;
        }
        this.OT.set(true);
        if (mnm.Jd().mnm(String.valueOf(this.icD.sUS))) {
            pvs(true, this.icD.icD.rCZ(), this.icD.icD.uc(), 0, "");
        } else {
            mnm.vG().pvs(OT(), new vA.icD() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.8
                @Override // com.bytedance.sdk.openadsdk.core.vA.icD
                public void pvs(int i, String str) {
                    TTRewardVideoActivity.this.pvs(false, 0, "", i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.vA.icD
                public void pvs(cR.icD icd) {
                    boolean z = icd.icD;
                    TTRewardVideoActivity.this.pvs(icd.icD, icd.vG.pvs(), icd.vG.icD(), 0, "");
                }
            });
        }
    }

    private JSONObject OT() {
        JSONObject jSONObject = new JSONObject();
        int uc = (int) this.icD.ny.uc();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("reward_name", this.icD.icD.uc());
            jSONObject.put("reward_amount", this.icD.icD.rCZ());
            jSONObject.put("network", com.bytedance.sdk.component.utils.mnm.vG(getApplicationContext()));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int sP = this.icD.icD.sP();
            String str = "unKnow";
            if (sP == 2) {
                str = jlb.icD();
            } else if (sP == 1) {
                str = jlb.vG();
            }
            jSONObject.put("user_agent", str);
            jSONObject.put("extra", this.icD.icD.Je());
            jSONObject.put("media_extra", this.zM);
            jSONObject.put("video_duration", this.icD.icD.od().sUS());
            jSONObject.put("play_start_ts", this.qh);
            jSONObject.put("play_end_ts", this.kj);
            jSONObject.put(TypedValues.TransitionType.S_DURATION, uc);
            jSONObject.put("user_id", this.uc);
            jSONObject.put("trans_id", com.bytedance.sdk.openadsdk.utils.rCZ.pvs().replace("-", ""));
            return jSONObject;
        } catch (Throwable th) {
            Ju.pvs("TTAD.RVA", "", th);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void Jd() {
        rCZ();
        this.icD.icD.udE();
        this.icD.icD.pvs(true);
        if (com.bytedance.sdk.openadsdk.core.model.cR.NB(this.icD.icD)) {
            com.bytedance.sdk.openadsdk.icD.vG.icD(this.icD.icD, this.icD.NB, this.icD.icD.QnQ());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    public void pvs(int i) {
        if (i == 10000) {
            zM();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ny();
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            pvs("recycleRes");
        }
        this.Ju = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        ny();
        super.finish();
    }

    private void ny() {
        if (this.so) {
            return;
        }
        this.so = true;
        zM.pvs("BVA", "invoke callback onAdClose, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            pvs("onAdClose");
            return;
        }
        com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs pvsVar = this.Ju;
        if (pvsVar != null) {
            pvsVar.icD();
        }
    }

    public void pvs(long j, long j2) {
        long j3 = j + (this.icD.CjQ * 1000);
        if (this.ny == -1) {
            this.ny = mnm.Jd().Gp(String.valueOf(this.icD.sUS)).sUS;
        }
        if (j2 <= 0) {
            return;
        }
        if (j2 >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS && j3 >= 27000) {
            zM();
        } else if ((j3 * 100) / j2 >= this.ny) {
            zM();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r1 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0033, code lost:
    
        if (((1.0d - (r8.sUS / r8.icD.ny.Gp())) * 100.0d) >= r0) goto L8;
     */
    @Override // com.bytedance.sdk.openadsdk.core.video.vG.icD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IP() {
        int i = mnm.Jd().Gp(String.valueOf(this.icD.sUS)).sUS;
        boolean z = true;
        boolean z2 = false;
        if (!rCZ.kj(this.icD.icD)) {
            boolean z3 = (1.0f - (((float) this.icD.dyT.kj()) / ((float) this.icD.icD.AEt()))) * 100.0f >= ((float) i);
            int pvs = mnm.Jd().pvs(String.valueOf(this.icD.sUS));
            if (pvs == 0) {
                boolean NB = this.icD.dx.Wyp().NB();
                if (this.icD.dyT.cR()) {
                    NB = true;
                }
                if (z3) {
                }
                z = false;
                z2 = z;
            } else if (pvs == 1) {
                z2 = z3;
            }
        }
        if (z2) {
            zM();
        }
    }
}
