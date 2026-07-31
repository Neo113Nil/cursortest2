package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.widget.fs;

/* loaded from: classes4.dex */
public abstract class cyb {
    protected String btk;
    protected String fb;
    protected String fs;
    protected String hhw;
    protected final com.bytedance.sdk.openadsdk.component.reward.zmn.fs nps;
    protected String zn;

    protected abstract boolean fs();

    protected abstract void zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar);

    protected abstract void zmn(boolean z);

    protected abstract boolean zmn();

    protected abstract void zn();

    public cyb(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        this.nps = fsVar;
        btk();
    }

    private void btk() {
        if (this.fs != null) {
            return;
        }
        try {
            this.fs = com.bytedance.sdk.component.utils.doe.zmn(this.nps.oub, "tt_reward_msg");
            this.zn = com.bytedance.sdk.component.utils.doe.zmn(this.nps.oub, "tt_msgPlayable");
            this.hhw = com.bytedance.sdk.component.utils.doe.zmn(this.nps.oub, "tt_negtiveBtnBtnText");
            this.fb = com.bytedance.sdk.component.utils.doe.zmn(this.nps.oub, "tt_postiveBtnText");
            this.btk = com.bytedance.sdk.component.utils.doe.zmn(this.nps.oub, "tt_postiveBtnTextPlayable");
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("RewardTipDialogHelper", "init res text failed：" + th.getMessage());
        }
    }

    public final boolean zmn(boolean z, boolean z2, Runnable runnable) {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.nps;
        if (fsVar.tdm instanceof com.bytedance.sdk.openadsdk.activity.single.btk) {
            if (!fsVar.fb || fs() || (this.nps.tdm.jy() != null && this.nps.tdm.jy().olo())) {
                return false;
            }
            if (!z2 && zmn()) {
                return false;
            }
            if (!nps()) {
                if (!z2) {
                    return false;
                }
                if (runnable == null && z) {
                    zn();
                    return true;
                }
            }
        } else {
            if (zmn(z2, runnable)) {
                return false;
            }
            if (!nps()) {
                return fs(z2, z, runnable);
            }
            if (fs()) {
                fs(z, runnable);
                return false;
            }
            if (bvs()) {
                this.nps.nqi.bvs();
                return false;
            }
        }
        zn(z, runnable);
        return true;
    }

    private boolean zmn(boolean z, Runnable runnable) {
        if (z || !zmn()) {
            return false;
        }
        if (!this.nps.rje) {
            if (hhw()) {
                return zg();
            }
            return false;
        }
        if (runnable != null) {
            return true;
        }
        fb();
        return true;
    }

    private boolean hhw() {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.nps;
        return !fsVar.rje && fsVar.bvs.get();
    }

    private boolean nps() {
        return com.bytedance.sdk.openadsdk.core.kgc.fb().zg(String.valueOf(this.nps.hhw));
    }

    private boolean fs(boolean z, boolean z2, Runnable runnable) {
        if ((z || !hhw() || !zg()) && runnable == null) {
            if (z2) {
                zn();
                return true;
            }
            fb();
        }
        return false;
    }

    private void fs(boolean z, Runnable runnable) {
        if (!(hhw() && zg()) && runnable == null) {
            if (z) {
                zn();
            } else {
                fb();
            }
        }
    }

    private void fs(boolean z) {
        this.nps.phc.doe();
        if (z) {
            this.nps.nqi.hhw();
        }
        this.nps.olo.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(boolean z) {
        this.nps.phc.phc();
        if (z) {
            this.nps.nqi.zmn(1000);
        }
        this.nps.olo.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zg() {
        if (!am.zg(this.nps.fs)) {
            return false;
        }
        this.nps.nqi.bvs();
        return true;
    }

    private boolean bvs() {
        return !this.nps.fs.dgt() && am.zg(this.nps.fs) && this.nps.yj.zg().getVisibility() == 0;
    }

    private void zn(final boolean z, final Runnable runnable) {
        fs(z);
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.nps;
        if (fsVar == null || fsVar.nu.isFinishing() || this.nps.nu.isDestroyed()) {
            com.bytedance.sdk.component.utils.iqz.zn("RewardTipDialogHelper", "adContext or activity is null");
            return;
        }
        final com.bytedance.sdk.openadsdk.core.widget.fs fsVar2 = new com.bytedance.sdk.openadsdk.core.widget.fs(this.nps.nu);
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar3 = this.nps.f3739io;
        if (fsVar3 == null) {
            com.bytedance.sdk.component.utils.iqz.zn("RewardTipDialogHelper", "adContext or  adType == null");
            return;
        }
        fsVar3.klz = fsVar2;
        if (z) {
            fsVar2.zmn(this.zn).zn(this.btk).fb(this.hhw);
        } else {
            fsVar2.zmn(this.fs).zn(this.fb).fb(this.hhw);
        }
        fsVar2.zmn(new fs.InterfaceC0184fs() { // from class: com.bytedance.sdk.openadsdk.common.cyb.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.fs.InterfaceC0184fs
            public void zmn() {
                cyb.this.zn(z);
                fsVar2.dismiss();
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.fs.InterfaceC0184fs
            public void fs() {
                fsVar2.dismiss();
                cyb.this.zmn(true);
                cyb.this.nps.olo.set(false);
                cyb.this.nps.nqi.fs(Integer.MAX_VALUE);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                if (z) {
                    cyb cybVar = cyb.this;
                    if (cybVar.nps.rje || !cybVar.zg()) {
                        cyb.this.nps.rp.hhw();
                        cyb.this.zn();
                        return;
                    }
                    return;
                }
                cyb.this.fb();
            }
        }).show();
    }

    public void fb() {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.nps;
        if (fsVar == null) {
            com.bytedance.sdk.component.utils.iqz.zn("execSkipTaskBaseImpl adContext is null", new Object[0]);
            return;
        }
        com.bytedance.sdk.openadsdk.activity.single.zg zgVar = fsVar.tdm;
        if (zgVar != null && (zgVar instanceof com.bytedance.sdk.openadsdk.activity.single.btk)) {
            if (((com.bytedance.sdk.openadsdk.activity.single.btk) zgVar).zg()) {
                return;
            }
            zn();
        } else {
            fsVar.phc.ev();
            zmn.zmn(this.nps);
            zmn(this.nps);
        }
    }
}
