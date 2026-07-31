package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.activity.single.fs;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.cyb;
import com.bytedance.sdk.openadsdk.component.reward.view.rc;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.fs;
import com.bytedance.sdk.openadsdk.core.zak;
import com.bytedance.sdk.openadsdk.fb.btk.fs.cn;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class nps extends zmn {
    private static String doe;
    private static String iqz;
    private static String nqi;
    private static String phc;
    private static String uqh;
    private int bjh;

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    protected boolean c_() {
        return true;
    }

    public nps(fs fsVar, nqi nqiVar, int i, int i2, boolean z) {
        super(fsVar, nqiVar, i, i2, z);
        this.bjh = -1;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zmn, com.bytedance.sdk.openadsdk.activity.single.zg
    public void zmn(Activity activity, fs.btk btkVar) {
        fs fsVar;
        super.zmn(activity, btkVar);
        if (com.bytedance.sdk.component.utils.fs.zmn(activity)) {
            return;
        }
        Intent intent = activity.getIntent();
        this.cn = intent.getStringExtra("media_extra");
        this.rt = intent.getStringExtra("user_id");
        try {
            if (nqi == null) {
                nqi = doe.zmn(this.bvs.oub, "tt_reward_msg");
                iqz = doe.zmn(this.bvs.oub, "tt_msgPlayable");
                doe = doe.zmn(this.bvs.oub, "tt_negtiveBtnBtnText");
                uqh = doe.zmn(this.bvs.oub, "tt_postiveBtnText");
                phc = doe.zmn(this.bvs.oub, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            iqz.zn("TTAD.RewardAdScene", th.getMessage());
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.bvs;
        if (fsVar2 == null || (fsVar = this.nps) == null) {
            return;
        }
        fsVar2.mpi = fsVar.zmn;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public String d_() {
        return "rewarded_video";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    protected void a_() {
        fs fsVar = this.nps;
        if (fsVar != null && fsVar.zn()) {
            super.a_();
            return;
        }
        final View iv = this.bvs.fkt.iv();
        if (iv != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.nps.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/nps$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_nps$1_onClick_cf14928e86ff01742b33832230a584c0(view);
                }

                public void safedk_nps$1_onClick_cf14928e86ff01742b33832230a584c0(View p0) {
                    if (nps.this.bvs.yj.iqz() && nps.this.bvs.bvs.get()) {
                        boolean mw = nps.this.bvs.so.mw();
                        nps.this.bvs.yj.hhw(mw);
                        nps.this.bvs.fkt.hhw(8);
                        nps.this.bvs.jy.sendEmptyMessageDelayed(600, 5000L);
                        if (!nqi.zn(nps.this.bvs.fs)) {
                            return;
                        }
                        if (nqi.zn(nps.this.bvs.fs) && mw) {
                            return;
                        }
                    }
                    nps.this.bvs.yj.phc();
                    nps.this.bvs.so.rc();
                    nps.this.bvs.rp.hhw();
                    if (am.fb(nps.this.bvs.fs)) {
                        nps.this.zmn(true, true, (Runnable) null);
                    } else {
                        nps.this.yof();
                    }
                }
            };
            iv.setOnClickListener(onClickListener);
            iv.setTag(iv.getId(), onClickListener);
        }
        this.bvs.ev.zmn(new com.bytedance.sdk.openadsdk.component.reward.top.fs() { // from class: com.bytedance.sdk.openadsdk.activity.single.nps.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void zmn(View view) {
                nps npsVar = nps.this;
                npsVar.zmn(am.zn(npsVar.bvs.fs), false, (Runnable) null);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void zmn(View view, String str) {
                nps.this.zmn(str);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void fs(View view) {
                nps.this.e_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void zn(View view) {
                View view2 = iv;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void fb(View view) {
                nps npsVar = nps.this;
                npsVar.fs(npsVar.bvs);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zmn
    protected void fs() {
        this.bvs.ev.zmn(null, TTAdDislikeToast.getSkipText());
        this.bvs.ev.btk(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void e_() {
        this.bvs.zak.zmn(((zmn) this).fs);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void zmn(String str) {
        com.bytedance.sdk.openadsdk.core.model.fb exj;
        com.bytedance.sdk.openadsdk.core.rt.fb zmn;
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.bvs;
        fsVar.dgt = !fsVar.dgt;
        com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar = fsVar.uqh;
        if (bvsVar != null && bvsVar.zmn() != null) {
            this.bvs.uqh.zmn().setSoundMute(this.bvs.dgt);
        }
        StringBuilder sb = new StringBuilder("will set is Mute ");
        sb.append(this.bvs.dgt);
        sb.append(" mLastVolume=");
        sb.append(this.bvs.am.zmn());
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.bvs;
        fsVar2.phc.zmn(fsVar2.dgt, str);
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar3 = this.bvs;
        fsVar3.yj.btk(fsVar3.dgt);
        nqi nqiVar = this.bvs.fs;
        if (nqiVar == null || (exj = nqiVar.exj()) == null || (zmn = exj.zmn()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar4 = this.bvs;
        if (fsVar4.dgt) {
            zmn.zg(fsVar4.phc.mw());
        } else {
            zmn.bvs(fsVar4.phc.mw());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public boolean f_() {
        return this.bvs.dgt;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg, com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void fs(int i) {
        if (i == 10000) {
            kra();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zmn
    public FrameLayout nps() {
        rc rcVar;
        com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar;
        if (this.hhw.hhw()) {
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.bvs;
            if (fsVar == null || (bvsVar = fsVar.uqh) == null) {
                return null;
            }
            return bvsVar.fs();
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.bvs;
        if (fsVar2 == null || (rcVar = fsVar2.fkt) == null) {
            return null;
        }
        return rcVar.hhw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zmn, com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void olo() {
        kra();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zmn(final boolean z, boolean z2, final Runnable runnable) {
        if (!z2 && this.nps.mw() && runnable != null) {
            return false;
        }
        if (!kgc.fb().zg(String.valueOf(this.bvs.hhw))) {
            if (runnable == null) {
                if (z) {
                    yof();
                    return false;
                }
                io();
            }
            return false;
        }
        if (this.nps.olo()) {
            if (runnable == null) {
                if (z) {
                    yof();
                    return false;
                }
                io();
            }
            return false;
        }
        this.bvs.olo.set(true);
        this.bvs.phc.doe();
        if (z) {
            this.bvs.nqi.hhw();
        }
        final com.bytedance.sdk.openadsdk.core.widget.fs fsVar = new com.bytedance.sdk.openadsdk.core.widget.fs(vlj());
        ((zmn) this).fs.klz = fsVar;
        if (z) {
            fsVar.zmn(iqz).zn(phc).fb(doe);
        } else {
            fsVar.zmn(nqi).zn(uqh).fb(doe);
        }
        ((zmn) this).fs.klz.zmn(new fs.InterfaceC0184fs() { // from class: com.bytedance.sdk.openadsdk.activity.single.nps.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.fs.InterfaceC0184fs
            public void zmn() {
                nps.this.bvs.phc.phc();
                if (z) {
                    nps.this.bvs.nqi.zmn(1000);
                }
                fsVar.dismiss();
                nps.this.bvs.olo.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.fs.InterfaceC0184fs
            public void fs() {
                fsVar.dismiss();
                nps.this.nps.fs(true);
                nps.this.bvs.olo.set(false);
                nps.this.bvs.nqi.fs(Integer.MAX_VALUE);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                } else if (!z) {
                    nps.this.io();
                } else {
                    nps.this.bvs.rp.hhw();
                    nps.this.yof();
                }
            }
        }).show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0088, code lost:
    
        if (r3.bvs.mw.get() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void io() {
        com.bytedance.sdk.openadsdk.core.model.fb exj;
        com.bytedance.sdk.openadsdk.core.rt.fb zmn;
        this.bvs.phc.ev();
        cn.zmn zmnVar = new cn.zmn();
        zmnVar.fs(this.bvs.phc.mw());
        zmnVar.fb(this.bvs.phc.rp());
        zmnVar.zn(this.bvs.phc.olo());
        zmnVar.zn(3);
        zmnVar.fb(this.bvs.phc.bjh());
        zmnVar.zmn(this.bvs.phc.fs());
        com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.zmn(this.bvs.phc.zg(), zmnVar, this.bvs.phc.btk());
        zak.zn(this.bvs.hhw);
        this.bvs.phc.zmn("skip", false);
        if (this.bvs.zn) {
            zmn(true, 4);
            if (com.bytedance.sdk.openadsdk.core.model.iqz.zmn(this.bvs.fs)) {
            }
            exj = this.bvs.fs.exj();
            if (exj != null && (zmn = exj.zmn()) != null) {
                long mw = this.bvs.phc.mw();
                zmn.hhw(mw);
                zmn.btk(mw);
            }
            com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(this.bvs.fs, 5);
        }
        yof();
        exj = this.bvs.fs.exj();
        if (exj != null) {
            long mw2 = this.bvs.phc.mw();
            zmn.hhw(mw2);
            zmn.btk(mw2);
        }
        com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(this.bvs.fs, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zmn, com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void zmn(final String str, final JSONObject jSONObject) {
        if ("skipToNextAd".equals(str) && this.bvs.tdm != null && this.nps.bjh() == null) {
            fs fsVar = this.nps;
            if (fsVar != null && fsVar.zn()) {
                cyb cybVar = this.kw;
                if (cybVar != null && cybVar.zmn(am.zn(this.bvs.fs), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.nps.4
                    @Override // java.lang.Runnable
                    public void run() {
                        nps.super.zmn(str, jSONObject);
                    }
                })) {
                    return;
                }
            } else if (zmn(am.zn(this.bvs.fs), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.nps.5
                @Override // java.lang.Runnable
                public void run() {
                    nps.super.zmn(str, jSONObject);
                }
            })) {
                return;
            }
        }
        super.zmn(str, jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void hgd() {
        super.hgd();
        this.btk = false;
        this.bvs.uqh.fs(false);
        this.bvs.phc.dgt();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r3.mw.get() == false) goto L8;
     */
    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        if (fsVar.zn) {
            zmn(true, 4);
            if (com.bytedance.sdk.openadsdk.core.model.iqz.zmn(fsVar.fs)) {
            }
            com.bytedance.sdk.openadsdk.common.zmn.fs(fsVar);
        }
        yof();
        com.bytedance.sdk.openadsdk.common.zmn.fs(fsVar);
    }
}
