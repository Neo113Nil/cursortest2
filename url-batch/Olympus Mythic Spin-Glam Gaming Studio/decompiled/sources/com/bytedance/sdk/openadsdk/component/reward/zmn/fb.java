package com.bytedance.sdk.openadsdk.component.reward.zmn;

import android.R;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.olo;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes15.dex */
public class fb {
    private com.bytedance.sdk.openadsdk.common.olo fs;
    private final fs zmn;
    private TTAdDislikeToast zn;

    public fb(fs fsVar) {
        this.zmn = fsVar;
    }

    public void zmn(com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar) {
        com.bytedance.sdk.openadsdk.activity.single.zg zgVar;
        if (this.zmn.nu.isFinishing()) {
            return;
        }
        fs fsVar2 = this.zmn;
        com.bytedance.sdk.openadsdk.activity.single.zg zgVar2 = fsVar2.tdm;
        boolean z = (zgVar2 instanceof com.bytedance.sdk.openadsdk.activity.single.btk) && ((com.bytedance.sdk.openadsdk.activity.single.btk) zgVar2).zmn;
        if (fsVar2.rc.get() || ((zgVar = this.zmn.tdm) != null && zgVar.jy().kjb() && !z)) {
            if (this.zn == null) {
                this.zn = new TTAdDislikeToast(this.zmn.nu);
                ((FrameLayout) this.zmn.nu.findViewById(R.id.content)).addView(this.zn);
            }
            this.zn.show(TTAdDislikeToast.getDislikeTip());
            this.zmn.rc.set(true);
            return;
        }
        if (this.fs == null) {
            try {
                fs(fsVar);
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "RewardFullDislikeManager", th);
            }
        }
        com.bytedance.sdk.openadsdk.common.olo oloVar = this.fs;
        if (oloVar != null) {
            oloVar.zmn();
        }
        fs fsVar3 = this.zmn;
        com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar = fsVar3.uqh;
        if (bvsVar != null) {
            com.bytedance.sdk.openadsdk.component.fb.zmn.zmn(fsVar3.fs, bvsVar.rc());
        }
    }

    public void zmn() {
        TTAdDislikeToast tTAdDislikeToast = this.zn;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.hide();
        }
    }

    public void fs() {
        TTAdDislikeToast tTAdDislikeToast = this.zn;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.onDestroy();
        }
    }

    private void fs(final com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar) {
        if (this.fs == null) {
            fs fsVar2 = this.zmn;
            com.bytedance.sdk.openadsdk.common.olo oloVar = new com.bytedance.sdk.openadsdk.common.olo(fsVar2.nu, fsVar2.fs);
            this.fs = oloVar;
            oloVar.setCallback(new olo.zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.fb.1
                @Override // com.bytedance.sdk.openadsdk.common.olo.zmn
                public void zmn(View view) {
                    fb.this.zmn.iv.set(true);
                    String str = "landing_page";
                    if (!iqz.fs(fb.this.zmn.fs) && !iqz.fb(fb.this.zmn.fs) && !iqz.nps(fb.this.zmn.fs) && !iqz.zg(fb.this.zmn.fs)) {
                        if (fb.this.zmn.bvs.get()) {
                            if (!am.fs(fb.this.zmn.fs)) {
                                if (!fb.this.zmn.fs.vtz()) {
                                    str = CampaignEx.JSON_NATIVE_VIDEO_ENDCARD;
                                }
                            } else {
                                str = "playable";
                            }
                        } else {
                            str = "video_player";
                        }
                    }
                    fb.this.fs.setDislikeSource(str);
                    if (fb.this.zmn.phc.btk) {
                        if (fb.this.zmn.uqh != null) {
                            fb.this.zmn.uqh.zmn(8, false);
                            return;
                        }
                        return;
                    }
                    fsVar.rt();
                    if (fb.this.zmn.phc.hhw()) {
                        fb.this.zmn.phc.doe();
                    }
                    if (fb.this.zn()) {
                        fb.this.zmn.tdm.jy().fs(fb.this.zmn.tdm, 2);
                    }
                    com.bytedance.sdk.openadsdk.bjh.zmn.zn.zmn(fb.this.zmn.fs, 8);
                    fb.this.zmn.nqi.hhw();
                    fb.this.zmn.nqi.zg();
                    if (fb.this.zmn.hwg != null) {
                        fb.this.zmn.hwg.fs();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.olo.zmn
                public void fs(View view) {
                    fb.this.zmn.iv.set(false);
                    if (fb.this.zmn.phc.btk) {
                        if (fb.this.zmn.uqh != null) {
                            fb.this.zmn.uqh.zmn(0, true);
                            return;
                        }
                        return;
                    }
                    fb.this.zmn.phc.zmn(fsVar);
                    if (fb.this.zmn.phc.bvs()) {
                        fb.this.zmn.phc.phc();
                    }
                    if (fb.this.zn()) {
                        fb.this.zmn.tdm.jy().fs(fb.this.zmn.tdm, 1);
                    }
                    com.bytedance.sdk.openadsdk.bjh.zmn.zn.zmn(fb.this.zmn.fs, 4);
                    fb.this.zmn.nqi.zmn(0);
                    fb.this.zmn.nqi.btk();
                    if (fb.this.zmn.hwg != null) {
                        fb.this.zmn.hwg.zmn();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.olo.zmn
                public void zmn(FilterWord filterWord) {
                    if (fb.this.zmn.rc.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    fb.this.zmn.rc.set(true);
                    if (fb.this.zmn.tdm != null) {
                        fb.this.zmn.tdm.jy().zn(true);
                    }
                    fb.this.fb();
                }
            });
            ((FrameLayout) this.zmn.nu.findViewById(R.id.content)).addView(this.fs);
        }
        if (this.zn == null) {
            this.zn = new TTAdDislikeToast(this.zmn.nu);
            ((FrameLayout) this.zmn.nu.findViewById(R.id.content)).addView(this.zn);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zn() {
        return this.zmn.nlz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fb() {
        TTAdDislikeToast tTAdDislikeToast = this.zn;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }
}
