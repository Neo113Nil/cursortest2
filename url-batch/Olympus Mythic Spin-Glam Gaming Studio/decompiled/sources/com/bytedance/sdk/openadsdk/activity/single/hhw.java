package com.bytedance.sdk.openadsdk.activity.single;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.rc;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.zak;
import com.bytedance.sdk.openadsdk.fb.btk.fs.cn;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes9.dex */
public class hhw extends zmn {
    private boolean iqz;

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    protected boolean b_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    protected boolean c_() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg, com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void fkt() {
    }

    public hhw(fs fsVar, nqi nqiVar, int i, int i2, boolean z) {
        super(fsVar, nqiVar, i, i2, z);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zmn
    public void fs() {
        if (!nqi.btk(this.bvs.fs)) {
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.bvs;
            if (!fsVar.zn) {
                fsVar.ev.zmn(null, "X");
                this.bvs.ev.btk(true);
            }
        }
        this.bvs.ev.zmn(null, TTAdDislikeToast.getSkipText());
        this.bvs.ev.btk(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zmn, com.bytedance.sdk.openadsdk.activity.single.zg
    public void fb() {
        super.fb();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.bvs;
        if (fsVar == null || !fs(fsVar.fs) || zmn(this.bvs.fs)) {
            return;
        }
        if (this.iqz) {
            this.iqz = false;
            yof();
        } else if (this.bvs.yj.rp()) {
            yof();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public String d_() {
        return "fullscreen_interstitial_ad";
    }

    private boolean zmn(nqi nqiVar) {
        return nqiVar == null || nqiVar.fu() == 100.0f;
    }

    private boolean fs(nqi nqiVar) {
        if (nqiVar == null) {
            return false;
        }
        return kgc.fb().phc(String.valueOf(this.bvs.hhw));
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
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.hhw.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/hhw$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_hhw$1_onClick_9fb1fc99e79be46dfcce7e32b2178801(view);
                }

                public void safedk_hhw$1_onClick_9fb1fc99e79be46dfcce7e32b2178801(View p0) {
                    if (hhw.this.bvs.yj.iqz() && hhw.this.bvs.bvs.get()) {
                        boolean mw = hhw.this.bvs.so.mw();
                        hhw.this.bvs.yj.hhw(mw);
                        hhw.this.bvs.fkt.hhw(8);
                        hhw.this.bvs.jy.sendEmptyMessageDelayed(600, 5000L);
                        if (!nqi.zn(hhw.this.bvs.fs)) {
                            return;
                        }
                        if (nqi.zn(hhw.this.bvs.fs) && mw) {
                            return;
                        }
                    }
                    hhw.this.bvs.yj.phc();
                    hhw.this.bvs.so.rc();
                    hhw.this.bvs.rp.hhw();
                    hhw.this.yof();
                }
            };
            iv.setOnClickListener(onClickListener);
            iv.setTag(iv.getId(), onClickListener);
        }
        this.bvs.ev.zmn(new com.bytedance.sdk.openadsdk.component.reward.top.fs() { // from class: com.bytedance.sdk.openadsdk.activity.single.hhw.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void zmn(View view) {
                com.bytedance.sdk.openadsdk.core.rt.fb zmn;
                if (iqz.zmn(hhw.this.bvs.fs) && !hhw.this.bvs.mw.get()) {
                    hhw.this.yof();
                    return;
                }
                hhw.this.bvs.phc.ev();
                cn.zmn zmnVar = new cn.zmn();
                zmnVar.fs(hhw.this.bvs.phc.mw());
                zmnVar.fb(hhw.this.bvs.phc.rp());
                zmnVar.zn(hhw.this.bvs.phc.olo());
                zmnVar.zn(3);
                zmnVar.fb(hhw.this.bvs.phc.bjh());
                zmnVar.zmn(hhw.this.bvs.phc.fs());
                com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.zmn(hhw.this.bvs.phc.zg(), zmnVar, hhw.this.bvs.phc.btk());
                zak.zn(hhw.this.bvs.hhw);
                hhw.this.bvs.phc.zmn("skip", false);
                hhw.this.bvs.ev.fb(false);
                hhw hhwVar = hhw.this;
                if (hhwVar.bvs.zn) {
                    hhwVar.zmn(true, 4);
                } else {
                    hhwVar.yof();
                }
                nqi nqiVar = hhw.this.bvs.fs;
                if (nqiVar != null && nqiVar.exj() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = hhw.this.bvs;
                    if (fsVar2.phc != null && (zmn = fsVar2.fs.exj().zmn()) != null) {
                        zmn.hhw(hhw.this.bvs.phc.mw());
                        zmn.btk(hhw.this.bvs.phc.mw());
                    }
                }
                com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(hhw.this.bvs.fs, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void zmn(View view, String str) {
                hhw.this.zmn(str);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void fs(View view) {
                hhw.this.e_();
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
                hhw hhwVar = hhw.this;
                hhwVar.fs(hhwVar.bvs);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void e_() {
        this.bvs.zak.zmn(((zmn) this).fs);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public boolean f_() {
        return this.bvs.dgt;
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

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg, com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void tf() {
        if (this.bvs.fs.fu() != 100.0f) {
            this.iqz = true;
        }
        super.tf();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void hgd() {
        super.hgd();
        this.btk = false;
        this.bvs.uqh.fs(false);
        this.bvs.phc.dgt();
    }
}
