package com.bytedance.sdk.openadsdk.component.reward.pvs;

import android.R;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.model.rCZ;

/* compiled from: RewardFullDislikeManager.java */
/* loaded from: classes2.dex */
public class vG {
    private TTAdDislikeDialog icD;
    private final pvs pvs;
    private TTAdDislikeToast vG;

    public vG(pvs pvsVar) {
        this.pvs = pvsVar;
    }

    public void pvs(com.bytedance.sdk.openadsdk.component.reward.icD.icD icd) {
        if (this.pvs.od.isFinishing()) {
            return;
        }
        if (this.pvs.kj.get()) {
            this.vG.pvs(TTAdDislikeToast.getDislikeTip());
            return;
        }
        if (this.icD == null) {
            try {
                icD(icd);
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "RewardFullDislikeManager", th);
            }
        }
        TTAdDislikeDialog tTAdDislikeDialog = this.icD;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.pvs();
        }
    }

    public void pvs() {
        TTAdDislikeToast tTAdDislikeToast = this.vG;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.icD();
        }
    }

    public void icD() {
        TTAdDislikeToast tTAdDislikeToast = this.vG;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.vG();
        }
    }

    private void icD(final com.bytedance.sdk.openadsdk.component.reward.icD.icD icd) {
        if (this.icD == null) {
            TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this.pvs.od, this.pvs.icD);
            this.icD = tTAdDislikeDialog;
            tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.vG.1
                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.pvs
                public void pvs(View view) {
                    vG.this.pvs.qh.set(true);
                    String str = "landing_page";
                    if (!com.bytedance.sdk.openadsdk.core.model.mnm.icD(vG.this.pvs.icD) && !com.bytedance.sdk.openadsdk.core.model.mnm.vG(vG.this.pvs.icD) && !com.bytedance.sdk.openadsdk.core.model.mnm.Jd(vG.this.pvs.icD)) {
                        if (!vG.this.pvs.Wyp.get()) {
                            str = "video_player";
                        } else if (rCZ.icD(vG.this.pvs.icD)) {
                            str = "playable";
                        } else if (!vG.this.pvs.icD.cRf()) {
                            str = "endcard";
                        }
                    }
                    vG.this.icD.setDislikeSource(str);
                    if (vG.this.pvs.ny.NB) {
                        if (vG.this.pvs.dX != null) {
                            vG.this.pvs.dX.pvs(8, false);
                        }
                    } else {
                        icd.vA();
                        if (vG.this.pvs.ny.icD()) {
                            vG.this.pvs.ny.bNS();
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.pvs
                public void icD(View view) {
                    vG.this.pvs.qh.set(false);
                    if (vG.this.pvs.ny.NB) {
                        if (vG.this.pvs.dX != null) {
                            vG.this.pvs.dX.pvs(0, true);
                        }
                    } else {
                        vG.this.pvs.ny.pvs(icd);
                        if (vG.this.pvs.ny.Jd()) {
                            vG.this.pvs.ny.IP();
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.pvs
                public void pvs(int i, FilterWord filterWord) {
                    if (vG.this.pvs.kj.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    vG.this.pvs.kj.set(true);
                    vG.this.vG();
                }
            });
            ((FrameLayout) this.pvs.od.findViewById(R.id.content)).addView(this.icD);
        }
        if (this.vG == null) {
            this.vG = new TTAdDislikeToast(this.pvs.od);
            ((FrameLayout) this.pvs.od.findViewById(R.id.content)).addView(this.vG);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vG() {
        this.vG.pvs(TTAdDislikeToast.getDislikeSendTip());
    }
}
